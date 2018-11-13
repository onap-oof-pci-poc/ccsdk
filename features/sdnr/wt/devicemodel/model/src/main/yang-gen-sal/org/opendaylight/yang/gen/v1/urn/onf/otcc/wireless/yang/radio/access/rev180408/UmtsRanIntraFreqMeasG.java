package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to the intra-freq HO control 
 * parameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-intra-freq-meas-g {
 *     leaf measurement-quantity {
 *         type enumeration;
 *     }
 *     leaf filter-coefficient {
 *         type uint8;
 *     }
 *     leaf-list intra-frequency-event-identity {
 *         type string;
 *     }
 *     leaf-list triggering-condition2-event1a {
 *         type enumeration;
 *     }
 *     leaf-list triggering-condition1-event1b {
 *         type enumeration;
 *     }
 *     leaf-list triggering-condition2-event1e {
 *         type enumeration;
 *     }
 *     leaf-list triggering-condition1-event1f {
 *         type enumeration;
 *     }
 *     leaf reporting-range-event1a {
 *         type reporting-range-event1a;
 *     }
 *     leaf reporting-range-event1b {
 *         type reporting-range-event1b;
 *     }
 *     leaf weighting-factor-event1a {
 *         type uint8;
 *     }
 *     leaf weighting-factor-event1b {
 *         type uint8;
 *     }
 *     leaf report-deactivation-threshold-event1a {
 *         type uint8;
 *     }
 *     leaf reporting-amount-event1a {
 *         type int64;
 *     }
 *     leaf reporting-amount-event1c {
 *         type int64;
 *     }
 *     leaf reporting-interval-event1a {
 *         type reporting-interval-event1a;
 *     }
 *     leaf reporting-interval-event1c {
 *         type reporting-interval-event1c;
 *     }
 *     leaf hysteresis-event1a {
 *         type uint8;
 *     }
 *     leaf hysteresis-event1b {
 *         type uint8;
 *     }
 *     leaf hysteresis-event1c {
 *         type uint8;
 *     }
 *     leaf hysteresis-event1d {
 *         type uint8;
 *     }
 *     leaf hysteresis-event1e {
 *         type uint8;
 *     }
 *     leaf hysteresis-event1f {
 *         type uint8;
 *     }
 *     leaf time-to-trigger-event1a {
 *         type time-to-trigger-event1a;
 *     }
 *     leaf time-to-trigger-event1b {
 *         type time-to-trigger-event1b;
 *     }
 *     leaf time-to-trigger-event1c {
 *         type time-to-trigger-event1c;
 *     }
 *     leaf time-to-trigger-event1d {
 *         type time-to-trigger-event1d;
 *     }
 *     leaf time-to-trigger-event1e {
 *         type time-to-trigger-event1e;
 *     }
 *     leaf time-to-trigger-event1f {
 *         type time-to-trigger-event1f;
 *     }
 *     leaf threshold-used-frequency-event1e {
 *         type int64;
 *     }
 *     leaf threshold-used-frequency-event1f {
 *         type int64;
 *     }
 *     leaf replacement-activation-threshold-event1c {
 *         type uint8;
 *     }
 *     leaf instance-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-intra-freq-meas-g</i>
 *
 */
public interface UmtsRanIntraFreqMeasG
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
    
    public enum TriggeringCondition2Event1a {
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
    
        private static final java.util.Map<java.lang.Integer, TriggeringCondition2Event1a> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TriggeringCondition2Event1a> b = com.google.common.collect.ImmutableMap.builder();
            for (TriggeringCondition2Event1a enumItem : TriggeringCondition2Event1a.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private TriggeringCondition2Event1a(int value, java.lang.String name) {
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
         * @return corresponding TriggeringCondition2Event1a item
         */
        public static TriggeringCondition2Event1a forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum TriggeringCondition1Event1b {
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
        ActiveAndMonitored(3, "active and monitored")
        ;
    
        private static final java.util.Map<java.lang.Integer, TriggeringCondition1Event1b> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TriggeringCondition1Event1b> b = com.google.common.collect.ImmutableMap.builder();
            for (TriggeringCondition1Event1b enumItem : TriggeringCondition1Event1b.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private TriggeringCondition1Event1b(int value, java.lang.String name) {
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
         * @return corresponding TriggeringCondition1Event1b item
         */
        public static TriggeringCondition1Event1b forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum TriggeringCondition2Event1e {
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
    
        private static final java.util.Map<java.lang.Integer, TriggeringCondition2Event1e> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TriggeringCondition2Event1e> b = com.google.common.collect.ImmutableMap.builder();
            for (TriggeringCondition2Event1e enumItem : TriggeringCondition2Event1e.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private TriggeringCondition2Event1e(int value, java.lang.String name) {
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
         * @return corresponding TriggeringCondition2Event1e item
         */
        public static TriggeringCondition2Event1e forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum TriggeringCondition1Event1f {
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
        ActiveAndMonitored(3, "active and monitored")
        ;
    
        private static final java.util.Map<java.lang.Integer, TriggeringCondition1Event1f> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TriggeringCondition1Event1f> b = com.google.common.collect.ImmutableMap.builder();
            for (TriggeringCondition1Event1f enumItem : TriggeringCondition1Event1f.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private TriggeringCondition1Event1f(int value, java.lang.String name) {
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
         * @return corresponding TriggeringCondition1Event1f item
         */
        public static TriggeringCondition1Event1f forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-intra-freq-meas-g").intern();

    /**
     * Defines the measurement quantity for intra-freq HO measurement when the UE is in
     * Cell-DCH state. Enumeration of: {{enum}} {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.38}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG.MeasurementQuantity</code> <code>measurementQuantity</code>, or <code>null</code> if not present
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
     * {{list}} Each entry is an Event ID from the list of: 1a, 1b, 1c, 1d, 1e, 1f, 1g,
     * 1h, 1i Defines the identity of the event used to trigger UE reporting (in case 
     * of event-triggered reporting). {{bibref|3GPP-TS.25.331|Section 10.3.7.34}} Since
     * the FAP can determine this on its own, it might not be necessary to configure 
     * it.
     *
     *
     *
     * @return <code>java.util.List</code> <code>intraFrequencyEventIdentity</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getIntraFrequencyEventIdentity();
    
    /**
     * {{list}} Indicates which cells can trigger Event 1a. {{enum}} 
     * {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>triggeringCondition2Event1a</code>, or <code>null</code> if not present
     */
    List<TriggeringCondition2Event1a> getTriggeringCondition2Event1a();
    
    /**
     * {{list}} Indicates which cells can trigger Event 1b. {{enum}} 
     * {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>triggeringCondition1Event1b</code>, or <code>null</code> if not present
     */
    List<TriggeringCondition1Event1b> getTriggeringCondition1Event1b();
    
    /**
     * {{list}} Indicates which cells can trigger Event 1e. {{enum}} 
     * {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>triggeringCondition2Event1e</code>, or <code>null</code> if not present
     */
    List<TriggeringCondition2Event1e> getTriggeringCondition2Event1e();
    
    /**
     * {{list}} Indicates which cells can trigger Event 1f. {{enum}} 
     * {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>triggeringCondition1Event1f</code>, or <code>null</code> if not present
     */
    List<TriggeringCondition1Event1f> getTriggeringCondition1Event1f();
    
    /**
     * Defines a constant in the inequality criterion that needs to be satisfied for an
     * Event 1a to occur. Actual values of the range are 0.0 to 14.5 {{units}} in steps
     * of 0.5 {{units}}. The value of {{param}} divided by 2 yields the actual value of
     * the range. {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>reportingRangeEvent1a</code>, or <code>null</code> if not present
     */
    java.lang.Short getReportingRangeEvent1a();
    
    /**
     * Defines a constant in the inequality criterion that needs to be satisfied for an
     * Event 1b to occur. Actual values of the range are 0.0 to 14.5 {{units}} in steps
     * of 0.5 {{units}}. The value of {{param}} divided by 2 yields the actual value of
     * the range. {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>reportingRangeEvent1b</code>, or <code>null</code> if not present
     */
    java.lang.Short getReportingRangeEvent1b();
    
    /**
     * Defines the weighting factor for intra-freq HO measurement when the UE is in 
     * Cell-DCH state. Actual values of the weighting factor are 0.0 to 2.0 in steps of
     * 0.1. The value of {{param}} divided by 10 yields the actual value of the 
     * weighting factor. {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>weightingFactorEvent1a</code>, or <code>null</code> if not present
     */
    java.lang.Short getWeightingFactorEvent1a();
    
    /**
     * Defines the weighting factor for intra-freq HO measurement when the UE is in 
     * Cell-DCH state. Actual values of the weighting factor are 0.0 to 2.0 in steps of
     * 0.1. The value of {{param}} divided by 10 yields the actual value of the 
     * weighting factor. {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>weightingFactorEvent1b</code>, or <code>null</code> if not present
     */
    java.lang.Short getWeightingFactorEvent1b();
    
    /**
     * Defines the maximum number of cells allowed in the "active cell set" for Event 
     * 1a to occur. {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>reportDeactivationThresholdEvent1a</code>, or <code>null</code> if not present
     */
    java.lang.Short getReportDeactivationThresholdEvent1a();
    
    /**
     * Defines the maximum number of MEASUREMENT REPORT messages sent by the UE in case
     * of periodic reporting triggered by an Event 1a The value -1 is used to represent
     * an unbounded maximum. {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 
     * 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>reportingAmountEvent1a</code>, or <code>null</code> if not present
     */
    java.lang.Long getReportingAmountEvent1a();
    
    /**
     * Defines the maximum number of MEASUREMENT REPORT messages sent by the UE in case
     * of periodic reporting triggered by an Event 1c The value -1 is used to represent
     * an unbounded maximum. {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 
     * 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>reportingAmountEvent1c</code>, or <code>null</code> if not present
     */
    java.lang.Long getReportingAmountEvent1c();
    
    /**
     * Defines the transmission period in {{units}} of MEASUREMENT REPORT messages sent
     * by the UE in case of periodic reporting triggered by an Event 1a. 
     * {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>reportingIntervalEvent1a</code>, or <code>null</code> if not present
     */
    java.lang.Integer getReportingIntervalEvent1a();
    
    /**
     * Defines the transmission period in {{units}} of MEASUREMENT REPORT messages sent
     * by the UE in case of periodic reporting triggered by an Event 1c. 
     * {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>reportingIntervalEvent1c</code>, or <code>null</code> if not present
     */
    java.lang.Integer getReportingIntervalEvent1c();
    
    /**
     * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresisEvent1a</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresisEvent1a();
    
    /**
     * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresisEvent1b</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresisEvent1b();
    
    /**
     * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresisEvent1c</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresisEvent1c();
    
    /**
     * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresisEvent1d</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresisEvent1d();
    
    /**
     * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresisEvent1e</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresisEvent1e();
    
    /**
     * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresisEvent1f</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresisEvent1f();
    
    /**
     * Defines the time-to-trigger in {{units}} for intra-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent1a</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent1a();
    
    /**
     * Defines the time-to-trigger in {{units}} for intra-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent1b</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent1b();
    
    /**
     * Defines the time-to-trigger in {{units}} for intra-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent1c</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent1c();
    
    /**
     * Defines the time-to-trigger in {{units}} for intra-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent1d</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent1d();
    
    /**
     * Defines the time-to-trigger in {{units}} for intra-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent1e</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent1e();
    
    /**
     * Defines the time-to-trigger in {{units}} for intra-freq HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent1f</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent1f();
    
    /**
     * Defines the reporting threshold for intra-freq HO measurement when the UE is in 
     * Cell-DCH state. This is the "Threshold used frequency" as defined in 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}. Each valid value of 
     * {{param|MeasurementQuantity}} has a different valid range. {{enum|CPICH 
     * RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm {{enum|CPICH 
     * Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB 
     * {{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdUsedFrequencyEvent1e</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdUsedFrequencyEvent1e();
    
    /**
     * Defines the reporting threshold for intra-freq HO measurement when the UE is in 
     * Cell-DCH state. This is the "Threshold used frequency" as defined in 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}. Each valid value of 
     * {{param|MeasurementQuantity}} has a different valid range. {{enum|CPICH 
     * RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm {{enum|CPICH 
     * Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB 
     * {{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdUsedFrequencyEvent1f</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdUsedFrequencyEvent1f();
    
    /**
     * Defines the minimum number of cells allowed in the "active cell set" for Event 
     * 1c to occur. {{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>replacementActivationThresholdEvent1c</code>, or <code>null</code> if not present
     */
    java.lang.Short getReplacementActivationThresholdEvent1c();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>instanceNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getInstanceNumberOfEntries();

}

