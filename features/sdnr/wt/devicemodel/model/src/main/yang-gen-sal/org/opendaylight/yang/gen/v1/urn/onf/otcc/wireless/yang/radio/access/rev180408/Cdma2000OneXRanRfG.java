package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to RF configuration of the FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-rf-g {
 *     leaf-list rfcnfl {
 *         type string;
 *     }
 *     leaf rfcnfl-band-in-use {
 *         type string;
 *     }
 *     leaf rfcnfl-in-use {
 *         type uint64;
 *     }
 *     leaf-list pilot-pn {
 *         type string;
 *     }
 *     leaf pilot-pn-in-use {
 *         type pilot-pn-in-use;
 *     }
 *     leaf maxfap-tx-power {
 *         type string;
 *     }
 *     leaf maxfap-tx-power-in-use {
 *         type maxfap-tx-power-in-use;
 *     }
 *     leaf pch-pwr-percentage {
 *         type pch-pwr-percentage;
 *     }
 *     leaf pilot-pwr-percentage {
 *         type pilot-pwr-percentage;
 *     }
 *     leaf sync-pwr-percentage {
 *         type sync-pwr-percentage;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-rf-g</i>
 *
 */
public interface Cdma2000OneXRanRfG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-rf-g").intern();

    /**
     * {{list}} Each item is a pair of 2-digit Band class number (as defined in 
     * {{bibref|3GPP2-C.S0057}}) followed by 4-digit FL Radio Frequency Channel Number 
     * (RFCN). Self-configuration for RFCN is controlled by 
     * {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}}. If the 
     * FAP's self-configuration capability for RFCN is available and enabled, this 
     * parameter MAY contain more than one item and the FAP is expected to select one 
     * from the list for RFCNFLInUse. If the self-configuration capability is not 
     * available or not enabled, then this parameter SHOULD contain only a single item.
     * An example value is "010001, 030500". If multiple items are specified, they are 
     * done in the order of preference.
     *
     *
     *
     * @return <code>java.util.List</code> <code>rfcnfl</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getRfcnfl();
    
    /**
     * The FL Band being used by the FAP. Self-configuration for Band and RFCN is 
     * controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.RFCNFLConfig}} from
     * an availability perspective and 
     * {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}} from an 
     * enabled perspective. If the self-configuration capability is available and 
     * enabled, this parameter indicates the value selected by the FAP among the 
     * choices provided in RFCNFL. If the self-configuration capability is not 
     * available or not enabled, then this parameter contains the first band class 
     * value in RFCNFL.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>rfcnflBandInUse</code>, or <code>null</code> if not present
     */
    java.lang.String getRfcnflBandInUse();
    
    /**
     * The FL RFCN being used by the FAP. Self-configuration for RFCN is controlled by 
     * {{param|.Capabilities.CDMA2000.OneX.SelfConfig.RFCNFLConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}} from an 
     * enabled perspective. If the self-configuration capability is available and 
     * enabled, this parameter indicates the value selected by the FAP among the 
     * choices provided in RFCNFL. If the self-configuration capability is not 
     * available or not enabled, then this parameter contains the first RFCN value in 
     * RFCNFL.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rfcnflInUse</code>, or <code>null</code> if not present
     */
    BigInteger getRfcnflInUse();
    
    /**
     * {{list}} Each item is a pilot PN offset in units of 64 PN chips. 
     * Self-configuration for pilot PN is controlled by 
     * {{param|.Capabilities.CDMA2000.OneX.SelfConfig.PilotPNConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.OneX.SelfConfig.PilotPNSelfConfigEnable}} from an 
     * enabled perspective. If the FAP's self-configuration capability for Pilot PN 
     * Offset is available and enabled, this parameter MAY contain more than one item 
     * and the FAP is expected to select one from the list for PilotPNInUse. If the 
     * self-configuration capability is not available or not enabled, then this 
     * parameter SHOULD contain only a single item. The multiplicity of the PN offset 
     * values can also be expressed by defining a range using ".." (two periods) 
     * between two values. In this case, the combination of two values defines the 
     * lower-bound and upper-bound of the range inclusive. The order of the items has 
     * no significance.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pilotPn</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getPilotPn();
    
    /**
     * The Pilot PN Offset being used by the FAP in {{units}}. Self-configuration for 
     * Pilot PN Offset is controlled by 
     * {{param|.Capabilities.CDMA2000.OneX.SelfConfig.PilotPNConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.OneX.SelfConfig.PilotPNSelfConfigEnable}} from an 
     * enabled perspective. If the self-configuration capability is available and 
     * enabled, this parameter indicates the value selected by the FAP among the 
     * choices provided in PilotPN. If the self-configuration capability is not 
     * available or not enabled, then this parameter contains the first value in 
     * PilotPN.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>pilotPnInUse</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPilotPnInUse();
    
    /**
     * Defines the maximum transmission power allowed on the FAP. MaxFAPTxPower is 
     * expressed as a range of allowed maximum power levels with ".." (two periods) 
     * between the upper and lower values, i.e. 
     * "&amp;lt;Pmax_low&amp;gt;;..&amp;lt;Pmax_high&amp;gt;;". {{param}} identifies 
     * the limits between which the FAP can self-configure its maximum transmit power. 
     * Self-configuration for maximum transmission power is controlled by 
     * {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} 
     * from an enabled perspective. &amp;lt;Pmax_low&amp;gt;; and 
     * &amp;lt;Pmax_high&amp;gt;; are measured in dBm and have a range of -40.0 to 20.0
     * incremented by 0.1 dB.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>maxfapTxPower</code>, or <code>null</code> if not present
     */
    java.lang.String getMaxfapTxPower();
    
    /**
     * The maximum transmission power measured in {{units}} currently used by the FAP. 
     * Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in 
     * steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of
     * the maximum transmission power. Self-configuration for maximum transmission 
     * power is controlled by 
     * {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} 
     * from an enabled perspective. If the self-configuration capability is available 
     * and enabled, this parameter indicates the value selected by the FAP among the 
     * range provided in {{param|MaxFAPTxPower}}. If the self-configuration capability 
     * is not available or not enabled, then this parameter contains a value selected 
     * by the ACS.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxfapTxPowerInUse</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxfapTxPowerInUse();
    
    /**
     * Percentage of Max Sector Power Used By Paging Channel (expressed in {{units}}). 
     * For example, 93333 means 93.333% of the max sector power.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pchPwrPercentage</code>, or <code>null</code> if not present
     */
    java.lang.Long getPchPwrPercentage();
    
    /**
     * Percentage of Max Sector Power Used By Pilot Channel (expressed in {{units}}). 
     * For example, 19950 means 19.95% of total.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pilotPwrPercentage</code>, or <code>null</code> if not present
     */
    java.lang.Long getPilotPwrPercentage();
    
    /**
     * Percentage of Max Sector Power Used By Sync Channel (expressed in {{units}}). 
     * For example, 23458 means 23.4% of the max sector power.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>syncPwrPercentage</code>, or <code>null</code> if not present
     */
    java.lang.Long getSyncPwrPercentage();

}

