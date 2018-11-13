package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The Femto Access Point (FAP) Service Object.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-service-g {
 *     leaf alias {
 *         type string;
 *     }
 *     leaf device-type {
 *         type enumeration;
 *     }
 *     leaf dn-prefix {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service-g</i>
 *
 */
public interface FapServiceG
    extends
    DataObject
{


    public enum DeviceType {
        /**
         * none
         *
         */
        Standalone(1, "standalone"),
        
        /**
         * none
         *
         */
        Integrated(2, "integrated")
        ;
    
        private static final java.util.Map<java.lang.Integer, DeviceType> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DeviceType> b = com.google.common.collect.ImmutableMap.builder();
            for (DeviceType enumItem : DeviceType.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private DeviceType(int value, java.lang.String name) {
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
         * @return corresponding DeviceType item
         */
        public static DeviceType forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-service-g").intern();

    /**
     * {{datatype|expand}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>alias</code>, or <code>null</code> if not present
     */
    java.lang.String getAlias();
    
    /**
     * The type of FAP device.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceG.DeviceType</code> <code>deviceType</code>, or <code>null</code> if not present
     */
    DeviceType getDeviceType();
    
    /**
     * The Distinguished Name prefix (DNPrefix) is an operator-configurable prefix 
     * string that is pre-pended to object distinguished names in the 
     * {{bibref|TR-157a5}} alarm object. See {{bibref|3GPP-TS.32.300}} for the formal 
     * definition and examples of DNPrefix as applied to 3GPP alarm objects
     *
     *
     *
     * @return <code>java.lang.String</code> <code>dnPrefix</code>, or <code>null</code> if not present
     */
    java.lang.String getDnPrefix();

}

