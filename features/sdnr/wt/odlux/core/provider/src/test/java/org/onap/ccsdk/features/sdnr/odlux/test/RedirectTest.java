package org.onap.ccsdk.features.sdnr.odlux.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.odlux.IndexServlet;

import static org.mockito.Mockito.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectTest {

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
