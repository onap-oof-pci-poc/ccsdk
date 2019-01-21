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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.http;

public class BaseHTTPResponse {

	public static final int CODE404 = 404;
	public static final int CODE200 = 200;
	public static final BaseHTTPResponse UNKNOWN = new BaseHTTPResponse(-1, "");
	public final int code;
	public final String body;

	public BaseHTTPResponse(int code,String body)
	{
		this.code=code;
		this.body=body;
	}

	@Override
	public String toString() {
		return "BaseHTTPResponse [code=" + code + ", body=" + body + "]";
	}
}
