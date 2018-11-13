package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000Hrpd;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G.ScanStatus;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G.ReportOverheads;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G.InServiceHandling;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000
 *
 */
public class RemCdma2000Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000> {

    private java.lang.String _errorDetails;
    private InServiceHandling _inServiceHandling;
    private DateAndTime _lastScanTime;
    private BigInteger _periodicInterval;
    private DateAndTime _periodicTime;
    private RemCdma2000Hrpd _remCdma2000Hrpd;
    private RemCdma2000MacroTiming _remCdma2000MacroTiming;
    private RemCdma2000OneX _remCdma2000OneX;
    private ReportOverheads _reportOverheads;
    private BigInteger _returnTimer;
    private ScanStatus _scanStatus;
    private BigInteger _scanTimeout;
    private java.lang.Boolean _scanNow;
    private java.lang.Boolean _scanOnBoot;
    private java.lang.Boolean _scanPeriodically;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>> augmentation = Collections.emptyMap();

    public RemCdma2000Builder() {
    }
    public RemCdma2000Builder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G arg) {
        this._inServiceHandling = arg.getInServiceHandling();
        this._scanOnBoot = arg.isScanOnBoot();
        this._scanNow = arg.isScanNow();
        this._returnTimer = arg.getReturnTimer();
        this._scanPeriodically = arg.isScanPeriodically();
        this._periodicInterval = arg.getPeriodicInterval();
        this._periodicTime = arg.getPeriodicTime();
        this._reportOverheads = arg.getReportOverheads();
        this._scanTimeout = arg.getScanTimeout();
        this._scanStatus = arg.getScanStatus();
        this._errorDetails = arg.getErrorDetails();
        this._lastScanTime = arg.getLastScanTime();
    }

    public RemCdma2000Builder(RemCdma2000 base) {
        this._errorDetails = base.getErrorDetails();
        this._inServiceHandling = base.getInServiceHandling();
        this._lastScanTime = base.getLastScanTime();
        this._periodicInterval = base.getPeriodicInterval();
        this._periodicTime = base.getPeriodicTime();
        this._remCdma2000Hrpd = base.getRemCdma2000Hrpd();
        this._remCdma2000MacroTiming = base.getRemCdma2000MacroTiming();
        this._remCdma2000OneX = base.getRemCdma2000OneX();
        this._reportOverheads = base.getReportOverheads();
        this._returnTimer = base.getReturnTimer();
        this._scanStatus = base.getScanStatus();
        this._scanTimeout = base.getScanTimeout();
        this._scanNow = base.isScanNow();
        this._scanOnBoot = base.isScanOnBoot();
        this._scanPeriodically = base.isScanPeriodically();
        if (base instanceof RemCdma2000Impl) {
            RemCdma2000Impl impl = (RemCdma2000Impl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G) {
            this._inServiceHandling = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).getInServiceHandling();
            this._scanOnBoot = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).isScanOnBoot();
            this._scanNow = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).isScanNow();
            this._returnTimer = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).getReturnTimer();
            this._scanPeriodically = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).isScanPeriodically();
            this._periodicInterval = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).getPeriodicInterval();
            this._periodicTime = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).getPeriodicTime();
            this._reportOverheads = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).getReportOverheads();
            this._scanTimeout = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).getScanTimeout();
            this._scanStatus = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).getScanStatus();
            this._errorDetails = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).getErrorDetails();
            this._lastScanTime = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G)arg).getLastScanTime();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getErrorDetails() {
        return _errorDetails;
    }
    
    public InServiceHandling getInServiceHandling() {
        return _inServiceHandling;
    }
    
    public DateAndTime getLastScanTime() {
        return _lastScanTime;
    }
    
    public BigInteger getPeriodicInterval() {
        return _periodicInterval;
    }
    
    public DateAndTime getPeriodicTime() {
        return _periodicTime;
    }
    
    public RemCdma2000Hrpd getRemCdma2000Hrpd() {
        return _remCdma2000Hrpd;
    }
    
    public RemCdma2000MacroTiming getRemCdma2000MacroTiming() {
        return _remCdma2000MacroTiming;
    }
    
    public RemCdma2000OneX getRemCdma2000OneX() {
        return _remCdma2000OneX;
    }
    
    public ReportOverheads getReportOverheads() {
        return _reportOverheads;
    }
    
    public BigInteger getReturnTimer() {
        return _returnTimer;
    }
    
    public ScanStatus getScanStatus() {
        return _scanStatus;
    }
    
    public BigInteger getScanTimeout() {
        return _scanTimeout;
    }
    
    public java.lang.Boolean isScanNow() {
        return _scanNow;
    }
    
    public java.lang.Boolean isScanOnBoot() {
        return _scanOnBoot;
    }
    
    public java.lang.Boolean isScanPeriodically() {
        return _scanPeriodically;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_errorDetailsLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public RemCdma2000Builder setErrorDetails(final java.lang.String value) {
    if (value != null) {
        check_errorDetailsLength(value);
    }
        this._errorDetails = value;
        return this;
    }
    
     
    public RemCdma2000Builder setInServiceHandling(final InServiceHandling value) {
        this._inServiceHandling = value;
        return this;
    }
    
     
    public RemCdma2000Builder setLastScanTime(final DateAndTime value) {
        this._lastScanTime = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKPERIODICINTERVALRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ONE, new java.math.BigInteger("18446744073709551615"));
         CHECKPERIODICINTERVALRANGE_RANGES = a;
     }
     private static void checkPeriodicIntervalRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKPERIODICINTERVALRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKPERIODICINTERVALRANGE_RANGES)));
     }
    
    public RemCdma2000Builder setPeriodicInterval(final BigInteger value) {
    if (value != null) {
        checkPeriodicIntervalRange(value);
    }
        this._periodicInterval = value;
        return this;
    }
    
     
    public RemCdma2000Builder setPeriodicTime(final DateAndTime value) {
        this._periodicTime = value;
        return this;
    }
    
     
    public RemCdma2000Builder setRemCdma2000Hrpd(final RemCdma2000Hrpd value) {
        this._remCdma2000Hrpd = value;
        return this;
    }
    
     
    public RemCdma2000Builder setRemCdma2000MacroTiming(final RemCdma2000MacroTiming value) {
        this._remCdma2000MacroTiming = value;
        return this;
    }
    
     
    public RemCdma2000Builder setRemCdma2000OneX(final RemCdma2000OneX value) {
        this._remCdma2000OneX = value;
        return this;
    }
    
     
    public RemCdma2000Builder setReportOverheads(final ReportOverheads value) {
        this._reportOverheads = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRETURNTIMERRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ONE, new java.math.BigInteger("18446744073709551615"));
         CHECKRETURNTIMERRANGE_RANGES = a;
     }
     private static void checkReturnTimerRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRETURNTIMERRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRETURNTIMERRANGE_RANGES)));
     }
    
    public RemCdma2000Builder setReturnTimer(final BigInteger value) {
    if (value != null) {
        checkReturnTimerRange(value);
    }
        this._returnTimer = value;
        return this;
    }
    
     
    public RemCdma2000Builder setScanStatus(final ScanStatus value) {
        this._scanStatus = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSCANTIMEOUTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSCANTIMEOUTRANGE_RANGES = a;
     }
     private static void checkScanTimeoutRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSCANTIMEOUTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSCANTIMEOUTRANGE_RANGES)));
     }
    
    public RemCdma2000Builder setScanTimeout(final BigInteger value) {
    if (value != null) {
        checkScanTimeoutRange(value);
    }
        this._scanTimeout = value;
        return this;
    }
    
     
    public RemCdma2000Builder setScanNow(final java.lang.Boolean value) {
        this._scanNow = value;
        return this;
    }
    
     
    public RemCdma2000Builder setScanOnBoot(final java.lang.Boolean value) {
        this._scanOnBoot = value;
        return this;
    }
    
     
    public RemCdma2000Builder setScanPeriodically(final java.lang.Boolean value) {
        this._scanPeriodically = value;
        return this;
    }
    
    public RemCdma2000Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemCdma2000Builder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemCdma2000 build() {
        return new RemCdma2000Impl(this);
    }

    private static final class RemCdma2000Impl implements RemCdma2000 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000.class;
        }

        private final java.lang.String _errorDetails;
        private final InServiceHandling _inServiceHandling;
        private final DateAndTime _lastScanTime;
        private final BigInteger _periodicInterval;
        private final DateAndTime _periodicTime;
        private final RemCdma2000Hrpd _remCdma2000Hrpd;
        private final RemCdma2000MacroTiming _remCdma2000MacroTiming;
        private final RemCdma2000OneX _remCdma2000OneX;
        private final ReportOverheads _reportOverheads;
        private final BigInteger _returnTimer;
        private final ScanStatus _scanStatus;
        private final BigInteger _scanTimeout;
        private final java.lang.Boolean _scanNow;
        private final java.lang.Boolean _scanOnBoot;
        private final java.lang.Boolean _scanPeriodically;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>> augmentation = Collections.emptyMap();

        private RemCdma2000Impl(RemCdma2000Builder base) {
            this._errorDetails = base.getErrorDetails();
            this._inServiceHandling = base.getInServiceHandling();
            this._lastScanTime = base.getLastScanTime();
            this._periodicInterval = base.getPeriodicInterval();
            this._periodicTime = base.getPeriodicTime();
            this._remCdma2000Hrpd = base.getRemCdma2000Hrpd();
            this._remCdma2000MacroTiming = base.getRemCdma2000MacroTiming();
            this._remCdma2000OneX = base.getRemCdma2000OneX();
            this._reportOverheads = base.getReportOverheads();
            this._returnTimer = base.getReturnTimer();
            this._scanStatus = base.getScanStatus();
            this._scanTimeout = base.getScanTimeout();
            this._scanNow = base.isScanNow();
            this._scanOnBoot = base.isScanOnBoot();
            this._scanPeriodically = base.isScanPeriodically();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getErrorDetails() {
            return _errorDetails;
        }
        
        @Override
        public InServiceHandling getInServiceHandling() {
            return _inServiceHandling;
        }
        
        @Override
        public DateAndTime getLastScanTime() {
            return _lastScanTime;
        }
        
        @Override
        public BigInteger getPeriodicInterval() {
            return _periodicInterval;
        }
        
        @Override
        public DateAndTime getPeriodicTime() {
            return _periodicTime;
        }
        
        @Override
        public RemCdma2000Hrpd getRemCdma2000Hrpd() {
            return _remCdma2000Hrpd;
        }
        
        @Override
        public RemCdma2000MacroTiming getRemCdma2000MacroTiming() {
            return _remCdma2000MacroTiming;
        }
        
        @Override
        public RemCdma2000OneX getRemCdma2000OneX() {
            return _remCdma2000OneX;
        }
        
        @Override
        public ReportOverheads getReportOverheads() {
            return _reportOverheads;
        }
        
        @Override
        public BigInteger getReturnTimer() {
            return _returnTimer;
        }
        
        @Override
        public ScanStatus getScanStatus() {
            return _scanStatus;
        }
        
        @Override
        public BigInteger getScanTimeout() {
            return _scanTimeout;
        }
        
        @Override
        public java.lang.Boolean isScanNow() {
            return _scanNow;
        }
        
        @Override
        public java.lang.Boolean isScanOnBoot() {
            return _scanOnBoot;
        }
        
        @Override
        public java.lang.Boolean isScanPeriodically() {
            return _scanPeriodically;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_errorDetails);
            result = prime * result + Objects.hashCode(_inServiceHandling);
            result = prime * result + Objects.hashCode(_lastScanTime);
            result = prime * result + Objects.hashCode(_periodicInterval);
            result = prime * result + Objects.hashCode(_periodicTime);
            result = prime * result + Objects.hashCode(_remCdma2000Hrpd);
            result = prime * result + Objects.hashCode(_remCdma2000MacroTiming);
            result = prime * result + Objects.hashCode(_remCdma2000OneX);
            result = prime * result + Objects.hashCode(_reportOverheads);
            result = prime * result + Objects.hashCode(_returnTimer);
            result = prime * result + Objects.hashCode(_scanStatus);
            result = prime * result + Objects.hashCode(_scanTimeout);
            result = prime * result + Objects.hashCode(_scanNow);
            result = prime * result + Objects.hashCode(_scanOnBoot);
            result = prime * result + Objects.hashCode(_scanPeriodically);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000 other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000)obj;
            if (!Objects.equals(_errorDetails, other.getErrorDetails())) {
                return false;
            }
            if (!Objects.equals(_inServiceHandling, other.getInServiceHandling())) {
                return false;
            }
            if (!Objects.equals(_lastScanTime, other.getLastScanTime())) {
                return false;
            }
            if (!Objects.equals(_periodicInterval, other.getPeriodicInterval())) {
                return false;
            }
            if (!Objects.equals(_periodicTime, other.getPeriodicTime())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000Hrpd, other.getRemCdma2000Hrpd())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000MacroTiming, other.getRemCdma2000MacroTiming())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000OneX, other.getRemCdma2000OneX())) {
                return false;
            }
            if (!Objects.equals(_reportOverheads, other.getReportOverheads())) {
                return false;
            }
            if (!Objects.equals(_returnTimer, other.getReturnTimer())) {
                return false;
            }
            if (!Objects.equals(_scanStatus, other.getScanStatus())) {
                return false;
            }
            if (!Objects.equals(_scanTimeout, other.getScanTimeout())) {
                return false;
            }
            if (!Objects.equals(_scanNow, other.isScanNow())) {
                return false;
            }
            if (!Objects.equals(_scanOnBoot, other.isScanOnBoot())) {
                return false;
            }
            if (!Objects.equals(_scanPeriodically, other.isScanPeriodically())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemCdma2000Impl otherImpl = (RemCdma2000Impl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "RemCdma2000 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_errorDetails != null) {
                builder.append("_errorDetails=");
                builder.append(_errorDetails);
                builder.append(", ");
            }
            if (_inServiceHandling != null) {
                builder.append("_inServiceHandling=");
                builder.append(_inServiceHandling);
                builder.append(", ");
            }
            if (_lastScanTime != null) {
                builder.append("_lastScanTime=");
                builder.append(_lastScanTime);
                builder.append(", ");
            }
            if (_periodicInterval != null) {
                builder.append("_periodicInterval=");
                builder.append(_periodicInterval);
                builder.append(", ");
            }
            if (_periodicTime != null) {
                builder.append("_periodicTime=");
                builder.append(_periodicTime);
                builder.append(", ");
            }
            if (_remCdma2000Hrpd != null) {
                builder.append("_remCdma2000Hrpd=");
                builder.append(_remCdma2000Hrpd);
                builder.append(", ");
            }
            if (_remCdma2000MacroTiming != null) {
                builder.append("_remCdma2000MacroTiming=");
                builder.append(_remCdma2000MacroTiming);
                builder.append(", ");
            }
            if (_remCdma2000OneX != null) {
                builder.append("_remCdma2000OneX=");
                builder.append(_remCdma2000OneX);
                builder.append(", ");
            }
            if (_reportOverheads != null) {
                builder.append("_reportOverheads=");
                builder.append(_reportOverheads);
                builder.append(", ");
            }
            if (_returnTimer != null) {
                builder.append("_returnTimer=");
                builder.append(_returnTimer);
                builder.append(", ");
            }
            if (_scanStatus != null) {
                builder.append("_scanStatus=");
                builder.append(_scanStatus);
                builder.append(", ");
            }
            if (_scanTimeout != null) {
                builder.append("_scanTimeout=");
                builder.append(_scanTimeout);
                builder.append(", ");
            }
            if (_scanNow != null) {
                builder.append("_scanNow=");
                builder.append(_scanNow);
                builder.append(", ");
            }
            if (_scanOnBoot != null) {
                builder.append("_scanOnBoot=");
                builder.append(_scanOnBoot);
                builder.append(", ");
            }
            if (_scanPeriodically != null) {
                builder.append("_scanPeriodically=");
                builder.append(_scanPeriodically);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
