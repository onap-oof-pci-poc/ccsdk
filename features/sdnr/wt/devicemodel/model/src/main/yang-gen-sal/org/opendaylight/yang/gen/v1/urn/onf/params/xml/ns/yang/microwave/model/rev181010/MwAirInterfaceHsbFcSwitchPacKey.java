package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class MwAirInterfaceHsbFcSwitchPacKey
 implements Identifier<MwAirInterfaceHsbFcSwitchPac> {
    private static final long serialVersionUID = 1132540137820437779L;
    private final UniversalId _fcswitch;


    public MwAirInterfaceHsbFcSwitchPacKey(UniversalId _fcswitch) {
    
    
        this._fcswitch = _fcswitch;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MwAirInterfaceHsbFcSwitchPacKey(MwAirInterfaceHsbFcSwitchPacKey source) {
        this._fcswitch = source._fcswitch;
    }


    public UniversalId getFcswitch() {
        return _fcswitch;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_fcswitch);
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
        MwAirInterfaceHsbFcSwitchPacKey other = (MwAirInterfaceHsbFcSwitchPacKey) obj;
        if (!Objects.equals(_fcswitch, other._fcswitch)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwAirInterfaceHsbFcSwitchPacKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_fcswitch != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_fcswitch=");
            builder.append(_fcswitch);
        }
        return builder.append(']').toString();
    }
}

