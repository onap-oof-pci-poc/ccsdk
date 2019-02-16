/*******************************************************************************
 * ============LICENSE_START========================================================================
 * ONAP : ccsdk feature sdnr wt
 * =================================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * =================================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * ============LICENSE_END==========================================================================
 ******************************************************************************/
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.AkkaConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.GeoConfig;

public class ClusterConfigTest {

	public static void main(String[] args)
	{
		final String geoconf="/home/herbert/Nextcloud/captured-karaf-logs/geo.conf";
		final String akkconf="/home/herbert/Nextcloud/captured-karaf-logs/akka.conf";
		final String devmgrprop="";


		try {
			GeoConfig geo = geoconf==null?null:GeoConfig.load(geoconf);
			AkkaConfig akkaConfig = AkkaConfig.load(akkconf);
			//HtDevicemanagerConfiguration config = HtDevicemanagerConfiguration.getTestConfiguration(devmgrprop);
			String hostName = "0.0.0.0";
		hostName=akkaConfig.getClusterConfig().getHostName(hostName);
		String clusterDBName=akkaConfig.getClusterConfig().getDBClusterName(null);
		String nodeName=String.format("node%d.%s",akkaConfig.getClusterConfig().getRoleMemberIndex(),clusterDBName);

		System.out.println("hostname="+hostName);
		System.out.println("clusterdbName="+clusterDBName);
		System.out.println("nodename="+nodeName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
