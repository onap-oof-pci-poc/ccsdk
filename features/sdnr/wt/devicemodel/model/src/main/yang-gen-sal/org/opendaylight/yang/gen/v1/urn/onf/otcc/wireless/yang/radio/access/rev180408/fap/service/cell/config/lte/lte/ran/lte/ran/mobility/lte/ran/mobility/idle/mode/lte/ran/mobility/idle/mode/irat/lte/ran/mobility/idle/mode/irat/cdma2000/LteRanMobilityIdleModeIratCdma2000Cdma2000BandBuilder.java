package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band
 *
 */
public class LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band> {

    private java.lang.String _alias;
    private java.lang.Short _bandClass;
    private java.lang.Short _cellReselectionPriority;
    private LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey _key;
    private java.lang.Short _threshXHigh;
    private java.lang.Short _threshXLow;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder() {
    }
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._bandClass = arg.getBandClass();
        this._cellReselectionPriority = arg.getCellReselectionPriority();
        this._threshXHigh = arg.getThreshXHigh();
        this._threshXLow = arg.getThreshXLow();
    }

    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder(LteRanMobilityIdleModeIratCdma2000Cdma2000Band base) {
        if (base.getKey() == null) {
            this._key = new LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey(
                base.getBandClass()
            );
            this._bandClass = base.getBandClass();
        } else {
            this._key = base.getKey();
            this._bandClass = _key.getBandClass();
        }
        this._alias = base.getAlias();
        this._cellReselectionPriority = base.getCellReselectionPriority();
        this._threshXHigh = base.getThreshXHigh();
        this._threshXLow = base.getThreshXLow();
        this._enable = base.isEnable();
        if (base instanceof LteRanMobilityIdleModeIratCdma2000Cdma2000BandImpl) {
            LteRanMobilityIdleModeIratCdma2000Cdma2000BandImpl impl = (LteRanMobilityIdleModeIratCdma2000Cdma2000BandImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG)arg).getAlias();
            this._bandClass = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG)arg).getBandClass();
            this._cellReselectionPriority = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG)arg).getCellReselectionPriority();
            this._threshXHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG)arg).getThreshXHigh();
            this._threshXLow = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG)arg).getThreshXLow();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.Short getBandClass() {
        return _bandClass;
    }
    
    public java.lang.Short getCellReselectionPriority() {
        return _cellReselectionPriority;
    }
    
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey getKey() {
        return _key;
    }
    
    public java.lang.Short getThreshXHigh() {
        return _threshXHigh;
    }
    
    public java.lang.Short getThreshXLow() {
        return _threshXLow;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
     private static void checkBandClassRange(final short value) {
         if (value >= (short)0 && value <= (short)17) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..17]].", value));
     }
    
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder setBandClass(final java.lang.Short value) {
    if (value != null) {
        checkBandClassRange(value);
    }
        this._bandClass = value;
        return this;
    }
    
     
     private static void checkCellReselectionPriorityRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder setCellReselectionPriority(final java.lang.Short value) {
    if (value != null) {
        checkCellReselectionPriorityRange(value);
    }
        this._cellReselectionPriority = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder setKey(final LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkThreshXHighRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder setThreshXHigh(final java.lang.Short value) {
    if (value != null) {
        checkThreshXHighRange(value);
    }
        this._threshXHigh = value;
        return this;
    }
    
     
     private static void checkThreshXLowRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder setThreshXLow(final java.lang.Short value) {
    if (value != null) {
        checkThreshXLowRange(value);
    }
        this._threshXLow = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleModeIratCdma2000Cdma2000Band build() {
        return new LteRanMobilityIdleModeIratCdma2000Cdma2000BandImpl(this);
    }

    private static final class LteRanMobilityIdleModeIratCdma2000Cdma2000BandImpl implements LteRanMobilityIdleModeIratCdma2000Cdma2000Band {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band.class;
        }

        private final java.lang.String _alias;
        private final java.lang.Short _bandClass;
        private final java.lang.Short _cellReselectionPriority;
        private final LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey _key;
        private final java.lang.Short _threshXHigh;
        private final java.lang.Short _threshXLow;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeIratCdma2000Cdma2000BandImpl(LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder base) {
            if (base.getKey() == null) {
                this._key = new LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey(
                    base.getBandClass()
                );
                this._bandClass = base.getBandClass();
            } else {
                this._key = base.getKey();
                this._bandClass = _key.getBandClass();
            }
            this._alias = base.getAlias();
            this._cellReselectionPriority = base.getCellReselectionPriority();
            this._threshXHigh = base.getThreshXHigh();
            this._threshXLow = base.getThreshXLow();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Short getBandClass() {
            return _bandClass;
        }
        
        @Override
        public java.lang.Short getCellReselectionPriority() {
            return _cellReselectionPriority;
        }
        
        @Override
        public LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Short getThreshXHigh() {
            return _threshXHigh;
        }
        
        @Override
        public java.lang.Short getThreshXLow() {
            return _threshXLow;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bandClass);
            result = prime * result + Objects.hashCode(_cellReselectionPriority);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_threshXHigh);
            result = prime * result + Objects.hashCode(_threshXLow);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_bandClass, other.getBandClass())) {
                return false;
            }
            if (!Objects.equals(_cellReselectionPriority, other.getCellReselectionPriority())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_threshXHigh, other.getThreshXHigh())) {
                return false;
            }
            if (!Objects.equals(_threshXLow, other.getThreshXLow())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityIdleModeIratCdma2000Cdma2000BandImpl otherImpl = (LteRanMobilityIdleModeIratCdma2000Cdma2000BandImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleModeIratCdma2000Cdma2000Band [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_bandClass != null) {
                builder.append("_bandClass=");
                builder.append(_bandClass);
                builder.append(", ");
            }
            if (_cellReselectionPriority != null) {
                builder.append("_cellReselectionPriority=");
                builder.append(_cellReselectionPriority);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_threshXHigh != null) {
                builder.append("_threshXHigh=");
                builder.append(_threshXHigh);
                builder.append(", ");
            }
            if (_threshXLow != null) {
                builder.append("_threshXLow=");
                builder.append(_threshXLow);
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
