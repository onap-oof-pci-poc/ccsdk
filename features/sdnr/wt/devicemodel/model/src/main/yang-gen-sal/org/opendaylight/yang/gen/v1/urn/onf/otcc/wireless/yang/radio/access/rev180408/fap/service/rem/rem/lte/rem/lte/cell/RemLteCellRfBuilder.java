package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf
 *
 */
public class RemLteCellRfBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf> {

    private java.lang.Integer _eutraCarrierArfcn;
    private java.lang.Integer _phyCellId;
    private java.lang.Long _rsrp;
    private java.lang.Long _rsrq;
    private java.lang.Long _rssi;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>> augmentation = Collections.emptyMap();

    public RemLteCellRfBuilder() {
    }
    public RemLteCellRfBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellRfG arg) {
        this._eutraCarrierArfcn = arg.getEutraCarrierArfcn();
        this._phyCellId = arg.getPhyCellId();
        this._rsrp = arg.getRsrp();
        this._rsrq = arg.getRsrq();
        this._rssi = arg.getRssi();
    }

    public RemLteCellRfBuilder(RemLteCellRf base) {
        this._eutraCarrierArfcn = base.getEutraCarrierArfcn();
        this._phyCellId = base.getPhyCellId();
        this._rsrp = base.getRsrp();
        this._rsrq = base.getRsrq();
        this._rssi = base.getRssi();
        if (base instanceof RemLteCellRfImpl) {
            RemLteCellRfImpl impl = (RemLteCellRfImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellRfG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellRfG) {
            this._eutraCarrierArfcn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellRfG)arg).getEutraCarrierArfcn();
            this._phyCellId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellRfG)arg).getPhyCellId();
            this._rsrp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellRfG)arg).getRsrp();
            this._rsrq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellRfG)arg).getRsrq();
            this._rssi = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellRfG)arg).getRssi();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellRfG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getEutraCarrierArfcn() {
        return _eutraCarrierArfcn;
    }
    
    public java.lang.Integer getPhyCellId() {
        return _phyCellId;
    }
    
    public java.lang.Long getRsrp() {
        return _rsrp;
    }
    
    public java.lang.Long getRsrq() {
        return _rsrq;
    }
    
    public java.lang.Long getRssi() {
        return _rssi;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkEutraCarrierArfcnRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public RemLteCellRfBuilder setEutraCarrierArfcn(final java.lang.Integer value) {
    if (value != null) {
        checkEutraCarrierArfcnRange(value);
    }
        this._eutraCarrierArfcn = value;
        return this;
    }
    
     
     private static void checkPhyCellIdRange(final int value) {
         if (value >= 0 && value <= 503) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..503]].", value));
     }
    
    public RemLteCellRfBuilder setPhyCellId(final java.lang.Integer value) {
    if (value != null) {
        checkPhyCellIdRange(value);
    }
        this._phyCellId = value;
        return this;
    }
    
     
    public RemLteCellRfBuilder setRsrp(final java.lang.Long value) {
        this._rsrp = value;
        return this;
    }
    
     
    public RemLteCellRfBuilder setRsrq(final java.lang.Long value) {
        this._rsrq = value;
        return this;
    }
    
     
    public RemLteCellRfBuilder setRssi(final java.lang.Long value) {
        this._rssi = value;
        return this;
    }
    
    public RemLteCellRfBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemLteCellRfBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemLteCellRf build() {
        return new RemLteCellRfImpl(this);
    }

    private static final class RemLteCellRfImpl implements RemLteCellRf {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf.class;
        }

        private final java.lang.Integer _eutraCarrierArfcn;
        private final java.lang.Integer _phyCellId;
        private final java.lang.Long _rsrp;
        private final java.lang.Long _rsrq;
        private final java.lang.Long _rssi;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>> augmentation = Collections.emptyMap();

        private RemLteCellRfImpl(RemLteCellRfBuilder base) {
            this._eutraCarrierArfcn = base.getEutraCarrierArfcn();
            this._phyCellId = base.getPhyCellId();
            this._rsrp = base.getRsrp();
            this._rsrq = base.getRsrq();
            this._rssi = base.getRssi();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getEutraCarrierArfcn() {
            return _eutraCarrierArfcn;
        }
        
        @Override
        public java.lang.Integer getPhyCellId() {
            return _phyCellId;
        }
        
        @Override
        public java.lang.Long getRsrp() {
            return _rsrp;
        }
        
        @Override
        public java.lang.Long getRsrq() {
            return _rsrq;
        }
        
        @Override
        public java.lang.Long getRssi() {
            return _rssi;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_eutraCarrierArfcn);
            result = prime * result + Objects.hashCode(_phyCellId);
            result = prime * result + Objects.hashCode(_rsrp);
            result = prime * result + Objects.hashCode(_rsrq);
            result = prime * result + Objects.hashCode(_rssi);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf)obj;
            if (!Objects.equals(_eutraCarrierArfcn, other.getEutraCarrierArfcn())) {
                return false;
            }
            if (!Objects.equals(_phyCellId, other.getPhyCellId())) {
                return false;
            }
            if (!Objects.equals(_rsrp, other.getRsrp())) {
                return false;
            }
            if (!Objects.equals(_rsrq, other.getRsrq())) {
                return false;
            }
            if (!Objects.equals(_rssi, other.getRssi())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemLteCellRfImpl otherImpl = (RemLteCellRfImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemLteCellRf [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_eutraCarrierArfcn != null) {
                builder.append("_eutraCarrierArfcn=");
                builder.append(_eutraCarrierArfcn);
                builder.append(", ");
            }
            if (_phyCellId != null) {
                builder.append("_phyCellId=");
                builder.append(_phyCellId);
                builder.append(", ");
            }
            if (_rsrp != null) {
                builder.append("_rsrp=");
                builder.append(_rsrp);
                builder.append(", ");
            }
            if (_rsrq != null) {
                builder.append("_rsrq=");
                builder.append(_rsrq);
                builder.append(", ");
            }
            if (_rssi != null) {
                builder.append("_rssi=");
                builder.append(_rssi);
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
