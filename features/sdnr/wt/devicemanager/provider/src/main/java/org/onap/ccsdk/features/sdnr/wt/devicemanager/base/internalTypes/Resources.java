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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Resources {

    private static final Logger LOG = LoggerFactory.getLogger(Resources.class);

    private static final String RESSOURCEROOT = "src/main/resources";

    private static URL getFileURL(String resFile) {
        return getFileURL(resFile, true);
    }

    private static URL getFileURL(String resFile, boolean inRes) {
        Bundle b = FrameworkUtil.getBundle(Resources.class);
        URL u = null;
        LOG.debug("try to get file {} {}", resFile, inRes ? "from Resources" : "");
        if (b == null) {
            LOG.warn("cannot load bundle resources");
            try {
                u = new File(inRes ? RESSOURCEROOT + resFile : resFile).toURI().toURL();
            } catch (MalformedURLException e) {
                LOG.warn(e.getMessage());
            }
        } else {
            u = b.getEntry(resFile);
        }
        return u;
    }

    private static File getFile(String resFile) {
        Bundle b = FrameworkUtil.getBundle(Resources.class);
        File f = null;
        LOG.debug("try to get file {}", resFile);
        if (b == null) {
            LOG.warn("cannot load bundle resources");
            f = new File(RESSOURCEROOT + resFile);
        } else {
            try {

                f = new File(b.getEntry(resFile).toURI());
            } catch (URISyntaxException e) {

            }
        }
        return f;
    }

    private static String readFile(final URL u) throws IOException {
        return readFile(u.openStream());
    }

    private static String readFile(final InputStream s) throws IOException {
        // read file
        BufferedReader in = new BufferedReader(new InputStreamReader(s));
        StringBuilder sb = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            sb.append(inputLine);
        }
        in.close();
        s.close();
        return sb.toString();
    }

    public static List<URL> getFileURLs(String folder, final String filter, final boolean recursive)
            throws IOException {
        Bundle b = FrameworkUtil.getBundle(Resources.class);
        List<URL> list = new ArrayList<>();
        if (b == null) {
            FileFilter ff = pathname -> {
                if (pathname.isFile()) {
                    return pathname.getName().contains(filter);
                } else {
                    return true;
                }
            };
            File ffolder = getFile(folder);
            if (ffolder != null && ffolder.isDirectory()) {
                File[] files = ffolder.listFiles(ff);
                if (files != null && files.length > 0) {
                    for (File f : files) {
                        if (f.isFile()) {
                            list.add(f.toURI().toURL());
                        } else if (f.isDirectory() && recursive) {
                            getFileURLsRecursive(f, ff, list);
                        }
                    }
                }
            }
        } else {
            getResourceURLsTreeRecurse(b, filter, b.getEntryPaths(folder), recursive, list);
        }
        return list;
    }

    private static void getFileURLsRecursive(File root, FileFilter ff, List<URL> list) throws MalformedURLException {
        if (root != null && root.isDirectory()) {
            File[] files = root.listFiles(ff);
            if (files != null && files.length > 0) {
                for (File f : files) {
                    if (f.isFile()) {
                        list.add(f.toURI().toURL());
                    } else if (f.isDirectory()) {
                        getFileURLsRecursive(f, ff, list);
                    }
                }
            }
        }

    }

    private static void getResourceURLsTreeRecurse(Bundle b, String filter, Enumeration<String> resource,
            boolean recursive, List<URL> outp) throws IOException {
        while (resource.hasMoreElements()) {
            String name = resource.nextElement();
            Enumeration<String> list = b.getEntryPaths(name);
            if (list != null) {
                if (recursive) {
                    getResourceURLsTreeRecurse(b, filter, list, recursive, outp);
                }
            } else {
                // Read
                if (name.contains(filter)) {
                    LOG.debug("add {} to list", name);
                    outp.add(b.getEntry(name));
                } else {
                    LOG.debug("filtered out {}", name);
                }
            }
        }
    }

    public static List<JSONObject> getJSONFiles(String folder, boolean recursive) {
        List<JSONObject> list = new ArrayList<>();
        List<URL> urls;
        try {
            urls = getFileURLs(folder, ".json", recursive);
            LOG.debug("found {} files", urls.size());
        } catch (IOException e1) {
            urls = new ArrayList<>();
            LOG.warn("failed to get urls from resfolder {} : {}", folder, e1.getMessage());
        }
        for (URL u : urls) {
            LOG.debug("try to parse " + u.toString());
            try {
                JSONObject o = new JSONObject(readFile(u));
                list.add(o);
            } catch (JSONException | IOException e) {
                LOG.warn("problem reading/parsing file {} : {}", u, e.getMessage());
            }
        }
        return list;
    }

    public static JSONObject getJSONFile(String resFile) {
        LOG.debug("loading json file {} from res", resFile);
        URL u = getFileURL(resFile);
        if (u == null) {
            LOG.warn("cannot find resfile: {}", resFile);
            return null;
        }
        JSONObject o = null;
        try {
            // parse to jsonobject
            o = new JSONObject(readFile(u));
        } catch (Exception e) {
            LOG.warn("problem reading/parsing file: {}", e.getMessage());
        }
        return o;
    }

    /**
     * Used for reading plugins from resource files
     *      /elasticsearch/plugins/head/file /etc/elasticsearch-plugins
     *      /elasticsearch/plugins
     * @param resFolder resource folder pointing to the related files
     * @param dstFolder destination
     * @param rootDirToRemove part from full path to remove
     * @return true if files could be extracted
     */
    public static boolean copyFolderInto(String resFolder, String dstFolder, String rootDirToRemove) {

        Enumeration<URL> urls = null;
        Bundle b = FrameworkUtil.getBundle(Resources.class);
        if (b == null) {
            LOG.info("Not running in bundle context.");
            urls = getResourceFolderFiles(resFolder);
        } else {
            urls = b.findEntries(resFolder, "*", true);
        }

        boolean success = true;
        String srcFilename;
        String dstFilename;
        URL u;
        while (urls.hasMoreElements()) {
            u = urls.nextElement();
            srcFilename = u.getFile();
            LOG.debug("try to copy res {} to {}", srcFilename, dstFolder);
            if (rootDirToRemove != null) {
                srcFilename = srcFilename
                        .substring(srcFilename.indexOf(rootDirToRemove) + rootDirToRemove.length() + 1);
                LOG.debug("dstfilename trimmed to {}", srcFilename);
            }
            dstFilename = dstFolder + "/" + srcFilename;
            try {
                if (!extractFileTo(u, new File(dstFilename), true)) {
                    success = false;
                }
            } catch (Exception e) {
                LOG.warn("problem copying res {} to {}: {}", srcFilename, dstFilename, e.getMessage());
            }
        }

        return success;

    }
    private static Enumeration<URL> getResourceFolderFiles (String folder) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(folder);
        String path = url.getPath();
        File[] files = new File(path).listFiles();
        Collection<URL> urlCollection = new ArrayList<>();
        for (File f : files) {
            try {
                urlCollection.add(f.toURI().toURL());
            } catch (MalformedURLException e) {
                LOG.error("Can not read ressources", e);
                break;
            }
        }
        Enumeration<URL> urls = Collections.enumeration(urlCollection);
        return urls;
      }

    public static boolean extractFileTo(String resFile, File oFile) {
        return extractFileTo(resFile, oFile, true);
    }

    public static boolean extractFileTo(String resFile, File oFile, boolean isResource) {
        if (oFile == null) {
            return false;
        }
        LOG.debug("try to copy {} from res to {}", resFile, oFile.getAbsolutePath());
        URL u = getFileURL(resFile, isResource);
        if (u == null) {
            LOG.warn("cannot find resfile: {}", resFile);
            return false;
        }
        return extractFileTo(u, oFile, isResource);
    }

    public static boolean extractFileTo(URL u, File oFile, boolean isResource) {

        if (oFile.isDirectory()) {
            oFile.mkdirs();
            return true;
        } else {
            oFile.getParentFile().mkdirs();
        }

        if (!oFile.exists()) {
            try {
                oFile.createNewFile();
            } catch (IOException e) {
                LOG.warn("problem creating file {}: {}", oFile.getAbsoluteFile(), e.getMessage());
            }
        }
        try (InputStream in = u.openStream(); OutputStream outStream = new FileOutputStream(oFile);) {

            int theInt;
            while ((theInt = in.read()) >= 0) {
                outStream.write(theInt);
            }
            in.close();
            outStream.flush();
            outStream.close();
            LOG.debug("file written successfully");
        } catch (IOException e) {
            LOG.error("problem writing file: {}", e.getMessage());
            return false;
        }
        return true;
    }

}
