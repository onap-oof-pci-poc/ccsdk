package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn
 *
 */
public class LteRanPhyMbsfnBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn> {

    private List<LteRanPhyMbsfnSfConfigList> _lteRanPhyMbsfnSfConfigList;
    private BigInteger _maxSfConfigListEntries;
    private java.lang.Short _neighCellConfig;
    private BigInteger _sfConfigListNumberOfEntries;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>> augmentation = Collections.emptyMap();

    public LteRanPhyMbsfnBuilder() {
    }
    public LteRanPhyMbsfnBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnG arg) {
        this._neighCellConfig = arg.getNeighCellConfig();
        this._maxSfConfigListEntries = arg.getMaxSfConfigListEntries();
        this._sfConfigListNumberOfEntries = arg.getSfConfigListNumberOfEntries();
    }

    public LteRanPhyMbsfnBuilder(LteRanPhyMbsfn base) {
        this._lteRanPhyMbsfnSfConfigList = base.getLteRanPhyMbsfnSfConfigList();
        this._maxSfConfigListEntries = base.getMaxSfConfigListEntries();
        this._neighCellConfig = base.getNeighCellConfig();
        this._sfConfigListNumberOfEntries = base.getSfConfigListNumberOfEntries();
        if (base instanceof LteRanPhyMbsfnImpl) {
            LteRanPhyMbsfnImpl impl = (LteRanPhyMbsfnImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnG) {
            this._neighCellConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnG)arg).getNeighCellConfig();
            this._maxSfConfigListEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnG)arg).getMaxSfConfigListEntries();
            this._sfConfigListNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnG)arg).getSfConfigListNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<LteRanPhyMbsfnSfConfigList> getLteRanPhyMbsfnSfConfigList() {
        return _lteRanPhyMbsfnSfConfigList;
    }
    
    public BigInteger getMaxSfConfigListEntries() {
        return _maxSfConfigListEntries;
    }
    
    public java.lang.Short getNeighCellConfig() {
        return _neighCellConfig;
    }
    
    public BigInteger getSfConfigListNumberOfEntries() {
        return _sfConfigListNumberOfEntries;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanPhyMbsfnBuilder setLteRanPhyMbsfnSfConfigList(final List<LteRanPhyMbsfnSfConfigList> value) {
        this._lteRanPhyMbsfnSfConfigList = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXSFCONFIGLISTENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXSFCONFIGLISTENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxSfConfigListEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXSFCONFIGLISTENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXSFCONFIGLISTENTRIESRANGE_RANGES)));
     }
    
    public LteRanPhyMbsfnBuilder setMaxSfConfigListEntries(final BigInteger value) {
    if (value != null) {
        checkMaxSfConfigListEntriesRange(value);
    }
        this._maxSfConfigListEntries = value;
        return this;
    }
    
     
     private static void checkNeighCellConfigRange(final short value) {
         if (value >= (short)0 && value <= (short)3) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..3]].", value));
     }
    
    public LteRanPhyMbsfnBuilder setNeighCellConfig(final java.lang.Short value) {
    if (value != null) {
        checkNeighCellConfigRange(value);
    }
        this._neighCellConfig = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSFCONFIGLISTNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSFCONFIGLISTNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkSfConfigListNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSFCONFIGLISTNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSFCONFIGLISTNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public LteRanPhyMbsfnBuilder setSfConfigListNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkSfConfigListNumberOfEntriesRange(value);
    }
        this._sfConfigListNumberOfEntries = value;
        return this;
    }
    
    public LteRanPhyMbsfnBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanPhyMbsfnBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanPhyMbsfn build() {
        return new LteRanPhyMbsfnImpl(this);
    }

    private static final class LteRanPhyMbsfnImpl implements LteRanPhyMbsfn {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn.class;
        }

        private final List<LteRanPhyMbsfnSfConfigList> _lteRanPhyMbsfnSfConfigList;
        private final BigInteger _maxSfConfigListEntries;
        private final java.lang.Short _neighCellConfig;
        private final BigInteger _sfConfigListNumberOfEntries;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>> augmentation = Collections.emptyMap();

        private LteRanPhyMbsfnImpl(LteRanPhyMbsfnBuilder base) {
            this._lteRanPhyMbsfnSfConfigList = base.getLteRanPhyMbsfnSfConfigList();
            this._maxSfConfigListEntries = base.getMaxSfConfigListEntries();
            this._neighCellConfig = base.getNeighCellConfig();
            this._sfConfigListNumberOfEntries = base.getSfConfigListNumberOfEntries();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<LteRanPhyMbsfnSfConfigList> getLteRanPhyMbsfnSfConfigList() {
            return _lteRanPhyMbsfnSfConfigList;
        }
        
        @Override
        public BigInteger getMaxSfConfigListEntries() {
            return _maxSfConfigListEntries;
        }
        
        @Override
        public java.lang.Short getNeighCellConfig() {
            return _neighCellConfig;
        }
        
        @Override
        public BigInteger getSfConfigListNumberOfEntries() {
            return _sfConfigListNumberOfEntries;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lteRanPhyMbsfnSfConfigList);
            result = prime * result + Objects.hashCode(_maxSfConfigListEntries);
            result = prime * result + Objects.hashCode(_neighCellConfig);
            result = prime * result + Objects.hashCode(_sfConfigListNumberOfEntries);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn)obj;
            if (!Objects.equals(_lteRanPhyMbsfnSfConfigList, other.getLteRanPhyMbsfnSfConfigList())) {
                return false;
            }
            if (!Objects.equals(_maxSfConfigListEntries, other.getMaxSfConfigListEntries())) {
                return false;
            }
            if (!Objects.equals(_neighCellConfig, other.getNeighCellConfig())) {
                return false;
            }
            if (!Objects.equals(_sfConfigListNumberOfEntries, other.getSfConfigListNumberOfEntries())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanPhyMbsfnImpl otherImpl = (LteRanPhyMbsfnImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanPhyMbsfn [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_lteRanPhyMbsfnSfConfigList != null) {
                builder.append("_lteRanPhyMbsfnSfConfigList=");
                builder.append(_lteRanPhyMbsfnSfConfigList);
                builder.append(", ");
            }
            if (_maxSfConfigListEntries != null) {
                builder.append("_maxSfConfigListEntries=");
                builder.append(_maxSfConfigListEntries);
                builder.append(", ");
            }
            if (_neighCellConfig != null) {
                builder.append("_neighCellConfig=");
                builder.append(_neighCellConfig);
                builder.append(", ");
            }
            if (_sfConfigListNumberOfEntries != null) {
                builder.append("_sfConfigListNumberOfEntries=");
                builder.append(_sfConfigListNumberOfEntries);
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
