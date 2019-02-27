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
package org.onap.ccsdk.features.sdnr.wt.helpserver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.onap.ccsdk.features.sdnr.wt.helpserver.data.HelpInfrastructureObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelpServlet extends HttpServlet implements AutoCloseable {

    private static Logger LOG = LoggerFactory.getLogger(HelpServlet.class);
    private static final long serialVersionUID = -4285072760648493461L;

    private static final String BASEURI = "/help";

    private static final boolean REDIRECT_LINKS = true;

    private final Path basePath;

    public HelpServlet() {
        LOG.info("Starting HelpServlet instance {}", this.hashCode());
        HelpInfrastructureObject.createFilesFromResources();
        this.basePath = HelpInfrastructureObject.getHelpDirectoryBase();
    }

    @Override
    public void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Methods", "OPTIONS, HEAD, GET, POST, PUT, DELETE");
        resp.addHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, Content-Length");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String query = req.getQueryString();
        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Methods", "OPTIONS, HEAD, GET, POST, PUT, DELETE");
        resp.addHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, Content-Length");
        if (query != null && query.contains("meta")) {
            /*
             * LOG.debug("received post with uri="+req.getRequestURI()); String
             * uri=req.getRequestURI().substring(BASEURI.length()); if(uri.startsWith("/"))
             * uri=uri.substring(1);
             */
            File f = new File(HelpInfrastructureObject.KARAFHELPDIRECTORY, "meta.json");
            if (f.exists()) {
                LOG.debug("found local meta file");
                try (BufferedReader rd = new BufferedReader(new FileReader(f));) {
                    String line = rd.readLine();
                    while (line != null) {
                        resp.getOutputStream().println(line);
                        line = rd.readLine();
                    }
                    rd.close();
                } catch (IOException e) {
                    LOG.debug("Can not read meta file", e);
                }
            } else {
                LOG.debug("start walking from path=" + basePath.toAbsolutePath().toString());
                HelpInfrastructureObject o = null;
                try {
                    o = new HelpInfrastructureObject(this.basePath);
                } catch (URISyntaxException e) {
                    LOG.debug("Can not relsolve URI. ", e);
                }
                resp.getOutputStream().println(o != null ? o.toString() : "");
            }
            resp.setHeader("Content-Type", "application/json");
        } else {
            LOG.debug("received get with uri=" + req.getRequestURI());
            String uri = URLDecoder.decode(req.getRequestURI().substring(BASEURI.length()), "UTF-8");
            if (uri.startsWith("/")) {
                uri = uri.substring(1);
            }
            Path p = basePath.resolve(uri);
            File f = p.toFile();
            if (f.isFile() && f.exists()) {
                LOG.debug("found file for request");
                if (this.isTextFile(f)) {
                    resp.setHeader("Content-Type", "application/text");
                    resp.setHeader("charset", "utf-8");
                } else if (this.isImageFile(f)) {
                    resp.setHeader("Content-Type", "image/*");
                } else if (this.ispdf(f)) {
                    resp.setHeader("Content-Type", "application/pdf");
                } else {
                    LOG.debug("file is not allowed to deliver");
                    resp.setStatus(404);
                    return;
                }
                LOG.debug("delivering file");
                OutputStream out = resp.getOutputStream();
                String version = null;
                if (REDIRECT_LINKS) {
                    version = getVersionFromRequestedUri(uri);
                }
                if (this.isTextFile(f) && REDIRECT_LINKS && version != null) {
                    final String regex =
                            "(!?\\[[^\\]]*?\\])\\(((?:(?!http|www\\.|\\#|\\.com|\\.net|\\.info|\\.org|\\.svg|\\.png|\\.jpg|\\.gif|\\.jpeg|\\.pdf).)*?)\\)";
                    final Pattern pattern = Pattern.compile(regex);
                    Matcher matcher;
                    String line;
                    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                        line = br.readLine();
                        while (line != null) {
                            // check line for internal link
                            matcher = pattern.matcher(line);
                            if (matcher.find()) {
                                // extend link with specific version
                                line = line.replace(matcher.group(2),
                                        "../" + matcher.group(2) + version + "/README.md");
                            }
                            out.write((line + "\n").getBytes());
                            line = br.readLine();

                        }
                        out.flush();
                        out.close();
                        br.close();
                    }

                } else {
                    try (FileInputStream in = new FileInputStream(f)) {

                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = in.read(buffer)) != -1) {
                            out.write(buffer, 0, len);
                        }
                        in.close();
                        out.flush();
                        out.close();
                    }
                }
            } else {
                LOG.debug("found not file for request");
                resp.setStatus(404);
            }
        }
    }

    /**
     * Extract version from URI string
     * @param uri = "help/folder1/folder2/version/README.md"
     * @return version as a string
     */
    private static String getVersionFromRequestedUri(String uri) {
        if (uri == null) {
            return null;
        }
        int lastidx = uri.lastIndexOf("/");
        if (lastidx < 0) {
            return null;
        }
        int slastidx = uri.lastIndexOf("/", lastidx - 1);
        if (slastidx < 0) {
            return null;
        }
        return uri.substring(slastidx + 1, lastidx);

    }

    private boolean ispdf(File f) {
        return f != null ? this.ispdf(f.getName()) : false;
    }

    private boolean ispdf(String name) {
        return name != null ? name.toLowerCase().endsWith("pdf") : false;
    }

    private boolean isImageFile(File f) {
        return f != null ? this.isImageFile(f.getName()) : false;
    }

    private boolean isImageFile(String name) {

        return name != null
                ? name.toLowerCase().endsWith("png") || name.toLowerCase().endsWith("jpg")
                        || name.toLowerCase().endsWith("jpeg") || name.toLowerCase().endsWith("svg")
                        || name.toLowerCase().endsWith("eps")
                : false;
    }

    private boolean isTextFile(File f) {
        return f != null ? this.isTextFile(f.getName()) : false;

    }

    private boolean isTextFile(String name) {
        return name != null
                ? name.toLowerCase().endsWith("md") || name.toLowerCase().endsWith("txt")
                        || name.toLowerCase().endsWith("html") || name.toLowerCase().endsWith("htm")
                        || name.toLowerCase().endsWith("js") || name.toLowerCase().endsWith("css")
                : false;
    }

    @Override
    public void close() throws Exception {}
}
