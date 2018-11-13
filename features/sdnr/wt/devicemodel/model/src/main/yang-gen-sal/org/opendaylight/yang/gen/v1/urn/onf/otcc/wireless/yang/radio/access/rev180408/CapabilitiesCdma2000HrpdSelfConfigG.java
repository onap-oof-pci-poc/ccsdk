package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the self-configuration capability 
 * attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping capabilities-cdma2000-hrpd-self-config-g {
 *     leaf rfcnfl-config {
 *         type boolean;
 *     }
 *     leaf pilot-pn-config {
 *         type boolean;
 *     }
 *     leaf maxfap-tx-power-config {
 *         type boolean;
 *     }
 *     leaf maxfap-beacon-tx-power-config {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/capabilities-cdma2000-hrpd-self-config-g</i>
 *
 */
public interface CapabilitiesCdma2000HrpdSelfConfigG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-cdma2000-hrpd-self-config-g").intern();

    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the Radio Frequency Channel Number. If {{true}} multiple values MAY be
     * provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}} for the FAP to 
     * select from. If {{false}} only a single value SHOULD be provided in 
     * {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>rfcnflConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isRfcnflConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the pilot PN offset. If {{true}} multiple values or a range of values 
     * MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}} for the 
     * FAP to select from. If {{false}} only a single value SHOULD be provided in 
     * {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>pilotPnConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPilotPnConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the Maximum FAP Transmit Power. If {{true}} a range of values MAY be 
     * provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}} for the FAP
     * to select from. If {{false}} only a single value SHOULD be provided in 
     * {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>maxfapTxPowerConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMaxfapTxPowerConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the Maximum FAP Beacon Transmit Power. If {{true}} a range of values 
     * MAY be provided in {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}} for
     * the FAP to select from. If {{false}} only a single value SHOULD be provided in 
     * {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>maxfapBeaconTxPowerConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMaxfapBeaconTxPowerConfig();

}

