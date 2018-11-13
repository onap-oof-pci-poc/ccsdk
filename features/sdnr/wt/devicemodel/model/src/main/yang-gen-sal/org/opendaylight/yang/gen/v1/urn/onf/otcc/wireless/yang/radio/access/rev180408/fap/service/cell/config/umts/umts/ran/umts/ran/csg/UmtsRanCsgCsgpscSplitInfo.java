package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.csg;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCsgCsgpscSplitInfoG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCsg;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.UMTS.RAN.CSG.CSGPSCSplitInfo.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-csg-csgpsc-split-info {
 *     leaf start-psc-range1-coefficient {
 *         type uint8;
 *     }
 *     leaf number-of-ps-cs {
 *         type enumeration;
 *     }
 *     leaf psc-range2-offset {
 *         type uint8;
 *     }
 *     uses umts-ran-csg-csgpsc-split-info-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-csg/umts-ran-csg-csgpsc-split-info</i>
 *
 * <p>To create instances of this class use {@link UmtsRanCsgCsgpscSplitInfoBuilder}.
 * @see UmtsRanCsgCsgpscSplitInfoBuilder
 *
 */
public interface UmtsRanCsgCsgpscSplitInfo
    extends
    ChildOf<UmtsRanCsg>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.csg.UmtsRanCsgCsgpscSplitInfo>,
    UmtsRanCsgCsgpscSplitInfoG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-csg-csgpsc-split-info").intern();


}

