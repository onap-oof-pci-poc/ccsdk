package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the self-configuration capabilities 
 * of the FAP. Self-configuration is enabled in 
 * {{object|.FAPControl.UMTS.SelfConfig.}}
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping capabilities-umts-self-config-g {
 *     leaf uarfcn-config {
 *         type boolean;
 *     }
 *     leaf primary-scrambling-code-config {
 *         type boolean;
 *     }
 *     leaf maxfap-tx-power-expanded-config {
 *         type boolean;
 *     }
 *     leaf pcpich-power-config {
 *         type boolean;
 *     }
 *     leaf max-ul-tx-power-config {
 *         type boolean;
 *     }
 *     leaf lacracura-config {
 *         type boolean;
 *     }
 *     leaf neighbor-list-config {
 *         type boolean;
 *     }
 *     leaf cell-re-selection-config {
 *         type boolean;
 *     }
 *     leaf intra-freq-meas-config {
 *         type boolean;
 *     }
 *     leaf inter-freq-meas-config {
 *         type boolean;
 *     }
 *     leaf inter-rat-meas-config {
 *         type boolean;
 *     }
 *     leaf ue-internal-meas-config {
 *         type boolean;
 *     }
 *     leaf noise-rise-limit-config {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/capabilities-umts-self-config-g</i>
 *
 */
public interface CapabilitiesUmtsSelfConfigG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-umts-self-config-g").intern();

    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the UTRA Absolute Radio Frequency Channel Number (UARFCN). If {{true}}
     * multiple values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.UARFCNDL}} 
     * for the FAP to select from. If {{false}} only a single value SHOULD be provided 
     * in {{param|.CellConfig.UMTS.RAN.RF.UARFCNDL}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>uarfcnConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isUarfcnConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the Primary Scrambling Code (PSC). If {{true}} multiple values or a 
     * range of values MAY be provided in 
     * {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}} for the FAP to select 
     * from. If {{false}} only a single value SHOULD be provided in 
     * {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>primaryScramblingCodeConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPrimaryScramblingCodeConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the Maximum FAP Transmit Power. If {{true}} a range of values MAY be 
     * provided in {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}} for the FAP 
     * to select from. If {{false}} only a single value SHOULD be provided in 
     * {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>maxfapTxPowerExpandedConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMaxfapTxPowerExpandedConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the P-CPICH power. If {{true}} a range of values MAY be provided in 
     * {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}} for the FAP to select from. If 
     * {{false}} only a single value SHOULD be provided in 
     * {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}} as an upper bound.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>pcpichPowerConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPcpichPowerConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the Maximum UL Transmit Power. If {{true}} a range of values MAY be 
     * provided in {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}} for the FAP to select
     * from. If {{false}} only a single value SHOULD be provided in 
     * {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>maxUlTxPowerConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMaxUlTxPowerConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the LAC, RAC, and URA. If {{true}} multiple values MAY be provided in 
     * {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}} 
     * for the FAP to select from. If {{false}} only a single value SHOULD be provided 
     * in {{param|.CellConfig.UMTS.CN.LACRAC}} and 
     * {{param|.CellConfig.UMTS.RAN.URAList}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>lacracuraConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLacracuraConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine the neighbor list. If {{true}} the ACS uses the 
     * {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}}, 
     * {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}}, 
     * {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.}} tables to explicitly 
     * include or exclude entries and the FAP uses that information to determine the 
     * final configuration found in the 
     * {{object|.CellConfig.UMTS.RAN.NeighborListInUse.IntraFreqCell.{i}.}}, 
     * {{object|.CellConfig.UMTS.RAN.NeighborListInUse.InterFreqCell.{i}.}}, 
     * {{object|.CellConfig.UMTS.RAN.NeighborListInUse.InterRATCell.}} tables. If 
     * {{false}} the ACS uses the 
     * {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}}, 
     * {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}}, 
     * {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.}} tables to only 
     * specify the included entries and the FAP uses that list.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>neighborListConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isNeighborListConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine cell-reselection values. If {{true}} 
     * {{object|.CellConfig.UMTS.RAN.CellSelection.}} can be self-configured. If 
     * {{false}} {{object|.CellConfig.UMTS.RAN.CellSelection.}} is provided by the ACS.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>cellReSelectionConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCellReSelectionConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine intra-frequency measurement values. If {{true}} 
     * {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} can be self-configured. If 
     * {{false}} {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} is provided by the ACS.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>intraFreqMeasConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIntraFreqMeasConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine inter-frequency measurement values. If {{true}} 
     * {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} can be self-configured. If 
     * {{false}} {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} is provided by the ACS.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>interFreqMeasConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInterFreqMeasConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine inter-RAT measurement values. If {{true}} 
     * {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} can be self-configured. If 
     * {{false}} {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} is provided by the ACS.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>interRatMeasConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInterRatMeasConfig();
    
    /**
     * Indicates whether the FAP supports the self-configuration capability to 
     * determine UE internal measurement values. If {{true}} 
     * {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} can be self-configured. If 
     * {{false}} {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} is provided by the 
     * ACS.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>ueInternalMeasConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isUeInternalMeasConfig();
    
    /**
     * Indicates whether the FAP supports the selfconfiguration capability to determine
     * the Noise Rise Limit. If {{true}} 
     * {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} and 
     * {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}. MAY provide a range 
     * of values to select from. If {{false}} 
     * {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}} provides only a 
     * single value to be used. The value of 
     * {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} is ignored.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>noiseRiseLimitConfig</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isNoiseRiseLimitConfig();

}

