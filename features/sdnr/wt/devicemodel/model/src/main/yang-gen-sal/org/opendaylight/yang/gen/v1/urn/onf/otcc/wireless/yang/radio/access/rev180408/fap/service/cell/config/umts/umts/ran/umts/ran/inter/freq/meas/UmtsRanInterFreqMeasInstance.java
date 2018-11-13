package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.UMTS.RAN.InterFreqMeas.Instance.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list umts-ran-inter-freq-meas-instance {
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
 *     leaf weighting-factor {
 *         type uint8;
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
 *     leaf threshold-non-used-frequency {
 *         type int64;
 *     }
 *     uses umts-ran-inter-freq-meas-instance-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-inter-freq-meas/umts-ran-inter-freq-meas-instance</i>
 *
 * <p>To create instances of this class use {@link UmtsRanInterFreqMeasInstanceBuilder}.
 * @see UmtsRanInterFreqMeasInstanceBuilder
 * @see UmtsRanInterFreqMeasInstanceKey
 *
 */
public interface UmtsRanInterFreqMeasInstance
    extends
    ChildOf<UmtsRanInterFreqMeas>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>,
    UmtsRanInterFreqMeasInstanceG,
    Identifiable<UmtsRanInterFreqMeasInstanceKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-inter-freq-meas-instance").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstanceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UmtsRanInterFreqMeasInstanceKey getKey();

}

