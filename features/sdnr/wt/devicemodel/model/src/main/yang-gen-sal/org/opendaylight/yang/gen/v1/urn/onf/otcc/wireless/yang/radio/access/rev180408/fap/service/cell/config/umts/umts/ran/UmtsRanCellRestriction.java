package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.CellRestriction.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-cell-restriction {
 *     leaf cell-barred {
 *         type boolean;
 *     }
 *     leaf intra-freq-cell-reselection-indicator {
 *         type boolean;
 *     }
 *     leaf t-barred {
 *         type t-barred;
 *     }
 *     leaf-list access-class-barred-list-cs {
 *         type uint8;
 *     }
 *     leaf-list access-class-barred-list-ps {
 *         type uint8;
 *     }
 *     leaf cell-reserved-for-operator-use {
 *         type boolean;
 *     }
 *     uses umts-ran-cell-restriction-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-cell-restriction</i>
 *
 * <p>To create instances of this class use {@link UmtsRanCellRestrictionBuilder}.
 * @see UmtsRanCellRestrictionBuilder
 *
 */
public interface UmtsRanCellRestriction
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>,
    UmtsRanCellRestrictionG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-cell-restriction").intern();


}

