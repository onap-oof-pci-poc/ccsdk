package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to the neighbor list.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-neighbor-list-g {
 *     leaf max-lte-cell-entries {
 *         type uint64;
 *     }
 *     leaf lte-cell-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-neighbor-list-g</i>
 *
 */
public interface LteRanNeighborListG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-g").intern();

    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.LTE.RAN.NeighborList.LTECell.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxLteCellEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxLteCellEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>lteCellNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getLteCellNumberOfEntries();

}

