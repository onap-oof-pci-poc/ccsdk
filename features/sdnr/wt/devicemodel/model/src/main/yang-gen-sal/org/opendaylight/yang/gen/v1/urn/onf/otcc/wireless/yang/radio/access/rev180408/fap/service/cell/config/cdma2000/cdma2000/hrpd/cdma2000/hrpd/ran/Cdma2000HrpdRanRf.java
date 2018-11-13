package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRan;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.HRPD.RAN.RF.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-hrpd-ran-rf {
 *     leaf hrpd-car-band-class {
 *         type uint8;
 *     }
 *     leaf-list rfcnfl {
 *         type string;
 *     }
 *     leaf rfcnfl-in-use {
 *         type uint64;
 *     }
 *     leaf-list pilot-pn {
 *         type string;
 *     }
 *     leaf pilot-pn-in-use {
 *         type uint64;
 *     }
 *     leaf maxfap-tx-power {
 *         type string;
 *     }
 *     leaf maxfap-tx-power-in-use {
 *         type maxfap-tx-power-in-use;
 *     }
 *     leaf control-channel-rate {
 *         type int64;
 *     }
 *     leaf sync-capsule-offset {
 *         type int64;
 *     }
 *     leaf rab-length {
 *         type int64;
 *     }
 *     leaf rab-offset {
 *         type int64;
 *     }
 *     leaf sector-id {
 *         type binary;
 *     }
 *     leaf color-code {
 *         type int64;
 *     }
 *     leaf subnet-mask-length {
 *         type subnet-mask-length;
 *     }
 *     leaf hrpd-sec-el-reverse-link-silence-duration {
 *         type hrpd-sec-el-reverse-link-silence-duration;
 *     }
 *     leaf hrpd-sec-el-reverse-link-silence-period {
 *         type hrpd-sec-el-reverse-link-silence-period;
 *     }
 *     leaf open-loop-adjust {
 *         type open-loop-adjust;
 *     }
 *     leaf probe-initial-adjust {
 *         type probe-initial-adjust;
 *     }
 *     leaf probe-num-steps {
 *         type int64;
 *     }
 *     leaf probe-power-step {
 *         type probe-power-step;
 *     }
 *     leaf a-persistence {
 *         type string;
 *     }
 *     leaf rssirab-threshold {
 *         type rssirab-threshold;
 *     }
 *     leaf load-rab-threshold {
 *         type load-rab-threshold;
 *     }
 *     leaf connection-rate-limit {
 *         type uint8;
 *     }
 *     leaf rfe-rl-balance-ratio {
 *         type uint8;
 *     }
 *     uses cdma2000-hrpd-ran-rf-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd/cdma2000-hrpd-ran/cdma2000-hrpd-ran-rf</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdRanRfBuilder}.
 * @see Cdma2000HrpdRanRfBuilder
 *
 */
public interface Cdma2000HrpdRanRf
    extends
    ChildOf<Cdma2000HrpdRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>,
    Cdma2000HrpdRanRfG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-ran-rf").intern();


}

