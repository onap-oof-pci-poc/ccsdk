package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanDrxG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.DRX.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-drx {
 *     leaf drx-cycle-length-coefficient-cs {
 *         type uint8;
 *     }
 *     leaf drx-cycle-length-coefficient-ps {
 *         type uint8;
 *     }
 *     leaf utrandrx-cycle-length-coefficient {
 *         type uint8;
 *     }
 *     uses umts-ran-drx-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-drx</i>
 *
 * <p>To create instances of this class use {@link UmtsRanDrxBuilder}.
 * @see UmtsRanDrxBuilder
 *
 */
public interface UmtsRanDrx
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>,
    UmtsRanDrxG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-drx").intern();


}

