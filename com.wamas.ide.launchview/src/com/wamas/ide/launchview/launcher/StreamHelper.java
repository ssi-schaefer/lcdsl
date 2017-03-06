/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.launcher;

import java.io.Closeable;

/**
 * Provides static helpers to work with streams
 */
public class StreamHelper {

    /**
     * Unconditionally close a <code>Closeable</code> without throwing any exception.
     *
     * @param closeable
     *            the object to close, may be null or already closed
     */
    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            // ignore
        }
    }

}
