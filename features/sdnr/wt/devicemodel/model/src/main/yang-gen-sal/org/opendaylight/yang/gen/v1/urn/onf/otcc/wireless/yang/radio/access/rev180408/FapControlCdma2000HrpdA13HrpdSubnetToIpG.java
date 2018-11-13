package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

/**
 * This object contains attributes related to A13 Session Transfer
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf hrpd-subnet-length {
 *         type hrpd-subnet-length;
 *     }
 *     leaf hrpd-subnet {
 *         type binary;
 *     }
 *     leaf a13-ip-address {
 *         type ip-address;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip-g</i>
 *
 */
public interface FapControlCdma2000HrpdA13HrpdSubnetToIpG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip-g").intern();

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
     * The number of MSBs (in {{units}}) in the following field that is part of 
     * HRPDSubnet
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hrpdSubnetLength</code>, or <code>null</code> if not present
     */
    java.lang.Short getHrpdSubnetLength();
    
    /**
     * The {{param|HRPDSubnetLength}} MSBs of this field contain the HRPD subnet that 
     * maps to the IP address in the following field
     *
     *
     *
     * @return <code>byte[]</code> <code>hrpdSubnet</code>, or <code>null</code> if not present
     */
    byte[] getHrpdSubnet();
    
    /**
     * This field contains the IP address of A13 endpoint that corresponds to the HRPD 
     * subnet
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>a13IpAddress</code>, or <code>null</code> if not present
     */
    IpAddress getA13IpAddress();

}

