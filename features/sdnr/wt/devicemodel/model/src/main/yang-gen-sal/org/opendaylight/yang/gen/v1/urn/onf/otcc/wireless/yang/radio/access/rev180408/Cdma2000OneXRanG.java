package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to RAN configuring the CDMA2000 1x FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-g {
 *     leaf one-x-sector-nid {
 *         type int64;
 *     }
 *     leaf one-x-sector-sid {
 *         type int64;
 *     }
 *     leaf one-xpzid {
 *         type int64;
 *     }
 *     leaf base-id {
 *         type int64;
 *     }
 *     leaf max-neighbor-list-entries {
 *         type uint64;
 *     }
 *     leaf neighbor-list-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-g</i>
 *
 */
public interface Cdma2000OneXRanG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-g").intern();

    /**
     * SID for 1x. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXSectorNid</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXSectorNid();
    
    /**
     * NID for 1x . See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXSectorSid</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXSectorSid();
    
    /**
     * packet Zone ID for 1x packet calls
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXpzid</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXpzid();
    
    /**
     * Base station ID (needed in SPM). This is also the CellID. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>baseId</code>, or <code>null</code> if not present
     */
    java.lang.Long getBaseId();
    
    /**
     * Maximum number of entries avaiable in 
     * {{object|.CellConfig.CDMA2000.OneX.RAN.NeighborList.{i}.}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxNeighborListEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxNeighborListEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>neighborListNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getNeighborListNumberOfEntries();

}

