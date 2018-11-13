package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PhysicalRatingG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container physical-rating {
 *     leaf thermal-rating {
 *         type to-be-defined;
 *     }
 *     leaf power-rating {
 *         type to-be-defined;
 *     }
 *     uses physical-rating-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/holder-g/physical-rating</i>
 *
 * <p>To create instances of this class use {@link PhysicalRatingBuilder}.
 * @see PhysicalRatingBuilder
 *
 */
public interface PhysicalRating
    extends
    ChildOf<HolderG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.PhysicalRating>,
    PhysicalRatingG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "physical-rating").intern();


}

