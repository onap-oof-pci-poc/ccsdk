package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

public class TransportSctpAssocKey
 implements Identifier<TransportSctpAssoc> {
    private static final long serialVersionUID = 4835843887635458658L;
    private final IpAddress _primaryPeerAddress;
    private final java.lang.Integer _localPort;


    public TransportSctpAssocKey(java.lang.Integer _localPort, IpAddress _primaryPeerAddress) {
    
    
        this._primaryPeerAddress = _primaryPeerAddress;
        this._localPort = _localPort;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TransportSctpAssocKey(TransportSctpAssocKey source) {
        this._primaryPeerAddress = source._primaryPeerAddress;
        this._localPort = source._localPort;
    }


    public IpAddress getPrimaryPeerAddress() {
        return _primaryPeerAddress;
    }
    
    public java.lang.Integer getLocalPort() {
        return _localPort;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_primaryPeerAddress);
        result = prime * result + Objects.hashCode(_localPort);
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
        TransportSctpAssocKey other = (TransportSctpAssocKey) obj;
        if (!Objects.equals(_primaryPeerAddress, other._primaryPeerAddress)) {
            return false;
        }
        if (!Objects.equals(_localPort, other._localPort)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssocKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_primaryPeerAddress != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_primaryPeerAddress=");
            builder.append(_primaryPeerAddress);
        }
        if (_localPort != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_localPort=");
            builder.append(_localPort);
        }
        return builder.append(']').toString();
    }
}

