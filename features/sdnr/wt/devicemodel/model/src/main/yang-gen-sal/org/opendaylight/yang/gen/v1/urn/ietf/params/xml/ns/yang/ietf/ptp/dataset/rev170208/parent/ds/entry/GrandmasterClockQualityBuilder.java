package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality
 *
 */
public class GrandmasterClockQualityBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality> {

    private java.lang.Short _clockAccuracy;
    private java.lang.Short _clockClass;
    private java.lang.Integer _offsetScaledLogVariance;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>> augmentation = Collections.emptyMap();

    public GrandmasterClockQualityBuilder() {
    }
    public GrandmasterClockQualityBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockQualityGrouping arg) {
        this._clockClass = arg.getClockClass();
        this._clockAccuracy = arg.getClockAccuracy();
        this._offsetScaledLogVariance = arg.getOffsetScaledLogVariance();
    }

    public GrandmasterClockQualityBuilder(GrandmasterClockQuality base) {
        this._clockAccuracy = base.getClockAccuracy();
        this._clockClass = base.getClockClass();
        this._offsetScaledLogVariance = base.getOffsetScaledLogVariance();
        if (base instanceof GrandmasterClockQualityImpl) {
            GrandmasterClockQualityImpl impl = (GrandmasterClockQualityImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockQualityGrouping</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockQualityGrouping) {
            this._clockClass = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockQualityGrouping)arg).getClockClass();
            this._clockAccuracy = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockQualityGrouping)arg).getClockAccuracy();
            this._offsetScaledLogVariance = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockQualityGrouping)arg).getOffsetScaledLogVariance();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockQualityGrouping] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getClockAccuracy() {
        return _clockAccuracy;
    }
    
    public java.lang.Short getClockClass() {
        return _clockClass;
    }
    
    public java.lang.Integer getOffsetScaledLogVariance() {
        return _offsetScaledLogVariance;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkClockAccuracyRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public GrandmasterClockQualityBuilder setClockAccuracy(final java.lang.Short value) {
    if (value != null) {
        checkClockAccuracyRange(value);
    }
        this._clockAccuracy = value;
        return this;
    }
    
     
     private static void checkClockClassRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public GrandmasterClockQualityBuilder setClockClass(final java.lang.Short value) {
    if (value != null) {
        checkClockClassRange(value);
    }
        this._clockClass = value;
        return this;
    }
    
     
     private static void checkOffsetScaledLogVarianceRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public GrandmasterClockQualityBuilder setOffsetScaledLogVariance(final java.lang.Integer value) {
    if (value != null) {
        checkOffsetScaledLogVarianceRange(value);
    }
        this._offsetScaledLogVariance = value;
        return this;
    }
    
    public GrandmasterClockQualityBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GrandmasterClockQualityBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GrandmasterClockQuality build() {
        return new GrandmasterClockQualityImpl(this);
    }

    private static final class GrandmasterClockQualityImpl implements GrandmasterClockQuality {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality.class;
        }

        private final java.lang.Short _clockAccuracy;
        private final java.lang.Short _clockClass;
        private final java.lang.Integer _offsetScaledLogVariance;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>> augmentation = Collections.emptyMap();

        private GrandmasterClockQualityImpl(GrandmasterClockQualityBuilder base) {
            this._clockAccuracy = base.getClockAccuracy();
            this._clockClass = base.getClockClass();
            this._offsetScaledLogVariance = base.getOffsetScaledLogVariance();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getClockAccuracy() {
            return _clockAccuracy;
        }
        
        @Override
        public java.lang.Short getClockClass() {
            return _clockClass;
        }
        
        @Override
        public java.lang.Integer getOffsetScaledLogVariance() {
            return _offsetScaledLogVariance;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_clockAccuracy);
            result = prime * result + Objects.hashCode(_clockClass);
            result = prime * result + Objects.hashCode(_offsetScaledLogVariance);
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality)obj;
            if (!Objects.equals(_clockAccuracy, other.getClockAccuracy())) {
                return false;
            }
            if (!Objects.equals(_clockClass, other.getClockClass())) {
                return false;
            }
            if (!Objects.equals(_offsetScaledLogVariance, other.getOffsetScaledLogVariance())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GrandmasterClockQualityImpl otherImpl = (GrandmasterClockQualityImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GrandmasterClockQuality [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_clockAccuracy != null) {
                builder.append("_clockAccuracy=");
                builder.append(_clockAccuracy);
                builder.append(", ");
            }
            if (_clockClass != null) {
                builder.append("_clockClass=");
                builder.append(_clockClass);
                builder.append(", ");
            }
            if (_offsetScaledLogVariance != null) {
                builder.append("_offsetScaledLogVariance=");
                builder.append(_offsetScaledLogVariance);
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
