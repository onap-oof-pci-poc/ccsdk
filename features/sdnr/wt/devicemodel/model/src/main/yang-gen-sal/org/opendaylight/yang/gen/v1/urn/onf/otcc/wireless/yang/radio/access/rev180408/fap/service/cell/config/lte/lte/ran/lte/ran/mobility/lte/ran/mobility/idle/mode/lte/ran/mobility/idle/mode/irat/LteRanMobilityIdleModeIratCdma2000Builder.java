package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000
 *
 */
public class LteRanMobilityIdleModeIratCdma2000Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000> {

    private BigInteger _cdma2000BandNumberOfEntries;
    private List<LteRanMobilityIdleModeIratCdma2000Cdma2000Band> _lteRanMobilityIdleModeIratCdma2000Cdma2000Band;
    private BigInteger _maxCdma2000BandEntries;
    private List<java.lang.String> _searchWindowSize;
    private List<java.lang.String> _tReselectionCdma2000;
    private java.lang.Short _tReselectionCdma2000SfHigh;
    private java.lang.Short _tReselectionCdma2000SfMedium;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeIratCdma2000Builder() {
    }
    public LteRanMobilityIdleModeIratCdma2000Builder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G arg) {
        this._searchWindowSize = arg.getSearchWindowSize();
        this._tReselectionCdma2000 = arg.getTReselectionCdma2000();
        this._tReselectionCdma2000SfMedium = arg.getTReselectionCdma2000SfMedium();
        this._tReselectionCdma2000SfHigh = arg.getTReselectionCdma2000SfHigh();
        this._maxCdma2000BandEntries = arg.getMaxCdma2000BandEntries();
        this._cdma2000BandNumberOfEntries = arg.getCdma2000BandNumberOfEntries();
    }

    public LteRanMobilityIdleModeIratCdma2000Builder(LteRanMobilityIdleModeIratCdma2000 base) {
        this._cdma2000BandNumberOfEntries = base.getCdma2000BandNumberOfEntries();
        this._lteRanMobilityIdleModeIratCdma2000Cdma2000Band = base.getLteRanMobilityIdleModeIratCdma2000Cdma2000Band();
        this._maxCdma2000BandEntries = base.getMaxCdma2000BandEntries();
        this._searchWindowSize = base.getSearchWindowSize();
        this._tReselectionCdma2000 = base.getTReselectionCdma2000();
        this._tReselectionCdma2000SfHigh = base.getTReselectionCdma2000SfHigh();
        this._tReselectionCdma2000SfMedium = base.getTReselectionCdma2000SfMedium();
        if (base instanceof LteRanMobilityIdleModeIratCdma2000Impl) {
            LteRanMobilityIdleModeIratCdma2000Impl impl = (LteRanMobilityIdleModeIratCdma2000Impl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G) {
            this._searchWindowSize = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G)arg).getSearchWindowSize();
            this._tReselectionCdma2000 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G)arg).getTReselectionCdma2000();
            this._tReselectionCdma2000SfMedium = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G)arg).getTReselectionCdma2000SfMedium();
            this._tReselectionCdma2000SfHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G)arg).getTReselectionCdma2000SfHigh();
            this._maxCdma2000BandEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G)arg).getMaxCdma2000BandEntries();
            this._cdma2000BandNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G)arg).getCdma2000BandNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getCdma2000BandNumberOfEntries() {
        return _cdma2000BandNumberOfEntries;
    }
    
    public List<LteRanMobilityIdleModeIratCdma2000Cdma2000Band> getLteRanMobilityIdleModeIratCdma2000Cdma2000Band() {
        return _lteRanMobilityIdleModeIratCdma2000Cdma2000Band;
    }
    
    public BigInteger getMaxCdma2000BandEntries() {
        return _maxCdma2000BandEntries;
    }
    
    public List<java.lang.String> getSearchWindowSize() {
        return _searchWindowSize;
    }
    
    public List<java.lang.String> getTReselectionCdma2000() {
        return _tReselectionCdma2000;
    }
    
    public java.lang.Short getTReselectionCdma2000SfHigh() {
        return _tReselectionCdma2000SfHigh;
    }
    
    public java.lang.Short getTReselectionCdma2000SfMedium() {
        return _tReselectionCdma2000SfMedium;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCDMA2000BANDNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCDMA2000BANDNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkCdma2000BandNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCDMA2000BANDNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCDMA2000BANDNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public LteRanMobilityIdleModeIratCdma2000Builder setCdma2000BandNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkCdma2000BandNumberOfEntriesRange(value);
    }
        this._cdma2000BandNumberOfEntries = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratCdma2000Builder setLteRanMobilityIdleModeIratCdma2000Cdma2000Band(final List<LteRanMobilityIdleModeIratCdma2000Cdma2000Band> value) {
        this._lteRanMobilityIdleModeIratCdma2000Cdma2000Band = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXCDMA2000BANDENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXCDMA2000BANDENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxCdma2000BandEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXCDMA2000BANDENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXCDMA2000BANDENTRIESRANGE_RANGES)));
     }
    
    public LteRanMobilityIdleModeIratCdma2000Builder setMaxCdma2000BandEntries(final BigInteger value) {
    if (value != null) {
        checkMaxCdma2000BandEntriesRange(value);
    }
        this._maxCdma2000BandEntries = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratCdma2000Builder setSearchWindowSize(final List<java.lang.String> value) {
        this._searchWindowSize = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratCdma2000Builder setTReselectionCdma2000(final List<java.lang.String> value) {
        this._tReselectionCdma2000 = value;
        return this;
    }
    
     
     private static void checkTReselectionCdma2000SfHighRange(final short value) {
         if (value >= (short)25 && value <= (short)25) {
             return;
         }
         if (value >= (short)50 && value <= (short)50) {
             return;
         }
         if (value >= (short)75 && value <= (short)75) {
             return;
         }
         if (value >= (short)100 && value <= (short)100) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[25..25], [50..50], [75..75], [100..100]].", value));
     }
    
    public LteRanMobilityIdleModeIratCdma2000Builder setTReselectionCdma2000SfHigh(final java.lang.Short value) {
    if (value != null) {
        checkTReselectionCdma2000SfHighRange(value);
    }
        this._tReselectionCdma2000SfHigh = value;
        return this;
    }
    
     
     private static void checkTReselectionCdma2000SfMediumRange(final short value) {
         if (value >= (short)25 && value <= (short)25) {
             return;
         }
         if (value >= (short)50 && value <= (short)50) {
             return;
         }
         if (value >= (short)75 && value <= (short)75) {
             return;
         }
         if (value >= (short)100 && value <= (short)100) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[25..25], [50..50], [75..75], [100..100]].", value));
     }
    
    public LteRanMobilityIdleModeIratCdma2000Builder setTReselectionCdma2000SfMedium(final java.lang.Short value) {
    if (value != null) {
        checkTReselectionCdma2000SfMediumRange(value);
    }
        this._tReselectionCdma2000SfMedium = value;
        return this;
    }
    
    public LteRanMobilityIdleModeIratCdma2000Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeIratCdma2000Builder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleModeIratCdma2000 build() {
        return new LteRanMobilityIdleModeIratCdma2000Impl(this);
    }

    private static final class LteRanMobilityIdleModeIratCdma2000Impl implements LteRanMobilityIdleModeIratCdma2000 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000.class;
        }

        private final BigInteger _cdma2000BandNumberOfEntries;
        private final List<LteRanMobilityIdleModeIratCdma2000Cdma2000Band> _lteRanMobilityIdleModeIratCdma2000Cdma2000Band;
        private final BigInteger _maxCdma2000BandEntries;
        private final List<java.lang.String> _searchWindowSize;
        private final List<java.lang.String> _tReselectionCdma2000;
        private final java.lang.Short _tReselectionCdma2000SfHigh;
        private final java.lang.Short _tReselectionCdma2000SfMedium;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeIratCdma2000Impl(LteRanMobilityIdleModeIratCdma2000Builder base) {
            this._cdma2000BandNumberOfEntries = base.getCdma2000BandNumberOfEntries();
            this._lteRanMobilityIdleModeIratCdma2000Cdma2000Band = base.getLteRanMobilityIdleModeIratCdma2000Cdma2000Band();
            this._maxCdma2000BandEntries = base.getMaxCdma2000BandEntries();
            this._searchWindowSize = base.getSearchWindowSize();
            this._tReselectionCdma2000 = base.getTReselectionCdma2000();
            this._tReselectionCdma2000SfHigh = base.getTReselectionCdma2000SfHigh();
            this._tReselectionCdma2000SfMedium = base.getTReselectionCdma2000SfMedium();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getCdma2000BandNumberOfEntries() {
            return _cdma2000BandNumberOfEntries;
        }
        
        @Override
        public List<LteRanMobilityIdleModeIratCdma2000Cdma2000Band> getLteRanMobilityIdleModeIratCdma2000Cdma2000Band() {
            return _lteRanMobilityIdleModeIratCdma2000Cdma2000Band;
        }
        
        @Override
        public BigInteger getMaxCdma2000BandEntries() {
            return _maxCdma2000BandEntries;
        }
        
        @Override
        public List<java.lang.String> getSearchWindowSize() {
            return _searchWindowSize;
        }
        
        @Override
        public List<java.lang.String> getTReselectionCdma2000() {
            return _tReselectionCdma2000;
        }
        
        @Override
        public java.lang.Short getTReselectionCdma2000SfHigh() {
            return _tReselectionCdma2000SfHigh;
        }
        
        @Override
        public java.lang.Short getTReselectionCdma2000SfMedium() {
            return _tReselectionCdma2000SfMedium;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cdma2000BandNumberOfEntries);
            result = prime * result + Objects.hashCode(_lteRanMobilityIdleModeIratCdma2000Cdma2000Band);
            result = prime * result + Objects.hashCode(_maxCdma2000BandEntries);
            result = prime * result + Objects.hashCode(_searchWindowSize);
            result = prime * result + Objects.hashCode(_tReselectionCdma2000);
            result = prime * result + Objects.hashCode(_tReselectionCdma2000SfHigh);
            result = prime * result + Objects.hashCode(_tReselectionCdma2000SfMedium);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000 other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000)obj;
            if (!Objects.equals(_cdma2000BandNumberOfEntries, other.getCdma2000BandNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_lteRanMobilityIdleModeIratCdma2000Cdma2000Band, other.getLteRanMobilityIdleModeIratCdma2000Cdma2000Band())) {
                return false;
            }
            if (!Objects.equals(_maxCdma2000BandEntries, other.getMaxCdma2000BandEntries())) {
                return false;
            }
            if (!Objects.equals(_searchWindowSize, other.getSearchWindowSize())) {
                return false;
            }
            if (!Objects.equals(_tReselectionCdma2000, other.getTReselectionCdma2000())) {
                return false;
            }
            if (!Objects.equals(_tReselectionCdma2000SfHigh, other.getTReselectionCdma2000SfHigh())) {
                return false;
            }
            if (!Objects.equals(_tReselectionCdma2000SfMedium, other.getTReselectionCdma2000SfMedium())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityIdleModeIratCdma2000Impl otherImpl = (LteRanMobilityIdleModeIratCdma2000Impl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleModeIratCdma2000 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cdma2000BandNumberOfEntries != null) {
                builder.append("_cdma2000BandNumberOfEntries=");
                builder.append(_cdma2000BandNumberOfEntries);
                builder.append(", ");
            }
            if (_lteRanMobilityIdleModeIratCdma2000Cdma2000Band != null) {
                builder.append("_lteRanMobilityIdleModeIratCdma2000Cdma2000Band=");
                builder.append(_lteRanMobilityIdleModeIratCdma2000Cdma2000Band);
                builder.append(", ");
            }
            if (_maxCdma2000BandEntries != null) {
                builder.append("_maxCdma2000BandEntries=");
                builder.append(_maxCdma2000BandEntries);
                builder.append(", ");
            }
            if (_searchWindowSize != null) {
                builder.append("_searchWindowSize=");
                builder.append(_searchWindowSize);
                builder.append(", ");
            }
            if (_tReselectionCdma2000 != null) {
                builder.append("_tReselectionCdma2000=");
                builder.append(_tReselectionCdma2000);
                builder.append(", ");
            }
            if (_tReselectionCdma2000SfHigh != null) {
                builder.append("_tReselectionCdma2000SfHigh=");
                builder.append(_tReselectionCdma2000SfHigh);
                builder.append(", ");
            }
            if (_tReselectionCdma2000SfMedium != null) {
                builder.append("_tReselectionCdma2000SfMedium=");
                builder.append(_tReselectionCdma2000SfMedium);
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
