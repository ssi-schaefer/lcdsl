/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LaunchConfig;

public abstract class AbstractLaunchConfigContextHandler extends AbstractHandler {

    @Inject
    private EObjectAtOffsetHelper eObjectAtOffsetHelper;

    @Inject
    protected StandaloneLaunchConfigGenerator generator;

    protected LaunchConfig getLaunchConfigFromEditor(ExecutionEvent event) {
        XtextEditor activeXtextEditor = EditorUtils.getActiveXtextEditor(event);
        if (activeXtextEditor == null) {
            return null;
        }
        final ITextSelection selection = (ITextSelection) activeXtextEditor.getSelectionProvider().getSelection();
        return activeXtextEditor.getDocument().priorityReadOnly(new IUnitOfWork<LaunchConfig, XtextResource>() {

            @Override
            public LaunchConfig exec(XtextResource xTextResource) throws Exception {
                EObject lc = eObjectAtOffsetHelper.resolveContainedElementAt(xTextResource, selection.getOffset());
                return findParentLaunchConfig(lc);
            }

        });
    }

    private LaunchConfig findParentLaunchConfig(EObject lc) {
        while (true) {
            if (lc instanceof LaunchConfig || lc == null) {
                break;
            }

            lc = lc.eContainer();
        }

        return (LaunchConfig) lc;
    }

    protected LaunchConfig getLaunchConfigFromOutline(ExecutionEvent event) {
        IOutlineNode outlineNode = getOutlineNode(event);
        if (outlineNode == null) {
            return null;
        }
        return outlineNode.readOnly(new IUnitOfWork<LaunchConfig, EObject>() {

            @Override
            public LaunchConfig exec(EObject selectedElement) throws Exception {
                return findParentLaunchConfig(selectedElement);
            }

        });
    }

    private IOutlineNode getOutlineNode(ExecutionEvent event) {
        ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
        if (!(currentSelection instanceof IStructuredSelection)) {
            return null;
        }
        IStructuredSelection structuredSelection = (IStructuredSelection) currentSelection;
        return (IOutlineNode) structuredSelection.getFirstElement();
    }

}
