package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class MwHybridMwStructurePacKey
 implements Identifier<MwHybridMwStructurePac> {
    private static final long serialVersionUID = -4904446009497409292L;
    private final UniversalId _layerProtocol;


    public MwHybridMwStructurePacKey(UniversalId _layerProtocol) {
    
    
        this._layerProtocol = _layerProtocol;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MwHybridMwStructurePacKey(MwHybridMwStructurePacKey source) {
        this._layerProtocol = source._layerProtocol;
    }


    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_layerProtocol);
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
        MwHybridMwStructurePacKey other = (MwHybridMwStructurePacKey) obj;
        if (!Objects.equals(_layerProtocol, other._layerProtocol)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwHybridMwStructurePacKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_layerProtocol != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_layerProtocol=");
            builder.append(_layerProtocol);
        }
        return builder.append(']').toString();
    }
}

