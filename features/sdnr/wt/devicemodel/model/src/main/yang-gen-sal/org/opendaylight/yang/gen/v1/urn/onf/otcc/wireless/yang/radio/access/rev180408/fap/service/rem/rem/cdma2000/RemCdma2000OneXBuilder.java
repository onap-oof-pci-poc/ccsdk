package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXChannel;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX
 *
 */
public class RemCdma2000OneXBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX> {

    private BigInteger _cellNumberOfEntries;
    private BigInteger _channelNumberOfEntries;
    private BigInteger _maxCellEntries;
    private BigInteger _maxChannelEntries;
    private List<RemCdma2000OneXCell> _remCdma2000OneXCell;
    private List<RemCdma2000OneXChannel> _remCdma2000OneXChannel;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>> augmentation = Collections.emptyMap();

    public RemCdma2000OneXBuilder() {
    }
    public RemCdma2000OneXBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXG arg) {
        this._maxCellEntries = arg.getMaxCellEntries();
        this._cellNumberOfEntries = arg.getCellNumberOfEntries();
        this._maxChannelEntries = arg.getMaxChannelEntries();
        this._channelNumberOfEntries = arg.getChannelNumberOfEntries();
    }

    public RemCdma2000OneXBuilder(RemCdma2000OneX base) {
        this._cellNumberOfEntries = base.getCellNumberOfEntries();
        this._channelNumberOfEntries = base.getChannelNumberOfEntries();
        this._maxCellEntries = base.getMaxCellEntries();
        this._maxChannelEntries = base.getMaxChannelEntries();
        this._remCdma2000OneXCell = base.getRemCdma2000OneXCell();
        this._remCdma2000OneXChannel = base.getRemCdma2000OneXChannel();
        if (base instanceof RemCdma2000OneXImpl) {
            RemCdma2000OneXImpl impl = (RemCdma2000OneXImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXG) {
            this._maxCellEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXG)arg).getMaxCellEntries();
            this._cellNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXG)arg).getCellNumberOfEntries();
            this._maxChannelEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXG)arg).getMaxChannelEntries();
            this._channelNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXG)arg).getChannelNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getCellNumberOfEntries() {
        return _cellNumberOfEntries;
    }
    
    public BigInteger getChannelNumberOfEntries() {
        return _channelNumberOfEntries;
    }
    
    public BigInteger getMaxCellEntries() {
        return _maxCellEntries;
    }
    
    public BigInteger getMaxChannelEntries() {
        return _maxChannelEntries;
    }
    
    public List<RemCdma2000OneXCell> getRemCdma2000OneXCell() {
        return _remCdma2000OneXCell;
    }
    
    public List<RemCdma2000OneXChannel> getRemCdma2000OneXChannel() {
        return _remCdma2000OneXChannel;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCELLNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCELLNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkCellNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCELLNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCELLNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public RemCdma2000OneXBuilder setCellNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkCellNumberOfEntriesRange(value);
    }
        this._cellNumberOfEntries = value;
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
    
    public RemCdma2000OneXBuilder setChannelNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkChannelNumberOfEntriesRange(value);
    }
        this._channelNumberOfEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXCELLENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXCELLENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxCellEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXCELLENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXCELLENTRIESRANGE_RANGES)));
     }
    
    public RemCdma2000OneXBuilder setMaxCellEntries(final BigInteger value) {
    if (value != null) {
        checkMaxCellEntriesRange(value);
    }
        this._maxCellEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXCHANNELENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXCHANNELENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxChannelEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXCHANNELENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXCHANNELENTRIESRANGE_RANGES)));
     }
    
    public RemCdma2000OneXBuilder setMaxChannelEntries(final BigInteger value) {
    if (value != null) {
        checkMaxChannelEntriesRange(value);
    }
        this._maxChannelEntries = value;
        return this;
    }
    
     
    public RemCdma2000OneXBuilder setRemCdma2000OneXCell(final List<RemCdma2000OneXCell> value) {
        this._remCdma2000OneXCell = value;
        return this;
    }
    
     
    public RemCdma2000OneXBuilder setRemCdma2000OneXChannel(final List<RemCdma2000OneXChannel> value) {
        this._remCdma2000OneXChannel = value;
        return this;
    }
    
    public RemCdma2000OneXBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemCdma2000OneXBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemCdma2000OneX build() {
        return new RemCdma2000OneXImpl(this);
    }

    private static final class RemCdma2000OneXImpl implements RemCdma2000OneX {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX.class;
        }

        private final BigInteger _cellNumberOfEntries;
        private final BigInteger _channelNumberOfEntries;
        private final BigInteger _maxCellEntries;
        private final BigInteger _maxChannelEntries;
        private final List<RemCdma2000OneXCell> _remCdma2000OneXCell;
        private final List<RemCdma2000OneXChannel> _remCdma2000OneXChannel;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>> augmentation = Collections.emptyMap();

        private RemCdma2000OneXImpl(RemCdma2000OneXBuilder base) {
            this._cellNumberOfEntries = base.getCellNumberOfEntries();
            this._channelNumberOfEntries = base.getChannelNumberOfEntries();
            this._maxCellEntries = base.getMaxCellEntries();
            this._maxChannelEntries = base.getMaxChannelEntries();
            this._remCdma2000OneXCell = base.getRemCdma2000OneXCell();
            this._remCdma2000OneXChannel = base.getRemCdma2000OneXChannel();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getCellNumberOfEntries() {
            return _cellNumberOfEntries;
        }
        
        @Override
        public BigInteger getChannelNumberOfEntries() {
            return _channelNumberOfEntries;
        }
        
        @Override
        public BigInteger getMaxCellEntries() {
            return _maxCellEntries;
        }
        
        @Override
        public BigInteger getMaxChannelEntries() {
            return _maxChannelEntries;
        }
        
        @Override
        public List<RemCdma2000OneXCell> getRemCdma2000OneXCell() {
            return _remCdma2000OneXCell;
        }
        
        @Override
        public List<RemCdma2000OneXChannel> getRemCdma2000OneXChannel() {
            return _remCdma2000OneXChannel;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cellNumberOfEntries);
            result = prime * result + Objects.hashCode(_channelNumberOfEntries);
            result = prime * result + Objects.hashCode(_maxCellEntries);
            result = prime * result + Objects.hashCode(_maxChannelEntries);
            result = prime * result + Objects.hashCode(_remCdma2000OneXCell);
            result = prime * result + Objects.hashCode(_remCdma2000OneXChannel);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX)obj;
            if (!Objects.equals(_cellNumberOfEntries, other.getCellNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_channelNumberOfEntries, other.getChannelNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_maxCellEntries, other.getMaxCellEntries())) {
                return false;
            }
            if (!Objects.equals(_maxChannelEntries, other.getMaxChannelEntries())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000OneXCell, other.getRemCdma2000OneXCell())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000OneXChannel, other.getRemCdma2000OneXChannel())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemCdma2000OneXImpl otherImpl = (RemCdma2000OneXImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemCdma2000OneX [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cellNumberOfEntries != null) {
                builder.append("_cellNumberOfEntries=");
                builder.append(_cellNumberOfEntries);
                builder.append(", ");
            }
            if (_channelNumberOfEntries != null) {
                builder.append("_channelNumberOfEntries=");
                builder.append(_channelNumberOfEntries);
                builder.append(", ");
            }
            if (_maxCellEntries != null) {
                builder.append("_maxCellEntries=");
                builder.append(_maxCellEntries);
                builder.append(", ");
            }
            if (_maxChannelEntries != null) {
                builder.append("_maxChannelEntries=");
                builder.append(_maxChannelEntries);
                builder.append(", ");
            }
            if (_remCdma2000OneXCell != null) {
                builder.append("_remCdma2000OneXCell=");
                builder.append(_remCdma2000OneXCell);
                builder.append(", ");
            }
            if (_remCdma2000OneXChannel != null) {
                builder.append("_remCdma2000OneXChannel=");
                builder.append(_remCdma2000OneXChannel);
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
