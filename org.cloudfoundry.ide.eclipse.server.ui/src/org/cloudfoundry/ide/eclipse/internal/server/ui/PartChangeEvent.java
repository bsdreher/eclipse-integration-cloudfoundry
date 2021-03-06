/*******************************************************************************
 * Copyright (c) 2013 Pivotal Software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal Software, Inc. - initial API and implementation
 *******************************************************************************/
package org.cloudfoundry.ide.eclipse.internal.server.ui;

import org.cloudfoundry.ide.eclipse.internal.server.core.ServerCredentialsValidationStatics;
import org.eclipse.core.runtime.IStatus;

/**
 * Event fired by a UI part when value changes have occured in the part's
 * controls
 */
public class PartChangeEvent {

	private final IStatus status;

	private final Object data;

	private final UIPart source;

	private final int type;



	public PartChangeEvent(Object data, IStatus status, UIPart source) {
		this(data, status, source, ServerCredentialsValidationStatics.EVENT_NONE);
	}

	public PartChangeEvent(Object data, IStatus status, UIPart source, int type) {
		this.data = data;
		this.status = status;
		this.source = source;
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public UIPart getSource() {
		return source;
	}

	public IStatus getStatus() {
		return status;
	}

	public Object getData() {
		return data;
	}

}