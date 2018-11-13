package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming
 *
 */
public class RemCdma2000MacroTimingBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming> {

    private java.lang.Short _adminState;
    private BigInteger _channelNumberOfEntries;
    private List<RemCdma2000MacroTimingChannel> _remCdma2000MacroTimingChannel;
    private java.lang.Short _timingSource;
    private java.lang.Short _trackingBandClass;
    private BigInteger _trackingChannelNumber;
    private List<java.lang.String> _trackingPnOffset;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>> augmentation = Collections.emptyMap();

    public RemCdma2000MacroTimingBuilder() {
    }
    public RemCdma2000MacroTimingBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG arg) {
        this._adminState = arg.getAdminState();
        this._trackingChannelNumber = arg.getTrackingChannelNumber();
        this._trackingBandClass = arg.getTrackingBandClass();
        this._trackingPnOffset = arg.getTrackingPnOffset();
        this._timingSource = arg.getTimingSource();
        this._channelNumberOfEntries = arg.getChannelNumberOfEntries();
    }

    public RemCdma2000MacroTimingBuilder(RemCdma2000MacroTiming base) {
        this._adminState = base.getAdminState();
        this._channelNumberOfEntries = base.getChannelNumberOfEntries();
        this._remCdma2000MacroTimingChannel = base.getRemCdma2000MacroTimingChannel();
        this._timingSource = base.getTimingSource();
        this._trackingBandClass = base.getTrackingBandClass();
        this._trackingChannelNumber = base.getTrackingChannelNumber();
        this._trackingPnOffset = base.getTrackingPnOffset();
        if (base instanceof RemCdma2000MacroTimingImpl) {
            RemCdma2000MacroTimingImpl impl = (RemCdma2000MacroTimingImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG) {
            this._adminState = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG)arg).getAdminState();
            this._trackingChannelNumber = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG)arg).getTrackingChannelNumber();
            this._trackingBandClass = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG)arg).getTrackingBandClass();
            this._trackingPnOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG)arg).getTrackingPnOffset();
            this._timingSource = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG)arg).getTimingSource();
            this._channelNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG)arg).getChannelNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getAdminState() {
        return _adminState;
    }
    
    public BigInteger getChannelNumberOfEntries() {
        return _channelNumberOfEntries;
    }
    
    public List<RemCdma2000MacroTimingChannel> getRemCdma2000MacroTimingChannel() {
        return _remCdma2000MacroTimingChannel;
    }
    
    public java.lang.Short getTimingSource() {
        return _timingSource;
    }
    
    public java.lang.Short getTrackingBandClass() {
        return _trackingBandClass;
    }
    
    public BigInteger getTrackingChannelNumber() {
        return _trackingChannelNumber;
    }
    
    public List<java.lang.String> getTrackingPnOffset() {
        return _trackingPnOffset;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkAdminStateRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public RemCdma2000MacroTimingBuilder setAdminState(final java.lang.Short value) {
    if (value != null) {
        checkAdminStateRange(value);
    }
        this._adminState = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCHANNELNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCHANNELNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkChannelNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCHANNELNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCHANNELNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public RemCdma2000MacroTimingBuilder setChannelNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkChannelNumberOfEntriesRange(value);
    }
        this._channelNumberOfEntries = value;
        return this;
    }
    
     
    public RemCdma2000MacroTimingBuilder setRemCdma2000MacroTimingChannel(final List<RemCdma2000MacroTimingChannel> value) {
        this._remCdma2000MacroTimingChannel = value;
        return this;
    }
    
     
     private static void checkTimingSourceRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public RemCdma2000MacroTimingBuilder setTimingSource(final java.lang.Short value) {
    if (value != null) {
        checkTimingSourceRange(value);
    }
        this._timingSource = value;
        return this;
    }
    
     
     private static void checkTrackingBandClassRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public RemCdma2000MacroTimingBuilder setTrackingBandClass(final java.lang.Short value) {
    if (value != null) {
        checkTrackingBandClassRange(value);
    }
        this._trackingBandClass = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTRACKINGCHANNELNUMBERRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTRACKINGCHANNELNUMBERRANGE_RANGES = a;
     }
     private static void checkTrackingChannelNumberRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTRACKINGCHANNELNUMBERRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTRACKINGCHANNELNUMBERRANGE_RANGES)));
     }
    
    public RemCdma2000MacroTimingBuilder setTrackingChannelNumber(final BigInteger value) {
    if (value != null) {
        checkTrackingChannelNumberRange(value);
    }
        this._trackingChannelNumber = value;
        return this;
    }
    
     
    public RemCdma2000MacroTimingBuilder setTrackingPnOffset(final List<java.lang.String> value) {
        this._trackingPnOffset = value;
        return this;
    }
    
    public RemCdma2000MacroTimingBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemCdma2000MacroTimingBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemCdma2000MacroTiming build() {
        return new RemCdma2000MacroTimingImpl(this);
    }

    private static final class RemCdma2000MacroTimingImpl implements RemCdma2000MacroTiming {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming.class;
        }

        private final java.lang.Short _adminState;
        private final BigInteger _channelNumberOfEntries;
        private final List<RemCdma2000MacroTimingChannel> _remCdma2000MacroTimingChannel;
        private final java.lang.Short _timingSource;
        private final java.lang.Short _trackingBandClass;
        private final BigInteger _trackingChannelNumber;
        private final List<java.lang.String> _trackingPnOffset;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>> augmentation = Collections.emptyMap();

        private RemCdma2000MacroTimingImpl(RemCdma2000MacroTimingBuilder base) {
            this._adminState = base.getAdminState();
            this._channelNumberOfEntries = base.getChannelNumberOfEntries();
            this._remCdma2000MacroTimingChannel = base.getRemCdma2000MacroTimingChannel();
            this._timingSource = base.getTimingSource();
            this._trackingBandClass = base.getTrackingBandClass();
            this._trackingChannelNumber = base.getTrackingChannelNumber();
            this._trackingPnOffset = base.getTrackingPnOffset();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getAdminState() {
            return _adminState;
        }
        
        @Override
        public BigInteger getChannelNumberOfEntries() {
            return _channelNumberOfEntries;
        }
        
        @Override
        public List<RemCdma2000MacroTimingChannel> getRemCdma2000MacroTimingChannel() {
            return _remCdma2000MacroTimingChannel;
        }
        
        @Override
        public java.lang.Short getTimingSource() {
            return _timingSource;
        }
        
        @Override
        public java.lang.Short getTrackingBandClass() {
            return _trackingBandClass;
        }
        
        @Override
        public BigInteger getTrackingChannelNumber() {
            return _trackingChannelNumber;
        }
        
        @Override
        public List<java.lang.String> getTrackingPnOffset() {
            return _trackingPnOffset;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_adminState);
            result = prime * result + Objects.hashCode(_channelNumberOfEntries);
            result = prime * result + Objects.hashCode(_remCdma2000MacroTimingChannel);
            result = prime * result + Objects.hashCode(_timingSource);
            result = prime * result + Objects.hashCode(_trackingBandClass);
            result = prime * result + Objects.hashCode(_trackingChannelNumber);
            result = prime * result + Objects.hashCode(_trackingPnOffset);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming)obj;
            if (!Objects.equals(_adminState, other.getAdminState())) {
                return false;
            }
            if (!Objects.equals(_channelNumberOfEntries, other.getChannelNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000MacroTimingChannel, other.getRemCdma2000MacroTimingChannel())) {
                return false;
            }
            if (!Objects.equals(_timingSource, other.getTimingSource())) {
                return false;
            }
            if (!Objects.equals(_trackingBandClass, other.getTrackingBandClass())) {
                return false;
            }
            if (!Objects.equals(_trackingChannelNumber, other.getTrackingChannelNumber())) {
                return false;
            }
            if (!Objects.equals(_trackingPnOffset, other.getTrackingPnOffset())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemCdma2000MacroTimingImpl otherImpl = (RemCdma2000MacroTimingImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemCdma2000MacroTiming [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_adminState != null) {
                builder.append("_adminState=");
                builder.append(_adminState);
                builder.append(", ");
            }
            if (_channelNumberOfEntries != null) {
                builder.append("_channelNumberOfEntries=");
                builder.append(_channelNumberOfEntries);
                builder.append(", ");
            }
            if (_remCdma2000MacroTimingChannel != null) {
                builder.append("_remCdma2000MacroTimingChannel=");
                builder.append(_remCdma2000MacroTimingChannel);
                builder.append(", ");
            }
            if (_timingSource != null) {
                builder.append("_timingSource=");
                builder.append(_timingSource);
                builder.append(", ");
            }
            if (_trackingBandClass != null) {
                builder.append("_trackingBandClass=");
                builder.append(_trackingBandClass);
                builder.append(", ");
            }
            if (_trackingChannelNumber != null) {
                builder.append("_trackingChannelNumber=");
                builder.append(_trackingChannelNumber);
                builder.append(", ");
            }
            if (_trackingPnOffset != null) {
                builder.append("_trackingPnOffset=");
                builder.append(_trackingPnOffset);
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
