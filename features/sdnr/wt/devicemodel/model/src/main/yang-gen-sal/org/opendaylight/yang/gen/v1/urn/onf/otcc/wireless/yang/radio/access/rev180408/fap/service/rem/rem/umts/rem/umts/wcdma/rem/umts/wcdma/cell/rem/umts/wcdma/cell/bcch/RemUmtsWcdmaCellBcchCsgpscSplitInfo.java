package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchCsgpscSplitInfoG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.BCCH.CSGPSCSplitInfo.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-umts-wcdma-cell-bcch-csgpsc-split-info {
 *     leaf start-psc-range1-coefficient {
 *         type uint8;
 *     }
 *     leaf number-of-ps-cs {
 *         type enumeration;
 *     }
 *     leaf psc-range2-offset {
 *         type uint8;
 *     }
 *     uses rem-umts-wcdma-cell-bcch-csgpsc-split-info-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-umts/rem-umts-wcdma/rem-umts-wcdma-cell/rem-umts-wcdma-cell-bcch/rem-umts-wcdma-cell-bcch-csgpsc-split-info</i>
 *
 * <p>To create instances of this class use {@link RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder}.
 * @see RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder
 *
 */
public interface RemUmtsWcdmaCellBcchCsgpscSplitInfo
    extends
    ChildOf<RemUmtsWcdmaCellBcch>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>,
    RemUmtsWcdmaCellBcchCsgpscSplitInfoG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-wcdma-cell-bcch-csgpsc-split-info").intern();


}

