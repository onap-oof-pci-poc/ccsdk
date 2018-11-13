package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the channel frequncy related 
 * information of GERAN (GSM) system (see {{bibref|3GPP-TS.32.592|Section 
 * 6.1.5.1.7}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-idle-mode-irat-geran-geran-freq-group-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf band-indicator {
 *         type enumeration;
 *     }
 *     leaf bccharfcn {
 *         type uint16;
 *     }
 *     leaf-list q-rx-lev-min {
 *         type string;
 *     }
 *     leaf cell-reselection-priority {
 *         type uint8;
 *     }
 *     leaf thresh-x-high {
 *         type thresh-x-high;
 *     }
 *     leaf thresh-x-low {
 *         type thresh-x-low;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-idle-mode-irat-geran-geran-freq-group-g</i>
 *
 */
public interface LteRanMobilityIdleModeIratGeranGeranFreqGroupG
    extends
    DataObject
{


    public enum BandIndicator {
        /**
         * none
         *
         */
        Gsm850(1, "gsm850"),
        
        /**
         * none
         *
         */
        Gsm900(2, "gsm900"),
        
        /**
         * none
         *
         */
        Dcs1800(3, "dcs1800"),
        
        /**
         * none
         *
         */
        Pcs1900(4, "pcs1900")
        ;
    
        private static final java.util.Map<java.lang.Integer, BandIndicator> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, BandIndicator> b = com.google.common.collect.ImmutableMap.builder();
            for (BandIndicator enumItem : BandIndicator.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private BandIndicator(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding BandIndicator item
         */
        public static BandIndicator forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-geran-geran-freq-group-g").intern();

    /**
     * Enables or disables this entry.
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
     * Indicates how to interpret the BCCH ARFCN. {{enum}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG.BandIndicator</code> <code>bandIndicator</code>, or <code>null</code> if not present
     */
    BandIndicator getBandIndicator();
    
    /**
     * ARFCN of this cell.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>bccharfcn</code>, or <code>null</code> if not present
     */
    java.lang.Integer getBccharfcn();
    
    /**
     * {{list}} Each item is a required minimum received RSSI level on this GERAN 
     * frequency carrier for re-selection to this UTRA FDD carrier, specified in dBm, 
     * with a numeric range between 0 and 63 inclusive. In case there is more than one 
     * item in the list, the first item contains the most preferred value. The value of
     * ({{param}} * 2 - 115) yields the actual value. Corresponds to parameter 
     * q-rxLevMin in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to 
     * RXLEV_ACCESS_MIN in {{bibref|3GPP-TS.45.008}}. The multiplicity of the {{param}}
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
     * @return <code>java.util.List</code> <code>qRxLevMin</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQRxLevMin();
    
    /**
     * Absolute priority of this GERAN frequency group, as used by the inter-frequency 
     * cell re-selection procedure. Corresponds to parameter CellReselectionPriority 
     * specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>cellReselectionPriority</code>, or <code>null</code> if not present
     */
    java.lang.Short getCellReselectionPriority();
    
    /**
     * Threshold used when re-selecting towards a higher priority GERAN frequency group
     * than current serving E-UTRA frequency, specified in {{units}}. The value of 
     * ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-High 
     * specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>threshXHigh</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreshXHigh();
    
    /**
     * Threshold used when re-selecting towards a lower priority GERAN frequency group 
     * than current serving E-UTRA frequency, specified in {{units}} dB. The value of 
     * ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-Low 
     * specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>threshXLow</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreshXLow();

}

