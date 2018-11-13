package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Represents and defines a protection switch structure encapsulated in the 
 * forwarding construct. Essentially performs the function of Protection Group. 
 * Associates to 2 or more Endpoints each playing the role of a Protection Unit. 
 * One or more protection EndPoints (standby/backup) provide protection for one or 
 * more working (i.e. regular/main/preferred) Endpoints where either protection or 
 * working can feed one or more protected Endpoint. May be used in revertive or 
 * non-revertive (symmetric) mode. When in revertive mode may define waitToRestore 
 * time. May be used in one of several modes including source switch, destination 
 * switched, source and destination switched etc (covering cases such as 1+1 ane 
 * 1:1). May be lockout (prevented from switching), force switched or manual 
 * switched. Will indicate switch state and change of state.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list mw-air-interface-hsb-fc-switch-pac {
 *     key "fcswitch";
 *     leaf prot-type {
 *         type prot-type;
 *     }
 *     leaf air-interface-hsb-configuration-is-faulty-severity {
 *         type air-interface-hsb-configuration-is-faulty-severity;
 *     }
 *     leaf air-interface-hsb-is-partly-down-severity {
 *         type air-interface-hsb-is-partly-down-severity;
 *     }
 *     leaf air-interface-hsb-is-down-severity {
 *         type air-interface-hsb-is-down-severity;
 *     }
 *     leaf fcswitch {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-air-interface-hsb-fc-switch-pac</i>
 *
 * <p>To create instances of this class use {@link MwAirInterfaceHsbFcSwitchPacBuilder}.
 * @see MwAirInterfaceHsbFcSwitchPacBuilder
 * @see MwAirInterfaceHsbFcSwitchPacKey
 *
 */
public interface MwAirInterfaceHsbFcSwitchPac
    extends
    ChildOf<MicrowaveModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbFcSwitchPac>,
    Identifiable<MwAirInterfaceHsbFcSwitchPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "mw-air-interface-hsb-fc-switch-pac").intern();

    /**
     * Indicates the protection scheme that is used for the ProtectionGroup.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProtectionType</code> <code>protType</code>, or <code>null</code> if not present
     */
    ProtectionType getProtType();
    
    /**
     * The level of severity of an airInterfaceHsbConfigurationIsFaulty alarm shall be 
     * chosen from an enumeration.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SeverityType</code> <code>airInterfaceHsbConfigurationIsFaultySeverity</code>, or <code>null</code> if not present
     */
    SeverityType getAirInterfaceHsbConfigurationIsFaultySeverity();
    
    /**
     * The level of severity for one link out of the HSB configuration being down shall
     * be chosen from an enumeration.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SeverityType</code> <code>airInterfaceHsbIsPartlyDownSeverity</code>, or <code>null</code> if not present
     */
    SeverityType getAirInterfaceHsbIsPartlyDownSeverity();
    
    /**
     * The level of severity of the total HSB configuration being down shall be chosen 
     * from an enumeration.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SeverityType</code> <code>airInterfaceHsbIsDownSeverity</code>, or <code>null</code> if not present
     */
    SeverityType getAirInterfaceHsbIsDownSeverity();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>fcswitch</code>, or <code>null</code> if not present
     */
    UniversalId getFcswitch();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbFcSwitchPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MwAirInterfaceHsbFcSwitchPacKey getKey();

}

