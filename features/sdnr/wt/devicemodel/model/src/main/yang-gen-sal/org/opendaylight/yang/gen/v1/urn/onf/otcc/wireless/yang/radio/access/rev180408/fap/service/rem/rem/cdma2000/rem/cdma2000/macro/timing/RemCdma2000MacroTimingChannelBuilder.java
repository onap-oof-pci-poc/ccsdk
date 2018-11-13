package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel
 *
 */
public class RemCdma2000MacroTimingChannelBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel> {

    private java.lang.Short _airInterfaceType;
    private java.lang.String _alias;
    private java.lang.Short _bandClass;
    private BigInteger _channelNumber;
    private RemCdma2000MacroTimingChannelKey _key;
    private List<java.lang.String> _pnList;
    private BigInteger _priority;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>> augmentation = Collections.emptyMap();

    public RemCdma2000MacroTimingChannelBuilder() {
    }
    public RemCdma2000MacroTimingChannelBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._airInterfaceType = arg.getAirInterfaceType();
        this._bandClass = arg.getBandClass();
        this._channelNumber = arg.getChannelNumber();
        this._priority = arg.getPriority();
        this._pnList = arg.getPnList();
    }

    public RemCdma2000MacroTimingChannelBuilder(RemCdma2000MacroTimingChannel base) {
        if (base.getKey() == null) {
            this._key = new RemCdma2000MacroTimingChannelKey(
                base.getBandClass(), 
                base.getChannelNumber()
            );
            this._bandClass = base.getBandClass();
            this._channelNumber = base.getChannelNumber();
        } else {
            this._key = base.getKey();
            this._bandClass = _key.getBandClass();
            this._channelNumber = _key.getChannelNumber();
        }
        this._airInterfaceType = base.getAirInterfaceType();
        this._alias = base.getAlias();
        this._pnList = base.getPnList();
        this._priority = base.getPriority();
        this._enable = base.isEnable();
        if (base instanceof RemCdma2000MacroTimingChannelImpl) {
            RemCdma2000MacroTimingChannelImpl impl = (RemCdma2000MacroTimingChannelImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG)arg).getAlias();
            this._airInterfaceType = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG)arg).getAirInterfaceType();
            this._bandClass = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG)arg).getBandClass();
            this._channelNumber = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG)arg).getChannelNumber();
            this._priority = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG)arg).getPriority();
            this._pnList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG)arg).getPnList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getAirInterfaceType() {
        return _airInterfaceType;
    }
    
    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.Short getBandClass() {
        return _bandClass;
    }
    
    public BigInteger getChannelNumber() {
        return _channelNumber;
    }
    
    public RemCdma2000MacroTimingChannelKey getKey() {
        return _key;
    }
    
    public List<java.lang.String> getPnList() {
        return _pnList;
    }
    
    public BigInteger getPriority() {
        return _priority;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkAirInterfaceTypeRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public RemCdma2000MacroTimingChannelBuilder setAirInterfaceType(final java.lang.Short value) {
    if (value != null) {
        checkAirInterfaceTypeRange(value);
    }
        this._airInterfaceType = value;
        return this;
    }
    
     
     private static void check_aliasLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..64]].", value));
     }
    
    public RemCdma2000MacroTimingChannelBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
     private static void checkBandClassRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public RemCdma2000MacroTimingChannelBuilder setBandClass(final java.lang.Short value) {
    if (value != null) {
        checkBandClassRange(value);
    }
        this._bandClass = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCHANNELNUMBERRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCHANNELNUMBERRANGE_RANGES = a;
     }
     private static void checkChannelNumberRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCHANNELNUMBERRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCHANNELNUMBERRANGE_RANGES)));
     }
    
    public RemCdma2000MacroTimingChannelBuilder setChannelNumber(final BigInteger value) {
    if (value != null) {
        checkChannelNumberRange(value);
    }
        this._channelNumber = value;
        return this;
    }
    
     
    public RemCdma2000MacroTimingChannelBuilder setKey(final RemCdma2000MacroTimingChannelKey value) {
        this._key = value;
        return this;
    }
    
     
    public RemCdma2000MacroTimingChannelBuilder setPnList(final List<java.lang.String> value) {
        this._pnList = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKPRIORITYRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKPRIORITYRANGE_RANGES = a;
     }
     private static void checkPriorityRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKPRIORITYRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKPRIORITYRANGE_RANGES)));
     }
    
    public RemCdma2000MacroTimingChannelBuilder setPriority(final BigInteger value) {
    if (value != null) {
        checkPriorityRange(value);
    }
        this._priority = value;
        return this;
    }
    
     
    public RemCdma2000MacroTimingChannelBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public RemCdma2000MacroTimingChannelBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemCdma2000MacroTimingChannelBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemCdma2000MacroTimingChannel build() {
        return new RemCdma2000MacroTimingChannelImpl(this);
    }

    private static final class RemCdma2000MacroTimingChannelImpl implements RemCdma2000MacroTimingChannel {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel.class;
        }

        private final java.lang.Short _airInterfaceType;
        private final java.lang.String _alias;
        private final java.lang.Short _bandClass;
        private final BigInteger _channelNumber;
        private final RemCdma2000MacroTimingChannelKey _key;
        private final List<java.lang.String> _pnList;
        private final BigInteger _priority;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>> augmentation = Collections.emptyMap();

        private RemCdma2000MacroTimingChannelImpl(RemCdma2000MacroTimingChannelBuilder base) {
            if (base.getKey() == null) {
                this._key = new RemCdma2000MacroTimingChannelKey(
                    base.getBandClass(), 
                    base.getChannelNumber()
                );
                this._bandClass = base.getBandClass();
                this._channelNumber = base.getChannelNumber();
            } else {
                this._key = base.getKey();
                this._bandClass = _key.getBandClass();
                this._channelNumber = _key.getChannelNumber();
            }
            this._airInterfaceType = base.getAirInterfaceType();
            this._alias = base.getAlias();
            this._pnList = base.getPnList();
            this._priority = base.getPriority();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getAirInterfaceType() {
            return _airInterfaceType;
        }
        
        @Override
        public java.lang.String getAlias() {
            return _alias;
        }
        
        @Override
        public java.lang.Short getBandClass() {
            return _bandClass;
        }
        
        @Override
        public BigInteger getChannelNumber() {
            return _channelNumber;
        }
        
        @Override
        public RemCdma2000MacroTimingChannelKey getKey() {
            return _key;
        }
        
        @Override
        public List<java.lang.String> getPnList() {
            return _pnList;
        }
        
        @Override
        public BigInteger getPriority() {
            return _priority;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_airInterfaceType);
            result = prime * result + Objects.hashCode(_alias);
            result = prime * result + Objects.hashCode(_bandClass);
            result = prime * result + Objects.hashCode(_channelNumber);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_pnList);
            result = prime * result + Objects.hashCode(_priority);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel)obj;
            if (!Objects.equals(_airInterfaceType, other.getAirInterfaceType())) {
                return false;
            }
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_bandClass, other.getBandClass())) {
                return false;
            }
            if (!Objects.equals(_channelNumber, other.getChannelNumber())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_pnList, other.getPnList())) {
                return false;
            }
            if (!Objects.equals(_priority, other.getPriority())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemCdma2000MacroTimingChannelImpl otherImpl = (RemCdma2000MacroTimingChannelImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemCdma2000MacroTimingChannel [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_airInterfaceType != null) {
                builder.append("_airInterfaceType=");
                builder.append(_airInterfaceType);
                builder.append(", ");
            }
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_bandClass != null) {
                builder.append("_bandClass=");
                builder.append(_bandClass);
                builder.append(", ");
            }
            if (_channelNumber != null) {
                builder.append("_channelNumber=");
                builder.append(_channelNumber);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_pnList != null) {
                builder.append("_pnList=");
                builder.append(_pnList);
                builder.append(", ");
            }
            if (_priority != null) {
                builder.append("_priority=");
                builder.append(_priority);
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
