package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidtm;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran {
 *     leaf one-x-sector-nid {
 *         type int64;
 *     }
 *     leaf one-x-sector-sid {
 *         type int64;
 *     }
 *     leaf one-xpzid {
 *         type int64;
 *     }
 *     leaf base-id {
 *         type int64;
 *     }
 *     leaf max-neighbor-list-entries {
 *         type uint64;
 *     }
 *     leaf neighbor-list-number-of-entries {
 *         type uint64;
 *     }
 *     container cdma2000-one-x-ran-rf {
 *         leaf-list rfcnfl {
 *             type string;
 *         }
 *         leaf rfcnfl-band-in-use {
 *             type string;
 *         }
 *         leaf rfcnfl-in-use {
 *             type uint64;
 *         }
 *         leaf-list pilot-pn {
 *             type string;
 *         }
 *         leaf pilot-pn-in-use {
 *             type pilot-pn-in-use;
 *         }
 *         leaf maxfap-tx-power {
 *             type string;
 *         }
 *         leaf maxfap-tx-power-in-use {
 *             type maxfap-tx-power-in-use;
 *         }
 *         leaf pch-pwr-percentage {
 *             type pch-pwr-percentage;
 *         }
 *         leaf pilot-pwr-percentage {
 *             type pilot-pwr-percentage;
 *         }
 *         leaf sync-pwr-percentage {
 *             type sync-pwr-percentage;
 *         }
 *         uses cdma2000-one-x-ran-rf-g;
 *     }
 *     container cdma2000-one-x-ran-network-listen-mode-config {
 *         leaf rfcnfl-margin {
 *             type uint64;
 *         }
 *         leaf fap-coverage-target {
 *             type string;
 *         }
 *         leaf fap-beacon-coverage-target {
 *             type string;
 *         }
 *         leaf max-coverage-edge-pilot-strength {
 *             type max-coverage-edge-pilot-strength;
 *         }
 *         leaf max-allowable-pilot-strength-degradation {
 *             type max-allowable-pilot-strength-degradation;
 *         }
 *         leaf-list rfcnfl-to-protect {
 *             type string;
 *         }
 *         leaf fap-allowed-adj-chan-coverage-hole {
 *             type fap-allowed-adj-chan-coverage-hole;
 *         }
 *         leaf acir {
 *             type acir;
 *         }
 *         uses cdma2000-one-x-ran-network-listen-mode-config-g;
 *     }
 *     container cdma2000-one-x-ran-access-parameters {
 *         leaf nom-pwr {
 *             type int64;
 *         }
 *         leaf init-pwr {
 *             type int64;
 *         }
 *         leaf pwr-step-indb {
 *             type uint8;
 *         }
 *         leaf nom-pwr-ext {
 *             type nom-pwr-ext;
 *         }
 *         leaf apm-auth {
 *             type uint8;
 *         }
 *         leaf apm-rand-update-prd {
 *             type apm-rand-update-prd;
 *         }
 *         leaf initialpwr {
 *             type initialpwr;
 *         }
 *         leaf pwr-step {
 *             type pwr-step;
 *         }
 *         leaf num-step {
 *             type uint8;
 *         }
 *         leaf max-cap-size {
 *             type uint8;
 *         }
 *         leaf preamble-size {
 *             type uint8;
 *         }
 *         leaf psist09 {
 *             type uint8;
 *         }
 *         leaf psist10 {
 *             type uint8;
 *         }
 *         leaf psist11 {
 *             type uint8;
 *         }
 *         leaf psist12 {
 *             type uint8;
 *         }
 *         leaf psist13 {
 *             type uint8;
 *         }
 *         leaf psist14 {
 *             type uint8;
 *         }
 *         leaf psist15 {
 *             type uint8;
 *         }
 *         leaf msg-psist {
 *             type uint8;
 *         }
 *         leaf reg-psist {
 *             type uint8;
 *         }
 *         leaf probe-pn-ran {
 *             type uint8;
 *         }
 *         leaf acc-tmo {
 *             type acc-tmo;
 *         }
 *         leaf probe-bkoff {
 *             type probe-bkoff;
 *         }
 *         leaf bkoff {
 *             type bkoff;
 *         }
 *         leaf max-req-seq {
 *             type uint8;
 *         }
 *         leaf max-rsp-seq {
 *             type uint8;
 *         }
 *         uses cdma2000-one-x-ran-access-parameters-g;
 *     }
 *     container cdma2000-one-x-ran-system-parameters {
 *         leaf reg-zone {
 *             type uint16;
 *         }
 *         leaf total-zones {
 *             type uint8;
 *         }
 *         leaf zone-timer {
 *             type uint8;
 *         }
 *         leaf reg-period {
 *             type uint8;
 *         }
 *         leaf srch-win-a {
 *             type uint8;
 *         }
 *         leaf srch-win-n {
 *             type uint8;
 *         }
 *         leaf srch-win-r {
 *             type uint8;
 *         }
 *         leaf nghbr-max-age {
 *             type uint8;
 *         }
 *         leaf pwr-rep-thresh {
 *             type uint8;
 *         }
 *         leaf pwr-rep-frames {
 *             type uint8;
 *         }
 *         leaf pwr-thresh-enable {
 *             type uint8;
 *         }
 *         leaf pwr-period-enable {
 *             type uint8;
 *         }
 *         leaf pwr-rep-delay {
 *             type uint8;
 *         }
 *         leaf rescan {
 *             type uint8;
 *         }
 *         leaf tadd {
 *             type tadd;
 *         }
 *         leaf tdrop {
 *             type tdrop;
 *         }
 *         leaf tcomp {
 *             type tcomp;
 *         }
 *         leaf t-tdrop {
 *             type uint8;
 *         }
 *         leaf in-traffic-tadd {
 *             type in-traffic-tadd;
 *         }
 *         leaf in-traffic-tdrop {
 *             type in-traffic-tdrop;
 *         }
 *         leaf in-traffic-tcomp {
 *             type in-traffic-tcomp;
 *         }
 *         leaf in-traffic-ttdrop {
 *             type uint8;
 *         }
 *         uses cdma2000-one-x-ran-system-parameters-g;
 *     }
 *     container cdma2000-one-x-ran-extended-system-parameters {
 *         leaf prev {
 *             type uint8;
 *         }
 *         leaf p-min-rev {
 *             type uint8;
 *         }
 *         leaf delete-for-tmsi {
 *             type uint8;
 *         }
 *         leaf use-tmsi {
 *             type uint8;
 *         }
 *         leaf pref-msid-type {
 *             type uint8;
 *         }
 *         leaf mcc {
 *             type uint16;
 *         }
 *         leaf imsi1112 {
 *             type uint8;
 *         }
 *         leaf tmsi-zone-len {
 *             type uint8;
 *         }
 *         leaf tmsi-zone {
 *             type uint16;
 *         }
 *         leaf bcast-index {
 *             type uint8;
 *         }
 *         leaf imsit-supported {
 *             type int64;
 *         }
 *         leaf soft-slope {
 *             type uint8;
 *         }
 *         leaf add-intercept {
 *             type add-intercept;
 *         }
 *         leaf drop-intercept {
 *             type drop-intercept;
 *         }
 *         leaf max-num-alt-so {
 *             type uint8;
 *         }
 *         leaf reselected-included {
 *             type uint8;
 *         }
 *         leaf ec-thresh {
 *             type ec-thresh;
 *         }
 *         leaf ec-io-thresh {
 *             type uint64;
 *         }
 *         leaf pilot-report {
 *             type uint8;
 *         }
 *         leaf nghbr-set-entry-info {
 *             type uint8;
 *         }
 *         leaf access-ho-order {
 *             type uint8;
 *         }
 *         leaf nghbr-set-access-info {
 *             type uint8;
 *         }
 *         leaf access-ho {
 *             type uint8;
 *         }
 *         leaf access-ho-msg-rsp {
 *             type uint8;
 *         }
 *         leaf access-probe-ho {
 *             type uint8;
 *         }
 *         leaf acc-ho-list-upd {
 *             type uint8;
 *         }
 *         leaf acc-probe-ho-other-msg {
 *             type uint8;
 *         }
 *         leaf max-num-probe-ho {
 *             type uint8;
 *         }
 *         leaf brdcast-gps-assit {
 *             type uint8;
 *         }
 *         leaf qpch-supported {
 *             type uint8;
 *         }
 *         leaf num-qpch {
 *             type uint8;
 *         }
 *         leaf qpch-rate {
 *             type uint8;
 *         }
 *         leaf qpch-pwr-level-page {
 *             type uint8;
 *         }
 *         leaf qpc-hcci-supported {
 *             type uint8;
 *         }
 *         leaf qpch-pwr-level-config {
 *             type uint8;
 *         }
 *         leaf sdb-supported {
 *             type uint8;
 *         }
 *         leaf r-lgain-traffic-pilot {
 *             type r-lgain-traffic-pilot;
 *         }
 *         leaf rvs-pwr-ctrl-delay-incl {
 *             type uint8;
 *         }
 *         leaf rvs-pwr-ctrl-delay {
 *             type rvs-pwr-ctrl-delay;
 *         }
 *         uses cdma2000-one-x-ran-extended-system-parameters-g;
 *     }
 *     container cdma2000-one-x-ran-forward-pwr-ctr {
 *         leaf fpcfch-init-setpt {
 *             type fpcfch-init-setpt;
 *         }
 *         leaf fpc-subchan-gain {
 *             type fpc-subchan-gain;
 *         }
 *         leaf rl-gain-adj {
 *             type rl-gain-adj;
 *         }
 *         leaf fpcfchfer {
 *             type uint8;
 *         }
 *         leaf fpcfch-min-setpt {
 *             type fpcfch-min-setpt;
 *         }
 *         leaf fpcfch-max-setpt {
 *             type fpcfch-max-setpt;
 *         }
 *         uses cdma2000-one-x-ran-forward-pwr-ctr-g;
 *     }
 *     container cdma2000-one-x-ran-hard-handoff {
 *         leaf handout-enable {
 *             type boolean;
 *         }
 *         leaf ho-pilot-power-thresh {
 *             type ho-pilot-power-thresh;
 *         }
 *         leaf ho-pilot-duration {
 *             type ho-pilot-duration;
 *         }
 *         container cdma2000-one-x-ran-hard-handoff-stats {
 *             leaf tx-ho-required {
 *                 type uint32;
 *             }
 *             leaf rx-ho-command {
 *                 type uint32;
 *             }
 *             leaf ho-required-rejected {
 *                 type uint32;
 *             }
 *             leaf ho-required-unanswered {
 *                 type uint32;
 *             }
 *             leaf tx-uhdm {
 *                 type uint32;
 *             }
 *             leaf rx-ns-ack {
 *                 type uint32;
 *             }
 *             leaf ho-failure-count {
 *                 type uint32;
 *             }
 *             leaf call-drop-count {
 *                 type uint32;
 *             }
 *             leaf tx-ho-commence {
 *                 type uint32;
 *             }
 *             leaf rx-ho-session-clear {
 *                 type uint32;
 *             }
 *             leaf return-on-failure-count {
 *                 type uint32;
 *             }
 *             leaf one-pilot-report-count {
 *                 type uint32;
 *             }
 *             leaf two-pilot-report-count {
 *                 type uint32;
 *             }
 *             leaf three-pilot-report-count {
 *                 type uint32;
 *             }
 *             uses cdma2000-one-x-ran-hard-handoff-stats-g;
 *         }
 *         uses cdma2000-one-x-ran-hard-handoff-g;
 *     }
 *     container cdma2000-one-x-ran-power-control {
 *         leaf one-xpcfpc-incl {
 *             type int64;
 *         }
 *         leaf one-xpcfpcfch-min-setpt {
 *             type one-xpcfpcfch-min-setpt;
 *         }
 *         leaf one-xpcfpcfch-max-setpt {
 *             type one-xpcfpcfch-max-setpt;
 *         }
 *         leaf one-xpcrpc-incl {
 *             type int64;
 *         }
 *         leaf one-xpcfch-chan-adj-gain {
 *             type one-xpcfch-chan-adj-gain;
 *         }
 *         leaf one-xpc-pwr-rep-thresh {
 *             type uint8;
 *         }
 *         leaf one-xpc-pwr-rep-frames {
 *             type uint8;
 *         }
 *         leaf one-x-pwr-thresh-enable {
 *             type int64;
 *         }
 *         leaf one-xpc-pwr-period-enable {
 *             type int64;
 *         }
 *         leaf one-xpc-pwr-rep-delay {
 *             type one-xpc-pwr-rep-delay;
 *         }
 *         uses cdma2000-one-x-ran-power-control-g;
 *     }
 *     list cdma2000-one-x-ran-neighbor-list {
 *         key "one-x-neighbor-index" "neighbor-pn";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf pilot-inc {
 *             type int64;
 *         }
 *         leaf one-x-neighbor-index {
 *             type int64;
 *         }
 *         leaf neighbor-config {
 *             type enumeration;
 *         }
 *         leaf neighbor-pn {
 *             type int64;
 *         }
 *         leaf search-priority {
 *             type enumeration;
 *         }
 *         leaf neighbor-band {
 *             type enumeration;
 *         }
 *         leaf neighbor-frequency {
 *             type int64;
 *         }
 *         leaf frequency-included {
 *             type int64;
 *         }
 *         leaf in-traffic {
 *             type int64;
 *         }
 *         leaf overhead-msg {
 *             type int64;
 *         }
 *         leaf base-identifier {
 *             type int64;
 *         }
 *         leaf air-interface {
 *             type enumeration;
 *         }
 *         leaf hand-out-capable {
 *             type int64;
 *         }
 *         leaf one-x-neighbor-longitude {
 *             type string;
 *         }
 *         leaf one-x-neighbor-latitude {
 *             type string;
 *         }
 *         leaf one-x-neighbor-msc-id {
 *             type uint32;
 *         }
 *         leaf one-x-neighbor-ios-cell-id {
 *             type uint16;
 *         }
 *         leaf force-in-overhead {
 *             type boolean;
 *         }
 *         leaf included-in-overhead {
 *             type boolean;
 *         }
 *         uses cdma2000-one-x-ran-neighbor-list-g;
 *     }
 *     container cdma2000-one-x-ran-apidm {
 *         leaf association-type {
 *             type uint8;
 *         }
 *         leaf apidlen {
 *             type uint8;
 *         }
 *         leaf apid {
 *             type binary;
 *         }
 *         leaf apidmask {
 *             type uint8;
 *         }
 *         leaf iosmscid {
 *             type uint32;
 *         }
 *         leaf ioscellid {
 *             type uint16;
 *         }
 *         leaf intrafreqhohysincl {
 *             type boolean;
 *         }
 *         leaf intrafreqhohys {
 *             type uint8;
 *         }
 *         leaf intrafreqhoslopeincl {
 *             type boolean;
 *         }
 *         leaf intrafreqhoslope {
 *             type uint8;
 *         }
 *         leaf interfreqhohysincl {
 *             type boolean;
 *         }
 *         leaf interfreqhohys {
 *             type uint8;
 *         }
 *         leaf interfreqhoslopeincl {
 *             type boolean;
 *         }
 *         leaf interfreqhoslope {
 *             type uint8;
 *         }
 *         leaf interfreqsrchthincl {
 *             type boolean;
 *         }
 *         leaf interfreqsrchth {
 *             type uint8;
 *         }
 *         uses cdma2000-one-x-ran-apidm-g;
 *     }
 *     container cdma2000-one-x-ran-apidtm {
 *         leaf apidtextcha-ri-len {
 *             type uint16;
 *         }
 *         leaf apidtextmsgencoding {
 *             type uint8;
 *         }
 *         leaf apidtextcha-ri {
 *             type string;
 *         }
 *         uses cdma2000-one-x-ran-apidtm-g;
 *     }
 *     container cdma2000-one-x-ran-appim {
 *         leaf lifetime {
 *             type uint8;
 *         }
 *         leaf numappirec {
 *             type uint16;
 *         }
 *         leaf appirec-number-of-entries {
 *             type uint64;
 *         }
 *         list cdma2000-one-x-ran-appim-appirec {
 *             key "apsid" "apnid" "apband" "apfreq" "appnrectype" "appnreclen" "appnrec";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf apassntype {
 *                 type uint8;
 *             }
 *             leaf apsidsameasprevious {
 *                 type uint8;
 *             }
 *             leaf apnidsameasprevious {
 *                 type uint8;
 *             }
 *             leaf apbandsameasprevious {
 *                 type uint8;
 *             }
 *             leaf apfreqsameasprevious {
 *                 type uint8;
 *             }
 *             leaf appnrecsameasprevious {
 *                 type uint8;
 *             }
 *             leaf apsid {
 *                 type uint16;
 *             }
 *             leaf apnid {
 *                 type uint16;
 *             }
 *             leaf apband {
 *                 type uint8;
 *             }
 *             leaf apfreq {
 *                 type uint16;
 *             }
 *             leaf appnrectype {
 *                 type uint8;
 *             }
 *             leaf appnreclen {
 *                 type uint8;
 *             }
 *             leaf appnrec {
 *                 type binary;
 *             }
 *             uses cdma2000-one-x-ran-appim-appirec-g;
 *         }
 *         uses cdma2000-one-x-ran-appim-g;
 *     }
 *     uses cdma2000-one-x-ran-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanBuilder}.
 * @see Cdma2000OneXRanBuilder
 *
 */
