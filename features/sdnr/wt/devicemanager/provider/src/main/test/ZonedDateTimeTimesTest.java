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
import java.time.ZonedDateTime;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.database.types.EsMaintenanceFilter;

public class ZonedDateTimeTimesTest {

	public static void main(String[] args) {


		EsMaintenanceFilter fi = new EsMaintenanceFilter();

		System.out.println("Default 1: "+fi);


		fi.setEndAsString("2018-01-01T10:00:00+05:00");

		System.out.println("Default 2: "+fi);

		System.out.println("As String: "+fi.getEndAsString());


		ZonedDateTime start = ZonedDateTime.parse("2018-01-01T10:00:00+05:00");
		ZonedDateTime end = ZonedDateTime.parse("2019-01-01T10:00:00+05:00");
		ZonedDateTime now;

		now = ZonedDateTime.parse("2017-05-01T10:00:00+05:00");
		System.out.println("Vor: "+EsMaintenanceFilter.isInPeriod(start, end, now));

		now = ZonedDateTime.parse("2018-05-01T10:00:00+05:00");
		System.out.println("in: "+EsMaintenanceFilter.isInPeriod(start, end, now));

		now = ZonedDateTime.parse("2019-05-01T10:00:00+05:00");
		System.out.println("nach: "+EsMaintenanceFilter.isInPeriod(start, end, now));

	}


}
