package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListLteCell;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList
 *
 */
public class LteRanNeighborListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList> {

    private BigInteger _lteCellNumberOfEntries;
    private LteRanNeighborListInterRatCell _lteRanNeighborListInterRatCell;
    private List<LteRanNeighborListLteCell> _lteRanNeighborListLteCell;
    private BigInteger _maxLteCellEntries;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>> augmentation = Collections.emptyMap();

    public LteRanNeighborListBuilder() {
    }
    public LteRanNeighborListBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListG arg) {
        this._maxLteCellEntries = arg.getMaxLteCellEntries();
        this._lteCellNumberOfEntries = arg.getLteCellNumberOfEntries();
    }

    public LteRanNeighborListBuilder(LteRanNeighborList base) {
        this._lteCellNumberOfEntries = base.getLteCellNumberOfEntries();
        this._lteRanNeighborListInterRatCell = base.getLteRanNeighborListInterRatCell();
        this._lteRanNeighborListLteCell = base.getLteRanNeighborListLteCell();
        this._maxLteCellEntries = base.getMaxLteCellEntries();
        if (base instanceof LteRanNeighborListImpl) {
            LteRanNeighborListImpl impl = (LteRanNeighborListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListG) {
            this._maxLteCellEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListG)arg).getMaxLteCellEntries();
            this._lteCellNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListG)arg).getLteCellNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getLteCellNumberOfEntries() {
        return _lteCellNumberOfEntries;
    }
    
    public LteRanNeighborListInterRatCell getLteRanNeighborListInterRatCell() {
        return _lteRanNeighborListInterRatCell;
    }
    
    public List<LteRanNeighborListLteCell> getLteRanNeighborListLteCell() {
        return _lteRanNeighborListLteCell;
    }
    
    public BigInteger getMaxLteCellEntries() {
        return _maxLteCellEntries;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public LteRanNeighborListBuilder setLteCellNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkLteCellNumberOfEntriesRange(value);
    }
        this._lteCellNumberOfEntries = value;
        return this;
    }
    
     
    public LteRanNeighborListBuilder setLteRanNeighborListInterRatCell(final LteRanNeighborListInterRatCell value) {
        this._lteRanNeighborListInterRatCell = value;
        return this;
    }
    
     
    public LteRanNeighborListBuilder setLteRanNeighborListLteCell(final List<LteRanNeighborListLteCell> value) {
        this._lteRanNeighborListLteCell = value;
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
    
    public LteRanNeighborListBuilder setMaxLteCellEntries(final BigInteger value) {
    if (value != null) {
        checkMaxLteCellEntriesRange(value);
    }
        this._maxLteCellEntries = value;
        return this;
    }
    
    public LteRanNeighborListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanNeighborListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanNeighborList build() {
        return new LteRanNeighborListImpl(this);
    }

    private static final class LteRanNeighborListImpl implements LteRanNeighborList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList.class;
        }

        private final BigInteger _lteCellNumberOfEntries;
        private final LteRanNeighborListInterRatCell _lteRanNeighborListInterRatCell;
        private final List<LteRanNeighborListLteCell> _lteRanNeighborListLteCell;
        private final BigInteger _maxLteCellEntries;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>> augmentation = Collections.emptyMap();

        private LteRanNeighborListImpl(LteRanNeighborListBuilder base) {
            this._lteCellNumberOfEntries = base.getLteCellNumberOfEntries();
            this._lteRanNeighborListInterRatCell = base.getLteRanNeighborListInterRatCell();
            this._lteRanNeighborListLteCell = base.getLteRanNeighborListLteCell();
            this._maxLteCellEntries = base.getMaxLteCellEntries();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>>singletonMap(e.getKey(), e.getValue());
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
        public LteRanNeighborListInterRatCell getLteRanNeighborListInterRatCell() {
            return _lteRanNeighborListInterRatCell;
        }
        
        @Override
        public List<LteRanNeighborListLteCell> getLteRanNeighborListLteCell() {
            return _lteRanNeighborListLteCell;
        }
        
        @Override
        public BigInteger getMaxLteCellEntries() {
            return _maxLteCellEntries;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lteRanNeighborListInterRatCell);
            result = prime * result + Objects.hashCode(_lteRanNeighborListLteCell);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList)obj;
            if (!Objects.equals(_lteCellNumberOfEntries, other.getLteCellNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_lteRanNeighborListInterRatCell, other.getLteRanNeighborListInterRatCell())) {
                return false;
            }
            if (!Objects.equals(_lteRanNeighborListLteCell, other.getLteRanNeighborListLteCell())) {
                return false;
            }
            if (!Objects.equals(_maxLteCellEntries, other.getMaxLteCellEntries())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanNeighborListImpl otherImpl = (LteRanNeighborListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanNeighborList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_lteCellNumberOfEntries != null) {
                builder.append("_lteCellNumberOfEntries=");
                builder.append(_lteCellNumberOfEntries);
                builder.append(", ");
            }
            if (_lteRanNeighborListInterRatCell != null) {
                builder.append("_lteRanNeighborListInterRatCell=");
                builder.append(_lteRanNeighborListInterRatCell);
                builder.append(", ");
            }
            if (_lteRanNeighborListLteCell != null) {
                builder.append("_lteRanNeighborListLteCell=");
                builder.append(_lteRanNeighborListLteCell);
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
