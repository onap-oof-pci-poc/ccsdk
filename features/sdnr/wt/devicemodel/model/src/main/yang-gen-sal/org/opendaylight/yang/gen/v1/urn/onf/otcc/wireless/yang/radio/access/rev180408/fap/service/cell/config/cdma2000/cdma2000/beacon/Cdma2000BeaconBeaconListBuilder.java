package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG.TransmissionFormat;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList
 *
 */
public class Cdma2000BeaconBeaconListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList> {

    private java.lang.String _alias;
    private java.lang.Long _beaconBandClass;
    private java.lang.Integer _beaconChannelFreq;
    private java.lang.Long _beaconIndex;
    private java.lang.Integer _beaconNid;
    private List<java.lang.String> _beaconPnOffset;
    private BigInteger _beaconPzid;
    private java.lang.Integer _beaconSid;
    private java.lang.Integer _duration;
    private Cdma2000BeaconBeaconListKey _key;
    private java.lang.Integer _offset;
    private TransmissionFormat _transmissionFormat;
    private java.lang.Long _txPower;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>> augmentation = Collections.emptyMap();

    public Cdma2000BeaconBeaconListBuilder() {
    }
    public Cdma2000BeaconBeaconListBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._beaconIndex = arg.getBeaconIndex();
        this._offset = arg.getOffset();
        this._duration = arg.getDuration();
        this._transmissionFormat = arg.getTransmissionFormat();
        this._beaconBandClass = arg.getBeaconBandClass();
        this._beaconChannelFreq = arg.getBeaconChannelFreq();
        this._beaconPnOffset = arg.getBeaconPnOffset();
        this._txPower = arg.getTxPower();
        this._beaconSid = arg.getBeaconSid();
        this._beaconNid = arg.getBeaconNid();
        this._beaconPzid = arg.getBeaconPzid();
    }

    public Cdma2000BeaconBeaconListBuilder(Cdma2000BeaconBeaconList base) {
        if (base.getKey() == null) {
            this._key = new Cdma2000BeaconBeaconListKey(
                base.getBeaconIndex()
            );
            this._beaconIndex = base.getBeaconIndex();
        } else {
            this._key = base.getKey();
            this._beaconIndex = _key.getBeaconIndex();
        }
        this._alias = base.getAlias();
        this._beaconBandClass = base.getBeaconBandClass();
        this._beaconChannelFreq = base.getBeaconChannelFreq();
        this._beaconNid = base.getBeaconNid();
        this._beaconPnOffset = base.getBeaconPnOffset();
        this._beaconPzid = base.getBeaconPzid();
        this._beaconSid = base.getBeaconSid();
        this._duration = base.getDuration();
        this._offset = base.getOffset();
        this._transmissionFormat = base.getTransmissionFormat();
        this._txPower = base.getTxPower();
        this._enable = base.isEnable();
        if (base instanceof Cdma2000BeaconBeaconListImpl) {
            Cdma2000BeaconBeaconListImpl impl = (Cdma2000BeaconBeaconListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getAlias();
            this._beaconIndex = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getBeaconIndex();
            this._offset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getOffset();
            this._duration = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getDuration();
            this._transmissionFormat = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getTransmissionFormat();
            this._beaconBandClass = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getBeaconBandClass();
            this._beaconChannelFreq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getBeaconChannelFreq();
            this._beaconPnOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getBeaconPnOffset();
            this._txPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getTxPower();
            this._beaconSid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getBeaconSid();
            this._beaconNid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getBeaconNid();
            this._beaconPzid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG)arg).getBeaconPzid();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.Long getBeaconBandClass() {
        return _beaconBandClass;
    }
    
    public java.lang.Integer getBeaconChannelFreq() {
        return _beaconChannelFreq;
    }
    
    public java.lang.Long getBeaconIndex() {
        return _beaconIndex;
    }
    
    public java.lang.Integer getBeaconNid() {
        return _beaconNid;
    }
    
    public List<java.lang.String> getBeaconPnOffset() {
        return _beaconPnOffset;
    }
    
    public BigInteger getBeaconPzid() {
        return _beaconPzid;
    }
    
    public java.lang.Integer getBeaconSid() {
        return _beaconSid;
    }
    
    public java.lang.Integer getDuration() {
        return _duration;
    }
    
    public Cdma2000BeaconBeaconListKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getOffset() {
        return _offset;
    }
    
    public TransmissionFormat getTransmissionFormat() {
        return _transmissionFormat;
    }
    
    public java.lang.Long getTxPower() {
        return _txPower;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public Cdma2000BeaconBeaconListBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public Cdma2000BeaconBeaconListBuilder setBeaconBandClass(final java.lang.Long value) {
        this._beaconBandClass = value;
        return this;
    }
    
     
     private static void checkBeaconChannelFreqRange(final int value) {
         if (value >= 0 && value <= 2016) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..2016]].", value));
     }
    
    public Cdma2000BeaconBeaconListBuilder setBeaconChannelFreq(final java.lang.Integer value) {
    if (value != null) {
        checkBeaconChannelFreqRange(value);
    }
        this._beaconChannelFreq = value;
        return this;
    }
    
     
    public Cdma2000BeaconBeaconListBuilder setBeaconIndex(final java.lang.Long value) {
        this._beaconIndex = value;
        return this;
    }
    
     
     private static void checkBeaconNidRange(final int value) {
         if (value >= 0 && value <= 32767) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..32767]].", value));
     }
    
    public Cdma2000BeaconBeaconListBuilder setBeaconNid(final java.lang.Integer value) {
    if (value != null) {
        checkBeaconNidRange(value);
    }
        this._beaconNid = value;
        return this;
    }
    
     
    public Cdma2000BeaconBeaconListBuilder setBeaconPnOffset(final List<java.lang.String> value) {
        this._beaconPnOffset = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKBEACONPZIDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKBEACONPZIDRANGE_RANGES = a;
     }
     private static void checkBeaconPzidRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKBEACONPZIDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKBEACONPZIDRANGE_RANGES)));
     }
    
    public Cdma2000BeaconBeaconListBuilder setBeaconPzid(final BigInteger value) {
    if (value != null) {
        checkBeaconPzidRange(value);
    }
        this._beaconPzid = value;
        return this;
    }
    
     
     private static void checkBeaconSidRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public Cdma2000BeaconBeaconListBuilder setBeaconSid(final java.lang.Integer value) {
    if (value != null) {
        checkBeaconSidRange(value);
    }
        this._beaconSid = value;
        return this;
    }
    
     
     private static void checkDurationRange(final int value) {
         if (value >= 0 && value <= 32767) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..32767]].", value));
     }
    
    public Cdma2000BeaconBeaconListBuilder setDuration(final java.lang.Integer value) {
    if (value != null) {
        checkDurationRange(value);
    }
        this._duration = value;
        return this;
    }
    
     
    public Cdma2000BeaconBeaconListBuilder setKey(final Cdma2000BeaconBeaconListKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkOffsetRange(final int value) {
         if (value >= 0 && value <= 32767) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..32767]].", value));
     }
    
    public Cdma2000BeaconBeaconListBuilder setOffset(final java.lang.Integer value) {
    if (value != null) {
        checkOffsetRange(value);
    }
        this._offset = value;
        return this;
    }
    
     
    public Cdma2000BeaconBeaconListBuilder setTransmissionFormat(final TransmissionFormat value) {
        this._transmissionFormat = value;
        return this;
    }
    
     
    public Cdma2000BeaconBeaconListBuilder setTxPower(final java.lang.Long value) {
        this._txPower = value;
        return this;
    }
    
     
    public Cdma2000BeaconBeaconListBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public Cdma2000BeaconBeaconListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000BeaconBeaconListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000BeaconBeaconList build() {
        return new Cdma2000BeaconBeaconListImpl(this);
    }

    private static final class Cdma2000BeaconBeaconListImpl implements Cdma2000BeaconBeaconList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList.class;
        }

        private final java.lang.String _alias;
        private final java.lang.Long _beaconBandClass;
        private final java.lang.Integer _beaconChannelFreq;
        private final java.lang.Long _beaconIndex;
        private final java.lang.Integer _beaconNid;
        private final List<java.lang.String> _beaconPnOffset;
        private final BigInteger _beaconPzid;
        private final java.lang.Integer _beaconSid;
        private final java.lang.Integer _duration;
        private final Cdma2000BeaconBeaconListKey _key;
        private final java.lang.Integer _offset;
        private final TransmissionFormat _transmissionFormat;
        private final java.lang.Long _txPower;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>> augmentation = Collections.emptyMap();

        private Cdma2000BeaconBeaconListImpl(Cdma2000BeaconBeaconListBuilder base) {
            if (base.getKey() == null) {
                this._key = new Cdma2000BeaconBeaconListKey(
                    base.getBeaconIndex()
                );
                this._beaconIndex = base.getBeaconIndex();
            } else {
                this._key = base.getKey();
                this._beaconIndex = _key.getBeaconIndex();
            }
            this._alias = base.getAlias();
            this._beaconBandClass = base.getBeaconBandClass();
            this._beaconChannelFreq = base.getBeaconChannelFreq();
            this._beaconNid = base.getBeaconNid();
            this._beaconPnOffset = base.getBeaconPnOffset();
            this._beaconPzid = base.getBeaconPzid();
            this._beaconSid = base.getBeaconSid();
            this._duration = base.getDuration();
            this._offset = base.getOffset();
            this._transmissionFormat = base.getTransmissionFormat();
            this._txPower = base.getTxPower();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Long getBeaconBandClass() {
            return _beaconBandClass;
        }
        
        @Override
        public java.lang.Integer getBeaconChannelFreq() {
            return _beaconChannelFreq;
        }
        
        @Override
        public java.lang.Long getBeaconIndex() {
            return _beaconIndex;
        }
        
        @Override
        public java.lang.Integer getBeaconNid() {
            return _beaconNid;
        }
        
        @Override
        public List<java.lang.String> getBeaconPnOffset() {
            return _beaconPnOffset;
        }
        
        @Override
        public BigInteger getBeaconPzid() {
            return _beaconPzid;
        }
        
        @Override
        public java.lang.Integer getBeaconSid() {
            return _beaconSid;
        }
        
        @Override
        public java.lang.Integer getDuration() {
            return _duration;
        }
        
        @Override
        public Cdma2000BeaconBeaconListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getOffset() {
            return _offset;
        }
        
        @Override
        public TransmissionFormat getTransmissionFormat() {
            return _transmissionFormat;
        }
        
        @Override
        public java.lang.Long getTxPower() {
            return _txPower;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_beaconBandClass);
            result = prime * result + Objects.hashCode(_beaconChannelFreq);
            result = prime * result + Objects.hashCode(_beaconIndex);
            result = prime * result + Objects.hashCode(_beaconNid);
            result = prime * result + Objects.hashCode(_beaconPnOffset);
            result = prime * result + Objects.hashCode(_beaconPzid);
            result = prime * result + Objects.hashCode(_beaconSid);
            result = prime * result + Objects.hashCode(_duration);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_offset);
            result = prime * result + Objects.hashCode(_transmissionFormat);
            result = prime * result + Objects.hashCode(_txPower);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_beaconBandClass, other.getBeaconBandClass())) {
                return false;
            }
            if (!Objects.equals(_beaconChannelFreq, other.getBeaconChannelFreq())) {
                return false;
            }
            if (!Objects.equals(_beaconIndex, other.getBeaconIndex())) {
                return false;
            }
            if (!Objects.equals(_beaconNid, other.getBeaconNid())) {
                return false;
            }
            if (!Objects.equals(_beaconPnOffset, other.getBeaconPnOffset())) {
                return false;
            }
            if (!Objects.equals(_beaconPzid, other.getBeaconPzid())) {
                return false;
            }
            if (!Objects.equals(_beaconSid, other.getBeaconSid())) {
                return false;
            }
            if (!Objects.equals(_duration, other.getDuration())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_offset, other.getOffset())) {
                return false;
            }
            if (!Objects.equals(_transmissionFormat, other.getTransmissionFormat())) {
                return false;
            }
            if (!Objects.equals(_txPower, other.getTxPower())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000BeaconBeaconListImpl otherImpl = (Cdma2000BeaconBeaconListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000BeaconBeaconList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_beaconBandClass != null) {
                builder.append("_beaconBandClass=");
                builder.append(_beaconBandClass);
                builder.append(", ");
            }
            if (_beaconChannelFreq != null) {
                builder.append("_beaconChannelFreq=");
                builder.append(_beaconChannelFreq);
                builder.append(", ");
            }
            if (_beaconIndex != null) {
                builder.append("_beaconIndex=");
                builder.append(_beaconIndex);
                builder.append(", ");
            }
            if (_beaconNid != null) {
                builder.append("_beaconNid=");
                builder.append(_beaconNid);
                builder.append(", ");
            }
            if (_beaconPnOffset != null) {
                builder.append("_beaconPnOffset=");
                builder.append(_beaconPnOffset);
                builder.append(", ");
            }
            if (_beaconPzid != null) {
                builder.append("_beaconPzid=");
                builder.append(_beaconPzid);
                builder.append(", ");
            }
            if (_beaconSid != null) {
                builder.append("_beaconSid=");
                builder.append(_beaconSid);
                builder.append(", ");
            }
            if (_duration != null) {
                builder.append("_duration=");
                builder.append(_duration);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_offset != null) {
                builder.append("_offset=");
                builder.append(_offset);
                builder.append(", ");
            }
            if (_transmissionFormat != null) {
                builder.append("_transmissionFormat=");
                builder.append(_transmissionFormat);
                builder.append(", ");
            }
            if (_txPower != null) {
                builder.append("_txPower=");
                builder.append(_txPower);
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
