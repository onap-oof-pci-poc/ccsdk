package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.rat.meas;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasInstanceG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.UMTS.RAN.InterRATMeas.Instance.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list umts-ran-inter-rat-meas-instance {
 *     key "inter-rat-event-identity";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf inter-rat-event-identity {
 *         type enumeration;
 *     }
 *     leaf event-description {
 *         type string;
 *     }
 *     leaf filter-coefficient {
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
 *     uses umts-ran-inter-rat-meas-instance-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-inter-rat-meas/umts-ran-inter-rat-meas-instance</i>
 *
 * <p>To create instances of this class use {@link UmtsRanInterRatMeasInstanceBuilder}.
 * @see UmtsRanInterRatMeasInstanceBuilder
 * @see UmtsRanInterRatMeasInstanceKey
 *
 */
public interface UmtsRanInterRatMeasInstance
    extends
    ChildOf<UmtsRanInterRatMeas>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.rat.meas.UmtsRanInterRatMeasInstance>,
    UmtsRanInterRatMeasInstanceG,
    Identifiable<UmtsRanInterRatMeasInstanceKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-inter-rat-meas-instance").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.rat.meas.UmtsRanInterRatMeasInstanceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UmtsRanInterRatMeasInstanceKey getKey();

}

