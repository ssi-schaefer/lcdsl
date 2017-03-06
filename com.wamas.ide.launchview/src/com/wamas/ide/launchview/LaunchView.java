
package com.wamas.ide.launchview;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
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
        reset();
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