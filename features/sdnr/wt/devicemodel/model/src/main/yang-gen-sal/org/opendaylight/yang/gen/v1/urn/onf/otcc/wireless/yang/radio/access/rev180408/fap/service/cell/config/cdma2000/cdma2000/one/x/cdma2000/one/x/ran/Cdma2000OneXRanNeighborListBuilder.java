package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG.NeighborBand;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG.AirInterface;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG.NeighborConfig;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG.SearchPriority;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList
 *
 */
public class Cdma2000OneXRanNeighborListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList> {

    private AirInterface _airInterface;
    private java.lang.String _alias;
    private java.lang.Long _baseIdentifier;
    private java.lang.Long _frequencyIncluded;
    private java.lang.Long _handOutCapable;
    private java.lang.Long _inTraffic;
    private Cdma2000OneXRanNeighborListKey _key;
    private NeighborBand _neighborBand;
    private NeighborConfig _neighborConfig;
    private java.lang.Long _neighborFrequency;
    private java.lang.Long _neighborPn;
    private java.lang.Long _oneXNeighborIndex;
    private java.lang.Integer _oneXNeighborIosCellId;
    private java.lang.String _oneXNeighborLatitude;
    private java.lang.String _oneXNeighborLongitude;
    private java.lang.Long _oneXNeighborMscId;
    private java.lang.Long _overheadMsg;
    private java.lang.Long _pilotInc;
    private SearchPriority _searchPriority;
    private java.lang.Boolean _enable;
    private java.lang.Boolean _forceInOverhead;
    private java.lang.Boolean _includedInOverhead;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanNeighborListBuilder() {
    }
    public Cdma2000OneXRanNeighborListBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._pilotInc = arg.getPilotInc();
        this._oneXNeighborIndex = arg.getOneXNeighborIndex();
        this._neighborConfig = arg.getNeighborConfig();
        this._neighborPn = arg.getNeighborPn();
        this._searchPriority = arg.getSearchPriority();
        this._neighborBand = arg.getNeighborBand();
        this._neighborFrequency = arg.getNeighborFrequency();
        this._frequencyIncluded = arg.getFrequencyIncluded();
        this._inTraffic = arg.getInTraffic();
        this._overheadMsg = arg.getOverheadMsg();
        this._baseIdentifier = arg.getBaseIdentifier();
        this._airInterface = arg.getAirInterface();
        this._handOutCapable = arg.getHandOutCapable();
        this._oneXNeighborLongitude = arg.getOneXNeighborLongitude();
        this._oneXNeighborLatitude = arg.getOneXNeighborLatitude();
        this._oneXNeighborMscId = arg.getOneXNeighborMscId();
        this._oneXNeighborIosCellId = arg.getOneXNeighborIosCellId();
        this._forceInOverhead = arg.isForceInOverhead();
        this._includedInOverhead = arg.isIncludedInOverhead();
    }

    public Cdma2000OneXRanNeighborListBuilder(Cdma2000OneXRanNeighborList base) {
        if (base.getKey() == null) {
            this._key = new Cdma2000OneXRanNeighborListKey(
                base.getNeighborPn(), 
                base.getOneXNeighborIndex()
            );
            this._neighborPn = base.getNeighborPn();
            this._oneXNeighborIndex = base.getOneXNeighborIndex();
        } else {
            this._key = base.getKey();
            this._neighborPn = _key.getNeighborPn();
            this._oneXNeighborIndex = _key.getOneXNeighborIndex();
        }
        this._airInterface = base.getAirInterface();
        this._alias = base.getAlias();
        this._baseIdentifier = base.getBaseIdentifier();
        this._frequencyIncluded = base.getFrequencyIncluded();
        this._handOutCapable = base.getHandOutCapable();
        this._inTraffic = base.getInTraffic();
        this._neighborBand = base.getNeighborBand();
        this._neighborConfig = base.getNeighborConfig();
        this._neighborFrequency = base.getNeighborFrequency();
        this._oneXNeighborIosCellId = base.getOneXNeighborIosCellId();
        this._oneXNeighborLatitude = base.getOneXNeighborLatitude();
        this._oneXNeighborLongitude = base.getOneXNeighborLongitude();
        this._oneXNeighborMscId = base.getOneXNeighborMscId();
        this._overheadMsg = base.getOverheadMsg();
        this._pilotInc = base.getPilotInc();
        this._searchPriority = base.getSearchPriority();
        this._enable = base.isEnable();
        this._forceInOverhead = base.isForceInOverhead();
        this._includedInOverhead = base.isIncludedInOverhead();
        if (base instanceof Cdma2000OneXRanNeighborListImpl) {
            Cdma2000OneXRanNeighborListImpl impl = (Cdma2000OneXRanNeighborListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getAlias();
            this._pilotInc = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getPilotInc();
            this._oneXNeighborIndex = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getOneXNeighborIndex();
            this._neighborConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getNeighborConfig();
            this._neighborPn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getNeighborPn();
            this._searchPriority = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getSearchPriority();
            this._neighborBand = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getNeighborBand();
            this._neighborFrequency = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getNeighborFrequency();
            this._frequencyIncluded = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getFrequencyIncluded();
            this._inTraffic = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getInTraffic();
            this._overheadMsg = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getOverheadMsg();
            this._baseIdentifier = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getBaseIdentifier();
            this._airInterface = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getAirInterface();
            this._handOutCapable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getHandOutCapable();
            this._oneXNeighborLongitude = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getOneXNeighborLongitude();
            this._oneXNeighborLatitude = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getOneXNeighborLatitude();
            this._oneXNeighborMscId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getOneXNeighborMscId();
            this._oneXNeighborIosCellId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).getOneXNeighborIosCellId();
            this._forceInOverhead = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).isForceInOverhead();
            this._includedInOverhead = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG)arg).isIncludedInOverhead();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNeighborListG] \n" +
              "but was: " + arg
            );
        }
    }

    public AirInterface getAirInterface() {
        return _airInterface;
    }
    
    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.Long getBaseIdentifier() {
        return _baseIdentifier;
    }
    
    public java.lang.Long getFrequencyIncluded() {
        return _frequencyIncluded;
    }
    
    public java.lang.Long getHandOutCapable() {
        return _handOutCapable;
    }
    
    public java.lang.Long getInTraffic() {
        return _inTraffic;
    }
    
    public Cdma2000OneXRanNeighborListKey getKey() {
        return _key;
    }
    
    public NeighborBand getNeighborBand() {
        return _neighborBand;
    }
    
    public NeighborConfig getNeighborConfig() {
        return _neighborConfig;
    }
    
    public java.lang.Long getNeighborFrequency() {
        return _neighborFrequency;
    }
    
    public java.lang.Long getNeighborPn() {
        return _neighborPn;
    }
    
    public java.lang.Long getOneXNeighborIndex() {
        return _oneXNeighborIndex;
    }
    
    public java.lang.Integer getOneXNeighborIosCellId() {
        return _oneXNeighborIosCellId;
    }
    
    public java.lang.String getOneXNeighborLatitude() {
        return _oneXNeighborLatitude;
    }
    
    public java.lang.String getOneXNeighborLongitude() {
        return _oneXNeighborLongitude;
    }
    
    public java.lang.Long getOneXNeighborMscId() {
        return _oneXNeighborMscId;
    }
    
    public java.lang.Long getOverheadMsg() {
        return _overheadMsg;
    }
    
    public java.lang.Long getPilotInc() {
        return _pilotInc;
    }
    
    public SearchPriority getSearchPriority() {
        return _searchPriority;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    public java.lang.Boolean isForceInOverhead() {
        return _forceInOverhead;
    }
    
    public java.lang.Boolean isIncludedInOverhead() {
        return _includedInOverhead;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public Cdma2000OneXRanNeighborListBuilder setAirInterface(final AirInterface value) {
        this._airInterface = value;
        return this;
    }
    
     
     private static void check_aliasLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..64]].", value));
     }
    
    public Cdma2000OneXRanNeighborListBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setBaseIdentifier(final java.lang.Long value) {
        this._baseIdentifier = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setFrequencyIncluded(final java.lang.Long value) {
        this._frequencyIncluded = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setHandOutCapable(final java.lang.Long value) {
        this._handOutCapable = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setInTraffic(final java.lang.Long value) {
        this._inTraffic = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setKey(final Cdma2000OneXRanNeighborListKey value) {
        this._key = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setNeighborBand(final NeighborBand value) {
        this._neighborBand = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setNeighborConfig(final NeighborConfig value) {
        this._neighborConfig = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setNeighborFrequency(final java.lang.Long value) {
        this._neighborFrequency = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setNeighborPn(final java.lang.Long value) {
        this._neighborPn = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setOneXNeighborIndex(final java.lang.Long value) {
        this._oneXNeighborIndex = value;
        return this;
    }
    
     
     private static void checkOneXNeighborIosCellIdRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public Cdma2000OneXRanNeighborListBuilder setOneXNeighborIosCellId(final java.lang.Integer value) {
    if (value != null) {
        checkOneXNeighborIosCellIdRange(value);
    }
        this._oneXNeighborIosCellId = value;
        return this;
    }
    
     
     private static void check_oneXNeighborLatitudeLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..16]].", value));
     }
    
    public Cdma2000OneXRanNeighborListBuilder setOneXNeighborLatitude(final java.lang.String value) {
    if (value != null) {
        check_oneXNeighborLatitudeLength(value);
    }
        this._oneXNeighborLatitude = value;
        return this;
    }
    
     
     private static void check_oneXNeighborLongitudeLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..16]].", value));
     }
    
    public Cdma2000OneXRanNeighborListBuilder setOneXNeighborLongitude(final java.lang.String value) {
    if (value != null) {
        check_oneXNeighborLongitudeLength(value);
    }
        this._oneXNeighborLongitude = value;
        return this;
    }
    
     
     private static void checkOneXNeighborMscIdRange(final long value) {
         if (value >= 0L && value <= 16777215L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..16777215]].", value));
     }
    
    public Cdma2000OneXRanNeighborListBuilder setOneXNeighborMscId(final java.lang.Long value) {
    if (value != null) {
        checkOneXNeighborMscIdRange(value);
    }
        this._oneXNeighborMscId = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setOverheadMsg(final java.lang.Long value) {
        this._overheadMsg = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setPilotInc(final java.lang.Long value) {
        this._pilotInc = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setSearchPriority(final SearchPriority value) {
        this._searchPriority = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setForceInOverhead(final java.lang.Boolean value) {
        this._forceInOverhead = value;
        return this;
    }
    
     
    public Cdma2000OneXRanNeighborListBuilder setIncludedInOverhead(final java.lang.Boolean value) {
        this._includedInOverhead = value;
        return this;
    }
    
    public Cdma2000OneXRanNeighborListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanNeighborListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanNeighborList build() {
        return new Cdma2000OneXRanNeighborListImpl(this);
    }

    private static final class Cdma2000OneXRanNeighborListImpl implements Cdma2000OneXRanNeighborList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList.class;
        }

        private final AirInterface _airInterface;
        private final java.lang.String _alias;
        private final java.lang.Long _baseIdentifier;
        private final java.lang.Long _frequencyIncluded;
        private final java.lang.Long _handOutCapable;
        private final java.lang.Long _inTraffic;
        private final Cdma2000OneXRanNeighborListKey _key;
        private final NeighborBand _neighborBand;
        private final NeighborConfig _neighborConfig;
        private final java.lang.Long _neighborFrequency;
        private final java.lang.Long _neighborPn;
        private final java.lang.Long _oneXNeighborIndex;
        private final java.lang.Integer _oneXNeighborIosCellId;
        private final java.lang.String _oneXNeighborLatitude;
        private final java.lang.String _oneXNeighborLongitude;
        private final java.lang.Long _oneXNeighborMscId;
        private final java.lang.Long _overheadMsg;
        private final java.lang.Long _pilotInc;
        private final SearchPriority _searchPriority;
        private final java.lang.Boolean _enable;
        private final java.lang.Boolean _forceInOverhead;
        private final java.lang.Boolean _includedInOverhead;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanNeighborListImpl(Cdma2000OneXRanNeighborListBuilder base) {
            if (base.getKey() == null) {
                this._key = new Cdma2000OneXRanNeighborListKey(
                    base.getNeighborPn(), 
                    base.getOneXNeighborIndex()
                );
                this._neighborPn = base.getNeighborPn();
                this._oneXNeighborIndex = base.getOneXNeighborIndex();
            } else {
                this._key = base.getKey();
                this._neighborPn = _key.getNeighborPn();
                this._oneXNeighborIndex = _key.getOneXNeighborIndex();
            }
            this._airInterface = base.getAirInterface();
            this._alias = base.getAlias();
            this._baseIdentifier = base.getBaseIdentifier();
            this._frequencyIncluded = base.getFrequencyIncluded();
            this._handOutCapable = base.getHandOutCapable();
            this._inTraffic = base.getInTraffic();
            this._neighborBand = base.getNeighborBand();
            this._neighborConfig = base.getNeighborConfig();
            this._neighborFrequency = base.getNeighborFrequency();
            this._oneXNeighborIosCellId = base.getOneXNeighborIosCellId();
            this._oneXNeighborLatitude = base.getOneXNeighborLatitude();
            this._oneXNeighborLongitude = base.getOneXNeighborLongitude();
            this._oneXNeighborMscId = base.getOneXNeighborMscId();
            this._overheadMsg = base.getOverheadMsg();
            this._pilotInc = base.getPilotInc();
            this._searchPriority = base.getSearchPriority();
            this._enable = base.isEnable();
            this._forceInOverhead = base.isForceInOverhead();
            this._includedInOverhead = base.isIncludedInOverhead();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AirInterface getAirInterface() {
            return _airInterface;
        }
        
        @Override
        public java.lang.String getAlias() {
            return _alias;
        }
        
        @Override
        public java.lang.Long getBaseIdentifier() {
            return _baseIdentifier;
        }
        
        @Override
        public java.lang.Long getFrequencyIncluded() {
            return _frequencyIncluded;
        }
        
        @Override
        public java.lang.Long getHandOutCapable() {
            return _handOutCapable;
        }
        
        @Override
        public java.lang.Long getInTraffic() {
            return _inTraffic;
        }
        
        @Override
        public Cdma2000OneXRanNeighborListKey getKey() {
            return _key;
        }
        
        @Override
        public NeighborBand getNeighborBand() {
            return _neighborBand;
        }
        
        @Override
        public NeighborConfig getNeighborConfig() {
            return _neighborConfig;
        }
        
        @Override
        public java.lang.Long getNeighborFrequency() {
            return _neighborFrequency;
        }
        
        @Override
        public java.lang.Long getNeighborPn() {
            return _neighborPn;
        }
        
        @Override
        public java.lang.Long getOneXNeighborIndex() {
            return _oneXNeighborIndex;
        }
        
        @Override
        public java.lang.Integer getOneXNeighborIosCellId() {
            return _oneXNeighborIosCellId;
        }
        
        @Override
        public java.lang.String getOneXNeighborLatitude() {
            return _oneXNeighborLatitude;
        }
        
        @Override
        public java.lang.String getOneXNeighborLongitude() {
            return _oneXNeighborLongitude;
        }
        
        @Override
        public java.lang.Long getOneXNeighborMscId() {
            return _oneXNeighborMscId;
        }
        
        @Override
        public java.lang.Long getOverheadMsg() {
            return _overheadMsg;
        }
        
        @Override
        public java.lang.Long getPilotInc() {
            return _pilotInc;
        }
        
        @Override
        public SearchPriority getSearchPriority() {
            return _searchPriority;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @Override
        public java.lang.Boolean isForceInOverhead() {
            return _forceInOverhead;
        }
        
        @Override
        public java.lang.Boolean isIncludedInOverhead() {
            return _includedInOverhead;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_airInterface);
            result = prime * result + Objects.hashCode(_alias);
            result = prime * result + Objects.hashCode(_baseIdentifier);
            result = prime * result + Objects.hashCode(_frequencyIncluded);
            result = prime * result + Objects.hashCode(_handOutCapable);
            result = prime * result + Objects.hashCode(_inTraffic);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_neighborBand);
            result = prime * result + Objects.hashCode(_neighborConfig);
            result = prime * result + Objects.hashCode(_neighborFrequency);
            result = prime * result + Objects.hashCode(_neighborPn);
            result = prime * result + Objects.hashCode(_oneXNeighborIndex);
            result = prime * result + Objects.hashCode(_oneXNeighborIosCellId);
            result = prime * result + Objects.hashCode(_oneXNeighborLatitude);
            result = prime * result + Objects.hashCode(_oneXNeighborLongitude);
            result = prime * result + Objects.hashCode(_oneXNeighborMscId);
            result = prime * result + Objects.hashCode(_overheadMsg);
            result = prime * result + Objects.hashCode(_pilotInc);
            result = prime * result + Objects.hashCode(_searchPriority);
            result = prime * result + Objects.hashCode(_enable);
            result = prime * result + Objects.hashCode(_forceInOverhead);
            result = prime * result + Objects.hashCode(_includedInOverhead);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList)obj;
            if (!Objects.equals(_airInterface, other.getAirInterface())) {
                return false;
            }
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_baseIdentifier, other.getBaseIdentifier())) {
                return false;
            }
            if (!Objects.equals(_frequencyIncluded, other.getFrequencyIncluded())) {
                return false;
            }
            if (!Objects.equals(_handOutCapable, other.getHandOutCapable())) {
                return false;
            }
            if (!Objects.equals(_inTraffic, other.getInTraffic())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_neighborBand, other.getNeighborBand())) {
                return false;
            }
            if (!Objects.equals(_neighborConfig, other.getNeighborConfig())) {
                return false;
            }
            if (!Objects.equals(_neighborFrequency, other.getNeighborFrequency())) {
                return false;
            }
            if (!Objects.equals(_neighborPn, other.getNeighborPn())) {
                return false;
            }
            if (!Objects.equals(_oneXNeighborIndex, other.getOneXNeighborIndex())) {
                return false;
            }
            if (!Objects.equals(_oneXNeighborIosCellId, other.getOneXNeighborIosCellId())) {
                return false;
            }
            if (!Objects.equals(_oneXNeighborLatitude, other.getOneXNeighborLatitude())) {
                return false;
            }
            if (!Objects.equals(_oneXNeighborLongitude, other.getOneXNeighborLongitude())) {
                return false;
            }
            if (!Objects.equals(_oneXNeighborMscId, other.getOneXNeighborMscId())) {
                return false;
            }
            if (!Objects.equals(_overheadMsg, other.getOverheadMsg())) {
                return false;
            }
            if (!Objects.equals(_pilotInc, other.getPilotInc())) {
                return false;
            }
            if (!Objects.equals(_searchPriority, other.getSearchPriority())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (!Objects.equals(_forceInOverhead, other.isForceInOverhead())) {
                return false;
            }
            if (!Objects.equals(_includedInOverhead, other.isIncludedInOverhead())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanNeighborListImpl otherImpl = (Cdma2000OneXRanNeighborListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanNeighborList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_airInterface != null) {
                builder.append("_airInterface=");
                builder.append(_airInterface);
                builder.append(", ");
            }
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_baseIdentifier != null) {
                builder.append("_baseIdentifier=");
                builder.append(_baseIdentifier);
                builder.append(", ");
            }
            if (_frequencyIncluded != null) {
                builder.append("_frequencyIncluded=");
                builder.append(_frequencyIncluded);
                builder.append(", ");
            }
            if (_handOutCapable != null) {
                builder.append("_handOutCapable=");
                builder.append(_handOutCapable);
                builder.append(", ");
            }
            if (_inTraffic != null) {
                builder.append("_inTraffic=");
                builder.append(_inTraffic);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_neighborBand != null) {
                builder.append("_neighborBand=");
                builder.append(_neighborBand);
                builder.append(", ");
            }
            if (_neighborConfig != null) {
                builder.append("_neighborConfig=");
                builder.append(_neighborConfig);
                builder.append(", ");
            }
            if (_neighborFrequency != null) {
                builder.append("_neighborFrequency=");
                builder.append(_neighborFrequency);
                builder.append(", ");
            }
            if (_neighborPn != null) {
                builder.append("_neighborPn=");
                builder.append(_neighborPn);
                builder.append(", ");
            }
            if (_oneXNeighborIndex != null) {
                builder.append("_oneXNeighborIndex=");
                builder.append(_oneXNeighborIndex);
                builder.append(", ");
            }
            if (_oneXNeighborIosCellId != null) {
                builder.append("_oneXNeighborIosCellId=");
                builder.append(_oneXNeighborIosCellId);
                builder.append(", ");
            }
            if (_oneXNeighborLatitude != null) {
                builder.append("_oneXNeighborLatitude=");
                builder.append(_oneXNeighborLatitude);
                builder.append(", ");
            }
            if (_oneXNeighborLongitude != null) {
                builder.append("_oneXNeighborLongitude=");
                builder.append(_oneXNeighborLongitude);
                builder.append(", ");
            }
            if (_oneXNeighborMscId != null) {
                builder.append("_oneXNeighborMscId=");
                builder.append(_oneXNeighborMscId);
                builder.append(", ");
            }
            if (_overheadMsg != null) {
                builder.append("_overheadMsg=");
                builder.append(_overheadMsg);
                builder.append(", ");
            }
            if (_pilotInc != null) {
                builder.append("_pilotInc=");
                builder.append(_pilotInc);
                builder.append(", ");
            }
            if (_searchPriority != null) {
                builder.append("_searchPriority=");
                builder.append(_searchPriority);
                builder.append(", ");
            }
            if (_enable != null) {
                builder.append("_enable=");
                builder.append(_enable);
                builder.append(", ");
            }
            if (_forceInOverhead != null) {
                builder.append("_forceInOverhead=");
                builder.append(_forceInOverhead);
                builder.append(", ");
            }
            if (_includedInOverhead != null) {
                builder.append("_includedInOverhead=");
                builder.append(_includedInOverhead);
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
