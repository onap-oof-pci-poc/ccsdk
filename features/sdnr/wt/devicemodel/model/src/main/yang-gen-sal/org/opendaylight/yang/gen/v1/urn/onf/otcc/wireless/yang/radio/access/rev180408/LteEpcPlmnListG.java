package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to list of PLMN identity specific to 
 * LTE EPC definition, called PLMN-IdentityList, as specified in 
 * SystemInformationBlockType1 message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. 
 * Each instance in this object is a PLMN-IdentityInfo which consists of 
 * plmn-Identity and cellReservedForOperatorUse IEs. At minimum 1 item MUST be 
 * present in this list, and maximum of 6 items.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-epc-plmn-list-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf is-primary {
 *         type boolean;
 *     }
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf cell-reserved-for-operator-use {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-epc-plmn-list-g</i>
 *
 */
public interface LteEpcPlmnListG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-epc-plmn-list-g").intern();

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
     * Indicates whether this {{param|PLMNID}} is a primary PLMN or not. If there is 
     * more than one instance in {{object|.CellConfig.LTE.EPC.PLMNList.{i}.}} table, 
     * then ACS MUST set this {{param}} set to {{true}} in only one instance.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isPrimary</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsPrimary();
    
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
     * Indicates whether the cell is reserved for operator use or not. If {{true}}, it 
     * is reserved. If {{false}}, it is not reserved. Corresponds to "reserved" 
     * "notReserved" respectively as defined in PLMN-IdentityInfo in 
     * {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>cellReservedForOperatorUse</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCellReservedForOperatorUse();

}

