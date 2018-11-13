package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.IntraFreqMeas.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-intra-freq-meas {
 *     leaf measurement-quantity {
 *         type enumeration;
 *     }
 *     leaf filter-coefficient {
 *         type uint8;
 *     }
 *     leaf-list intra-frequency-event-identity {
 *         type string;
 *     }
 *     leaf-list triggering-condition2-event1a {
 *         type enumeration;
 *     }
 *     leaf-list triggering-condition1-event1b {
 *         type enumeration;
 *     }
 *     leaf-list triggering-condition2-event1e {
 *         type enumeration;
 *     }
 *     leaf-list triggering-condition1-event1f {
 *         type enumeration;
 *     }
 *     leaf reporting-range-event1a {
 *         type reporting-range-event1a;
 *     }
 *     leaf reporting-range-event1b {
 *         type reporting-range-event1b;
 *     }
 *     leaf weighting-factor-event1a {
 *         type uint8;
 *     }
 *     leaf weighting-factor-event1b {
 *         type uint8;
 *     }
 *     leaf report-deactivation-threshold-event1a {
 *         type uint8;
 *     }
 *     leaf reporting-amount-event1a {
 *         type int64;
 *     }
 *     leaf reporting-amount-event1c {
 *         type int64;
 *     }
 *     leaf reporting-interval-event1a {
 *         type reporting-interval-event1a;
 *     }
 *     leaf reporting-interval-event1c {
 *         type reporting-interval-event1c;
 *     }
 *     leaf hysteresis-event1a {
 *         type uint8;
 *     }
 *     leaf hysteresis-event1b {
 *         type uint8;
 *     }
 *     leaf hysteresis-event1c {
 *         type uint8;
 *     }
 *     leaf hysteresis-event1d {
 *         type uint8;
 *     }
 *     leaf hysteresis-event1e {
 *         type uint8;
 *     }
 *     leaf hysteresis-event1f {
 *         type uint8;
 *     }
 *     leaf time-to-trigger-event1a {
 *         type time-to-trigger-event1a;
 *     }
 *     leaf time-to-trigger-event1b {
 *         type time-to-trigger-event1b;
 *     }
 *     leaf time-to-trigger-event1c {
 *         type time-to-trigger-event1c;
 *     }
 *     leaf time-to-trigger-event1d {
 *         type time-to-trigger-event1d;
 *     }
 *     leaf time-to-trigger-event1e {
 *         type time-to-trigger-event1e;
 *     }
 *     leaf time-to-trigger-event1f {
 *         type time-to-trigger-event1f;
 *     }
 *     leaf threshold-used-frequency-event1e {
 *         type int64;
 *     }
 *     leaf threshold-used-frequency-event1f {
 *         type int64;
 *     }
 *     leaf replacement-activation-threshold-event1c {
 *         type uint8;
 *     }
 *     leaf instance-number-of-entries {
 *         type uint64;
 *     }
 *     list umts-ran-intra-freq-meas-instance {
 *         key "intra-frequency-event-identity";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf intra-frequency-event-identity {
 *             type enumeration;
 *         }
 *         leaf event-description {
 *             type string;
 *         }
 *         leaf measurement-quantity {
 *             type enumeration;
 *         }
 *         leaf filter-coefficient {
 *             type uint8;
 *         }
 *         leaf-list triggering-condition {
 *             type enumeration;
 *         }
 *         leaf reporting-range {
 *             type reporting-range;
 *         }
 *         leaf weighting-factor {
 *             type uint8;
 *         }
 *         leaf report-deactivation-threshold {
 *             type uint8;
 *         }
 *         leaf reporting-amount {
 *             type int64;
 *         }
 *         leaf reporting-interval {
 *             type reporting-interval;
 *         }
 *         leaf hysteresis {
 *             type uint8;
 *         }
 *         leaf time-to-trigger {
 *             type time-to-trigger;
 *         }
 *         leaf threshold-used-frequency {
 *             type int64;
 *         }
 *         leaf replacement-activation-threshold {
 *             type uint8;
 *         }
 *         uses umts-ran-intra-freq-meas-instance-g;
 *     }
 *     uses umts-ran-intra-freq-meas-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-intra-freq-meas</i>
 *
 * <p>To create instances of this class use {@link UmtsRanIntraFreqMeasBuilder}.
 * @see UmtsRanIntraFreqMeasBuilder
 *
 */
public interface UmtsRanIntraFreqMeas
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>,
    UmtsRanIntraFreqMeasG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-intra-freq-meas").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.IntraFreqMeas.Instance.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>umtsRanIntraFreqMeasInstance</code>, or <code>null</code> if not present
     */
    List<UmtsRanIntraFreqMeasInstance> getUmtsRanIntraFreqMeasInstance();

}

