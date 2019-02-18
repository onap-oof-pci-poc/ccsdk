package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAkkaConfig.class, TestDevMgrPropertiesFile.class, TestGeoConfig.class })
public class AllConfigTests {

}
