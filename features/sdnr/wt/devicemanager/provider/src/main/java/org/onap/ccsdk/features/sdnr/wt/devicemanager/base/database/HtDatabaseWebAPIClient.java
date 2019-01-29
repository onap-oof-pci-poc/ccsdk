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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HtDatabaseWebAPIClient {

    private static Logger LOG = LoggerFactory.getLogger(HtDatabaseWebAPIClient.class);
    private static final int BUFSIZE = 1024;
    private static final String CHARSET = "UTF-8";
    private final String host;
    private final int port;

    public HtDatabaseWebAPIClient() {
        this.host = "http://localhost";
        this.port = 9200;
    }

    public String sendRequest(String uri, String method, JSONObject body) throws IOException {
        LOG.debug("try to send request with uri=" + uri + " as method=" + method);
        String sresponse = "";
        int responseCode = -1;

        if (body != null) {
            LOG.trace("body: {}", body);
            InputStream response = null;
            String surl = String.format("%s:%d%s", this.host, this.port, uri);
            URL url = new URL(surl);
            URLConnection urlConnection = url.openConnection();
            if (urlConnection instanceof HttpURLConnection) {
                HttpURLConnection http = (HttpURLConnection) urlConnection;
                http.setRequestMethod(method);
                http.setDoOutput(true);
                http.setRequestProperty("Content-Type", "application/json");
                // send request
                // Send the message to destination
                if (!method.equals("GET")) {
                    try (OutputStream output = http.getOutputStream()) {
                        output.write(body.toString().getBytes(CHARSET));
                    }
                }
                responseCode = http.getResponseCode();
                // Receive answer
                if (responseCode >= 200 && responseCode < 300) {
                    response = http.getInputStream();
                } else {
                    response = http.getErrorStream();
                    if (response == null) {
                        http.getInputStream();
                    }
                }
            }
            byte[] buffer = new byte[BUFSIZE];
            int len = 0;
            if (response != null) {
                while (true) {
                    len = response.read(buffer, 0, BUFSIZE);
                    if (len <= 0) {
                        break;
                    }
                    sresponse += new String(buffer, 0, len, CHARSET);
                }
                response.close();
            } else {
                LOG.debug("response is null");
            }
        }
        LOG.debug("ResponseCode: " + responseCode);
        LOG.trace("Response: " + sresponse);

        return sresponse;
    }
}
