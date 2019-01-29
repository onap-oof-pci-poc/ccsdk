/*******************************************************************************
 * ============LICENSE_START======================================================= ONAP : ccsdk
 * feature sdnr wt ================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * ================================================================================ Licensed under
 * the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License. ============LICENSE_END=========================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.aaiconnector.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.http.BaseHTTPClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.http.BaseHTTPResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AaiWebApiClient extends BaseHTTPClient {

    private static Logger LOG = LoggerFactory.getLogger(AaiWebApiClient.class);
    private static final String PNF_JSON_INTERFACE_TEMPLATE = "        {\n"
            + "            \"interface-name\": \"@interface@\",\n" + "            \"speed-value\": \"300\",\n"
            + "            \"speed-units\": \"MBit/s\",\n"
            + "            \"port-description\": \"Air Interface (MWPS)\",\n"
            + "            \"equipment-identifier\": \"@pnfId@-@interface@\",\n"
            + "            \"interface-role\": \"Wireless\",\n"
            + "            \"interface-type\": \"Air Interface (MWPS)\",\n"
            + "            \"resource-version\": \"@model@\",\n" + "            \"relationship-list\": [\n"
            + "                {\n"
            + "                    \"related-to\": \"A keyword provided by A&AI to indicate type of node.\",\n"
            + "                    \"related-link\": \"URL to the object in A&AI.\",\n"
            + "                    \"relationship-data\": [\n" + "                        {\n"
            + "                            \"relationship-key\": \"A keyword provided by A&AI to indicate an attribute.\",\n"
            + "                            \"relationship-value\": \"Value of the attribute\"\n"
            + "                        }\n" + "                    ],\n"
            + "                    \"related-to-property\": [\n" + "                        {\n"
            + "                            \"property-key\": \"Key part of a key/value pair\",\n"
            + "                            \"property-value\": \"Value part of a key/value pair\"\n"
            + "                        }\n" + "                    ]\n" + "                }\n" + "            ]\n"
            + "        }\n";
    private static final String PNF_JSON_TEMPLATE = "{\n" + "    \"pnf-name\": \"@pnfId@\",\n"
            + "    \"pnf-id\": \"@pnfId@\",\n" + "    \"equip-type\": \"@type@\",\n"
            + "    \"equip-model\": \"@model@\",\n" + "    \"equip-vendor\": \"@vendor@\",\n"
            + "    \"ipaddress-v4-oam\": \"@oamIp@\",\n" + "    \"in-maint\": false,\n"
            + "    \"prov-status\":\"PROV\",\n" + "    \"p-interfaces\": @interface-list@\n" + "}\n" + "";

    private final Map<String, String> headerMap;
    private final Map<String, String> headerMapExtended;


    public AaiWebApiClient(String baseUrl, Map<String, String> headers, boolean trustAllCerts) {
        this(baseUrl, headers, trustAllCerts, null, null);
    }
    public AaiWebApiClient(String baseUrl, Map<String, String> headers, boolean trustAllCerts, String certFilename,
            String passphrase) {
        super(baseUrl, trustAllCerts, certFilename, passphrase, BaseHTTPClient.SSLCERT_PCKS);
        this.headerMap = headers;

        this.headerMapExtended = new HashMap<>();
        this.headerMapExtended.putAll(headerMap);
        this.headerMapExtended.put("Content-Type", "application/json");
        this.headerMapExtended.put("Accept", "application/json");
    }


    public boolean pnfCreate(String pnfId, String type, String model, String vendor, String oamIp,
            List<String> ifaces) {
        LOG.debug("registering {} (type={}, model={}, vendor={},ip={})", pnfId, type, model, vendor, oamIp);
        BaseHTTPResponse response = null;
        try {
            String uri = "network/pnfs/pnf/" + URLParamEncoder.encode(pnfId);
            String message = getPnfTemplateFilled(pnfId, type, model, vendor, oamIp, ifaces);
            response = this.sendRequest(uri, "PUT", message, headerMapExtended);
            LOG.debug("finished with responsecode {}", response.code);
        } catch (IOException e) {
            LOG.warn("problem registering {} : {}", pnfId, e.getMessage());
        }
        return response != null ? response.code == 200 : false;
    }

    public boolean pnfDelete(String pnfId) {
        LOG.debug("unregistering {}", pnfId);
        BaseHTTPResponse response = null;
        try {
            String uri = "network/pnfs/pnf/" + URLParamEncoder.encode(pnfId);
            response = this.sendRequest(uri, "DELETE", "", headerMapExtended);
            LOG.debug("finished with responsecode {}", response.code);
        } catch (IOException e) {
            LOG.warn("problem unregistering {} : {}", pnfId, e.getMessage());
        }
        return response != null ? response.code == 200 : false;
    }

    public @Nonnull BaseHTTPResponse pnfCheckIfExists(String pnfId) {

        BaseHTTPResponse response = null;
        LOG.debug("check for {}", pnfId);
        try {
            String uri = "network/pnfs/pnf/" + URLParamEncoder.encode(pnfId);
            response = this.sendRequest(uri, "GET", "", headerMapExtended);
            LOG.debug("finished with responsecode {}", response.code);
        } catch (IOException e) {
            LOG.warn("problem checking {}: {}", pnfId, e.getMessage());
            response = BaseHTTPResponse.UNKNOWN;
        }

        return response;
    }

    /*
     * Private classes
     */

    private static String getPnfTemplateFilled(String pnfId, String type, String model, String vendor, String oamIp,
            List<String> ifaces) {
        return PNF_JSON_TEMPLATE.replace("@pnfId@", pnfId).replace("@type@", type).replace("@model@", model)
                .replace("@vendor@", vendor).replace("@oamIp@", oamIp)
                .replace("@interface-list@", getPnfTemplateInterfaceList(pnfId, ifaces, model));
    }

    private static String getPnfTemplateInterfaceList(String pnfId, List<String> ifaces, String model) {
        StringBuffer s = new StringBuffer();

        s.append("[");
        if (ifaces != null) {
            for (int i = 0; i < ifaces.size(); i++) {
                if (i > 0) {
                    s.append(",");
                }
                s.append(PNF_JSON_INTERFACE_TEMPLATE.replace("@interface@", ifaces.get(i)));
            }
        }
        s.append("]");

        return s.toString().replace("@pnfId@", pnfId).replace("@model@", model);
    }



}
