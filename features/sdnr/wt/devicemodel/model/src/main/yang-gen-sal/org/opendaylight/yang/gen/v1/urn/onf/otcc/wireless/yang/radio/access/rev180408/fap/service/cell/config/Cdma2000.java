package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000G;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.CellConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000 {
 *     leaf tunnel-instance {
 *         type string;
 *     }
 *     container cdma2000-one-x {
 *         leaf pcfpdsn-number-of-entries {
 *             type uint64;
 *         }
 *         leaf max-batch-pcfpdsn-entries {
 *             type uint64;
 *         }
 *         leaf batch-pcfpdsn-number-of-entries {
 *             type uint64;
 *         }
 *         container cdma2000-one-x-ran {
 *             leaf one-x-sector-nid {
 *                 type int64;
 *             }
 *             leaf one-x-sector-sid {
 *                 type int64;
 *             }
 *             leaf one-xpzid {
 *                 type int64;
 *             }
 *             leaf base-id {
 *                 type int64;
 *             }
 *             leaf max-neighbor-list-entries {
 *                 type uint64;
 *             }
 *             leaf neighbor-list-number-of-entries {
 *                 type uint64;
 *             }
 *             container cdma2000-one-x-ran-rf {
 *                 leaf-list rfcnfl {
 *                     type string;
 *                 }
 *                 leaf rfcnfl-band-in-use {
 *                     type string;
 *                 }
 *                 leaf rfcnfl-in-use {
 *                     type uint64;
 *                 }
 *                 leaf-list pilot-pn {
 *                     type string;
 *                 }
 *                 leaf pilot-pn-in-use {
 *                     type pilot-pn-in-use;
 *                 }
 *                 leaf maxfap-tx-power {
 *                     type string;
 *                 }
 *                 leaf maxfap-tx-power-in-use {
 *                     type maxfap-tx-power-in-use;
 *                 }
 *                 leaf pch-pwr-percentage {
 *                     type pch-pwr-percentage;
 *                 }
 *                 leaf pilot-pwr-percentage {
 *                     type pilot-pwr-percentage;
 *                 }
 *                 leaf sync-pwr-percentage {
 *                     type sync-pwr-percentage;
 *                 }
 *                 uses cdma2000-one-x-ran-rf-g;
 *             }
 *             container cdma2000-one-x-ran-network-listen-mode-config {
 *                 leaf rfcnfl-margin {
 *                     type uint64;
 *                 }
 *                 leaf fap-coverage-target {
 *                     type string;
 *                 }
 *                 leaf fap-beacon-coverage-target {
 *                     type string;
 *                 }
 *                 leaf max-coverage-edge-pilot-strength {
 *                     type max-coverage-edge-pilot-strength;
 *                 }
 *                 leaf max-allowable-pilot-strength-degradation {
 *                     type max-allowable-pilot-strength-degradation;
 *                 }
 *                 leaf-list rfcnfl-to-protect {
 *                     type string;
 *                 }
 *                 leaf fap-allowed-adj-chan-coverage-hole {
 *                     type fap-allowed-adj-chan-coverage-hole;
 *                 }
 *                 leaf acir {
 *                     type acir;
 *                 }
 *                 uses cdma2000-one-x-ran-network-listen-mode-config-g;
 *             }
 *             container cdma2000-one-x-ran-access-parameters {
 *                 leaf nom-pwr {
 *                     type int64;
 *                 }
 *                 leaf init-pwr {
 *                     type int64;
 *                 }
 *                 leaf pwr-step-indb {
 *                     type uint8;
 *                 }
 *                 leaf nom-pwr-ext {
 *                     type nom-pwr-ext;
 *                 }
 *                 leaf apm-auth {
 *                     type uint8;
 *                 }
 *                 leaf apm-rand-update-prd {
 *                     type apm-rand-update-prd;
 *                 }
 *                 leaf initialpwr {
 *                     type initialpwr;
 *                 }
 *                 leaf pwr-step {
 *                     type pwr-step;
 *                 }
 *                 leaf num-step {
 *                     type uint8;
 *                 }
 *                 leaf max-cap-size {
 *                     type uint8;
 *                 }
 *                 leaf preamble-size {
 *                     type uint8;
 *                 }
 *                 leaf psist09 {
 *                     type uint8;
 *                 }
 *                 leaf psist10 {
 *                     type uint8;
 *                 }
 *                 leaf psist11 {
 *                     type uint8;
 *                 }
 *                 leaf psist12 {
 *                     type uint8;
 *                 }
 *                 leaf psist13 {
 *                     type uint8;
 *                 }
 *                 leaf psist14 {
 *                     type uint8;
 *                 }
 *                 leaf psist15 {
 *                     type uint8;
 *                 }
 *                 leaf msg-psist {
 *                     type uint8;
 *                 }
 *                 leaf reg-psist {
 *                     type uint8;
 *                 }
 *                 leaf probe-pn-ran {
 *                     type uint8;
 *                 }
 *                 leaf acc-tmo {
 *                     type acc-tmo;
 *                 }
 *                 leaf probe-bkoff {
 *                     type probe-bkoff;
 *                 }
 *                 leaf bkoff {
 *                     type bkoff;
 *                 }
 *                 leaf max-req-seq {
 *                     type uint8;
 *                 }
 *                 leaf max-rsp-seq {
 *                     type uint8;
 *                 }
 *                 uses cdma2000-one-x-ran-access-parameters-g;
 *             }
 *             container cdma2000-one-x-ran-system-parameters {
 *                 leaf reg-zone {
 *                     type uint16;
 *                 }
 *                 leaf total-zones {
 *                     type uint8;
 *                 }
 *                 leaf zone-timer {
 *                     type uint8;
 *                 }
 *                 leaf reg-period {
 *                     type uint8;
 *                 }
 *                 leaf srch-win-a {
 *                     type uint8;
 *                 }
 *                 leaf srch-win-n {
 *                     type uint8;
 *                 }
 *                 leaf srch-win-r {
 *                     type uint8;
 *                 }
 *                 leaf nghbr-max-age {
 *                     type uint8;
 *                 }
 *                 leaf pwr-rep-thresh {
 *                     type uint8;
 *                 }
 *                 leaf pwr-rep-frames {
 *                     type uint8;
 *                 }
 *                 leaf pwr-thresh-enable {
 *                     type uint8;
 *                 }
 *                 leaf pwr-period-enable {
 *                     type uint8;
 *                 }
 *                 leaf pwr-rep-delay {
 *                     type uint8;
 *                 }
 *                 leaf rescan {
 *                     type uint8;
 *                 }
 *                 leaf tadd {
 *                     type tadd;
 *                 }
 *                 leaf tdrop {
 *                     type tdrop;
 *                 }
 *                 leaf tcomp {
 *                     type tcomp;
 *                 }
 *                 leaf t-tdrop {
 *                     type uint8;
 *                 }
 *                 leaf in-traffic-tadd {
 *                     type in-traffic-tadd;
 *                 }
 *                 leaf in-traffic-tdrop {
 *                     type in-traffic-tdrop;
 *                 }
 *                 leaf in-traffic-tcomp {
 *                     type in-traffic-tcomp;
 *                 }
 *                 leaf in-traffic-ttdrop {
 *                     type uint8;
 *                 }
 *                 uses cdma2000-one-x-ran-system-parameters-g;
 *             }
 *             container cdma2000-one-x-ran-extended-system-parameters {
 *                 leaf prev {
 *                     type uint8;
 *                 }
 *                 leaf p-min-rev {
 *                     type uint8;
 *                 }
 *                 leaf delete-for-tmsi {
 *                     type uint8;
 *                 }
 *                 leaf use-tmsi {
 *                     type uint8;
 *                 }
 *                 leaf pref-msid-type {
 *                     type uint8;
 *                 }
 *                 leaf mcc {
 *                     type uint16;
 *                 }
 *                 leaf imsi1112 {
 *                     type uint8;
 *                 }
 *                 leaf tmsi-zone-len {
 *                     type uint8;
 *                 }
 *                 leaf tmsi-zone {
 *                     type uint16;
 *                 }
 *                 leaf bcast-index {
 *                     type uint8;
 *                 }
 *                 leaf imsit-supported {
 *                     type int64;
 *                 }
 *                 leaf soft-slope {
 *                     type uint8;
 *                 }
 *                 leaf add-intercept {
 *                     type add-intercept;
 *                 }
 *                 leaf drop-intercept {
 *                     type drop-intercept;
 *                 }
 *                 leaf max-num-alt-so {
 *                     type uint8;
 *                 }
 *                 leaf reselected-included {
 *                     type uint8;
 *                 }
 *                 leaf ec-thresh {
 *                     type ec-thresh;
 *                 }
 *                 leaf ec-io-thresh {
 *                     type uint64;
 *                 }
 *                 leaf pilot-report {
 *                     type uint8;
 *                 }
 *                 leaf nghbr-set-entry-info {
 *                     type uint8;
 *                 }
 *                 leaf access-ho-order {
 *                     type uint8;
 *                 }
 *                 leaf nghbr-set-access-info {
 *                     type uint8;
 *                 }
 *                 leaf access-ho {
 *                     type uint8;
 *                 }
 *                 leaf access-ho-msg-rsp {
 *                     type uint8;
 *                 }
 *                 leaf access-probe-ho {
 *                     type uint8;
 *                 }
 *                 leaf acc-ho-list-upd {
 *                     type uint8;
 *                 }
 *                 leaf acc-probe-ho-other-msg {
 *                     type uint8;
 *                 }
 *                 leaf max-num-probe-ho {
 *                     type uint8;
 *                 }
 *                 leaf brdcast-gps-assit {
 *                     type uint8;
 *                 }
 *                 leaf qpch-supported {
 *                     type uint8;
 *                 }
 *                 leaf num-qpch {
 *                     type uint8;
 *                 }
 *                 leaf qpch-rate {
 *                     type uint8;
 *                 }
 *                 leaf qpch-pwr-level-page {
 *                     type uint8;
 *                 }
 *                 leaf qpc-hcci-supported {
 *                     type uint8;
 *                 }
 *                 leaf qpch-pwr-level-config {
 *                     type uint8;
 *                 }
 *                 leaf sdb-supported {
 *                     type uint8;
 *                 }
 *                 leaf r-lgain-traffic-pilot {
 *                     type r-lgain-traffic-pilot;
 *                 }
 *                 leaf rvs-pwr-ctrl-delay-incl {
 *                     type uint8;
 *                 }
 *                 leaf rvs-pwr-ctrl-delay {
 *                     type rvs-pwr-ctrl-delay;
 *                 }
 *                 uses cdma2000-one-x-ran-extended-system-parameters-g;
 *             }
 *             container cdma2000-one-x-ran-forward-pwr-ctr {
 *                 leaf fpcfch-init-setpt {
 *                     type fpcfch-init-setpt;
 *                 }
 *                 leaf fpc-subchan-gain {
 *                     type fpc-subchan-gain;
 *                 }
 *                 leaf rl-gain-adj {
 *                     type rl-gain-adj;
 *                 }
 *                 leaf fpcfchfer {
 *                     type uint8;
 *                 }
 *                 leaf fpcfch-min-setpt {
 *                     type fpcfch-min-setpt;
 *                 }
 *                 leaf fpcfch-max-setpt {
 *                     type fpcfch-max-setpt;
 *                 }
 *                 uses cdma2000-one-x-ran-forward-pwr-ctr-g;
 *             }
 *             container cdma2000-one-x-ran-hard-handoff {
 *                 leaf handout-enable {
 *                     type boolean;
 *                 }
 *                 leaf ho-pilot-power-thresh {
 *                     type ho-pilot-power-thresh;
 *                 }
 *                 leaf ho-pilot-duration {
 *                     type ho-pilot-duration;
 *                 }
 *                 container cdma2000-one-x-ran-hard-handoff-stats {
 *                     leaf tx-ho-required {
 *                         type uint32;
 *                     }
 *                     leaf rx-ho-command {
 *                         type uint32;
 *                     }
 *                     leaf ho-required-rejected {
 *                         type uint32;
 *                     }
 *                     leaf ho-required-unanswered {
 *                         type uint32;
 *                     }
 *                     leaf tx-uhdm {
 *                         type uint32;
 *                     }
 *                     leaf rx-ns-ack {
 *                         type uint32;
 *                     }
 *                     leaf ho-failure-count {
 *                         type uint32;
 *                     }
 *                     leaf call-drop-count {
 *                         type uint32;
 *                     }
 *                     leaf tx-ho-commence {
 *                         type uint32;
 *                     }
 *                     leaf rx-ho-session-clear {
 *                         type uint32;
 *                     }
 *                     leaf return-on-failure-count {
 *                         type uint32;
 *                     }
 *                     leaf one-pilot-report-count {
 *                         type uint32;
 *                     }
 *                     leaf two-pilot-report-count {
 *                         type uint32;
 *                     }
 *                     leaf three-pilot-report-count {
 *                         type uint32;
 *                     }
 *                     uses cdma2000-one-x-ran-hard-handoff-stats-g;
 *                 }
 *                 uses cdma2000-one-x-ran-hard-handoff-g;
 *             }
 *             container cdma2000-one-x-ran-power-control {
 *                 leaf one-xpcfpc-incl {
 *                     type int64;
 *                 }
 *                 leaf one-xpcfpcfch-min-setpt {
 *                     type one-xpcfpcfch-min-setpt;
 *                 }
 *                 leaf one-xpcfpcfch-max-setpt {
 *                     type one-xpcfpcfch-max-setpt;
 *                 }
 *                 leaf one-xpcrpc-incl {
 *                     type int64;
 *                 }
 *                 leaf one-xpcfch-chan-adj-gain {
 *                     type one-xpcfch-chan-adj-gain;
 *                 }
 *                 leaf one-xpc-pwr-rep-thresh {
 *                     type uint8;
 *                 }
 *                 leaf one-xpc-pwr-rep-frames {
 *                     type uint8;
 *                 }
 *                 leaf one-x-pwr-thresh-enable {
 *                     type int64;
 *                 }
 *                 leaf one-xpc-pwr-period-enable {
 *                     type int64;
 *                 }
 *                 leaf one-xpc-pwr-rep-delay {
 *                     type one-xpc-pwr-rep-delay;
 *                 }
 *                 uses cdma2000-one-x-ran-power-control-g;
 *             }
 *             list cdma2000-one-x-ran-neighbor-list {
 *                 key "one-x-neighbor-index" "neighbor-pn";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf pilot-inc {
 *                     type int64;
 *                 }
 *                 leaf one-x-neighbor-index {
 *                     type int64;
 *                 }
 *                 leaf neighbor-config {
 *                     type enumeration;
 *                 }
 *                 leaf neighbor-pn {
 *                     type int64;
 *                 }
 *                 leaf search-priority {
 *                     type enumeration;
 *                 }
 *                 leaf neighbor-band {
 *                     type enumeration;
 *                 }
 *                 leaf neighbor-frequency {
 *                     type int64;
 *                 }
 *                 leaf frequency-included {
 *                     type int64;
 *                 }
 *                 leaf in-traffic {
 *                     type int64;
 *                 }
 *                 leaf overhead-msg {
 *                     type int64;
 *                 }
 *                 leaf base-identifier {
 *                     type int64;
 *                 }
 *                 leaf air-interface {
 *                     type enumeration;
 *                 }
 *                 leaf hand-out-capable {
 *                     type int64;
 *                 }
 *                 leaf one-x-neighbor-longitude {
 *                     type string;
 *                 }
 *                 leaf one-x-neighbor-latitude {
 *                     type string;
 *                 }
 *                 leaf one-x-neighbor-msc-id {
 *                     type uint32;
 *                 }
 *                 leaf one-x-neighbor-ios-cell-id {
 *                     type uint16;
 *                 }
 *                 leaf force-in-overhead {
 *                     type boolean;
 *                 }
 *                 leaf included-in-overhead {
 *                     type boolean;
 *                 }
 *                 uses cdma2000-one-x-ran-neighbor-list-g;
 *             }
 *             container cdma2000-one-x-ran-apidm {
 *                 leaf association-type {
 *                     type uint8;
 *                 }
 *                 leaf apidlen {
 *                     type uint8;
 *                 }
 *                 leaf apid {
 *                     type binary;
 *                 }
 *                 leaf apidmask {
 *                     type uint8;
 *                 }
 *                 leaf iosmscid {
 *                     type uint32;
 *                 }
 *                 leaf ioscellid {
 *                     type uint16;
 *                 }
 *                 leaf intrafreqhohysincl {
 *                     type boolean;
 *                 }
 *                 leaf intrafreqhohys {
 *                     type uint8;
 *                 }
 *                 leaf intrafreqhoslopeincl {
 *                     type boolean;
 *                 }
 *                 leaf intrafreqhoslope {
 *                     type uint8;
 *                 }
 *                 leaf interfreqhohysincl {
 *                     type boolean;
 *                 }
 *                 leaf interfreqhohys {
 *                     type uint8;
 *                 }
 *                 leaf interfreqhoslopeincl {
 *                     type boolean;
 *                 }
 *                 leaf interfreqhoslope {
 *                     type uint8;
 *                 }
 *                 leaf interfreqsrchthincl {
 *                     type boolean;
 *                 }
 *                 leaf interfreqsrchth {
 *                     type uint8;
 *                 }
 *                 uses cdma2000-one-x-ran-apidm-g;
 *             }
 *             container cdma2000-one-x-ran-apidtm {
 *                 leaf apidtextcha-ri-len {
 *                     type uint16;
 *                 }
 *                 leaf apidtextmsgencoding {
 *                     type uint8;
 *                 }
 *                 leaf apidtextcha-ri {
 *                     type string;
 *                 }
 *                 uses cdma2000-one-x-ran-apidtm-g;
 *             }
 *             container cdma2000-one-x-ran-appim {
 *                 leaf lifetime {
 *                     type uint8;
 *                 }
 *                 leaf numappirec {
 *                     type uint16;
 *                 }
 *                 leaf appirec-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list cdma2000-one-x-ran-appim-appirec {
 *                     key "apsid" "apnid" "apband" "apfreq" "appnrectype" "appnreclen" "appnrec";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf apassntype {
 *                         type uint8;
 *                     }
 *                     leaf apsidsameasprevious {
 *                         type uint8;
 *                     }
 *                     leaf apnidsameasprevious {
 *                         type uint8;
 *                     }
 *                     leaf apbandsameasprevious {
 *                         type uint8;
 *                     }
 *                     leaf apfreqsameasprevious {
 *                         type uint8;
 *                     }
 *                     leaf appnrecsameasprevious {
 *                         type uint8;
 *                     }
 *                     leaf apsid {
 *                         type uint16;
 *                     }
 *                     leaf apnid {
 *                         type uint16;
 *                     }
 *                     leaf apband {
 *                         type uint8;
 *                     }
 *                     leaf apfreq {
 *                         type uint16;
 *                     }
 *                     leaf appnrectype {
 *                         type uint8;
 *                     }
 *                     leaf appnreclen {
 *                         type uint8;
 *                     }
 *                     leaf appnrec {
 *                         type binary;
 *                     }
 *                     uses cdma2000-one-x-ran-appim-appirec-g;
 *                 }
 *                 uses cdma2000-one-x-ran-appim-g;
 *             }
 *             uses cdma2000-one-x-ran-g;
 *         }
 *         container cdma2000-one-x-pcf-config {
 *             leaf pcfpdsn-health-monitor-interval {
 *                 type pcfpdsn-health-monitor-interval;
 *             }
 *             container cdma2000-one-x-pcf-config-pcf-performance-stats {
 *                 leaf a10-setup-failure-no-reason {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-admin-prohibit {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-insuff-resources {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-failed-auth {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-id-mismatch {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-malformed-req {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-unknown-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-unsupp-vend-id {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-closed-by-rnc {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-closed-by-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-success-pages {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-failed-pages {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-ingress-bytes {
 *                     type total-a10-ingress-bytes;
 *                 }
 *                 leaf total-a10-egress-bytes {
 *                     type total-a10-egress-bytes;
 *                 }
 *                 leaf a10-reg-update-received {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-dropped-pages {
 *                     type uint64;
 *                 }
 *                 uses cdma2000-one-x-pcf-config-pcf-performance-stats-g;
 *             }
 *             uses cdma2000-one-x-pcf-config-g;
 *         }
 *         list cdma2000-one-x-batch-pcfpdsn {
 *             key "batch-table-number";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf batch-table-number {
 *                 type int64;
 *             }
 *             leaf batch-table-start-ip-address {
 *                 type ip-address;
 *             }
 *             leaf batch-table-end-ip-address {
 *                 type ip-address;
 *             }
 *             leaf batch-table-security-parameter-index {
 *                 type uint32;
 *             }
 *             leaf batch-table-secret-key {
 *                 type binary;
 *             }
 *             leaf batch-table-ios-version {
 *                 type enumeration;
 *             }
 *             leaf batch-table-pdsn-admin-status {
 *                 type int64;
 *             }
 *             leaf pdsn-type {
 *                 type enumeration;
 *             }
 *             uses cdma2000-one-x-batch-pcfpdsn-g;
 *         }
 *         list cdma2000-one-x-pcfpdsn {
 *             key "pdsn-number" "security-parameter-index" "security-key";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf pdsn-number {
 *                 type int64;
 *             }
 *             leaf security-parameter-index {
 *                 type uint32;
 *             }
 *             leaf security-key {
 *                 type binary;
 *             }
 *             leaf ios-version {
 *                 type enumeration;
 *             }
 *             leaf pds-nadmin-status {
 *                 type int64;
 *             }
 *             leaf pdsn-health-status {
 *                 type uint8;
 *             }
 *             leaf pdsnip-address {
 *                 type ip-address;
 *             }
 *             container cdma2000-one-x-pcfpdsn-a11-reg-update-stats {
 *                 leaf pdsn-number-reg-update-perf {
 *                     type int64;
 *                 }
 *                 leaf pdsnip-address-reg-update-perf {
 *                     type ip-address;
 *                 }
 *                 leaf a11-reg-update-received-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-id-check-fail-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-auth-check-fail-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-for-unknown-psipdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-unspecified-reason-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-ppp-timeout-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-registration-timeout-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-pdsn-error-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-inter-pcf-handoff-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-inter-pdsn-handoff-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-pdsnoamp-intervention-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-accounting-error-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-user-failed-authentication-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-unknown-cause-code-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-without-reason-code-pdsn {
 *                     type uint64;
 *                 }
 *                 uses cdma2000-one-x-pcfpdsn-a11-reg-update-stats-g;
 *             }
 *             container cdma2000-one-x-pcfpdsn-pcfpdsn-stats {
 *                 leaf a10-setup-attempts-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-successes-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-blocks-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-id-mismatch-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-unknown-pdsnpdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-no-reason-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-admin-prohibit-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-insuff-resources-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-failed-auth-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-malformed-req-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-unsupp-vend-id-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-reverse-tunnel-unavailable-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-reverse-tunnel-tbit-not-set-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-unknown-error-code-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-reg-req-for-registration-retransmissions-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-reg-req-for-re-registration-retransmissions-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-reg-req-for-release-retransmissions-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf pdsn-number-pdsn-perf {
 *                     type int64;
 *                 }
 *                 leaf pds-nip-address-pdsn-perf {
 *                     type ip-address;
 *                 }
 *                 uses cdma2000-one-x-pcfpdsn-pcfpdsn-stats-g;
 *             }
 *             uses cdma2000-one-x-pcfpdsn-g;
 *         }
 *         container cdma2000-one-x-stats {
 *             leaf registration-attempts {
 *                 type uint32;
 *             }
 *             leaf registration-fails {
 *                 type uint32;
 *             }
 *             leaf registrations-blocked {
 *                 type uint32;
 *             }
 *             leaf page-attempts {
 *                 type uint32;
 *             }
 *             leaf page-fails {
 *                 type uint32;
 *             }
 *             leaf voice-call-attempts {
 *                 type uint32;
 *             }
 *             leaf voice-call-failures {
 *                 type uint32;
 *             }
 *             leaf voice-calls-blocked {
 *                 type uint32;
 *             }
 *             leaf voice-calls-dropped {
 *                 type uint32;
 *             }
 *             leaf data-call-attempts {
 *                 type uint32;
 *             }
 *             leaf data-call-failures {
 *                 type uint32;
 *             }
 *             leaf data-calls-blocked {
 *                 type uint32;
 *             }
 *             leaf data-calls-dropped {
 *                 type uint32;
 *             }
 *             leaf average-voice-call {
 *                 type average-voice-call;
 *             }
 *             leaf average-data-call {
 *                 type average-data-call;
 *             }
 *             leaf average-session-in-sec {
 *                 type average-session-in-sec;
 *             }
 *             leaf total-voice-calls {
 *                 type total-voice-calls;
 *             }
 *             leaf total-data-calls {
 *                 type uint32;
 *             }
 *             leaf fwd-voice-packet-drop-percentage {
 *                 type uint32;
 *             }
 *             leaf rev-voice-packet-drop-percentage {
 *                 type uint32;
 *             }
 *             leaf fwd-avg-data-rate {
 *                 type uint32;
 *             }
 *             leaf rev-avg-data-rate {
 *                 type uint32;
 *             }
 *             leaf bc-index-zero-to-one-transitions {
 *                 type uint32;
 *             }
 *             leaf bc-index-one-to-zero-transitions {
 *                 type uint32;
 *             }
 *             uses cdma2000-one-x-stats-g;
 *         }
 *         container cdma2000-one-x-redirect {
 *             leaf redirect-channel-number {
 *                 type uint16;
 *             }
 *             leaf redirect-band-class {
 *                 type uint8;
 *             }
 *             uses cdma2000-one-x-redirect-g;
 *         }
 *         uses cdma2000-one-x-g;
 *     }
 *     container cdma2000-hrpd {
 *         leaf pcfpdsn-number-of-entries {
 *             type uint64;
 *         }
 *         leaf max-batch-pcfpdsn-entries {
 *             type uint64;
 *         }
 *         leaf batch-pcfpdsn-number-of-entries {
 *             type uint64;
 *         }
 *         container cdma2000-hrpd-ran {
 *             container cdma2000-hrpd-ran-rf {
 *                 leaf hrpd-car-band-class {
 *                     type uint8;
 *                 }
 *                 leaf-list rfcnfl {
 *                     type string;
 *                 }
 *                 leaf rfcnfl-in-use {
 *                     type uint64;
 *                 }
 *                 leaf-list pilot-pn {
 *                     type string;
 *                 }
 *                 leaf pilot-pn-in-use {
 *                     type uint64;
 *                 }
 *                 leaf maxfap-tx-power {
 *                     type string;
 *                 }
 *                 leaf maxfap-tx-power-in-use {
 *                     type maxfap-tx-power-in-use;
 *                 }
 *                 leaf control-channel-rate {
 *                     type int64;
 *                 }
 *                 leaf sync-capsule-offset {
 *                     type int64;
 *                 }
 *                 leaf rab-length {
 *                     type int64;
 *                 }
 *                 leaf rab-offset {
 *                     type int64;
 *                 }
 *                 leaf sector-id {
 *                     type binary;
 *                 }
 *                 leaf color-code {
 *                     type int64;
 *                 }
 *                 leaf subnet-mask-length {
 *                     type subnet-mask-length;
 *                 }
 *                 leaf hrpd-sec-el-reverse-link-silence-duration {
 *                     type hrpd-sec-el-reverse-link-silence-duration;
 *                 }
 *                 leaf hrpd-sec-el-reverse-link-silence-period {
 *                     type hrpd-sec-el-reverse-link-silence-period;
 *                 }
 *                 leaf open-loop-adjust {
 *                     type open-loop-adjust;
 *                 }
 *                 leaf probe-initial-adjust {
 *                     type probe-initial-adjust;
 *                 }
 *                 leaf probe-num-steps {
 *                     type int64;
 *                 }
 *                 leaf probe-power-step {
 *                     type probe-power-step;
 *                 }
 *                 leaf a-persistence {
 *                     type string;
 *                 }
 *                 leaf rssirab-threshold {
 *                     type rssirab-threshold;
 *                 }
 *                 leaf load-rab-threshold {
 *                     type load-rab-threshold;
 *                 }
 *                 leaf connection-rate-limit {
 *                     type uint8;
 *                 }
 *                 leaf rfe-rl-balance-ratio {
 *                     type uint8;
 *                 }
 *                 uses cdma2000-hrpd-ran-rf-g;
 *             }
 *             uses cdma2000-hrpd-ran-g;
 *         }
 *         container cdma2000-hrpd-pcf-config {
 *             leaf pcfpdsn-health-monitor-interval {
 *                 type pcfpdsn-health-monitor-interval;
 *             }
 *             container cdma2000-hrpd-pcf-config-pcf-performance-stats {
 *                 leaf a10-setup-failure-no-reason {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-admin-prohibit {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-insuff-resources {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-failed-auth {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-id-mismatch {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-malformed-req {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-unknown-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-failure-unsupp-vend-id {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-closed-by-rnc {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-closed-by-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-success-pages {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-failed-pages {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-ingress-bytes {
 *                     type total-a10-ingress-bytes;
 *                 }
 *                 leaf total-a10-egress-bytes {
 *                     type total-a10-egress-bytes;
 *                 }
 *                 leaf a10-reg-update-received {
 *                     type uint64;
 *                 }
 *                 leaf total-a10-dropped-pages {
 *                     type uint64;
 *                 }
 *                 uses cdma2000-hrpd-pcf-config-pcf-performance-stats-g;
 *             }
 *             uses cdma2000-hrpd-pcf-config-g;
 *         }
 *         list cdma2000-hrpd-batch-pcfpdsn {
 *             key "batch-table-number" "batch-table-security-parameter-index" "batch-table-secret-key";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf batch-table-number {
 *                 type int64;
 *             }
 *             leaf batch-table-start-ip-address {
 *                 type ip-address;
 *             }
 *             leaf batch-table-end-ip-address {
 *                 type ip-address;
 *             }
 *             leaf batch-table-security-parameter-index {
 *                 type uint32;
 *             }
 *             leaf batch-table-secret-key {
 *                 type binary;
 *             }
 *             leaf batch-table-ios-version {
 *                 type enumeration;
 *             }
 *             leaf batch-table-pdsn-admin-status {
 *                 type int64;
 *             }
 *             leaf pdsn-type {
 *                 type string;
 *             }
 *             uses cdma2000-hrpd-batch-pcfpdsn-g;
 *         }
 *         list cdma2000-hrpd-pcfpdsn {
 *             key "pdsn-number" "security-parameter-index" "security-key";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf pdsn-number {
 *                 type int64;
 *             }
 *             leaf security-parameter-index {
 *                 type uint32;
 *             }
 *             leaf security-key {
 *                 type binary;
 *             }
 *             leaf ios-version {
 *                 type enumeration;
 *             }
 *             leaf pds-nadmin-status {
 *                 type int64;
 *             }
 *             leaf pdsn-health-status {
 *                 type uint8;
 *             }
 *             leaf pdsnip-address {
 *                 type ip-address;
 *             }
 *             container cdma2000-hrpd-pcfpdsn-a11-session-update-stats {
 *                 leaf pdsn-number-session-update-perf {
 *                     type int64;
 *                 }
 *                 leaf pdsnip-address-session-update-perf {
 *                     type ip-address;
 *                 }
 *                 leaf a11-session-update-received-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-accepted-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-extended-apipdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-for-unknown-psipdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-denied-id-check-fail-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-denied-auth-check-fail-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-denied-reason-unspecified-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-denied-poorly-formed-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-denied-session-params-not-updated-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-denied-qo-s-profile-id-not-supported-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-denied-insufficient-resources-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-session-update-denied-handoff-in-progress-pdsn {
 *                     type uint64;
 *                 }
 *                 uses cdma2000-hrpd-pcfpdsn-a11-session-update-stats-g;
 *             }
 *             container cdma2000-hrpd-pcfpdsn-a11-reg-update-stats {
 *                 leaf pdsn-number-reg-update-perf {
 *                     type int64;
 *                 }
 *                 leaf pdsnip-address-reg-update-perf {
 *                     type ip-address;
 *                 }
 *                 leaf a11-reg-update-received-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-id-check-fail-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-auth-check-fail-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-for-unknown-psipdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-unspecified-reason-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-ppp-timeout-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-registration-timeout-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-pdsn-error-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-inter-pcf-handoff-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-inter-pdsn-handoff-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-pdsnoamp-intervention-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-accounting-error-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-user-failed-authentication-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-unknown-cause-code-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-update-without-reason-code-pdsn {
 *                     type uint64;
 *                 }
 *                 uses cdma2000-hrpd-pcfpdsn-a11-reg-update-stats-g;
 *             }
 *             container cdma2000-hrpd-pcfpdsn-aux-a10-stats {
 *                 leaf pdsn-number-aux-a10-perf {
 *                     type int64;
 *                 }
 *                 leaf pdsnip-address-aux-a10-perf {
 *                     type ip-address;
 *                 }
 *                 leaf aux-a10-connections-created-in-first-reg-req-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf aux-a10-connections-created-in-subsequent-reg-req-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf aux-a10-fwd-ip-flows-created-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf aux-a10-rev-ip-flows-created-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf aux-a10-ip-flow-accounting-reg-requests-pdsn {
 *                     type uint64;
 *                 }
 *                 uses cdma2000-hrpd-pcfpdsn-aux-a10-stats-g;
 *             }
 *             container cdma2000-hrpd-pcfpdsn-pcfpdsn-stats {
 *                 leaf a10-setup-attempts-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-successes-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-setup-blocks-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-id-mismatch-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-unknown-pdsnpdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-no-reason-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-admin-prohibit-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-insuff-resources-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-failed-auth-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-malformed-req-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-unsupp-vend-id-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-reverse-tunnel-unavailable-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-reverse-tunnel-tbit-not-set-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a11-reg-req-denied-unknown-error-code-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-reg-req-for-registration-retransmissions-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-reg-req-for-re-registration-retransmissions-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf a10-reg-req-for-release-retransmissions-pdsn {
 *                     type uint64;
 *                 }
 *                 leaf pdsn-number-pdsn-perf {
 *                     type int64;
 *                 }
 *                 leaf pds-nip-address-pdsn-perf {
 *                     type ip-address;
 *                 }
 *                 uses cdma2000-hrpd-pcfpdsn-pcfpdsn-stats-g;
 *             }
 *             uses cdma2000-hrpd-pcfpdsn-g;
 *         }
 *         container cdma2000-hrpd-redirect {
 *             leaf redirect-channel-number {
 *                 type uint16;
 *             }
 *             leaf redirect-band-class {
 *                 type uint8;
 *             }
 *             uses cdma2000-hrpd-redirect-g;
 *         }
 *         container cdma2000-hrpd-call-control-stats {
 *             leaf num-session-setup-attempts {
 *                 type uint64;
 *             }
 *             leaf num-session-setup-successful {
 *                 type uint64;
 *             }
 *             leaf num-current-sessions-established {
 *                 type uint64;
 *             }
 *             leaf num-page-messages-to-at {
 *                 type uint64;
 *             }
 *             leaf num-pages-succeeded {
 *                 type uint64;
 *             }
 *             leaf num-connections-opened {
 *                 type uint64;
 *             }
 *             leaf num-session-setups-failed-to-term-auth {
 *                 type uint64;
 *             }
 *             leaf num-forward-rlp-bytes {
 *                 type num-forward-rlp-bytes;
 *             }
 *             leaf num-reverse-rlp-bytes {
 *                 type num-reverse-rlp-bytes;
 *             }
 *             leaf average-session-setup-time {
 *                 type average-session-setup-time;
 *             }
 *             leaf average-page-setup-time {
 *                 type uint64;
 *             }
 *             leaf num-conn-setups-aborted {
 *                 type uint64;
 *             }
 *             leaf num-forward-pre-rlp-dropped-pkts {
 *                 type uint64;
 *             }
 *             uses cdma2000-hrpd-call-control-stats-g;
 *         }
 *         container cdma2000-hrpd-qo-s-stats {
 *             leaf num-qo-s-subscriber-profile-updates-rcvd {
 *                 type uint64;
 *             }
 *             leaf num-pdsnip-flow-updates-msg-rcvd {
 *                 type uint64;
 *             }
 *             leaf num-pdsnip-flow-updates-msg-failed {
 *                 type uint64;
 *             }
 *             leaf num-qo-s-setup-requests-received {
 *                 type uint64;
 *             }
 *             leaf num-qo-s-setup-requests-accepted {
 *                 type uint64;
 *             }
 *             leaf num-qo-s-setup-requests-rejected {
 *                 type uint64;
 *             }
 *             leaf num-reservation-on-requests-received {
 *                 type uint64;
 *             }
 *             leaf num-reservation-on-requests-accepted {
 *                 type uint64;
 *             }
 *             leaf num-reservation-on-requests-rejected {
 *                 type uint64;
 *             }
 *             leaf num-reservation-on-requests-failed {
 *                 type uint64;
 *             }
 *             leaf num-fwd-reservation-on-messages-sent {
 *                 type uint64;
 *             }
 *             leaf num-rev-reservation-on-messages-sent {
 *                 type uint64;
 *             }
 *             leaf num-reservation-off-requests-received {
 *                 type uint64;
 *             }
 *             leaf num-reservation-off-requests-accepted {
 *                 type uint64;
 *             }
 *             leaf num-reservation-off-requests-rejected {
 *                 type uint64;
 *             }
 *             leaf num-fwd-reservation-off-messages-sent {
 *                 type uint64;
 *             }
 *             leaf num-rev-reservation-off-messages-sent {
 *                 type uint64;
 *             }
 *             leaf num-qo-s-release-requests-received {
 *                 type uint64;
 *             }
 *             leaf num-connection-close-initiated-no-ran-rsr {
 *                 type uint64;
 *             }
 *             uses cdma2000-hrpd-qo-s-stats-g;
 *         }
 *         container cdma2000-hrpd-rnc-sig-apps-stats {
 *             leaf c-num-page-requests {
 *                 type uint64;
 *             }
 *             leaf s-num-page-requests {
 *                 type uint64;
 *             }
 *             leaf s-num-connection-setup-attempts {
 *                 type uint64;
 *             }
 *             leaf c-num-connection-setup-attempts {
 *                 type uint64;
 *             }
 *             leaf s-num-connection-setup-success {
 *                 type uint64;
 *             }
 *             leaf c-num-connection-setup-success {
 *                 type uint64;
 *             }
 *             leaf s-num-normal-connection-closes {
 *                 type uint64;
 *             }
 *             leaf c-num-normal-connection-closes {
 *                 type uint64;
 *             }
 *             leaf s-num-total-connection-closes {
 *                 type uint64;
 *             }
 *             leaf c-num-total-connection-closes {
 *                 type uint64;
 *             }
 *             leaf s-num-rf-related-drops {
 *                 type uint64;
 *             }
 *             leaf c-num-rf-related-drops {
 *                 type uint64;
 *             }
 *             leaf s-num-page-responses {
 *                 type uint64;
 *             }
 *             leaf c-num-page-responses {
 *                 type uint64;
 *             }
 *             leaf s-num-rf-related-drops-rtc-lost {
 *                 type uint64;
 *             }
 *             leaf c-num-rf-related-drops-rtc-lost {
 *                 type uint64;
 *             }
 *             leaf s-num-rf-related-drops-no-ftc {
 *                 type uint64;
 *             }
 *             leaf c-num-rf-related-drops-no-ftc {
 *                 type uint64;
 *             }
 *             leaf s-num-network-error-drops {
 *                 type uint64;
 *             }
 *             leaf c-num-network-error-drops {
 *                 type uint64;
 *             }
 *             leaf s-num-network-error-drops-rnc-internal {
 *                 type uint64;
 *             }
 *             leaf c-num-network-error-drops-rnc-internal {
 *                 type uint64;
 *             }
 *             leaf s-num-network-error-drops-rnc-external {
 *                 type uint64;
 *             }
 *             leaf c-num-network-error-drops-rnc-external {
 *                 type uint64;
 *             }
 *             leaf s-num-network-error-drops-a10-setup-fail {
 *                 type uint64;
 *             }
 *             leaf c-num-network-error-drops-a10-setup-fail {
 *                 type uint64;
 *             }
 *             leaf s-num-misc-drops-sector-down {
 *                 type uint64;
 *             }
 *             leaf c-num-misc-drops-sector-down {
 *                 type uint64;
 *             }
 *             leaf s-num-misc-drops-internal-error {
 *                 type uint64;
 *             }
 *             leaf c-num-misc-drops-internal-error {
 *                 type uint64;
 *             }
 *             leaf c-num-misc-drops-state-mismatch {
 *                 type uint64;
 *             }
 *             leaf s-num-misc-drops-state-mismatch {
 *                 type uint64;
 *             }
 *             leaf s-num-misc-drops-due-to-rlp {
 *                 type uint64;
 *             }
 *             leaf c-num-misc-drops-due-to-rlp {
 *                 type uint64;
 *             }
 *             uses cdma2000-hrpd-rnc-sig-apps-stats-g;
 *         }
 *         container cdma2000-hrpd-access-auth-config {
 *             leaf a12-access-authentication-enable {
 *                 type int64;
 *             }
 *             uses cdma2000-hrpd-access-auth-config-g;
 *         }
 *         container cdma2000-hrpd-access-auth-stats {
 *             leaf an-ppp-authentication-attempts-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-requests-sent-from-node {
 *                 type uint64;
 *             }
 *             leaf a12-rejects-received-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-accepts-received-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-access-challenges-received-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-retransmits-sent-from-node {
 *                 type uint64;
 *             }
 *             leaf a12-timeouts-events-for-node {
 *                 type uint64;
 *             }
 *             leaf a12-malformedresponse-received-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-bad-authenticator-received-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-unknown-type-received-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-unknown-pkt-received-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-unknown-server-received-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-other-failure-occurences-in-node {
 *                 type uint64;
 *             }
 *             leaf a12-by-pass-num-ats-with-unknown-mfr-code-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-tx-path-fail-due-to-an-ppp-error-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-tx-path-fail-due-to-no-server-available-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-tx-path-fail-due-to-internal-error-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-tx-path-fail-due-to-no-packet-id-available-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-tx-path-fail-due-to-transmit-error-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-svr-timeouts-for-node {
 *                 type uint64;
 *             }
 *             leaf a12-enh-ta-bypass-lcp-timeout-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-enh-ta-bypass-chap-timeout-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-enh-ta-bypass-chap-invalid-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-enh-ta-bypass-chap-nai-matches-a12-bypass-list-by-node {
 *                 type uint64;
 *             }
 *             leaf a12-session-ta-timeout-by-node {
 *                 type uint64;
 *             }
 *             leaf access-auth-failed-due-to-session-close-total {
 *                 type uint64;
 *             }
 *             leaf access-auth-succeeded {
 *                 type uint64;
 *             }
 *             uses cdma2000-hrpd-access-auth-stats-g;
 *         }
 *         uses cdma2000-hrpd-g;
 *     }
 *     container cdma2000-beacon {
 *         leaf beacon-admin-status {
 *             type enumeration;
 *         }
 *         leaf beacon-oper-status {
 *             type enumeration;
 *         }
 *         leaf hrpd-beacon-enable {
 *             type boolean;
 *         }
 *         leaf period {
 *             type period;
 *         }
 *         leaf maxfap-beacon-tx-power {
 *             type string;
 *         }
 *         leaf maxfap-beacon-tx-power-in-use {
 *             type maxfap-beacon-tx-power-in-use;
 *         }
 *         leaf beacon-pch-pwr-percentage {
 *             type beacon-pch-pwr-percentage;
 *         }
 *         leaf max-hrpd-beacon-tx-power {
 *             type string;
 *         }
 *         leaf max-hrpd-beacon-tx-power-in-use {
 *             type max-hrpd-beacon-tx-power-in-use;
 *         }
 *         leaf beacon-pilot-pwr-percentage {
 *             type beacon-pilot-pwr-percentage;
 *         }
 *         leaf beacon-sync-pwr-percentage {
 *             type beacon-sync-pwr-percentage;
 *         }
 *         leaf max-beacon-list-entries {
 *             type uint64;
 *         }
 *         leaf beacon-list-number-of-entries {
 *             type uint64;
 *         }
 *         leaf max-hrpd-beacon-list-entries {
 *             type uint64;
 *         }
 *         leaf hrpd-beacon-list-number-of-entries {
 *             type uint64;
 *         }
 *         list cdma2000-beacon-beacon-list {
 *             key "beacon-index";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf beacon-index {
 *                 type int64;
 *             }
 *             leaf offset {
 *                 type uint16;
 *             }
 *             leaf duration {
 *                 type duration;
 *             }
 *             leaf transmission-format {
 *                 type enumeration;
 *             }
 *             leaf beacon-band-class {
 *                 type int64;
 *             }
 *             leaf beacon-channel-freq {
 *                 type uint16;
 *             }
 *             leaf-list beacon-pn-offset {
 *                 type string;
 *             }
 *             leaf tx-power {
 *                 type tx-power;
 *             }
 *             leaf beacon-sid {
 *                 type uint16;
 *             }
 *             leaf beacon-nid {
 *                 type uint16;
 *             }
 *             leaf beacon-pzid {
 *                 type uint64;
 *             }
 *             uses cdma2000-beacon-beacon-list-g;
 *         }
 *         list cdma2000-beacon-hrpd-beacon-list {
 *             key "beacon-index";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf beacon-index {
 *                 type int64;
 *             }
 *             leaf c-coffset {
 *                 type uint16;
 *             }
 *             leaf offset {
 *                 type int64;
 *             }
 *             leaf duration {
 *                 type uint16;
 *             }
 *             leaf num-c-ccycles {
 *                 type uint8;
 *             }
 *             leaf beacon-band-class {
 *                 type uint8;
 *             }
 *             leaf beacon-channel-freq {
 *                 type uint16;
 *             }
 *             leaf-list beacon-pn-offset {
 *                 type string;
 *             }
 *             leaf tx-power {
 *                 type tx-power;
 *             }
 *             uses cdma2000-beacon-hrpd-beacon-list-g;
 *         }
 *         uses cdma2000-beacon-g;
 *     }
 *     uses cdma2000-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000</i>
 *
 * <p>To create instances of this class use {@link Cdma2000Builder}.
 * @see Cdma2000Builder
 *
 */
public interface Cdma2000
    extends
    ChildOf<CellConfig>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.Cdma2000>,
    Cdma2000G
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000").intern();

    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX</code> <code>cdma2000OneX</code>, or <code>null</code> if not present
     */
    Cdma2000OneX getCdma2000OneX();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.HRPD.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd</code> <code>cdma2000Hrpd</code>, or <code>null</code> if not present
     */
    Cdma2000Hrpd getCdma2000Hrpd();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.Beacon.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon</code> <code>cdma2000Beacon</code>, or <code>null</code> if not present
     */
    Cdma2000Beacon getCdma2000Beacon();

}

