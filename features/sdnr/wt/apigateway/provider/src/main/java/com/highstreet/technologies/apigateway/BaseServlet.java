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

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7403047480257892794L;
	private static Logger LOG = LoggerFactory.getLogger(BaseServlet.class);
	private static SSLContext sc;
	private boolean trustAll = false;
	private static TrustManager[] trustCerts = null;
	private static final int BUFSIZE = 2048;

	protected abstract String getOfflineResponse();

	protected abstract boolean isOff();

	protected abstract String getRemoteUrl(String uri);

	/**
	 *
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 */
	private static void setupSslTrustAll(boolean trustall) throws NoSuchAlgorithmException, KeyManagementException {

		sc = SSLContext.getInstance("TLSv1.2");
		if (trustall) {
			if (trustCerts == null) {
				trustCerts = new TrustManager[] { new javax.net.ssl.X509TrustManager() {
					@Override
					public java.security.cert.X509Certificate[] getAcceptedIssuers() {
						return new java.security.cert.X509Certificate[] {};
					}

					@Override
					public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
						// do not check anything when trust all
					}

					@Override
					public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
						// do not check anything when trust all
					}
				} };
			}
		} else {
			if (trustCerts != null)
				trustCerts = null;
		}
		// Init the SSLContext with a TrustManager[] and SecureRandom()
		sc.init(null, trustCerts, new java.security.SecureRandom());
	}

	public BaseServlet() {
		try {
			MyProperties.Instantiate();
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		this.trysslSetup(true);
	}

	private void trysslSetup() {
		this.trysslSetup(false);
	}

	/**
	 * init or deinit ssl insecure mode regarding to property
	 * 
	 * @param force init independent from property
	 */
	private void trysslSetup(boolean force) {
		// if trustall config has changed
		if (force || trustAll != MyProperties.getInstance().trustInsecure()) {
			// resetup ssl config
			trustAll = MyProperties.getInstance().trustInsecure();
			try {
				setupSslTrustAll(trustAll);
			} catch (Exception e) {
				LOG.error("problem setting up SSL: {}", e.getMessage());
			}
		}
	}

	protected void sendOffResponse(HttpServletResponse response) {
		response.setStatus(200);// HTML/OK
		response.setHeader("Content-Type", "text/html; charset=utf-8");
		try {
			response.getOutputStream().write(this.getOfflineResponse().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			LOG.debug("problem writing offline response");
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (this.isOff()) {
			this.sendOffResponse(resp);
		} else {
			this.trysslSetup();
			HttpURLConnection http = (HttpURLConnection) this.getConnection(req, "GET");
			this.handleRequest(http, req, resp, "GET");
			http.disconnect();
		}
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (this.isOff()) {
			this.sendOffResponse(resp);
		} else {
			this.trysslSetup();
			HttpURLConnection http = (HttpURLConnection) this.getConnection(req, "PUT");
			this.handleRequest(http, req, resp, "PUT");
			http.disconnect();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (this.isOff()) {
			this.sendOffResponse(resp);
		} else {
			this.trysslSetup();
			HttpURLConnection http = (HttpURLConnection) this.getConnection(req, "POST");
			this.handleRequest(http, req, resp, "POST");
			http.disconnect();
		}
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (this.isOff()) {
			this.sendOffResponse(resp);
		} else {
			this.trysslSetup();
			HttpURLConnection http = (HttpURLConnection) this.getConnection(req, "DELETE");
			this.handleRequest(http, req, resp, "DELETE");
			http.disconnect();
		}

	}

	private URLConnection getConnection(HttpServletRequest req, final String method) throws IOException {

		LOG.debug("{} Request", method);
		String surl = this.getRemoteUrl(req.getRequestURI());
		LOG.debug("RemoteURL: {}", surl);
		URL url = new URL(surl);
		URLConnection http = url.openConnection();
		((HttpURLConnection) http).setRequestMethod(method);
		if (url.toString().startsWith("https")) {
			((HttpsURLConnection) http).setSSLSocketFactory(sc.getSocketFactory());
			if (trustAll) {
				HostnameVerifier allHostsValid = new HostnameVerifier() {

					@Override
					public boolean verify(String hostname, SSLSession session) {
						// do not verify host if trust all
						return true;
					}
				};
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
		LOG.debug("Request Headers: {}", s);
		return http;
	}

	private void handleRequest(HttpURLConnection http, HttpServletRequest req, HttpServletResponse resp, String method)
			throws IOException {
		byte[] buffer = new byte[BUFSIZE];
		int len = 0, lensum = 0;
		// send request
		// Send the message to destination
		OutputStream output = null;
		if (!method.equals("GET")) {
			try {
				output = http.getOutputStream();
			} catch (Exception e) {
				LOG.debug("problem reading output stream: {}", e.getMessage());
			}
		}
		if (output != null) {
			while (true) {
				len = req.getInputStream().read(buffer, 0, BUFSIZE);
				if (len <= 0) {
					break;
				}
				lensum += len;
				output.write(buffer, 0, len);
			}
		}
		LOG.debug("written {} data out", lensum);
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

		LOG.debug("ResponseCode: {}", responseCode);
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
				if (MyProperties.getInstance().corsEnabled()) {
					resp.setHeader("Access-Control-Allow-Origin", "*");
					// resp.setHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE");
					resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
				}

			}
		}
		LOG.debug("Received Headers: {}", s);
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
		LOG.debug("Received {} bytes", lensum);
	}

}
