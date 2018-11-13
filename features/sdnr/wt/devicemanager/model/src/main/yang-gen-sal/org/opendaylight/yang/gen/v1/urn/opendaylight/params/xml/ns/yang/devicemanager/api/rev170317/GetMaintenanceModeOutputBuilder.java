package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.maintenance.mode.g.Filter;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput
 *
 */
public class GetMaintenanceModeOutputBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput> {

    private List<Filter> _filter;
    private java.lang.String _mountpointName;
    private java.lang.String _nodeName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>> augmentation = Collections.emptyMap();

    public GetMaintenanceModeOutputBuilder() {
    }
    public GetMaintenanceModeOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.MaintenanceModeG arg) {
        this._mountpointName = arg.getMountpointName();
        this._nodeName = arg.getNodeName();
        this._filter = arg.getFilter();
    }

    public GetMaintenanceModeOutputBuilder(GetMaintenanceModeOutput base) {
        this._filter = base.getFilter();
        this._mountpointName = base.getMountpointName();
        this._nodeName = base.getNodeName();
        if (base instanceof GetMaintenanceModeOutputImpl) {
            GetMaintenanceModeOutputImpl impl = (GetMaintenanceModeOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.MaintenanceModeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.MaintenanceModeG) {
            this._mountpointName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.MaintenanceModeG)arg).getMountpointName();
            this._nodeName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.MaintenanceModeG)arg).getNodeName();
            this._filter = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.MaintenanceModeG)arg).getFilter();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.MaintenanceModeG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<Filter> getFilter() {
        return _filter;
    }
    
    public java.lang.String getMountpointName() {
        return _mountpointName;
    }
    
    public java.lang.String getNodeName() {
        return _nodeName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public GetMaintenanceModeOutputBuilder setFilter(final List<Filter> value) {
        this._filter = value;
        return this;
    }
    
     
    public GetMaintenanceModeOutputBuilder setMountpointName(final java.lang.String value) {
        this._mountpointName = value;
        return this;
    }
    
     
    public GetMaintenanceModeOutputBuilder setNodeName(final java.lang.String value) {
        this._nodeName = value;
        return this;
    }
    
    public GetMaintenanceModeOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GetMaintenanceModeOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetMaintenanceModeOutput build() {
        return new GetMaintenanceModeOutputImpl(this);
    }

    private static final class GetMaintenanceModeOutputImpl implements GetMaintenanceModeOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput.class;
        }

        private final List<Filter> _filter;
        private final java.lang.String _mountpointName;
        private final java.lang.String _nodeName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>> augmentation = Collections.emptyMap();

        private GetMaintenanceModeOutputImpl(GetMaintenanceModeOutputBuilder base) {
            this._filter = base.getFilter();
            this._mountpointName = base.getMountpointName();
            this._nodeName = base.getNodeName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Filter> getFilter() {
            return _filter;
        }
        
        @Override
        public java.lang.String getMountpointName() {
            return _mountpointName;
        }
        
        @Override
        public java.lang.String getNodeName() {
            return _nodeName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_filter);
            result = prime * result + Objects.hashCode(_mountpointName);
            result = prime * result + Objects.hashCode(_nodeName);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput)obj;
            if (!Objects.equals(_filter, other.getFilter())) {
                return false;
            }
            if (!Objects.equals(_mountpointName, other.getMountpointName())) {
                return false;
            }
            if (!Objects.equals(_nodeName, other.getNodeName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetMaintenanceModeOutputImpl otherImpl = (GetMaintenanceModeOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GetMaintenanceModeOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_filter != null) {
                builder.append("_filter=");
                builder.append(_filter);
                builder.append(", ");
            }
            if (_mountpointName != null) {
                builder.append("_mountpointName=");
                builder.append(_mountpointName);
                builder.append(", ");
            }
            if (_nodeName != null) {
                builder.append("_nodeName=");
                builder.append(_nodeName);
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
