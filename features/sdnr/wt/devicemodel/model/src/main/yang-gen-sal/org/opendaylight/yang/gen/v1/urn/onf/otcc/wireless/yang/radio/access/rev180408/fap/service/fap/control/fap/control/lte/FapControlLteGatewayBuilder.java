package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG.S1ConnectionMode;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway
 *
 */
public class FapControlLteGatewayBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway> {

    private S1ConnectionMode _s1ConnectionMode;
    private java.lang.Integer _s1SigLinkPort;
    private List<java.lang.String> _s1SigLinkServerList;
    private java.lang.String _secGwServer1;
    private java.lang.String _secGwServer2;
    private java.lang.String _secGwServer3;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>> augmentation = Collections.emptyMap();

    public FapControlLteGatewayBuilder() {
    }
    public FapControlLteGatewayBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG arg) {
        this._secGwServer1 = arg.getSecGwServer1();
        this._secGwServer2 = arg.getSecGwServer2();
        this._secGwServer3 = arg.getSecGwServer3();
        this._s1SigLinkServerList = arg.getS1SigLinkServerList();
        this._s1ConnectionMode = arg.getS1ConnectionMode();
        this._s1SigLinkPort = arg.getS1SigLinkPort();
    }

    public FapControlLteGatewayBuilder(FapControlLteGateway base) {
        this._s1ConnectionMode = base.getS1ConnectionMode();
        this._s1SigLinkPort = base.getS1SigLinkPort();
        this._s1SigLinkServerList = base.getS1SigLinkServerList();
        this._secGwServer1 = base.getSecGwServer1();
        this._secGwServer2 = base.getSecGwServer2();
        this._secGwServer3 = base.getSecGwServer3();
        if (base instanceof FapControlLteGatewayImpl) {
            FapControlLteGatewayImpl impl = (FapControlLteGatewayImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG) {
            this._secGwServer1 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG)arg).getSecGwServer1();
            this._secGwServer2 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG)arg).getSecGwServer2();
            this._secGwServer3 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG)arg).getSecGwServer3();
            this._s1SigLinkServerList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG)arg).getS1SigLinkServerList();
            this._s1ConnectionMode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG)arg).getS1ConnectionMode();
            this._s1SigLinkPort = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG)arg).getS1SigLinkPort();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteGatewayG] \n" +
              "but was: " + arg
            );
        }
    }

    public S1ConnectionMode getS1ConnectionMode() {
        return _s1ConnectionMode;
    }
    
    public java.lang.Integer getS1SigLinkPort() {
        return _s1SigLinkPort;
    }
    
    public List<java.lang.String> getS1SigLinkServerList() {
        return _s1SigLinkServerList;
    }
    
    public java.lang.String getSecGwServer1() {
        return _secGwServer1;
    }
    
    public java.lang.String getSecGwServer2() {
        return _secGwServer2;
    }
    
    public java.lang.String getSecGwServer3() {
        return _secGwServer3;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FapControlLteGatewayBuilder setS1ConnectionMode(final S1ConnectionMode value) {
        this._s1ConnectionMode = value;
        return this;
    }
    
     
     private static void checkS1SigLinkPortRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public FapControlLteGatewayBuilder setS1SigLinkPort(final java.lang.Integer value) {
    if (value != null) {
        checkS1SigLinkPortRange(value);
    }
        this._s1SigLinkPort = value;
        return this;
    }
    
     
    public FapControlLteGatewayBuilder setS1SigLinkServerList(final List<java.lang.String> value) {
        this._s1SigLinkServerList = value;
        return this;
    }
    
     
     private static void check_secGwServer1Length(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlLteGatewayBuilder setSecGwServer1(final java.lang.String value) {
    if (value != null) {
        check_secGwServer1Length(value);
    }
        this._secGwServer1 = value;
        return this;
    }
    
     
     private static void check_secGwServer2Length(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlLteGatewayBuilder setSecGwServer2(final java.lang.String value) {
    if (value != null) {
        check_secGwServer2Length(value);
    }
        this._secGwServer2 = value;
        return this;
    }
    
     
     private static void check_secGwServer3Length(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlLteGatewayBuilder setSecGwServer3(final java.lang.String value) {
    if (value != null) {
        check_secGwServer3Length(value);
    }
        this._secGwServer3 = value;
        return this;
    }
    
    public FapControlLteGatewayBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlLteGatewayBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlLteGateway build() {
        return new FapControlLteGatewayImpl(this);
    }

    private static final class FapControlLteGatewayImpl implements FapControlLteGateway {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway.class;
        }

        private final S1ConnectionMode _s1ConnectionMode;
        private final java.lang.Integer _s1SigLinkPort;
        private final List<java.lang.String> _s1SigLinkServerList;
        private final java.lang.String _secGwServer1;
        private final java.lang.String _secGwServer2;
        private final java.lang.String _secGwServer3;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>> augmentation = Collections.emptyMap();

        private FapControlLteGatewayImpl(FapControlLteGatewayBuilder base) {
            this._s1ConnectionMode = base.getS1ConnectionMode();
            this._s1SigLinkPort = base.getS1SigLinkPort();
            this._s1SigLinkServerList = base.getS1SigLinkServerList();
            this._secGwServer1 = base.getSecGwServer1();
            this._secGwServer2 = base.getSecGwServer2();
            this._secGwServer3 = base.getSecGwServer3();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public S1ConnectionMode getS1ConnectionMode() {
            return _s1ConnectionMode;
        }
        
        @Override
        public java.lang.Integer getS1SigLinkPort() {
            return _s1SigLinkPort;
        }
        
        @Override
        public List<java.lang.String> getS1SigLinkServerList() {
            return _s1SigLinkServerList;
        }
        
        @Override
        public java.lang.String getSecGwServer1() {
            return _secGwServer1;
        }
        
        @Override
        public java.lang.String getSecGwServer2() {
            return _secGwServer2;
        }
        
        @Override
        public java.lang.String getSecGwServer3() {
            return _secGwServer3;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_s1ConnectionMode);
            result = prime * result + Objects.hashCode(_s1SigLinkPort);
            result = prime * result + Objects.hashCode(_s1SigLinkServerList);
            result = prime * result + Objects.hashCode(_secGwServer1);
            result = prime * result + Objects.hashCode(_secGwServer2);
            result = prime * result + Objects.hashCode(_secGwServer3);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway)obj;
            if (!Objects.equals(_s1ConnectionMode, other.getS1ConnectionMode())) {
                return false;
            }
            if (!Objects.equals(_s1SigLinkPort, other.getS1SigLinkPort())) {
                return false;
            }
            if (!Objects.equals(_s1SigLinkServerList, other.getS1SigLinkServerList())) {
                return false;
            }
            if (!Objects.equals(_secGwServer1, other.getSecGwServer1())) {
                return false;
            }
            if (!Objects.equals(_secGwServer2, other.getSecGwServer2())) {
                return false;
            }
            if (!Objects.equals(_secGwServer3, other.getSecGwServer3())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlLteGatewayImpl otherImpl = (FapControlLteGatewayImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlLteGateway [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_s1ConnectionMode != null) {
                builder.append("_s1ConnectionMode=");
                builder.append(_s1ConnectionMode);
                builder.append(", ");
            }
            if (_s1SigLinkPort != null) {
                builder.append("_s1SigLinkPort=");
                builder.append(_s1SigLinkPort);
                builder.append(", ");
            }
            if (_s1SigLinkServerList != null) {
                builder.append("_s1SigLinkServerList=");
                builder.append(_s1SigLinkServerList);
                builder.append(", ");
            }
            if (_secGwServer1 != null) {
                builder.append("_secGwServer1=");
                builder.append(_secGwServer1);
                builder.append(", ");
            }
            if (_secGwServer2 != null) {
                builder.append("_secGwServer2=");
                builder.append(_secGwServer2);
                builder.append(", ");
            }
            if (_secGwServer3 != null) {
                builder.append("_secGwServer3=");
                builder.append(_secGwServer3);
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
