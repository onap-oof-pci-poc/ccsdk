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
 * grouping cdma2000-one-x-ran-appim-appirec-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf apassntype {
 *         type uint8;
 *     }
 *     leaf apsidsameasprevious {
 *         type uint8;
 *     }
 *     leaf apnidsameasprevious {
 *         type uint8;
 *     }
 *     leaf apbandsameasprevious {
 *         type uint8;
 *     }
 *     leaf apfreqsameasprevious {
 *         type uint8;
 *     }
 *     leaf appnrecsameasprevious {
 *         type uint8;
 *     }
 *     leaf apsid {
 *         type uint16;
 *     }
 *     leaf apnid {
 *         type uint16;
 *     }
 *     leaf apband {
 *         type uint8;
 *     }
 *     leaf apfreq {
 *         type uint16;
 *     }
 *     leaf appnrectype {
 *         type uint8;
 *     }
 *     leaf appnreclen {
 *         type uint8;
 *     }
 *     leaf appnrec {
 *         type binary;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-appim-appirec-g</i>
 *
 */
public interface Cdma2000OneXRanAppimAppirecG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-appim-appirec-g").intern();

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
     * Access point association type the access point pilot information record. Refer 
     * {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>apassntype</code>, or <code>null</code> if not present
     */
    java.lang.Short getApassntype();
    
    /**
     * SID same as previous indicator in the access point pilot information record. 
     * Refer {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>apsidsameasprevious</code>, or <code>null</code> if not present
     */
    java.lang.Short getApsidsameasprevious();
    
    /**
     * NID same as previous indicator in the access point pilot information record. 
     * Refer {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>apnidsameasprevious</code>, or <code>null</code> if not present
     */
    java.lang.Short getApnidsameasprevious();
    
    /**
     * Bandclass same as previous indicator in the access point pilot information 
     * record. Refer {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>apbandsameasprevious</code>, or <code>null</code> if not present
     */
    java.lang.Short getApbandsameasprevious();
    
    /**
     * Frequency same as previous indicator in the access point pilot information 
     * record. Refer {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>apfreqsameasprevious</code>, or <code>null</code> if not present
     */
    java.lang.Short getApfreqsameasprevious();
    
    /**
     * PN offset same as previous indicator in the access point pilot information 
     * record. Refer {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>appnrecsameasprevious</code>, or <code>null</code> if not present
     */
    java.lang.Short getAppnrecsameasprevious();
    
    /**
     * Access point SID in the access point pilot information record. Refer 
     * {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>apsid</code>, or <code>null</code> if not present
     */
    java.lang.Integer getApsid();
    
    /**
     * Access point NID in the access point pilot information record. Refer 
     * {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>apnid</code>, or <code>null</code> if not present
     */
    java.lang.Integer getApnid();
    
    /**
     * Access point bandclass in the access point pilot information record. Refer 
     * {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>apband</code>, or <code>null</code> if not present
     */
    java.lang.Short getApband();
    
    /**
     * Access point frequency in the access point pilot information record. Refer 
     * {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>apfreq</code>, or <code>null</code> if not present
     */
    java.lang.Integer getApfreq();
    
    /**
     * Access point PN offset in the access point pilot information record. Refer 
     * {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>appnrectype</code>, or <code>null</code> if not present
     */
    java.lang.Short getAppnrectype();
    
    /**
     * Length in octets of the access point PN record ({{param|APPNREC}}) in the access
     * point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>appnreclen</code>, or <code>null</code> if not present
     */
    java.lang.Short getAppnreclen();
    
    /**
     * Access point PN Record in the access point pilot information record. Refer 
     * {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>byte[]</code> <code>appnrec</code>, or <code>null</code> if not present
     */
    byte[] getAppnrec();

}

