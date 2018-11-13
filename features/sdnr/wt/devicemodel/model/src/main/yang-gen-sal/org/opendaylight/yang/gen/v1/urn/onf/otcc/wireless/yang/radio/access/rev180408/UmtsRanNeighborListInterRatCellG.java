package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * The inter-RAT cell lists separated by technology. 
 * {{bibref|3GPP-TS.25.331|Section 10.3.7.23}}
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-neighbor-list-inter-rat-cell-g {
 *     leaf max-gsm-entries {
 *         type uint64;
 *     }
 *     leaf gsm-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-neighbor-list-inter-rat-cell-g</i>
 *
 */
public interface UmtsRanNeighborListInterRatCellG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list-inter-rat-cell-g").intern();

    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.GSM.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxGsmEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxGsmEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>gsmNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getGsmNumberOfEntries();

}

