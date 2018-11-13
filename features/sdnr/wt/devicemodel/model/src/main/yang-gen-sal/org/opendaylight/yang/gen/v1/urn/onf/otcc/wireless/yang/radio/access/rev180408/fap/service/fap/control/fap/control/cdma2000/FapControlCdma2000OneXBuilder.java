package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG.OpState;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXSelfConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG.AdminState;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX
 *
 */
public class FapControlCdma2000OneXBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX> {

    private AdminState _adminState;
    private java.lang.Long _daylight;
    private java.lang.Integer _emergencySessionPeriod;
    private FapControlCdma2000OneXActiveHandinMeasurement _fapControlCdma2000OneXActiveHandinMeasurement;
    private FapControlCdma2000OneXSelfConfig _fapControlCdma2000OneXSelfConfig;
    private java.lang.Integer _locationAreaCode;
    private java.lang.Long _maxPRev;
    private BigInteger _mscId;
    private OpState _opState;
    private BigInteger _reregister;
    private java.lang.Boolean _activeHandinEnable;
    private java.lang.Boolean _rfTxStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>> augmentation = Collections.emptyMap();

    public FapControlCdma2000OneXBuilder() {
    }
    public FapControlCdma2000OneXBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG arg) {
        this._adminState = arg.getAdminState();
        this._opState = arg.getOpState();
        this._rfTxStatus = arg.isRfTxStatus();
        this._daylight = arg.getDaylight();
        this._maxPRev = arg.getMaxPRev();
        this._reregister = arg.getReregister();
        this._emergencySessionPeriod = arg.getEmergencySessionPeriod();
        this._locationAreaCode = arg.getLocationAreaCode();
        this._mscId = arg.getMscId();
        this._activeHandinEnable = arg.isActiveHandinEnable();
    }

    public FapControlCdma2000OneXBuilder(FapControlCdma2000OneX base) {
        this._adminState = base.getAdminState();
        this._daylight = base.getDaylight();
        this._emergencySessionPeriod = base.getEmergencySessionPeriod();
        this._fapControlCdma2000OneXActiveHandinMeasurement = base.getFapControlCdma2000OneXActiveHandinMeasurement();
        this._fapControlCdma2000OneXSelfConfig = base.getFapControlCdma2000OneXSelfConfig();
        this._locationAreaCode = base.getLocationAreaCode();
        this._maxPRev = base.getMaxPRev();
        this._mscId = base.getMscId();
        this._opState = base.getOpState();
        this._reregister = base.getReregister();
        this._activeHandinEnable = base.isActiveHandinEnable();
        this._rfTxStatus = base.isRfTxStatus();
        if (base instanceof FapControlCdma2000OneXImpl) {
            FapControlCdma2000OneXImpl impl = (FapControlCdma2000OneXImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG) {
            this._adminState = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG)arg).getAdminState();
            this._opState = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG)arg).getOpState();
            this._rfTxStatus = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG)arg).isRfTxStatus();
            this._daylight = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG)arg).getDaylight();
            this._maxPRev = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG)arg).getMaxPRev();
            this._reregister = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG)arg).getReregister();
            this._emergencySessionPeriod = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG)arg).getEmergencySessionPeriod();
            this._locationAreaCode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG)arg).getLocationAreaCode();
            this._mscId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG)arg).getMscId();
            this._activeHandinEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG)arg).isActiveHandinEnable();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG] \n" +
              "but was: " + arg
            );
        }
    }

    public AdminState getAdminState() {
        return _adminState;
    }
    
    public java.lang.Long getDaylight() {
        return _daylight;
    }
    
    public java.lang.Integer getEmergencySessionPeriod() {
        return _emergencySessionPeriod;
    }
    
    public FapControlCdma2000OneXActiveHandinMeasurement getFapControlCdma2000OneXActiveHandinMeasurement() {
        return _fapControlCdma2000OneXActiveHandinMeasurement;
    }
    
    public FapControlCdma2000OneXSelfConfig getFapControlCdma2000OneXSelfConfig() {
        return _fapControlCdma2000OneXSelfConfig;
    }
    
    public java.lang.Integer getLocationAreaCode() {
        return _locationAreaCode;
    }
    
    public java.lang.Long getMaxPRev() {
        return _maxPRev;
    }
    
    public BigInteger getMscId() {
        return _mscId;
    }
    
    public OpState getOpState() {
        return _opState;
    }
    
    public BigInteger getReregister() {
        return _reregister;
    }
    
    public java.lang.Boolean isActiveHandinEnable() {
        return _activeHandinEnable;
    }
    
    public java.lang.Boolean isRfTxStatus() {
        return _rfTxStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FapControlCdma2000OneXBuilder setAdminState(final AdminState value) {
        this._adminState = value;
        return this;
    }
    
     
    public FapControlCdma2000OneXBuilder setDaylight(final java.lang.Long value) {
        this._daylight = value;
        return this;
    }
    
     
     private static void checkEmergencySessionPeriodRange(final int value) {
         if (value >= 15 && value <= 1800) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[15..1800]].", value));
     }
    
    public FapControlCdma2000OneXBuilder setEmergencySessionPeriod(final java.lang.Integer value) {
    if (value != null) {
        checkEmergencySessionPeriodRange(value);
    }
        this._emergencySessionPeriod = value;
        return this;
    }
    
     
    public FapControlCdma2000OneXBuilder setFapControlCdma2000OneXActiveHandinMeasurement(final FapControlCdma2000OneXActiveHandinMeasurement value) {
        this._fapControlCdma2000OneXActiveHandinMeasurement = value;
        return this;
    }
    
     
    public FapControlCdma2000OneXBuilder setFapControlCdma2000OneXSelfConfig(final FapControlCdma2000OneXSelfConfig value) {
        this._fapControlCdma2000OneXSelfConfig = value;
        return this;
    }
    
     
     private static void checkLocationAreaCodeRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public FapControlCdma2000OneXBuilder setLocationAreaCode(final java.lang.Integer value) {
    if (value != null) {
        checkLocationAreaCodeRange(value);
    }
        this._locationAreaCode = value;
        return this;
    }
    
     
    public FapControlCdma2000OneXBuilder setMaxPRev(final java.lang.Long value) {
        this._maxPRev = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMSCIDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMSCIDRANGE_RANGES = a;
     }
     private static void checkMscIdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMSCIDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMSCIDRANGE_RANGES)));
     }
    
    public FapControlCdma2000OneXBuilder setMscId(final BigInteger value) {
    if (value != null) {
        checkMscIdRange(value);
    }
        this._mscId = value;
        return this;
    }
    
     
    public FapControlCdma2000OneXBuilder setOpState(final OpState value) {
        this._opState = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKREREGISTERRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKREREGISTERRANGE_RANGES = a;
     }
     private static void checkReregisterRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKREREGISTERRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKREREGISTERRANGE_RANGES)));
     }
    
    public FapControlCdma2000OneXBuilder setReregister(final BigInteger value) {
    if (value != null) {
        checkReregisterRange(value);
    }
        this._reregister = value;
        return this;
    }
    
     
    public FapControlCdma2000OneXBuilder setActiveHandinEnable(final java.lang.Boolean value) {
        this._activeHandinEnable = value;
        return this;
    }
    
     
    public FapControlCdma2000OneXBuilder setRfTxStatus(final java.lang.Boolean value) {
        this._rfTxStatus = value;
        return this;
    }
    
    public FapControlCdma2000OneXBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlCdma2000OneXBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlCdma2000OneX build() {
        return new FapControlCdma2000OneXImpl(this);
    }

    private static final class FapControlCdma2000OneXImpl implements FapControlCdma2000OneX {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX.class;
        }

        private final AdminState _adminState;
        private final java.lang.Long _daylight;
        private final java.lang.Integer _emergencySessionPeriod;
        private final FapControlCdma2000OneXActiveHandinMeasurement _fapControlCdma2000OneXActiveHandinMeasurement;
        private final FapControlCdma2000OneXSelfConfig _fapControlCdma2000OneXSelfConfig;
        private final java.lang.Integer _locationAreaCode;
        private final java.lang.Long _maxPRev;
        private final BigInteger _mscId;
        private final OpState _opState;
        private final BigInteger _reregister;
        private final java.lang.Boolean _activeHandinEnable;
        private final java.lang.Boolean _rfTxStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>> augmentation = Collections.emptyMap();

        private FapControlCdma2000OneXImpl(FapControlCdma2000OneXBuilder base) {
            this._adminState = base.getAdminState();
            this._daylight = base.getDaylight();
            this._emergencySessionPeriod = base.getEmergencySessionPeriod();
            this._fapControlCdma2000OneXActiveHandinMeasurement = base.getFapControlCdma2000OneXActiveHandinMeasurement();
            this._fapControlCdma2000OneXSelfConfig = base.getFapControlCdma2000OneXSelfConfig();
            this._locationAreaCode = base.getLocationAreaCode();
            this._maxPRev = base.getMaxPRev();
            this._mscId = base.getMscId();
            this._opState = base.getOpState();
            this._reregister = base.getReregister();
            this._activeHandinEnable = base.isActiveHandinEnable();
            this._rfTxStatus = base.isRfTxStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AdminState getAdminState() {
            return _adminState;
        }
        
        @Override
        public java.lang.Long getDaylight() {
            return _daylight;
        }
        
        @Override
        public java.lang.Integer getEmergencySessionPeriod() {
            return _emergencySessionPeriod;
        }
        
        @Override
        public FapControlCdma2000OneXActiveHandinMeasurement getFapControlCdma2000OneXActiveHandinMeasurement() {
            return _fapControlCdma2000OneXActiveHandinMeasurement;
        }
        
        @Override
        public FapControlCdma2000OneXSelfConfig getFapControlCdma2000OneXSelfConfig() {
            return _fapControlCdma2000OneXSelfConfig;
        }
        
        @Override
        public java.lang.Integer getLocationAreaCode() {
            return _locationAreaCode;
        }
        
        @Override
        public java.lang.Long getMaxPRev() {
            return _maxPRev;
        }
        
        @Override
        public BigInteger getMscId() {
            return _mscId;
        }
        
        @Override
        public OpState getOpState() {
            return _opState;
        }
        
        @Override
        public BigInteger getReregister() {
            return _reregister;
        }
        
        @Override
        public java.lang.Boolean isActiveHandinEnable() {
            return _activeHandinEnable;
        }
        
        @Override
        public java.lang.Boolean isRfTxStatus() {
            return _rfTxStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_daylight);
            result = prime * result + Objects.hashCode(_emergencySessionPeriod);
            result = prime * result + Objects.hashCode(_fapControlCdma2000OneXActiveHandinMeasurement);
            result = prime * result + Objects.hashCode(_fapControlCdma2000OneXSelfConfig);
            result = prime * result + Objects.hashCode(_locationAreaCode);
            result = prime * result + Objects.hashCode(_maxPRev);
            result = prime * result + Objects.hashCode(_mscId);
            result = prime * result + Objects.hashCode(_opState);
            result = prime * result + Objects.hashCode(_reregister);
            result = prime * result + Objects.hashCode(_activeHandinEnable);
            result = prime * result + Objects.hashCode(_rfTxStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX)obj;
            if (!Objects.equals(_adminState, other.getAdminState())) {
                return false;
            }
            if (!Objects.equals(_daylight, other.getDaylight())) {
                return false;
            }
            if (!Objects.equals(_emergencySessionPeriod, other.getEmergencySessionPeriod())) {
                return false;
            }
            if (!Objects.equals(_fapControlCdma2000OneXActiveHandinMeasurement, other.getFapControlCdma2000OneXActiveHandinMeasurement())) {
                return false;
            }
            if (!Objects.equals(_fapControlCdma2000OneXSelfConfig, other.getFapControlCdma2000OneXSelfConfig())) {
                return false;
            }
            if (!Objects.equals(_locationAreaCode, other.getLocationAreaCode())) {
                return false;
            }
            if (!Objects.equals(_maxPRev, other.getMaxPRev())) {
                return false;
            }
            if (!Objects.equals(_mscId, other.getMscId())) {
                return false;
            }
            if (!Objects.equals(_opState, other.getOpState())) {
                return false;
            }
            if (!Objects.equals(_reregister, other.getReregister())) {
                return false;
            }
            if (!Objects.equals(_activeHandinEnable, other.isActiveHandinEnable())) {
                return false;
            }
            if (!Objects.equals(_rfTxStatus, other.isRfTxStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlCdma2000OneXImpl otherImpl = (FapControlCdma2000OneXImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlCdma2000OneX [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_adminState != null) {
                builder.append("_adminState=");
                builder.append(_adminState);
                builder.append(", ");
            }
            if (_daylight != null) {
                builder.append("_daylight=");
                builder.append(_daylight);
                builder.append(", ");
            }
            if (_emergencySessionPeriod != null) {
                builder.append("_emergencySessionPeriod=");
                builder.append(_emergencySessionPeriod);
                builder.append(", ");
            }
            if (_fapControlCdma2000OneXActiveHandinMeasurement != null) {
                builder.append("_fapControlCdma2000OneXActiveHandinMeasurement=");
                builder.append(_fapControlCdma2000OneXActiveHandinMeasurement);
                builder.append(", ");
            }
            if (_fapControlCdma2000OneXSelfConfig != null) {
                builder.append("_fapControlCdma2000OneXSelfConfig=");
                builder.append(_fapControlCdma2000OneXSelfConfig);
                builder.append(", ");
            }
            if (_locationAreaCode != null) {
                builder.append("_locationAreaCode=");
                builder.append(_locationAreaCode);
                builder.append(", ");
            }
            if (_maxPRev != null) {
                builder.append("_maxPRev=");
                builder.append(_maxPRev);
                builder.append(", ");
            }
            if (_mscId != null) {
                builder.append("_mscId=");
                builder.append(_mscId);
                builder.append(", ");
            }
            if (_opState != null) {
                builder.append("_opState=");
                builder.append(_opState);
                builder.append(", ");
            }
            if (_reregister != null) {
                builder.append("_reregister=");
                builder.append(_reregister);
                builder.append(", ");
            }
            if (_activeHandinEnable != null) {
                builder.append("_activeHandinEnable=");
                builder.append(_activeHandinEnable);
                builder.append(", ");
            }
            if (_rfTxStatus != null) {
                builder.append("_rfTxStatus=");
                builder.append(_rfTxStatus);
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
