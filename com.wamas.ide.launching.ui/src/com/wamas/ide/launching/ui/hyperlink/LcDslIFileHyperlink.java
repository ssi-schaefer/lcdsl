/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.hyperlink;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.ui.editor.hyperlinking.AbstractHyperlink;

import com.google.inject.Inject;

public class LcDslIFileHyperlink extends AbstractHyperlink {

    @Inject
    private IWorkbench workbench;

    private IFile path;

    void setPath(IFile path) {
        this.path = path;
    }

    @Override
    public void open() {
        try {
            openDefaultEditor(path);
        } catch (PartInitException e) {
            throw new RuntimeException("Oops, cannot open file", e);
        }
    }

    protected IEditorPart openDefaultEditor(IFile file) throws PartInitException {
        IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
        return IDE.openEditor(page, file);
    }

}
