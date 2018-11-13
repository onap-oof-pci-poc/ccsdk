package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList
 *
 */
public class TransmissionModeListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList> {

    private java.lang.Byte _amDownshiftLevel;
    private java.lang.Byte _amUpshiftLevel;
    private java.lang.Integer _channelBandwidth;
    private java.lang.Byte _codeRate;
    private TransmissionModeListKey _key;
    private java.lang.Short _modulationScheme;
    private java.lang.Short _rxThreshold;
    private UniversalId _transmissionModeId;
    private java.lang.Byte _txPowerMax;
    private java.lang.Byte _txPowerMin;
    private java.lang.Boolean _xpicIsAvail;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>> augmentation = Collections.emptyMap();

    public TransmissionModeListBuilder() {
    }
    public TransmissionModeListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG arg) {
        this._transmissionModeId = arg.getTransmissionModeId();
        this._channelBandwidth = arg.getChannelBandwidth();
        this._modulationScheme = arg.getModulationScheme();
        this._codeRate = arg.getCodeRate();
        this._txPowerMin = arg.getTxPowerMin();
        this._txPowerMax = arg.getTxPowerMax();
        this._rxThreshold = arg.getRxThreshold();
        this._amUpshiftLevel = arg.getAmUpshiftLevel();
        this._amDownshiftLevel = arg.getAmDownshiftLevel();
        this._xpicIsAvail = arg.isXpicIsAvail();
    }

    public TransmissionModeListBuilder(TransmissionModeList base) {
        if (base.getKey() == null) {
            this._key = new TransmissionModeListKey(
                base.getTransmissionModeId()
            );
            this._transmissionModeId = base.getTransmissionModeId();
        } else {
            this._key = base.getKey();
            this._transmissionModeId = _key.getTransmissionModeId();
        }
        this._amDownshiftLevel = base.getAmDownshiftLevel();
        this._amUpshiftLevel = base.getAmUpshiftLevel();
        this._channelBandwidth = base.getChannelBandwidth();
        this._codeRate = base.getCodeRate();
        this._modulationScheme = base.getModulationScheme();
        this._rxThreshold = base.getRxThreshold();
        this._txPowerMax = base.getTxPowerMax();
        this._txPowerMin = base.getTxPowerMin();
        this._xpicIsAvail = base.isXpicIsAvail();
        if (base instanceof TransmissionModeListImpl) {
            TransmissionModeListImpl impl = (TransmissionModeListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG) {
            this._transmissionModeId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG)arg).getTransmissionModeId();
            this._channelBandwidth = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG)arg).getChannelBandwidth();
            this._modulationScheme = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG)arg).getModulationScheme();
            this._codeRate = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG)arg).getCodeRate();
            this._txPowerMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG)arg).getTxPowerMin();
            this._txPowerMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG)arg).getTxPowerMax();
            this._rxThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG)arg).getRxThreshold();
            this._amUpshiftLevel = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG)arg).getAmUpshiftLevel();
            this._amDownshiftLevel = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG)arg).getAmDownshiftLevel();
            this._xpicIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG)arg).isXpicIsAvail();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TransmissionModeTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Byte getAmDownshiftLevel() {
        return _amDownshiftLevel;
    }
    
    public java.lang.Byte getAmUpshiftLevel() {
        return _amUpshiftLevel;
    }
    
    public java.lang.Integer getChannelBandwidth() {
        return _channelBandwidth;
    }
    
    public java.lang.Byte getCodeRate() {
        return _codeRate;
    }
    
    public TransmissionModeListKey getKey() {
        return _key;
    }
    
    public java.lang.Short getModulationScheme() {
        return _modulationScheme;
    }
    
    public java.lang.Short getRxThreshold() {
        return _rxThreshold;
    }
    
    public UniversalId getTransmissionModeId() {
        return _transmissionModeId;
    }
    
    public java.lang.Byte getTxPowerMax() {
        return _txPowerMax;
    }
    
    public java.lang.Byte getTxPowerMin() {
        return _txPowerMin;
    }
    
    public java.lang.Boolean isXpicIsAvail() {
        return _xpicIsAvail;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TransmissionModeListBuilder setAmDownshiftLevel(final java.lang.Byte value) {
        this._amDownshiftLevel = value;
        return this;
    }
    
     
    public TransmissionModeListBuilder setAmUpshiftLevel(final java.lang.Byte value) {
        this._amUpshiftLevel = value;
        return this;
    }
    
     
    public TransmissionModeListBuilder setChannelBandwidth(final java.lang.Integer value) {
        this._channelBandwidth = value;
        return this;
    }
    
     
    public TransmissionModeListBuilder setCodeRate(final java.lang.Byte value) {
        this._codeRate = value;
        return this;
    }
    
     
    public TransmissionModeListBuilder setKey(final TransmissionModeListKey value) {
        this._key = value;
        return this;
    }
    
     
    public TransmissionModeListBuilder setModulationScheme(final java.lang.Short value) {
        this._modulationScheme = value;
        return this;
    }
    
     
    public TransmissionModeListBuilder setRxThreshold(final java.lang.Short value) {
        this._rxThreshold = value;
        return this;
    }
    
     
    public TransmissionModeListBuilder setTransmissionModeId(final UniversalId value) {
        this._transmissionModeId = value;
        return this;
    }
    
     
    public TransmissionModeListBuilder setTxPowerMax(final java.lang.Byte value) {
        this._txPowerMax = value;
        return this;
    }
    
     
    public TransmissionModeListBuilder setTxPowerMin(final java.lang.Byte value) {
        this._txPowerMin = value;
        return this;
    }
    
     
    public TransmissionModeListBuilder setXpicIsAvail(final java.lang.Boolean value) {
        this._xpicIsAvail = value;
        return this;
    }
    
    public TransmissionModeListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TransmissionModeListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TransmissionModeList build() {
        return new TransmissionModeListImpl(this);
    }

    private static final class TransmissionModeListImpl implements TransmissionModeList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList.class;
        }

        private final java.lang.Byte _amDownshiftLevel;
        private final java.lang.Byte _amUpshiftLevel;
        private final java.lang.Integer _channelBandwidth;
        private final java.lang.Byte _codeRate;
        private final TransmissionModeListKey _key;
        private final java.lang.Short _modulationScheme;
        private final java.lang.Short _rxThreshold;
        private final UniversalId _transmissionModeId;
        private final java.lang.Byte _txPowerMax;
        private final java.lang.Byte _txPowerMin;
        private final java.lang.Boolean _xpicIsAvail;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>> augmentation = Collections.emptyMap();

        private TransmissionModeListImpl(TransmissionModeListBuilder base) {
            if (base.getKey() == null) {
                this._key = new TransmissionModeListKey(
                    base.getTransmissionModeId()
                );
                this._transmissionModeId = base.getTransmissionModeId();
            } else {
                this._key = base.getKey();
                this._transmissionModeId = _key.getTransmissionModeId();
            }
            this._amDownshiftLevel = base.getAmDownshiftLevel();
            this._amUpshiftLevel = base.getAmUpshiftLevel();
            this._channelBandwidth = base.getChannelBandwidth();
            this._codeRate = base.getCodeRate();
            this._modulationScheme = base.getModulationScheme();
            this._rxThreshold = base.getRxThreshold();
            this._txPowerMax = base.getTxPowerMax();
            this._txPowerMin = base.getTxPowerMin();
            this._xpicIsAvail = base.isXpicIsAvail();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Byte getAmDownshiftLevel() {
            return _amDownshiftLevel;
        }
        
        @Override
        public java.lang.Byte getAmUpshiftLevel() {
            return _amUpshiftLevel;
        }
        
        @Override
        public java.lang.Integer getChannelBandwidth() {
            return _channelBandwidth;
        }
        
        @Override
        public java.lang.Byte getCodeRate() {
            return _codeRate;
        }
        
        @Override
        public TransmissionModeListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Short getModulationScheme() {
            return _modulationScheme;
        }
        
        @Override
        public java.lang.Short getRxThreshold() {
            return _rxThreshold;
        }
        
        @Override
        public UniversalId getTransmissionModeId() {
            return _transmissionModeId;
        }
        
        @Override
        public java.lang.Byte getTxPowerMax() {
            return _txPowerMax;
        }
        
        @Override
        public java.lang.Byte getTxPowerMin() {
            return _txPowerMin;
        }
        
        @Override
        public java.lang.Boolean isXpicIsAvail() {
            return _xpicIsAvail;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_amDownshiftLevel);
            result = prime * result + Objects.hashCode(_amUpshiftLevel);
            result = prime * result + Objects.hashCode(_channelBandwidth);
            result = prime * result + Objects.hashCode(_codeRate);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_modulationScheme);
            result = prime * result + Objects.hashCode(_rxThreshold);
            result = prime * result + Objects.hashCode(_transmissionModeId);
            result = prime * result + Objects.hashCode(_txPowerMax);
            result = prime * result + Objects.hashCode(_txPowerMin);
            result = prime * result + Objects.hashCode(_xpicIsAvail);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList)obj;
            if (!Objects.equals(_amDownshiftLevel, other.getAmDownshiftLevel())) {
                return false;
            }
            if (!Objects.equals(_amUpshiftLevel, other.getAmUpshiftLevel())) {
                return false;
            }
            if (!Objects.equals(_channelBandwidth, other.getChannelBandwidth())) {
                return false;
            }
            if (!Objects.equals(_codeRate, other.getCodeRate())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_modulationScheme, other.getModulationScheme())) {
                return false;
            }
            if (!Objects.equals(_rxThreshold, other.getRxThreshold())) {
                return false;
            }
            if (!Objects.equals(_transmissionModeId, other.getTransmissionModeId())) {
                return false;
            }
            if (!Objects.equals(_txPowerMax, other.getTxPowerMax())) {
                return false;
            }
            if (!Objects.equals(_txPowerMin, other.getTxPowerMin())) {
                return false;
            }
            if (!Objects.equals(_xpicIsAvail, other.isXpicIsAvail())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TransmissionModeListImpl otherImpl = (TransmissionModeListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TransmissionModeList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_amDownshiftLevel != null) {
                builder.append("_amDownshiftLevel=");
                builder.append(_amDownshiftLevel);
                builder.append(", ");
            }
            if (_amUpshiftLevel != null) {
                builder.append("_amUpshiftLevel=");
                builder.append(_amUpshiftLevel);
                builder.append(", ");
            }
            if (_channelBandwidth != null) {
                builder.append("_channelBandwidth=");
                builder.append(_channelBandwidth);
                builder.append(", ");
            }
            if (_codeRate != null) {
                builder.append("_codeRate=");
                builder.append(_codeRate);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_modulationScheme != null) {
                builder.append("_modulationScheme=");
                builder.append(_modulationScheme);
                builder.append(", ");
            }
            if (_rxThreshold != null) {
                builder.append("_rxThreshold=");
                builder.append(_rxThreshold);
                builder.append(", ");
            }
            if (_transmissionModeId != null) {
                builder.append("_transmissionModeId=");
                builder.append(_transmissionModeId);
                builder.append(", ");
            }
            if (_txPowerMax != null) {
                builder.append("_txPowerMax=");
                builder.append(_txPowerMax);
                builder.append(", ");
            }
            if (_txPowerMin != null) {
                builder.append("_txPowerMin=");
                builder.append(_txPowerMin);
                builder.append(", ");
            }
            if (_xpicIsAvail != null) {
                builder.append("_xpicIsAvail=");
                builder.append(_xpicIsAvail);
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
