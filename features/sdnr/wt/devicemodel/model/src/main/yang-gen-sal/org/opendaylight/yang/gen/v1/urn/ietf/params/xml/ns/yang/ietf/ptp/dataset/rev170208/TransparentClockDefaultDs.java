package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * The members of the transparentClockDefault Data Set
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * container transparent-clock-default-ds {
 *     leaf clock-identity {
 *         type clock-identity-type;
 *     }
 *     leaf number-ports {
 *         type uint16;
 *     }
 *     leaf delay-mechanism {
 *         type delay-mechanism-enumeration;
 *     }
 *     leaf primary-domain {
 *         type primary-domain;
 *     }
 *     uses transparent-clock-default-ds-entry;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/transparent-clock-default-ds</i>
 *
 * <p>To create instances of this class use {@link TransparentClockDefaultDsBuilder}.
 * @see TransparentClockDefaultDsBuilder
 *
 */
public interface TransparentClockDefaultDs
    extends
    ChildOf<IetfPtpDatasetData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>,
    TransparentClockDefaultDsEntry
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "transparent-clock-default-ds").intern();


}

