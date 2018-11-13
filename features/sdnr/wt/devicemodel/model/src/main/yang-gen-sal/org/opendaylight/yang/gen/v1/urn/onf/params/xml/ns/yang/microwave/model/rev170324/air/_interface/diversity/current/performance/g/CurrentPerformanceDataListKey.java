package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.current.performance.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class CurrentPerformanceDataListKey
 implements Identifier<CurrentPerformanceDataList> {
    private static final long serialVersionUID = -1789771389203878483L;
    private final java.lang.String _scannerId;


    public CurrentPerformanceDataListKey(java.lang.String _scannerId) {
    
    
        this._scannerId = _scannerId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CurrentPerformanceDataListKey(CurrentPerformanceDataListKey source) {
        this._scannerId = source._scannerId;
    }


    public java.lang.String getScannerId() {
        return _scannerId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_scannerId);
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
        CurrentPerformanceDataListKey other = (CurrentPerformanceDataListKey) obj;
        if (!Objects.equals(_scannerId, other._scannerId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.current.performance.g.CurrentPerformanceDataListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_scannerId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_scannerId=");
            builder.append(_scannerId);
        }
        return builder.append(']').toString();
    }
}

