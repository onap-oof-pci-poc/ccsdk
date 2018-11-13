package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;

/**
 * This object contains parameters relating to radio environment measurement 
 * capabilities for the CDMA2000 system.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-cdma2000-g {
 *     leaf in-service-handling {
 *         type enumeration;
 *     }
 *     leaf scan-on-boot {
 *         type boolean;
 *     }
 *     leaf scan-now {
 *         type boolean;
 *     }
 *     leaf return-timer {
 *         type return-timer;
 *     }
 *     leaf scan-periodically {
 *         type boolean;
 *     }
 *     leaf periodic-interval {
 *         type periodic-interval;
 *     }
 *     leaf periodic-time {
 *         type date-and-time;
 *     }
 *     leaf report-overheads {
 *         type enumeration;
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-cdma2000-g</i>
 *
 */
public interface RemCdma2000G
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
    
    public enum ReportOverheads {
        /**
         * none
         *
         */
        All(1, "all"),
        
        /**
         * none
         *
         */
        OneX(2, "one-x"),
        
        /**
         * none
         *
         */
        Hrpd(3, "hrpd"),
        
        /**
         * none
         *
         */
        None(4, "none")
        ;
    
        private static final java.util.Map<java.lang.Integer, ReportOverheads> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ReportOverheads> b = com.google.common.collect.ImmutableMap.builder();
            for (ReportOverheads enumItem : ReportOverheads.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private ReportOverheads(int value, java.lang.String name) {
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
         * @return corresponding ReportOverheads item
         */
        public static ReportOverheads forValue(int valueArg) {
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
        "2018-04-08", "rem-cdma2000-g").intern();

    /**
     * FAP REM behavior with respect to ongoing active connections. {{enum}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G.InServiceHandling</code> <code>inServiceHandling</code>, or <code>null</code> if not present
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
     * Directs FAP to perform radio environment measurements immediately (but 
     * respecting the setting of {{param|InServiceHandling}}) and report back. After 
     * performing the action, the FAP resets the ScanNow value to "0" ({{false}}).
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>scanNow</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isScanNow();
    
    /**
     * Time in {{units}} within which the action should be performed by the FAP. Only 
     * applies if {{param|InServiceHandling}} is set to Delayed.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>returnTimer</code>, or <code>null</code> if not present
     */
    BigInteger getReturnTimer();
    
    /**
     * Enables periodic reporting of radio environment measurements.
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
     * If {{param}} is set to {{enum|All}}, the FAP shall report the overheads from the
     * sectors as well.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G.ReportOverheads</code> <code>reportOverheads</code>, or <code>null</code> if not present
     */
    ReportOverheads getReportOverheads();
    
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G.ScanStatus</code> <code>scanStatus</code>, or <code>null</code> if not present
     */
    ScanStatus getScanStatus();
    
    /**
     * Provides more detail when the {{param|ScanStatus}} is either "Error" or 
     * "Error_TIMEOUT".
     *
     *
     *
     * @return <code>java.lang.String</code> <code>errorDetails</code>, or <code>null</code> if not present
     */
    java.lang.String getErrorDetails();
    
    /**
     * The time of the last system radio environment measurement.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>lastScanTime</code>, or <code>null</code> if not present
     */
    DateAndTime getLastScanTime();

}

