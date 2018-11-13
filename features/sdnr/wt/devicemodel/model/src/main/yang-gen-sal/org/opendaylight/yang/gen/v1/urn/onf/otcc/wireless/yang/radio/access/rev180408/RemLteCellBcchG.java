package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * Table containing the system information broadcast in the BCCH logical channel.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-lte-cell-bcch-g {
 *     leaf dl-bandwidth {
 *         type dl-bandwidth;
 *     }
 *     leaf ul-bandwidth {
 *         type ul-bandwidth;
 *     }
 *     leaf rs-tx-power {
 *         type rs-tx-power;
 *     }
 *     leaf tac {
 *         type uint16;
 *     }
 *     leaf cell-id {
 *         type uint32;
 *     }
 *     leaf cell-barred {
 *         type boolean;
 *     }
 *     leaf csg-indication {
 *         type boolean;
 *     }
 *     leaf csg-identity {
 *         type uint32;
 *     }
 *     leaf max-plmn-list-entries {
 *         type uint64;
 *     }
 *     leaf plmn-list-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-lte-cell-bcch-g</i>
 *
 */
public interface RemLteCellBcchG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-lte-cell-bcch-g").intern();

    /**
     * Downlink transmission bandwidth, specified in number of {{units}}. Corresponds 
     * to parameter dl_Bandwidth in Master Information Block in 
     * {{bibref|3GPP-TS.36.331|Section 6.2.2}}. and to parameter NRB in 
     * {{bibref|3GPP-TS.36.101|Table 5.6-1}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>dlBandwidth</code>, or <code>null</code> if not present
     */
    java.lang.Short getDlBandwidth();
    
    /**
     * Uplink transmission bandwidth, specified in number of {{units}}. Corresponds to 
     * parameter ul_Bandwidth in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}. and 
     * to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>ulBandwidth</code>, or <code>null</code> if not present
     */
    java.lang.Short getUlBandwidth();
    
    /**
     * The downlink reference-signal transmit power, specified in {{units}}. Defined as
     * the linear average over the power contributions (in W) of all resource elements 
     * that carry cell-specific reference signals within the operating system 
     * bandwidth. Corresponds to parameter referenceSignalPower in SIB4 as a part of 
     * PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rsTxPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getRsTxPower();
    
    /**
     * Tracking Area Code that is common for all the PLMNs listed. Corresponds to 
     * trackingAreaCode as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 
     * 6.2.2}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>tac</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTac();
    
    /**
     * Defines the cell identify, defines as a 28-bit binary number. Corresponds to 
     * cellIdentity as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2 and 
     * Section 6.3.4}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cellId</code>, or <code>null</code> if not present
     */
    java.lang.Long getCellId();
    
    /**
     * Indicates whether the cell is barred or not. If {{true}}, the cell is barred. If
     * {{false}}, the cell is not barred. Corresponds to cellBarred as specified in 
     * SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and {{bibref|3GPP-TS.36.304}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>cellBarred</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCellBarred();
    
    /**
     * Indicates whether CSG is used in this cell or not. If {{true}}, the UE is only 
     * allowed to access the cell if the CSG identity matches an entry in the allowed 
     * CSG list that the UE has stored. Corresponds to csg-Indication as specified in 
     * SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>csgIndication</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCsgIndication();
    
    /**
     * Defines the CSG ID value if {{param|CSGIndication}} parameter indicates that CSG
     * is used in this cell. Corresponds to csg-Identity as specified in SIB1 in 
     * {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>csgIdentity</code>, or <code>null</code> if not present
     */
    java.lang.Long getCsgIdentity();
    
    /**
     * The maximum number of entries available in the 
     * {{object|.REM.LTE.Cell.{i}.BCCH.PLMNList.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxPlmnListEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxPlmnListEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>plmnListNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getPlmnListNumberOfEntries();

}

