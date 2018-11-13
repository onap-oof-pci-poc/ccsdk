package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.CellConfig.CDMA2000.Beacon.BeaconList.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list cdma2000-beacon-beacon-list {
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
 *     leaf offset {
 *         type uint16;
 *     }
 *     leaf duration {
 *         type duration;
 *     }
 *     leaf transmission-format {
 *         type enumeration;
 *     }
 *     leaf beacon-band-class {
 *         type int64;
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
 *     leaf beacon-sid {
 *         type uint16;
 *     }
 *     leaf beacon-nid {
 *         type uint16;
 *     }
 *     leaf beacon-pzid {
 *         type uint64;
 *     }
 *     uses cdma2000-beacon-beacon-list-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-beacon/cdma2000-beacon-beacon-list</i>
 *
 * <p>To create instances of this class use {@link Cdma2000BeaconBeaconListBuilder}.
 * @see Cdma2000BeaconBeaconListBuilder
 * @see Cdma2000BeaconBeaconListKey
 *
 */
public interface Cdma2000BeaconBeaconList
    extends
    ChildOf<Cdma2000Beacon>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>,
    Cdma2000BeaconBeaconListG,
    Identifiable<Cdma2000BeaconBeaconListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-beacon-beacon-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    Cdma2000BeaconBeaconListKey getKey();

}

