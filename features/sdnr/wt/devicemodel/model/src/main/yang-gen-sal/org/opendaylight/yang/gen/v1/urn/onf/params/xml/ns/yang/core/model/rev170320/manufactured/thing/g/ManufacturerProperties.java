package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturerPropertiesG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container manufacturer-properties {
 *     leaf manufacturer-identifier {
 *         type string;
 *     }
 *     leaf manufacturer-name {
 *         type string;
 *     }
 *     uses manufacturer-properties-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/manufactured-thing-g/manufacturer-properties</i>
 *
 * <p>To create instances of this class use {@link ManufacturerPropertiesBuilder}.
 * @see ManufacturerPropertiesBuilder
 *
 */
public interface ManufacturerProperties
    extends
    ChildOf<ManufacturedThingG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.ManufacturerProperties>,
    ManufacturerPropertiesG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "manufacturer-properties").intern();


}

