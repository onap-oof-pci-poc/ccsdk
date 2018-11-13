package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.capability.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class SupportedChannelPlanListKey
 implements Identifier<SupportedChannelPlanList> {
    private static final long serialVersionUID = -3497933683035136990L;
    private final java.lang.String _supportedChannelPlan;


    public SupportedChannelPlanListKey(java.lang.String _supportedChannelPlan) {
    
    
        this._supportedChannelPlan = _supportedChannelPlan;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportedChannelPlanListKey(SupportedChannelPlanListKey source) {
        this._supportedChannelPlan = source._supportedChannelPlan;
    }


    public java.lang.String getSupportedChannelPlan() {
        return _supportedChannelPlan;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_supportedChannelPlan);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SupportedChannelPlanListKey other = (SupportedChannelPlanListKey) obj;
        if (!Objects.equals(_supportedChannelPlan, other._supportedChannelPlan)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.capability.g.SupportedChannelPlanListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_supportedChannelPlan != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_supportedChannelPlan=");
            builder.append(_supportedChannelPlan);
        }
        return builder.append(']').toString();
    }
}

