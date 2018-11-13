package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.port.ds.entry;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortIdentityGrouping;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * The portIdentity attribute of the local port.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * container port-identity {
 *     leaf clock-identity {
 *         type clock-identity-type;
 *     }
 *     leaf port-number {
 *         type uint16;
 *     }
 *     uses port-identity-grouping;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/port-ds-entry/port-identity</i>
 *
 * <p>To create instances of this class use {@link PortIdentityBuilder}.
 * @see PortIdentityBuilder
 *
 */
public interface PortIdentity
    extends
    ChildOf<PortDsEntry>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.port.ds.entry.PortIdentity>,
    PortIdentityGrouping
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "port-identity").intern();


}

