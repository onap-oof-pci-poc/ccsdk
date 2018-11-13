package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsWcdma;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list rem-umts-wcdma-cell {
 *     key "rem-umts-wcdma-cell-key";
 *     leaf rem-umts-wcdma-cell-key {
 *         type string;
 *     }
 *     container rem-umts-wcdma-cell-rf {
 *         leaf uarfcndl {
 *             type uint16;
 *         }
 *         leaf cpichrscp {
 *             type cpichrscp;
 *         }
 *         leaf cpich-ec-no {
 *             type cpich-ec-no;
 *         }
 *         leaf rssi {
 *             type rssi;
 *         }
 *         leaf primary-scrambling-code {
 *             type uint16;
 *         }
 *         uses rem-umts-wcdma-cell-rf-g;
 *     }
 *     container rem-umts-wcdma-cell-bcch {
 *         leaf plmn-type {
 *             type enumeration;
 *         }
 *         leaf plmnid {
 *             type string;
 *         }
 *         leaf lac {
 *             type uint16;
 *         }
 *         leaf rac {
 *             type uint8;
 *         }
 *         leaf cell-id {
 *             type uint32;
 *         }
 *         leaf pcpich-tx-power {
 *             type int64;
 *         }
 *         leaf csg-indicator {
 *             type boolean;
 *         }
 *         leaf csgid {
 *             type uint32;
 *         }
 *         leaf-list uarfcndl-list {
 *             type uint16;
 *         }
 *         container rem-umts-wcdma-cell-bcch-csgpsc-split-info {
 *             leaf start-psc-range1-coefficient {
 *                 type uint8;
 *             }
 *             leaf number-of-ps-cs {
 *                 type enumeration;
 *             }
 *             leaf psc-range2-offset {
 *                 type uint8;
 *             }
 *             uses rem-umts-wcdma-cell-bcch-csgpsc-split-info-g;
 *         }
 *         container rem-umts-wcdma-cell-bcch-reference-position {
 *             leaf latitude {
 *                 type int64;
 *             }
 *             leaf longitude {
 *                 type int64;
 *             }
 *             leaf uncertainty-semi-major {
 *                 type uint8;
 *             }
 *             leaf uncertainty-semi-minor {
 *                 type uint8;
 *             }
 *             leaf orientation-of-major-axis {
 *                 type uint8;
 *             }
 *             leaf confidence {
 *                 type confidence;
 *             }
 *             uses rem-umts-wcdma-cell-bcch-reference-position-g;
 *         }
 *         uses rem-umts-wcdma-cell-bcch-g;
 *     }
 *     uses rem-umts-wcdma-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-umts/rem-umts-wcdma/rem-umts-wcdma-cell</i>
 *
 * <p>To create instances of this class use {@link RemUmtsWcdmaCellBuilder}.
 * @see RemUmtsWcdmaCellBuilder
 * @see RemUmtsWcdmaCellKey
 *
 */
public interface RemUmtsWcdmaCell
    extends
    ChildOf<RemUmtsWcdma>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>,
    RemUmtsWcdmaCellG,
    Identifiable<RemUmtsWcdmaCellKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-wcdma-cell").intern();

    /**
     * Container for object class FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.RF.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf</code> <code>remUmtsWcdmaCellRf</code>, or <code>null</code> if not present
     */
    RemUmtsWcdmaCellRf getRemUmtsWcdmaCellRf();
    
    /**
     * Container for object class FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.BCCH.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch</code> <code>remUmtsWcdmaCellBcch</code>, or <code>null</code> if not present
     */
    RemUmtsWcdmaCellBcch getRemUmtsWcdmaCellBcch();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCellKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RemUmtsWcdmaCellKey getKey();

}

