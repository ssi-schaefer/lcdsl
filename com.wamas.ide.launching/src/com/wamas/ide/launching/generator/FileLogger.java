/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.generator;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.IStreamListener;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamMonitor;

import com.wamas.ide.launching.Activator;

/**
 * Logger that can be attached to a {@linkplain IProcess} and that writes the output to a file.
 * <p>
 * Please note that it is the responsibility of the caller to close the logger if it is not used any
 * more.
 * </p>
 */
public class FileLogger implements IStreamListener, Closeable {

    private final BufferedWriter writer;

    /** Creates a new logger that writes to the given file */
    public FileLogger(File file) throws IOException {
        writer = new BufferedWriter(new FileWriter(file));
    }

    @Override
    public void streamAppended(String text, IStreamMonitor monitor) {
        try {
            writer.write(text);
            writer.flush();
        } catch (Exception ex) {
            Activator.log(IStatus.WARNING, "Failed to append '" + text + "' to log file.", ex);
        }
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }

}
