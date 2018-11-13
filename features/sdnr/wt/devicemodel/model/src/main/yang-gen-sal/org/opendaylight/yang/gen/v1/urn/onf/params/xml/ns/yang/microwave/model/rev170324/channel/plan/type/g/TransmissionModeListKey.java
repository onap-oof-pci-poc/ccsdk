package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class TransmissionModeListKey
 implements Identifier<TransmissionModeList> {
    private static final long serialVersionUID = 8306641863723095475L;
    private final UniversalId _transmissionModeId;


    public TransmissionModeListKey(UniversalId _transmissionModeId) {
    
    
        this._transmissionModeId = _transmissionModeId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TransmissionModeListKey(TransmissionModeListKey source) {
        this._transmissionModeId = source._transmissionModeId;
    }


    public UniversalId getTransmissionModeId() {
        return _transmissionModeId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_transmissionModeId);
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
        TransmissionModeListKey other = (TransmissionModeListKey) obj;
        if (!Objects.equals(_transmissionModeId, other._transmissionModeId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_transmissionModeId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_transmissionModeId=");
            builder.append(_transmissionModeId);
        }
        return builder.append(']').toString();
    }
}

