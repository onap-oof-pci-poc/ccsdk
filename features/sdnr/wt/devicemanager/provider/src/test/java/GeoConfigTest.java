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
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.GeoConfig;

public class GeoConfigTest {


	private static String getClusterGeoConfigContent()
	{
return "\n" +
		"lumina-geo-cluster {\n" +
		"    primary_roles = [\n" +
		"	\"member-1\",\"member-2\",\"member-3\"\n" +
		"    ]\n" +
		"    secondary_roles = [\n" +
		"	\"member-4\",\"member-5\",\"member-6\"\n" +
		"    ]\n" +
		"    ip_roles_table = [\n" +
		"\n" +
		"	{\n" +
		"role=\"member-1\"\n" +
		"ip=\"zltcmtn23arbc01.2f0377.mtn23a.tci.att.com\"\n" +
		"},\n" +
		"{\n" +
		"role=\"member-2\"\n" +
		"ip=\"zltcmtn23arbc02.2f0377.mtn23a.tci.att.com\"\n" +
		"},\n" +
		"{\n" +
		"role=\"member-3\"\n" +
		"ip=\"zltcmtn23arbc03.2f0377.mtn23a.tci.att.com\"\n" +
		"},\n" +
		"{\n" +
		"role=\"member-4\"\n" +
		"ip=\"zltcmtn23brbc01.f84e7a.mtn23b.tci.att.com\"\n" +
		"},\n" +
		"{\n" +
		"role=\"member-5\"\n" +
		"ip=\"zltcmtn23brbc02.f84e7a.mtn23b.tci.att.com\"\n" +
		"},\n" +
		"{\n" +
		"role=\"member-6\"\n" +
		"ip=\"zltcmtn23brbc03.f84e7a.mtn23b.tci.att.com\"\n" +
		"}\n" +
		"    \n" +
		"	]\n" +
		"}\n" +
		"\n" +
		"\n" +
		"\n" +
		"\n" +
		"";
	}
	public static void main(String[] args)
	{
		GeoConfig config;
		try {
			System.out.println("testing clusternode geo config1");
			System.out.println("===========================");
			config = GeoConfig.parse(getClusterGeoConfigContent());
			System.out.println("succeeded: ");
			System.out.println(config.toString());
			System.out.println("primary roles:");
			System.out.println(config.getPrimaryRoles().toString());
			System.out.println("secondary roles:");
			System.out.println(config.getSecondaryRoles().toString());

		} catch (Exception e) {
			System.out.println("failed: "+e.getMessage());
		}
		try {
			System.out.println("testing clusternode geo config1");
			System.out.println("===========================");
			config = GeoConfig.load("/home/herbert/Nextcloud/captured-karaf-logs/geo.conf");
			System.out.println("succeeded: ");
			System.out.println(config.toString());
			System.out.println("primary roles:");
			System.out.println(config.getPrimaryRoles().toString());
			System.out.println("secondary roles:");
			System.out.println(config.getSecondaryRoles().toString());

		} catch (Exception e) {
			System.out.println("failed: "+e.getMessage());
		}
	}
}
