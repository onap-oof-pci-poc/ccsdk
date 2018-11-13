package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

/**
 * Policy for selecting traffic for local IP access. Originated traffic will be 
 * NAT'ed. The rule is bi-directional, i.e. return traffic is allowed. Rules do 
 * affect traffic to/from the FAP itself (such as TR-069 or control). The rules 
 * applied to the mobile station data traffic (PS-domain) via deep packet 
 * inspection or similar method.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping access-mgmt-legacy-local-ip-access-rule-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf dest-ip-address {
 *         type ip-address;
 *     }
 *     leaf dest-subnet-mask {
 *         type ip-address;
 *     }
 *     leaf protocol {
 *         type int64;
 *     }
 *     leaf action {
 *         type enumeration;
 *     }
 *     leaf interface {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/access-mgmt-legacy-local-ip-access-rule-g</i>
 *
 */
public interface AccessMgmtLegacyLocalIpAccessRuleG
    extends
    DataObject
{


    public enum Action {
        /**
         * none
         *
         */
        Tunnel(1, "tunnel"),
        
        /**
         * none
         *
         */
        Napt(2, "napt")
        ;
    
        private static final java.util.Map<java.lang.Integer, Action> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Action> b = com.google.common.collect.ImmutableMap.builder();
            for (Action enumItem : Action.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Action(int value, java.lang.String name) {
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
         * @return corresponding Action item
         */
        public static Action forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-legacy-local-ip-access-rule-g").intern();

    /**
     * Enables or disables the forwarding entry.
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
     * Destination IP Address. {{empty}} indicates no destination address is specified.
     * An entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} is 
     * a default route.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>destIpAddress</code>, or <code>null</code> if not present
     */
    IpAddress getDestIpAddress();
    
    /**
     * Destination subnet mask (IPv4) or prefix (IPv6). {{empty}} indicates no 
     * destination subnet mask or prefix is specified. If a destination subnet mask or 
     * prefix is specified, {{param}} is ANDed with the destination address before 
     * comparing with {{param|DestIPAddress}}. Otherwise, the full destination address 
     * is used as-is. An entry for which {{param|DestIPAddress}} and {{param}} are both
     * {{empty}} is a default route.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>destSubnetMask</code>, or <code>null</code> if not present
     */
    IpAddress getDestSubnetMask();
    
    /**
     * IP Protocol Identifier. -1 matches any protocol.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>protocol</code>, or <code>null</code> if not present
     */
    java.lang.Long getProtocol();
    
    /**
     * Action to be taken for traffic matching this rule.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG.Action</code> <code>action</code>, or <code>null</code> if not present
     */
    Action getAction();
    
    /**
     * Specifies the egress interface when {{param|Action}} is set to 
     * {{enum|NAPT|Action}}. {{reference}} layer-3 connection object. Example: 
     * InternetGatewayDevice.LANDevice.{i}.LANEthernetInterfaceConfig.{i}.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>interface</code>, or <code>null</code> if not present
     */
    java.lang.String getInterface();

}

