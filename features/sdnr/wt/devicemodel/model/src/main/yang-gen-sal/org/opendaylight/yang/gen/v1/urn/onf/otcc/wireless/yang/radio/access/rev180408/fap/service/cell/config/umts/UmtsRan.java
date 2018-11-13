package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCsg;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.Umts;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran {
 *     leaf-list ura-list {
 *         type uint16;
 *     }
 *     leaf ura-in-use {
 *         type uint16;
 *     }
 *     leaf rncid {
 *         type uint16;
 *     }
 *     leaf cell-id {
 *         type uint32;
 *     }
 *     leaf t-rat-c {
 *         type t-rat-c;
 *     }
 *     leaf t-raf-c {
 *         type t-raf-c;
 *     }
 *     leaf n-raf-c {
 *         type uint64;
 *     }
 *     leaf tig-or {
 *         type tig-or;
 *     }
 *     leaf tin-tr {
 *         type tin-tr;
 *     }
 *     leaf t-data-fwd {
 *         type t-data-fwd;
 *     }
 *     leaf t-reloc-prep {
 *         type t-reloc-prep;
 *     }
 *     leaf t-reloc-overall {
 *         type t-reloc-overall;
 *     }
 *     leaf hnbid-realm {
 *         type string;
 *     }
 *     leaf hs-flag {
 *         type boolean;
 *     }
 *     leaf hs-enable {
 *         type boolean;
 *     }
 *     leaf num-of-hspdsc-hs {
 *         type uint8;
 *     }
 *     leaf num-of-hsscc-hs {
 *         type uint64;
 *     }
 *     container umts-ran-csg {
 *         leaf csg-indicator {
 *             type boolean;
 *         }
 *         leaf-list uarfcndl-list {
 *             type uint16;
 *         }
 *         container umts-ran-csg-csgpsc-split-info {
 *             leaf start-psc-range1-coefficient {
 *                 type uint8;
 *             }
 *             leaf number-of-ps-cs {
 *                 type enumeration;
 *             }
 *             leaf psc-range2-offset {
 *                 type uint8;
 *             }
 *             uses umts-ran-csg-csgpsc-split-info-g;
 *         }
 *         uses umts-ran-csg-g;
 *     }
 *     container umts-ran-cell-selection {
 *         leaf quality-measure-cpich {
 *             type enumeration;
 *         }
 *         leaf qqual-min {
 *             type qqual-min;
 *         }
 *         leaf qqual-min-offset {
 *             type qqual-min-offset;
 *         }
 *         leaf q-rx-lev-min {
 *             type q-rx-lev-min;
 *         }
 *         leaf delta-q-rx-lev-min {
 *             type delta-q-rx-lev-min;
 *         }
 *         leaf q-rx-lev-min-offset {
 *             type q-rx-lev-min-offset;
 *         }
 *         leaf q-hyst1s {
 *             type uint8;
 *         }
 *         leaf q-hyst2s {
 *             type uint8;
 *         }
 *         leaf t-reselections {
 *             type t-reselections;
 *         }
 *         leaf s-intrasearch {
 *             type int64;
 *         }
 *         leaf s-intersearch {
 *             type int64;
 *         }
 *         leaf s-search-hcs {
 *             type int64;
 *         }
 *         leaf s-search-rat {
 *             type int64;
 *         }
 *         leaf shcsrat {
 *             type int64;
 *         }
 *         leaf s-limit-search-rat {
 *             type int64;
 *         }
 *         leaf non-hcstcr-max {
 *             type enumeration;
 *         }
 *         leaf non-hcsncr {
 *             type uint8;
 *         }
 *         leaf non-hcstcr-max-hyst {
 *             type enumeration;
 *         }
 *         leaf qhcs {
 *             type qhcs;
 *         }
 *         leaf use-of-hcs {
 *             type boolean;
 *         }
 *         leaf hcs-prio {
 *             type hcs-prio;
 *         }
 *         leaf tcr-max {
 *             type enumeration;
 *         }
 *         leaf ncr {
 *             type uint8;
 *         }
 *         leaf tcr-max-hyst {
 *             type enumeration;
 *         }
 *         leaf ue-tx-pwr-max-rach {
 *             type ue-tx-pwr-max-rach;
 *         }
 *         uses umts-ran-cell-selection-g;
 *     }
 *     container umts-ran-rrc-timers {
 *         leaf t300 {
 *             type t300;
 *         }
 *         leaf t301 {
 *             type t301;
 *         }
 *         leaf t302 {
 *             type t302;
 *         }
 *         leaf t304 {
 *             type t304;
 *         }
 *         leaf t305 {
 *             type t305;
 *         }
 *         leaf t307 {
 *             type t307;
 *         }
 *         leaf t308 {
 *             type t308;
 *         }
 *         leaf t309 {
 *             type t309;
 *         }
 *         leaf t310 {
 *             type t310;
 *         }
 *         leaf t311 {
 *             type t311;
 *         }
 *         leaf t312 {
 *             type t312;
 *         }
 *         leaf t313 {
 *             type t313;
 *         }
 *         leaf t314 {
 *             type t314;
 *         }
 *         leaf t315 {
 *             type t315;
 *         }
 *         leaf t316 {
 *             type t316;
 *         }
 *         leaf t317 {
 *             type t317;
 *         }
 *         leaf n300 {
 *             type n300;
 *         }
 *         leaf n301 {
 *             type n301;
 *         }
 *         leaf n302 {
 *             type n302;
 *         }
 *         leaf n304 {
 *             type n304;
 *         }
 *         leaf n310 {
 *             type n310;
 *         }
 *         leaf n312 {
 *             type n312;
 *         }
 *         leaf n313 {
 *             type n313;
 *         }
 *         leaf n315 {
 *             type n315;
 *         }
 *         leaf wait-time {
 *             type wait-time;
 *         }
 *         uses umts-ran-rrc-timers-g;
 *     }
 *     container umts-ran-drx {
 *         leaf drx-cycle-length-coefficient-cs {
 *             type uint8;
 *         }
 *         leaf drx-cycle-length-coefficient-ps {
 *             type uint8;
 *         }
 *         leaf utrandrx-cycle-length-coefficient {
 *             type uint8;
 *         }
 *         uses umts-ran-drx-g;
 *     }
 *     container umts-ran-power-control {
 *         leaf constant-value {
 *             type constant-value;
 *         }
 *         leaf power-ramp-step-up {
 *             type power-ramp-step-up;
 *         }
 *         leaf preamble-retrans-max {
 *             type uint8;
 *         }
 *         leaf persistence-scale-factor {
 *             type uint8;
 *         }
 *         leaf m-max {
 *             type uint8;
 *         }
 *         leaf nb01-min {
 *             type uint8;
 *         }
 *         leaf nb01-max {
 *             type uint8;
 *         }
 *         uses umts-ran-power-control-g;
 *     }
 *     container umts-ran-cell-restriction {
 *         leaf cell-barred {
 *             type boolean;
 *         }
 *         leaf intra-freq-cell-reselection-indicator {
 *             type boolean;
 *         }
 *         leaf t-barred {
 *             type t-barred;
 *         }
 *         leaf-list access-class-barred-list-cs {
 *             type uint8;
 *         }
 *         leaf-list access-class-barred-list-ps {
 *             type uint8;
 *         }
 *         leaf cell-reserved-for-operator-use {
 *             type boolean;
 *         }
 *         uses umts-ran-cell-restriction-g;
 *     }
 *     container umts-ran-intra-freq-meas {
 *         leaf measurement-quantity {
 *             type enumeration;
 *         }
 *         leaf filter-coefficient {
 *             type uint8;
 *         }
 *         leaf-list intra-frequency-event-identity {
 *             type string;
 *         }
 *         leaf-list triggering-condition2-event1a {
 *             type enumeration;
 *         }
 *         leaf-list triggering-condition1-event1b {
 *             type enumeration;
 *         }
 *         leaf-list triggering-condition2-event1e {
 *             type enumeration;
 *         }
 *         leaf-list triggering-condition1-event1f {
 *             type enumeration;
 *         }
 *         leaf reporting-range-event1a {
 *             type reporting-range-event1a;
 *         }
 *         leaf reporting-range-event1b {
 *             type reporting-range-event1b;
 *         }
 *         leaf weighting-factor-event1a {
 *             type uint8;
 *         }
 *         leaf weighting-factor-event1b {
 *             type uint8;
 *         }
 *         leaf report-deactivation-threshold-event1a {
 *             type uint8;
 *         }
 *         leaf reporting-amount-event1a {
 *             type int64;
 *         }
 *         leaf reporting-amount-event1c {
 *             type int64;
 *         }
 *         leaf reporting-interval-event1a {
 *             type reporting-interval-event1a;
 *         }
 *         leaf reporting-interval-event1c {
 *             type reporting-interval-event1c;
 *         }
 *         leaf hysteresis-event1a {
 *             type uint8;
 *         }
 *         leaf hysteresis-event1b {
 *             type uint8;
 *         }
 *         leaf hysteresis-event1c {
 *             type uint8;
 *         }
 *         leaf hysteresis-event1d {
 *             type uint8;
 *         }
 *         leaf hysteresis-event1e {
 *             type uint8;
 *         }
 *         leaf hysteresis-event1f {
 *             type uint8;
 *         }
 *         leaf time-to-trigger-event1a {
 *             type time-to-trigger-event1a;
 *         }
 *         leaf time-to-trigger-event1b {
 *             type time-to-trigger-event1b;
 *         }
 *         leaf time-to-trigger-event1c {
 *             type time-to-trigger-event1c;
 *         }
 *         leaf time-to-trigger-event1d {
 *             type time-to-trigger-event1d;
 *         }
 *         leaf time-to-trigger-event1e {
 *             type time-to-trigger-event1e;
 *         }
 *         leaf time-to-trigger-event1f {
 *             type time-to-trigger-event1f;
 *         }
 *         leaf threshold-used-frequency-event1e {
 *             type int64;
 *         }
 *         leaf threshold-used-frequency-event1f {
 *             type int64;
 *         }
 *         leaf replacement-activation-threshold-event1c {
 *             type uint8;
 *         }
 *         leaf instance-number-of-entries {
 *             type uint64;
 *         }
 *         list umts-ran-intra-freq-meas-instance {
 *             key "intra-frequency-event-identity";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf intra-frequency-event-identity {
 *                 type enumeration;
 *             }
 *             leaf event-description {
 *                 type string;
 *             }
 *             leaf measurement-quantity {
 *                 type enumeration;
 *             }
 *             leaf filter-coefficient {
 *                 type uint8;
 *             }
 *             leaf-list triggering-condition {
 *                 type enumeration;
 *             }
 *             leaf reporting-range {
 *                 type reporting-range;
 *             }
 *             leaf weighting-factor {
 *                 type uint8;
 *             }
 *             leaf report-deactivation-threshold {
 *                 type uint8;
 *             }
 *             leaf reporting-amount {
 *                 type int64;
 *             }
 *             leaf reporting-interval {
 *                 type reporting-interval;
 *             }
 *             leaf hysteresis {
 *                 type uint8;
 *             }
 *             leaf time-to-trigger {
 *                 type time-to-trigger;
 *             }
 *             leaf threshold-used-frequency {
 *                 type int64;
 *             }
 *             leaf replacement-activation-threshold {
 *                 type uint8;
 *             }
 *             uses umts-ran-intra-freq-meas-instance-g;
 *         }
 *         uses umts-ran-intra-freq-meas-g;
 *     }
 *     container umts-ran-inter-freq-meas {
 *         leaf measurement-quantity {
 *             type enumeration;
 *         }
 *         leaf filter-coefficient {
 *             type uint8;
 *         }
 *         leaf-list inter-frequency-event-identity {
 *             type string;
 *         }
 *         leaf weighting-factor-event2a {
 *             type uint8;
 *         }
 *         leaf weighting-factor-event2b {
 *             type uint8;
 *         }
 *         leaf weighting-factor-event2d {
 *             type uint8;
 *         }
 *         leaf weighting-factor-event2f {
 *             type uint8;
 *         }
 *         leaf hysteresis-event2a {
 *             type uint8;
 *         }
 *         leaf hysteresis-event2b {
 *             type uint8;
 *         }
 *         leaf hysteresis-event2d {
 *             type uint8;
 *         }
 *         leaf hysteresis-event2f {
 *             type uint8;
 *         }
 *         leaf time-to-trigger-event2a {
 *             type time-to-trigger-event2a;
 *         }
 *         leaf time-to-trigger-event2b {
 *             type time-to-trigger-event2b;
 *         }
 *         leaf time-to-trigger-event2d {
 *             type time-to-trigger-event2d;
 *         }
 *         leaf time-to-trigger-event2f {
 *             type time-to-trigger-event2f;
 *         }
 *         leaf threshold-used-frequency-event2b {
 *             type int64;
 *         }
 *         leaf threshold-used-frequency-event2d {
 *             type int64;
 *         }
 *         leaf threshold-used-frequency-event2f {
 *             type int64;
 *         }
 *         leaf instance-number-of-entries {
 *             type uint64;
 *         }
 *         list umts-ran-inter-freq-meas-instance {
 *             key "intra-frequency-event-identity";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf intra-frequency-event-identity {
 *                 type enumeration;
 *             }
 *             leaf event-description {
 *                 type string;
 *             }
 *             leaf measurement-quantity {
 *                 type enumeration;
 *             }
 *             leaf filter-coefficient {
 *                 type uint8;
 *             }
 *             leaf weighting-factor {
 *                 type uint8;
 *             }
 *             leaf hysteresis {
 *                 type uint8;
 *             }
 *             leaf time-to-trigger {
 *                 type time-to-trigger;
 *             }
 *             leaf threshold-used-frequency {
 *                 type int64;
 *             }
 *             leaf threshold-non-used-frequency {
 *                 type int64;
 *             }
 *             uses umts-ran-inter-freq-meas-instance-g;
 *         }
 *         uses umts-ran-inter-freq-meas-g;
 *     }
 *     container umts-ran-inter-rat-meas {
 *         leaf gsm-filter-coefficient {
 *             type uint8;
 *         }
 *         leaf bsic-verification-required {
 *             type boolean;
 *         }
 *         leaf weighting-factor {
 *             type uint8;
 *         }
 *         leaf hysteresis {
 *             type uint8;
 *         }
 *         leaf time-to-trigger {
 *             type time-to-trigger;
 *         }
 *         leaf threshold-own-system {
 *             type int64;
 *         }
 *         leaf threshold-other-system {
 *             type int64;
 *         }
 *         leaf instance-number-of-entries {
 *             type uint64;
 *         }
 *         list umts-ran-inter-rat-meas-instance {
 *             key "inter-rat-event-identity";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf inter-rat-event-identity {
 *                 type enumeration;
 *             }
 *             leaf event-description {
 *                 type string;
 *             }
 *             leaf filter-coefficient {
 *                 type uint8;
 *             }
 *             leaf bsic-verification-required {
 *                 type boolean;
 *             }
 *             leaf weighting-factor {
 *                 type uint8;
 *             }
 *             leaf hysteresis {
 *                 type uint8;
 *             }
 *             leaf time-to-trigger {
 *                 type time-to-trigger;
 *             }
 *             leaf threshold-own-system {
 *                 type int64;
 *             }
 *             leaf threshold-other-system {
 *                 type int64;
 *             }
 *             uses umts-ran-inter-rat-meas-instance-g;
 *         }
 *         uses umts-ran-inter-rat-meas-g;
 *     }
 *     container umts-ran-ue-internal-meas {
 *         leaf filter-coefficient {
 *             type uint8;
 *         }
 *         leaf ue-tx-pwr-threshold-event6a {
 *             type ue-tx-pwr-threshold-event6a;
 *         }
 *         leaf time-to-trigger-event6a {
 *             type time-to-trigger-event6a;
 *         }
 *         leaf ue-tx-pwr-threshold-event6b {
 *             type ue-tx-pwr-threshold-event6b;
 *         }
 *         leaf time-to-trigger-event6b {
 *             type time-to-trigger-event6b;
 *         }
 *         uses umts-ran-ue-internal-meas-g;
 *     }
 *     container umts-ran-rf {
 *         leaf-list uarfcndl {
 *             type string;
 *         }
 *         leaf uarfcndl-in-use {
 *             type uint64;
 *         }
 *         leaf uarfcnul-in-use {
 *             type uint64;
 *         }
 *         leaf-list uarfcndl-to-protect {
 *             type string;
 *         }
 *         leaf-list primary-scrambling-code {
 *             type string;
 *         }
 *         leaf primary-scrambling-code-in-use {
 *             type uint64;
 *         }
 *         leaf maxfap-tx-power-expanded {
 *             type string;
 *         }
 *         leaf maxfap-tx-power-in-use-expanded {
 *             type maxfap-tx-power-in-use-expanded;
 *         }
 *         leaf max-ul-tx-power {
 *             type string;
 *         }
 *         leaf max-ul-tx-power-in-use {
 *             type max-ul-tx-power-in-use;
 *         }
 *         leaf pcpich-power {
 *             type string;
 *         }
 *         leaf pcpich-power-in-use {
 *             type pcpich-power-in-use;
 *         }
 *         leaf power-offset-pilot-dpdch {
 *             type power-offset-pilot-dpdch;
 *         }
 *         leaf fap-coverage-target {
 *             type fap-coverage-target;
 *         }
 *         leaf fap-quality-target-ec-io {
 *             type fap-quality-target-ec-io;
 *         }
 *         leaf psch-power {
 *             type psch-power;
 *         }
 *         leaf ssch-power {
 *             type ssch-power;
 *         }
 *         leaf pich-power {
 *             type pich-power;
 *         }
 *         leaf pch-power {
 *             type pch-power;
 *         }
 *         leaf fach-power {
 *             type fach-power;
 *         }
 *         leaf bch-power {
 *             type bch-power;
 *         }
 *         leaf aich-power {
 *             type aich-power;
 *         }
 *         leaf ctch-allocation-period {
 *             type uint8;
 *         }
 *         leaf cbs-frame-offset {
 *             type uint8;
 *         }
 *         leaf max-tti {
 *             type uint8;
 *         }
 *         leaf noise-rise-limit-lower-value {
 *             type uint16;
 *         }
 *         leaf noise-rise-limit-upper-value {
 *             type uint16;
 *         }
 *         leaf noise-rise-limit-in-use {
 *             type uint16;
 *         }
 *         uses umts-ran-rf-g;
 *     }
 *     container umts-ran-neighbor-list {
 *         leaf max-intra-freq-cell-entries {
 *             type uint64;
 *         }
 *         leaf max-inter-freq-cell-entries {
 *             type uint64;
 *         }
 *         leaf intra-freq-cell-number-of-entries {
 *             type uint64;
 *         }
 *         leaf inter-freq-cell-number-of-entries {
 *             type uint64;
 *         }
 *         list umts-ran-neighbor-list-intra-freq-cell {
 *             key "pcpich-scrambling-code";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf must-include {
 *                 type boolean;
 *             }
 *             leaf plmnid {
 *                 type string;
 *             }
 *             leaf rncid {
 *                 type uint16;
 *             }
 *             leaf cid {
 *                 type uint16;
 *             }
 *             leaf lac {
 *                 type uint16;
 *             }
 *             leaf rac {
 *                 type uint8;
 *             }
 *             leaf ura {
 *                 type uint16;
 *             }
 *             leaf pcpich-scrambling-code {
 *                 type uint16;
 *             }
 *             leaf pcpich-tx-power {
 *                 type pcpich-tx-power;
 *             }
 *             leaf collocated-inter-freq-cell {
 *                 type uint32;
 *             }
 *             leaf max-tx-power {
 *                 type max-tx-power;
 *             }
 *             leaf max-dpc-htx-power {
 *                 type max-dpc-htx-power;
 *             }
 *             uses umts-ran-neighbor-list-intra-freq-cell-g;
 *         }
 *         list umts-ran-neighbor-list-inter-freq-cell {
 *             key "pcpich-scrambling-code" "uarfcndl";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf must-include {
 *                 type boolean;
 *             }
 *             leaf plmnid {
 *                 type string;
 *             }
 *             leaf rncid {
 *                 type uint16;
 *             }
 *             leaf cid {
 *                 type uint16;
 *             }
 *             leaf lac {
 *                 type uint16;
 *             }
 *             leaf rac {
 *                 type uint8;
 *             }
 *             leaf ura {
 *                 type uint16;
 *             }
 *             leaf uarfcnul {
 *                 type uint16;
 *             }
 *             leaf uarfcndl {
 *                 type uint16;
 *             }
 *             leaf pcpich-scrambling-code {
 *                 type uint16;
 *             }
 *             leaf pcpich-tx-power {
 *                 type pcpich-tx-power;
 *             }
 *             uses umts-ran-neighbor-list-inter-freq-cell-g;
 *         }
 *         container umts-ran-neighbor-list-inter-rat-cell {
 *             leaf max-gsm-entries {
 *                 type uint64;
 *             }
 *             leaf gsm-number-of-entries {
 *                 type uint64;
 *             }
 *             list umts-ran-neighbor-list-inter-rat-cell-gsm {
 *                 key "bccharfcn";
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
 *                 leaf lac {
 *                     type uint16;
 *                 }
 *                 leaf bsic {
 *                     type uint8;
 *                 }
 *                 leaf ci {
 *                     type uint16;
 *                 }
 *                 leaf band-indicator {
 *                     type enumeration;
 *                 }
 *                 leaf bccharfcn {
 *                     type uint16;
 *                 }
 *                 uses umts-ran-neighbor-list-inter-rat-cell-gsm-g;
 *             }
 *             uses umts-ran-neighbor-list-inter-rat-cell-g;
 *         }
 *         uses umts-ran-neighbor-list-g;
 *     }
 *     container umts-ran-neighbor-list-in-use {
 *         leaf max-intra-freq-cell-entries {
 *             type uint64;
 *         }
 *         leaf max-inter-freq-cell-entries {
 *             type uint64;
 *         }
 *         leaf intra-freq-cell-number-of-entries {
 *             type uint64;
 *         }
 *         leaf inter-freq-cell-number-of-entries {
 *             type uint64;
 *         }
 *         list umts-ran-neighbor-list-in-use-intra-freq-cell {
 *             key "pcpich-scrambling-code";
 *             leaf plmnid {
 *                 type string;
 *             }
 *             leaf rncid {
 *                 type uint16;
 *             }
 *             leaf cid {
 *                 type uint16;
 *             }
 *             leaf lac {
 *                 type uint16;
 *             }
 *             leaf rac {
 *                 type uint8;
 *             }
 *             leaf ura {
 *                 type uint16;
 *             }
 *             leaf pcpich-scrambling-code {
 *                 type uint16;
 *             }
 *             uses umts-ran-neighbor-list-in-use-intra-freq-cell-g;
 *         }
 *         list umts-ran-neighbor-list-in-use-inter-freq-cell {
 *             key "pcpich-scrambling-code" "uarfcndl";
 *             leaf plmnid {
 *                 type string;
 *             }
 *             leaf rncid {
 *                 type uint16;
 *             }
 *             leaf cid {
 *                 type uint16;
 *             }
 *             leaf lac {
 *                 type uint16;
 *             }
 *             leaf rac {
 *                 type uint8;
 *             }
 *             leaf ura {
 *                 type uint16;
 *             }
 *             leaf uarfcnul {
 *                 type uint16;
 *             }
 *             leaf uarfcndl {
 *                 type uint16;
 *             }
 *             leaf pcpich-scrambling-code {
 *                 type uint16;
 *             }
 *             uses umts-ran-neighbor-list-in-use-inter-freq-cell-g;
 *         }
 *         container umts-ran-neighbor-list-in-use-inter-rat-cell {
 *             leaf max-gsm-entries {
 *                 type uint64;
 *             }
 *             leaf gsm-number-of-entries {
 *                 type uint64;
 *             }
 *             list umts-ran-neighbor-list-in-use-inter-rat-cell-gsm {
 *                 key "bccharfcn";
 *                 leaf plmnid {
 *                     type string;
 *                 }
 *                 leaf lac {
 *                     type uint16;
 *                 }
 *                 leaf bsic {
 *                     type uint8;
 *                 }
 *                 leaf ci {
 *                     type uint16;
 *                 }
 *                 leaf band-indicator {
 *                     type enumeration;
 *                 }
 *                 leaf bccharfcn {
 *                     type uint16;
 *                 }
 *                 uses umts-ran-neighbor-list-in-use-inter-rat-cell-gsm-g;
 *             }
 *             uses umts-ran-neighbor-list-in-use-inter-rat-cell-g;
 *         }
 *         uses umts-ran-neighbor-list-in-use-g;
 *     }
 *     uses umts-ran-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran</i>
 *
 * <p>To create instances of this class use {@link UmtsRanBuilder}.
 * @see UmtsRanBuilder
 *
 */
public interface UmtsRan
    extends
    ChildOf<Umts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>,
    UmtsRanG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran").intern();

    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.CSG.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCsg</code> <code>umtsRanCsg</code>, or <code>null</code> if not present
     */
    UmtsRanCsg getUmtsRanCsg();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.CellSelection.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection</code> <code>umtsRanCellSelection</code>, or <code>null</code> if not present
     */
    UmtsRanCellSelection getUmtsRanCellSelection();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.RRCTimers.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers</code> <code>umtsRanRrcTimers</code>, or <code>null</code> if not present
     */
    UmtsRanRrcTimers getUmtsRanRrcTimers();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.DRX.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx</code> <code>umtsRanDrx</code>, or <code>null</code> if not present
     */
    UmtsRanDrx getUmtsRanDrx();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.PowerControl.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl</code> <code>umtsRanPowerControl</code>, or <code>null</code> if not present
     */
    UmtsRanPowerControl getUmtsRanPowerControl();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.CellRestriction.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction</code> <code>umtsRanCellRestriction</code>, or <code>null</code> if not present
     */
    UmtsRanCellRestriction getUmtsRanCellRestriction();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.IntraFreqMeas.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas</code> <code>umtsRanIntraFreqMeas</code>, or <code>null</code> if not present
     */
    UmtsRanIntraFreqMeas getUmtsRanIntraFreqMeas();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.InterFreqMeas.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas</code> <code>umtsRanInterFreqMeas</code>, or <code>null</code> if not present
     */
    UmtsRanInterFreqMeas getUmtsRanInterFreqMeas();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.InterRATMeas.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas</code> <code>umtsRanInterRatMeas</code>, or <code>null</code> if not present
     */
    UmtsRanInterRatMeas getUmtsRanInterRatMeas();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.UEInternalMeas.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas</code> <code>umtsRanUeInternalMeas</code>, or <code>null</code> if not present
     */
    UmtsRanUeInternalMeas getUmtsRanUeInternalMeas();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.RF.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf</code> <code>umtsRanRf</code>, or <code>null</code> if not present
     */
    UmtsRanRf getUmtsRanRf();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.NeighborList.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList</code> <code>umtsRanNeighborList</code>, or <code>null</code> if not present
     */
    UmtsRanNeighborList getUmtsRanNeighborList();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse</code> <code>umtsRanNeighborListInUse</code>, or <code>null</code> if not present
     */
    UmtsRanNeighborListInUse getUmtsRanNeighborListInUse();

}

