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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon
 *
 */
public class LteRanMobilityIdleModeCommonBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon> {

    private java.lang.Short _nCellChangeHigh;
    private java.lang.Short _nCellChangeMedium;
    private java.lang.Long _qHystSfHigh;
    private java.lang.Long _qHystSfMedium;
    private List<java.lang.String> _qhyst;
    private java.lang.Short _tEvaluation;
    private java.lang.Short _tHystNormal;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeCommonBuilder() {
    }
    public LteRanMobilityIdleModeCommonBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG arg) {
        this._qhyst = arg.getQhyst();
        this._qHystSfMedium = arg.getQHystSfMedium();
        this._qHystSfHigh = arg.getQHystSfHigh();
        this._tEvaluation = arg.getTEvaluation();
        this._tHystNormal = arg.getTHystNormal();
        this._nCellChangeMedium = arg.getNCellChangeMedium();
        this._nCellChangeHigh = arg.getNCellChangeHigh();
    }

    public LteRanMobilityIdleModeCommonBuilder(LteRanMobilityIdleModeCommon base) {
        this._nCellChangeHigh = base.getNCellChangeHigh();
        this._nCellChangeMedium = base.getNCellChangeMedium();
        this._qHystSfHigh = base.getQHystSfHigh();
        this._qHystSfMedium = base.getQHystSfMedium();
        this._qhyst = base.getQhyst();
        this._tEvaluation = base.getTEvaluation();
        this._tHystNormal = base.getTHystNormal();
        if (base instanceof LteRanMobilityIdleModeCommonImpl) {
            LteRanMobilityIdleModeCommonImpl impl = (LteRanMobilityIdleModeCommonImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG) {
            this._qhyst = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG)arg).getQhyst();
            this._qHystSfMedium = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG)arg).getQHystSfMedium();
            this._qHystSfHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG)arg).getQHystSfHigh();
            this._tEvaluation = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG)arg).getTEvaluation();
            this._tHystNormal = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG)arg).getTHystNormal();
            this._nCellChangeMedium = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG)arg).getNCellChangeMedium();
            this._nCellChangeHigh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG)arg).getNCellChangeHigh();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeCommonG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getNCellChangeHigh() {
        return _nCellChangeHigh;
    }
    
    public java.lang.Short getNCellChangeMedium() {
        return _nCellChangeMedium;
    }
    
    public java.lang.Long getQHystSfHigh() {
        return _qHystSfHigh;
    }
    
    public java.lang.Long getQHystSfMedium() {
        return _qHystSfMedium;
    }
    
    public List<java.lang.String> getQhyst() {
        return _qhyst;
    }
    
    public java.lang.Short getTEvaluation() {
        return _tEvaluation;
    }
    
    public java.lang.Short getTHystNormal() {
        return _tHystNormal;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkNCellChangeHighRange(final short value) {
         if (value >= (short)1 && value <= (short)16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..16]].", value));
     }
    
    public LteRanMobilityIdleModeCommonBuilder setNCellChangeHigh(final java.lang.Short value) {
    if (value != null) {
        checkNCellChangeHighRange(value);
    }
        this._nCellChangeHigh = value;
        return this;
    }
    
     
     private static void checkNCellChangeMediumRange(final short value) {
         if (value >= (short)1 && value <= (short)16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..16]].", value));
     }
    
    public LteRanMobilityIdleModeCommonBuilder setNCellChangeMedium(final java.lang.Short value) {
    if (value != null) {
        checkNCellChangeMediumRange(value);
    }
        this._nCellChangeMedium = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeCommonBuilder setQHystSfHigh(final java.lang.Long value) {
        this._qHystSfHigh = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeCommonBuilder setQHystSfMedium(final java.lang.Long value) {
        this._qHystSfMedium = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeCommonBuilder setQhyst(final List<java.lang.String> value) {
        this._qhyst = value;
        return this;
    }
    
     
     private static void checkTEvaluationRange(final short value) {
         if (value >= (short)30 && value <= (short)30) {
             return;
         }
         if (value >= (short)60 && value <= (short)60) {
             return;
         }
         if (value >= (short)120 && value <= (short)120) {
             return;
         }
         if (value >= (short)180 && value <= (short)180) {
             return;
         }
         if (value >= (short)240 && value <= (short)240) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[30..30], [60..60], [120..120], [180..180], [240..240]].", value));
     }
    
    public LteRanMobilityIdleModeCommonBuilder setTEvaluation(final java.lang.Short value) {
    if (value != null) {
        checkTEvaluationRange(value);
    }
        this._tEvaluation = value;
        return this;
    }
    
     
     private static void checkTHystNormalRange(final short value) {
         if (value >= (short)30 && value <= (short)30) {
             return;
         }
         if (value >= (short)60 && value <= (short)60) {
             return;
         }
         if (value >= (short)120 && value <= (short)120) {
             return;
         }
         if (value >= (short)180 && value <= (short)180) {
             return;
         }
         if (value >= (short)240 && value <= (short)240) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[30..30], [60..60], [120..120], [180..180], [240..240]].", value));
     }
    
    public LteRanMobilityIdleModeCommonBuilder setTHystNormal(final java.lang.Short value) {
    if (value != null) {
        checkTHystNormalRange(value);
    }
        this._tHystNormal = value;
        return this;
    }
    
    public LteRanMobilityIdleModeCommonBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeCommonBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleModeCommon build() {
        return new LteRanMobilityIdleModeCommonImpl(this);
    }

    private static final class LteRanMobilityIdleModeCommonImpl implements LteRanMobilityIdleModeCommon {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon.class;
        }

        private final java.lang.Short _nCellChangeHigh;
        private final java.lang.Short _nCellChangeMedium;
        private final java.lang.Long _qHystSfHigh;
        private final java.lang.Long _qHystSfMedium;
        private final List<java.lang.String> _qhyst;
        private final java.lang.Short _tEvaluation;
        private final java.lang.Short _tHystNormal;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeCommonImpl(LteRanMobilityIdleModeCommonBuilder base) {
            this._nCellChangeHigh = base.getNCellChangeHigh();
            this._nCellChangeMedium = base.getNCellChangeMedium();
            this._qHystSfHigh = base.getQHystSfHigh();
            this._qHystSfMedium = base.getQHystSfMedium();
            this._qhyst = base.getQhyst();
            this._tEvaluation = base.getTEvaluation();
            this._tHystNormal = base.getTHystNormal();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getNCellChangeHigh() {
            return _nCellChangeHigh;
        }
        
        @Override
        public java.lang.Short getNCellChangeMedium() {
            return _nCellChangeMedium;
        }
        
        @Override
        public java.lang.Long getQHystSfHigh() {
            return _qHystSfHigh;
        }
        
        @Override
        public java.lang.Long getQHystSfMedium() {
            return _qHystSfMedium;
        }
        
        @Override
        public List<java.lang.String> getQhyst() {
            return _qhyst;
        }
        
        @Override
        public java.lang.Short getTEvaluation() {
            return _tEvaluation;
        }
        
        @Override
        public java.lang.Short getTHystNormal() {
            return _tHystNormal;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nCellChangeHigh);
            result = prime * result + Objects.hashCode(_nCellChangeMedium);
            result = prime * result + Objects.hashCode(_qHystSfHigh);
            result = prime * result + Objects.hashCode(_qHystSfMedium);
            result = prime * result + Objects.hashCode(_qhyst);
            result = prime * result + Objects.hashCode(_tEvaluation);
            result = prime * result + Objects.hashCode(_tHystNormal);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon)obj;
            if (!Objects.equals(_nCellChangeHigh, other.getNCellChangeHigh())) {
                return false;
            }
            if (!Objects.equals(_nCellChangeMedium, other.getNCellChangeMedium())) {
                return false;
            }
            if (!Objects.equals(_qHystSfHigh, other.getQHystSfHigh())) {
                return false;
            }
            if (!Objects.equals(_qHystSfMedium, other.getQHystSfMedium())) {
                return false;
            }
            if (!Objects.equals(_qhyst, other.getQhyst())) {
                return false;
            }
            if (!Objects.equals(_tEvaluation, other.getTEvaluation())) {
                return false;
            }
            if (!Objects.equals(_tHystNormal, other.getTHystNormal())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityIdleModeCommonImpl otherImpl = (LteRanMobilityIdleModeCommonImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleModeCommon [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nCellChangeHigh != null) {
                builder.append("_nCellChangeHigh=");
                builder.append(_nCellChangeHigh);
                builder.append(", ");
            }
            if (_nCellChangeMedium != null) {
                builder.append("_nCellChangeMedium=");
                builder.append(_nCellChangeMedium);
                builder.append(", ");
            }
            if (_qHystSfHigh != null) {
                builder.append("_qHystSfHigh=");
                builder.append(_qHystSfHigh);
                builder.append(", ");
            }
            if (_qHystSfMedium != null) {
                builder.append("_qHystSfMedium=");
                builder.append(_qHystSfMedium);
                builder.append(", ");
            }
            if (_qhyst != null) {
                builder.append("_qhyst=");
                builder.append(_qhyst);
                builder.append(", ");
            }
            if (_tEvaluation != null) {
                builder.append("_tEvaluation=");
                builder.append(_tEvaluation);
                builder.append(", ");
            }
            if (_tHystNormal != null) {
                builder.append("_tHystNormal=");
                builder.append(_tHystNormal);
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
