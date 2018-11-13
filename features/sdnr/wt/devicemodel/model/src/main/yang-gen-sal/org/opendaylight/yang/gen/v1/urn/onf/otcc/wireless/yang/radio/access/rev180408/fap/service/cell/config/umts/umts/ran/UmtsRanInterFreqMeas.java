package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.InterFreqMeas.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-inter-freq-meas {
 *     leaf measurement-quantity {
 *         type enumeration;
 *     }
 *     leaf filter-coefficient {
 *         type uint8;
 *     }
 *     leaf-list inter-frequency-event-identity {
 *         type string;
 *     }
 *     leaf weighting-factor-event2a {
 *         type uint8;
 *     }
 *     leaf weighting-factor-event2b {
 *         type uint8;
 *     }
 *     leaf weighting-factor-event2d {
 *         type uint8;
 *     }
 *     leaf weighting-factor-event2f {
 *         type uint8;
 *     }
 *     leaf hysteresis-event2a {
 *         type uint8;
 *     }
 *     leaf hysteresis-event2b {
 *         type uint8;
 *     }
 *     leaf hysteresis-event2d {
 *         type uint8;
 *     }
 *     leaf hysteresis-event2f {
 *         type uint8;
 *     }
 *     leaf time-to-trigger-event2a {
 *         type time-to-trigger-event2a;
 *     }
 *     leaf time-to-trigger-event2b {
 *         type time-to-trigger-event2b;
 *     }
 *     leaf time-to-trigger-event2d {
 *         type time-to-trigger-event2d;
 *     }
 *     leaf time-to-trigger-event2f {
 *         type time-to-trigger-event2f;
 *     }
 *     leaf threshold-used-frequency-event2b {
 *         type int64;
 *     }
 *     leaf threshold-used-frequency-event2d {
 *         type int64;
 *     }
 *     leaf threshold-used-frequency-event2f {
 *         type int64;
 *     }
 *     leaf instance-number-of-entries {
 *         type uint64;
 *     }
 *     list umts-ran-inter-freq-meas-instance {
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
 *         leaf weighting-factor {
 *             type uint8;
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
 *         leaf threshold-non-used-frequency {
 *             type int64;
 *         }
 *         uses umts-ran-inter-freq-meas-instance-g;
 *     }
 *     uses umts-ran-inter-freq-meas-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-inter-freq-meas</i>
 *
 * <p>To create instances of this class use {@link UmtsRanInterFreqMeasBuilder}.
 * @see UmtsRanInterFreqMeasBuilder
 *
 */
public interface UmtsRanInterFreqMeas
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>,
    UmtsRanInterFreqMeasG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-inter-freq-meas").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.InterFreqMeas.Instance.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>umtsRanInterFreqMeasInstance</code>, or <code>null</code> if not present
     */
    List<UmtsRanInterFreqMeasInstance> getUmtsRanInterFreqMeasInstance();

}

