package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.RF.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-rf {
 *     leaf-list uarfcndl {
 *         type string;
 *     }
 *     leaf uarfcndl-in-use {
 *         type uint64;
 *     }
 *     leaf uarfcnul-in-use {
 *         type uint64;
 *     }
 *     leaf-list uarfcndl-to-protect {
 *         type string;
 *     }
 *     leaf-list primary-scrambling-code {
 *         type string;
 *     }
 *     leaf primary-scrambling-code-in-use {
 *         type uint64;
 *     }
 *     leaf maxfap-tx-power-expanded {
 *         type string;
 *     }
 *     leaf maxfap-tx-power-in-use-expanded {
 *         type maxfap-tx-power-in-use-expanded;
 *     }
 *     leaf max-ul-tx-power {
 *         type string;
 *     }
 *     leaf max-ul-tx-power-in-use {
 *         type max-ul-tx-power-in-use;
 *     }
 *     leaf pcpich-power {
 *         type string;
 *     }
 *     leaf pcpich-power-in-use {
 *         type pcpich-power-in-use;
 *     }
 *     leaf power-offset-pilot-dpdch {
 *         type power-offset-pilot-dpdch;
 *     }
 *     leaf fap-coverage-target {
 *         type fap-coverage-target;
 *     }
 *     leaf fap-quality-target-ec-io {
 *         type fap-quality-target-ec-io;
 *     }
 *     leaf psch-power {
 *         type psch-power;
 *     }
 *     leaf ssch-power {
 *         type ssch-power;
 *     }
 *     leaf pich-power {
 *         type pich-power;
 *     }
 *     leaf pch-power {
 *         type pch-power;
 *     }
 *     leaf fach-power {
 *         type fach-power;
 *     }
 *     leaf bch-power {
 *         type bch-power;
 *     }
 *     leaf aich-power {
 *         type aich-power;
 *     }
 *     leaf ctch-allocation-period {
 *         type uint8;
 *     }
 *     leaf cbs-frame-offset {
 *         type uint8;
 *     }
 *     leaf max-tti {
 *         type uint8;
 *     }
 *     leaf noise-rise-limit-lower-value {
 *         type uint16;
 *     }
 *     leaf noise-rise-limit-upper-value {
 *         type uint16;
 *     }
 *     leaf noise-rise-limit-in-use {
 *         type uint16;
 *     }
 *     uses umts-ran-rf-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-rf</i>
 *
 * <p>To create instances of this class use {@link UmtsRanRfBuilder}.
 * @see UmtsRanRfBuilder
 *
 */
public interface UmtsRanRf
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>,
    UmtsRanRfG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-rf").intern();


}

