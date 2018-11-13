package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to the neighbor list used by the FAP 
 * based on its self-configuration capability and 
 * {{object|.CellConfig.UMTS.RAN.NeighborList.}} configuration of adding and 
 * excluding cells.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-neighbor-list-in-use-g {
 *     leaf max-intra-freq-cell-entries {
 *         type uint64;
 *     }
 *     leaf max-inter-freq-cell-entries {
 *         type uint64;
 *     }
 *     leaf intra-freq-cell-number-of-entries {
 *         type uint64;
 *     }
 *     leaf inter-freq-cell-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-neighbor-list-in-use-g</i>
 *
 */
public interface UmtsRanNeighborListInUseG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list-in-use-g").intern();

    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxIntraFreqCellEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxIntraFreqCellEntries();
    
    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxInterFreqCellEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxInterFreqCellEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>intraFreqCellNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getIntraFreqCellNumberOfEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>interFreqCellNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getInterFreqCellNumberOfEntries();

}

