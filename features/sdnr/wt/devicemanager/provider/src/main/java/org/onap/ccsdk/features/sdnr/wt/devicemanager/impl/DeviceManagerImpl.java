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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl;

import com.google.common.base.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.aaiConnector.impl.AaiProviderClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseNode;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile.ConfigurationException;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.ONFCoreNetworkElementFactory;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.ONFCoreNetworkElementRepresentation;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.toggleAlarmFilter.NotificationDelayService;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.AkkaConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.EsConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.GeoConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.HtDevicemanagerConfiguration;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.PmConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.dcaeConnector.impl.DcaeProviderClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.devicemonitor.impl.DeviceMonitorImpl;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.service.HtDatabaseEventsService;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.listener.NetconfChangeListener;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.listener.ODLEventListener;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.WebSocketServiceClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.WebSocketServiceClientImpl2;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.index.impl.IndexConfigService;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.index.impl.IndexMwtnService;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.index.impl.IndexUpdateService;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.impl.MaintenanceServiceImpl;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.performancemanager.impl.PerformanceManagerImpl;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.performancemanager.impl.database.service.MicrowaveHistoricalPerformanceWriterService;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.MountPoint;
import org.opendaylight.controller.md.sal.binding.api.MountPointService;
import org.opendaylight.controller.md.sal.binding.api.NotificationPublishService;
import org.opendaylight.controller.sal.binding.api.RpcConsumerRegistry;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.netconf.notification._1._0.rev080714.CreateSubscriptionInput;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.netconf.notification._1._0.rev080714.CreateSubscriptionInputBuilder;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.netconf.notification._1._0.rev080714.NotificationsService;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.netconf.notification._1._0.rev080714.StreamNameType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.network.topology.topology.topology.types.TopologyNetconf;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.TopologyKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.NodeKey;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeviceManagerImpl implements DeviceManagerService, AutoCloseable, ResyncNetworkElementsListener {

    private static final Logger LOG = LoggerFactory.getLogger(DeviceManagerImpl.class);
    private static final String APPLICATION_NAME = "DeviceManager";
    private static final String MYDBKEYNAMEBASE = "SDN-Controller";

    // http://sendateodl:8181/restconf/operational/network-topology:network-topology/topology/topology-netconf
    private static final InstanceIdentifier<Topology> NETCONF_TOPO_IID = InstanceIdentifier
            .create(NetworkTopology.class)
            .child(Topology.class, new TopologyKey(new TopologyId(TopologyNetconf.QNAME.getLocalName())));
    private static final String STARTUPLOG_FILENAME = "etc/devicemanager.startup.log";
    //private static final String STARTUPLOG_FILENAME2 = "data/cache/devicemanager.startup.log";

    private DataBroker dataBroker = null;
    private MountPointService mountPointService = null;
    private RpcProviderRegistry rpcProviderRegistry = null;
    @SuppressWarnings("unused")
    private NotificationPublishService notificationPublishService = null;

    private final ConcurrentHashMap<String, ONFCoreNetworkElementRepresentation> networkElementRepresentations = new ConcurrentHashMap<>();

    private WebSocketServiceClient webSocketService;
    private HtDatabaseEventsService databaseClientEvents;
    private ODLEventListener odlEventListener;
    private NetconfChangeListener netconfChangeListener;
    private DeviceManagerApiServiceImpl rpcApiService;
    private @Nullable PerformanceManagerImpl performanceManager = null;
    private ProviderClient dcaeProviderClient;
    private ProviderClient aotsMProvider;
    private @Nullable AaiProviderClient aaiProviderClient;
    private DeviceMonitorImpl deviceMonitor;
    private IndexUpdateService updateService;
    private IndexConfigService configService;
    private IndexMwtnService mwtnService;
    private HtDatabaseNode htDatabase;
    private Boolean initialized = false;
    private MaintenanceServiceImpl maintenanceService;
    private NotificationDelayService<ProblemNotificationXml> notificationDelayService;
    private Thread threadDoClearCurrentFaultByNodename = null;
    private int refreshCounter = 0;
    private AkkaConfig akkaConfig;

    //Blueprint 1
    public DeviceManagerImpl() {
        LOG.info( "Creating provider for {}", APPLICATION_NAME);
    }
    public void setDataBroker(DataBroker dataBroker) {
        this.dataBroker = dataBroker;
    }
    public void setRpcProviderRegistry(RpcProviderRegistry rpcProviderRegistry) {
        this.rpcProviderRegistry = rpcProviderRegistry;

    }
    public void setNotificationPublishService(NotificationPublishService notificationPublishService) {
        this.notificationPublishService = notificationPublishService;
    }
    public void setMountPointService(MountPointService mountPointService) {
         this.mountPointService = mountPointService;
    }

    public void init(){

        LOG.info("Session Initiated start {}", APPLICATION_NAME);

        // Start RPC Service
        this.rpcApiService = new DeviceManagerApiServiceImpl(rpcProviderRegistry);
        // Get configuration
        HtDevicemanagerConfiguration config;
        try {
            config = new HtDevicemanagerConfiguration();
            this.akkaConfig = null;
            try {
                this.akkaConfig = AkkaConfig.load();
                LOG.debug("akka.conf loaded: "+akkaConfig.toString());
            } catch (Exception e1) {
                LOG.warn("problem loading akka.conf: " + e1.getMessage());
            }
            GeoConfig geoConfig = null;
            if (akkaConfig != null && akkaConfig.isCluster()) {
                LOG.info("cluster mode detected");
                if (GeoConfig.fileExists()) {
                    try {
                        LOG.debug("try to load geoconfig");
                        geoConfig = GeoConfig.load();
                    } catch (Exception err) {
                        LOG.warn("problem loading geoconfig: " + err.getMessage());
                    }
                } else {
                    LOG.debug("no geoconfig file found");
                }
            }
            else
            {
                LOG.info("single node mode detected");
            }

            this.notificationDelayService=new NotificationDelayService<>(config);

            EsConfig dbConfig = config.getEs();
            LOG.debug("esConfig=" + dbConfig.toString());
            // Start database
            htDatabase = HtDatabaseNode.start(dbConfig, akkaConfig,geoConfig);

            // init Database Values only if singleNode or clusterMember=1
            if (akkaConfig == null || akkaConfig.isSingleNode() || akkaConfig != null && akkaConfig.isCluster()
                    && akkaConfig.getClusterConfig().getRoleMemberIndex() == 1) {
                // Create DB index if not existing and if database is running
                this.configService = new IndexConfigService(htDatabase);
                this.mwtnService = new IndexMwtnService(htDatabase);
            }
            // start service for device maintenance service
            this.maintenanceService = new MaintenanceServiceImpl(htDatabase);
            // Websockets

            this.webSocketService = new WebSocketServiceClientImpl2(rpcProviderRegistry);

            // DCAE
            this.dcaeProviderClient = new DcaeProviderClient(config, dbConfig.getCluster(), this);

            this.aaiProviderClient = new AaiProviderClient(config,this);
            // EM
            EsConfig emConfig = dbConfig.cloneWithIndex("sdnevents");

            if (emConfig == null) {
                LOG.warn("No {} configuration available. Don't start event manager");
            } else {
                this.databaseClientEvents = new HtDatabaseEventsService(htDatabase);

                String myDbKeyNameExtended=MYDBKEYNAMEBASE+"-"+dbConfig.getCluster();


                this.odlEventListener = new ODLEventListener(myDbKeyNameExtended, webSocketService, databaseClientEvents,
                        dcaeProviderClient, aotsMProvider,maintenanceService);
            }

            // PM
            PmConfig configurationPM = config.getPm();
            LOG.info("Performance manager configuration: {}", configurationPM);
            if (!configurationPM.isPerformanceManagerEnabled()) {

                LOG.info("No configuration available. Don't start performance manager");
            } else {
                @Nullable MicrowaveHistoricalPerformanceWriterService databaseClientHistoricalPerformance;
                databaseClientHistoricalPerformance = new MicrowaveHistoricalPerformanceWriterService(htDatabase);
                this.performanceManager = new PerformanceManagerImpl(60, databaseClientHistoricalPerformance);
            }

            // DUS (Database update service)
            LOG.debug("start db update service");
            this.updateService = new IndexUpdateService(htDatabase, dbConfig.getHost(), dbConfig.getCluster(),
                    dbConfig.getNode());
            this.updateService.start();

            // RPC Service for specific services
            this.rpcApiService.setMaintenanceService(this.maintenanceService);
            this.rpcApiService.setResyncListener(this);
            // DM
            // DeviceMonitor has to be available before netconfSubscriptionManager is
            // configured
            LOG.debug("start DeviceMonitor Service");
            this.deviceMonitor = new DeviceMonitorImpl(dataBroker, odlEventListener);

            // netconfSubscriptionManager should be the last one because this is a callback
            // service
            LOG.debug("start NetconfSubscriptionManager Service");
            // this.netconfSubscriptionManager = new
            // NetconfSubscriptionManagerOfDeviceManager(this, dataBroker);
            // this.netconfSubscriptionManager.register();
            this.netconfChangeListener = new NetconfChangeListener(this, dataBroker);
            this.netconfChangeListener.register();

            synchronized (initialized) {
                initialized = true;
            }
        } catch (IOException | ConfigurationException e) {
            LOG.error("Can not load configuration", e);
        }

        LOG.info("Session Initiated end");
    }

    @Override
    public void close() throws Exception {
        LOG.info("DeviceManagerImpl closing ...");

        close(performanceManager);
        close(dcaeProviderClient);
        close(aaiProviderClient);
        close(aotsMProvider);
        close(deviceMonitor);
        close(updateService, configService, mwtnService);
        close(htDatabase);
        close(netconfChangeListener);
        close(maintenanceService);
        close(rpcApiService);
        close(notificationDelayService);

        LOG.info("DeviceManagerImpl closing done");
    }


    /**
     * Used to close all Services, that should support AutoCloseable Pattern
     *
     * @param toClose
     * @throws Exception
     */
    private void close(AutoCloseable... toCloseList) throws Exception {
        for (AutoCloseable element : toCloseList) {
            if (element != null) {
                element.close();
            }
        }
    }

    /**
     * For each mounted device a mountpoint is created and this listener is called.
     *
     */
    @Override
    public void startListenerOnNodeForConnectedState(Action action, NodeId nNodeId, NetconfNode nNode) {

        String mountPointNodeName = nNodeId.getValue();
        LOG.info("Starting Event listener on Netconf for mountpoint {} Action {}", mountPointNodeName, action);

        boolean preConditionMissing = false;
        if (mountPointService == null) {
            preConditionMissing = true;
            LOG.warn("No mountservice available.");
        }
        if (!initialized) {
            preConditionMissing = true;
            LOG.warn("Devicemanager initialization still pending.");
        }
        if (preConditionMissing) {
            return;
        }

        if (networkElementRepresentations.containsKey(mountPointNodeName)) {
            LOG.warn("Mountpoint {} already registered. Leave startup procedure.", mountPointNodeName);
            return;
        }

        if (! isMaster(nNode) ) {
            //Change Devicemonitor-status to connected ... for non master mountpoints.
            deviceMonitor.deviceConnectSlaveIndication(mountPointNodeName);
            return;
        }

        synchronized (networkElementRepresentations) {

            InstanceIdentifier<Node> instanceIdentifier = NETCONF_TOPO_IID.child(Node.class,
                    new NodeKey(new NodeId(mountPointNodeName)));

            Optional<MountPoint> optionalMountPoint = null;
            int timeout = 10000;
            while (!(optionalMountPoint = mountPointService.getMountPoint(instanceIdentifier)).isPresent() && timeout > 0) {

                LOG.info("Event listener waiting for mount point for Netconf device :: Name : {}", mountPointNodeName);
                try {
                    Thread.sleep(1000);
                    timeout -= 1000;
                } catch (InterruptedException e) {
                    LOG.info("Event listener waiting for mount point for Netconf device :: Name : {} Time: {}",
                            mountPointNodeName, timeout);
                }
            }

            if (!optionalMountPoint.isPresent()) {
                LOG.warn("Event listener timeout while waiting for mount point for Netconf device :: Name : {} ",
                        mountPointNodeName);
                return;
            }
            // Mountpoint is present for sure
            MountPoint mountPoint = optionalMountPoint.get();

            DataBroker netconfNodeDataBroker = mountPoint.getService(DataBroker.class).orNull();
            if (netconfNodeDataBroker == null) {
                LOG.info("Mountpoint is slave mountpoint {}", mountPointNodeName);
                return;
            }

            LOG.info("Databroker service 1:{} 2:{}", dataBroker.hashCode(), netconfNodeDataBroker.hashCode());
            // getNodeInfoTest(dataBroker);

            //create automatic empty maintenance entry into db before reading and listening for problems
            this.maintenanceService.createIfNotExists(mountPointNodeName);

            // Setup microwaveEventListener for Notificationservice

            // MicrowaveEventListener microwaveEventListener = new
            // MicrowaveEventListener(mountPointNodeName, websocketmanagerService,
            // xmlMapper, databaseClientEvents);
            ONFCoreNetworkElementRepresentation ne = ONFCoreNetworkElementFactory.create(mountPointNodeName, dataBroker,
                    webSocketService, databaseClientEvents, instanceIdentifier, netconfNodeDataBroker, dcaeProviderClient,
                    aotsMProvider,maintenanceService,notificationDelayService);
            networkElementRepresentations.put(mountPointNodeName, ne);
            ne.doRegisterMicrowaveEventListener(mountPoint);

            // Register netconf stream
            registerNotificationStream(mountPointNodeName, mountPoint, "NETCONF");

            // -- Read data from NE
            ne.initialReadFromNetworkElement();
            ne.initSynchronizationExtension();

            // Setup Service that monitors registration/ deregistration of session
            odlEventListener.registration(mountPointNodeName);

            if (aaiProviderClient != null) {
                aaiProviderClient.onDeviceRegistered(mountPointNodeName);
            }
            // -- Register NE to performance manager
            if (performanceManager != null) {
                performanceManager.registration(mountPointNodeName, ne);
            }

            deviceMonitor.deviceConnectMasterIndication(mountPointNodeName, ne);

            LOG.info("Starting Event listener on Netconf device :: Name : {} finished", mountPointNodeName);
        }
    }

    // removeListenerOnNode
    @Override
    public void leaveConnectedState(NodeId nNodeId, NetconfNode nNode) {
        String mountPointNodeName = nNodeId.getValue();
        LOG.info("leaveConnectedState for device :: Name : {}", mountPointNodeName);

        this.maintenanceService.deleteIfNotRequired(mountPointNodeName);
        ONFCoreNetworkElementRepresentation ne = networkElementRepresentations.remove(mountPointNodeName);
        if (ne != null) {
            int problems = ne.removeAllCurrentProblemsOfNode();
            LOG.debug("Removed all {} problems from database at deregistration for {}", problems, mountPointNodeName);
            if (odlEventListener != null) {
                odlEventListener.deRegistration(mountPointNodeName);
            }
            if (performanceManager != null) {
                performanceManager.deRegistration(mountPointNodeName);
            }
            if (aaiProviderClient != null) {
                aaiProviderClient.onDeviceUnregistered(mountPointNodeName);
            }
        } else {
            LOG.info("No related ne object for mountpoint {} to deregister .", mountPointNodeName);
        }
        if (deviceMonitor != null) {
            deviceMonitor.deviceDisconnectIndication(mountPointNodeName);
        }

    }

    /*
    @Override
    public void mountpointNodeCreation(NodeId nNodeId, NetconfNode nNode) {
        String mountPointNodeName = nNodeId.getValue();
        LOG.info("mountpointNodeCreation {} {}", nNodeId.getValue(), nNode.getConnectionStatus());
        deviceMonitor.createMountpointIndication(mountPointNodeName);
    }
    */
    @Override
    public void mountpointNodeRemoved(NodeId nNodeId) {
        String mountPointNodeName = nNodeId.getValue();
        LOG.info("mountpointNodeRemoved {}", nNodeId.getValue());
        deviceMonitor.removeMountpointIndication(mountPointNodeName);
    }

    /**
     * Async RPC Interface implementation
     */
    @Override
    public @Nonnull List<String> doClearCurrentFaultByNodename(@Nullable List<String> nodeNamesInput) throws IllegalStateException {

        if (this.databaseClientEvents == null) {
            throw new IllegalStateException("dbEvents service not instantiated");
        }

        if (threadDoClearCurrentFaultByNodename != null && threadDoClearCurrentFaultByNodename.isAlive()) {
            throw new IllegalStateException("A clear task is already active");
        } else {

            // Create list of mountpoints if input is empty, using the content in ES
            if (nodeNamesInput == null || nodeNamesInput.size() <= 0) {
                nodeNamesInput = this.databaseClientEvents.getAllNodesWithCurrentAlarms();
            }

            // Filter all mountpoints from input that were found and are known to this Cluster-node instance of DeviceManager
            final List<String> nodeNamesHandled = new ArrayList<>();
            for (String mountpointName : nodeNamesInput) {
                LOG.info("Work with mountpoint {}", mountpointName);

                if (odlEventListener != null && mountpointName.equals(odlEventListener.getOwnKeyName())) {

                    // SDN Controller related alarms
                    //  -- can not be recreated on all nodes in connected state
                    //  -- would result in a DCAE/AAI Notification
                    // Conclusion for 1810 Delivery ... not covered by RPC function (See issue #43)
                    LOG.info("Ignore SDN Controller related alarms for {}", mountpointName);
                    //this.databaseClientEvents.clearFaultsCurrentOfNode(mountpointName);
                    //nodeNamesHandled.add(mountpointName);

                } else {

                    if (mountPointService != null) {
                        InstanceIdentifier<Node> instanceIdentifier = NETCONF_TOPO_IID.child(Node.class,
                                new NodeKey(new NodeId(mountpointName)));
                        Optional<MountPoint> optionalMountPoint = mountPointService.getMountPoint(instanceIdentifier);

                        if (! optionalMountPoint.isPresent()) {
                            LOG.info("Remove Alarms for unknown mountpoint {}", mountpointName);
                            this.databaseClientEvents.clearFaultsCurrentOfNode(mountpointName);
                            nodeNamesHandled.add(mountpointName);
                        } else {
                            if (networkElementRepresentations.containsKey(mountpointName)) {
                                LOG.info("At node known mountpoint {}", mountpointName);
                                nodeNamesHandled.add(mountpointName);
                            } else {
                                LOG.info("At node unknown mountpoint {}", mountpointName);
                            }
                        }
                    }
                }
            }

            // Force a sync
            if (this.deviceMonitor != null) {
                this.deviceMonitor.refreshAlarmsInDb();
            }

            threadDoClearCurrentFaultByNodename = new Thread(() -> {
                refreshCounter++;
                LOG.info("Start refresh mountpoint task {}", refreshCounter);
                //    for(String nodeName:nodeNamesOutput) {
                for(String nodeName:nodeNamesHandled) {
                    ONFCoreNetworkElementRepresentation ne = networkElementRepresentations.get(nodeName);
                    if(ne!=null) {
                        LOG.info("Refresh mountpoint {}", nodeName);
                        ne.initialReadFromNetworkElement();
                    } else {
                        LOG.info("Unhandled mountpoint {}",nodeName);
                    }
                }
                LOG.info("End refresh mountpoint task {}", refreshCounter);
            });
            threadDoClearCurrentFaultByNodename.start();
            return nodeNamesHandled;
        }
    };

    /**
     * Get initialization status of database.
     * @return true if fully initialized false if not
     */
    public boolean getInitialized() {
        return htDatabase == null ? false : htDatabase.getInitialized();
    }

    /*---------------------------------------------------------------------
     * Private funtions
     */

    /**
     * Do the stream creation for the device.
     *
     * @param mountPointNodeName
     * @param mountPoint
     */
    private void registerNotificationStream(String mountPointNodeName, MountPoint mountPoint, String streamName) {

        final Optional<RpcConsumerRegistry> optionalRpcConsumerService = mountPoint
                .getService(RpcConsumerRegistry.class);
        if (optionalRpcConsumerService.isPresent()) {
            final RpcConsumerRegistry rpcConsumerRegitry = optionalRpcConsumerService.get();
            final NotificationsService rpcService = rpcConsumerRegitry.getRpcService(NotificationsService.class);
            if (rpcService == null) {
                LOG.warn("rpcService is null for mountpoint {}", mountPointNodeName);
            } else {
                final CreateSubscriptionInputBuilder createSubscriptionInputBuilder = new CreateSubscriptionInputBuilder();
                createSubscriptionInputBuilder.setStream(new StreamNameType(streamName));
                LOG.info("Event listener triggering notification stream {} for node {}", streamName, mountPointNodeName);
                try {
                    CreateSubscriptionInput createSubscriptionInput = createSubscriptionInputBuilder.build();
                    if (createSubscriptionInput == null) {
                        LOG.warn("createSubscriptionInput is null for mountpoint {}", mountPointNodeName);
                    } else {
                        rpcService.createSubscription(createSubscriptionInput);
                    }
                } catch (NullPointerException e) {
                    LOG.warn("createSubscription failed");
                }
            }
        } else {
            LOG.warn("No RpcConsumerRegistry avaialble.");
        }

    }

    /**
     * Get NE object
     * @param mountpoint mount point name
     * @return null or NE specific data
     */
    public @Nullable ONFCoreNetworkElementRepresentation getNeByMountpoint( String mountpoint ) {

        return networkElementRepresentations.get(mountpoint);

    }

    /* -- LOG related functions -- */


    private boolean isInClusterMode() {
        return this.akkaConfig==null?false:this.akkaConfig.isCluster();
    }

    private String getClusterNetconfNodeName() {
        return this.akkaConfig==null?"":this.akkaConfig.getClusterConfig().getClusterSeedNodeName("abc");
    }

    private boolean isMaster(NetconfNode nnode)
    {
        if(isInClusterMode())
        {
            LOG.debug("check if me is responsible for node");
            String masterNodeName = nnode.getClusteredConnectionStatus()==null?"null":nnode.getClusteredConnectionStatus().getNetconfMasterNode();
            /*List<NodeStatus> clusterNodeStatusList=nnode.getClusteredConnectionStatus()==null?null:nnode.getClusteredConnectionStatus().getNodeStatus();
            if(clusterNodeStatusList!=null)
            {
                for(NodeStatus s: clusterNodeStatusList)
                    LOG.debug("node "+s.getNode()+ " with status "+(s.getStatus()==null?"null":s.getStatus().getName()));
            }
            */
            String myNodeName=getClusterNetconfNodeName();
            LOG.debug("sdnMasterNode="+masterNodeName+" and sdnMyNode="+myNodeName);
            if(!masterNodeName.equals(myNodeName))
            {
                LOG.debug("netconf change but me is not master for this node");
                return false;
            }
        }
        return true;
    }

}
