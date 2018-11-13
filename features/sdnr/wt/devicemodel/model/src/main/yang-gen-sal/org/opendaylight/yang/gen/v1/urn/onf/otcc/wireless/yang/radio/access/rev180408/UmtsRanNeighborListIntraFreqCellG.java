package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table containing the intra-frequency cell list provided by the ACS. The table 
 * contents MAY be added/deleted/modified during operation, in which case these 
 * changes shall be reflected in the broadcast information as soon as possible.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-neighbor-list-intra-freq-cell-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf must-include {
 *         type boolean;
 *     }
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf rncid {
 *         type uint16;
 *     }
 *     leaf cid {
 *         type uint16;
 *     }
 *     leaf lac {
 *         type uint16;
 *     }
 *     leaf rac {
 *         type uint8;
 *     }
 *     leaf ura {
 *         type uint16;
 *     }
 *     leaf pcpich-scrambling-code {
 *         type uint16;
 *     }
 *     leaf pcpich-tx-power {
 *         type pcpich-tx-power;
 *     }
 *     leaf collocated-inter-freq-cell {
 *         type uint32;
 *     }
 *     leaf max-tx-power {
 *         type max-tx-power;
 *     }
 *     leaf max-dpc-htx-power {
 *         type max-dpc-htx-power;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-neighbor-list-intra-freq-cell-g</i>
 *
 */
public interface UmtsRanNeighborListIntraFreqCellG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list-intra-freq-cell-g").intern();

    /**
     * Enables or disables this entry.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnable();
    
    /**
     * {{datatype|expand}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>alias</code>, or <code>null</code> if not present
     */
    java.lang.String getAlias();
    
    /**
     * Indicates whether this instance of the neighbor shall be included or excluded in
     * the FAP's NL configuration.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mustInclude</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMustInclude();
    
    /**
     * PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) 
     * {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}. Mobile Country Code 
     * consists of three digits and uniquely identifies the country of domicile of the 
     * subscriber. Mobile Network Code consists of two or three digits and identifies 
     * the Home PLMN within a country. For a 2-digit MNC the total string length of 
     * {{param}} is 5.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>plmnid</code>, or <code>null</code> if not present
     */
    java.lang.String getPlmnid();
    
    /**
     * RNC-ID of an intra-freq neighbor cell. It uniquely identifies an RNC within a 
     * PLMN. Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, 
     * if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) 
     * is used in RANAP. The RNC-ID and Extended RNC-ID are combined into a single 
     * parameter here as there is no explicit need to have them separated. 
     * {{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rncid</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRncid();
    
    /**
     * Cell Identifier (C-id) that identifies a cell within an RNS. This Cell 
     * Identifier together with the controlling RNC (RNC-ID) constitutes the UTRAN Cell
     * ID (UC-ID) and is used to identify a cell uniquely within UTRAN. C-ID is either 
     * 12-bit or 16-bit value. {{bibref|3GPP-TS.25.401|Section 6.1.5}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>cid</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCid();
    
    /**
     * Location Area Code (LAC). The concatenation of PLMN ID (MCC+MNC) and LAC 
     * uniquely identifies the Location Area ID (LAI). {{bibref|3GPP-TS.23.003|Section 
     * 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>lac</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLac();
    
    /**
     * Routing Area Code (RAC). The concatenation of PLMN ID (MCC+MNC), LAC, and RAC 
     * uniquely identifies the Routing Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 
     * 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>rac</code>, or <code>null</code> if not present
     */
    java.lang.Short getRac();
    
    /**
     * UTRAN Registration Area (URA) {{bibref|3GPP-TS.23.401}}. Indicates to the UE 
     * which {{param}} it shall use in case of overlapping URAs. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ura</code>, or <code>null</code> if not present
     */
    java.lang.Integer getUra();
    
    /**
     * Primary CPICH scrambling code.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>pcpichScramblingCode</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPcpichScramblingCode();
    
    /**
     * Primary CPICH Tx power in {{units}}. Actual values of the power are -10.0 
     * {{units}} to 50.0 {{units}} in steps of 0.1 dB. The value of {{param}} divided 
     * by 10 yields the actual value of the power. {{bibref|3GPP-TS.32.642|Section 
     * 6.3.11}} {{bibref|3GPP-TS.25.433|Section 2.2.33}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pcpichTxPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getPcpichTxPower();
    
    /**
     * Provides identity of collocated inter-frequency Cell. Needed for pathloss 
     * estimation, in case the femto environment masks intra-frequency neighbor. Cell 
     * Identity. {{bibref|3GPP-TS.25.331|Section 10.3.2.2}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>collocatedInterFreqCell</code>, or <code>null</code> if not present
     */
    java.lang.Long getCollocatedInterFreqCell();
    
    /**
     * Cell Max Tx Power. Parameter needed in HNB power calibration, for protection of 
     * neighbour cells. Actual values of the power are -30.0 dBm to 60.0 dBm in steps 
     * of 0.1 dB. The value of MaxTxPower divided by 10 yields the actual value of the 
     * power. C.f {{bibref|3GPP-TS.32.642|Section 6.3.11}} 
     * {{bibref|3GPP-TS.25.104|Section 6.2.1}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxTxPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxTxPower();
    
    /**
     * Maximum DL DPCH Tx Power per UE configured in the cell (for CS UEs). Parameter 
     * may be used by FAP to protect the DL budget allocated to neighbouring UEs served
     * by neighbour cells. C.f (max 10 dB below max Tx power) 
     * {{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
     * Actual values of the power are -40.0 dBm to 50.0 dBm in steps of 0.1 dB. The 
     * value of MaxDPCHtxPower divided by 10 yields the actual value of the power.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxDpcHtxPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxDpcHtxPower();

}

