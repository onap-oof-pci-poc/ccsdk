/*-
 * ============LICENSE_START=======================================================
 * ONAP : CCSDK
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights
 *                      reserved.
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
package org.onap.ccsdk.features.sdnr.wt.apigateway.test.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IPublicServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
	public void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
	public void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException ;
	public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException ;
}
