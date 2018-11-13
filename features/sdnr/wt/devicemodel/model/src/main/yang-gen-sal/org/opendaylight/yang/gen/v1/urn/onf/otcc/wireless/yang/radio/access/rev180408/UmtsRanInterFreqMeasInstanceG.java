package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table containing parameters relating to a particular instance of inter-freq 
 * events.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-inter-freq-meas-instance-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf intra-frequency-event-identity {
 *         type enumeration;
 *     }
 *     leaf event-description {
 *         type string;
 *     }
 *     leaf measurement-quantity {
 *         type enumeration;
 *     }
 *     leaf filter-coefficient {
 *         type uint8;
 *     }
 *     leaf weighting-factor {
 *         type uint8;
 *     }
 *     leaf hysteresis {
 *         type uint8;
 *     }
 *     leaf time-to-trigger {
 *         type time-to-trigger;
 *     }
 *     leaf threshold-used-frequency {
 *         type int64;
 *     }
 *     leaf threshold-non-used-frequency {
 *         type int64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-inter-freq-meas-instance-g</i>
 *
 */
public interface UmtsRanInterFreqMeasInstanceG
    extends
    DataObject
{


    public enum IntraFrequencyEventIdentity {
        /**
         * none
         *
         */
        _2a(1, "2a"),
        
        /**
         * none
         *
         */
        _2b(2, "2b"),
        
        /**
         * none
         *
         */
        _2c(3, "2c"),
        
        /**
         * none
         *
         */
        _2d(4, "2d"),
        
        /**
         * none
         *
         */
        _2e(5, "2e"),
        
        /**
         * none
         *
         */
        _2f(6, "2f")
        ;
    
        private static final java.util.Map<java.lang.Integer, IntraFrequencyEventIdentity> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, IntraFrequencyEventIdentity> b = com.google.common.collect.ImmutableMap.builder();
            for (IntraFrequencyEventIdentity enumItem : IntraFrequencyEventIdentity.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private IntraFrequencyEventIdentity(int value, java.lang.String name) {
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
         * @return corresponding IntraFrequencyEventIdentity item
         */
        public static IntraFrequencyEventIdentity forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
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
        "2018-04-08", "umts-ran-inter-freq-meas-instance-g").intern();

    /**
     * Enables or disables this {{object}} entry.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnable();
    
    /**
     * {{datatype|expand}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>alias</code>, or <code>null</code> if not present
     */
    java.lang.String getAlias();
    
    /**
     * Each entry is an Event ID from the list of: {{enum}} Defines the identity of the
     * event used to trigger UE reporting (in case of event-triggered reporting). 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.14}} This attribute is readable, as it is
     * highly dependent on how the FAP makes use of the event.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG.IntraFrequencyEventIdentity</code> <code>intraFrequencyEventIdentity</code>, or <code>null</code> if not present
     */
    IntraFrequencyEventIdentity getIntraFrequencyEventIdentity();
    
    /**
     * A free-form description of the way the event instance is meant to be used. E.g. 
     * "detecting cell edge to prepare for hand-out", "cancel hand-out preparation".
     *
     *
     *
     * @return <code>java.lang.String</code> <code>eventDescription</code>, or <code>null</code> if not present
     */
    java.lang.String getEventDescription();
    
    /**
     * Defines the measurement quantity for inter-freq HO measurement when the UE is in
     * Cell-DCH state. Enumeration of: {{enum}} {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.18}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG.MeasurementQuantity</code> <code>measurementQuantity</code>, or <code>null</code> if not present
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
     * Defines the weighting factor for inter-freq HO measurement when the UE is in 
     * Cell-DCH state. Actual values of the weighting factor are 0.0 to 2.0 in steps of
     * 0.1. The value of {{param}} divided by 10 yields the actual value of the 
     * weighting factor. {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>weightingFactor</code>, or <code>null</code> if not present
     */
    java.lang.Short getWeightingFactor();
    
    /**
     * Defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresis</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresis();
    
    /**
     * Defines the time-to-trigger in {{units}} for inter-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTrigger</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTrigger();
    
    /**
     * Applicable to events 2b, 2d, 2f, otherwise not needed. Defines the reporting 
     * threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This 
     * is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.19}}. Each valid value of {{param|MeasurementQuantity}} has a different 
     * valid range. {{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to 
     * -25 dBm {{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdUsedFrequency</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdUsedFrequency();
    
    /**
     * Applicable to events 2a, 2b, 2c, 2e otherwise not needed. Defines the reporting 
     * threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This 
     * is the "Threshold non used frequency" as defined in 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}. Each valid value of 
     * {{param|MeasurementQuantity}} has a different valid range. {{enum|CPICH 
     * RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm {{enum|CPICH 
     * Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdNonUsedFrequency</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdNonUsedFrequency();

}

