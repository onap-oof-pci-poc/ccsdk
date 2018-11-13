package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import java.util.List;

/**
 * This object contains parameters relating to GSM REM capabilities.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-umts-gsm-g {
 *     leaf in-service-handling {
 *         type in-service-handling;
 *     }
 *     leaf scan-on-boot {
 *         type scan-on-boot;
 *     }
 *     leaf scan-periodically {
 *         type scan-periodically;
 *     }
 *     leaf periodic-interval {
 *         type periodic-interval;
 *     }
 *     leaf periodic-time {
 *         type date-and-time;
 *     }
 *     leaf-list remplmn-list {
 *         type string;
 *     }
 *     leaf-list rem-band-list {
 *         type enumeration;
 *     }
 *     leaf-list arfcn-list {
 *         type string;
 *     }
 *     leaf scan-timeout {
 *         type scan-timeout;
 *     }
 *     leaf scan-status {
 *         type enumeration;
 *     }
 *     leaf error-details {
 *         type string;
 *     }
 *     leaf last-scan-time {
 *         type date-and-time;
 *     }
 *     leaf max-cell-entries {
 *         type uint64;
 *     }
 *     leaf cell-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-umts-gsm-g</i>
 *
 */
public interface RemUmtsGsmG
    extends
    DataObject
{


    public enum InServiceHandling {
        /**
         * none
         *
         */
        Immediate(1, "immediate"),
        
        /**
         * none
         *
         */
        Delayed(2, "delayed")
        ;
    
        private static final java.util.Map<java.lang.Integer, InServiceHandling> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, InServiceHandling> b = com.google.common.collect.ImmutableMap.builder();
            for (InServiceHandling enumItem : InServiceHandling.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private InServiceHandling(int value, java.lang.String name) {
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
         * @return corresponding InServiceHandling item
         */
        public static InServiceHandling forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum RemBandList {
        /**
         * none
         *
         */
        TGsm380(1, "t-gsm380"),
        
        /**
         * none
         *
         */
        TGsm410(2, "t-gsm410"),
        
        /**
         * none
         *
         */
        Gsm450(3, "gsm450"),
        
        /**
         * none
         *
         */
        Gsm480(4, "gsm480"),
        
        /**
         * none
         *
         */
        Gsm710(5, "gsm710"),
        
        /**
         * none
         *
         */
        Gsm750(6, "gsm750"),
        
        /**
         * none
         *
         */
        TGsm810(7, "t-gsm810"),
        
        /**
         * none
         *
         */
        Gsm850(8, "gsm850"),
        
        /**
         * none
         *
         */
        PGsm900(9, "p-gsm900"),
        
        /**
         * none
         *
         */
        EGsm900(10, "e-gsm900"),
        
        /**
         * none
         *
         */
        RGsm900(11, "r-gsm900"),
        
        /**
         * none
         *
         */
        TGsm900(12, "t-gsm900"),
        
        /**
         * none
         *
         */
        Dcs1800(13, "dcs1800"),
        
        /**
         * none
         *
         */
        Pcs1900(14, "pcs1900")
        ;
    
        private static final java.util.Map<java.lang.Integer, RemBandList> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, RemBandList> b = com.google.common.collect.ImmutableMap.builder();
            for (RemBandList enumItem : RemBandList.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private RemBandList(int value, java.lang.String name) {
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
         * @return corresponding RemBandList item
         */
        public static RemBandList forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum ScanStatus {
        /**
         * none
         *
         */
        Indeterminate(1, "indeterminate"),
        
        /**
         * none
         *
         */
        InProgress(2, "in-progress"),
        
        /**
         * none
         *
         */
        Success(3, "success"),
        
        /**
         * none
         *
         */
        Error(4, "error"),
        
        /**
         * none
         *
         */
        ErrorTimeout(5, "error-timeout")
        ;
    
        private static final java.util.Map<java.lang.Integer, ScanStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ScanStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (ScanStatus enumItem : ScanStatus.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private ScanStatus(int value, java.lang.String name) {
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
         * @return corresponding ScanStatus item
         */
        public static ScanStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-gsm-g").intern();

    /**
     * FAP REM behavior with respect to ongoing active connections.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG.InServiceHandling</code> <code>inServiceHandling</code>, or <code>null</code> if not present
     */
    InServiceHandling getInServiceHandling();
    
    /**
     * Enables or disables Radio Environment Measurement during the FAP start up.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>scanOnBoot</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isScanOnBoot();
    
    /**
     * Enable Periodic Radio Environment Measurement on all enabled RAT.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>scanPeriodically</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isScanPeriodically();
    
    /**
     * When {{param|ScanPeriodically}} is {{true}}, this value indicates the interval 
     * in {{units}} which REM is performed while the FAP service is enabled.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>periodicInterval</code>, or <code>null</code> if not present
     */
    BigInteger getPeriodicInterval();
    
    /**
     * An absolute time reference in UTC to determine when the CPE will initiate the 
     * periodic REM. Each REM MUST occur at (or as soon as possible after) this 
     * reference time plus or minus an integer multiple of the 
     * {{param|PeriodicInterval}}. {{param}} is used only to set the "phase" of the 
     * REM. The actual value of {{param}} can be arbitrarily far into the past or 
     * future. For example, if {{param|PeriodicInterval}} is 86400 (a day) and if 
     * {{param}} is set to UTC midnight on some day (in the past, present, or future) 
     * then periodic REMs will occur every day at UTC midnight. These MUST begin on the
     * very next midnight, even if {{param}} refers to a day in the future. The Unknown
     * Time value defined in {{bibref|TR-106a2|Section 3.2}} indicates that no 
     * particular time reference is specified. That is, the CPE MAY locally choose the 
     * time reference, and needs only to adhere to the specified 
     * PeriodicInformInterval. If absolute time is not available to the CPE, its 
     * periodic REM behavior MUST be the same as if {{param}} parameter was set to the 
     * Unknown Time value.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>periodicTime</code>, or <code>null</code> if not present
     */
    DateAndTime getPeriodicTime();
    
    /**
     * {{list}} Each item is a PLMNID. PLMN ID consists of Mobile Country Code (MCC) 
     * and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, 
     * {{bibref|3GPP-TS.24.008}}. Mobile Country Code consists of three digits and 
     * uniquely identifies the country of domicile of the subscriber. Mobile Network 
     * Code consists of two or three digits and identifies the Home PLMN within a 
     * country. For a 2-digit MNC the total string length of the PLMNID is 5. If 
     * {{empty}} no specific PLMN ID is provided, meaning that the FAP is required to 
     * report all available PLMN IDs. If a list is provided, the FAP is expected to 
     * limit the REM measurement to the PLMN(s) specified in this list only and ignore 
     * others even if they are detected.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remplmnList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getRemplmnList();
    
    /**
     * {{list}} Each item is a GSM Band to measure. {{enum}} If {{empty}} then no 
     * specific GSM band is provided, meaning that the FAP MUST scan all bands. If a 
     * list is provided, the FAP is expected to limit the REM measurement to the 
     * band(s) specified in this list only and ignore others even if they are detected.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remBandList</code>, or <code>null</code> if not present
     */
    List<RemBandList> getRemBandList();
    
    /**
     * {{list}} Each item is a GSM ARFCN to measure. If {{empty}} then no specific 
     * ARFCN is provided, meaning that the FAP is required to scan all ARFCNs. If a 
     * list is provided, the FAP is expected to limit the REM measurement to the 
     * ARFCN(s) specified in this list only and ignore others even if they are 
     * detected.
     *
     *
     *
     * @return <code>java.util.List</code> <code>arfcnList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getArfcnList();
    
    /**
     * Specifies the time-out value in {{units}}, measured from the start of the REM 
     * scan, before the REM scan will time out.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>scanTimeout</code>, or <code>null</code> if not present
     */
    BigInteger getScanTimeout();
    
    /**
     * Indicates the current status of this scan.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG.ScanStatus</code> <code>scanStatus</code>, or <code>null</code> if not present
     */
    ScanStatus getScanStatus();
    
    /**
     * Provides more detail when the {{param|ScanStatus}} is either 
     * {{enum|Error|ScanStatus}} or {{enum|Error_TIMEOUT|ScanStatus}}.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>errorDetails</code>, or <code>null</code> if not present
     */
    java.lang.String getErrorDetails();
    
    /**
     * The time of the last GSM radio environment measurement.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>lastScanTime</code>, or <code>null</code> if not present
     */
    DateAndTime getLastScanTime();
    
    /**
     * The maximum number of entries allowed in the {{object|.REM.UMTS.GSM.Cell.{i}.}} 
     * table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxCellEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxCellEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cellNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getCellNumberOfEntries();

}

