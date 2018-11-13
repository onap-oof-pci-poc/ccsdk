package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.current.problems.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class CurrentProblemListKey
 implements Identifier<CurrentProblemList> {
    private static final long serialVersionUID = -622206119061848203L;
    private final java.lang.Integer _sequenceNumber;


    public CurrentProblemListKey(java.lang.Integer _sequenceNumber) {
    
    
        this._sequenceNumber = _sequenceNumber;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CurrentProblemListKey(CurrentProblemListKey source) {
        this._sequenceNumber = source._sequenceNumber;
    }


    public java.lang.Integer getSequenceNumber() {
        return _sequenceNumber;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_sequenceNumber);
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
        CurrentProblemListKey other = (CurrentProblemListKey) obj;
        if (!Objects.equals(_sequenceNumber, other._sequenceNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.current.problems.g.CurrentProblemListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_sequenceNumber != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_sequenceNumber=");
            builder.append(_sequenceNumber);
        }
        return builder.append(']').toString();
    }
}

