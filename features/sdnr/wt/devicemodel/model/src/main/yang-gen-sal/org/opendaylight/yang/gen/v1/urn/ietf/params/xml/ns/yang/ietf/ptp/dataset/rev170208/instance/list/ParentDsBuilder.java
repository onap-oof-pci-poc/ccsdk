package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.ParentPortIdentity;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Arrays;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs
 *
 */
public class ParentDsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs> {

    private GrandmasterClockQuality _grandmasterClockQuality;
    private byte[] _grandmasterIdentity;
    private java.lang.Short _grandmasterPriority1;
    private java.lang.Short _grandmasterPriority2;
    private java.lang.Integer _observedParentClockPhaseChangeRate;
    private java.lang.Integer _observedParentOffsetScaledLogVariance;
    private ParentPortIdentity _parentPortIdentity;
    private java.lang.Boolean _parentStats;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>> augmentation = Collections.emptyMap();

    public ParentDsBuilder() {
    }
    public ParentDsBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry arg) {
        this._parentPortIdentity = arg.getParentPortIdentity();
        this._parentStats = arg.isParentStats();
        this._observedParentOffsetScaledLogVariance = arg.getObservedParentOffsetScaledLogVariance();
        this._observedParentClockPhaseChangeRate = arg.getObservedParentClockPhaseChangeRate();
        this._grandmasterIdentity = arg.getGrandmasterIdentity();
        this._grandmasterClockQuality = arg.getGrandmasterClockQuality();
        this._grandmasterPriority1 = arg.getGrandmasterPriority1();
        this._grandmasterPriority2 = arg.getGrandmasterPriority2();
    }

    public ParentDsBuilder(ParentDs base) {
        this._grandmasterClockQuality = base.getGrandmasterClockQuality();
        this._grandmasterIdentity = base.getGrandmasterIdentity();
        this._grandmasterPriority1 = base.getGrandmasterPriority1();
        this._grandmasterPriority2 = base.getGrandmasterPriority2();
        this._observedParentClockPhaseChangeRate = base.getObservedParentClockPhaseChangeRate();
        this._observedParentOffsetScaledLogVariance = base.getObservedParentOffsetScaledLogVariance();
        this._parentPortIdentity = base.getParentPortIdentity();
        this._parentStats = base.isParentStats();
        if (base instanceof ParentDsImpl) {
            ParentDsImpl impl = (ParentDsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry) {
            this._parentPortIdentity = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry)arg).getParentPortIdentity();
            this._parentStats = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry)arg).isParentStats();
            this._observedParentOffsetScaledLogVariance = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry)arg).getObservedParentOffsetScaledLogVariance();
            this._observedParentClockPhaseChangeRate = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry)arg).getObservedParentClockPhaseChangeRate();
            this._grandmasterIdentity = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry)arg).getGrandmasterIdentity();
            this._grandmasterClockQuality = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry)arg).getGrandmasterClockQuality();
            this._grandmasterPriority1 = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry)arg).getGrandmasterPriority1();
            this._grandmasterPriority2 = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry)arg).getGrandmasterPriority2();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ParentDsEntry] \n" +
              "but was: " + arg
            );
        }
    }

    public GrandmasterClockQuality getGrandmasterClockQuality() {
        return _grandmasterClockQuality;
    }
    
    public byte[] getGrandmasterIdentity() {
        return _grandmasterIdentity == null ? null : _grandmasterIdentity.clone();
    }
    
    public java.lang.Short getGrandmasterPriority1() {
        return _grandmasterPriority1;
    }
    
    public java.lang.Short getGrandmasterPriority2() {
        return _grandmasterPriority2;
    }
    
    public java.lang.Integer getObservedParentClockPhaseChangeRate() {
        return _observedParentClockPhaseChangeRate;
    }
    
    public java.lang.Integer getObservedParentOffsetScaledLogVariance() {
        return _observedParentOffsetScaledLogVariance;
    }
    
    public ParentPortIdentity getParentPortIdentity() {
        return _parentPortIdentity;
    }
    
    public java.lang.Boolean isParentStats() {
        return _parentStats;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ParentDsBuilder setGrandmasterClockQuality(final GrandmasterClockQuality value) {
        this._grandmasterClockQuality = value;
        return this;
    }
    
     
     private static void check_grandmasterIdentityLength(final byte[] value) {
         final int length = value.length;
         if (length >= 8 && length <= 8) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[8..8]].", java.util.Arrays.toString(value)));
     }
    
    public ParentDsBuilder setGrandmasterIdentity(final byte[] value) {
    if (value != null) {
        check_grandmasterIdentityLength(value);
    }
        this._grandmasterIdentity = value;
        return this;
    }
    
     
     private static void checkGrandmasterPriority1Range(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public ParentDsBuilder setGrandmasterPriority1(final java.lang.Short value) {
    if (value != null) {
        checkGrandmasterPriority1Range(value);
    }
        this._grandmasterPriority1 = value;
        return this;
    }
    
     
     private static void checkGrandmasterPriority2Range(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public ParentDsBuilder setGrandmasterPriority2(final java.lang.Short value) {
    if (value != null) {
        checkGrandmasterPriority2Range(value);
    }
        this._grandmasterPriority2 = value;
        return this;
    }
    
     
    public ParentDsBuilder setObservedParentClockPhaseChangeRate(final java.lang.Integer value) {
        this._observedParentClockPhaseChangeRate = value;
        return this;
    }
    
     
     private static void checkObservedParentOffsetScaledLogVarianceRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public ParentDsBuilder setObservedParentOffsetScaledLogVariance(final java.lang.Integer value) {
    if (value != null) {
        checkObservedParentOffsetScaledLogVarianceRange(value);
    }
        this._observedParentOffsetScaledLogVariance = value;
        return this;
    }
    
     
    public ParentDsBuilder setParentPortIdentity(final ParentPortIdentity value) {
        this._parentPortIdentity = value;
        return this;
    }
    
     
    public ParentDsBuilder setParentStats(final java.lang.Boolean value) {
        this._parentStats = value;
        return this;
    }
    
    public ParentDsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ParentDsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ParentDs build() {
        return new ParentDsImpl(this);
    }

    private static final class ParentDsImpl implements ParentDs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs.class;
        }

        private final GrandmasterClockQuality _grandmasterClockQuality;
        private final byte[] _grandmasterIdentity;
        private final java.lang.Short _grandmasterPriority1;
        private final java.lang.Short _grandmasterPriority2;
        private final java.lang.Integer _observedParentClockPhaseChangeRate;
        private final java.lang.Integer _observedParentOffsetScaledLogVariance;
        private final ParentPortIdentity _parentPortIdentity;
        private final java.lang.Boolean _parentStats;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>> augmentation = Collections.emptyMap();

        private ParentDsImpl(ParentDsBuilder base) {
            this._grandmasterClockQuality = base.getGrandmasterClockQuality();
            this._grandmasterIdentity = base.getGrandmasterIdentity();
            this._grandmasterPriority1 = base.getGrandmasterPriority1();
            this._grandmasterPriority2 = base.getGrandmasterPriority2();
            this._observedParentClockPhaseChangeRate = base.getObservedParentClockPhaseChangeRate();
            this._observedParentOffsetScaledLogVariance = base.getObservedParentOffsetScaledLogVariance();
            this._parentPortIdentity = base.getParentPortIdentity();
            this._parentStats = base.isParentStats();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public GrandmasterClockQuality getGrandmasterClockQuality() {
            return _grandmasterClockQuality;
        }
        
        @Override
        public byte[] getGrandmasterIdentity() {
            return _grandmasterIdentity == null ? null : _grandmasterIdentity.clone();
        }
        
        @Override
        public java.lang.Short getGrandmasterPriority1() {
            return _grandmasterPriority1;
        }
        
        @Override
        public java.lang.Short getGrandmasterPriority2() {
            return _grandmasterPriority2;
        }
        
        @Override
        public java.lang.Integer getObservedParentClockPhaseChangeRate() {
            return _observedParentClockPhaseChangeRate;
        }
        
        @Override
        public java.lang.Integer getObservedParentOffsetScaledLogVariance() {
            return _observedParentOffsetScaledLogVariance;
        }
        
        @Override
        public ParentPortIdentity getParentPortIdentity() {
            return _parentPortIdentity;
        }
        
        @Override
        public java.lang.Boolean isParentStats() {
            return _parentStats;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_grandmasterClockQuality);
            result = prime * result + Arrays.hashCode(_grandmasterIdentity);
            result = prime * result + Objects.hashCode(_grandmasterPriority1);
            result = prime * result + Objects.hashCode(_grandmasterPriority2);
            result = prime * result + Objects.hashCode(_observedParentClockPhaseChangeRate);
            result = prime * result + Objects.hashCode(_observedParentOffsetScaledLogVariance);
            result = prime * result + Objects.hashCode(_parentPortIdentity);
            result = prime * result + Objects.hashCode(_parentStats);
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs)obj;
            if (!Objects.equals(_grandmasterClockQuality, other.getGrandmasterClockQuality())) {
                return false;
            }
            if (!Arrays.equals(_grandmasterIdentity, other.getGrandmasterIdentity())) {
                return false;
            }
            if (!Objects.equals(_grandmasterPriority1, other.getGrandmasterPriority1())) {
                return false;
            }
            if (!Objects.equals(_grandmasterPriority2, other.getGrandmasterPriority2())) {
                return false;
            }
            if (!Objects.equals(_observedParentClockPhaseChangeRate, other.getObservedParentClockPhaseChangeRate())) {
                return false;
            }
            if (!Objects.equals(_observedParentOffsetScaledLogVariance, other.getObservedParentOffsetScaledLogVariance())) {
                return false;
            }
            if (!Objects.equals(_parentPortIdentity, other.getParentPortIdentity())) {
                return false;
            }
            if (!Objects.equals(_parentStats, other.isParentStats())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ParentDsImpl otherImpl = (ParentDsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ParentDs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_grandmasterClockQuality != null) {
                builder.append("_grandmasterClockQuality=");
                builder.append(_grandmasterClockQuality);
                builder.append(", ");
            }
            if (_grandmasterIdentity != null) {
                builder.append("_grandmasterIdentity=");
                builder.append(Arrays.toString(_grandmasterIdentity));
                builder.append(", ");
            }
            if (_grandmasterPriority1 != null) {
                builder.append("_grandmasterPriority1=");
                builder.append(_grandmasterPriority1);
                builder.append(", ");
            }
            if (_grandmasterPriority2 != null) {
                builder.append("_grandmasterPriority2=");
                builder.append(_grandmasterPriority2);
                builder.append(", ");
            }
            if (_observedParentClockPhaseChangeRate != null) {
                builder.append("_observedParentClockPhaseChangeRate=");
                builder.append(_observedParentClockPhaseChangeRate);
                builder.append(", ");
            }
            if (_observedParentOffsetScaledLogVariance != null) {
                builder.append("_observedParentOffsetScaledLogVariance=");
                builder.append(_observedParentOffsetScaledLogVariance);
                builder.append(", ");
            }
            if (_parentPortIdentity != null) {
                builder.append("_parentPortIdentity=");
                builder.append(_parentPortIdentity);
                builder.append(", ");
            }
            if (_parentStats != null) {
                builder.append("_parentStats=");
                builder.append(_parentStats);
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
