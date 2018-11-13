package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseInterRatCell;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse
 *
 */
public class LteRanNeighborListInUseBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse> {

    private BigInteger _lteCellNumberOfEntries;
    private LteRanNeighborListInUseInterRatCell _lteRanNeighborListInUseInterRatCell;
    private List<LteRanNeighborListInUseLteCell> _lteRanNeighborListInUseLteCell;
    private BigInteger _maxLteCellEntries;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>> augmentation = Collections.emptyMap();

    public LteRanNeighborListInUseBuilder() {
    }
    public LteRanNeighborListInUseBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseG arg) {
        this._maxLteCellEntries = arg.getMaxLteCellEntries();
        this._lteCellNumberOfEntries = arg.getLteCellNumberOfEntries();
    }

    public LteRanNeighborListInUseBuilder(LteRanNeighborListInUse base) {
        this._lteCellNumberOfEntries = base.getLteCellNumberOfEntries();
        this._lteRanNeighborListInUseInterRatCell = base.getLteRanNeighborListInUseInterRatCell();
        this._lteRanNeighborListInUseLteCell = base.getLteRanNeighborListInUseLteCell();
        this._maxLteCellEntries = base.getMaxLteCellEntries();
        if (base instanceof LteRanNeighborListInUseImpl) {
            LteRanNeighborListInUseImpl impl = (LteRanNeighborListInUseImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseG) {
            this._maxLteCellEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseG)arg).getMaxLteCellEntries();
            this._lteCellNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseG)arg).getLteCellNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getLteCellNumberOfEntries() {
        return _lteCellNumberOfEntries;
    }
    
    public LteRanNeighborListInUseInterRatCell getLteRanNeighborListInUseInterRatCell() {
        return _lteRanNeighborListInUseInterRatCell;
    }
    
    public List<LteRanNeighborListInUseLteCell> getLteRanNeighborListInUseLteCell() {
        return _lteRanNeighborListInUseLteCell;
    }
    
    public BigInteger getMaxLteCellEntries() {
        return _maxLteCellEntries;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKLTECELLNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKLTECELLNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkLteCellNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKLTECELLNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKLTECELLNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public LteRanNeighborListInUseBuilder setLteCellNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkLteCellNumberOfEntriesRange(value);
    }
        this._lteCellNumberOfEntries = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseBuilder setLteRanNeighborListInUseInterRatCell(final LteRanNeighborListInUseInterRatCell value) {
        this._lteRanNeighborListInUseInterRatCell = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseBuilder setLteRanNeighborListInUseLteCell(final List<LteRanNeighborListInUseLteCell> value) {
        this._lteRanNeighborListInUseLteCell = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXLTECELLENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXLTECELLENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxLteCellEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXLTECELLENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXLTECELLENTRIESRANGE_RANGES)));
     }
    
    public LteRanNeighborListInUseBuilder setMaxLteCellEntries(final BigInteger value) {
    if (value != null) {
        checkMaxLteCellEntriesRange(value);
    }
        this._maxLteCellEntries = value;
        return this;
    }
    
    public LteRanNeighborListInUseBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanNeighborListInUseBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanNeighborListInUse build() {
        return new LteRanNeighborListInUseImpl(this);
    }

    private static final class LteRanNeighborListInUseImpl implements LteRanNeighborListInUse {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse.class;
        }

        private final BigInteger _lteCellNumberOfEntries;
        private final LteRanNeighborListInUseInterRatCell _lteRanNeighborListInUseInterRatCell;
        private final List<LteRanNeighborListInUseLteCell> _lteRanNeighborListInUseLteCell;
        private final BigInteger _maxLteCellEntries;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>> augmentation = Collections.emptyMap();

        private LteRanNeighborListInUseImpl(LteRanNeighborListInUseBuilder base) {
            this._lteCellNumberOfEntries = base.getLteCellNumberOfEntries();
            this._lteRanNeighborListInUseInterRatCell = base.getLteRanNeighborListInUseInterRatCell();
            this._lteRanNeighborListInUseLteCell = base.getLteRanNeighborListInUseLteCell();
            this._maxLteCellEntries = base.getMaxLteCellEntries();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getLteCellNumberOfEntries() {
            return _lteCellNumberOfEntries;
        }
        
        @Override
        public LteRanNeighborListInUseInterRatCell getLteRanNeighborListInUseInterRatCell() {
            return _lteRanNeighborListInUseInterRatCell;
        }
        
        @Override
        public List<LteRanNeighborListInUseLteCell> getLteRanNeighborListInUseLteCell() {
            return _lteRanNeighborListInUseLteCell;
        }
        
        @Override
        public BigInteger getMaxLteCellEntries() {
            return _maxLteCellEntries;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lteCellNumberOfEntries);
            result = prime * result + Objects.hashCode(_lteRanNeighborListInUseInterRatCell);
            result = prime * result + Objects.hashCode(_lteRanNeighborListInUseLteCell);
            result = prime * result + Objects.hashCode(_maxLteCellEntries);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse)obj;
            if (!Objects.equals(_lteCellNumberOfEntries, other.getLteCellNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_lteRanNeighborListInUseInterRatCell, other.getLteRanNeighborListInUseInterRatCell())) {
                return false;
            }
            if (!Objects.equals(_lteRanNeighborListInUseLteCell, other.getLteRanNeighborListInUseLteCell())) {
                return false;
            }
            if (!Objects.equals(_maxLteCellEntries, other.getMaxLteCellEntries())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanNeighborListInUseImpl otherImpl = (LteRanNeighborListInUseImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanNeighborListInUse [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_lteCellNumberOfEntries != null) {
                builder.append("_lteCellNumberOfEntries=");
                builder.append(_lteCellNumberOfEntries);
                builder.append(", ");
            }
            if (_lteRanNeighborListInUseInterRatCell != null) {
                builder.append("_lteRanNeighborListInUseInterRatCell=");
                builder.append(_lteRanNeighborListInUseInterRatCell);
                builder.append(", ");
            }
            if (_lteRanNeighborListInUseLteCell != null) {
                builder.append("_lteRanNeighborListInUseLteCell=");
                builder.append(_lteRanNeighborListInUseLteCell);
                builder.append(", ");
            }
            if (_maxLteCellEntries != null) {
                builder.append("_maxLteCellEntries=");
                builder.append(_maxLteCellEntries);
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
