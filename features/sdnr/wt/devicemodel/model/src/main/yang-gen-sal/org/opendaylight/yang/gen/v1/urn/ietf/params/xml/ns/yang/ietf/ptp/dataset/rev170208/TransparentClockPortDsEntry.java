package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.transparent.clock.port.ds.entry.PortIdentity;

/**
 * Collection of members of the transparentClockPort dataset (port data set for a 
 * transparent clock).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * grouping transparent-clock-port-ds-entry {
 *     container port-identity {
 *         leaf clock-identity {
 *             type clock-identity-type;
 *         }
 *         leaf port-number {
 *             type uint16;
 *         }
 *         uses port-identity-grouping;
 *     }
 *     leaf log-min-pdelay-req-interval {
 *         type int8;
 *     }
 *     leaf faulty-flag {
 *         type faulty-flag;
 *     }
 *     leaf peer-mean-path-delay {
 *         type peer-mean-path-delay;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/transparent-clock-port-ds-entry</i>
 *
 */
public interface TransparentClockPortDsEntry
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "transparent-clock-port-ds-entry").intern();

    /**
     * The portIdentity of the local port.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.transparent.clock.port.ds.entry.PortIdentity</code> <code>portIdentity</code>, or <code>null</code> if not present
     */
    PortIdentity getPortIdentity();
    
    /**
     * The logarithm to the base 2 of theminPdelayReqInterval (minimum permitted mean 
     * timeinterval between successive Pdelay_Req messages).
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>logMinPdelayReqInterval</code>, or <code>null</code> if not present
     */
    java.lang.Byte getLogMinPdelayReqInterval();
    
    /**
     * When set, the port is faulty.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>faultyFlag</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isFaultyFlag();
    
    /**
     * An estimate of the current one-way propagation delayon the link when the 
     * delayMechanism is P2P; otherwise,it is zero.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimeIntervalType</code> <code>peerMeanPathDelay</code>, or <code>null</code> if not present
     */
    TimeIntervalType getPeerMeanPathDelay();

}

