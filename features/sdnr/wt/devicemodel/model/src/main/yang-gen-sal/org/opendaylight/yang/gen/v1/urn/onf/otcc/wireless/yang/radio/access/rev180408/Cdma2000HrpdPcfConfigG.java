package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * CDMA2000 HRPD PCF configuration parameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-pcf-config-g {
 *     leaf pcfpdsn-health-monitor-interval {
 *         type pcfpdsn-health-monitor-interval;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-pcf-config-g</i>
 *
 */
public interface Cdma2000HrpdPcfConfigG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-pcf-config-g").intern();

    /**
     * PDSN health check monitor interval in {{units}}. Setting the value to 0 disables
     * the PDSN Health Monitoring Feature. Setting any non-zero value enables the PDSN 
     * Health Monitoring Feature and sets that non-zero value as the timer interval.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pcfpdsnHealthMonitorInterval</code>, or <code>null</code> if not present
     */
    java.lang.Short getPcfpdsnHealthMonitorInterval();

}

