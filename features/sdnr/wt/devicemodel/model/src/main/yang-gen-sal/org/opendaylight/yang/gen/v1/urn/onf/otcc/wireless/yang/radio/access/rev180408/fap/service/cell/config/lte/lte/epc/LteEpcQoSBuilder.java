package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG.Type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS
 *
 */
public class LteEpcQoSBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS> {

    private java.lang.String _alias;
    private LteEpcQoSKey _key;
    private java.lang.Integer _packetDelayBudget;
    private java.lang.Short _priority;
    private java.lang.Short _qci;
    private Type _type;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>> augmentation = Collections.emptyMap();

    public LteEpcQoSBuilder() {
    }
    public LteEpcQoSBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._qci = arg.getQci();
        this._type = arg.getType();
        this._priority = arg.getPriority();
        this._packetDelayBudget = arg.getPacketDelayBudget();
    }

    public LteEpcQoSBuilder(LteEpcQoS base) {
        if (base.getKey() == null) {
            this._key = new LteEpcQoSKey(
                base.getQci()
            );
            this._qci = base.getQci();
        } else {
            this._key = base.getKey();
            this._qci = _key.getQci();
        }
        this._alias = base.getAlias();
        this._packetDelayBudget = base.getPacketDelayBudget();
        this._priority = base.getPriority();
        this._type = base.getType();
        this._enable = base.isEnable();
        if (base instanceof LteEpcQoSImpl) {
            LteEpcQoSImpl impl = (LteEpcQoSImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG)arg).getAlias();
            this._qci = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG)arg).getQci();
            this._type = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG)arg).getType();
            this._priority = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG)arg).getPriority();
            this._packetDelayBudget = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG)arg).getPacketDelayBudget();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public LteEpcQoSKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getPacketDelayBudget() {
        return _packetDelayBudget;
    }
    
    public java.lang.Short getPriority() {
        return _priority;
    }
    
    public java.lang.Short getQci() {
        return _qci;
    }
    
    public Type getType() {
        return _type;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public LteEpcQoSBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public LteEpcQoSBuilder setKey(final LteEpcQoSKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkPacketDelayBudgetRange(final int value) {
         if (value >= 50 && value <= 50) {
             return;
         }
         if (value >= 100 && value <= 100) {
             return;
         }
         if (value >= 150 && value <= 150) {
             return;
         }
         if (value >= 200 && value <= 200) {
             return;
         }
         if (value >= 300 && value <= 300) {
             return;
         }
         if (value >= 400 && value <= 400) {
             return;
         }
         if (value >= 500 && value <= 500) {
             return;
         }
         if (value >= 600 && value <= 600) {
             return;
         }
         if (value >= 700 && value <= 700) {
             return;
         }
         if (value >= 800 && value <= 800) {
             return;
         }
         if (value >= 900 && value <= 900) {
             return;
         }
         if (value >= 1000 && value <= 1000) {
             return;
         }
         if (value >= 1500 && value <= 1500) {
             return;
         }
         if (value >= 2000 && value <= 2000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[50..50], [100..100], [150..150], [200..200], [300..300], [400..400], [500..500], [600..600], [700..700], [800..800], [900..900], [1000..1000], [1500..1500], [2000..2000]].", value));
     }
    
    public LteEpcQoSBuilder setPacketDelayBudget(final java.lang.Integer value) {
    if (value != null) {
        checkPacketDelayBudgetRange(value);
    }
        this._packetDelayBudget = value;
        return this;
    }
    
     
     private static void checkPriorityRange(final short value) {
         if (value >= (short)1 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..20]].", value));
     }
    
    public LteEpcQoSBuilder setPriority(final java.lang.Short value) {
    if (value != null) {
        checkPriorityRange(value);
    }
        this._priority = value;
        return this;
    }
    
     
     private static void checkQciRange(final short value) {
         if (value >= (short)1 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..20]].", value));
     }
    
    public LteEpcQoSBuilder setQci(final java.lang.Short value) {
    if (value != null) {
        checkQciRange(value);
    }
        this._qci = value;
        return this;
    }
    
     
    public LteEpcQoSBuilder setType(final Type value) {
        this._type = value;
        return this;
    }
    
     
    public LteEpcQoSBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public LteEpcQoSBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteEpcQoSBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteEpcQoS build() {
        return new LteEpcQoSImpl(this);
    }

    private static final class LteEpcQoSImpl implements LteEpcQoS {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS.class;
        }

        private final java.lang.String _alias;
        private final LteEpcQoSKey _key;
        private final java.lang.Integer _packetDelayBudget;
        private final java.lang.Short _priority;
        private final java.lang.Short _qci;
        private final Type _type;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>> augmentation = Collections.emptyMap();

        private LteEpcQoSImpl(LteEpcQoSBuilder base) {
            if (base.getKey() == null) {
                this._key = new LteEpcQoSKey(
                    base.getQci()
                );
                this._qci = base.getQci();
            } else {
                this._key = base.getKey();
                this._qci = _key.getQci();
            }
            this._alias = base.getAlias();
            this._packetDelayBudget = base.getPacketDelayBudget();
            this._priority = base.getPriority();
            this._type = base.getType();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>>singletonMap(e.getKey(), e.getValue());
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
        public LteEpcQoSKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getPacketDelayBudget() {
            return _packetDelayBudget;
        }
        
        @Override
        public java.lang.Short getPriority() {
            return _priority;
        }
        
        @Override
        public java.lang.Short getQci() {
            return _qci;
        }
        
        @Override
        public Type getType() {
            return _type;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_packetDelayBudget);
            result = prime * result + Objects.hashCode(_priority);
            result = prime * result + Objects.hashCode(_qci);
            result = prime * result + Objects.hashCode(_type);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_packetDelayBudget, other.getPacketDelayBudget())) {
                return false;
            }
            if (!Objects.equals(_priority, other.getPriority())) {
                return false;
            }
            if (!Objects.equals(_qci, other.getQci())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteEpcQoSImpl otherImpl = (LteEpcQoSImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteEpcQoS [";
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
            if (_packetDelayBudget != null) {
                builder.append("_packetDelayBudget=");
                builder.append(_packetDelayBudget);
                builder.append(", ");
            }
            if (_priority != null) {
                builder.append("_priority=");
                builder.append(_priority);
                builder.append(", ");
            }
            if (_qci != null) {
                builder.append("_qci=");
                builder.append(_qci);
                builder.append(", ");
            }
            if (_type != null) {
                builder.append("_type=");
                builder.append(_type);
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
