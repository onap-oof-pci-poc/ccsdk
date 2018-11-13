package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import java.util.List;

/**
 * This module contains a collection of YANG definitions for managing wireless 
 * networks.This model is for vendor agnostic management of wireless network 
 * elements.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * module microwave-model {
 *     yang-version 1;
 *     namespace "urn:onf:params:xml:ns:yang:microwave-model";
 *     prefix "microwave-model";
 *
 *     import ietf-yang-types { prefix "yang"; }
 *     
 *     import g.874.1-model { prefix "g"; }
 *     
 *     import core-model { prefix "core-model"; }
 *     revision 2018-10-10 {
 *         description "This module contains a collection of YANG definitions for managing wireless 
 *                     networks.This model is for vendor agnostic management of wireless network 
 *                     elements.
 *         ";
 *     }
 *
 *     list mw-air-interface-pac {
 *         key "layer-protocol";
 *         leaf layer-protocol {
 *             type leafref;
 *         }
 *         container air-interface-capability {
 *             leaf type-of-equipment {
 *                 type type-of-equipment;
 *             }
 *             leaf tx-frequency-min {
 *                 type tx-frequency-min;
 *             }
 *             leaf tx-frequency-max {
 *                 type tx-frequency-max;
 *             }
 *             leaf rx-frequency-min {
 *                 type rx-frequency-min;
 *             }
 *             leaf rx-frequency-max {
 *                 type rx-frequency-max;
 *             }
 *             leaf adaptive-modulation-is-avail {
 *                 type adaptive-modulation-is-avail;
 *             }
 *             leaf mimo-is-avail {
 *                 type mimo-is-avail;
 *             }
 *             leaf mimo-channels {
 *                 type mimo-channels;
 *             }
 *             leaf alic-is-avail {
 *                 type alic-is-avail;
 *             }
 *             leaf atpc-is-avail {
 *                 type atpc-is-avail;
 *             }
 *             leaf atpc-range {
 *                 type atpc-range;
 *             }
 *             leaf encryption-is-avail {
 *                 type encryption-is-avail;
 *             }
 *             leaf-list supported-loop-back-kind-list {
 *                 type loop-back-type;
 *             }
 *             leaf maintenance-timer-range {
 *                 type maintenance-timer-range;
 *             }
 *             leaf-list supported-alarm-list {
 *                 type string;
 *             }
 *             leaf supported-alarms {
 *                 type supported-alarms;
 *                 status DEPRECATED;
 *             }
 *             list supported-channel-plan-list {
 *                 key "supported-channel-plan";
 *                 leaf supported-channel-plan {
 *                     type string;
 *                 }
 *                 leaf duplex-distance-is-variable {
 *                     type duplex-distance-is-variable;
 *                 }
 *                 leaf-list duplex-distance-list {
 *                     type duplex-distance-list;
 *                 }
 *                 leaf duplex-distance {
 *                     type duplex-distance;
 *                     status DEPRECATED;
 *                 }
 *                 leaf auto-freq-select-is-avail {
 *                     type auto-freq-select-is-avail;
 *                 }
 *                 list transmission-mode-list {
 *                     key "transmission-mode-id";
 *                     leaf transmission-mode-id {
 *                         type universal-id;
 *                     }
 *                     leaf transmission-mode-name {
 *                         type transmission-mode-name;
 *                     }
 *                     leaf channel-bandwidth {
 *                         type channel-bandwidth;
 *                     }
 *                     leaf modulation-scheme {
 *                         type modulation-scheme;
 *                     }
 *                     leaf code-rate {
 *                         type code-rate;
 *                     }
 *                     leaf symbol-rate-reduction-factor {
 *                         type symbol-rate-reduction-factor;
 *                     }
 *                     leaf tx-power-min {
 *                         type tx-power-min;
 *                     }
 *                     leaf tx-power-max {
 *                         type tx-power-max;
 *                     }
 *                     leaf rx-threshold {
 *                         type rx-threshold;
 *                     }
 *                     leaf am-upshift-level {
 *                         type am-upshift-level;
 *                     }
 *                     leaf am-downshift-level {
 *                         type am-downshift-level;
 *                     }
 *                     leaf xpic-is-avail {
 *                         type xpic-is-avail;
 *                     }
 *                     uses transmission-mode-type-g;
 *                 }
 *                 uses channel-plan-type-g;
 *             }
 *             uses air-interface-capability-g;
 *         }
 *         container air-interface-configuration {
 *             leaf air-interface-name {
 *                 type air-interface-name;
 *             }
 *             leaf remote-air-interface-name {
 *                 type remote-air-interface-name;
 *             }
 *             leaf expected-signal-id {
 *                 type int16;
 *             }
 *             leaf transmitted-signal-id {
 *                 type int16;
 *             }
 *             leaf radio-signal-id {
 *                 type radio-signal-id;
 *                 status DEPRECATED;
 *             }
 *             leaf tx-frequency {
 *                 type tx-frequency;
 *             }
 *             leaf rx-frequency {
 *                 type rx-frequency;
 *             }
 *             leaf transmission-mode-min {
 *                 type universal-id;
 *             }
 *             leaf transmission-mode-max {
 *                 type universal-id;
 *             }
 *             leaf tx-channel-bandwidth {
 *                 type tx-channel-bandwidth;
 *                 status DEPRECATED;
 *             }
 *             leaf rx-channel-bandwidth {
 *                 type rx-channel-bandwidth;
 *             }
 *             leaf polarization {
 *                 type polarization;
 *             }
 *             leaf power-is-on {
 *                 type power-is-on;
 *             }
 *             leaf transmitter-is-on {
 *                 type transmitter-is-on;
 *             }
 *             leaf receiver-is-on {
 *                 type receiver-is-on;
 *             }
 *             leaf tx-power {
 *                 type tx-power;
 *             }
 *             leaf adaptive-modulation-is-on {
 *                 type adaptive-modulation-is-on;
 *             }
 *             leaf modulation-min {
 *                 type modulation-min;
 *                 status DEPRECATED;
 *             }
 *             leaf modulation-max {
 *                 type modulation-max;
 *                 status DEPRECATED;
 *             }
 *             leaf xpic-is-on {
 *                 type xpic-is-on;
 *             }
 *             leaf mimo-is-on {
 *                 type mimo-is-on;
 *             }
 *             leaf alic-is-on {
 *                 type alic-is-on;
 *             }
 *             leaf atpc-is-on {
 *                 type atpc-is-on;
 *             }
 *             leaf atpc-thresh-upper {
 *                 type atpc-thresh-upper;
 *             }
 *             leaf atpc-thresh-lower {
 *                 type atpc-thresh-lower;
 *             }
 *             leaf atpc-tx-power-min {
 *                 type atpc-tx-power-min;
 *             }
 *             leaf auto-freq-select-is-on {
 *                 type auto-freq-select-is-on;
 *             }
 *             leaf auto-freq-select-range {
 *                 type auto-freq-select-range;
 *             }
 *             leaf modulation-is-on {
 *                 type modulation-is-on;
 *             }
 *             leaf encryption-is-on {
 *                 type encryption-is-on;
 *             }
 *             leaf cryptographic-key {
 *                 type cryptographic-key;
 *             }
 *             leaf performance-monitoring-collection-is-on {
 *                 type performance-monitoring-collection-is-on;
 *             }
 *             list threshold-cross-alarm-list {
 *                 key "g826-value-kind" "granularity-period";
 *                 leaf g826-value-kind {
 *                     type g826-type;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf alarm-raising-threshold {
 *                     type alarm-raising-threshold;
 *                 }
 *                 leaf alarm-clearing-threshold {
 *                     type alarm-clearing-threshold;
 *                 }
 *                 uses threshold-cross-alarm-type-g;
 *             }
 *             leaf loop-back-kind-on {
 *                 type loop-back-kind-on;
 *             }
 *             leaf maintenance-timer {
 *                 type maintenance-timer;
 *             }
 *             list problem-kind-severity-list {
 *                 key "problem-kind-name";
 *                 leaf problem-kind-name {
 *                     type string;
 *                 }
 *                 leaf problem-kind-severity {
 *                     type problem-kind-severity;
 *                 }
 *                 uses air-interface-problem-severity-type-g;
 *             }
 *             uses air-interface-configuration-g;
 *         }
 *         container air-interface-status {
 *             leaf tx-frequency-cur {
 *                 type tx-frequency-cur;
 *             }
 *             leaf rx-frequency-cur {
 *                 type rx-frequency-cur;
 *             }
 *             leaf tx-level-cur {
 *                 type tx-level-cur;
 *             }
 *             leaf rx-level-cur {
 *                 type rx-level-cur;
 *             }
 *             leaf transmission-mode-cur {
 *                 type leafref;
 *             }
 *             leaf modulation-cur {
 *                 type modulation-cur;
 *                 status DEPRECATED;
 *             }
 *             leaf code-rate-cur {
 *                 type code-rate-cur;
 *                 status DEPRECATED;
 *             }
 *             leaf received-signal-id {
 *                 type received-signal-id;
 *             }
 *             leaf snir-cur {
 *                 type snir-cur;
 *             }
 *             leaf xpd-cur {
 *                 type xpd-cur;
 *             }
 *             leaf rf-temp-cur {
 *                 type rf-temp-cur;
 *             }
 *             leaf last-status-change {
 *                 type last-status-change;
 *             }
 *             leaf radio-power-is-up {
 *                 type radio-power-is-up;
 *             }
 *             leaf link-is-up {
 *                 type link-is-up;
 *             }
 *             leaf xpic-is-up {
 *                 type xpic-is-up;
 *             }
 *             leaf mimo-is-up {
 *                 type mimo-is-up;
 *             }
 *             leaf alic-is-up {
 *                 type alic-is-up;
 *             }
 *             leaf atpc-is-up {
 *                 type atpc-is-up;
 *             }
 *             leaf auto-freq-select-is-up {
 *                 type auto-freq-select-is-up;
 *             }
 *             leaf loop-back-kind-up {
 *                 type loop-back-kind-up;
 *             }
 *             leaf local-end-point-id {
 *                 type local-end-point-id;
 *             }
 *             leaf remote-end-point-id {
 *                 type remote-end-point-id;
 *             }
 *             uses air-interface-status-g;
 *         }
 *         container air-interface-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses air-interface-current-problem-type-g;
 *             }
 *             uses air-interface-current-problems-g;
 *         }
 *         container air-interface-current-performance {
 *             list current-performance-data-list {
 *                 key "scanner-id";
 *                 container performance-data {
 *                     leaf es {
 *                         type es;
 *                     }
 *                     leaf ses {
 *                         type ses;
 *                     }
 *                     leaf cses {
 *                         type cses;
 *                     }
 *                     leaf unavailability {
 *                         type unavailability;
 *                     }
 *                     leaf tx-level-min {
 *                         type tx-level-min;
 *                     }
 *                     leaf tx-level-max {
 *                         type tx-level-max;
 *                     }
 *                     leaf tx-level-avg {
 *                         type tx-level-avg;
 *                     }
 *                     leaf rx-level-min {
 *                         type rx-level-min;
 *                     }
 *                     leaf rx-level-max {
 *                         type rx-level-max;
 *                     }
 *                     leaf rx-level-avg {
 *                         type rx-level-avg;
 *                     }
 *                     list time-x-states-list {
 *                         key "transmission-mode";
 *                         leaf transmission-mode {
 *                             type leafref;
 *                         }
 *                         leaf time {
 *                             type time;
 *                         }
 *                         uses time-x-states-type-g;
 *                     }
 *                     leaf time2-states {
 *                         type time2-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time4-states-s {
 *                         type time4-states-s;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time4-states {
 *                         type time4-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time8-states {
 *                         type time8-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time16-states-s {
 *                         type time16-states-s;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time16-states {
 *                         type time16-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time32-states {
 *                         type time32-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time64-states {
 *                         type time64-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time128-states {
 *                         type time128-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time256-states {
 *                         type time256-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time512-states {
 *                         type time512-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time512-states-l {
 *                         type time512-states-l;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time1024-states {
 *                         type time1024-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time1024-states-l {
 *                         type time1024-states-l;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time2048-states {
 *                         type time2048-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time2048-states-l {
 *                         type time2048-states-l;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time4096-states {
 *                         type time4096-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time4096-states-l {
 *                         type time4096-states-l;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time8192-states {
 *                         type time8192-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time8192-states-l {
 *                         type time8192-states-l;
 *                         status DEPRECATED;
 *                     }
 *                     leaf snir-min {
 *                         type snir-min;
 *                     }
 *                     leaf snir-max {
 *                         type snir-max;
 *                     }
 *                     leaf snir-avg {
 *                         type snir-avg;
 *                     }
 *                     leaf xpd-min {
 *                         type xpd-min;
 *                     }
 *                     leaf xpd-max {
 *                         type xpd-max;
 *                     }
 *                     leaf xpd-avg {
 *                         type xpd-avg;
 *                     }
 *                     leaf rf-temp-min {
 *                         type rf-temp-min;
 *                     }
 *                     leaf rf-temp-max {
 *                         type rf-temp-max;
 *                     }
 *                     leaf rf-temp-avg {
 *                         type rf-temp-avg;
 *                     }
 *                     leaf defect-blocks-sum {
 *                         type defect-blocks-sum;
 *                     }
 *                     leaf time-period {
 *                         type time-period;
 *                     }
 *                     uses air-interface-performance-type-g;
 *                 }
 *                 leaf timestamp {
 *                     type date-and-time;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type boolean;
 *                 }
 *                 leaf elapsed-time {
 *                     type int64;
 *                 }
 *                 leaf scanner-id {
 *                     type string;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf administrative-state {
 *                     type administrative-state;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses air-interface-current-performance-type-g;
 *             }
 *             uses air-interface-current-performance-g;
 *         }
 *         container air-interface-historical-performances {
 *             list historical-performance-data-list {
 *                 key "history-data-id";
 *                 container performance-data {
 *                     leaf es {
 *                         type es;
 *                     }
 *                     leaf ses {
 *                         type ses;
 *                     }
 *                     leaf cses {
 *                         type cses;
 *                     }
 *                     leaf unavailability {
 *                         type unavailability;
 *                     }
 *                     leaf tx-level-min {
 *                         type tx-level-min;
 *                     }
 *                     leaf tx-level-max {
 *                         type tx-level-max;
 *                     }
 *                     leaf tx-level-avg {
 *                         type tx-level-avg;
 *                     }
 *                     leaf rx-level-min {
 *                         type rx-level-min;
 *                     }
 *                     leaf rx-level-max {
 *                         type rx-level-max;
 *                     }
 *                     leaf rx-level-avg {
 *                         type rx-level-avg;
 *                     }
 *                     list time-x-states-list {
 *                         key "transmission-mode";
 *                         leaf transmission-mode {
 *                             type leafref;
 *                         }
 *                         leaf time {
 *                             type time;
 *                         }
 *                         uses time-x-states-type-g;
 *                     }
 *                     leaf time2-states {
 *                         type time2-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time4-states-s {
 *                         type time4-states-s;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time4-states {
 *                         type time4-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time8-states {
 *                         type time8-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time16-states-s {
 *                         type time16-states-s;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time16-states {
 *                         type time16-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time32-states {
 *                         type time32-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time64-states {
 *                         type time64-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time128-states {
 *                         type time128-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time256-states {
 *                         type time256-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time512-states {
 *                         type time512-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time512-states-l {
 *                         type time512-states-l;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time1024-states {
 *                         type time1024-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time1024-states-l {
 *                         type time1024-states-l;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time2048-states {
 *                         type time2048-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time2048-states-l {
 *                         type time2048-states-l;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time4096-states {
 *                         type time4096-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time4096-states-l {
 *                         type time4096-states-l;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time8192-states {
 *                         type time8192-states;
 *                         status DEPRECATED;
 *                     }
 *                     leaf time8192-states-l {
 *                         type time8192-states-l;
 *                         status DEPRECATED;
 *                     }
 *                     leaf snir-min {
 *                         type snir-min;
 *                     }
 *                     leaf snir-max {
 *                         type snir-max;
 *                     }
 *                     leaf snir-avg {
 *                         type snir-avg;
 *                     }
 *                     leaf xpd-min {
 *                         type xpd-min;
 *                     }
 *                     leaf xpd-max {
 *                         type xpd-max;
 *                     }
 *                     leaf xpd-avg {
 *                         type xpd-avg;
 *                     }
 *                     leaf rf-temp-min {
 *                         type rf-temp-min;
 *                     }
 *                     leaf rf-temp-max {
 *                         type rf-temp-max;
 *                     }
 *                     leaf rf-temp-avg {
 *                         type rf-temp-avg;
 *                     }
 *                     leaf defect-blocks-sum {
 *                         type defect-blocks-sum;
 *                     }
 *                     leaf time-period {
 *                         type time-period;
 *                     }
 *                     uses air-interface-performance-type-g;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type suspect-interval-flag;
 *                 }
 *                 leaf history-data-id {
 *                     type string;
 *                 }
 *                 leaf period-end-time {
 *                     type date-and-time;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses air-interface-historical-performance-type-g;
 *             }
 *             uses air-interface-historical-performances-g;
 *         }
 *     }
 *     list co-channel-group {
 *         key "co-channel-group-id";
 *         leaf co-channel-group-id {
 *             type universal-id;
 *         }
 *         leaf-list air-interface-list {
 *             type leafref;
 *         }
 *         leaf sort-of-co-channel-group {
 *             type sort-of-co-channel-group;
 *         }
 *         leaf-list logical-termination-point {
 *             type leafref;
 *             status DEPRECATED;
 *         }
 *         uses co-channel-group-g;
 *     }
 *     list mw-air-interface-hsb-end-point-pac {
 *         key "endpoint";
 *         leaf role {
 *             type role;
 *         }
 *         leaf endpoint {
 *             type leafref;
 *         }
 *     }
 *     list mw-air-interface-hsb-fc-switch-pac {
 *         key "fcswitch";
 *         leaf prot-type {
 *             type prot-type;
 *         }
 *         leaf air-interface-hsb-configuration-is-faulty-severity {
 *             type air-interface-hsb-configuration-is-faulty-severity;
 *         }
 *         leaf air-interface-hsb-is-partly-down-severity {
 *             type air-interface-hsb-is-partly-down-severity;
 *         }
 *         leaf air-interface-hsb-is-down-severity {
 *             type air-interface-hsb-is-down-severity;
 *         }
 *         leaf fcswitch {
 *             type leafref;
 *         }
 *     }
 *     list mw-air-interface-diversity-pac {
 *         key "layer-protocol";
 *         leaf layer-protocol {
 *             type leafref;
 *         }
 *         container air-interface-diversity-capability {
 *             list available-kinds-of-diversity {
 *                 key "diversity-name";
 *                 leaf diversity-name {
 *                     type string;
 *                 }
 *                 leaf number-of-air-interfaces-max {
 *                     type number-of-air-interfaces-max;
 *                 }
 *                 uses diversity-type-g;
 *             }
 *             leaf-list supported-alarm-list {
 *                 type string;
 *             }
 *             leaf supported-alarms {
 *                 type supported-alarms;
 *                 status DEPRECATED;
 *             }
 *             uses air-interface-diversity-capability-g;
 *         }
 *         container air-interface-diversity-configuration {
 *             container air-interface-diversity {
 *                 leaf diversity-name {
 *                     type string;
 *                 }
 *                 leaf number-of-air-interfaces-max {
 *                     type number-of-air-interfaces-max;
 *                 }
 *                 uses diversity-type-g;
 *             }
 *             leaf-list air-interface-ltp-list {
 *                 type leafref;
 *             }
 *             leaf performance-monitoring-collection-is-on {
 *                 type performance-monitoring-collection-is-on;
 *             }
 *             list threshold-cross-alarm-list {
 *                 key "g826-value-kind" "granularity-period";
 *                 leaf g826-value-kind {
 *                     type g826-type;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf alarm-raising-threshold {
 *                     type alarm-raising-threshold;
 *                 }
 *                 leaf alarm-clearing-threshold {
 *                     type alarm-clearing-threshold;
 *                 }
 *                 uses threshold-cross-alarm-type-g;
 *             }
 *             list problem-kind-severity-list {
 *                 key "problem-kind-name";
 *                 leaf problem-kind-name {
 *                     type string;
 *                 }
 *                 leaf problem-kind-severity {
 *                     type problem-kind-severity;
 *                 }
 *                 uses air-interface-diversity-problem-severity-type-g;
 *             }
 *             uses air-interface-diversity-configuration-g;
 *         }
 *         container air-interface-diversity-status {
 *             leaf snir-cur {
 *                 type snir-cur;
 *             }
 *             leaf air-interface-diversity-status {
 *                 type air-interface-diversity-status;
 *             }
 *             leaf last-status-change {
 *                 type last-status-change;
 *             }
 *             uses air-interface-diversity-status-g;
 *         }
 *         container air-interface-diversity-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses air-interface-diversity-current-problem-type-g;
 *             }
 *             uses air-interface-diversity-current-problems-g;
 *         }
 *         container air-interface-diversity-current-performance {
 *             list current-performance-data-list {
 *                 key "scanner-id";
 *                 container performance-data {
 *                     leaf snir-min {
 *                         type snir-min;
 *                     }
 *                     leaf snir-max {
 *                         type snir-max;
 *                     }
 *                     leaf snir-avg {
 *                         type snir-avg;
 *                     }
 *                     uses air-interface-diversity-performance-type-g;
 *                 }
 *                 leaf timestamp {
 *                     type date-and-time;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type boolean;
 *                 }
 *                 leaf elapsed-time {
 *                     type int64;
 *                 }
 *                 leaf scanner-id {
 *                     type string;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf administrative-state {
 *                     type administrative-state;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses air-interface-diversity-current-performance-type-g;
 *             }
 *             uses air-interface-diversity-current-performance-g;
 *         }
 *         container air-interface-diversity-historical-performances {
 *             list historical-performance-data-list {
 *                 key "history-data-id";
 *                 container performance-data {
 *                     leaf snir-min {
 *                         type snir-min;
 *                     }
 *                     leaf snir-max {
 *                         type snir-max;
 *                     }
 *                     leaf snir-avg {
 *                         type snir-avg;
 *                     }
 *                     uses air-interface-diversity-performance-type-g;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type suspect-interval-flag;
 *                 }
 *                 leaf history-data-id {
 *                     type string;
 *                 }
 *                 leaf period-end-time {
 *                     type date-and-time;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses air-interface-diversity-historical-performance-type-g;
 *             }
 *             uses air-interface-diversity-historical-performances-g;
 *         }
 *     }
 *     list mw-pure-ethernet-structure-pac {
 *         key "layer-protocol";
 *         leaf layer-protocol {
 *             type leafref;
 *         }
 *         container pure-ethernet-structure-capability {
 *             leaf structure-id {
 *                 type universal-id;
 *             }
 *             leaf-list supported-alarm-list {
 *                 type string;
 *             }
 *             leaf supported-alarms {
 *                 type supported-alarms;
 *                 status DEPRECATED;
 *             }
 *             uses pure-ethernet-structure-capability-g;
 *         }
 *         container pure-ethernet-structure-configuration {
 *             leaf performance-monitoring-collection-is-on {
 *                 type performance-monitoring-collection-is-on;
 *             }
 *             list problem-kind-severity-list {
 *                 key "problem-kind-name";
 *                 leaf problem-kind-name {
 *                     type string;
 *                 }
 *                 leaf problem-kind-severity {
 *                     type problem-kind-severity;
 *                 }
 *                 uses structure-problem-severity-type-g;
 *             }
 *             uses pure-ethernet-structure-configuration-g;
 *         }
 *         container pure-ethernet-structure-status {
 *             container segment-status-list {
 *                 leaf segment-status-type-id {
 *                     type int16;
 *                 }
 *                 leaf segment-is-reserved-for-tdm {
 *                     type segment-is-reserved-for-tdm;
 *                 }
 *                 leaf operational-status {
 *                     type operational-status;
 *                 }
 *                 leaf obsolete-priority-class {
 *                     type obsolete-priority-class;
 *                 }
 *                 leaf obsolete-drop-order-rank {
 *                     type obsolete-drop-order-rank;
 *                 }
 *                 uses segment-status-type-g;
 *             }
 *             leaf last-status-change {
 *                 type last-status-change;
 *             }
 *             uses pure-ethernet-structure-status-g;
 *         }
 *         container pure-ethernet-structure-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses structure-current-problem-type-g;
 *             }
 *             uses pure-ethernet-structure-current-problems-g;
 *         }
 *         container pure-ethernet-structure-current-performance {
 *             list current-performance-data-list {
 *                 key "scanner-id";
 *                 container performance-data {
 *                     leaf time-period {
 *                         type time-period;
 *                     }
 *                     leaf es {
 *                         type es;
 *                     }
 *                     leaf ses {
 *                         type ses;
 *                     }
 *                     leaf cses {
 *                         type cses;
 *                     }
 *                     leaf unavailability {
 *                         type unavailability;
 *                     }
 *                     leaf rx-level-min {
 *                         type rx-level-min;
 *                     }
 *                     leaf rx-level-max {
 *                         type rx-level-max;
 *                     }
 *                     leaf rx-level-avg {
 *                         type rx-level-avg;
 *                     }
 *                     uses structure-performance-type-g;
 *                 }
 *                 leaf timestamp {
 *                     type date-and-time;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type boolean;
 *                 }
 *                 leaf elapsed-time {
 *                     type int64;
 *                 }
 *                 leaf scanner-id {
 *                     type string;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf administrative-state {
 *                     type administrative-state;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses structure-current-performance-type-g;
 *             }
 *             uses pure-ethernet-structure-current-performance-g;
 *         }
 *         container pure-ethernet-structure-historical-performances {
 *             list historical-performance-data-list {
 *                 key "history-data-id";
 *                 container performance-data {
 *                     leaf time-period {
 *                         type time-period;
 *                     }
 *                     leaf es {
 *                         type es;
 *                     }
 *                     leaf ses {
 *                         type ses;
 *                     }
 *                     leaf cses {
 *                         type cses;
 *                     }
 *                     leaf unavailability {
 *                         type unavailability;
 *                     }
 *                     leaf rx-level-min {
 *                         type rx-level-min;
 *                     }
 *                     leaf rx-level-max {
 *                         type rx-level-max;
 *                     }
 *                     leaf rx-level-avg {
 *                         type rx-level-avg;
 *                     }
 *                     uses structure-performance-type-g;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type suspect-interval-flag;
 *                 }
 *                 leaf history-data-id {
 *                     type string;
 *                 }
 *                 leaf period-end-time {
 *                     type date-and-time;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses structure-historical-performance-type-g;
 *             }
 *             uses pure-ethernet-structure-historical-performances-g;
 *         }
 *     }
 *     list mw-hybrid-mw-structure-pac {
 *         key "layer-protocol";
 *         leaf layer-protocol {
 *             type leafref;
 *         }
 *         container hybrid-mw-structure-capability {
 *             leaf structure-id {
 *                 type universal-id;
 *             }
 *             list supported-tdm-structure-types-list {
 *                 key "tdm-structure-name";
 *                 leaf tdm-structure-name {
 *                     type string;
 *                 }
 *                 leaf tdm-segment-size {
 *                     type tdm-segment-size;
 *                 }
 *                 leaf max-number-of-segments-reservable {
 *                     type max-number-of-segments-reservable;
 *                 }
 *                 uses tdm-structure-type-g;
 *             }
 *             leaf-list supported-alarm-list {
 *                 type string;
 *             }
 *             leaf supported-alarms {
 *                 type supported-alarms;
 *                 status DEPRECATED;
 *             }
 *             uses hybrid-mw-structure-capability-g;
 *         }
 *         container hybrid-mw-structure-configuration {
 *             container structure-kind {
 *                 leaf tdm-structure-name {
 *                     type string;
 *                 }
 *                 leaf tdm-segment-size {
 *                     type tdm-segment-size;
 *                 }
 *                 leaf max-number-of-segments-reservable {
 *                     type max-number-of-segments-reservable;
 *                 }
 *                 uses tdm-structure-type-g;
 *             }
 *             container structure-type {
 *                 leaf tdm-structure-name {
 *                     type string;
 *                 }
 *                 leaf tdm-segment-size {
 *                     type tdm-segment-size;
 *                 }
 *                 leaf max-number-of-segments-reservable {
 *                     type max-number-of-segments-reservable;
 *                 }
 *                 uses tdm-structure-type-g;
 *                 status DEPRECATED;
 *             }
 *             leaf number-of-tdm-segments-to-be-reserved {
 *                 type number-of-tdm-segments-to-be-reserved;
 *             }
 *             leaf performance-monitoring-collection-is-on {
 *                 type performance-monitoring-collection-is-on;
 *             }
 *             list problem-kind-severity-list {
 *                 key "problem-kind-name";
 *                 leaf problem-kind-name {
 *                     type string;
 *                 }
 *                 leaf problem-kind-severity {
 *                     type problem-kind-severity;
 *                 }
 *                 uses structure-problem-severity-type-g;
 *             }
 *             uses hybrid-mw-structure-configuration-g;
 *         }
 *         container hybrid-mw-structure-status {
 *             list segment-status-list {
 *                 key "segment-status-type-id";
 *                 leaf segment-status-type-id {
 *                     type int16;
 *                 }
 *                 leaf segment-is-reserved-for-tdm {
 *                     type segment-is-reserved-for-tdm;
 *                 }
 *                 leaf operational-status {
 *                     type operational-status;
 *                 }
 *                 leaf obsolete-priority-class {
 *                     type obsolete-priority-class;
 *                 }
 *                 leaf obsolete-drop-order-rank {
 *                     type obsolete-drop-order-rank;
 *                 }
 *                 uses segment-status-type-g;
 *             }
 *             leaf last-status-change {
 *                 type last-status-change;
 *             }
 *             uses hybrid-mw-structure-status-g;
 *         }
 *         container hybrid-mw-structure-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses structure-current-problem-type-g;
 *             }
 *             uses hybrid-mw-structure-current-problems-g;
 *         }
 *         container hybrid-mw-structure-current-performance {
 *             list current-performance-data-list {
 *                 key "scanner-id";
 *                 container performance-data {
 *                     leaf time-period {
 *                         type time-period;
 *                     }
 *                     leaf es {
 *                         type es;
 *                     }
 *                     leaf ses {
 *                         type ses;
 *                     }
 *                     leaf cses {
 *                         type cses;
 *                     }
 *                     leaf unavailability {
 *                         type unavailability;
 *                     }
 *                     leaf rx-level-min {
 *                         type rx-level-min;
 *                     }
 *                     leaf rx-level-max {
 *                         type rx-level-max;
 *                     }
 *                     leaf rx-level-avg {
 *                         type rx-level-avg;
 *                     }
 *                     uses structure-performance-type-g;
 *                 }
 *                 leaf timestamp {
 *                     type date-and-time;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type boolean;
 *                 }
 *                 leaf elapsed-time {
 *                     type int64;
 *                 }
 *                 leaf scanner-id {
 *                     type string;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf administrative-state {
 *                     type administrative-state;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses structure-current-performance-type-g;
 *             }
 *             uses hybrid-mw-structure-current-performance-g;
 *         }
 *         container hybrid-mw-structure-historical-performances {
 *             list historical-performance-data-list {
 *                 key "history-data-id";
 *                 container performance-data {
 *                     leaf time-period {
 *                         type time-period;
 *                     }
 *                     leaf es {
 *                         type es;
 *                     }
 *                     leaf ses {
 *                         type ses;
 *                     }
 *                     leaf cses {
 *                         type cses;
 *                     }
 *                     leaf unavailability {
 *                         type unavailability;
 *                     }
 *                     leaf rx-level-min {
 *                         type rx-level-min;
 *                     }
 *                     leaf rx-level-max {
 *                         type rx-level-max;
 *                     }
 *                     leaf rx-level-avg {
 *                         type rx-level-avg;
 *                     }
 *                     uses structure-performance-type-g;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type suspect-interval-flag;
 *                 }
 *                 leaf history-data-id {
 *                     type string;
 *                 }
 *                 leaf period-end-time {
 *                     type date-and-time;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses structure-historical-performance-type-g;
 *             }
 *             uses hybrid-mw-structure-historical-performances-g;
 *         }
 *     }
 *     list mw-ethernet-container-pac {
 *         key "layer-protocol";
 *         leaf layer-protocol {
 *             type leafref;
 *         }
 *         container ethernet-container-capability {
 *             leaf bundling-is-avail {
 *                 type bundling-is-avail;
 *             }
 *             leaf packet-compression-is-avail {
 *                 type packet-compression-is-avail;
 *             }
 *             leaf layer2-compression-is-avail {
 *                 type layer2-compression-is-avail;
 *             }
 *             leaf vlan-compression-is-avail {
 *                 type vlan-compression-is-avail;
 *             }
 *             leaf q-in-q-compression-is-avail {
 *                 type q-in-q-compression-is-avail;
 *             }
 *             leaf mpls-compression-is-avail {
 *                 type mpls-compression-is-avail;
 *             }
 *             leaf ipv4-compression-is-avail {
 *                 type ipv4-compression-is-avail;
 *             }
 *             leaf ipv6-compression-is-avail {
 *                 type ipv6-compression-is-avail;
 *             }
 *             leaf layer4-compression-is-avail {
 *                 type layer4-compression-is-avail;
 *             }
 *             leaf encryption-is-avail {
 *                 type encryption-is-avail;
 *             }
 *             leaf-list supported-alarm-list {
 *                 type string;
 *             }
 *             leaf supported-alarms {
 *                 type supported-alarms;
 *                 status DEPRECATED;
 *             }
 *             uses ethernet-container-capability-g;
 *         }
 *         container ethernet-container-configuration {
 *             leaf container-id {
 *                 type container-id;
 *             }
 *             list segments-id-list {
 *                 key "structure-id-ref" "segment-id-ref";
 *                 leaf structure-id-ref {
 *                     type universal-id;
 *                 }
 *                 leaf segment-id-ref {
 *                     type int16;
 *                 }
 *                 uses segment-id-type-g;
 *             }
 *             leaf packet-compression-is-on {
 *                 type packet-compression-is-on;
 *             }
 *             leaf layer2-compression-is-on {
 *                 type layer2-compression-is-on;
 *             }
 *             leaf vlan-compression-is-on {
 *                 type vlan-compression-is-on;
 *             }
 *             leaf q-in-q-compression-is-on {
 *                 type q-in-q-compression-is-on;
 *             }
 *             leaf mpls-compression-is-on {
 *                 type mpls-compression-is-on;
 *             }
 *             leaf ipv4-compression-is-on {
 *                 type ipv4-compression-is-on;
 *             }
 *             leaf ipv6-compression-is-on {
 *                 type ipv6-compression-is-on;
 *             }
 *             leaf layer4-compression-is-on {
 *                 type layer4-compression-is-on;
 *             }
 *             leaf encryption-is-on {
 *                 type encryption-is-on;
 *             }
 *             leaf cryptographic-key {
 *                 type cryptographic-key;
 *             }
 *             leaf performance-monitoring-collection-is-on {
 *                 type performance-monitoring-collection-is-on;
 *             }
 *             list problem-kind-severity-list {
 *                 key "problem-kind-name";
 *                 leaf problem-kind-name {
 *                     type string;
 *                 }
 *                 leaf problem-kind-severity {
 *                     type problem-kind-severity;
 *                 }
 *                 uses container-problem-severity-type-g;
 *             }
 *             uses ethernet-container-configuration-g;
 *         }
 *         container ethernet-container-status {
 *             leaf last-status-change {
 *                 type last-status-change;
 *             }
 *             uses ethernet-container-status-g;
 *         }
 *         container ethernet-container-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses container-current-problem-type-g;
 *             }
 *             uses ethernet-container-current-problems-g;
 *         }
 *         container ethernet-container-current-performance {
 *             list current-performance-data-list {
 *                 key "scanner-id";
 *                 container performance-data {
 *                     leaf tx-ethernet-bytes-max-s {
 *                         type tx-ethernet-bytes-max-s;
 *                     }
 *                     leaf tx-ethernet-bytes-max-m {
 *                         type tx-ethernet-bytes-max-m;
 *                     }
 *                     leaf tx-ethernet-bytes-sum {
 *                         type tx-ethernet-bytes-sum;
 *                     }
 *                     leaf time-period {
 *                         type time-period;
 *                     }
 *                     uses container-performance-type-g;
 *                 }
 *                 leaf timestamp {
 *                     type date-and-time;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type boolean;
 *                 }
 *                 leaf elapsed-time {
 *                     type int64;
 *                 }
 *                 leaf scanner-id {
 *                     type string;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf administrative-state {
 *                     type administrative-state;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses container-current-performance-type-g;
 *             }
 *             uses ethernet-container-current-performance-g;
 *         }
 *         container ethernet-container-historical-performances {
 *             list historical-performance-data-list {
 *                 key "history-data-id";
 *                 container performance-data {
 *                     leaf tx-ethernet-bytes-max-s {
 *                         type tx-ethernet-bytes-max-s;
 *                     }
 *                     leaf tx-ethernet-bytes-max-m {
 *                         type tx-ethernet-bytes-max-m;
 *                     }
 *                     leaf tx-ethernet-bytes-sum {
 *                         type tx-ethernet-bytes-sum;
 *                     }
 *                     leaf time-period {
 *                         type time-period;
 *                     }
 *                     uses container-performance-type-g;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type suspect-interval-flag;
 *                 }
 *                 leaf history-data-id {
 *                     type string;
 *                 }
 *                 leaf period-end-time {
 *                     type date-and-time;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses container-historical-performance-type-g;
 *             }
 *             uses ethernet-container-historical-performances-g;
 *         }
 *     }
 *     list mw-tdm-container-pac {
 *         key "layer-protocol";
 *         leaf layer-protocol {
 *             type leafref;
 *         }
 *         container tdm-container-capability {
 *             list supported-tdm-container-types-list {
 *                 key "tdm-container-name";
 *                 leaf tdm-container-name {
 *                     type string;
 *                 }
 *                 leaf tdm-container-size {
 *                     type tdm-container-size;
 *                 }
 *                 uses tdm-container-type-g;
 *             }
 *             leaf-list supported-alarm-list {
 *                 type string;
 *             }
 *             leaf supported-alarms {
 *                 type supported-alarms;
 *                 status DEPRECATED;
 *             }
 *             uses tdm-container-capability-g;
 *         }
 *         container tdm-container-configuration {
 *             leaf container-id {
 *                 type container-id;
 *             }
 *             container container-type {
 *                 leaf tdm-container-name {
 *                     type string;
 *                 }
 *                 leaf tdm-container-size {
 *                     type tdm-container-size;
 *                 }
 *                 uses tdm-container-type-g;
 *             }
 *             container segment-id {
 *                 leaf structure-id-ref {
 *                     type universal-id;
 *                 }
 *                 leaf segment-id-ref {
 *                     type int16;
 *                 }
 *                 uses segment-id-type-g;
 *             }
 *             leaf performance-monitoring-collection-is-on {
 *                 type performance-monitoring-collection-is-on;
 *             }
 *             list problem-kind-severity-list {
 *                 key "problem-kind-name";
 *                 leaf problem-kind-name {
 *                     type string;
 *                 }
 *                 leaf problem-kind-severity {
 *                     type problem-kind-severity;
 *                 }
 *                 uses container-problem-severity-type-g;
 *             }
 *             uses tdm-container-configuration-g;
 *         }
 *         container tdm-container-status {
 *             leaf last-status-change {
 *                 type last-status-change;
 *             }
 *             uses tdm-container-status-g;
 *         }
 *         container tdm-container-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses container-current-problem-type-g;
 *             }
 *             uses tdm-container-current-problems-g;
 *         }
 *         container tdm-container-current-performance {
 *             list current-performance-data-list {
 *                 key "scanner-id";
 *                 container performance-data {
 *                     leaf tx-ethernet-bytes-max-s {
 *                         type tx-ethernet-bytes-max-s;
 *                     }
 *                     leaf tx-ethernet-bytes-max-m {
 *                         type tx-ethernet-bytes-max-m;
 *                     }
 *                     leaf tx-ethernet-bytes-sum {
 *                         type tx-ethernet-bytes-sum;
 *                     }
 *                     leaf time-period {
 *                         type time-period;
 *                     }
 *                     uses container-performance-type-g;
 *                 }
 *                 leaf timestamp {
 *                     type date-and-time;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type boolean;
 *                 }
 *                 leaf elapsed-time {
 *                     type int64;
 *                 }
 *                 leaf scanner-id {
 *                     type string;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf administrative-state {
 *                     type administrative-state;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses container-current-performance-type-g;
 *             }
 *             uses tdm-container-current-performance-g;
 *         }
 *         container tdm-container-historical-performances {
 *             list historical-performance-data-list {
 *                 key "history-data-id";
 *                 container performance-data {
 *                     leaf tx-ethernet-bytes-max-s {
 *                         type tx-ethernet-bytes-max-s;
 *                     }
 *                     leaf tx-ethernet-bytes-max-m {
 *                         type tx-ethernet-bytes-max-m;
 *                     }
 *                     leaf tx-ethernet-bytes-sum {
 *                         type tx-ethernet-bytes-sum;
 *                     }
 *                     leaf time-period {
 *                         type time-period;
 *                     }
 *                     uses container-performance-type-g;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type suspect-interval-flag;
 *                 }
 *                 leaf history-data-id {
 *                     type string;
 *                 }
 *                 leaf period-end-time {
 *                     type date-and-time;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses container-historical-performance-type-g;
 *             }
 *             uses tdm-container-historical-performances-g;
 *         }
 *     }
 *     list wire-interface-pac {
 *         key "layer-protocol";
 *         leaf layer-protocol {
 *             type leafref;
 *         }
 *         container wirebased-interface-capability {
 *             list available-mau-list {
 *                 key "mau-id";
 *                 leaf mau-id {
 *                     type universal-id;
 *                 }
 *                 leaf mii-kind {
 *                     type mii-kind;
 *                 }
 *                 leaf mdi-kind {
 *                     type mdi-kind;
 *                 }
 *                 leaf required-medium-kind {
 *                     type required-medium-kind;
 *                 }
 *                 leaf-list wavelength-min {
 *                     type wavelength-min;
 *                 }
 *                 leaf-list wavelength-max {
 *                     type wavelength-max;
 *                 }
 *                 leaf wavelength-grid-min {
 *                     type wavelength-grid-min;
 *                 }
 *                 leaf link-length-max {
 *                     type link-length-max;
 *                 }
 *                 leaf vendor-name {
 *                     type vendor-name;
 *                 }
 *                 leaf vendor-oui {
 *                     type vendor-oui;
 *                 }
 *                 leaf part-number {
 *                     type part-number;
 *                 }
 *                 leaf revision-number {
 *                     type revision-number;
 *                 }
 *                 leaf serial-number {
 *                     type serial-number;
 *                 }
 *                 leaf date-code {
 *                     type date-code;
 *                 }
 *                 leaf-list pmd-list {
 *                     type pmd-name-type;
 *                 }
 *                 list signal-ordering-list {
 *                     key "signal-ordering-kind-name";
 *                     leaf signal-ordering-kind-name {
 *                         type string;
 *                     }
 *                     leaf-list signal-list {
 *                         type string;
 *                     }
 *                     uses signal-ordering-type-g;
 *                 }
 *                 leaf auto-signal-ordering-is-avail {
 *                     type auto-signal-ordering-is-avail;
 *                 }
 *                 leaf short-reach-mode-is-avail {
 *                     type short-reach-mode-is-avail;
 *                 }
 *                 leaf eee-is-avail {
 *                     type eee-is-avail;
 *                 }
 *                 leaf unidirectional-operation-is-avail {
 *                     type unidirectional-operation-is-avail;
 *                 }
 *                 leaf-list supported-alarms {
 *                     type string;
 *                 }
 *                 uses mau-type-g;
 *             }
 *             leaf auto-pmd-negotiation-is-avail {
 *                 type auto-pmd-negotiation-is-avail;
 *             }
 *             leaf auto-pmd-negotiation-max-is-avail {
 *                 type auto-pmd-negotiation-max-is-avail;
 *             }
 *             leaf-list supported-loop-back-kind-list {
 *                 type loop-back-type;
 *             }
 *             leaf maintenance-timer-range {
 *                 type maintenance-timer-range;
 *             }
 *             leaf-list supported-alarm-list {
 *                 type string;
 *             }
 *             uses wire-interface-capability-g;
 *         }
 *         container wirebased-interface-configuration {
 *             leaf wire-interface-name {
 *                 type wire-interface-name;
 *             }
 *             leaf remote-wire-interface-name {
 *                 type remote-wire-interface-name;
 *             }
 *             leaf interface-is-on {
 *                 type interface-is-on;
 *             }
 *             leaf-list transceiver-is-on-list {
 *                 type boolean;
 *             }
 *             leaf auto-pmd-negotiation-is-on {
 *                 type auto-pmd-negotiation-is-on;
 *             }
 *             leaf fixed-pmd {
 *                 type fixed-pmd;
 *             }
 *             leaf auto-pmd-negotiation-max {
 *                 type auto-pmd-negotiation-max;
 *             }
 *             leaf auto-signal-ordering-is-on {
 *                 type auto-signal-ordering-is-on;
 *             }
 *             leaf fixed-signal-ordering {
 *                 type universal-id;
 *             }
 *             leaf short-reach-mode-is-on {
 *                 type short-reach-mode-is-on;
 *             }
 *             leaf unidirectional-operation-is-on {
 *                 type unidirectional-operation-is-on;
 *             }
 *             leaf-list wavelength-list {
 *                 type wavelength-list;
 *             }
 *             leaf temperature-high-threshold {
 *                 type temperature-high-threshold;
 *             }
 *             leaf temperature-low-threshold {
 *                 type temperature-low-threshold;
 *             }
 *             leaf rxlevel-high-threshold {
 *                 type rxlevel-high-threshold;
 *             }
 *             leaf rxlevel-low-threshold {
 *                 type rxlevel-low-threshold;
 *             }
 *             leaf loop-back-kind-on {
 *                 type string;
 *             }
 *             leaf isolation-is-on {
 *                 type isolation-is-on;
 *             }
 *             leaf restart-pmd-negotiation-is-on {
 *                 type restart-pmd-negotiation-is-on;
 *             }
 *             leaf reset-mau-is-on {
 *                 type reset-mau-is-on;
 *             }
 *             leaf maintenance-timer {
 *                 type maintenance-timer;
 *             }
 *             list problem-kind-severity-list {
 *                 key "problem-kind-name";
 *                 leaf problem-kind-name {
 *                     type string;
 *                 }
 *                 leaf problem-kind-severity {
 *                     type problem-kind-severity;
 *                 }
 *                 uses wire-interface-problem-severity-type-g;
 *             }
 *             uses wire-interface-configuration-g;
 *         }
 *         container wirebased-interface-status {
 *             leaf interface-is-up {
 *                 type interface-is-up;
 *             }
 *             leaf-list receive-signal-is-detected {
 *                 type boolean;
 *             }
 *             leaf pmd-is-up {
 *                 type pmd-is-up;
 *             }
 *             leaf pmd-cur {
 *                 type pmd-cur;
 *             }
 *             container signal-ordering-kind-cur {
 *                 leaf signal-ordering-kind-name {
 *                     type string;
 *                 }
 *                 leaf-list signal-list {
 *                     type string;
 *                 }
 *                 uses signal-ordering-type-g;
 *             }
 *             leaf eee-is-up {
 *                 type eee-is-up;
 *             }
 *             leaf link-is-up {
 *                 type link-is-up;
 *             }
 *             leaf link-is-idle {
 *                 type link-is-idle;
 *             }
 *             leaf tx-level-cur {
 *                 type tx-level-cur;
 *             }
 *             leaf-list rx-level-cur {
 *                 type rx-level-cur;
 *             }
 *             leaf temp-cur {
 *                 type temp-cur;
 *             }
 *             leaf loop-back-kind-up {
 *                 type loop-back-kind-up;
 *             }
 *             uses wire-interface-status-g;
 *         }
 *         container wirebased-interface-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses wire-interface-current-problem-type-g;
 *             }
 *             uses wire-interface-current-problems-g;
 *         }
 *         container wirebased-interface-current-performance {
 *             list current-performance-data-list {
 *                 key "scanner-id";
 *                 container performance-data {
 *                     leaf es {
 *                         type es;
 *                     }
 *                     leaf ses {
 *                         type ses;
 *                     }
 *                     leaf symbol-error-during-carrier {
 *                         type symbol-error-during-carrier;
 *                     }
 *                     leaf low-power-idle-transmitter-ms {
 *                         type low-power-idle-transmitter-ms;
 *                     }
 *                     leaf low-power-idle-receiver-ms {
 *                         type low-power-idle-receiver-ms;
 *                     }
 *                     uses wire-interface-performance-type-g;
 *                 }
 *                 leaf timestamp {
 *                     type date-and-time;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type boolean;
 *                 }
 *                 leaf elapsed-time {
 *                     type int64;
 *                 }
 *                 leaf scanner-id {
 *                     type string;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf administrative-state {
 *                     type administrative-state;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses wire-interface-current-performance-type-g;
 *             }
 *             uses wire-interface-current-performance-g;
 *         }
 *         container wirebased-interface-historical-performances {
 *             list historical-performance-data-list {
 *                 key "history-data-id";
 *                 container performance-data {
 *                     leaf es {
 *                         type es;
 *                     }
 *                     leaf ses {
 *                         type ses;
 *                     }
 *                     leaf symbol-error-during-carrier {
 *                         type symbol-error-during-carrier;
 *                     }
 *                     leaf low-power-idle-transmitter-ms {
 *                         type low-power-idle-transmitter-ms;
 *                     }
 *                     leaf low-power-idle-receiver-ms {
 *                         type low-power-idle-receiver-ms;
 *                     }
 *                     uses wire-interface-performance-type-g;
 *                 }
 *                 leaf suspect-interval-flag {
 *                     type suspect-interval-flag;
 *                 }
 *                 leaf history-data-id {
 *                     type string;
 *                 }
 *                 leaf period-end-time {
 *                     type date-and-time;
 *                 }
 *                 leaf granularity-period {
 *                     type granularity-period-type;
 *                 }
 *                 leaf object-class {
 *                     type object-identifier;
 *                 }
 *                 leaf name-binding {
 *                     type object-identifier;
 *                 }
 *                 uses wire-interface-historical-performance-type-g;
 *             }
 *             uses wire-interface-historical-performances-g;
 *         }
 *     }
 *
 *     grouping air-interface-historical-performances-g {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf cses {
 *                     type cses;
 *                 }
 *                 leaf unavailability {
 *                     type unavailability;
 *                 }
 *                 leaf tx-level-min {
 *                     type tx-level-min;
 *                 }
 *                 leaf tx-level-max {
 *                     type tx-level-max;
 *                 }
 *                 leaf tx-level-avg {
 *                     type tx-level-avg;
 *                 }
 *                 leaf rx-level-min {
 *                     type rx-level-min;
 *                 }
 *                 leaf rx-level-max {
 *                     type rx-level-max;
 *                 }
 *                 leaf rx-level-avg {
 *                     type rx-level-avg;
 *                 }
 *                 list time-x-states-list {
 *                     key "transmission-mode";
 *                     leaf transmission-mode {
 *                         type leafref;
 *                     }
 *                     leaf time {
 *                         type time;
 *                     }
 *                     uses time-x-states-type-g;
 *                 }
 *                 leaf time2-states {
 *                     type time2-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time4-states-s {
 *                     type time4-states-s;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time4-states {
 *                     type time4-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time8-states {
 *                     type time8-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time16-states-s {
 *                     type time16-states-s;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time16-states {
 *                     type time16-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time32-states {
 *                     type time32-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time64-states {
 *                     type time64-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time128-states {
 *                     type time128-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time256-states {
 *                     type time256-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time512-states {
 *                     type time512-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time512-states-l {
 *                     type time512-states-l;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time1024-states {
 *                     type time1024-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time1024-states-l {
 *                     type time1024-states-l;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time2048-states {
 *                     type time2048-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time2048-states-l {
 *                     type time2048-states-l;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time4096-states {
 *                     type time4096-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time4096-states-l {
 *                     type time4096-states-l;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time8192-states {
 *                     type time8192-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time8192-states-l {
 *                     type time8192-states-l;
 *                     status DEPRECATED;
 *                 }
 *                 leaf snir-min {
 *                     type snir-min;
 *                 }
 *                 leaf snir-max {
 *                     type snir-max;
 *                 }
 *                 leaf snir-avg {
 *                     type snir-avg;
 *                 }
 *                 leaf xpd-min {
 *                     type xpd-min;
 *                 }
 *                 leaf xpd-max {
 *                     type xpd-max;
 *                 }
 *                 leaf xpd-avg {
 *                     type xpd-avg;
 *                 }
 *                 leaf rf-temp-min {
 *                     type rf-temp-min;
 *                 }
 *                 leaf rf-temp-max {
 *                     type rf-temp-max;
 *                 }
 *                 leaf rf-temp-avg {
 *                     type rf-temp-avg;
 *                 }
 *                 leaf defect-blocks-sum {
 *                     type defect-blocks-sum;
 *                 }
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 uses air-interface-performance-type-g;
 *             }
 *             leaf suspect-interval-flag {
 *                 type suspect-interval-flag;
 *             }
 *             leaf history-data-id {
 *                 type string;
 *             }
 *             leaf period-end-time {
 *                 type date-and-time;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses air-interface-historical-performance-type-g;
 *         }
 *     }
 *     grouping pure-ethernet-structure-configuration-g {
 *         leaf performance-monitoring-collection-is-on {
 *             type performance-monitoring-collection-is-on;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type string;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses structure-problem-severity-type-g;
 *         }
 *     }
 *     grouping air-interface-current-problem-type-g {
 *         leaf problem-name {
 *             type problem-name;
 *         }
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *     }
 *     grouping wire-interface-problem-severity-type-g {
 *         leaf problem-kind-name {
 *             type string;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *     }
 *     grouping container-current-problem-type-g {
 *         leaf problem-name {
 *             type problem-name;
 *         }
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *     }
 *     grouping time-x-states-type-g {
 *         leaf transmission-mode {
 *             type leafref;
 *         }
 *         leaf time {
 *             type time;
 *         }
 *     }
 *     grouping air-interface-diversity-capability-g {
 *         list available-kinds-of-diversity {
 *             key "diversity-name";
 *             leaf diversity-name {
 *                 type string;
 *             }
 *             leaf number-of-air-interfaces-max {
 *                 type number-of-air-interfaces-max;
 *             }
 *             uses diversity-type-g;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *             status DEPRECATED;
 *         }
 *     }
 *     grouping ethernet-container-historical-performances-g {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf tx-ethernet-bytes-max-s {
 *                     type tx-ethernet-bytes-max-s;
 *                 }
 *                 leaf tx-ethernet-bytes-max-m {
 *                     type tx-ethernet-bytes-max-m;
 *                 }
 *                 leaf tx-ethernet-bytes-sum {
 *                     type tx-ethernet-bytes-sum;
 *                 }
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 uses container-performance-type-g;
 *             }
 *             leaf suspect-interval-flag {
 *                 type suspect-interval-flag;
 *             }
 *             leaf history-data-id {
 *                 type string;
 *             }
 *             leaf period-end-time {
 *                 type date-and-time;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses container-historical-performance-type-g;
 *         }
 *     }
 *     grouping tdm-container-configuration-g {
 *         leaf container-id {
 *             type container-id;
 *         }
 *         container container-type {
 *             leaf tdm-container-name {
 *                 type string;
 *             }
 *             leaf tdm-container-size {
 *                 type tdm-container-size;
 *             }
 *             uses tdm-container-type-g;
 *         }
 *         container segment-id {
 *             leaf structure-id-ref {
 *                 type universal-id;
 *             }
 *             leaf segment-id-ref {
 *                 type int16;
 *             }
 *             uses segment-id-type-g;
 *         }
 *         leaf performance-monitoring-collection-is-on {
 *             type performance-monitoring-collection-is-on;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type string;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses container-problem-severity-type-g;
 *         }
 *     }
 *     grouping wire-interface-status-g {
 *         leaf interface-is-up {
 *             type interface-is-up;
 *         }
 *         leaf-list receive-signal-is-detected {
 *             type boolean;
 *         }
 *         leaf pmd-is-up {
 *             type pmd-is-up;
 *         }
 *         leaf pmd-cur {
 *             type pmd-cur;
 *         }
 *         container signal-ordering-kind-cur {
 *             leaf signal-ordering-kind-name {
 *                 type string;
 *             }
 *             leaf-list signal-list {
 *                 type string;
 *             }
 *             uses signal-ordering-type-g;
 *         }
 *         leaf eee-is-up {
 *             type eee-is-up;
 *         }
 *         leaf link-is-up {
 *             type link-is-up;
 *         }
 *         leaf link-is-idle {
 *             type link-is-idle;
 *         }
 *         leaf tx-level-cur {
 *             type tx-level-cur;
 *         }
 *         leaf-list rx-level-cur {
 *             type rx-level-cur;
 *         }
 *         leaf temp-cur {
 *             type temp-cur;
 *         }
 *         leaf loop-back-kind-up {
 *             type loop-back-kind-up;
 *         }
 *     }
 *     grouping pure-ethernet-structure-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses structure-current-problem-type-g;
 *         }
 *     }
 *     grouping pure-ethernet-structure-historical-performances-g {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf cses {
 *                     type cses;
 *                 }
 *                 leaf unavailability {
 *                     type unavailability;
 *                 }
 *                 leaf rx-level-min {
 *                     type rx-level-min;
 *                 }
 *                 leaf rx-level-max {
 *                     type rx-level-max;
 *                 }
 *                 leaf rx-level-avg {
 *                     type rx-level-avg;
 *                 }
 *                 uses structure-performance-type-g;
 *             }
 *             leaf suspect-interval-flag {
 *                 type suspect-interval-flag;
 *             }
 *             leaf history-data-id {
 *                 type string;
 *             }
 *             leaf period-end-time {
 *                 type date-and-time;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses structure-historical-performance-type-g;
 *         }
 *     }
 *     grouping wire-interface-capability-g {
 *         list available-mau-list {
 *             key "mau-id";
 *             leaf mau-id {
 *                 type universal-id;
 *             }
 *             leaf mii-kind {
 *                 type mii-kind;
 *             }
 *             leaf mdi-kind {
 *                 type mdi-kind;
 *             }
 *             leaf required-medium-kind {
 *                 type required-medium-kind;
 *             }
 *             leaf-list wavelength-min {
 *                 type wavelength-min;
 *             }
 *             leaf-list wavelength-max {
 *                 type wavelength-max;
 *             }
 *             leaf wavelength-grid-min {
 *                 type wavelength-grid-min;
 *             }
 *             leaf link-length-max {
 *                 type link-length-max;
 *             }
 *             leaf vendor-name {
 *                 type vendor-name;
 *             }
 *             leaf vendor-oui {
 *                 type vendor-oui;
 *             }
 *             leaf part-number {
 *                 type part-number;
 *             }
 *             leaf revision-number {
 *                 type revision-number;
 *             }
 *             leaf serial-number {
 *                 type serial-number;
 *             }
 *             leaf date-code {
 *                 type date-code;
 *             }
 *             leaf-list pmd-list {
 *                 type pmd-name-type;
 *             }
 *             list signal-ordering-list {
 *                 key "signal-ordering-kind-name";
 *                 leaf signal-ordering-kind-name {
 *                     type string;
 *                 }
 *                 leaf-list signal-list {
 *                     type string;
 *                 }
 *                 uses signal-ordering-type-g;
 *             }
 *             leaf auto-signal-ordering-is-avail {
 *                 type auto-signal-ordering-is-avail;
 *             }
 *             leaf short-reach-mode-is-avail {
 *                 type short-reach-mode-is-avail;
 *             }
 *             leaf eee-is-avail {
 *                 type eee-is-avail;
 *             }
 *             leaf unidirectional-operation-is-avail {
 *                 type unidirectional-operation-is-avail;
 *             }
 *             leaf-list supported-alarms {
 *                 type string;
 *             }
 *             uses mau-type-g;
 *         }
 *         leaf auto-pmd-negotiation-is-avail {
 *             type auto-pmd-negotiation-is-avail;
 *         }
 *         leaf auto-pmd-negotiation-max-is-avail {
 *             type auto-pmd-negotiation-max-is-avail;
 *         }
 *         leaf-list supported-loop-back-kind-list {
 *             type loop-back-type;
 *         }
 *         leaf maintenance-timer-range {
 *             type maintenance-timer-range;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *     }
 *     grouping object-creation-notification-g {
 *         leaf counter {
 *             type counter;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf object-id-ref {
 *             type universal-id;
 *         }
 *         leaf object-type {
 *             type object-type;
 *         }
 *     }
 *     grouping problem-notification-g {
 *         leaf counter {
 *             type counter;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf object-id-ref {
 *             type universal-id;
 *         }
 *         leaf problem {
 *             type problem;
 *         }
 *         leaf severity {
 *             type severity;
 *         }
 *     }
 *     grouping wire-interface-performance-type-g {
 *         leaf es {
 *             type es;
 *         }
 *         leaf ses {
 *             type ses;
 *         }
 *         leaf symbol-error-during-carrier {
 *             type symbol-error-during-carrier;
 *         }
 *         leaf low-power-idle-transmitter-ms {
 *             type low-power-idle-transmitter-ms;
 *         }
 *         leaf low-power-idle-receiver-ms {
 *             type low-power-idle-receiver-ms;
 *         }
 *     }
 *     grouping tdm-container-current-performance-g {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf tx-ethernet-bytes-max-s {
 *                     type tx-ethernet-bytes-max-s;
 *                 }
 *                 leaf tx-ethernet-bytes-max-m {
 *                     type tx-ethernet-bytes-max-m;
 *                 }
 *                 leaf tx-ethernet-bytes-sum {
 *                     type tx-ethernet-bytes-sum;
 *                 }
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 uses container-performance-type-g;
 *             }
 *             leaf timestamp {
 *                 type date-and-time;
 *             }
 *             leaf suspect-interval-flag {
 *                 type boolean;
 *             }
 *             leaf elapsed-time {
 *                 type int64;
 *             }
 *             leaf scanner-id {
 *                 type string;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses container-current-performance-type-g;
 *         }
 *     }
 *     grouping channel-plan-type-g {
 *         leaf supported-channel-plan {
 *             type string;
 *         }
 *         leaf duplex-distance-is-variable {
 *             type duplex-distance-is-variable;
 *         }
 *         leaf-list duplex-distance-list {
 *             type duplex-distance-list;
 *         }
 *         leaf duplex-distance {
 *             type duplex-distance;
 *             status DEPRECATED;
 *         }
 *         leaf auto-freq-select-is-avail {
 *             type auto-freq-select-is-avail;
 *         }
 *         list transmission-mode-list {
 *             key "transmission-mode-id";
 *             leaf transmission-mode-id {
 *                 type universal-id;
 *             }
 *             leaf transmission-mode-name {
 *                 type transmission-mode-name;
 *             }
 *             leaf channel-bandwidth {
 *                 type channel-bandwidth;
 *             }
 *             leaf modulation-scheme {
 *                 type modulation-scheme;
 *             }
 *             leaf code-rate {
 *                 type code-rate;
 *             }
 *             leaf symbol-rate-reduction-factor {
 *                 type symbol-rate-reduction-factor;
 *             }
 *             leaf tx-power-min {
 *                 type tx-power-min;
 *             }
 *             leaf tx-power-max {
 *                 type tx-power-max;
 *             }
 *             leaf rx-threshold {
 *                 type rx-threshold;
 *             }
 *             leaf am-upshift-level {
 *                 type am-upshift-level;
 *             }
 *             leaf am-downshift-level {
 *                 type am-downshift-level;
 *             }
 *             leaf xpic-is-avail {
 *                 type xpic-is-avail;
 *             }
 *             uses transmission-mode-type-g;
 *         }
 *     }
 *     grouping signal-ordering-type-g {
 *         leaf signal-ordering-kind-name {
 *             type string;
 *         }
 *         leaf-list signal-list {
 *             type string;
 *         }
 *     }
 *     grouping air-interface-status-g {
 *         leaf tx-frequency-cur {
 *             type tx-frequency-cur;
 *         }
 *         leaf rx-frequency-cur {
 *             type rx-frequency-cur;
 *         }
 *         leaf tx-level-cur {
 *             type tx-level-cur;
 *         }
 *         leaf rx-level-cur {
 *             type rx-level-cur;
 *         }
 *         leaf transmission-mode-cur {
 *             type leafref;
 *         }
 *         leaf modulation-cur {
 *             type modulation-cur;
 *             status DEPRECATED;
 *         }
 *         leaf code-rate-cur {
 *             type code-rate-cur;
 *             status DEPRECATED;
 *         }
 *         leaf received-signal-id {
 *             type received-signal-id;
 *         }
 *         leaf snir-cur {
 *             type snir-cur;
 *         }
 *         leaf xpd-cur {
 *             type xpd-cur;
 *         }
 *         leaf rf-temp-cur {
 *             type rf-temp-cur;
 *         }
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *         leaf radio-power-is-up {
 *             type radio-power-is-up;
 *         }
 *         leaf link-is-up {
 *             type link-is-up;
 *         }
 *         leaf xpic-is-up {
 *             type xpic-is-up;
 *         }
 *         leaf mimo-is-up {
 *             type mimo-is-up;
 *         }
 *         leaf alic-is-up {
 *             type alic-is-up;
 *         }
 *         leaf atpc-is-up {
 *             type atpc-is-up;
 *         }
 *         leaf auto-freq-select-is-up {
 *             type auto-freq-select-is-up;
 *         }
 *         leaf loop-back-kind-up {
 *             type loop-back-kind-up;
 *         }
 *         leaf local-end-point-id {
 *             type local-end-point-id;
 *         }
 *         leaf remote-end-point-id {
 *             type remote-end-point-id;
 *         }
 *     }
 *     grouping hybrid-mw-structure-historical-performances-g {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf cses {
 *                     type cses;
 *                 }
 *                 leaf unavailability {
 *                     type unavailability;
 *                 }
 *                 leaf rx-level-min {
 *                     type rx-level-min;
 *                 }
 *                 leaf rx-level-max {
 *                     type rx-level-max;
 *                 }
 *                 leaf rx-level-avg {
 *                     type rx-level-avg;
 *                 }
 *                 uses structure-performance-type-g;
 *             }
 *             leaf suspect-interval-flag {
 *                 type suspect-interval-flag;
 *             }
 *             leaf history-data-id {
 *                 type string;
 *             }
 *             leaf period-end-time {
 *                 type date-and-time;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses structure-historical-performance-type-g;
 *         }
 *     }
 *     grouping object-deletion-notification-g {
 *         leaf counter {
 *             type counter;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf object-id-ref {
 *             type universal-id;
 *         }
 *     }
 *     grouping wire-interface-current-performance-g {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf symbol-error-during-carrier {
 *                     type symbol-error-during-carrier;
 *                 }
 *                 leaf low-power-idle-transmitter-ms {
 *                     type low-power-idle-transmitter-ms;
 *                 }
 *                 leaf low-power-idle-receiver-ms {
 *                     type low-power-idle-receiver-ms;
 *                 }
 *                 uses wire-interface-performance-type-g;
 *             }
 *             leaf timestamp {
 *                 type date-and-time;
 *             }
 *             leaf suspect-interval-flag {
 *                 type boolean;
 *             }
 *             leaf elapsed-time {
 *                 type int64;
 *             }
 *             leaf scanner-id {
 *                 type string;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses wire-interface-current-performance-type-g;
 *         }
 *     }
 *     grouping air-interface-current-performance-type-g {
 *         container performance-data {
 *             leaf es {
 *                 type es;
 *             }
 *             leaf ses {
 *                 type ses;
 *             }
 *             leaf cses {
 *                 type cses;
 *             }
 *             leaf unavailability {
 *                 type unavailability;
 *             }
 *             leaf tx-level-min {
 *                 type tx-level-min;
 *             }
 *             leaf tx-level-max {
 *                 type tx-level-max;
 *             }
 *             leaf tx-level-avg {
 *                 type tx-level-avg;
 *             }
 *             leaf rx-level-min {
 *                 type rx-level-min;
 *             }
 *             leaf rx-level-max {
 *                 type rx-level-max;
 *             }
 *             leaf rx-level-avg {
 *                 type rx-level-avg;
 *             }
 *             list time-x-states-list {
 *                 key "transmission-mode";
 *                 leaf transmission-mode {
 *                     type leafref;
 *                 }
 *                 leaf time {
 *                     type time;
 *                 }
 *                 uses time-x-states-type-g;
 *             }
 *             leaf time2-states {
 *                 type time2-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time4-states-s {
 *                 type time4-states-s;
 *                 status DEPRECATED;
 *             }
 *             leaf time4-states {
 *                 type time4-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time8-states {
 *                 type time8-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time16-states-s {
 *                 type time16-states-s;
 *                 status DEPRECATED;
 *             }
 *             leaf time16-states {
 *                 type time16-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time32-states {
 *                 type time32-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time64-states {
 *                 type time64-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time128-states {
 *                 type time128-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time256-states {
 *                 type time256-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time512-states {
 *                 type time512-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time512-states-l {
 *                 type time512-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time1024-states {
 *                 type time1024-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time1024-states-l {
 *                 type time1024-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time2048-states {
 *                 type time2048-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time2048-states-l {
 *                 type time2048-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time4096-states {
 *                 type time4096-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time4096-states-l {
 *                 type time4096-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time8192-states {
 *                 type time8192-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time8192-states-l {
 *                 type time8192-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf snir-min {
 *                 type snir-min;
 *             }
 *             leaf snir-max {
 *                 type snir-max;
 *             }
 *             leaf snir-avg {
 *                 type snir-avg;
 *             }
 *             leaf xpd-min {
 *                 type xpd-min;
 *             }
 *             leaf xpd-max {
 *                 type xpd-max;
 *             }
 *             leaf xpd-avg {
 *                 type xpd-avg;
 *             }
 *             leaf rf-temp-min {
 *                 type rf-temp-min;
 *             }
 *             leaf rf-temp-max {
 *                 type rf-temp-max;
 *             }
 *             leaf rf-temp-avg {
 *                 type rf-temp-avg;
 *             }
 *             leaf defect-blocks-sum {
 *                 type defect-blocks-sum;
 *             }
 *             leaf time-period {
 *                 type time-period;
 *             }
 *             uses air-interface-performance-type-g;
 *         }
 *         leaf timestamp {
 *             type date-and-time;
 *         }
 *         leaf suspect-interval-flag {
 *             type boolean;
 *         }
 *         leaf elapsed-time {
 *             type int64;
 *         }
 *         leaf scanner-id {
 *             type string;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *     }
 *     grouping wire-interface-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses wire-interface-current-problem-type-g;
 *         }
 *     }
 *     grouping air-interface-performance-type-g {
 *         leaf es {
 *             type es;
 *         }
 *         leaf ses {
 *             type ses;
 *         }
 *         leaf cses {
 *             type cses;
 *         }
 *         leaf unavailability {
 *             type unavailability;
 *         }
 *         leaf tx-level-min {
 *             type tx-level-min;
 *         }
 *         leaf tx-level-max {
 *             type tx-level-max;
 *         }
 *         leaf tx-level-avg {
 *             type tx-level-avg;
 *         }
 *         leaf rx-level-min {
 *             type rx-level-min;
 *         }
 *         leaf rx-level-max {
 *             type rx-level-max;
 *         }
 *         leaf rx-level-avg {
 *             type rx-level-avg;
 *         }
 *         list time-x-states-list {
 *             key "transmission-mode";
 *             leaf transmission-mode {
 *                 type leafref;
 *             }
 *             leaf time {
 *                 type time;
 *             }
 *             uses time-x-states-type-g;
 *         }
 *         leaf time2-states {
 *             type time2-states;
 *             status DEPRECATED;
 *         }
 *         leaf time4-states-s {
 *             type time4-states-s;
 *             status DEPRECATED;
 *         }
 *         leaf time4-states {
 *             type time4-states;
 *             status DEPRECATED;
 *         }
 *         leaf time8-states {
 *             type time8-states;
 *             status DEPRECATED;
 *         }
 *         leaf time16-states-s {
 *             type time16-states-s;
 *             status DEPRECATED;
 *         }
 *         leaf time16-states {
 *             type time16-states;
 *             status DEPRECATED;
 *         }
 *         leaf time32-states {
 *             type time32-states;
 *             status DEPRECATED;
 *         }
 *         leaf time64-states {
 *             type time64-states;
 *             status DEPRECATED;
 *         }
 *         leaf time128-states {
 *             type time128-states;
 *             status DEPRECATED;
 *         }
 *         leaf time256-states {
 *             type time256-states;
 *             status DEPRECATED;
 *         }
 *         leaf time512-states {
 *             type time512-states;
 *             status DEPRECATED;
 *         }
 *         leaf time512-states-l {
 *             type time512-states-l;
 *             status DEPRECATED;
 *         }
 *         leaf time1024-states {
 *             type time1024-states;
 *             status DEPRECATED;
 *         }
 *         leaf time1024-states-l {
 *             type time1024-states-l;
 *             status DEPRECATED;
 *         }
 *         leaf time2048-states {
 *             type time2048-states;
 *             status DEPRECATED;
 *         }
 *         leaf time2048-states-l {
 *             type time2048-states-l;
 *             status DEPRECATED;
 *         }
 *         leaf time4096-states {
 *             type time4096-states;
 *             status DEPRECATED;
 *         }
 *         leaf time4096-states-l {
 *             type time4096-states-l;
 *             status DEPRECATED;
 *         }
 *         leaf time8192-states {
 *             type time8192-states;
 *             status DEPRECATED;
 *         }
 *         leaf time8192-states-l {
 *             type time8192-states-l;
 *             status DEPRECATED;
 *         }
 *         leaf snir-min {
 *             type snir-min;
 *         }
 *         leaf snir-max {
 *             type snir-max;
 *         }
 *         leaf snir-avg {
 *             type snir-avg;
 *         }
 *         leaf xpd-min {
 *             type xpd-min;
 *         }
 *         leaf xpd-max {
 *             type xpd-max;
 *         }
 *         leaf xpd-avg {
 *             type xpd-avg;
 *         }
 *         leaf rf-temp-min {
 *             type rf-temp-min;
 *         }
 *         leaf rf-temp-max {
 *             type rf-temp-max;
 *         }
 *         leaf rf-temp-avg {
 *             type rf-temp-avg;
 *         }
 *         leaf defect-blocks-sum {
 *             type defect-blocks-sum;
 *         }
 *         leaf time-period {
 *             type time-period;
 *         }
 *     }
 *     grouping hybrid-mw-structure-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses structure-current-problem-type-g;
 *         }
 *     }
 *     grouping hybrid-mw-structure-configuration-g {
 *         container structure-kind {
 *             leaf tdm-structure-name {
 *                 type string;
 *             }
 *             leaf tdm-segment-size {
 *                 type tdm-segment-size;
 *             }
 *             leaf max-number-of-segments-reservable {
 *                 type max-number-of-segments-reservable;
 *             }
 *             uses tdm-structure-type-g;
 *         }
 *         container structure-type {
 *             leaf tdm-structure-name {
 *                 type string;
 *             }
 *             leaf tdm-segment-size {
 *                 type tdm-segment-size;
 *             }
 *             leaf max-number-of-segments-reservable {
 *                 type max-number-of-segments-reservable;
 *             }
 *             uses tdm-structure-type-g;
 *             status DEPRECATED;
 *         }
 *         leaf number-of-tdm-segments-to-be-reserved {
 *             type number-of-tdm-segments-to-be-reserved;
 *         }
 *         leaf performance-monitoring-collection-is-on {
 *             type performance-monitoring-collection-is-on;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type string;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses structure-problem-severity-type-g;
 *         }
 *     }
 *     grouping air-interface-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses air-interface-current-problem-type-g;
 *         }
 *     }
 *     grouping air-interface-diversity-status-g {
 *         leaf snir-cur {
 *             type snir-cur;
 *         }
 *         leaf air-interface-diversity-status {
 *             type air-interface-diversity-status;
 *         }
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *     }
 *     grouping air-interface-current-performance-g {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf cses {
 *                     type cses;
 *                 }
 *                 leaf unavailability {
 *                     type unavailability;
 *                 }
 *                 leaf tx-level-min {
 *                     type tx-level-min;
 *                 }
 *                 leaf tx-level-max {
 *                     type tx-level-max;
 *                 }
 *                 leaf tx-level-avg {
 *                     type tx-level-avg;
 *                 }
 *                 leaf rx-level-min {
 *                     type rx-level-min;
 *                 }
 *                 leaf rx-level-max {
 *                     type rx-level-max;
 *                 }
 *                 leaf rx-level-avg {
 *                     type rx-level-avg;
 *                 }
 *                 list time-x-states-list {
 *                     key "transmission-mode";
 *                     leaf transmission-mode {
 *                         type leafref;
 *                     }
 *                     leaf time {
 *                         type time;
 *                     }
 *                     uses time-x-states-type-g;
 *                 }
 *                 leaf time2-states {
 *                     type time2-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time4-states-s {
 *                     type time4-states-s;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time4-states {
 *                     type time4-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time8-states {
 *                     type time8-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time16-states-s {
 *                     type time16-states-s;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time16-states {
 *                     type time16-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time32-states {
 *                     type time32-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time64-states {
 *                     type time64-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time128-states {
 *                     type time128-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time256-states {
 *                     type time256-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time512-states {
 *                     type time512-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time512-states-l {
 *                     type time512-states-l;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time1024-states {
 *                     type time1024-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time1024-states-l {
 *                     type time1024-states-l;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time2048-states {
 *                     type time2048-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time2048-states-l {
 *                     type time2048-states-l;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time4096-states {
 *                     type time4096-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time4096-states-l {
 *                     type time4096-states-l;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time8192-states {
 *                     type time8192-states;
 *                     status DEPRECATED;
 *                 }
 *                 leaf time8192-states-l {
 *                     type time8192-states-l;
 *                     status DEPRECATED;
 *                 }
 *                 leaf snir-min {
 *                     type snir-min;
 *                 }
 *                 leaf snir-max {
 *                     type snir-max;
 *                 }
 *                 leaf snir-avg {
 *                     type snir-avg;
 *                 }
 *                 leaf xpd-min {
 *                     type xpd-min;
 *                 }
 *                 leaf xpd-max {
 *                     type xpd-max;
 *                 }
 *                 leaf xpd-avg {
 *                     type xpd-avg;
 *                 }
 *                 leaf rf-temp-min {
 *                     type rf-temp-min;
 *                 }
 *                 leaf rf-temp-max {
 *                     type rf-temp-max;
 *                 }
 *                 leaf rf-temp-avg {
 *                     type rf-temp-avg;
 *                 }
 *                 leaf defect-blocks-sum {
 *                     type defect-blocks-sum;
 *                 }
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 uses air-interface-performance-type-g;
 *             }
 *             leaf timestamp {
 *                 type date-and-time;
 *             }
 *             leaf suspect-interval-flag {
 *                 type boolean;
 *             }
 *             leaf elapsed-time {
 *                 type int64;
 *             }
 *             leaf scanner-id {
 *                 type string;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses air-interface-current-performance-type-g;
 *         }
 *     }
 *     grouping tdm-container-historical-performances-g {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf tx-ethernet-bytes-max-s {
 *                     type tx-ethernet-bytes-max-s;
 *                 }
 *                 leaf tx-ethernet-bytes-max-m {
 *                     type tx-ethernet-bytes-max-m;
 *                 }
 *                 leaf tx-ethernet-bytes-sum {
 *                     type tx-ethernet-bytes-sum;
 *                 }
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 uses container-performance-type-g;
 *             }
 *             leaf suspect-interval-flag {
 *                 type suspect-interval-flag;
 *             }
 *             leaf history-data-id {
 *                 type string;
 *             }
 *             leaf period-end-time {
 *                 type date-and-time;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses container-historical-performance-type-g;
 *         }
 *     }
 *     grouping air-interface-diversity-historical-performances-g {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf snir-min {
 *                     type snir-min;
 *                 }
 *                 leaf snir-max {
 *                     type snir-max;
 *                 }
 *                 leaf snir-avg {
 *                     type snir-avg;
 *                 }
 *                 uses air-interface-diversity-performance-type-g;
 *             }
 *             leaf suspect-interval-flag {
 *                 type suspect-interval-flag;
 *             }
 *             leaf history-data-id {
 *                 type string;
 *             }
 *             leaf period-end-time {
 *                 type date-and-time;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses air-interface-diversity-historical-performance-type-g;
 *         }
 *     }
 *     grouping structure-current-problem-type-g {
 *         leaf problem-name {
 *             type problem-name;
 *         }
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *     }
 *     grouping air-interface-diversity-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses air-interface-diversity-current-problem-type-g;
 *         }
 *     }
 *     grouping transmission-mode-type-g {
 *         leaf transmission-mode-id {
 *             type universal-id;
 *         }
 *         leaf transmission-mode-name {
 *             type transmission-mode-name;
 *         }
 *         leaf channel-bandwidth {
 *             type channel-bandwidth;
 *         }
 *         leaf modulation-scheme {
 *             type modulation-scheme;
 *         }
 *         leaf code-rate {
 *             type code-rate;
 *         }
 *         leaf symbol-rate-reduction-factor {
 *             type symbol-rate-reduction-factor;
 *         }
 *         leaf tx-power-min {
 *             type tx-power-min;
 *         }
 *         leaf tx-power-max {
 *             type tx-power-max;
 *         }
 *         leaf rx-threshold {
 *             type rx-threshold;
 *         }
 *         leaf am-upshift-level {
 *             type am-upshift-level;
 *         }
 *         leaf am-downshift-level {
 *             type am-downshift-level;
 *         }
 *         leaf xpic-is-avail {
 *             type xpic-is-avail;
 *         }
 *     }
 *     grouping air-interface-diversity-historical-performance-type-g {
 *         container performance-data {
 *             leaf snir-min {
 *                 type snir-min;
 *             }
 *             leaf snir-max {
 *                 type snir-max;
 *             }
 *             leaf snir-avg {
 *                 type snir-avg;
 *             }
 *             uses air-interface-diversity-performance-type-g;
 *         }
 *         leaf suspect-interval-flag {
 *             type suspect-interval-flag;
 *         }
 *         leaf history-data-id {
 *             type string;
 *         }
 *         leaf period-end-time {
 *             type date-and-time;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *     }
 *     grouping tdm-container-type-g {
 *         leaf tdm-container-name {
 *             type string;
 *         }
 *         leaf tdm-container-size {
 *             type tdm-container-size;
 *         }
 *     }
 *     grouping segment-id-type-g {
 *         leaf structure-id-ref {
 *             type universal-id;
 *         }
 *         leaf segment-id-ref {
 *             type int16;
 *         }
 *     }
 *     grouping tdm-container-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses container-current-problem-type-g;
 *         }
 *     }
 *     grouping air-interface-capability-g {
 *         leaf type-of-equipment {
 *             type type-of-equipment;
 *         }
 *         leaf tx-frequency-min {
 *             type tx-frequency-min;
 *         }
 *         leaf tx-frequency-max {
 *             type tx-frequency-max;
 *         }
 *         leaf rx-frequency-min {
 *             type rx-frequency-min;
 *         }
 *         leaf rx-frequency-max {
 *             type rx-frequency-max;
 *         }
 *         leaf adaptive-modulation-is-avail {
 *             type adaptive-modulation-is-avail;
 *         }
 *         leaf mimo-is-avail {
 *             type mimo-is-avail;
 *         }
 *         leaf mimo-channels {
 *             type mimo-channels;
 *         }
 *         leaf alic-is-avail {
 *             type alic-is-avail;
 *         }
 *         leaf atpc-is-avail {
 *             type atpc-is-avail;
 *         }
 *         leaf atpc-range {
 *             type atpc-range;
 *         }
 *         leaf encryption-is-avail {
 *             type encryption-is-avail;
 *         }
 *         leaf-list supported-loop-back-kind-list {
 *             type loop-back-type;
 *         }
 *         leaf maintenance-timer-range {
 *             type maintenance-timer-range;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *             status DEPRECATED;
 *         }
 *         list supported-channel-plan-list {
 *             key "supported-channel-plan";
 *             leaf supported-channel-plan {
 *                 type string;
 *             }
 *             leaf duplex-distance-is-variable {
 *                 type duplex-distance-is-variable;
 *             }
 *             leaf-list duplex-distance-list {
 *                 type duplex-distance-list;
 *             }
 *             leaf duplex-distance {
 *                 type duplex-distance;
 *                 status DEPRECATED;
 *             }
 *             leaf auto-freq-select-is-avail {
 *                 type auto-freq-select-is-avail;
 *             }
 *             list transmission-mode-list {
 *                 key "transmission-mode-id";
 *                 leaf transmission-mode-id {
 *                     type universal-id;
 *                 }
 *                 leaf transmission-mode-name {
 *                     type transmission-mode-name;
 *                 }
 *                 leaf channel-bandwidth {
 *                     type channel-bandwidth;
 *                 }
 *                 leaf modulation-scheme {
 *                     type modulation-scheme;
 *                 }
 *                 leaf code-rate {
 *                     type code-rate;
 *                 }
 *                 leaf symbol-rate-reduction-factor {
 *                     type symbol-rate-reduction-factor;
 *                 }
 *                 leaf tx-power-min {
 *                     type tx-power-min;
 *                 }
 *                 leaf tx-power-max {
 *                     type tx-power-max;
 *                 }
 *                 leaf rx-threshold {
 *                     type rx-threshold;
 *                 }
 *                 leaf am-upshift-level {
 *                     type am-upshift-level;
 *                 }
 *                 leaf am-downshift-level {
 *                     type am-downshift-level;
 *                 }
 *                 leaf xpic-is-avail {
 *                     type xpic-is-avail;
 *                 }
 *                 uses transmission-mode-type-g;
 *             }
 *             uses channel-plan-type-g;
 *         }
 *     }
 *     grouping co-channel-group-g {
 *         leaf co-channel-group-id {
 *             type universal-id;
 *         }
 *         leaf-list air-interface-list {
 *             type leafref;
 *         }
 *         leaf sort-of-co-channel-group {
 *             type sort-of-co-channel-group;
 *         }
 *         leaf-list logical-termination-point {
 *             type leafref;
 *             status DEPRECATED;
 *         }
 *     }
 *     grouping pure-ethernet-structure-capability-g {
 *         leaf structure-id {
 *             type universal-id;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *             status DEPRECATED;
 *         }
 *     }
 *     grouping tdm-container-capability-g {
 *         list supported-tdm-container-types-list {
 *             key "tdm-container-name";
 *             leaf tdm-container-name {
 *                 type string;
 *             }
 *             leaf tdm-container-size {
 *                 type tdm-container-size;
 *             }
 *             uses tdm-container-type-g;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *             status DEPRECATED;
 *         }
 *     }
 *     grouping diversity-type-g {
 *         leaf diversity-name {
 *             type string;
 *         }
 *         leaf number-of-air-interfaces-max {
 *             type number-of-air-interfaces-max;
 *         }
 *     }
 *     grouping attribute-value-changed-notification-g {
 *         leaf counter {
 *             type counter;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf object-id-ref {
 *             type universal-id;
 *         }
 *         leaf attribute-name {
 *             type attribute-name;
 *         }
 *         leaf new-value {
 *             type new-value;
 *         }
 *     }
 *     grouping air-interface-diversity-current-performance-type-g {
 *         container performance-data {
 *             leaf snir-min {
 *                 type snir-min;
 *             }
 *             leaf snir-max {
 *                 type snir-max;
 *             }
 *             leaf snir-avg {
 *                 type snir-avg;
 *             }
 *             uses air-interface-diversity-performance-type-g;
 *         }
 *         leaf timestamp {
 *             type date-and-time;
 *         }
 *         leaf suspect-interval-flag {
 *             type boolean;
 *         }
 *         leaf elapsed-time {
 *             type int64;
 *         }
 *         leaf scanner-id {
 *             type string;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *     }
 *     grouping air-interface-historical-performance-type-g {
 *         container performance-data {
 *             leaf es {
 *                 type es;
 *             }
 *             leaf ses {
 *                 type ses;
 *             }
 *             leaf cses {
 *                 type cses;
 *             }
 *             leaf unavailability {
 *                 type unavailability;
 *             }
 *             leaf tx-level-min {
 *                 type tx-level-min;
 *             }
 *             leaf tx-level-max {
 *                 type tx-level-max;
 *             }
 *             leaf tx-level-avg {
 *                 type tx-level-avg;
 *             }
 *             leaf rx-level-min {
 *                 type rx-level-min;
 *             }
 *             leaf rx-level-max {
 *                 type rx-level-max;
 *             }
 *             leaf rx-level-avg {
 *                 type rx-level-avg;
 *             }
 *             list time-x-states-list {
 *                 key "transmission-mode";
 *                 leaf transmission-mode {
 *                     type leafref;
 *                 }
 *                 leaf time {
 *                     type time;
 *                 }
 *                 uses time-x-states-type-g;
 *             }
 *             leaf time2-states {
 *                 type time2-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time4-states-s {
 *                 type time4-states-s;
 *                 status DEPRECATED;
 *             }
 *             leaf time4-states {
 *                 type time4-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time8-states {
 *                 type time8-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time16-states-s {
 *                 type time16-states-s;
 *                 status DEPRECATED;
 *             }
 *             leaf time16-states {
 *                 type time16-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time32-states {
 *                 type time32-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time64-states {
 *                 type time64-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time128-states {
 *                 type time128-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time256-states {
 *                 type time256-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time512-states {
 *                 type time512-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time512-states-l {
 *                 type time512-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time1024-states {
 *                 type time1024-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time1024-states-l {
 *                 type time1024-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time2048-states {
 *                 type time2048-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time2048-states-l {
 *                 type time2048-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time4096-states {
 *                 type time4096-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time4096-states-l {
 *                 type time4096-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time8192-states {
 *                 type time8192-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time8192-states-l {
 *                 type time8192-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf snir-min {
 *                 type snir-min;
 *             }
 *             leaf snir-max {
 *                 type snir-max;
 *             }
 *             leaf snir-avg {
 *                 type snir-avg;
 *             }
 *             leaf xpd-min {
 *                 type xpd-min;
 *             }
 *             leaf xpd-max {
 *                 type xpd-max;
 *             }
 *             leaf xpd-avg {
 *                 type xpd-avg;
 *             }
 *             leaf rf-temp-min {
 *                 type rf-temp-min;
 *             }
 *             leaf rf-temp-max {
 *                 type rf-temp-max;
 *             }
 *             leaf rf-temp-avg {
 *                 type rf-temp-avg;
 *             }
 *             leaf defect-blocks-sum {
 *                 type defect-blocks-sum;
 *             }
 *             leaf time-period {
 *                 type time-period;
 *             }
 *             uses air-interface-performance-type-g;
 *         }
 *         leaf suspect-interval-flag {
 *             type suspect-interval-flag;
 *         }
 *         leaf history-data-id {
 *             type string;
 *         }
 *         leaf period-end-time {
 *             type date-and-time;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *     }
 *     grouping segment-status-type-g {
 *         leaf segment-status-type-id {
 *             type int16;
 *         }
 *         leaf segment-is-reserved-for-tdm {
 *             type segment-is-reserved-for-tdm;
 *         }
 *         leaf operational-status {
 *             type operational-status;
 *         }
 *         leaf obsolete-priority-class {
 *             type obsolete-priority-class;
 *         }
 *         leaf obsolete-drop-order-rank {
 *             type obsolete-drop-order-rank;
 *         }
 *     }
 *     grouping container-problem-severity-type-g {
 *         leaf problem-kind-name {
 *             type string;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *     }
 *     grouping wire-interface-current-performance-type-g {
 *         container performance-data {
 *             leaf es {
 *                 type es;
 *             }
 *             leaf ses {
 *                 type ses;
 *             }
 *             leaf symbol-error-during-carrier {
 *                 type symbol-error-during-carrier;
 *             }
 *             leaf low-power-idle-transmitter-ms {
 *                 type low-power-idle-transmitter-ms;
 *             }
 *             leaf low-power-idle-receiver-ms {
 *                 type low-power-idle-receiver-ms;
 *             }
 *             uses wire-interface-performance-type-g;
 *         }
 *         leaf timestamp {
 *             type date-and-time;
 *         }
 *         leaf suspect-interval-flag {
 *             type boolean;
 *         }
 *         leaf elapsed-time {
 *             type int64;
 *         }
 *         leaf scanner-id {
 *             type string;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *     }
 *     grouping wire-interface-historical-performance-type-g {
 *         container performance-data {
 *             leaf es {
 *                 type es;
 *             }
 *             leaf ses {
 *                 type ses;
 *             }
 *             leaf symbol-error-during-carrier {
 *                 type symbol-error-during-carrier;
 *             }
 *             leaf low-power-idle-transmitter-ms {
 *                 type low-power-idle-transmitter-ms;
 *             }
 *             leaf low-power-idle-receiver-ms {
 *                 type low-power-idle-receiver-ms;
 *             }
 *             uses wire-interface-performance-type-g;
 *         }
 *         leaf suspect-interval-flag {
 *             type suspect-interval-flag;
 *         }
 *         leaf history-data-id {
 *             type string;
 *         }
 *         leaf period-end-time {
 *             type date-and-time;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *     }
 *     grouping ethernet-container-capability-g {
 *         leaf bundling-is-avail {
 *             type bundling-is-avail;
 *         }
 *         leaf packet-compression-is-avail {
 *             type packet-compression-is-avail;
 *         }
 *         leaf layer2-compression-is-avail {
 *             type layer2-compression-is-avail;
 *         }
 *         leaf vlan-compression-is-avail {
 *             type vlan-compression-is-avail;
 *         }
 *         leaf q-in-q-compression-is-avail {
 *             type q-in-q-compression-is-avail;
 *         }
 *         leaf mpls-compression-is-avail {
 *             type mpls-compression-is-avail;
 *         }
 *         leaf ipv4-compression-is-avail {
 *             type ipv4-compression-is-avail;
 *         }
 *         leaf ipv6-compression-is-avail {
 *             type ipv6-compression-is-avail;
 *         }
 *         leaf layer4-compression-is-avail {
 *             type layer4-compression-is-avail;
 *         }
 *         leaf encryption-is-avail {
 *             type encryption-is-avail;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *             status DEPRECATED;
 *         }
 *     }
 *     grouping mw-current-problem-g {
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *     }
 *     grouping structure-current-performance-type-g {
 *         container performance-data {
 *             leaf time-period {
 *                 type time-period;
 *             }
 *             leaf es {
 *                 type es;
 *             }
 *             leaf ses {
 *                 type ses;
 *             }
 *             leaf cses {
 *                 type cses;
 *             }
 *             leaf unavailability {
 *                 type unavailability;
 *             }
 *             leaf rx-level-min {
 *                 type rx-level-min;
 *             }
 *             leaf rx-level-max {
 *                 type rx-level-max;
 *             }
 *             leaf rx-level-avg {
 *                 type rx-level-avg;
 *             }
 *             uses structure-performance-type-g;
 *         }
 *         leaf timestamp {
 *             type date-and-time;
 *         }
 *         leaf suspect-interval-flag {
 *             type boolean;
 *         }
 *         leaf elapsed-time {
 *             type int64;
 *         }
 *         leaf scanner-id {
 *             type string;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *     }
 *     grouping wire-interface-current-problem-type-g {
 *         leaf problem-name {
 *             type problem-name;
 *         }
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *     }
 *     grouping tdm-structure-type-g {
 *         leaf tdm-structure-name {
 *             type string;
 *         }
 *         leaf tdm-segment-size {
 *             type tdm-segment-size;
 *         }
 *         leaf max-number-of-segments-reservable {
 *             type max-number-of-segments-reservable;
 *         }
 *     }
 *     grouping hybrid-mw-structure-status-g {
 *         list segment-status-list {
 *             key "segment-status-type-id";
 *             leaf segment-status-type-id {
 *                 type int16;
 *             }
 *             leaf segment-is-reserved-for-tdm {
 *                 type segment-is-reserved-for-tdm;
 *             }
 *             leaf operational-status {
 *                 type operational-status;
 *             }
 *             leaf obsolete-priority-class {
 *                 type obsolete-priority-class;
 *             }
 *             leaf obsolete-drop-order-rank {
 *                 type obsolete-drop-order-rank;
 *             }
 *             uses segment-status-type-g;
 *         }
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *     }
 *     grouping pure-ethernet-structure-status-g {
 *         container segment-status-list {
 *             leaf segment-status-type-id {
 *                 type int16;
 *             }
 *             leaf segment-is-reserved-for-tdm {
 *                 type segment-is-reserved-for-tdm;
 *             }
 *             leaf operational-status {
 *                 type operational-status;
 *             }
 *             leaf obsolete-priority-class {
 *                 type obsolete-priority-class;
 *             }
 *             leaf obsolete-drop-order-rank {
 *                 type obsolete-drop-order-rank;
 *             }
 *             uses segment-status-type-g;
 *         }
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *     }
 *     grouping container-historical-performance-type-g {
 *         container performance-data {
 *             leaf tx-ethernet-bytes-max-s {
 *                 type tx-ethernet-bytes-max-s;
 *             }
 *             leaf tx-ethernet-bytes-max-m {
 *                 type tx-ethernet-bytes-max-m;
 *             }
 *             leaf tx-ethernet-bytes-sum {
 *                 type tx-ethernet-bytes-sum;
 *             }
 *             leaf time-period {
 *                 type time-period;
 *             }
 *             uses container-performance-type-g;
 *         }
 *         leaf suspect-interval-flag {
 *             type suspect-interval-flag;
 *         }
 *         leaf history-data-id {
 *             type string;
 *         }
 *         leaf period-end-time {
 *             type date-and-time;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *     }
 *     grouping ethernet-container-configuration-g {
 *         leaf container-id {
 *             type container-id;
 *         }
 *         list segments-id-list {
 *             key "structure-id-ref" "segment-id-ref";
 *             leaf structure-id-ref {
 *                 type universal-id;
 *             }
 *             leaf segment-id-ref {
 *                 type int16;
 *             }
 *             uses segment-id-type-g;
 *         }
 *         leaf packet-compression-is-on {
 *             type packet-compression-is-on;
 *         }
 *         leaf layer2-compression-is-on {
 *             type layer2-compression-is-on;
 *         }
 *         leaf vlan-compression-is-on {
 *             type vlan-compression-is-on;
 *         }
 *         leaf q-in-q-compression-is-on {
 *             type q-in-q-compression-is-on;
 *         }
 *         leaf mpls-compression-is-on {
 *             type mpls-compression-is-on;
 *         }
 *         leaf ipv4-compression-is-on {
 *             type ipv4-compression-is-on;
 *         }
 *         leaf ipv6-compression-is-on {
 *             type ipv6-compression-is-on;
 *         }
 *         leaf layer4-compression-is-on {
 *             type layer4-compression-is-on;
 *         }
 *         leaf encryption-is-on {
 *             type encryption-is-on;
 *         }
 *         leaf cryptographic-key {
 *             type cryptographic-key;
 *         }
 *         leaf performance-monitoring-collection-is-on {
 *             type performance-monitoring-collection-is-on;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type string;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses container-problem-severity-type-g;
 *         }
 *     }
 *     grouping air-interface-problem-severity-type-g {
 *         leaf problem-kind-name {
 *             type string;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *     }
 *     grouping structure-problem-severity-type-g {
 *         leaf problem-kind-name {
 *             type string;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *     }
 *     grouping structure-performance-type-g {
 *         leaf time-period {
 *             type time-period;
 *         }
 *         leaf es {
 *             type es;
 *         }
 *         leaf ses {
 *             type ses;
 *         }
 *         leaf cses {
 *             type cses;
 *         }
 *         leaf unavailability {
 *             type unavailability;
 *         }
 *         leaf rx-level-min {
 *             type rx-level-min;
 *         }
 *         leaf rx-level-max {
 *             type rx-level-max;
 *         }
 *         leaf rx-level-avg {
 *             type rx-level-avg;
 *         }
 *     }
 *     grouping air-interface-diversity-current-performance-g {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf snir-min {
 *                     type snir-min;
 *                 }
 *                 leaf snir-max {
 *                     type snir-max;
 *                 }
 *                 leaf snir-avg {
 *                     type snir-avg;
 *                 }
 *                 uses air-interface-diversity-performance-type-g;
 *             }
 *             leaf timestamp {
 *                 type date-and-time;
 *             }
 *             leaf suspect-interval-flag {
 *                 type boolean;
 *             }
 *             leaf elapsed-time {
 *                 type int64;
 *             }
 *             leaf scanner-id {
 *                 type string;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses air-interface-diversity-current-performance-type-g;
 *         }
 *     }
 *     grouping mau-type-g {
 *         leaf mau-id {
 *             type universal-id;
 *         }
 *         leaf mii-kind {
 *             type mii-kind;
 *         }
 *         leaf mdi-kind {
 *             type mdi-kind;
 *         }
 *         leaf required-medium-kind {
 *             type required-medium-kind;
 *         }
 *         leaf-list wavelength-min {
 *             type wavelength-min;
 *         }
 *         leaf-list wavelength-max {
 *             type wavelength-max;
 *         }
 *         leaf wavelength-grid-min {
 *             type wavelength-grid-min;
 *         }
 *         leaf link-length-max {
 *             type link-length-max;
 *         }
 *         leaf vendor-name {
 *             type vendor-name;
 *         }
 *         leaf vendor-oui {
 *             type vendor-oui;
 *         }
 *         leaf part-number {
 *             type part-number;
 *         }
 *         leaf revision-number {
 *             type revision-number;
 *         }
 *         leaf serial-number {
 *             type serial-number;
 *         }
 *         leaf date-code {
 *             type date-code;
 *         }
 *         leaf-list pmd-list {
 *             type pmd-name-type;
 *         }
 *         list signal-ordering-list {
 *             key "signal-ordering-kind-name";
 *             leaf signal-ordering-kind-name {
 *                 type string;
 *             }
 *             leaf-list signal-list {
 *                 type string;
 *             }
 *             uses signal-ordering-type-g;
 *         }
 *         leaf auto-signal-ordering-is-avail {
 *             type auto-signal-ordering-is-avail;
 *         }
 *         leaf short-reach-mode-is-avail {
 *             type short-reach-mode-is-avail;
 *         }
 *         leaf eee-is-avail {
 *             type eee-is-avail;
 *         }
 *         leaf unidirectional-operation-is-avail {
 *             type unidirectional-operation-is-avail;
 *         }
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *     }
 *     grouping container-type-g {
 *         leaf container-name {
 *             type string;
 *         }
 *         leaf number-of-time-slots-required {
 *             type number-of-time-slots-required;
 *         }
 *         leaf tdm-time-slots-is-required {
 *             type tdm-time-slots-is-required;
 *         }
 *         leaf bundling-is-avail {
 *             type bundling-is-avail;
 *         }
 *     }
 *     grouping ethernet-container-status-g {
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *     }
 *     grouping container-current-performance-type-g {
 *         container performance-data {
 *             leaf tx-ethernet-bytes-max-s {
 *                 type tx-ethernet-bytes-max-s;
 *             }
 *             leaf tx-ethernet-bytes-max-m {
 *                 type tx-ethernet-bytes-max-m;
 *             }
 *             leaf tx-ethernet-bytes-sum {
 *                 type tx-ethernet-bytes-sum;
 *             }
 *             leaf time-period {
 *                 type time-period;
 *             }
 *             uses container-performance-type-g;
 *         }
 *         leaf timestamp {
 *             type date-and-time;
 *         }
 *         leaf suspect-interval-flag {
 *             type boolean;
 *         }
 *         leaf elapsed-time {
 *             type int64;
 *         }
 *         leaf scanner-id {
 *             type string;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *     }
 *     grouping wire-interface-configuration-g {
 *         leaf wire-interface-name {
 *             type wire-interface-name;
 *         }
 *         leaf remote-wire-interface-name {
 *             type remote-wire-interface-name;
 *         }
 *         leaf interface-is-on {
 *             type interface-is-on;
 *         }
 *         leaf-list transceiver-is-on-list {
 *             type boolean;
 *         }
 *         leaf auto-pmd-negotiation-is-on {
 *             type auto-pmd-negotiation-is-on;
 *         }
 *         leaf fixed-pmd {
 *             type fixed-pmd;
 *         }
 *         leaf auto-pmd-negotiation-max {
 *             type auto-pmd-negotiation-max;
 *         }
 *         leaf auto-signal-ordering-is-on {
 *             type auto-signal-ordering-is-on;
 *         }
 *         leaf fixed-signal-ordering {
 *             type universal-id;
 *         }
 *         leaf short-reach-mode-is-on {
 *             type short-reach-mode-is-on;
 *         }
 *         leaf unidirectional-operation-is-on {
 *             type unidirectional-operation-is-on;
 *         }
 *         leaf-list wavelength-list {
 *             type wavelength-list;
 *         }
 *         leaf temperature-high-threshold {
 *             type temperature-high-threshold;
 *         }
 *         leaf temperature-low-threshold {
 *             type temperature-low-threshold;
 *         }
 *         leaf rxlevel-high-threshold {
 *             type rxlevel-high-threshold;
 *         }
 *         leaf rxlevel-low-threshold {
 *             type rxlevel-low-threshold;
 *         }
 *         leaf loop-back-kind-on {
 *             type string;
 *         }
 *         leaf isolation-is-on {
 *             type isolation-is-on;
 *         }
 *         leaf restart-pmd-negotiation-is-on {
 *             type restart-pmd-negotiation-is-on;
 *         }
 *         leaf reset-mau-is-on {
 *             type reset-mau-is-on;
 *         }
 *         leaf maintenance-timer {
 *             type maintenance-timer;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type string;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses wire-interface-problem-severity-type-g;
 *         }
 *     }
 *     grouping pure-ethernet-structure-current-performance-g {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf cses {
 *                     type cses;
 *                 }
 *                 leaf unavailability {
 *                     type unavailability;
 *                 }
 *                 leaf rx-level-min {
 *                     type rx-level-min;
 *                 }
 *                 leaf rx-level-max {
 *                     type rx-level-max;
 *                 }
 *                 leaf rx-level-avg {
 *                     type rx-level-avg;
 *                 }
 *                 uses structure-performance-type-g;
 *             }
 *             leaf timestamp {
 *                 type date-and-time;
 *             }
 *             leaf suspect-interval-flag {
 *                 type boolean;
 *             }
 *             leaf elapsed-time {
 *                 type int64;
 *             }
 *             leaf scanner-id {
 *                 type string;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses structure-current-performance-type-g;
 *         }
 *     }
 *     grouping air-interface-diversity-performance-type-g {
 *         leaf snir-min {
 *             type snir-min;
 *         }
 *         leaf snir-max {
 *             type snir-max;
 *         }
 *         leaf snir-avg {
 *             type snir-avg;
 *         }
 *     }
 *     grouping ethernet-container-current-performance-g {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf tx-ethernet-bytes-max-s {
 *                     type tx-ethernet-bytes-max-s;
 *                 }
 *                 leaf tx-ethernet-bytes-max-m {
 *                     type tx-ethernet-bytes-max-m;
 *                 }
 *                 leaf tx-ethernet-bytes-sum {
 *                     type tx-ethernet-bytes-sum;
 *                 }
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 uses container-performance-type-g;
 *             }
 *             leaf timestamp {
 *                 type date-and-time;
 *             }
 *             leaf suspect-interval-flag {
 *                 type boolean;
 *             }
 *             leaf elapsed-time {
 *                 type int64;
 *             }
 *             leaf scanner-id {
 *                 type string;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses container-current-performance-type-g;
 *         }
 *     }
 *     grouping tdm-container-status-g {
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *     }
 *     grouping hybrid-mw-structure-capability-g {
 *         leaf structure-id {
 *             type universal-id;
 *         }
 *         list supported-tdm-structure-types-list {
 *             key "tdm-structure-name";
 *             leaf tdm-structure-name {
 *                 type string;
 *             }
 *             leaf tdm-segment-size {
 *                 type tdm-segment-size;
 *             }
 *             leaf max-number-of-segments-reservable {
 *                 type max-number-of-segments-reservable;
 *             }
 *             uses tdm-structure-type-g;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *             status DEPRECATED;
 *         }
 *     }
 *     grouping ethernet-container-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses container-current-problem-type-g;
 *         }
 *     }
 *     grouping air-interface-diversity-current-problem-type-g {
 *         leaf problem-name {
 *             type problem-name;
 *         }
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *     }
 *     grouping air-interface-diversity-problem-severity-type-g {
 *         leaf problem-kind-name {
 *             type string;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *     }
 *     grouping wire-interface-historical-performances-g {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf symbol-error-during-carrier {
 *                     type symbol-error-during-carrier;
 *                 }
 *                 leaf low-power-idle-transmitter-ms {
 *                     type low-power-idle-transmitter-ms;
 *                 }
 *                 leaf low-power-idle-receiver-ms {
 *                     type low-power-idle-receiver-ms;
 *                 }
 *                 uses wire-interface-performance-type-g;
 *             }
 *             leaf suspect-interval-flag {
 *                 type suspect-interval-flag;
 *             }
 *             leaf history-data-id {
 *                 type string;
 *             }
 *             leaf period-end-time {
 *                 type date-and-time;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses wire-interface-historical-performance-type-g;
 *         }
 *     }
 *     grouping air-interface-configuration-g {
 *         leaf air-interface-name {
 *             type air-interface-name;
 *         }
 *         leaf remote-air-interface-name {
 *             type remote-air-interface-name;
 *         }
 *         leaf expected-signal-id {
 *             type int16;
 *         }
 *         leaf transmitted-signal-id {
 *             type int16;
 *         }
 *         leaf radio-signal-id {
 *             type radio-signal-id;
 *             status DEPRECATED;
 *         }
 *         leaf tx-frequency {
 *             type tx-frequency;
 *         }
 *         leaf rx-frequency {
 *             type rx-frequency;
 *         }
 *         leaf transmission-mode-min {
 *             type universal-id;
 *         }
 *         leaf transmission-mode-max {
 *             type universal-id;
 *         }
 *         leaf tx-channel-bandwidth {
 *             type tx-channel-bandwidth;
 *             status DEPRECATED;
 *         }
 *         leaf rx-channel-bandwidth {
 *             type rx-channel-bandwidth;
 *         }
 *         leaf polarization {
 *             type polarization;
 *         }
 *         leaf power-is-on {
 *             type power-is-on;
 *         }
 *         leaf transmitter-is-on {
 *             type transmitter-is-on;
 *         }
 *         leaf receiver-is-on {
 *             type receiver-is-on;
 *         }
 *         leaf tx-power {
 *             type tx-power;
 *         }
 *         leaf adaptive-modulation-is-on {
 *             type adaptive-modulation-is-on;
 *         }
 *         leaf modulation-min {
 *             type modulation-min;
 *             status DEPRECATED;
 *         }
 *         leaf modulation-max {
 *             type modulation-max;
 *             status DEPRECATED;
 *         }
 *         leaf xpic-is-on {
 *             type xpic-is-on;
 *         }
 *         leaf mimo-is-on {
 *             type mimo-is-on;
 *         }
 *         leaf alic-is-on {
 *             type alic-is-on;
 *         }
 *         leaf atpc-is-on {
 *             type atpc-is-on;
 *         }
 *         leaf atpc-thresh-upper {
 *             type atpc-thresh-upper;
 *         }
 *         leaf atpc-thresh-lower {
 *             type atpc-thresh-lower;
 *         }
 *         leaf atpc-tx-power-min {
 *             type atpc-tx-power-min;
 *         }
 *         leaf auto-freq-select-is-on {
 *             type auto-freq-select-is-on;
 *         }
 *         leaf auto-freq-select-range {
 *             type auto-freq-select-range;
 *         }
 *         leaf modulation-is-on {
 *             type modulation-is-on;
 *         }
 *         leaf encryption-is-on {
 *             type encryption-is-on;
 *         }
 *         leaf cryptographic-key {
 *             type cryptographic-key;
 *         }
 *         leaf performance-monitoring-collection-is-on {
 *             type performance-monitoring-collection-is-on;
 *         }
 *         list threshold-cross-alarm-list {
 *             key "g826-value-kind" "granularity-period";
 *             leaf g826-value-kind {
 *                 type g826-type;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf alarm-raising-threshold {
 *                 type alarm-raising-threshold;
 *             }
 *             leaf alarm-clearing-threshold {
 *                 type alarm-clearing-threshold;
 *             }
 *             uses threshold-cross-alarm-type-g;
 *         }
 *         leaf loop-back-kind-on {
 *             type loop-back-kind-on;
 *         }
 *         leaf maintenance-timer {
 *             type maintenance-timer;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type string;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses air-interface-problem-severity-type-g;
 *         }
 *     }
 *     grouping structure-historical-performance-type-g {
 *         container performance-data {
 *             leaf time-period {
 *                 type time-period;
 *             }
 *             leaf es {
 *                 type es;
 *             }
 *             leaf ses {
 *                 type ses;
 *             }
 *             leaf cses {
 *                 type cses;
 *             }
 *             leaf unavailability {
 *                 type unavailability;
 *             }
 *             leaf rx-level-min {
 *                 type rx-level-min;
 *             }
 *             leaf rx-level-max {
 *                 type rx-level-max;
 *             }
 *             leaf rx-level-avg {
 *                 type rx-level-avg;
 *             }
 *             uses structure-performance-type-g;
 *         }
 *         leaf suspect-interval-flag {
 *             type suspect-interval-flag;
 *         }
 *         leaf history-data-id {
 *             type string;
 *         }
 *         leaf period-end-time {
 *             type date-and-time;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *     }
 *     grouping air-interface-diversity-configuration-g {
 *         container air-interface-diversity {
 *             leaf diversity-name {
 *                 type string;
 *             }
 *             leaf number-of-air-interfaces-max {
 *                 type number-of-air-interfaces-max;
 *             }
 *             uses diversity-type-g;
 *         }
 *         leaf-list air-interface-ltp-list {
 *             type leafref;
 *         }
 *         leaf performance-monitoring-collection-is-on {
 *             type performance-monitoring-collection-is-on;
 *         }
 *         list threshold-cross-alarm-list {
 *             key "g826-value-kind" "granularity-period";
 *             leaf g826-value-kind {
 *                 type g826-type;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf alarm-raising-threshold {
 *                 type alarm-raising-threshold;
 *             }
 *             leaf alarm-clearing-threshold {
 *                 type alarm-clearing-threshold;
 *             }
 *             uses threshold-cross-alarm-type-g;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type string;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses air-interface-diversity-problem-severity-type-g;
 *         }
 *     }
 *     grouping container-performance-type-g {
 *         leaf tx-ethernet-bytes-max-s {
 *             type tx-ethernet-bytes-max-s;
 *         }
 *         leaf tx-ethernet-bytes-max-m {
 *             type tx-ethernet-bytes-max-m;
 *         }
 *         leaf tx-ethernet-bytes-sum {
 *             type tx-ethernet-bytes-sum;
 *         }
 *         leaf time-period {
 *             type time-period;
 *         }
 *     }
 *     grouping hybrid-mw-structure-current-performance-g {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf cses {
 *                     type cses;
 *                 }
 *                 leaf unavailability {
 *                     type unavailability;
 *                 }
 *                 leaf rx-level-min {
 *                     type rx-level-min;
 *                 }
 *                 leaf rx-level-max {
 *                     type rx-level-max;
 *                 }
 *                 leaf rx-level-avg {
 *                     type rx-level-avg;
 *                 }
 *                 uses structure-performance-type-g;
 *             }
 *             leaf timestamp {
 *                 type date-and-time;
 *             }
 *             leaf suspect-interval-flag {
 *                 type boolean;
 *             }
 *             leaf elapsed-time {
 *                 type int64;
 *             }
 *             leaf scanner-id {
 *                 type string;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses structure-current-performance-type-g;
 *         }
 *     }
 *     grouping threshold-cross-alarm-type-g {
 *         leaf g826-value-kind {
 *             type g826-type;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf alarm-raising-threshold {
 *             type alarm-raising-threshold;
 *         }
 *         leaf alarm-clearing-threshold {
 *             type alarm-clearing-threshold;
 *         }
 *     }
 *
 *     feature hybrid-microwave {
 *         description
 *             "Feature 'hybrid-microwave' is mandatory for device types transporting Ethernet + TDM.";
 *         status CURRENT;
 *     }
 *     feature pure-ethernet {
 *         description
 *             "Feature 'pure-ethernet' is mandatory for device types transporting pure Ethernet.";
 *         status CURRENT;
 *     }
 *
 *     notification object-creation-notification {
 *         description
 *             "none";
 *         leaf counter {
 *             type counter;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf object-id-ref {
 *             type universal-id;
 *         }
 *         leaf object-type {
 *             type object-type;
 *         }
 *         uses object-creation-notification-g;
 *     }
 *     notification object-deletion-notification {
 *         description
 *             "none";
 *         leaf counter {
 *             type counter;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf object-id-ref {
 *             type universal-id;
 *         }
 *         uses object-deletion-notification-g;
 *     }
 *     notification attribute-value-changed-notification {
 *         description
 *             "none";
 *         leaf counter {
 *             type counter;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf object-id-ref {
 *             type universal-id;
 *         }
 *         leaf attribute-name {
 *             type attribute-name;
 *         }
 *         leaf new-value {
 *             type new-value;
 *         }
 *         uses attribute-value-changed-notification-g;
 *     }
 *     notification problem-notification {
 *         description
 *             "none";
 *         leaf counter {
 *             type counter;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf object-id-ref {
 *             type universal-id;
 *         }
 *         leaf problem {
 *             type problem;
 *         }
 *         leaf severity {
 *             type severity;
 *         }
 *         uses problem-notification-g;
 *     }
 * }
 * </pre>
 *
 */
