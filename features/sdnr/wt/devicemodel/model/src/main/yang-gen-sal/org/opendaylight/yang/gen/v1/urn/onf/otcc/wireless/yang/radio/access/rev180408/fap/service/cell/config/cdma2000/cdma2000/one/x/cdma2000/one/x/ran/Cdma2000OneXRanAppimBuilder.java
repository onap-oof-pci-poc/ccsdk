package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
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
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim
 *
 */
public class Cdma2000OneXRanAppimBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim> {

    private BigInteger _appirecNumberOfEntries;
    private List<Cdma2000OneXRanAppimAppirec> _cdma2000OneXRanAppimAppirec;
    private java.lang.Short _lifetime;
    private java.lang.Integer _numappirec;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanAppimBuilder() {
    }
    public Cdma2000OneXRanAppimBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimG arg) {
        this._lifetime = arg.getLifetime();
        this._numappirec = arg.getNumappirec();
        this._appirecNumberOfEntries = arg.getAppirecNumberOfEntries();
    }

    public Cdma2000OneXRanAppimBuilder(Cdma2000OneXRanAppim base) {
        this._appirecNumberOfEntries = base.getAppirecNumberOfEntries();
        this._cdma2000OneXRanAppimAppirec = base.getCdma2000OneXRanAppimAppirec();
        this._lifetime = base.getLifetime();
        this._numappirec = base.getNumappirec();
        if (base instanceof Cdma2000OneXRanAppimImpl) {
            Cdma2000OneXRanAppimImpl impl = (Cdma2000OneXRanAppimImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimG) {
            this._lifetime = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimG)arg).getLifetime();
            this._numappirec = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimG)arg).getNumappirec();
            this._appirecNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimG)arg).getAppirecNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getAppirecNumberOfEntries() {
        return _appirecNumberOfEntries;
    }
    
    public List<Cdma2000OneXRanAppimAppirec> getCdma2000OneXRanAppimAppirec() {
        return _cdma2000OneXRanAppimAppirec;
    }
    
    public java.lang.Short getLifetime() {
        return _lifetime;
    }
    
    public java.lang.Integer getNumappirec() {
        return _numappirec;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKAPPIRECNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKAPPIRECNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkAppirecNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKAPPIRECNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKAPPIRECNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public Cdma2000OneXRanAppimBuilder setAppirecNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkAppirecNumberOfEntriesRange(value);
    }
        this._appirecNumberOfEntries = value;
        return this;
    }
    
     
    public Cdma2000OneXRanAppimBuilder setCdma2000OneXRanAppimAppirec(final List<Cdma2000OneXRanAppimAppirec> value) {
        this._cdma2000OneXRanAppimAppirec = value;
        return this;
    }
    
     
     private static void checkLifetimeRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public Cdma2000OneXRanAppimBuilder setLifetime(final java.lang.Short value) {
    if (value != null) {
        checkLifetimeRange(value);
    }
        this._lifetime = value;
        return this;
    }
    
     
     private static void checkNumappirecRange(final int value) {
         if (value >= 0 && value <= 511) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..511]].", value));
     }
    
    public Cdma2000OneXRanAppimBuilder setNumappirec(final java.lang.Integer value) {
    if (value != null) {
        checkNumappirecRange(value);
    }
        this._numappirec = value;
        return this;
    }
    
    public Cdma2000OneXRanAppimBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanAppimBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanAppim build() {
        return new Cdma2000OneXRanAppimImpl(this);
    }

    private static final class Cdma2000OneXRanAppimImpl implements Cdma2000OneXRanAppim {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim.class;
        }

        private final BigInteger _appirecNumberOfEntries;
        private final List<Cdma2000OneXRanAppimAppirec> _cdma2000OneXRanAppimAppirec;
        private final java.lang.Short _lifetime;
        private final java.lang.Integer _numappirec;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanAppimImpl(Cdma2000OneXRanAppimBuilder base) {
            this._appirecNumberOfEntries = base.getAppirecNumberOfEntries();
            this._cdma2000OneXRanAppimAppirec = base.getCdma2000OneXRanAppimAppirec();
            this._lifetime = base.getLifetime();
            this._numappirec = base.getNumappirec();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getAppirecNumberOfEntries() {
            return _appirecNumberOfEntries;
        }
        
        @Override
        public List<Cdma2000OneXRanAppimAppirec> getCdma2000OneXRanAppimAppirec() {
            return _cdma2000OneXRanAppimAppirec;
        }
        
        @Override
        public java.lang.Short getLifetime() {
            return _lifetime;
        }
        
        @Override
        public java.lang.Integer getNumappirec() {
            return _numappirec;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_appirecNumberOfEntries);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanAppimAppirec);
            result = prime * result + Objects.hashCode(_lifetime);
            result = prime * result + Objects.hashCode(_numappirec);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim)obj;
            if (!Objects.equals(_appirecNumberOfEntries, other.getAppirecNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanAppimAppirec, other.getCdma2000OneXRanAppimAppirec())) {
                return false;
            }
            if (!Objects.equals(_lifetime, other.getLifetime())) {
                return false;
            }
            if (!Objects.equals(_numappirec, other.getNumappirec())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanAppimImpl otherImpl = (Cdma2000OneXRanAppimImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanAppim [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_appirecNumberOfEntries != null) {
                builder.append("_appirecNumberOfEntries=");
                builder.append(_appirecNumberOfEntries);
                builder.append(", ");
            }
            if (_cdma2000OneXRanAppimAppirec != null) {
                builder.append("_cdma2000OneXRanAppimAppirec=");
                builder.append(_cdma2000OneXRanAppimAppirec);
                builder.append(", ");
            }
            if (_lifetime != null) {
                builder.append("_lifetime=");
                builder.append(_lifetime);
                builder.append(", ");
            }
            if (_numappirec != null) {
                builder.append("_numappirec=");
                builder.append(_numappirec);
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
