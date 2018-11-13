package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway
 *
 */
public class FapControlUmtsGatewayBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway> {

    private java.lang.Integer _fapGwPort;
    private java.lang.String _fapGwServer1;
    private java.lang.String _fapGwServer2;
    private java.lang.String _fapGwServer3;
    private java.lang.String _secGwServer1;
    private java.lang.String _secGwServer2;
    private java.lang.String _secGwServer3;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>> augmentation = Collections.emptyMap();

    public FapControlUmtsGatewayBuilder() {
    }
    public FapControlUmtsGatewayBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG arg) {
        this._secGwServer1 = arg.getSecGwServer1();
        this._secGwServer2 = arg.getSecGwServer2();
        this._secGwServer3 = arg.getSecGwServer3();
        this._fapGwServer1 = arg.getFapGwServer1();
        this._fapGwServer2 = arg.getFapGwServer2();
        this._fapGwServer3 = arg.getFapGwServer3();
        this._fapGwPort = arg.getFapGwPort();
    }

    public FapControlUmtsGatewayBuilder(FapControlUmtsGateway base) {
        this._fapGwPort = base.getFapGwPort();
        this._fapGwServer1 = base.getFapGwServer1();
        this._fapGwServer2 = base.getFapGwServer2();
        this._fapGwServer3 = base.getFapGwServer3();
        this._secGwServer1 = base.getSecGwServer1();
        this._secGwServer2 = base.getSecGwServer2();
        this._secGwServer3 = base.getSecGwServer3();
        if (base instanceof FapControlUmtsGatewayImpl) {
            FapControlUmtsGatewayImpl impl = (FapControlUmtsGatewayImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG) {
            this._secGwServer1 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG)arg).getSecGwServer1();
            this._secGwServer2 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG)arg).getSecGwServer2();
            this._secGwServer3 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG)arg).getSecGwServer3();
            this._fapGwServer1 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG)arg).getFapGwServer1();
            this._fapGwServer2 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG)arg).getFapGwServer2();
            this._fapGwServer3 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG)arg).getFapGwServer3();
            this._fapGwPort = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG)arg).getFapGwPort();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getFapGwPort() {
        return _fapGwPort;
    }
    
    public java.lang.String getFapGwServer1() {
        return _fapGwServer1;
    }
    
    public java.lang.String getFapGwServer2() {
        return _fapGwServer2;
    }
    
    public java.lang.String getFapGwServer3() {
        return _fapGwServer3;
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
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkFapGwPortRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public FapControlUmtsGatewayBuilder setFapGwPort(final java.lang.Integer value) {
    if (value != null) {
        checkFapGwPortRange(value);
    }
        this._fapGwPort = value;
        return this;
    }
    
     
     private static void check_fapGwServer1Length(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlUmtsGatewayBuilder setFapGwServer1(final java.lang.String value) {
    if (value != null) {
        check_fapGwServer1Length(value);
    }
        this._fapGwServer1 = value;
        return this;
    }
    
     
     private static void check_fapGwServer2Length(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlUmtsGatewayBuilder setFapGwServer2(final java.lang.String value) {
    if (value != null) {
        check_fapGwServer2Length(value);
    }
        this._fapGwServer2 = value;
        return this;
    }
    
     
     private static void check_fapGwServer3Length(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlUmtsGatewayBuilder setFapGwServer3(final java.lang.String value) {
    if (value != null) {
        check_fapGwServer3Length(value);
    }
        this._fapGwServer3 = value;
        return this;
    }
    
     
     private static void check_secGwServer1Length(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlUmtsGatewayBuilder setSecGwServer1(final java.lang.String value) {
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
    
    public FapControlUmtsGatewayBuilder setSecGwServer2(final java.lang.String value) {
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
    
    public FapControlUmtsGatewayBuilder setSecGwServer3(final java.lang.String value) {
    if (value != null) {
        check_secGwServer3Length(value);
    }
        this._secGwServer3 = value;
        return this;
    }
    
    public FapControlUmtsGatewayBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlUmtsGatewayBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlUmtsGateway build() {
        return new FapControlUmtsGatewayImpl(this);
    }

    private static final class FapControlUmtsGatewayImpl implements FapControlUmtsGateway {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway.class;
        }

        private final java.lang.Integer _fapGwPort;
        private final java.lang.String _fapGwServer1;
        private final java.lang.String _fapGwServer2;
        private final java.lang.String _fapGwServer3;
        private final java.lang.String _secGwServer1;
        private final java.lang.String _secGwServer2;
        private final java.lang.String _secGwServer3;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>> augmentation = Collections.emptyMap();

        private FapControlUmtsGatewayImpl(FapControlUmtsGatewayBuilder base) {
            this._fapGwPort = base.getFapGwPort();
            this._fapGwServer1 = base.getFapGwServer1();
            this._fapGwServer2 = base.getFapGwServer2();
            this._fapGwServer3 = base.getFapGwServer3();
            this._secGwServer1 = base.getSecGwServer1();
            this._secGwServer2 = base.getSecGwServer2();
            this._secGwServer3 = base.getSecGwServer3();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getFapGwPort() {
            return _fapGwPort;
        }
        
        @Override
        public java.lang.String getFapGwServer1() {
            return _fapGwServer1;
        }
        
        @Override
        public java.lang.String getFapGwServer2() {
            return _fapGwServer2;
        }
        
        @Override
        public java.lang.String getFapGwServer3() {
            return _fapGwServer3;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fapGwPort);
            result = prime * result + Objects.hashCode(_fapGwServer1);
            result = prime * result + Objects.hashCode(_fapGwServer2);
            result = prime * result + Objects.hashCode(_fapGwServer3);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway)obj;
            if (!Objects.equals(_fapGwPort, other.getFapGwPort())) {
                return false;
            }
            if (!Objects.equals(_fapGwServer1, other.getFapGwServer1())) {
                return false;
            }
            if (!Objects.equals(_fapGwServer2, other.getFapGwServer2())) {
                return false;
            }
            if (!Objects.equals(_fapGwServer3, other.getFapGwServer3())) {
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
                FapControlUmtsGatewayImpl otherImpl = (FapControlUmtsGatewayImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlUmtsGateway [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_fapGwPort != null) {
                builder.append("_fapGwPort=");
                builder.append(_fapGwPort);
                builder.append(", ");
            }
            if (_fapGwServer1 != null) {
                builder.append("_fapGwServer1=");
                builder.append(_fapGwServer1);
                builder.append(", ");
            }
            if (_fapGwServer2 != null) {
                builder.append("_fapGwServer2=");
                builder.append(_fapGwServer2);
                builder.append(", ");
            }
            if (_fapGwServer3 != null) {
                builder.append("_fapGwServer3=");
                builder.append(_fapGwServer3);
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
