package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * Table containing parameters relating to a particular instance of intra-freq 
 * events.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-intra-freq-meas-instance-g {
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
 *     leaf-list triggering-condition {
 *         type enumeration;
 *     }
 *     leaf reporting-range {
 *         type reporting-range;
 *     }
 *     leaf weighting-factor {
 *         type uint8;
 *     }
 *     leaf report-deactivation-threshold {
 *         type uint8;
 *     }
 *     leaf reporting-amount {
 *         type int64;
 *     }
 *     leaf reporting-interval {
 *         type reporting-interval;
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
 *     leaf replacement-activation-threshold {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-intra-freq-meas-instance-g</i>
 *
 */
public interface UmtsRanIntraFreqMeasInstanceG
    extends
    DataObject
{


    public enum IntraFrequencyEventIdentity {
        /**
         * none
         *
         */
        _1a(1, "1a"),
        
        /**
         * none
         *
         */
        _1b(2, "1b"),
        
        /**
         * none
         *
         */
        _1c(3, "1c"),
        
        /**
         * none
         *
         */
        _1d(4, "1d"),
        
        /**
         * none
         *
         */
        _1e(5, "1e"),
        
        /**
         * none
         *
         */
        _1f(6, "1f")
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
        CpichRscp(2, "cpich rscp"),
        
        /**
         * none
         *
         */
        Pathloss(3, "pathloss")
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
    
    public enum TriggeringCondition {
        /**
         * none
         *
         */
        Active(1, "active"),
        
        /**
         * none
         *
         */
        Monitored(2, "monitored"),
        
        /**
         * none
         *
         */
        ActiveAndMonitored(3, "active and monitored"),
        
        /**
         * none
         *
         */
        Detected(4, "detected"),
        
        /**
         * none
         *
         */
        DetectedAndMonitored(5, "detected and monitored")
        ;
    
        private static final java.util.Map<java.lang.Integer, TriggeringCondition> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TriggeringCondition> b = com.google.common.collect.ImmutableMap.builder();
            for (TriggeringCondition enumItem : TriggeringCondition.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private TriggeringCondition(int value, java.lang.String name) {
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
         * @return corresponding TriggeringCondition item
         */
        public static TriggeringCondition forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-intra-freq-meas-instance-g").intern();

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
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.34}} This attribute is readable, as it is
     * highly dependent on how the FAP makes use of the event.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG.IntraFrequencyEventIdentity</code> <code>intraFrequencyEventIdentity</code>, or <code>null</code> if not present
     */
    IntraFrequencyEventIdentity getIntraFrequencyEventIdentity();
    
    /**
     * A free-form description of the way the event instance is meant to be used. E.g. 
     * "hand-out to macro cells", "addition of enterprise HNB cell to Active Set".
     *
     *
     *
     * @return <code>java.lang.String</code> <code>eventDescription</code>, or <code>null</code> if not present
     */
    java.lang.String getEventDescription();
    
    /**
     * Defines the measurement quantity for intra-freq HO measurement when the UE is in
     * Cell-DCH state. Enumeration of: {{enum}} {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.38}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG.MeasurementQuantity</code> <code>measurementQuantity</code>, or <code>null</code> if not present
     */
    MeasurementQuantity getMeasurementQuantity();
    
    /**
     * Defines the equivalent time constant of the low pass filter applied to the CPICH
     * quality measurements, or {{enum|CPICH Ec/No|MeasurementQuantity}}. 
     * {{bibref|3GPP-TS.25.331|Section 8.6.7.2 and Section 10.3.7.9}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>filterCoefficient</code>, or <code>null</code> if not present
     */
    java.lang.Short getFilterCoefficient();
    
    /**
     * {{list}} Indicates which cells can trigger the event instance. {{enum}} 
     * {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>triggeringCondition</code>, or <code>null</code> if not present
     */
    List<TriggeringCondition> getTriggeringCondition();
    
    /**
     * Applicable to events 1a, 1b, otherwise not needed. Defines a constant in the 
     * inequality criterion that needs to be satisfied for an Event 1b to occur. Actual
     * values of the range are 0.0 to 14.5 {{units}} in steps of 0.5 {{units}}. The 
     * value of {{param}} divided by 2 yields the actual value of the range. 
     * {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>reportingRange</code>, or <code>null</code> if not present
     */
    java.lang.Short getReportingRange();
    
    /**
     * Applicable to events 1a, 1b, otherwise not needed. Defines the weighting factor 
     * for intra-freq HO measurement when the UE is in Cell-DCH state. Actual values of
     * the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} 
     * divided by 10 yields the actual value of the weighting factor. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>weightingFactor</code>, or <code>null</code> if not present
     */
    java.lang.Short getWeightingFactor();
    
    /**
     * Applicable to events 1a, otherwise not needed. Defines the maximum number of 
     * cells allowed in the "active cell set" for Event 1a to occur. 
     * {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>reportDeactivationThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Short getReportDeactivationThreshold();
    
    /**
     * Applicable to events 1a, 1c, otherwise not needed. Defines the maximum number of
     * MEASUREMENT REPORT messages sent by the UE in case of periodic reporting 
     * triggered by an Event 1a The value -1 is used to represent an unbounded maximum.
     * {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>reportingAmount</code>, or <code>null</code> if not present
     */
    java.lang.Long getReportingAmount();
    
    /**
     * Applicable to events 1a, 1c, otherwise not needed. Defines the transmission 
     * period in {{units}} of MEASUREMENT REPORT messages sent by the UE in case of 
     * periodic reporting triggered by an Event 1a. {{bibref|3GPP-TS.25.331|Section 
     * 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>reportingInterval</code>, or <code>null</code> if not present
     */
    java.lang.Integer getReportingInterval();
    
    /**
     * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresis</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresis();
    
    /**
     * Defines the time-to-trigger in {{units}} for intra-freq HO measurement when the 
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
     * Applicable to events 1e, 1f, otherwise not needed. Defines the reporting 
     * threshold for intra-freq HO measurement when the UE is in Cell-DCH state. This 
     * is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.39}}. Each valid value of {{param|MeasurementQuantity}} has a different 
     * valid range. {{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to 
     * -25 dBm {{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB 
     * {{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdUsedFrequency</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdUsedFrequency();
    
    /**
     * Applicable only to event 1c Defines the minimum number of cells allowed in the 
     * "active cell set" for Event 1c to occur. {{bibref|3GPP-TS.25.331|Section 14.1.2 
     * and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>replacementActivationThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Short getReplacementActivationThreshold();

}

