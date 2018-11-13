package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to the RF configuration.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-rf-g {
 *     leaf-list uarfcndl {
 *         type string;
 *     }
 *     leaf uarfcndl-in-use {
 *         type uint64;
 *     }
 *     leaf uarfcnul-in-use {
 *         type uint64;
 *     }
 *     leaf-list uarfcndl-to-protect {
 *         type string;
 *     }
 *     leaf-list primary-scrambling-code {
 *         type string;
 *     }
 *     leaf primary-scrambling-code-in-use {
 *         type uint64;
 *     }
 *     leaf maxfap-tx-power-expanded {
 *         type string;
 *     }
 *     leaf maxfap-tx-power-in-use-expanded {
 *         type maxfap-tx-power-in-use-expanded;
 *     }
 *     leaf max-ul-tx-power {
 *         type string;
 *     }
 *     leaf max-ul-tx-power-in-use {
 *         type max-ul-tx-power-in-use;
 *     }
 *     leaf pcpich-power {
 *         type string;
 *     }
 *     leaf pcpich-power-in-use {
 *         type pcpich-power-in-use;
 *     }
 *     leaf power-offset-pilot-dpdch {
 *         type power-offset-pilot-dpdch;
 *     }
 *     leaf fap-coverage-target {
 *         type fap-coverage-target;
 *     }
 *     leaf fap-quality-target-ec-io {
 *         type fap-quality-target-ec-io;
 *     }
 *     leaf psch-power {
 *         type psch-power;
 *     }
 *     leaf ssch-power {
 *         type ssch-power;
 *     }
 *     leaf pich-power {
 *         type pich-power;
 *     }
 *     leaf pch-power {
 *         type pch-power;
 *     }
 *     leaf fach-power {
 *         type fach-power;
 *     }
 *     leaf bch-power {
 *         type bch-power;
 *     }
 *     leaf aich-power {
 *         type aich-power;
 *     }
 *     leaf ctch-allocation-period {
 *         type uint8;
 *     }
 *     leaf cbs-frame-offset {
 *         type uint8;
 *     }
 *     leaf max-tti {
 *         type uint8;
 *     }
 *     leaf noise-rise-limit-lower-value {
 *         type uint16;
 *     }
 *     leaf noise-rise-limit-upper-value {
 *         type uint16;
 *     }
 *     leaf noise-rise-limit-in-use {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-rf-g</i>
 *
 */
public interface UmtsRanRfG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-rf-g").intern();

    /**
     * {{list}} Each item is a DL UTRA Absolute Radio Frequency Channel Number (UARFCN)
     * in an FDD mode cell. {{bibref|3GPP-TS.25.433|Section 9.2.1.65}} 
     * Self-configuration for UARFCN is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.UARFCNConfig}} from an availability 
     * perspective and {{param|.FAPControl.UMTS.SelfConfig.UARFCNSelfConfigEnable}} 
     * from an enabled perspective. If the FAP's self-configuration capability for 
     * UARFCN is available and enabled, this parameter MAY contain more than one item 
     * and the FAP is expected to select one from the list for {{param|UARFCNDLInUse}}.
     * If the self-configuration capability is not available or not enabled, then this 
     * parameter SHOULD contain only a single item. The UARFCN values supplied to the 
     * list are derived based on the formula defined in {{bibref|3GPP-TS.25.104|Section
     * 5.4.3}} The order of the UARFCN entries has no significance. The carrier spacing
     * in FDD mode is fixed as defined in {{bibref|3GPP-TS.25.104}}. Therefore, the FAP
     * can unambiguously derive the UL UARFCN value based on the selected DL UARFCN.
     *
     *
     *
     * @return <code>java.util.List</code> <code>uarfcndl</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getUarfcndl();
    
    /**
     * The DL UARFCN being used by the FAP. Self-configuration for UARFCN is controlled
     * by {{param|.Capabilities.UMTS.SelfConfig.UARFCNConfig}} from an availability 
     * perspective and {{param|.FAPControl.UMTS.SelfConfig.UARFCNSelfConfigEnable}} 
     * from an enabled perspective. If the self-configuration capability is available 
     * and enabled, this parameter indicates the value selected by the FAP among the 
     * choices provided in {{param|UARFCNDL}}. If the self-configuration capability is 
     * not available or not enabled, then this parameter contains the first value in 
     * {{param|UARFCNDL}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>uarfcndlInUse</code>, or <code>null</code> if not present
     */
    BigInteger getUarfcndlInUse();
    
    /**
     * The UL UARFCN being used by the FAP. The UL UARFCN that corresponds to 
     * {{param|UARFCNDLInUse}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>uarfcnulInUse</code>, or <code>null</code> if not present
     */
    BigInteger getUarfcnulInUse();
    
    /**
     * {{list}} Each item is a DL UARFCNs to be protected from adjacent channel 
     * interference. "Adjacent channel" in this context means offset from the FAP's 
     * UARFCN by 5MHz. {{bibref|3GPP-TS.25.104|Section 6.4.6}} If any of the items in 
     * the list are adjacent to the FAP's own DL channel, the FAP MUST take the Primary
     * CPICH code power measured on these channels into account as part of its maximum 
     * transmit power self-configuration. The UARFCNs in the list can belong to any 
     * operator, allowing for protection of the FAP operator's own macro layer as well 
     * as that of other operators (only the latter is mandated by the 
     * {{bibref|3GPP-TS.25.104}} requirements). The list SHOULD take into account the 
     * ability of the FAP to self-configure its own DL UARFCN and so SHOULD include any
     * channels (requiring protection) which can potentially be adjacent to the UARFCN 
     * selected by the FAP. For example, if only adjacent operator protection is 
     * required and the FAP has the ability to self-configure to any channel owned by 
     * its operator, this list would be populated with the UARFCNs immediately above 
     * and below the range of channels owned by the FAP operator. Adjacent channel 
     * protection can cause the FAP transmit power to be reduced down to as low as 
     * 8dBm. If {{empty}} then it indicates that there are no channels adjacent to the 
     * FAP that require protection, or that self-configuration of the FAP transmit 
     * power is not enabled.
     *
     *
     *
     * @return <code>java.util.List</code> <code>uarfcndlToProtect</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getUarfcndlToProtect();
    
    /**
     * {{list}} Each item is a Primary DL Scrambling Code used by the FDD mode cell 
     * with a numeric range between 0 and 511 inclusive. 
     * {{bibref|3GPP-TS.25.433|Section 9.2.2.34}} Self-configuration for PSC is 
     * controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.PrimaryScramblingCodeConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.UMTS.SelfConfig.PrimaryScramblingCodeSelfConfigEnable}} from
     * an enabled perspective. If the FAP's self-configuration capability for {{param}}
     * is available and enabled, this parameter MAY contain more than one item and the 
     * FAP is expected to select one from the list for 
     * {{param|PrimaryScramblingCodeInUse}}. If the self-configuration capability is 
     * not available or not enabled, then this parameter SHOULD contain only a single 
     * item. The multiplicity of the PSC values can also be expressed by defining a 
     * range using ".." (two periods) between two values. In this case, the combination
     * of two values defines the lower-bound and upper-bound of the range inclusive. 
     * The following are examples of valid PSC string: :"20" ::(explicitly specifies a 
     * single PSC value) :"20,30,40" ::(specifies 3 possible PSC values to select from)
     * "20..40" ::(specifies 21 possible values between 20 and 40, inclusive) 
     * "20..40,50" ::(specifies 22 possible values between 20 and 40 inclusive and a 
     * single value 50) The order of the items has no significance.
     *
     *
     *
     * @return <code>java.util.List</code> <code>primaryScramblingCode</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getPrimaryScramblingCode();
    
    /**
     * The PSC being used by the FAP. Self-configuration for PSC is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.PrimaryScramblingCodeConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.UMTS.SelfConfig.PrimaryScramblingCodeSelfConfigEnable}} from
     * an enabled perspective. If the self-configuration capability is available and 
     * enabled, this parameter indicates the value selected by the FAP among the 
     * choices provided in {{param|PrimaryScramblingCode}}. If the self-configuration 
     * capability is not available or not enabled, then this parameter contains the 
     * first value in {{param|PrimaryScramblingCode}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>primaryScramblingCodeInUse</code>, or <code>null</code> if not present
     */
    BigInteger getPrimaryScramblingCodeInUse();
    
    /**
     * Defines the maximum transmission power allowed on the FAP, maximum value for the
     * linear sum of the power of all downlink physical channels, that is allowed to be
     * used in a cell. {{param}} is expressed as a range of allowed maximum power 
     * levels with ".." (two periods) between the upper and lower values, i.e. 
     * "&amp;lt;Pmax_low&amp;gt;..&amp;lt;Pmax_high&amp;gt;". {{param}} identifies the 
     * limits between which the FAP can self-configure its maximum transmit power. 
     * Self-configuration for maximum transmission power is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.MaxFAPTxPowerExpandedConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.UMTS.SelfConfig.MaxFAPTxPowerExpandedSelfConfigEnable}} from
     * an enabled perspective. &amp;lt;Pmax_low&amp;gt; and &amp;lt;Pmax_high&amp;gt; 
     * are measured in dBm and have a range of -30.0 to 20.0 incremented by 0.1 dB. 
     * {{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>maxfapTxPowerExpanded</code>, or <code>null</code> if not present
     */
    java.lang.String getMaxfapTxPowerExpanded();
    
    /**
     * The maximum transmission power measured in {{units}} currently used by the FAP. 
     * Actual values of the maximum transmission power are -30.0 {{units}} to 20.0 
     * {{units}} in steps of 0.1 dB. The value of {{param}} divided by 10 yields the 
     * actual value of the maximum transmission power. Self-configuration for maximum 
     * transmission power is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.MaxFAPTxPowerExpandedConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.UMTS.SelfConfig.MaxFAPTxPowerExpandedSelfConfigEnable}} from
     * an enabled perspective. If the self-configuration capability is available and 
     * enabled, this parameter indicates the value selected by the FAP among the range 
     * provided in {{param|MaxFAPTxPowerExpanded}}. If the self-configuration 
     * capability is not available or not enabled, then this parameter contains a value
     * selected by the ACS.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxfapTxPowerInUseExpanded</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxfapTxPowerInUseExpanded();
    
    /**
     * Defines the maximum transmission power level a UE can use on PRACH. {{param}} is
     * expressed as a range of allowed maximum power levels with ".." (two periods) 
     * between the upper and lower values, i.e. 
     * "&amp;lt;Pmax_low&amp;gt;..&amp;lt;Pmax_high&amp;gt;". {{param}} identifies the 
     * limits between which the FAP can self-configure its maximum transmit power. 
     * Self-configuration for maximum transmission power is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.MaxULTxPowerConfig}} from an availability 
     * perspective and 
     * {{param|.FAPControl.UMTS.SelfConfig.MaxULTxPowerSelfConfigEnable}} from an 
     * enabled perspective. &amp;lt;Pmax_low&amp;gt; and &amp;lt;Pmax_high&amp;gt; are 
     * measured in dBm and have a range of -50 to 33 incremented by 1. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.6.39}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>maxUlTxPower</code>, or <code>null</code> if not present
     */
    java.lang.String getMaxUlTxPower();
    
    /**
     * The maximum transmission power level a UE can use on PRACH. Self-configuration 
     * for maximum transmission power is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.MaxULTxPowerConfig}} from an availability 
     * perspective and 
     * {{param|.FAPControl.UMTS.SelfConfig.MaxULTxPowerSelfConfigEnable}} from an 
     * enabled perspective. If the self-configuration capability is available and 
     * enabled, this parameter indicates the value selected by the FAP among the range 
     * provided in {{param|MaxULTxPower}}. If the self-configuration capability is not 
     * available or not enabled, then this parameter contains a value selected by the 
     * ACS.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxUlTxPowerInUse</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxUlTxPowerInUse();
    
    /**
     * The value of the transmission power of the Primary Common PIlot CHannel 
     * (P-CPICH). The P-CPICH physical channel carries the common pilots of the cell. 
     * Parameter in SIB5. {{param}} is expressed as a range of allowed transmission 
     * power levels with ".." (two periods) between the upper and lower values, i.e. 
     * "&amp;lt;Pmax_low&amp;gt;..&amp;lt;Pmax_high&amp;gt;". {{param}} identifies the 
     * limits between which the FAP can self-configure its transmission power. 
     * Self-configuration for transmission power is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.PCPICHPowerConfig}} from an availability 
     * perspective and 
     * {{param|.FAPControl.UMTS.SelfConfig.PCPICHPowerSelfConfigEnable}} from an 
     * enabled perspective. &amp;lt;Pmax_low&amp;gt; and &amp;lt;Pmax_high&amp;gt; are 
     * measured in dBm and have a range of -10.0 to 20.0 incremented by 0.1 dB. 
     * {{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>pcpichPower</code>, or <code>null</code> if not present
     */
    java.lang.String getPcpichPower();
    
    /**
     * The P-CPICH power measured in {{units}} currently used by the FAP. Actual values
     * of the maximum transmission power are -10.0 {{units}} to 20.0 {{units}} in steps
     * of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the 
     * maximum transmission power. Self-configuration for transmission power is 
     * controlled by {{param|.Capabilities.UMTS.SelfConfig.PCPICHPowerConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.UMTS.SelfConfig.PCPICHPowerSelfConfigEnable}} from an 
     * enabled perspective. If the self-configuration capability is available and 
     * enabled, this parameter indicates the value selected by the FAP among the range 
     * provided in {{param|PCPICHPower}}. If the self-configuration capability is not 
     * available or not enabled, then this parameter contains a value selected by the 
     * ACS.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pcpichPowerInUse</code>, or <code>null</code> if not present
     */
    java.lang.Long getPcpichPowerInUse();
    
    /**
     * Defines the power offset between pilot channel and DPDCH. Actual values of the 
     * offset are 0.0 {{units}} to 6.0 {{units}} in steps of 0.25 {{units}}. The value 
     * of {{param}} divided by 4 yields the actual value of the offset. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.6.18}} {{bibref|3GPP-TS.25.214|Section 
     * 5.2.1}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>powerOffsetPilotDpdch</code>, or <code>null</code> if not present
     */
    java.lang.Short getPowerOffsetPilotDpdch();
    
    /**
     * Defines the target value measured in {{units}} for the range of the FAP's DL 
     * coverage, in terms of RF propagation loss. This value can be used by the FAP's 
     * self-configuration algorithms to help derive transmit power levels in the 
     * presence of co-channel and adjacent channel interference. 
     * {{bibref|3GPP-TS.25.967|Section 7.2.1}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>fapCoverageTarget</code>, or <code>null</code> if not present
     */
    java.lang.Short getFapCoverageTarget();
    
    /**
     * Defines the target value measured in dB for the downlink signal quality of the 
     * FAP in terms of CPICH Ec/Io, thereby clarifying the meaning of 
     * "FAPCoverageTarget". Actual values of the FAPQualityTargetEcIo are -20 dB to 0 
     * dB in steps of 0.1 dB.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>fapQualityTargetEcIo</code>, or <code>null</code> if not present
     */
    java.lang.Long getFapQualityTargetEcIo();
    
    /**
     * Defines the transmission power offset measured in {{units}} of the Primary SCH 
     * relative to the Primary CPICH power. Actual values of the transmission power 
     * offset are -35.0 {{units}} to 15.0 {{units}} in steps of 0.1 {{units}}. The 
     * value of {{param}} divided by 10 yields the actual value of the transmission 
     * power offset. {{bibref|3GPP-TS.32.642|Section 6.3.11}} 
     * {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pschPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getPschPower();
    
    /**
     * Defines the transmission power offset measured in {{units}} of the Secondary SCH
     * relative to the Primary CPICH power. Actual values of the transmission power 
     * offset are -35.0 {{units}} to 15.0 {{units}} in steps of 0.1 {{units}}. The 
     * value of {{param}} divided by 10 yields the actual value of the transmission 
     * power offset. {{bibref|3GPP-TS.32.642|Section 6.3.11}} 
     * {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>sschPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getSschPower();
    
    /**
     * Defines the maximum transmission power offset measured in {{units}} of the PICH 
     * channel relative to the Primary CPICH transmission power. 
     * {{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 
     * 9.2.1.49A}} {{bibref|3GPP-TS.25.331|Section 10.3.6.50}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pichPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getPichPower();
    
    /**
     * Defines the transmission power offset measured in {{units}} of the PCH relative 
     * to the Primary CPICH power. Actual values of the transmission power offset are 
     * -35.0 {{units}} to 15.0 {{units}} in steps of 0.1 {{units}}. The value of 
     * {{param}} divided by 10 yields the actual value of the transmission power 
     * offset. {{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 
     * 9.1.3.1 and Section 9.2.1.21}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pchPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getPchPower();
    
    /**
     * Defines the transmission power offset measured in {{units}} of the FACH relative
     * to the Primary CPICH power. Actual values of the transmission power offset are 
     * -35.0 {{units}} to 15.0 {{units}} in steps of 0.1 {{units}}. The value of 
     * {{param}} divided by 10 yields the actual value of the transmission power 
     * offset. {{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 
     * 9.1.6.1 and Section 9.2.1.21}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>fachPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getFachPower();
    
    /**
     * Defines the transmission power offset measured in {{units}} of the BCH relative 
     * to the Primary CPICH power. Actual values of the transmission power offset are 
     * -35.0 {{units}} to 15.0 {{units}} in steps of 0.1 {{units}}. The value of 
     * {{param}} divided by 10 yields the actual value of the transmission power 
     * offset. {{bibref|3GPP-TS.32.642|Section 9.3.11}} {{bibref|3GPP-TS.25.433|Section
     * 9.1.24 and Section 9.2.1.21}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>bchPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getBchPower();
    
    /**
     * Defines the transmission power offset measured in {{units}} of one AICH relative
     * to the Primary CPICH power. Parameter defined in SIB5 
     * {{bibref|3GPP-TS.25.331|Section 10.3.6.3}}. Transmission power level of AICH, 
     * AP-AICH and CD/CA-ICH channels compared to CPICH. 
     * {{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 
     * 9.2.2.D}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>aichPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getAichPower();
    
    /**
     * The value defines 'N' multiples of M(TTI) for CBS DRX calculations at the UE 
     * side.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>ctchAllocationPeriod</code>, or <code>null</code> if not present
     */
    java.lang.Short getCtchAllocationPeriod();
    
    /**
     * Value of CBS frame offset (CTCH) on DL FACH. Parameter in SIB5
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>cbsFrameOffset</code>, or <code>null</code> if not present
     */
    java.lang.Short getCbsFrameOffset();
    
    /**
     * Defines the number of radio frames in the TTI of the FACH used for CTCH (MTTI).
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxTti</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxTti();
    
    /**
     * Defines the lower value of the Noise Rise Limit range that UMTS FAP is allowed 
     * to pick from. The value is measured in dB and has a range of 0.0 to 50.0 
     * incremented by 0.1 dB. the value MUST not exceed the value of 
     * {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}} The Noise Rise Limit 
     * range identifies the limits between which the FAP can self-configure its uplink 
     * noise rise limit. Self-configuration for noise rise limit is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.NoiseRiseLimitConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.UMTS.SelfConfig.NoiseRiseLimitConfigEnable}} from an enabled
     * perspective.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>noiseRiseLimitLowerValue</code>, or <code>null</code> if not present
     */
    java.lang.Integer getNoiseRiseLimitLowerValue();
    
    /**
     * Defines the upper value of the Noise Rise Limit range that UMTS FAP is allowed 
     * to pick from. The value is measured in dB and has a range of 0.0 to 50.0 
     * incremented by 0.1 dB. the value MUST not be below the value of 
     * {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} NoiseRiseLimit 
     * identifies the limits between which the FAP can self-configure its uplink noise 
     * rise limit. Self-configuration for noise rise limit is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.NoiseRiseLimitConfig}} from an 
     * availability perspective and 
     * {{param|.FAPControl.UMTS.SelfConfig.NoiseRiseLimitConfigEnable}} from an enabled
     * perspective.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>noiseRiseLimitUpperValue</code>, or <code>null</code> if not present
     */
    java.lang.Integer getNoiseRiseLimitUpperValue();
    
    /**
     * Actual value of the Noise Rise Limit that the FAP uses. The value is measured in
     * dB and has a range of 0.0 to 50.0 incremented by 0.1 dB.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>noiseRiseLimitInUse</code>, or <code>null</code> if not present
     */
    java.lang.Integer getNoiseRiseLimitInUse();

}

