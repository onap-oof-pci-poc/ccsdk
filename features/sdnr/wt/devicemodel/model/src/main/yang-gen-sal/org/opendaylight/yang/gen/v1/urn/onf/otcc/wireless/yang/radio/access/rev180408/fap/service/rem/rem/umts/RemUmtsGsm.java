package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemUmts;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.UMTS.GSM.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-umts-gsm {
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
 *         type enumeration;
 *     }
 *     leaf-list arfcn-list {
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
 *     list rem-umts-gsm-cell {
 *         key "arfcn" "bsic";
 *         leaf band-indicator {
 *             type enumeration;
 *         }
 *         leaf arfcn {
 *             type uint16;
 *         }
 *         leaf bsic {
 *             type uint8;
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
 *         leaf ci {
 *             type uint16;
 *         }
 *         leaf rssi {
 *             type rssi;
 *         }
 *         uses rem-umts-gsm-cell-g;
 *     }
 *     uses rem-umts-gsm-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-umts/rem-umts-gsm</i>
 *
 * <p>To create instances of this class use {@link RemUmtsGsmBuilder}.
 * @see RemUmtsGsmBuilder
 *
 */
public interface RemUmtsGsm
    extends
    ChildOf<RemUmts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>,
    RemUmtsGsmG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-gsm").intern();

    /**
     * List of object class FAPService.{i}.REM.UMTS.GSM.Cell.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remUmtsGsmCell</code>, or <code>null</code> if not present
     */
    List<RemUmtsGsmCell> getRemUmtsGsmCell();

}

