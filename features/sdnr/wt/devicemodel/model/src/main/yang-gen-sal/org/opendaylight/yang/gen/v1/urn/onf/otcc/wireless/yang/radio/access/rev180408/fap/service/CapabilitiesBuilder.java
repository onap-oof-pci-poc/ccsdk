package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesG.SupportedSystems;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities
 *
 */
public class CapabilitiesBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities> {

    private CapabilitiesCdma2000 _capabilitiesCdma2000;
    private CapabilitiesLte _capabilitiesLte;
    private CapabilitiesUmts _capabilitiesUmts;
    private BigInteger _maxTxPower;
    private List<SupportedSystems> _supportedSystems;
    private java.lang.Boolean _beacon;
    private java.lang.Boolean _gpsEquipped;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>> augmentation = Collections.emptyMap();

    public CapabilitiesBuilder() {
    }
    public CapabilitiesBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesG arg) {
        this._gpsEquipped = arg.isGpsEquipped();
        this._maxTxPower = arg.getMaxTxPower();
        this._supportedSystems = arg.getSupportedSystems();
        this._beacon = arg.isBeacon();
    }

    public CapabilitiesBuilder(Capabilities base) {
        this._capabilitiesCdma2000 = base.getCapabilitiesCdma2000();
        this._capabilitiesLte = base.getCapabilitiesLte();
        this._capabilitiesUmts = base.getCapabilitiesUmts();
        this._maxTxPower = base.getMaxTxPower();
        this._supportedSystems = base.getSupportedSystems();
        this._beacon = base.isBeacon();
        this._gpsEquipped = base.isGpsEquipped();
        if (base instanceof CapabilitiesImpl) {
            CapabilitiesImpl impl = (CapabilitiesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesG) {
            this._gpsEquipped = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesG)arg).isGpsEquipped();
            this._maxTxPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesG)arg).getMaxTxPower();
            this._supportedSystems = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesG)arg).getSupportedSystems();
            this._beacon = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesG)arg).isBeacon();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesG] \n" +
              "but was: " + arg
            );
        }
    }

    public CapabilitiesCdma2000 getCapabilitiesCdma2000() {
        return _capabilitiesCdma2000;
    }
    
    public CapabilitiesLte getCapabilitiesLte() {
        return _capabilitiesLte;
    }
    
    public CapabilitiesUmts getCapabilitiesUmts() {
        return _capabilitiesUmts;
    }
    
    public BigInteger getMaxTxPower() {
        return _maxTxPower;
    }
    
    public List<SupportedSystems> getSupportedSystems() {
        return _supportedSystems;
    }
    
    public java.lang.Boolean isBeacon() {
        return _beacon;
    }
    
    public java.lang.Boolean isGpsEquipped() {
        return _gpsEquipped;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CapabilitiesBuilder setCapabilitiesCdma2000(final CapabilitiesCdma2000 value) {
        this._capabilitiesCdma2000 = value;
        return this;
    }
    
     
    public CapabilitiesBuilder setCapabilitiesLte(final CapabilitiesLte value) {
        this._capabilitiesLte = value;
        return this;
    }
    
     
    public CapabilitiesBuilder setCapabilitiesUmts(final CapabilitiesUmts value) {
        this._capabilitiesUmts = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXTXPOWERRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXTXPOWERRANGE_RANGES = a;
     }
     private static void checkMaxTxPowerRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXTXPOWERRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXTXPOWERRANGE_RANGES)));
     }
    
    public CapabilitiesBuilder setMaxTxPower(final BigInteger value) {
    if (value != null) {
        checkMaxTxPowerRange(value);
    }
        this._maxTxPower = value;
        return this;
    }
    
     
    public CapabilitiesBuilder setSupportedSystems(final List<SupportedSystems> value) {
        this._supportedSystems = value;
        return this;
    }
    
     
    public CapabilitiesBuilder setBeacon(final java.lang.Boolean value) {
        this._beacon = value;
        return this;
    }
    
     
    public CapabilitiesBuilder setGpsEquipped(final java.lang.Boolean value) {
        this._gpsEquipped = value;
        return this;
    }
    
    public CapabilitiesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CapabilitiesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Capabilities build() {
        return new CapabilitiesImpl(this);
    }

    private static final class CapabilitiesImpl implements Capabilities {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities.class;
        }

        private final CapabilitiesCdma2000 _capabilitiesCdma2000;
        private final CapabilitiesLte _capabilitiesLte;
        private final CapabilitiesUmts _capabilitiesUmts;
        private final BigInteger _maxTxPower;
        private final List<SupportedSystems> _supportedSystems;
        private final java.lang.Boolean _beacon;
        private final java.lang.Boolean _gpsEquipped;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>> augmentation = Collections.emptyMap();

        private CapabilitiesImpl(CapabilitiesBuilder base) {
            this._capabilitiesCdma2000 = base.getCapabilitiesCdma2000();
            this._capabilitiesLte = base.getCapabilitiesLte();
            this._capabilitiesUmts = base.getCapabilitiesUmts();
            this._maxTxPower = base.getMaxTxPower();
            this._supportedSystems = base.getSupportedSystems();
            this._beacon = base.isBeacon();
            this._gpsEquipped = base.isGpsEquipped();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CapabilitiesCdma2000 getCapabilitiesCdma2000() {
            return _capabilitiesCdma2000;
        }
        
        @Override
        public CapabilitiesLte getCapabilitiesLte() {
            return _capabilitiesLte;
        }
        
        @Override
        public CapabilitiesUmts getCapabilitiesUmts() {
            return _capabilitiesUmts;
        }
        
        @Override
        public BigInteger getMaxTxPower() {
            return _maxTxPower;
        }
        
        @Override
        public List<SupportedSystems> getSupportedSystems() {
            return _supportedSystems;
        }
        
        @Override
        public java.lang.Boolean isBeacon() {
            return _beacon;
        }
        
        @Override
        public java.lang.Boolean isGpsEquipped() {
            return _gpsEquipped;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_capabilitiesCdma2000);
            result = prime * result + Objects.hashCode(_capabilitiesLte);
            result = prime * result + Objects.hashCode(_capabilitiesUmts);
            result = prime * result + Objects.hashCode(_maxTxPower);
            result = prime * result + Objects.hashCode(_supportedSystems);
            result = prime * result + Objects.hashCode(_beacon);
            result = prime * result + Objects.hashCode(_gpsEquipped);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities)obj;
            if (!Objects.equals(_capabilitiesCdma2000, other.getCapabilitiesCdma2000())) {
                return false;
            }
            if (!Objects.equals(_capabilitiesLte, other.getCapabilitiesLte())) {
                return false;
            }
            if (!Objects.equals(_capabilitiesUmts, other.getCapabilitiesUmts())) {
                return false;
            }
            if (!Objects.equals(_maxTxPower, other.getMaxTxPower())) {
                return false;
            }
            if (!Objects.equals(_supportedSystems, other.getSupportedSystems())) {
                return false;
            }
            if (!Objects.equals(_beacon, other.isBeacon())) {
                return false;
            }
            if (!Objects.equals(_gpsEquipped, other.isGpsEquipped())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CapabilitiesImpl otherImpl = (CapabilitiesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Capabilities [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_capabilitiesCdma2000 != null) {
                builder.append("_capabilitiesCdma2000=");
                builder.append(_capabilitiesCdma2000);
                builder.append(", ");
            }
            if (_capabilitiesLte != null) {
                builder.append("_capabilitiesLte=");
                builder.append(_capabilitiesLte);
                builder.append(", ");
            }
            if (_capabilitiesUmts != null) {
                builder.append("_capabilitiesUmts=");
                builder.append(_capabilitiesUmts);
                builder.append(", ");
            }
            if (_maxTxPower != null) {
                builder.append("_maxTxPower=");
                builder.append(_maxTxPower);
                builder.append(", ");
            }
            if (_supportedSystems != null) {
                builder.append("_supportedSystems=");
                builder.append(_supportedSystems);
                builder.append(", ");
            }
            if (_beacon != null) {
                builder.append("_beacon=");
                builder.append(_beacon);
                builder.append(", ");
            }
            if (_gpsEquipped != null) {
                builder.append("_gpsEquipped=");
                builder.append(_gpsEquipped);
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
