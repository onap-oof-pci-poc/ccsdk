package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container internal-configuration-and-switch-control {
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
 *     uses configuration-and-switch-controller-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/fc-switch-g/internal-configuration-and-switch-control</i>
 *
 * <p>To create instances of this class use {@link InternalConfigurationAndSwitchControlBuilder}.
 * @see InternalConfigurationAndSwitchControlBuilder
 *
 */
public interface InternalConfigurationAndSwitchControl
    extends
    ChildOf<FcSwitchG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>,
    ConfigurationAndSwitchControllerG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "internal-configuration-and-switch-control").intern();


}

