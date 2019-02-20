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
package org.onap.ccsdk.features.sdnr.wt.odlux;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.onap.ccsdk.features.sdnr.wt.odlux.IndexOdluxBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResFilesServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = -6807215213921798293L;
    private static Logger LOG = LoggerFactory.getLogger(ResFilesServlet.class);
    private final IndexOdluxBundle indexBundle;

    public ResFilesServlet() {
        super();
        indexBundle = new IndexOdluxBundle();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LOG.debug("get req: " + req.getRequestURI().toString());
        final String fn = req.getRequestURI().toString();
        String fileContent = null;

        fileContent = OdluxBundleLoaderImpl.getInstance().getResource(fn, indexBundle);

        if (fileContent != null) {
            LOG.debug("found " + fn + " in res. write to output stream");
            resp.setStatus(200);
            OutputStream os = resp.getOutputStream();
            os.write(fileContent.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            os.flush();
            os.close();
        } else {
            LOG.debug("file " + fn + " not found in res.");
            resp.setStatus(404);

        }
    }

    public String loadFileContent(String filename) {
        return this.indexBundle.getResourceFileContent(filename);
    }

}
