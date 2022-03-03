package com.wamas.ide.launching.ui.build;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IEncodedStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;

public class UriBasedStorage implements IEncodedStorage {
	
	final URI platform;
	private final URI resolved;

	UriBasedStorage(URI platform, URI resolved) {
		this.platform = platform;
		this.resolved = resolved;
	}

	@Override
	public <T> T getAdapter(Class<T> adapter) {
		return null;
	}

	@Override
	public InputStream getContents() throws CoreException {
		try {
			return URIConverter.INSTANCE.createInputStream(resolved);
		} catch (IOException e) {
			throw new CoreException(Status.error(e.getMessage(), e));
		}
	}

	@Override
	public IPath getFullPath() {
		return null;
	}

	@Override
	public String getName() {
		return platform.lastSegment();
	}

	@Override
	public boolean isReadOnly() {
		return true;
	}

	@Override
	public String getCharset() throws CoreException {
		return StandardCharsets.UTF_8.name();
	}
	
	public URI getPlatform() {
		return platform;
	}
	
	public URI getResolved() {
		return resolved;
	}
	
}