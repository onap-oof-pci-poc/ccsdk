package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters related to cell access restriction.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-cell-restriction-g {
 *     leaf cell-barred {
 *         type boolean;
 *     }
 *     leaf intra-freq-cell-reselection-indicator {
 *         type boolean;
 *     }
 *     leaf t-barred {
 *         type t-barred;
 *     }
 *     leaf-list access-class-barred-list-cs {
 *         type uint8;
 *     }
 *     leaf-list access-class-barred-list-ps {
 *         type uint8;
 *     }
 *     leaf cell-reserved-for-operator-use {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-cell-restriction-g</i>
 *
 */
public interface UmtsRanCellRestrictionG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-cell-restriction-g").intern();

    /**
     * Indicates whether the FAP is barred from service or not. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2}}
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>cellBarred</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCellBarred();
    
    /**
     * When {{param|CellBarred}} is {{true}}, this indicates whether the 
     * intra-frequency cell re-selection is allowed or not. {{param}} has no meaning if
     * {{param|CellBarred}} is {{false}} and MUST be ignored in such cases. {{true}} 
     * means that intra-frequency cell re-selection is allowed. {{false}} means that 
     * intra-frequency cell re-selection is not allowed. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2}}
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>intraFreqCellReselectionIndicator</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIntraFreqCellReselectionIndicator();
    
    /**
     * The time period in {{units}} during which the UE is barred from accessing the 
     * FAP. {{bibref|3GPP-TS.25.331|Section 10.3.2}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>tBarred</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTBarred();
    
    /**
     * {{list}} Each entry is an Access Class that is barred from CS service. The order
     * of the list has no significance. {{bibref|3GPP-TS.25.331|Section 10.3.2}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>accessClassBarredListCs</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getAccessClassBarredListCs();
    
    /**
     * {{list}} Each entry is an Access Class that is barred from PS service. The order
     * of the list has no significance. {{bibref|3GPP-TS.25.331|Section 10.3.2}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>accessClassBarredListPs</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getAccessClassBarredListPs();
    
    /**
     * Indicates whether the FAP is reserved for operator use or not. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2}}
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>cellReservedForOperatorUse</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCellReservedForOperatorUse();

}

