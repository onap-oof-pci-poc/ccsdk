package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers
 *
 */
public class LteRanRrcTimersBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers> {

    private java.lang.Short _n310;
    private java.lang.Short _n311;
    private List<java.lang.Integer> _t300;
    private List<java.lang.Integer> _t301;
    private java.lang.Integer _t302;
    private List<java.lang.Integer> _t304Eutra;
    private List<java.lang.Integer> _t304Irat;
    private List<java.lang.Integer> _t310;
    private List<java.lang.Integer> _t311;
    private java.lang.Short _t320;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>> augmentation = Collections.emptyMap();

    public LteRanRrcTimersBuilder() {
    }
    public LteRanRrcTimersBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG arg) {
        this._t300 = arg.getT300();
        this._t301 = arg.getT301();
        this._t302 = arg.getT302();
        this._t304Eutra = arg.getT304Eutra();
        this._t304Irat = arg.getT304Irat();
        this._t310 = arg.getT310();
        this._t311 = arg.getT311();
        this._t320 = arg.getT320();
        this._n310 = arg.getN310();
        this._n311 = arg.getN311();
    }

    public LteRanRrcTimersBuilder(LteRanRrcTimers base) {
        this._n310 = base.getN310();
        this._n311 = base.getN311();
        this._t300 = base.getT300();
        this._t301 = base.getT301();
        this._t302 = base.getT302();
        this._t304Eutra = base.getT304Eutra();
        this._t304Irat = base.getT304Irat();
        this._t310 = base.getT310();
        this._t311 = base.getT311();
        this._t320 = base.getT320();
        if (base instanceof LteRanRrcTimersImpl) {
            LteRanRrcTimersImpl impl = (LteRanRrcTimersImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG) {
            this._t300 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG)arg).getT300();
            this._t301 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG)arg).getT301();
            this._t302 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG)arg).getT302();
            this._t304Eutra = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG)arg).getT304Eutra();
            this._t304Irat = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG)arg).getT304Irat();
            this._t310 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG)arg).getT310();
            this._t311 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG)arg).getT311();
            this._t320 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG)arg).getT320();
            this._n310 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG)arg).getN310();
            this._n311 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG)arg).getN311();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getN310() {
        return _n310;
    }
    
    public java.lang.Short getN311() {
        return _n311;
    }
    
    public List<java.lang.Integer> getT300() {
        return _t300;
    }
    
    public List<java.lang.Integer> getT301() {
        return _t301;
    }
    
    public java.lang.Integer getT302() {
        return _t302;
    }
    
    public List<java.lang.Integer> getT304Eutra() {
        return _t304Eutra;
    }
    
    public List<java.lang.Integer> getT304Irat() {
        return _t304Irat;
    }
    
    public List<java.lang.Integer> getT310() {
        return _t310;
    }
    
    public List<java.lang.Integer> getT311() {
        return _t311;
    }
    
    public java.lang.Short getT320() {
        return _t320;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkN310Range(final short value) {
         if (value >= (short)1 && value <= (short)4) {
             return;
         }
         if (value >= (short)6 && value <= (short)6) {
             return;
         }
         if (value >= (short)8 && value <= (short)8) {
             return;
         }
         if (value >= (short)10 && value <= (short)10) {
             return;
         }
         if (value >= (short)20 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..4], [6..6], [8..8], [10..10], [20..20]].", value));
     }
    
    public LteRanRrcTimersBuilder setN310(final java.lang.Short value) {
    if (value != null) {
        checkN310Range(value);
    }
        this._n310 = value;
        return this;
    }
    
     
     private static void checkN311Range(final short value) {
         if (value >= (short)1 && value <= (short)6) {
             return;
         }
         if (value >= (short)8 && value <= (short)8) {
             return;
         }
         if (value >= (short)10 && value <= (short)10) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..6], [8..8], [10..10]].", value));
     }
    
    public LteRanRrcTimersBuilder setN311(final java.lang.Short value) {
    if (value != null) {
        checkN311Range(value);
    }
        this._n311 = value;
        return this;
    }
    
     
    public LteRanRrcTimersBuilder setT300(final List<java.lang.Integer> value) {
        this._t300 = value;
        return this;
    }
    
     
    public LteRanRrcTimersBuilder setT301(final List<java.lang.Integer> value) {
        this._t301 = value;
        return this;
    }
    
     
     private static void checkT302Range(final int value) {
         if (value >= 100 && value <= 100) {
             return;
         }
         if (value >= 200 && value <= 200) {
             return;
         }
         if (value >= 300 && value <= 300) {
             return;
         }
         if (value >= 400 && value <= 400) {
             return;
         }
         if (value >= 600 && value <= 600) {
             return;
         }
         if (value >= 1000 && value <= 1000) {
             return;
         }
         if (value >= 1500 && value <= 1500) {
             return;
         }
         if (value >= 2000 && value <= 2000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[100..100], [200..200], [300..300], [400..400], [600..600], [1000..1000], [1500..1500], [2000..2000]].", value));
     }
    
    public LteRanRrcTimersBuilder setT302(final java.lang.Integer value) {
    if (value != null) {
        checkT302Range(value);
    }
        this._t302 = value;
        return this;
    }
    
     
    public LteRanRrcTimersBuilder setT304Eutra(final List<java.lang.Integer> value) {
        this._t304Eutra = value;
        return this;
    }
    
     
    public LteRanRrcTimersBuilder setT304Irat(final List<java.lang.Integer> value) {
        this._t304Irat = value;
        return this;
    }
    
     
    public LteRanRrcTimersBuilder setT310(final List<java.lang.Integer> value) {
        this._t310 = value;
        return this;
    }
    
     
    public LteRanRrcTimersBuilder setT311(final List<java.lang.Integer> value) {
        this._t311 = value;
        return this;
    }
    
     
     private static void checkT320Range(final short value) {
         if (value >= (short)5 && value <= (short)5) {
             return;
         }
         if (value >= (short)10 && value <= (short)10) {
             return;
         }
         if (value >= (short)20 && value <= (short)20) {
             return;
         }
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
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[5..5], [10..10], [20..20], [30..30], [60..60], [120..120], [180..180]].", value));
     }
    
    public LteRanRrcTimersBuilder setT320(final java.lang.Short value) {
    if (value != null) {
        checkT320Range(value);
    }
        this._t320 = value;
        return this;
    }
    
    public LteRanRrcTimersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanRrcTimersBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanRrcTimers build() {
        return new LteRanRrcTimersImpl(this);
    }

    private static final class LteRanRrcTimersImpl implements LteRanRrcTimers {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers.class;
        }

        private final java.lang.Short _n310;
        private final java.lang.Short _n311;
        private final List<java.lang.Integer> _t300;
        private final List<java.lang.Integer> _t301;
        private final java.lang.Integer _t302;
        private final List<java.lang.Integer> _t304Eutra;
        private final List<java.lang.Integer> _t304Irat;
        private final List<java.lang.Integer> _t310;
        private final List<java.lang.Integer> _t311;
        private final java.lang.Short _t320;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>> augmentation = Collections.emptyMap();

        private LteRanRrcTimersImpl(LteRanRrcTimersBuilder base) {
            this._n310 = base.getN310();
            this._n311 = base.getN311();
            this._t300 = base.getT300();
            this._t301 = base.getT301();
            this._t302 = base.getT302();
            this._t304Eutra = base.getT304Eutra();
            this._t304Irat = base.getT304Irat();
            this._t310 = base.getT310();
            this._t311 = base.getT311();
            this._t320 = base.getT320();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getN310() {
            return _n310;
        }
        
        @Override
        public java.lang.Short getN311() {
            return _n311;
        }
        
        @Override
        public List<java.lang.Integer> getT300() {
            return _t300;
        }
        
        @Override
        public List<java.lang.Integer> getT301() {
            return _t301;
        }
        
        @Override
        public java.lang.Integer getT302() {
            return _t302;
        }
        
        @Override
        public List<java.lang.Integer> getT304Eutra() {
            return _t304Eutra;
        }
        
        @Override
        public List<java.lang.Integer> getT304Irat() {
            return _t304Irat;
        }
        
        @Override
        public List<java.lang.Integer> getT310() {
            return _t310;
        }
        
        @Override
        public List<java.lang.Integer> getT311() {
            return _t311;
        }
        
        @Override
        public java.lang.Short getT320() {
            return _t320;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_n310);
            result = prime * result + Objects.hashCode(_n311);
            result = prime * result + Objects.hashCode(_t300);
            result = prime * result + Objects.hashCode(_t301);
            result = prime * result + Objects.hashCode(_t302);
            result = prime * result + Objects.hashCode(_t304Eutra);
            result = prime * result + Objects.hashCode(_t304Irat);
            result = prime * result + Objects.hashCode(_t310);
            result = prime * result + Objects.hashCode(_t311);
            result = prime * result + Objects.hashCode(_t320);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers)obj;
            if (!Objects.equals(_n310, other.getN310())) {
                return false;
            }
            if (!Objects.equals(_n311, other.getN311())) {
                return false;
            }
            if (!Objects.equals(_t300, other.getT300())) {
                return false;
            }
            if (!Objects.equals(_t301, other.getT301())) {
                return false;
            }
            if (!Objects.equals(_t302, other.getT302())) {
                return false;
            }
            if (!Objects.equals(_t304Eutra, other.getT304Eutra())) {
                return false;
            }
            if (!Objects.equals(_t304Irat, other.getT304Irat())) {
                return false;
            }
            if (!Objects.equals(_t310, other.getT310())) {
                return false;
            }
            if (!Objects.equals(_t311, other.getT311())) {
                return false;
            }
            if (!Objects.equals(_t320, other.getT320())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanRrcTimersImpl otherImpl = (LteRanRrcTimersImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanRrcTimers [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_n310 != null) {
                builder.append("_n310=");
                builder.append(_n310);
                builder.append(", ");
            }
            if (_n311 != null) {
                builder.append("_n311=");
                builder.append(_n311);
                builder.append(", ");
            }
            if (_t300 != null) {
                builder.append("_t300=");
                builder.append(_t300);
                builder.append(", ");
            }
            if (_t301 != null) {
                builder.append("_t301=");
                builder.append(_t301);
                builder.append(", ");
            }
            if (_t302 != null) {
                builder.append("_t302=");
                builder.append(_t302);
                builder.append(", ");
            }
            if (_t304Eutra != null) {
                builder.append("_t304Eutra=");
                builder.append(_t304Eutra);
                builder.append(", ");
            }
            if (_t304Irat != null) {
                builder.append("_t304Irat=");
                builder.append(_t304Irat);
                builder.append(", ");
            }
            if (_t310 != null) {
                builder.append("_t310=");
                builder.append(_t310);
                builder.append(", ");
            }
            if (_t311 != null) {
                builder.append("_t311=");
                builder.append(_t311);
                builder.append(", ");
            }
            if (_t320 != null) {
                builder.append("_t320=");
                builder.append(_t320);
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
