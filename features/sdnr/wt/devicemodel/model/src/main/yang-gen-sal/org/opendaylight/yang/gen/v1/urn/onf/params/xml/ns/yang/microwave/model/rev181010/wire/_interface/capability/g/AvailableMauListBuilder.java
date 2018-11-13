package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MiiKindType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PmdNameType;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MdiKindType;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MediumKindType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList
 *
 */
public class AvailableMauListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList> {

    private java.lang.String _dateCode;
    private AvailableMauListKey _key;
    private java.lang.Integer _linkLengthMax;
    private UniversalId _mauId;
    private MdiKindType _mdiKind;
    private MiiKindType _miiKind;
    private java.lang.String _partNumber;
    private List<PmdNameType> _pmdList;
    private MediumKindType _requiredMediumKind;
    private java.lang.String _revisionNumber;
    private java.lang.String _serialNumber;
    private List<SignalOrderingList> _signalOrderingList;
    private List<java.lang.String> _supportedAlarms;
    private java.lang.String _vendorName;
    private java.lang.String _vendorOui;
    private java.lang.Integer _wavelengthGridMin;
    private List<java.lang.Integer> _wavelengthMax;
    private List<java.lang.Integer> _wavelengthMin;
    private java.lang.Boolean _autoSignalOrderingIsAvail;
    private java.lang.Boolean _eeeIsAvail;
    private java.lang.Boolean _shortReachModeIsAvail;
    private java.lang.Boolean _unidirectionalOperationIsAvail;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>> augmentation = Collections.emptyMap();

