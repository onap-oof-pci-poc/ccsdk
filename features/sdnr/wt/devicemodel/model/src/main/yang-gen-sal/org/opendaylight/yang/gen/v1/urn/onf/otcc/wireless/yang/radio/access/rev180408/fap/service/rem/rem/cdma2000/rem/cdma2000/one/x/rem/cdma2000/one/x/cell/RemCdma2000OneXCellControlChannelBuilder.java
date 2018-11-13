package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel
 *
 */
public class RemCdma2000OneXCellControlChannelBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel> {

    private java.lang.String _apid;
    private java.lang.Long _apidmask;
    private java.lang.String _apidtext;
    private java.lang.Long _baseid;
    private java.lang.Long _baselat;
    private java.lang.Long _baselong;
    private java.lang.Long _mcc;
    private java.lang.Long _mncimsi1112;
    private java.lang.Long _nid;
    private java.lang.Long _regzone;
    private java.lang.Long _sid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>> augmentation = Collections.emptyMap();

    public RemCdma2000OneXCellControlChannelBuilder() {
    }
    public RemCdma2000OneXCellControlChannelBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG arg) {
        this._sid = arg.getSid();
        this._nid = arg.getNid();
        this._regzone = arg.getRegzone();
        this._baselat = arg.getBaselat();
        this._baselong = arg.getBaselong();
        this._mcc = arg.getMcc();
        this._mncimsi1112 = arg.getMncimsi1112();
        this._baseid = arg.getBaseid();
        this._apid = arg.getApid();
        this._apidmask = arg.getApidmask();
        this._apidtext = arg.getApidtext();
    }

    public RemCdma2000OneXCellControlChannelBuilder(RemCdma2000OneXCellControlChannel base) {
        this._apid = base.getApid();
        this._apidmask = base.getApidmask();
        this._apidtext = base.getApidtext();
        this._baseid = base.getBaseid();
        this._baselat = base.getBaselat();
        this._baselong = base.getBaselong();
        this._mcc = base.getMcc();
        this._mncimsi1112 = base.getMncimsi1112();
        this._nid = base.getNid();
        this._regzone = base.getRegzone();
        this._sid = base.getSid();
        if (base instanceof RemCdma2000OneXCellControlChannelImpl) {
            RemCdma2000OneXCellControlChannelImpl impl = (RemCdma2000OneXCellControlChannelImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG) {
            this._sid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getSid();
            this._nid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getNid();
            this._regzone = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getRegzone();
            this._baselat = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getBaselat();
            this._baselong = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getBaselong();
            this._mcc = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getMcc();
            this._mncimsi1112 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getMncimsi1112();
            this._baseid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getBaseid();
            this._apid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getApid();
            this._apidmask = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getApidmask();
            this._apidtext = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG)arg).getApidtext();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getApid() {
        return _apid;
    }
    
    public java.lang.Long getApidmask() {
        return _apidmask;
    }
    
    public java.lang.String getApidtext() {
        return _apidtext;
    }
    
    public java.lang.Long getBaseid() {
        return _baseid;
    }
    
    public java.lang.Long getBaselat() {
        return _baselat;
    }
    
    public java.lang.Long getBaselong() {
        return _baselong;
    }
    
    public java.lang.Long getMcc() {
        return _mcc;
    }
    
    public java.lang.Long getMncimsi1112() {
        return _mncimsi1112;
    }
    
    public java.lang.Long getNid() {
        return _nid;
    }
    
    public java.lang.Long getRegzone() {
        return _regzone;
    }
    
    public java.lang.Long getSid() {
        return _sid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_apidLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 32) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..32]].", value));
     }
    
    public RemCdma2000OneXCellControlChannelBuilder setApid(final java.lang.String value) {
    if (value != null) {
        check_apidLength(value);
    }
        this._apid = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellControlChannelBuilder setApidmask(final java.lang.Long value) {
        this._apidmask = value;
        return this;
    }
    
     
     private static void check_apidtextLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public RemCdma2000OneXCellControlChannelBuilder setApidtext(final java.lang.String value) {
    if (value != null) {
        check_apidtextLength(value);
    }
        this._apidtext = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellControlChannelBuilder setBaseid(final java.lang.Long value) {
        this._baseid = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellControlChannelBuilder setBaselat(final java.lang.Long value) {
        this._baselat = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellControlChannelBuilder setBaselong(final java.lang.Long value) {
        this._baselong = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellControlChannelBuilder setMcc(final java.lang.Long value) {
        this._mcc = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellControlChannelBuilder setMncimsi1112(final java.lang.Long value) {
        this._mncimsi1112 = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellControlChannelBuilder setNid(final java.lang.Long value) {
        this._nid = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellControlChannelBuilder setRegzone(final java.lang.Long value) {
        this._regzone = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellControlChannelBuilder setSid(final java.lang.Long value) {
        this._sid = value;
        return this;
    }
    
    public RemCdma2000OneXCellControlChannelBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemCdma2000OneXCellControlChannelBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemCdma2000OneXCellControlChannel build() {
        return new RemCdma2000OneXCellControlChannelImpl(this);
    }

    private static final class RemCdma2000OneXCellControlChannelImpl implements RemCdma2000OneXCellControlChannel {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel.class;
        }

        private final java.lang.String _apid;
        private final java.lang.Long _apidmask;
        private final java.lang.String _apidtext;
        private final java.lang.Long _baseid;
        private final java.lang.Long _baselat;
        private final java.lang.Long _baselong;
        private final java.lang.Long _mcc;
        private final java.lang.Long _mncimsi1112;
        private final java.lang.Long _nid;
        private final java.lang.Long _regzone;
        private final java.lang.Long _sid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>> augmentation = Collections.emptyMap();

        private RemCdma2000OneXCellControlChannelImpl(RemCdma2000OneXCellControlChannelBuilder base) {
            this._apid = base.getApid();
            this._apidmask = base.getApidmask();
            this._apidtext = base.getApidtext();
            this._baseid = base.getBaseid();
            this._baselat = base.getBaselat();
            this._baselong = base.getBaselong();
            this._mcc = base.getMcc();
            this._mncimsi1112 = base.getMncimsi1112();
            this._nid = base.getNid();
            this._regzone = base.getRegzone();
            this._sid = base.getSid();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getApid() {
            return _apid;
        }
        
        @Override
        public java.lang.Long getApidmask() {
            return _apidmask;
        }
        
        @Override
        public java.lang.String getApidtext() {
            return _apidtext;
        }
        
        @Override
        public java.lang.Long getBaseid() {
            return _baseid;
        }
        
        @Override
        public java.lang.Long getBaselat() {
            return _baselat;
        }
        
        @Override
        public java.lang.Long getBaselong() {
            return _baselong;
        }
        
        @Override
        public java.lang.Long getMcc() {
            return _mcc;
        }
        
        @Override
        public java.lang.Long getMncimsi1112() {
            return _mncimsi1112;
        }
        
        @Override
        public java.lang.Long getNid() {
            return _nid;
        }
        
        @Override
        public java.lang.Long getRegzone() {
            return _regzone;
        }
        
        @Override
        public java.lang.Long getSid() {
            return _sid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_apid);
            result = prime * result + Objects.hashCode(_apidmask);
            result = prime * result + Objects.hashCode(_apidtext);
            result = prime * result + Objects.hashCode(_baseid);
            result = prime * result + Objects.hashCode(_baselat);
            result = prime * result + Objects.hashCode(_baselong);
            result = prime * result + Objects.hashCode(_mcc);
            result = prime * result + Objects.hashCode(_mncimsi1112);
            result = prime * result + Objects.hashCode(_nid);
            result = prime * result + Objects.hashCode(_regzone);
            result = prime * result + Objects.hashCode(_sid);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel)obj;
            if (!Objects.equals(_apid, other.getApid())) {
                return false;
            }
            if (!Objects.equals(_apidmask, other.getApidmask())) {
                return false;
            }
            if (!Objects.equals(_apidtext, other.getApidtext())) {
                return false;
            }
            if (!Objects.equals(_baseid, other.getBaseid())) {
                return false;
            }
            if (!Objects.equals(_baselat, other.getBaselat())) {
                return false;
            }
            if (!Objects.equals(_baselong, other.getBaselong())) {
                return false;
            }
            if (!Objects.equals(_mcc, other.getMcc())) {
                return false;
            }
            if (!Objects.equals(_mncimsi1112, other.getMncimsi1112())) {
                return false;
            }
            if (!Objects.equals(_nid, other.getNid())) {
                return false;
            }
            if (!Objects.equals(_regzone, other.getRegzone())) {
                return false;
            }
            if (!Objects.equals(_sid, other.getSid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemCdma2000OneXCellControlChannelImpl otherImpl = (RemCdma2000OneXCellControlChannelImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemCdma2000OneXCellControlChannel [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_apid != null) {
                builder.append("_apid=");
                builder.append(_apid);
                builder.append(", ");
            }
            if (_apidmask != null) {
                builder.append("_apidmask=");
                builder.append(_apidmask);
                builder.append(", ");
            }
            if (_apidtext != null) {
                builder.append("_apidtext=");
                builder.append(_apidtext);
                builder.append(", ");
            }
            if (_baseid != null) {
                builder.append("_baseid=");
                builder.append(_baseid);
                builder.append(", ");
            }
            if (_baselat != null) {
                builder.append("_baselat=");
                builder.append(_baselat);
                builder.append(", ");
            }
            if (_baselong != null) {
                builder.append("_baselong=");
                builder.append(_baselong);
                builder.append(", ");
            }
            if (_mcc != null) {
                builder.append("_mcc=");
                builder.append(_mcc);
                builder.append(", ");
            }
            if (_mncimsi1112 != null) {
                builder.append("_mncimsi1112=");
                builder.append(_mncimsi1112);
                builder.append(", ");
            }
            if (_nid != null) {
                builder.append("_nid=");
                builder.append(_nid);
                builder.append(", ");
            }
            if (_regzone != null) {
                builder.append("_regzone=");
                builder.append(_regzone);
                builder.append(", ");
            }
            if (_sid != null) {
                builder.append("_sid=");
                builder.append(_sid);
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
