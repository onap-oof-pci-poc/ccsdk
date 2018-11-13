package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs
 *
 */
public class LteRanPhySrsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs> {

    private List<java.lang.String> _srsBandwidthConfig;
    private java.lang.Boolean _ackNackSrsSimultaneousTransmission;
    private java.lang.Boolean _srsEnabled;
    private java.lang.Boolean _srsMaxUpPts;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>> augmentation = Collections.emptyMap();

    public LteRanPhySrsBuilder() {
    }
    public LteRanPhySrsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhySrsG arg) {
        this._srsEnabled = arg.isSrsEnabled();
        this._srsBandwidthConfig = arg.getSrsBandwidthConfig();
        this._srsMaxUpPts = arg.isSrsMaxUpPts();
        this._ackNackSrsSimultaneousTransmission = arg.isAckNackSrsSimultaneousTransmission();
    }

    public LteRanPhySrsBuilder(LteRanPhySrs base) {
        this._srsBandwidthConfig = base.getSrsBandwidthConfig();
        this._ackNackSrsSimultaneousTransmission = base.isAckNackSrsSimultaneousTransmission();
        this._srsEnabled = base.isSrsEnabled();
        this._srsMaxUpPts = base.isSrsMaxUpPts();
        if (base instanceof LteRanPhySrsImpl) {
            LteRanPhySrsImpl impl = (LteRanPhySrsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhySrsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhySrsG) {
            this._srsEnabled = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhySrsG)arg).isSrsEnabled();
            this._srsBandwidthConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhySrsG)arg).getSrsBandwidthConfig();
            this._srsMaxUpPts = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhySrsG)arg).isSrsMaxUpPts();
            this._ackNackSrsSimultaneousTransmission = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhySrsG)arg).isAckNackSrsSimultaneousTransmission();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhySrsG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getSrsBandwidthConfig() {
        return _srsBandwidthConfig;
    }
    
    public java.lang.Boolean isAckNackSrsSimultaneousTransmission() {
        return _ackNackSrsSimultaneousTransmission;
    }
    
    public java.lang.Boolean isSrsEnabled() {
        return _srsEnabled;
    }
    
    public java.lang.Boolean isSrsMaxUpPts() {
        return _srsMaxUpPts;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanPhySrsBuilder setSrsBandwidthConfig(final List<java.lang.String> value) {
        this._srsBandwidthConfig = value;
        return this;
    }
    
     
    public LteRanPhySrsBuilder setAckNackSrsSimultaneousTransmission(final java.lang.Boolean value) {
        this._ackNackSrsSimultaneousTransmission = value;
        return this;
    }
    
     
    public LteRanPhySrsBuilder setSrsEnabled(final java.lang.Boolean value) {
        this._srsEnabled = value;
        return this;
    }
    
     
    public LteRanPhySrsBuilder setSrsMaxUpPts(final java.lang.Boolean value) {
        this._srsMaxUpPts = value;
        return this;
    }
    
    public LteRanPhySrsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanPhySrsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanPhySrs build() {
        return new LteRanPhySrsImpl(this);
    }

    private static final class LteRanPhySrsImpl implements LteRanPhySrs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs.class;
        }

        private final List<java.lang.String> _srsBandwidthConfig;
        private final java.lang.Boolean _ackNackSrsSimultaneousTransmission;
        private final java.lang.Boolean _srsEnabled;
        private final java.lang.Boolean _srsMaxUpPts;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>> augmentation = Collections.emptyMap();

        private LteRanPhySrsImpl(LteRanPhySrsBuilder base) {
            this._srsBandwidthConfig = base.getSrsBandwidthConfig();
            this._ackNackSrsSimultaneousTransmission = base.isAckNackSrsSimultaneousTransmission();
            this._srsEnabled = base.isSrsEnabled();
            this._srsMaxUpPts = base.isSrsMaxUpPts();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getSrsBandwidthConfig() {
            return _srsBandwidthConfig;
        }
        
        @Override
        public java.lang.Boolean isAckNackSrsSimultaneousTransmission() {
            return _ackNackSrsSimultaneousTransmission;
        }
        
        @Override
        public java.lang.Boolean isSrsEnabled() {
            return _srsEnabled;
        }
        
        @Override
        public java.lang.Boolean isSrsMaxUpPts() {
            return _srsMaxUpPts;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_srsBandwidthConfig);
            result = prime * result + Objects.hashCode(_ackNackSrsSimultaneousTransmission);
            result = prime * result + Objects.hashCode(_srsEnabled);
            result = prime * result + Objects.hashCode(_srsMaxUpPts);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs)obj;
            if (!Objects.equals(_srsBandwidthConfig, other.getSrsBandwidthConfig())) {
                return false;
            }
            if (!Objects.equals(_ackNackSrsSimultaneousTransmission, other.isAckNackSrsSimultaneousTransmission())) {
                return false;
            }
            if (!Objects.equals(_srsEnabled, other.isSrsEnabled())) {
                return false;
            }
            if (!Objects.equals(_srsMaxUpPts, other.isSrsMaxUpPts())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanPhySrsImpl otherImpl = (LteRanPhySrsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanPhySrs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_srsBandwidthConfig != null) {
                builder.append("_srsBandwidthConfig=");
                builder.append(_srsBandwidthConfig);
                builder.append(", ");
            }
            if (_ackNackSrsSimultaneousTransmission != null) {
                builder.append("_ackNackSrsSimultaneousTransmission=");
                builder.append(_ackNackSrsSimultaneousTransmission);
                builder.append(", ");
            }
            if (_srsEnabled != null) {
                builder.append("_srsEnabled=");
                builder.append(_srsEnabled);
                builder.append(", ");
            }
            if (_srsMaxUpPts != null) {
                builder.append("_srsMaxUpPts=");
                builder.append(_srsMaxUpPts);
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
