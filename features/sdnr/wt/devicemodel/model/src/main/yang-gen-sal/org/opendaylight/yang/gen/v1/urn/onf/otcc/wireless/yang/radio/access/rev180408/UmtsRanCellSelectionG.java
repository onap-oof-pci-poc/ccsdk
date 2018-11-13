package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters related to cell selection and reselection.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-cell-selection-g {
 *     leaf quality-measure-cpich {
 *         type enumeration;
 *     }
 *     leaf qqual-min {
 *         type qqual-min;
 *     }
 *     leaf qqual-min-offset {
 *         type qqual-min-offset;
 *     }
 *     leaf q-rx-lev-min {
 *         type q-rx-lev-min;
 *     }
 *     leaf delta-q-rx-lev-min {
 *         type delta-q-rx-lev-min;
 *     }
 *     leaf q-rx-lev-min-offset {
 *         type q-rx-lev-min-offset;
 *     }
 *     leaf q-hyst1s {
 *         type uint8;
 *     }
 *     leaf q-hyst2s {
 *         type uint8;
 *     }
 *     leaf t-reselections {
 *         type t-reselections;
 *     }
 *     leaf s-intrasearch {
 *         type int64;
 *     }
 *     leaf s-intersearch {
 *         type int64;
 *     }
 *     leaf s-search-hcs {
 *         type int64;
 *     }
 *     leaf s-search-rat {
 *         type int64;
 *     }
 *     leaf shcsrat {
 *         type int64;
 *     }
 *     leaf s-limit-search-rat {
 *         type int64;
 *     }
 *     leaf non-hcstcr-max {
 *         type enumeration;
 *     }
 *     leaf non-hcsncr {
 *         type uint8;
 *     }
 *     leaf non-hcstcr-max-hyst {
 *         type enumeration;
 *     }
 *     leaf qhcs {
 *         type qhcs;
 *     }
 *     leaf use-of-hcs {
 *         type boolean;
 *     }
 *     leaf hcs-prio {
 *         type hcs-prio;
 *     }
 *     leaf tcr-max {
 *         type enumeration;
 *     }
 *     leaf ncr {
 *         type uint8;
 *     }
 *     leaf tcr-max-hyst {
 *         type enumeration;
 *     }
 *     leaf ue-tx-pwr-max-rach {
 *         type ue-tx-pwr-max-rach;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-cell-selection-g</i>
 *
 */
public interface UmtsRanCellSelectionG
    extends
    DataObject
{


    public enum QualityMeasureCpich {
        /**
         * none
         *
         */
        EcNo(1, "ec/no"),
        
        /**
         * none
         *
         */
        Rscp(2, "rscp")
        ;
    
        private static final java.util.Map<java.lang.Integer, QualityMeasureCpich> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, QualityMeasureCpich> b = com.google.common.collect.ImmutableMap.builder();
            for (QualityMeasureCpich enumItem : QualityMeasureCpich.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private QualityMeasureCpich(int value, java.lang.String name) {
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
         * @return corresponding QualityMeasureCpich item
         */
        public static QualityMeasureCpich forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum NonHcstcrMax {
        /**
         * none
         *
         */
        NotUsed(1, "not used"),
        
        /**
         * none
         *
         */
        _30(2, "30"),
        
        /**
         * none
         *
         */
        _60(3, "60"),
        
        /**
         * none
         *
         */
        _120(4, "120"),
        
        /**
         * none
         *
         */
        _180(5, "180"),
        
        /**
         * none
         *
         */
        _240(6, "240")
        ;
    
        private static final java.util.Map<java.lang.Integer, NonHcstcrMax> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NonHcstcrMax> b = com.google.common.collect.ImmutableMap.builder();
            for (NonHcstcrMax enumItem : NonHcstcrMax.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private NonHcstcrMax(int value, java.lang.String name) {
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
         * @return corresponding NonHcstcrMax item
         */
        public static NonHcstcrMax forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum NonHcstcrMaxHyst {
        /**
         * none
         *
         */
        NotUsed(1, "not used"),
        
        /**
         * none
         *
         */
        _10(2, "10"),
        
        /**
         * none
         *
         */
        _20(3, "20"),
        
        /**
         * none
         *
         */
        _30(4, "30"),
        
        /**
         * none
         *
         */
        _40(5, "40"),
        
        /**
         * none
         *
         */
        _50(6, "50"),
        
        /**
         * none
         *
         */
        _60(7, "60"),
        
        /**
         * none
         *
         */
        _70(8, "70")
        ;
    
        private static final java.util.Map<java.lang.Integer, NonHcstcrMaxHyst> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NonHcstcrMaxHyst> b = com.google.common.collect.ImmutableMap.builder();
            for (NonHcstcrMaxHyst enumItem : NonHcstcrMaxHyst.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private NonHcstcrMaxHyst(int value, java.lang.String name) {
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
         * @return corresponding NonHcstcrMaxHyst item
         */
        public static NonHcstcrMaxHyst forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum TcrMax {
        /**
         * none
         *
         */
        NotUsed(1, "not used"),
        
        /**
         * none
         *
         */
        _30(2, "30"),
        
        /**
         * none
         *
         */
        _60(3, "60"),
        
        /**
         * none
         *
         */
        _120(4, "120"),
        
        /**
         * none
         *
         */
        _180(5, "180"),
        
        /**
         * none
         *
         */
        _240(6, "240")
        ;
    
        private static final java.util.Map<java.lang.Integer, TcrMax> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TcrMax> b = com.google.common.collect.ImmutableMap.builder();
            for (TcrMax enumItem : TcrMax.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private TcrMax(int value, java.lang.String name) {
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
         * @return corresponding TcrMax item
         */
        public static TcrMax forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum TcrMaxHyst {
        /**
         * none
         *
         */
        NotUsed(1, "not used"),
        
        /**
         * none
         *
         */
        _10(2, "10"),
        
        /**
         * none
         *
         */
        _20(3, "20"),
        
        /**
         * none
         *
         */
        _30(4, "30"),
        
        /**
         * none
         *
         */
        _40(5, "40"),
        
        /**
         * none
         *
         */
        _50(6, "50"),
        
        /**
         * none
         *
         */
        _60(7, "60"),
        
        /**
         * none
         *
         */
        _70(8, "70")
        ;
    
        private static final java.util.Map<java.lang.Integer, TcrMaxHyst> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TcrMaxHyst> b = com.google.common.collect.ImmutableMap.builder();
            for (TcrMaxHyst enumItem : TcrMaxHyst.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private TcrMaxHyst(int value, java.lang.String name) {
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
         * @return corresponding TcrMaxHyst item
         */
        public static TcrMaxHyst forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-cell-selection-g").intern();

    /**
     * Which mechanism to use when doing CPICH quality measurements. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.47}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG.QualityMeasureCpich</code> <code>qualityMeasureCpich</code>, or <code>null</code> if not present
     */
    QualityMeasureCpich getQualityMeasureCpich();
    
    /**
     * Minimum required quality measure, specified in {{units}}. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2.3 and Section 10.3.2.4}} This value is 
     * only meaningful if {{param|QualityMeasureCPICH}} has the value 
     * {{enum|Ec/No|QualityMeasureCPICH}} and it MUST otherwise be ignored.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>qqualMin</code>, or <code>null</code> if not present
     */
    java.lang.Long getQqualMin();
    
    /**
     * Offset for {{param|QqualMin}} specified in {{units}}. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2.3}} This value is only meaningful if 
     * {{param|QualityMeasureCPICH}} has the value {{enum|Ec/No|QualityMeasureCPICH}} 
     * and it MUST otherwise be ignored.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qqualMinOffset</code>, or <code>null</code> if not present
     */
    java.lang.Short getQqualMinOffset();
    
    /**
     * Minimum required RX level in the cell, specified in {{units}}. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2.3}} Only odd values are valid, use of an 
     * even value MUST be rejected by the CPE. This value is only meaningful if 
     * {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} 
     * and it MUST otherwise be ignored.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>qRxLevMin</code>, or <code>null</code> if not present
     */
    java.lang.Long getQRxLevMin();
    
    /**
     * Delta for the minimum required RX level in the cell, specified in {{units}}. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2.3 and Section 10.3.2.4}} The actual value
     * of {{param|QRxLevMin}} = {{param|QRxLevMin}} + {{param}} This value is only 
     * meaningful if {{param|QualityMeasureCPICH}} has the value 
     * {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>deltaQRxLevMin</code>, or <code>null</code> if not present
     */
    java.lang.Long getDeltaQRxLevMin();
    
    /**
     * Offset for {{param|QRxLevMin}}, specified in {{units}}. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2.3}} This value is only meaningful if 
     * {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} 
     * and it MUST otherwise be ignored.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qRxLevMinOffset</code>, or <code>null</code> if not present
     */
    java.lang.Short getQRxLevMinOffset();
    
    /**
     * GSM and FDD Cell reselection hysteresis 1. {{bibref|3GPP-TS.25.331|Section 
     * 10.3.2.3}} Only even values are valid, use of an odd value MUST be rejected by 
     * the CPE.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qHyst1s</code>, or <code>null</code> if not present
     */
    java.lang.Short getQHyst1s();
    
    /**
     * FDD Cell reselection hysteresis 2. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}} 
     * Only even values are valid, use of an odd value MUST be rejected by the CPE. 
     * This value is only meaningful if {{param|QualityMeasureCPICH}} has the value 
     * {{enum|Ec/No|QualityMeasureCPICH}} and it MUST otherwise be ignored. By default 
     * when {{param|QHyst1s}} is set and {{param}} is not, then the value for {{param}}
     * SHOULD match the value of {{param|QHyst1s}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qHyst2s</code>, or <code>null</code> if not present
     */
    java.lang.Short getQHyst2s();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. A UE 
     * triggers the reselection of a new cell if the cell reselection criteria are 
     * fulfilled during the time interval in {{units}}. Parameter defined in SIB3 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tReselections</code>, or <code>null</code> if not present
     */
    java.lang.Short getTReselections();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the threshold for intra-frequency measurements, and for the HCS 
     * measurement rules. Only even values are valid, use of an odd value MUST be 
     * rejected by the CPE. Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 
     * 10.3.2.3}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>sIntrasearch</code>, or <code>null</code> if not present
     */
    java.lang.Long getSIntrasearch();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the threshold for inter-frequency measurements, and for the HCS 
     * measurement rules. Only even values are valid, use of an odd value MUST be 
     * rejected by the CPE. Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 
     * 10.3.2.3}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>sIntersearch</code>, or <code>null</code> if not present
     */
    java.lang.Long getSIntersearch();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the threshold for intrafrequency and interfrequency measurement rules in
     * HCS. Below this limit in the serving cell, the UE initiates measurements of all 
     * intrafrequency and interfrequency neighbouring cells of the serving cell. Only 
     * odd values are valid, use of an even value MUST be rejected by the CPE. 
     * Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>sSearchHcs</code>, or <code>null</code> if not present
     */
    java.lang.Long getSSearchHcs();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the RAT (GSM) specific threshold for inter-RAT measurement rules. Only 
     * even values are valid, use of an odd value MUST be rejected by the CPE. 
     * Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>sSearchRat</code>, or <code>null</code> if not present
     */
    java.lang.Long getSSearchRat();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the RAT (GSM) specific threshold for inter-RAT measurement rules in HCS.
     * Only odd values are valid, use of an even value MUST be rejected by the CPE. 
     * Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>shcsrat</code>, or <code>null</code> if not present
     */
    java.lang.Long getShcsrat();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the threshold for skipping inter-RAT measurement rules in HCS. Above 
     * this RAT (GSM) specific threshold in the serving UTRA cell, the UE does not need
     * to perform any inter-RAT measurements. Only even values are valid, use of an odd
     * value MUST be rejected by the CPE. Parameter defined in SIB3 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>sLimitSearchRat</code>, or <code>null</code> if not present
     */
    java.lang.Long getSLimitSearchRat();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the duration in seconds for evaluating the allowed amount of cell 
     * reselections. If the number of cell reselections during the time period defined 
     * by {{param}} exceeds {{param|NonHCSNCR}}, high mobility has been detected. 
     * Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG.NonHcstcrMax</code> <code>nonHcstcrMax</code>, or <code>null</code> if not present
     */
    NonHcstcrMax getNonHcstcrMax();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the maximum number of cell reselections. If the number of cell 
     * reselections during the {{param|NonHCSTCRMax}} time period exceeds the value of 
     * {{param}}, high mobility has been detected. Parameter defined in SIB3 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>nonHcsncr</code>, or <code>null</code> if not present
     */
    java.lang.Short getNonHcsncr();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the cell reselection hysteresis for reverting from UE high-mobility 
     * measurements. The additional time period in seconds before UE reverts to 
     * low-mobility measurements. When the number of cell reselections during the time 
     * period defined by {{param|TCRMax}} no longer exceeds {{param|NCR}}, UE continues
     * measurements during the time period defined by {{param|TCRMaxHyst}}. Parameter 
     * defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG.NonHcstcrMaxHyst</code> <code>nonHcstcrMaxHyst</code>, or <code>null</code> if not present
     */
    NonHcstcrMaxHyst getNonHcstcrMaxHyst();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the quality threshold levels for applying prioritised hierarchical cell 
     * reselection. {{bibref|3GPP-TS.25.331|Section 10.3.7.12 and Section 10.3.7.54a}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qhcs</code>, or <code>null</code> if not present
     */
    java.lang.Short getQhcs();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Indicate whether HCS is used in this cell or not. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.47}}
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>useOfHcs</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isUseOfHcs();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the HCS priority of this cell. {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.12}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hcsPrio</code>, or <code>null</code> if not present
     */
    java.lang.Short getHcsPrio();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the duration in seconds for evaluating the allowed amount of cell 
     * reselections. If the number of cell reselections during the time period defined 
     * by {{param}} exceeds {{param|NCR}}, high mobility has been detected. Parameter 
     * defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG.TcrMax</code> <code>tcrMax</code>, or <code>null</code> if not present
     */
    TcrMax getTcrMax();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the maximum number of cell reselections. If the number of cell 
     * reselections during the {{param|TCRMax}} time period exceeds the value of 
     * {{param}}, high mobility has been detected. Parameter defined in SIB3 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>ncr</code>, or <code>null</code> if not present
     */
    java.lang.Short getNcr();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the cell reselection hysteresis for reverting from UE high-mobility 
     * measurements. The additional time period in seconds before UE reverts to 
     * low-mobility measurements. When the number of cell reselections during the time 
     * period defined by {{param|TCRMax}} no longer exceeds {{param|NCR}}, UE continues
     * measurements during the time period defined by {{param}}. Parameter defined in 
     * SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG.TcrMaxHyst</code> <code>tcrMaxHyst</code>, or <code>null</code> if not present
     */
    TcrMaxHyst getTcrMaxHyst();
    
    /**
     * A member of the set of parameters used for cell reselection functionality. 
     * Defines the maximum transmit power level, specified in {{units}}, that an UE MAY
     * use when accessing the cell on RACH. Used to calculate Pcompensation, which is: 
     * max(UE_TXPWR_MAX_RACH - P_MAX, 0), where UE_TXPWR_MAX_RACH is {{param}} and 
     * P_MAX is the max transmit power for a UE. {{bibref|3GPP-TS.25.331|Section 
     * 10.3.2.3}} {{bibref|3GPP-TS.25.304|Section 5.2.3}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>ueTxPwrMaxRach</code>, or <code>null</code> if not present
     */
    java.lang.Long getUeTxPwrMaxRach();

}

