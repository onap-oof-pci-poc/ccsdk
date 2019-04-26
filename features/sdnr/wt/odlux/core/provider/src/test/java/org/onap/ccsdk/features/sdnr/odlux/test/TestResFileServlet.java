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

import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.odlux.OdluxBundleLoaderImpl;
import org.onap.ccsdk.features.sdnr.wt.odlux.ResFilesServlet;
import org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles.OdluxBundle;
import org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles.OdluxBundleLoader;

public class TestResFileServlet {

    PublicResFilesServlet servlet;

    @Test
    public void test() throws ServletException {
        servlet = new PublicResFilesServlet();
		servlet.init();

        OdluxBundleLoader loader = OdluxBundleLoaderImpl.getInstance();
        OdluxBundle b = new OdluxBundle();
        b.setBundleName("b1");
        b.setIndex(9);
        b.setLoader(loader);
        b.initialize();
        System.out.println("Subtest1");
        testResReq("odlux/index.html", HttpURLConnection.HTTP_OK);
        System.out.println("Subtest2");
        testResReq("odlux/fragmich.txt", HttpURLConnection.HTTP_NOT_FOUND);
        System.out.println("Done");
    }

    private void testResReq(String res, int responseCode) {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        when(req.getRequestURI()).thenReturn(res);
        StringWriter out = new StringWriter();
        ServletOutputStream printOut = new ServletOutputStream() {

            @Override
            public void write(int arg0) throws IOException {
                out.write(arg0);
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setWriteListener(WriteListener writeListener) {

            }
        };
        try {
            when(resp.getOutputStream()).thenReturn(printOut);
            servlet.doGet(req, resp);
        } catch (ServletException | IOException e) {
            fail(e.getMessage());
        }
        verify(resp).setStatus(responseCode);
    }


    @SuppressWarnings("serial")
    private class PublicResFilesServlet extends ResFilesServlet {
        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            super.doGet(req, resp);
        }
        @Override
        public String getMimeType(String fileName) {
        	return "mimetype";
        }
    }
}
