package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * CDMA2000 HRPD service redirection parameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-redirect-g {
 *     leaf redirect-channel-number {
 *         type uint16;
 *     }
 *     leaf redirect-band-class {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-redirect-g</i>
 *
 */
public interface Cdma2000HrpdRedirectG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-redirect-g").intern();

    /**
     * The channel number set from ACS that the FAP uses to redirect the AT in case of 
     * closed access or when exceeding session capacity. The ACS shall push this if the
     * the operator has provided this information in a configuration file. If this is 
     * not configured, the FAP rejects the AT. The supported range is 0..2047.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>redirectChannelNumber</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRedirectChannelNumber();
    
    /**
     * The bandclass set from ACS that the FAP uses to redirect the AT incase of closed
     * access or when exceeding session capacity. The ACS shall push this if the the 
     * operator has provided this information in a configuration file. If this is not 
     * configured, the FAP rejects the AT. The supported range is 0..9.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>redirectBandClass</code>, or <code>null</code> if not present
     */
    java.lang.Short getRedirectBandClass();

}