public interface MicrowaveModelData
    extends
    DataRoot
{




    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>mwAirInterfacePac</code>, or <code>null</code> if not present
     */
    List<MwAirInterfacePac> getMwAirInterfacePac();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>coChannelGroup</code>, or <code>null</code> if not present
     */
    List<CoChannelGroup> getCoChannelGroup();
    
    /**
     * The EndPoint (EP) object class models the access to the FC function. Each 
     * EndPoint instance has a role (e.g., working, protection, protected, hub, spoke, 
     * leaf, root, etc.) with respect to the FC function. The association of the FC to 
     * LTPs is made via EndPoints (essentially the ports of the FC) where each EndPoint
     * (EP) of the FC has a role in the context of the FC. The traffic forwarding 
     * between the associated End PointsEPs of the FC depends upon the type of FC and 
     * may be associated with FCSwitch object instances. In cases where there is 
     * protection conveys the protecting role of the access to the FC. The EP replaces 
     * the Protection Unit of a traditional protection model. It represents a protected
     * (resilient/reliable) point or a protecting (unreliable working or protection) 
     * point.
     *
     *
     *
     * @return <code>java.util.List</code> <code>mwAirInterfaceHsbEndPointPac</code>, or <code>null</code> if not present
     */
    List<MwAirInterfaceHsbEndPointPac> getMwAirInterfaceHsbEndPointPac();
    
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
     *
     *
     * @return <code>java.util.List</code> <code>mwAirInterfaceHsbFcSwitchPac</code>, or <code>null</code> if not present
     */
    List<MwAirInterfaceHsbFcSwitchPac> getMwAirInterfaceHsbFcSwitchPac();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>mwAirInterfaceDiversityPac</code>, or <code>null</code> if not present
     */
    List<MwAirInterfaceDiversityPac> getMwAirInterfaceDiversityPac();
    
    /**
     * The pureEthernetStructure_Pac and its attached classes MUST be provided on 
     * management interfaces of microwave devices, which are transporting Ethernet 
     * traffic only.
     *
     *
     *
     * @return <code>java.util.List</code> <code>mwPureEthernetStructurePac</code>, or <code>null</code> if not present
     */
    List<MwPureEthernetStructurePac> getMwPureEthernetStructurePac();
    
    /**
     * The HybridMwStructure_Pac and its attached classes MUST be provided on 
     * management interfaces of microwave devices, which are transporting TDM and 
     * Ethernet traffic.
     *
     *
     *
     * @return <code>java.util.List</code> <code>mwHybridMwStructurePac</code>, or <code>null</code> if not present
     */
    List<MwHybridMwStructurePac> getMwHybridMwStructurePac();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>mwEthernetContainerPac</code>, or <code>null</code> if not present
     */
    List<MwEthernetContainerPac> getMwEthernetContainerPac();
    
    /**
     * The TdmContainer_Pac and its attached classes MUST be provided on management 
     * interfaces of microwave devices, which are transporting TDM traffic.
     *
     *
     *
     * @return <code>java.util.List</code> <code>mwTdmContainerPac</code>, or <code>null</code> if not present
     */
    List<MwTdmContainerPac> getMwTdmContainerPac();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>wireInterfacePac</code>, or <code>null</code> if not present
     */
    List<WireInterfacePac> getWireInterfacePac();

}

