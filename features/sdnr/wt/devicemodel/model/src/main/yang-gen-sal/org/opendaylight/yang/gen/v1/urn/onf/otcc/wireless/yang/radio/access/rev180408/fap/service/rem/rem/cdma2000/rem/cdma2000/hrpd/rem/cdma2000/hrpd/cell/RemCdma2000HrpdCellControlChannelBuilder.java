package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel
 *
 */
public class RemCdma2000HrpdCellControlChannelBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel> {

    private java.lang.Long _colorCode;
    private java.lang.Long _countryCode;
    private java.lang.Long _latitude;
    private java.lang.Long _longitude;
    private byte[] _sectorId;
    private java.lang.Long _subnetMask;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>> augmentation = Collections.emptyMap();

    public RemCdma2000HrpdCellControlChannelBuilder() {
    }
    public RemCdma2000HrpdCellControlChannelBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG arg) {
        this._colorCode = arg.getColorCode();
        this._sectorId = arg.getSectorId();
        this._subnetMask = arg.getSubnetMask();
        this._countryCode = arg.getCountryCode();
        this._latitude = arg.getLatitude();
        this._longitude = arg.getLongitude();
    }

    public RemCdma2000HrpdCellControlChannelBuilder(RemCdma2000HrpdCellControlChannel base) {
        this._colorCode = base.getColorCode();
        this._countryCode = base.getCountryCode();
        this._latitude = base.getLatitude();
        this._longitude = base.getLongitude();
        this._sectorId = base.getSectorId();
        this._subnetMask = base.getSubnetMask();
        if (base instanceof RemCdma2000HrpdCellControlChannelImpl) {
            RemCdma2000HrpdCellControlChannelImpl impl = (RemCdma2000HrpdCellControlChannelImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG) {
            this._colorCode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG)arg).getColorCode();
            this._sectorId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG)arg).getSectorId();
            this._subnetMask = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG)arg).getSubnetMask();
            this._countryCode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG)arg).getCountryCode();
            this._latitude = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG)arg).getLatitude();
            this._longitude = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG)arg).getLongitude();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getColorCode() {
        return _colorCode;
    }
    
    public java.lang.Long getCountryCode() {
        return _countryCode;
    }
    
    public java.lang.Long getLatitude() {
        return _latitude;
    }
    
    public java.lang.Long getLongitude() {
        return _longitude;
    }
    
    public byte[] getSectorId() {
        return _sectorId == null ? null : _sectorId.clone();
    }
    
    public java.lang.Long getSubnetMask() {
        return _subnetMask;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemCdma2000HrpdCellControlChannelBuilder setColorCode(final java.lang.Long value) {
        this._colorCode = value;
        return this;
    }
    
     
    public RemCdma2000HrpdCellControlChannelBuilder setCountryCode(final java.lang.Long value) {
        this._countryCode = value;
        return this;
    }
    
     
    public RemCdma2000HrpdCellControlChannelBuilder setLatitude(final java.lang.Long value) {
        this._latitude = value;
        return this;
    }
    
     
    public RemCdma2000HrpdCellControlChannelBuilder setLongitude(final java.lang.Long value) {
        this._longitude = value;
        return this;
    }
    
     
     private static void check_sectorIdLength(final byte[] value) {
         final int length = value.length;
         if (length >= 16 && length <= 16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[16..16]].", java.util.Arrays.toString(value)));
     }
    
    public RemCdma2000HrpdCellControlChannelBuilder setSectorId(final byte[] value) {
    if (value != null) {
        check_sectorIdLength(value);
    }
        this._sectorId = value;
        return this;
    }
    
     
    public RemCdma2000HrpdCellControlChannelBuilder setSubnetMask(final java.lang.Long value) {
        this._subnetMask = value;
        return this;
    }
    
    public RemCdma2000HrpdCellControlChannelBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemCdma2000HrpdCellControlChannelBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemCdma2000HrpdCellControlChannel build() {
        return new RemCdma2000HrpdCellControlChannelImpl(this);
    }

    private static final class RemCdma2000HrpdCellControlChannelImpl implements RemCdma2000HrpdCellControlChannel {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel.class;
        }

        private final java.lang.Long _colorCode;
        private final java.lang.Long _countryCode;
        private final java.lang.Long _latitude;
        private final java.lang.Long _longitude;
        private final byte[] _sectorId;
        private final java.lang.Long _subnetMask;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>> augmentation = Collections.emptyMap();

        private RemCdma2000HrpdCellControlChannelImpl(RemCdma2000HrpdCellControlChannelBuilder base) {
            this._colorCode = base.getColorCode();
            this._countryCode = base.getCountryCode();
            this._latitude = base.getLatitude();
            this._longitude = base.getLongitude();
            this._sectorId = base.getSectorId();
            this._subnetMask = base.getSubnetMask();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getColorCode() {
            return _colorCode;
        }
        
        @Override
        public java.lang.Long getCountryCode() {
            return _countryCode;
        }
        
        @Override
        public java.lang.Long getLatitude() {
            return _latitude;
        }
        
        @Override
        public java.lang.Long getLongitude() {
            return _longitude;
        }
        
        @Override
        public byte[] getSectorId() {
            return _sectorId == null ? null : _sectorId.clone();
        }
        
        @Override
        public java.lang.Long getSubnetMask() {
            return _subnetMask;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_colorCode);
            result = prime * result + Objects.hashCode(_countryCode);
            result = prime * result + Objects.hashCode(_latitude);
            result = prime * result + Objects.hashCode(_longitude);
            result = prime * result + Arrays.hashCode(_sectorId);
            result = prime * result + Objects.hashCode(_subnetMask);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel)obj;
            if (!Objects.equals(_colorCode, other.getColorCode())) {
                return false;
            }
            if (!Objects.equals(_countryCode, other.getCountryCode())) {
                return false;
            }
            if (!Objects.equals(_latitude, other.getLatitude())) {
                return false;
            }
            if (!Objects.equals(_longitude, other.getLongitude())) {
                return false;
            }
            if (!Arrays.equals(_sectorId, other.getSectorId())) {
                return false;
            }
            if (!Objects.equals(_subnetMask, other.getSubnetMask())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemCdma2000HrpdCellControlChannelImpl otherImpl = (RemCdma2000HrpdCellControlChannelImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemCdma2000HrpdCellControlChannel [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_colorCode != null) {
                builder.append("_colorCode=");
                builder.append(_colorCode);
                builder.append(", ");
            }
            if (_countryCode != null) {
                builder.append("_countryCode=");
                builder.append(_countryCode);
                builder.append(", ");
            }
            if (_latitude != null) {
                builder.append("_latitude=");
                builder.append(_latitude);
                builder.append(", ");
            }
            if (_longitude != null) {
                builder.append("_longitude=");
                builder.append(_longitude);
                builder.append(", ");
            }
            if (_sectorId != null) {
                builder.append("_sectorId=");
                builder.append(Arrays.toString(_sectorId));
                builder.append(", ");
            }
            if (_subnetMask != null) {
                builder.append("_subnetMask=");
                builder.append(_subnetMask);
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
