package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.MappingType;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduSlotSize;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration
 *
 */
public class OtnOduConnectionConfigurationBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration> {

    private java.lang.String _acceptedMSi;
    private java.lang.String _configuredClientType;
    private MappingType _configuredMappingType;
    private OduSlotSize _opuTributarySlotSize;
    private BigInteger _tributaryPortNumber;
    private List<BigInteger> _tributarySlotList;
    private java.lang.Boolean _autoPayloadType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>> augmentation = Collections.emptyMap();

    public OtnOduConnectionConfigurationBuilder() {
    }
    public OtnOduConnectionConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG arg) {
        this._tributarySlotList = arg.getTributarySlotList();
        this._tributaryPortNumber = arg.getTributaryPortNumber();
        this._acceptedMSi = arg.getAcceptedMSi();
        this._opuTributarySlotSize = arg.getOpuTributarySlotSize();
        this._autoPayloadType = arg.isAutoPayloadType();
        this._configuredMappingType = arg.getConfiguredMappingType();
        this._configuredClientType = arg.getConfiguredClientType();
    }

    public OtnOduConnectionConfigurationBuilder(OtnOduConnectionConfiguration base) {
        this._acceptedMSi = base.getAcceptedMSi();
        this._configuredClientType = base.getConfiguredClientType();
        this._configuredMappingType = base.getConfiguredMappingType();
        this._opuTributarySlotSize = base.getOpuTributarySlotSize();
        this._tributaryPortNumber = base.getTributaryPortNumber();
        this._tributarySlotList = base.getTributarySlotList();
        this._autoPayloadType = base.isAutoPayloadType();
        if (base instanceof OtnOduConnectionConfigurationImpl) {
            OtnOduConnectionConfigurationImpl impl = (OtnOduConnectionConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG) {
            this._tributarySlotList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG)arg).getTributarySlotList();
            this._tributaryPortNumber = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG)arg).getTributaryPortNumber();
            this._acceptedMSi = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG)arg).getAcceptedMSi();
            this._opuTributarySlotSize = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG)arg).getOpuTributarySlotSize();
            this._autoPayloadType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG)arg).isAutoPayloadType();
            this._configuredMappingType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG)arg).getConfiguredMappingType();
            this._configuredClientType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG)arg).getConfiguredClientType();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAcceptedMSi() {
        return _acceptedMSi;
    }
    
    public java.lang.String getConfiguredClientType() {
        return _configuredClientType;
    }
    
    public MappingType getConfiguredMappingType() {
        return _configuredMappingType;
    }
    
    public OduSlotSize getOpuTributarySlotSize() {
        return _opuTributarySlotSize;
    }
    
    public BigInteger getTributaryPortNumber() {
        return _tributaryPortNumber;
    }
    
    public List<BigInteger> getTributarySlotList() {
        return _tributarySlotList;
    }
    
    public java.lang.Boolean isAutoPayloadType() {
        return _autoPayloadType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public OtnOduConnectionConfigurationBuilder setAcceptedMSi(final java.lang.String value) {
        this._acceptedMSi = value;
        return this;
    }
    
     
    public OtnOduConnectionConfigurationBuilder setConfiguredClientType(final java.lang.String value) {
        this._configuredClientType = value;
        return this;
    }
    
     
    public OtnOduConnectionConfigurationBuilder setConfiguredMappingType(final MappingType value) {
        this._configuredMappingType = value;
        return this;
    }
    
     
    public OtnOduConnectionConfigurationBuilder setOpuTributarySlotSize(final OduSlotSize value) {
        this._opuTributarySlotSize = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTRIBUTARYPORTNUMBERRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTRIBUTARYPORTNUMBERRANGE_RANGES = a;
     }
     private static void checkTributaryPortNumberRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTRIBUTARYPORTNUMBERRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTRIBUTARYPORTNUMBERRANGE_RANGES)));
     }
    
    public OtnOduConnectionConfigurationBuilder setTributaryPortNumber(final BigInteger value) {
    if (value != null) {
        checkTributaryPortNumberRange(value);
    }
        this._tributaryPortNumber = value;
        return this;
    }
    
     
    public OtnOduConnectionConfigurationBuilder setTributarySlotList(final List<BigInteger> value) {
        this._tributarySlotList = value;
        return this;
    }
    
     
    public OtnOduConnectionConfigurationBuilder setAutoPayloadType(final java.lang.Boolean value) {
        this._autoPayloadType = value;
        return this;
    }
    
    public OtnOduConnectionConfigurationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OtnOduConnectionConfigurationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public OtnOduConnectionConfiguration build() {
        return new OtnOduConnectionConfigurationImpl(this);
    }

    private static final class OtnOduConnectionConfigurationImpl implements OtnOduConnectionConfiguration {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration.class;
        }

        private final java.lang.String _acceptedMSi;
        private final java.lang.String _configuredClientType;
        private final MappingType _configuredMappingType;
        private final OduSlotSize _opuTributarySlotSize;
        private final BigInteger _tributaryPortNumber;
        private final List<BigInteger> _tributarySlotList;
        private final java.lang.Boolean _autoPayloadType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>> augmentation = Collections.emptyMap();

        private OtnOduConnectionConfigurationImpl(OtnOduConnectionConfigurationBuilder base) {
            this._acceptedMSi = base.getAcceptedMSi();
            this._configuredClientType = base.getConfiguredClientType();
            this._configuredMappingType = base.getConfiguredMappingType();
            this._opuTributarySlotSize = base.getOpuTributarySlotSize();
            this._tributaryPortNumber = base.getTributaryPortNumber();
            this._tributarySlotList = base.getTributarySlotList();
            this._autoPayloadType = base.isAutoPayloadType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAcceptedMSi() {
            return _acceptedMSi;
        }
        
        @Override
        public java.lang.String getConfiguredClientType() {
            return _configuredClientType;
        }
        
        @Override
        public MappingType getConfiguredMappingType() {
            return _configuredMappingType;
        }
        
        @Override
        public OduSlotSize getOpuTributarySlotSize() {
            return _opuTributarySlotSize;
        }
        
        @Override
        public BigInteger getTributaryPortNumber() {
            return _tributaryPortNumber;
        }
        
        @Override
        public List<BigInteger> getTributarySlotList() {
            return _tributarySlotList;
        }
        
        @Override
        public java.lang.Boolean isAutoPayloadType() {
            return _autoPayloadType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_acceptedMSi);
            result = prime * result + Objects.hashCode(_configuredClientType);
            result = prime * result + Objects.hashCode(_configuredMappingType);
            result = prime * result + Objects.hashCode(_opuTributarySlotSize);
            result = prime * result + Objects.hashCode(_tributaryPortNumber);
            result = prime * result + Objects.hashCode(_tributarySlotList);
            result = prime * result + Objects.hashCode(_autoPayloadType);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration)obj;
            if (!Objects.equals(_acceptedMSi, other.getAcceptedMSi())) {
                return false;
            }
            if (!Objects.equals(_configuredClientType, other.getConfiguredClientType())) {
                return false;
            }
            if (!Objects.equals(_configuredMappingType, other.getConfiguredMappingType())) {
                return false;
            }
            if (!Objects.equals(_opuTributarySlotSize, other.getOpuTributarySlotSize())) {
                return false;
            }
            if (!Objects.equals(_tributaryPortNumber, other.getTributaryPortNumber())) {
                return false;
            }
            if (!Objects.equals(_tributarySlotList, other.getTributarySlotList())) {
                return false;
            }
            if (!Objects.equals(_autoPayloadType, other.isAutoPayloadType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OtnOduConnectionConfigurationImpl otherImpl = (OtnOduConnectionConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>> e : augmentation.entrySet()) {
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
            java.lang.String name = "OtnOduConnectionConfiguration [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_acceptedMSi != null) {
                builder.append("_acceptedMSi=");
                builder.append(_acceptedMSi);
                builder.append(", ");
            }
            if (_configuredClientType != null) {
                builder.append("_configuredClientType=");
                builder.append(_configuredClientType);
                builder.append(", ");
            }
            if (_configuredMappingType != null) {
                builder.append("_configuredMappingType=");
                builder.append(_configuredMappingType);
                builder.append(", ");
            }
            if (_opuTributarySlotSize != null) {
                builder.append("_opuTributarySlotSize=");
                builder.append(_opuTributarySlotSize);
                builder.append(", ");
            }
            if (_tributaryPortNumber != null) {
                builder.append("_tributaryPortNumber=");
                builder.append(_tributaryPortNumber);
                builder.append(", ");
            }
            if (_tributarySlotList != null) {
                builder.append("_tributarySlotList=");
                builder.append(_tributarySlotList);
                builder.append(", ");
            }
            if (_autoPayloadType != null) {
                builder.append("_autoPayloadType=");
                builder.append(_autoPayloadType);
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
