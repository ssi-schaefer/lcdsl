/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.hyperlink;

import org.eclipse.pde.internal.core.ifeature.IFeatureModel;
import org.eclipse.pde.internal.ui.editor.feature.FeatureEditor;
import org.eclipse.xtext.ui.editor.hyperlinking.AbstractHyperlink;

@SuppressWarnings("restriction")
public class LcDslIFeatureHyperlink extends AbstractHyperlink {

    private IFeatureModel model;

    void setModel(IFeatureModel model) {
        this.model = model;
    }

    @Override
    public void open() {
        FeatureEditor.openFeatureEditor(model);
    }

}
