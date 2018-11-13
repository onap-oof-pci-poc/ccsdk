package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list forwarding-construct {
 *     key "uuid";
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
 *     uses forwarding-construct-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/forwarding-construct</i>
 *
 * <p>To create instances of this class use {@link ForwardingConstructBuilder}.
 * @see ForwardingConstructBuilder
 * @see ForwardingConstructKey
 *
 */
public interface ForwardingConstruct
    extends
    ChildOf<CoreModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>,
    ForwardingConstructG,
    Identifiable<ForwardingConstructKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "forwarding-construct").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ForwardingConstructKey getKey();

}

