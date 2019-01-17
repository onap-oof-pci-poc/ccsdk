/*-
 * ============LICENSE_START=======================================================
 * openECOMP : SDN-C
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights
 *             reserved.
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
 */

package org.onap.ccsdk.features.sdnr.wt.wtmanager;

import javax.annotation.Nullable;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.DeviceManagerImpl;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.MountPointService;
import org.opendaylight.controller.md.sal.binding.api.NotificationPublishService;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.WtmanagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Defines a base implementation for your provider. This class extends from a helper class
 * which provides storage for the most commonly used components of the MD-SAL. Additionally the
 * base class provides some basic logging and initialization / clean up methods.
 *
 */
public class WtmanagerProvider implements AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(WtmanagerProvider.class);

    private static final String APPLICATION_NAME = "wtmanager";

    protected @Nullable DataBroker dataBroker=null;
    protected NotificationPublishService notificationPublishService=null;
    protected RpcProviderRegistry rpcProviderRegistry=null;
    protected MountPointService mountPointService=null;

    protected BindingAwareBroker.RpcRegistration<WtmanagerService> rpcRegistration=null;

    private final WtmanagerRpcService wtmanagerRpcService;
    private DeviceManagerImpl deviceManager = null;

    //Blueprint 1
    public WtmanagerProvider() {
        this.wtmanagerRpcService = new WtmanagerRpcService();
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

    //Blueprint 2
    public WtmanagerProvider(final DataBroker dataBroker,
            final NotificationPublishService notificationPublishService,
            final RpcProviderRegistry rpcProviderRegistry,
            final MountPointService mountpointService) {
        this();
        LOG.info( "Creating provider for {}", APPLICATION_NAME);

        check(DataBroker.class, dataBroker);
        check(NotificationPublishService.class, notificationPublishService);
        check(RpcProviderRegistry.class, rpcProviderRegistry);
        check(MountPointService.class, mountpointService);

        this.dataBroker = dataBroker;
        this.notificationPublishService = notificationPublishService;
        this.rpcProviderRegistry = rpcProviderRegistry;
        this.mountPointService = mountpointService;

        init();
    }

    public void init(){
        LOG.info( "Initializing provider for {}", APPLICATION_NAME);
        rpcRegistration = rpcProviderRegistry.addRpcImplementation(WtmanagerService.class, wtmanagerRpcService);

        LOG.info( "Starting devicemanager");
        deviceManager = new DeviceManagerImpl(dataBroker, rpcProviderRegistry, notificationPublishService);
        LOG.info( "Initializing devicemanager");
        deviceManager.initialize();

        LOG.info( "Initialization complete for {}", APPLICATION_NAME);
    }

    @Override
    public void close() throws Exception {
        LOG.info( "Closing provider for {}", APPLICATION_NAME);
        rpcRegistration.close();
        if (deviceManager != null) {
            deviceManager.close();
        }
        LOG.info( "Successfully closed provider for {}", APPLICATION_NAME);
    }

    private <T> void check(Class<T> clazz, T object) {
        if (object == null) {
            LOG.info("Parameter {} is null", clazz.getSimpleName());
        }
    };

}
