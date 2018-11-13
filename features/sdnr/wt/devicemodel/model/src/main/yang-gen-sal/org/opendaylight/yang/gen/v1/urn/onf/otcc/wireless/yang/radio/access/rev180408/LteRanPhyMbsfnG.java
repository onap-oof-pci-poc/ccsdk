package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to the MBSFN (Multimedia Broadcast 
 * multicast service Single Frequency Network) configuration (see 
 * {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-mbsfn-g {
 *     leaf neigh-cell-config {
 *         type uint8;
 *     }
 *     leaf max-sf-config-list-entries {
 *         type uint64;
 *     }
 *     leaf sf-config-list-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-mbsfn-g</i>
 *
 */
public interface LteRanPhyMbsfnG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-mbsfn-g").intern();

    /**
     * Defines the information related to MBSFN and TDD UL/DL configuration of 
     * neighbour cells. Corresponds to NeighCellConfig IE specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Value 0: Not all neighbour cells have 
     * the same MBSFN sub-frame allocation as serving cell. Value 1: No MBSFN 
     * sub-frames are present in all neighbour cells. Value 2: The MBSFN sub-frame 
     * allocations of all neighbour cells are identical to or subsets of that in the 
     * serving cell. Value 3: Different UL/DL allocation in neighbouring cells for TDD 
     * compared to the serving cell.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>neighCellConfig</code>, or <code>null</code> if not present
     */
    java.lang.Short getNeighCellConfig();
    
    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.LTE.RAN.PHY.MBSFN.SFConfigList.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxSfConfigListEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxSfConfigListEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sfConfigListNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getSfConfigListNumberOfEntries();

}

