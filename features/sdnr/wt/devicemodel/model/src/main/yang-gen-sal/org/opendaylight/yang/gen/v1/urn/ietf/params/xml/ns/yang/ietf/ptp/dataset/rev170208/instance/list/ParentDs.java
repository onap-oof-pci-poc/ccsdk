package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * The parent data set of the clock.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * container parent-ds {
 *     container parent-port-identity {
 *         leaf clock-identity {
 *             type clock-identity-type;
 *         }
 *         leaf port-number {
 *             type uint16;
 *         }
 *         uses port-identity-grouping;
 *     }
 *     leaf parent-stats {
 *         type parent-stats;
 *     }
 *     leaf observed-parent-offset-scaled-log-variance {
 *         type observed-parent-offset-scaled-log-variance;
 *     }
 *     leaf observed-parent-clock-phase-change-rate {
 *         type int32;
 *     }
 *     leaf grandmaster-identity {
 *         type binary;
 *     }
 *     container grandmaster-clock-quality {
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
 *     leaf grandmaster-priority1 {
 *         type uint8;
 *     }
 *     leaf grandmaster-priority2 {
 *         type uint8;
 *     }
 *     uses parent-ds-entry;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/instance-list/parent-ds</i>
 *
 * <p>To create instances of this class use {@link ParentDsBuilder}.
 * @see ParentDsBuilder
 *
 */
public interface ParentDs
    extends
    ChildOf<InstanceList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>,
    ParentDsEntry
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "parent-ds").intern();


}

