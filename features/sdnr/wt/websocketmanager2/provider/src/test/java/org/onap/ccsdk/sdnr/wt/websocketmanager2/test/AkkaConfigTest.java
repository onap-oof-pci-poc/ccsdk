package org.onap.ccsdk.sdnr.wt.websocketmanager2.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.onap.ccsdk.sdnr.wt.websocketmanager2.utils.AkkaConfig;

public class AkkaConfigTest {

	@Test
	public void test() {
		AkkaConfig config=null;
		try {
			config = AkkaConfig.load("akka-singlenode.cfg", true);
		} catch (Exception e) {
			fail("error loading singlenode config");
		}
		assertEquals("no singlenode config detected",false,config.isCluster());
		assertEquals("more than one node detected",1,config.getClusterConfig().getSeedNodes().size());
		
		try {
			config = AkkaConfig.load("akka-cluster.cfg", true);
		} catch (Exception e) {
			fail("error loading cluster config");
		}
		assertEquals("no cluster config detected",true,config.isCluster());
		assertTrue("only one node detected",config.getClusterConfig().getSeedNodes().size()>1);
	
	}

}
