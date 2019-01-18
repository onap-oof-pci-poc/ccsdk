/*
 * ============LICENSE_START=======================================================
 * ONAP : CCSDK.apps.sdnr.wt.apigateway
 * ================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property.
 * All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */
package org.onap.ccsdk.features.sdnr.wt.apigateway;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyProperties {

	private static Logger LOG = LoggerFactory.getLogger(MyProperties.class);
	public static final String PROPFILE = "etc/apigateway.properties";
	private static final String DEFAULT_AAI_HEADERS = "[\"X-FromAppId:SDNR\",\"Authorization:Basic QUFJOkFBSQ==\"]";
	private static final String DEFAULT_CORSENABLED = "0";
	private static final String DEFAULT_TRUSTINSECURE = "0";
	private static final String DEFAULT_ESDATABASE = "http://localhost:9200";
	private static final String DEFAULT_AAI = "off";

	@Override
	public String toString() {
		return "MyProperties [aaiBase=" + aaiBase + ", aaiHeaders=" + aaiHeaders + ", esBase=" + esBase
				+ ", trustInsecure=" + trustInsecure + ", corsEnabled=" + corsEnabled + "]";
	}

	private static MyProperties mObj;

	private String aaiBase;
	private Map<String, String> aaiHeaders;
	private String esBase;

	private boolean trustInsecure;

	private boolean corsEnabled;

	public boolean isAAIOff() {
		return this.aaiBase == null ? true : this.aaiBase.equals("off");
	}

	public boolean isEsOff() {
		return this.esBase == null ? true : this.esBase.equals("off");
	}

	public String getAAIBaseUrl() {
		return this.aaiBase;
	}

	public String getEsBaseUrl() {
		return this.esBase;
	}

	public Map<String, String> getAAIHeaders() {
		return this.aaiHeaders;
	}

	public boolean trustInsecure() {
		return this.trustInsecure;
	}

	public boolean corsEnabled() {
		return this.corsEnabled;
	}

	public static MyProperties Instantiate() throws IOException, NumberFormatException {
		return Instantiate(new File(PROPFILE));
	}

	public static MyProperties Instantiate(File file) throws IOException, NumberFormatException {

		return Instantiate(file, false);
	}

	public static MyProperties Instantiate(File file, boolean force) throws IOException, NumberFormatException {
		if (mObj == null || force) {
			mObj = new MyProperties(file);
			LOG.debug("instantiated: {}", mObj.toString());
		}
		return mObj;
	}

	private MyProperties(File file) throws IOException, NumberFormatException {
		this.aaiBase = "off";
		this.trustInsecure = false;
		if (!file.exists()) {
			this.writeDefaults(file);
		}
		this.load(new FileInputStream(file));
	}

	public void load(InputStream in) throws IOException, NumberFormatException {

		Properties defaultProps = new Properties();
		defaultProps.load(in);
		in.close();

		this.aaiBase = defaultProps.getProperty("aai", DEFAULT_AAI);
		this.aaiHeaders = _parseHeadersMap(defaultProps.getProperty("aaiHeaders", DEFAULT_AAI_HEADERS));
		this.esBase = defaultProps.getProperty("database", DEFAULT_ESDATABASE);
		this.trustInsecure = Integer.parseInt(defaultProps.getProperty("insecure", DEFAULT_TRUSTINSECURE)) == 1;
		this.corsEnabled = Integer.parseInt(defaultProps.getProperty("cors", DEFAULT_CORSENABLED)) == 1;
	}

	private static Map<String, String> _parseHeadersMap(String s) {
		Map<String, String> r = new HashMap<>();
		try {
			JSONArray a = new JSONArray(s);
			if ( a.length() > 0) {
				for (int i = 0; i < a.length(); i++) {
					String item = a.getString(i);
					String[] hlp = item.split(":");
					if (hlp.length > 1) {
						r.put(hlp[0], hlp[1]);
					}
				}
			}
		} catch (Exception e) {
			LOG.warn("problem loading headers map: {}",e.getMessage());
		}
		return r;
	}

	private String writeDefaults(File f) throws IOException {
		StringBuilder sb = new StringBuilder();
		final String LR = "\n";
		FileWriter fw = new FileWriter(f);
		sb.append("aai=" + DEFAULT_AAI + LR);
		sb.append("aaiHeaders=" + DEFAULT_AAI_HEADERS + LR);
		sb.append("database=" + DEFAULT_ESDATABASE + LR);
		sb.append("insecure=" + DEFAULT_TRUSTINSECURE + LR);
		sb.append("cors=" + DEFAULT_CORSENABLED);
		try {
			fw.write(sb.toString());
		} catch (Exception e) {
			LOG.warn("problem writing default values to propertyfile {} : {}", f.getAbsolutePath() , e.getMessage());
		} finally {
			fw.close();
		}
		return sb.toString();
	}

	public static MyProperties getInstance() {
		return mObj;
	}

}
