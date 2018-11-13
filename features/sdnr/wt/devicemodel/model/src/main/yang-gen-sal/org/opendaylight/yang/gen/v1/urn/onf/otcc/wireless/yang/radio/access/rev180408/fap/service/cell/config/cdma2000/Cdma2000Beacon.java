package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.Cdma2000;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.Beacon.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-beacon {
 *     leaf beacon-admin-status {
 *         type enumeration;
 *     }
 *     leaf beacon-oper-status {
 *         type enumeration;
 *     }
 *     leaf hrpd-beacon-enable {
 *         type boolean;
 *     }
 *     leaf period {
 *         type period;
 *     }
 *     leaf maxfap-beacon-tx-power {
 *         type string;
 *     }
 *     leaf maxfap-beacon-tx-power-in-use {
 *         type maxfap-beacon-tx-power-in-use;
 *     }
 *     leaf beacon-pch-pwr-percentage {
 *         type beacon-pch-pwr-percentage;
 *     }
 *     leaf max-hrpd-beacon-tx-power {
 *         type string;
 *     }
 *     leaf max-hrpd-beacon-tx-power-in-use {
 *         type max-hrpd-beacon-tx-power-in-use;
 *     }
 *     leaf beacon-pilot-pwr-percentage {
 *         type beacon-pilot-pwr-percentage;
 *     }
 *     leaf beacon-sync-pwr-percentage {
 *         type beacon-sync-pwr-percentage;
 *     }
 *     leaf max-beacon-list-entries {
 *         type uint64;
 *     }
 *     leaf beacon-list-number-of-entries {
 *         type uint64;
 *     }
 *     leaf max-hrpd-beacon-list-entries {
 *         type uint64;
 *     }
 *     leaf hrpd-beacon-list-number-of-entries {
 *         type uint64;
 *     }
 *     list cdma2000-beacon-beacon-list {
 *         key "beacon-index";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf beacon-index {
 *             type int64;
 *         }
 *         leaf offset {
 *             type uint16;
 *         }
 *         leaf duration {
 *             type duration;
 *         }
 *         leaf transmission-format {
 *             type enumeration;
 *         }
 *         leaf beacon-band-class {
 *             type int64;
 *         }
 *         leaf beacon-channel-freq {
 *             type uint16;
 *         }
 *         leaf-list beacon-pn-offset {
 *             type string;
 *         }
 *         leaf tx-power {
 *             type tx-power;
 *         }
 *         leaf beacon-sid {
 *             type uint16;
 *         }
 *         leaf beacon-nid {
 *             type uint16;
 *         }
 *         leaf beacon-pzid {
 *             type uint64;
 *         }
 *         uses cdma2000-beacon-beacon-list-g;
 *     }
 *     list cdma2000-beacon-hrpd-beacon-list {
 *         key "beacon-index";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf beacon-index {
 *             type int64;
 *         }
 *         leaf c-coffset {
 *             type uint16;
 *         }
 *         leaf offset {
 *             type int64;
 *         }
 *         leaf duration {
 *             type uint16;
 *         }
 *         leaf num-c-ccycles {
 *             type uint8;
 *         }
 *         leaf beacon-band-class {
 *             type uint8;
 *         }
 *         leaf beacon-channel-freq {
 *             type uint16;
 *         }
 *         leaf-list beacon-pn-offset {
 *             type string;
 *         }
 *         leaf tx-power {
 *             type tx-power;
 *         }
 *         uses cdma2000-beacon-hrpd-beacon-list-g;
 *     }
 *     uses cdma2000-beacon-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-beacon</i>
 *
 * <p>To create instances of this class use {@link Cdma2000BeaconBuilder}.
 * @see Cdma2000BeaconBuilder
 *
 */
public interface Cdma2000Beacon
    extends
    ChildOf<Cdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>,
    Cdma2000BeaconG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-beacon").intern();

    /**
     * List of object class FAPService.{i}.CellConfig.CDMA2000.Beacon.BeaconList.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cdma2000BeaconBeaconList</code>, or <code>null</code> if not present
     */
    List<Cdma2000BeaconBeaconList> getCdma2000BeaconBeaconList();
    
    /**
     * List of object class 
     * FAPService.{i}.CellConfig.CDMA2000.Beacon.HRPDBeaconList.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cdma2000BeaconHrpdBeaconList</code>, or <code>null</code> if not present
     */
    List<Cdma2000BeaconHrpdBeaconList> getCdma2000BeaconHrpdBeaconList();

}

