package org.onap.ccsdk.features.sdnr.wt.helpserver.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;
import org.mockito.Mockito;
import org.onap.ccsdk.features.sdnr.wt.helpserver.HelpServlet;
import org.onap.ccsdk.features.sdnr.wt.helpserver.data.HelpInfrastructureObject;
import static java.nio.file.StandardOpenOption.CREATE_NEW;
import static java.nio.file.StandardOpenOption.WRITE;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class TestMyServlet extends Mockito {

	private static final String CONTENT = "abbccdfkamaosie aksdmais";

	public static void createHelpFile(String filename,String content) {
		File file=new File(HelpInfrastructureObject.getHelpDirectoryBase() + filename);
		File folder = file.getParentFile();
		if(!folder.exists())
			folder.mkdirs();
		try {
			if(file.exists())
				file.delete();
			Files.write( file.toPath(),content.getBytes(),new OpenOption[] { WRITE, CREATE_NEW , CREATE, TRUNCATE_EXISTING});
		} catch (IOException e1) {
			fail(e1.getMessage());
		}
	}
	@Test
	public void testServlet() throws Exception {

		System.out.println("Test get");

		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);

		when(request.getRequestURI()).thenReturn("help/");
		when(request.getQueryString()).thenReturn("?meta");

		StringWriter stringWriter = new StringWriter();
		ServletOutputStream out=new ServletOutputStream() {
			
			@Override
			public void write(int arg0) throws IOException {
				stringWriter.write(arg0);
			}
		};
		when(response.getOutputStream()).thenReturn(out);
			
		HelpServlet helpServlet;
		try {
			helpServlet = new HelpServlet();
			System.out.println("Server created");
			createHelpFile("/meta.json",CONTENT);
			
			helpServlet.doOptions(request, response);
			System.out.println("Get calling");
			helpServlet.doGet(request, response);
			System.out.println("Get called");
			helpServlet.close();
		} catch (Exception e) {
			fail(e.getMessage());
		}
		String result = stringWriter.toString().trim();
		System.out.println("Result: '" + result + "'");
		assertEquals(CONTENT,result);
	}

	@Test
	public void testServlet2() {
		this.testGetRequest("test/0.4.0/test.txt");
		this.testGetRequest("test.css");
		this.testGetRequest("test.eps");
		this.testGetRequest("test.pdf");	
	}
	
	private void testGetRequest(String fn) {
		HelpServlet helpServlet = new HelpServlet();
		createHelpFile("/"+fn,CONTENT);
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);

		when(request.getRequestURI()).thenReturn("help/"+fn);
		StringWriter sw = new StringWriter();
		ServletOutputStream out = new ServletOutputStream() {

			@Override
			public void write(int arg0) throws IOException {
				sw.write(arg0);
			}
		};
		try {
			when(response.getOutputStream()).thenReturn(out);
			helpServlet.doGet(request, response);
		} catch (ServletException | IOException e) {
			fail(e.getMessage());
		}
		assertEquals(CONTENT,sw.toString().trim());
	}
}
