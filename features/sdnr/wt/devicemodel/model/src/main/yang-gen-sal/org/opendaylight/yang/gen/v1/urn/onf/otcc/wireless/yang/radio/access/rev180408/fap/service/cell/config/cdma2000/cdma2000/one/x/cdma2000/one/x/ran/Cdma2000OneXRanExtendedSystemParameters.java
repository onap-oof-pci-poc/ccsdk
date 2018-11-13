package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.ExtendedSystemParameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-extended-system-parameters {
 *     leaf prev {
 *         type uint8;
 *     }
 *     leaf p-min-rev {
 *         type uint8;
 *     }
 *     leaf delete-for-tmsi {
 *         type uint8;
 *     }
 *     leaf use-tmsi {
 *         type uint8;
 *     }
 *     leaf pref-msid-type {
 *         type uint8;
 *     }
 *     leaf mcc {
 *         type uint16;
 *     }
 *     leaf imsi1112 {
 *         type uint8;
 *     }
 *     leaf tmsi-zone-len {
 *         type uint8;
 *     }
 *     leaf tmsi-zone {
 *         type uint16;
 *     }
 *     leaf bcast-index {
 *         type uint8;
 *     }
 *     leaf imsit-supported {
 *         type int64;
 *     }
 *     leaf soft-slope {
 *         type uint8;
 *     }
 *     leaf add-intercept {
 *         type add-intercept;
 *     }
 *     leaf drop-intercept {
 *         type drop-intercept;
 *     }
 *     leaf max-num-alt-so {
 *         type uint8;
 *     }
 *     leaf reselected-included {
 *         type uint8;
 *     }
 *     leaf ec-thresh {
 *         type ec-thresh;
 *     }
 *     leaf ec-io-thresh {
 *         type uint64;
 *     }
 *     leaf pilot-report {
 *         type uint8;
 *     }
 *     leaf nghbr-set-entry-info {
 *         type uint8;
 *     }
 *     leaf access-ho-order {
 *         type uint8;
 *     }
 *     leaf nghbr-set-access-info {
 *         type uint8;
 *     }
 *     leaf access-ho {
 *         type uint8;
 *     }
 *     leaf access-ho-msg-rsp {
 *         type uint8;
 *     }
 *     leaf access-probe-ho {
 *         type uint8;
 *     }
 *     leaf acc-ho-list-upd {
 *         type uint8;
 *     }
 *     leaf acc-probe-ho-other-msg {
 *         type uint8;
 *     }
 *     leaf max-num-probe-ho {
 *         type uint8;
 *     }
 *     leaf brdcast-gps-assit {
 *         type uint8;
 *     }
 *     leaf qpch-supported {
 *         type uint8;
 *     }
 *     leaf num-qpch {
 *         type uint8;
 *     }
 *     leaf qpch-rate {
 *         type uint8;
 *     }
 *     leaf qpch-pwr-level-page {
 *         type uint8;
 *     }
 *     leaf qpc-hcci-supported {
 *         type uint8;
 *     }
 *     leaf qpch-pwr-level-config {
 *         type uint8;
 *     }
 *     leaf sdb-supported {
 *         type uint8;
 *     }
 *     leaf r-lgain-traffic-pilot {
 *         type r-lgain-traffic-pilot;
 *     }
 *     leaf rvs-pwr-ctrl-delay-incl {
 *         type uint8;
 *     }
 *     leaf rvs-pwr-ctrl-delay {
 *         type rvs-pwr-ctrl-delay;
 *     }
 *     uses cdma2000-one-x-ran-extended-system-parameters-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-extended-system-parameters</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanExtendedSystemParametersBuilder}.
 * @see Cdma2000OneXRanExtendedSystemParametersBuilder
 *
 */
public interface Cdma2000OneXRanExtendedSystemParameters
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>,
    Cdma2000OneXRanExtendedSystemParametersG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-extended-system-parameters").intern();


}

