package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteG;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Rem;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.LTE.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-lte {
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
 *     leaf-list eutra-carrier-arfcndl-list {
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
 *     leaf max-carrier-meas-entries {
 *         type uint64;
 *     }
 *     leaf carrier-meas-number-of-entries {
 *         type uint64;
 *     }
 *     list rem-lte-cell {
 *         key "rem-lte-cell-key";
 *         leaf rem-lte-cell-key {
 *             type string;
 *         }
 *         container rem-lte-cell-rf {
 *             leaf eutra-carrier-arfcn {
 *                 type uint16;
 *             }
 *             leaf phy-cell-id {
 *                 type uint16;
 *             }
 *             leaf rsrp {
 *                 type rsrp;
 *             }
 *             leaf rsrq {
 *                 type rsrq;
 *             }
 *             leaf rssi {
 *                 type rssi;
 *             }
 *             uses rem-lte-cell-rf-g;
 *         }
 *         container rem-lte-cell-bcch {
 *             leaf dl-bandwidth {
 *                 type dl-bandwidth;
 *             }
 *             leaf ul-bandwidth {
 *                 type ul-bandwidth;
 *             }
 *             leaf rs-tx-power {
 *                 type rs-tx-power;
 *             }
 *             leaf tac {
 *                 type uint16;
 *             }
 *             leaf cell-id {
 *                 type uint32;
 *             }
 *             leaf cell-barred {
 *                 type boolean;
 *             }
 *             leaf csg-indication {
 *                 type boolean;
 *             }
 *             leaf csg-identity {
 *                 type uint32;
 *             }
 *             leaf max-plmn-list-entries {
 *                 type uint64;
 *             }
 *             leaf plmn-list-number-of-entries {
 *                 type uint64;
 *             }
 *             list rem-lte-cell-bcch-plmn-list {
 *                 key "plmnid";
 *                 leaf plmnid {
 *                     type string;
 *                 }
 *                 leaf cell-reserved-for-operator-use {
 *                     type boolean;
 *                 }
 *                 uses rem-lte-cell-bcch-plmn-list-g;
 *             }
 *             uses rem-lte-cell-bcch-g;
 *         }
 *         uses rem-lte-cell-g;
 *     }
 *     list rem-lte-carrier-meas {
 *         key "carrier-arfcndl" "carrier-ch-width";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf carrier-arfcndl {
 *             type carrier-arfcndl;
 *         }
 *         leaf carrier-ch-width {
 *             type carrier-ch-width;
 *         }
 *         leaf carrier-rssi {
 *             type carrier-rssi;
 *         }
 *         uses rem-lte-carrier-meas-g;
 *     }
 *     uses rem-lte-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-lte</i>
 *
 * <p>To create instances of this class use {@link RemLteBuilder}.
 * @see RemLteBuilder
 *
 */
public interface RemLte
    extends
    ChildOf<Rem>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemLte>,
    RemLteG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-lte").intern();

    /**
     * List of object class FAPService.{i}.REM.LTE.Cell.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remLteCell</code>, or <code>null</code> if not present
     */
    List<RemLteCell> getRemLteCell();
    
    /**
     * List of object class FAPService.{i}.REM.LTE.CarrierMeas.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remLteCarrierMeas</code>, or <code>null</code> if not present
     */
    List<RemLteCarrierMeas> getRemLteCarrierMeas();

}

