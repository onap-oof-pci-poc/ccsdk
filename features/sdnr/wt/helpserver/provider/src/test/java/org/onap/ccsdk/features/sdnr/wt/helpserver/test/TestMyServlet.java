package org.onap.ccsdk.features.sdnr.wt.helpserver.test;

import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;
import org.mockito.Mockito;
import org.onap.ccsdk.features.sdnr.wt.helpserver.HelpServlet;

public class TestMyServlet extends Mockito {

    @Test
    public void testServlet() throws Exception {

        System.out.println("Test get");

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        when(request.getRequestURI()).thenReturn("help/?meta");


        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);

        HelpServlet helpServlet;
        try {
            helpServlet = new HelpServlet();
            System.out.println("Server created");
            helpServlet.doOptions(request, response);
            System.out.println("Get calling");
            helpServlet.doGet(request, response);
            System.out.println("Get called");
            helpServlet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //verify(request, atLeast(1)).getParameter("username"); // only if you want to verify username was called...
        writer.flush(); // it may not have been flushed yet...
        String result = stringWriter.toString();
        System.out.println("Result: '"+result+"'");
        //assertTrue(result.contains("My expected string"));
    }
}
