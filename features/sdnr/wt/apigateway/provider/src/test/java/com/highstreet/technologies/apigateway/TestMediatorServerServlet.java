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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;

import com.highstreet.technologies.apigateway.helper.HelpMsServlet;
import com.highstreet.technologies.apigateway.helper.HelpServletBase;

public class TestMediatorServerServlet extends HelpServletBase{

	private static final int PORT = 40004;

	public TestMediatorServerServlet() {
		super("/ms",PORT);
	}
	
	@Test
	public void test() throws ServletException, IOException {
		
		String tmpFilename = "tmp3.cfg";
		File tmpFile = new File(tmpFilename);
		if (tmpFile.exists())
			tmpFile.delete();
		MyProperties.Instantiate(tmpFile,true);
		String query = "{\"query\":{\"match_all\":{}}}";
		HelpMsServlet servlet = new HelpMsServlet();
		this.setServlet(servlet);
		// test diabled message
		servlet.setOfflineStatus(true);
		servlet.setBaseUrl("http://localhost:"+PORT);
		String expectedResponse = "offline";
		testrequest(HTTPMETHOD_GET, query, expectedResponse, false);
		testrequest(HTTPMETHOD_POST, query, expectedResponse, false);
		testrequest(HTTPMETHOD_PUT, query, expectedResponse, false);
		testrequest(HTTPMETHOD_DELETE, query, expectedResponse, false);
		
		servlet.setOfflineStatus(false);
		testrequest(HTTPMETHOD_GET, query, HelpMsServlet.RESPONSE_GET, true);
		testrequest(HTTPMETHOD_POST, query, HelpMsServlet.RESPONSE_POST, true);
		testrequest(HTTPMETHOD_PUT, query, HelpMsServlet.RESPONSE_PUT, true);
		testrequest(HTTPMETHOD_DELETE, query, HelpMsServlet.RESPONSE_DELETE, true);
		testrequest(HTTPMETHOD_OPTIONS, query, "", false);
		 
	}

}
