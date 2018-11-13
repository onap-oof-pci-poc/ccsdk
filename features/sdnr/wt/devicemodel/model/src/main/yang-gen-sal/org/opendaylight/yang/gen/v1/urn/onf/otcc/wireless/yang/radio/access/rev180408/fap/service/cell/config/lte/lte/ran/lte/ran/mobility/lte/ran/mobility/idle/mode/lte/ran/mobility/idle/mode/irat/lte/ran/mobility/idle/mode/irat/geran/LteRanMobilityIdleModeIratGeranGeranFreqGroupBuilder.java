package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG.BandIndicator;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup
 *
 */
public class LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup> {

    private java.lang.String _alias;
    private BandIndicator _bandIndicator;
    private java.lang.Integer _bccharfcn;
    private java.lang.Short _cellReselectionPriority;
    private LteRanMobilityIdleModeIratGeranGeranFreqGroupKey _key;
    private List<java.lang.String> _qRxLevMin;
    private java.lang.Short _threshXHigh;
    private java.lang.Short _threshXLow;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder() {
    }
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._bandIndicator = arg.getBandIndicator();
        this._bccharfcn = arg.getBccharfcn();
        this._qRxLevMin = arg.getQRxLevMin();
        this._cellReselectionPriority = arg.getCellReselectionPriority();
        this._threshXHigh = arg.getThreshXHigh();
        this._threshXLow = arg.getThreshXLow();
    }

    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder(LteRanMobilityIdleModeIratGeranGeranFreqGroup base) {
        if (base.getKey() == null) {
            this._key = new LteRanMobilityIdleModeIratGeranGeranFreqGroupKey(
                base.getBccharfcn()
            );
            this._bccharfcn = base.getBccharfcn();
        } else {
            this._key = base.getKey();
            this._bccharfcn = _key.getBccharfcn();
        }
        this._alias = base.getAlias();
        this._bandIndicator = base.getBandIndicator();
        this._cellReselectionPriority = base.getCellReselectionPriority();
        this._qRxLevMin = base.getQRxLevMin();
        this._threshXHigh = base.getThreshXHigh();
        this._threshXLow = base.getThreshXLow();
        this._enable = base.isEnable();
        if (base instanceof LteRanMobilityIdleModeIratGeranGeranFreqGroupImpl) {
            LteRanMobilityIdleModeIratGeranGeranFreqGroupImpl impl = (LteRanMobilityIdleModeIratGeranGeranFreqGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG)arg).getAlias();
            this._bandIndicator = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG)arg).getBandIndicator();
            this._bccharfcn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG)arg).getBccharfcn();
            this._qRxLevMin = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG)arg).getQRxLevMin();
            this._cellReselectionPriority = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG)arg).getCellReselectionPriority();
            this._threshXHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG)arg).getThreshXHigh();
            this._threshXLow = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG)arg).getThreshXLow();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public BandIndicator getBandIndicator() {
        return _bandIndicator;
    }
    
    public java.lang.Integer getBccharfcn() {
        return _bccharfcn;
    }
    
    public java.lang.Short getCellReselectionPriority() {
        return _cellReselectionPriority;
    }
    
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupKey getKey() {
        return _key;
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
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder setBandIndicator(final BandIndicator value) {
        this._bandIndicator = value;
        return this;
    }
    
     
     private static void checkBccharfcnRange(final int value) {
         if (value >= 0 && value <= 1023) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1023]].", value));
     }
    
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder setBccharfcn(final java.lang.Integer value) {
    if (value != null) {
        checkBccharfcnRange(value);
    }
        this._bccharfcn = value;
        return this;
    }
    
     
     private static void checkCellReselectionPriorityRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder setCellReselectionPriority(final java.lang.Short value) {
    if (value != null) {
        checkCellReselectionPriorityRange(value);
    }
        this._cellReselectionPriority = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder setKey(final LteRanMobilityIdleModeIratGeranGeranFreqGroupKey value) {
        this._key = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder setQRxLevMin(final List<java.lang.String> value) {
        this._qRxLevMin = value;
        return this;
    }
    
     
     private static void checkThreshXHighRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder setThreshXHigh(final java.lang.Short value) {
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
    
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder setThreshXLow(final java.lang.Short value) {
    if (value != null) {
        checkThreshXLowRange(value);
    }
        this._threshXLow = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleModeIratGeranGeranFreqGroup build() {
        return new LteRanMobilityIdleModeIratGeranGeranFreqGroupImpl(this);
    }

    private static final class LteRanMobilityIdleModeIratGeranGeranFreqGroupImpl implements LteRanMobilityIdleModeIratGeranGeranFreqGroup {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup.class;
        }

        private final java.lang.String _alias;
        private final BandIndicator _bandIndicator;
        private final java.lang.Integer _bccharfcn;
        private final java.lang.Short _cellReselectionPriority;
        private final LteRanMobilityIdleModeIratGeranGeranFreqGroupKey _key;
        private final List<java.lang.String> _qRxLevMin;
        private final java.lang.Short _threshXHigh;
        private final java.lang.Short _threshXLow;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeIratGeranGeranFreqGroupImpl(LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder base) {
            if (base.getKey() == null) {
                this._key = new LteRanMobilityIdleModeIratGeranGeranFreqGroupKey(
                    base.getBccharfcn()
                );
                this._bccharfcn = base.getBccharfcn();
            } else {
                this._key = base.getKey();
                this._bccharfcn = _key.getBccharfcn();
            }
            this._alias = base.getAlias();
            this._bandIndicator = base.getBandIndicator();
            this._cellReselectionPriority = base.getCellReselectionPriority();
            this._qRxLevMin = base.getQRxLevMin();
            this._threshXHigh = base.getThreshXHigh();
            this._threshXLow = base.getThreshXLow();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>>singletonMap(e.getKey(), e.getValue());
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
        public BandIndicator getBandIndicator() {
            return _bandIndicator;
        }
        
        @Override
        public java.lang.Integer getBccharfcn() {
            return _bccharfcn;
        }
        
        @Override
        public java.lang.Short getCellReselectionPriority() {
            return _cellReselectionPriority;
        }
        
        @Override
        public LteRanMobilityIdleModeIratGeranGeranFreqGroupKey getKey() {
            return _key;
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
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bandIndicator);
            result = prime * result + Objects.hashCode(_bccharfcn);
            result = prime * result + Objects.hashCode(_cellReselectionPriority);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_qRxLevMin);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_bandIndicator, other.getBandIndicator())) {
                return false;
            }
            if (!Objects.equals(_bccharfcn, other.getBccharfcn())) {
                return false;
            }
            if (!Objects.equals(_cellReselectionPriority, other.getCellReselectionPriority())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
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
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityIdleModeIratGeranGeranFreqGroupImpl otherImpl = (LteRanMobilityIdleModeIratGeranGeranFreqGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleModeIratGeranGeranFreqGroup [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_bandIndicator != null) {
                builder.append("_bandIndicator=");
                builder.append(_bandIndicator);
                builder.append(", ");
            }
            if (_bccharfcn != null) {
                builder.append("_bccharfcn=");
                builder.append(_bccharfcn);
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
