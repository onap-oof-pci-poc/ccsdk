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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.HtDevicemanagerConfiguration;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.AaiConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.DcaeConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.EsConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.PmConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.ToggleAlarmConfig;

import com.google.common.io.Files;

public class TestDevMgrPropertiesFile {

    private static final File FILENAME = new File("test.properties");
    private static final File AAIPROP_FILE=new File("aaiclient.properties");
    protected int hasChanged;

    @Before
    public void init() {
        delete(FILENAME);
        delete(AAIPROP_FILE);
    }
    @After
    public void deinit() {
        this.init();
    }

    @Test
    public void test1() {

        writeFile(FILENAME, this.getContent1());
        writeFile(AAIPROP_FILE, this.getAaiPropertiesConfig());

        System.out.println("Read and verify");
        HtDevicemanagerConfiguration cfg=HtDevicemanagerConfiguration.getTestConfiguration(FILENAME.getPath());

        assertNotNull(cfg.getAai());
        assertNotNull(cfg.getDcae());
        assertNotNull(cfg.getPm());
        assertNotNull(cfg.getEs());
        assertNotNull(cfg.getToggleAlarm());
        assertTrue(AaiConfig.isInstantiated());
        assertTrue(DcaeConfig.isInstantiated());
        assertTrue(PmConfig.isInstantiated());
        assertTrue(EsConfig.isInstantiated());
        assertTrue(ToggleAlarmConfig.isInstantiated());

        System.out.println("Verify\n"+cfg.getAai()+"\n"+AaiConfig.getDefaultConfiguration());
        boolean res;
        res = cfg.getAai().equals(AaiConfig.getDefaultConfiguration());
        res = cfg.getDcae().equals(DcaeConfig.getDefaultConfiguration());
        res = cfg.getPm().equals(PmConfig.getDefaultConfiguration());
        res = cfg.getEs().equals(EsConfig.getDefaultConfiguration());
        res = cfg.getToggleAlarm().equals(ToggleAlarmConfig.getDefaultConfiguration());

        res = cfg.getAai().hashCode() == AaiConfig.getDefaultConfiguration().hashCode();
        res = cfg.getDcae().hashCode() == DcaeConfig.getDefaultConfiguration().hashCode();
        res = cfg.getPm().hashCode() == PmConfig.getDefaultConfiguration().hashCode();
        res = cfg.getEs().hashCode() == EsConfig.getDefaultConfiguration().hashCode();
        res = cfg.getToggleAlarm().hashCode() == ToggleAlarmConfig.getDefaultConfiguration().hashCode();

    }

