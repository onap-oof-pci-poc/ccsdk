package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.LocalPac;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping configuration-and-switch-controller-g {
 *     leaf switch-rule {
 *         type to-be-defined;
 *     }
 *     leaf-list fc-switch {
 *         type leafref;
 *     }
 *     container control-parameters {
 *         leaf reversion-mode {
 *             type reversion-mode;
 *         }
 *         leaf wait-to-revert-time {
 *             type wait-to-revert-time;
 *         }
 *         leaf prot-type {
 *             type protection-type;
 *         }
 *         leaf hold-off-time {
 *             type int64;
 *         }
 *         leaf network-scheme-specification {
 *             type string;
 *         }
 *         uses control-parameters-pac-g;
 *     }
 *     leaf-list profile-proxy {
 *         type string;
 *     }
 *     container local-pac {
 *         list local-id {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         leaf uuid {
 *             type universal-id;
 *         }
 *         list extension {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         leaf operational-state {
 *             type operational-state;
 *         }
 *         leaf administrative-control {
 *             type administrative-control;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf lifecycle-state {
 *             type lifecycle-state;
 *         }
 *         list name {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         list label {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         uses local-pac-g;
 *     }
 *     container global-pac {
 *         list local-id {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         leaf uuid {
 *             type universal-id;
 *         }
 *         list label {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         leaf operational-state {
 *             type operational-state;
 *         }
 *         leaf administrative-control {
 *             type administrative-control;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf lifecycle-state {
 *             type lifecycle-state;
 *         }
 *         list extension {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         list name {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         uses global-pac-g;
 *     }
 *     leaf is-frozen {
 *         type boolean;
 *     }
 *     leaf is-coordinated-switching-both-ends {
 *         type boolean;
 *     }
 *     leaf-list subordinate-controller {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/configuration-and-switch-controller-g</i>
 *
 */
public interface ConfigurationAndSwitchControllerG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "configuration-and-switch-controller-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>switchRule</code>, or <code>null</code> if not present
     */
    ToBeDefined getSwitchRule();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>fcSwitch</code>, or <code>null</code> if not present
     */
    List<UniversalId> getFcSwitch();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters</code> <code>controlParameters</code>, or <code>null</code> if not present
     */
    ControlParameters getControlParameters();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>profileProxy</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getProfileProxy();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.LocalPac</code> <code>localPac</code>, or <code>null</code> if not present
     */
    LocalPac getLocalPac();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac</code> <code>globalPac</code>, or <code>null</code> if not present
     */
    GlobalPac getGlobalPac();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isFrozen</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsFrozen();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isCoordinatedSwitchingBothEnds</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsCoordinatedSwitchingBothEnds();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>subordinateController</code>, or <code>null</code> if not present
     */
    List<ToBeDefined> getSubordinateController();

}

