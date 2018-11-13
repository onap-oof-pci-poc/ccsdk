package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * The EndPoint (EP) object class models the access to the FC function. Each 
 * EndPoint instance has a role (e.g., working, protection, protected, hub, spoke, 
 * leaf, root, etc.) with respect to the FC function. The association of the FC to 
 * LTPs is made via EndPoints (essentially the ports of the FC) where each 
 * (EP) of the FC has a role in the context of the FC. The traffic forwarding 
 * between the associated End PointsEPs of the FC depends upon the type of FC and 
 * may be associated with FCSwitch object instances. In cases where there is 
 * protection conveys the protecting role of the access to the FC. The EP replaces 
 * the Protection Unit of a traditional protection model. It represents a 
 * (resilient/reliable) point or a protecting (unreliable working or protection) 
 * point.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list mw-air-interface-hsb-end-point-pac {
 *     key "endpoint";
 *     leaf role {
 *         type role;
 *     }
 *     leaf endpoint {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-air-interface-hsb-end-point-pac</i>
 *
 * <p>To create instances of this class use {@link MwAirInterfaceHsbEndPointPacBuilder}.
 * @see MwAirInterfaceHsbEndPointPacBuilder
 * @see MwAirInterfaceHsbEndPointPacKey
 *
 */
public interface MwAirInterfaceHsbEndPointPac
    extends
    ChildOf<MicrowaveModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>,
    Identifiable<MwAirInterfaceHsbEndPointPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "mw-air-interface-hsb-end-point-pac").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.RoleType</code> <code>role</code>, or <code>null</code> if not present
     */
    RoleType getRole();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>endpoint</code>, or <code>null</code> if not present
     */
    UniversalId getEndpoint();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MwAirInterfaceHsbEndPointPacKey getKey();

}

