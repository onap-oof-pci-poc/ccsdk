package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.status.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class SegmentStatusListKey
 implements Identifier<SegmentStatusList> {
    private static final long serialVersionUID = 2977878562315469414L;
    private final java.lang.Short _segmentStatusTypeId;


    public SegmentStatusListKey(java.lang.Short _segmentStatusTypeId) {
    
    
        this._segmentStatusTypeId = _segmentStatusTypeId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SegmentStatusListKey(SegmentStatusListKey source) {
        this._segmentStatusTypeId = source._segmentStatusTypeId;
    }


    public java.lang.Short getSegmentStatusTypeId() {
        return _segmentStatusTypeId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_segmentStatusTypeId);
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
        SegmentStatusListKey other = (SegmentStatusListKey) obj;
        if (!Objects.equals(_segmentStatusTypeId, other._segmentStatusTypeId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.status.g.SegmentStatusListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_segmentStatusTypeId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_segmentStatusTypeId=");
            builder.append(_segmentStatusTypeId);
        }
        return builder.append(']').toString();
    }
}

