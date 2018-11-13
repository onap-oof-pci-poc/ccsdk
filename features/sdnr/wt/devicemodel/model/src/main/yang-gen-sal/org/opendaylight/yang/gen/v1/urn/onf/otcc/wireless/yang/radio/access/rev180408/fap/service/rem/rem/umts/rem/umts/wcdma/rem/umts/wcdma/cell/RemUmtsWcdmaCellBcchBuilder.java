package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG.PlmnType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch
 *
 */
public class RemUmtsWcdmaCellBcchBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch> {

    private java.lang.Long _cellId;
    private java.lang.Long _csgid;
    private java.lang.Integer _lac;
    private java.lang.Long _pcpichTxPower;
    private PlmnType _plmnType;
    private java.lang.String _plmnid;
    private java.lang.Short _rac;
    private RemUmtsWcdmaCellBcchCsgpscSplitInfo _remUmtsWcdmaCellBcchCsgpscSplitInfo;
    private RemUmtsWcdmaCellBcchReferencePosition _remUmtsWcdmaCellBcchReferencePosition;
    private List<java.lang.Integer> _uarfcndlList;
    private java.lang.Boolean _csgIndicator;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>> augmentation = Collections.emptyMap();

    public RemUmtsWcdmaCellBcchBuilder() {
    }
    public RemUmtsWcdmaCellBcchBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG arg) {
        this._plmnType = arg.getPlmnType();
        this._plmnid = arg.getPlmnid();
        this._lac = arg.getLac();
        this._rac = arg.getRac();
        this._cellId = arg.getCellId();
        this._pcpichTxPower = arg.getPcpichTxPower();
        this._csgIndicator = arg.isCsgIndicator();
        this._csgid = arg.getCsgid();
        this._uarfcndlList = arg.getUarfcndlList();
    }

    public RemUmtsWcdmaCellBcchBuilder(RemUmtsWcdmaCellBcch base) {
        this._cellId = base.getCellId();
        this._csgid = base.getCsgid();
        this._lac = base.getLac();
        this._pcpichTxPower = base.getPcpichTxPower();
        this._plmnType = base.getPlmnType();
        this._plmnid = base.getPlmnid();
        this._rac = base.getRac();
        this._remUmtsWcdmaCellBcchCsgpscSplitInfo = base.getRemUmtsWcdmaCellBcchCsgpscSplitInfo();
        this._remUmtsWcdmaCellBcchReferencePosition = base.getRemUmtsWcdmaCellBcchReferencePosition();
        this._uarfcndlList = base.getUarfcndlList();
        this._csgIndicator = base.isCsgIndicator();
        if (base instanceof RemUmtsWcdmaCellBcchImpl) {
            RemUmtsWcdmaCellBcchImpl impl = (RemUmtsWcdmaCellBcchImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG) {
            this._plmnType = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG)arg).getPlmnType();
            this._plmnid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG)arg).getPlmnid();
            this._lac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG)arg).getLac();
            this._rac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG)arg).getRac();
            this._cellId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG)arg).getCellId();
            this._pcpichTxPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG)arg).getPcpichTxPower();
            this._csgIndicator = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG)arg).isCsgIndicator();
            this._csgid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG)arg).getCsgid();
            this._uarfcndlList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG)arg).getUarfcndlList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getCellId() {
        return _cellId;
    }
    
    public java.lang.Long getCsgid() {
        return _csgid;
    }
    
    public java.lang.Integer getLac() {
        return _lac;
    }
    
    public java.lang.Long getPcpichTxPower() {
        return _pcpichTxPower;
    }
    
    public PlmnType getPlmnType() {
        return _plmnType;
    }
    
    public java.lang.String getPlmnid() {
        return _plmnid;
    }
    
    public java.lang.Short getRac() {
        return _rac;
    }
    
    public RemUmtsWcdmaCellBcchCsgpscSplitInfo getRemUmtsWcdmaCellBcchCsgpscSplitInfo() {
        return _remUmtsWcdmaCellBcchCsgpscSplitInfo;
    }
    
    public RemUmtsWcdmaCellBcchReferencePosition getRemUmtsWcdmaCellBcchReferencePosition() {
        return _remUmtsWcdmaCellBcchReferencePosition;
    }
    
    public List<java.lang.Integer> getUarfcndlList() {
        return _uarfcndlList;
    }
    
    public java.lang.Boolean isCsgIndicator() {
        return _csgIndicator;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCellIdRange(final long value) {
         if (value >= 0L && value <= 268435455L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..268435455]].", value));
     }
    
    public RemUmtsWcdmaCellBcchBuilder setCellId(final java.lang.Long value) {
    if (value != null) {
        checkCellIdRange(value);
    }
        this._cellId = value;
        return this;
    }
    
     
     private static void checkCsgidRange(final long value) {
         if (value >= 0L && value <= 134217727L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..134217727]].", value));
     }
    
    public RemUmtsWcdmaCellBcchBuilder setCsgid(final java.lang.Long value) {
    if (value != null) {
        checkCsgidRange(value);
    }
        this._csgid = value;
        return this;
    }
    
     
     private static void checkLacRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public RemUmtsWcdmaCellBcchBuilder setLac(final java.lang.Integer value) {
    if (value != null) {
        checkLacRange(value);
    }
        this._lac = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBcchBuilder setPcpichTxPower(final java.lang.Long value) {
        this._pcpichTxPower = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBcchBuilder setPlmnType(final PlmnType value) {
        this._plmnType = value;
        return this;
    }
    
     
     private static void check_plmnidLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 6) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..6]].", value));
     }
    
    public RemUmtsWcdmaCellBcchBuilder setPlmnid(final java.lang.String value) {
    if (value != null) {
        check_plmnidLength(value);
    }
        this._plmnid = value;
        return this;
    }
    
     
     private static void checkRacRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public RemUmtsWcdmaCellBcchBuilder setRac(final java.lang.Short value) {
    if (value != null) {
        checkRacRange(value);
    }
        this._rac = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBcchBuilder setRemUmtsWcdmaCellBcchCsgpscSplitInfo(final RemUmtsWcdmaCellBcchCsgpscSplitInfo value) {
        this._remUmtsWcdmaCellBcchCsgpscSplitInfo = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBcchBuilder setRemUmtsWcdmaCellBcchReferencePosition(final RemUmtsWcdmaCellBcchReferencePosition value) {
        this._remUmtsWcdmaCellBcchReferencePosition = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBcchBuilder setUarfcndlList(final List<java.lang.Integer> value) {
        this._uarfcndlList = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBcchBuilder setCsgIndicator(final java.lang.Boolean value) {
        this._csgIndicator = value;
        return this;
    }
    
    public RemUmtsWcdmaCellBcchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemUmtsWcdmaCellBcchBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemUmtsWcdmaCellBcch build() {
        return new RemUmtsWcdmaCellBcchImpl(this);
    }

    private static final class RemUmtsWcdmaCellBcchImpl implements RemUmtsWcdmaCellBcch {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch.class;
        }

        private final java.lang.Long _cellId;
        private final java.lang.Long _csgid;
        private final java.lang.Integer _lac;
        private final java.lang.Long _pcpichTxPower;
        private final PlmnType _plmnType;
        private final java.lang.String _plmnid;
        private final java.lang.Short _rac;
        private final RemUmtsWcdmaCellBcchCsgpscSplitInfo _remUmtsWcdmaCellBcchCsgpscSplitInfo;
        private final RemUmtsWcdmaCellBcchReferencePosition _remUmtsWcdmaCellBcchReferencePosition;
        private final List<java.lang.Integer> _uarfcndlList;
        private final java.lang.Boolean _csgIndicator;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>> augmentation = Collections.emptyMap();

        private RemUmtsWcdmaCellBcchImpl(RemUmtsWcdmaCellBcchBuilder base) {
            this._cellId = base.getCellId();
            this._csgid = base.getCsgid();
            this._lac = base.getLac();
            this._pcpichTxPower = base.getPcpichTxPower();
            this._plmnType = base.getPlmnType();
            this._plmnid = base.getPlmnid();
            this._rac = base.getRac();
            this._remUmtsWcdmaCellBcchCsgpscSplitInfo = base.getRemUmtsWcdmaCellBcchCsgpscSplitInfo();
            this._remUmtsWcdmaCellBcchReferencePosition = base.getRemUmtsWcdmaCellBcchReferencePosition();
            this._uarfcndlList = base.getUarfcndlList();
            this._csgIndicator = base.isCsgIndicator();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCellId() {
            return _cellId;
        }
        
        @Override
        public java.lang.Long getCsgid() {
            return _csgid;
        }
        
        @Override
        public java.lang.Integer getLac() {
            return _lac;
        }
        
        @Override
        public java.lang.Long getPcpichTxPower() {
            return _pcpichTxPower;
        }
        
        @Override
        public PlmnType getPlmnType() {
            return _plmnType;
        }
        
        @Override
        public java.lang.String getPlmnid() {
            return _plmnid;
        }
        
        @Override
        public java.lang.Short getRac() {
            return _rac;
        }
        
        @Override
        public RemUmtsWcdmaCellBcchCsgpscSplitInfo getRemUmtsWcdmaCellBcchCsgpscSplitInfo() {
            return _remUmtsWcdmaCellBcchCsgpscSplitInfo;
        }
        
        @Override
        public RemUmtsWcdmaCellBcchReferencePosition getRemUmtsWcdmaCellBcchReferencePosition() {
            return _remUmtsWcdmaCellBcchReferencePosition;
        }
        
        @Override
        public List<java.lang.Integer> getUarfcndlList() {
            return _uarfcndlList;
        }
        
        @Override
        public java.lang.Boolean isCsgIndicator() {
            return _csgIndicator;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cellId);
            result = prime * result + Objects.hashCode(_csgid);
            result = prime * result + Objects.hashCode(_lac);
            result = prime * result + Objects.hashCode(_pcpichTxPower);
            result = prime * result + Objects.hashCode(_plmnType);
            result = prime * result + Objects.hashCode(_plmnid);
            result = prime * result + Objects.hashCode(_rac);
            result = prime * result + Objects.hashCode(_remUmtsWcdmaCellBcchCsgpscSplitInfo);
            result = prime * result + Objects.hashCode(_remUmtsWcdmaCellBcchReferencePosition);
            result = prime * result + Objects.hashCode(_uarfcndlList);
            result = prime * result + Objects.hashCode(_csgIndicator);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch)obj;
            if (!Objects.equals(_cellId, other.getCellId())) {
                return false;
            }
            if (!Objects.equals(_csgid, other.getCsgid())) {
                return false;
            }
            if (!Objects.equals(_lac, other.getLac())) {
                return false;
            }
            if (!Objects.equals(_pcpichTxPower, other.getPcpichTxPower())) {
                return false;
            }
            if (!Objects.equals(_plmnType, other.getPlmnType())) {
                return false;
            }
            if (!Objects.equals(_plmnid, other.getPlmnid())) {
                return false;
            }
            if (!Objects.equals(_rac, other.getRac())) {
                return false;
            }
            if (!Objects.equals(_remUmtsWcdmaCellBcchCsgpscSplitInfo, other.getRemUmtsWcdmaCellBcchCsgpscSplitInfo())) {
                return false;
            }
            if (!Objects.equals(_remUmtsWcdmaCellBcchReferencePosition, other.getRemUmtsWcdmaCellBcchReferencePosition())) {
                return false;
            }
            if (!Objects.equals(_uarfcndlList, other.getUarfcndlList())) {
                return false;
            }
            if (!Objects.equals(_csgIndicator, other.isCsgIndicator())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemUmtsWcdmaCellBcchImpl otherImpl = (RemUmtsWcdmaCellBcchImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemUmtsWcdmaCellBcch [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cellId != null) {
                builder.append("_cellId=");
                builder.append(_cellId);
                builder.append(", ");
            }
            if (_csgid != null) {
                builder.append("_csgid=");
                builder.append(_csgid);
                builder.append(", ");
            }
            if (_lac != null) {
                builder.append("_lac=");
                builder.append(_lac);
                builder.append(", ");
            }
            if (_pcpichTxPower != null) {
                builder.append("_pcpichTxPower=");
                builder.append(_pcpichTxPower);
                builder.append(", ");
            }
            if (_plmnType != null) {
                builder.append("_plmnType=");
                builder.append(_plmnType);
                builder.append(", ");
            }
            if (_plmnid != null) {
                builder.append("_plmnid=");
                builder.append(_plmnid);
                builder.append(", ");
            }
            if (_rac != null) {
                builder.append("_rac=");
                builder.append(_rac);
                builder.append(", ");
            }
            if (_remUmtsWcdmaCellBcchCsgpscSplitInfo != null) {
                builder.append("_remUmtsWcdmaCellBcchCsgpscSplitInfo=");
                builder.append(_remUmtsWcdmaCellBcchCsgpscSplitInfo);
                builder.append(", ");
            }
            if (_remUmtsWcdmaCellBcchReferencePosition != null) {
                builder.append("_remUmtsWcdmaCellBcchReferencePosition=");
                builder.append(_remUmtsWcdmaCellBcchReferencePosition);
                builder.append(", ");
            }
            if (_uarfcndlList != null) {
                builder.append("_uarfcndlList=");
                builder.append(_uarfcndlList);
                builder.append(", ");
            }
            if (_csgIndicator != null) {
                builder.append("_csgIndicator=");
                builder.append(_csgIndicator);
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
