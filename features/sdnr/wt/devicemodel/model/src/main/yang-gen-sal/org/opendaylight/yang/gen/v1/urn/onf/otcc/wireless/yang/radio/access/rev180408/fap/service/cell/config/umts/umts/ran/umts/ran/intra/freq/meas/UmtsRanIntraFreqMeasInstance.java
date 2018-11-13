package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.UMTS.RAN.IntraFreqMeas.Instance.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list umts-ran-intra-freq-meas-instance {
 *     key "intra-frequency-event-identity";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf intra-frequency-event-identity {
 *         type enumeration;
 *     }
 *     leaf event-description {
 *         type string;
 *     }
 *     leaf measurement-quantity {
 *         type enumeration;
 *     }
 *     leaf filter-coefficient {
 *         type uint8;
 *     }
 *     leaf-list triggering-condition {
 *         type enumeration;
 *     }
 *     leaf reporting-range {
 *         type reporting-range;
 *     }
 *     leaf weighting-factor {
 *         type uint8;
 *     }
 *     leaf report-deactivation-threshold {
 *         type uint8;
 *     }
 *     leaf reporting-amount {
 *         type int64;
 *     }
 *     leaf reporting-interval {
 *         type reporting-interval;
 *     }
 *     leaf hysteresis {
 *         type uint8;
 *     }
 *     leaf time-to-trigger {
 *         type time-to-trigger;
 *     }
 *     leaf threshold-used-frequency {
 *         type int64;
 *     }
 *     leaf replacement-activation-threshold {
 *         type uint8;
 *     }
 *     uses umts-ran-intra-freq-meas-instance-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-intra-freq-meas/umts-ran-intra-freq-meas-instance</i>
 *
 * <p>To create instances of this class use {@link UmtsRanIntraFreqMeasInstanceBuilder}.
 * @see UmtsRanIntraFreqMeasInstanceBuilder
 * @see UmtsRanIntraFreqMeasInstanceKey
 *
 */
public interface UmtsRanIntraFreqMeasInstance
    extends
    ChildOf<UmtsRanIntraFreqMeas>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>,
    UmtsRanIntraFreqMeasInstanceG,
    Identifiable<UmtsRanIntraFreqMeasInstanceKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-intra-freq-meas-instance").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstanceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UmtsRanIntraFreqMeasInstanceKey getKey();

}

