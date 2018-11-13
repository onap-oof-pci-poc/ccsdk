package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the connected mode mobility 
 * (handover) configuration that is common to all inter-RAT handover scenarios 
 * (UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 
 * 6.1.5.2.2}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-conn-mode-irat-g {
 *     leaf-list qoffsett-utra {
 *         type string;
 *     }
 *     leaf-list filter-coefficient-utra {
 *         type string;
 *     }
 *     leaf meas-quantity-utrafdd {
 *         type enumeration;
 *     }
 *     leaf b1-threshold-utrarscp {
 *         type b1-threshold-utrarscp;
 *     }
 *     leaf b1-threshold-utra-ec-n0 {
 *         type b1-threshold-utra-ec-n0;
 *     }
 *     leaf-list qoffset-geran {
 *         type string;
 *     }
 *     leaf-list filter-coefficient-geran {
 *         type string;
 *     }
 *     leaf b1-threshold-geran {
 *         type b1-threshold-geran;
 *     }
 *     leaf-list qoffset-cdma2000 {
 *         type string;
 *     }
 *     leaf meas-quantity-cdma2000 {
 *         type enumeration;
 *     }
 *     leaf b1-threshold-cdma2000 {
 *         type b1-threshold-cdma2000;
 *     }
 *     leaf b2-threshold2-utrarscp {
 *         type b2-threshold2-utrarscp;
 *     }
 *     leaf b2-threshold2-utra-ec-n0 {
 *         type b2-threshold2-utra-ec-n0;
 *     }
 *     leaf b2-threshold2-geran {
 *         type b2-threshold2-geran;
 *     }
 *     leaf b2-threshold2-cdma2000 {
 *         type b2-threshold2-cdma2000;
 *     }
 *     leaf-list hysteresis {
 *         type string;
 *     }
 *     leaf-list time-to-trigger {
 *         type uint16;
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
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-conn-mode-irat-g</i>
 *
 */
public interface LteRanMobilityConnModeIratG
    extends
    DataObject
{


    public enum MeasQuantityUtrafdd {
        /**
         * none
         *
         */
        CpichRscp(1, "cpich-rscp"),
        
        /**
         * none
         *
         */
        CpichEcN0(2, "cpich-ec-n0")
        ;
    
        private static final java.util.Map<java.lang.Integer, MeasQuantityUtrafdd> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, MeasQuantityUtrafdd> b = com.google.common.collect.ImmutableMap.builder();
            for (MeasQuantityUtrafdd enumItem : MeasQuantityUtrafdd.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private MeasQuantityUtrafdd(int value, java.lang.String name) {
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
         * @return corresponding MeasQuantityUtrafdd item
         */
        public static MeasQuantityUtrafdd forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum MeasQuantityCdma2000 {
        /**
         * none
         *
         */
        PilotStrength(1, "pilot-strength"),
        
        /**
         * none
         *
         */
        PilotPnPhaseAndPilotStrength(2, "pilot-pn-phase-and-pilot-strength")
        ;
    
        private static final java.util.Map<java.lang.Integer, MeasQuantityCdma2000> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, MeasQuantityCdma2000> b = com.google.common.collect.ImmutableMap.builder();
            for (MeasQuantityCdma2000 enumItem : MeasQuantityCdma2000.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private MeasQuantityCdma2000(int value, java.lang.String name) {
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
         * @return corresponding MeasQuantityCdma2000 item
         */
        public static MeasQuantityCdma2000 forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-conn-mode-irat-g").intern();

    /**
     * {{list}} Each item is a UTRA-specific offset to be applied when evaluating 
     * triggering conditions for measurement reporting in connected mode, with a 
     * numeric range between -15 and 15 inclusive. In case there is more than one item 
     * in the list, the first item contains the most preferred value. Corresponds to 
     * parameter offsetFreq included in the IE MeasObjectUTRA specified in 
     * {{bibref|3GPP-TS.36.331}}. The multiplicity of the {{param}} values can also be 
     * expressed by defining a range using ".." (two periods) between two values. In 
     * this case, the combination of two values defines the lower-bound and upper-bound
     * of the range inclusive. If this notation is used, then the list contains at 
     * least 2 items: 
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
     * @return <code>java.util.List</code> <code>qoffsettUtra</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQoffsettUtra();
    
    /**
     * {{list}} Each item is a filtering coefficient used for UTRA measurements, with a
     * numeric range between 0 and 19 inclusive. For values greater than 9, only odd 
     * values are valid. If the value is other than these, the CPE MUST reject the 
     * value. In case there is more than one item in the list, the first item contains 
     * the most preferred value. Corresponds to filterCoefficient parameter specified 
     * in QuantityConfigUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. The 
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
     * @return <code>java.util.List</code> <code>filterCoefficientUtra</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getFilterCoefficientUtra();
    
    /**
     * Measurement quantity used for UTRA measurements. Corresponds to 
     * measQuantityUTRA-FDD parameter specified in QuantityConfigUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG.MeasQuantityUtrafdd</code> <code>measQuantityUtrafdd</code>, or <code>null</code> if not present
     */
    MeasQuantityUtrafdd getMeasQuantityUtrafdd();
    
    /**
     * RSCP threshold to be used in UTRA measurement report triggering condition for 
     * event B1. Mapping to actual {{units}} values is specified in 3GPP TS 25.133}}. 
     * Corresponds to parameter b1-ThresholdUTRA:utra-RSCP specified in 
     * ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>b1ThresholdUtrarscp</code>, or <code>null</code> if not present
     */
    java.lang.Long getB1ThresholdUtrarscp();
    
    /**
     * EcNo threshold to be used in UTRA measurement report triggering condition for 
     * event B1. Mapping to actual {{units}} values is specified in 3GPP TS 25.133}}. 
     * Corresponds to parameter b1-ThresholdUTRA:utra-EcNo specified in 
     * ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>b1ThresholdUtraEcN0</code>, or <code>null</code> if not present
     */
    java.lang.Short getB1ThresholdUtraEcN0();
    
    /**
     * {{list}} Each item is a GERAN-specific offset to be applied when evaluating 
     * triggering conditions for measurement reporting in connected mode, with a 
     * numeric range between -15 and 15 inclusive. In case there is more than one item 
     * in the list, the first item contains the most preferred value. Corresponds to 
     * parameter offsetFreq included in the IE MeasObjectGERAN specified in 
     * {{bibref|3GPP-TS.36.331}}. The multiplicity of the {{param}} values can also be 
     * expressed by defining a range using ".." (two periods) between two values. In 
     * this case, the combination of two values defines the lower-bound and upper-bound
     * of the range inclusive. If this notation is used, then the list contains at 
     * least 2 items: 
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
     * @return <code>java.util.List</code> <code>qoffsetGeran</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQoffsetGeran();
    
    /**
     * {{list}} Each item is a filtering coefficient used for GERAN measurements, with 
     * a numeric range between 0 and 19 inclusive. For values greater than 9, only odd 
     * values are valid. If the value is other than these, the CPE MUST reject the 
     * value. In case there is more than one item in the list, the first item contains 
     * the most preferred value. Corresponds to filterCoefficient parameter specified 
     * in QuantityConfigGERAN IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. The 
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
     * @return <code>java.util.List</code> <code>filterCoefficientGeran</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getFilterCoefficientGeran();
    
    /**
     * Threshold to be used in GERAN measurement report triggering condition for event 
     * B1. Mapping to actual {{units}} values is specified in 3GPP TS 45.008}}. 
     * Corresponds to parameter b1-ThresholdGERAN specified in ReportConfigInterRAT IE 
     * in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>b1ThresholdGeran</code>, or <code>null</code> if not present
     */
    java.lang.Short getB1ThresholdGeran();
    
    /**
     * {{list}} Each item is a CDMA2000-specific offset to be applied when evaluating 
     * triggering conditions for measurement reporting in connected mode, with a 
     * numeric range between -15 and 15 inclusive. In case there is more than one item 
     * in the list, the first item contains the most preferred value. Corresponds to 
     * parameter offsetFreq included in the IE MeasObjectCDMA2000 specified in 
     * {{bibref|3GPP-TS.36.331}}. The multiplicity of the {{param}} values can also be 
     * expressed by defining a range using ".." (two periods) between two values. In 
     * this case, the combination of two values defines the lower-bound and upper-bound
     * of the range inclusive. If this notation is used, then the list contains at 
     * least 2 items: 
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
     * @return <code>java.util.List</code> <code>qoffsetCdma2000</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQoffsetCdma2000();
    
    /**
     * Measurement quantity used for CDMA2000 measurements. Corresponds to 
     * measQuantityCDMA2000 parameter specified in QuantityConfigCDMA2000 IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG.MeasQuantityCdma2000</code> <code>measQuantityCdma2000</code>, or <code>null</code> if not present
     */
    MeasQuantityCdma2000 getMeasQuantityCdma2000();
    
    /**
     * Threshold to be used in CDMA2000 measurement report triggering condition for 
     * event B1. Mapping to actual {{units}} values is specified in 
     * {{bibref|3GPP-TS.45.008}}. Corresponds to parameter b1-ThresholdCDMA2000 
     * specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>b1ThresholdCdma2000</code>, or <code>null</code> if not present
     */
    java.lang.Short getB1ThresholdCdma2000();
    
    /**
     * RSCP threshold to be used in UTRA measurement report triggering condition for 
     * event B2. Mapping to actual {{units}} values is specified in 
     * {{bibref|3GPP-TS.25.133}}. Corresponds to parameter b2-Threshold2UTRA:utra-RSCP 
     * specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>b2Threshold2Utrarscp</code>, or <code>null</code> if not present
     */
    java.lang.Long getB2Threshold2Utrarscp();
    
    /**
     * EcNo threshold to be used in UTRA measurement report triggering condition for 
     * event B2. Mapping to actual {{units}} values is specified in 3GPP TS 25.133}}. 
     * Corresponds to parameter b2-Threshold2UTRA:utra-EcNo specified in 
     * ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>b2Threshold2UtraEcN0</code>, or <code>null</code> if not present
     */
    java.lang.Short getB2Threshold2UtraEcN0();
    
    /**
     * Threshold to be used in GERAN measurement report triggering condition for event 
     * B2. Mapping to actual {{units}} values is specified in 3GPP TS 45.008}}. 
     * Corresponds to parameter b2-Threshold2GERAN specified in ReportConfigInterRAT IE
     * in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>b2Threshold2Geran</code>, or <code>null</code> if not present
     */
    java.lang.Short getB2Threshold2Geran();
    
    /**
     * Threshold to be used in CDMA2000 measurement report triggering condition for 
     * event B2. Mapping to actual {{units}} values is specified in 3GPP TS 45.008}}. 
     * Corresponds to parameter b2-Threshold2CDMA2000 specified in ReportConfigInterRAT
     * IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>b2Threshold2Cdma2000</code>, or <code>null</code> if not present
     */
    java.lang.Short getB2Threshold2Cdma2000();
    
    /**
     * {{list}} Each item is a hysteresis value applied to entry and leave condition of
     * an IRAT report triggering event, with a numeric range between 0 and 30 
     * inclusive. In case there is more than one item in the list, the first item 
     * contains the most preferred value. Corresponds to parameter hysteresis specified
     * in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. The 
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
     * {{list}} Each item is a time period during which IRAT measurement report 
     * triggering condition needs to be met in order to trigger IRAT measurement 
     * report, specified in milliseconds. In case there is more than one item in the 
     * list, the first item contains the most preferred value.. Corresponds to 
     * parameter timeToTrigger specified in ReportConfigInterRAT IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}. If supports self-configuration 
     * capability for {{param}} and more than one item is configured, then is expected 
     * to select one from the list and overwrite this parameter containing only the one
     * selected. If does not support self-configuration capability for {{param}} and 
     * more than one item is configured, then accepts the first value and ignore the 
     * rest. If only one item is configured regardless of the self-configuration 
     * capability of , accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>timeToTrigger</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getTimeToTrigger();
    
    /**
     * Maximum number of IRAT cells that can be included in a measurement report. 
     * Corresponds to parameter maxReportCells specified in ReportConfigInterRAT IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxReportCells</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxReportCells();
    
    /**
     * Interval between successive IRAT measurement reports, specified in {{units}}. 
     * Corresponds to parameter reportInterval specified in ReportConfigInterRAT IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>reportInterval</code>, or <code>null</code> if not present
     */
    java.lang.Long getReportInterval();
    
    /**
     * Number of times an IRAT measurement report is sent. Corresponds to parameter 
     * reportAmount specified in ReportConfigInterRAT IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}. Value of 0 indicates "infinity."
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>reportAmount</code>, or <code>null</code> if not present
     */
    java.lang.Short getReportAmount();

}

