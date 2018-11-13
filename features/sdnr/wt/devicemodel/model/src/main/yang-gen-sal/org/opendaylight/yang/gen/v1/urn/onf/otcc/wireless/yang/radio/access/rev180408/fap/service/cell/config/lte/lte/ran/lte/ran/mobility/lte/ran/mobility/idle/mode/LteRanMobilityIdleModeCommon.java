package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.Common.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mobility-idle-mode-common {
 *     leaf-list qhyst {
 *         type string;
 *     }
 *     leaf q-hyst-sf-medium {
 *         type q-hyst-sf-medium;
 *     }
 *     leaf q-hyst-sf-high {
 *         type q-hyst-sf-high;
 *     }
 *     leaf t-evaluation {
 *         type t-evaluation;
 *     }
 *     leaf t-hyst-normal {
 *         type t-hyst-normal;
 *     }
 *     leaf n-cell-change-medium {
 *         type uint8;
 *     }
 *     leaf n-cell-change-high {
 *         type uint8;
 *     }
 *     uses lte-ran-mobility-idle-mode-common-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-common</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeCommonBuilder}.
 * @see LteRanMobilityIdleModeCommonBuilder
 *
 */
public interface LteRanMobilityIdleModeCommon
    extends
    ChildOf<LteRanMobilityIdleMode>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>,
    LteRanMobilityIdleModeCommonG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-common").intern();


}

