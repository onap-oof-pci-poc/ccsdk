package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.PowerControl.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-power-control {
 *     leaf constant-value {
 *         type constant-value;
 *     }
 *     leaf power-ramp-step-up {
 *         type power-ramp-step-up;
 *     }
 *     leaf preamble-retrans-max {
 *         type uint8;
 *     }
 *     leaf persistence-scale-factor {
 *         type uint8;
 *     }
 *     leaf m-max {
 *         type uint8;
 *     }
 *     leaf nb01-min {
 *         type uint8;
 *     }
 *     leaf nb01-max {
 *         type uint8;
 *     }
 *     uses umts-ran-power-control-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-power-control</i>
 *
 * <p>To create instances of this class use {@link UmtsRanPowerControlBuilder}.
 * @see UmtsRanPowerControlBuilder
 *
 */
public interface UmtsRanPowerControl
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>,
    UmtsRanPowerControlG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-power-control").intern();


}

