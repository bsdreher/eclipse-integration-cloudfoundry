/*******************************************************************************
 * Copyright (c) 2014 Pivotal Software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal Software, Inc. - initial API and implementation
 *******************************************************************************/
package org.cloudfoundry.ide.eclipse.internal.server.core;

public class Messages {

	/*
	 * Errors
	 */

	public static final String ERROR_PERFORMING_CLOUD_FOUNDRY_OPERATION = "Error performing Cloud Foundry operation: {0}";

	public static final String ERROR_WRONG_EMAIL_OR_PASSWORD = "Wrong email or password";

	public static final String ERROR_UNABLE_TO_ESTABLISH_CONNECTION = "Unable to establish connection";

	public static final String ERROR_FAILED_REST_CLIENT = "Client error: {0}";

	public static final String ERROR_UNKNOWN = "Unknown Cloud Foundry error";

	public static final String ERROR_INVALID_MEMORY = "Invalid memory. Please enter a valid integer value over 0.";

	public static final String ERROR_FAILED_MEMORY_UPDATE = "Unable to update application memory";

	public static final String ERROR_FAILED_READ_SELF_SIGNED_PREFS = "Failed to read self-signed certificate preferences for servers. Unable to store self-signed certificate preferences for {0}";

	public static final String ERROR_FAILED_STORE_SELF_SIGNED_PREFS = "Failed to store self-signed certificate preference for {0}";

	public static final String ERROR_UNABLE_CONNECT_SERVER_CREDENTIALS = "Unable to connect to the server to validate credentials";

	public static final String ERROR_FAILED_CLIENT_CREATION_NO_SPACE = "Unable to resolve locally stored organisation and space for the server instance {0}. The server instance may have to be cloned or created again.";

	public static final String ERROR_FAILED_MODULE_REFRESH = "Failed to refresh list of applications. Application list may not be accurate. Check connection and try a manual refresh - Reason: {0}";

	public static final String ERROR_FIRE_REFRESH = "Internal Error: Failed to resolve Cloud Foundry server from WST IServer. Manual server disconnect and reconnect may be required - Reason: {0}";

	public static final String ERROR_INITIALISE_REFRESH_NO_SERVER = "Failed to initialise Cloud Foundry refresh job. Unable to resolve a Cloud Foundry server - {0}";

	public static final String ERROR_APP_DEPLOYMENT_VALIDATION_ERROR = "Invalid application deployment information for: {0} - Unable to deploy or start application - {1}";

	public static final String ERROR_NO_WST_MODULE = "Internal Error: No WST IModule specified - Unable to deploy or start application";

	public static final String ERROR_NO_MAPPED_CLOUD_MODULE = "Internal Error: No mapped Cloud Foundry application module found for: {0} - Unable to deploy or start application";

	/*
	 * Warnings
	 */
	public static final String WARNING_SELF_SIGNED_PROMPT_USER = "Failed to connect to {0}, probably because the site is using a self-signed certificate. Do you want to trust this site anyway?";

	/*
	 * Titles
	 */

	public static final String TITLE_SELF_SIGNED_PROMPT_USER = "Failed to connect";

	/*
	 * Console messages
	 */
	public static final String CONSOLE_RESTARTING_APP = "Restarting application";

	public static final String CONSOLE_DEPLOYING_APP = "Deploying application";

	public static final String CONSOLE_GENERATING_ARCHIVE = "Generating application archive";

	public static final String CONSOLE_PROCESSING_PAYLOAD = "Processing payload...";

	public static final String CONSOLE_APP_STOPPED = "Application stopped";

	public static final String CONSOLE_PRE_STAGING_MESSAGE = "Staging application";

	public static final String CONSOLE_APP_PUSH_MESSAGE = "Pushing application to Cloud Foundry server";

	public static final String CONSOLE_APP_PUSHED_MESSAGE = "Application successfully pushed to Cloud Foundry server";

	public static final String CONSOLE_STILL_WAITING_FOR_APPLICAITON_TO_START = "Still waiting for applicaiton to start...";

	public static final String CONSOLE_WAITING_FOR_APPLICATION_TO_START = "Waiting for application to start...";

	public static final String CONSOLE_STOPPING_APPLICATION = "Stopping application {0}";

}
