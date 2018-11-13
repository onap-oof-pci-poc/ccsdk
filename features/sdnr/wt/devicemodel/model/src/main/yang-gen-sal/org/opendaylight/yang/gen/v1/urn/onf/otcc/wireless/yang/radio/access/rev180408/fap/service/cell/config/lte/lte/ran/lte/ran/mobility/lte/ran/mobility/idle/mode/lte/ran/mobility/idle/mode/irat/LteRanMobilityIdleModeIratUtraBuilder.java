package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra
 *
 */
public class LteRanMobilityIdleModeIratUtraBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra> {

    private List<LteRanMobilityIdleModeIratUtraUtranfddFreq> _lteRanMobilityIdleModeIratUtraUtranfddFreq;
    private BigInteger _maxUtranfddFreqEntries;
    private List<java.lang.String> _tReselectionUtra;
    private java.lang.Short _tReselectionUtrasfHigh;
    private java.lang.Short _tReselectionUtrasfMedium;
    private BigInteger _utranfddFreqNumberOfEntries;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeIratUtraBuilder() {
    }
    public LteRanMobilityIdleModeIratUtraBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraG arg) {
        this._tReselectionUtra = arg.getTReselectionUtra();
        this._tReselectionUtrasfMedium = arg.getTReselectionUtrasfMedium();
        this._tReselectionUtrasfHigh = arg.getTReselectionUtrasfHigh();
        this._maxUtranfddFreqEntries = arg.getMaxUtranfddFreqEntries();
        this._utranfddFreqNumberOfEntries = arg.getUtranfddFreqNumberOfEntries();
    }

    public LteRanMobilityIdleModeIratUtraBuilder(LteRanMobilityIdleModeIratUtra base) {
        this._lteRanMobilityIdleModeIratUtraUtranfddFreq = base.getLteRanMobilityIdleModeIratUtraUtranfddFreq();
        this._maxUtranfddFreqEntries = base.getMaxUtranfddFreqEntries();
        this._tReselectionUtra = base.getTReselectionUtra();
        this._tReselectionUtrasfHigh = base.getTReselectionUtrasfHigh();
        this._tReselectionUtrasfMedium = base.getTReselectionUtrasfMedium();
        this._utranfddFreqNumberOfEntries = base.getUtranfddFreqNumberOfEntries();
        if (base instanceof LteRanMobilityIdleModeIratUtraImpl) {
            LteRanMobilityIdleModeIratUtraImpl impl = (LteRanMobilityIdleModeIratUtraImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraG) {
            this._tReselectionUtra = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraG)arg).getTReselectionUtra();
            this._tReselectionUtrasfMedium = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraG)arg).getTReselectionUtrasfMedium();
            this._tReselectionUtrasfHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraG)arg).getTReselectionUtrasfHigh();
            this._maxUtranfddFreqEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraG)arg).getMaxUtranfddFreqEntries();
            this._utranfddFreqNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraG)arg).getUtranfddFreqNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<LteRanMobilityIdleModeIratUtraUtranfddFreq> getLteRanMobilityIdleModeIratUtraUtranfddFreq() {
        return _lteRanMobilityIdleModeIratUtraUtranfddFreq;
    }
    
    public BigInteger getMaxUtranfddFreqEntries() {
        return _maxUtranfddFreqEntries;
    }
    
    public List<java.lang.String> getTReselectionUtra() {
        return _tReselectionUtra;
    }
    
    public java.lang.Short getTReselectionUtrasfHigh() {
        return _tReselectionUtrasfHigh;
    }
    
    public java.lang.Short getTReselectionUtrasfMedium() {
        return _tReselectionUtrasfMedium;
    }
    
    public BigInteger getUtranfddFreqNumberOfEntries() {
        return _utranfddFreqNumberOfEntries;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanMobilityIdleModeIratUtraBuilder setLteRanMobilityIdleModeIratUtraUtranfddFreq(final List<LteRanMobilityIdleModeIratUtraUtranfddFreq> value) {
        this._lteRanMobilityIdleModeIratUtraUtranfddFreq = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXUTRANFDDFREQENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXUTRANFDDFREQENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxUtranfddFreqEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXUTRANFDDFREQENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXUTRANFDDFREQENTRIESRANGE_RANGES)));
     }
    
    public LteRanMobilityIdleModeIratUtraBuilder setMaxUtranfddFreqEntries(final BigInteger value) {
    if (value != null) {
        checkMaxUtranfddFreqEntriesRange(value);
    }
        this._maxUtranfddFreqEntries = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratUtraBuilder setTReselectionUtra(final List<java.lang.String> value) {
        this._tReselectionUtra = value;
        return this;
    }
    
     
     private static void checkTReselectionUtrasfHighRange(final short value) {
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
    
    public LteRanMobilityIdleModeIratUtraBuilder setTReselectionUtrasfHigh(final java.lang.Short value) {
    if (value != null) {
        checkTReselectionUtrasfHighRange(value);
    }
        this._tReselectionUtrasfHigh = value;
        return this;
    }
    
     
     private static void checkTReselectionUtrasfMediumRange(final short value) {
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
    
    public LteRanMobilityIdleModeIratUtraBuilder setTReselectionUtrasfMedium(final java.lang.Short value) {
    if (value != null) {
        checkTReselectionUtrasfMediumRange(value);
    }
        this._tReselectionUtrasfMedium = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKUTRANFDDFREQNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKUTRANFDDFREQNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkUtranfddFreqNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKUTRANFDDFREQNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKUTRANFDDFREQNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public LteRanMobilityIdleModeIratUtraBuilder setUtranfddFreqNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkUtranfddFreqNumberOfEntriesRange(value);
    }
        this._utranfddFreqNumberOfEntries = value;
        return this;
    }
    
    public LteRanMobilityIdleModeIratUtraBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeIratUtraBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleModeIratUtra build() {
        return new LteRanMobilityIdleModeIratUtraImpl(this);
    }

    private static final class LteRanMobilityIdleModeIratUtraImpl implements LteRanMobilityIdleModeIratUtra {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra.class;
        }

        private final List<LteRanMobilityIdleModeIratUtraUtranfddFreq> _lteRanMobilityIdleModeIratUtraUtranfddFreq;
        private final BigInteger _maxUtranfddFreqEntries;
        private final List<java.lang.String> _tReselectionUtra;
        private final java.lang.Short _tReselectionUtrasfHigh;
        private final java.lang.Short _tReselectionUtrasfMedium;
        private final BigInteger _utranfddFreqNumberOfEntries;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeIratUtraImpl(LteRanMobilityIdleModeIratUtraBuilder base) {
            this._lteRanMobilityIdleModeIratUtraUtranfddFreq = base.getLteRanMobilityIdleModeIratUtraUtranfddFreq();
            this._maxUtranfddFreqEntries = base.getMaxUtranfddFreqEntries();
            this._tReselectionUtra = base.getTReselectionUtra();
            this._tReselectionUtrasfHigh = base.getTReselectionUtrasfHigh();
            this._tReselectionUtrasfMedium = base.getTReselectionUtrasfMedium();
            this._utranfddFreqNumberOfEntries = base.getUtranfddFreqNumberOfEntries();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<LteRanMobilityIdleModeIratUtraUtranfddFreq> getLteRanMobilityIdleModeIratUtraUtranfddFreq() {
            return _lteRanMobilityIdleModeIratUtraUtranfddFreq;
        }
        
        @Override
        public BigInteger getMaxUtranfddFreqEntries() {
            return _maxUtranfddFreqEntries;
        }
        
        @Override
        public List<java.lang.String> getTReselectionUtra() {
            return _tReselectionUtra;
        }
        
        @Override
        public java.lang.Short getTReselectionUtrasfHigh() {
            return _tReselectionUtrasfHigh;
        }
        
        @Override
        public java.lang.Short getTReselectionUtrasfMedium() {
            return _tReselectionUtrasfMedium;
        }
        
        @Override
        public BigInteger getUtranfddFreqNumberOfEntries() {
            return _utranfddFreqNumberOfEntries;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lteRanMobilityIdleModeIratUtraUtranfddFreq);
            result = prime * result + Objects.hashCode(_maxUtranfddFreqEntries);
            result = prime * result + Objects.hashCode(_tReselectionUtra);
            result = prime * result + Objects.hashCode(_tReselectionUtrasfHigh);
            result = prime * result + Objects.hashCode(_tReselectionUtrasfMedium);
            result = prime * result + Objects.hashCode(_utranfddFreqNumberOfEntries);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra)obj;
            if (!Objects.equals(_lteRanMobilityIdleModeIratUtraUtranfddFreq, other.getLteRanMobilityIdleModeIratUtraUtranfddFreq())) {
                return false;
            }
            if (!Objects.equals(_maxUtranfddFreqEntries, other.getMaxUtranfddFreqEntries())) {
                return false;
            }
            if (!Objects.equals(_tReselectionUtra, other.getTReselectionUtra())) {
                return false;
            }
            if (!Objects.equals(_tReselectionUtrasfHigh, other.getTReselectionUtrasfHigh())) {
                return false;
            }
            if (!Objects.equals(_tReselectionUtrasfMedium, other.getTReselectionUtrasfMedium())) {
                return false;
            }
            if (!Objects.equals(_utranfddFreqNumberOfEntries, other.getUtranfddFreqNumberOfEntries())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityIdleModeIratUtraImpl otherImpl = (LteRanMobilityIdleModeIratUtraImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleModeIratUtra [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_lteRanMobilityIdleModeIratUtraUtranfddFreq != null) {
                builder.append("_lteRanMobilityIdleModeIratUtraUtranfddFreq=");
                builder.append(_lteRanMobilityIdleModeIratUtraUtranfddFreq);
                builder.append(", ");
            }
            if (_maxUtranfddFreqEntries != null) {
                builder.append("_maxUtranfddFreqEntries=");
                builder.append(_maxUtranfddFreqEntries);
                builder.append(", ");
            }
            if (_tReselectionUtra != null) {
                builder.append("_tReselectionUtra=");
                builder.append(_tReselectionUtra);
                builder.append(", ");
            }
            if (_tReselectionUtrasfHigh != null) {
                builder.append("_tReselectionUtrasfHigh=");
                builder.append(_tReselectionUtrasfHigh);
                builder.append(", ");
            }
            if (_tReselectionUtrasfMedium != null) {
                builder.append("_tReselectionUtrasfMedium=");
                builder.append(_tReselectionUtrasfMedium);
                builder.append(", ");
            }
            if (_utranfddFreqNumberOfEntries != null) {
                builder.append("_utranfddFreqNumberOfEntries=");
                builder.append(_utranfddFreqNumberOfEntries);
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
