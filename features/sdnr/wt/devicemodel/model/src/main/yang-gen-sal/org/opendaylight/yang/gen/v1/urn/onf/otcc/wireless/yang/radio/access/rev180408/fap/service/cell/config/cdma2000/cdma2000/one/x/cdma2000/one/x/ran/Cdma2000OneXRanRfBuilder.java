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

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf
 *
 */
public class Cdma2000OneXRanRfBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf> {

    private java.lang.String _maxfapTxPower;
    private java.lang.Long _maxfapTxPowerInUse;
    private java.lang.Long _pchPwrPercentage;
    private List<java.lang.String> _pilotPn;
    private java.lang.Integer _pilotPnInUse;
    private java.lang.Long _pilotPwrPercentage;
    private List<java.lang.String> _rfcnfl;
    private java.lang.String _rfcnflBandInUse;
    private BigInteger _rfcnflInUse;
    private java.lang.Long _syncPwrPercentage;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanRfBuilder() {
    }
    public Cdma2000OneXRanRfBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG arg) {
        this._rfcnfl = arg.getRfcnfl();
        this._rfcnflBandInUse = arg.getRfcnflBandInUse();
        this._rfcnflInUse = arg.getRfcnflInUse();
        this._pilotPn = arg.getPilotPn();
        this._pilotPnInUse = arg.getPilotPnInUse();
        this._maxfapTxPower = arg.getMaxfapTxPower();
        this._maxfapTxPowerInUse = arg.getMaxfapTxPowerInUse();
        this._pchPwrPercentage = arg.getPchPwrPercentage();
        this._pilotPwrPercentage = arg.getPilotPwrPercentage();
        this._syncPwrPercentage = arg.getSyncPwrPercentage();
    }

    public Cdma2000OneXRanRfBuilder(Cdma2000OneXRanRf base) {
        this._maxfapTxPower = base.getMaxfapTxPower();
        this._maxfapTxPowerInUse = base.getMaxfapTxPowerInUse();
        this._pchPwrPercentage = base.getPchPwrPercentage();
        this._pilotPn = base.getPilotPn();
        this._pilotPnInUse = base.getPilotPnInUse();
        this._pilotPwrPercentage = base.getPilotPwrPercentage();
        this._rfcnfl = base.getRfcnfl();
        this._rfcnflBandInUse = base.getRfcnflBandInUse();
        this._rfcnflInUse = base.getRfcnflInUse();
        this._syncPwrPercentage = base.getSyncPwrPercentage();
        if (base instanceof Cdma2000OneXRanRfImpl) {
            Cdma2000OneXRanRfImpl impl = (Cdma2000OneXRanRfImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG) {
            this._rfcnfl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG)arg).getRfcnfl();
            this._rfcnflBandInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG)arg).getRfcnflBandInUse();
            this._rfcnflInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG)arg).getRfcnflInUse();
            this._pilotPn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG)arg).getPilotPn();
            this._pilotPnInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG)arg).getPilotPnInUse();
            this._maxfapTxPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG)arg).getMaxfapTxPower();
            this._maxfapTxPowerInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG)arg).getMaxfapTxPowerInUse();
            this._pchPwrPercentage = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG)arg).getPchPwrPercentage();
            this._pilotPwrPercentage = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG)arg).getPilotPwrPercentage();
            this._syncPwrPercentage = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG)arg).getSyncPwrPercentage();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getMaxfapTxPower() {
        return _maxfapTxPower;
    }
    
    public java.lang.Long getMaxfapTxPowerInUse() {
        return _maxfapTxPowerInUse;
    }
    
    public java.lang.Long getPchPwrPercentage() {
        return _pchPwrPercentage;
    }
    
    public List<java.lang.String> getPilotPn() {
        return _pilotPn;
    }
    
    public java.lang.Integer getPilotPnInUse() {
        return _pilotPnInUse;
    }
    
    public java.lang.Long getPilotPwrPercentage() {
        return _pilotPwrPercentage;
    }
    
    public List<java.lang.String> getRfcnfl() {
        return _rfcnfl;
    }
    
    public java.lang.String getRfcnflBandInUse() {
        return _rfcnflBandInUse;
    }
    
    public BigInteger getRfcnflInUse() {
        return _rfcnflInUse;
    }
    
    public java.lang.Long getSyncPwrPercentage() {
        return _syncPwrPercentage;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_maxfapTxPowerLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public Cdma2000OneXRanRfBuilder setMaxfapTxPower(final java.lang.String value) {
    if (value != null) {
        check_maxfapTxPowerLength(value);
    }
        this._maxfapTxPower = value;
        return this;
    }
    
     
    public Cdma2000OneXRanRfBuilder setMaxfapTxPowerInUse(final java.lang.Long value) {
        this._maxfapTxPowerInUse = value;
        return this;
    }
    
     
     private static void checkPchPwrPercentageRange(final long value) {
         if (value >= 1000L && value <= 1000000L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1000..1000000]].", value));
     }
    
    public Cdma2000OneXRanRfBuilder setPchPwrPercentage(final java.lang.Long value) {
    if (value != null) {
        checkPchPwrPercentageRange(value);
    }
        this._pchPwrPercentage = value;
        return this;
    }
    
     
    public Cdma2000OneXRanRfBuilder setPilotPn(final List<java.lang.String> value) {
        this._pilotPn = value;
        return this;
    }
    
     
     private static void checkPilotPnInUseRange(final int value) {
         if (value >= 0 && value <= 511) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..511]].", value));
     }
    
    public Cdma2000OneXRanRfBuilder setPilotPnInUse(final java.lang.Integer value) {
    if (value != null) {
        checkPilotPnInUseRange(value);
    }
        this._pilotPnInUse = value;
        return this;
    }
    
     
     private static void checkPilotPwrPercentageRange(final long value) {
         if (value >= 1000L && value <= 1000000L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1000..1000000]].", value));
     }
    
    public Cdma2000OneXRanRfBuilder setPilotPwrPercentage(final java.lang.Long value) {
    if (value != null) {
        checkPilotPwrPercentageRange(value);
    }
        this._pilotPwrPercentage = value;
        return this;
    }
    
     
    public Cdma2000OneXRanRfBuilder setRfcnfl(final List<java.lang.String> value) {
        this._rfcnfl = value;
        return this;
    }
    
     
     private static void check_rfcnflBandInUseLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..16]].", value));
     }
    
    public Cdma2000OneXRanRfBuilder setRfcnflBandInUse(final java.lang.String value) {
    if (value != null) {
        check_rfcnflBandInUseLength(value);
    }
        this._rfcnflBandInUse = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRFCNFLINUSERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRFCNFLINUSERANGE_RANGES = a;
     }
     private static void checkRfcnflInUseRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRFCNFLINUSERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRFCNFLINUSERANGE_RANGES)));
     }
    
    public Cdma2000OneXRanRfBuilder setRfcnflInUse(final BigInteger value) {
    if (value != null) {
        checkRfcnflInUseRange(value);
    }
        this._rfcnflInUse = value;
        return this;
    }
    
     
     private static void checkSyncPwrPercentageRange(final long value) {
         if (value >= 1000L && value <= 1000000L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1000..1000000]].", value));
     }
    
    public Cdma2000OneXRanRfBuilder setSyncPwrPercentage(final java.lang.Long value) {
    if (value != null) {
        checkSyncPwrPercentageRange(value);
    }
        this._syncPwrPercentage = value;
        return this;
    }
    
    public Cdma2000OneXRanRfBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanRfBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanRf build() {
        return new Cdma2000OneXRanRfImpl(this);
    }

    private static final class Cdma2000OneXRanRfImpl implements Cdma2000OneXRanRf {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf.class;
        }

        private final java.lang.String _maxfapTxPower;
        private final java.lang.Long _maxfapTxPowerInUse;
        private final java.lang.Long _pchPwrPercentage;
        private final List<java.lang.String> _pilotPn;
        private final java.lang.Integer _pilotPnInUse;
        private final java.lang.Long _pilotPwrPercentage;
        private final List<java.lang.String> _rfcnfl;
        private final java.lang.String _rfcnflBandInUse;
        private final BigInteger _rfcnflInUse;
        private final java.lang.Long _syncPwrPercentage;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanRfImpl(Cdma2000OneXRanRfBuilder base) {
            this._maxfapTxPower = base.getMaxfapTxPower();
            this._maxfapTxPowerInUse = base.getMaxfapTxPowerInUse();
            this._pchPwrPercentage = base.getPchPwrPercentage();
            this._pilotPn = base.getPilotPn();
            this._pilotPnInUse = base.getPilotPnInUse();
            this._pilotPwrPercentage = base.getPilotPwrPercentage();
            this._rfcnfl = base.getRfcnfl();
            this._rfcnflBandInUse = base.getRfcnflBandInUse();
            this._rfcnflInUse = base.getRfcnflInUse();
            this._syncPwrPercentage = base.getSyncPwrPercentage();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getMaxfapTxPower() {
            return _maxfapTxPower;
        }
        
        @Override
        public java.lang.Long getMaxfapTxPowerInUse() {
            return _maxfapTxPowerInUse;
        }
        
        @Override
        public java.lang.Long getPchPwrPercentage() {
            return _pchPwrPercentage;
        }
        
        @Override
        public List<java.lang.String> getPilotPn() {
            return _pilotPn;
        }
        
        @Override
        public java.lang.Integer getPilotPnInUse() {
            return _pilotPnInUse;
        }
        
        @Override
        public java.lang.Long getPilotPwrPercentage() {
            return _pilotPwrPercentage;
        }
        
        @Override
        public List<java.lang.String> getRfcnfl() {
            return _rfcnfl;
        }
        
        @Override
        public java.lang.String getRfcnflBandInUse() {
            return _rfcnflBandInUse;
        }
        
        @Override
        public BigInteger getRfcnflInUse() {
            return _rfcnflInUse;
        }
        
        @Override
        public java.lang.Long getSyncPwrPercentage() {
            return _syncPwrPercentage;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxfapTxPower);
            result = prime * result + Objects.hashCode(_maxfapTxPowerInUse);
            result = prime * result + Objects.hashCode(_pchPwrPercentage);
            result = prime * result + Objects.hashCode(_pilotPn);
            result = prime * result + Objects.hashCode(_pilotPnInUse);
            result = prime * result + Objects.hashCode(_pilotPwrPercentage);
            result = prime * result + Objects.hashCode(_rfcnfl);
            result = prime * result + Objects.hashCode(_rfcnflBandInUse);
            result = prime * result + Objects.hashCode(_rfcnflInUse);
            result = prime * result + Objects.hashCode(_syncPwrPercentage);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf)obj;
            if (!Objects.equals(_maxfapTxPower, other.getMaxfapTxPower())) {
                return false;
            }
            if (!Objects.equals(_maxfapTxPowerInUse, other.getMaxfapTxPowerInUse())) {
                return false;
            }
            if (!Objects.equals(_pchPwrPercentage, other.getPchPwrPercentage())) {
                return false;
            }
            if (!Objects.equals(_pilotPn, other.getPilotPn())) {
                return false;
            }
            if (!Objects.equals(_pilotPnInUse, other.getPilotPnInUse())) {
                return false;
            }
            if (!Objects.equals(_pilotPwrPercentage, other.getPilotPwrPercentage())) {
                return false;
            }
            if (!Objects.equals(_rfcnfl, other.getRfcnfl())) {
                return false;
            }
            if (!Objects.equals(_rfcnflBandInUse, other.getRfcnflBandInUse())) {
                return false;
            }
            if (!Objects.equals(_rfcnflInUse, other.getRfcnflInUse())) {
                return false;
            }
            if (!Objects.equals(_syncPwrPercentage, other.getSyncPwrPercentage())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanRfImpl otherImpl = (Cdma2000OneXRanRfImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanRf [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_maxfapTxPower != null) {
                builder.append("_maxfapTxPower=");
                builder.append(_maxfapTxPower);
                builder.append(", ");
            }
            if (_maxfapTxPowerInUse != null) {
                builder.append("_maxfapTxPowerInUse=");
                builder.append(_maxfapTxPowerInUse);
                builder.append(", ");
            }
            if (_pchPwrPercentage != null) {
                builder.append("_pchPwrPercentage=");
                builder.append(_pchPwrPercentage);
                builder.append(", ");
            }
            if (_pilotPn != null) {
                builder.append("_pilotPn=");
                builder.append(_pilotPn);
                builder.append(", ");
            }
            if (_pilotPnInUse != null) {
                builder.append("_pilotPnInUse=");
                builder.append(_pilotPnInUse);
                builder.append(", ");
            }
            if (_pilotPwrPercentage != null) {
                builder.append("_pilotPwrPercentage=");
                builder.append(_pilotPwrPercentage);
                builder.append(", ");
            }
            if (_rfcnfl != null) {
                builder.append("_rfcnfl=");
                builder.append(_rfcnfl);
                builder.append(", ");
            }
            if (_rfcnflBandInUse != null) {
                builder.append("_rfcnflBandInUse=");
                builder.append(_rfcnflBandInUse);
                builder.append(", ");
            }
            if (_rfcnflInUse != null) {
                builder.append("_rfcnflInUse=");
                builder.append(_rfcnflInUse);
                builder.append(", ");
            }
            if (_syncPwrPercentage != null) {
                builder.append("_syncPwrPercentage=");
                builder.append(_syncPwrPercentage);
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
