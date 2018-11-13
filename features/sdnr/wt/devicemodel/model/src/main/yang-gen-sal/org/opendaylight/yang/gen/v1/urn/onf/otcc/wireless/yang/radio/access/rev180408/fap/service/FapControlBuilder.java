package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlG.SelfConfigEvents;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlLte;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl
 *
 */
public class FapControlBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl> {

    private FapControlCdma2000 _fapControlCdma2000;
    private FapControlLte _fapControlLte;
    private FapControlUmts _fapControlUmts;
    private List<SelfConfigEvents> _selfConfigEvents;
    private java.lang.Boolean _enclosureTamperingDetected;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>> augmentation = Collections.emptyMap();

    public FapControlBuilder() {
    }
    public FapControlBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlG arg) {
        this._selfConfigEvents = arg.getSelfConfigEvents();
        this._enclosureTamperingDetected = arg.isEnclosureTamperingDetected();
    }

    public FapControlBuilder(FapControl base) {
        this._fapControlCdma2000 = base.getFapControlCdma2000();
        this._fapControlLte = base.getFapControlLte();
        this._fapControlUmts = base.getFapControlUmts();
        this._selfConfigEvents = base.getSelfConfigEvents();
        this._enclosureTamperingDetected = base.isEnclosureTamperingDetected();
        if (base instanceof FapControlImpl) {
            FapControlImpl impl = (FapControlImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlG) {
            this._selfConfigEvents = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlG)arg).getSelfConfigEvents();
            this._enclosureTamperingDetected = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlG)arg).isEnclosureTamperingDetected();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlG] \n" +
              "but was: " + arg
            );
        }
    }

    public FapControlCdma2000 getFapControlCdma2000() {
        return _fapControlCdma2000;
    }
    
    public FapControlLte getFapControlLte() {
        return _fapControlLte;
    }
    
    public FapControlUmts getFapControlUmts() {
        return _fapControlUmts;
    }
    
    public List<SelfConfigEvents> getSelfConfigEvents() {
        return _selfConfigEvents;
    }
    
    public java.lang.Boolean isEnclosureTamperingDetected() {
        return _enclosureTamperingDetected;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FapControlBuilder setFapControlCdma2000(final FapControlCdma2000 value) {
        this._fapControlCdma2000 = value;
        return this;
    }
    
     
    public FapControlBuilder setFapControlLte(final FapControlLte value) {
        this._fapControlLte = value;
        return this;
    }
    
     
    public FapControlBuilder setFapControlUmts(final FapControlUmts value) {
        this._fapControlUmts = value;
        return this;
    }
    
     
    public FapControlBuilder setSelfConfigEvents(final List<SelfConfigEvents> value) {
        this._selfConfigEvents = value;
        return this;
    }
    
     
    public FapControlBuilder setEnclosureTamperingDetected(final java.lang.Boolean value) {
        this._enclosureTamperingDetected = value;
        return this;
    }
    
    public FapControlBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControl build() {
        return new FapControlImpl(this);
    }

    private static final class FapControlImpl implements FapControl {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl.class;
        }

        private final FapControlCdma2000 _fapControlCdma2000;
        private final FapControlLte _fapControlLte;
        private final FapControlUmts _fapControlUmts;
        private final List<SelfConfigEvents> _selfConfigEvents;
        private final java.lang.Boolean _enclosureTamperingDetected;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>> augmentation = Collections.emptyMap();

        private FapControlImpl(FapControlBuilder base) {
            this._fapControlCdma2000 = base.getFapControlCdma2000();
            this._fapControlLte = base.getFapControlLte();
            this._fapControlUmts = base.getFapControlUmts();
            this._selfConfigEvents = base.getSelfConfigEvents();
            this._enclosureTamperingDetected = base.isEnclosureTamperingDetected();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public FapControlCdma2000 getFapControlCdma2000() {
            return _fapControlCdma2000;
        }
        
        @Override
        public FapControlLte getFapControlLte() {
            return _fapControlLte;
        }
        
        @Override
        public FapControlUmts getFapControlUmts() {
            return _fapControlUmts;
        }
        
        @Override
        public List<SelfConfigEvents> getSelfConfigEvents() {
            return _selfConfigEvents;
        }
        
        @Override
        public java.lang.Boolean isEnclosureTamperingDetected() {
            return _enclosureTamperingDetected;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fapControlCdma2000);
            result = prime * result + Objects.hashCode(_fapControlLte);
            result = prime * result + Objects.hashCode(_fapControlUmts);
            result = prime * result + Objects.hashCode(_selfConfigEvents);
            result = prime * result + Objects.hashCode(_enclosureTamperingDetected);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl)obj;
            if (!Objects.equals(_fapControlCdma2000, other.getFapControlCdma2000())) {
                return false;
            }
            if (!Objects.equals(_fapControlLte, other.getFapControlLte())) {
                return false;
            }
            if (!Objects.equals(_fapControlUmts, other.getFapControlUmts())) {
                return false;
            }
            if (!Objects.equals(_selfConfigEvents, other.getSelfConfigEvents())) {
                return false;
            }
            if (!Objects.equals(_enclosureTamperingDetected, other.isEnclosureTamperingDetected())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlImpl otherImpl = (FapControlImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControl [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_fapControlCdma2000 != null) {
                builder.append("_fapControlCdma2000=");
                builder.append(_fapControlCdma2000);
                builder.append(", ");
            }
            if (_fapControlLte != null) {
                builder.append("_fapControlLte=");
                builder.append(_fapControlLte);
                builder.append(", ");
            }
            if (_fapControlUmts != null) {
                builder.append("_fapControlUmts=");
                builder.append(_fapControlUmts);
                builder.append(", ");
            }
            if (_selfConfigEvents != null) {
                builder.append("_selfConfigEvents=");
                builder.append(_selfConfigEvents);
                builder.append(", ");
            }
            if (_enclosureTamperingDetected != null) {
                builder.append("_enclosureTamperingDetected=");
                builder.append(_enclosureTamperingDetected);
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
