package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteRanPhyMbsfnSfConfigListKey
 implements Identifier<LteRanPhyMbsfnSfConfigList> {
    private static final long serialVersionUID = 1080873631026972967L;
    private final java.lang.Short _radioFrameAllocationPeriod;
    private final java.lang.Short _radioframeAllocationOffset;
    private final java.lang.Short _radioFrameAllocationSize;


    public LteRanPhyMbsfnSfConfigListKey(java.lang.Short _radioFrameAllocationPeriod, java.lang.Short _radioFrameAllocationSize, java.lang.Short _radioframeAllocationOffset) {
    
    
        this._radioFrameAllocationPeriod = _radioFrameAllocationPeriod;
        this._radioframeAllocationOffset = _radioframeAllocationOffset;
        this._radioFrameAllocationSize = _radioFrameAllocationSize;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteRanPhyMbsfnSfConfigListKey(LteRanPhyMbsfnSfConfigListKey source) {
        this._radioFrameAllocationPeriod = source._radioFrameAllocationPeriod;
        this._radioframeAllocationOffset = source._radioframeAllocationOffset;
        this._radioFrameAllocationSize = source._radioFrameAllocationSize;
    }


    public java.lang.Short getRadioFrameAllocationPeriod() {
        return _radioFrameAllocationPeriod;
    }
    
    public java.lang.Short getRadioframeAllocationOffset() {
        return _radioframeAllocationOffset;
    }
    
    public java.lang.Short getRadioFrameAllocationSize() {
        return _radioFrameAllocationSize;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_radioFrameAllocationPeriod);
        result = prime * result + Objects.hashCode(_radioframeAllocationOffset);
        result = prime * result + Objects.hashCode(_radioFrameAllocationSize);
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
        LteRanPhyMbsfnSfConfigListKey other = (LteRanPhyMbsfnSfConfigListKey) obj;
        if (!Objects.equals(_radioFrameAllocationPeriod, other._radioFrameAllocationPeriod)) {
            return false;
        }
        if (!Objects.equals(_radioframeAllocationOffset, other._radioframeAllocationOffset)) {
            return false;
        }
        if (!Objects.equals(_radioFrameAllocationSize, other._radioFrameAllocationSize)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_radioFrameAllocationPeriod != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_radioFrameAllocationPeriod=");
            builder.append(_radioFrameAllocationPeriod);
        }
        if (_radioframeAllocationOffset != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_radioframeAllocationOffset=");
            builder.append(_radioframeAllocationOffset);
        }
        if (_radioFrameAllocationSize != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_radioFrameAllocationSize=");
            builder.append(_radioFrameAllocationSize);
        }
        return builder.append(']').toString();
    }
}

