package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * CDMA2000 FAP Security Gateway operational parameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-cdma2000-gateway-g {
 *     leaf sec-gw-server1 {
 *         type string;
 *     }
 *     leaf sec-gw-server2 {
 *         type string;
 *     }
 *     leaf sec-gw-server3 {
 *         type string;
 *     }
 *     leaf sec-gw-switchover-count {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-cdma2000-gateway-g</i>
 *
 */
public interface FapControlCdma2000GatewayG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-gateway-g").intern();

    /**
     * First SecGW the FAP attempts to contact. Either FQDN or IP address
     *
     *
     *
     * @return <code>java.lang.String</code> <code>secGwServer1</code>, or <code>null</code> if not present
     */
    java.lang.String getSecGwServer1();
    
    /**
     * Second SecGW the FAP attempts to contact. Either FQDN or IP address
     *
     *
     *
     * @return <code>java.lang.String</code> <code>secGwServer2</code>, or <code>null</code> if not present
     */
    java.lang.String getSecGwServer2();
    
    /**
     * Third SecGW that the FAP attempts to contact. Can contain either FQDN or IP 
     * address
     *
     *
     *
     * @return <code>java.lang.String</code> <code>secGwServer3</code>, or <code>null</code> if not present
     */
    java.lang.String getSecGwServer3();
    
    /**
     * Counter indicating how many times FAP has switched between SecGW
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>secGwSwitchoverCount</code>, or <code>null</code> if not present
     */
    BigInteger getSecGwSwitchoverCount();

}

