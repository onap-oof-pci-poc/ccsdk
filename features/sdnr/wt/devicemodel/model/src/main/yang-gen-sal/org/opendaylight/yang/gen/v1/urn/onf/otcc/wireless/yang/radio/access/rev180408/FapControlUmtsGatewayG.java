package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the Gateways that FAP is connected 
 * to.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-umts-gateway-g {
 *     leaf sec-gw-server1 {
 *         type string;
 *     }
 *     leaf sec-gw-server2 {
 *         type string;
 *     }
 *     leaf sec-gw-server3 {
 *         type string;
 *     }
 *     leaf fap-gw-server1 {
 *         type string;
 *     }
 *     leaf fap-gw-server2 {
 *         type string;
 *     }
 *     leaf fap-gw-server3 {
 *         type string;
 *     }
 *     leaf fap-gw-port {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-umts-gateway-g</i>
 *
 */
public interface FapControlUmtsGatewayG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-umts-gateway-g").intern();

    /**
     * First SecGW the FAP attempts to establish connection with. Either hostname or 
     * IPaddress.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>secGwServer1</code>, or <code>null</code> if not present
     */
    java.lang.String getSecGwServer1();
    
    /**
     * Second SecGW the FAP attempts to establish connection with. Either hostname or 
     * IPaddress.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>secGwServer2</code>, or <code>null</code> if not present
     */
    java.lang.String getSecGwServer2();
    
    /**
     * Third SecGW the FAP attempts to establish connection with. Either hostname or 
     * IPaddress.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>secGwServer3</code>, or <code>null</code> if not present
     */
    java.lang.String getSecGwServer3();
    
    /**
     * First FAPGW the FAP attempts to establish connection with. Either hostname or 
     * IPaddress.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>fapGwServer1</code>, or <code>null</code> if not present
     */
    java.lang.String getFapGwServer1();
    
    /**
     * Second FAPGW the FAP attempts to establish connection with. Either hostname or 
     * IPaddress.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>fapGwServer2</code>, or <code>null</code> if not present
     */
    java.lang.String getFapGwServer2();
    
    /**
     * Third FAPGW the FAP attempts to establish connection with. Either hostname or 
     * IPaddress.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>fapGwServer3</code>, or <code>null</code> if not present
     */
    java.lang.String getFapGwServer3();
    
    /**
     * Port number of FAPGW used for initial Iuh SCTP contact. This value is specified 
     * as 29169 according to IANA definition per {{bibref|IANA-portnumbers}}, 
     * registered on 2009-09-08. Use of IANA-defined value is recommended.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>fapGwPort</code>, or <code>null</code> if not present
     */
    java.lang.Integer getFapGwPort();

}

