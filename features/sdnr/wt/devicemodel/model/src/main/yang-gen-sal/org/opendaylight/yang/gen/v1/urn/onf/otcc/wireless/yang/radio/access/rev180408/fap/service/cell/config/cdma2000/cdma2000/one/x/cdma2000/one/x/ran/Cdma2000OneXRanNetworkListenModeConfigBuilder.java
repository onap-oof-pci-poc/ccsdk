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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig
 *
 */
public class Cdma2000OneXRanNetworkListenModeConfigBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig> {

    private BigInteger _acir;
    private java.lang.Short _fapAllowedAdjChanCoverageHole;
    private java.lang.String _fapBeaconCoverageTarget;
    private java.lang.String _fapCoverageTarget;
    private java.lang.Long _maxAllowablePilotStrengthDegradation;
    private java.lang.Long _maxCoverageEdgePilotStrength;
    private BigInteger _rfcnflMargin;
    private List<java.lang.String> _rfcnflToProtect;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanNetworkListenModeConfigBuilder() {
    }
    public Cdma2000OneXRanNetworkListenModeConfigBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG arg) {
        this._rfcnflMargin = arg.getRfcnflMargin();
        this._fapCoverageTarget = arg.getFapCoverageTarget();
        this._fapBeaconCoverageTarget = arg.getFapBeaconCoverageTarget();
        this._maxCoverageEdgePilotStrength = arg.getMaxCoverageEdgePilotStrength();
        this._maxAllowablePilotStrengthDegradation = arg.getMaxAllowablePilotStrengthDegradation();
        this._rfcnflToProtect = arg.getRfcnflToProtect();
        this._fapAllowedAdjChanCoverageHole = arg.getFapAllowedAdjChanCoverageHole();
        this._acir = arg.getAcir();
    }

    public Cdma2000OneXRanNetworkListenModeConfigBuilder(Cdma2000OneXRanNetworkListenModeConfig base) {
        this._acir = base.getAcir();
        this._fapAllowedAdjChanCoverageHole = base.getFapAllowedAdjChanCoverageHole();
        this._fapBeaconCoverageTarget = base.getFapBeaconCoverageTarget();
        this._fapCoverageTarget = base.getFapCoverageTarget();
        this._maxAllowablePilotStrengthDegradation = base.getMaxAllowablePilotStrengthDegradation();
        this._maxCoverageEdgePilotStrength = base.getMaxCoverageEdgePilotStrength();
        this._rfcnflMargin = base.getRfcnflMargin();
        this._rfcnflToProtect = base.getRfcnflToProtect();
        if (base instanceof Cdma2000OneXRanNetworkListenModeConfigImpl) {
            Cdma2000OneXRanNetworkListenModeConfigImpl impl = (Cdma2000OneXRanNetworkListenModeConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG) {
            this._rfcnflMargin = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG)arg).getRfcnflMargin();
            this._fapCoverageTarget = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG)arg).getFapCoverageTarget();
            this._fapBeaconCoverageTarget = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG)arg).getFapBeaconCoverageTarget();
            this._maxCoverageEdgePilotStrength = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG)arg).getMaxCoverageEdgePilotStrength();
            this._maxAllowablePilotStrengthDegradation = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG)arg).getMaxAllowablePilotStrengthDegradation();
            this._rfcnflToProtect = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG)arg).getRfcnflToProtect();
            this._fapAllowedAdjChanCoverageHole = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG)arg).getFapAllowedAdjChanCoverageHole();
            this._acir = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG)arg).getAcir();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getAcir() {
        return _acir;
    }
    
    public java.lang.Short getFapAllowedAdjChanCoverageHole() {
        return _fapAllowedAdjChanCoverageHole;
    }
    
    public java.lang.String getFapBeaconCoverageTarget() {
        return _fapBeaconCoverageTarget;
    }
    
    public java.lang.String getFapCoverageTarget() {
        return _fapCoverageTarget;
    }
    
    public java.lang.Long getMaxAllowablePilotStrengthDegradation() {
        return _maxAllowablePilotStrengthDegradation;
    }
    
    public java.lang.Long getMaxCoverageEdgePilotStrength() {
        return _maxCoverageEdgePilotStrength;
    }
    
    public BigInteger getRfcnflMargin() {
        return _rfcnflMargin;
    }
    
    public List<java.lang.String> getRfcnflToProtect() {
        return _rfcnflToProtect;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKACIRRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKACIRRANGE_RANGES = a;
     }
     private static void checkAcirRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKACIRRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKACIRRANGE_RANGES)));
     }
    
    public Cdma2000OneXRanNetworkListenModeConfigBuilder setAcir(final BigInteger value) {
    if (value != null) {
        checkAcirRange(value);
    }
        this._acir = value;
        return this;
    }
    
     
     private static void checkFapAllowedAdjChanCoverageHoleRange(final short value) {
         if (value >= (short)30 && value <= (short)150) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[30..150]].", value));
     }
    
    public Cdma2000OneXRanNetworkListenModeConfigBuilder setFapAllowedAdjChanCoverageHole(final java.lang.Short value) {
    if (value != null) {
        checkFapAllowedAdjChanCoverageHoleRange(value);
    }
        this._fapAllowedAdjChanCoverageHole = value;
        return this;
    }
    
     
     private static void check_fapBeaconCoverageTargetLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 32) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..32]].", value));
     }
    
    public Cdma2000OneXRanNetworkListenModeConfigBuilder setFapBeaconCoverageTarget(final java.lang.String value) {
    if (value != null) {
        check_fapBeaconCoverageTargetLength(value);
    }
        this._fapBeaconCoverageTarget = value;
        return this;
    }
    
     
     private static void check_fapCoverageTargetLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 32) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..32]].", value));
     }
    
    public Cdma2000OneXRanNetworkListenModeConfigBuilder setFapCoverageTarget(final java.lang.String value) {
    if (value != null) {
        check_fapCoverageTargetLength(value);
    }
        this._fapCoverageTarget = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNetworkListenModeConfigBuilder setMaxAllowablePilotStrengthDegradation(final java.lang.Long value) {
        this._maxAllowablePilotStrengthDegradation = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNetworkListenModeConfigBuilder setMaxCoverageEdgePilotStrength(final java.lang.Long value) {
        this._maxCoverageEdgePilotStrength = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRFCNFLMARGINRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRFCNFLMARGINRANGE_RANGES = a;
     }
     private static void checkRfcnflMarginRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRFCNFLMARGINRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRFCNFLMARGINRANGE_RANGES)));
     }
    
    public Cdma2000OneXRanNetworkListenModeConfigBuilder setRfcnflMargin(final BigInteger value) {
    if (value != null) {
        checkRfcnflMarginRange(value);
    }
        this._rfcnflMargin = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNetworkListenModeConfigBuilder setRfcnflToProtect(final List<java.lang.String> value) {
        this._rfcnflToProtect = value;
        return this;
    }
    
    public Cdma2000OneXRanNetworkListenModeConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanNetworkListenModeConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanNetworkListenModeConfig build() {
        return new Cdma2000OneXRanNetworkListenModeConfigImpl(this);
    }

    private static final class Cdma2000OneXRanNetworkListenModeConfigImpl implements Cdma2000OneXRanNetworkListenModeConfig {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig.class;
        }

        private final BigInteger _acir;
        private final java.lang.Short _fapAllowedAdjChanCoverageHole;
        private final java.lang.String _fapBeaconCoverageTarget;
        private final java.lang.String _fapCoverageTarget;
        private final java.lang.Long _maxAllowablePilotStrengthDegradation;
        private final java.lang.Long _maxCoverageEdgePilotStrength;
        private final BigInteger _rfcnflMargin;
        private final List<java.lang.String> _rfcnflToProtect;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanNetworkListenModeConfigImpl(Cdma2000OneXRanNetworkListenModeConfigBuilder base) {
            this._acir = base.getAcir();
            this._fapAllowedAdjChanCoverageHole = base.getFapAllowedAdjChanCoverageHole();
            this._fapBeaconCoverageTarget = base.getFapBeaconCoverageTarget();
            this._fapCoverageTarget = base.getFapCoverageTarget();
            this._maxAllowablePilotStrengthDegradation = base.getMaxAllowablePilotStrengthDegradation();
            this._maxCoverageEdgePilotStrength = base.getMaxCoverageEdgePilotStrength();
            this._rfcnflMargin = base.getRfcnflMargin();
            this._rfcnflToProtect = base.getRfcnflToProtect();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getAcir() {
            return _acir;
        }
        
        @Override
        public java.lang.Short getFapAllowedAdjChanCoverageHole() {
            return _fapAllowedAdjChanCoverageHole;
        }
        
        @Override
        public java.lang.String getFapBeaconCoverageTarget() {
            return _fapBeaconCoverageTarget;
        }
        
        @Override
        public java.lang.String getFapCoverageTarget() {
            return _fapCoverageTarget;
        }
        
        @Override
        public java.lang.Long getMaxAllowablePilotStrengthDegradation() {
            return _maxAllowablePilotStrengthDegradation;
        }
        
        @Override
        public java.lang.Long getMaxCoverageEdgePilotStrength() {
            return _maxCoverageEdgePilotStrength;
        }
        
        @Override
        public BigInteger getRfcnflMargin() {
            return _rfcnflMargin;
        }
        
        @Override
        public List<java.lang.String> getRfcnflToProtect() {
            return _rfcnflToProtect;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_acir);
            result = prime * result + Objects.hashCode(_fapAllowedAdjChanCoverageHole);
            result = prime * result + Objects.hashCode(_fapBeaconCoverageTarget);
            result = prime * result + Objects.hashCode(_fapCoverageTarget);
            result = prime * result + Objects.hashCode(_maxAllowablePilotStrengthDegradation);
            result = prime * result + Objects.hashCode(_maxCoverageEdgePilotStrength);
            result = prime * result + Objects.hashCode(_rfcnflMargin);
            result = prime * result + Objects.hashCode(_rfcnflToProtect);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig)obj;
            if (!Objects.equals(_acir, other.getAcir())) {
                return false;
            }
            if (!Objects.equals(_fapAllowedAdjChanCoverageHole, other.getFapAllowedAdjChanCoverageHole())) {
                return false;
            }
            if (!Objects.equals(_fapBeaconCoverageTarget, other.getFapBeaconCoverageTarget())) {
                return false;
            }
            if (!Objects.equals(_fapCoverageTarget, other.getFapCoverageTarget())) {
                return false;
            }
            if (!Objects.equals(_maxAllowablePilotStrengthDegradation, other.getMaxAllowablePilotStrengthDegradation())) {
                return false;
            }
            if (!Objects.equals(_maxCoverageEdgePilotStrength, other.getMaxCoverageEdgePilotStrength())) {
                return false;
            }
            if (!Objects.equals(_rfcnflMargin, other.getRfcnflMargin())) {
                return false;
            }
            if (!Objects.equals(_rfcnflToProtect, other.getRfcnflToProtect())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanNetworkListenModeConfigImpl otherImpl = (Cdma2000OneXRanNetworkListenModeConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanNetworkListenModeConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_acir != null) {
                builder.append("_acir=");
                builder.append(_acir);
                builder.append(", ");
            }
            if (_fapAllowedAdjChanCoverageHole != null) {
                builder.append("_fapAllowedAdjChanCoverageHole=");
                builder.append(_fapAllowedAdjChanCoverageHole);
                builder.append(", ");
            }
            if (_fapBeaconCoverageTarget != null) {
                builder.append("_fapBeaconCoverageTarget=");
                builder.append(_fapBeaconCoverageTarget);
                builder.append(", ");
            }
            if (_fapCoverageTarget != null) {
                builder.append("_fapCoverageTarget=");
                builder.append(_fapCoverageTarget);
                builder.append(", ");
            }
            if (_maxAllowablePilotStrengthDegradation != null) {
                builder.append("_maxAllowablePilotStrengthDegradation=");
                builder.append(_maxAllowablePilotStrengthDegradation);
                builder.append(", ");
            }
            if (_maxCoverageEdgePilotStrength != null) {
                builder.append("_maxCoverageEdgePilotStrength=");
                builder.append(_maxCoverageEdgePilotStrength);
                builder.append(", ");
            }
            if (_rfcnflMargin != null) {
                builder.append("_rfcnflMargin=");
                builder.append(_rfcnflMargin);
                builder.append(", ");
            }
            if (_rfcnflToProtect != null) {
                builder.append("_rfcnflToProtect=");
                builder.append(_rfcnflToProtect);
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
