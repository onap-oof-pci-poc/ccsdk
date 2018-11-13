package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.DefaultDs1} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.DefaultDs1
 *
 */
public class DefaultDs1Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.DefaultDs1> {

    private java.lang.Short _localPriority;
    private java.lang.Short _maxStepsRemoved;
    private MacAddress _multicastMacAddress;
    private java.lang.Boolean _designatedEnabled;


    public DefaultDs1Builder() {
    }

    public DefaultDs1Builder(DefaultDs1 base) {
        this._localPriority = base.getLocalPriority();
        this._maxStepsRemoved = base.getMaxStepsRemoved();
        this._multicastMacAddress = base.getMulticastMacAddress();
        this._designatedEnabled = base.isDesignatedEnabled();
    }


    public java.lang.Short getLocalPriority() {
        return _localPriority;
    }
    
    public java.lang.Short getMaxStepsRemoved() {
        return _maxStepsRemoved;
    }
    
    public MacAddress getMulticastMacAddress() {
        return _multicastMacAddress;
    }
    
    public java.lang.Boolean isDesignatedEnabled() {
        return _designatedEnabled;
    }

     
     private static void checkLocalPriorityRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public DefaultDs1Builder setLocalPriority(final java.lang.Short value) {
    if (value != null) {
        checkLocalPriorityRange(value);
    }
        this._localPriority = value;
        return this;
    }
    
     
     private static void checkMaxStepsRemovedRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public DefaultDs1Builder setMaxStepsRemoved(final java.lang.Short value) {
    if (value != null) {
        checkMaxStepsRemovedRange(value);
    }
        this._maxStepsRemoved = value;
        return this;
    }
    
     
    public DefaultDs1Builder setMulticastMacAddress(final MacAddress value) {
        this._multicastMacAddress = value;
        return this;
    }
    
     
    public DefaultDs1Builder setDesignatedEnabled(final java.lang.Boolean value) {
        this._designatedEnabled = value;
        return this;
    }

    @Override
    public DefaultDs1 build() {
        return new DefaultDs1Impl(this);
    }

    private static final class DefaultDs1Impl implements DefaultDs1 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.DefaultDs1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.DefaultDs1.class;
        }

        private final java.lang.Short _localPriority;
        private final java.lang.Short _maxStepsRemoved;
        private final MacAddress _multicastMacAddress;
        private final java.lang.Boolean _designatedEnabled;


        private DefaultDs1Impl(DefaultDs1Builder base) {
            this._localPriority = base.getLocalPriority();
            this._maxStepsRemoved = base.getMaxStepsRemoved();
            this._multicastMacAddress = base.getMulticastMacAddress();
            this._designatedEnabled = base.isDesignatedEnabled();
        }

        @Override
        public java.lang.Short getLocalPriority() {
            return _localPriority;
        }
        
        @Override
        public java.lang.Short getMaxStepsRemoved() {
            return _maxStepsRemoved;
        }
        
        @Override
        public MacAddress getMulticastMacAddress() {
            return _multicastMacAddress;
        }
        
        @Override
        public java.lang.Boolean isDesignatedEnabled() {
            return _designatedEnabled;
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
            result = prime * result + Objects.hashCode(_localPriority);
            result = prime * result + Objects.hashCode(_maxStepsRemoved);
            result = prime * result + Objects.hashCode(_multicastMacAddress);
            result = prime * result + Objects.hashCode(_designatedEnabled);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.DefaultDs1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.DefaultDs1 other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.DefaultDs1)obj;
            if (!Objects.equals(_localPriority, other.getLocalPriority())) {
                return false;
            }
            if (!Objects.equals(_maxStepsRemoved, other.getMaxStepsRemoved())) {
                return false;
            }
            if (!Objects.equals(_multicastMacAddress, other.getMulticastMacAddress())) {
                return false;
            }
            if (!Objects.equals(_designatedEnabled, other.isDesignatedEnabled())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "DefaultDs1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_localPriority != null) {
                builder.append("_localPriority=");
                builder.append(_localPriority);
                builder.append(", ");
            }
            if (_maxStepsRemoved != null) {
                builder.append("_maxStepsRemoved=");
                builder.append(_maxStepsRemoved);
                builder.append(", ");
            }
            if (_multicastMacAddress != null) {
                builder.append("_multicastMacAddress=");
                builder.append(_multicastMacAddress);
                builder.append(", ");
            }
            if (_designatedEnabled != null) {
                builder.append("_designatedEnabled=");
                builder.append(_designatedEnabled);
            }
            return builder.append(']').toString();
        }
    }

}
