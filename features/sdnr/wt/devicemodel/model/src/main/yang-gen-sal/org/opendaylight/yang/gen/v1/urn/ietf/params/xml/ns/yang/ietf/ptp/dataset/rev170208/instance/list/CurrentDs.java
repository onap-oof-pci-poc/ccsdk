package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.CurrentDsEntry;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * The current data set of the clock.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * container current-ds {
 *     leaf steps-removed {
 *         type steps-removed;
 *     }
 *     leaf offset-from-master {
 *         type time-interval-type;
 *     }
 *     leaf mean-path-delay {
 *         type time-interval-type;
 *     }
 *     uses current-ds-entry;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/instance-list/current-ds</i>
 *
 * <p>To create instances of this class use {@link CurrentDsBuilder}.
 * @see CurrentDsBuilder
 *
 */
public interface CurrentDs
    extends
    ChildOf<InstanceList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.CurrentDs>,
    CurrentDsEntry
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "current-ds").intern();


}

