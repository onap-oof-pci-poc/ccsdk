package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the Gateways that the LTE FAP is 
 * connected to.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-lte-gateway-g {
 *     leaf sec-gw-server1 {
 *         type string;
 *     }
 *     leaf sec-gw-server2 {
 *         type string;
 *     }
 *     leaf sec-gw-server3 {
 *         type string;
 *     }
 *     leaf-list s1-sig-link-server-list {
 *         type string;
 *     }
 *     leaf s1-connection-mode {
 *         type enumeration;
 *     }
 *     leaf s1-sig-link-port {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-lte-gateway-g</i>
 *
 */
public interface FapControlLteGatewayG
    extends
    DataObject
{


    public enum S1ConnectionMode {
        /**
         * none
         *
         */
        One(1, "one"),
        
        /**
         * none
         *
         */
        All(2, "all")
        ;
    
        private static final java.util.Map<java.lang.Integer, S1ConnectionMode> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, S1ConnectionMode> b = com.google.common.collect.ImmutableMap.builder();
            for (S1ConnectionMode enumItem : S1ConnectionMode.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private S1ConnectionMode(int value, java.lang.String name) {
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
         * @return corresponding S1ConnectionMode item
         */
        public static S1ConnectionMode forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-lte-gateway-g").intern();

    /**
     * First SecGW the LTE FAP attempts to establish connection with. Either hostname 
     * or IPaddress.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>secGwServer1</code>, or <code>null</code> if not present
     */
    java.lang.String getSecGwServer1();
    
    /**
     * Second SecGW the LTE FAP attempts to establish connection with. Either hostname 
     * or IPaddress.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>secGwServer2</code>, or <code>null</code> if not present
     */
    java.lang.String getSecGwServer2();
    
    /**
     * Third SecGW the LTE FAP attempts to establish connection with. Either hostname 
     * or IPaddress.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>secGwServer3</code>, or <code>null</code> if not present
     */
    java.lang.String getSecGwServer3();
    
    /**
     * {{list}} Each item is a S1 signaling connection end point (-GW or MME) the LTE 
     * FAP attempts to establish connection with. It is in the form of either hostname 
     * or IPaddress. LTE FAP's behavior in terms of the number of S1 connection to 
     * established with is determined by {{param|S1ConnectionMode}} parameter. If 
     * {{param|S1ConnectionMode}} has the value of {{enum|One|S1ConnectionMode}}, then 
     * LTE FAP attempts to establish S1 connection with only one address following the 
     * ordering of the list. If {{param|S1ConnectionMode}} has the value of 
     * {{enum|All|S1ConnectionMode}}, then LTE FAP attempts to establish connection 
     * with all addresses in the list.
     *
     *
     *
     * @return <code>java.util.List</code> <code>s1SigLinkServerList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getS1SigLinkServerList();
    
    /**
     * Indicates how many of the configured far-end S1 link address(es),as defined in 
     * {{param|S1SigLinkServerList}}, LTE FAP SHOULD attempt to establish connection 
     * with simultaneously. If {{param}} parameter is not explicitly configured, then 
     * LTE FAP shall assume the value to be {{enum|One|S1ConnectionMode}} as default.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG.S1ConnectionMode</code> <code>s1ConnectionMode</code>, or <code>null</code> if not present
     */
    S1ConnectionMode getS1ConnectionMode();
    
    /**
     * Port number of S1AP signaling connection end point (-GW or MME) used for initial
     * S1 SCTP contact. This value is specified as 36412 according to IANA definition 
     * per {{bibref|IANA-portnumbers}}, registered on 2009-09-01. Use of IANA-defined 
     * value is recommended.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>s1SigLinkPort</code>, or <code>null</code> if not present
     */
    java.lang.Integer getS1SigLinkPort();

}

