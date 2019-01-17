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
package com.highstreet.technologies.apigateway.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.InetSocketAddress;
import java.util.Enumeration;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.Before;

import com.highstreet.technologies.apigateway.AaiServlet;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class HelpServletBase {

	protected static final String HTTPMETHOD_GET = "GET";
	protected static final String HTTPMETHOD_POST = "POST";
	protected static final String HTTPMETHOD_PUT = "PUT";
	protected static final String HTTPMETHOD_DELETE = "DELETE";
	protected static final String HTTPMETHOD_OPTIONS = "OPTIONS";
	private IPublicServlet servlet;
	private HttpServer server;
	public final String HOST = "localhost";
	protected final int port;
	private final String baseUri;
	protected static final String LR = "\n";

	public HelpServletBase(String baseuri, int port) {
		this.baseUri=baseuri;
		this.port = port;
	}
	private ExecutorService httpThreadPool;
	
	public void setServlet(IPublicServlet s)
	{
		this.servlet=s;
	}
	
	protected void testrequest(String method, String data, String expectedResponse, boolean exact) {
		this.testrequest(method, data, expectedResponse, exact, null);
	}

	protected void testrequest(String method, String data, String expectedResponse, boolean exact,
			Map<String, String> headersToCheck) {
			
		HttpServletRequest mockRequest = mock(HttpServletRequest.class);
		HttpServletResponse mockResponse = mock(HttpServletResponse.class);

		StringWriter out = new StringWriter();
		ServletOutputStream printOut = new ServletOutputStream() {

			@Override
			public void write(int arg0) throws IOException {
				out.write(arg0);
			}
		};
		ByteArrayInputStream bis = new ByteArrayInputStream(data.getBytes());
		ServletInputStream inputStream= new ServletInputStream() {		
			@Override
			public int read() throws IOException {
				return bis.read();
			}
		};
		
		Enumeration<String> headerNames = new Vector<String>().elements();
		try {
			when(mockRequest.getRequestURI()).thenReturn(this.baseUri+"/mwtn/test");
			when(mockRequest.getHeaderNames()).thenReturn(headerNames);
			// when(mockRequest.getInputStream()).thenReturn(new
			// DelegatingServletInputStream(query.getBytes());
			//when(mockRequest.getReader()).thenReturn(new BufferedReader(new StringReader(data)));
			when(mockRequest.getInputStream()).thenReturn(inputStream);
			when(mockResponse.getOutputStream()).thenReturn(printOut);
			System.out.println("do a " + method + " request");
			if (method == HTTPMETHOD_GET)
				this.servlet.doGet(mockRequest, mockResponse);
			else if (method == HTTPMETHOD_POST)
				this.servlet.doPost(mockRequest, mockResponse);
			else if (method == HTTPMETHOD_PUT)
				this.servlet.doPut(mockRequest, mockResponse);
			else if (method == HTTPMETHOD_DELETE)
				this.servlet.doDelete(mockRequest, mockResponse);
			else if (method == HTTPMETHOD_OPTIONS)
				this.servlet.doOptions(mockRequest, mockResponse);
			else
				fail("http request method " + method + " test not implemented");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		verify(mockResponse).setStatus(200);
		if (exact)
			assertEquals(expectedResponse, out.toString());
		else
			assertTrue("response not for method " + method + "correct", out.toString().contains(expectedResponse));
		// currently unable to check extra headers
		if (headersToCheck != null) {

		}
	}

	@Before
	public void initEsTestWebserver() throws IOException {
		this.server = HttpServer.create(new InetSocketAddress(this.port), 0);
		this.httpThreadPool = Executors.newFixedThreadPool(5);
		this.server.setExecutor(this.httpThreadPool);
		this.server.createContext("/mwtn/test", new MyHandler());
		//server.createContext("/", new MyRootHandler());
		this.server.setExecutor(null); // creates a default executor
		this.server.start();
		System.out.println("http server started");
	}

	@After
	public void stopTestWebserver() {
		if (this.server != null) {
			this.server.stop(0);
			this.httpThreadPool.shutdownNow();
			System.out.println("http server stopped" );
		}
	}

	

	static class MyHandler implements HttpHandler {
		@Override
		public void handle(HttpExchange t) throws IOException {
			String method = t.getRequestMethod();
			System.out.println("req method: " + method);
			OutputStream os = null;
			try {
				if (method.equals(HTTPMETHOD_GET)) {
					t.sendResponseHeaders(200, HelpEsServlet.RESPONSE_GET.length());
					os = t.getResponseBody();
					os.write(HelpEsServlet.RESPONSE_GET.getBytes());
				} else if (method.equals(HTTPMETHOD_POST)) {
					t.sendResponseHeaders(200, HelpEsServlet.RESPONSE_POST.length());
					os = t.getResponseBody();
					os.write(HelpEsServlet.RESPONSE_POST.getBytes());
				} else if (method.equals(HTTPMETHOD_PUT)) {
					t.sendResponseHeaders(200, HelpEsServlet.RESPONSE_PUT.length());
					os = t.getResponseBody();
					os.write(HelpEsServlet.RESPONSE_PUT.getBytes());
				} else if (method.equals(HTTPMETHOD_DELETE)) {
					t.sendResponseHeaders(200, HelpEsServlet.RESPONSE_DELETE.length());
					os = t.getResponseBody();
					os.write(HelpEsServlet.RESPONSE_DELETE.getBytes());
				} else if (method.equals(HTTPMETHOD_OPTIONS)) {
					t.sendResponseHeaders(200, HelpEsServlet.RESPONSE_OPTIONS.length());
					//os = t.getResponseBody();
					//os.write(RESPONSE_OPTIONS.getBytes());
				} else {
					t.sendResponseHeaders(404, 0);
				}
				System.out.println("req handled successful");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				if (os != null)
				{
					os.close();
				}
			}
		}
	}
}
