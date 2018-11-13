package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanCellRestrictionG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.CellRestriction.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-cell-restriction {
 *     leaf cell-barred {
 *         type boolean;
 *     }
 *     leaf cell-reserved-for-operator-use {
 *         type boolean;
 *     }
 *     leaf barring-for-emergency {
 *         type boolean;
 *     }
 *     uses lte-ran-cell-restriction-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-cell-restriction</i>
 *
 * <p>To create instances of this class use {@link LteRanCellRestrictionBuilder}.
 * @see LteRanCellRestrictionBuilder
 *
 */
public interface LteRanCellRestriction
    extends
    ChildOf<LteRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>,
    LteRanCellRestrictionG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-cell-restriction").intern();


}

