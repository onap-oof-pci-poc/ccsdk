package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList
 *
 */
public class Cdma2000BeaconHrpdBeaconListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList> {

    private java.lang.String _alias;
    private java.lang.Short _beaconBandClass;
    private java.lang.Integer _beaconChannelFreq;
    private java.lang.Long _beaconIndex;
    private List<java.lang.String> _beaconPnOffset;
    private java.lang.Integer _cCoffset;
    private java.lang.Integer _duration;
    private Cdma2000BeaconHrpdBeaconListKey _key;
    private java.lang.Short _numCCcycles;
    private java.lang.Long _offset;
    private java.lang.Long _txPower;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>> augmentation = Collections.emptyMap();

    public Cdma2000BeaconHrpdBeaconListBuilder() {
    }
    public Cdma2000BeaconHrpdBeaconListBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._beaconIndex = arg.getBeaconIndex();
        this._cCoffset = arg.getCCoffset();
        this._offset = arg.getOffset();
        this._duration = arg.getDuration();
        this._numCCcycles = arg.getNumCCcycles();
        this._beaconBandClass = arg.getBeaconBandClass();
        this._beaconChannelFreq = arg.getBeaconChannelFreq();
        this._beaconPnOffset = arg.getBeaconPnOffset();
        this._txPower = arg.getTxPower();
    }

    public Cdma2000BeaconHrpdBeaconListBuilder(Cdma2000BeaconHrpdBeaconList base) {
        if (base.getKey() == null) {
            this._key = new Cdma2000BeaconHrpdBeaconListKey(
                base.getBeaconIndex()
            );
            this._beaconIndex = base.getBeaconIndex();
        } else {
            this._key = base.getKey();
            this._beaconIndex = _key.getBeaconIndex();
        }
        this._alias = base.getAlias();
        this._beaconBandClass = base.getBeaconBandClass();
        this._beaconChannelFreq = base.getBeaconChannelFreq();
        this._beaconPnOffset = base.getBeaconPnOffset();
        this._cCoffset = base.getCCoffset();
        this._duration = base.getDuration();
        this._numCCcycles = base.getNumCCcycles();
        this._offset = base.getOffset();
        this._txPower = base.getTxPower();
        this._enable = base.isEnable();
        if (base instanceof Cdma2000BeaconHrpdBeaconListImpl) {
            Cdma2000BeaconHrpdBeaconListImpl impl = (Cdma2000BeaconHrpdBeaconListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).getAlias();
            this._beaconIndex = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).getBeaconIndex();
            this._cCoffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).getCCoffset();
            this._offset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).getOffset();
            this._duration = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).getDuration();
            this._numCCcycles = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).getNumCCcycles();
            this._beaconBandClass = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).getBeaconBandClass();
            this._beaconChannelFreq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).getBeaconChannelFreq();
            this._beaconPnOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).getBeaconPnOffset();
            this._txPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG)arg).getTxPower();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconHrpdBeaconListG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.Short getBeaconBandClass() {
        return _beaconBandClass;
    }
    
    public java.lang.Integer getBeaconChannelFreq() {
        return _beaconChannelFreq;
    }
    
    public java.lang.Long getBeaconIndex() {
        return _beaconIndex;
    }
    
    public List<java.lang.String> getBeaconPnOffset() {
        return _beaconPnOffset;
    }
    
    public java.lang.Integer getCCoffset() {
        return _cCoffset;
    }
    
    public java.lang.Integer getDuration() {
        return _duration;
    }
    
    public Cdma2000BeaconHrpdBeaconListKey getKey() {
        return _key;
    }
    
    public java.lang.Short getNumCCcycles() {
        return _numCCcycles;
    }
    
    public java.lang.Long getOffset() {
        return _offset;
    }
    
    public java.lang.Long getTxPower() {
        return _txPower;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public Cdma2000BeaconHrpdBeaconListBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
     private static void checkBeaconBandClassRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public Cdma2000BeaconHrpdBeaconListBuilder setBeaconBandClass(final java.lang.Short value) {
    if (value != null) {
        checkBeaconBandClassRange(value);
    }
        this._beaconBandClass = value;
        return this;
    }
    
     
     private static void checkBeaconChannelFreqRange(final int value) {
         if (value >= 0 && value <= 2016) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..2016]].", value));
     }
    
    public Cdma2000BeaconHrpdBeaconListBuilder setBeaconChannelFreq(final java.lang.Integer value) {
    if (value != null) {
        checkBeaconChannelFreqRange(value);
    }
        this._beaconChannelFreq = value;
        return this;
    }
    
     
    public Cdma2000BeaconHrpdBeaconListBuilder setBeaconIndex(final java.lang.Long value) {
        this._beaconIndex = value;
        return this;
    }
    
     
    public Cdma2000BeaconHrpdBeaconListBuilder setBeaconPnOffset(final List<java.lang.String> value) {
        this._beaconPnOffset = value;
        return this;
    }
    
     
     private static void checkCCoffsetRange(final int value) {
         if (value >= 0 && value <= 2048) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..2048]].", value));
     }
    
    public Cdma2000BeaconHrpdBeaconListBuilder setCCoffset(final java.lang.Integer value) {
    if (value != null) {
        checkCCoffsetRange(value);
    }
        this._cCoffset = value;
        return this;
    }
    
     
     private static void checkDurationRange(final int value) {
         if (value >= 0 && value <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..256]].", value));
     }
    
    public Cdma2000BeaconHrpdBeaconListBuilder setDuration(final java.lang.Integer value) {
    if (value != null) {
        checkDurationRange(value);
    }
        this._duration = value;
        return this;
    }
    
     
    public Cdma2000BeaconHrpdBeaconListBuilder setKey(final Cdma2000BeaconHrpdBeaconListKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkNumCCcyclesRange(final short value) {
         if (value >= (short)0 && value <= (short)48) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..48]].", value));
     }
    
    public Cdma2000BeaconHrpdBeaconListBuilder setNumCCcycles(final java.lang.Short value) {
    if (value != null) {
        checkNumCCcyclesRange(value);
    }
        this._numCCcycles = value;
        return this;
    }
    
     
    public Cdma2000BeaconHrpdBeaconListBuilder setOffset(final java.lang.Long value) {
        this._offset = value;
        return this;
    }
    
     
    public Cdma2000BeaconHrpdBeaconListBuilder setTxPower(final java.lang.Long value) {
        this._txPower = value;
        return this;
    }
    
     
    public Cdma2000BeaconHrpdBeaconListBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public Cdma2000BeaconHrpdBeaconListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000BeaconHrpdBeaconListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000BeaconHrpdBeaconList build() {
        return new Cdma2000BeaconHrpdBeaconListImpl(this);
    }

    private static final class Cdma2000BeaconHrpdBeaconListImpl implements Cdma2000BeaconHrpdBeaconList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList.class;
        }

        private final java.lang.String _alias;
        private final java.lang.Short _beaconBandClass;
        private final java.lang.Integer _beaconChannelFreq;
        private final java.lang.Long _beaconIndex;
        private final List<java.lang.String> _beaconPnOffset;
        private final java.lang.Integer _cCoffset;
        private final java.lang.Integer _duration;
        private final Cdma2000BeaconHrpdBeaconListKey _key;
        private final java.lang.Short _numCCcycles;
        private final java.lang.Long _offset;
        private final java.lang.Long _txPower;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>> augmentation = Collections.emptyMap();

        private Cdma2000BeaconHrpdBeaconListImpl(Cdma2000BeaconHrpdBeaconListBuilder base) {
            if (base.getKey() == null) {
                this._key = new Cdma2000BeaconHrpdBeaconListKey(
                    base.getBeaconIndex()
                );
                this._beaconIndex = base.getBeaconIndex();
            } else {
                this._key = base.getKey();
                this._beaconIndex = _key.getBeaconIndex();
            }
            this._alias = base.getAlias();
            this._beaconBandClass = base.getBeaconBandClass();
            this._beaconChannelFreq = base.getBeaconChannelFreq();
            this._beaconPnOffset = base.getBeaconPnOffset();
            this._cCoffset = base.getCCoffset();
            this._duration = base.getDuration();
            this._numCCcycles = base.getNumCCcycles();
            this._offset = base.getOffset();
            this._txPower = base.getTxPower();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Short getBeaconBandClass() {
            return _beaconBandClass;
        }
        
        @Override
        public java.lang.Integer getBeaconChannelFreq() {
            return _beaconChannelFreq;
        }
        
        @Override
        public java.lang.Long getBeaconIndex() {
            return _beaconIndex;
        }
        
        @Override
        public List<java.lang.String> getBeaconPnOffset() {
            return _beaconPnOffset;
        }
        
        @Override
        public java.lang.Integer getCCoffset() {
            return _cCoffset;
        }
        
        @Override
        public java.lang.Integer getDuration() {
            return _duration;
        }
        
        @Override
        public Cdma2000BeaconHrpdBeaconListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Short getNumCCcycles() {
            return _numCCcycles;
        }
        
        @Override
        public java.lang.Long getOffset() {
            return _offset;
        }
        
        @Override
        public java.lang.Long getTxPower() {
            return _txPower;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_beaconBandClass);
            result = prime * result + Objects.hashCode(_beaconChannelFreq);
            result = prime * result + Objects.hashCode(_beaconIndex);
            result = prime * result + Objects.hashCode(_beaconPnOffset);
            result = prime * result + Objects.hashCode(_cCoffset);
            result = prime * result + Objects.hashCode(_duration);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_numCCcycles);
            result = prime * result + Objects.hashCode(_offset);
            result = prime * result + Objects.hashCode(_txPower);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_beaconBandClass, other.getBeaconBandClass())) {
                return false;
            }
            if (!Objects.equals(_beaconChannelFreq, other.getBeaconChannelFreq())) {
                return false;
            }
            if (!Objects.equals(_beaconIndex, other.getBeaconIndex())) {
                return false;
            }
            if (!Objects.equals(_beaconPnOffset, other.getBeaconPnOffset())) {
                return false;
            }
            if (!Objects.equals(_cCoffset, other.getCCoffset())) {
                return false;
            }
            if (!Objects.equals(_duration, other.getDuration())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_numCCcycles, other.getNumCCcycles())) {
                return false;
            }
            if (!Objects.equals(_offset, other.getOffset())) {
                return false;
            }
            if (!Objects.equals(_txPower, other.getTxPower())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000BeaconHrpdBeaconListImpl otherImpl = (Cdma2000BeaconHrpdBeaconListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000BeaconHrpdBeaconList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_beaconBandClass != null) {
                builder.append("_beaconBandClass=");
                builder.append(_beaconBandClass);
                builder.append(", ");
            }
            if (_beaconChannelFreq != null) {
                builder.append("_beaconChannelFreq=");
                builder.append(_beaconChannelFreq);
                builder.append(", ");
            }
            if (_beaconIndex != null) {
                builder.append("_beaconIndex=");
                builder.append(_beaconIndex);
                builder.append(", ");
            }
            if (_beaconPnOffset != null) {
                builder.append("_beaconPnOffset=");
                builder.append(_beaconPnOffset);
                builder.append(", ");
            }
            if (_cCoffset != null) {
                builder.append("_cCoffset=");
                builder.append(_cCoffset);
                builder.append(", ");
            }
            if (_duration != null) {
                builder.append("_duration=");
                builder.append(_duration);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_numCCcycles != null) {
                builder.append("_numCCcycles=");
                builder.append(_numCCcycles);
                builder.append(", ");
            }
            if (_offset != null) {
                builder.append("_offset=");
                builder.append(_offset);
                builder.append(", ");
            }
            if (_txPower != null) {
                builder.append("_txPower=");
                builder.append(_txPower);
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
