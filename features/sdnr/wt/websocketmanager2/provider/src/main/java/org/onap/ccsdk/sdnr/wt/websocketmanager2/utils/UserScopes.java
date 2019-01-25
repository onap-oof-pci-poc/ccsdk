/*******************************************************************************
 * ============LICENSE_START=======================================================
 * ONAP : ccsdk feature sdnr wt websocketmanager2
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
package org.onap.ccsdk.sdnr.wt.websocketmanager2.utils;

import org.json.JSONArray;

public class UserScopes {

	private JSONArray scopes;

	/**
	 * 
	 * @param jsonArray array of Strings
	 */
	public void setScopes(JSONArray jsonArray) {
		this.scopes = jsonArray;
	}

	public boolean hasScope(String scope) {
		if (this.scopes == null)
			return false;
		for (int i = 0, l = this.scopes.length(); i < l; i++) {
			if (this.scopes.get(i).toString().equals(scope)) {
				return true;
			}
		}

		return false;
	}

}