public interface Cdma2000OneXRan
    extends
    ChildOf<Cdma2000OneX>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>,
    Cdma2000OneXRanG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran").intern();

    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.RF.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf</code> <code>cdma2000OneXRanRf</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanRf getCdma2000OneXRanRf();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.NetworkListenModeConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig</code> <code>cdma2000OneXRanNetworkListenModeConfig</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanNetworkListenModeConfig getCdma2000OneXRanNetworkListenModeConfig();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.AccessParameters.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters</code> <code>cdma2000OneXRanAccessParameters</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanAccessParameters getCdma2000OneXRanAccessParameters();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.SystemParameters.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters</code> <code>cdma2000OneXRanSystemParameters</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanSystemParameters getCdma2000OneXRanSystemParameters();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.ExtendedSystemParameters.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters</code> <code>cdma2000OneXRanExtendedSystemParameters</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanExtendedSystemParameters getCdma2000OneXRanExtendedSystemParameters();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.ForwardPwrCtr.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr</code> <code>cdma2000OneXRanForwardPwrCtr</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanForwardPwrCtr getCdma2000OneXRanForwardPwrCtr();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.HardHandoff.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff</code> <code>cdma2000OneXRanHardHandoff</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanHardHandoff getCdma2000OneXRanHardHandoff();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.PowerControl.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl</code> <code>cdma2000OneXRanPowerControl</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanPowerControl getCdma2000OneXRanPowerControl();
    
    /**
     * List of object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.NeighborList.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cdma2000OneXRanNeighborList</code>, or <code>null</code> if not present
     */
    List<Cdma2000OneXRanNeighborList> getCdma2000OneXRanNeighborList();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APIDM.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm</code> <code>cdma2000OneXRanApidm</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanApidm getCdma2000OneXRanApidm();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APIDTM.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidtm</code> <code>cdma2000OneXRanApidtm</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanApidtm getCdma2000OneXRanApidtm();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APPIM.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim</code> <code>cdma2000OneXRanAppim</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanAppim getCdma2000OneXRanAppim();

}

