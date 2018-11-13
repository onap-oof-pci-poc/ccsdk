package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import java.util.List;

/**
 * This module contains a collection of YANG definitions for managing wireless 
 * networks.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * module core-model {
 *     yang-version 1;
 *     namespace "urn:onf:params:xml:ns:yang:core-model";
 *     prefix "core-model";
 *
 *     revision 2017-03-20 {
 *         description "This module contains a collection of YANG definitions for managing wireless 
 *                     networks.
 *         ";
 *     }
 *
 *     container network-element {
 *         list fd {
 *             key "uuid";
 *             leaf-list layer-protocol-name {
 *                 type layer-protocol-name;
 *             }
 *             leaf-list lower-level-fd {
 *                 type leafref;
 *             }
 *             leaf-list fc {
 *                 type leafref;
 *             }
 *             leaf-list ltp {
 *                 type leafref;
 *             }
 *             leaf-list lower-level-link {
 *                 type string;
 *             }
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
 *             uses forwarding-domain-g;
 *         }
 *         list ltp {
 *             key "uuid";
 *             leaf-list server-ltp {
 *                 type leafref;
 *             }
 *             leaf-list client-ltp {
 *                 type leafref;
 *             }
 *             list lp {
 *                 key "uuid";
 *                 leaf layer-protocol-name {
 *                     type layer-protocol-name;
 *                 }
 *                 leaf configured-client-capacity {
 *                     type to-be-defined;
 *                 }
 *                 leaf lp-direction {
 *                     type termination-direction;
 *                 }
 *                 leaf termination-state {
 *                     type termination-state;
 *                 }
 *                 list config-and-switch-controller {
 *                     key "switch-rule";
 *                     leaf switch-rule {
 *                         type to-be-defined;
 *                     }
 *                     leaf-list fc-switch {
 *                         type leafref;
 *                     }
 *                     container control-parameters {
 *                         leaf reversion-mode {
 *                             type reversion-mode;
 *                         }
 *                         leaf wait-to-revert-time {
 *                             type wait-to-revert-time;
 *                         }
 *                         leaf prot-type {
 *                             type protection-type;
 *                         }
 *                         leaf hold-off-time {
 *                             type int64;
 *                         }
 *                         leaf network-scheme-specification {
 *                             type string;
 *                         }
 *                         uses control-parameters-pac-g;
 *                     }
 *                     leaf-list profile-proxy {
 *                         type string;
 *                     }
 *                     container local-pac {
 *                         list local-id {
 *                             key "value-name";
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         leaf uuid {
 *                             type universal-id;
 *                         }
 *                         list extension {
 *                             key "value-name";
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         leaf operational-state {
 *                             type operational-state;
 *                         }
 *                         leaf administrative-control {
 *                             type administrative-control;
 *                         }
 *                         leaf administrative-state {
 *                             type administrative-state;
 *                         }
 *                         leaf lifecycle-state {
 *                             type lifecycle-state;
 *                         }
 *                         list name {
 *                             key "value-name";
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         list label {
 *                             key "value-name";
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses local-pac-g;
 *                     }
 *                     container global-pac {
 *                         list local-id {
 *                             key "value-name";
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         leaf uuid {
 *                             type universal-id;
 *                         }
 *                         list label {
 *                             key "value-name";
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         leaf operational-state {
 *                             type operational-state;
 *                         }
 *                         leaf administrative-control {
 *                             type administrative-control;
 *                         }
 *                         leaf administrative-state {
 *                             type administrative-state;
 *                         }
 *                         leaf lifecycle-state {
 *                             type lifecycle-state;
 *                         }
 *                         list extension {
 *                             key "value-name";
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         list name {
 *                             key "value-name";
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses global-pac-g;
 *                     }
 *                     leaf is-frozen {
 *                         type boolean;
 *                     }
 *                     leaf is-coordinated-switching-both-ends {
 *                         type boolean;
 *                     }
 *                     leaf-list subordinate-controller {
 *                         type leafref;
 *                     }
 *                     uses configuration-and-switch-controller-g;
 *                 }
 *                 leaf is-protection-lock-out {
 *                     type boolean;
 *                 }
 *                 leaf fc-blocks-signal-to-lp {
 *                     type string;
 *                 }
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
 *                 uses layer-protocol-g;
 *             }
 *             leaf connected-ltp {
 *                 type leafref;
 *             }
 *             leaf peer-ltp {
 *                 type leafref;
 *             }
 *             leaf-list physical-port-reference {
 *                 type string;
 *             }
 *             leaf-list ltp-in-other-view {
 *                 type leafref;
 *             }
 *             leaf ltp-direction {
 *                 type termination-direction;
 *             }
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
 *             uses logical-termination-point-g;
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
 *         uses global-class-g;
 *     }
 *     list forwarding-construct {
 *         key "uuid";
 *         leaf layer-protocol-name {
 *             type layer-protocol-name;
 *         }
 *         leaf-list lower-level-fc {
 *             type leafref;
 *         }
 *         leaf-list fc-route {
 *             type string;
 *         }
 *         list fc-port {
 *             key "uuid";
 *             leaf-list ltp {
 *                 type leafref;
 *             }
 *             leaf role {
 *                 type port-role;
 *             }
 *             leaf fc-port-direction {
 *                 type port-direction;
 *             }
 *             leaf is-protection-lock-out {
 *                 type boolean;
 *             }
 *             leaf selection-priority {
 *                 type int64;
 *             }
 *             leaf is-internal-port {
 *                 type boolean;
 *             }
 *             leaf-list fc-route-feeds-fc-port-egress {
 *                 type string;
 *             }
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
 *             uses fc-port-g;
 *         }
 *         list fc-switch {
 *             key "uuid";
 *             leaf hold-off-time {
 *                 type int64;
 *             }
 *             leaf prot-type {
 *                 type protection-type;
 *             }
 *             leaf reversion-mode {
 *                 type reversion-mode;
 *             }
 *             leaf-list selected-fc-port {
 *                 type leafref;
 *             }
 *             leaf-list profile-proxy {
 *                 type string;
 *             }
 *             container internal-configuration-and-switch-control {
 *                 leaf switch-rule {
 *                     type to-be-defined;
 *                 }
 *                 leaf-list fc-switch {
 *                     type leafref;
 *                 }
 *                 container control-parameters {
 *                     leaf reversion-mode {
 *                         type reversion-mode;
 *                     }
 *                     leaf wait-to-revert-time {
 *                         type wait-to-revert-time;
 *                     }
 *                     leaf prot-type {
 *                         type protection-type;
 *                     }
 *                     leaf hold-off-time {
 *                         type int64;
 *                     }
 *                     leaf network-scheme-specification {
 *                         type string;
 *                     }
 *                     uses control-parameters-pac-g;
 *                 }
 *                 leaf-list profile-proxy {
 *                     type string;
 *                 }
 *                 container local-pac {
 *                     list local-id {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     list extension {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf operational-state {
 *                         type operational-state;
 *                     }
 *                     leaf administrative-control {
 *                         type administrative-control;
 *                     }
 *                     leaf administrative-state {
 *                         type administrative-state;
 *                     }
 *                     leaf lifecycle-state {
 *                         type lifecycle-state;
 *                     }
 *                     list name {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     list label {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses local-pac-g;
 *                 }
 *                 container global-pac {
 *                     list local-id {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     list label {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf operational-state {
 *                         type operational-state;
 *                     }
 *                     leaf administrative-control {
 *                         type administrative-control;
 *                     }
 *                     leaf administrative-state {
 *                         type administrative-state;
 *                     }
 *                     leaf lifecycle-state {
 *                         type lifecycle-state;
 *                     }
 *                     list extension {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     list name {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses global-pac-g;
 *                 }
 *                 leaf is-frozen {
 *                     type boolean;
 *                 }
 *                 leaf is-coordinated-switching-both-ends {
 *                     type boolean;
 *                 }
 *                 leaf-list subordinate-controller {
 *                     type leafref;
 *                 }
 *                 uses configuration-and-switch-controller-g;
 *             }
 *             leaf switch-control {
 *                 type switch-control;
 *             }
 *             leaf switch-selects-ports {
 *                 type port-direction;
 *             }
 *             leaf switch-selection-reason {
 *                 type switch-state-reason;
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
 *             leaf wait-to-restore-time {
 *                 type int64;
 *             }
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
 *             uses fc-switch-g;
 *         }
 *         leaf forwarding-direction {
 *             type forwarding-direction;
 *         }
 *         leaf is-protection-lock-out {
 *             type boolean;
 *         }
 *         leaf service-priority {
 *             type int64;
 *         }
 *         leaf-list supported-link {
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
 *         uses forwarding-construct-g;
 *     }
 *     container operation-envelope {
 *         list operation-set {
 *             key "effort-and-action";
 *             leaf-list after-operation-set {
 *                 type action-effort;
 *             }
 *             leaf-list before-operation-set {
 *                 type action-effort;
 *             }
 *             leaf effort-and-action {
 *                 type action-effort;
 *             }
 *             leaf pause-resume-rule {
 *                 type pause-resume-rule;
 *             }
 *             leaf-list operationset {
 *                 type action-effort;
 *             }
 *             leaf is-short-lived {
 *                 type is-short-lived;
 *             }
 *             list operation-details {
 *                 key "action-verb";
 *                 leaf action-verb {
 *                     type action-verbs;
 *                 }
 *                 list necessary-initialcondition-constraints {
 *                     key "is-not";
 *                     leaf is-not {
 *                         type boolean;
 *                     }
 *                     uses necessary-initial-condition-constraints-g;
 *                 }
 *                 uses operation-details-g;
 *             }
 *             uses operation-set-g;
 *         }
 *         container generaldirectives {
 *             uses general-directives-g;
 *         }
 *         container operationidentifiers {
 *             uses operation-identifiers-g;
 *         }
 *     }
 *     list equipment {
 *         key "uuid";
 *         list connector {
 *             key "uuid";
 *             leaf connector {
 *                 type string;
 *             }
 *             list pin {
 *                 key "position";
 *                 leaf position {
 *                     type leafref;
 *                 }
 *                 leaf orientation {
 *                     type connector-and-pin-orientation;
 *                 }
 *                 uses pin-g;
 *             }
 *             leaf orientation {
 *                 type connector-and-pin-orientation;
 *             }
 *             container manufactured-thing {
 *                 container manufacturer-properties {
 *                     leaf manufacturer-identifier {
 *                         type string;
 *                     }
 *                     leaf manufacturer-name {
 *                         type string;
 *                     }
 *                     uses manufacturer-properties-g;
 *                 }
 *                 container equipment-type {
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf model-identifier {
 *                         type string;
 *                     }
 *                     leaf part-type-identifier {
 *                         type string;
 *                     }
 *                     leaf type-name {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     uses equipment-type-g;
 *                 }
 *                 container equipment-instance {
 *                     leaf manufacture-date {
 *                         type string;
 *                     }
 *                     leaf serial-number {
 *                         type string;
 *                     }
 *                     leaf asset-instance-identifier {
 *                         type string;
 *                     }
 *                     uses equipment-instance-g;
 *                 }
 *                 container operator-augmented-equipment-type {
 *                     leaf asset-type-identifier {
 *                         type string;
 *                     }
 *                     uses operator-augmented-equipment-type-g;
 *                 }
 *                 uses manufactured-thing-g;
 *             }
 *             container position {
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             container mechanical-features {
 *                 uses mechanical-features-g;
 *             }
 *             container pin-layout {
 *                 list position {
 *                     key "relative-position";
 *                     leaf relative-position {
 *                         type to-be-defined;
 *                     }
 *                     uses position-g;
 *                 }
 *                 uses pin-layout-g;
 *             }
 *             leaf connector-type {
 *                 type to-be-defined;
 *             }
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
 *             uses connector-g;
 *         }
 *         list contained-holder {
 *             key "uuid";
 *             leaf-list connector {
 *                 type leafref;
 *             }
 *             leaf occupying-fru {
 *                 type leafref;
 *             }
 *             container spatial-properties-of-type {
 *                 leaf height {
 *                     type to-be-defined;
 *                 }
 *                 leaf width {
 *                     type to-be-defined;
 *                 }
 *                 leaf length {
 *                     type to-be-defined;
 *                 }
 *                 uses spatial-properties-of-type-g;
 *             }
 *             container holder-monitors {
 *                 leaf is-active {
 *                     type boolean;
 *                 }
 *                 leaf is-actual-mismatch-with-expected {
 *                     type boolean;
 *                 }
 *                 leaf aggregate-function {
 *                     type string;
 *                 }
 *                 uses holder-monitors-g;
 *             }
 *             container holder-location {
 *                 leaf address-name {
 *                     type string;
 *                 }
 *                 list address-element {
 *                     key "uuid";
 *                     leaf address-element-name {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container local-id {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses local-id-and-class-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     container name {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container name {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses name-and-class-g;
 *                     }
 *                     leaf arbitrary-element {
 *                         type string;
 *                     }
 *                     uses address-element-g;
 *                 }
 *                 uses address-g;
 *             }
 *             container position {
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             container holder-structure {
 *                 leaf holder-category {
 *                     type holder-category;
 *                 }
 *                 leaf is-captive {
 *                     type boolean;
 *                 }
 *                 leaf is-guided {
 *                     type boolean;
 *                 }
 *                 leaf is-quantized-space {
 *                     type boolean;
 *                 }
 *                 uses holder-structure-g;
 *             }
 *             container physical-rating {
 *                 leaf thermal-rating {
 *                     type to-be-defined;
 *                 }
 *                 leaf power-rating {
 *                     type to-be-defined;
 *                 }
 *                 uses physical-rating-g;
 *             }
 *             leaf-list supported-equipment {
 *                 type string;
 *             }
 *             container expected-holder {
 *                 uses expected-holder-g;
 *             }
 *             container actual-holder {
 *                 uses actual-holder-g;
 *             }
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
 *             uses holder-g;
 *         }
 *         list exposed-cable {
 *             key "uuid";
 *             list connector {
 *                 key "uuid";
 *                 leaf connector {
 *                     type string;
 *                 }
 *                 list pin {
 *                     key "position";
 *                     leaf position {
 *                         type leafref;
 *                     }
 *                     leaf orientation {
 *                         type connector-and-pin-orientation;
 *                     }
 *                     uses pin-g;
 *                 }
 *                 leaf orientation {
 *                     type connector-and-pin-orientation;
 *                 }
 *                 container manufactured-thing {
 *                     container manufacturer-properties {
 *                         leaf manufacturer-identifier {
 *                             type string;
 *                         }
 *                         leaf manufacturer-name {
 *                             type string;
 *                         }
 *                         uses manufacturer-properties-g;
 *                     }
 *                     container equipment-type {
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf model-identifier {
 *                             type string;
 *                         }
 *                         leaf part-type-identifier {
 *                             type string;
 *                         }
 *                         leaf type-name {
 *                             type string;
 *                         }
 *                         leaf version {
 *                             type string;
 *                         }
 *                         uses equipment-type-g;
 *                     }
 *                     container equipment-instance {
 *                         leaf manufacture-date {
 *                             type string;
 *                         }
 *                         leaf serial-number {
 *                             type string;
 *                         }
 *                         leaf asset-instance-identifier {
 *                             type string;
 *                         }
 *                         uses equipment-instance-g;
 *                     }
 *                     container operator-augmented-equipment-type {
 *                         leaf asset-type-identifier {
 *                             type string;
 *                         }
 *                         uses operator-augmented-equipment-type-g;
 *                     }
 *                     uses manufactured-thing-g;
 *                 }
 *                 container position {
 *                     leaf relative-position {
 *                         type to-be-defined;
 *                     }
 *                     uses position-g;
 *                 }
 *                 container mechanical-features {
 *                     uses mechanical-features-g;
 *                 }
 *                 container pin-layout {
 *                     list position {
 *                         key "relative-position";
 *                         leaf relative-position {
 *                             type to-be-defined;
 *                         }
 *                         uses position-g;
 *                     }
 *                     uses pin-layout-g;
 *                 }
 *                 leaf connector-type {
 *                     type to-be-defined;
 *                 }
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
 *                 uses connector-g;
 *             }
 *             container manufactured-thing {
 *                 container manufacturer-properties {
 *                     leaf manufacturer-identifier {
 *                         type string;
 *                     }
 *                     leaf manufacturer-name {
 *                         type string;
 *                     }
 *                     uses manufacturer-properties-g;
 *                 }
 *                 container equipment-type {
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf model-identifier {
 *                         type string;
 *                     }
 *                     leaf part-type-identifier {
 *                         type string;
 *                     }
 *                     leaf type-name {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     uses equipment-type-g;
 *                 }
 *                 container equipment-instance {
 *                     leaf manufacture-date {
 *                         type string;
 *                     }
 *                     leaf serial-number {
 *                         type string;
 *                     }
 *                     leaf asset-instance-identifier {
 *                         type string;
 *                     }
 *                     uses equipment-instance-g;
 *                 }
 *                 container operator-augmented-equipment-type {
 *                     leaf asset-type-identifier {
 *                         type string;
 *                     }
 *                     uses operator-augmented-equipment-type-g;
 *                 }
 *                 uses manufactured-thing-g;
 *             }
 *             container physical-characteristics {
 *                 leaf weight-characteristics {
 *                     type to-be-defined;
 *                 }
 *                 leaf fire-characteristics {
 *                     type to-be-defined;
 *                 }
 *                 leaf materials {
 *                     type to-be-defined;
 *                 }
 *                 uses physical-characteristics-g;
 *             }
 *             container mechanical-features {
 *                 uses mechanical-features-g;
 *             }
 *             container spatial-properties-of-type {
 *                 leaf height {
 *                     type to-be-defined;
 *                 }
 *                 leaf width {
 *                     type to-be-defined;
 *                 }
 *                 leaf length {
 *                     type to-be-defined;
 *                 }
 *                 uses spatial-properties-of-type-g;
 *             }
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
 *             uses cable-g;
 *         }
 *         container manufactured-thing {
 *             container manufacturer-properties {
 *                 leaf manufacturer-identifier {
 *                     type string;
 *                 }
 *                 leaf manufacturer-name {
 *                     type string;
 *                 }
 *                 uses manufacturer-properties-g;
 *             }
 *             container equipment-type {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf model-identifier {
 *                     type string;
 *                 }
 *                 leaf part-type-identifier {
 *                     type string;
 *                 }
 *                 leaf type-name {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 uses equipment-type-g;
 *             }
 *             container equipment-instance {
 *                 leaf manufacture-date {
 *                     type string;
 *                 }
 *                 leaf serial-number {
 *                     type string;
 *                 }
 *                 leaf asset-instance-identifier {
 *                     type string;
 *                 }
 *                 uses equipment-instance-g;
 *             }
 *             container operator-augmented-equipment-type {
 *                 leaf asset-type-identifier {
 *                     type string;
 *                 }
 *                 uses operator-augmented-equipment-type-g;
 *             }
 *             uses manufactured-thing-g;
 *         }
 *         container spatial-properties-of-type {
 *             leaf height {
 *                 type to-be-defined;
 *             }
 *             leaf width {
 *                 type to-be-defined;
 *             }
 *             leaf length {
 *                 type to-be-defined;
 *             }
 *             uses spatial-properties-of-type-g;
 *         }
 *         container mechanical-features {
 *             uses mechanical-features-g;
 *         }
 *         container physical-properties {
 *             leaf temperature {
 *                 type to-be-defined;
 *             }
 *             uses physical-properties-g;
 *         }
 *         container function-enablers {
 *             leaf power-state {
 *                 type to-be-defined;
 *             }
 *             uses function-enablers-g;
 *         }
 *         container mechanical-functions {
 *             leaf rotation-speed {
 *                 type to-be-defined;
 *             }
 *             uses mechanical-functions-g;
 *         }
 *         container physical-characteristics {
 *             leaf weight-characteristics {
 *                 type to-be-defined;
 *             }
 *             leaf fire-characteristics {
 *                 type to-be-defined;
 *             }
 *             leaf materials {
 *                 type to-be-defined;
 *             }
 *             uses physical-characteristics-g;
 *         }
 *         container swapability {
 *             leaf is-hot-swappable {
 *                 type is-hot-swappable;
 *             }
 *             uses swapability-g;
 *         }
 *         container category {
 *             leaf category {
 *                 type equipment-category;
 *             }
 *             uses category-g;
 *         }
 *         container physical-rating {
 *             leaf thermal-rating {
 *                 type to-be-defined;
 *             }
 *             leaf power-rating {
 *                 type to-be-defined;
 *             }
 *             uses physical-rating-g;
 *         }
 *         leaf is-field-replaceable {
 *             type is-field-replaceable;
 *         }
 *         leaf-list function-block {
 *             type string;
 *         }
 *         container expected-equipment {
 *             uses expected-equipment-g;
 *         }
 *         container actual-equipment {
 *             uses actual-equipment-g;
 *         }
 *         container location {
 *             container equipment-location {
 *                 leaf address-name {
 *                     type string;
 *                 }
 *                 list address-element {
 *                     key "uuid";
 *                     leaf address-element-name {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container local-id {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses local-id-and-class-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     container name {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container name {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses name-and-class-g;
 *                     }
 *                     leaf arbitrary-element {
 *                         type string;
 *                     }
 *                     uses address-element-g;
 *                 }
 *                 uses address-g;
 *             }
 *             container geographical-location {
 *                 leaf address-name {
 *                     type string;
 *                 }
 *                 list address-element {
 *                     key "uuid";
 *                     leaf address-element-name {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container local-id {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses local-id-and-class-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     container name {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container name {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses name-and-class-g;
 *                     }
 *                     leaf arbitrary-element {
 *                         type string;
 *                     }
 *                     uses address-element-g;
 *                 }
 *                 uses address-g;
 *             }
 *             uses location-g;
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
 *         uses equipment-g;
 *     }
 *
 *     grouping mechanical-functions-g {
 *         leaf rotation-speed {
 *             type to-be-defined;
 *         }
 *     }
 *     grouping configuration-and-switch-controller-g {
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
 *     }
 *     grouping holder-g {
 *         leaf-list connector {
 *             type leafref;
 *         }
 *         leaf occupying-fru {
 *             type leafref;
 *         }
 *         container spatial-properties-of-type {
 *             leaf height {
 *                 type to-be-defined;
 *             }
 *             leaf width {
 *                 type to-be-defined;
 *             }
 *             leaf length {
 *                 type to-be-defined;
 *             }
 *             uses spatial-properties-of-type-g;
 *         }
 *         container holder-monitors {
 *             leaf is-active {
 *                 type boolean;
 *             }
 *             leaf is-actual-mismatch-with-expected {
 *                 type boolean;
 *             }
 *             leaf aggregate-function {
 *                 type string;
 *             }
 *             uses holder-monitors-g;
 *         }
 *         container holder-location {
 *             leaf address-name {
 *                 type string;
 *             }
 *             list address-element {
 *                 key "uuid";
 *                 leaf address-element-name {
 *                     type string;
 *                 }
 *                 container local-id {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses local-id-and-class-g;
 *                 }
 *                 leaf uuid {
 *                     type universal-id;
 *                 }
 *                 container name {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container name {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses name-and-class-g;
 *                 }
 *                 leaf arbitrary-element {
 *                     type string;
 *                 }
 *                 uses address-element-g;
 *             }
 *             uses address-g;
 *         }
 *         container position {
 *             leaf relative-position {
 *                 type to-be-defined;
 *             }
 *             uses position-g;
 *         }
 *         container holder-structure {
 *             leaf holder-category {
 *                 type holder-category;
 *             }
 *             leaf is-captive {
 *                 type boolean;
 *             }
 *             leaf is-guided {
 *                 type boolean;
 *             }
 *             leaf is-quantized-space {
 *                 type boolean;
 *             }
 *             uses holder-structure-g;
 *         }
 *         container physical-rating {
 *             leaf thermal-rating {
 *                 type to-be-defined;
 *             }
 *             leaf power-rating {
 *                 type to-be-defined;
 *             }
 *             uses physical-rating-g;
 *         }
 *         leaf-list supported-equipment {
 *             type string;
 *         }
 *         container expected-holder {
 *             uses expected-holder-g;
 *         }
 *         container actual-holder {
 *             uses actual-holder-g;
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
 *     }
 *     grouping physical-rating-g {
 *         leaf thermal-rating {
 *             type to-be-defined;
 *         }
 *         leaf power-rating {
 *             type to-be-defined;
 *         }
 *     }
 *     grouping equipment-type-g {
 *         leaf description {
 *             type string;
 *         }
 *         leaf model-identifier {
 *             type string;
 *         }
 *         leaf part-type-identifier {
 *             type string;
 *         }
 *         leaf type-name {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *     }
 *     grouping general-directives-g {
 *     }
 *     grouping control-parameters-pac-g {
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
 *     }
 *     grouping operator-augmented-equipment-type-g {
 *         leaf asset-type-identifier {
 *             type string;
 *         }
 *     }
 *     grouping forwarding-construct-g {
 *         leaf layer-protocol-name {
 *             type layer-protocol-name;
 *         }
 *         leaf-list lower-level-fc {
 *             type leafref;
 *         }
 *         leaf-list fc-route {
 *             type string;
 *         }
 *         list fc-port {
 *             key "uuid";
 *             leaf-list ltp {
 *                 type leafref;
 *             }
 *             leaf role {
 *                 type port-role;
 *             }
 *             leaf fc-port-direction {
 *                 type port-direction;
 *             }
 *             leaf is-protection-lock-out {
 *                 type boolean;
 *             }
 *             leaf selection-priority {
 *                 type int64;
 *             }
 *             leaf is-internal-port {
 *                 type boolean;
 *             }
 *             leaf-list fc-route-feeds-fc-port-egress {
 *                 type string;
 *             }
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
 *             uses fc-port-g;
 *         }
 *         list fc-switch {
 *             key "uuid";
 *             leaf hold-off-time {
 *                 type int64;
 *             }
 *             leaf prot-type {
 *                 type protection-type;
 *             }
 *             leaf reversion-mode {
 *                 type reversion-mode;
 *             }
 *             leaf-list selected-fc-port {
 *                 type leafref;
 *             }
 *             leaf-list profile-proxy {
 *                 type string;
 *             }
 *             container internal-configuration-and-switch-control {
 *                 leaf switch-rule {
 *                     type to-be-defined;
 *                 }
 *                 leaf-list fc-switch {
 *                     type leafref;
 *                 }
 *                 container control-parameters {
 *                     leaf reversion-mode {
 *                         type reversion-mode;
 *                     }
 *                     leaf wait-to-revert-time {
 *                         type wait-to-revert-time;
 *                     }
 *                     leaf prot-type {
 *                         type protection-type;
 *                     }
 *                     leaf hold-off-time {
 *                         type int64;
 *                     }
 *                     leaf network-scheme-specification {
 *                         type string;
 *                     }
 *                     uses control-parameters-pac-g;
 *                 }
 *                 leaf-list profile-proxy {
 *                     type string;
 *                 }
 *                 container local-pac {
 *                     list local-id {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     list extension {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf operational-state {
 *                         type operational-state;
 *                     }
 *                     leaf administrative-control {
 *                         type administrative-control;
 *                     }
 *                     leaf administrative-state {
 *                         type administrative-state;
 *                     }
 *                     leaf lifecycle-state {
 *                         type lifecycle-state;
 *                     }
 *                     list name {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     list label {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses local-pac-g;
 *                 }
 *                 container global-pac {
 *                     list local-id {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     list label {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf operational-state {
 *                         type operational-state;
 *                     }
 *                     leaf administrative-control {
 *                         type administrative-control;
 *                     }
 *                     leaf administrative-state {
 *                         type administrative-state;
 *                     }
 *                     leaf lifecycle-state {
 *                         type lifecycle-state;
 *                     }
 *                     list extension {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     list name {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses global-pac-g;
 *                 }
 *                 leaf is-frozen {
 *                     type boolean;
 *                 }
 *                 leaf is-coordinated-switching-both-ends {
 *                     type boolean;
 *                 }
 *                 leaf-list subordinate-controller {
 *                     type leafref;
 *                 }
 *                 uses configuration-and-switch-controller-g;
 *             }
 *             leaf switch-control {
 *                 type switch-control;
 *             }
 *             leaf switch-selects-ports {
 *                 type port-direction;
 *             }
 *             leaf switch-selection-reason {
 *                 type switch-state-reason;
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
 *             leaf wait-to-restore-time {
 *                 type int64;
 *             }
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
 *             uses fc-switch-g;
 *         }
 *         leaf forwarding-direction {
 *             type forwarding-direction;
 *         }
 *         leaf is-protection-lock-out {
 *             type boolean;
 *         }
 *         leaf service-priority {
 *             type int64;
 *         }
 *         leaf-list supported-link {
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
 *     }
 *     grouping pin-g {
 *         leaf position {
 *             type leafref;
 *         }
 *         leaf orientation {
 *             type connector-and-pin-orientation;
 *         }
 *     }
 *     grouping pin-layout-g {
 *         list position {
 *             key "relative-position";
 *             leaf relative-position {
 *                 type to-be-defined;
 *             }
 *             uses position-g;
 *         }
 *     }
 *     grouping manufactured-thing-g {
 *         container manufacturer-properties {
 *             leaf manufacturer-identifier {
 *                 type string;
 *             }
 *             leaf manufacturer-name {
 *                 type string;
 *             }
 *             uses manufacturer-properties-g;
 *         }
 *         container equipment-type {
 *             leaf description {
 *                 type string;
 *             }
 *             leaf model-identifier {
 *                 type string;
 *             }
 *             leaf part-type-identifier {
 *                 type string;
 *             }
 *             leaf type-name {
 *                 type string;
 *             }
 *             leaf version {
 *                 type string;
 *             }
 *             uses equipment-type-g;
 *         }
 *         container equipment-instance {
 *             leaf manufacture-date {
 *                 type string;
 *             }
 *             leaf serial-number {
 *                 type string;
 *             }
 *             leaf asset-instance-identifier {
 *                 type string;
 *             }
 *             uses equipment-instance-g;
 *         }
 *         container operator-augmented-equipment-type {
 *             leaf asset-type-identifier {
 *                 type string;
 *             }
 *             uses operator-augmented-equipment-type-g;
 *         }
 *     }
 *     grouping name-and-value-g {
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 *     grouping physical-properties-g {
 *         leaf temperature {
 *             type to-be-defined;
 *         }
 *     }
 *     grouping equipment-g {
 *         list connector {
 *             key "uuid";
 *             leaf connector {
 *                 type string;
 *             }
 *             list pin {
 *                 key "position";
 *                 leaf position {
 *                     type leafref;
 *                 }
 *                 leaf orientation {
 *                     type connector-and-pin-orientation;
 *                 }
 *                 uses pin-g;
 *             }
 *             leaf orientation {
 *                 type connector-and-pin-orientation;
 *             }
 *             container manufactured-thing {
 *                 container manufacturer-properties {
 *                     leaf manufacturer-identifier {
 *                         type string;
 *                     }
 *                     leaf manufacturer-name {
 *                         type string;
 *                     }
 *                     uses manufacturer-properties-g;
 *                 }
 *                 container equipment-type {
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf model-identifier {
 *                         type string;
 *                     }
 *                     leaf part-type-identifier {
 *                         type string;
 *                     }
 *                     leaf type-name {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     uses equipment-type-g;
 *                 }
 *                 container equipment-instance {
 *                     leaf manufacture-date {
 *                         type string;
 *                     }
 *                     leaf serial-number {
 *                         type string;
 *                     }
 *                     leaf asset-instance-identifier {
 *                         type string;
 *                     }
 *                     uses equipment-instance-g;
 *                 }
 *                 container operator-augmented-equipment-type {
 *                     leaf asset-type-identifier {
 *                         type string;
 *                     }
 *                     uses operator-augmented-equipment-type-g;
 *                 }
 *                 uses manufactured-thing-g;
 *             }
 *             container position {
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             container mechanical-features {
 *                 uses mechanical-features-g;
 *             }
 *             container pin-layout {
 *                 list position {
 *                     key "relative-position";
 *                     leaf relative-position {
 *                         type to-be-defined;
 *                     }
 *                     uses position-g;
 *                 }
 *                 uses pin-layout-g;
 *             }
 *             leaf connector-type {
 *                 type to-be-defined;
 *             }
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
 *             uses connector-g;
 *         }
 *         list contained-holder {
 *             key "uuid";
 *             leaf-list connector {
 *                 type leafref;
 *             }
 *             leaf occupying-fru {
 *                 type leafref;
 *             }
 *             container spatial-properties-of-type {
 *                 leaf height {
 *                     type to-be-defined;
 *                 }
 *                 leaf width {
 *                     type to-be-defined;
 *                 }
 *                 leaf length {
 *                     type to-be-defined;
 *                 }
 *                 uses spatial-properties-of-type-g;
 *             }
 *             container holder-monitors {
 *                 leaf is-active {
 *                     type boolean;
 *                 }
 *                 leaf is-actual-mismatch-with-expected {
 *                     type boolean;
 *                 }
 *                 leaf aggregate-function {
 *                     type string;
 *                 }
 *                 uses holder-monitors-g;
 *             }
 *             container holder-location {
 *                 leaf address-name {
 *                     type string;
 *                 }
 *                 list address-element {
 *                     key "uuid";
 *                     leaf address-element-name {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container local-id {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses local-id-and-class-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     container name {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container name {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses name-and-class-g;
 *                     }
 *                     leaf arbitrary-element {
 *                         type string;
 *                     }
 *                     uses address-element-g;
 *                 }
 *                 uses address-g;
 *             }
 *             container position {
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             container holder-structure {
 *                 leaf holder-category {
 *                     type holder-category;
 *                 }
 *                 leaf is-captive {
 *                     type boolean;
 *                 }
 *                 leaf is-guided {
 *                     type boolean;
 *                 }
 *                 leaf is-quantized-space {
 *                     type boolean;
 *                 }
 *                 uses holder-structure-g;
 *             }
 *             container physical-rating {
 *                 leaf thermal-rating {
 *                     type to-be-defined;
 *                 }
 *                 leaf power-rating {
 *                     type to-be-defined;
 *                 }
 *                 uses physical-rating-g;
 *             }
 *             leaf-list supported-equipment {
 *                 type string;
 *             }
 *             container expected-holder {
 *                 uses expected-holder-g;
 *             }
 *             container actual-holder {
 *                 uses actual-holder-g;
 *             }
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
 *             uses holder-g;
 *         }
 *         list exposed-cable {
 *             key "uuid";
 *             list connector {
 *                 key "uuid";
 *                 leaf connector {
 *                     type string;
 *                 }
 *                 list pin {
 *                     key "position";
 *                     leaf position {
 *                         type leafref;
 *                     }
 *                     leaf orientation {
 *                         type connector-and-pin-orientation;
 *                     }
 *                     uses pin-g;
 *                 }
 *                 leaf orientation {
 *                     type connector-and-pin-orientation;
 *                 }
 *                 container manufactured-thing {
 *                     container manufacturer-properties {
 *                         leaf manufacturer-identifier {
 *                             type string;
 *                         }
 *                         leaf manufacturer-name {
 *                             type string;
 *                         }
 *                         uses manufacturer-properties-g;
 *                     }
 *                     container equipment-type {
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf model-identifier {
 *                             type string;
 *                         }
 *                         leaf part-type-identifier {
 *                             type string;
 *                         }
 *                         leaf type-name {
 *                             type string;
 *                         }
 *                         leaf version {
 *                             type string;
 *                         }
 *                         uses equipment-type-g;
 *                     }
 *                     container equipment-instance {
 *                         leaf manufacture-date {
 *                             type string;
 *                         }
 *                         leaf serial-number {
 *                             type string;
 *                         }
 *                         leaf asset-instance-identifier {
 *                             type string;
 *                         }
 *                         uses equipment-instance-g;
 *                     }
 *                     container operator-augmented-equipment-type {
 *                         leaf asset-type-identifier {
 *                             type string;
 *                         }
 *                         uses operator-augmented-equipment-type-g;
 *                     }
 *                     uses manufactured-thing-g;
 *                 }
 *                 container position {
 *                     leaf relative-position {
 *                         type to-be-defined;
 *                     }
 *                     uses position-g;
 *                 }
 *                 container mechanical-features {
 *                     uses mechanical-features-g;
 *                 }
 *                 container pin-layout {
 *                     list position {
 *                         key "relative-position";
 *                         leaf relative-position {
 *                             type to-be-defined;
 *                         }
 *                         uses position-g;
 *                     }
 *                     uses pin-layout-g;
 *                 }
 *                 leaf connector-type {
 *                     type to-be-defined;
 *                 }
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
 *                 uses connector-g;
 *             }
 *             container manufactured-thing {
 *                 container manufacturer-properties {
 *                     leaf manufacturer-identifier {
 *                         type string;
 *                     }
 *                     leaf manufacturer-name {
 *                         type string;
 *                     }
 *                     uses manufacturer-properties-g;
 *                 }
 *                 container equipment-type {
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf model-identifier {
 *                         type string;
 *                     }
 *                     leaf part-type-identifier {
 *                         type string;
 *                     }
 *                     leaf type-name {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     uses equipment-type-g;
 *                 }
 *                 container equipment-instance {
 *                     leaf manufacture-date {
 *                         type string;
 *                     }
 *                     leaf serial-number {
 *                         type string;
 *                     }
 *                     leaf asset-instance-identifier {
 *                         type string;
 *                     }
 *                     uses equipment-instance-g;
 *                 }
 *                 container operator-augmented-equipment-type {
 *                     leaf asset-type-identifier {
 *                         type string;
 *                     }
 *                     uses operator-augmented-equipment-type-g;
 *                 }
 *                 uses manufactured-thing-g;
 *             }
 *             container physical-characteristics {
 *                 leaf weight-characteristics {
 *                     type to-be-defined;
 *                 }
 *                 leaf fire-characteristics {
 *                     type to-be-defined;
 *                 }
 *                 leaf materials {
 *                     type to-be-defined;
 *                 }
 *                 uses physical-characteristics-g;
 *             }
 *             container mechanical-features {
 *                 uses mechanical-features-g;
 *             }
 *             container spatial-properties-of-type {
 *                 leaf height {
 *                     type to-be-defined;
 *                 }
 *                 leaf width {
 *                     type to-be-defined;
 *                 }
 *                 leaf length {
 *                     type to-be-defined;
 *                 }
 *                 uses spatial-properties-of-type-g;
 *             }
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
 *             uses cable-g;
 *         }
 *         container manufactured-thing {
 *             container manufacturer-properties {
 *                 leaf manufacturer-identifier {
 *                     type string;
 *                 }
 *                 leaf manufacturer-name {
 *                     type string;
 *                 }
 *                 uses manufacturer-properties-g;
 *             }
 *             container equipment-type {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf model-identifier {
 *                     type string;
 *                 }
 *                 leaf part-type-identifier {
 *                     type string;
 *                 }
 *                 leaf type-name {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 uses equipment-type-g;
 *             }
 *             container equipment-instance {
 *                 leaf manufacture-date {
 *                     type string;
 *                 }
 *                 leaf serial-number {
 *                     type string;
 *                 }
 *                 leaf asset-instance-identifier {
 *                     type string;
 *                 }
 *                 uses equipment-instance-g;
 *             }
 *             container operator-augmented-equipment-type {
 *                 leaf asset-type-identifier {
 *                     type string;
 *                 }
 *                 uses operator-augmented-equipment-type-g;
 *             }
 *             uses manufactured-thing-g;
 *         }
 *         container spatial-properties-of-type {
 *             leaf height {
 *                 type to-be-defined;
 *             }
 *             leaf width {
 *                 type to-be-defined;
 *             }
 *             leaf length {
 *                 type to-be-defined;
 *             }
 *             uses spatial-properties-of-type-g;
 *         }
 *         container mechanical-features {
 *             uses mechanical-features-g;
 *         }
 *         container physical-properties {
 *             leaf temperature {
 *                 type to-be-defined;
 *             }
 *             uses physical-properties-g;
 *         }
 *         container function-enablers {
 *             leaf power-state {
 *                 type to-be-defined;
 *             }
 *             uses function-enablers-g;
 *         }
 *         container mechanical-functions {
 *             leaf rotation-speed {
 *                 type to-be-defined;
 *             }
 *             uses mechanical-functions-g;
 *         }
 *         container physical-characteristics {
 *             leaf weight-characteristics {
 *                 type to-be-defined;
 *             }
 *             leaf fire-characteristics {
 *                 type to-be-defined;
 *             }
 *             leaf materials {
 *                 type to-be-defined;
 *             }
 *             uses physical-characteristics-g;
 *         }
 *         container swapability {
 *             leaf is-hot-swappable {
 *                 type is-hot-swappable;
 *             }
 *             uses swapability-g;
 *         }
 *         container category {
 *             leaf category {
 *                 type equipment-category;
 *             }
 *             uses category-g;
 *         }
 *         container physical-rating {
 *             leaf thermal-rating {
 *                 type to-be-defined;
 *             }
 *             leaf power-rating {
 *                 type to-be-defined;
 *             }
 *             uses physical-rating-g;
 *         }
 *         leaf is-field-replaceable {
 *             type is-field-replaceable;
 *         }
 *         leaf-list function-block {
 *             type string;
 *         }
 *         container expected-equipment {
 *             uses expected-equipment-g;
 *         }
 *         container actual-equipment {
 *             uses actual-equipment-g;
 *         }
 *         container location {
 *             container equipment-location {
 *                 leaf address-name {
 *                     type string;
 *                 }
 *                 list address-element {
 *                     key "uuid";
 *                     leaf address-element-name {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container local-id {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses local-id-and-class-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     container name {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container name {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses name-and-class-g;
 *                     }
 *                     leaf arbitrary-element {
 *                         type string;
 *                     }
 *                     uses address-element-g;
 *                 }
 *                 uses address-g;
 *             }
 *             container geographical-location {
 *                 leaf address-name {
 *                     type string;
 *                 }
 *                 list address-element {
 *                     key "uuid";
 *                     leaf address-element-name {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container local-id {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses local-id-and-class-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     container name {
 *                         leaf class-of-instance {
 *                             type string;
 *                         }
 *                         container name {
 *                             leaf value-name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                             uses name-and-value-g;
 *                         }
 *                         uses name-and-class-g;
 *                     }
 *                     leaf arbitrary-element {
 *                         type string;
 *                     }
 *                     uses address-element-g;
 *                 }
 *                 uses address-g;
 *             }
 *             uses location-g;
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
 *     }
 *     grouping operation-details-g {
 *         leaf action-verb {
 *             type action-verbs;
 *         }
 *         list necessary-initialcondition-constraints {
 *             key "is-not";
 *             leaf is-not {
 *                 type boolean;
 *             }
 *             uses necessary-initial-condition-constraints-g;
 *         }
 *     }
 *     grouping function-enablers-g {
 *         leaf power-state {
 *             type to-be-defined;
 *         }
 *     }
 *     grouping swapability-g {
 *         leaf is-hot-swappable {
 *             type is-hot-swappable;
 *         }
 *     }
 *     grouping local-class-g {
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
 *     }
 *     grouping universal-id-authority-g {
 *         leaf uuid {
 *             type universal-id;
 *         }
 *     }
 *     grouping port-g {
 *     }
 *     grouping category-g {
 *         leaf category {
 *             type equipment-category;
 *         }
 *     }
 *     grouping actual-equipment-g {
 *     }
 *     grouping physical-characteristics-g {
 *         leaf weight-characteristics {
 *             type to-be-defined;
 *         }
 *         leaf fire-characteristics {
 *             type to-be-defined;
 *         }
 *         leaf materials {
 *             type to-be-defined;
 *         }
 *     }
 *     grouping forwarding-domain-g {
 *         leaf-list layer-protocol-name {
 *             type layer-protocol-name;
 *         }
 *         leaf-list lower-level-fd {
 *             type leafref;
 *         }
 *         leaf-list fc {
 *             type leafref;
 *         }
 *         leaf-list ltp {
 *             type leafref;
 *         }
 *         leaf-list lower-level-link {
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
 *     }
 *     grouping connector-on-equipment-for-holder-g {
 *         leaf connector-in-holder {
 *             type universal-id;
 *         }
 *         leaf connector {
 *             type string;
 *         }
 *         list pin {
 *             key "position";
 *             leaf position {
 *                 type leafref;
 *             }
 *             leaf orientation {
 *                 type connector-and-pin-orientation;
 *             }
 *             uses pin-g;
 *         }
 *         leaf orientation {
 *             type connector-and-pin-orientation;
 *         }
 *         container manufactured-thing {
 *             container manufacturer-properties {
 *                 leaf manufacturer-identifier {
 *                     type string;
 *                 }
 *                 leaf manufacturer-name {
 *                     type string;
 *                 }
 *                 uses manufacturer-properties-g;
 *             }
 *             container equipment-type {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf model-identifier {
 *                     type string;
 *                 }
 *                 leaf part-type-identifier {
 *                     type string;
 *                 }
 *                 leaf type-name {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 uses equipment-type-g;
 *             }
 *             container equipment-instance {
 *                 leaf manufacture-date {
 *                     type string;
 *                 }
 *                 leaf serial-number {
 *                     type string;
 *                 }
 *                 leaf asset-instance-identifier {
 *                     type string;
 *                 }
 *                 uses equipment-instance-g;
 *             }
 *             container operator-augmented-equipment-type {
 *                 leaf asset-type-identifier {
 *                     type string;
 *                 }
 *                 uses operator-augmented-equipment-type-g;
 *             }
 *             uses manufactured-thing-g;
 *         }
 *         container position {
 *             leaf relative-position {
 *                 type to-be-defined;
 *             }
 *             uses position-g;
 *         }
 *         container mechanical-features {
 *             uses mechanical-features-g;
 *         }
 *         container pin-layout {
 *             list position {
 *                 key "relative-position";
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             uses pin-layout-g;
 *         }
 *         leaf connector-type {
 *             type to-be-defined;
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
 *     }
 *     grouping equipment-instance-g {
 *         leaf manufacture-date {
 *             type string;
 *         }
 *         leaf serial-number {
 *             type string;
 *         }
 *         leaf asset-instance-identifier {
 *             type string;
 *         }
 *     }
 *     grouping position-g {
 *         leaf relative-position {
 *             type to-be-defined;
 *         }
 *     }
 *     grouping name-g {
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
 *     }
 *     grouping extension-g {
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
 *     }
 *     grouping fc-switch-g {
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
 *     }
 *     grouping mechanical-features-g {
 *     }
 *     grouping holder-monitors-g {
 *         leaf is-active {
 *             type boolean;
 *         }
 *         leaf is-actual-mismatch-with-expected {
 *             type boolean;
 *         }
 *         leaf aggregate-function {
 *             type string;
 *         }
 *     }
 *     grouping address-g {
 *         leaf address-name {
 *             type string;
 *         }
 *         list address-element {
 *             key "uuid";
 *             leaf address-element-name {
 *                 type string;
 *             }
 *             container local-id {
 *                 leaf class-of-instance {
 *                     type string;
 *                 }
 *                 container local-id {
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 uses local-id-and-class-g;
 *             }
 *             leaf uuid {
 *                 type universal-id;
 *             }
 *             container name {
 *                 leaf class-of-instance {
 *                     type string;
 *                 }
 *                 container name {
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 uses name-and-class-g;
 *             }
 *             leaf arbitrary-element {
 *                 type string;
 *             }
 *             uses address-element-g;
 *         }
 *     }
 *     grouping global-pac-g {
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
 *     }
 *     grouping fc-port-g {
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
 *     }
 *     grouping connector-in-holder-g {
 *         leaf connector-on-equipment-for-holder {
 *             type universal-id;
 *         }
 *         leaf connector {
 *             type string;
 *         }
 *         list pin {
 *             key "position";
 *             leaf position {
 *                 type leafref;
 *             }
 *             leaf orientation {
 *                 type connector-and-pin-orientation;
 *             }
 *             uses pin-g;
 *         }
 *         leaf orientation {
 *             type connector-and-pin-orientation;
 *         }
 *         container manufactured-thing {
 *             container manufacturer-properties {
 *                 leaf manufacturer-identifier {
 *                     type string;
 *                 }
 *                 leaf manufacturer-name {
 *                     type string;
 *                 }
 *                 uses manufacturer-properties-g;
 *             }
 *             container equipment-type {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf model-identifier {
 *                     type string;
 *                 }
 *                 leaf part-type-identifier {
 *                     type string;
 *                 }
 *                 leaf type-name {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 uses equipment-type-g;
 *             }
 *             container equipment-instance {
 *                 leaf manufacture-date {
 *                     type string;
 *                 }
 *                 leaf serial-number {
 *                     type string;
 *                 }
 *                 leaf asset-instance-identifier {
 *                     type string;
 *                 }
 *                 uses equipment-instance-g;
 *             }
 *             container operator-augmented-equipment-type {
 *                 leaf asset-type-identifier {
 *                     type string;
 *                 }
 *                 uses operator-augmented-equipment-type-g;
 *             }
 *             uses manufactured-thing-g;
 *         }
 *         container position {
 *             leaf relative-position {
 *                 type to-be-defined;
 *             }
 *             uses position-g;
 *         }
 *         container mechanical-features {
 *             uses mechanical-features-g;
 *         }
 *         container pin-layout {
 *             list position {
 *                 key "relative-position";
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             uses pin-layout-g;
 *         }
 *         leaf connector-type {
 *             type to-be-defined;
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
 *     }
 *     grouping pin-group-g {
 *         leaf-list pin {
 *             type leafref;
 *         }
 *     }
 *     grouping spatial-properties-of-type-g {
 *         leaf height {
 *             type to-be-defined;
 *         }
 *         leaf width {
 *             type to-be-defined;
 *         }
 *         leaf length {
 *             type to-be-defined;
 *         }
 *     }
 *     grouping manufacturer-properties-g {
 *         leaf manufacturer-identifier {
 *             type string;
 *         }
 *         leaf manufacturer-name {
 *             type string;
 *         }
 *     }
 *     grouping operation-identifiers-g {
 *     }
 *     grouping connector-cable-end-g {
 *         leaf connector-on-equipment-for-cable {
 *             type universal-id;
 *         }
 *         leaf connector {
 *             type string;
 *         }
 *         list pin {
 *             key "position";
 *             leaf position {
 *                 type leafref;
 *             }
 *             leaf orientation {
 *                 type connector-and-pin-orientation;
 *             }
 *             uses pin-g;
 *         }
 *         leaf orientation {
 *             type connector-and-pin-orientation;
 *         }
 *         container manufactured-thing {
 *             container manufacturer-properties {
 *                 leaf manufacturer-identifier {
 *                     type string;
 *                 }
 *                 leaf manufacturer-name {
 *                     type string;
 *                 }
 *                 uses manufacturer-properties-g;
 *             }
 *             container equipment-type {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf model-identifier {
 *                     type string;
 *                 }
 *                 leaf part-type-identifier {
 *                     type string;
 *                 }
 *                 leaf type-name {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 uses equipment-type-g;
 *             }
 *             container equipment-instance {
 *                 leaf manufacture-date {
 *                     type string;
 *                 }
 *                 leaf serial-number {
 *                     type string;
 *                 }
 *                 leaf asset-instance-identifier {
 *                     type string;
 *                 }
 *                 uses equipment-instance-g;
 *             }
 *             container operator-augmented-equipment-type {
 *                 leaf asset-type-identifier {
 *                     type string;
 *                 }
 *                 uses operator-augmented-equipment-type-g;
 *             }
 *             uses manufactured-thing-g;
 *         }
 *         container position {
 *             leaf relative-position {
 *                 type to-be-defined;
 *             }
 *             uses position-g;
 *         }
 *         container mechanical-features {
 *             uses mechanical-features-g;
 *         }
 *         container pin-layout {
 *             list position {
 *                 key "relative-position";
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             uses pin-layout-g;
 *         }
 *         leaf connector-type {
 *             type to-be-defined;
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
 *     }
 *     grouping global-class-g {
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
 *     }
 *     grouping expected-equipment-g {
 *     }
 *     grouping name-and-class-g {
 *         leaf class-of-instance {
 *             type string;
 *         }
 *         container name {
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *     }
 *     grouping connector-on-equipment-for-cable-g {
 *         leaf connector-cable-end {
 *             type universal-id;
 *         }
 *         leaf connector {
 *             type string;
 *         }
 *         list pin {
 *             key "position";
 *             leaf position {
 *                 type leafref;
 *             }
 *             leaf orientation {
 *                 type connector-and-pin-orientation;
 *             }
 *             uses pin-g;
 *         }
 *         leaf orientation {
 *             type connector-and-pin-orientation;
 *         }
 *         container manufactured-thing {
 *             container manufacturer-properties {
 *                 leaf manufacturer-identifier {
 *                     type string;
 *                 }
 *                 leaf manufacturer-name {
 *                     type string;
 *                 }
 *                 uses manufacturer-properties-g;
 *             }
 *             container equipment-type {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf model-identifier {
 *                     type string;
 *                 }
 *                 leaf part-type-identifier {
 *                     type string;
 *                 }
 *                 leaf type-name {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 uses equipment-type-g;
 *             }
 *             container equipment-instance {
 *                 leaf manufacture-date {
 *                     type string;
 *                 }
 *                 leaf serial-number {
 *                     type string;
 *                 }
 *                 leaf asset-instance-identifier {
 *                     type string;
 *                 }
 *                 uses equipment-instance-g;
 *             }
 *             container operator-augmented-equipment-type {
 *                 leaf asset-type-identifier {
 *                     type string;
 *                 }
 *                 uses operator-augmented-equipment-type-g;
 *             }
 *             uses manufactured-thing-g;
 *         }
 *         container position {
 *             leaf relative-position {
 *                 type to-be-defined;
 *             }
 *             uses position-g;
 *         }
 *         container mechanical-features {
 *             uses mechanical-features-g;
 *         }
 *         container pin-layout {
 *             list position {
 *                 key "relative-position";
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             uses pin-layout-g;
 *         }
 *         leaf connector-type {
 *             type to-be-defined;
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
 *     }
 *     grouping layer-protocol-g {
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
 *     }
 *     grouping connector-g {
 *         leaf connector {
 *             type string;
 *         }
 *         list pin {
 *             key "position";
 *             leaf position {
 *                 type leafref;
 *             }
 *             leaf orientation {
 *                 type connector-and-pin-orientation;
 *             }
 *             uses pin-g;
 *         }
 *         leaf orientation {
 *             type connector-and-pin-orientation;
 *         }
 *         container manufactured-thing {
 *             container manufacturer-properties {
 *                 leaf manufacturer-identifier {
 *                     type string;
 *                 }
 *                 leaf manufacturer-name {
 *                     type string;
 *                 }
 *                 uses manufacturer-properties-g;
 *             }
 *             container equipment-type {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf model-identifier {
 *                     type string;
 *                 }
 *                 leaf part-type-identifier {
 *                     type string;
 *                 }
 *                 leaf type-name {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 uses equipment-type-g;
 *             }
 *             container equipment-instance {
 *                 leaf manufacture-date {
 *                     type string;
 *                 }
 *                 leaf serial-number {
 *                     type string;
 *                 }
 *                 leaf asset-instance-identifier {
 *                     type string;
 *                 }
 *                 uses equipment-instance-g;
 *             }
 *             container operator-augmented-equipment-type {
 *                 leaf asset-type-identifier {
 *                     type string;
 *                 }
 *                 uses operator-augmented-equipment-type-g;
 *             }
 *             uses manufactured-thing-g;
 *         }
 *         container position {
 *             leaf relative-position {
 *                 type to-be-defined;
 *             }
 *             uses position-g;
 *         }
 *         container mechanical-features {
 *             uses mechanical-features-g;
 *         }
 *         container pin-layout {
 *             list position {
 *                 key "relative-position";
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             uses pin-layout-g;
 *         }
 *         leaf connector-type {
 *             type to-be-defined;
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
 *     }
 *     grouping operation-set-g {
 *         leaf-list after-operation-set {
 *             type action-effort;
 *         }
 *         leaf-list before-operation-set {
 *             type action-effort;
 *         }
 *         leaf effort-and-action {
 *             type action-effort;
 *         }
 *         leaf pause-resume-rule {
 *             type pause-resume-rule;
 *         }
 *         leaf-list operationset {
 *             type action-effort;
 *         }
 *         leaf is-short-lived {
 *             type is-short-lived;
 *         }
 *         list operation-details {
 *             key "action-verb";
 *             leaf action-verb {
 *                 type action-verbs;
 *             }
 *             list necessary-initialcondition-constraints {
 *                 key "is-not";
 *                 leaf is-not {
 *                     type boolean;
 *                 }
 *                 uses necessary-initial-condition-constraints-g;
 *             }
 *             uses operation-details-g;
 *         }
 *     }
 *     grouping state-pac-g {
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
 *     }
 *     grouping local-pac-g {
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
 *     }
 *     grouping expected-holder-g {
 *     }
 *     grouping name-and-value-authority-g {
 *         leaf uuid {
 *             type universal-id;
 *         }
 *     }
 *     grouping holder-structure-g {
 *         leaf holder-category {
 *             type holder-category;
 *         }
 *         leaf is-captive {
 *             type boolean;
 *         }
 *         leaf is-guided {
 *             type boolean;
 *         }
 *         leaf is-quantized-space {
 *             type boolean;
 *         }
 *     }
 *     grouping elemental-signals-g {
 *         leaf-list pin {
 *             type leafref;
 *         }
 *     }
 *     grouping address-element-g {
 *         leaf address-element-name {
 *             type string;
 *         }
 *         container local-id {
 *             leaf class-of-instance {
 *                 type string;
 *             }
 *             container local-id {
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             uses local-id-and-class-g;
 *         }
 *         leaf uuid {
 *             type universal-id;
 *         }
 *         container name {
 *             leaf class-of-instance {
 *                 type string;
 *             }
 *             container name {
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             uses name-and-class-g;
 *         }
 *         leaf arbitrary-element {
 *             type string;
 *         }
 *     }
 *     grouping necessary-initial-condition-constraints-g {
 *         leaf is-not {
 *             type boolean;
 *         }
 *     }
 *     grouping signal-ref-pt-g {
 *         leaf ltp {
 *             type leafref;
 *         }
 *         leaf-list elemental-signals {
 *             type universal-id;
 *         }
 *     }
 *     grouping label-g {
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
 *     }
 *     grouping cable-g {
 *         list connector {
 *             key "uuid";
 *             leaf connector {
 *                 type string;
 *             }
 *             list pin {
 *                 key "position";
 *                 leaf position {
 *                     type leafref;
 *                 }
 *                 leaf orientation {
 *                     type connector-and-pin-orientation;
 *                 }
 *                 uses pin-g;
 *             }
 *             leaf orientation {
 *                 type connector-and-pin-orientation;
 *             }
 *             container manufactured-thing {
 *                 container manufacturer-properties {
 *                     leaf manufacturer-identifier {
 *                         type string;
 *                     }
 *                     leaf manufacturer-name {
 *                         type string;
 *                     }
 *                     uses manufacturer-properties-g;
 *                 }
 *                 container equipment-type {
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf model-identifier {
 *                         type string;
 *                     }
 *                     leaf part-type-identifier {
 *                         type string;
 *                     }
 *                     leaf type-name {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     uses equipment-type-g;
 *                 }
 *                 container equipment-instance {
 *                     leaf manufacture-date {
 *                         type string;
 *                     }
 *                     leaf serial-number {
 *                         type string;
 *                     }
 *                     leaf asset-instance-identifier {
 *                         type string;
 *                     }
 *                     uses equipment-instance-g;
 *                 }
 *                 container operator-augmented-equipment-type {
 *                     leaf asset-type-identifier {
 *                         type string;
 *                     }
 *                     uses operator-augmented-equipment-type-g;
 *                 }
 *                 uses manufactured-thing-g;
 *             }
 *             container position {
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             container mechanical-features {
 *                 uses mechanical-features-g;
 *             }
 *             container pin-layout {
 *                 list position {
 *                     key "relative-position";
 *                     leaf relative-position {
 *                         type to-be-defined;
 *                     }
 *                     uses position-g;
 *                 }
 *                 uses pin-layout-g;
 *             }
 *             leaf connector-type {
 *                 type to-be-defined;
 *             }
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
 *             uses connector-g;
 *         }
 *         container manufactured-thing {
 *             container manufacturer-properties {
 *                 leaf manufacturer-identifier {
 *                     type string;
 *                 }
 *                 leaf manufacturer-name {
 *                     type string;
 *                 }
 *                 uses manufacturer-properties-g;
 *             }
 *             container equipment-type {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf model-identifier {
 *                     type string;
 *                 }
 *                 leaf part-type-identifier {
 *                     type string;
 *                 }
 *                 leaf type-name {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 uses equipment-type-g;
 *             }
 *             container equipment-instance {
 *                 leaf manufacture-date {
 *                     type string;
 *                 }
 *                 leaf serial-number {
 *                     type string;
 *                 }
 *                 leaf asset-instance-identifier {
 *                     type string;
 *                 }
 *                 uses equipment-instance-g;
 *             }
 *             container operator-augmented-equipment-type {
 *                 leaf asset-type-identifier {
 *                     type string;
 *                 }
 *                 uses operator-augmented-equipment-type-g;
 *             }
 *             uses manufactured-thing-g;
 *         }
 *         container physical-characteristics {
 *             leaf weight-characteristics {
 *                 type to-be-defined;
 *             }
 *             leaf fire-characteristics {
 *                 type to-be-defined;
 *             }
 *             leaf materials {
 *                 type to-be-defined;
 *             }
 *             uses physical-characteristics-g;
 *         }
 *         container mechanical-features {
 *             uses mechanical-features-g;
 *         }
 *         container spatial-properties-of-type {
 *             leaf height {
 *                 type to-be-defined;
 *             }
 *             leaf width {
 *                 type to-be-defined;
 *             }
 *             leaf length {
 *                 type to-be-defined;
 *             }
 *             uses spatial-properties-of-type-g;
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
 *     }
 *     grouping group-of-pins-g {
 *     }
 *     grouping logical-termination-point-g {
 *         leaf-list server-ltp {
 *             type leafref;
 *         }
 *         leaf-list client-ltp {
 *             type leafref;
 *         }
 *         list lp {
 *             key "uuid";
 *             leaf layer-protocol-name {
 *                 type layer-protocol-name;
 *             }
 *             leaf configured-client-capacity {
 *                 type to-be-defined;
 *             }
 *             leaf lp-direction {
 *                 type termination-direction;
 *             }
 *             leaf termination-state {
 *                 type termination-state;
 *             }
 *             list config-and-switch-controller {
 *                 key "switch-rule";
 *                 leaf switch-rule {
 *                     type to-be-defined;
 *                 }
 *                 leaf-list fc-switch {
 *                     type leafref;
 *                 }
 *                 container control-parameters {
 *                     leaf reversion-mode {
 *                         type reversion-mode;
 *                     }
 *                     leaf wait-to-revert-time {
 *                         type wait-to-revert-time;
 *                     }
 *                     leaf prot-type {
 *                         type protection-type;
 *                     }
 *                     leaf hold-off-time {
 *                         type int64;
 *                     }
 *                     leaf network-scheme-specification {
 *                         type string;
 *                     }
 *                     uses control-parameters-pac-g;
 *                 }
 *                 leaf-list profile-proxy {
 *                     type string;
 *                 }
 *                 container local-pac {
 *                     list local-id {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     list extension {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf operational-state {
 *                         type operational-state;
 *                     }
 *                     leaf administrative-control {
 *                         type administrative-control;
 *                     }
 *                     leaf administrative-state {
 *                         type administrative-state;
 *                     }
 *                     leaf lifecycle-state {
 *                         type lifecycle-state;
 *                     }
 *                     list name {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     list label {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses local-pac-g;
 *                 }
 *                 container global-pac {
 *                     list local-id {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf uuid {
 *                         type universal-id;
 *                     }
 *                     list label {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     leaf operational-state {
 *                         type operational-state;
 *                     }
 *                     leaf administrative-control {
 *                         type administrative-control;
 *                     }
 *                     leaf administrative-state {
 *                         type administrative-state;
 *                     }
 *                     leaf lifecycle-state {
 *                         type lifecycle-state;
 *                     }
 *                     list extension {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     list name {
 *                         key "value-name";
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses global-pac-g;
 *                 }
 *                 leaf is-frozen {
 *                     type boolean;
 *                 }
 *                 leaf is-coordinated-switching-both-ends {
 *                     type boolean;
 *                 }
 *                 leaf-list subordinate-controller {
 *                     type leafref;
 *                 }
 *                 uses configuration-and-switch-controller-g;
 *             }
 *             leaf is-protection-lock-out {
 *                 type boolean;
 *             }
 *             leaf fc-blocks-signal-to-lp {
 *                 type string;
 *             }
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
 *             uses layer-protocol-g;
 *         }
 *         leaf connected-ltp {
 *             type leafref;
 *         }
 *         leaf peer-ltp {
 *             type leafref;
 *         }
 *         leaf-list physical-port-reference {
 *             type string;
 *         }
 *         leaf-list ltp-in-other-view {
 *             type leafref;
 *         }
 *         leaf ltp-direction {
 *             type termination-direction;
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
 *     }
 *     grouping location-g {
 *         container equipment-location {
 *             leaf address-name {
 *                 type string;
 *             }
 *             list address-element {
 *                 key "uuid";
 *                 leaf address-element-name {
 *                     type string;
 *                 }
 *                 container local-id {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses local-id-and-class-g;
 *                 }
 *                 leaf uuid {
 *                     type universal-id;
 *                 }
 *                 container name {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container name {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses name-and-class-g;
 *                 }
 *                 leaf arbitrary-element {
 *                     type string;
 *                 }
 *                 uses address-element-g;
 *             }
 *             uses address-g;
 *         }
 *         container geographical-location {
 *             leaf address-name {
 *                 type string;
 *             }
 *             list address-element {
 *                 key "uuid";
 *                 leaf address-element-name {
 *                     type string;
 *                 }
 *                 container local-id {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses local-id-and-class-g;
 *                 }
 *                 leaf uuid {
 *                     type universal-id;
 *                 }
 *                 container name {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container name {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses name-and-class-g;
 *                 }
 *                 leaf arbitrary-element {
 *                     type string;
 *                 }
 *                 uses address-element-g;
 *             }
 *             uses address-g;
 *         }
 *     }
 *     grouping local-id-and-class-g {
 *         leaf class-of-instance {
 *             type string;
 *         }
 *         container local-id {
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *     }
 *     grouping conditional-package-g {
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
 *     }
 *     grouping actual-holder-g {
 *     }
 *     grouping signal-ref-pt-group-g {
 *         leaf pin-group {
 *             type universal-id;
 *         }
 *         leaf-list signal-ref-pt {
 *             type universal-id;
 *         }
 *     }
 *
 *     feature protection-exclude-server {
 *         description
 *             "In protection context if server of protection where entire server is to be excluded from use for protection.";
 *         status CURRENT;
 *     }
 *     feature protection-exclude-fc-port {
 *         description
 *             "In protection context where the FcPort is to be excluded from use for protection.";
 *         status CURRENT;
 *     }
 *     feature protection-exclude-ltp {
 *         description
 *             "In protection context if LTP of protection where entire LTP is to be excluded from use for protection.";
 *         status CURRENT;
 *     }
 * }
 * </pre>
 *
 */
public interface CoreModelData
    extends
    DataRoot
{




    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElement</code> <code>networkElement</code>, or <code>null</code> if not present
     */
    NetworkElement getNetworkElement();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>forwardingConstruct</code>, or <code>null</code> if not present
     */
    List<ForwardingConstruct> getForwardingConstruct();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope</code> <code>operationEnvelope</code>, or <code>null</code> if not present
     */
    OperationEnvelope getOperationEnvelope();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>equipment</code>, or <code>null</code> if not present
     */
    List<Equipment> getEquipment();

}

