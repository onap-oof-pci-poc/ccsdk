package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-ethernet-conditional-packages</b>
 * <pre>
 * grouping ethernet-configuration-g {
 *     leaf vlan-id {
 *         type int16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-ethernet-conditional-packages/ethernet-configuration-g</i>
 *
 */
public interface EthernetConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-ethernet-conditional-packages",
        "2017-04-02", "ethernet-configuration-g").intern();

    /**
     * value = 0: frames on ingress must be untagged, frames on egress get untagged; 
     * value = any other positive integer &amp;lt; 4096: frames on ingress must be 
     * tagged with this VLAN ID, frames on egress either already have or get this VLAN 
     * ID attached;
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>vlanId</code>, or <code>null</code> if not present
     */
    java.lang.Short getVlanId();

}

