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
 * grouping fap-control-umts-self-config-g {
 *     leaf uarfcn-self-config-enable {
 *         type boolean;
 *     }
 *     leaf primary-scrambling-code-self-config-enable {
 *         type boolean;
 *     }
 *     leaf maxfap-tx-power-expanded-self-config-enable {
 *         type boolean;
 *     }
 *     leaf pcpich-power-self-config-enable {
 *         type boolean;
 *     }
 *     leaf max-ul-tx-power-self-config-enable {
 *         type boolean;
 *     }
 *     leaf lacracura-self-config-enable {
 *         type boolean;
 *     }
 *     leaf neighbor-list-self-config-enable {
 *         type boolean;
 *     }
 *     leaf cell-re-selection-self-config-enable {
 *         type boolean;
 *     }
 *     leaf intra-freq-meas-self-config-enable {
 *         type boolean;
 *     }
 *     leaf inter-freq-meas-self-config-enable {
 *         type boolean;
 *     }
 *     leaf inter-rat-meas-self-config-enable {
 *         type boolean;
 *     }
 *     leaf ue-internal-meas-config-enable {
 *         type boolean;
 *     }
 *     leaf noise-rise-limit-config-enable {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-umts-self-config-g</i>
 *
 */
public interface FapControlUmtsSelfConfigG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-umts-self-config-g").intern();

    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the values of {{param|.CellConfig.UMTS.RAN.CSG.UARFCNDLList}}. If 
     * {{true}} The FAP self-configures the value. If {{false}} The ACS MUST provide 
     * the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>uarfcnSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isUarfcnSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the value of {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}}. 
     * If {{true}} the FAP self-configures the value. If {{false}} the ACS MUST provide
     * the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>primaryScramblingCodeSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPrimaryScramblingCodeSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the value of {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}}. 
     * If {{true}} The FAP self-configures the value. If {{false}} The ACS MUST provide
     * the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>maxfapTxPowerExpandedSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMaxfapTxPowerExpandedSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the value of {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}}. If 
     * {{true}} The FAP self-configures the value. If {{false}} The ACS MUST provide 
     * the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>pcpichPowerSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPcpichPowerSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the value of {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}}. If 
     * {{true}} The FAP self-configures the value. If {{false}} The ACS MUST provide 
     * the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>maxUlTxPowerSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMaxUlTxPowerSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the values of {{param|.CellConfig.UMTS.CN.LACRAC}} and 
     * {{param|.CellConfig.UMTS.RAN.URAList}}. If {{true}} The FAP self-configures the 
     * value. If {{false}} The ACS MUST provide the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>lacracuraSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLacracuraSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the values in the object {{object|.CellConfig.UMTS.RAN.NeighborList.}}
     * If {{true}} The FAP self-configures the value. If {{false}} The ACS MUST provide
     * the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>neighborListSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isNeighborListSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine Cell Selection/Reselection-related parameters in 
     * {{object|.CellConfig.UMTS.RAN.CellSelection.}} If {{true}} The FAP 
     * self-configures the value. If {{false}} The ACS MUST provide the specific value 
     * to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>cellReSelectionSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCellReSelectionSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine intra-frequency measurement -related parameters in 
     * {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} If {{true}} The FAP 
     * self-configures the value. If {{false}} The ACS MUST provide the specific value 
     * to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>intraFreqMeasSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIntraFreqMeasSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine inter-frequency measurement -related parameters in 
     * {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} If {{true}} The FAP 
     * self-configures the value. If {{false}} The ACS MUST provide the specific value 
     * to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>interFreqMeasSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInterFreqMeasSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine inter-RAT measurement -related parameters in 
     * {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} If {{true}} The FAP 
     * self-configures the value. If {{false}} The ACS MUST provide the specific value 
     * to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>interRatMeasSelfConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInterRatMeasSelfConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine UE internal measurement-related parameters in 
     * {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} If {{true}} The FAP 
     * self-configures the value. If {{false}} The ACS MUST provide the specific value 
     * to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>ueInternalMeasConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isUeInternalMeasConfigEnable();
    
    /**
     * Indicates whether the self-configuration capability in the FAP is used or not to
     * determine the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitInUse}}. If
     * {{true}} the FAP self-configures the value, based on the limits specified in 
     * {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} and 
     * {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}. If {{false}} the ACS
     * must provide the specific value to be used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>noiseRiseLimitConfigEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isNoiseRiseLimitConfigEnable();

}

