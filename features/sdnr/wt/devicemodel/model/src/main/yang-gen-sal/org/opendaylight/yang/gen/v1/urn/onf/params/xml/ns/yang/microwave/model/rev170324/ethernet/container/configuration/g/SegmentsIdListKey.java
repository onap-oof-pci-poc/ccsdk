package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ethernet.container.configuration.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class SegmentsIdListKey
 implements Identifier<SegmentsIdList> {
    private static final long serialVersionUID = -7415961780485703434L;
    private final UniversalId _structureIdRef;
    private final java.lang.Short _segmentIdRef;


    public SegmentsIdListKey(java.lang.Short _segmentIdRef, UniversalId _structureIdRef) {
    
    
        this._structureIdRef = _structureIdRef;
        this._segmentIdRef = _segmentIdRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SegmentsIdListKey(SegmentsIdListKey source) {
        this._structureIdRef = source._structureIdRef;
        this._segmentIdRef = source._segmentIdRef;
    }


    public UniversalId getStructureIdRef() {
        return _structureIdRef;
    }
    
    public java.lang.Short getSegmentIdRef() {
        return _segmentIdRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_structureIdRef);
        result = prime * result + Objects.hashCode(_segmentIdRef);
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
        SegmentsIdListKey other = (SegmentsIdListKey) obj;
        if (!Objects.equals(_structureIdRef, other._structureIdRef)) {
            return false;
        }
        if (!Objects.equals(_segmentIdRef, other._segmentIdRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ethernet.container.configuration.g.SegmentsIdListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_structureIdRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_structureIdRef=");
            builder.append(_structureIdRef);
        }
        if (_segmentIdRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_segmentIdRef=");
            builder.append(_segmentIdRef);
        }
        return builder.append(']').toString();
    }
}

