package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff
 *
 */
public class Cdma2000OneXRanHardHandoffBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff> {

    private Cdma2000OneXRanHardHandoffStats _cdma2000OneXRanHardHandoffStats;
    private java.lang.Short _hoPilotDuration;
    private java.lang.Long _hoPilotPowerThresh;
    private java.lang.Boolean _handoutEnable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanHardHandoffBuilder() {
    }
    public Cdma2000OneXRanHardHandoffBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffG arg) {
        this._handoutEnable = arg.isHandoutEnable();
        this._hoPilotPowerThresh = arg.getHoPilotPowerThresh();
        this._hoPilotDuration = arg.getHoPilotDuration();
    }

    public Cdma2000OneXRanHardHandoffBuilder(Cdma2000OneXRanHardHandoff base) {
        this._cdma2000OneXRanHardHandoffStats = base.getCdma2000OneXRanHardHandoffStats();
        this._hoPilotDuration = base.getHoPilotDuration();
        this._hoPilotPowerThresh = base.getHoPilotPowerThresh();
        this._handoutEnable = base.isHandoutEnable();
        if (base instanceof Cdma2000OneXRanHardHandoffImpl) {
            Cdma2000OneXRanHardHandoffImpl impl = (Cdma2000OneXRanHardHandoffImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffG) {
            this._handoutEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffG)arg).isHandoutEnable();
            this._hoPilotPowerThresh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffG)arg).getHoPilotPowerThresh();
            this._hoPilotDuration = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffG)arg).getHoPilotDuration();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffG] \n" +
              "but was: " + arg
            );
        }
    }

    public Cdma2000OneXRanHardHandoffStats getCdma2000OneXRanHardHandoffStats() {
        return _cdma2000OneXRanHardHandoffStats;
    }
    
    public java.lang.Short getHoPilotDuration() {
        return _hoPilotDuration;
    }
    
    public java.lang.Long getHoPilotPowerThresh() {
        return _hoPilotPowerThresh;
    }
    
    public java.lang.Boolean isHandoutEnable() {
        return _handoutEnable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public Cdma2000OneXRanHardHandoffBuilder setCdma2000OneXRanHardHandoffStats(final Cdma2000OneXRanHardHandoffStats value) {
        this._cdma2000OneXRanHardHandoffStats = value;
        return this;
    }
    
     
     private static void checkHoPilotDurationRange(final short value) {
         if (value >= (short)20 && value <= (short)50) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[20..50]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffBuilder setHoPilotDuration(final java.lang.Short value) {
    if (value != null) {
        checkHoPilotDurationRange(value);
    }
        this._hoPilotDuration = value;
        return this;
    }
    
     
    public Cdma2000OneXRanHardHandoffBuilder setHoPilotPowerThresh(final java.lang.Long value) {
        this._hoPilotPowerThresh = value;
        return this;
    }
    
     
    public Cdma2000OneXRanHardHandoffBuilder setHandoutEnable(final java.lang.Boolean value) {
        this._handoutEnable = value;
        return this;
    }
    
    public Cdma2000OneXRanHardHandoffBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanHardHandoffBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanHardHandoff build() {
        return new Cdma2000OneXRanHardHandoffImpl(this);
    }

    private static final class Cdma2000OneXRanHardHandoffImpl implements Cdma2000OneXRanHardHandoff {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff.class;
        }

        private final Cdma2000OneXRanHardHandoffStats _cdma2000OneXRanHardHandoffStats;
        private final java.lang.Short _hoPilotDuration;
        private final java.lang.Long _hoPilotPowerThresh;
        private final java.lang.Boolean _handoutEnable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanHardHandoffImpl(Cdma2000OneXRanHardHandoffBuilder base) {
            this._cdma2000OneXRanHardHandoffStats = base.getCdma2000OneXRanHardHandoffStats();
            this._hoPilotDuration = base.getHoPilotDuration();
            this._hoPilotPowerThresh = base.getHoPilotPowerThresh();
            this._handoutEnable = base.isHandoutEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Cdma2000OneXRanHardHandoffStats getCdma2000OneXRanHardHandoffStats() {
            return _cdma2000OneXRanHardHandoffStats;
        }
        
        @Override
        public java.lang.Short getHoPilotDuration() {
            return _hoPilotDuration;
        }
        
        @Override
        public java.lang.Long getHoPilotPowerThresh() {
            return _hoPilotPowerThresh;
        }
        
        @Override
        public java.lang.Boolean isHandoutEnable() {
            return _handoutEnable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cdma2000OneXRanHardHandoffStats);
            result = prime * result + Objects.hashCode(_hoPilotDuration);
            result = prime * result + Objects.hashCode(_hoPilotPowerThresh);
            result = prime * result + Objects.hashCode(_handoutEnable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff)obj;
            if (!Objects.equals(_cdma2000OneXRanHardHandoffStats, other.getCdma2000OneXRanHardHandoffStats())) {
                return false;
            }
            if (!Objects.equals(_hoPilotDuration, other.getHoPilotDuration())) {
                return false;
            }
            if (!Objects.equals(_hoPilotPowerThresh, other.getHoPilotPowerThresh())) {
                return false;
            }
            if (!Objects.equals(_handoutEnable, other.isHandoutEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanHardHandoffImpl otherImpl = (Cdma2000OneXRanHardHandoffImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanHardHandoff [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cdma2000OneXRanHardHandoffStats != null) {
                builder.append("_cdma2000OneXRanHardHandoffStats=");
                builder.append(_cdma2000OneXRanHardHandoffStats);
                builder.append(", ");
            }
            if (_hoPilotDuration != null) {
                builder.append("_hoPilotDuration=");
                builder.append(_hoPilotDuration);
                builder.append(", ");
            }
            if (_hoPilotPowerThresh != null) {
                builder.append("_hoPilotPowerThresh=");
                builder.append(_hoPilotPowerThresh);
                builder.append(", ");
            }
            if (_handoutEnable != null) {
                builder.append("_handoutEnable=");
                builder.append(_handoutEnable);
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
