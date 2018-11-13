package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG.DuplexMode;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG.GsmRxBandsSupported;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts
 *
 */
public class CapabilitiesUmtsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts> {

    private CapabilitiesUmtsSelfConfig _capabilitiesUmtsSelfConfig;
    private DuplexMode _duplexMode;
    private List<java.lang.String> _fddBandsSupported;
    private List<GsmRxBandsSupported> _gsmRxBandsSupported;
    private BigInteger _maxHsdpaDataRateSupported;
    private java.lang.Short _maxHspdscHsSupported;
    private BigInteger _maxHssccHsSupported;
    private BigInteger _maxHsupaDataRateSupported;
    private java.lang.Boolean _gsmRxSupported;
    private java.lang.Boolean _hsdpaSupported;
    private java.lang.Boolean _hsupaSupported;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>> augmentation = Collections.emptyMap();

    public CapabilitiesUmtsBuilder() {
    }
    public CapabilitiesUmtsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG arg) {
        this._duplexMode = arg.getDuplexMode();
        this._gsmRxSupported = arg.isGsmRxSupported();
        this._hsdpaSupported = arg.isHsdpaSupported();
        this._maxHsdpaDataRateSupported = arg.getMaxHsdpaDataRateSupported();
        this._hsupaSupported = arg.isHsupaSupported();
        this._maxHsupaDataRateSupported = arg.getMaxHsupaDataRateSupported();
        this._maxHspdscHsSupported = arg.getMaxHspdscHsSupported();
        this._maxHssccHsSupported = arg.getMaxHssccHsSupported();
        this._fddBandsSupported = arg.getFddBandsSupported();
        this._gsmRxBandsSupported = arg.getGsmRxBandsSupported();
    }

    public CapabilitiesUmtsBuilder(CapabilitiesUmts base) {
        this._capabilitiesUmtsSelfConfig = base.getCapabilitiesUmtsSelfConfig();
        this._duplexMode = base.getDuplexMode();
        this._fddBandsSupported = base.getFddBandsSupported();
        this._gsmRxBandsSupported = base.getGsmRxBandsSupported();
        this._maxHsdpaDataRateSupported = base.getMaxHsdpaDataRateSupported();
        this._maxHspdscHsSupported = base.getMaxHspdscHsSupported();
        this._maxHssccHsSupported = base.getMaxHssccHsSupported();
        this._maxHsupaDataRateSupported = base.getMaxHsupaDataRateSupported();
        this._gsmRxSupported = base.isGsmRxSupported();
        this._hsdpaSupported = base.isHsdpaSupported();
        this._hsupaSupported = base.isHsupaSupported();
        if (base instanceof CapabilitiesUmtsImpl) {
            CapabilitiesUmtsImpl impl = (CapabilitiesUmtsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG) {
            this._duplexMode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG)arg).getDuplexMode();
            this._gsmRxSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG)arg).isGsmRxSupported();
            this._hsdpaSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG)arg).isHsdpaSupported();
            this._maxHsdpaDataRateSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG)arg).getMaxHsdpaDataRateSupported();
            this._hsupaSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG)arg).isHsupaSupported();
            this._maxHsupaDataRateSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG)arg).getMaxHsupaDataRateSupported();
            this._maxHspdscHsSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG)arg).getMaxHspdscHsSupported();
            this._maxHssccHsSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG)arg).getMaxHssccHsSupported();
            this._fddBandsSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG)arg).getFddBandsSupported();
            this._gsmRxBandsSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG)arg).getGsmRxBandsSupported();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG] \n" +
              "but was: " + arg
            );
        }
    }

    public CapabilitiesUmtsSelfConfig getCapabilitiesUmtsSelfConfig() {
        return _capabilitiesUmtsSelfConfig;
    }
    
    public DuplexMode getDuplexMode() {
        return _duplexMode;
    }
    
    public List<java.lang.String> getFddBandsSupported() {
        return _fddBandsSupported;
    }
    
    public List<GsmRxBandsSupported> getGsmRxBandsSupported() {
        return _gsmRxBandsSupported;
    }
    
    public BigInteger getMaxHsdpaDataRateSupported() {
        return _maxHsdpaDataRateSupported;
    }
    
    public java.lang.Short getMaxHspdscHsSupported() {
        return _maxHspdscHsSupported;
    }
    
    public BigInteger getMaxHssccHsSupported() {
        return _maxHssccHsSupported;
    }
    
    public BigInteger getMaxHsupaDataRateSupported() {
        return _maxHsupaDataRateSupported;
    }
    
    public java.lang.Boolean isGsmRxSupported() {
        return _gsmRxSupported;
    }
    
    public java.lang.Boolean isHsdpaSupported() {
        return _hsdpaSupported;
    }
    
    public java.lang.Boolean isHsupaSupported() {
        return _hsupaSupported;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CapabilitiesUmtsBuilder setCapabilitiesUmtsSelfConfig(final CapabilitiesUmtsSelfConfig value) {
        this._capabilitiesUmtsSelfConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsBuilder setDuplexMode(final DuplexMode value) {
        this._duplexMode = value;
        return this;
    }
    
     
    public CapabilitiesUmtsBuilder setFddBandsSupported(final List<java.lang.String> value) {
        this._fddBandsSupported = value;
        return this;
    }
    
     
    public CapabilitiesUmtsBuilder setGsmRxBandsSupported(final List<GsmRxBandsSupported> value) {
        this._gsmRxBandsSupported = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXHSDPADATARATESUPPORTEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXHSDPADATARATESUPPORTEDRANGE_RANGES = a;
     }
     private static void checkMaxHsdpaDataRateSupportedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXHSDPADATARATESUPPORTEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXHSDPADATARATESUPPORTEDRANGE_RANGES)));
     }
    
    public CapabilitiesUmtsBuilder setMaxHsdpaDataRateSupported(final BigInteger value) {
    if (value != null) {
        checkMaxHsdpaDataRateSupportedRange(value);
    }
        this._maxHsdpaDataRateSupported = value;
        return this;
    }
    
     
     private static void checkMaxHspdscHsSupportedRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public CapabilitiesUmtsBuilder setMaxHspdscHsSupported(final java.lang.Short value) {
    if (value != null) {
        checkMaxHspdscHsSupportedRange(value);
    }
        this._maxHspdscHsSupported = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXHSSCCHSSUPPORTEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXHSSCCHSSUPPORTEDRANGE_RANGES = a;
     }
     private static void checkMaxHssccHsSupportedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXHSSCCHSSUPPORTEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXHSSCCHSSUPPORTEDRANGE_RANGES)));
     }
    
    public CapabilitiesUmtsBuilder setMaxHssccHsSupported(final BigInteger value) {
    if (value != null) {
        checkMaxHssccHsSupportedRange(value);
    }
        this._maxHssccHsSupported = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXHSUPADATARATESUPPORTEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXHSUPADATARATESUPPORTEDRANGE_RANGES = a;
     }
     private static void checkMaxHsupaDataRateSupportedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXHSUPADATARATESUPPORTEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXHSUPADATARATESUPPORTEDRANGE_RANGES)));
     }
    
    public CapabilitiesUmtsBuilder setMaxHsupaDataRateSupported(final BigInteger value) {
    if (value != null) {
        checkMaxHsupaDataRateSupportedRange(value);
    }
        this._maxHsupaDataRateSupported = value;
        return this;
    }
    
     
    public CapabilitiesUmtsBuilder setGsmRxSupported(final java.lang.Boolean value) {
        this._gsmRxSupported = value;
        return this;
    }
    
     
    public CapabilitiesUmtsBuilder setHsdpaSupported(final java.lang.Boolean value) {
        this._hsdpaSupported = value;
        return this;
    }
    
     
    public CapabilitiesUmtsBuilder setHsupaSupported(final java.lang.Boolean value) {
        this._hsupaSupported = value;
        return this;
    }
    
    public CapabilitiesUmtsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CapabilitiesUmtsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CapabilitiesUmts build() {
        return new CapabilitiesUmtsImpl(this);
    }

    private static final class CapabilitiesUmtsImpl implements CapabilitiesUmts {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts.class;
        }

        private final CapabilitiesUmtsSelfConfig _capabilitiesUmtsSelfConfig;
        private final DuplexMode _duplexMode;
        private final List<java.lang.String> _fddBandsSupported;
        private final List<GsmRxBandsSupported> _gsmRxBandsSupported;
        private final BigInteger _maxHsdpaDataRateSupported;
        private final java.lang.Short _maxHspdscHsSupported;
        private final BigInteger _maxHssccHsSupported;
        private final BigInteger _maxHsupaDataRateSupported;
        private final java.lang.Boolean _gsmRxSupported;
        private final java.lang.Boolean _hsdpaSupported;
        private final java.lang.Boolean _hsupaSupported;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>> augmentation = Collections.emptyMap();

        private CapabilitiesUmtsImpl(CapabilitiesUmtsBuilder base) {
            this._capabilitiesUmtsSelfConfig = base.getCapabilitiesUmtsSelfConfig();
            this._duplexMode = base.getDuplexMode();
            this._fddBandsSupported = base.getFddBandsSupported();
            this._gsmRxBandsSupported = base.getGsmRxBandsSupported();
            this._maxHsdpaDataRateSupported = base.getMaxHsdpaDataRateSupported();
            this._maxHspdscHsSupported = base.getMaxHspdscHsSupported();
            this._maxHssccHsSupported = base.getMaxHssccHsSupported();
            this._maxHsupaDataRateSupported = base.getMaxHsupaDataRateSupported();
            this._gsmRxSupported = base.isGsmRxSupported();
            this._hsdpaSupported = base.isHsdpaSupported();
            this._hsupaSupported = base.isHsupaSupported();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CapabilitiesUmtsSelfConfig getCapabilitiesUmtsSelfConfig() {
            return _capabilitiesUmtsSelfConfig;
        }
        
        @Override
        public DuplexMode getDuplexMode() {
            return _duplexMode;
        }
        
        @Override
        public List<java.lang.String> getFddBandsSupported() {
            return _fddBandsSupported;
        }
        
        @Override
        public List<GsmRxBandsSupported> getGsmRxBandsSupported() {
            return _gsmRxBandsSupported;
        }
        
        @Override
        public BigInteger getMaxHsdpaDataRateSupported() {
            return _maxHsdpaDataRateSupported;
        }
        
        @Override
        public java.lang.Short getMaxHspdscHsSupported() {
            return _maxHspdscHsSupported;
        }
        
        @Override
        public BigInteger getMaxHssccHsSupported() {
            return _maxHssccHsSupported;
        }
        
        @Override
        public BigInteger getMaxHsupaDataRateSupported() {
            return _maxHsupaDataRateSupported;
        }
        
        @Override
        public java.lang.Boolean isGsmRxSupported() {
            return _gsmRxSupported;
        }
        
        @Override
        public java.lang.Boolean isHsdpaSupported() {
            return _hsdpaSupported;
        }
        
        @Override
        public java.lang.Boolean isHsupaSupported() {
            return _hsupaSupported;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_capabilitiesUmtsSelfConfig);
            result = prime * result + Objects.hashCode(_duplexMode);
            result = prime * result + Objects.hashCode(_fddBandsSupported);
            result = prime * result + Objects.hashCode(_gsmRxBandsSupported);
            result = prime * result + Objects.hashCode(_maxHsdpaDataRateSupported);
            result = prime * result + Objects.hashCode(_maxHspdscHsSupported);
            result = prime * result + Objects.hashCode(_maxHssccHsSupported);
            result = prime * result + Objects.hashCode(_maxHsupaDataRateSupported);
            result = prime * result + Objects.hashCode(_gsmRxSupported);
            result = prime * result + Objects.hashCode(_hsdpaSupported);
            result = prime * result + Objects.hashCode(_hsupaSupported);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts)obj;
            if (!Objects.equals(_capabilitiesUmtsSelfConfig, other.getCapabilitiesUmtsSelfConfig())) {
                return false;
            }
            if (!Objects.equals(_duplexMode, other.getDuplexMode())) {
                return false;
            }
            if (!Objects.equals(_fddBandsSupported, other.getFddBandsSupported())) {
                return false;
            }
            if (!Objects.equals(_gsmRxBandsSupported, other.getGsmRxBandsSupported())) {
                return false;
            }
            if (!Objects.equals(_maxHsdpaDataRateSupported, other.getMaxHsdpaDataRateSupported())) {
                return false;
            }
            if (!Objects.equals(_maxHspdscHsSupported, other.getMaxHspdscHsSupported())) {
                return false;
            }
            if (!Objects.equals(_maxHssccHsSupported, other.getMaxHssccHsSupported())) {
                return false;
            }
            if (!Objects.equals(_maxHsupaDataRateSupported, other.getMaxHsupaDataRateSupported())) {
                return false;
            }
            if (!Objects.equals(_gsmRxSupported, other.isGsmRxSupported())) {
                return false;
            }
            if (!Objects.equals(_hsdpaSupported, other.isHsdpaSupported())) {
                return false;
            }
            if (!Objects.equals(_hsupaSupported, other.isHsupaSupported())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CapabilitiesUmtsImpl otherImpl = (CapabilitiesUmtsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CapabilitiesUmts [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_capabilitiesUmtsSelfConfig != null) {
                builder.append("_capabilitiesUmtsSelfConfig=");
                builder.append(_capabilitiesUmtsSelfConfig);
                builder.append(", ");
            }
            if (_duplexMode != null) {
                builder.append("_duplexMode=");
                builder.append(_duplexMode);
                builder.append(", ");
            }
            if (_fddBandsSupported != null) {
                builder.append("_fddBandsSupported=");
                builder.append(_fddBandsSupported);
                builder.append(", ");
            }
            if (_gsmRxBandsSupported != null) {
                builder.append("_gsmRxBandsSupported=");
                builder.append(_gsmRxBandsSupported);
                builder.append(", ");
            }
            if (_maxHsdpaDataRateSupported != null) {
                builder.append("_maxHsdpaDataRateSupported=");
                builder.append(_maxHsdpaDataRateSupported);
                builder.append(", ");
            }
            if (_maxHspdscHsSupported != null) {
                builder.append("_maxHspdscHsSupported=");
                builder.append(_maxHspdscHsSupported);
                builder.append(", ");
            }
            if (_maxHssccHsSupported != null) {
                builder.append("_maxHssccHsSupported=");
                builder.append(_maxHssccHsSupported);
                builder.append(", ");
            }
            if (_maxHsupaDataRateSupported != null) {
                builder.append("_maxHsupaDataRateSupported=");
                builder.append(_maxHsupaDataRateSupported);
                builder.append(", ");
            }
            if (_gsmRxSupported != null) {
                builder.append("_gsmRxSupported=");
                builder.append(_gsmRxSupported);
                builder.append(", ");
            }
            if (_hsdpaSupported != null) {
                builder.append("_hsdpaSupported=");
                builder.append(_hsdpaSupported);
                builder.append(", ");
            }
            if (_hsupaSupported != null) {
                builder.append("_hsupaSupported=");
                builder.append(_hsupaSupported);
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
