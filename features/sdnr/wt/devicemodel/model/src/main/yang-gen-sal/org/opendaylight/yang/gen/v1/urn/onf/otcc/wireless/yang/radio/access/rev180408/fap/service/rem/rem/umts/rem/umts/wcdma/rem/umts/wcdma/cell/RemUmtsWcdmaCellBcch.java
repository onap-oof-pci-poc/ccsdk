package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo;

/**
 * Container for object class FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.BCCH.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-umts-wcdma-cell-bcch {
 *     leaf plmn-type {
 *         type enumeration;
 *     }
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf lac {
 *         type uint16;
 *     }
 *     leaf rac {
 *         type uint8;
 *     }
 *     leaf cell-id {
 *         type uint32;
 *     }
 *     leaf pcpich-tx-power {
 *         type int64;
 *     }
 *     leaf csg-indicator {
 *         type boolean;
 *     }
 *     leaf csgid {
 *         type uint32;
 *     }
 *     leaf-list uarfcndl-list {
 *         type uint16;
 *     }
 *     container rem-umts-wcdma-cell-bcch-csgpsc-split-info {
 *         leaf start-psc-range1-coefficient {
 *             type uint8;
 *         }
 *         leaf number-of-ps-cs {
 *             type enumeration;
 *         }
 *         leaf psc-range2-offset {
 *             type uint8;
 *         }
 *         uses rem-umts-wcdma-cell-bcch-csgpsc-split-info-g;
 *     }
 *     container rem-umts-wcdma-cell-bcch-reference-position {
 *         leaf latitude {
 *             type int64;
 *         }
 *         leaf longitude {
 *             type int64;
 *         }
 *         leaf uncertainty-semi-major {
 *             type uint8;
 *         }
 *         leaf uncertainty-semi-minor {
 *             type uint8;
 *         }
 *         leaf orientation-of-major-axis {
 *             type uint8;
 *         }
 *         leaf confidence {
 *             type confidence;
 *         }
 *         uses rem-umts-wcdma-cell-bcch-reference-position-g;
 *     }
 *     uses rem-umts-wcdma-cell-bcch-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-umts/rem-umts-wcdma/rem-umts-wcdma-cell/rem-umts-wcdma-cell-bcch</i>
 *
 * <p>To create instances of this class use {@link RemUmtsWcdmaCellBcchBuilder}.
 * @see RemUmtsWcdmaCellBcchBuilder
 *
 */
public interface RemUmtsWcdmaCellBcch
    extends
    ChildOf<RemUmtsWcdmaCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>,
    RemUmtsWcdmaCellBcchG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-wcdma-cell-bcch").intern();

    /**
     * Container for object class 
     * FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.BCCH.CSGPSCSplitInfo.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo</code> <code>remUmtsWcdmaCellBcchCsgpscSplitInfo</code>, or <code>null</code> if not present
     */
    RemUmtsWcdmaCellBcchCsgpscSplitInfo getRemUmtsWcdmaCellBcchCsgpscSplitInfo();
    
    /**
     * Container for object class 
     * FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.BCCH.ReferencePosition.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition</code> <code>remUmtsWcdmaCellBcchReferencePosition</code>, or <code>null</code> if not present
     */
    RemUmtsWcdmaCellBcchReferencePosition getRemUmtsWcdmaCellBcchReferencePosition();

}

