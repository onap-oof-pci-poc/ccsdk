package com.highstreet.technologies.apigateway;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestProperties {

	private static final boolean DEFAULT_CORSENABLED = false;
	private static final boolean DEFAULT_AAIOFF = true;
	private static final boolean DEFAULT_ESOFF = false;
	private static final boolean DEFAULT_TRUSTINSECURE = false;
	private static final String DEFAULT_AAIBASEURL = "off";
	private static Map<String,String> DEFAULT_AAIHEADERS = new HashMap<String,String>();
	private static final String DEFAULT_ESBASEURL = "http://localhost:9200";
	
	private static final boolean CUSTOM_CORSENABLED = true;
	private static final boolean CUSTOM_AAIOFF = false;
	private static final boolean CUSTOM_ESOFF = false;
	private static final boolean CUSTOM_TRUSTINSECURE = true;
	private static final String CUSTOM_AAIBASEURL = "https://aai.tld:2214";
	private static Map<String,String> CUSTOM_AAIHEADERS = new HashMap<String,String>();
	private static final String CUSTOM_ESBASEURL = "http://localhost:9200";

	private static final String LR = "\n";
	@Test
	public void test() {
		final String tmpFilename="tmp.cfg";
		DEFAULT_AAIHEADERS.put("X-FromAppId","SDNR");
		DEFAULT_AAIHEADERS.put("Authorization","Basic QUFJOkFBSQ==");
		CUSTOM_AAIHEADERS.put("X-FromAppId","SDNC");
		CUSTOM_AAIHEADERS.put("Authorization","Basic 1234");
		final String TESTPROPERTYFILECONTENT="aai="+CUSTOM_AAIBASEURL+LR+
				"aaiHeaders=[\"X-FromAppId:"+CUSTOM_AAIHEADERS.get("X-FromAppId")+"\",\"Authorization:"+CUSTOM_AAIHEADERS.get("Authorization")+"\"]"+LR+
				"database="+CUSTOM_ESBASEURL+LR+
				"insecure="+(CUSTOM_TRUSTINSECURE?"1":"0")+LR+
				"cors="+(CUSTOM_CORSENABLED?"1":"0");
		File ftest = new File(tmpFilename);
		//delete autogenerated testfile
		if(ftest.exists())
			ftest.delete();
		MyProperties prop=null;
		try {
			prop = MyProperties.Instantiate(ftest);
		} catch (Exception e) {
			fail("error instantiating properties");
		}
		assertNotNull("problem without exception instantiating properties", prop);
		
		assertEquals("default config file was not created",ftest.exists(), true);

		//test default values
		assertEquals("default value is not correct",prop.corsEnabled(),DEFAULT_CORSENABLED);
		assertEquals("default value is not correct",prop.isAAIOff(),DEFAULT_AAIOFF);
		assertEquals("default value is not correct",prop.isEsOff(),DEFAULT_ESOFF);
		assertEquals("default value is not correct",prop.trustInsecure(),DEFAULT_TRUSTINSECURE);
		assertEquals("default value is not correct",prop.getAAIBaseUrl(),DEFAULT_AAIBASEURL);
		assertEquals("default value is not correct",prop.getAAIHeaders(),DEFAULT_AAIHEADERS);
		assertEquals("default value is not correct",prop.getEsBaseUrl(),DEFAULT_ESBASEURL);
		
		
		try {
			prop.load(new ByteArrayInputStream(TESTPROPERTYFILECONTENT.getBytes()));
		} catch (Exception e) {
			fail("error loading custom values into properties");
		}
		
		//test custom values
		assertEquals("custom value is not correct",prop.corsEnabled(),CUSTOM_CORSENABLED);
		assertEquals("custom value is not correct",prop.isAAIOff(),CUSTOM_AAIOFF);
		assertEquals("custom value is not correct",prop.isEsOff(),CUSTOM_ESOFF);
		assertEquals("custom value is not correct",prop.trustInsecure(),CUSTOM_TRUSTINSECURE);
		assertEquals("custom value is not correct",prop.getAAIBaseUrl(),CUSTOM_AAIBASEURL);
		assertEquals("custom value is not correct",prop.getAAIHeaders(),CUSTOM_AAIHEADERS);
		assertEquals("custom value is not correct",prop.getEsBaseUrl(),CUSTOM_ESBASEURL);
	
		//delete autogenerated testfile
		ftest.delete();
		
	}

}
