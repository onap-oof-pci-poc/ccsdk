package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData
 *
 */
public class PerformanceDataBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData> {

    private java.lang.Integer _es;
    private java.lang.Integer _lowPowerIdleReceiverMs;
    private java.lang.Integer _lowPowerIdleTransmitterMs;
    private java.lang.Integer _ses;
    private java.lang.Integer _symbolErrorDuringCarrier;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>> augmentation = Collections.emptyMap();

    public PerformanceDataBuilder() {
    }
    public PerformanceDataBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePerformanceTypeG arg) {
        this._es = arg.getEs();
        this._ses = arg.getSes();
        this._symbolErrorDuringCarrier = arg.getSymbolErrorDuringCarrier();
        this._lowPowerIdleTransmitterMs = arg.getLowPowerIdleTransmitterMs();
        this._lowPowerIdleReceiverMs = arg.getLowPowerIdleReceiverMs();
    }

    public PerformanceDataBuilder(PerformanceData base) {
        this._es = base.getEs();
        this._lowPowerIdleReceiverMs = base.getLowPowerIdleReceiverMs();
        this._lowPowerIdleTransmitterMs = base.getLowPowerIdleTransmitterMs();
        this._ses = base.getSes();
        this._symbolErrorDuringCarrier = base.getSymbolErrorDuringCarrier();
        if (base instanceof PerformanceDataImpl) {
            PerformanceDataImpl impl = (PerformanceDataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePerformanceTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePerformanceTypeG) {
            this._es = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePerformanceTypeG)arg).getEs();
            this._ses = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePerformanceTypeG)arg).getSes();
            this._symbolErrorDuringCarrier = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePerformanceTypeG)arg).getSymbolErrorDuringCarrier();
            this._lowPowerIdleTransmitterMs = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePerformanceTypeG)arg).getLowPowerIdleTransmitterMs();
            this._lowPowerIdleReceiverMs = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePerformanceTypeG)arg).getLowPowerIdleReceiverMs();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePerformanceTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getEs() {
        return _es;
    }
    
    public java.lang.Integer getLowPowerIdleReceiverMs() {
        return _lowPowerIdleReceiverMs;
    }
    
    public java.lang.Integer getLowPowerIdleTransmitterMs() {
        return _lowPowerIdleTransmitterMs;
    }
    
    public java.lang.Integer getSes() {
        return _ses;
    }
    
    public java.lang.Integer getSymbolErrorDuringCarrier() {
        return _symbolErrorDuringCarrier;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PerformanceDataBuilder setEs(final java.lang.Integer value) {
        this._es = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setLowPowerIdleReceiverMs(final java.lang.Integer value) {
        this._lowPowerIdleReceiverMs = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setLowPowerIdleTransmitterMs(final java.lang.Integer value) {
        this._lowPowerIdleTransmitterMs = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setSes(final java.lang.Integer value) {
        this._ses = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setSymbolErrorDuringCarrier(final java.lang.Integer value) {
        this._symbolErrorDuringCarrier = value;
        return this;
    }
    
    public PerformanceDataBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PerformanceDataBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PerformanceData build() {
        return new PerformanceDataImpl(this);
    }

    private static final class PerformanceDataImpl implements PerformanceData {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData.class;
        }

        private final java.lang.Integer _es;
        private final java.lang.Integer _lowPowerIdleReceiverMs;
        private final java.lang.Integer _lowPowerIdleTransmitterMs;
        private final java.lang.Integer _ses;
        private final java.lang.Integer _symbolErrorDuringCarrier;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>> augmentation = Collections.emptyMap();

        private PerformanceDataImpl(PerformanceDataBuilder base) {
            this._es = base.getEs();
            this._lowPowerIdleReceiverMs = base.getLowPowerIdleReceiverMs();
            this._lowPowerIdleTransmitterMs = base.getLowPowerIdleTransmitterMs();
            this._ses = base.getSes();
            this._symbolErrorDuringCarrier = base.getSymbolErrorDuringCarrier();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getEs() {
            return _es;
        }
        
        @Override
        public java.lang.Integer getLowPowerIdleReceiverMs() {
            return _lowPowerIdleReceiverMs;
        }
        
        @Override
        public java.lang.Integer getLowPowerIdleTransmitterMs() {
            return _lowPowerIdleTransmitterMs;
        }
        
        @Override
        public java.lang.Integer getSes() {
            return _ses;
        }
        
        @Override
        public java.lang.Integer getSymbolErrorDuringCarrier() {
            return _symbolErrorDuringCarrier;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_es);
            result = prime * result + Objects.hashCode(_lowPowerIdleReceiverMs);
            result = prime * result + Objects.hashCode(_lowPowerIdleTransmitterMs);
            result = prime * result + Objects.hashCode(_ses);
            result = prime * result + Objects.hashCode(_symbolErrorDuringCarrier);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData)obj;
            if (!Objects.equals(_es, other.getEs())) {
                return false;
            }
            if (!Objects.equals(_lowPowerIdleReceiverMs, other.getLowPowerIdleReceiverMs())) {
                return false;
            }
            if (!Objects.equals(_lowPowerIdleTransmitterMs, other.getLowPowerIdleTransmitterMs())) {
                return false;
            }
            if (!Objects.equals(_ses, other.getSes())) {
                return false;
            }
            if (!Objects.equals(_symbolErrorDuringCarrier, other.getSymbolErrorDuringCarrier())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PerformanceDataImpl otherImpl = (PerformanceDataImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.type.g.PerformanceData>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PerformanceData [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_es != null) {
                builder.append("_es=");
                builder.append(_es);
                builder.append(", ");
            }
            if (_lowPowerIdleReceiverMs != null) {
                builder.append("_lowPowerIdleReceiverMs=");
                builder.append(_lowPowerIdleReceiverMs);
                builder.append(", ");
            }
            if (_lowPowerIdleTransmitterMs != null) {
                builder.append("_lowPowerIdleTransmitterMs=");
                builder.append(_lowPowerIdleTransmitterMs);
                builder.append(", ");
            }
            if (_ses != null) {
                builder.append("_ses=");
                builder.append(_ses);
                builder.append(", ");
            }
            if (_symbolErrorDuringCarrier != null) {
                builder.append("_symbolErrorDuringCarrier=");
                builder.append(_symbolErrorDuringCarrier);
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
