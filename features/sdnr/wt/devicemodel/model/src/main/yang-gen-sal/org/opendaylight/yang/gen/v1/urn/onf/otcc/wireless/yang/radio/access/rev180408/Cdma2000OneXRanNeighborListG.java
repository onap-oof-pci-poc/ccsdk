package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains information common to all neighbors of a sector. This 
 * object has only one instance.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-neighbor-list-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf pilot-inc {
 *         type int64;
 *     }
 *     leaf one-x-neighbor-index {
 *         type int64;
 *     }
 *     leaf neighbor-config {
 *         type enumeration;
 *     }
 *     leaf neighbor-pn {
 *         type int64;
 *     }
 *     leaf search-priority {
 *         type enumeration;
 *     }
 *     leaf neighbor-band {
 *         type enumeration;
 *     }
 *     leaf neighbor-frequency {
 *         type int64;
 *     }
 *     leaf frequency-included {
 *         type int64;
 *     }
 *     leaf in-traffic {
 *         type int64;
 *     }
 *     leaf overhead-msg {
 *         type int64;
 *     }
 *     leaf base-identifier {
 *         type int64;
 *     }
 *     leaf air-interface {
 *         type enumeration;
 *     }
 *     leaf hand-out-capable {
 *         type int64;
 *     }
 *     leaf one-x-neighbor-longitude {
 *         type string;
 *     }
 *     leaf one-x-neighbor-latitude {
 *         type string;
 *     }
 *     leaf one-x-neighbor-msc-id {
 *         type uint32;
 *     }
 *     leaf one-x-neighbor-ios-cell-id {
 *         type uint16;
 *     }
 *     leaf force-in-overhead {
 *         type boolean;
 *     }
 *     leaf included-in-overhead {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-neighbor-list-g</i>
 *
 */
public interface Cdma2000OneXRanNeighborListG
    extends
    DataObject
{


    public enum NeighborConfig {
        /**
         * none
         *
         */
        SameConfig(1, "same-config"),
        
        /**
         * none
         *
         */
        SamePaging(2, "same-paging"),
        
        /**
         * none
         *
         */
        DiffPaging(3, "diff-paging"),
        
        /**
         * none
         *
         */
        Unknown(4, "unknown")
        ;
    
        private static final java.util.Map<java.lang.Integer, NeighborConfig> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NeighborConfig> b = com.google.common.collect.ImmutableMap.builder();
            for (NeighborConfig enumItem : NeighborConfig.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private NeighborConfig(int value, java.lang.String name) {
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
         * @return corresponding NeighborConfig item
         */
        public static NeighborConfig forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum SearchPriority {
        /**
         * none
         *
         */
        Low(1, "low"),
        
        /**
         * none
         *
         */
        Medium(2, "medium"),
        
        /**
         * none
         *
         */
        High(3, "high"),
        
        /**
         * none
         *
         */
        VeryHigh(4, "very-high")
        ;
    
        private static final java.util.Map<java.lang.Integer, SearchPriority> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, SearchPriority> b = com.google.common.collect.ImmutableMap.builder();
            for (SearchPriority enumItem : SearchPriority.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private SearchPriority(int value, java.lang.String name) {
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
         * @return corresponding SearchPriority item
         */
        public static SearchPriority forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum NeighborBand {
        /**
         * none
         *
         */
        _0(1, "0"),
        
        /**
         * none
         *
         */
        _1(2, "1"),
        
        /**
         * none
         *
         */
        _2(3, "2"),
        
        /**
         * none
         *
         */
        _3(4, "3"),
        
        /**
         * none
         *
         */
        _4(5, "4"),
        
        /**
         * none
         *
         */
        _5(6, "5"),
        
        /**
         * none
         *
         */
        _6(7, "6")
        ;
    
        private static final java.util.Map<java.lang.Integer, NeighborBand> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NeighborBand> b = com.google.common.collect.ImmutableMap.builder();
            for (NeighborBand enumItem : NeighborBand.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private NeighborBand(int value, java.lang.String name) {
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
         * @return corresponding NeighborBand item
         */
        public static NeighborBand forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum AirInterface {
        /**
         * none
         *
         */
        OneX(1, "one-x"),
        
        /**
         * none
         *
         */
        Is95(2, "is95"),
        
        /**
         * none
         *
         */
        Hrpd(3, "hrpd"),
        
        /**
         * none
         *
         */
        Other(4, "other")
        ;
    
        private static final java.util.Map<java.lang.Integer, AirInterface> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AirInterface> b = com.google.common.collect.ImmutableMap.builder();
            for (AirInterface enumItem : AirInterface.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private AirInterface(int value, java.lang.String name) {
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
         * @return corresponding AirInterface item
         */
        public static AirInterface forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-neighbor-list-g").intern();

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
     * pilot increment policy for this network. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pilotInc</code>, or <code>null</code> if not present
     */
    java.lang.Long getPilotInc();
    
    /**
     * Macro neighbour index. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXNeighborIndex</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXNeighborIndex();
    
    /**
     * Neighbor configuration in terms of number of frequencies having paging channels 
     * as defined in Section 3.7.2.3.2 of the {{bibref|3GPP2-C.S0005}} standard
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG.NeighborConfig</code> <code>neighborConfig</code>, or <code>null</code> if not present
     */
    NeighborConfig getNeighborConfig();
    
    /**
     * PN offset of the neighbor. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>neighborPn</code>, or <code>null</code> if not present
     */
    java.lang.Long getNeighborPn();
    
    /**
     * priority level for serching this neighbor. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG.SearchPriority</code> <code>searchPriority</code>, or <code>null</code> if not present
     */
    SearchPriority getSearchPriority();
    
    /**
     * Neighbor band class. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG.NeighborBand</code> <code>neighborBand</code>, or <code>null</code> if not present
     */
    NeighborBand getNeighborBand();
    
    /**
     * frequency of neighbor. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>neighborFrequency</code>, or <code>null</code> if not present
     */
    java.lang.Long getNeighborFrequency();
    
    /**
     * Flag to indicate if the channel id included. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>frequencyIncluded</code>, or <code>null</code> if not present
     */
    java.lang.Long getFrequencyIncluded();
    
    /**
     * whether this neighbor can be used for in-traffic neighborlist message
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>inTraffic</code>, or <code>null</code> if not present
     */
    java.lang.Long getInTraffic();
    
    /**
     * whether this neighbor can be used for overhead neighborlist message
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>overheadMsg</code>, or <code>null</code> if not present
     */
    java.lang.Long getOverheadMsg();
    
    /**
     * unique identifire of the neighboring cell (optional)
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>baseIdentifier</code>, or <code>null</code> if not present
     */
    java.lang.Long getBaseIdentifier();
    
    /**
     * Air interface technology of the neighbor.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG.AirInterface</code> <code>airInterface</code>, or <code>null</code> if not present
     */
    AirInterface getAirInterface();
    
    /**
     * Flag to indicate if the handOutCapability is possible.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>handOutCapable</code>, or <code>null</code> if not present
     */
    java.lang.Long getHandOutCapable();
    
    /**
     * Longitude for this neighbor. Parameter is a string representing a floating point
     * real number (+/- XXX.YY). Where + for East, - for West, XXX.Y ranges between 0.0
     * and 180.0 .
     *
     *
     *
     * @return <code>java.lang.String</code> <code>oneXNeighborLongitude</code>, or <code>null</code> if not present
     */
    java.lang.String getOneXNeighborLongitude();
    
    /**
     * Lattitude for this neighbor. Parameter is a string representing a floating point
     * number (+/-XX.Y). + for North, - for South, XX.Y ranges between 0.0 and 90.0.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>oneXNeighborLatitude</code>, or <code>null</code> if not present
     */
    java.lang.String getOneXNeighborLatitude();
    
    /**
     * IOS MSCID of the neighbors. See {{bibref|3GPP2-A.S0014}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXNeighborMscId</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXNeighborMscId();
    
    /**
     * Cell Identifier of the neighbor (formatted according to Cell Identification 
     * Discriminator = '0000 0010', i.e., 12-bit cell value and 4-bit sector value). 
     * See {{bibref|3GPP2-A.S0014}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>oneXNeighborIosCellId</code>, or <code>null</code> if not present
     */
    java.lang.Integer getOneXNeighborIosCellId();
    
    /**
     * If {{param}} is set to {{true}}, the FAP SHOULD include this Neighbor List entry
     * in the Neighbor List overhead messages (see {{bibref|3GPP2-C.S0005}}. Otherwise,
     * {{param}} is set to {{false}}, in which case the FAP MAY include this Neighbor 
     * List entry in the Neighbor List overhead messages.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>forceInOverhead</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isForceInOverhead();
    
    /**
     * If {{param}} is set to {{true}}, the FAP is currently including this Neighbor 
     * List entry in the Neighbor List overhead messages (see {{bibref|3GPP2-C.S0005}}.
     * Otherwise, {{param}} is set to {{false}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>includedInOverhead</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIncludedInOverhead();

}

