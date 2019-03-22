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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.json.JSONObject;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseWebAPIClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.util.NetconfTimeStamp;

public class DBCleanServiceHelper {

	private static final String NODENAME_1 = "node1";
	private static final String OBJECTID_1 = "obj1";
	private static final String EVENTTYPE_1 = "ObjectCreationNotificationXml";
	private static final String PROBLEM_1 = "my problem";
	private static final String SEVERITY_1 = "critical";
	private static final String COMPONENT_1 = "mwtnBrowserCtrl";
	private static final String MESSAGE_1 = "mwtnBrowserCtrl started";
	private final int daysForDeprecatedData;
	
	public DBCleanServiceHelper(int daysForDeprecatedData) {
		this.daysForDeprecatedData=daysForDeprecatedData;
	}
	public void loadOldData(int numEventlog,int numFaultlog,int numLog) {
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis()-(1000*60*60*24*this.daysForDeprecatedData));
		this.loadData(numEventlog, numFaultlog, numLog, cal);
	}
		
	public void loadHalfOldData(int numEventlog,int numFaultlog,int numLog) {
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis()-(1000*60*60*24*this.daysForDeprecatedData));
		this.loadData(numEventlog/2, numFaultlog/2, numLog/2, cal);
		cal.setTimeInMillis(System.currentTimeMillis()-(1000*60*60*12*this.daysForDeprecatedData));
		this.loadData(numEventlog/2, numFaultlog/2, numLog/2, cal);
	}
	public void loadNewData(int numEventlog,int numFaultlog,int numLog) {
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis()-(1000*60*60*12*this.daysForDeprecatedData));
		this.loadData(numEventlog, numFaultlog, numLog, cal);
	}
	private void loadData(int numEventlog,int numFaultlog,int numLog, Calendar base) {
		HtDatabaseWebAPIClient webClient = new HtDatabaseWebAPIClient();
		Calendar cal = base;

		int i = 0, hrs = cal.get(Calendar.HOUR_OF_DAY), m = cal.get(Calendar.MONTH),
				d = cal.get(Calendar.DAY_OF_MONTH), y = cal.get(Calendar.YEAR);
		try {
			while (numEventlog-- > 0) {
				webClient.insertEntry("sdnevents", "eventlog",
						this.getEventObject(NODENAME_1, i++, this.getDate(y, 1, 1, hrs++, 0), OBJECTID_1, EVENTTYPE_1));
			}
			hrs = 0;
			while (numFaultlog-- > 0) {
				webClient.insertEntry("sdnevents", "faultlog", this.getFaultLogObject(NODENAME_1, i++,
						this.getDate(2019, 3, 21, hrs++, 0), OBJECTID_1, PROBLEM_1, SEVERITY_1, EVENTTYPE_1));
			}
			hrs = 0;
			while (numLog-- > 0) {
				webClient.insertEntry("mwtn", "log",
						this.getLogObject(COMPONENT_1, MESSAGE_1, this.getDate(y, m, d++, hrs++, 0), EVENTTYPE_1));
			}

		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	private Date getDate(int year, int month, int day, int hour, int minute) {
		month = month % 12;
		day = day % 30;
		hour = hour % 24;
		minute = minute % 60;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, hour);
		cal.set(Calendar.MINUTE, minute);

		return cal.getTime();
	}

	private JSONObject getEventObject(String nodeName, int counter, Date timeStamp, String objectId, String type) {

		JSONObject o = new JSONObject();
		JSONObject event = new JSONObject();
		event.put("nodeName", nodeName);
		event.put("counter", counter);
		event.put("timeStamp", NetconfTimeStamp.getConverter().getTimeStampAsNetconfString(timeStamp.getTime()));
		event.put("objectId", objectId);
		event.put("type", type);
		o.put("event", event);
		System.out.println(o.toString());
		return o;
	}

	private JSONObject getFaultLogObject(String nodeName, int counter, Date timeStamp, String objectId, String problem,
			String severity, String type) {

		JSONObject o = new JSONObject();
		JSONObject fault = new JSONObject();
		fault.put("nodeName", nodeName);
		fault.put("counter", counter);
		fault.put("timeStamp", NetconfTimeStamp.getConverter().getTimeStampAsNetconfString(timeStamp.getTime()));
		fault.put("objectId", objectId);
		fault.put("problem", problem);
		fault.put("severity", severity);
		fault.put("type", type);
		o.put("fault", fault);
		return o;
	}

	private JSONObject getLogObject(String component, String message, Date timeStamp, String type) {

		JSONObject log = new JSONObject();
		log.put("timestamp", NetconfTimeStamp.getConverter().getTimeStampAsNetconfString(timeStamp.getTime()));
		log.put("type", type);
		log.put("component", component);
		log.put("message", message);
		return log;
	}
}
