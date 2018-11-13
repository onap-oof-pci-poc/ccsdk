package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.CellSelection.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-cell-selection {
 *     leaf quality-measure-cpich {
 *         type enumeration;
 *     }
 *     leaf qqual-min {
 *         type qqual-min;
 *     }
 *     leaf qqual-min-offset {
 *         type qqual-min-offset;
 *     }
 *     leaf q-rx-lev-min {
 *         type q-rx-lev-min;
 *     }
 *     leaf delta-q-rx-lev-min {
 *         type delta-q-rx-lev-min;
 *     }
 *     leaf q-rx-lev-min-offset {
 *         type q-rx-lev-min-offset;
 *     }
 *     leaf q-hyst1s {
 *         type uint8;
 *     }
 *     leaf q-hyst2s {
 *         type uint8;
 *     }
 *     leaf t-reselections {
 *         type t-reselections;
 *     }
 *     leaf s-intrasearch {
 *         type int64;
 *     }
 *     leaf s-intersearch {
 *         type int64;
 *     }
 *     leaf s-search-hcs {
 *         type int64;
 *     }
 *     leaf s-search-rat {
 *         type int64;
 *     }
 *     leaf shcsrat {
 *         type int64;
 *     }
 *     leaf s-limit-search-rat {
 *         type int64;
 *     }
 *     leaf non-hcstcr-max {
 *         type enumeration;
 *     }
 *     leaf non-hcsncr {
 *         type uint8;
 *     }
 *     leaf non-hcstcr-max-hyst {
 *         type enumeration;
 *     }
 *     leaf qhcs {
 *         type qhcs;
 *     }
 *     leaf use-of-hcs {
 *         type boolean;
 *     }
 *     leaf hcs-prio {
 *         type hcs-prio;
 *     }
 *     leaf tcr-max {
 *         type enumeration;
 *     }
 *     leaf ncr {
 *         type uint8;
 *     }
 *     leaf tcr-max-hyst {
 *         type enumeration;
 *     }
 *     leaf ue-tx-pwr-max-rach {
 *         type ue-tx-pwr-max-rach;
 *     }
 *     uses umts-ran-cell-selection-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-cell-selection</i>
 *
 * <p>To create instances of this class use {@link UmtsRanCellSelectionBuilder}.
 * @see UmtsRanCellSelectionBuilder
 *
 */
public interface UmtsRanCellSelection
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>,
    UmtsRanCellSelectionG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-cell-selection").intern();


}

