package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the UL SRS (Sounding Reference 
 * Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.3}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-srs-g {
 *     leaf srs-enabled {
 *         type boolean;
 *     }
 *     leaf-list srs-bandwidth-config {
 *         type string;
 *     }
 *     leaf srs-max-up-pts {
 *         type boolean;
 *     }
 *     leaf ack-nack-srs-simultaneous-transmission {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-srs-g</i>
 *
 */
public interface LteRanPhySrsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-srs-g").intern();

    /**
     * Indicates whether UL SRS (Sounding RS) is enabled or not. If {{true}}, UL 
     * Sounding RS is enabled. If {{false}}, UL Sounding RS is disabled. Corresponds to
     * SoundingRS-UL-ConfigCommonIE defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>srsEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isSrsEnabled();
    
    /**
     * {{list}} Each item is a index into tables of cell specific SRS Bandwidth 
     * Configuration, with a numeric range between 0 and 7 inclusive. In case there is 
     * more than one item in the list, the first item contains the most preferred 
     * value. SRS Bandwidth Configuration tables are specified in 
     * {{bibref|3GPP-TS.36.211|Table 5.5.3.2-1, 5.5.3.2-2, 5.5.3.2-3 and 5.5.3.2– 4}}. 
     * Corresponds to srs-BandwidthConfig IE specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}}. The multiplicity of the {{param}} 
     * values can also be expressed by defining a range using ".." (two periods) 
     * between two values. In this case, the combination of two values defines the 
     * lower-bound and upper-bound of the range inclusive. If this notation is used, 
     * then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If supports self-configuration capability for {{param}} and more than one item 
     * is configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>srsBandwidthConfig</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSrsBandwidthConfig();
    
    /**
     * Defines whether reconfiguration of SRS applies to UpPTS or not. If {{true}}, SRS
     * applies to UpPTS. If {{false}}, SRS does not apply to UpPTS. Corresponds to 
     * srs-MaxUpPts specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and 
     * srsMaxUpPts specified in {{bibref|3GPP-TS.36.211|Section 5.5.3.2}}. This 
     * parameter is applicable to TDD mode only.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>srsMaxUpPts</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isSrsMaxUpPts();
    
    /**
     * Defines whether a UE can simultaneously transmit SRS and HARQ ACK/NACK or not. 
     * If {{true}}, simultaneous transmission is allowed. If {{false}}, simultaneous 
     * transmission is not allowed. Corresponds to ackNackSRS-SimultaneousTransmission 
     * specfied in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Simultaneous-AN-and-SRS 
     * specified in {{bibref|3GPP-TS.36.213|Section 8.2}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>ackNackSrsSimultaneousTransmission</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAckNackSrsSimultaneousTransmission();

}

