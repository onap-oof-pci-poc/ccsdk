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
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.HtDevicemanagerConfiguration;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.AaiConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.DcaeConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.EsConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.PmConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.ToggleAlarmConfig;

import com.google.common.io.Files;

public class TestDevMgrPropertiesFile {

    private static final String FILENAME = "test.properties";
    private static final String AAIPROP_FILE="aaiclient.properties";
    protected boolean hasChanged;

    @Before
    public void init() {
        File f=new File(FILENAME);
        if(f.exists()) {
            f.delete();
        }
        f=new File(AAIPROP_FILE);
        if(f.exists()) {
            f.delete();
        }
    }
    @After
    public void deinit() {
        this.init();
    }

    //@Test
    public void test() {
        File f=new File(FILENAME);
        hasChanged=false;
        try {
            Files.asCharSink(f, StandardCharsets.UTF_8).write(this.getContent1());
        } catch (IOException e) {
            fail(e.getMessage());
        };
        f=new File(AAIPROP_FILE);
        try {
            Files.asCharSink(f, StandardCharsets.UTF_8).write(this.getAaiPropertiesConfig());
        } catch (IOException e) {
            fail(e.getMessage());
        };
        HtDevicemanagerConfiguration cfg=HtDevicemanagerConfiguration.getTestConfiguration(FILENAME);
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


        assertFalse(cfg.getAai().equals(AaiConfig.getDefaultConfiguration()));
        assertFalse(cfg.getDcae().equals(DcaeConfig.getDefaultConfiguration()));
        assertFalse(cfg.getPm().equals(PmConfig.getDefaultConfiguration()));
        assertFalse(cfg.getEs().equals(EsConfig.getDefaultConfiguration()));
        assertFalse(cfg.getToggleAlarm().equals(ToggleAlarmConfig.getDefaultConfiguration()));
        System.out.println(cfg.getAai().toString());
        System.out.println(cfg.getDcae().toString());
        System.out.println(cfg.getPm().toString());
        System.out.println(cfg.getEs().toString());
        System.out.println(cfg.getToggleAlarm().toString());
        cfg.registerConfigChangedListener(() -> {
            hasChanged=true;
            System.out.println("file changed listener triggered");
            AaiConfig.reload();
            DcaeConfig.reload();
            PmConfig.reload();
            EsConfig.reload();
            ToggleAlarmConfig.reload();

        });
        try {
            Files.asCharSink(f, StandardCharsets.UTF_8).write(this.getContent2());
        } catch (IOException e) {
            fail(e.getMessage());
        };
        int i=0;
        while(!hasChanged && i++<10) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

        }
        assertTrue("fileChanged not covered",hasChanged);
        assertFalse(cfg.getAai().hashCode()==AaiConfig.getDefaultConfiguration().hashCode());
        assertFalse(cfg.getDcae().hashCode()==DcaeConfig.getDefaultConfiguration().hashCode());
        assertFalse(cfg.getPm().hashCode()==PmConfig.getDefaultConfiguration().hashCode());
        assertFalse(cfg.getEs().hashCode()==EsConfig.getDefaultConfiguration().hashCode());
        assertFalse(cfg.getToggleAlarm().hashCode()==ToggleAlarmConfig.getDefaultConfiguration().hashCode());

        HtDevicemanagerConfiguration.clear();


    }
    private CharSequence getContent2() {
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
