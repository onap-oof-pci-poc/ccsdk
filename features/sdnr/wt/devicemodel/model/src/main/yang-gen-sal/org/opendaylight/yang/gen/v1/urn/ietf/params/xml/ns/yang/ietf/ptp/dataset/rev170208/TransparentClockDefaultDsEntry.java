package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Collection of members of the transparentClockDefault data set (default data set 
 * for a transparent clock).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * grouping transparent-clock-default-ds-entry {
 *     leaf clock-identity {
 *         type clock-identity-type;
 *     }
 *     leaf number-ports {
 *         type uint16;
 *     }
 *     leaf delay-mechanism {
 *         type delay-mechanism-enumeration;
 *     }
 *     leaf primary-domain {
 *         type primary-domain;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/transparent-clock-default-ds-entry</i>
 *
 */
public interface TransparentClockDefaultDsEntry
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "transparent-clock-default-ds-entry").intern();

    /**
     * The clockIdentity of the transparent clock.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockIdentityType</code> <code>clockIdentity</code>, or <code>null</code> if not present
     */
    ClockIdentityType getClockIdentity();
    
    /**
     * The number of PTP ports on the device.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>numberPorts</code>, or <code>null</code> if not present
     */
    java.lang.Integer getNumberPorts();
    
    /**
     * The propagation delay measuring optionused by the transparent clock.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DelayMechanismEnumeration</code> <code>delayMechanism</code>, or <code>null</code> if not present
     */
    DelayMechanismEnumeration getDelayMechanism();
    
    /**
     * The domainNumber of the primary syntonization domain.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>primaryDomain</code>, or <code>null</code> if not present
     */
    java.lang.Short getPrimaryDomain();

}

