package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class MwAirInterfaceHsbEndPointPacKey
 implements Identifier<MwAirInterfaceHsbEndPointPac> {
    private static final long serialVersionUID = -847809506524686750L;
    private final UniversalId _endpoint;


    public MwAirInterfaceHsbEndPointPacKey(UniversalId _endpoint) {
    
    
        this._endpoint = _endpoint;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MwAirInterfaceHsbEndPointPacKey(MwAirInterfaceHsbEndPointPacKey source) {
        this._endpoint = source._endpoint;
    }


    public UniversalId getEndpoint() {
        return _endpoint;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_endpoint);
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
        MwAirInterfaceHsbEndPointPacKey other = (MwAirInterfaceHsbEndPointPacKey) obj;
        if (!Objects.equals(_endpoint, other._endpoint)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPacKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_endpoint != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_endpoint=");
            builder.append(_endpoint);
        }
        return builder.append(']').toString();
    }
}

