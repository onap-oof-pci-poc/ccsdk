package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs
 *
 */
public class LteRanPhyPrsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs> {

    private java.lang.Short _numConsecutivePrsSubfames;
    private BigInteger _numPrsResourceBlocks;
    private java.lang.Integer _prsConfigurationIndex;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>> augmentation = Collections.emptyMap();

    public LteRanPhyPrsBuilder() {
    }
    public LteRanPhyPrsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrsG arg) {
        this._numPrsResourceBlocks = arg.getNumPrsResourceBlocks();
        this._prsConfigurationIndex = arg.getPrsConfigurationIndex();
        this._numConsecutivePrsSubfames = arg.getNumConsecutivePrsSubfames();
    }

    public LteRanPhyPrsBuilder(LteRanPhyPrs base) {
        this._numConsecutivePrsSubfames = base.getNumConsecutivePrsSubfames();
        this._numPrsResourceBlocks = base.getNumPrsResourceBlocks();
        this._prsConfigurationIndex = base.getPrsConfigurationIndex();
        if (base instanceof LteRanPhyPrsImpl) {
            LteRanPhyPrsImpl impl = (LteRanPhyPrsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrsG) {
            this._numPrsResourceBlocks = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrsG)arg).getNumPrsResourceBlocks();
            this._prsConfigurationIndex = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrsG)arg).getPrsConfigurationIndex();
            this._numConsecutivePrsSubfames = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrsG)arg).getNumConsecutivePrsSubfames();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrsG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getNumConsecutivePrsSubfames() {
        return _numConsecutivePrsSubfames;
    }
    
    public BigInteger getNumPrsResourceBlocks() {
        return _numPrsResourceBlocks;
    }
    
    public java.lang.Integer getPrsConfigurationIndex() {
        return _prsConfigurationIndex;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkNumConsecutivePrsSubfamesRange(final short value) {
         if (value >= (short)1 && value <= (short)2) {
             return;
         }
         if (value >= (short)4 && value <= (short)4) {
             return;
         }
         if (value >= (short)6 && value <= (short)6) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..2], [4..4], [6..6]].", value));
     }
    
    public LteRanPhyPrsBuilder setNumConsecutivePrsSubfames(final java.lang.Short value) {
    if (value != null) {
        checkNumConsecutivePrsSubfamesRange(value);
    }
        this._numConsecutivePrsSubfames = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMPRSRESOURCEBLOCKSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMPRSRESOURCEBLOCKSRANGE_RANGES = a;
     }
     private static void checkNumPrsResourceBlocksRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMPRSRESOURCEBLOCKSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMPRSRESOURCEBLOCKSRANGE_RANGES)));
     }
    
    public LteRanPhyPrsBuilder setNumPrsResourceBlocks(final BigInteger value) {
    if (value != null) {
        checkNumPrsResourceBlocksRange(value);
    }
        this._numPrsResourceBlocks = value;
        return this;
    }
    
     
     private static void checkPrsConfigurationIndexRange(final int value) {
         if (value >= 0 && value <= 4095) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4095]].", value));
     }
    
    public LteRanPhyPrsBuilder setPrsConfigurationIndex(final java.lang.Integer value) {
    if (value != null) {
        checkPrsConfigurationIndexRange(value);
    }
        this._prsConfigurationIndex = value;
        return this;
    }
    
    public LteRanPhyPrsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanPhyPrsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanPhyPrs build() {
        return new LteRanPhyPrsImpl(this);
    }

    private static final class LteRanPhyPrsImpl implements LteRanPhyPrs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs.class;
        }

        private final java.lang.Short _numConsecutivePrsSubfames;
        private final BigInteger _numPrsResourceBlocks;
        private final java.lang.Integer _prsConfigurationIndex;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>> augmentation = Collections.emptyMap();

        private LteRanPhyPrsImpl(LteRanPhyPrsBuilder base) {
            this._numConsecutivePrsSubfames = base.getNumConsecutivePrsSubfames();
            this._numPrsResourceBlocks = base.getNumPrsResourceBlocks();
            this._prsConfigurationIndex = base.getPrsConfigurationIndex();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getNumConsecutivePrsSubfames() {
            return _numConsecutivePrsSubfames;
        }
        
        @Override
        public BigInteger getNumPrsResourceBlocks() {
            return _numPrsResourceBlocks;
        }
        
        @Override
        public java.lang.Integer getPrsConfigurationIndex() {
            return _prsConfigurationIndex;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_numConsecutivePrsSubfames);
            result = prime * result + Objects.hashCode(_numPrsResourceBlocks);
            result = prime * result + Objects.hashCode(_prsConfigurationIndex);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs)obj;
            if (!Objects.equals(_numConsecutivePrsSubfames, other.getNumConsecutivePrsSubfames())) {
                return false;
            }
            if (!Objects.equals(_numPrsResourceBlocks, other.getNumPrsResourceBlocks())) {
                return false;
            }
            if (!Objects.equals(_prsConfigurationIndex, other.getPrsConfigurationIndex())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanPhyPrsImpl otherImpl = (LteRanPhyPrsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanPhyPrs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_numConsecutivePrsSubfames != null) {
                builder.append("_numConsecutivePrsSubfames=");
                builder.append(_numConsecutivePrsSubfames);
                builder.append(", ");
            }
            if (_numPrsResourceBlocks != null) {
                builder.append("_numPrsResourceBlocks=");
                builder.append(_numPrsResourceBlocks);
                builder.append(", ");
            }
            if (_prsConfigurationIndex != null) {
                builder.append("_prsConfigurationIndex=");
                builder.append(_prsConfigurationIndex);
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
