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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseWebAPIClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.Resources;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.Capabilities;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.DeviceManagerImpl;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.DeviceManagerService.Action;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.test.mock.DataBrokerNetconfMock;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.test.mock.MountPointMock;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.test.mock.MountPointServiceMock;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.test.mock.NotificationPublishServiceMock;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.test.mock.RpcProviderRegistryMock;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util.ReadOnlyTransactionMountpoint1211Mock;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util.ReadOnlyTransactionMountpoint1211pMock;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util.ReadOnlyTransactionMountpoint12Mock;
import org.opendaylight.controller.md.sal.binding.api.MountPointService;
import org.opendaylight.controller.md.sal.binding.api.NotificationPublishService;
import org.opendaylight.controller.md.sal.binding.api.ReadOnlyTransaction;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test1dm {

    private static int DATABASETIMEOUTSECONDS = 30;

    private static Path KARAF_ETC = Paths.get("etc");
    private static DeviceManagerImpl deviceManager;
    private static MountPointMock  mountPoint;
    private static DataBrokerNetconfMock dataBrokerNetconf;

    private static final Logger LOG = LoggerFactory.getLogger(Test1dm.class);



    @BeforeClass
    public static void before() throws InterruptedException, IOException {

         System.out.println("Logger: "+LOG.getClass().getName() + " " + LOG.getName());
        // Call System property to get the classpath value
        Path etc = KARAF_ETC;
        delete(etc);

        System.out.println("Create empty:"+etc.toString());
        Files.createDirectories(etc);

        //Create mocks
        ReadOnlyTransaction readOnlyTransaction = new ReadOnlyTransactionMountpoint12Mock();
        dataBrokerNetconf = new DataBrokerNetconfMock();
        dataBrokerNetconf.setReadOnlyTransaction(readOnlyTransaction);
        mountPoint = new MountPointMock();
        mountPoint.setReadOnlyTransaction(readOnlyTransaction);
        MountPointService mountPointService = new MountPointServiceMock(mountPoint);
        NotificationPublishService notificationPublishService = new NotificationPublishServiceMock();
        RpcProviderRegistry rpcProviderRegistry = new RpcProviderRegistryMock();

        //start using blueprint interface
        deviceManager = new DeviceManagerImpl();

        deviceManager.setDataBroker(dataBrokerNetconf);
        deviceManager.setMountPointService(mountPointService);
        deviceManager.setNotificationPublishService(notificationPublishService);
        deviceManager.setRpcProviderRegistry(rpcProviderRegistry);

        try {
            deviceManager.init();
        } catch (Exception e) {
            e.printStackTrace();
        }

        readOnlyTransaction.close();
        System.out.println("Initialization status: "+deviceManager.isDevicemanagerInitializationOk());
        assertTrue("Devicemanager not initialized", deviceManager.isDevicemanagerInitializationOk());
        System.out.println("Initialization done");

    }

    @AfterClass
    public static void after() throws InterruptedException, IOException {

        System.out.println("Start shutdown");
        //close using blueprint interface
        try {
            deviceManager.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        delete(KARAF_ETC);

    }

    @Test
    public void test0() throws InterruptedException {
        HtDatabaseWebAPIClient client = new HtDatabaseWebAPIClient();
        try {
            String response = client.sendRequest("/mwtn/mediator-server/_search", "GET",
                    new JSONObject("{\"match\":{\"id\":id}}"));
            System.out.println(response);
        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() throws InterruptedException  {

        System.out.println("Test1: Wait for database");
        int timeout = DATABASETIMEOUTSECONDS;
        while ( !deviceManager.isDatabaseInitializationFinished() && timeout-- > 0) {
            System.out.println("Test1: "+timeout);
            Thread.sleep(1000); //On second
        }
        System.out.println("Test1: database initialized");
    }

    @Test
    public void test2() {
        System.out.println("Test2: slave mountpoint");

        ReadOnlyTransactionMountpoint12Mock readOnlyTransaction = new ReadOnlyTransactionMountpoint12Mock();
        dataBrokerNetconf.setReadOnlyTransaction(readOnlyTransaction);
        mountPoint.setReadOnlyTransaction(readOnlyTransaction);
        NetconfNode nNode = readOnlyTransaction.getMock().getNetconfNode();

        mountPoint.setDatabrokerAbsent(true);
        NodeId nodeId = new NodeId("mountpointTest2");
        try {
            deviceManager.startListenerOnNodeForConnectedState(Action.ADD, nodeId, nNode);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception received.");
        }
        readOnlyTransaction.close();
        System.out.println("Test2: Done");

    }

    @Test
    public void test3() {
        System.out.println("Test3: master mountpoint ONF Model 12");

        ReadOnlyTransactionMountpoint12Mock readOnlyTransaction = new ReadOnlyTransactionMountpoint12Mock();
        dataBrokerNetconf.setReadOnlyTransaction(readOnlyTransaction);
        mountPoint.setReadOnlyTransaction(readOnlyTransaction);
        NetconfNode nNode = readOnlyTransaction.getMock().getNetconfNode();

        mountPoint.setDatabrokerAbsent(false);
        NodeId nodeId = new NodeId("mountpointTest3");

        Capabilities capabilities = Capabilities.getAvailableCapabilities(nNode);
        System.out.println("Node capabilites: "+capabilities);

        try {
            deviceManager.startListenerOnNodeForConnectedState(Action.ADD, nodeId, nNode);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception received.");
        }
        readOnlyTransaction.close();
        System.out.println("Test3: Done");

    }

    @Test
    public void test4() {
        System.out.println("Test4: master mountpoint ONF Model 1211");

        ReadOnlyTransactionMountpoint1211Mock readOnlyTransaction = new ReadOnlyTransactionMountpoint1211Mock();
        dataBrokerNetconf.setReadOnlyTransaction(readOnlyTransaction);
        mountPoint.setReadOnlyTransaction(readOnlyTransaction);

        NetconfNode nNode = readOnlyTransaction.getMock().getNetconfNode();
        mountPoint.setDatabrokerAbsent(false);
        NodeId nodeId = new NodeId("mountpointTest4");

        Capabilities capabilities = Capabilities.getAvailableCapabilities(nNode);
        System.out.println("Node capabilites: "+capabilities);

        try {
            deviceManager.startListenerOnNodeForConnectedState(Action.ADD, nodeId, nNode);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception received.");
        }
        readOnlyTransaction.close();
        System.out.println("Test4: Done");

    }

    @Test
    public void test5() {
        System.out.println("Test5: master mountpoint ONF Model 1211p");

        ReadOnlyTransactionMountpoint1211pMock readOnlyTransaction = new ReadOnlyTransactionMountpoint1211pMock();
        dataBrokerNetconf.setReadOnlyTransaction(readOnlyTransaction);
        mountPoint.setReadOnlyTransaction(readOnlyTransaction);

        NetconfNode nNode = readOnlyTransaction.getMock().getNetconfNode();
        mountPoint.setDatabrokerAbsent(false);
        NodeId nodeId = new NodeId("mountpointTest5");

        Capabilities capabilities = Capabilities.getAvailableCapabilities(nNode);
        System.out.println("Node capabilites: "+capabilities);

        try {
            deviceManager.startListenerOnNodeForConnectedState(Action.ADD, nodeId, nNode);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception received.");
        }
        readOnlyTransaction.close();
        System.out.println("Test5: Done");

    }

    @Test
    public void test6() {

        System.out.println("Test6: Write zip data file file");
        File testFile = new File("etc/elasticsearch_update.zip");
        Resources.extractFileTo("elasticsearch_update.zip", testFile);
        int wait=130;
        while ( testFile.exists() && wait-- > 0) {
            System.out.println("Waiting "+wait);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
        }


        System.out.println("Test6: Done");

    }

    //********************* Private

    private static void delete(Path etc) throws IOException {
        if (Files.exists(etc)) {
            System.out.println("Found and remove:"+etc.toString());
            delete(etc.toFile());
        }
    }

    private static void delete(File f) throws IOException {
        if (f.isDirectory()) {
            for (File c : f.listFiles()) {
                delete(c);
            }
        }
        if (!f.delete()) {
            throw new FileNotFoundException("Failed to delete file: " + f);
        }
    }


}
