package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRedirect;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXBatchPcfpdsn;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.Cdma2000;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x {
 *     leaf pcfpdsn-number-of-entries {
 *         type uint64;
 *     }
 *     leaf max-batch-pcfpdsn-entries {
 *         type uint64;
 *     }
 *     leaf batch-pcfpdsn-number-of-entries {
 *         type uint64;
 *     }
 *     container cdma2000-one-x-ran {
 *         leaf one-x-sector-nid {
 *             type int64;
 *         }
 *         leaf one-x-sector-sid {
 *             type int64;
 *         }
 *         leaf one-xpzid {
 *             type int64;
 *         }
 *         leaf base-id {
 *             type int64;
 *         }
 *         leaf max-neighbor-list-entries {
 *             type uint64;
 *         }
 *         leaf neighbor-list-number-of-entries {
 *             type uint64;
 *         }
 *         container cdma2000-one-x-ran-rf {
 *             leaf-list rfcnfl {
 *                 type string;
 *             }
 *             leaf rfcnfl-band-in-use {
 *                 type string;
 *             }
 *             leaf rfcnfl-in-use {
 *                 type uint64;
 *             }
 *             leaf-list pilot-pn {
 *                 type string;
 *             }
 *             leaf pilot-pn-in-use {
 *                 type pilot-pn-in-use;
 *             }
 *             leaf maxfap-tx-power {
 *                 type string;
 *             }
 *             leaf maxfap-tx-power-in-use {
 *                 type maxfap-tx-power-in-use;
 *             }
 *             leaf pch-pwr-percentage {
 *                 type pch-pwr-percentage;
 *             }
 *             leaf pilot-pwr-percentage {
 *                 type pilot-pwr-percentage;
 *             }
 *             leaf sync-pwr-percentage {
 *                 type sync-pwr-percentage;
 *             }
 *             uses cdma2000-one-x-ran-rf-g;
 *         }
 *         container cdma2000-one-x-ran-network-listen-mode-config {
 *             leaf rfcnfl-margin {
 *                 type uint64;
 *             }
 *             leaf fap-coverage-target {
 *                 type string;
 *             }
 *             leaf fap-beacon-coverage-target {
 *                 type string;
 *             }
 *             leaf max-coverage-edge-pilot-strength {
 *                 type max-coverage-edge-pilot-strength;
 *             }
 *             leaf max-allowable-pilot-strength-degradation {
 *                 type max-allowable-pilot-strength-degradation;
 *             }
 *             leaf-list rfcnfl-to-protect {
 *                 type string;
 *             }
 *             leaf fap-allowed-adj-chan-coverage-hole {
 *                 type fap-allowed-adj-chan-coverage-hole;
 *             }
 *             leaf acir {
 *                 type acir;
 *             }
 *             uses cdma2000-one-x-ran-network-listen-mode-config-g;
 *         }
 *         container cdma2000-one-x-ran-access-parameters {
 *             leaf nom-pwr {
 *                 type int64;
 *             }
 *             leaf init-pwr {
 *                 type int64;
 *             }
 *             leaf pwr-step-indb {
 *                 type uint8;
 *             }
 *             leaf nom-pwr-ext {
 *                 type nom-pwr-ext;
 *             }
 *             leaf apm-auth {
 *                 type uint8;
 *             }
 *             leaf apm-rand-update-prd {
 *                 type apm-rand-update-prd;
 *             }
 *             leaf initialpwr {
 *                 type initialpwr;
 *             }
 *             leaf pwr-step {
 *                 type pwr-step;
 *             }
 *             leaf num-step {
 *                 type uint8;
 *             }
 *             leaf max-cap-size {
 *                 type uint8;
 *             }
 *             leaf preamble-size {
 *                 type uint8;
 *             }
 *             leaf psist09 {
 *                 type uint8;
 *             }
 *             leaf psist10 {
 *                 type uint8;
 *             }
 *             leaf psist11 {
 *                 type uint8;
 *             }
 *             leaf psist12 {
 *                 type uint8;
 *             }
 *             leaf psist13 {
 *                 type uint8;
 *             }
 *             leaf psist14 {
 *                 type uint8;
 *             }
 *             leaf psist15 {
 *                 type uint8;
 *             }
 *             leaf msg-psist {
 *                 type uint8;
 *             }
 *             leaf reg-psist {
 *                 type uint8;
 *             }
 *             leaf probe-pn-ran {
 *                 type uint8;
 *             }
 *             leaf acc-tmo {
 *                 type acc-tmo;
 *             }
 *             leaf probe-bkoff {
 *                 type probe-bkoff;
 *             }
 *             leaf bkoff {
 *                 type bkoff;
 *             }
 *             leaf max-req-seq {
 *                 type uint8;
 *             }
 *             leaf max-rsp-seq {
 *                 type uint8;
 *             }
 *             uses cdma2000-one-x-ran-access-parameters-g;
 *         }
 *         container cdma2000-one-x-ran-system-parameters {
 *             leaf reg-zone {
 *                 type uint16;
 *             }
 *             leaf total-zones {
 *                 type uint8;
 *             }
 *             leaf zone-timer {
 *                 type uint8;
 *             }
 *             leaf reg-period {
 *                 type uint8;
 *             }
 *             leaf srch-win-a {
 *                 type uint8;
 *             }
 *             leaf srch-win-n {
 *                 type uint8;
 *             }
 *             leaf srch-win-r {
 *                 type uint8;
 *             }
 *             leaf nghbr-max-age {
 *                 type uint8;
 *             }
 *             leaf pwr-rep-thresh {
 *                 type uint8;
 *             }
 *             leaf pwr-rep-frames {
 *                 type uint8;
 *             }
 *             leaf pwr-thresh-enable {
 *                 type uint8;
 *             }
 *             leaf pwr-period-enable {
 *                 type uint8;
 *             }
 *             leaf pwr-rep-delay {
 *                 type uint8;
 *             }
 *             leaf rescan {
 *                 type uint8;
 *             }
 *             leaf tadd {
 *                 type tadd;
 *             }
 *             leaf tdrop {
 *                 type tdrop;
 *             }
 *             leaf tcomp {
 *                 type tcomp;
 *             }
 *             leaf t-tdrop {
 *                 type uint8;
 *             }
 *             leaf in-traffic-tadd {
 *                 type in-traffic-tadd;
 *             }
 *             leaf in-traffic-tdrop {
 *                 type in-traffic-tdrop;
 *             }
 *             leaf in-traffic-tcomp {
 *                 type in-traffic-tcomp;
 *             }
 *             leaf in-traffic-ttdrop {
 *                 type uint8;
 *             }
 *             uses cdma2000-one-x-ran-system-parameters-g;
 *         }
 *         container cdma2000-one-x-ran-extended-system-parameters {
 *             leaf prev {
 *                 type uint8;
 *             }
 *             leaf p-min-rev {
 *                 type uint8;
 *             }
 *             leaf delete-for-tmsi {
 *                 type uint8;
 *             }
 *             leaf use-tmsi {
 *                 type uint8;
 *             }
 *             leaf pref-msid-type {
 *                 type uint8;
 *             }
 *             leaf mcc {
 *                 type uint16;
 *             }
 *             leaf imsi1112 {
 *                 type uint8;
 *             }
 *             leaf tmsi-zone-len {
 *                 type uint8;
 *             }
 *             leaf tmsi-zone {
 *                 type uint16;
 *             }
 *             leaf bcast-index {
 *                 type uint8;
 *             }
 *             leaf imsit-supported {
 *                 type int64;
 *             }
 *             leaf soft-slope {
 *                 type uint8;
 *             }
 *             leaf add-intercept {
 *                 type add-intercept;
 *             }
 *             leaf drop-intercept {
 *                 type drop-intercept;
 *             }
 *             leaf max-num-alt-so {
 *                 type uint8;
 *             }
 *             leaf reselected-included {
 *                 type uint8;
 *             }
 *             leaf ec-thresh {
 *                 type ec-thresh;
 *             }
 *             leaf ec-io-thresh {
 *                 type uint64;
 *             }
 *             leaf pilot-report {
 *                 type uint8;
 *             }
 *             leaf nghbr-set-entry-info {
 *                 type uint8;
 *             }
 *             leaf access-ho-order {
 *                 type uint8;
 *             }
 *             leaf nghbr-set-access-info {
 *                 type uint8;
 *             }
 *             leaf access-ho {
 *                 type uint8;
 *             }
 *             leaf access-ho-msg-rsp {
 *                 type uint8;
 *             }
 *             leaf access-probe-ho {
 *                 type uint8;
 *             }
 *             leaf acc-ho-list-upd {
 *                 type uint8;
 *             }
 *             leaf acc-probe-ho-other-msg {
 *                 type uint8;
 *             }
 *             leaf max-num-probe-ho {
 *                 type uint8;
 *             }
 *             leaf brdcast-gps-assit {
 *                 type uint8;
 *             }
 *             leaf qpch-supported {
 *                 type uint8;
 *             }
 *             leaf num-qpch {
 *                 type uint8;
 *             }
 *             leaf qpch-rate {
 *                 type uint8;
 *             }
 *             leaf qpch-pwr-level-page {
 *                 type uint8;
 *             }
 *             leaf qpc-hcci-supported {
 *                 type uint8;
 *             }
 *             leaf qpch-pwr-level-config {
 *                 type uint8;
 *             }
 *             leaf sdb-supported {
 *                 type uint8;
 *             }
 *             leaf r-lgain-traffic-pilot {
 *                 type r-lgain-traffic-pilot;
 *             }
 *             leaf rvs-pwr-ctrl-delay-incl {
 *                 type uint8;
 *             }
 *             leaf rvs-pwr-ctrl-delay {
 *                 type rvs-pwr-ctrl-delay;
 *             }
 *             uses cdma2000-one-x-ran-extended-system-parameters-g;
 *         }
 *         container cdma2000-one-x-ran-forward-pwr-ctr {
 *             leaf fpcfch-init-setpt {
 *                 type fpcfch-init-setpt;
 *             }
 *             leaf fpc-subchan-gain {
 *                 type fpc-subchan-gain;
 *             }
 *             leaf rl-gain-adj {
 *                 type rl-gain-adj;
 *             }
 *             leaf fpcfchfer {
 *                 type uint8;
 *             }
 *             leaf fpcfch-min-setpt {
 *                 type fpcfch-min-setpt;
 *             }
 *             leaf fpcfch-max-setpt {
 *                 type fpcfch-max-setpt;
 *             }
 *             uses cdma2000-one-x-ran-forward-pwr-ctr-g;
 *         }
 *         container cdma2000-one-x-ran-hard-handoff {
 *             leaf handout-enable {
 *                 type boolean;
 *             }
 *             leaf ho-pilot-power-thresh {
 *                 type ho-pilot-power-thresh;
 *             }
 *             leaf ho-pilot-duration {
 *                 type ho-pilot-duration;
 *             }
 *             container cdma2000-one-x-ran-hard-handoff-stats {
 *                 leaf tx-ho-required {
 *                     type uint32;
 *                 }
 *                 leaf rx-ho-command {
 *                     type uint32;
 *                 }
 *                 leaf ho-required-rejected {
 *                     type uint32;
 *                 }
 *                 leaf ho-required-unanswered {
 *                     type uint32;
 *                 }
 *                 leaf tx-uhdm {
 *                     type uint32;
 *                 }
 *                 leaf rx-ns-ack {
 *                     type uint32;
 *                 }
 *                 leaf ho-failure-count {
 *                     type uint32;
 *                 }
 *                 leaf call-drop-count {
 *                     type uint32;
 *                 }
 *                 leaf tx-ho-commence {
 *                     type uint32;
 *                 }
 *                 leaf rx-ho-session-clear {
 *                     type uint32;
 *                 }
 *                 leaf return-on-failure-count {
 *                     type uint32;
 *                 }
 *                 leaf one-pilot-report-count {
 *                     type uint32;
 *                 }
 *                 leaf two-pilot-report-count {
 *                     type uint32;
 *                 }
 *                 leaf three-pilot-report-count {
 *                     type uint32;
 *                 }
 *                 uses cdma2000-one-x-ran-hard-handoff-stats-g;
 *             }
 *             uses cdma2000-one-x-ran-hard-handoff-g;
 *         }
 *         container cdma2000-one-x-ran-power-control {
 *             leaf one-xpcfpc-incl {
 *                 type int64;
 *             }
 *             leaf one-xpcfpcfch-min-setpt {
 *                 type one-xpcfpcfch-min-setpt;
 *             }
 *             leaf one-xpcfpcfch-max-setpt {
 *                 type one-xpcfpcfch-max-setpt;
 *             }
 *             leaf one-xpcrpc-incl {
 *                 type int64;
 *             }
 *             leaf one-xpcfch-chan-adj-gain {
 *                 type one-xpcfch-chan-adj-gain;
 *             }
 *             leaf one-xpc-pwr-rep-thresh {
 *                 type uint8;
 *             }
 *             leaf one-xpc-pwr-rep-frames {
 *                 type uint8;
 *             }
 *             leaf one-x-pwr-thresh-enable {
 *                 type int64;
 *             }
 *             leaf one-xpc-pwr-period-enable {
 *                 type int64;
 *             }
 *             leaf one-xpc-pwr-rep-delay {
 *                 type one-xpc-pwr-rep-delay;
 *             }
 *             uses cdma2000-one-x-ran-power-control-g;
 *         }
 *         list cdma2000-one-x-ran-neighbor-list {
 *             key "one-x-neighbor-index" "neighbor-pn";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf pilot-inc {
 *                 type int64;
 *             }
 *             leaf one-x-neighbor-index {
 *                 type int64;
 *             }
 *             leaf neighbor-config {
 *                 type enumeration;
 *             }
 *             leaf neighbor-pn {
 *                 type int64;
 *             }
 *             leaf search-priority {
 *                 type enumeration;
 *             }
 *             leaf neighbor-band {
 *                 type enumeration;
 *             }
 *             leaf neighbor-frequency {
 *                 type int64;
 *             }
 *             leaf frequency-included {
 *                 type int64;
 *             }
 *             leaf in-traffic {
 *                 type int64;
 *             }
 *             leaf overhead-msg {
 *                 type int64;
 *             }
 *             leaf base-identifier {
 *                 type int64;
 *             }
 *             leaf air-interface {
 *                 type enumeration;
 *             }
 *             leaf hand-out-capable {
 *                 type int64;
 *             }
 *             leaf one-x-neighbor-longitude {
 *                 type string;
 *             }
 *             leaf one-x-neighbor-latitude {
 *                 type string;
 *             }
 *             leaf one-x-neighbor-msc-id {
 *                 type uint32;
 *             }
 *             leaf one-x-neighbor-ios-cell-id {
 *                 type uint16;
 *             }
 *             leaf force-in-overhead {
 *                 type boolean;
 *             }
 *             leaf included-in-overhead {
 *                 type boolean;
 *             }
 *             uses cdma2000-one-x-ran-neighbor-list-g;
 *         }
 *         container cdma2000-one-x-ran-apidm {
 *             leaf association-type {
 *                 type uint8;
 *             }
 *             leaf apidlen {
 *                 type uint8;
 *             }
 *             leaf apid {
 *                 type binary;
 *             }
 *             leaf apidmask {
 *                 type uint8;
 *             }
 *             leaf iosmscid {
 *                 type uint32;
 *             }
 *             leaf ioscellid {
 *                 type uint16;
 *             }
 *             leaf intrafreqhohysincl {
 *                 type boolean;
 *             }
 *             leaf intrafreqhohys {
 *                 type uint8;
 *             }
 *             leaf intrafreqhoslopeincl {
 *                 type boolean;
 *             }
 *             leaf intrafreqhoslope {
 *                 type uint8;
 *             }
 *             leaf interfreqhohysincl {
 *                 type boolean;
 *             }
 *             leaf interfreqhohys {
 *                 type uint8;
 *             }
 *             leaf interfreqhoslopeincl {
 *                 type boolean;
 *             }
 *             leaf interfreqhoslope {
 *                 type uint8;
 *             }
 *             leaf interfreqsrchthincl {
 *                 type boolean;
 *             }
 *             leaf interfreqsrchth {
 *                 type uint8;
 *             }
 *             uses cdma2000-one-x-ran-apidm-g;
 *         }
 *         container cdma2000-one-x-ran-apidtm {
 *             leaf apidtextcha-ri-len {
 *                 type uint16;
 *             }
 *             leaf apidtextmsgencoding {
 *                 type uint8;
 *             }
 *             leaf apidtextcha-ri {
 *                 type string;
 *             }
 *             uses cdma2000-one-x-ran-apidtm-g;
 *         }
 *         container cdma2000-one-x-ran-appim {
 *             leaf lifetime {
 *                 type uint8;
 *             }
 *             leaf numappirec {
 *                 type uint16;
 *             }
 *             leaf appirec-number-of-entries {
 *                 type uint64;
 *             }
 *             list cdma2000-one-x-ran-appim-appirec {
 *                 key "apsid" "apnid" "apband" "apfreq" "appnrectype" "appnreclen" "appnrec";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf apassntype {
 *                     type uint8;
 *                 }
 *                 leaf apsidsameasprevious {
 *                     type uint8;
 *                 }
 *                 leaf apnidsameasprevious {
 *                     type uint8;
 *                 }
 *                 leaf apbandsameasprevious {
 *                     type uint8;
 *                 }
 *                 leaf apfreqsameasprevious {
 *                     type uint8;
 *                 }
 *                 leaf appnrecsameasprevious {
 *                     type uint8;
 *                 }
 *                 leaf apsid {
 *                     type uint16;
 *                 }
 *                 leaf apnid {
 *                     type uint16;
 *                 }
 *                 leaf apband {
 *                     type uint8;
 *                 }
 *                 leaf apfreq {
 *                     type uint16;
 *                 }
 *                 leaf appnrectype {
 *                     type uint8;
 *                 }
 *                 leaf appnreclen {
 *                     type uint8;
 *                 }
 *                 leaf appnrec {
 *                     type binary;
 *                 }
 *                 uses cdma2000-one-x-ran-appim-appirec-g;
 *             }
 *             uses cdma2000-one-x-ran-appim-g;
 *         }
 *         uses cdma2000-one-x-ran-g;
 *     }
 *     container cdma2000-one-x-pcf-config {
 *         leaf pcfpdsn-health-monitor-interval {
 *             type pcfpdsn-health-monitor-interval;
 *         }
 *         container cdma2000-one-x-pcf-config-pcf-performance-stats {
 *             leaf a10-setup-failure-no-reason {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-admin-prohibit {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-insuff-resources {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-failed-auth {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-id-mismatch {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-malformed-req {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-unknown-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-unsupp-vend-id {
 *                 type uint64;
 *             }
 *             leaf total-a10-closed-by-rnc {
 *                 type uint64;
 *             }
 *             leaf total-a10-closed-by-pdsn {
 *                 type uint64;
 *             }
 *             leaf total-a10-success-pages {
 *                 type uint64;
 *             }
 *             leaf total-a10-failed-pages {
 *                 type uint64;
 *             }
 *             leaf total-a10-ingress-bytes {
 *                 type total-a10-ingress-bytes;
 *             }
 *             leaf total-a10-egress-bytes {
 *                 type total-a10-egress-bytes;
 *             }
 *             leaf a10-reg-update-received {
 *                 type uint64;
 *             }
 *             leaf total-a10-dropped-pages {
 *                 type uint64;
 *             }
 *             uses cdma2000-one-x-pcf-config-pcf-performance-stats-g;
 *         }
 *         uses cdma2000-one-x-pcf-config-g;
 *     }
 *     list cdma2000-one-x-batch-pcfpdsn {
 *         key "batch-table-number";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf batch-table-number {
 *             type int64;
 *         }
 *         leaf batch-table-start-ip-address {
 *             type ip-address;
 *         }
 *         leaf batch-table-end-ip-address {
 *             type ip-address;
 *         }
 *         leaf batch-table-security-parameter-index {
 *             type uint32;
 *         }
 *         leaf batch-table-secret-key {
 *             type binary;
 *         }
 *         leaf batch-table-ios-version {
 *             type enumeration;
 *         }
 *         leaf batch-table-pdsn-admin-status {
 *             type int64;
 *         }
 *         leaf pdsn-type {
 *             type enumeration;
 *         }
 *         uses cdma2000-one-x-batch-pcfpdsn-g;
 *     }
 *     list cdma2000-one-x-pcfpdsn {
 *         key "pdsn-number" "security-parameter-index" "security-key";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf pdsn-number {
 *             type int64;
 *         }
 *         leaf security-parameter-index {
 *             type uint32;
 *         }
 *         leaf security-key {
 *             type binary;
 *         }
 *         leaf ios-version {
 *             type enumeration;
 *         }
 *         leaf pds-nadmin-status {
 *             type int64;
 *         }
 *         leaf pdsn-health-status {
 *             type uint8;
 *         }
 *         leaf pdsnip-address {
 *             type ip-address;
 *         }
 *         container cdma2000-one-x-pcfpdsn-a11-reg-update-stats {
 *             leaf pdsn-number-reg-update-perf {
 *                 type int64;
 *             }
 *             leaf pdsnip-address-reg-update-perf {
 *                 type ip-address;
 *             }
 *             leaf a11-reg-update-received-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-id-check-fail-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-auth-check-fail-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-for-unknown-psipdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-unspecified-reason-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-ppp-timeout-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-registration-timeout-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-pdsn-error-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-inter-pcf-handoff-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-inter-pdsn-handoff-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-pdsnoamp-intervention-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-accounting-error-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-user-failed-authentication-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-unknown-cause-code-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-without-reason-code-pdsn {
 *                 type uint64;
 *             }
 *             uses cdma2000-one-x-pcfpdsn-a11-reg-update-stats-g;
 *         }
 *         container cdma2000-one-x-pcfpdsn-pcfpdsn-stats {
 *             leaf a10-setup-attempts-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-setup-successes-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-setup-blocks-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-id-mismatch-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-unknown-pdsnpdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-no-reason-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-admin-prohibit-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-insuff-resources-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-failed-auth-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-malformed-req-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-unsupp-vend-id-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-reverse-tunnel-unavailable-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-reverse-tunnel-tbit-not-set-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-unknown-error-code-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-reg-req-for-registration-retransmissions-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-reg-req-for-re-registration-retransmissions-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-reg-req-for-release-retransmissions-pdsn {
 *                 type uint64;
 *             }
 *             leaf pdsn-number-pdsn-perf {
 *                 type int64;
 *             }
 *             leaf pds-nip-address-pdsn-perf {
 *                 type ip-address;
 *             }
 *             uses cdma2000-one-x-pcfpdsn-pcfpdsn-stats-g;
 *         }
 *         uses cdma2000-one-x-pcfpdsn-g;
 *     }
 *     container cdma2000-one-x-stats {
 *         leaf registration-attempts {
 *             type uint32;
 *         }
 *         leaf registration-fails {
 *             type uint32;
 *         }
 *         leaf registrations-blocked {
 *             type uint32;
 *         }
 *         leaf page-attempts {
 *             type uint32;
 *         }
 *         leaf page-fails {
 *             type uint32;
 *         }
 *         leaf voice-call-attempts {
 *             type uint32;
 *         }
 *         leaf voice-call-failures {
 *             type uint32;
 *         }
 *         leaf voice-calls-blocked {
 *             type uint32;
 *         }
 *         leaf voice-calls-dropped {
 *             type uint32;
 *         }
 *         leaf data-call-attempts {
 *             type uint32;
 *         }
 *         leaf data-call-failures {
 *             type uint32;
 *         }
 *         leaf data-calls-blocked {
 *             type uint32;
 *         }
 *         leaf data-calls-dropped {
 *             type uint32;
 *         }
 *         leaf average-voice-call {
 *             type average-voice-call;
 *         }
 *         leaf average-data-call {
 *             type average-data-call;
 *         }
 *         leaf average-session-in-sec {
 *             type average-session-in-sec;
 *         }
 *         leaf total-voice-calls {
 *             type total-voice-calls;
 *         }
 *         leaf total-data-calls {
 *             type uint32;
 *         }
 *         leaf fwd-voice-packet-drop-percentage {
 *             type uint32;
 *         }
 *         leaf rev-voice-packet-drop-percentage {
 *             type uint32;
 *         }
 *         leaf fwd-avg-data-rate {
 *             type uint32;
 *         }
 *         leaf rev-avg-data-rate {
 *             type uint32;
 *         }
 *         leaf bc-index-zero-to-one-transitions {
 *             type uint32;
 *         }
 *         leaf bc-index-one-to-zero-transitions {
 *             type uint32;
 *         }
 *         uses cdma2000-one-x-stats-g;
 *     }
 *     container cdma2000-one-x-redirect {
 *         leaf redirect-channel-number {
 *             type uint16;
 *         }
 *         leaf redirect-band-class {
 *             type uint8;
 *         }
 *         uses cdma2000-one-x-redirect-g;
 *     }
 *     uses cdma2000-one-x-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXBuilder}.
 * @see Cdma2000OneXBuilder
 *
 */
public interface Cdma2000OneX
    extends
    ChildOf<Cdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>,
    Cdma2000OneXG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x").intern();

    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan</code> <code>cdma2000OneXRan</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRan getCdma2000OneXRan();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.PCFConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfConfig</code> <code>cdma2000OneXPcfConfig</code>, or <code>null</code> if not present
     */
    Cdma2000OneXPcfConfig getCdma2000OneXPcfConfig();
    
    /**
     * List of object class FAPService.{i}.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cdma2000OneXBatchPcfpdsn</code>, or <code>null</code> if not present
     */
    List<Cdma2000OneXBatchPcfpdsn> getCdma2000OneXBatchPcfpdsn();
    
    /**
     * List of object class FAPService.{i}.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cdma2000OneXPcfpdsn</code>, or <code>null</code> if not present
     */
    List<Cdma2000OneXPcfpdsn> getCdma2000OneXPcfpdsn();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.Stats.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats</code> <code>cdma2000OneXStats</code>, or <code>null</code> if not present
     */
    Cdma2000OneXStats getCdma2000OneXStats();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.Redirect.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRedirect</code> <code>cdma2000OneXRedirect</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRedirect getCdma2000OneXRedirect();

}

