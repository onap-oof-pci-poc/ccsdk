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
package org.onap.ccsdk.features.sdnr.wt.odlux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles.OdluxBundle;
import org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles.OdluxBundleResourceAccess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndexOdluxBundle extends OdluxBundle implements OdluxBundleResourceAccess {

    private static Logger LOG = LoggerFactory.getLogger(IndexOdluxBundle.class);

    private static final String LR = "\n";
    private static final String BUNDLENAME_APP = "run";
    private static final String regexRequire = "require\\(\\[(\"" + BUNDLENAME_APP + "\")\\]";
    private static final String regexFunction = "function[\\ ]*\\((" + BUNDLENAME_APP + ")\\)[\\ ]*\\{";
    private static final String regexFunctionBody = "(" + BUNDLENAME_APP + "\\.runApplication\\(\\);)";
    private static final Pattern patternRequire = Pattern.compile(regexRequire);
    private static final Pattern patternFunction = Pattern.compile(regexFunction);
    private static final Pattern patternFunctionBody = Pattern.compile(regexFunctionBody);

    public IndexOdluxBundle() {
        super(null, BUNDLENAME_APP);

    }
    @Override
    protected String loadFileContent(URL url)
    {
        return loadFileContent(url, OdluxBundleLoaderImpl.getInstance().getLoadedBundles(this.getBundleName()));
    }


    @Override
    public String getResourceFileContent(String fn, List<String> bundleNames) {
        return loadFileContent(this.getResource(fn),bundleNames);
    }

    private static String loadFileContent(URL url, List<String> bundlesNamesList) {
        if (url == null) {
            return null;
        }
        LOG.debug("try to load res " + url.toString());
        StringBuilder sb = new StringBuilder();
        Matcher matcher;
        BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if (url.getFile().endsWith("index.html")) {
                    matcher = patternRequire.matcher(inputLine);
                    if (matcher.find()) {
                        inputLine = inputLine.substring(0, matcher.start(1)) + "\"" + String.join("\",\"", bundlesNamesList)
                                + "\"" + inputLine.substring(matcher.end(1));
                    }
                    matcher = patternFunction.matcher(inputLine);
                    if (matcher.find()) {
                        inputLine = inputLine.substring(0, matcher.start(1)) + String.join(",", bundlesNamesList)
                                + inputLine.substring(matcher.end(1));
                    }
                    matcher = patternFunctionBody.matcher(inputLine);
                    if (matcher.find()) {
                        String hlp = "";
                        for (String bundle : bundlesNamesList) {
                            if (!bundle.equals(BUNDLENAME_APP)) {
                                hlp += bundle + ".register();" + LR;
                            }
                        }
                        inputLine = inputLine.substring(0, matcher.start(1)) + hlp
                                + inputLine.substring(matcher.start(1));
                    }
                }
                sb.append(inputLine + LR);
            }
            in.close();
        } catch (IOException e) {
            LOG.warn("could not load resfile {} : {}", url, e.getMessage());
            return null;
        }

        return sb.toString();
    }

}
