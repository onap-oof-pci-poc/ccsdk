package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table containing information broadcast on control channel.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-cdma2000-one-x-cell-control-channel-g {
 *     leaf sid {
 *         type int64;
 *     }
 *     leaf nid {
 *         type int64;
 *     }
 *     leaf regzone {
 *         type int64;
 *     }
 *     leaf baselat {
 *         type int64;
 *     }
 *     leaf baselong {
 *         type int64;
 *     }
 *     leaf mcc {
 *         type int64;
 *     }
 *     leaf mncimsi1112 {
 *         type int64;
 *     }
 *     leaf baseid {
 *         type int64;
 *     }
 *     leaf apid {
 *         type string;
 *     }
 *     leaf apidmask {
 *         type int64;
 *     }
 *     leaf apidtext {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-cdma2000-one-x-cell-control-channel-g</i>
 *
 */
public interface RemCdma2000OneXCellControlChannelG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-one-x-cell-control-channel-g").intern();

    /**
     * System identification. Refer to {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>sid</code>, or <code>null</code> if not present
     */
    java.lang.Long getSid();
    
    /**
     * Network identification. Refer to {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>nid</code>, or <code>null</code> if not present
     */
    java.lang.Long getNid();
    
    /**
     * Registration Zone. Refer to {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>regzone</code>, or <code>null</code> if not present
     */
    java.lang.Long getRegzone();
    
    /**
     * Basestation latitude. Refer to {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>baselat</code>, or <code>null</code> if not present
     */
    java.lang.Long getBaselat();
    
    /**
     * Basestation longtitude. Refer to {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>baselong</code>, or <code>null</code> if not present
     */
    java.lang.Long getBaselong();
    
    /**
     * Mobile Country Code. Refer to {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>mcc</code>, or <code>null</code> if not present
     */
    java.lang.Long getMcc();
    
    /**
     * the 11th and 12th digits of IMSI, i.e., Mobile Network Code. Refer to 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>mncimsi1112</code>, or <code>null</code> if not present
     */
    java.lang.Long getMncimsi1112();
    
    /**
     * Basestation identification. Refer to {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>baseid</code>, or <code>null</code> if not present
     */
    java.lang.Long getBaseid();
    
    /**
     * Access Point Identification. Set to empty string if not available. Refer to 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>apid</code>, or <code>null</code> if not present
     */
    java.lang.String getApid();
    
    /**
     * Access Point Identification Mask. Set to zero if not available. Refer to 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>apidmask</code>, or <code>null</code> if not present
     */
    java.lang.Long getApidmask();
    
    /**
     * Access Point Identification Text. Set to empty string if not available. Refer to
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>apidtext</code>, or <code>null</code> if not present
     */
    java.lang.String getApidtext();

}

