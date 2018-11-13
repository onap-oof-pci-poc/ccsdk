package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * Table containing the inter-RAT cell lists separated by technology. 
 * {{bibref|3GPP-TS.36.331|Section 6.3.1 (SIB6, 7, 8)}}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-neighbor-list-in-use-inter-rat-cell-g {
 *     leaf max-umts-entries {
 *         type uint64;
 *     }
 *     leaf max-gsm-entries {
 *         type uint64;
 *     }
 *     leaf max-cdma2000-entries {
 *         type uint64;
 *     }
 *     leaf umts-number-of-entries {
 *         type uint64;
 *     }
 *     leaf gsm-number-of-entries {
 *         type uint64;
 *     }
 *     leaf cdma2000-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-neighbor-list-in-use-inter-rat-cell-g</i>
 *
 */
public interface LteRanNeighborListInUseInterRatCellG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-in-use-inter-rat-cell-g").intern();

    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.UMTS.{i}.}} table. 
     * There can be maximum of 16 UTRAN (UMTS) neighbor cells, as specified by 
     * carrierFreqListUTRA-FDD in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxUmtsEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxUmtsEntries();
    
    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.GSM.{i}.}} table. 
     * There can be maximum of 16 GERAN (GSM) neighbor cells, as specified by 
     * carrierFreqsInfoList in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxGsmEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxGsmEntries();
    
    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.CDMA2000.{i}.}} 
     * table. There can be maximum of 32 banclasses. In each bandclass, there can be 
     * maximum of 16 CDMA2000 carrier frequencies. In each carrier, there can be 
     * maximum of 16 CDMA2000 neighbor cells (PN offset). It is specified by 
     * neighCellList in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxCdma2000Entries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxCdma2000Entries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>umtsNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getUmtsNumberOfEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>gsmNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getGsmNumberOfEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cdma2000NumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getCdma2000NumberOfEntries();

}

