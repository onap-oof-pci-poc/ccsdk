package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran
 *
 */
public class LteRanMobilityIdleModeIratGeranBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran> {

    private BigInteger _geranFreqGroupNumberOfEntries;
    private List<LteRanMobilityIdleModeIratGeranGeranFreqGroup> _lteRanMobilityIdleModeIratGeranGeranFreqGroup;
    private BigInteger _maxGeranFreqGroupEntries;
    private List<java.lang.String> _tReselectionGeran;
    private java.lang.Short _tReselectionGeransfHigh;
    private java.lang.Short _tReselectionGeransfMedium;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeIratGeranBuilder() {
    }
    public LteRanMobilityIdleModeIratGeranBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranG arg) {
        this._tReselectionGeran = arg.getTReselectionGeran();
        this._tReselectionGeransfMedium = arg.getTReselectionGeransfMedium();
        this._tReselectionGeransfHigh = arg.getTReselectionGeransfHigh();
        this._maxGeranFreqGroupEntries = arg.getMaxGeranFreqGroupEntries();
        this._geranFreqGroupNumberOfEntries = arg.getGeranFreqGroupNumberOfEntries();
    }

    public LteRanMobilityIdleModeIratGeranBuilder(LteRanMobilityIdleModeIratGeran base) {
        this._geranFreqGroupNumberOfEntries = base.getGeranFreqGroupNumberOfEntries();
        this._lteRanMobilityIdleModeIratGeranGeranFreqGroup = base.getLteRanMobilityIdleModeIratGeranGeranFreqGroup();
        this._maxGeranFreqGroupEntries = base.getMaxGeranFreqGroupEntries();
        this._tReselectionGeran = base.getTReselectionGeran();
        this._tReselectionGeransfHigh = base.getTReselectionGeransfHigh();
        this._tReselectionGeransfMedium = base.getTReselectionGeransfMedium();
        if (base instanceof LteRanMobilityIdleModeIratGeranImpl) {
            LteRanMobilityIdleModeIratGeranImpl impl = (LteRanMobilityIdleModeIratGeranImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranG) {
            this._tReselectionGeran = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranG)arg).getTReselectionGeran();
            this._tReselectionGeransfMedium = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranG)arg).getTReselectionGeransfMedium();
            this._tReselectionGeransfHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranG)arg).getTReselectionGeransfHigh();
            this._maxGeranFreqGroupEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranG)arg).getMaxGeranFreqGroupEntries();
            this._geranFreqGroupNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranG)arg).getGeranFreqGroupNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getGeranFreqGroupNumberOfEntries() {
        return _geranFreqGroupNumberOfEntries;
    }
    
    public List<LteRanMobilityIdleModeIratGeranGeranFreqGroup> getLteRanMobilityIdleModeIratGeranGeranFreqGroup() {
        return _lteRanMobilityIdleModeIratGeranGeranFreqGroup;
    }
    
    public BigInteger getMaxGeranFreqGroupEntries() {
        return _maxGeranFreqGroupEntries;
    }
    
    public List<java.lang.String> getTReselectionGeran() {
        return _tReselectionGeran;
    }
    
    public java.lang.Short getTReselectionGeransfHigh() {
        return _tReselectionGeransfHigh;
    }
    
    public java.lang.Short getTReselectionGeransfMedium() {
        return _tReselectionGeransfMedium;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKGERANFREQGROUPNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKGERANFREQGROUPNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkGeranFreqGroupNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKGERANFREQGROUPNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKGERANFREQGROUPNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public LteRanMobilityIdleModeIratGeranBuilder setGeranFreqGroupNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkGeranFreqGroupNumberOfEntriesRange(value);
    }
        this._geranFreqGroupNumberOfEntries = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratGeranBuilder setLteRanMobilityIdleModeIratGeranGeranFreqGroup(final List<LteRanMobilityIdleModeIratGeranGeranFreqGroup> value) {
        this._lteRanMobilityIdleModeIratGeranGeranFreqGroup = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXGERANFREQGROUPENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXGERANFREQGROUPENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxGeranFreqGroupEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXGERANFREQGROUPENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXGERANFREQGROUPENTRIESRANGE_RANGES)));
     }
    
    public LteRanMobilityIdleModeIratGeranBuilder setMaxGeranFreqGroupEntries(final BigInteger value) {
    if (value != null) {
        checkMaxGeranFreqGroupEntriesRange(value);
    }
        this._maxGeranFreqGroupEntries = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratGeranBuilder setTReselectionGeran(final List<java.lang.String> value) {
        this._tReselectionGeran = value;
        return this;
    }
    
     
     private static void checkTReselectionGeransfHighRange(final short value) {
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
    
    public LteRanMobilityIdleModeIratGeranBuilder setTReselectionGeransfHigh(final java.lang.Short value) {
    if (value != null) {
        checkTReselectionGeransfHighRange(value);
    }
        this._tReselectionGeransfHigh = value;
        return this;
    }
    
     
     private static void checkTReselectionGeransfMediumRange(final short value) {
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
    
    public LteRanMobilityIdleModeIratGeranBuilder setTReselectionGeransfMedium(final java.lang.Short value) {
    if (value != null) {
        checkTReselectionGeransfMediumRange(value);
    }
        this._tReselectionGeransfMedium = value;
        return this;
    }
    
    public LteRanMobilityIdleModeIratGeranBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeIratGeranBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleModeIratGeran build() {
        return new LteRanMobilityIdleModeIratGeranImpl(this);
    }

    private static final class LteRanMobilityIdleModeIratGeranImpl implements LteRanMobilityIdleModeIratGeran {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran.class;
        }

        private final BigInteger _geranFreqGroupNumberOfEntries;
        private final List<LteRanMobilityIdleModeIratGeranGeranFreqGroup> _lteRanMobilityIdleModeIratGeranGeranFreqGroup;
        private final BigInteger _maxGeranFreqGroupEntries;
        private final List<java.lang.String> _tReselectionGeran;
        private final java.lang.Short _tReselectionGeransfHigh;
        private final java.lang.Short _tReselectionGeransfMedium;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeIratGeranImpl(LteRanMobilityIdleModeIratGeranBuilder base) {
            this._geranFreqGroupNumberOfEntries = base.getGeranFreqGroupNumberOfEntries();
            this._lteRanMobilityIdleModeIratGeranGeranFreqGroup = base.getLteRanMobilityIdleModeIratGeranGeranFreqGroup();
            this._maxGeranFreqGroupEntries = base.getMaxGeranFreqGroupEntries();
            this._tReselectionGeran = base.getTReselectionGeran();
            this._tReselectionGeransfHigh = base.getTReselectionGeransfHigh();
            this._tReselectionGeransfMedium = base.getTReselectionGeransfMedium();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getGeranFreqGroupNumberOfEntries() {
            return _geranFreqGroupNumberOfEntries;
        }
        
        @Override
        public List<LteRanMobilityIdleModeIratGeranGeranFreqGroup> getLteRanMobilityIdleModeIratGeranGeranFreqGroup() {
            return _lteRanMobilityIdleModeIratGeranGeranFreqGroup;
        }
        
        @Override
        public BigInteger getMaxGeranFreqGroupEntries() {
            return _maxGeranFreqGroupEntries;
        }
        
        @Override
        public List<java.lang.String> getTReselectionGeran() {
            return _tReselectionGeran;
        }
        
        @Override
        public java.lang.Short getTReselectionGeransfHigh() {
            return _tReselectionGeransfHigh;
        }
        
        @Override
        public java.lang.Short getTReselectionGeransfMedium() {
            return _tReselectionGeransfMedium;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_geranFreqGroupNumberOfEntries);
            result = prime * result + Objects.hashCode(_lteRanMobilityIdleModeIratGeranGeranFreqGroup);
            result = prime * result + Objects.hashCode(_maxGeranFreqGroupEntries);
            result = prime * result + Objects.hashCode(_tReselectionGeran);
            result = prime * result + Objects.hashCode(_tReselectionGeransfHigh);
            result = prime * result + Objects.hashCode(_tReselectionGeransfMedium);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran)obj;
            if (!Objects.equals(_geranFreqGroupNumberOfEntries, other.getGeranFreqGroupNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_lteRanMobilityIdleModeIratGeranGeranFreqGroup, other.getLteRanMobilityIdleModeIratGeranGeranFreqGroup())) {
                return false;
            }
            if (!Objects.equals(_maxGeranFreqGroupEntries, other.getMaxGeranFreqGroupEntries())) {
                return false;
            }
            if (!Objects.equals(_tReselectionGeran, other.getTReselectionGeran())) {
                return false;
            }
            if (!Objects.equals(_tReselectionGeransfHigh, other.getTReselectionGeransfHigh())) {
                return false;
            }
            if (!Objects.equals(_tReselectionGeransfMedium, other.getTReselectionGeransfMedium())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityIdleModeIratGeranImpl otherImpl = (LteRanMobilityIdleModeIratGeranImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleModeIratGeran [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_geranFreqGroupNumberOfEntries != null) {
                builder.append("_geranFreqGroupNumberOfEntries=");
                builder.append(_geranFreqGroupNumberOfEntries);
                builder.append(", ");
            }
            if (_lteRanMobilityIdleModeIratGeranGeranFreqGroup != null) {
                builder.append("_lteRanMobilityIdleModeIratGeranGeranFreqGroup=");
                builder.append(_lteRanMobilityIdleModeIratGeranGeranFreqGroup);
                builder.append(", ");
            }
            if (_maxGeranFreqGroupEntries != null) {
                builder.append("_maxGeranFreqGroupEntries=");
                builder.append(_maxGeranFreqGroupEntries);
                builder.append(", ");
            }
            if (_tReselectionGeran != null) {
                builder.append("_tReselectionGeran=");
                builder.append(_tReselectionGeran);
                builder.append(", ");
            }
            if (_tReselectionGeransfHigh != null) {
                builder.append("_tReselectionGeransfHigh=");
                builder.append(_tReselectionGeransfHigh);
                builder.append(", ");
            }
            if (_tReselectionGeransfMedium != null) {
                builder.append("_tReselectionGeransfMedium=");
                builder.append(_tReselectionGeransfMedium);
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
