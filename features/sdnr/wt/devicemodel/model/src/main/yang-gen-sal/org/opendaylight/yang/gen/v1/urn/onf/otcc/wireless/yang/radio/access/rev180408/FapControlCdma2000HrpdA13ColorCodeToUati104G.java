package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * HRPD ColorCode to UATI Mapping Table number of entries.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-cdma2000-hrpd-a13-color-code-to-uati104-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf color-code {
 *         type uint16;
 *     }
 *     leaf uati104 {
 *         type binary;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-cdma2000-hrpd-a13-color-code-to-uati104-g</i>
 *
 */
public interface FapControlCdma2000HrpdA13ColorCodeToUati104G
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-hrpd-a13-color-code-to-uati104-g").intern();

    /**
     * Enables or disables the {{object}} entry.
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
     * Color Code mapped to UATI104 in the following field
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>colorCode</code>, or <code>null</code> if not present
     */
    java.lang.Integer getColorCode();
    
    /**
     * The UATI104 of the AT that accesses with the ColorCode field
     *
     *
     *
     * @return <code>byte[]</code> <code>uati104</code>, or <code>null</code> if not present
     */
    byte[] getUati104();

}

