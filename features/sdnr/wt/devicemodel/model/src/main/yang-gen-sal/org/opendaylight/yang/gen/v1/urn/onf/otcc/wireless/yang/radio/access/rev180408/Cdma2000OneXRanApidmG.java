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
 * grouping cdma2000-one-x-ran-apidm-g {
 *     leaf association-type {
 *         type uint8;
 *     }
 *     leaf apidlen {
 *         type uint8;
 *     }
 *     leaf apid {
 *         type binary;
 *     }
 *     leaf apidmask {
 *         type uint8;
 *     }
 *     leaf iosmscid {
 *         type uint32;
 *     }
 *     leaf ioscellid {
 *         type uint16;
 *     }
 *     leaf intrafreqhohysincl {
 *         type boolean;
 *     }
 *     leaf intrafreqhohys {
 *         type uint8;
 *     }
 *     leaf intrafreqhoslopeincl {
 *         type boolean;
 *     }
 *     leaf intrafreqhoslope {
 *         type uint8;
 *     }
 *     leaf interfreqhohysincl {
 *         type boolean;
 *     }
 *     leaf interfreqhohys {
 *         type uint8;
 *     }
 *     leaf interfreqhoslopeincl {
 *         type boolean;
 *     }
 *     leaf interfreqhoslope {
 *         type uint8;
 *     }
 *     leaf interfreqsrchthincl {
 *         type boolean;
 *     }
 *     leaf interfreqsrchth {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-apidm-g</i>
 *
 */
public interface Cdma2000OneXRanApidmG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-apidm-g").intern();

    /**
     * The FAP shall set this field to the value shown in {{bibref|3GPP2-C.S0005}} 
     * corresponding to the configuration of the base station.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>associationType</code>, or <code>null</code> if not present
     */
    java.lang.Short getAssociationType();
    
    /**
     * The FAP shall set this field to the length of the access point identification in
     * units of 16 bits. Refer to {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>apidlen</code>, or <code>null</code> if not present
     */
    java.lang.Short getApidlen();
    
    /**
     * Access Point Identification. Refer {{bibref|3GPP2-C.S0005}} for definition.
     *
     *
     *
     * @return <code>byte[]</code> <code>apid</code>, or <code>null</code> if not present
     */
    byte[] getApid();
    
    /**
     * Access Point identification Mask. Refer {{bibref|3GPP2-C.S0005}} for definition.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>apidmask</code>, or <code>null</code> if not present
     */
    java.lang.Short getApidmask();
    
    /**
     * MSC_ID of the base station. Refer {{bibref|3GPP2-C.S0005}} for definition.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>iosmscid</code>, or <code>null</code> if not present
     */
    java.lang.Long getIosmscid();
    
    /**
     * CELL_ID of the base station. Refer {{bibref|3GPP2-C.S0005}} for definition.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ioscellid</code>, or <code>null</code> if not present
     */
    java.lang.Integer getIoscellid();
    
    /**
     * This field indicates whether the INTRAFREQHOHYS field is valid and included in 
     * Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for 
     * definition.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>intrafreqhohysincl</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIntrafreqhohysincl();
    
    /**
     * Intra Frequency Handoff Hysteresis. Refer {{bibref|3GPP2-C.S0005}} for 
     * definition.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>intrafreqhohys</code>, or <code>null</code> if not present
     */
    java.lang.Short getIntrafreqhohys();
    
    /**
     * This field indicates whether the INTRAFREQHOSLOPE field is valid and included in
     * Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for 
     * definition.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>intrafreqhoslopeincl</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIntrafreqhoslopeincl();
    
    /**
     * Intra Frequency Handoff Slope. Refer {{bibref|3GPP2-C.S0005}} for definition.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>intrafreqhoslope</code>, or <code>null</code> if not present
     */
    java.lang.Short getIntrafreqhoslope();
    
    /**
     * This field indicates whether the INTERFREQHOHYS field is valid and included in 
     * Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for 
     * definition.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>interfreqhohysincl</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInterfreqhohysincl();
    
    /**
     * Inter frequency handoff hysteresis. Refer {{bibref|3GPP2-C.S0005}} for 
     * definition.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>interfreqhohys</code>, or <code>null</code> if not present
     */
    java.lang.Short getInterfreqhohys();
    
    /**
     * This field indicates whether the INTERFREQHOSLOPE field is valid and included in
     * Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for 
     * definition.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>interfreqhoslopeincl</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInterfreqhoslopeincl();
    
    /**
     * Inter frequency handoff slope. Refer {{bibref|3GPP2-C.S0005}} for definition.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>interfreqhoslope</code>, or <code>null</code> if not present
     */
    java.lang.Short getInterfreqhoslope();
    
    /**
     * This field indicates whether the INTERFREQSRCHTH field is valid and included in 
     * Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for 
     * definition.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>interfreqsrchthincl</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInterfreqsrchthincl();
    
    /**
     * Inter-frequency search threshold. Refer {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>interfreqsrchth</code>, or <code>null</code> if not present
     */
    java.lang.Short getInterfreqsrchth();

}

