/*******************************************************************************
 * Copyright (c) 2012, 2013 Pivotal Software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal Software, Inc. - initial API and implementation
 *******************************************************************************/
package org.cloudfoundry.ide.eclipse.internal.server.ui.editor;


public enum ApplicationInstanceServiceColumn {

	Name(125), Service(100), Vendor(100), Plan(75), Version(75);

	private int width;

	private ApplicationInstanceServiceColumn(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}
}
