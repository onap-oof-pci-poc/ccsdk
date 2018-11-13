package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.pure.ethernet.structure.historical.performances.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class HistoricalPerformanceDataListKey
 implements Identifier<HistoricalPerformanceDataList> {
    private static final long serialVersionUID = -2437398812928075040L;
    private final java.lang.String _historyDataId;


    public HistoricalPerformanceDataListKey(java.lang.String _historyDataId) {
    
    
        this._historyDataId = _historyDataId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public HistoricalPerformanceDataListKey(HistoricalPerformanceDataListKey source) {
        this._historyDataId = source._historyDataId;
    }


    public java.lang.String getHistoryDataId() {
        return _historyDataId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_historyDataId);
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
        HistoricalPerformanceDataListKey other = (HistoricalPerformanceDataListKey) obj;
        if (!Objects.equals(_historyDataId, other._historyDataId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.pure.ethernet.structure.historical.performances.g.HistoricalPerformanceDataListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_historyDataId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_historyDataId=");
            builder.append(_historyDataId);
        }
        return builder.append(']').toString();
    }
}

