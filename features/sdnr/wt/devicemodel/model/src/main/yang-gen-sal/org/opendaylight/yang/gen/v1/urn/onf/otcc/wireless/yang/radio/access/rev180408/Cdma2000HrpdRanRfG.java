package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * Contains the details related to HRPD RF
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-ran-rf-g {
 *     leaf hrpd-car-band-class {
 *         type uint8;
 *     }
 *     leaf-list rfcnfl {
 *         type string;
 *     }
 *     leaf rfcnfl-in-use {
 *         type uint64;
 *     }
 *     leaf-list pilot-pn {
 *         type string;
 *     }
 *     leaf pilot-pn-in-use {
 *         type uint64;
 *     }
 *     leaf maxfap-tx-power {
 *         type string;
 *     }
 *     leaf maxfap-tx-power-in-use {
 *         type maxfap-tx-power-in-use;
 *     }
 *     leaf control-channel-rate {
 *         type int64;
 *     }
 *     leaf sync-capsule-offset {
 *         type int64;
 *     }
 *     leaf rab-length {
 *         type int64;
 *     }
 *     leaf rab-offset {
 *         type int64;
 *     }
 *     leaf sector-id {
 *         type binary;
 *     }
 *     leaf color-code {
 *         type int64;
 *     }
 *     leaf subnet-mask-length {
 *         type subnet-mask-length;
 *     }
 *     leaf hrpd-sec-el-reverse-link-silence-duration {
 *         type hrpd-sec-el-reverse-link-silence-duration;
 *     }
 *     leaf hrpd-sec-el-reverse-link-silence-period {
 *         type hrpd-sec-el-reverse-link-silence-period;
 *     }
 *     leaf open-loop-adjust {
 *         type open-loop-adjust;
 *     }
 *     leaf probe-initial-adjust {
 *         type probe-initial-adjust;
 *     }
 *     leaf probe-num-steps {
 *         type int64;
 *     }
 *     leaf probe-power-step {
 *         type probe-power-step;
 *     }
 *     leaf a-persistence {
 *         type string;
 *     }
 *     leaf rssirab-threshold {
 *         type rssirab-threshold;
 *     }
 *     leaf load-rab-threshold {
 *         type load-rab-threshold;
 *     }
 *     leaf connection-rate-limit {
 *         type uint8;
 *     }
 *     leaf rfe-rl-balance-ratio {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-ran-rf-g</i>
 *
 */
public interface Cdma2000HrpdRanRfG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-ran-rf-g").intern();

    /**
     * The Band Class this HRPD Carrier object is to operate on. Reference - 
     * {{bibref|3GPP2-C.S0057}}, Band Class Specification for CDMA2000 Spread Spectrum 
     * Systems.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hrpdCarBandClass</code>, or <code>null</code> if not present
     */
    java.lang.Short getHrpdCarBandClass();
    
    /**
     * {{list}} Each item is a FL Radio Frequency Channel Number (RFCN). 
     * Self-configuration for RFCNFL is controlled by 
     * {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.RFCNFLConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.RFCNFLSelfConfigEnable}} from an 
     * enabled perspective. If the FAP's self-configuration capability for RFCNFL is 
     * available and enabled, this parameter MAY contain more than one item and the FAP
     * is expected to select one from the list for {{param|RFCNFLInUse}}. If the 
     * self-configuration capability is not available or not enabled, then this 
     * parameter SHOULD contain only a single item. If multiple items are specified, 
     * they are done in the order of preference.
     *
     *
     *
     * @return <code>java.util.List</code> <code>rfcnfl</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getRfcnfl();
    
    /**
     * The FL RFCN being used by the FAP. Self-configuration for RFCNFL is controlled 
     * by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.RFCNFLConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.RFCNFLSelfConfigEnable}} from an 
     * enabled perspective. If the self-configuration capability is available and 
     * enabled, this parameter indicates the value selected by the FAP among the 
     * choices provided in {{param|RFCNFL}}. If the self-configuration capability is 
     * not available or not enabled, then this parameter contains the first value in 
     * {{param|RFCNFL}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rfcnflInUse</code>, or <code>null</code> if not present
     */
    BigInteger getRfcnflInUse();
    
    /**
     * {{list}} (maximum length 32) (minimum 1 items) of strings. Each item is a pilot 
     * PN offset in units of 64 PN chips. Self-configuration for pilot PN is controlled
     * by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.PilotPNConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.PilotPNSelfConfigEnable}} from an 
     * enabled perspective. If the FAP's self-configuration capability for Pilot PN 
     * Offset is available and enabled, this parameter MAY contain more than one item 
     * and the FAP is expected to select one from the list for {{param|PilotPNInUse}}. 
     * If the self-configuration capability is not available or not enabled, then this 
     * parameter SHOULD contain only a single item. The multiplicity of the PN offsets 
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
     * The Pilot PN Offset being used by the FAP. Self-configuration for Pilot PN 
     * Offset is controlled by 
     * {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.PilotPNConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.PilotPNSelfConfigEnable}} from an 
     * enabled perspective. If the self-configuration capability is available and 
     * enabled, this parameter indicates the value selected by the FAP among the 
     * choices provided in {{param|PilotPN}}. If the self-configuration capability is 
     * not available or not enabled, then this parameter contains the first value in 
     * {{param|PilotPN}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>pilotPnInUse</code>, or <code>null</code> if not present
     */
    BigInteger getPilotPnInUse();
    
    /**
     * Defines the maximum transmission power allowed on the FAP. {{param}} is 
     * expressed as a range of allowed maximum power levels with ".." (two periods) 
     * between the upper and lower values, i.e. 
     * "&amp;lt;;Pmax_low&amp;gt;..&amp;lt;;Pmax_high&amp;gt;". {{param}} identifies 
     * the limits between which the FAP can self-configure its maximum transmit power. 
     * Self-configuration for maximum transmission power is controlled by 
     * {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} 
     * from an enabled perspective. &amp;lt;;Pmax_low&amp;gt; and 
     * &amp;lt;;Pmax_high&amp;gt; are measured in dBm and have a range of -40.0 to 20.0
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
     * steps of {{units}}. The value of {{param}} divided by 10 yields the actual value
     * of the maximum transmission power. Self-configuration for maximum transmission 
     * power is controlled by 
     * {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} 
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
     * The data rate of the Control Channel of this HRPD SectorElement object. 
     * Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air 
     * Interface Specification, section-10.4.1.3.2.4
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>controlChannelRate</code>, or <code>null</code> if not present
     */
    java.lang.Long getControlChannelRate();
    
    /**
     * The offset from the control channel cycle boundary at which the synchronous 
     * capsules are to be transmitted for this HRPD SectorElement object. Reference 
     * -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface 
     * Specification, section-9.2.6.1.4.1.2
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>syncCapsuleOffset</code>, or <code>null</code> if not present
     */
    java.lang.Long getSyncCapsuleOffset();
    
    /**
     * The Reverse Activity Bit (RAB) length measured in slots for this HRPD 
     * SectorElement object. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate 
     * Packet Data Air Interface Specification, section-7.8.6.2.2, Table 9.7.6.2-2.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rabLength</code>, or <code>null</code> if not present
     */
    java.lang.Long getRabLength();
    
    /**
     * The Reverse Activity Bit (RAB) offset for this HRPD SectorElement object. 
     * Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air 
     * Interface Specification, section-7.8.6.2.2.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rabOffset</code>, or <code>null</code> if not present
     */
    java.lang.Long getRabOffset();
    
    /**
     * The 128 bit Sector ID for this HRPD SectorElement object. The Sector ID is used 
     * in the computation of the long code mask. See {{bibref|3GPP2-C.S0024-B}}, 
     * CDMA2000 High Rate Packet Data Air Interface Specification.
     *
     *
     *
     * @return <code>byte[]</code> <code>sectorId</code>, or <code>null</code> if not present
     */
    byte[] getSectorId();
    
    /**
     * The HRPD color code associated with this sector-element. Reference 
     * -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface 
     * Specification
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>colorCode</code>, or <code>null</code> if not present
     */
    java.lang.Long getColorCode();
    
    /**
     * {{param}} is the length of the HRPD SubnetMask in {{units}}. See 
     * {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface 
     * Specification
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>subnetMaskLength</code>, or <code>null</code> if not present
     */
    java.lang.Long getSubnetMaskLength();
    
    /**
     * Duration of the Reverse Link Silence Interval in units of {{units}}. The 
     * duration of the silence interval to be maintained on the reverse link. Reference
     * -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface 
     * Specification. Section-9.4.6.1.4.1.1.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>hrpdSecElReverseLinkSilenceDuration</code>, or <code>null</code> if not present
     */
    java.lang.Long getHrpdSecElReverseLinkSilenceDuration();
    
    /**
     * The Reverse Link Silence Interval is defined as the time interval of duration 
     * ReverseLinkSilenceDuration frames that starts at times T where T is the CDMA 
     * System Time in units of {{units}} and it satisfies the following equation: T mod
     * (2048 x 2^(ReverseLinkSilencePeriod) - 1) = 0. The period in the access cycle 
     * duration for which the silence interval shall be maintained on the reverse link.
     * {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface 
     * Specification. Section-9.4.6.1.4.1.1.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>hrpdSecElReverseLinkSilencePeriod</code>, or <code>null</code> if not present
     */
    java.lang.Long getHrpdSecElReverseLinkSilencePeriod();
    
    /**
     * The open loop adjustment (in {{units}}) for the access parameters of this 
     * sector-element. FAP sets this field to the negative of the nominal power to be 
     * used by ATs in the open loop power estimate, expressed as an unsigned value in 
     * units of 1 dB. The value used by the AT is -1 times the value of this field. 
     * Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air 
     * Interface Specification. Section-9.4.6.2.6
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>openLoopAdjust</code>, or <code>null</code> if not present
     */
    java.lang.Long getOpenLoopAdjust();
    
    /**
     * The probe initial adjustment (in {{units}}) for the access parameters of this 
     * sector-element. FAP sets this field to the correction factor to be used by ATs 
     * in the open loop power estimate for the initial transmission on the Access 
     * Channel, expressed as a two's complement value in units of 1 dB. Reference 
     * -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface 
     * Specification. Section-9.4.6.2.6
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>probeInitialAdjust</code>, or <code>null</code> if not present
     */
    java.lang.Long getProbeInitialAdjust();
    
    /**
     * The number of power level steps for access probes for the access parameters of 
     * this sector-element. FAP sets this field to the maximum number of access probes 
     * ATs are to transmit in a single access probe sequence. The access network shall 
     * set this field to a value in the range [1 ... 15]. Reference 
     * -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface 
     * Specification. Section-9.4.6.2.6
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>probeNumSteps</code>, or <code>null</code> if not present
     */
    java.lang.Long getProbeNumSteps();
    
    /**
     * The power step size (in {{units}}) applied to successive probes on the access 
     * channel associated with this sector-element. Probe power increase step. FAPsets 
     * this field to the increase in power between probes, in resolution of 0.5 dB. 
     * Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air 
     * Interface Specification. Section-9.4.6.2.6
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>probePowerStep</code>, or <code>null</code> if not present
     */
    java.lang.Long getProbePowerStep();
    
    /**
     * The A-Persistence vector, as per HRPD specification, for controlling contention 
     * access on the access channel associated with this sector-element. Reference - 
     * {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface 
     * Specification. Section-9.4.6.2.6. Format is "0xAABBCCDD", where AA, BB, CC, DD 
     * are in the range "01" through "3F" hex.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>aPersistence</code>, or <code>null</code> if not present
     */
    java.lang.String getAPersistence();
    
    /**
     * RAB threshold for RSSI based RAB algorithm.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rssirabThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Long getRssirabThreshold();
    
    /**
     * RAB threshold for Load based RAB algorithm in units of {{units}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>loadRabThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLoadRabThreshold();
    
    /**
     * 4 different configurations.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>connectionRateLimit</code>, or <code>null</code> if not present
     */
    java.lang.Short getConnectionRateLimit();
    
    /**
     * Config Parameter for DRC based rate control
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>rfeRlBalanceRatio</code>, or <code>null</code> if not present
     */
    java.lang.Short getRfeRlBalanceRatio();

}

