package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to state management and provisioning 
 * aspects of the FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-g {
 *     leaf-list self-config-events {
 *         type enumeration;
 *     }
 *     leaf enclosure-tampering-detected {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-g</i>
 *
 */
public interface FapControlG
    extends
    DataObject
{


    public enum SelfConfigEvents {
        /**
         * none
         *
         */
        InitialRem(1, "initial-rem")
        ;
    
        private static final java.util.Map<java.lang.Integer, SelfConfigEvents> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, SelfConfigEvents> b = com.google.common.collect.ImmutableMap.builder();
            for (SelfConfigEvents enumItem : SelfConfigEvents.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private SelfConfigEvents(int value, java.lang.String name) {
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
         * @return corresponding SelfConfigEvents item
         */
        public static SelfConfigEvents forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-g").intern();

    /**
     * {{list}} Each item is an event that causes the FAP to perform self configuration
     * as defined by {{object|.FAPControl.UMTS.SelfConfig.}}, 
     * {{object|.FAPControl.CDMA2000.OneX.SelfConfig.}}, or 
     * {{object|.FAPControl.CDMA2000.HRPD.SelfConfig.}}. Vendors can extend the 
     * enumerated values with vendor-specific extensions, in which case the rules 
     * outlined in {{bibref|TR-106a2|Section3.3}} MUST be adhered to.
     *
     *
     *
     * @return <code>java.util.List</code> <code>selfConfigEvents</code>, or <code>null</code> if not present
     */
    List<SelfConfigEvents> getSelfConfigEvents();
    
    /**
     * This parameter indicates whether or not physical tampering of the device 
     * enclosure occurred, such as illegal opening of the box. If {{true}} device 
     * tampering is detected. If {{false}} no sign of device tampering is detected. 
     * Tampering state MUST be persisted across reboots and the device MUST never reset
     * it back from {{true}} to {{false}} even after a factory reset.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enclosureTamperingDetected</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnclosureTamperingDetected();

}

