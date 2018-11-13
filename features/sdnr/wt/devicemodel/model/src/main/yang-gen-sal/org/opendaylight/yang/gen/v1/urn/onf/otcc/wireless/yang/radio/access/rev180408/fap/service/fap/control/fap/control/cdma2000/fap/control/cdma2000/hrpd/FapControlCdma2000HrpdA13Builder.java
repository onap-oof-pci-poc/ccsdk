package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13ColorCodeToUati104;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13
 *
 */
public class FapControlCdma2000HrpdA13Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13> {

    private BigInteger _colorCodeToUati104NumberOfEntries;
    private List<FapControlCdma2000HrpdA13ColorCodeToUati104> _fapControlCdma2000HrpdA13ColorCodeToUati104;
    private List<FapControlCdma2000HrpdA13HrpdSubnetToIp> _fapControlCdma2000HrpdA13HrpdSubnetToIp;
    private BigInteger _hrpdSubnetToIpNumberOfEntries;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>> augmentation = Collections.emptyMap();

    public FapControlCdma2000HrpdA13Builder() {
    }
    public FapControlCdma2000HrpdA13Builder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13G arg) {
        this._colorCodeToUati104NumberOfEntries = arg.getColorCodeToUati104NumberOfEntries();
        this._hrpdSubnetToIpNumberOfEntries = arg.getHrpdSubnetToIpNumberOfEntries();
    }

    public FapControlCdma2000HrpdA13Builder(FapControlCdma2000HrpdA13 base) {
        this._colorCodeToUati104NumberOfEntries = base.getColorCodeToUati104NumberOfEntries();
        this._fapControlCdma2000HrpdA13ColorCodeToUati104 = base.getFapControlCdma2000HrpdA13ColorCodeToUati104();
        this._fapControlCdma2000HrpdA13HrpdSubnetToIp = base.getFapControlCdma2000HrpdA13HrpdSubnetToIp();
        this._hrpdSubnetToIpNumberOfEntries = base.getHrpdSubnetToIpNumberOfEntries();
        if (base instanceof FapControlCdma2000HrpdA13Impl) {
            FapControlCdma2000HrpdA13Impl impl = (FapControlCdma2000HrpdA13Impl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13G</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13G) {
            this._colorCodeToUati104NumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13G)arg).getColorCodeToUati104NumberOfEntries();
            this._hrpdSubnetToIpNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13G)arg).getHrpdSubnetToIpNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13G] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getColorCodeToUati104NumberOfEntries() {
        return _colorCodeToUati104NumberOfEntries;
    }
    
    public List<FapControlCdma2000HrpdA13ColorCodeToUati104> getFapControlCdma2000HrpdA13ColorCodeToUati104() {
        return _fapControlCdma2000HrpdA13ColorCodeToUati104;
    }
    
    public List<FapControlCdma2000HrpdA13HrpdSubnetToIp> getFapControlCdma2000HrpdA13HrpdSubnetToIp() {
        return _fapControlCdma2000HrpdA13HrpdSubnetToIp;
    }
    
    public BigInteger getHrpdSubnetToIpNumberOfEntries() {
        return _hrpdSubnetToIpNumberOfEntries;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCOLORCODETOUATI104NUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCOLORCODETOUATI104NUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkColorCodeToUati104NumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCOLORCODETOUATI104NUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCOLORCODETOUATI104NUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public FapControlCdma2000HrpdA13Builder setColorCodeToUati104NumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkColorCodeToUati104NumberOfEntriesRange(value);
    }
        this._colorCodeToUati104NumberOfEntries = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdA13Builder setFapControlCdma2000HrpdA13ColorCodeToUati104(final List<FapControlCdma2000HrpdA13ColorCodeToUati104> value) {
        this._fapControlCdma2000HrpdA13ColorCodeToUati104 = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdA13Builder setFapControlCdma2000HrpdA13HrpdSubnetToIp(final List<FapControlCdma2000HrpdA13HrpdSubnetToIp> value) {
        this._fapControlCdma2000HrpdA13HrpdSubnetToIp = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKHRPDSUBNETTOIPNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKHRPDSUBNETTOIPNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkHrpdSubnetToIpNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKHRPDSUBNETTOIPNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKHRPDSUBNETTOIPNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public FapControlCdma2000HrpdA13Builder setHrpdSubnetToIpNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkHrpdSubnetToIpNumberOfEntriesRange(value);
    }
        this._hrpdSubnetToIpNumberOfEntries = value;
        return this;
    }
    
    public FapControlCdma2000HrpdA13Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlCdma2000HrpdA13Builder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlCdma2000HrpdA13 build() {
        return new FapControlCdma2000HrpdA13Impl(this);
    }

    private static final class FapControlCdma2000HrpdA13Impl implements FapControlCdma2000HrpdA13 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13.class;
        }

        private final BigInteger _colorCodeToUati104NumberOfEntries;
        private final List<FapControlCdma2000HrpdA13ColorCodeToUati104> _fapControlCdma2000HrpdA13ColorCodeToUati104;
        private final List<FapControlCdma2000HrpdA13HrpdSubnetToIp> _fapControlCdma2000HrpdA13HrpdSubnetToIp;
        private final BigInteger _hrpdSubnetToIpNumberOfEntries;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>> augmentation = Collections.emptyMap();

        private FapControlCdma2000HrpdA13Impl(FapControlCdma2000HrpdA13Builder base) {
            this._colorCodeToUati104NumberOfEntries = base.getColorCodeToUati104NumberOfEntries();
            this._fapControlCdma2000HrpdA13ColorCodeToUati104 = base.getFapControlCdma2000HrpdA13ColorCodeToUati104();
            this._fapControlCdma2000HrpdA13HrpdSubnetToIp = base.getFapControlCdma2000HrpdA13HrpdSubnetToIp();
            this._hrpdSubnetToIpNumberOfEntries = base.getHrpdSubnetToIpNumberOfEntries();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getColorCodeToUati104NumberOfEntries() {
            return _colorCodeToUati104NumberOfEntries;
        }
        
        @Override
        public List<FapControlCdma2000HrpdA13ColorCodeToUati104> getFapControlCdma2000HrpdA13ColorCodeToUati104() {
            return _fapControlCdma2000HrpdA13ColorCodeToUati104;
        }
        
        @Override
        public List<FapControlCdma2000HrpdA13HrpdSubnetToIp> getFapControlCdma2000HrpdA13HrpdSubnetToIp() {
            return _fapControlCdma2000HrpdA13HrpdSubnetToIp;
        }
        
        @Override
        public BigInteger getHrpdSubnetToIpNumberOfEntries() {
            return _hrpdSubnetToIpNumberOfEntries;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_colorCodeToUati104NumberOfEntries);
            result = prime * result + Objects.hashCode(_fapControlCdma2000HrpdA13ColorCodeToUati104);
            result = prime * result + Objects.hashCode(_fapControlCdma2000HrpdA13HrpdSubnetToIp);
            result = prime * result + Objects.hashCode(_hrpdSubnetToIpNumberOfEntries);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13 other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13)obj;
            if (!Objects.equals(_colorCodeToUati104NumberOfEntries, other.getColorCodeToUati104NumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_fapControlCdma2000HrpdA13ColorCodeToUati104, other.getFapControlCdma2000HrpdA13ColorCodeToUati104())) {
                return false;
            }
            if (!Objects.equals(_fapControlCdma2000HrpdA13HrpdSubnetToIp, other.getFapControlCdma2000HrpdA13HrpdSubnetToIp())) {
                return false;
            }
            if (!Objects.equals(_hrpdSubnetToIpNumberOfEntries, other.getHrpdSubnetToIpNumberOfEntries())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlCdma2000HrpdA13Impl otherImpl = (FapControlCdma2000HrpdA13Impl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlCdma2000HrpdA13 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_colorCodeToUati104NumberOfEntries != null) {
                builder.append("_colorCodeToUati104NumberOfEntries=");
                builder.append(_colorCodeToUati104NumberOfEntries);
                builder.append(", ");
            }
            if (_fapControlCdma2000HrpdA13ColorCodeToUati104 != null) {
                builder.append("_fapControlCdma2000HrpdA13ColorCodeToUati104=");
                builder.append(_fapControlCdma2000HrpdA13ColorCodeToUati104);
                builder.append(", ");
            }
            if (_fapControlCdma2000HrpdA13HrpdSubnetToIp != null) {
                builder.append("_fapControlCdma2000HrpdA13HrpdSubnetToIp=");
                builder.append(_fapControlCdma2000HrpdA13HrpdSubnetToIp);
                builder.append(", ");
            }
            if (_hrpdSubnetToIpNumberOfEntries != null) {
                builder.append("_hrpdSubnetToIpNumberOfEntries=");
                builder.append(_hrpdSubnetToIpNumberOfEntries);
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
