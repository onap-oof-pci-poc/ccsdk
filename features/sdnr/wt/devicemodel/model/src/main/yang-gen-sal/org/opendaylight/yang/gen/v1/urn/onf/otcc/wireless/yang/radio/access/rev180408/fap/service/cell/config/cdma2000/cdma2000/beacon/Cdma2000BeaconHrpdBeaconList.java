package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.CDMA2000.Beacon.HRPDBeaconList.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list cdma2000-beacon-hrpd-beacon-list {
 *     key "beacon-index";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf beacon-index {
 *         type int64;
 *     }
 *     leaf c-coffset {
 *         type uint16;
 *     }
 *     leaf offset {
 *         type int64;
 *     }
 *     leaf duration {
 *         type uint16;
 *     }
 *     leaf num-c-ccycles {
 *         type uint8;
 *     }
 *     leaf beacon-band-class {
 *         type uint8;
 *     }
 *     leaf beacon-channel-freq {
 *         type uint16;
 *     }
 *     leaf-list beacon-pn-offset {
 *         type string;
 *     }
 *     leaf tx-power {
 *         type tx-power;
 *     }
 *     uses cdma2000-beacon-hrpd-beacon-list-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-beacon/cdma2000-beacon-hrpd-beacon-list</i>
 *
 * <p>To create instances of this class use {@link Cdma2000BeaconHrpdBeaconListBuilder}.
 * @see Cdma2000BeaconHrpdBeaconListBuilder
 * @see Cdma2000BeaconHrpdBeaconListKey
 *
 */
public interface Cdma2000BeaconHrpdBeaconList
    extends
    ChildOf<Cdma2000Beacon>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>,
    Cdma2000BeaconHrpdBeaconListG,
    Identifiable<Cdma2000BeaconHrpdBeaconListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-beacon-hrpd-beacon-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    Cdma2000BeaconHrpdBeaconListKey getKey();

}

