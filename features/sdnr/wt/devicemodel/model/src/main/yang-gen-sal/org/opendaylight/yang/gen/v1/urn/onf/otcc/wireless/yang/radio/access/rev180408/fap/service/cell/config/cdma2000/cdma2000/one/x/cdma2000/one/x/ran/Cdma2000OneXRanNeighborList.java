package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.NeighborList.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list cdma2000-one-x-ran-neighbor-list {
 *     key "one-x-neighbor-index" "neighbor-pn";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf pilot-inc {
 *         type int64;
 *     }
 *     leaf one-x-neighbor-index {
 *         type int64;
 *     }
 *     leaf neighbor-config {
 *         type enumeration;
 *     }
 *     leaf neighbor-pn {
 *         type int64;
 *     }
 *     leaf search-priority {
 *         type enumeration;
 *     }
 *     leaf neighbor-band {
 *         type enumeration;
 *     }
 *     leaf neighbor-frequency {
 *         type int64;
 *     }
 *     leaf frequency-included {
 *         type int64;
 *     }
 *     leaf in-traffic {
 *         type int64;
 *     }
 *     leaf overhead-msg {
 *         type int64;
 *     }
 *     leaf base-identifier {
 *         type int64;
 *     }
 *     leaf air-interface {
 *         type enumeration;
 *     }
 *     leaf hand-out-capable {
 *         type int64;
 *     }
 *     leaf one-x-neighbor-longitude {
 *         type string;
 *     }
 *     leaf one-x-neighbor-latitude {
 *         type string;
 *     }
 *     leaf one-x-neighbor-msc-id {
 *         type uint32;
 *     }
 *     leaf one-x-neighbor-ios-cell-id {
 *         type uint16;
 *     }
 *     leaf force-in-overhead {
 *         type boolean;
 *     }
 *     leaf included-in-overhead {
 *         type boolean;
 *     }
 *     uses cdma2000-one-x-ran-neighbor-list-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-neighbor-list</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanNeighborListBuilder}.
 * @see Cdma2000OneXRanNeighborListBuilder
 * @see Cdma2000OneXRanNeighborListKey
 *
 */
public interface Cdma2000OneXRanNeighborList
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>,
    Cdma2000OneXRanNeighborListG,
    Identifiable<Cdma2000OneXRanNeighborListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-neighbor-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanNeighborListKey getKey();

}

