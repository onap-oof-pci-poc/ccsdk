package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.umts.ran.neighbor.list.in.use.inter.rat.cell.UmtsRanNeighborListInUseInterRatCellGsm;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell
 *
 */
public class UmtsRanNeighborListInUseInterRatCellBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell> {

    private BigInteger _gsmNumberOfEntries;
    private BigInteger _maxGsmEntries;
    private List<UmtsRanNeighborListInUseInterRatCellGsm> _umtsRanNeighborListInUseInterRatCellGsm;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>> augmentation = Collections.emptyMap();

    public UmtsRanNeighborListInUseInterRatCellBuilder() {
    }
    public UmtsRanNeighborListInUseInterRatCellBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseInterRatCellG arg) {
        this._maxGsmEntries = arg.getMaxGsmEntries();
        this._gsmNumberOfEntries = arg.getGsmNumberOfEntries();
    }

    public UmtsRanNeighborListInUseInterRatCellBuilder(UmtsRanNeighborListInUseInterRatCell base) {
        this._gsmNumberOfEntries = base.getGsmNumberOfEntries();
        this._maxGsmEntries = base.getMaxGsmEntries();
        this._umtsRanNeighborListInUseInterRatCellGsm = base.getUmtsRanNeighborListInUseInterRatCellGsm();
        if (base instanceof UmtsRanNeighborListInUseInterRatCellImpl) {
            UmtsRanNeighborListInUseInterRatCellImpl impl = (UmtsRanNeighborListInUseInterRatCellImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseInterRatCellG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseInterRatCellG) {
            this._maxGsmEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseInterRatCellG)arg).getMaxGsmEntries();
            this._gsmNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseInterRatCellG)arg).getGsmNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseInterRatCellG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getGsmNumberOfEntries() {
        return _gsmNumberOfEntries;
    }
    
    public BigInteger getMaxGsmEntries() {
        return _maxGsmEntries;
    }
    
    public List<UmtsRanNeighborListInUseInterRatCellGsm> getUmtsRanNeighborListInUseInterRatCellGsm() {
        return _umtsRanNeighborListInUseInterRatCellGsm;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKGSMNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKGSMNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkGsmNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKGSMNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKGSMNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public UmtsRanNeighborListInUseInterRatCellBuilder setGsmNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkGsmNumberOfEntriesRange(value);
    }
        this._gsmNumberOfEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXGSMENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXGSMENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxGsmEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXGSMENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXGSMENTRIESRANGE_RANGES)));
     }
    
    public UmtsRanNeighborListInUseInterRatCellBuilder setMaxGsmEntries(final BigInteger value) {
    if (value != null) {
        checkMaxGsmEntriesRange(value);
    }
        this._maxGsmEntries = value;
        return this;
    }
    
     
    public UmtsRanNeighborListInUseInterRatCellBuilder setUmtsRanNeighborListInUseInterRatCellGsm(final List<UmtsRanNeighborListInUseInterRatCellGsm> value) {
        this._umtsRanNeighborListInUseInterRatCellGsm = value;
        return this;
    }
    
    public UmtsRanNeighborListInUseInterRatCellBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanNeighborListInUseInterRatCellBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanNeighborListInUseInterRatCell build() {
        return new UmtsRanNeighborListInUseInterRatCellImpl(this);
    }

    private static final class UmtsRanNeighborListInUseInterRatCellImpl implements UmtsRanNeighborListInUseInterRatCell {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell.class;
        }

        private final BigInteger _gsmNumberOfEntries;
        private final BigInteger _maxGsmEntries;
        private final List<UmtsRanNeighborListInUseInterRatCellGsm> _umtsRanNeighborListInUseInterRatCellGsm;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>> augmentation = Collections.emptyMap();

        private UmtsRanNeighborListInUseInterRatCellImpl(UmtsRanNeighborListInUseInterRatCellBuilder base) {
            this._gsmNumberOfEntries = base.getGsmNumberOfEntries();
            this._maxGsmEntries = base.getMaxGsmEntries();
            this._umtsRanNeighborListInUseInterRatCellGsm = base.getUmtsRanNeighborListInUseInterRatCellGsm();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getGsmNumberOfEntries() {
            return _gsmNumberOfEntries;
        }
        
        @Override
        public BigInteger getMaxGsmEntries() {
            return _maxGsmEntries;
        }
        
        @Override
        public List<UmtsRanNeighborListInUseInterRatCellGsm> getUmtsRanNeighborListInUseInterRatCellGsm() {
            return _umtsRanNeighborListInUseInterRatCellGsm;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_gsmNumberOfEntries);
            result = prime * result + Objects.hashCode(_maxGsmEntries);
            result = prime * result + Objects.hashCode(_umtsRanNeighborListInUseInterRatCellGsm);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell)obj;
            if (!Objects.equals(_gsmNumberOfEntries, other.getGsmNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_maxGsmEntries, other.getMaxGsmEntries())) {
                return false;
            }
            if (!Objects.equals(_umtsRanNeighborListInUseInterRatCellGsm, other.getUmtsRanNeighborListInUseInterRatCellGsm())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanNeighborListInUseInterRatCellImpl otherImpl = (UmtsRanNeighborListInUseInterRatCellImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanNeighborListInUseInterRatCell [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_gsmNumberOfEntries != null) {
                builder.append("_gsmNumberOfEntries=");
                builder.append(_gsmNumberOfEntries);
                builder.append(", ");
            }
            if (_maxGsmEntries != null) {
                builder.append("_maxGsmEntries=");
                builder.append(_maxGsmEntries);
                builder.append(", ");
            }
            if (_umtsRanNeighborListInUseInterRatCellGsm != null) {
                builder.append("_umtsRanNeighborListInUseInterRatCellGsm=");
                builder.append(_umtsRanNeighborListInUseInterRatCellGsm);
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
