/*******************************************************************************
 * ============LICENSE_START=======================================================
 * ONAP : ccsdk feature sdnr wt
 *  ================================================================================
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
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TemplateFile {

	protected final HashMap<String, Object> mKeyValuePairs;
	private final String mContent;

	public TemplateFile(String content)
	{
		this.mKeyValuePairs = new HashMap<>();
		this.mContent=content;

	}
	public TemplateFile(File f) throws IOException {
		this.mKeyValuePairs = new HashMap<>();
		BufferedReader br = new BufferedReader(new FileReader(f));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();

		while (line != null) {
			sb.append(line);
			line = br.readLine();
		}
		this.mContent = sb.toString();
		br.close();
	}

	public void addValue(String key, Object value) {
		this.mKeyValuePairs.put(key, value);
	}

	public void removeValue(String key) {
		this.mKeyValuePairs.remove(key);
	}

	private String replace() {
		String s=this.mContent;
		String key;
		Object value;
		for (Map.Entry<String, Object> entry : this.mKeyValuePairs.entrySet()) {
		    key = entry.getKey();
		    value = entry.getValue();
		    if(value!=null)
		    	s=s.replace(key, value.toString());
		}
		return s;
	}

	@Override
	public String toString() {
		return this.replace();
	}

}
