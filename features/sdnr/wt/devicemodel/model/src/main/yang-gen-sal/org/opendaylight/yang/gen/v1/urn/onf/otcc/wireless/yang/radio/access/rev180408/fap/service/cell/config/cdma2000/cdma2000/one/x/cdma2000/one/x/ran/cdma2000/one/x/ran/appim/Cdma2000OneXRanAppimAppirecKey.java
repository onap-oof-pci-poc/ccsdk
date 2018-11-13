package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import java.util.Arrays;

public class Cdma2000OneXRanAppimAppirecKey
 implements Identifier<Cdma2000OneXRanAppimAppirec> {
    private static final long serialVersionUID = -6491918900235756760L;
    private final java.lang.Integer _apsid;
    private final java.lang.Integer _apnid;
    private final java.lang.Short _apband;
    private final java.lang.Integer _apfreq;
    private final java.lang.Short _appnrectype;
    private final java.lang.Short _appnreclen;
    private final byte[] _appnrec;


    public Cdma2000OneXRanAppimAppirecKey(java.lang.Short _apband, java.lang.Integer _apfreq, java.lang.Integer _apnid, byte[] _appnrec, java.lang.Short _appnreclen, java.lang.Short _appnrectype, java.lang.Integer _apsid) {
    
    
        this._apsid = _apsid;
        this._apnid = _apnid;
        this._apband = _apband;
        this._apfreq = _apfreq;
        this._appnrectype = _appnrectype;
        this._appnreclen = _appnreclen;
        this._appnrec = _appnrec == null ? null : _appnrec.clone();
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Cdma2000OneXRanAppimAppirecKey(Cdma2000OneXRanAppimAppirecKey source) {
        this._apsid = source._apsid;
        this._apnid = source._apnid;
        this._apband = source._apband;
        this._apfreq = source._apfreq;
        this._appnrectype = source._appnrectype;
        this._appnreclen = source._appnreclen;
        this._appnrec = source._appnrec;
    }


    public java.lang.Integer getApsid() {
        return _apsid;
    }
    
    public java.lang.Integer getApnid() {
        return _apnid;
    }
    
    public java.lang.Short getApband() {
        return _apband;
    }
    
    public java.lang.Integer getApfreq() {
        return _apfreq;
    }
    
    public java.lang.Short getAppnrectype() {
        return _appnrectype;
    }
    
    public java.lang.Short getAppnreclen() {
        return _appnreclen;
    }
    
    public byte[] getAppnrec() {
        return _appnrec == null ? null : _appnrec.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_apsid);
        result = prime * result + Objects.hashCode(_apnid);
        result = prime * result + Objects.hashCode(_apband);
        result = prime * result + Objects.hashCode(_apfreq);
        result = prime * result + Objects.hashCode(_appnrectype);
        result = prime * result + Objects.hashCode(_appnreclen);
        result = prime * result + Arrays.hashCode(_appnrec);
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
        Cdma2000OneXRanAppimAppirecKey other = (Cdma2000OneXRanAppimAppirecKey) obj;
        if (!Objects.equals(_apsid, other._apsid)) {
            return false;
        }
        if (!Objects.equals(_apnid, other._apnid)) {
            return false;
        }
        if (!Objects.equals(_apband, other._apband)) {
            return false;
        }
        if (!Objects.equals(_apfreq, other._apfreq)) {
            return false;
        }
        if (!Objects.equals(_appnrectype, other._appnrectype)) {
            return false;
        }
        if (!Objects.equals(_appnreclen, other._appnreclen)) {
            return false;
        }
        if (!Arrays.equals(_appnrec, other._appnrec)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirecKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_apsid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_apsid=");
            builder.append(_apsid);
        }
        if (_apnid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_apnid=");
            builder.append(_apnid);
        }
        if (_apband != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_apband=");
            builder.append(_apband);
        }
        if (_apfreq != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_apfreq=");
            builder.append(_apfreq);
        }
        if (_appnrectype != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_appnrectype=");
            builder.append(_appnrectype);
        }
        if (_appnreclen != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_appnreclen=");
            builder.append(_appnreclen);
        }
        if (_appnrec != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_appnrec=");
            builder.append(Arrays.toString(_appnrec));
        }
        return builder.append(']').toString();
    }
}

