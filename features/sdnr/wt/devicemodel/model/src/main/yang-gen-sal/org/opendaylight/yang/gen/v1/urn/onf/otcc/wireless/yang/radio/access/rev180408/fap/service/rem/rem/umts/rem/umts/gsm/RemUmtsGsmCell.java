package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.REM.UMTS.GSM.Cell.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list rem-umts-gsm-cell {
 *     key "arfcn" "bsic";
 *     leaf band-indicator {
 *         type enumeration;
 *     }
 *     leaf arfcn {
 *         type uint16;
 *     }
 *     leaf bsic {
 *         type uint8;
 *     }
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf lac {
 *         type uint16;
 *     }
 *     leaf rac {
 *         type uint8;
 *     }
 *     leaf ci {
 *         type uint16;
 *     }
 *     leaf rssi {
 *         type rssi;
 *     }
 *     uses rem-umts-gsm-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-umts/rem-umts-gsm/rem-umts-gsm-cell</i>
 *
 * <p>To create instances of this class use {@link RemUmtsGsmCellBuilder}.
 * @see RemUmtsGsmCellBuilder
 * @see RemUmtsGsmCellKey
 *
 */
public interface RemUmtsGsmCell
    extends
    ChildOf<RemUmtsGsm>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>,
    RemUmtsGsmCellG,
    Identifiable<RemUmtsGsmCellKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-gsm-cell").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCellKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RemUmtsGsmCellKey getKey();

}

