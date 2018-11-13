package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the connected mode mobility 
 * (handover) configuration within LTE system (see {{bibref|3GPP-TS.32.592|Section 
 * 6.1.5.2.1}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-conn-mode-eutra-g {
 *     leaf-list filter-coefficient-rsrp {
 *         type string;
 *     }
 *     leaf-list filter-coefficient-rsrq {
 *         type string;
 *     }
 *     leaf a1-threshold-rsrp {
 *         type uint8;
 *     }
 *     leaf a1-threshold-rsrq {
 *         type uint8;
 *     }
 *     leaf a2-threshold-rsrp {
 *         type uint8;
 *     }
 *     leaf a2-threshold-rsrq {
 *         type uint8;
 *     }
 *     leaf-list a3-offset {
 *         type string;
 *     }
 *     leaf report-on-leave {
 *         type boolean;
 *     }
 *     leaf a4-threshold-rsrp {
 *         type uint8;
 *     }
 *     leaf a4-threshold-rsrq {
 *         type uint8;
 *     }
 *     leaf a5-threshold1-rsrp {
 *         type uint8;
 *     }
 *     leaf a5-threshold1-rsrq {
 *         type uint8;
 *     }
 *     leaf a5-threshold2-rsrp {
 *         type uint8;
 *     }
 *     leaf a5-threshold2-rsrq {
 *         type uint8;
 *     }
 *     leaf-list hysteresis {
 *         type string;
 *     }
 *     leaf-list time-to-trigger {
 *         type uint16;
 *     }
 *     leaf trigger-quantity {
 *         type enumeration;
 *     }
 *     leaf report-quantity {
 *         type enumeration;
 *     }
 *     leaf max-report-cells {
 *         type uint8;
 *     }
 *     leaf report-interval {
 *         type report-interval;
 *     }
 *     leaf report-amount {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-conn-mode-eutra-g</i>
 *
 */
public interface LteRanMobilityConnModeEutraG
    extends
    DataObject
{


    public enum TriggerQuantity {
        /**
         * none
         *
         */
        Rsrp(1, "rsrp"),
        
        /**
         * none
         *
         */
        Rsrq(2, "rsrq")
        ;
    
        private static final java.util.Map<java.lang.Integer, TriggerQuantity> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TriggerQuantity> b = com.google.common.collect.ImmutableMap.builder();
            for (TriggerQuantity enumItem : TriggerQuantity.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private TriggerQuantity(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding TriggerQuantity item
         */
        public static TriggerQuantity forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum ReportQuantity {
        /**
         * none
         *
         */
        SameAsTriggerQuantity(1, "same-as-trigger-quantity"),
        
        /**
         * none
         *
         */
        Both(2, "both")
        ;
    
        private static final java.util.Map<java.lang.Integer, ReportQuantity> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ReportQuantity> b = com.google.common.collect.ImmutableMap.builder();
            for (ReportQuantity enumItem : ReportQuantity.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private ReportQuantity(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding ReportQuantity item
         */
        public static ReportQuantity forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-conn-mode-eutra-g").intern();

    /**
     * {{list}} Each item is a filtering coefficient used for RSRP measurements, with a
     * numeric range between 0 and 19 inclusive. For values greater than 9, only odd 
     * values are valid. If the value is other than these, the CPE MUST reject the 
     * value. In case there is more than one item in the list, the first item contains 
     * the most preferred value. Corresponds to filterCoefficientRSRP parameter 
     * specified in QuantityConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. 
     * The multiplicity of the {{param}} values can also be expressed by defining a 
     * range using ".." (two periods) between two values. In this case, the combination
     * of two values defines the lower-bound and upper-bound of the range inclusive. If
     * this notation is used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If supports self-configuration capability for {{param}} and more than one item 
     * is configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>filterCoefficientRsrp</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getFilterCoefficientRsrp();
    
    /**
     * {{list}} Each item is a filtering coefficient used for RSRQ measurements, with a
     * numeric range between 0 and 19 inclusive. For values greater than 9, only odd 
     * values are valid. If the value is other than these, the CPE MUST reject the 
     * value. In case there is more than one item in the list, the first item contains 
     * the most preferred value. Corresponds to filterCoefficientRSRQ parameter 
     * specified in QuantityConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. 
     * The multiplicity of the {{param}} values can also be expressed by defining a 
     * range using ".." (two periods) between two values. In this case, the combination
     * of two values defines the lower-bound and upper-bound of the range inclusive. If
     * this notation is used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If supports self-configuration capability for {{param}} and more than one item 
     * is configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>filterCoefficientRsrq</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getFilterCoefficientRsrq();
    
    /**
     * Threshold to be used in EUTRA measurement report triggering condition for event 
     * A1. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. 
     * Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 
     * 9.1.4-1}}. Corresponds to parameter a1-Threshold:threshold-RSRP specified in 
     * ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>a1ThresholdRsrp</code>, or <code>null</code> if not present
     */
    java.lang.Short getA1ThresholdRsrp();
    
    /**
     * Threshold to be used in EUTRA measurement report triggering condition for event 
     * A1. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. 
     * Mapping to actual values is specified in 3GPP TS 36.133}} table 9.1.7-1. 
     * Corresponds to parameter a1-Threshold:threshold-RSRQ specified in 
     * ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>a1ThresholdRsrq</code>, or <code>null</code> if not present
     */
    java.lang.Short getA1ThresholdRsrq();
    
    /**
     * Threshold to be used in EUTRA measurement report triggering condition for event 
     * A2. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. 
     * Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 
     * 9.1.4-1}}. Corresponds to parameter a2-Threshold:threshold-RSRP specified in 
     * ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>a2ThresholdRsrp</code>, or <code>null</code> if not present
     */
    java.lang.Short getA2ThresholdRsrp();
    
    /**
     * Threshold to be used in EUTRA measurement report triggering condition for event 
     * A2. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. 
     * Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 
     * 9.1.7-1}}. Corresponds to parameter a2-Threshold:threshold-RSRQ specified in 
     * ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>a2ThresholdRsrq</code>, or <code>null</code> if not present
     */
    java.lang.Short getA2ThresholdRsrq();
    
    /**
     * {{list}} Each item is an offset to be used in evaluation of EUTRA measurement 
     * report triggering condition for event A3, with a numeric range between -30 and 
     * 30 inclusive. In case there is more than one item in the list, the first item 
     * contains the most preferred value. Mapping to actual values is specified in 
     * {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a3-Offset specified in 
     * ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. The 
     * multiplicity of the {{param}} values can also be expressed by defining a range 
     * using ".." (two periods) between two values. In this case, the combination of 
     * two values defines the lower-bound and upper-bound of the range inclusive. If 
     * this notation is used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If supports self-configuration capability for {{param}} and more than one item 
     * is configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>a3Offset</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getA3Offset();
    
    /**
     * Indicates whether or not the UE shall initiate the measurement reporting 
     * procedure when the leaving condition is met for event A3 for a cell in 
     * cellsTriggeredList, as specified in {{bibref|3GPP-TS.36.331|Section 5.5.4.1 and 
     * Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>reportOnLeave</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isReportOnLeave();
    
    /**
     * Threshold to be used in EUTRA measurement report triggering condition for event 
     * A4. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. 
     * Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds 
     * to parameter a4-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>a4ThresholdRsrp</code>, or <code>null</code> if not present
     */
    java.lang.Short getA4ThresholdRsrp();
    
    /**
     * Threshold to be used in EUTRA measurement report triggering condition for event 
     * A4. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. 
     * Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds 
     * to parameter a4-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>a4ThresholdRsrq</code>, or <code>null</code> if not present
     */
    java.lang.Short getA4ThresholdRsrq();
    
    /**
     * Threshold1 to be used in EUTRA measurement report triggering condition for event
     * A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. 
     * Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds 
     * to parameter a5-Threshold1:threshold-RSRP specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>a5Threshold1Rsrp</code>, or <code>null</code> if not present
     */
    java.lang.Short getA5Threshold1Rsrp();
    
    /**
     * Threshold1 to be used in EUTRA measurement report triggering condition for event
     * A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. 
     * Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds 
     * to parameter a5-Threshold1:threshold-RSRQ specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>a5Threshold1Rsrq</code>, or <code>null</code> if not present
     */
    java.lang.Short getA5Threshold1Rsrq();
    
    /**
     * Threshold2 to be used in EUTRA measurement report triggering condition for event
     * A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. 
     * Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds 
     * to parameter a5-Threshold2:threshold-RSRP specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>a5Threshold2Rsrp</code>, or <code>null</code> if not present
     */
    java.lang.Short getA5Threshold2Rsrp();
    
    /**
     * Threshold2 to be used in EUTRA measurement report triggering condition for event
     * A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. 
     * Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds 
     * to parameter a5-Threshold2:threshold-RSRQ specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>a5Threshold2Rsrq</code>, or <code>null</code> if not present
     */
    java.lang.Short getA5Threshold2Rsrq();
    
    /**
     * {{list}} Each item is a hysteresis value applied to entry and leave condition of
     * a report triggering event, with a numeric range between 0 and 30 inclusive. In 
     * case there is more than one item in the list, the first item contains the most 
     * preferred value. Corresponds to parameter hysteresis specified in 
     * ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. The 
     * multiplicity of the {{param}} values can also be expressed by defining a range 
     * using ".." (two periods) between two values. In this case, the combination of 
     * two values defines the lower-bound and upper-bound of the range inclusive. If 
     * this notation is used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If supports self-configuration capability for {{param}} and more than one item 
     * is configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>hysteresis</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getHysteresis();
    
    /**
     * {{list}} Each item is a time period during which measurement report triggering 
     * condition needs to be met in order to trigger a measurement report, specified in
     * milliseconds. In case there is more than one item in the list, the first item 
     * contains the most preferred value. Corresponds to parameter timeToTrigger 
     * specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. If
     * supports self-configuration capability for {{param}} and more than one item is 
     * configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>timeToTrigger</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getTimeToTrigger();
    
    /**
     * Quantities used to evaluate a measurement report triggering condition. 
     * Corresponds to parameter triggerQuantity specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG.TriggerQuantity</code> <code>triggerQuantity</code>, or <code>null</code> if not present
     */
    TriggerQuantity getTriggerQuantity();
    
    /**
     * Measrument quantities to be included in the measurement report. Corresponds to 
     * parameter reportQuantity specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}. The value {{enum|Both}} specifies that 
     * both the RSRP and RSRQ quantities are to be included in the measurement report.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG.ReportQuantity</code> <code>reportQuantity</code>, or <code>null</code> if not present
     */
    ReportQuantity getReportQuantity();
    
    /**
     * Maximum number of cells that can be included in a measurement report. 
     * Corresponds to parameter maxReportCells specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxReportCells</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxReportCells();
    
    /**
     * Interval between successive measurement reports, specified in {{units}}. 
     * Corresponds to parameter reportInterval specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>reportInterval</code>, or <code>null</code> if not present
     */
    java.lang.Long getReportInterval();
    
    /**
     * Number of times a measurement report is sent. Corresponds to parameter 
     * reportAmount specified in ReportConfigEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}. Value of 0 indicates "infinity."
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>reportAmount</code>, or <code>null</code> if not present
     */
    java.lang.Short getReportAmount();

}

