package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the capability attributes for the 
 * CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping capabilities-cdma2000-hrpd-g {
 *     leaf a13-session-transfer-capable {
 *         type boolean;
 *     }
 *     leaf a16-session-transfer-capable {
 *         type boolean;
 *     }
 *     leaf local-ip-access-capable {
 *         type boolean;
 *     }
 *     leaf dedicated-hrpd-beacon {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/capabilities-cdma2000-hrpd-g</i>
 *
 */
public interface CapabilitiesCdma2000HrpdG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-cdma2000-hrpd-g").intern();

    /**
     * Indicates whether the FAP is capable of supporting A13 session transfer. See 
     * {{bibref|3GPP2-C.S0024-B}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>a13SessionTransferCapable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isA13SessionTransferCapable();
    
    /**
     * Indicates whether the FAP is capable of supporting A16 session transfer. See 
     * {{bibref|3GPP2-C.S0024-B}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>a16SessionTransferCapable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isA16SessionTransferCapable();
    
    /**
     * Indicates whether the FAP is capable of supporting Local IP access. See 
     * {{bibref|3GPP2-C.S0024-B}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>localIpAccessCapable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLocalIpAccessCapable();
    
    /**
     * Indicated whether the FAP supports a dedicated transmission of HRPD beacon 
     * independent of the generalized beacon.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>dedicatedHrpdBeacon</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isDedicatedHrpdBeacon();

}

