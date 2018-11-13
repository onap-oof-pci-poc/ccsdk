package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier
 *
 */
public class LteRanMobilityIdleModeInterFreqCarrierBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier> {

    private java.lang.String _alias;
    private java.lang.Short _cellReselectionPriority;
    private java.lang.Integer _eutraCarrierArfcn;
    private LteRanMobilityIdleModeInterFreqCarrierKey _key;
    private java.lang.Long _pMax;
    private List<java.lang.String> _qOffsetFreq;
    private List<java.lang.String> _qRxLevMinSib5;
    private List<java.lang.String> _tReselectionEutra;
    private java.lang.Short _tReselectionEutrasfHigh;
    private java.lang.Short _tReselectionEutrasfMedium;
    private java.lang.Short _threshXHigh;
    private java.lang.Short _threshXLow;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeInterFreqCarrierBuilder() {
    }
    public LteRanMobilityIdleModeInterFreqCarrierBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._eutraCarrierArfcn = arg.getEutraCarrierArfcn();
        this._qRxLevMinSib5 = arg.getQRxLevMinSib5();
        this._qOffsetFreq = arg.getQOffsetFreq();
        this._tReselectionEutra = arg.getTReselectionEutra();
        this._cellReselectionPriority = arg.getCellReselectionPriority();
        this._threshXHigh = arg.getThreshXHigh();
        this._threshXLow = arg.getThreshXLow();
        this._pMax = arg.getPMax();
        this._tReselectionEutrasfMedium = arg.getTReselectionEutrasfMedium();
        this._tReselectionEutrasfHigh = arg.getTReselectionEutrasfHigh();
    }

    public LteRanMobilityIdleModeInterFreqCarrierBuilder(LteRanMobilityIdleModeInterFreqCarrier base) {
        if (base.getKey() == null) {
            this._key = new LteRanMobilityIdleModeInterFreqCarrierKey(
                base.getEutraCarrierArfcn()
            );
            this._eutraCarrierArfcn = base.getEutraCarrierArfcn();
        } else {
            this._key = base.getKey();
            this._eutraCarrierArfcn = _key.getEutraCarrierArfcn();
        }
        this._alias = base.getAlias();
        this._cellReselectionPriority = base.getCellReselectionPriority();
        this._pMax = base.getPMax();
        this._qOffsetFreq = base.getQOffsetFreq();
        this._qRxLevMinSib5 = base.getQRxLevMinSib5();
        this._tReselectionEutra = base.getTReselectionEutra();
        this._tReselectionEutrasfHigh = base.getTReselectionEutrasfHigh();
        this._tReselectionEutrasfMedium = base.getTReselectionEutrasfMedium();
        this._threshXHigh = base.getThreshXHigh();
        this._threshXLow = base.getThreshXLow();
        this._enable = base.isEnable();
        if (base instanceof LteRanMobilityIdleModeInterFreqCarrierImpl) {
            LteRanMobilityIdleModeInterFreqCarrierImpl impl = (LteRanMobilityIdleModeInterFreqCarrierImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getAlias();
            this._eutraCarrierArfcn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getEutraCarrierArfcn();
            this._qRxLevMinSib5 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getQRxLevMinSib5();
            this._qOffsetFreq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getQOffsetFreq();
            this._tReselectionEutra = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getTReselectionEutra();
            this._cellReselectionPriority = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getCellReselectionPriority();
            this._threshXHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getThreshXHigh();
            this._threshXLow = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getThreshXLow();
            this._pMax = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getPMax();
            this._tReselectionEutrasfMedium = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getTReselectionEutrasfMedium();
            this._tReselectionEutrasfHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG)arg).getTReselectionEutrasfHigh();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG] \n" +
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
    
    public java.lang.Integer getEutraCarrierArfcn() {
        return _eutraCarrierArfcn;
    }
    
    public LteRanMobilityIdleModeInterFreqCarrierKey getKey() {
        return _key;
    }
    
    public java.lang.Long getPMax() {
        return _pMax;
    }
    
    public List<java.lang.String> getQOffsetFreq() {
        return _qOffsetFreq;
    }
    
    public List<java.lang.String> getQRxLevMinSib5() {
        return _qRxLevMinSib5;
    }
    
    public List<java.lang.String> getTReselectionEutra() {
        return _tReselectionEutra;
    }
    
    public java.lang.Short getTReselectionEutrasfHigh() {
        return _tReselectionEutrasfHigh;
    }
    
    public java.lang.Short getTReselectionEutrasfMedium() {
        return _tReselectionEutrasfMedium;
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
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setAlias(final java.lang.String value) {
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
    
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setCellReselectionPriority(final java.lang.Short value) {
    if (value != null) {
        checkCellReselectionPriorityRange(value);
    }
        this._cellReselectionPriority = value;
        return this;
    }
    
     
     private static void checkEutraCarrierArfcnRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setEutraCarrierArfcn(final java.lang.Integer value) {
    if (value != null) {
        checkEutraCarrierArfcnRange(value);
    }
        this._eutraCarrierArfcn = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setKey(final LteRanMobilityIdleModeInterFreqCarrierKey value) {
        this._key = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setPMax(final java.lang.Long value) {
        this._pMax = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setQOffsetFreq(final List<java.lang.String> value) {
        this._qOffsetFreq = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setQRxLevMinSib5(final List<java.lang.String> value) {
        this._qRxLevMinSib5 = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setTReselectionEutra(final List<java.lang.String> value) {
        this._tReselectionEutra = value;
        return this;
    }
    
     
     private static void checkTReselectionEutrasfHighRange(final short value) {
         if (value >= (short)25 && value <= (short)25) {
             return;
         }
         if (value >= (short)50 && value <= (short)50) {
             return;
         }
         if (value >= (short)75 && value <= (short)75) {
             return;
         }
         if (value >= (short)100 && value <= (short)100) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[25..25], [50..50], [75..75], [100..100]].", value));
     }
    
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setTReselectionEutrasfHigh(final java.lang.Short value) {
    if (value != null) {
        checkTReselectionEutrasfHighRange(value);
    }
        this._tReselectionEutrasfHigh = value;
        return this;
    }
    
     
     private static void checkTReselectionEutrasfMediumRange(final short value) {
         if (value >= (short)25 && value <= (short)25) {
             return;
         }
         if (value >= (short)50 && value <= (short)50) {
             return;
         }
         if (value >= (short)75 && value <= (short)75) {
             return;
         }
         if (value >= (short)100 && value <= (short)100) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[25..25], [50..50], [75..75], [100..100]].", value));
     }
    
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setTReselectionEutrasfMedium(final java.lang.Short value) {
    if (value != null) {
        checkTReselectionEutrasfMediumRange(value);
    }
        this._tReselectionEutrasfMedium = value;
        return this;
    }
    
     
     private static void checkThreshXHighRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setThreshXHigh(final java.lang.Short value) {
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
    
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setThreshXLow(final java.lang.Short value) {
    if (value != null) {
        checkThreshXLowRange(value);
    }
        this._threshXLow = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeInterFreqCarrierBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public LteRanMobilityIdleModeInterFreqCarrierBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeInterFreqCarrierBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleModeInterFreqCarrier build() {
        return new LteRanMobilityIdleModeInterFreqCarrierImpl(this);
    }

    private static final class LteRanMobilityIdleModeInterFreqCarrierImpl implements LteRanMobilityIdleModeInterFreqCarrier {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier.class;
        }

        private final java.lang.String _alias;
        private final java.lang.Short _cellReselectionPriority;
        private final java.lang.Integer _eutraCarrierArfcn;
        private final LteRanMobilityIdleModeInterFreqCarrierKey _key;
        private final java.lang.Long _pMax;
        private final List<java.lang.String> _qOffsetFreq;
        private final List<java.lang.String> _qRxLevMinSib5;
        private final List<java.lang.String> _tReselectionEutra;
        private final java.lang.Short _tReselectionEutrasfHigh;
        private final java.lang.Short _tReselectionEutrasfMedium;
        private final java.lang.Short _threshXHigh;
        private final java.lang.Short _threshXLow;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeInterFreqCarrierImpl(LteRanMobilityIdleModeInterFreqCarrierBuilder base) {
            if (base.getKey() == null) {
                this._key = new LteRanMobilityIdleModeInterFreqCarrierKey(
                    base.getEutraCarrierArfcn()
                );
                this._eutraCarrierArfcn = base.getEutraCarrierArfcn();
            } else {
                this._key = base.getKey();
                this._eutraCarrierArfcn = _key.getEutraCarrierArfcn();
            }
            this._alias = base.getAlias();
            this._cellReselectionPriority = base.getCellReselectionPriority();
            this._pMax = base.getPMax();
            this._qOffsetFreq = base.getQOffsetFreq();
            this._qRxLevMinSib5 = base.getQRxLevMinSib5();
            this._tReselectionEutra = base.getTReselectionEutra();
            this._tReselectionEutrasfHigh = base.getTReselectionEutrasfHigh();
            this._tReselectionEutrasfMedium = base.getTReselectionEutrasfMedium();
            this._threshXHigh = base.getThreshXHigh();
            this._threshXLow = base.getThreshXLow();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Integer getEutraCarrierArfcn() {
            return _eutraCarrierArfcn;
        }
        
        @Override
        public LteRanMobilityIdleModeInterFreqCarrierKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getPMax() {
            return _pMax;
        }
        
        @Override
        public List<java.lang.String> getQOffsetFreq() {
            return _qOffsetFreq;
        }
        
        @Override
        public List<java.lang.String> getQRxLevMinSib5() {
            return _qRxLevMinSib5;
        }
        
        @Override
        public List<java.lang.String> getTReselectionEutra() {
            return _tReselectionEutra;
        }
        
        @Override
        public java.lang.Short getTReselectionEutrasfHigh() {
            return _tReselectionEutrasfHigh;
        }
        
        @Override
        public java.lang.Short getTReselectionEutrasfMedium() {
            return _tReselectionEutrasfMedium;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_eutraCarrierArfcn);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_pMax);
            result = prime * result + Objects.hashCode(_qOffsetFreq);
            result = prime * result + Objects.hashCode(_qRxLevMinSib5);
            result = prime * result + Objects.hashCode(_tReselectionEutra);
            result = prime * result + Objects.hashCode(_tReselectionEutrasfHigh);
            result = prime * result + Objects.hashCode(_tReselectionEutrasfMedium);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_cellReselectionPriority, other.getCellReselectionPriority())) {
                return false;
            }
            if (!Objects.equals(_eutraCarrierArfcn, other.getEutraCarrierArfcn())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_pMax, other.getPMax())) {
                return false;
            }
            if (!Objects.equals(_qOffsetFreq, other.getQOffsetFreq())) {
                return false;
            }
            if (!Objects.equals(_qRxLevMinSib5, other.getQRxLevMinSib5())) {
                return false;
            }
            if (!Objects.equals(_tReselectionEutra, other.getTReselectionEutra())) {
                return false;
            }
            if (!Objects.equals(_tReselectionEutrasfHigh, other.getTReselectionEutrasfHigh())) {
                return false;
            }
            if (!Objects.equals(_tReselectionEutrasfMedium, other.getTReselectionEutrasfMedium())) {
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
                LteRanMobilityIdleModeInterFreqCarrierImpl otherImpl = (LteRanMobilityIdleModeInterFreqCarrierImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleModeInterFreqCarrier [";
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
            if (_eutraCarrierArfcn != null) {
                builder.append("_eutraCarrierArfcn=");
                builder.append(_eutraCarrierArfcn);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_pMax != null) {
                builder.append("_pMax=");
                builder.append(_pMax);
                builder.append(", ");
            }
            if (_qOffsetFreq != null) {
                builder.append("_qOffsetFreq=");
                builder.append(_qOffsetFreq);
                builder.append(", ");
            }
            if (_qRxLevMinSib5 != null) {
                builder.append("_qRxLevMinSib5=");
                builder.append(_qRxLevMinSib5);
                builder.append(", ");
            }
            if (_tReselectionEutra != null) {
                builder.append("_tReselectionEutra=");
                builder.append(_tReselectionEutra);
                builder.append(", ");
            }
            if (_tReselectionEutrasfHigh != null) {
                builder.append("_tReselectionEutrasfHigh=");
                builder.append(_tReselectionEutrasfHigh);
                builder.append(", ");
            }
            if (_tReselectionEutrasfMedium != null) {
                builder.append("_tReselectionEutrasfMedium=");
                builder.append(_tReselectionEutrasfMedium);
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
