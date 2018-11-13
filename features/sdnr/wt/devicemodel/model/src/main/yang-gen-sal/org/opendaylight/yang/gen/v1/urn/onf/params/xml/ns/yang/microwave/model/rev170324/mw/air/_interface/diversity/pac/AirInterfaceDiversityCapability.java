package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.diversity.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityCapabilityG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceDiversityPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container air-interface-diversity-capability {
 *     list available-kinds-of-diversity {
 *         key "diversity-name";
 *         leaf diversity-name {
 *             type diversity-name;
 *         }
 *         leaf number-of-air-interfaces-max {
 *             type number-of-air-interfaces-max;
 *         }
 *         uses diversity-type-g;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *     }
 *     uses air-interface-diversity-capability-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-air-interface-diversity-pac/air-interface-diversity-capability</i>
 *
 * <p>To create instances of this class use {@link AirInterfaceDiversityCapabilityBuilder}.
 * @see AirInterfaceDiversityCapabilityBuilder
 *
 */
public interface AirInterfaceDiversityCapability
    extends
    ChildOf<MwAirInterfaceDiversityPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>,
    AirInterfaceDiversityCapabilityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "air-interface-diversity-capability").intern();


}

