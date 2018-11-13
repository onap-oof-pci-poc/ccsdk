package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Derived data type to identify a port, which containstwo members: clockIdentity 
 * and portNumber.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * grouping port-identity-grouping {
 *     leaf clock-identity {
 *         type clock-identity-type;
 *     }
 *     leaf port-number {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/port-identity-grouping</i>
 *
 */
public interface PortIdentityGrouping
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "port-identity-grouping").intern();

    /**
     * Identity of the clock
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockIdentityType</code> <code>clockIdentity</code>, or <code>null</code> if not present
     */
    ClockIdentityType getClockIdentity();
    
    /**
     * Port number
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>portNumber</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPortNumber();

}

