/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.wtmanager;

import java.util.concurrent.Future;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ClearCurrentFaultByNodenameInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ClearCurrentFaultByNodenameOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetMaintenanceModeOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetRequiredNetworkElementKeysOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GreetingInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GreetingOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.SetMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.SetMaintenanceModeOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ShowRequiredNetworkElementInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ShowRequiredNetworkElementOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.TestMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.TestMaintenanceModeOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.WtmanagerService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * @author herbert
 *
 */
public class WtmanagerRpcService implements WtmanagerService {

    @Override
    public Future<RpcResult<TestMaintenanceModeOutput>> testMaintenanceMode(TestMaintenanceModeInput input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Future<RpcResult<GetMaintenanceModeOutput>> getMaintenanceMode(GetMaintenanceModeInput input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Future<RpcResult<SetMaintenanceModeOutput>> setMaintenanceMode(SetMaintenanceModeInput input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Future<RpcResult<ClearCurrentFaultByNodenameOutput>> clearCurrentFaultByNodename(
            ClearCurrentFaultByNodenameInput input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Future<RpcResult<ShowRequiredNetworkElementOutput>> showRequiredNetworkElement(
            ShowRequiredNetworkElementInput input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Future<RpcResult<GetRequiredNetworkElementKeysOutput>> getRequiredNetworkElementKeys() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Future<RpcResult<GreetingOutput>> greeting(GreetingInput input) {
        // TODO Auto-generated method stub
        return null;
    }


}
