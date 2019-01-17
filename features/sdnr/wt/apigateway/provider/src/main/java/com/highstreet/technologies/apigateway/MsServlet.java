/*
 * ============LICENSE_START=======================================================
 * ONAP : CCSDK.apps.sdnr.wt.apigateway
 * ================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property.
 * All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */
package com.highstreet.technologies.apigateway;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MsServlet extends BaseServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = -5361461082028405171L;
	private static final String OFFLINE_RESPONSE_MESSAGE = "MediatorServer interface is offline";

	public MsServlet() {

		super();
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setStatus(200);
	}

	@Override
	protected String getOfflineResponse() {
		return OFFLINE_RESPONSE_MESSAGE;
	}

	@Override
	protected boolean isOff() {
		return true;
	}

	@Override
	protected String getRemoteUrl(String uri) {
		if (uri != null && uri.length() > 0) {
			uri = uri.substring("/ms".length());
		}
		String dbServerId=uri.substring(0, uri.indexOf("/"));
		
		return this.getBaseUrl(dbServerId) + uri;
	}

	protected String getBaseUrl(String dbServerId) {
		return "";
	}
}
