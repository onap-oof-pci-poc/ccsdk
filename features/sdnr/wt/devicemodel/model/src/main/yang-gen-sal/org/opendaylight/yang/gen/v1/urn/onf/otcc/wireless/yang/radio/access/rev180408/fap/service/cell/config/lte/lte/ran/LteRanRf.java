package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.RF.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-rf {
 *     leaf-list earfcndl {
 *         type uint16;
 *     }
 *     leaf-list earfcnul {
 *         type uint16;
 *     }
 *     leaf freq-band-indicator {
 *         type uint8;
 *     }
 *     leaf-list dl-bandwidth {
 *         type uint8;
 *     }
 *     leaf-list ul-bandwidth {
 *         type uint8;
 *     }
 *     leaf-list reference-signal-power {
 *         type string;
 *     }
 *     leaf-list phy-cell-id {
 *         type string;
 *     }
 *     leaf-list psch-power-offset {
 *         type string;
 *     }
 *     leaf-list ssch-power-offset {
 *         type string;
 *     }
 *     leaf-list pbch-power-offset {
 *         type string;
 *     }
 *     uses lte-ran-rf-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-rf</i>
 *
 * <p>To create instances of this class use {@link LteRanRfBuilder}.
 * @see LteRanRfBuilder
 *
 */
public interface LteRanRf
    extends
    ChildOf<LteRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>,
    LteRanRfG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-rf").intern();


}

