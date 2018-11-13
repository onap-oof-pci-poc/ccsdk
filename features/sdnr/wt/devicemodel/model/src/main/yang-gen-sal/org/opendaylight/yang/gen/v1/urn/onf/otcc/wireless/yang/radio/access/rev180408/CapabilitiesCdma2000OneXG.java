package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the capability attributes for the 
 * CDMA2000 1x radio technology portions of a CDMA2000 FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping capabilities-cdma2000-one-x-g {
 *     leaf band-class-supportedfap {
 *         type string;
 *     }
 *     leaf active-handin-capable {
 *         type boolean;
 *     }
 *     leaf femto-overhead-messages-capable {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/capabilities-cdma2000-one-x-g</i>
 *
 */
public interface CapabilitiesCdma2000OneXG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-cdma2000-one-x-g").intern();

    /**
     * {{list}} Indicates the CDMA bands that the FAP supports. At least one band MUST 
     * be supported and multiple bands MAY be supported. Bandclass is a 1 or 2-digit 
     * number as defined in {{bibref|3GPP2-C.S0057}}. The following are example values:
     * "0" (specifies US Cellular) "1,3,14" (specifies US PCS, Japan Cellular and US 
     * PCS 1.9Ghz)
     *
     *
     *
     * @return <code>java.lang.String</code> <code>bandClassSupportedfap</code>, or <code>null</code> if not present
     */
    java.lang.String getBandClassSupportedfap();
    
    /**
     * Indicates whether the FAP is capable of accepting hand-in of active 1x call from
     * another base station. If {{true}}, the FAP is capable of accepting hand-in. If 
     * {{false}}, the FAP is not capable of accepting hand-in.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>activeHandinCapable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isActiveHandinCapable();
    
    /**
     * Indicates whether the FAP supports Access Point Identification, Access Point 
     * Pilot Information, and Access Point Identification Text messages specified in 
     * {{bibref|3GPP2-C.S0005}}. If {{true}}, the FAP supports these messages. If 
     * {{false}}, the FAP does not supports these messages.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>femtoOverheadMessagesCapable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isFemtoOverheadMessagesCapable();

}

