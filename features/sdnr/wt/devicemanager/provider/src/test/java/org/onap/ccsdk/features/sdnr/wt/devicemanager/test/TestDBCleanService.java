package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.json.JSONObject;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseWebAPIClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.util.NetconfTimeStamp;

public class TestDBCleanService {

	private static final String NODENAME_1 = "node1";
	private static final String OBJECTID_1 = "obj1";
	private static final String EVENTTYPE_1 = "ObjectCreationNotificationXml";
	private static final String PROBLEM_1 = "my problem";
	private static final String SEVERITY_1 = "critical";
	private static final String COMPONENT_1 = "mwtnBrowserCtrl";
	private static final String MESSAGE_1 = "mwtnBrowserCtrl started";
	@Test
	public void test() {
		HtDatabaseWebAPIClient webClient=new HtDatabaseWebAPIClient();
		int i=0,hrs=0,m=1,d=3,y=2018;
		try {
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,1,1,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","eventlog",this.getEventObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,EVENTTYPE_1));
			hrs=0;
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(2019,3,21,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			webClient.insertEntry("sdnevents","faultlog",this.getFaultLogObject(NODENAME_1, i++,this.getDate(y,m,d,hrs++,0), OBJECTID_1,PROBLEM_1,SEVERITY_1,EVENTTYPE_1));
			hrs=0;
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d++,hrs++,0),EVENTTYPE_1));
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d,hrs++,0),EVENTTYPE_1));
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d,hrs++,0),EVENTTYPE_1));
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d,hrs++,0),EVENTTYPE_1));
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d,hrs++,0),EVENTTYPE_1));
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d,hrs++,0),EVENTTYPE_1));
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d,hrs++,0),EVENTTYPE_1));
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d,hrs++,0),EVENTTYPE_1));
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d,hrs++,0),EVENTTYPE_1));
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d,hrs++,0),EVENTTYPE_1));
			webClient.insertEntry("mwtn","log",this.getLogObject(COMPONENT_1,MESSAGE_1,this.getDate(y,m,d,hrs++,0),EVENTTYPE_1));
					
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	private Date getDate(int year, int month, int day, int hour, int minute) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY,hour);
		cal.set(Calendar.MINUTE,minute);
		
		return cal.getTime();
	}
	private JSONObject getEventObject(String nodeName,int counter, Date timeStamp,String objectId,String type) {
		
		JSONObject o=new JSONObject();
		JSONObject event=new JSONObject();
		event.put("nodeName",nodeName);
		event.put("counter", counter);
		event.put("timeStamp", NetconfTimeStamp.getConverter().getTimeStampAsNetconfString(timeStamp.getTime()));
		event.put("objectId", objectId);
		event.put("type", type);
		o.put("event",event);
		System.out.println(o.toString());
		return o;
	}	
	private JSONObject getFaultLogObject(String nodeName,int counter, Date timeStamp,String objectId,String problem,String severity,String type) {
		
		JSONObject o=new JSONObject();
		JSONObject fault=new JSONObject();
		fault.put("nodeName",nodeName);
		fault.put("counter", counter);
		fault.put("timeStamp", NetconfTimeStamp.getConverter().getTimeStampAsNetconfString(timeStamp.getTime()));
		fault.put("objectId", objectId);
		fault.put("problem",problem);
		fault.put("severity", severity);
		fault.put("type", type);
		o.put("fault",fault);
		return o;
	}
private JSONObject getLogObject(String component,String message, Date timeStamp,String type) {
		
		JSONObject log=new JSONObject();
		log.put("timestamp", NetconfTimeStamp.getConverter().getTimeStampAsNetconfString(timeStamp.getTime()));
		log.put("type", type);
		log.put("component",component);
		log.put("message", message);
		return log;
	}	
}
