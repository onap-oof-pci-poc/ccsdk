package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to radio environment measurement 
 * capabilities for the 1x system.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-cdma2000-one-x-g {
 *     leaf max-cell-entries {
 *         type uint64;
 *     }
 *     leaf cell-number-of-entries {
 *         type uint64;
 *     }
 *     leaf max-channel-entries {
 *         type uint64;
 *     }
 *     leaf channel-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-cdma2000-one-x-g</i>
 *
 */
public interface RemCdma2000OneXG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-one-x-g").intern();

    /**
     * The maximum number of entries available in the 
     * {{object|.REM.CDMA2000.OneX.Cell.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxCellEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxCellEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cellNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getCellNumberOfEntries();
    
    /**
     * The maximum number of entries available in the 
     * {{object|.REM.CDMA2000.OneX.Channel.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxChannelEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxChannelEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>channelNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getChannelNumberOfEntries();

}

