package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv4Address;

/**
 * HRPD LIPA Egress Filter Table entries.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf subnet {
 *         type ipv4-address;
 *     }
 *     leaf subnet-mask {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter-g</i>
 *
 */
public interface AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter-g").intern();

    /**
     * Enables or disables the {{object}} entry.
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
     * The IP subnet of the egress filter to be installed to the AT. The meaning of 
     * this field depends on the 
     * {{param|.AccessMgmt.CDMA2000.LocalIPAccess.HRPD.FilterType}} field.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv4Address</code> <code>subnet</code>, or <code>null</code> if not present
     */
    Ipv4Address getSubnet();
    
    /**
     * The length of the IP subnetmask associated with the IP subnet in the previous 
     * field.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>subnetMask</code>, or <code>null</code> if not present
     */
    java.lang.Short getSubnetMask();

}

