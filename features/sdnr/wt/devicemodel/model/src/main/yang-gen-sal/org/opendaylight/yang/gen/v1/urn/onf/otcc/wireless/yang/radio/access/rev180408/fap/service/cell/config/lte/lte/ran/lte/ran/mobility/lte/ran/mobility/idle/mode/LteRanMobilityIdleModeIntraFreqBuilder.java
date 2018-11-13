package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq
 *
 */
public class LteRanMobilityIdleModeIntraFreqBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq> {

    private java.lang.Short _cellReselectionPriority;
    private java.lang.Long _pMax;
    private java.lang.Short _qRxLevMinOffset;
    private List<java.lang.String> _qRxLevMinSib1;
    private List<java.lang.String> _qRxLevMinSib3;
    private List<java.lang.String> _sIntraSearch;
    private List<java.lang.String> _sNonIntraSearch;
    private List<java.lang.String> _tReselectionEutra;
    private java.lang.Short _tReselectionEutrasfHigh;
    private java.lang.Short _tReselectionEutrasfMedium;
    private java.lang.Short _threshServingLow;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeIntraFreqBuilder() {
    }
    public LteRanMobilityIdleModeIntraFreqBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG arg) {
        this._qRxLevMinSib1 = arg.getQRxLevMinSib1();
        this._qRxLevMinSib3 = arg.getQRxLevMinSib3();
        this._qRxLevMinOffset = arg.getQRxLevMinOffset();
        this._sIntraSearch = arg.getSIntraSearch();
        this._tReselectionEutra = arg.getTReselectionEutra();
        this._sNonIntraSearch = arg.getSNonIntraSearch();
        this._cellReselectionPriority = arg.getCellReselectionPriority();
        this._pMax = arg.getPMax();
        this._threshServingLow = arg.getThreshServingLow();
        this._tReselectionEutrasfMedium = arg.getTReselectionEutrasfMedium();
        this._tReselectionEutrasfHigh = arg.getTReselectionEutrasfHigh();
    }

    public LteRanMobilityIdleModeIntraFreqBuilder(LteRanMobilityIdleModeIntraFreq base) {
        this._cellReselectionPriority = base.getCellReselectionPriority();
        this._pMax = base.getPMax();
        this._qRxLevMinOffset = base.getQRxLevMinOffset();
        this._qRxLevMinSib1 = base.getQRxLevMinSib1();
        this._qRxLevMinSib3 = base.getQRxLevMinSib3();
        this._sIntraSearch = base.getSIntraSearch();
        this._sNonIntraSearch = base.getSNonIntraSearch();
        this._tReselectionEutra = base.getTReselectionEutra();
        this._tReselectionEutrasfHigh = base.getTReselectionEutrasfHigh();
        this._tReselectionEutrasfMedium = base.getTReselectionEutrasfMedium();
        this._threshServingLow = base.getThreshServingLow();
        if (base instanceof LteRanMobilityIdleModeIntraFreqImpl) {
            LteRanMobilityIdleModeIntraFreqImpl impl = (LteRanMobilityIdleModeIntraFreqImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG) {
            this._qRxLevMinSib1 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getQRxLevMinSib1();
            this._qRxLevMinSib3 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getQRxLevMinSib3();
            this._qRxLevMinOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getQRxLevMinOffset();
            this._sIntraSearch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getSIntraSearch();
            this._tReselectionEutra = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getTReselectionEutra();
            this._sNonIntraSearch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getSNonIntraSearch();
            this._cellReselectionPriority = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getCellReselectionPriority();
            this._pMax = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getPMax();
            this._threshServingLow = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getThreshServingLow();
            this._tReselectionEutrasfMedium = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getTReselectionEutrasfMedium();
            this._tReselectionEutrasfHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG)arg).getTReselectionEutrasfHigh();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getCellReselectionPriority() {
        return _cellReselectionPriority;
    }
    
    public java.lang.Long getPMax() {
        return _pMax;
    }
    
    public java.lang.Short getQRxLevMinOffset() {
        return _qRxLevMinOffset;
    }
    
    public List<java.lang.String> getQRxLevMinSib1() {
        return _qRxLevMinSib1;
    }
    
    public List<java.lang.String> getQRxLevMinSib3() {
        return _qRxLevMinSib3;
    }
    
    public List<java.lang.String> getSIntraSearch() {
        return _sIntraSearch;
    }
    
    public List<java.lang.String> getSNonIntraSearch() {
        return _sNonIntraSearch;
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
    
    public java.lang.Short getThreshServingLow() {
        return _threshServingLow;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCellReselectionPriorityRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public LteRanMobilityIdleModeIntraFreqBuilder setCellReselectionPriority(final java.lang.Short value) {
    if (value != null) {
        checkCellReselectionPriorityRange(value);
    }
        this._cellReselectionPriority = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIntraFreqBuilder setPMax(final java.lang.Long value) {
        this._pMax = value;
        return this;
    }
    
     
     private static void checkQRxLevMinOffsetRange(final short value) {
         if (value >= (short)1 && value <= (short)8) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..8]].", value));
     }
    
    public LteRanMobilityIdleModeIntraFreqBuilder setQRxLevMinOffset(final java.lang.Short value) {
    if (value != null) {
        checkQRxLevMinOffsetRange(value);
    }
        this._qRxLevMinOffset = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIntraFreqBuilder setQRxLevMinSib1(final List<java.lang.String> value) {
        this._qRxLevMinSib1 = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIntraFreqBuilder setQRxLevMinSib3(final List<java.lang.String> value) {
        this._qRxLevMinSib3 = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIntraFreqBuilder setSIntraSearch(final List<java.lang.String> value) {
        this._sIntraSearch = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIntraFreqBuilder setSNonIntraSearch(final List<java.lang.String> value) {
        this._sNonIntraSearch = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIntraFreqBuilder setTReselectionEutra(final List<java.lang.String> value) {
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
    
    public LteRanMobilityIdleModeIntraFreqBuilder setTReselectionEutrasfHigh(final java.lang.Short value) {
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
    
    public LteRanMobilityIdleModeIntraFreqBuilder setTReselectionEutrasfMedium(final java.lang.Short value) {
    if (value != null) {
        checkTReselectionEutrasfMediumRange(value);
    }
        this._tReselectionEutrasfMedium = value;
        return this;
    }
    
     
     private static void checkThreshServingLowRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public LteRanMobilityIdleModeIntraFreqBuilder setThreshServingLow(final java.lang.Short value) {
    if (value != null) {
        checkThreshServingLowRange(value);
    }
        this._threshServingLow = value;
        return this;
    }
    
    public LteRanMobilityIdleModeIntraFreqBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeIntraFreqBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleModeIntraFreq build() {
        return new LteRanMobilityIdleModeIntraFreqImpl(this);
    }

    private static final class LteRanMobilityIdleModeIntraFreqImpl implements LteRanMobilityIdleModeIntraFreq {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq.class;
        }

        private final java.lang.Short _cellReselectionPriority;
        private final java.lang.Long _pMax;
        private final java.lang.Short _qRxLevMinOffset;
        private final List<java.lang.String> _qRxLevMinSib1;
        private final List<java.lang.String> _qRxLevMinSib3;
        private final List<java.lang.String> _sIntraSearch;
        private final List<java.lang.String> _sNonIntraSearch;
        private final List<java.lang.String> _tReselectionEutra;
        private final java.lang.Short _tReselectionEutrasfHigh;
        private final java.lang.Short _tReselectionEutrasfMedium;
        private final java.lang.Short _threshServingLow;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeIntraFreqImpl(LteRanMobilityIdleModeIntraFreqBuilder base) {
            this._cellReselectionPriority = base.getCellReselectionPriority();
            this._pMax = base.getPMax();
            this._qRxLevMinOffset = base.getQRxLevMinOffset();
            this._qRxLevMinSib1 = base.getQRxLevMinSib1();
            this._qRxLevMinSib3 = base.getQRxLevMinSib3();
            this._sIntraSearch = base.getSIntraSearch();
            this._sNonIntraSearch = base.getSNonIntraSearch();
            this._tReselectionEutra = base.getTReselectionEutra();
            this._tReselectionEutrasfHigh = base.getTReselectionEutrasfHigh();
            this._tReselectionEutrasfMedium = base.getTReselectionEutrasfMedium();
            this._threshServingLow = base.getThreshServingLow();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getCellReselectionPriority() {
            return _cellReselectionPriority;
        }
        
        @Override
        public java.lang.Long getPMax() {
            return _pMax;
        }
        
        @Override
        public java.lang.Short getQRxLevMinOffset() {
            return _qRxLevMinOffset;
        }
        
        @Override
        public List<java.lang.String> getQRxLevMinSib1() {
            return _qRxLevMinSib1;
        }
        
        @Override
        public List<java.lang.String> getQRxLevMinSib3() {
            return _qRxLevMinSib3;
        }
        
        @Override
        public List<java.lang.String> getSIntraSearch() {
            return _sIntraSearch;
        }
        
        @Override
        public List<java.lang.String> getSNonIntraSearch() {
            return _sNonIntraSearch;
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
        public java.lang.Short getThreshServingLow() {
            return _threshServingLow;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cellReselectionPriority);
            result = prime * result + Objects.hashCode(_pMax);
            result = prime * result + Objects.hashCode(_qRxLevMinOffset);
            result = prime * result + Objects.hashCode(_qRxLevMinSib1);
            result = prime * result + Objects.hashCode(_qRxLevMinSib3);
            result = prime * result + Objects.hashCode(_sIntraSearch);
            result = prime * result + Objects.hashCode(_sNonIntraSearch);
            result = prime * result + Objects.hashCode(_tReselectionEutra);
            result = prime * result + Objects.hashCode(_tReselectionEutrasfHigh);
            result = prime * result + Objects.hashCode(_tReselectionEutrasfMedium);
            result = prime * result + Objects.hashCode(_threshServingLow);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq)obj;
            if (!Objects.equals(_cellReselectionPriority, other.getCellReselectionPriority())) {
                return false;
            }
            if (!Objects.equals(_pMax, other.getPMax())) {
                return false;
            }
            if (!Objects.equals(_qRxLevMinOffset, other.getQRxLevMinOffset())) {
                return false;
            }
            if (!Objects.equals(_qRxLevMinSib1, other.getQRxLevMinSib1())) {
                return false;
            }
            if (!Objects.equals(_qRxLevMinSib3, other.getQRxLevMinSib3())) {
                return false;
            }
            if (!Objects.equals(_sIntraSearch, other.getSIntraSearch())) {
                return false;
            }
            if (!Objects.equals(_sNonIntraSearch, other.getSNonIntraSearch())) {
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
            if (!Objects.equals(_threshServingLow, other.getThreshServingLow())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityIdleModeIntraFreqImpl otherImpl = (LteRanMobilityIdleModeIntraFreqImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleModeIntraFreq [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cellReselectionPriority != null) {
                builder.append("_cellReselectionPriority=");
                builder.append(_cellReselectionPriority);
                builder.append(", ");
            }
            if (_pMax != null) {
                builder.append("_pMax=");
                builder.append(_pMax);
                builder.append(", ");
            }
            if (_qRxLevMinOffset != null) {
                builder.append("_qRxLevMinOffset=");
                builder.append(_qRxLevMinOffset);
                builder.append(", ");
            }
            if (_qRxLevMinSib1 != null) {
                builder.append("_qRxLevMinSib1=");
                builder.append(_qRxLevMinSib1);
                builder.append(", ");
            }
            if (_qRxLevMinSib3 != null) {
                builder.append("_qRxLevMinSib3=");
                builder.append(_qRxLevMinSib3);
                builder.append(", ");
            }
            if (_sIntraSearch != null) {
                builder.append("_sIntraSearch=");
                builder.append(_sIntraSearch);
                builder.append(", ");
            }
            if (_sNonIntraSearch != null) {
                builder.append("_sNonIntraSearch=");
                builder.append(_sNonIntraSearch);
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
            if (_threshServingLow != null) {
                builder.append("_threshServingLow=");
                builder.append(_threshServingLow);
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
