package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability
 *
 */
public class HybridMwStructureCapabilityBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability> {

    private UniversalId _structureId;
    private List<java.lang.String> _supportedAlarmList;
    private java.lang.String _supportedAlarms;
    private List<SupportedTdmStructureTypesList> _supportedTdmStructureTypesList;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>> augmentation = Collections.emptyMap();

    public HybridMwStructureCapabilityBuilder() {
    }
    public HybridMwStructureCapabilityBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureCapabilityG arg) {
        this._structureId = arg.getStructureId();
        this._supportedTdmStructureTypesList = arg.getSupportedTdmStructureTypesList();
        this._supportedAlarmList = arg.getSupportedAlarmList();
        this._supportedAlarms = arg.getSupportedAlarms();
    }

    public HybridMwStructureCapabilityBuilder(HybridMwStructureCapability base) {
        this._structureId = base.getStructureId();
        this._supportedAlarmList = base.getSupportedAlarmList();
        this._supportedAlarms = base.getSupportedAlarms();
        this._supportedTdmStructureTypesList = base.getSupportedTdmStructureTypesList();
        if (base instanceof HybridMwStructureCapabilityImpl) {
            HybridMwStructureCapabilityImpl impl = (HybridMwStructureCapabilityImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureCapabilityG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureCapabilityG) {
            this._structureId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureCapabilityG)arg).getStructureId();
            this._supportedTdmStructureTypesList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureCapabilityG)arg).getSupportedTdmStructureTypesList();
            this._supportedAlarmList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureCapabilityG)arg).getSupportedAlarmList();
            this._supportedAlarms = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureCapabilityG)arg).getSupportedAlarms();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureCapabilityG] \n" +
              "but was: " + arg
            );
        }
    }

    public UniversalId getStructureId() {
        return _structureId;
    }
    
    public List<java.lang.String> getSupportedAlarmList() {
        return _supportedAlarmList;
    }
    
    public java.lang.String getSupportedAlarms() {
        return _supportedAlarms;
    }
    
    public List<SupportedTdmStructureTypesList> getSupportedTdmStructureTypesList() {
        return _supportedTdmStructureTypesList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HybridMwStructureCapabilityBuilder setStructureId(final UniversalId value) {
        this._structureId = value;
        return this;
    }
    
     
    public HybridMwStructureCapabilityBuilder setSupportedAlarmList(final List<java.lang.String> value) {
        this._supportedAlarmList = value;
        return this;
    }
    
     
    public HybridMwStructureCapabilityBuilder setSupportedAlarms(final java.lang.String value) {
        this._supportedAlarms = value;
        return this;
    }
    
     
    public HybridMwStructureCapabilityBuilder setSupportedTdmStructureTypesList(final List<SupportedTdmStructureTypesList> value) {
        this._supportedTdmStructureTypesList = value;
        return this;
    }
    
    public HybridMwStructureCapabilityBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HybridMwStructureCapabilityBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HybridMwStructureCapability build() {
        return new HybridMwStructureCapabilityImpl(this);
    }

    private static final class HybridMwStructureCapabilityImpl implements HybridMwStructureCapability {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability.class;
        }

        private final UniversalId _structureId;
        private final List<java.lang.String> _supportedAlarmList;
        private final java.lang.String _supportedAlarms;
        private final List<SupportedTdmStructureTypesList> _supportedTdmStructureTypesList;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>> augmentation = Collections.emptyMap();

        private HybridMwStructureCapabilityImpl(HybridMwStructureCapabilityBuilder base) {
            this._structureId = base.getStructureId();
            this._supportedAlarmList = base.getSupportedAlarmList();
            this._supportedAlarms = base.getSupportedAlarms();
            this._supportedTdmStructureTypesList = base.getSupportedTdmStructureTypesList();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public UniversalId getStructureId() {
            return _structureId;
        }
        
        @Override
        public List<java.lang.String> getSupportedAlarmList() {
            return _supportedAlarmList;
        }
        
        @Override
        public java.lang.String getSupportedAlarms() {
            return _supportedAlarms;
        }
        
        @Override
        public List<SupportedTdmStructureTypesList> getSupportedTdmStructureTypesList() {
            return _supportedTdmStructureTypesList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_structureId);
            result = prime * result + Objects.hashCode(_supportedAlarmList);
            result = prime * result + Objects.hashCode(_supportedAlarms);
            result = prime * result + Objects.hashCode(_supportedTdmStructureTypesList);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability)obj;
            if (!Objects.equals(_structureId, other.getStructureId())) {
                return false;
            }
            if (!Objects.equals(_supportedAlarmList, other.getSupportedAlarmList())) {
                return false;
            }
            if (!Objects.equals(_supportedAlarms, other.getSupportedAlarms())) {
                return false;
            }
            if (!Objects.equals(_supportedTdmStructureTypesList, other.getSupportedTdmStructureTypesList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HybridMwStructureCapabilityImpl otherImpl = (HybridMwStructureCapabilityImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HybridMwStructureCapability [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_structureId != null) {
                builder.append("_structureId=");
                builder.append(_structureId);
                builder.append(", ");
            }
            if (_supportedAlarmList != null) {
                builder.append("_supportedAlarmList=");
                builder.append(_supportedAlarmList);
                builder.append(", ");
            }
            if (_supportedAlarms != null) {
                builder.append("_supportedAlarms=");
                builder.append(_supportedAlarms);
                builder.append(", ");
            }
            if (_supportedTdmStructureTypesList != null) {
                builder.append("_supportedTdmStructureTypesList=");
                builder.append(_supportedTdmStructureTypesList);
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
