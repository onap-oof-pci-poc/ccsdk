package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemUmts;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.UMTS.WCDMA.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-umts-wcdma {
 *     leaf in-service-handling {
 *         type in-service-handling;
 *     }
 *     leaf scan-on-boot {
 *         type scan-on-boot;
 *     }
 *     leaf scan-periodically {
 *         type scan-periodically;
 *     }
 *     leaf periodic-interval {
 *         type periodic-interval;
 *     }
 *     leaf periodic-time {
 *         type date-and-time;
 *     }
 *     leaf-list remplmn-list {
 *         type string;
 *     }
 *     leaf-list rem-band-list {
 *         type string;
 *     }
 *     leaf-list uarfcndl-list {
 *         type string;
 *     }
 *     leaf scan-timeout {
 *         type scan-timeout;
 *     }
 *     leaf scan-status {
 *         type enumeration;
 *     }
 *     leaf error-details {
 *         type string;
 *     }
 *     leaf last-scan-time {
 *         type date-and-time;
 *     }
 *     leaf max-cell-entries {
 *         type uint64;
 *     }
 *     leaf cell-number-of-entries {
 *         type uint64;
 *     }
 *     list rem-umts-wcdma-cell {
 *         key "rem-umts-wcdma-cell-key";
 *         leaf rem-umts-wcdma-cell-key {
 *             type string;
 *         }
 *         container rem-umts-wcdma-cell-rf {
 *             leaf uarfcndl {
 *                 type uint16;
 *             }
 *             leaf cpichrscp {
 *                 type cpichrscp;
 *             }
 *             leaf cpich-ec-no {
 *                 type cpich-ec-no;
 *             }
 *             leaf rssi {
 *                 type rssi;
 *             }
 *             leaf primary-scrambling-code {
 *                 type uint16;
 *             }
 *             uses rem-umts-wcdma-cell-rf-g;
 *         }
 *         container rem-umts-wcdma-cell-bcch {
 *             leaf plmn-type {
 *                 type enumeration;
 *             }
 *             leaf plmnid {
 *                 type string;
 *             }
 *             leaf lac {
 *                 type uint16;
 *             }
 *             leaf rac {
 *                 type uint8;
 *             }
 *             leaf cell-id {
 *                 type uint32;
 *             }
 *             leaf pcpich-tx-power {
 *                 type int64;
 *             }
 *             leaf csg-indicator {
 *                 type boolean;
 *             }
 *             leaf csgid {
 *                 type uint32;
 *             }
 *             leaf-list uarfcndl-list {
 *                 type uint16;
 *             }
 *             container rem-umts-wcdma-cell-bcch-csgpsc-split-info {
 *                 leaf start-psc-range1-coefficient {
 *                     type uint8;
 *                 }
 *                 leaf number-of-ps-cs {
 *                     type enumeration;
 *                 }
 *                 leaf psc-range2-offset {
 *                     type uint8;
 *                 }
 *                 uses rem-umts-wcdma-cell-bcch-csgpsc-split-info-g;
 *             }
 *             container rem-umts-wcdma-cell-bcch-reference-position {
 *                 leaf latitude {
 *                     type int64;
 *                 }
 *                 leaf longitude {
 *                     type int64;
 *                 }
 *                 leaf uncertainty-semi-major {
 *                     type uint8;
 *                 }
 *                 leaf uncertainty-semi-minor {
 *                     type uint8;
 *                 }
 *                 leaf orientation-of-major-axis {
 *                     type uint8;
 *                 }
 *                 leaf confidence {
 *                     type confidence;
 *                 }
 *                 uses rem-umts-wcdma-cell-bcch-reference-position-g;
 *             }
 *             uses rem-umts-wcdma-cell-bcch-g;
 *         }
 *         uses rem-umts-wcdma-cell-g;
 *     }
 *     uses rem-umts-wcdma-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-umts/rem-umts-wcdma</i>
 *
 * <p>To create instances of this class use {@link RemUmtsWcdmaBuilder}.
 * @see RemUmtsWcdmaBuilder
 *
 */
public interface RemUmtsWcdma
    extends
    ChildOf<RemUmts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsWcdma>,
    RemUmtsWcdmaG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-wcdma").intern();

    /**
     * List of object class FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remUmtsWcdmaCell</code>, or <code>null</code> if not present
     */
    List<RemUmtsWcdmaCell> getRemUmtsWcdmaCell();

}

