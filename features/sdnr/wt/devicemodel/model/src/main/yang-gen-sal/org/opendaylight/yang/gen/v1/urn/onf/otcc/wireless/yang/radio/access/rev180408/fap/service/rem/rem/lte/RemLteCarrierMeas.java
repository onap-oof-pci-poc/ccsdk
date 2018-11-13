package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCarrierMeasG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemLte;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.REM.LTE.CarrierMeas.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list rem-lte-carrier-meas {
 *     key "carrier-arfcndl" "carrier-ch-width";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf carrier-arfcndl {
 *         type carrier-arfcndl;
 *     }
 *     leaf carrier-ch-width {
 *         type carrier-ch-width;
 *     }
 *     leaf carrier-rssi {
 *         type carrier-rssi;
 *     }
 *     uses rem-lte-carrier-meas-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-lte/rem-lte-carrier-meas</i>
 *
 * <p>To create instances of this class use {@link RemLteCarrierMeasBuilder}.
 * @see RemLteCarrierMeasBuilder
 * @see RemLteCarrierMeasKey
 *
 */
public interface RemLteCarrierMeas
    extends
    ChildOf<RemLte>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>,
    RemLteCarrierMeasG,
    Identifiable<RemLteCarrierMeasKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-lte-carrier-meas").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeasKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RemLteCarrierMeasKey getKey();

}

