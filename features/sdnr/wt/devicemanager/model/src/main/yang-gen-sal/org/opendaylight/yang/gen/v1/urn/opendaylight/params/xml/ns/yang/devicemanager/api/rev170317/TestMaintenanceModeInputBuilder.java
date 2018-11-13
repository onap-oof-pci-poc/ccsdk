package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput
 *
 */
public class TestMaintenanceModeInputBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput> {

    private java.lang.String _mountpointName;
    private java.lang.String _objectIdRef;
    private java.lang.String _problemName;
    private java.lang.String _testDate;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>> augmentation = Collections.emptyMap();

    public TestMaintenanceModeInputBuilder() {
    }

    public TestMaintenanceModeInputBuilder(TestMaintenanceModeInput base) {
        this._mountpointName = base.getMountpointName();
        this._objectIdRef = base.getObjectIdRef();
        this._problemName = base.getProblemName();
        this._testDate = base.getTestDate();
        if (base instanceof TestMaintenanceModeInputImpl) {
            TestMaintenanceModeInputImpl impl = (TestMaintenanceModeInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getMountpointName() {
        return _mountpointName;
    }
    
    public java.lang.String getObjectIdRef() {
        return _objectIdRef;
    }
    
    public java.lang.String getProblemName() {
        return _problemName;
    }
    
    public java.lang.String getTestDate() {
        return _testDate;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TestMaintenanceModeInputBuilder setMountpointName(final java.lang.String value) {
        this._mountpointName = value;
        return this;
    }
    
     
    public TestMaintenanceModeInputBuilder setObjectIdRef(final java.lang.String value) {
        this._objectIdRef = value;
        return this;
    }
    
     
    public TestMaintenanceModeInputBuilder setProblemName(final java.lang.String value) {
        this._problemName = value;
        return this;
    }
    
     
    public TestMaintenanceModeInputBuilder setTestDate(final java.lang.String value) {
        this._testDate = value;
        return this;
    }
    
    public TestMaintenanceModeInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TestMaintenanceModeInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TestMaintenanceModeInput build() {
        return new TestMaintenanceModeInputImpl(this);
    }

    private static final class TestMaintenanceModeInputImpl implements TestMaintenanceModeInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput.class;
        }

        private final java.lang.String _mountpointName;
        private final java.lang.String _objectIdRef;
        private final java.lang.String _problemName;
        private final java.lang.String _testDate;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>> augmentation = Collections.emptyMap();

        private TestMaintenanceModeInputImpl(TestMaintenanceModeInputBuilder base) {
            this._mountpointName = base.getMountpointName();
            this._objectIdRef = base.getObjectIdRef();
            this._problemName = base.getProblemName();
            this._testDate = base.getTestDate();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getMountpointName() {
            return _mountpointName;
        }
        
        @Override
        public java.lang.String getObjectIdRef() {
            return _objectIdRef;
        }
        
        @Override
        public java.lang.String getProblemName() {
            return _problemName;
        }
        
        @Override
        public java.lang.String getTestDate() {
            return _testDate;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_mountpointName);
            result = prime * result + Objects.hashCode(_objectIdRef);
            result = prime * result + Objects.hashCode(_problemName);
            result = prime * result + Objects.hashCode(_testDate);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput)obj;
            if (!Objects.equals(_mountpointName, other.getMountpointName())) {
                return false;
            }
            if (!Objects.equals(_objectIdRef, other.getObjectIdRef())) {
                return false;
            }
            if (!Objects.equals(_problemName, other.getProblemName())) {
                return false;
            }
            if (!Objects.equals(_testDate, other.getTestDate())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TestMaintenanceModeInputImpl otherImpl = (TestMaintenanceModeInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TestMaintenanceModeInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_mountpointName != null) {
                builder.append("_mountpointName=");
                builder.append(_mountpointName);
                builder.append(", ");
            }
            if (_objectIdRef != null) {
                builder.append("_objectIdRef=");
                builder.append(_objectIdRef);
                builder.append(", ");
            }
            if (_problemName != null) {
                builder.append("_problemName=");
                builder.append(_problemName);
                builder.append(", ");
            }
            if (_testDate != null) {
                builder.append("_testDate=");
                builder.append(_testDate);
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
