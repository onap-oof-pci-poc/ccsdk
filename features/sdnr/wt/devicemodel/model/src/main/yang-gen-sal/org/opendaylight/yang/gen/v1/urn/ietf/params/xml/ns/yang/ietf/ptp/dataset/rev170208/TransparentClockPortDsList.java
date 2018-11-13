package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of transparentClockPort data setsof the transparent clock.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * list transparent-clock-port-ds-list {
 *     key "port-number";
 *     leaf port-number {
 *         type leafref;
 *     }
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
 *     uses transparent-clock-port-ds-entry;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/transparent-clock-port-ds-list</i>
 *
 * <p>To create instances of this class use {@link TransparentClockPortDsListBuilder}.
 * @see TransparentClockPortDsListBuilder
 * @see TransparentClockPortDsListKey
 *
 */
public interface TransparentClockPortDsList
    extends
    ChildOf<IetfPtpDatasetData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>,
    TransparentClockPortDsEntry,
    Identifiable<TransparentClockPortDsListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "transparent-clock-port-ds-list").intern();

    /**
     * Refers to the portNumber memerof transparentClockPortDS.portIdentity.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>portNumber</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPortNumber();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    TransparentClockPortDsListKey getKey();

}

