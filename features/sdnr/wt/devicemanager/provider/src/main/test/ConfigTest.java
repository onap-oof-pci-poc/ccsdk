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
