/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.build;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.ui.containers.WorkspaceProjectsState;
import org.eclipse.xtext.ui.shared.contribution.ISharedStateContributionRegistry;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class LcDslContainerState implements IAllContainersState {

    private static class PlusOneList<E> extends AbstractList<E> implements RandomAccess {

        private final List<E> list;
        private final E element;

        PlusOneList(List<E> list, E element) {
            this.list = list;
            this.element = element;
        }

        @Override
        public E get(int n) {
            if (n == list.size()) {
                return element;
            }
            return list.get(n);
        }

        @Override
        public int size() {
            return list.size() + 1;
        }
    }

    private static final String TARGET_HANDLE = "#target platform";

    private com.google.inject.Provider<? extends LcDslTargetPlatformSupport> tpSupport;
    private com.google.inject.Provider<? extends WorkspaceProjectsState> workspaceProjects;

    @Inject
    public void inject(ISharedStateContributionRegistry registry) {
        this.tpSupport = registry.getLazySingleContributedInstance(LcDslTargetPlatformSupport.class);
        this.workspaceProjects = registry.getLazySingleContributedInstance(WorkspaceProjectsState.class);
    }

    @Override
    public boolean isEmpty(String containerHandle) {
        if (TARGET_HANDLE.equals(containerHandle)) {
            return false;
        }
        return workspaceProjects.get().isEmpty(containerHandle);
    }

    @Override
    public List<String> getVisibleContainerHandles(String handle) {
        return new PlusOneList<>(workspaceProjects.get().getVisibleContainerHandles(handle), TARGET_HANDLE);
    }

    @Override
    public Collection<URI> getContainedURIs(String containerHandle) {
        if (TARGET_HANDLE.equals(containerHandle)) {
            return tpSupport.get().uris();
        }
        return workspaceProjects.get().getContainedURIs(containerHandle);
    }

    @Override
    public String getContainerHandle(URI uri) {
        if ("target".equals(uri.scheme())) {
            throw new IllegalArgumentException(String.valueOf(uri));
        }
        return workspaceProjects.get().getContainerHandle(uri);
    }

}
