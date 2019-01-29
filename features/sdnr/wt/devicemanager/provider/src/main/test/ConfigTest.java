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
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.AaiConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.DcaeConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.EsConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.HtDevicemanagerConfiguration;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.PmConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.ToggleAlarmConfig;

public class ConfigTest {

    public static void main(String[] args)
    {
            HtDevicemanagerConfiguration config;
            DcaeConfig c;
            EsConfig c3;
            AaiConfig c4;
            PmConfig c5;
            ToggleAlarmConfig c6;
            /*config= = HtDevicemanagerConfiguration.getTestConfiguration();
            c=config.getDcae();
            c2=AotsMConfig.getAots(config);
            c3=config.getEs();
            c4= config.getAai();
            c5 = config.getPm();
            System.out.println(c.toString());
            System.out.println(c2.toString());
            System.out.println(c3.toString());
            System.out.println(c4.toString());
            System.out.println(c5.toString());
            IConfigChangedListener listener = new IConfigChangedListener() {

                @Override
                public void onConfigChanged() {
                    System.out.println("sth changed");
                    AaiConfig c=AaiConfig.reload();
                    System.out.println(c.toString());
                }
            };
            System.out.println("start listening for changes");

            config.registerConfigChangedListener(listener );
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            config.unregisterConfigChangedListener(listener);
            System.out.println("finished");
            */
            HtDevicemanagerConfiguration.clear();
            config = HtDevicemanagerConfiguration.getTestConfiguration("/home/herbert/tmp/devicemanager.properties");
            c=config.getDcae();
            c3=config.getEs();
            c4 = config.getAai();
            c5 = config.getPm();
            c6 = config.getToggleAlarm();
            System.out.println(c.toString());
            System.out.println(c3.toString());
            System.out.println(c4.toString());
            System.out.println(c5.toString());
            System.out.println(c6.toString());


    }
}
