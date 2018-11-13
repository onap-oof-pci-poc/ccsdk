package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * REM specific configuration and reporting.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-cdma2000-hrpd-channel-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf sniffing-band-class {
 *         type uint8;
 *     }
 *     leaf sniffing-channel-number {
 *         type uint16;
 *     }
 *     leaf-list pn-list {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-cdma2000-hrpd-channel-g</i>
 *
 */
public interface RemCdma2000HrpdChannelG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-hrpd-channel-g").intern();

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
     * Config parameter to set band class. Reference - {{bibref|3GPP2-C.S0057}}, Band 
     * Class Specification for CDMA2000 Spread Spectrum Systems.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>sniffingBandClass</code>, or <code>null</code> if not present
     */
    java.lang.Short getSniffingBandClass();
    
    /**
     * The Radio Frequency Channel Number (RFCN) in the FL direction.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>sniffingChannelNumber</code>, or <code>null</code> if not present
     */
    java.lang.Integer getSniffingChannelNumber();
    
    /**
     * {{list}} Each item is a (single value) PN offset in units of 64 PN chips or 
     * PNrange expressed in the following format: 
     * &amp;lt;Start-value&amp;gt;".."&amp;lt;End-value&amp;gt;:&amp;lt;Increment&amp;gt;.
     * If an empty string, then no specific PNList is provided, meaning that the FAP is
     * required to pick a PN list to scan on its own.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pnList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getPnList();

}

