
package com.wamas.ide.launchview;

import java.util.Set;
import java.util.TreeSet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

import com.wamas.ide.launchview.model.LaunchObjectContainerModel;
import com.wamas.ide.launchview.model.LaunchObjectModel;
import com.wamas.ide.launchview.model.LaunchViewModel;

public class LaunchView {

    private LaunchViewModel model;
    private final Runnable reset = () -> reset();
    private FilteredTree tree;

    @PostConstruct
    public void createView(Composite parent) {
        model = LaunchViewModel.getService();
        model.addUpdateListener(reset);

        tree = new FilteredTree(parent, SWT.BORDER | SWT.MULTI, new PatternFilter() {

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
        reset();
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
        manager.add(new TerminateAction(elements));
    }

    private void reset() {
        tree.getDisplay().syncExec(() -> {
            tree.getViewer().setInput(model.getModel());
        });
    }

    @PreDestroy
    public void destroy() {
        model.removeUpdateListener(reset);
    }

}