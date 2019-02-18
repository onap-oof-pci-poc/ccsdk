/*******************************************************************************
 * ============LICENSE_START========================================================================
 * ONAP : ccsdk feature sdnr wt
 * =================================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * =================================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * ============LICENSE_END==========================================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.odlux.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.odlux.IndexServlet;

import static org.mockito.Mockito.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestRedirect {

	private static final int RESPONSECODE_REDIRECT = 301;

	@Test
	public void test() {
		PublicIndexServlet servlet =new PublicIndexServlet();
		HttpServletRequest req = mock(HttpServletRequest.class);
		HttpServletResponse resp = mock(HttpServletResponse.class);
		try {
			servlet.doGet(req,resp);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		verify(resp).setStatus(RESPONSECODE_REDIRECT);
	}
	
	private static class PublicIndexServlet extends IndexServlet{
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			super.doGet(req, resp);
		}
	}

}
