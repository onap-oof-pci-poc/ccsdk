package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.PortDsList1} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.PortDsList1
 *
 */
public class PortDsList1Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.PortDsList1> {

    private java.lang.Long _delayAsymmetry;
    private java.lang.Short _localPriority;
    private UniversalId _logicalTerminationPoint;
    private java.lang.Boolean _designatedEnabled;
    private java.lang.Boolean _masterOnly;


    public PortDsList1Builder() {
    }

    public PortDsList1Builder(PortDsList1 base) {
        this._delayAsymmetry = base.getDelayAsymmetry();
        this._localPriority = base.getLocalPriority();
        this._logicalTerminationPoint = base.getLogicalTerminationPoint();
        this._designatedEnabled = base.isDesignatedEnabled();
        this._masterOnly = base.isMasterOnly();
    }


    public java.lang.Long getDelayAsymmetry() {
        return _delayAsymmetry;
    }
    
    public java.lang.Short getLocalPriority() {
        return _localPriority;
    }
    
    public UniversalId getLogicalTerminationPoint() {
        return _logicalTerminationPoint;
    }
    
    public java.lang.Boolean isDesignatedEnabled() {
        return _designatedEnabled;
    }
    
    public java.lang.Boolean isMasterOnly() {
        return _masterOnly;
    }

     
    public PortDsList1Builder setDelayAsymmetry(final java.lang.Long value) {
        this._delayAsymmetry = value;
        return this;
    }
    
     
     private static void checkLocalPriorityRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public PortDsList1Builder setLocalPriority(final java.lang.Short value) {
    if (value != null) {
        checkLocalPriorityRange(value);
    }
        this._localPriority = value;
        return this;
    }
    
     
    public PortDsList1Builder setLogicalTerminationPoint(final UniversalId value) {
        this._logicalTerminationPoint = value;
        return this;
    }
    
     
    public PortDsList1Builder setDesignatedEnabled(final java.lang.Boolean value) {
        this._designatedEnabled = value;
        return this;
    }
    
     
    public PortDsList1Builder setMasterOnly(final java.lang.Boolean value) {
        this._masterOnly = value;
        return this;
    }

    @Override
    public PortDsList1 build() {
        return new PortDsList1Impl(this);
    }

    private static final class PortDsList1Impl implements PortDsList1 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.PortDsList1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.PortDsList1.class;
        }

        private final java.lang.Long _delayAsymmetry;
        private final java.lang.Short _localPriority;
        private final UniversalId _logicalTerminationPoint;
        private final java.lang.Boolean _designatedEnabled;
        private final java.lang.Boolean _masterOnly;


        private PortDsList1Impl(PortDsList1Builder base) {
            this._delayAsymmetry = base.getDelayAsymmetry();
            this._localPriority = base.getLocalPriority();
            this._logicalTerminationPoint = base.getLogicalTerminationPoint();
            this._designatedEnabled = base.isDesignatedEnabled();
            this._masterOnly = base.isMasterOnly();
        }

        @Override
        public java.lang.Long getDelayAsymmetry() {
            return _delayAsymmetry;
        }
        
        @Override
        public java.lang.Short getLocalPriority() {
            return _localPriority;
        }
        
        @Override
        public UniversalId getLogicalTerminationPoint() {
            return _logicalTerminationPoint;
        }
        
        @Override
        public java.lang.Boolean isDesignatedEnabled() {
            return _designatedEnabled;
        }
        
        @Override
        public java.lang.Boolean isMasterOnly() {
            return _masterOnly;
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
            result = prime * result + Objects.hashCode(_delayAsymmetry);
            result = prime * result + Objects.hashCode(_localPriority);
            result = prime * result + Objects.hashCode(_logicalTerminationPoint);
            result = prime * result + Objects.hashCode(_designatedEnabled);
            result = prime * result + Objects.hashCode(_masterOnly);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.PortDsList1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.PortDsList1 other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508.PortDsList1)obj;
            if (!Objects.equals(_delayAsymmetry, other.getDelayAsymmetry())) {
                return false;
            }
            if (!Objects.equals(_localPriority, other.getLocalPriority())) {
                return false;
            }
            if (!Objects.equals(_logicalTerminationPoint, other.getLogicalTerminationPoint())) {
                return false;
            }
            if (!Objects.equals(_designatedEnabled, other.isDesignatedEnabled())) {
                return false;
            }
            if (!Objects.equals(_masterOnly, other.isMasterOnly())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "PortDsList1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_delayAsymmetry != null) {
                builder.append("_delayAsymmetry=");
                builder.append(_delayAsymmetry);
                builder.append(", ");
            }
            if (_localPriority != null) {
                builder.append("_localPriority=");
                builder.append(_localPriority);
                builder.append(", ");
            }
            if (_logicalTerminationPoint != null) {
                builder.append("_logicalTerminationPoint=");
                builder.append(_logicalTerminationPoint);
                builder.append(", ");
            }
            if (_designatedEnabled != null) {
                builder.append("_designatedEnabled=");
                builder.append(_designatedEnabled);
                builder.append(", ");
            }
            if (_masterOnly != null) {
                builder.append("_masterOnly=");
                builder.append(_masterOnly);
            }
            return builder.append(']').toString();
        }
    }

}
