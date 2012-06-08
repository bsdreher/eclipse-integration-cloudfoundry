/*******************************************************************************
 * Copyright (c) 2012 VMware, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     VMware, Inc. - initial API and implementation
 *******************************************************************************/
package org.cloudfoundry.ide.eclipse.internal.server.core;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.wst.server.core.IModule;
import org.eclipse.wst.server.core.IModuleArtifact;
import org.eclipse.wst.server.core.model.ModuleArtifactAdapterDelegate;
import org.eclipse.wst.server.core.util.WebResource;

/**
 * Artifact adapters get invoked by RunOnServer framework.
 * 
 */
public class StandaloneArtifactAdapter extends ModuleArtifactAdapterDelegate {

	@Override
	public IModuleArtifact getModuleArtifact(Object obj) {
		IProject project = (IProject) ((IAdaptable) obj).getAdapter(IProject.class);
		// Bypass WTP to load registered module factories as to possibly avoid
		// invoking the module factory on other components that support Java
		// type modules. See org.eclipse.wst.server.core.ServerUtil on how
		// to get modules through the WTP framework.
		IModule[] modules = new StandAloneModuleFactory().getModules(project);
		if (modules == null || modules.length == 0) {
			return null;
		}
		return new WebResource(modules[0], Path.EMPTY);
	}

}