    //-- Observer not working with all testcases, because config does not support different file types.
    //@Test
    public void test2() {

        hasChanged=0;
        writeFile(FILENAME, this.getContent1());
        writeFile(AAIPROP_FILE, this.getAaiPropertiesConfig());


        System.out.println("Read and verify");
        HtDevicemanagerConfiguration cfg=HtDevicemanagerConfiguration.getTestConfiguration(FILENAME.getPath());

        assertNotNull(cfg.getAai());
        assertNotNull(cfg.getDcae());
        assertNotNull(cfg.getPm());
        assertNotNull(cfg.getEs());
        assertNotNull(cfg.getToggleAlarm());
        assertTrue(AaiConfig.isInstantiated());
        assertTrue(DcaeConfig.isInstantiated());
        assertTrue(PmConfig.isInstantiated());
        assertTrue(EsConfig.isInstantiated());
        assertTrue(ToggleAlarmConfig.isInstantiated());

        System.out.println("Verify456\n"+cfg.getAai()+"\n"+AaiConfig.getDefaultConfiguration());
        cfg.getAai().equals(AaiConfig.getDefaultConfiguration());
        cfg.getDcae().equals(DcaeConfig.getDefaultConfiguration());
        cfg.getPm().equals(PmConfig.getDefaultConfiguration());
        cfg.getEs().equals(EsConfig.getDefaultConfiguration());
        cfg.getToggleAlarm().equals(ToggleAlarmConfig.getDefaultConfiguration());

        cfg.registerConfigChangedListener(() -> {
            hasChanged++;
            System.out.println("file changed listener triggered: "+hasChanged);
            AaiConfig.reload();
            DcaeConfig.reload();
            PmConfig.reload();
            EsConfig.reload();
            ToggleAlarmConfig.reload();

        });
        System.out.println("Listerner registered.");
        System.out.println(cfg.getAai().toString());
        System.out.println(cfg.getDcae().toString());
        System.out.println(cfg.getPm().toString());
        System.out.println(cfg.getEs().toString());
        System.out.println(cfg.getToggleAlarm().toString());

        sleep(5000);
        System.out.println("Write new content. Changes "+hasChanged);
        writeFile(FILENAME, this.getContent2());
        sleep(5000);

        int i=10;
        while(hasChanged == 0 && i-- > 0) {
            System.out.println("Wait for Change indication.");
            sleep(1000);
        }
        System.out.println("Changes "+hasChanged);

        assertTrue("fileChanged counter"+hasChanged, hasChanged > 0);
        assertFalse(cfg.getAai().hashCode()==AaiConfig.getDefaultConfiguration().hashCode());
        assertFalse(cfg.getDcae().hashCode()==DcaeConfig.getDefaultConfiguration().hashCode());
        assertFalse(cfg.getPm().hashCode()==PmConfig.getDefaultConfiguration().hashCode());
        assertFalse(cfg.getEs().hashCode()==EsConfig.getDefaultConfiguration().hashCode());
        assertFalse(cfg.getToggleAlarm().hashCode()==ToggleAlarmConfig.getDefaultConfiguration().hashCode());

        HtDevicemanagerConfiguration.clear();

        System.out.println("Test done");

    }


    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
        }
    }

    public static void writeFile(File f, String content) {
         try {
            Files.asCharSink(f, StandardCharsets.UTF_8).write(content);
        } catch (IOException e) {
            fail(e.getMessage());
        };
        sleep(500);
    }

    private void delete(File f) {
        if(f.exists()) {
            f.delete();
        }
    }


    private String getContent2() {
        return "[dcae]\n" +
                "dcaeUserCredentials=admin:admin\n" +
                "dcaeUrl=http://localhost:45451/abc\n" +
                "dcaeHeartbeatPeriodSeconds=120\n" +
                "dcaeTestCollector=no\n" +
                "\n" +
                "[aots]\n" +
                "userPassword=passwd\n" +
                "soapurladd=off\n" +
                "soapaddtimeout=10\n" +
                "soapinqtimeout=20\n" +
                "userName=user\n" +
                "inqtemplate=inqreq.tmpl.xml\n" +
                "assignedto=userid\n" +
                "addtemplate=addreq.tmpl.xml\n" +
                "severitypassthrough=critical,major,minor,warning\n" +
                "systemuser=user\n" +
                "prt-offset=1200\n" +
                "soapurlinq=off\n" +
                "#smtpHost=\n" +
                "#smtpPort=\n" +
                "#smtpUsername=\n" +
                "#smtpPassword=\n" +
                "#smtpSender=\n" +
                "#smtpReceivers=\n" +
                "\n" +
                "[es]\n" +
                "esCluster=sendateodl5\n" +
                "\n" +
                "[aai]\n" +
                "#keep comment\n" +
                "aaiHeaders=[\"X-TransactionId: 9999\"]\n" +
                "aaiUrl=off\n" +
                "aaiUserCredentials=AAI:AAI\n" +
                "aaiDeleteOnMountpointRemove=true\n" +
                "aaiTrustAllCerts=false\n" +
                "aaiApiVersion=aai/v13\n" +
                "aaiPropertiesFile=aaiclient.properties\n" +
                "aaiApplicationId=SDNR\n" +
                "aaiPcks12ClientCertFile=/opt/logs/externals/data/stores/keystore.client.p12\n" +
                "aaiPcks12ClientCertPassphrase=adminadmin\n" +
                "aaiClientConnectionTimeout=30000\n" +
                "\n" +
                "[pm]\n" +
                "pmCluster=sendateodl5\n" +
                "pmEnabled=true\n" +
                "[toggleAlarmFilter]\n" +
                "taEnabled=true\n" +
                "taDelay=5555\n" +
                "";
    }

    private String getContent1() {
        return "[dcae]\n" +
                "dcaeUserCredentials=admin:admin\n" +
                "dcaeUrl=http://localhost:45/abc\n" +
                "dcaeHeartbeatPeriodSeconds=120\n" +
                "dcaeTestCollector=no\n" +
                "\n" +
                "[aots]\n" +
                "userPassword=passwd\n" +
                "soapurladd=off\n" +
                "soapaddtimeout=10\n" +
                "soapinqtimeout=20\n" +
                "userName=user\n" +
                "inqtemplate=inqreq.tmpl.xml\n" +
                "assignedto=userid\n" +
                "addtemplate=addreq.tmpl.xml\n" +
                "severitypassthrough=critical,major,minor,warning\n" +
                "systemuser=user\n" +
                "prt-offset=1200\n" +
                "soapurlinq=off\n" +
                "#smtpHost=\n" +
                "#smtpPort=\n" +
                "#smtpUsername=\n" +
                "#smtpPassword=\n" +
                "#smtpSender=\n" +
                "#smtpReceivers=\n" +
                "\n" +
                "[es]\n" +
                "esCluster=sendateodl5\n" +
                "\n" +
                "[aai]\n" +
                "#keep comment\n" +
                "aaiHeaders=[\"X-TransactionId: 9999\"]\n" +
                "aaiUrl=off\n" +
                "aaiUserCredentials=AAI:AAI\n" +
                "aaiDeleteOnMountpointRemove=true\n" +
                "aaiTrustAllCerts=false\n" +
                "aaiApiVersion=aai/v13\n" +
                "aaiPropertiesFile=aaiclient.properties\n" +
                "\n" +
                "[pm]\n" +
                "pmCluster=sendateodl5\n" +
                "pmEnabled=true\n" +
                "[toggleAlarmFilter]\n" +
                "taEnabled=false\n" +
                "taDelay=5555\n" +
                "";
    }
    private String getAaiPropertiesConfig() {
        return "org.onap.ccsdk.sli.adaptors.aai.ssl.key=\"\"\n" +
                "org.onap.ccsdk.sli.adaptors.aai.ssl.key.psswd=\"\"\n" +
                "org.onap.ccsdk.sli.adaptors.aai.host.certificate.ignore=\"false\"\n" +
                "org.onap.ccsdk.sli.adaptors.aai.application=\"\"\n" +
                "org.onap.ccsdk.sli.adaptors.aai.uri=\"\"\n" +
                "connection.timeout=60000\n" +
                "read.timeout=60000";
    }

}
