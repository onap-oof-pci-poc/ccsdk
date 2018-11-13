package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping forwarding-construct-g {
 *     leaf layer-protocol-name {
 *         type layer-protocol-name;
 *     }
 *     leaf-list lower-level-fc {
 *         type leafref;
 *     }
 *     leaf-list fc-route {
 *         type string;
 *     }
 *     list fc-port {
 *         key "uuid";
 *         leaf-list ltp {
 *             type leafref;
 *         }
 *         leaf role {
 *             type port-role;
 *         }
 *         leaf fc-port-direction {
 *             type port-direction;
 *         }
 *         leaf is-protection-lock-out {
 *             type boolean;
 *         }
 *         leaf selection-priority {
 *             type int64;
 *         }
 *         leaf is-internal-port {
 *             type boolean;
 *         }
 *         leaf-list fc-route-feeds-fc-port-egress {
 *             type string;
 *         }
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
 *         uses fc-port-g;
 *     }
 *     list fc-switch {
 *         key "uuid";
 *         leaf hold-off-time {
 *             type int64;
 *         }
 *         leaf prot-type {
 *             type protection-type;
 *         }
 *         leaf reversion-mode {
 *             type reversion-mode;
 *         }
 *         leaf-list selected-fc-port {
 *             type leafref;
 *         }
 *         leaf-list profile-proxy {
 *             type string;
 *         }
 *         container internal-configuration-and-switch-control {
 *             leaf switch-rule {
 *                 type to-be-defined;
 *             }
 *             leaf-list fc-switch {
 *                 type leafref;
 *             }
 *             container control-parameters {
 *                 leaf reversion-mode {
 *                     type reversion-mode;
 *                 }
 *                 leaf wait-to-revert-time {
 *                     type wait-to-revert-time;
 *                 }
 *                 leaf prot-type {
 *                     type protection-type;
 *                 }
 *                 leaf hold-off-time {
 *                     type int64;
 *                 }
 *                 leaf network-scheme-specification {
 *                     type string;
 *                 }
 *                 uses control-parameters-pac-g;
 *             }
 *             leaf-list profile-proxy {
 *                 type string;
 *             }
 *             container local-pac {
 *                 list local-id {
 *                     key "value-name";
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 leaf uuid {
 *                     type universal-id;
 *                 }
 *                 list extension {
 *                     key "value-name";
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 leaf operational-state {
 *                     type operational-state;
 *                 }
 *                 leaf administrative-control {
 *                     type administrative-control;
 *                 }
 *                 leaf administrative-state {
 *                     type administrative-state;
 *                 }
 *                 leaf lifecycle-state {
 *                     type lifecycle-state;
 *                 }
 *                 list name {
 *                     key "value-name";
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 list label {
 *                     key "value-name";
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 uses local-pac-g;
 *             }
 *             container global-pac {
 *                 list local-id {
 *                     key "value-name";
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 leaf uuid {
 *                     type universal-id;
 *                 }
 *                 list label {
 *                     key "value-name";
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 leaf operational-state {
 *                     type operational-state;
 *                 }
 *                 leaf administrative-control {
 *                     type administrative-control;
 *                 }
 *                 leaf administrative-state {
 *                     type administrative-state;
 *                 }
 *                 leaf lifecycle-state {
 *                     type lifecycle-state;
 *                 }
 *                 list extension {
 *                     key "value-name";
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 list name {
 *                     key "value-name";
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 uses global-pac-g;
 *             }
 *             leaf is-frozen {
 *                 type boolean;
 *             }
 *             leaf is-coordinated-switching-both-ends {
 *                 type boolean;
 *             }
 *             leaf-list subordinate-controller {
 *                 type leafref;
 *             }
 *             uses configuration-and-switch-controller-g;
 *         }
 *         leaf switch-control {
 *             type switch-control;
 *         }
 *         leaf switch-selects-ports {
 *             type port-direction;
 *         }
 *         leaf switch-selection-reason {
 *             type switch-state-reason;
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
 *         leaf wait-to-restore-time {
 *             type int64;
 *         }
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
 *         uses fc-switch-g;
 *     }
 *     leaf forwarding-direction {
 *         type forwarding-direction;
 *     }
 *     leaf is-protection-lock-out {
 *         type boolean;
 *     }
 *     leaf service-priority {
 *         type int64;
 *     }
 *     leaf-list supported-link {
 *         type string;
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/forwarding-construct-g</i>
 *
 */
public interface ForwardingConstructG
    extends
    DataObject,
    GlobalClassG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "forwarding-construct-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolName</code> <code>layerProtocolName</code>, or <code>null</code> if not present
     */
    LayerProtocolName getLayerProtocolName();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>lowerLevelFc</code>, or <code>null</code> if not present
     */
    List<UniversalId> getLowerLevelFc();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>fcRoute</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getFcRoute();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>fcPort</code>, or <code>null</code> if not present
     */
    List<FcPort> getFcPort();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>fcSwitch</code>, or <code>null</code> if not present
     */
    List<FcSwitch> getFcSwitch();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingDirection</code> <code>forwardingDirection</code>, or <code>null</code> if not present
     */
    ForwardingDirection getForwardingDirection();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isProtectionLockOut</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsProtectionLockOut();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>servicePriority</code>, or <code>null</code> if not present
     */
    java.lang.Long getServicePriority();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedLink</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSupportedLink();

}

