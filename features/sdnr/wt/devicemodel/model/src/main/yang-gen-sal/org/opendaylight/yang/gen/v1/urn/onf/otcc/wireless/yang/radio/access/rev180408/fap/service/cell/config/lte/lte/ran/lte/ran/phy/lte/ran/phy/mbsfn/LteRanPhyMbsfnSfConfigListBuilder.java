package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList
 *
 */
public class LteRanPhyMbsfnSfConfigListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList> {

    private java.lang.String _alias;
    private LteRanPhyMbsfnSfConfigListKey _key;
    private java.lang.Short _radioFrameAllocationPeriod;
    private java.lang.Short _radioFrameAllocationSize;
    private java.lang.Short _radioframeAllocationOffset;
    private List<java.lang.Short> _subFrameAllocations;
    private java.lang.Short _syncStratumId;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>> augmentation = Collections.emptyMap();

    public LteRanPhyMbsfnSfConfigListBuilder() {
    }
    public LteRanPhyMbsfnSfConfigListBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._syncStratumId = arg.getSyncStratumId();
        this._radioFrameAllocationPeriod = arg.getRadioFrameAllocationPeriod();
        this._radioframeAllocationOffset = arg.getRadioframeAllocationOffset();
        this._radioFrameAllocationSize = arg.getRadioFrameAllocationSize();
        this._subFrameAllocations = arg.getSubFrameAllocations();
    }

    public LteRanPhyMbsfnSfConfigListBuilder(LteRanPhyMbsfnSfConfigList base) {
        if (base.getKey() == null) {
            this._key = new LteRanPhyMbsfnSfConfigListKey(
                base.getRadioFrameAllocationPeriod(), 
                base.getRadioFrameAllocationSize(), 
                base.getRadioframeAllocationOffset()
            );
            this._radioFrameAllocationPeriod = base.getRadioFrameAllocationPeriod();
            this._radioFrameAllocationSize = base.getRadioFrameAllocationSize();
            this._radioframeAllocationOffset = base.getRadioframeAllocationOffset();
        } else {
            this._key = base.getKey();
            this._radioFrameAllocationPeriod = _key.getRadioFrameAllocationPeriod();
            this._radioFrameAllocationSize = _key.getRadioFrameAllocationSize();
            this._radioframeAllocationOffset = _key.getRadioframeAllocationOffset();
        }
        this._alias = base.getAlias();
        this._subFrameAllocations = base.getSubFrameAllocations();
        this._syncStratumId = base.getSyncStratumId();
        this._enable = base.isEnable();
        if (base instanceof LteRanPhyMbsfnSfConfigListImpl) {
            LteRanPhyMbsfnSfConfigListImpl impl = (LteRanPhyMbsfnSfConfigListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG)arg).getAlias();
            this._syncStratumId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG)arg).getSyncStratumId();
            this._radioFrameAllocationPeriod = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG)arg).getRadioFrameAllocationPeriod();
            this._radioframeAllocationOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG)arg).getRadioframeAllocationOffset();
            this._radioFrameAllocationSize = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG)arg).getRadioFrameAllocationSize();
            this._subFrameAllocations = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG)arg).getSubFrameAllocations();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public LteRanPhyMbsfnSfConfigListKey getKey() {
        return _key;
    }
    
    public java.lang.Short getRadioFrameAllocationPeriod() {
        return _radioFrameAllocationPeriod;
    }
    
    public java.lang.Short getRadioFrameAllocationSize() {
        return _radioFrameAllocationSize;
    }
    
    public java.lang.Short getRadioframeAllocationOffset() {
        return _radioframeAllocationOffset;
    }
    
    public List<java.lang.Short> getSubFrameAllocations() {
        return _subFrameAllocations;
    }
    
    public java.lang.Short getSyncStratumId() {
        return _syncStratumId;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_aliasLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..64]].", value));
     }
    
    public LteRanPhyMbsfnSfConfigListBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public LteRanPhyMbsfnSfConfigListBuilder setKey(final LteRanPhyMbsfnSfConfigListKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkRadioFrameAllocationPeriodRange(final short value) {
         if (value >= (short)1 && value <= (short)2) {
             return;
         }
         if (value >= (short)4 && value <= (short)4) {
             return;
         }
         if (value >= (short)8 && value <= (short)8) {
             return;
         }
         if (value >= (short)16 && value <= (short)16) {
             return;
         }
         if (value >= (short)32 && value <= (short)32) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..2], [4..4], [8..8], [16..16], [32..32]].", value));
     }
    
    public LteRanPhyMbsfnSfConfigListBuilder setRadioFrameAllocationPeriod(final java.lang.Short value) {
    if (value != null) {
        checkRadioFrameAllocationPeriodRange(value);
    }
        this._radioFrameAllocationPeriod = value;
        return this;
    }
    
     
     private static void checkRadioFrameAllocationSizeRange(final short value) {
         if (value >= (short)1 && value <= (short)1) {
             return;
         }
         if (value >= (short)4 && value <= (short)4) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..1], [4..4]].", value));
     }
    
    public LteRanPhyMbsfnSfConfigListBuilder setRadioFrameAllocationSize(final java.lang.Short value) {
    if (value != null) {
        checkRadioFrameAllocationSizeRange(value);
    }
        this._radioFrameAllocationSize = value;
        return this;
    }
    
     
     private static void checkRadioframeAllocationOffsetRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public LteRanPhyMbsfnSfConfigListBuilder setRadioframeAllocationOffset(final java.lang.Short value) {
    if (value != null) {
        checkRadioframeAllocationOffsetRange(value);
    }
        this._radioframeAllocationOffset = value;
        return this;
    }
    
     
    public LteRanPhyMbsfnSfConfigListBuilder setSubFrameAllocations(final List<java.lang.Short> value) {
        this._subFrameAllocations = value;
        return this;
    }
    
     
     private static void checkSyncStratumIdRange(final short value) {
         if (value >= (short)1 && value <= (short)8) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..8]].", value));
     }
    
    public LteRanPhyMbsfnSfConfigListBuilder setSyncStratumId(final java.lang.Short value) {
    if (value != null) {
        checkSyncStratumIdRange(value);
    }
        this._syncStratumId = value;
        return this;
    }
    
     
    public LteRanPhyMbsfnSfConfigListBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public LteRanPhyMbsfnSfConfigListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanPhyMbsfnSfConfigListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanPhyMbsfnSfConfigList build() {
        return new LteRanPhyMbsfnSfConfigListImpl(this);
    }

    private static final class LteRanPhyMbsfnSfConfigListImpl implements LteRanPhyMbsfnSfConfigList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList.class;
        }

        private final java.lang.String _alias;
        private final LteRanPhyMbsfnSfConfigListKey _key;
        private final java.lang.Short _radioFrameAllocationPeriod;
        private final java.lang.Short _radioFrameAllocationSize;
        private final java.lang.Short _radioframeAllocationOffset;
        private final List<java.lang.Short> _subFrameAllocations;
        private final java.lang.Short _syncStratumId;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>> augmentation = Collections.emptyMap();

        private LteRanPhyMbsfnSfConfigListImpl(LteRanPhyMbsfnSfConfigListBuilder base) {
            if (base.getKey() == null) {
                this._key = new LteRanPhyMbsfnSfConfigListKey(
                    base.getRadioFrameAllocationPeriod(), 
                    base.getRadioFrameAllocationSize(), 
                    base.getRadioframeAllocationOffset()
                );
                this._radioFrameAllocationPeriod = base.getRadioFrameAllocationPeriod();
                this._radioFrameAllocationSize = base.getRadioFrameAllocationSize();
                this._radioframeAllocationOffset = base.getRadioframeAllocationOffset();
            } else {
                this._key = base.getKey();
                this._radioFrameAllocationPeriod = _key.getRadioFrameAllocationPeriod();
                this._radioFrameAllocationSize = _key.getRadioFrameAllocationSize();
                this._radioframeAllocationOffset = _key.getRadioframeAllocationOffset();
            }
            this._alias = base.getAlias();
            this._subFrameAllocations = base.getSubFrameAllocations();
            this._syncStratumId = base.getSyncStratumId();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAlias() {
            return _alias;
        }
        
        @Override
        public LteRanPhyMbsfnSfConfigListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Short getRadioFrameAllocationPeriod() {
            return _radioFrameAllocationPeriod;
        }
        
        @Override
        public java.lang.Short getRadioFrameAllocationSize() {
            return _radioFrameAllocationSize;
        }
        
        @Override
        public java.lang.Short getRadioframeAllocationOffset() {
            return _radioframeAllocationOffset;
        }
        
        @Override
        public List<java.lang.Short> getSubFrameAllocations() {
            return _subFrameAllocations;
        }
        
        @Override
        public java.lang.Short getSyncStratumId() {
            return _syncStratumId;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_alias);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_radioFrameAllocationPeriod);
            result = prime * result + Objects.hashCode(_radioFrameAllocationSize);
            result = prime * result + Objects.hashCode(_radioframeAllocationOffset);
            result = prime * result + Objects.hashCode(_subFrameAllocations);
            result = prime * result + Objects.hashCode(_syncStratumId);
            result = prime * result + Objects.hashCode(_enable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_radioFrameAllocationPeriod, other.getRadioFrameAllocationPeriod())) {
                return false;
            }
            if (!Objects.equals(_radioFrameAllocationSize, other.getRadioFrameAllocationSize())) {
                return false;
            }
            if (!Objects.equals(_radioframeAllocationOffset, other.getRadioframeAllocationOffset())) {
                return false;
            }
            if (!Objects.equals(_subFrameAllocations, other.getSubFrameAllocations())) {
                return false;
            }
            if (!Objects.equals(_syncStratumId, other.getSyncStratumId())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanPhyMbsfnSfConfigListImpl otherImpl = (LteRanPhyMbsfnSfConfigListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanPhyMbsfnSfConfigList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_radioFrameAllocationPeriod != null) {
                builder.append("_radioFrameAllocationPeriod=");
                builder.append(_radioFrameAllocationPeriod);
                builder.append(", ");
            }
            if (_radioFrameAllocationSize != null) {
                builder.append("_radioFrameAllocationSize=");
                builder.append(_radioFrameAllocationSize);
                builder.append(", ");
            }
            if (_radioframeAllocationOffset != null) {
                builder.append("_radioframeAllocationOffset=");
                builder.append(_radioframeAllocationOffset);
                builder.append(", ");
            }
            if (_subFrameAllocations != null) {
                builder.append("_subFrameAllocations=");
                builder.append(_subFrameAllocations);
                builder.append(", ");
            }
            if (_syncStratumId != null) {
                builder.append("_syncStratumId=");
                builder.append(_syncStratumId);
                builder.append(", ");
            }
            if (_enable != null) {
                builder.append("_enable=");
                builder.append(_enable);
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
