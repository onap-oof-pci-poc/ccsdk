package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table containing the PLMN list in the system information broadcast in the BCCH 
 * logical channel. Correspnds to plmn-IdentityList as specified in SIB1 in 
 * {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a 
 * PLMN-IdentityInfo which consists of plmn-Identity and 
 * IEs.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-lte-cell-bcch-plmn-list-g {
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf cell-reserved-for-operator-use {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-lte-cell-bcch-plmn-list-g</i>
 *
 */
public interface RemLteCellBcchPlmnListG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-lte-cell-bcch-plmn-list-g").intern();

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

