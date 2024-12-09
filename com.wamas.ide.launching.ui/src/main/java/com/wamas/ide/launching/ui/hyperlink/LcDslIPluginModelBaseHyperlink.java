/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.hyperlink;

import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.internal.ui.editor.plugin.ManifestEditor;
import org.eclipse.xtext.ui.editor.hyperlinking.AbstractHyperlink;

@SuppressWarnings("restriction")
public class LcDslIPluginModelBaseHyperlink extends AbstractHyperlink {

    private IPluginModelBase model;

    void setModel(IPluginModelBase model) {
        this.model = model;
    }

    @Override
    public void open() {
        ManifestEditor.openPluginEditor(model);
    }

}
