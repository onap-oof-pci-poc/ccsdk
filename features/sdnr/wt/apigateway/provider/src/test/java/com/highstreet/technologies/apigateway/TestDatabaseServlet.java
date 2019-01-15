package com.highstreet.technologies.apigateway;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.*;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class TestDatabaseServlet {

	private EsServlet servlet;
	private  HttpServer server;
	final String LR = "\n";
	final String host = "localhost";
	final int port=44555;
	private static final String RESPONSE = "This is the response";
    
	@Test
	public void test() throws ServletException, IOException {
		
		String tmpFilename="tmp.cfg";
		MyProperties properties = MyProperties.Instantiate(new File(tmpFilename));
		String query="{\"query\":{\"match_all\":{}}}";
		String tmpconfigcontent="aai=off" + LR + 
				"aaiHeaders=[]" + LR +
				"database=off"+ LR + 
				"insecure=0" + LR+
				"cors=0";
		String tmpconfigcontent2="aai=off" + LR + 
				"aaiHeaders=[]" + LR +
				"database=http://"+host+":"+port+ LR + 
				"insecure=0" + LR+
				"cors=0";
		servlet = new EsServlet();
		//test diabled message
		properties.load(new ByteArrayInputStream(tmpconfigcontent.getBytes()));
		String expectedResponse="offline";
		testrequest(query,expectedResponse,false);
		properties.load(new ByteArrayInputStream(tmpconfigcontent2.getBytes()));
		initEsTestWebserver(port);
		expectedResponse=RESPONSE;
		testrequest(query, expectedResponse, true);
		stopTestWebserver();
	}
	private void testrequest(String query, String expectedResponse,boolean exact) {
		HttpServletRequest mockRequest = mock(HttpServletRequest.class);
		HttpServletResponse mockResponse = mock(HttpServletResponse.class);

		StringWriter out = new StringWriter();
		ServletOutputStream printOut = new ServletOutputStream() {

			@Override
			public void write(int arg0) throws IOException {
				out.write(arg0);
			}
		};
		Enumeration<String> headerNames = new Vector<String>().elements();
		try {
			when(mockRequest.getRequestURI()).thenReturn("/database/mwtn/test");
			when(mockRequest.getHeaderNames()).thenReturn(headerNames);
			//when(mockRequest.getInputStream()).thenReturn(new DelegatingServletInputStream(query.getBytes());
			when(mockRequest.getReader()).thenReturn(new BufferedReader(new StringReader(query)));
			when(mockResponse.getOutputStream()).thenReturn(printOut);
			servlet.doGet(mockRequest, mockResponse);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		verify(mockResponse).setStatus(200);
		if(exact)
			assertEquals(expectedResponse, out.toString());
		else
			assertTrue("response not correct", out.toString().contains(expectedResponse));
	}
	private void initEsTestWebserver(int port) throws IOException
	{
		server = HttpServer.create(new InetSocketAddress(port), 0);
	        server.createContext("/mwtn/test", new MyHandler());
	        server.setExecutor(null); // creates a default executor
	        server.start();
	}
	private void stopTestWebserver() {
		if(server!=null) {
			server.stop(0);
		}
	}
	 static class MyHandler implements HttpHandler {
	        @Override
	        public void handle(HttpExchange t) throws IOException {
	            t.sendResponseHeaders(200, RESPONSE.length());
	            OutputStream os = t.getResponseBody();
	            os.write(RESPONSE.getBytes());
	            os.close();
	        }
	    }
}
