package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208._default.ds.entry;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockQualityGrouping;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * The clockQuality of the local clock.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * container clock-quality {
 *     leaf clock-class {
 *         type clock-class;
 *     }
 *     leaf clock-accuracy {
 *         type uint8;
 *     }
 *     leaf offset-scaled-log-variance {
 *         type uint16;
 *     }
 *     uses clock-quality-grouping;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/default-ds-entry/clock-quality</i>
 *
 * <p>To create instances of this class use {@link ClockQualityBuilder}.
 * @see ClockQualityBuilder
 *
 */
public interface ClockQuality
    extends
    ChildOf<DefaultDsEntry>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208._default.ds.entry.ClockQuality>,
    ClockQualityGrouping
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "clock-quality").intern();


}

