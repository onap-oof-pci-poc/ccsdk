package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to configuring QoS in LTE EPC.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-epc-qo-s-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf qci {
 *         type uint8;
 *     }
 *     leaf type {
 *         type enumeration;
 *     }
 *     leaf priority {
 *         type uint8;
 *     }
 *     leaf packet-delay-budget {
 *         type packet-delay-budget;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-epc-qo-s-g</i>
 *
 */
public interface LteEpcQoSG
    extends
    DataObject
{


    public enum Type {
        /**
         * none
         *
         */
        Gbr(1, "gbr"),
        
        /**
         * none
         *
         */
        NonGbr(2, "non-gbr")
        ;
    
        private static final java.util.Map<java.lang.Integer, Type> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Type> b = com.google.common.collect.ImmutableMap.builder();
            for (Type enumItem : Type.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Type(int value, java.lang.String name) {
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
         * @return corresponding Type item
         */
        public static Type forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-epc-qo-s-g").intern();

    /**
     * Enables or disables this entry.
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
     * QoS class identity as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qci</code>, or <code>null</code> if not present
     */
    java.lang.Short getQci();
    
    /**
     * Defines the type of the QoS class as defined in {{bibref|3GPP-TS.23.203|Section 
     * 6.1.7.2}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG.Type</code> <code>type</code>, or <code>null</code> if not present
     */
    Type getType();
    
    /**
     * Priority of the QoS class as defined in {{bibref|3GPP-TS.23.203|Section 
     * 6.1.7.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>priority</code>, or <code>null</code> if not present
     */
    java.lang.Short getPriority();
    
    /**
     * Defines the Packet delay budget, specified in {{units}}, as defined in 
     * {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>packetDelayBudget</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPacketDelayBudget();

}

