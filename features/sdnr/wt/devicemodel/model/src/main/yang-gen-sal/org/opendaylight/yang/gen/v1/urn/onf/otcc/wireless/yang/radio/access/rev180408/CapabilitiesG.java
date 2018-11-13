package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to the hardware capabilities of the 
 * device.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping capabilities-g {
 *     leaf gps-equipped {
 *         type boolean;
 *     }
 *     leaf max-tx-power {
 *         type max-tx-power;
 *     }
 *     leaf-list supported-systems {
 *         type enumeration;
 *     }
 *     leaf beacon {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/capabilities-g</i>
 *
 */
public interface CapabilitiesG
    extends
    DataObject
{


    public enum SupportedSystems {
        /**
         * none
         *
         */
        Umts(1, "umts"),
        
        /**
         * none
         *
         */
        Lte(2, "lte"),
        
        /**
         * none
         *
         */
        Cdma1x(3, "cdma1x"),
        
        /**
         * none
         *
         */
        Cdmahrpd(4, "cdmahrpd")
        ;
    
        private static final java.util.Map<java.lang.Integer, SupportedSystems> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, SupportedSystems> b = com.google.common.collect.ImmutableMap.builder();
            for (SupportedSystems enumItem : SupportedSystems.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private SupportedSystems(int value, java.lang.String name) {
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
         * @return corresponding SupportedSystems item
         */
        public static SupportedSystems forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-g").intern();

    /**
     * Indicates whether the FAP is equipped with a GPS receiver or not.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>gpsEquipped</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isGpsEquipped();
    
    /**
     * Indicates the maximum possible transmit power in {{units}} that the FAP hardware
     * can support.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxTxPower</code>, or <code>null</code> if not present
     */
    BigInteger getMaxTxPower();
    
    /**
     * {{list}} Each entry is a type of system that the FAP supports. {{enum}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedSystems</code>, or <code>null</code> if not present
     */
    List<SupportedSystems> getSupportedSystems();
    
    /**
     * Indicates whether FAP can support beacon transmission.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>beacon</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBeacon();

}

