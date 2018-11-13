package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.CellConfig;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteTunnel;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte {
 *     leaf tunnel-number-of-entries {
 *         type uint64;
 *     }
 *     list lte-tunnel {
 *         key "tunnel-ref";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf tunnel-ref {
 *             type string;
 *         }
 *         leaf-list plmnid {
 *             type string;
 *         }
 *         uses lte-tunnel-g;
 *     }
 *     container lte-epc {
 *         leaf-list allowed-ciphering-algorithm-list {
 *             type enumeration;
 *         }
 *         leaf-list allowed-integrity-protection-algorithm-list {
 *             type enumeration;
 *         }
 *         leaf tac {
 *             type uint16;
 *         }
 *         leaf eaid {
 *             type uint32;
 *         }
 *         leaf max-plmn-list-entries {
 *             type uint64;
 *         }
 *         leaf plmn-list-number-of-entries {
 *             type uint64;
 *         }
 *         leaf max-qo-s-entries {
 *             type uint64;
 *         }
 *         leaf qo-s-number-of-entries {
 *             type uint64;
 *         }
 *         list lte-epc-plmn-list {
 *             key "plmnid";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf is-primary {
 *                 type boolean;
 *             }
 *             leaf plmnid {
 *                 type string;
 *             }
 *             leaf cell-reserved-for-operator-use {
 *                 type boolean;
 *             }
 *             uses lte-epc-plmn-list-g;
 *         }
 *         list lte-epc-qo-s {
 *             key "qci";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf qci {
 *                 type uint8;
 *             }
 *             leaf type {
 *                 type enumeration;
 *             }
 *             leaf priority {
 *                 type uint8;
 *             }
 *             leaf packet-delay-budget {
 *                 type packet-delay-budget;
 *             }
 *             uses lte-epc-qo-s-g;
 *         }
 *         uses lte-epc-g;
 *     }
 *     container lte-ran {
 *         container lte-ran-common {
 *             leaf cell-identity {
 *                 type uint32;
 *             }
 *             uses lte-ran-common-g;
 *         }
 *         container lte-ran-s1-ap {
 *             leaf-list t-reloc-prep {
 *                 type string;
 *             }
 *             leaf-list t-reloc-overall {
 *                 type string;
 *             }
 *             uses lte-ran-s1-ap-g;
 *         }
 *         container lte-ran-s1-u {
 *             leaf gtpu-echo-interval {
 *                 type gtpu-echo-interval;
 *             }
 *             uses lte-ran-s1-u-g;
 *         }
 *         container lte-ran-rf {
 *             leaf-list earfcndl {
 *                 type uint16;
 *             }
 *             leaf-list earfcnul {
 *                 type uint16;
 *             }
 *             leaf freq-band-indicator {
 *                 type uint8;
 *             }
 *             leaf-list dl-bandwidth {
 *                 type uint8;
 *             }
 *             leaf-list ul-bandwidth {
 *                 type uint8;
 *             }
 *             leaf-list reference-signal-power {
 *                 type string;
 *             }
 *             leaf-list phy-cell-id {
 *                 type string;
 *             }
 *             leaf-list psch-power-offset {
 *                 type string;
 *             }
 *             leaf-list ssch-power-offset {
 *                 type string;
 *             }
 *             leaf-list pbch-power-offset {
 *                 type string;
 *             }
 *             uses lte-ran-rf-g;
 *         }
 *         container lte-ran-phy {
 *             container lte-ran-phy-antenna-info {
 *                 leaf antenna-ports-count {
 *                     type uint8;
 *                 }
 *                 uses lte-ran-phy-antenna-info-g;
 *             }
 *             container lte-ran-phy-pdsch {
 *                 leaf-list pb {
 *                     type string;
 *                 }
 *                 leaf-list pa {
 *                     type int64;
 *                 }
 *                 uses lte-ran-phy-pdsch-g;
 *             }
 *             container lte-ran-phy-srs {
 *                 leaf srs-enabled {
 *                     type boolean;
 *                 }
 *                 leaf-list srs-bandwidth-config {
 *                     type string;
 *                 }
 *                 leaf srs-max-up-pts {
 *                     type boolean;
 *                 }
 *                 leaf ack-nack-srs-simultaneous-transmission {
 *                     type boolean;
 *                 }
 *                 uses lte-ran-phy-srs-g;
 *             }
 *             container lte-ran-phy-prach {
 *                 leaf-list root-sequence-index {
 *                     type string;
 *                 }
 *                 leaf-list configuration-index {
 *                     type string;
 *                 }
 *                 leaf high-speed-flag {
 *                     type boolean;
 *                 }
 *                 leaf-list zero-correlation-zone-config {
 *                     type string;
 *                 }
 *                 leaf-list freq-offset {
 *                     type string;
 *                 }
 *                 uses lte-ran-phy-prach-g;
 *             }
 *             container lte-ran-phy-pucch {
 *                 leaf delta-pucch-shift {
 *                     type enumeration;
 *                 }
 *                 leaf-list nrbcqi {
 *                     type string;
 *                 }
 *                 leaf ncsan {
 *                     type uint8;
 *                 }
 *                 leaf-list n1-pucchan {
 *                     type string;
 *                 }
 *                 leaf-list cqipucch-resource-index {
 *                     type string;
 *                 }
 *                 leaf k {
 *                     type k;
 *                 }
 *                 uses lte-ran-phy-pucch-g;
 *             }
 *             container lte-ran-phy-pusch {
 *                 leaf nsb {
 *                     type uint8;
 *                 }
 *                 leaf hopping-mode {
 *                     type enumeration;
 *                 }
 *                 leaf-list hopping-offset {
 *                     type string;
 *                 }
 *                 leaf enable64-qam {
 *                     type boolean;
 *                 }
 *                 container lte-ran-phy-pusch-ulrs {
 *                     leaf group-hopping-enabled {
 *                         type boolean;
 *                     }
 *                     leaf group-assignment-pusch {
 *                         type uint8;
 *                     }
 *                     leaf sequence-hopping-enabled {
 *                         type boolean;
 *                     }
 *                     leaf cyclic-shift {
 *                         type uint8;
 *                     }
 *                     uses lte-ran-phy-pusch-ulrs-g;
 *                 }
 *                 uses lte-ran-phy-pusch-g;
 *             }
 *             container lte-ran-phy-ul-power-control {
 *                 leaf-list p0-nominal-pusch {
 *                     type string;
 *                 }
 *                 leaf-list alpha {
 *                     type string;
 *                 }
 *                 leaf-list p0-nominal-pucch {
 *                     type string;
 *                 }
 *                 leaf delta-fpucch-format1 {
 *                     type delta-fpucch-format1;
 *                 }
 *                 leaf delta-fpucch-format1b {
 *                     type delta-fpucch-format1b;
 *                 }
 *                 leaf delta-fpucch-format2 {
 *                     type delta-fpucch-format2;
 *                 }
 *                 leaf delta-fpucch-format2a {
 *                     type delta-fpucch-format2a;
 *                 }
 *                 leaf delta-fpucch-format2b {
 *                     type delta-fpucch-format2b;
 *                 }
 *                 leaf delta-preamble-msg3 {
 *                     type delta-preamble-msg3;
 *                 }
 *                 uses lte-ran-phy-ul-power-control-g;
 *             }
 *             container lte-ran-phy-mbsfn {
 *                 leaf neigh-cell-config {
 *                     type uint8;
 *                 }
 *                 leaf max-sf-config-list-entries {
 *                     type uint64;
 *                 }
 *                 leaf sf-config-list-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list lte-ran-phy-mbsfn-sf-config-list {
 *                     key "radio-frame-allocation-period" "radioframe-allocation-offset" "radio-frame-allocation-size";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf sync-stratum-id {
 *                         type uint8;
 *                     }
 *                     leaf radio-frame-allocation-period {
 *                         type uint8;
 *                     }
 *                     leaf radioframe-allocation-offset {
 *                         type uint8;
 *                     }
 *                     leaf radio-frame-allocation-size {
 *                         type uint8;
 *                     }
 *                     leaf-list sub-frame-allocations {
 *                         type uint8;
 *                     }
 *                     uses lte-ran-phy-mbsfn-sf-config-list-g;
 *                 }
 *                 uses lte-ran-phy-mbsfn-g;
 *             }
 *             container lte-ran-phy-prs {
 *                 leaf num-prs-resource-blocks {
 *                     type num-prs-resource-blocks;
 *                 }
 *                 leaf prs-configuration-index {
 *                     type uint16;
 *                 }
 *                 leaf num-consecutive-prs-subfames {
 *                     type uint8;
 *                 }
 *                 uses lte-ran-phy-prs-g;
 *             }
 *             container lte-ran-phy-tdd-frame {
 *                 leaf sub-frame-assignment {
 *                     type uint8;
 *                 }
 *                 leaf special-subframe-patterns {
 *                     type uint8;
 *                 }
 *                 uses lte-ran-phy-tdd-frame-g;
 *             }
 *             uses lte-ran-phy-g;
 *         }
 *         container lte-ran-mac {
 *             container lte-ran-mac-rach {
 *                 leaf-list number-of-ra-preambles {
 *                     type uint8;
 *                 }
 *                 leaf-list size-of-ra-group-a {
 *                     type uint8;
 *                 }
 *                 leaf-list message-size-group-a {
 *                     type uint16;
 *                 }
 *                 leaf-list message-power-offset-group-b {
 *                     type int64;
 *                 }
 *                 leaf-list power-ramping-step {
 *                     type uint8;
 *                 }
 *                 leaf-list preamble-initial-received-target-power {
 *                     type int64;
 *                 }
 *                 leaf-list preamble-trans-max {
 *                     type string;
 *                 }
 *                 leaf-list response-window-size {
 *                     type string;
 *                 }
 *                 leaf-list contention-resolution-timer {
 *                     type uint8;
 *                 }
 *                 leaf-list max-harq-msg3-tx {
 *                     type string;
 *                 }
 *                 uses lte-ran-mac-rach-g;
 *             }
 *             container lte-ran-mac-drx {
 *                 leaf drx-enabled {
 *                     type boolean;
 *                 }
 *                 leaf-list on-duration-timer {
 *                     type string;
 *                 }
 *                 leaf-list drx-inactivity-timer {
 *                     type string;
 *                 }
 *                 leaf-list drx-retransmission-timer {
 *                     type uint8;
 *                 }
 *                 leaf-list long-drx-cycle {
 *                     type uint16;
 *                 }
 *                 leaf-list drx-start-offset {
 *                     type string;
 *                 }
 *                 leaf-list short-drx-cycle {
 *                     type uint16;
 *                 }
 *                 leaf-list drx-short-cycle-timer {
 *                     type string;
 *                 }
 *                 uses lte-ran-mac-drx-g;
 *             }
 *             container lte-ran-mac-ulsch {
 *                 leaf max-harq-tx {
 *                     type uint8;
 *                 }
 *                 leaf periodic-bsr-timer {
 *                     type periodic-bsr-timer;
 *                 }
 *                 leaf retx-bsr-timer {
 *                     type retx-bsr-timer;
 *                 }
 *                 leaf tti-bundling {
 *                     type boolean;
 *                 }
 *                 uses lte-ran-mac-ulsch-g;
 *             }
 *             uses lte-ran-mac-g;
 *         }
 *         container lte-ran-rlc {
 *             container lte-ran-rlc-srb1 {
 *                 leaf default-configuration {
 *                     type boolean;
 *                 }
 *                 leaf-list t-poll-retransmit {
 *                     type string;
 *                 }
 *                 leaf-list poll-pdu {
 *                     type uint16;
 *                 }
 *                 leaf-list poll-byte {
 *                     type uint16;
 *                 }
 *                 leaf-list max-retx-threshold {
 *                     type uint8;
 *                 }
 *                 leaf-list t-reordering {
 *                     type string;
 *                 }
 *                 leaf-list t-status-prohibit {
 *                     type string;
 *                 }
 *                 uses lte-ran-rlc-srb1-g;
 *             }
 *             container lte-ran-rlc-srb2 {
 *                 leaf default-configuration {
 *                     type boolean;
 *                 }
 *                 leaf-list t-poll-retransmit {
 *                     type string;
 *                 }
 *                 leaf-list poll-pdu {
 *                     type uint16;
 *                 }
 *                 leaf-list poll-byte {
 *                     type uint16;
 *                 }
 *                 leaf-list max-retx-threshold {
 *                     type uint8;
 *                 }
 *                 leaf-list t-reordering {
 *                     type string;
 *                 }
 *                 leaf-list t-status-prohibit {
 *                     type string;
 *                 }
 *                 uses lte-ran-rlc-srb2-g;
 *             }
 *             uses lte-ran-rlc-g;
 *         }
 *         container lte-ran-rrc-timers {
 *             leaf-list t300 {
 *                 type uint16;
 *             }
 *             leaf-list t301 {
 *                 type uint16;
 *             }
 *             leaf t302 {
 *                 type t302;
 *             }
 *             leaf-list t304-eutra {
 *                 type uint16;
 *             }
 *             leaf-list t304-irat {
 *                 type uint16;
 *             }
 *             leaf-list t310 {
 *                 type uint16;
 *             }
 *             leaf-list t311 {
 *                 type uint16;
 *             }
 *             leaf t320 {
 *                 type t320;
 *             }
 *             leaf n310 {
 *                 type uint8;
 *             }
 *             leaf n311 {
 *                 type uint8;
 *             }
 *             uses lte-ran-rrc-timers-g;
 *         }
 *         container lte-ran-cell-restriction {
 *             leaf cell-barred {
 *                 type boolean;
 *             }
 *             leaf cell-reserved-for-operator-use {
 *                 type boolean;
 *             }
 *             leaf barring-for-emergency {
 *                 type boolean;
 *             }
 *             uses lte-ran-cell-restriction-g;
 *         }
 *         container lte-ran-mobility {
 *             container lte-ran-mobility-idle-mode {
 *                 container lte-ran-mobility-idle-mode-common {
 *                     leaf-list qhyst {
 *                         type string;
 *                     }
 *                     leaf q-hyst-sf-medium {
 *                         type q-hyst-sf-medium;
 *                     }
 *                     leaf q-hyst-sf-high {
 *                         type q-hyst-sf-high;
 *                     }
 *                     leaf t-evaluation {
 *                         type t-evaluation;
 *                     }
 *                     leaf t-hyst-normal {
 *                         type t-hyst-normal;
 *                     }
 *                     leaf n-cell-change-medium {
 *                         type uint8;
 *                     }
 *                     leaf n-cell-change-high {
 *                         type uint8;
 *                     }
 *                     uses lte-ran-mobility-idle-mode-common-g;
 *                 }
 *                 container lte-ran-mobility-idle-mode-intra-freq {
 *                     leaf-list q-rx-lev-min-sib1 {
 *                         type string;
 *                     }
 *                     leaf-list q-rx-lev-min-sib3 {
 *                         type string;
 *                     }
 *                     leaf q-rx-lev-min-offset {
 *                         type q-rx-lev-min-offset;
 *                     }
 *                     leaf-list s-intra-search {
 *                         type string;
 *                     }
 *                     leaf-list t-reselection-eutra {
 *                         type string;
 *                     }
 *                     leaf-list s-non-intra-search {
 *                         type string;
 *                     }
 *                     leaf cell-reselection-priority {
 *                         type uint8;
 *                     }
 *                     leaf p-max {
 *                         type p-max;
 *                     }
 *                     leaf thresh-serving-low {
 *                         type thresh-serving-low;
 *                     }
 *                     leaf t-reselection-eutrasf-medium {
 *                         type uint8;
 *                     }
 *                     leaf t-reselection-eutrasf-high {
 *                         type uint8;
 *                     }
 *                     uses lte-ran-mobility-idle-mode-intra-freq-g;
 *                 }
 *                 container lte-ran-mobility-idle-mode-inter-freq {
 *                     leaf max-carrier-entries {
 *                         type uint64;
 *                     }
 *                     leaf carrier-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list lte-ran-mobility-idle-mode-inter-freq-carrier {
 *                         key "eutra-carrier-arfcn";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf eutra-carrier-arfcn {
 *                             type uint16;
 *                         }
 *                         leaf-list q-rx-lev-min-sib5 {
 *                             type string;
 *                         }
 *                         leaf-list q-offset-freq {
 *                             type string;
 *                         }
 *                         leaf-list t-reselection-eutra {
 *                             type string;
 *                         }
 *                         leaf cell-reselection-priority {
 *                             type uint8;
 *                         }
 *                         leaf thresh-x-high {
 *                             type thresh-x-high;
 *                         }
 *                         leaf thresh-x-low {
 *                             type thresh-x-low;
 *                         }
 *                         leaf p-max {
 *                             type p-max;
 *                         }
 *                         leaf t-reselection-eutrasf-medium {
 *                             type uint8;
 *                         }
 *                         leaf t-reselection-eutrasf-high {
 *                             type uint8;
 *                         }
 *                         uses lte-ran-mobility-idle-mode-inter-freq-carrier-g;
 *                     }
 *                     uses lte-ran-mobility-idle-mode-inter-freq-g;
 *                 }
 *                 container lte-ran-mobility-idle-mode-irat {
 *                     container lte-ran-mobility-idle-mode-irat-utra {
 *                         leaf-list t-reselection-utra {
 *                             type string;
 *                         }
 *                         leaf t-reselection-utrasf-medium {
 *                             type uint8;
 *                         }
 *                         leaf t-reselection-utrasf-high {
 *                             type uint8;
 *                         }
 *                         leaf max-utranfdd-freq-entries {
 *                             type uint64;
 *                         }
 *                         leaf utranfdd-freq-number-of-entries {
 *                             type uint64;
 *                         }
 *                         list lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq {
 *                             key "utra-carrier-arfcn";
 *                             leaf enable {
 *                                 type boolean;
 *                             }
 *                             leaf alias {
 *                                 type string;
 *                             }
 *                             leaf utra-carrier-arfcn {
 *                                 type uint16;
 *                             }
 *                             leaf-list q-rx-lev-min {
 *                                 type string;
 *                             }
 *                             leaf-list q-qual-min {
 *                                 type string;
 *                             }
 *                             leaf cell-reselection-priority {
 *                                 type uint8;
 *                             }
 *                             leaf thresh-x-high {
 *                                 type thresh-x-high;
 *                             }
 *                             leaf thresh-x-low {
 *                                 type thresh-x-low;
 *                             }
 *                             leaf p-max-utra {
 *                                 type p-max-utra;
 *                             }
 *                             uses lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq-g;
 *                         }
 *                         uses lte-ran-mobility-idle-mode-irat-utra-g;
 *                     }
 *                     container lte-ran-mobility-idle-mode-irat-geran {
 *                         leaf-list t-reselection-geran {
 *                             type string;
 *                         }
 *                         leaf t-reselection-geransf-medium {
 *                             type uint8;
 *                         }
 *                         leaf t-reselection-geransf-high {
 *                             type uint8;
 *                         }
 *                         leaf max-geran-freq-group-entries {
 *                             type uint64;
 *                         }
 *                         leaf geran-freq-group-number-of-entries {
 *                             type uint64;
 *                         }
 *                         list lte-ran-mobility-idle-mode-irat-geran-geran-freq-group {
 *                             key "bccharfcn";
 *                             leaf enable {
 *                                 type boolean;
 *                             }
 *                             leaf alias {
 *                                 type string;
 *                             }
 *                             leaf band-indicator {
 *                                 type enumeration;
 *                             }
 *                             leaf bccharfcn {
 *                                 type uint16;
 *                             }
 *                             leaf-list q-rx-lev-min {
 *                                 type string;
 *                             }
 *                             leaf cell-reselection-priority {
 *                                 type uint8;
 *                             }
 *                             leaf thresh-x-high {
 *                                 type thresh-x-high;
 *                             }
 *                             leaf thresh-x-low {
 *                                 type thresh-x-low;
 *                             }
 *                             uses lte-ran-mobility-idle-mode-irat-geran-geran-freq-group-g;
 *                         }
 *                         uses lte-ran-mobility-idle-mode-irat-geran-g;
 *                     }
 *                     container lte-ran-mobility-idle-mode-irat-cdma2000 {
 *                         leaf-list search-window-size {
 *                             type string;
 *                         }
 *                         leaf-list t-reselection-cdma2000 {
 *                             type string;
 *                         }
 *                         leaf t-reselection-cdma2000-sf-medium {
 *                             type uint8;
 *                         }
 *                         leaf t-reselection-cdma2000-sf-high {
 *                             type uint8;
 *                         }
 *                         leaf max-cdma2000-band-entries {
 *                             type uint64;
 *                         }
 *                         leaf cdma2000-band-number-of-entries {
 *                             type uint64;
 *                         }
 *                         list lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band {
 *                             key "band-class";
 *                             leaf enable {
 *                                 type boolean;
 *                             }
 *                             leaf alias {
 *                                 type string;
 *                             }
 *                             leaf band-class {
 *                                 type band-class;
 *                             }
 *                             leaf cell-reselection-priority {
 *                                 type uint8;
 *                             }
 *                             leaf thresh-x-high {
 *                                 type thresh-x-high;
 *                             }
 *                             leaf thresh-x-low {
 *                                 type thresh-x-low;
 *                             }
 *                             uses lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band-g;
 *                         }
 *                         uses lte-ran-mobility-idle-mode-irat-cdma2000-g;
 *                     }
 *                     uses lte-ran-mobility-idle-mode-irat-g;
 *                 }
 *                 uses lte-ran-mobility-idle-mode-g;
 *             }
 *             container lte-ran-mobility-conn-mode {
 *                 container lte-ran-mobility-conn-mode-eutra {
 *                     leaf-list filter-coefficient-rsrp {
 *                         type string;
 *                     }
 *                     leaf-list filter-coefficient-rsrq {
 *                         type string;
 *                     }
 *                     leaf a1-threshold-rsrp {
 *                         type uint8;
 *                     }
 *                     leaf a1-threshold-rsrq {
 *                         type uint8;
 *                     }
 *                     leaf a2-threshold-rsrp {
 *                         type uint8;
 *                     }
 *                     leaf a2-threshold-rsrq {
 *                         type uint8;
 *                     }
 *                     leaf-list a3-offset {
 *                         type string;
 *                     }
 *                     leaf report-on-leave {
 *                         type boolean;
 *                     }
 *                     leaf a4-threshold-rsrp {
 *                         type uint8;
 *                     }
 *                     leaf a4-threshold-rsrq {
 *                         type uint8;
 *                     }
 *                     leaf a5-threshold1-rsrp {
 *                         type uint8;
 *                     }
 *                     leaf a5-threshold1-rsrq {
 *                         type uint8;
 *                     }
 *                     leaf a5-threshold2-rsrp {
 *                         type uint8;
 *                     }
 *                     leaf a5-threshold2-rsrq {
 *                         type uint8;
 *                     }
 *                     leaf-list hysteresis {
 *                         type string;
 *                     }
 *                     leaf-list time-to-trigger {
 *                         type uint16;
 *                     }
 *                     leaf trigger-quantity {
 *                         type enumeration;
 *                     }
 *                     leaf report-quantity {
 *                         type enumeration;
 *                     }
 *                     leaf max-report-cells {
 *                         type uint8;
 *                     }
 *                     leaf report-interval {
 *                         type report-interval;
 *                     }
 *                     leaf report-amount {
 *                         type uint8;
 *                     }
 *                     uses lte-ran-mobility-conn-mode-eutra-g;
 *                 }
 *                 container lte-ran-mobility-conn-mode-irat {
 *                     leaf-list qoffsett-utra {
 *                         type string;
 *                     }
 *                     leaf-list filter-coefficient-utra {
 *                         type string;
 *                     }
 *                     leaf meas-quantity-utrafdd {
 *                         type enumeration;
 *                     }
 *                     leaf b1-threshold-utrarscp {
 *                         type b1-threshold-utrarscp;
 *                     }
 *                     leaf b1-threshold-utra-ec-n0 {
 *                         type b1-threshold-utra-ec-n0;
 *                     }
 *                     leaf-list qoffset-geran {
 *                         type string;
 *                     }
 *                     leaf-list filter-coefficient-geran {
 *                         type string;
 *                     }
 *                     leaf b1-threshold-geran {
 *                         type b1-threshold-geran;
 *                     }
 *                     leaf-list qoffset-cdma2000 {
 *                         type string;
 *                     }
 *                     leaf meas-quantity-cdma2000 {
 *                         type enumeration;
 *                     }
 *                     leaf b1-threshold-cdma2000 {
 *                         type b1-threshold-cdma2000;
 *                     }
 *                     leaf b2-threshold2-utrarscp {
 *                         type b2-threshold2-utrarscp;
 *                     }
 *                     leaf b2-threshold2-utra-ec-n0 {
 *                         type b2-threshold2-utra-ec-n0;
 *                     }
 *                     leaf b2-threshold2-geran {
 *                         type b2-threshold2-geran;
 *                     }
 *                     leaf b2-threshold2-cdma2000 {
 *                         type b2-threshold2-cdma2000;
 *                     }
 *                     leaf-list hysteresis {
 *                         type string;
 *                     }
 *                     leaf-list time-to-trigger {
 *                         type uint16;
 *                     }
 *                     leaf max-report-cells {
 *                         type uint8;
 *                     }
 *                     leaf report-interval {
 *                         type report-interval;
 *                     }
 *                     leaf report-amount {
 *                         type uint8;
 *                     }
 *                     uses lte-ran-mobility-conn-mode-irat-g;
 *                 }
 *                 uses lte-ran-mobility-conn-mode-g;
 *             }
 *             uses lte-ran-mobility-g;
 *         }
 *         container lte-ran-neighbor-list {
 *             leaf max-lte-cell-entries {
 *                 type uint64;
 *             }
 *             leaf lte-cell-number-of-entries {
 *                 type uint64;
 *             }
 *             list lte-ran-neighbor-list-lte-cell {
 *                 key "plmnid" "cid";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf must-include {
 *                     type boolean;
 *                 }
 *                 leaf plmnid {
 *                     type string;
 *                 }
 *                 leaf cid {
 *                     type uint32;
 *                 }
 *                 leaf eutra-carrier-arfcn {
 *                     type uint16;
 *                 }
 *                 leaf phy-cell-id {
 *                     type uint16;
 *                 }
 *                 leaf q-offset {
 *                     type int64;
 *                 }
 *                 leaf cio {
 *                     type int64;
 *                 }
 *                 leaf rs-tx-power {
 *                     type rs-tx-power;
 *                 }
 *                 leaf blacklisted {
 *                     type boolean;
 *                 }
 *                 uses lte-ran-neighbor-list-lte-cell-g;
 *             }
 *             container lte-ran-neighbor-list-inter-rat-cell {
 *                 leaf max-umts-entries {
 *                     type uint64;
 *                 }
 *                 leaf max-gsm-entries {
 *                     type uint64;
 *                 }
 *                 leaf max-cdma2000-entries {
 *                     type uint64;
 *                 }
 *                 leaf umts-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf gsm-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf cdma2000-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list lte-ran-neighbor-list-inter-rat-cell-umts {
 *                     key "plmnid" "cid";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf must-include {
 *                         type boolean;
 *                     }
 *                     leaf plmnid {
 *                         type string;
 *                     }
 *                     leaf rncid {
 *                         type uint16;
 *                     }
 *                     leaf cid {
 *                         type uint16;
 *                     }
 *                     leaf lac {
 *                         type uint16;
 *                     }
 *                     leaf rac {
 *                         type uint8;
 *                     }
 *                     leaf ura {
 *                         type uint16;
 *                     }
 *                     leaf uarfcnul {
 *                         type uint16;
 *                     }
 *                     leaf uarfcndl {
 *                         type uint16;
 *                     }
 *                     leaf pcpich-scrambling-code {
 *                         type uint16;
 *                     }
 *                     leaf pcpich-tx-power {
 *                         type pcpich-tx-power;
 *                     }
 *                     uses lte-ran-neighbor-list-inter-rat-cell-umts-g;
 *                 }
 *                 list lte-ran-neighbor-list-inter-rat-cell-gsm {
 *                     key "plmnid" "lac" "ci";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf must-include {
 *                         type boolean;
 *                     }
 *                     leaf plmnid {
 *                         type string;
 *                     }
 *                     leaf lac {
 *                         type uint16;
 *                     }
 *                     leaf bsic {
 *                         type uint8;
 *                     }
 *                     leaf ci {
 *                         type uint16;
 *                     }
 *                     leaf band-indicator {
 *                         type enumeration;
 *                     }
 *                     leaf bccharfcn {
 *                         type uint16;
 *                     }
 *                     uses lte-ran-neighbor-list-inter-rat-cell-gsm-g;
 *                 }
 *                 list lte-ran-neighbor-list-inter-rat-cell-cdma2000 {
 *                     key "cid";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf must-include {
 *                         type boolean;
 *                     }
 *                     leaf band-class {
 *                         type uint8;
 *                     }
 *                     leaf arfcn {
 *                         type uint16;
 *                     }
 *                     leaf pn-offset {
 *                         type uint16;
 *                     }
 *                     leaf type {
 *                         type enumeration;
 *                     }
 *                     leaf cid {
 *                         type string;
 *                     }
 *                     uses lte-ran-neighbor-list-inter-rat-cell-cdma2000-g;
 *                 }
 *                 uses lte-ran-neighbor-list-inter-rat-cell-g;
 *             }
 *             uses lte-ran-neighbor-list-g;
 *         }
 *         container lte-ran-neighbor-list-in-use {
 *             leaf max-lte-cell-entries {
 *                 type uint64;
 *             }
 *             leaf lte-cell-number-of-entries {
 *                 type uint64;
 *             }
 *             list lte-ran-neighbor-list-in-use-lte-cell {
 *                 key "plmnid" "cid";
 *                 leaf plmnid {
 *                     type string;
 *                 }
 *                 leaf cid {
 *                     type uint32;
 *                 }
 *                 leaf eutra-carrier-arfcn {
 *                     type uint16;
 *                 }
 *                 leaf phy-cell-id {
 *                     type uint16;
 *                 }
 *                 leaf q-offset {
 *                     type int64;
 *                 }
 *                 leaf cio {
 *                     type int64;
 *                 }
 *                 leaf rs-tx-power {
 *                     type rs-tx-power;
 *                 }
 *                 leaf blacklisted {
 *                     type boolean;
 *                 }
 *                 uses lte-ran-neighbor-list-in-use-lte-cell-g;
 *             }
 *             container lte-ran-neighbor-list-in-use-inter-rat-cell {
 *                 leaf max-umts-entries {
 *                     type uint64;
 *                 }
 *                 leaf max-gsm-entries {
 *                     type uint64;
 *                 }
 *                 leaf max-cdma2000-entries {
 *                     type uint64;
 *                 }
 *                 leaf umts-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf gsm-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf cdma2000-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list lte-ran-neighbor-list-in-use-inter-rat-cell-umts {
 *                     key "plmnid" "cid";
 *                     leaf plmnid {
 *                         type string;
 *                     }
 *                     leaf rncid {
 *                         type uint16;
 *                     }
 *                     leaf cid {
 *                         type uint16;
 *                     }
 *                     leaf lac {
 *                         type uint16;
 *                     }
 *                     leaf rac {
 *                         type uint8;
 *                     }
 *                     leaf ura {
 *                         type uint16;
 *                     }
 *                     leaf uarfcnul {
 *                         type uint16;
 *                     }
 *                     leaf uarfcndl {
 *                         type uint16;
 *                     }
 *                     leaf pcpich-scrambling-code {
 *                         type uint16;
 *                     }
 *                     leaf pcpich-tx-power {
 *                         type pcpich-tx-power;
 *                     }
 *                     uses lte-ran-neighbor-list-in-use-inter-rat-cell-umts-g;
 *                 }
 *                 list lte-ran-neighbor-list-in-use-inter-rat-cell-gsm {
 *                     key "plmnid" "lac" "ci";
 *                     leaf plmnid {
 *                         type string;
 *                     }
 *                     leaf lac {
 *                         type uint16;
 *                     }
 *                     leaf bsic {
 *                         type uint8;
 *                     }
 *                     leaf ci {
 *                         type uint16;
 *                     }
 *                     leaf band-indicator {
 *                         type enumeration;
 *                     }
 *                     leaf bccharfcn {
 *                         type uint16;
 *                     }
 *                     uses lte-ran-neighbor-list-in-use-inter-rat-cell-gsm-g;
 *                 }
 *                 list lte-ran-neighbor-list-in-use-inter-rat-cell-cdma2000 {
 *                     key "cid";
 *                     leaf band-class {
 *                         type uint8;
 *                     }
 *                     leaf arfcn {
 *                         type uint16;
 *                     }
 *                     leaf pn-offset {
 *                         type uint16;
 *                     }
 *                     leaf type {
 *                         type enumeration;
 *                     }
 *                     leaf cid {
 *                         type string;
 *                     }
 *                     uses lte-ran-neighbor-list-in-use-inter-rat-cell-cdma2000-g;
 *                 }
 *                 uses lte-ran-neighbor-list-in-use-inter-rat-cell-g;
 *             }
 *             uses lte-ran-neighbor-list-in-use-g;
 *         }
 *         uses lte-ran-g;
 *     }
 *     uses lte-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte</i>
 *
 * <p>To create instances of this class use {@link LteBuilder}.
 * @see LteBuilder
 *
 */
public interface Lte
    extends
    ChildOf<CellConfig>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.Lte>,
    LteG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte").intern();

    /**
     * List of object class FAPService.{i}.CellConfig.LTE.Tunnel.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lteTunnel</code>, or <code>null</code> if not present
     */
    List<LteTunnel> getLteTunnel();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.EPC.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc</code> <code>lteEpc</code>, or <code>null</code> if not present
     */
    LteEpc getLteEpc();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan</code> <code>lteRan</code>, or <code>null</code> if not present
     */
    LteRan getLteRan();

}

