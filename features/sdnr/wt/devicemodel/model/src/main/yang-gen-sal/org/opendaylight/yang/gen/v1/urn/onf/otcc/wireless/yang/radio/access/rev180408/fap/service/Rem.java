package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemUmts;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemLte;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem {
 *     container rem-umts {
 *         container rem-umts-wcdma {
 *             leaf in-service-handling {
 *                 type in-service-handling;
 *             }
 *             leaf scan-on-boot {
 *                 type scan-on-boot;
 *             }
 *             leaf scan-periodically {
 *                 type scan-periodically;
 *             }
 *             leaf periodic-interval {
 *                 type periodic-interval;
 *             }
 *             leaf periodic-time {
 *                 type date-and-time;
 *             }
 *             leaf-list remplmn-list {
 *                 type string;
 *             }
 *             leaf-list rem-band-list {
 *                 type string;
 *             }
 *             leaf-list uarfcndl-list {
 *                 type string;
 *             }
 *             leaf scan-timeout {
 *                 type scan-timeout;
 *             }
 *             leaf scan-status {
 *                 type enumeration;
 *             }
 *             leaf error-details {
 *                 type string;
 *             }
 *             leaf last-scan-time {
 *                 type date-and-time;
 *             }
 *             leaf max-cell-entries {
 *                 type uint64;
 *             }
 *             leaf cell-number-of-entries {
 *                 type uint64;
 *             }
 *             list rem-umts-wcdma-cell {
 *                 key "rem-umts-wcdma-cell-key";
 *                 leaf rem-umts-wcdma-cell-key {
 *                     type string;
 *                 }
 *                 container rem-umts-wcdma-cell-rf {
 *                     leaf uarfcndl {
 *                         type uint16;
 *                     }
 *                     leaf cpichrscp {
 *                         type cpichrscp;
 *                     }
 *                     leaf cpich-ec-no {
 *                         type cpich-ec-no;
 *                     }
 *                     leaf rssi {
 *                         type rssi;
 *                     }
 *                     leaf primary-scrambling-code {
 *                         type uint16;
 *                     }
 *                     uses rem-umts-wcdma-cell-rf-g;
 *                 }
 *                 container rem-umts-wcdma-cell-bcch {
 *                     leaf plmn-type {
 *                         type enumeration;
 *                     }
 *                     leaf plmnid {
 *                         type string;
 *                     }
 *                     leaf lac {
 *                         type uint16;
 *                     }
 *                     leaf rac {
 *                         type uint8;
 *                     }
 *                     leaf cell-id {
 *                         type uint32;
 *                     }
 *                     leaf pcpich-tx-power {
 *                         type int64;
 *                     }
 *                     leaf csg-indicator {
 *                         type boolean;
 *                     }
 *                     leaf csgid {
 *                         type uint32;
 *                     }
 *                     leaf-list uarfcndl-list {
 *                         type uint16;
 *                     }
 *                     container rem-umts-wcdma-cell-bcch-csgpsc-split-info {
 *                         leaf start-psc-range1-coefficient {
 *                             type uint8;
 *                         }
 *                         leaf number-of-ps-cs {
 *                             type enumeration;
 *                         }
 *                         leaf psc-range2-offset {
 *                             type uint8;
 *                         }
 *                         uses rem-umts-wcdma-cell-bcch-csgpsc-split-info-g;
 *                     }
 *                     container rem-umts-wcdma-cell-bcch-reference-position {
 *                         leaf latitude {
 *                             type int64;
 *                         }
 *                         leaf longitude {
 *                             type int64;
 *                         }
 *                         leaf uncertainty-semi-major {
 *                             type uint8;
 *                         }
 *                         leaf uncertainty-semi-minor {
 *                             type uint8;
 *                         }
 *                         leaf orientation-of-major-axis {
 *                             type uint8;
 *                         }
 *                         leaf confidence {
 *                             type confidence;
 *                         }
 *                         uses rem-umts-wcdma-cell-bcch-reference-position-g;
 *                     }
 *                     uses rem-umts-wcdma-cell-bcch-g;
 *                 }
 *                 uses rem-umts-wcdma-cell-g;
 *             }
 *             uses rem-umts-wcdma-g;
 *         }
 *         container rem-umts-gsm {
 *             leaf in-service-handling {
 *                 type in-service-handling;
 *             }
 *             leaf scan-on-boot {
 *                 type scan-on-boot;
 *             }
 *             leaf scan-periodically {
 *                 type scan-periodically;
 *             }
 *             leaf periodic-interval {
 *                 type periodic-interval;
 *             }
 *             leaf periodic-time {
 *                 type date-and-time;
 *             }
 *             leaf-list remplmn-list {
 *                 type string;
 *             }
 *             leaf-list rem-band-list {
 *                 type enumeration;
 *             }
 *             leaf-list arfcn-list {
 *                 type string;
 *             }
 *             leaf scan-timeout {
 *                 type scan-timeout;
 *             }
 *             leaf scan-status {
 *                 type enumeration;
 *             }
 *             leaf error-details {
 *                 type string;
 *             }
 *             leaf last-scan-time {
 *                 type date-and-time;
 *             }
 *             leaf max-cell-entries {
 *                 type uint64;
 *             }
 *             leaf cell-number-of-entries {
 *                 type uint64;
 *             }
 *             list rem-umts-gsm-cell {
 *                 key "arfcn" "bsic";
 *                 leaf band-indicator {
 *                     type enumeration;
 *                 }
 *                 leaf arfcn {
 *                     type uint16;
 *                 }
 *                 leaf bsic {
 *                     type uint8;
 *                 }
 *                 leaf plmnid {
 *                     type string;
 *                 }
 *                 leaf lac {
 *                     type uint16;
 *                 }
 *                 leaf rac {
 *                     type uint8;
 *                 }
 *                 leaf ci {
 *                     type uint16;
 *                 }
 *                 leaf rssi {
 *                     type rssi;
 *                 }
 *                 uses rem-umts-gsm-cell-g;
 *             }
 *             uses rem-umts-gsm-g;
 *         }
 *         uses rem-umts-g;
 *     }
 *     container rem-lte {
 *         leaf in-service-handling {
 *             type in-service-handling;
 *         }
 *         leaf scan-on-boot {
 *             type scan-on-boot;
 *         }
 *         leaf scan-periodically {
 *             type scan-periodically;
 *         }
 *         leaf periodic-interval {
 *             type periodic-interval;
 *         }
 *         leaf periodic-time {
 *             type date-and-time;
 *         }
 *         leaf-list remplmn-list {
 *             type string;
 *         }
 *         leaf-list rem-band-list {
 *             type string;
 *         }
 *         leaf-list eutra-carrier-arfcndl-list {
 *             type string;
 *         }
 *         leaf scan-timeout {
 *             type scan-timeout;
 *         }
 *         leaf scan-status {
 *             type enumeration;
 *         }
 *         leaf error-details {
 *             type string;
 *         }
 *         leaf last-scan-time {
 *             type date-and-time;
 *         }
 *         leaf max-cell-entries {
 *             type uint64;
 *         }
 *         leaf cell-number-of-entries {
 *             type uint64;
 *         }
 *         leaf max-carrier-meas-entries {
 *             type uint64;
 *         }
 *         leaf carrier-meas-number-of-entries {
 *             type uint64;
 *         }
 *         list rem-lte-cell {
 *             key "rem-lte-cell-key";
 *             leaf rem-lte-cell-key {
 *                 type string;
 *             }
 *             container rem-lte-cell-rf {
 *                 leaf eutra-carrier-arfcn {
 *                     type uint16;
 *                 }
 *                 leaf phy-cell-id {
 *                     type uint16;
 *                 }
 *                 leaf rsrp {
 *                     type rsrp;
 *                 }
 *                 leaf rsrq {
 *                     type rsrq;
 *                 }
 *                 leaf rssi {
 *                     type rssi;
 *                 }
 *                 uses rem-lte-cell-rf-g;
 *             }
 *             container rem-lte-cell-bcch {
 *                 leaf dl-bandwidth {
 *                     type dl-bandwidth;
 *                 }
 *                 leaf ul-bandwidth {
 *                     type ul-bandwidth;
 *                 }
 *                 leaf rs-tx-power {
 *                     type rs-tx-power;
 *                 }
 *                 leaf tac {
 *                     type uint16;
 *                 }
 *                 leaf cell-id {
 *                     type uint32;
 *                 }
 *                 leaf cell-barred {
 *                     type boolean;
 *                 }
 *                 leaf csg-indication {
 *                     type boolean;
 *                 }
 *                 leaf csg-identity {
 *                     type uint32;
 *                 }
 *                 leaf max-plmn-list-entries {
 *                     type uint64;
 *                 }
 *                 leaf plmn-list-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list rem-lte-cell-bcch-plmn-list {
 *                     key "plmnid";
 *                     leaf plmnid {
 *                         type string;
 *                     }
 *                     leaf cell-reserved-for-operator-use {
 *                         type boolean;
 *                     }
 *                     uses rem-lte-cell-bcch-plmn-list-g;
 *                 }
 *                 uses rem-lte-cell-bcch-g;
 *             }
 *             uses rem-lte-cell-g;
 *         }
 *         list rem-lte-carrier-meas {
 *             key "carrier-arfcndl" "carrier-ch-width";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf carrier-arfcndl {
 *                 type carrier-arfcndl;
 *             }
 *             leaf carrier-ch-width {
 *                 type carrier-ch-width;
 *             }
 *             leaf carrier-rssi {
 *                 type carrier-rssi;
 *             }
 *             uses rem-lte-carrier-meas-g;
 *         }
 *         uses rem-lte-g;
 *     }
 *     container rem-cdma2000 {
 *         leaf in-service-handling {
 *             type enumeration;
 *         }
 *         leaf scan-on-boot {
 *             type boolean;
 *         }
 *         leaf scan-now {
 *             type boolean;
 *         }
 *         leaf return-timer {
 *             type return-timer;
 *         }
 *         leaf scan-periodically {
 *             type boolean;
 *         }
 *         leaf periodic-interval {
 *             type periodic-interval;
 *         }
 *         leaf periodic-time {
 *             type date-and-time;
 *         }
 *         leaf report-overheads {
 *             type enumeration;
 *         }
 *         leaf scan-timeout {
 *             type scan-timeout;
 *         }
 *         leaf scan-status {
 *             type enumeration;
 *         }
 *         leaf error-details {
 *             type string;
 *         }
 *         leaf last-scan-time {
 *             type date-and-time;
 *         }
 *         container rem-cdma2000-one-x {
 *             leaf max-cell-entries {
 *                 type uint64;
 *             }
 *             leaf cell-number-of-entries {
 *                 type uint64;
 *             }
 *             leaf max-channel-entries {
 *                 type uint64;
 *             }
 *             leaf channel-number-of-entries {
 *                 type uint64;
 *             }
 *             list rem-cdma2000-one-x-channel {
 *                 key "sniffing-band-class" "sniffing-channel-number";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf sniffing-band-class {
 *                     type uint8;
 *                 }
 *                 leaf sniffing-channel-number {
 *                     type uint16;
 *                 }
 *                 leaf-list pn-list {
 *                     type string;
 *                 }
 *                 uses rem-cdma2000-one-x-channel-g;
 *             }
 *             list rem-cdma2000-one-x-cell {
 *                 key "rem-cdma2000-one-x-cell-key";
 *                 leaf rem-cdma2000-one-x-cell-key {
 *                     type string;
 *                 }
 *                 container rem-cdma2000-one-x-cell-rf {
 *                     leaf band {
 *                         type int64;
 *                     }
 *                     leaf rfcnfl {
 *                         type uint16;
 *                     }
 *                     leaf io {
 *                         type io;
 *                     }
 *                     leaf p-ilot-pn {
 *                         type p-ilot-pn;
 *                     }
 *                     leaf p-ilot-pn-phase {
 *                         type p-ilot-pn-phase;
 *                     }
 *                     leaf pilot-strength-ecp {
 *                         type pilot-strength-ecp;
 *                     }
 *                     leaf pilot-strength-ecp-io {
 *                         type pilot-strength-ecp-io;
 *                     }
 *                     leaf overheads-available {
 *                         type boolean;
 *                     }
 *                     uses rem-cdma2000-one-x-cell-rf-g;
 *                 }
 *                 container rem-cdma2000-one-x-cell-control-channel {
 *                     leaf sid {
 *                         type int64;
 *                     }
 *                     leaf nid {
 *                         type int64;
 *                     }
 *                     leaf regzone {
 *                         type int64;
 *                     }
 *                     leaf baselat {
 *                         type int64;
 *                     }
 *                     leaf baselong {
 *                         type int64;
 *                     }
 *                     leaf mcc {
 *                         type int64;
 *                     }
 *                     leaf mncimsi1112 {
 *                         type int64;
 *                     }
 *                     leaf baseid {
 *                         type int64;
 *                     }
 *                     leaf apid {
 *                         type string;
 *                     }
 *                     leaf apidmask {
 *                         type int64;
 *                     }
 *                     leaf apidtext {
 *                         type string;
 *                     }
 *                     uses rem-cdma2000-one-x-cell-control-channel-g;
 *                 }
 *                 uses rem-cdma2000-one-x-cell-g;
 *             }
 *             uses rem-cdma2000-one-x-g;
 *         }
 *         container rem-cdma2000-hrpd {
 *             leaf max-cell-entries {
 *                 type uint64;
 *             }
 *             leaf cell-number-of-entries {
 *                 type uint64;
 *             }
 *             leaf max-channel-entries {
 *                 type uint64;
 *             }
 *             leaf channel-number-of-entries {
 *                 type uint64;
 *             }
 *             list rem-cdma2000-hrpd-channel {
 *                 key "sniffing-band-class" "sniffing-channel-number";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf sniffing-band-class {
 *                     type uint8;
 *                 }
 *                 leaf sniffing-channel-number {
 *                     type uint16;
 *                 }
 *                 leaf-list pn-list {
 *                     type string;
 *                 }
 *                 uses rem-cdma2000-hrpd-channel-g;
 *             }
 *             list rem-cdma2000-hrpd-cell {
 *                 key "rem-cdma2000-hrpd-cell-key";
 *                 leaf rem-cdma2000-hrpd-cell-key {
 *                     type string;
 *                 }
 *                 container rem-cdma2000-hrpd-cell-rf {
 *                     leaf band {
 *                         type int64;
 *                     }
 *                     leaf rfcnfl {
 *                         type uint16;
 *                     }
 *                     leaf io {
 *                         type io;
 *                     }
 *                     leaf p-ilot-pn {
 *                         type p-ilot-pn;
 *                     }
 *                     leaf p-ilot-pn-phase {
 *                         type p-ilot-pn-phase;
 *                     }
 *                     leaf pilot-strength-ecp {
 *                         type pilot-strength-ecp;
 *                     }
 *                     leaf pilot-strength-ecp-io {
 *                         type pilot-strength-ecp-io;
 *                     }
 *                     leaf overheads-available {
 *                         type boolean;
 *                     }
 *                     uses rem-cdma2000-hrpd-cell-rf-g;
 *                 }
 *                 container rem-cdma2000-hrpd-cell-control-channel {
 *                     leaf color-code {
 *                         type int64;
 *                     }
 *                     leaf sector-id {
 *                         type binary;
 *                     }
 *                     leaf subnet-mask {
 *                         type subnet-mask;
 *                     }
 *                     leaf country-code {
 *                         type int64;
 *                     }
 *                     leaf latitude {
 *                         type latitude;
 *                     }
 *                     leaf longitude {
 *                         type longitude;
 *                     }
 *                     uses rem-cdma2000-hrpd-cell-control-channel-g;
 *                 }
 *                 uses rem-cdma2000-hrpd-cell-g;
 *             }
 *             uses rem-cdma2000-hrpd-g;
 *         }
 *         container rem-cdma2000-macro-timing {
 *             leaf admin-state {
 *                 type uint8;
 *             }
 *             leaf tracking-channel-number {
 *                 type uint64;
 *             }
 *             leaf tracking-band-class {
 *                 type uint8;
 *             }
 *             leaf-list tracking-pn-offset {
 *                 type string;
 *             }
 *             leaf timing-source {
 *                 type uint8;
 *             }
 *             leaf channel-number-of-entries {
 *                 type uint64;
 *             }
 *             list rem-cdma2000-macro-timing-channel {
 *                 key "band-class" "channel-number";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf air-interface-type {
 *                     type uint8;
 *                 }
 *                 leaf band-class {
 *                     type uint8;
 *                 }
 *                 leaf channel-number {
 *                     type uint64;
 *                 }
 *                 leaf priority {
 *                     type uint64;
 *                 }
 *                 leaf-list pn-list {
 *                     type string;
 *                 }
 *                 uses rem-cdma2000-macro-timing-channel-g;
 *             }
 *             uses rem-cdma2000-macro-timing-g;
 *         }
 *         uses rem-cdma2000-g;
 *     }
 *     uses rem-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem</i>
 *
 * <p>To create instances of this class use {@link RemBuilder}.
 * @see RemBuilder
 *
 */
public interface Rem
    extends
    ChildOf<FapService>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Rem>,
    RemG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem").intern();

    /**
     * Container for object class FAPService.{i}.REM.UMTS.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemUmts</code> <code>remUmts</code>, or <code>null</code> if not present
     */
    RemUmts getRemUmts();
    
    /**
     * Container for object class FAPService.{i}.REM.LTE.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemLte</code> <code>remLte</code>, or <code>null</code> if not present
     */
    RemLte getRemLte();
    
    /**
     * Container for object class FAPService.{i}.REM.CDMA2000.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000</code> <code>remCdma2000</code>, or <code>null</code> if not present
     */
    RemCdma2000 getRemCdma2000();

}

