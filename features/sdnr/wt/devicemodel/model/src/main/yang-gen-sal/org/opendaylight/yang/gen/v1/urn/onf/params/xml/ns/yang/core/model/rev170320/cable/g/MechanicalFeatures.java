package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.cable.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.CableG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.MechanicalFeaturesG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container mechanical-features {
 *     uses mechanical-features-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/cable-g/mechanical-features</i>
 *
 * <p>To create instances of this class use {@link MechanicalFeaturesBuilder}.
 * @see MechanicalFeaturesBuilder
 *
 */
public interface MechanicalFeatures
    extends
    ChildOf<CableG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.cable.g.MechanicalFeatures>,
    MechanicalFeaturesG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "mechanical-features").intern();


}

