package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.configuration.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.DiversityTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Type of air interface diversity configured at the link.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container air-interface-diversity {
 *     leaf diversity-name {
 *         type diversity-name;
 *     }
 *     leaf number-of-air-interfaces-max {
 *         type number-of-air-interfaces-max;
 *     }
 *     uses diversity-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-configuration-g/air-interface-diversity</i>
 *
 * <p>To create instances of this class use {@link AirInterfaceDiversityBuilder}.
 * @see AirInterfaceDiversityBuilder
 *
 */
public interface AirInterfaceDiversity
    extends
    ChildOf<AirInterfaceDiversityConfigurationG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.configuration.g.AirInterfaceDiversity>,
    DiversityTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "air-interface-diversity").intern();


}

