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
 * grouping umts-ran-inter-rat-meas-instance-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf inter-rat-event-identity {
 *         type enumeration;
 *     }
 *     leaf event-description {
 *         type string;
 *     }
 *     leaf filter-coefficient {
 *         type uint8;
 *     }
 *     leaf bsic-verification-required {
 *         type boolean;
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
 *     leaf threshold-own-system {
 *         type int64;
 *     }
 *     leaf threshold-other-system {
 *         type int64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-inter-rat-meas-instance-g</i>
 *
 */
public interface UmtsRanInterRatMeasInstanceG
    extends
    DataObject
{


    public enum InterRatEventIdentity {
        /**
         * none
         *
         */
        _3a(1, "3a"),
        
        /**
         * none
         *
         */
        _3b(2, "3b"),
        
        /**
         * none
         *
         */
        _3c(3, "3c"),
        
        /**
         * none
         *
         */
        _3d(4, "3d")
        ;
    
        private static final java.util.Map<java.lang.Integer, InterRatEventIdentity> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, InterRatEventIdentity> b = com.google.common.collect.ImmutableMap.builder();
            for (InterRatEventIdentity enumItem : InterRatEventIdentity.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private InterRatEventIdentity(int value, java.lang.String name) {
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
         * @return corresponding InterRatEventIdentity item
         */
        public static InterRatEventIdentity forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-inter-rat-meas-instance-g").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasInstanceG.InterRatEventIdentity</code> <code>interRatEventIdentity</code>, or <code>null</code> if not present
     */
    InterRatEventIdentity getInterRatEventIdentity();
    
    /**
     * A free-form description of the way the event instance is meant to be used. E.g. 
     * "hand-out to GSM macrocell", "cancel hand-out preparation due to decreasing 
     * macrocell quality".
     *
     *
     *
     * @return <code>java.lang.String</code> <code>eventDescription</code>, or <code>null</code> if not present
     */
    java.lang.String getEventDescription();
    
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
     * Applicable only to GSM events. Indicates whether the BSIC verification is 
     * required or not for inter-RAT HO measurement when the UE is in Cell-DCH state. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.29}}
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>bsicVerificationRequired</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBsicVerificationRequired();
    
    /**
     * Defines the weighting factor for inter-RAT HO measurement when the UE is in 
     * Cell-DCH state. Actual values of the weighting factor are 0.0 to 2.0 in steps of
     * 0.1. The value of {{param}} divided by 10 yields the actual value of the 
     * weighting factor. {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>weightingFactor</code>, or <code>null</code> if not present
     */
    java.lang.Short getWeightingFactor();
    
    /**
     * Defines the hysteresis for inter-RAT HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresis</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresis();
    
    /**
     * Defines the time-to-trigger in {{units}} for inter-RAT HO measurement when the 
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
     * Applicable only to event 3a, otherwise not needed. Defines the reporting 
     * threshold for inter-RAT HO measurement when the UE is in Cell-DCH state. This is
     * the "Threshold own system" as defined in {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.30}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdOwnSystem</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdOwnSystem();
    
    /**
     * Applicable to events 3a, 3b, 3c, otherwise not needed. Defines the reporting 
     * threshold for inter-RAT HO measurement when the UE is in Cell-DCH state. This is
     * the "Threshold other system" as defined in {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.30}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdOtherSystem</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdOtherSystem();

}

