package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table containing the E-UTRA (i.e. intra-RAT) cell list provided by the ACS. The 
 * table contents MAY be added/deleted/modified during operation, in which case 
 * these changes shall be reflected in the broadcast information as soon as 
 * possible.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-neighbor-list-lte-cell-g {
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
 *     leaf cid {
 *         type uint32;
 *     }
 *     leaf eutra-carrier-arfcn {
 *         type uint16;
 *     }
 *     leaf phy-cell-id {
 *         type uint16;
 *     }
 *     leaf q-offset {
 *         type int64;
 *     }
 *     leaf cio {
 *         type int64;
 *     }
 *     leaf rs-tx-power {
 *         type rs-tx-power;
 *     }
 *     leaf blacklisted {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-neighbor-list-lte-cell-g</i>
 *
 */
public interface LteRanNeighborListLteCellG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-lte-cell-g").intern();

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
     * Cell Identity. {{bibref|3GPP-TS.36.331|Section 6.3.4}}. Combination of 
     * {{param|PLMNID}} and {{param}} constitutes the Cell Global ID (CGI).
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cid</code>, or <code>null</code> if not present
     */
    java.lang.Long getCid();
    
    /**
     * Indicates the ARFCN of this carrier frequency. Corresponds to parameter 
     * dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and and 
     * parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}. If the value of 
     * {{param}} is the same with the one currently being used by the, then it implies 
     * that this neighbor cell is an intra-frequency cell; otherwise, it is an 
     * inter-frequency cell.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>eutraCarrierArfcn</code>, or <code>null</code> if not present
     */
    java.lang.Integer getEutraCarrierArfcn();
    
    /**
     * Physical cell ID, as specified in {{bibref|3GPP-TS.36.211|Section 6.11}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>phyCellId</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPhyCellId();
    
    /**
     * Indicate a cell-specific offset applicable to a specific neighbouring cell. It 
     * is used for evaluating the cell as a candidate for cell re-selection in idle 
     * mode. Corresponds to parameter q-OffsetCell broadcast in SIB4 for 
     * intra-frequency cells and in SIB5 for inter-frequency cells, specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}}. For the value less than or equal to -8,
     * and bigger than or equal to 8, only even numbers are valid. If the value is 
     * other than these, the CPE MUST reject the value.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>qOffset</code>, or <code>null</code> if not present
     */
    java.lang.Long getQOffset();
    
    /**
     * Cell individual offset applicable to a specific neighbouring cell. It is used 
     * for evaluating triggering conditions for measurement reporting in connected 
     * mode. Specified by cellIndividualOffset in MeasObjectEUTRA IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.5}}. For the value less than or equal to -8,
     * and bigger than or equal to 8, only even numbers are valid. If the value is 
     * other than these, the CPE MUST reject the value.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cio</code>, or <code>null</code> if not present
     */
    java.lang.Long getCio();
    
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
     * Indicates whether this neighbor cell is allowed for UEs as handover target or 
     * not. If {{true}}, handover is prohibited towards this cell. If {{false}}, 
     * handover is allowed toward this cell. The {{param}} parameter allows this cell 
     * to be prohibited as a handover target, while still allowing this cell to be 
     * included in the BCCH SIB4 or 5.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>blacklisted</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBlacklisted();

}

