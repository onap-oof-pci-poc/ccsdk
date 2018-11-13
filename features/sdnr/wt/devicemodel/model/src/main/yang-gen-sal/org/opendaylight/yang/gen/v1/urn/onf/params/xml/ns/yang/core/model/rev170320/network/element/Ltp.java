package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElement;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LogicalTerminationPointG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list ltp {
 *     key "uuid";
 *     leaf-list server-ltp {
 *         type leafref;
 *     }
 *     leaf-list client-ltp {
 *         type leafref;
 *     }
 *     list lp {
 *         key "uuid";
 *         leaf layer-protocol-name {
 *             type layer-protocol-name;
 *         }
 *         leaf configured-client-capacity {
 *             type to-be-defined;
 *         }
 *         leaf lp-direction {
 *             type termination-direction;
 *         }
 *         leaf termination-state {
 *             type termination-state;
 *         }
 *         list config-and-switch-controller {
 *             key "switch-rule";
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
 *         leaf is-protection-lock-out {
 *             type boolean;
 *         }
 *         leaf fc-blocks-signal-to-lp {
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
 *         uses layer-protocol-g;
 *     }
 *     leaf connected-ltp {
 *         type leafref;
 *     }
 *     leaf peer-ltp {
 *         type leafref;
 *     }
 *     leaf-list physical-port-reference {
 *         type string;
 *     }
 *     leaf-list ltp-in-other-view {
 *         type leafref;
 *     }
 *     leaf ltp-direction {
 *         type termination-direction;
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
 *     uses logical-termination-point-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/network-element/ltp</i>
 *
 * <p>To create instances of this class use {@link LtpBuilder}.
 * @see LtpBuilder
 * @see LtpKey
 *
 */
public interface Ltp
    extends
    ChildOf<NetworkElement>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element.Ltp>,
    LogicalTerminationPointG,
    Identifiable<LtpKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "ltp").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element.LtpKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LtpKey getKey();

}

