package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig
 *
 */
public class Cdma2000HrpdPcfConfigBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig> {

    private Cdma2000HrpdPcfConfigPcfPerformanceStats _cdma2000HrpdPcfConfigPcfPerformanceStats;
    private java.lang.Short _pcfpdsnHealthMonitorInterval;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdPcfConfigBuilder() {
    }
    public Cdma2000HrpdPcfConfigBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigG arg) {
        this._pcfpdsnHealthMonitorInterval = arg.getPcfpdsnHealthMonitorInterval();
    }

    public Cdma2000HrpdPcfConfigBuilder(Cdma2000HrpdPcfConfig base) {
        this._cdma2000HrpdPcfConfigPcfPerformanceStats = base.getCdma2000HrpdPcfConfigPcfPerformanceStats();
        this._pcfpdsnHealthMonitorInterval = base.getPcfpdsnHealthMonitorInterval();
        if (base instanceof Cdma2000HrpdPcfConfigImpl) {
            Cdma2000HrpdPcfConfigImpl impl = (Cdma2000HrpdPcfConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigG) {
            this._pcfpdsnHealthMonitorInterval = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigG)arg).getPcfpdsnHealthMonitorInterval();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigG] \n" +
              "but was: " + arg
            );
        }
    }

    public Cdma2000HrpdPcfConfigPcfPerformanceStats getCdma2000HrpdPcfConfigPcfPerformanceStats() {
        return _cdma2000HrpdPcfConfigPcfPerformanceStats;
    }
    
    public java.lang.Short getPcfpdsnHealthMonitorInterval() {
        return _pcfpdsnHealthMonitorInterval;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public Cdma2000HrpdPcfConfigBuilder setCdma2000HrpdPcfConfigPcfPerformanceStats(final Cdma2000HrpdPcfConfigPcfPerformanceStats value) {
        this._cdma2000HrpdPcfConfigPcfPerformanceStats = value;
        return this;
    }
    
     
     private static void checkPcfpdsnHealthMonitorIntervalRange(final short value) {
         if (value >= (short)0 && value <= (short)180) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..180]].", value));
     }
    
    public Cdma2000HrpdPcfConfigBuilder setPcfpdsnHealthMonitorInterval(final java.lang.Short value) {
    if (value != null) {
        checkPcfpdsnHealthMonitorIntervalRange(value);
    }
        this._pcfpdsnHealthMonitorInterval = value;
        return this;
    }
    
    public Cdma2000HrpdPcfConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdPcfConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdPcfConfig build() {
        return new Cdma2000HrpdPcfConfigImpl(this);
    }

    private static final class Cdma2000HrpdPcfConfigImpl implements Cdma2000HrpdPcfConfig {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig.class;
        }

        private final Cdma2000HrpdPcfConfigPcfPerformanceStats _cdma2000HrpdPcfConfigPcfPerformanceStats;
        private final java.lang.Short _pcfpdsnHealthMonitorInterval;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdPcfConfigImpl(Cdma2000HrpdPcfConfigBuilder base) {
            this._cdma2000HrpdPcfConfigPcfPerformanceStats = base.getCdma2000HrpdPcfConfigPcfPerformanceStats();
            this._pcfpdsnHealthMonitorInterval = base.getPcfpdsnHealthMonitorInterval();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Cdma2000HrpdPcfConfigPcfPerformanceStats getCdma2000HrpdPcfConfigPcfPerformanceStats() {
            return _cdma2000HrpdPcfConfigPcfPerformanceStats;
        }
        
        @Override
        public java.lang.Short getPcfpdsnHealthMonitorInterval() {
            return _pcfpdsnHealthMonitorInterval;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cdma2000HrpdPcfConfigPcfPerformanceStats);
            result = prime * result + Objects.hashCode(_pcfpdsnHealthMonitorInterval);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig)obj;
            if (!Objects.equals(_cdma2000HrpdPcfConfigPcfPerformanceStats, other.getCdma2000HrpdPcfConfigPcfPerformanceStats())) {
                return false;
            }
            if (!Objects.equals(_pcfpdsnHealthMonitorInterval, other.getPcfpdsnHealthMonitorInterval())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdPcfConfigImpl otherImpl = (Cdma2000HrpdPcfConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdPcfConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cdma2000HrpdPcfConfigPcfPerformanceStats != null) {
                builder.append("_cdma2000HrpdPcfConfigPcfPerformanceStats=");
                builder.append(_cdma2000HrpdPcfConfigPcfPerformanceStats);
                builder.append(", ");
            }
            if (_pcfpdsnHealthMonitorInterval != null) {
                builder.append("_pcfpdsnHealthMonitorInterval=");
                builder.append(_pcfpdsnHealthMonitorInterval);
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
