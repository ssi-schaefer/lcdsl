/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.launchview;

import java.util.Map.Entry;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.wamas.ide.launching.generator.DependencyResolver;
import com.wamas.ide.launching.generator.DependencyResolver.StartLevel;
import com.wamas.ide.launching.lcDsl.LaunchConfig;

public class LcDslDependenciesDialog extends TitleAreaDialog {

    private final LaunchConfig config;

    public LcDslDependenciesDialog(Shell parentShell, LaunchConfig config) {
        super(parentShell);
        this.config = config;
    }

    @Override
    protected Point getInitialSize() {
        return new Point(700, 800);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle("Resolved dependencies for " + config.getName());
        setMessage("A list of resolved dependencies in LcDsl format", IMessageProvider.INFORMATION);

        Composite comp = new Composite(parent, SWT.NONE);
        GridDataFactory.fillDefaults().grab(true, true).applyTo(comp);
        GridLayoutFactory.fillDefaults().margins(20, 20).applyTo(comp);

        Text text = new Text(comp, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
        GridDataFactory.fillDefaults().grab(true, true).applyTo(text);

        StringBuilder content = new StringBuilder();
        for (Entry<BundleDescription, StartLevel> entry : DependencyResolver.findDependencies(config, false).entrySet()) {
            content.append("plugin ");
            content.append(entry.getKey().getSymbolicName()).append(' ');
            content.append(entry.getKey().getVersion());
            if (!entry.getValue().getLevel().equals("default")) {
                content.append(" startlevel ").append(entry.getValue().getLevel());
            }
            if (entry.getValue().getAutostart().equals("true")) {
                content.append(" autostart;");
            } else {
                content.append(';');
            }
            content.append('\n');
        }

        text.setText(content.toString());

        return comp;
    }

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
    }
}
