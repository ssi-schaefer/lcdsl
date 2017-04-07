
package com.wamas.ide.launchview;

import java.util.Set;
import java.util.TreeSet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

import com.wamas.ide.launchview.model.LaunchObjectContainerModel;
import com.wamas.ide.launchview.model.LaunchObjectFavoriteContainerModel;
import com.wamas.ide.launchview.model.LaunchObjectModel;
import com.wamas.ide.launchview.model.LaunchViewModel;

public class LaunchView {

    private LaunchViewModel model;
    private final Runnable reset = () -> queueReset();
    private final Job resetJob;
    private FilteredTree tree;

    public LaunchView() {
        resetJob = new Job("Reset") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                reset();
                return Status.OK_STATUS;
            }
        };

        resetJob.setSystem(true);
    }

    @PostConstruct
    public void createView(Composite parent, MPart part) {
        model = LaunchViewModel.getService();
        model.addUpdateListener(reset);

        tree = new FilteredTree(parent, SWT.BORDER | SWT.MULTI, new PatternFilter() {

            @Override
            public void setPattern(String pattern) {
                if (pattern != null && !pattern.isEmpty() && pattern.indexOf("*") != 0 && pattern.indexOf("?") != 0
                        && pattern.indexOf(".") != 0) {
                    pattern = "*" + pattern;
                }

                super.setPattern(pattern);
            }

            @Override
            protected boolean isLeafMatch(Viewer viewer, Object element) {
                if (!(element instanceof LaunchObjectModel) || element instanceof LaunchObjectContainerModel) {
                    return false;
                }
                String txt = ((LaunchObjectModel) element).getLabel().toString();
                return wordMatches(txt);
            }
        }, true);
        tree.getViewer().setContentProvider(new LaunchViewContentProvider());
        tree.getViewer().setLabelProvider(new DelegatingStyledCellLabelProvider(new LaunchViewLabelProvider()));
        tree.getViewer().getTree().setLayout(new GridLayout());
        tree.getViewer().getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        addContextMenu();

        createRefreshMenu(part);

        reset();
    }

    @Focus
    public void onFocus() {
        tree.getViewer().getControl().setFocus();
    }

    private void createRefreshMenu(MPart part) {
        part.getMenus().clear(); // clear persisted state

        MMenu viewMenu = MMenuFactory.INSTANCE.createMenu();
        viewMenu.setElementId("menu:" + part.getElementId());
        viewMenu.getTags().add("ViewMenu");

        MDirectMenuItem refresh = MMenuFactory.INSTANCE.createDirectMenuItem();
        refresh.setLabel("Refresh");
        refresh.setIconURI("platform:/plugin/" + Activator.PLUGIN_ID + "/icons/refresh.gif");
        refresh.setObject(new RefreshHandler());

        MDirectMenuItem terminateAll = MMenuFactory.INSTANCE.createDirectMenuItem();
        terminateAll.setLabel("Terminate All");
        terminateAll.setIconURI("platform:/plugin/" + Activator.PLUGIN_ID + "/icons/terminate_all_co.gif");
        terminateAll.setObject(new TerminateAllHandler());

        viewMenu.getChildren().add(refresh);
        viewMenu.getChildren().add(MMenuFactory.INSTANCE.createMenuSeparator());
        viewMenu.getChildren().add(terminateAll);

        // contributions from providers
        model.getProviders().forEach(p -> p.contributeViewMenu(viewMenu));

        part.getMenus().add(viewMenu);
    }

    private void queueReset() {
        resetJob.cancel();
        resetJob.schedule(100);
    }

    private void addContextMenu() {
        MenuManager menuManager = new MenuManager("#LaunchView");
        menuManager.setRemoveAllWhenShown(true);
        menuManager.addMenuListener(new IMenuListener() {

            @Override
            public void menuAboutToShow(IMenuManager manager) {
                fillContextMenu(manager);
            }
        });
        Menu menu = menuManager.createContextMenu(tree.getViewer().getControl());
        tree.getViewer().getControl().setMenu(menu);
    }

    /**
     * Fills the context menu with the actions
     */
    private void fillContextMenu(IMenuManager manager) {
        ISelection selection = tree.getViewer().getSelection();
        IStructuredSelection structuredSelection = (IStructuredSelection) selection;
        Set<LaunchObjectModel> elements = new TreeSet<>();
        if (structuredSelection.isEmpty()) {
            return;
        }

        // expand selection if containers are selected
        for (Object selected : structuredSelection.toList()) {
            if (selected instanceof LaunchObjectContainerModel) {
                elements.addAll(((LaunchObjectContainerModel) selected).getChildren());
            } else if (selected instanceof LaunchObjectModel) {
                elements.add((LaunchObjectModel) selected);
            }
        }
        // check if we have at least one valid element
        if (elements.isEmpty()) {
            return;
        }

        // one menu item for each mode that launches all selected
        for (ILaunchMode mode : DebugPlugin.getDefault().getLaunchManager().getLaunchModes()) {
            manager.add(new LaunchAction(mode, elements));
        }

        manager.add(new Separator());
        manager.add(new RelaunchAction(elements));
        manager.add(new TerminateAction(elements));
        manager.add(new Separator());
        manager.add(new EditAction(elements));
    }

    private synchronized void reset() {
        tree.getDisplay().syncExec(() -> {
            tree.getViewer().getTree().setRedraw(false);
            try {
                TreePath[] exp = tree.getViewer().getExpandedTreePaths();
                tree.getViewer().setInput(model.getModel());
                tree.getViewer().setExpandedTreePaths(exp);
            } finally {
                tree.getViewer().getTree().setRedraw(true);
            }
        });
    }

    @PreDestroy
    public void destroy() {
        model.removeUpdateListener(reset);
    }

    private final class RefreshHandler {

        @Execute
        public void handle() {
            reset();
        }
    }

    private final class TerminateAllHandler {

        @Execute
        public void handle() {
            LaunchObjectContainerModel root = (LaunchObjectContainerModel) tree.getViewer().getInput();
            if (root == null) {
                return;
            }

            for (LaunchObjectModel container : root.getChildren()) {
                if (container instanceof LaunchObjectFavoriteContainerModel) {
                    continue;
                }

                if (container instanceof LaunchObjectContainerModel) {
                    for (LaunchObjectModel m : ((LaunchObjectContainerModel) container).getChildren()) {
                        if (m.getObject() == null) {
                            continue;
                        }

                        if (m.getObject().canTerminate()) {
                            m.getObject().terminate();
                        }
                    }
                }
            }
        }
    }

}