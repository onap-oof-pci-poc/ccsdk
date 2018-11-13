package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.BCCH.ReferencePosition.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-umts-wcdma-cell-bcch-reference-position {
 *     leaf latitude {
 *         type int64;
 *     }
 *     leaf longitude {
 *         type int64;
 *     }
 *     leaf uncertainty-semi-major {
 *         type uint8;
 *     }
 *     leaf uncertainty-semi-minor {
 *         type uint8;
 *     }
 *     leaf orientation-of-major-axis {
 *         type uint8;
 *     }
 *     leaf confidence {
 *         type confidence;
 *     }
 *     uses rem-umts-wcdma-cell-bcch-reference-position-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-umts/rem-umts-wcdma/rem-umts-wcdma-cell/rem-umts-wcdma-cell-bcch/rem-umts-wcdma-cell-bcch-reference-position</i>
 *
 * <p>To create instances of this class use {@link RemUmtsWcdmaCellBcchReferencePositionBuilder}.
 * @see RemUmtsWcdmaCellBcchReferencePositionBuilder
 *
 */
public interface RemUmtsWcdmaCellBcchReferencePosition
    extends
    ChildOf<RemUmtsWcdmaCellBcch>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>,
    RemUmtsWcdmaCellBcchReferencePositionG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-wcdma-cell-bcch-reference-position").intern();


}

