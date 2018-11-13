package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.cable.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.CableG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SpatialPropertiesOfTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container spatial-properties-of-type {
 *     leaf height {
 *         type to-be-defined;
 *     }
 *     leaf width {
 *         type to-be-defined;
 *     }
 *     leaf length {
 *         type to-be-defined;
 *     }
 *     uses spatial-properties-of-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/cable-g/spatial-properties-of-type</i>
 *
 * <p>To create instances of this class use {@link SpatialPropertiesOfTypeBuilder}.
 * @see SpatialPropertiesOfTypeBuilder
 *
 */
public interface SpatialPropertiesOfType
    extends
    ChildOf<CableG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.cable.g.SpatialPropertiesOfType>,
    SpatialPropertiesOfTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "spatial-properties-of-type").intern();


}

