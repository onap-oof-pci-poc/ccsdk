package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.mock;

import org.opendaylight.mdsal.singleton.common.api.ClusterSingletonService;
import org.opendaylight.mdsal.singleton.common.api.ClusterSingletonServiceProvider;
import org.opendaylight.mdsal.singleton.common.api.ClusterSingletonServiceRegistration;

public class ClusterSingletonServiceProviderMock implements ClusterSingletonServiceProvider {

	@Override
	public void close() throws Exception {
	
	}

	@Override
	public ClusterSingletonServiceRegistration registerClusterSingletonService(ClusterSingletonService service) {
		return null;
	}

}
