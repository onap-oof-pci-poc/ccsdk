package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.ControlParameters;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping fc-switch-g {
 *     leaf hold-off-time {
 *         type int64;
 *     }
 *     leaf prot-type {
 *         type protection-type;
 *     }
 *     leaf reversion-mode {
 *         type reversion-mode;
 *     }
 *     leaf-list selected-fc-port {
 *         type leafref;
 *     }
 *     leaf-list profile-proxy {
 *         type string;
 *     }
 *     container internal-configuration-and-switch-control {
 *         leaf switch-rule {
 *             type to-be-defined;
 *         }
 *         leaf-list fc-switch {
 *             type leafref;
 *         }
 *         container control-parameters {
 *             leaf reversion-mode {
 *                 type reversion-mode;
 *             }
 *             leaf wait-to-revert-time {
 *                 type wait-to-revert-time;
 *             }
 *             leaf prot-type {
 *                 type protection-type;
 *             }
 *             leaf hold-off-time {
 *                 type int64;
 *             }
 *             leaf network-scheme-specification {
 *                 type string;
 *             }
 *             uses control-parameters-pac-g;
 *         }
 *         leaf-list profile-proxy {
 *             type string;
 *         }
 *         container local-pac {
 *             list local-id {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             leaf uuid {
 *                 type universal-id;
 *             }
 *             list extension {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             leaf operational-state {
 *                 type operational-state;
 *             }
 *             leaf administrative-control {
 *                 type administrative-control;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf lifecycle-state {
 *                 type lifecycle-state;
 *             }
 *             list name {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             list label {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             uses local-pac-g;
 *         }
 *         container global-pac {
 *             list local-id {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             leaf uuid {
 *                 type universal-id;
 *             }
 *             list label {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             leaf operational-state {
 *                 type operational-state;
 *             }
 *             leaf administrative-control {
 *                 type administrative-control;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf lifecycle-state {
 *                 type lifecycle-state;
 *             }
 *             list extension {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             list name {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             uses global-pac-g;
 *         }
 *         leaf is-frozen {
 *             type boolean;
 *         }
 *         leaf is-coordinated-switching-both-ends {
 *             type boolean;
 *         }
 *         leaf-list subordinate-controller {
 *             type leafref;
 *         }
 *         uses configuration-and-switch-controller-g;
 *     }
 *     leaf switch-control {
 *         type switch-control;
 *     }
 *     leaf switch-selects-ports {
 *         type port-direction;
 *     }
 *     leaf switch-selection-reason {
 *         type switch-state-reason;
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
 *     leaf wait-to-restore-time {
 *         type int64;
 *     }
 *     list local-id {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     leaf uuid {
 *         type universal-id;
 *     }
 *     list extension {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     leaf operational-state {
 *         type operational-state;
 *     }
 *     leaf administrative-control {
 *         type administrative-control;
 *     }
 *     leaf administrative-state {
 *         type administrative-state;
 *     }
 *     leaf lifecycle-state {
 *         type lifecycle-state;
 *     }
 *     list name {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     list label {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/fc-switch-g</i>
 *
 */
public interface FcSwitchG
    extends
    DataObject,
    LocalClassG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "fc-switch-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>holdOffTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getHoldOffTime();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ProtectionType</code> <code>protType</code>, or <code>null</code> if not present
     */
    ProtectionType getProtType();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ReversionMode</code> <code>reversionMode</code>, or <code>null</code> if not present
     */
    ReversionMode getReversionMode();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>selectedFcPort</code>, or <code>null</code> if not present
     */
    List<UniversalId> getSelectedFcPort();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>profileProxy</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getProfileProxy();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl</code> <code>internalConfigurationAndSwitchControl</code>, or <code>null</code> if not present
     */
    InternalConfigurationAndSwitchControl getInternalConfigurationAndSwitchControl();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SwitchControl</code> <code>switchControl</code>, or <code>null</code> if not present
     */
    SwitchControl getSwitchControl();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PortDirection</code> <code>switchSelectsPorts</code>, or <code>null</code> if not present
     */
    PortDirection getSwitchSelectsPorts();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SwitchStateReason</code> <code>switchSelectionReason</code>, or <code>null</code> if not present
     */
    SwitchStateReason getSwitchSelectionReason();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.ControlParameters</code> <code>controlParameters</code>, or <code>null</code> if not present
     */
    ControlParameters getControlParameters();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>waitToRestoreTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getWaitToRestoreTime();

}

