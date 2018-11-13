package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanUeInternalMeasG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.UEInternalMeas.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-ue-internal-meas {
 *     leaf filter-coefficient {
 *         type uint8;
 *     }
 *     leaf ue-tx-pwr-threshold-event6a {
 *         type ue-tx-pwr-threshold-event6a;
 *     }
 *     leaf time-to-trigger-event6a {
 *         type time-to-trigger-event6a;
 *     }
 *     leaf ue-tx-pwr-threshold-event6b {
 *         type ue-tx-pwr-threshold-event6b;
 *     }
 *     leaf time-to-trigger-event6b {
 *         type time-to-trigger-event6b;
 *     }
 *     uses umts-ran-ue-internal-meas-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-ue-internal-meas</i>
 *
 * <p>To create instances of this class use {@link UmtsRanUeInternalMeasBuilder}.
 * @see UmtsRanUeInternalMeasBuilder
 *
 */
public interface UmtsRanUeInternalMeas
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>,
    UmtsRanUeInternalMeasG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-ue-internal-meas").intern();


}

