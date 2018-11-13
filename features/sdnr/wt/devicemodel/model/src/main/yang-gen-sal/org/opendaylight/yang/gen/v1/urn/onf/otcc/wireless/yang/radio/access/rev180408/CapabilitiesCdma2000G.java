package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the capability attributes for 
 * CDMA2000 FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping capabilities-cdma2000-g {
 *     leaf remote-ip-access-capable {
 *         type boolean;
 *     }
 *     leaf-list band-class-supportedfap-beacon {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/capabilities-cdma2000-g</i>
 *
 */
public interface CapabilitiesCdma2000G
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-cdma2000-g").intern();

    /**
     * Indicates whether the FAP is capable of providing remote IP access service as 
     * defined in {{bibref|3GPP2-X.S0059}}. If {{true}}, the FAP is capable of remote 
     * IP access service. If {{false}}, the FAP is not capable of remote IP access 
     * service.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>remoteIpAccessCapable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isRemoteIpAccessCapable();
    
    /**
     * {{list}} Indicates the band classes that the FAP supports for beacon 
     * transmission. One or multiple bands MAY be supported. Bandclass is a 1 or 
     * 2-digit number as defined in {{bibref|3GPP2-C.S0057}}. List is empty if FAP can 
     * not support beacon transmissions.
     *
     *
     *
     * @return <code>java.util.List</code> <code>bandClassSupportedfapBeacon</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getBandClassSupportedfapBeacon();

}

