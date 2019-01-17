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

public class AaiServlet extends BaseServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 5946205120796162644L;
	private static final String OFFLINE_RESPONSE_MESSAGE = "AAI interface is offline";

	public AaiServlet() {
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
		return MyProperties.getInstance().isAAIOff();
	}

	@Override
	protected String getRemoteUrl(String uri) {

		if (uri.startsWith("/")) {
			uri = uri.substring(1);
		}
		if (uri.startsWith("aai")) {
			uri = uri.substring("aai".length());
		}
		if (uri.startsWith("/")) {
			uri = uri.substring(1);
		}
		String base = MyProperties.getInstance().getAAIBaseUrl();
		if (!base.endsWith("/")) {
			base += "/";
		}

		return base + uri;
	}
}
