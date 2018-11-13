package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table containing information braodcast on control channel.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-cdma2000-hrpd-cell-control-channel-g {
 *     leaf color-code {
 *         type int64;
 *     }
 *     leaf sector-id {
 *         type binary;
 *     }
 *     leaf subnet-mask {
 *         type subnet-mask;
 *     }
 *     leaf country-code {
 *         type int64;
 *     }
 *     leaf latitude {
 *         type latitude;
 *     }
 *     leaf longitude {
 *         type longitude;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-cdma2000-hrpd-cell-control-channel-g</i>
 *
 */
public interface RemCdma2000HrpdCellControlChannelG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-hrpd-cell-control-channel-g").intern();

    /**
     * The color code of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>colorCode</code>, or <code>null</code> if not present
     */
    java.lang.Long getColorCode();
    
    /**
     * The sector ID of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
     *
     *
     *
     * @return <code>byte[]</code> <code>sectorId</code>, or <code>null</code> if not present
     */
    byte[] getSectorId();
    
    /**
     * The length of the subnet mask in {{units}} for the measured sector as defined in
     * {{bibref|3GPP2-C.S0024}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>subnetMask</code>, or <code>null</code> if not present
     */
    java.lang.Long getSubnetMask();
    
    /**
     * The country code of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>countryCode</code>, or <code>null</code> if not present
     */
    java.lang.Long getCountryCode();
    
    /**
     * The reported lattitude of the cell in units of {{units}}, expressed as a two's 
     * complement signed number with positive numbers signifying North latitudes in the
     * range -1296000 to 1296000 inclusive corresponding to a range of -90 to +90) 
     * Refer to {{bibref|3GPP2-C.S0024}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>latitude</code>, or <code>null</code> if not present
     */
    java.lang.Long getLatitude();
    
    /**
     * The reported longitude of the cell in units of {{units}}, expressed as a two's 
     * complement signed number with positive numbers signifying East longitude in the 
     * range -2592000 to 2592000 inclusive (corresponding to a range of -180 to +180). 
     * Refer to {{bibref|3GPP2-C.S0024}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>longitude</code>, or <code>null</code> if not present
     */
    java.lang.Long getLongitude();

}

