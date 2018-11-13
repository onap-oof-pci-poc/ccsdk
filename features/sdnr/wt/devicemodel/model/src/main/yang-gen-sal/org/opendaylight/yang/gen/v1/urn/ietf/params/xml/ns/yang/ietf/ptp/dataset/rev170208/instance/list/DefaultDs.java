package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * The default data set of the clock.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * container default-ds {
 *     leaf two-step-flag {
 *         type boolean;
 *     }
 *     leaf clock-identity {
 *         type clock-identity-type;
 *     }
 *     leaf number-ports {
 *         type uint16;
 *     }
 *     container clock-quality {
 *         leaf clock-class {
 *             type clock-class;
 *         }
 *         leaf clock-accuracy {
 *             type uint8;
 *         }
 *         leaf offset-scaled-log-variance {
 *             type uint16;
 *         }
 *         uses clock-quality-grouping;
 *     }
 *     leaf priority1 {
 *         type uint8;
 *     }
 *     leaf priority2 {
 *         type uint8;
 *     }
 *     leaf domain-number {
 *         type uint8;
 *     }
 *     leaf slave-only {
 *         type boolean;
 *     }
 *     leaf local-priority {
 *         type local-priority;
 *     }
 *     leaf max-steps-removed {
 *         type max-steps-removed;
 *     }
 *     leaf multicast-mac-address {
 *         type mac-address;
 *     }
 *     leaf designated-enabled {
 *         type designated-enabled;
 *     }
 *     augment \(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)instance-list\(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)default-ds {
 *         when "Optional.empty";
 *         description
 *             "Addition of data nodes for the default data set of the clock.";
 *         status CURRENT;
 *         leaf local-priority {
 *             type local-priority;
 *         }
 *         leaf max-steps-removed {
 *             type max-steps-removed;
 *         }
 *         leaf multicast-mac-address {
 *             type mac-address;
 *         }
 *         leaf designated-enabled {
 *             type designated-enabled;
 *         }
 *     }
 *     uses default-ds-entry;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/instance-list/default-ds</i>
 *
 * <p>To create instances of this class use {@link DefaultDsBuilder}.
 * @see DefaultDsBuilder
 *
 */
public interface DefaultDs
    extends
    ChildOf<InstanceList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>,
    DefaultDsEntry
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "default-ds").intern();


}

