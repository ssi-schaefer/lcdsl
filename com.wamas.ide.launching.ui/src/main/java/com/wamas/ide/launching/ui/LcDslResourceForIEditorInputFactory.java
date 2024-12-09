package com.wamas.ide.launching.ui;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;

import com.wamas.ide.launching.ui.build.UriBasedStorage;

public class LcDslResourceForIEditorInputFactory extends JavaClassPathResourceForIEditorInputFactory {

	@Override
	protected Resource createResource(IStorage storage) throws CoreException {
		if (storage instanceof UriBasedStorage) {
			ResourceSet resourceSet = getResourceSet(storage);
			URI uri = ((UriBasedStorage) storage).getPlatform();
			configureResourceSet(resourceSet, uri);
			XtextResource resource = (XtextResource) getResourceFactory().createResource(uri);
			resourceSet.getResources().add(resource);
			resource.setValidationDisabled(isValidationDisabled(uri, storage));
			return resource;
		}
		return super.createResource(storage);
	}
}
