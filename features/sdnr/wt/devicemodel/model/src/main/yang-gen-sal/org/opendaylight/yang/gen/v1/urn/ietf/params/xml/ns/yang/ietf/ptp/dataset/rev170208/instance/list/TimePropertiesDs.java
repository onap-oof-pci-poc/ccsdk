package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * The timeProperties data set of the clock.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * container time-properties-ds {
 *     leaf current-utc-offset-valid {
 *         type boolean;
 *     }
 *     leaf current-utc-offset {
 *         type int16;
 *     }
 *     leaf leap59 {
 *         type boolean;
 *     }
 *     leaf leap61 {
 *         type boolean;
 *     }
 *     leaf time-traceable {
 *         type boolean;
 *     }
 *     leaf frequency-traceable {
 *         type boolean;
 *     }
 *     leaf ptp-timescale {
 *         type boolean;
 *     }
 *     leaf time-source {
 *         type uint8;
 *     }
 *     uses time-properties-ds-entry;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/instance-list/time-properties-ds</i>
 *
 * <p>To create instances of this class use {@link TimePropertiesDsBuilder}.
 * @see TimePropertiesDsBuilder
 *
 */
public interface TimePropertiesDs
    extends
    ChildOf<InstanceList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>,
    TimePropertiesDsEntry
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "time-properties-ds").intern();


}

