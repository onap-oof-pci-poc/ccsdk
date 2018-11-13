package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.capability.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityCapabilityG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.DiversityTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Available types of diversity to be listed.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list available-kinds-of-diversity {
 *     key "diversity-name";
 *     leaf diversity-name {
 *         type diversity-name;
 *     }
 *     leaf number-of-air-interfaces-max {
 *         type number-of-air-interfaces-max;
 *     }
 *     uses diversity-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-capability-g/available-kinds-of-diversity</i>
 *
 * <p>To create instances of this class use {@link AvailableKindsOfDiversityBuilder}.
 * @see AvailableKindsOfDiversityBuilder
 * @see AvailableKindsOfDiversityKey
 *
 */
public interface AvailableKindsOfDiversity
    extends
    ChildOf<AirInterfaceDiversityCapabilityG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.capability.g.AvailableKindsOfDiversity>,
    DiversityTypeG,
    Identifiable<AvailableKindsOfDiversityKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "available-kinds-of-diversity").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.capability.g.AvailableKindsOfDiversityKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AvailableKindsOfDiversityKey getKey();

}

