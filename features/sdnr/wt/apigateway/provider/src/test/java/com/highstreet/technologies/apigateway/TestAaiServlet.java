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

import com.highstreet.technologies.apigateway.helper.HelpAaiServlet;
import com.highstreet.technologies.apigateway.helper.HelpEsServlet;
import com.highstreet.technologies.apigateway.helper.HelpServletBase;

public class TestAaiServlet extends HelpServletBase{

	public TestAaiServlet() {
		super("/aai",40001);
	}
	
	@Test
	public void test() throws ServletException, IOException {
		
		String tmpFilename = "tmp.cfg";
		File tmpFile = new File(tmpFilename);
		if (tmpFile.exists())
			tmpFile.delete();
		MyProperties properties = MyProperties.Instantiate(tmpFile);
		String query = "{\"query\":{\"match_all\":{}}}";
		String tmpconfigcontent = "aai=off" + LR + "aaiHeaders=[]" + LR + "database=off" + LR + "insecure=0" + LR
				+ "cors=0";
		String tmpconfigcontent2 = "aai=http://" + HOST + ":" + this.port + LR + "aaiHeaders=[]" + LR + "database=off"+ LR
				+ "insecure=1" + LR + "cors=1";
		this.setServlet(new HelpAaiServlet());
		// test diabled message
		properties.load(new ByteArrayInputStream(tmpconfigcontent.getBytes()));
		String expectedResponse = "offline";
		testrequest(HTTPMETHOD_GET, query, expectedResponse, false);
		testrequest(HTTPMETHOD_POST, query, expectedResponse, false);
		testrequest(HTTPMETHOD_PUT, query, expectedResponse, false);
		testrequest(HTTPMETHOD_DELETE, query, expectedResponse, false);
		
		// initEsTestWebserver(port);
		properties.load(new ByteArrayInputStream(tmpconfigcontent2.getBytes()));
		testrequest(HTTPMETHOD_GET, query, HelpEsServlet.RESPONSE_GET, true);
		testrequest(HTTPMETHOD_POST, query, HelpEsServlet.RESPONSE_POST, true);
		testrequest(HTTPMETHOD_PUT, query, HelpEsServlet.RESPONSE_PUT, true);
		testrequest(HTTPMETHOD_DELETE, query, HelpEsServlet.RESPONSE_DELETE, true);
		testrequest(HTTPMETHOD_OPTIONS, query, "", false);
		// stopTestWebserver();
		 
	}

}
