package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the Closed Subscriber Group (CSG).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-csg-g {
 *     leaf csg-indicator {
 *         type boolean;
 *     }
 *     leaf-list uarfcndl-list {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-csg-g</i>
 *
 */
public interface UmtsRanCsgG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-csg-g").intern();

    /**
     * The CSG-indicator Information Element (IE) in the Master Information Block 
     * reflects the access mode of the CSG cell. It is hence dependent on the value of 
     * {{param|.AccessMgmt.UMTS.AccessMode}}. If {{true}} the CSG-indicator IE is 
     * present, reflecting access to the CSG cell is closed. If {{false}} the 
     * CSG-indicator IE is absent, reflecting access to the CSG cell is not closed. 
     * {{bibref|3GPP-TS.25.331|Section 10.2.48.8.1}}
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>csgIndicator</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCsgIndicator();
    
    /**
     * {{list}} Each item is a UTRA Absolute Radio Frequency Channel Number (UARFCN) in
     * the DL direction dedicated to the CSG cells. {{param}} is broadcast in SIB 11bis
     * {{bibref|3GPP-TS.25.331|Section 10.2.48.8.14a}}. The corresponding UTRA Absolute
     * Radio Frequency Channel Number (UARFCN) in the UL direction is derived based on 
     * the fixed offset applicable for the frequency band.
     *
     *
     *
     * @return <code>java.util.List</code> <code>uarfcndlList</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getUarfcndlList();

}

