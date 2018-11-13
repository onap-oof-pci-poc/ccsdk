package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG.RemBandList;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG.ScanStatus;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG.InServiceHandling;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm
 *
 */
public class RemUmtsGsmBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm> {

    private List<java.lang.String> _arfcnList;
    private BigInteger _cellNumberOfEntries;
    private java.lang.String _errorDetails;
    private InServiceHandling _inServiceHandling;
    private DateAndTime _lastScanTime;
    private BigInteger _maxCellEntries;
    private BigInteger _periodicInterval;
    private DateAndTime _periodicTime;
    private List<RemBandList> _remBandList;
    private List<RemUmtsGsmCell> _remUmtsGsmCell;
    private List<java.lang.String> _remplmnList;
    private ScanStatus _scanStatus;
    private BigInteger _scanTimeout;
    private java.lang.Boolean _scanOnBoot;
    private java.lang.Boolean _scanPeriodically;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>> augmentation = Collections.emptyMap();

    public RemUmtsGsmBuilder() {
    }
    public RemUmtsGsmBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG arg) {
        this._inServiceHandling = arg.getInServiceHandling();
        this._scanOnBoot = arg.isScanOnBoot();
        this._scanPeriodically = arg.isScanPeriodically();
        this._periodicInterval = arg.getPeriodicInterval();
        this._periodicTime = arg.getPeriodicTime();
        this._remplmnList = arg.getRemplmnList();
        this._remBandList = arg.getRemBandList();
        this._arfcnList = arg.getArfcnList();
        this._scanTimeout = arg.getScanTimeout();
        this._scanStatus = arg.getScanStatus();
        this._errorDetails = arg.getErrorDetails();
        this._lastScanTime = arg.getLastScanTime();
        this._maxCellEntries = arg.getMaxCellEntries();
        this._cellNumberOfEntries = arg.getCellNumberOfEntries();
    }

    public RemUmtsGsmBuilder(RemUmtsGsm base) {
        this._arfcnList = base.getArfcnList();
        this._cellNumberOfEntries = base.getCellNumberOfEntries();
        this._errorDetails = base.getErrorDetails();
        this._inServiceHandling = base.getInServiceHandling();
        this._lastScanTime = base.getLastScanTime();
        this._maxCellEntries = base.getMaxCellEntries();
        this._periodicInterval = base.getPeriodicInterval();
        this._periodicTime = base.getPeriodicTime();
        this._remBandList = base.getRemBandList();
        this._remUmtsGsmCell = base.getRemUmtsGsmCell();
        this._remplmnList = base.getRemplmnList();
        this._scanStatus = base.getScanStatus();
        this._scanTimeout = base.getScanTimeout();
        this._scanOnBoot = base.isScanOnBoot();
        this._scanPeriodically = base.isScanPeriodically();
        if (base instanceof RemUmtsGsmImpl) {
            RemUmtsGsmImpl impl = (RemUmtsGsmImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG) {
            this._inServiceHandling = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getInServiceHandling();
            this._scanOnBoot = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).isScanOnBoot();
            this._scanPeriodically = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).isScanPeriodically();
            this._periodicInterval = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getPeriodicInterval();
            this._periodicTime = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getPeriodicTime();
            this._remplmnList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getRemplmnList();
            this._remBandList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getRemBandList();
            this._arfcnList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getArfcnList();
            this._scanTimeout = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getScanTimeout();
            this._scanStatus = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getScanStatus();
            this._errorDetails = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getErrorDetails();
            this._lastScanTime = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getLastScanTime();
            this._maxCellEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getMaxCellEntries();
            this._cellNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG)arg).getCellNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getArfcnList() {
        return _arfcnList;
    }
    
    public BigInteger getCellNumberOfEntries() {
        return _cellNumberOfEntries;
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
    
    public BigInteger getMaxCellEntries() {
        return _maxCellEntries;
    }
    
    public BigInteger getPeriodicInterval() {
        return _periodicInterval;
    }
    
    public DateAndTime getPeriodicTime() {
        return _periodicTime;
    }
    
    public List<RemBandList> getRemBandList() {
        return _remBandList;
    }
    
    public List<RemUmtsGsmCell> getRemUmtsGsmCell() {
        return _remUmtsGsmCell;
    }
    
    public List<java.lang.String> getRemplmnList() {
        return _remplmnList;
    }
    
    public ScanStatus getScanStatus() {
        return _scanStatus;
    }
    
    public BigInteger getScanTimeout() {
        return _scanTimeout;
    }
    
    public java.lang.Boolean isScanOnBoot() {
        return _scanOnBoot;
    }
    
    public java.lang.Boolean isScanPeriodically() {
        return _scanPeriodically;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemUmtsGsmBuilder setArfcnList(final List<java.lang.String> value) {
        this._arfcnList = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCELLNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCELLNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkCellNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCELLNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCELLNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public RemUmtsGsmBuilder setCellNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkCellNumberOfEntriesRange(value);
    }
        this._cellNumberOfEntries = value;
        return this;
    }
    
     
     private static void check_errorDetailsLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public RemUmtsGsmBuilder setErrorDetails(final java.lang.String value) {
    if (value != null) {
        check_errorDetailsLength(value);
    }
        this._errorDetails = value;
        return this;
    }
    
     
    public RemUmtsGsmBuilder setInServiceHandling(final InServiceHandling value) {
        this._inServiceHandling = value;
        return this;
    }
    
     
    public RemUmtsGsmBuilder setLastScanTime(final DateAndTime value) {
        this._lastScanTime = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXCELLENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXCELLENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxCellEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXCELLENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXCELLENTRIESRANGE_RANGES)));
     }
    
    public RemUmtsGsmBuilder setMaxCellEntries(final BigInteger value) {
    if (value != null) {
        checkMaxCellEntriesRange(value);
    }
        this._maxCellEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKPERIODICINTERVALRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
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
    
    public RemUmtsGsmBuilder setPeriodicInterval(final BigInteger value) {
    if (value != null) {
        checkPeriodicIntervalRange(value);
    }
        this._periodicInterval = value;
        return this;
    }
    
     
    public RemUmtsGsmBuilder setPeriodicTime(final DateAndTime value) {
        this._periodicTime = value;
        return this;
    }
    
     
    public RemUmtsGsmBuilder setRemBandList(final List<RemBandList> value) {
        this._remBandList = value;
        return this;
    }
    
     
    public RemUmtsGsmBuilder setRemUmtsGsmCell(final List<RemUmtsGsmCell> value) {
        this._remUmtsGsmCell = value;
        return this;
    }
    
     
    public RemUmtsGsmBuilder setRemplmnList(final List<java.lang.String> value) {
        this._remplmnList = value;
        return this;
    }
    
     
    public RemUmtsGsmBuilder setScanStatus(final ScanStatus value) {
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
    
    public RemUmtsGsmBuilder setScanTimeout(final BigInteger value) {
    if (value != null) {
        checkScanTimeoutRange(value);
    }
        this._scanTimeout = value;
        return this;
    }
    
     
    public RemUmtsGsmBuilder setScanOnBoot(final java.lang.Boolean value) {
        this._scanOnBoot = value;
        return this;
    }
    
     
    public RemUmtsGsmBuilder setScanPeriodically(final java.lang.Boolean value) {
        this._scanPeriodically = value;
        return this;
    }
    
    public RemUmtsGsmBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemUmtsGsmBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemUmtsGsm build() {
        return new RemUmtsGsmImpl(this);
    }

    private static final class RemUmtsGsmImpl implements RemUmtsGsm {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm.class;
        }

        private final List<java.lang.String> _arfcnList;
        private final BigInteger _cellNumberOfEntries;
        private final java.lang.String _errorDetails;
        private final InServiceHandling _inServiceHandling;
        private final DateAndTime _lastScanTime;
        private final BigInteger _maxCellEntries;
        private final BigInteger _periodicInterval;
        private final DateAndTime _periodicTime;
        private final List<RemBandList> _remBandList;
        private final List<RemUmtsGsmCell> _remUmtsGsmCell;
        private final List<java.lang.String> _remplmnList;
        private final ScanStatus _scanStatus;
        private final BigInteger _scanTimeout;
        private final java.lang.Boolean _scanOnBoot;
        private final java.lang.Boolean _scanPeriodically;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>> augmentation = Collections.emptyMap();

        private RemUmtsGsmImpl(RemUmtsGsmBuilder base) {
            this._arfcnList = base.getArfcnList();
            this._cellNumberOfEntries = base.getCellNumberOfEntries();
            this._errorDetails = base.getErrorDetails();
            this._inServiceHandling = base.getInServiceHandling();
            this._lastScanTime = base.getLastScanTime();
            this._maxCellEntries = base.getMaxCellEntries();
            this._periodicInterval = base.getPeriodicInterval();
            this._periodicTime = base.getPeriodicTime();
            this._remBandList = base.getRemBandList();
            this._remUmtsGsmCell = base.getRemUmtsGsmCell();
            this._remplmnList = base.getRemplmnList();
            this._scanStatus = base.getScanStatus();
            this._scanTimeout = base.getScanTimeout();
            this._scanOnBoot = base.isScanOnBoot();
            this._scanPeriodically = base.isScanPeriodically();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getArfcnList() {
            return _arfcnList;
        }
        
        @Override
        public BigInteger getCellNumberOfEntries() {
            return _cellNumberOfEntries;
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
        public BigInteger getMaxCellEntries() {
            return _maxCellEntries;
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
        public List<RemBandList> getRemBandList() {
            return _remBandList;
        }
        
        @Override
        public List<RemUmtsGsmCell> getRemUmtsGsmCell() {
            return _remUmtsGsmCell;
        }
        
        @Override
        public List<java.lang.String> getRemplmnList() {
            return _remplmnList;
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
        public java.lang.Boolean isScanOnBoot() {
            return _scanOnBoot;
        }
        
        @Override
        public java.lang.Boolean isScanPeriodically() {
            return _scanPeriodically;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_arfcnList);
            result = prime * result + Objects.hashCode(_cellNumberOfEntries);
            result = prime * result + Objects.hashCode(_errorDetails);
            result = prime * result + Objects.hashCode(_inServiceHandling);
            result = prime * result + Objects.hashCode(_lastScanTime);
            result = prime * result + Objects.hashCode(_maxCellEntries);
            result = prime * result + Objects.hashCode(_periodicInterval);
            result = prime * result + Objects.hashCode(_periodicTime);
            result = prime * result + Objects.hashCode(_remBandList);
            result = prime * result + Objects.hashCode(_remUmtsGsmCell);
            result = prime * result + Objects.hashCode(_remplmnList);
            result = prime * result + Objects.hashCode(_scanStatus);
            result = prime * result + Objects.hashCode(_scanTimeout);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm)obj;
            if (!Objects.equals(_arfcnList, other.getArfcnList())) {
                return false;
            }
            if (!Objects.equals(_cellNumberOfEntries, other.getCellNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_errorDetails, other.getErrorDetails())) {
                return false;
            }
            if (!Objects.equals(_inServiceHandling, other.getInServiceHandling())) {
                return false;
            }
            if (!Objects.equals(_lastScanTime, other.getLastScanTime())) {
                return false;
            }
            if (!Objects.equals(_maxCellEntries, other.getMaxCellEntries())) {
                return false;
            }
            if (!Objects.equals(_periodicInterval, other.getPeriodicInterval())) {
                return false;
            }
            if (!Objects.equals(_periodicTime, other.getPeriodicTime())) {
                return false;
            }
            if (!Objects.equals(_remBandList, other.getRemBandList())) {
                return false;
            }
            if (!Objects.equals(_remUmtsGsmCell, other.getRemUmtsGsmCell())) {
                return false;
            }
            if (!Objects.equals(_remplmnList, other.getRemplmnList())) {
                return false;
            }
            if (!Objects.equals(_scanStatus, other.getScanStatus())) {
                return false;
            }
            if (!Objects.equals(_scanTimeout, other.getScanTimeout())) {
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
                RemUmtsGsmImpl otherImpl = (RemUmtsGsmImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.RemUmtsGsm>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemUmtsGsm [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_arfcnList != null) {
                builder.append("_arfcnList=");
                builder.append(_arfcnList);
                builder.append(", ");
            }
            if (_cellNumberOfEntries != null) {
                builder.append("_cellNumberOfEntries=");
                builder.append(_cellNumberOfEntries);
                builder.append(", ");
            }
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
            if (_maxCellEntries != null) {
                builder.append("_maxCellEntries=");
                builder.append(_maxCellEntries);
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
            if (_remBandList != null) {
                builder.append("_remBandList=");
                builder.append(_remBandList);
                builder.append(", ");
            }
            if (_remUmtsGsmCell != null) {
                builder.append("_remUmtsGsmCell=");
                builder.append(_remUmtsGsmCell);
                builder.append(", ");
            }
            if (_remplmnList != null) {
                builder.append("_remplmnList=");
                builder.append(_remplmnList);
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
