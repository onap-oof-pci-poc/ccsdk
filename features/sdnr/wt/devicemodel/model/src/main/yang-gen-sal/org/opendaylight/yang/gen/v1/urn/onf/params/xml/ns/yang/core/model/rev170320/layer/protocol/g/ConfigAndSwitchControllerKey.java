package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.layer.protocol.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined;
import java.util.Objects;

public class ConfigAndSwitchControllerKey
 implements Identifier<ConfigAndSwitchController> {
    private static final long serialVersionUID = 1361808719586656977L;
    private final ToBeDefined _switchRule;


    public ConfigAndSwitchControllerKey(ToBeDefined _switchRule) {
    
    
        this._switchRule = _switchRule;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConfigAndSwitchControllerKey(ConfigAndSwitchControllerKey source) {
        this._switchRule = source._switchRule;
    }


    public ToBeDefined getSwitchRule() {
        return _switchRule;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_switchRule);
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
        ConfigAndSwitchControllerKey other = (ConfigAndSwitchControllerKey) obj;
        if (!Objects.equals(_switchRule, other._switchRule)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.layer.protocol.g.ConfigAndSwitchControllerKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_switchRule != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_switchRule=");
            builder.append(_switchRule);
        }
        return builder.append(']').toString();
    }
}

