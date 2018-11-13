package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object can be configured only if 
 * {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to 
 * {{true}}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-apidtm-g {
 *     leaf apidtextcha-ri-len {
 *         type uint16;
 *     }
 *     leaf apidtextmsgencoding {
 *         type uint8;
 *     }
 *     leaf apidtextcha-ri {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-apidtm-g</i>
 *
 */
public interface Cdma2000OneXRanApidtmG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-apidtm-g").intern();

    /**
     * Access Point identification Text CHARi field Length ({{param|APIDTEXTCHARi}}). 
     * Refer {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>apidtextchaRiLen</code>, or <code>null</code> if not present
     */
    java.lang.Integer getApidtextchaRiLen();
    
    /**
     * Access Point identification Text message encoding. Refer 
     * {{bibref|3GPP2-C.S0005}} and {{bibref|3GPP2-C.R1001}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>apidtextmsgencoding</code>, or <code>null</code> if not present
     */
    java.lang.Short getApidtextmsgencoding();
    
    /**
     * Access Point Identification Text. Refer {{bibref|3GPP2-C.S0005}} and 
     * {{bibref|3GPP2-C.R1001}} for definitions.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>apidtextchaRi</code>, or <code>null</code> if not present
     */
    java.lang.String getApidtextchaRi();

}

