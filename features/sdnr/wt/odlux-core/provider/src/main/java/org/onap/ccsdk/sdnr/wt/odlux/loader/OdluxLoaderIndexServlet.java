/*
 * Copyright (c) 2014 Inocybe Technologies, and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.onap.ccsdk.sdnr.wt.odlux.loader;

import com.google.common.base.Preconditions;

import org.onap.ccsdk.features.sdnr.wt.odlux.loader.exception.OdluxLoaderException;
import org.onap.ccsdk.features.sdnr.wt.odlux.loader.Module;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OdluxLoaderIndexServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(OdluxLoaderIndexServlet.class);
	private final String regex = "require\\(\\[(\"app\")\\]";

	private final String NEWLINE = "\n";

	private final OdluxLoader loader;

	private final String UTF_CHARSET = "UTF-8";

	private final String INDEX_HTML_LOC = "index/index.html";

	private final String RESPONSE_CONTENT_TYPE = "text/html";

	private final Pattern pattern;

	private final List<String> indexHTML;

	public OdluxLoaderIndexServlet(final OdluxLoader loader) throws OdluxLoaderException {
		Preconditions.checkNotNull(loader, "Loader service can not be null");
		this.loader = loader;
		this.indexHTML = loadStaticHTML();
		this.pattern = Pattern.compile(regex, Pattern.MULTILINE);
	}

	private List<String> loadStaticHTML() throws OdluxLoaderException {
		List<String> indexHTMLContent = new ArrayList<>();
		try (InputStream indexHTMLStream = OdluxLoaderIndexServlet.class.getClassLoader()
				.getResourceAsStream(INDEX_HTML_LOC);
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(indexHTMLStream, UTF_CHARSET))) {
			String line = bufferedReader.readLine();
			while (line != null) {
				indexHTMLContent.add(line);
				line = bufferedReader.readLine();
			}

		} catch (IOException e) {
			logger.error("Could not load index html from input stream", e);
			throw new OdluxLoaderException("Odlux Loader Servlet initialization failed. ", e);
		}
		return indexHTMLContent;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Preconditions.checkArgument(indexHTML.size() > 0,
				"HTML file was not loaded properly at servlet initialization");

		Matcher matcher;
		StringBuilder inputStringBuilder = new StringBuilder();
		for (String line : this.indexHTML) {
			matcher = pattern.matcher(line);
			if (matcher.find()) {
				line = line.substring(0, matcher.start(1)) + this.getApps() + line.substring(matcher.end(1));
			}
			inputStringBuilder.append(line);
			inputStringBuilder.append(NEWLINE);

		}
		response.setContentType(RESPONSE_CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		out.print(inputStringBuilder.toString());
	}

	private String getApps() {
		String apps = "\"apps\"";
		for (Module module : loader.getModules()) {
			apps += ",\"" + module.getModuleName() + "\"";
		}
		// return apps;
		return "\"apps\",\"apiDemo\"";
	}

}