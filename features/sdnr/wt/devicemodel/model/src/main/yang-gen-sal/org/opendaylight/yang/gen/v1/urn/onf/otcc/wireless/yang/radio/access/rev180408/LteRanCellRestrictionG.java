package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the cell restriction configuration.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-cell-restriction-g {
 *     leaf cell-barred {
 *         type boolean;
 *     }
 *     leaf cell-reserved-for-operator-use {
 *         type boolean;
 *     }
 *     leaf barring-for-emergency {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-cell-restriction-g</i>
 *
 */
public interface LteRanCellRestrictionG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-cell-restriction-g").intern();

    /**
     * Indicates whether the is barred or not. If {{true}}, the cell is barred. If 
     * {{false}}, the cell is not barred. Corresponds to parameter CellBarred specified
     * in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>cellBarred</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCellBarred();
    
    /**
     * Indicates whether the is reserved for operator's use or not. If {{true}}, the 
     * cell is reserved for operator use. If {{false}}, the cell is not reserved for 
     * operator use. Corresponds to parameter cellReservedForOperatorUse specified in 
     * SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>cellReservedForOperatorUse</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCellReservedForOperatorUse();
    
    /**
     * Indicates whether the is barred for Access Class 10 or not. If {{true}}, the 
     * cell is barred for Access Class 10. If {{false}}, the cell is not barred for 
     * Access Class 10. Corresponds to parameter ac-BarringForEmergency specified in 
     * SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>barringForEmergency</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBarringForEmergency();

}

