package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq
 *
 */
public class LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq> {

    private java.lang.String _alias;
    private java.lang.Short _cellReselectionPriority;
    private LteRanMobilityIdleModeIratUtraUtranfddFreqKey _key;
    private java.lang.Long _pMaxUtra;
    private List<java.lang.String> _qQualMin;
    private List<java.lang.String> _qRxLevMin;
    private java.lang.Short _threshXHigh;
    private java.lang.Short _threshXLow;
    private java.lang.Integer _utraCarrierArfcn;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder() {
    }
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._utraCarrierArfcn = arg.getUtraCarrierArfcn();
        this._qRxLevMin = arg.getQRxLevMin();
        this._qQualMin = arg.getQQualMin();
        this._cellReselectionPriority = arg.getCellReselectionPriority();
        this._threshXHigh = arg.getThreshXHigh();
        this._threshXLow = arg.getThreshXLow();
        this._pMaxUtra = arg.getPMaxUtra();
    }

    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder(LteRanMobilityIdleModeIratUtraUtranfddFreq base) {
        if (base.getKey() == null) {
            this._key = new LteRanMobilityIdleModeIratUtraUtranfddFreqKey(
                base.getUtraCarrierArfcn()
            );
            this._utraCarrierArfcn = base.getUtraCarrierArfcn();
        } else {
            this._key = base.getKey();
            this._utraCarrierArfcn = _key.getUtraCarrierArfcn();
        }
        this._alias = base.getAlias();
        this._cellReselectionPriority = base.getCellReselectionPriority();
        this._pMaxUtra = base.getPMaxUtra();
        this._qQualMin = base.getQQualMin();
        this._qRxLevMin = base.getQRxLevMin();
        this._threshXHigh = base.getThreshXHigh();
        this._threshXLow = base.getThreshXLow();
        this._enable = base.isEnable();
        if (base instanceof LteRanMobilityIdleModeIratUtraUtranfddFreqImpl) {
            LteRanMobilityIdleModeIratUtraUtranfddFreqImpl impl = (LteRanMobilityIdleModeIratUtraUtranfddFreqImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG)arg).getAlias();
            this._utraCarrierArfcn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG)arg).getUtraCarrierArfcn();
            this._qRxLevMin = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG)arg).getQRxLevMin();
            this._qQualMin = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG)arg).getQQualMin();
            this._cellReselectionPriority = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG)arg).getCellReselectionPriority();
            this._threshXHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG)arg).getThreshXHigh();
            this._threshXLow = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG)arg).getThreshXLow();
            this._pMaxUtra = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG)arg).getPMaxUtra();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.Short getCellReselectionPriority() {
        return _cellReselectionPriority;
    }
    
    public LteRanMobilityIdleModeIratUtraUtranfddFreqKey getKey() {
        return _key;
    }
    
    public java.lang.Long getPMaxUtra() {
        return _pMaxUtra;
    }
    
    public List<java.lang.String> getQQualMin() {
        return _qQualMin;
    }
    
    public List<java.lang.String> getQRxLevMin() {
        return _qRxLevMin;
    }
    
    public java.lang.Short getThreshXHigh() {
        return _threshXHigh;
    }
    
    public java.lang.Short getThreshXLow() {
        return _threshXLow;
    }
    
    public java.lang.Integer getUtraCarrierArfcn() {
        return _utraCarrierArfcn;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
     private static void checkCellReselectionPriorityRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder setCellReselectionPriority(final java.lang.Short value) {
    if (value != null) {
        checkCellReselectionPriorityRange(value);
    }
        this._cellReselectionPriority = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder setKey(final LteRanMobilityIdleModeIratUtraUtranfddFreqKey value) {
        this._key = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder setPMaxUtra(final java.lang.Long value) {
        this._pMaxUtra = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder setQQualMin(final List<java.lang.String> value) {
        this._qQualMin = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder setQRxLevMin(final List<java.lang.String> value) {
        this._qRxLevMin = value;
        return this;
    }
    
     
     private static void checkThreshXHighRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder setThreshXHigh(final java.lang.Short value) {
    if (value != null) {
        checkThreshXHighRange(value);
    }
        this._threshXHigh = value;
        return this;
    }
    
     
     private static void checkThreshXLowRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder setThreshXLow(final java.lang.Short value) {
    if (value != null) {
        checkThreshXLowRange(value);
    }
        this._threshXLow = value;
        return this;
    }
    
     
     private static void checkUtraCarrierArfcnRange(final int value) {
         if (value >= 0 && value <= 16383) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..16383]].", value));
     }
    
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder setUtraCarrierArfcn(final java.lang.Integer value) {
    if (value != null) {
        checkUtraCarrierArfcnRange(value);
    }
        this._utraCarrierArfcn = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleModeIratUtraUtranfddFreq build() {
        return new LteRanMobilityIdleModeIratUtraUtranfddFreqImpl(this);
    }

    private static final class LteRanMobilityIdleModeIratUtraUtranfddFreqImpl implements LteRanMobilityIdleModeIratUtraUtranfddFreq {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq.class;
        }

        private final java.lang.String _alias;
        private final java.lang.Short _cellReselectionPriority;
        private final LteRanMobilityIdleModeIratUtraUtranfddFreqKey _key;
        private final java.lang.Long _pMaxUtra;
        private final List<java.lang.String> _qQualMin;
        private final List<java.lang.String> _qRxLevMin;
        private final java.lang.Short _threshXHigh;
        private final java.lang.Short _threshXLow;
        private final java.lang.Integer _utraCarrierArfcn;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeIratUtraUtranfddFreqImpl(LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder base) {
            if (base.getKey() == null) {
                this._key = new LteRanMobilityIdleModeIratUtraUtranfddFreqKey(
                    base.getUtraCarrierArfcn()
                );
                this._utraCarrierArfcn = base.getUtraCarrierArfcn();
            } else {
                this._key = base.getKey();
                this._utraCarrierArfcn = _key.getUtraCarrierArfcn();
            }
            this._alias = base.getAlias();
            this._cellReselectionPriority = base.getCellReselectionPriority();
            this._pMaxUtra = base.getPMaxUtra();
            this._qQualMin = base.getQQualMin();
            this._qRxLevMin = base.getQRxLevMin();
            this._threshXHigh = base.getThreshXHigh();
            this._threshXLow = base.getThreshXLow();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Short getCellReselectionPriority() {
            return _cellReselectionPriority;
        }
        
        @Override
        public LteRanMobilityIdleModeIratUtraUtranfddFreqKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getPMaxUtra() {
            return _pMaxUtra;
        }
        
        @Override
        public List<java.lang.String> getQQualMin() {
            return _qQualMin;
        }
        
        @Override
        public List<java.lang.String> getQRxLevMin() {
            return _qRxLevMin;
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
        public java.lang.Integer getUtraCarrierArfcn() {
            return _utraCarrierArfcn;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cellReselectionPriority);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_pMaxUtra);
            result = prime * result + Objects.hashCode(_qQualMin);
            result = prime * result + Objects.hashCode(_qRxLevMin);
            result = prime * result + Objects.hashCode(_threshXHigh);
            result = prime * result + Objects.hashCode(_threshXLow);
            result = prime * result + Objects.hashCode(_utraCarrierArfcn);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_cellReselectionPriority, other.getCellReselectionPriority())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_pMaxUtra, other.getPMaxUtra())) {
                return false;
            }
            if (!Objects.equals(_qQualMin, other.getQQualMin())) {
                return false;
            }
            if (!Objects.equals(_qRxLevMin, other.getQRxLevMin())) {
                return false;
            }
            if (!Objects.equals(_threshXHigh, other.getThreshXHigh())) {
                return false;
            }
            if (!Objects.equals(_threshXLow, other.getThreshXLow())) {
                return false;
            }
            if (!Objects.equals(_utraCarrierArfcn, other.getUtraCarrierArfcn())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityIdleModeIratUtraUtranfddFreqImpl otherImpl = (LteRanMobilityIdleModeIratUtraUtranfddFreqImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleModeIratUtraUtranfddFreq [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
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
            if (_pMaxUtra != null) {
                builder.append("_pMaxUtra=");
                builder.append(_pMaxUtra);
                builder.append(", ");
            }
            if (_qQualMin != null) {
                builder.append("_qQualMin=");
                builder.append(_qQualMin);
                builder.append(", ");
            }
            if (_qRxLevMin != null) {
                builder.append("_qRxLevMin=");
                builder.append(_qRxLevMin);
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
            if (_utraCarrierArfcn != null) {
                builder.append("_utraCarrierArfcn=");
                builder.append(_utraCarrierArfcn);
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
