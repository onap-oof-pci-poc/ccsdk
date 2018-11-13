package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to the inter-freq HO related control 
 * parameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-inter-freq-meas-g {
 *     leaf measurement-quantity {
 *         type enumeration;
 *     }
 *     leaf filter-coefficient {
 *         type uint8;
 *     }
 *     leaf-list inter-frequency-event-identity {
 *         type string;
 *     }
 *     leaf weighting-factor-event2a {
 *         type uint8;
 *     }
 *     leaf weighting-factor-event2b {
 *         type uint8;
 *     }
 *     leaf weighting-factor-event2d {
 *         type uint8;
 *     }
 *     leaf weighting-factor-event2f {
 *         type uint8;
 *     }
 *     leaf hysteresis-event2a {
 *         type uint8;
 *     }
 *     leaf hysteresis-event2b {
 *         type uint8;
 *     }
 *     leaf hysteresis-event2d {
 *         type uint8;
 *     }
 *     leaf hysteresis-event2f {
 *         type uint8;
 *     }
 *     leaf time-to-trigger-event2a {
 *         type time-to-trigger-event2a;
 *     }
 *     leaf time-to-trigger-event2b {
 *         type time-to-trigger-event2b;
 *     }
 *     leaf time-to-trigger-event2d {
 *         type time-to-trigger-event2d;
 *     }
 *     leaf time-to-trigger-event2f {
 *         type time-to-trigger-event2f;
 *     }
 *     leaf threshold-used-frequency-event2b {
 *         type int64;
 *     }
 *     leaf threshold-used-frequency-event2d {
 *         type int64;
 *     }
 *     leaf threshold-used-frequency-event2f {
 *         type int64;
 *     }
 *     leaf instance-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-inter-freq-meas-g</i>
 *
 */
public interface UmtsRanInterFreqMeasG
    extends
    DataObject
{


    public enum MeasurementQuantity {
        /**
         * none
         *
         */
        CpichEcNo(1, "cpich ec/no"),
        
        /**
         * none
         *
         */
        CpichRscp(2, "cpich rscp")
        ;
    
        private static final java.util.Map<java.lang.Integer, MeasurementQuantity> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, MeasurementQuantity> b = com.google.common.collect.ImmutableMap.builder();
            for (MeasurementQuantity enumItem : MeasurementQuantity.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private MeasurementQuantity(int value, java.lang.String name) {
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
         * @return corresponding MeasurementQuantity item
         */
        public static MeasurementQuantity forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-inter-freq-meas-g").intern();

    /**
     * Defines the measurement quantity for inter-freq HO measurement when the UE is in
     * Cell-DCH state. Enumeration of: {{enum}} {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.18}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG.MeasurementQuantity</code> <code>measurementQuantity</code>, or <code>null</code> if not present
     */
    MeasurementQuantity getMeasurementQuantity();
    
    /**
     * Defines the filter coefficient for inter-freq HO measurement when the UE is in 
     * Cell-DCH state. {{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.18}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>filterCoefficient</code>, or <code>null</code> if not present
     */
    java.lang.Short getFilterCoefficient();
    
    /**
     * {{list}} Each entry is an Event ID from the list of: 2a, 2b, 2c, 2d, 2e,2f 
     * Defines the identity of the event used to trigger inter-frequency UE reporting 
     * (in case of event-triggered reporting). {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.14}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>interFrequencyEventIdentity</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getInterFrequencyEventIdentity();
    
    /**
     * Defines the weighting factor for inter-freq HO measurement when the UE is in 
     * Cell-DCH state. Actual values of the weighting factor are 0.0 to 2.0 in steps of
     * 0.1. The value of {{param}} divided by 10 yields the actual value of the 
     * weighting factor. {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>weightingFactorEvent2a</code>, or <code>null</code> if not present
     */
    java.lang.Short getWeightingFactorEvent2a();
    
    /**
     * Defines the weighting factor for inter-freq HO measurement when the UE is in 
     * Cell-DCH state. Actual values of the weighting factor are 0.0 to 2.0 in steps of
     * 0.1. The value of {{param}} divided by 10 yields the actual value of the 
     * weighting factor. {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>weightingFactorEvent2b</code>, or <code>null</code> if not present
     */
    java.lang.Short getWeightingFactorEvent2b();
    
    /**
     * Defines the weighting factor for inter-freq HO measurement when the UE is in 
     * Cell-DCH state. Actual values of the weighting factor are 0.0 to 2.0 in steps of
     * 0.1. The value of {{param}} divided by 10 yields the actual value of the 
     * weighting factor. {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>weightingFactorEvent2d</code>, or <code>null</code> if not present
     */
    java.lang.Short getWeightingFactorEvent2d();
    
    /**
     * Defines the weighting factor for inter-freq HO measurement when the UE is in 
     * Cell-DCH state. Actual values of the weighting factor are 0.0 to 2.0 in steps of
     * 0.1. The value of {{param}} divided by 10 yields the actual value of the 
     * weighting factor. {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>weightingFactorEvent2f</code>, or <code>null</code> if not present
     */
    java.lang.Short getWeightingFactorEvent2f();
    
    /**
     * Defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresisEvent2a</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresisEvent2a();
    
    /**
     * Defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresisEvent2b</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresisEvent2b();
    
    /**
     * Defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresisEvent2d</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresisEvent2d();
    
    /**
     * Defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresisEvent2f</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresisEvent2f();
    
    /**
     * Defines the time-to-trigger in {{units}} for inter-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent2a</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent2a();
    
    /**
     * Defines the time-to-trigger in {{units}} for inter-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent2b</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent2b();
    
    /**
     * Defines the time-to-trigger in {{units}} for inter-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent2d</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent2d();
    
    /**
     * Defines the time-to-trigger in {{units}} for inter-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent2f</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent2f();
    
    /**
     * Defines the reporting threshold for inter-freq HO measurement when the UE is in 
     * Cell-DCH state. This is the "Threshold used frequency" as defined in 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}. Each valid value of 
     * {{param|MeasurementQuantity}} has a different valid range. {{enum|CPICH 
     * RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm {{enum|CPICH 
     * Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdUsedFrequencyEvent2b</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdUsedFrequencyEvent2b();
    
    /**
     * Defines the reporting threshold for inter-freq HO measurement when the UE is in 
     * Cell-DCH state. This is the "Threshold used frequency" as defined in 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}. Each valid value of 
     * {{param|MeasurementQuantity}} has a different valid range. {{enum|CPICH 
     * RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm {{enum|CPICH 
     * Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdUsedFrequencyEvent2d</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdUsedFrequencyEvent2d();
    
    /**
     * Defines the reporting threshold for inter-freq HO measurement when the UE is in 
     * Cell-DCH state. This is the "Threshold used frequency" as defined in 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}. Each valid value of 
     * {{param|MeasurementQuantity}} has a different valid range. {{enum|CPICH 
     * RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm {{enum|CPICH 
     * Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdUsedFrequencyEvent2f</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdUsedFrequencyEvent2f();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>instanceNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getInstanceNumberOfEntries();

}

