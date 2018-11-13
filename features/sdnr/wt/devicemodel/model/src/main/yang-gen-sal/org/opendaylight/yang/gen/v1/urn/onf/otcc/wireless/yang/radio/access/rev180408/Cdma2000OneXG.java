package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to configuring the CDMA2000 1x FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-g {
 *     leaf pcfpdsn-number-of-entries {
 *         type uint64;
 *     }
 *     leaf max-batch-pcfpdsn-entries {
 *         type uint64;
 *     }
 *     leaf batch-pcfpdsn-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-g</i>
 *
 */
public interface Cdma2000OneXG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-g").intern();

    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>pcfpdsnNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getPcfpdsnNumberOfEntries();
    
    /**
     * Maximum number of entries in the 
     * {{object|.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxBatchPcfpdsnEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxBatchPcfpdsnEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>batchPcfpdsnNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getBatchPcfpdsnNumberOfEntries();

}

