/*
 * ============LICENSE_START=======================================================
 * ONAP : CCSDK.apps.sdnr.wt.apigateway
 * ================================================================================
 * Copyright (C) 2018 highstreet technologies GmbH Intellectual Property.
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
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AaiServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 5946205120796162644L;
    private static Logger LOG = LoggerFactory.getLogger(AaiServlet.class);
    private static final byte[] OFFLINE_RESPONSE_BYTES = "AAI interface is offline".getBytes(StandardCharsets.UTF_8);
    private static final int BUFSIZE = 1024;
    private static SSLContext sc;
    private static boolean TRUSTALL = false;

    /**
     *
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    private static void setupSslTrustAll() throws NoSuchAlgorithmException, KeyManagementException {

        sc = SSLContext.getInstance("TLSv1.2");
        TrustManager[] trustCerts = null;
        if (TRUSTALL) {
            trustCerts = new TrustManager[] { new javax.net.ssl.X509TrustManager() {
                @Override
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                @Override
                public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                }

                @Override
                public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                }
            } };

        }
        // Init the SSLContext with a TrustManager[] and SecureRandom()
        sc.init(null, trustCerts, new java.security.SecureRandom());

    }

    public AaiServlet() {

        try {
            MyProperties.Instantiate(MyProperties.PROPFILE);
        } catch (Exception e) {
            LOG.error(e.getMessage());
        }

        TRUSTALL = MyProperties.getInstance().trustInsecure();
        try {
            setupSslTrustAll();
        } catch (Exception e) {
            LOG.error("error setting up SSL: " + e.getMessage());
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (MyProperties.getInstance().isAAIOff()) {
            this.sendOffResponse(resp);
        } else {
            HttpURLConnection http = (HttpURLConnection) this.getConnection(req, "PUT");
            this.handleRequest(http, req, resp, "PUT");
            http.disconnect();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (MyProperties.getInstance().isAAIOff()) {
            this.sendOffResponse(resp);
        } else {
            HttpURLConnection http = (HttpURLConnection) this.getConnection(req, "GET");
            this.handleRequest(http, req, resp, "GET");
            http.disconnect();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (MyProperties.getInstance().isAAIOff()) {
            this.sendOffResponse(resp);
        } else {
            HttpURLConnection http = (HttpURLConnection) this.getConnection(req, "POST");
            this.handleRequest(http, req, resp, "POST");
            http.disconnect();
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (MyProperties.getInstance().isAAIOff()) {
            this.sendOffResponse(resp);
        } else {
            HttpURLConnection http = (HttpURLConnection) this.getConnection(req, "DELETE");
            this.handleRequest(http, req, resp, "DELETE");
            http.disconnect();
        }

    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // if(MyProperties.getInstance().corsEnabled())
        // resp.addHeader("Access-Control-Allow-Origin","*");
        super.doOptions(req, resp);
    }

    private void sendOffResponse(HttpServletResponse response) {
        response.setStatus(200);// HTML/OK
        response.setHeader("Content-Type", "text/html; charset=utf-8");
        try {
            response.getOutputStream().write(OFFLINE_RESPONSE_BYTES);
        } catch (IOException e) {
            LOG.debug("problem writing offline response");
        }

    }

    private URLConnection getConnection(HttpServletRequest req, final String method) throws IOException {

        LOG.debug(method + " Request");
        // String query = req.getQueryString();
        String uri=req.getRequestURI();
        if(uri.startsWith("/")) {
            uri=uri.substring(1);
        }
        if(uri.startsWith("aai")) {
            uri=uri.substring("aai".length());
        }
        if(uri.startsWith("/")) {
            uri=uri.substring(1);
        }
        String base=MyProperties.getInstance().getAAIBaseUrl() ;
        if(!base.endsWith("/")) {
            base+="/";
        }

        String surl =base+uri;
        // if (query != null && query.length() > 0)
        // surl += "?" + query;
        LOG.debug("RemoteURL: " + surl);
        URL url = new URL(surl);
        URLConnection http = url.openConnection();
        ((HttpURLConnection) http).setRequestMethod(method);
        if (url.toString().startsWith("https")) {
            ((HttpsURLConnection) http).setSSLSocketFactory(sc.getSocketFactory());
            if (TRUSTALL) {
                HostnameVerifier allHostsValid = (hostname, session) -> true;
                ((HttpsURLConnection) http).setHostnameVerifier(allHostsValid);
            }
        }
        http.setDoOutput(true);
        // copy request headers
        String s = "";
        Enumeration<String> headers = req.getHeaderNames();
        while (headers.hasMoreElements()) {
            String h = headers.nextElement();
            String v = req.getHeader(h);
            if (h != null && h.equals("Host")) {
                v = url.getAuthority();
            }
            s += String.format("%s:%s;", h, v);
            http.setRequestProperty(h, v);
        }
        Map<String,String> addHeaders=MyProperties.getInstance().getAAIHeaders();
        if(addHeaders!=null)
        {
            for(Entry<String,String> entry:addHeaders.entrySet())
            {
                http.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        LOG.debug("Request Headers: " + s);
        return http;
    }

    private void handleRequest(HttpURLConnection http, HttpServletRequest req, HttpServletResponse resp, String method)
            throws IOException {
        byte[] buffer = new byte[BUFSIZE];
        int len = 0, lensum = 0;
        // send request
        // Send the message to destination
        if (!method.equals("GET")) {
            try (OutputStream output = http.getOutputStream()) {
                while (true) {
                    len = req.getInputStream().read(buffer, 0, BUFSIZE);
                    if (len <= 0) {
                        break;
                    }
                    lensum += len;
                    output.write(buffer, 0, len);
                }
            }
        }
        LOG.debug("written " + lensum + " data out");
        int responseCode = http.getResponseCode();
        // Receive answer
        InputStream response;
        if (responseCode >= 200 && responseCode < 300) {
            response = http.getInputStream();
        } else {
            response = http.getErrorStream();
            if (response == null) {
                http.getInputStream();
            }
        }

        LOG.debug("ResponseCode: " + responseCode);
        resp.setStatus(responseCode);
        Map<String, List<String>> set = http.getHeaderFields();
        String s = "";
        if (set != null) {
            for (Map.Entry<String, List<String>> entry : set.entrySet()) {
                if (entry.getKey() == null) {
                    continue;
                }
                for (String v : entry.getValue()) {
                    resp.setHeader(entry.getKey(), v);
                    s += String.format("%s:%s;", entry.getKey(), v);
                }

            }
        }
        LOG.debug("Received Headers: " + s);
        lensum = 0;
        if (response != null) {
            while (true) {
                len = response.read(buffer, 0, BUFSIZE);
                if (len <= 0) {
                    break;
                }
                lensum += len;
                resp.getOutputStream().write(buffer, 0, len);
            }
        } else {
            LOG.debug("response is null");
        }
        LOG.debug("Received " + lensum + " bytes");
    }
}
