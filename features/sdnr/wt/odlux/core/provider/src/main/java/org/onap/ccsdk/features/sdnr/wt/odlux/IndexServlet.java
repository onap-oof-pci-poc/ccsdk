package org.onap.ccsdk.features.sdnr.wt.odlux;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndexServlet extends HttpServlet {
	
	private static final long serialVersionUID = 3039669437157215355L;
	private static Logger LOG = LoggerFactory.getLogger(IndexServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOG.debug("redirect to odlux/index.html");
		resp.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
		resp.setHeader("Location", "odlux/index.html");
	}

}
