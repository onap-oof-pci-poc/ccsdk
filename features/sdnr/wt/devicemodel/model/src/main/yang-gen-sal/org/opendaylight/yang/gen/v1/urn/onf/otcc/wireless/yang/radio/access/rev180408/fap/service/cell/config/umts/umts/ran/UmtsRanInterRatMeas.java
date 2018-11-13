package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.rat.meas.UmtsRanInterRatMeasInstance;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.InterRATMeas.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-inter-rat-meas {
 *     leaf gsm-filter-coefficient {
 *         type uint8;
 *     }
 *     leaf bsic-verification-required {
 *         type boolean;
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
 *     leaf threshold-own-system {
 *         type int64;
 *     }
 *     leaf threshold-other-system {
 *         type int64;
 *     }
 *     leaf instance-number-of-entries {
 *         type uint64;
 *     }
 *     list umts-ran-inter-rat-meas-instance {
 *         key "inter-rat-event-identity";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf inter-rat-event-identity {
 *             type enumeration;
 *         }
 *         leaf event-description {
 *             type string;
 *         }
 *         leaf filter-coefficient {
 *             type uint8;
 *         }
 *         leaf bsic-verification-required {
 *             type boolean;
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
 *         leaf threshold-own-system {
 *             type int64;
 *         }
 *         leaf threshold-other-system {
 *             type int64;
 *         }
 *         uses umts-ran-inter-rat-meas-instance-g;
 *     }
 *     uses umts-ran-inter-rat-meas-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-inter-rat-meas</i>
 *
 * <p>To create instances of this class use {@link UmtsRanInterRatMeasBuilder}.
 * @see UmtsRanInterRatMeasBuilder
 *
 */
public interface UmtsRanInterRatMeas
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>,
    UmtsRanInterRatMeasG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-inter-rat-meas").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.InterRATMeas.Instance.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>umtsRanInterRatMeasInstance</code>, or <code>null</code> if not present
     */
    List<UmtsRanInterRatMeasInstance> getUmtsRanInterRatMeasInstance();

}