    public AvailableMauListBuilder() {
    }
    public AvailableMauListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG arg) {
        this._mauId = arg.getMauId();
        this._miiKind = arg.getMiiKind();
        this._mdiKind = arg.getMdiKind();
        this._requiredMediumKind = arg.getRequiredMediumKind();
        this._wavelengthMin = arg.getWavelengthMin();
        this._wavelengthMax = arg.getWavelengthMax();
        this._wavelengthGridMin = arg.getWavelengthGridMin();
        this._linkLengthMax = arg.getLinkLengthMax();
        this._vendorName = arg.getVendorName();
        this._vendorOui = arg.getVendorOui();
        this._partNumber = arg.getPartNumber();
        this._revisionNumber = arg.getRevisionNumber();
        this._serialNumber = arg.getSerialNumber();
        this._dateCode = arg.getDateCode();
        this._pmdList = arg.getPmdList();
        this._signalOrderingList = arg.getSignalOrderingList();
        this._autoSignalOrderingIsAvail = arg.isAutoSignalOrderingIsAvail();
        this._shortReachModeIsAvail = arg.isShortReachModeIsAvail();
        this._eeeIsAvail = arg.isEeeIsAvail();
        this._unidirectionalOperationIsAvail = arg.isUnidirectionalOperationIsAvail();
        this._supportedAlarms = arg.getSupportedAlarms();
    }

    public AvailableMauListBuilder(AvailableMauList base) {
        if (base.getKey() == null) {
            this._key = new AvailableMauListKey(
                base.getMauId()
            );
            this._mauId = base.getMauId();
        } else {
            this._key = base.getKey();
            this._mauId = _key.getMauId();
        }
        this._dateCode = base.getDateCode();
        this._linkLengthMax = base.getLinkLengthMax();
        this._mdiKind = base.getMdiKind();
        this._miiKind = base.getMiiKind();
        this._partNumber = base.getPartNumber();
        this._pmdList = base.getPmdList();
        this._requiredMediumKind = base.getRequiredMediumKind();
        this._revisionNumber = base.getRevisionNumber();
        this._serialNumber = base.getSerialNumber();
        this._signalOrderingList = base.getSignalOrderingList();
        this._supportedAlarms = base.getSupportedAlarms();
        this._vendorName = base.getVendorName();
        this._vendorOui = base.getVendorOui();
        this._wavelengthGridMin = base.getWavelengthGridMin();
        this._wavelengthMax = base.getWavelengthMax();
        this._wavelengthMin = base.getWavelengthMin();
        this._autoSignalOrderingIsAvail = base.isAutoSignalOrderingIsAvail();
        this._eeeIsAvail = base.isEeeIsAvail();
        this._shortReachModeIsAvail = base.isShortReachModeIsAvail();
        this._unidirectionalOperationIsAvail = base.isUnidirectionalOperationIsAvail();
        if (base instanceof AvailableMauListImpl) {
            AvailableMauListImpl impl = (AvailableMauListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG) {
            this._mauId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getMauId();
            this._miiKind = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getMiiKind();
            this._mdiKind = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getMdiKind();
            this._requiredMediumKind = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getRequiredMediumKind();
            this._wavelengthMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getWavelengthMin();
            this._wavelengthMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getWavelengthMax();
            this._wavelengthGridMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getWavelengthGridMin();
            this._linkLengthMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getLinkLengthMax();
            this._vendorName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getVendorName();
            this._vendorOui = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getVendorOui();
            this._partNumber = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getPartNumber();
            this._revisionNumber = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getRevisionNumber();
            this._serialNumber = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getSerialNumber();
            this._dateCode = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getDateCode();
            this._pmdList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getPmdList();
            this._signalOrderingList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getSignalOrderingList();
            this._autoSignalOrderingIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).isAutoSignalOrderingIsAvail();
            this._shortReachModeIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).isShortReachModeIsAvail();
            this._eeeIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).isEeeIsAvail();
            this._unidirectionalOperationIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).isUnidirectionalOperationIsAvail();
            this._supportedAlarms = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG)arg).getSupportedAlarms();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDateCode() {
        return _dateCode;
    }
    
    public AvailableMauListKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getLinkLengthMax() {
        return _linkLengthMax;
    }
    
    public UniversalId getMauId() {
        return _mauId;
    }
    
    public MdiKindType getMdiKind() {
        return _mdiKind;
    }
    
    public MiiKindType getMiiKind() {
        return _miiKind;
    }
    
    public java.lang.String getPartNumber() {
        return _partNumber;
    }
    
    public List<PmdNameType> getPmdList() {
        return _pmdList;
    }
    
    public MediumKindType getRequiredMediumKind() {
        return _requiredMediumKind;
    }
    
    public java.lang.String getRevisionNumber() {
        return _revisionNumber;
    }
    
    public java.lang.String getSerialNumber() {
        return _serialNumber;
    }
    
    public List<SignalOrderingList> getSignalOrderingList() {
        return _signalOrderingList;
    }
    
    public List<java.lang.String> getSupportedAlarms() {
        return _supportedAlarms;
    }
    
    public java.lang.String getVendorName() {
        return _vendorName;
    }
    
    public java.lang.String getVendorOui() {
        return _vendorOui;
    }
    
    public java.lang.Integer getWavelengthGridMin() {
        return _wavelengthGridMin;
    }
    
    public List<java.lang.Integer> getWavelengthMax() {
        return _wavelengthMax;
    }
    
    public List<java.lang.Integer> getWavelengthMin() {
        return _wavelengthMin;
    }
    
    public java.lang.Boolean isAutoSignalOrderingIsAvail() {
        return _autoSignalOrderingIsAvail;
    }
    
    public java.lang.Boolean isEeeIsAvail() {
        return _eeeIsAvail;
    }
    
    public java.lang.Boolean isShortReachModeIsAvail() {
        return _shortReachModeIsAvail;
    }
    
    public java.lang.Boolean isUnidirectionalOperationIsAvail() {
        return _unidirectionalOperationIsAvail;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AvailableMauListBuilder setDateCode(final java.lang.String value) {
        this._dateCode = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setKey(final AvailableMauListKey value) {
        this._key = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setLinkLengthMax(final java.lang.Integer value) {
        this._linkLengthMax = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setMauId(final UniversalId value) {
        this._mauId = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setMdiKind(final MdiKindType value) {
        this._mdiKind = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setMiiKind(final MiiKindType value) {
        this._miiKind = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setPartNumber(final java.lang.String value) {
        this._partNumber = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setPmdList(final List<PmdNameType> value) {
        this._pmdList = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setRequiredMediumKind(final MediumKindType value) {
        this._requiredMediumKind = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setRevisionNumber(final java.lang.String value) {
        this._revisionNumber = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setSerialNumber(final java.lang.String value) {
        this._serialNumber = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setSignalOrderingList(final List<SignalOrderingList> value) {
        this._signalOrderingList = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setSupportedAlarms(final List<java.lang.String> value) {
        this._supportedAlarms = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setVendorName(final java.lang.String value) {
        this._vendorName = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setVendorOui(final java.lang.String value) {
        this._vendorOui = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setWavelengthGridMin(final java.lang.Integer value) {
        this._wavelengthGridMin = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setWavelengthMax(final List<java.lang.Integer> value) {
        this._wavelengthMax = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setWavelengthMin(final List<java.lang.Integer> value) {
        this._wavelengthMin = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setAutoSignalOrderingIsAvail(final java.lang.Boolean value) {
        this._autoSignalOrderingIsAvail = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setEeeIsAvail(final java.lang.Boolean value) {
        this._eeeIsAvail = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setShortReachModeIsAvail(final java.lang.Boolean value) {
        this._shortReachModeIsAvail = value;
        return this;
    }
    
     
    public AvailableMauListBuilder setUnidirectionalOperationIsAvail(final java.lang.Boolean value) {
        this._unidirectionalOperationIsAvail = value;
        return this;
    }
    
    public AvailableMauListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AvailableMauListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AvailableMauList build() {
        return new AvailableMauListImpl(this);
    }

    private static final class AvailableMauListImpl implements AvailableMauList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList.class;
        }

        private final java.lang.String _dateCode;
        private final AvailableMauListKey _key;
        private final java.lang.Integer _linkLengthMax;
        private final UniversalId _mauId;
        private final MdiKindType _mdiKind;
        private final MiiKindType _miiKind;
        private final java.lang.String _partNumber;
        private final List<PmdNameType> _pmdList;
        private final MediumKindType _requiredMediumKind;
        private final java.lang.String _revisionNumber;
        private final java.lang.String _serialNumber;
        private final List<SignalOrderingList> _signalOrderingList;
        private final List<java.lang.String> _supportedAlarms;
        private final java.lang.String _vendorName;
        private final java.lang.String _vendorOui;
        private final java.lang.Integer _wavelengthGridMin;
        private final List<java.lang.Integer> _wavelengthMax;
        private final List<java.lang.Integer> _wavelengthMin;
        private final java.lang.Boolean _autoSignalOrderingIsAvail;
        private final java.lang.Boolean _eeeIsAvail;
        private final java.lang.Boolean _shortReachModeIsAvail;
        private final java.lang.Boolean _unidirectionalOperationIsAvail;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>> augmentation = Collections.emptyMap();

        private AvailableMauListImpl(AvailableMauListBuilder base) {
            if (base.getKey() == null) {
                this._key = new AvailableMauListKey(
                    base.getMauId()
                );
                this._mauId = base.getMauId();
            } else {
                this._key = base.getKey();
                this._mauId = _key.getMauId();
            }
            this._dateCode = base.getDateCode();
            this._linkLengthMax = base.getLinkLengthMax();
            this._mdiKind = base.getMdiKind();
            this._miiKind = base.getMiiKind();
            this._partNumber = base.getPartNumber();
            this._pmdList = base.getPmdList();
            this._requiredMediumKind = base.getRequiredMediumKind();
            this._revisionNumber = base.getRevisionNumber();
            this._serialNumber = base.getSerialNumber();
            this._signalOrderingList = base.getSignalOrderingList();
            this._supportedAlarms = base.getSupportedAlarms();
            this._vendorName = base.getVendorName();
            this._vendorOui = base.getVendorOui();
            this._wavelengthGridMin = base.getWavelengthGridMin();
            this._wavelengthMax = base.getWavelengthMax();
            this._wavelengthMin = base.getWavelengthMin();
            this._autoSignalOrderingIsAvail = base.isAutoSignalOrderingIsAvail();
            this._eeeIsAvail = base.isEeeIsAvail();
            this._shortReachModeIsAvail = base.isShortReachModeIsAvail();
            this._unidirectionalOperationIsAvail = base.isUnidirectionalOperationIsAvail();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDateCode() {
            return _dateCode;
        }
        
        @Override
        public AvailableMauListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getLinkLengthMax() {
            return _linkLengthMax;
        }
        
        @Override
        public UniversalId getMauId() {
            return _mauId;
        }
        
        @Override
        public MdiKindType getMdiKind() {
            return _mdiKind;
        }
        
        @Override
        public MiiKindType getMiiKind() {
            return _miiKind;
        }
        
        @Override
        public java.lang.String getPartNumber() {
            return _partNumber;
        }
        
        @Override
        public List<PmdNameType> getPmdList() {
            return _pmdList;
        }
        
        @Override
        public MediumKindType getRequiredMediumKind() {
            return _requiredMediumKind;
        }
        
        @Override
        public java.lang.String getRevisionNumber() {
            return _revisionNumber;
        }
        
        @Override
        public java.lang.String getSerialNumber() {
            return _serialNumber;
        }
        
        @Override
        public List<SignalOrderingList> getSignalOrderingList() {
            return _signalOrderingList;
        }
        
        @Override
        public List<java.lang.String> getSupportedAlarms() {
            return _supportedAlarms;
        }
        
        @Override
        public java.lang.String getVendorName() {
            return _vendorName;
        }
        
        @Override
        public java.lang.String getVendorOui() {
            return _vendorOui;
        }
        
        @Override
        public java.lang.Integer getWavelengthGridMin() {
            return _wavelengthGridMin;
        }
        
        @Override
        public List<java.lang.Integer> getWavelengthMax() {
            return _wavelengthMax;
        }
        
        @Override
        public List<java.lang.Integer> getWavelengthMin() {
            return _wavelengthMin;
        }
        
        @Override
        public java.lang.Boolean isAutoSignalOrderingIsAvail() {
            return _autoSignalOrderingIsAvail;
        }
        
        @Override
        public java.lang.Boolean isEeeIsAvail() {
            return _eeeIsAvail;
        }
        
        @Override
        public java.lang.Boolean isShortReachModeIsAvail() {
            return _shortReachModeIsAvail;
        }
        
        @Override
        public java.lang.Boolean isUnidirectionalOperationIsAvail() {
            return _unidirectionalOperationIsAvail;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dateCode);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_linkLengthMax);
            result = prime * result + Objects.hashCode(_mauId);
            result = prime * result + Objects.hashCode(_mdiKind);
            result = prime * result + Objects.hashCode(_miiKind);
            result = prime * result + Objects.hashCode(_partNumber);
            result = prime * result + Objects.hashCode(_pmdList);
            result = prime * result + Objects.hashCode(_requiredMediumKind);
            result = prime * result + Objects.hashCode(_revisionNumber);
            result = prime * result + Objects.hashCode(_serialNumber);
            result = prime * result + Objects.hashCode(_signalOrderingList);
            result = prime * result + Objects.hashCode(_supportedAlarms);
            result = prime * result + Objects.hashCode(_vendorName);
            result = prime * result + Objects.hashCode(_vendorOui);
            result = prime * result + Objects.hashCode(_wavelengthGridMin);
            result = prime * result + Objects.hashCode(_wavelengthMax);
            result = prime * result + Objects.hashCode(_wavelengthMin);
            result = prime * result + Objects.hashCode(_autoSignalOrderingIsAvail);
            result = prime * result + Objects.hashCode(_eeeIsAvail);
            result = prime * result + Objects.hashCode(_shortReachModeIsAvail);
            result = prime * result + Objects.hashCode(_unidirectionalOperationIsAvail);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList)obj;
            if (!Objects.equals(_dateCode, other.getDateCode())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_linkLengthMax, other.getLinkLengthMax())) {
                return false;
            }
            if (!Objects.equals(_mauId, other.getMauId())) {
                return false;
            }
            if (!Objects.equals(_mdiKind, other.getMdiKind())) {
                return false;
            }
            if (!Objects.equals(_miiKind, other.getMiiKind())) {
                return false;
            }
            if (!Objects.equals(_partNumber, other.getPartNumber())) {
                return false;
            }
            if (!Objects.equals(_pmdList, other.getPmdList())) {
                return false;
            }
            if (!Objects.equals(_requiredMediumKind, other.getRequiredMediumKind())) {
                return false;
            }
            if (!Objects.equals(_revisionNumber, other.getRevisionNumber())) {
                return false;
            }
            if (!Objects.equals(_serialNumber, other.getSerialNumber())) {
                return false;
            }
            if (!Objects.equals(_signalOrderingList, other.getSignalOrderingList())) {
                return false;
            }
            if (!Objects.equals(_supportedAlarms, other.getSupportedAlarms())) {
                return false;
            }
            if (!Objects.equals(_vendorName, other.getVendorName())) {
                return false;
            }
            if (!Objects.equals(_vendorOui, other.getVendorOui())) {
                return false;
            }
            if (!Objects.equals(_wavelengthGridMin, other.getWavelengthGridMin())) {
                return false;
            }
            if (!Objects.equals(_wavelengthMax, other.getWavelengthMax())) {
                return false;
            }
            if (!Objects.equals(_wavelengthMin, other.getWavelengthMin())) {
                return false;
            }
            if (!Objects.equals(_autoSignalOrderingIsAvail, other.isAutoSignalOrderingIsAvail())) {
                return false;
            }
            if (!Objects.equals(_eeeIsAvail, other.isEeeIsAvail())) {
                return false;
            }
            if (!Objects.equals(_shortReachModeIsAvail, other.isShortReachModeIsAvail())) {
                return false;
            }
            if (!Objects.equals(_unidirectionalOperationIsAvail, other.isUnidirectionalOperationIsAvail())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AvailableMauListImpl otherImpl = (AvailableMauListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AvailableMauList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_dateCode != null) {
                builder.append("_dateCode=");
                builder.append(_dateCode);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_linkLengthMax != null) {
                builder.append("_linkLengthMax=");
                builder.append(_linkLengthMax);
                builder.append(", ");
            }
            if (_mauId != null) {
                builder.append("_mauId=");
                builder.append(_mauId);
                builder.append(", ");
            }
            if (_mdiKind != null) {
                builder.append("_mdiKind=");
                builder.append(_mdiKind);
                builder.append(", ");
            }
            if (_miiKind != null) {
                builder.append("_miiKind=");
                builder.append(_miiKind);
                builder.append(", ");
            }
            if (_partNumber != null) {
                builder.append("_partNumber=");
                builder.append(_partNumber);
                builder.append(", ");
            }
            if (_pmdList != null) {
                builder.append("_pmdList=");
                builder.append(_pmdList);
                builder.append(", ");
            }
            if (_requiredMediumKind != null) {
                builder.append("_requiredMediumKind=");
                builder.append(_requiredMediumKind);
                builder.append(", ");
            }
            if (_revisionNumber != null) {
                builder.append("_revisionNumber=");
                builder.append(_revisionNumber);
                builder.append(", ");
            }
            if (_serialNumber != null) {
                builder.append("_serialNumber=");
                builder.append(_serialNumber);
                builder.append(", ");
            }
            if (_signalOrderingList != null) {
                builder.append("_signalOrderingList=");
                builder.append(_signalOrderingList);
                builder.append(", ");
            }
            if (_supportedAlarms != null) {
                builder.append("_supportedAlarms=");
                builder.append(_supportedAlarms);
                builder.append(", ");
            }
            if (_vendorName != null) {
                builder.append("_vendorName=");
                builder.append(_vendorName);
                builder.append(", ");
            }
            if (_vendorOui != null) {
                builder.append("_vendorOui=");
                builder.append(_vendorOui);
                builder.append(", ");
            }
            if (_wavelengthGridMin != null) {
                builder.append("_wavelengthGridMin=");
                builder.append(_wavelengthGridMin);
                builder.append(", ");
            }
            if (_wavelengthMax != null) {
                builder.append("_wavelengthMax=");
                builder.append(_wavelengthMax);
                builder.append(", ");
            }
            if (_wavelengthMin != null) {
                builder.append("_wavelengthMin=");
                builder.append(_wavelengthMin);
                builder.append(", ");
            }
            if (_autoSignalOrderingIsAvail != null) {
                builder.append("_autoSignalOrderingIsAvail=");
                builder.append(_autoSignalOrderingIsAvail);
                builder.append(", ");
            }
            if (_eeeIsAvail != null) {
                builder.append("_eeeIsAvail=");
                builder.append(_eeeIsAvail);
                builder.append(", ");
            }
            if (_shortReachModeIsAvail != null) {
                builder.append("_shortReachModeIsAvail=");
                builder.append(_shortReachModeIsAvail);
                builder.append(", ");
            }
            if (_unidirectionalOperationIsAvail != null) {
                builder.append("_unidirectionalOperationIsAvail=");
                builder.append(_unidirectionalOperationIsAvail);
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
