package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the controlling of 
 * self-configuration capabilities in the FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-cdma2000-hrpd-self-config-g {
 *     leaf rfcnfl-self-config-enable {
 *         type boolean;
 *     }
 *     leaf pilot-pn-self-config-enable {
 *         type boolean;
 *     }
 *     leaf maxfap-tx-power-self-config-enable {
 *         type boolean;
 *     }
 *     leaf max-hrpd-beacon-tx-power-self-config-enable {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-cdma2000-hrpd-self-config-g</i>
 *
 */
public interface FapControlCdma2000HrpdSelfConfigG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-hrpd-self-config-g").intern();

    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the values of {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}}. If 
     * {{true}}, the FAP self-configures the value. If {{false}}, the ACS must provide 
     * the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>rfcnflSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isRfcnflSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the value of {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}}. If 
     * {{true}}, the FAP self-configures the value. If {{false}}, the ACS must provide 
     * the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>pilotPnSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPilotPnSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the value of {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}} 
     * . If {{true}}, the FAP self-configures the value. If {{false}}, the ACS must 
     * provide the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>maxfapTxPowerSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMaxfapTxPowerSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the value of 
     * {{param|.CellConfig.CDMA2000.Beacon.MaxHRPDBeaconTxPower}}. If {{true}} the FAP 
     * self-configures the value. If {{false}} The ACS must provide the specific value 
     * to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>maxHrpdBeaconTxPowerSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMaxHrpdBeaconTxPowerSelfConfigEnable();

}

