package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of port data sets of the clock.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * list port-ds-list {
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
 *     leaf port-state {
 *         type port-state;
 *     }
 *     leaf log-min-delay-req-interval {
 *         type int8;
 *     }
 *     leaf peer-mean-path-delay {
 *         type peer-mean-path-delay;
 *     }
 *     leaf log-announce-interval {
 *         type int8;
 *     }
 *     leaf announce-receipt-timeout {
 *         type uint8;
 *     }
 *     leaf log-sync-interval {
 *         type int8;
 *     }
 *     leaf delay-mechanism {
 *         type delay-mechanism-enumeration;
 *     }
 *     leaf log-min-pdelay-req-interval {
 *         type int8;
 *     }
 *     leaf version-number {
 *         type uint8;
 *     }
 *     leaf master-only {
 *         type master-only;
 *     }
 *     leaf local-priority {
 *         type local-priority;
 *     }
 *     leaf designated-enabled {
 *         type designated-enabled;
 *     }
 *     leaf delay-asymmetry {
 *         type delay-asymmetry;
 *     }
 *     leaf logical-termination-point {
 *         type leafref;
 *     }
 *     augment \(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)instance-list\(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)port-ds-list {
 *         when "Optional.empty";
 *         description
 *             "Addition of data nodes for the default data set of the clock.";
 *         status CURRENT;
 *         leaf master-only {
 *             type master-only;
 *         }
 *         leaf local-priority {
 *             type local-priority;
 *         }
 *         leaf designated-enabled {
 *             type designated-enabled;
 *         }
 *         leaf delay-asymmetry {
 *             type delay-asymmetry;
 *         }
 *         leaf logical-termination-point {
 *             type leafref;
 *         }
 *     }
 *     uses port-ds-entry;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/instance-list/port-ds-list</i>
 *
 * <p>To create instances of this class use {@link PortDsListBuilder}.
 * @see PortDsListBuilder
 * @see PortDsListKey
 *
 */
public interface PortDsList
    extends
    ChildOf<InstanceList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>,
    PortDsEntry,
    Identifiable<PortDsListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "port-ds-list").intern();

    /**
     * Refers to the portNumber memer ofportDS.portIdentity.
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PortDsListKey getKey();

}

