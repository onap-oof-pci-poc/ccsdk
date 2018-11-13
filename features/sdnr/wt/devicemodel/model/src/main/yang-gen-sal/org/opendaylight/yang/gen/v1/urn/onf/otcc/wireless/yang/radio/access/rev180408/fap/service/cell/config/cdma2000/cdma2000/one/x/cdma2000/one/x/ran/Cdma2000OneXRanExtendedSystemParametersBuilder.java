package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters
 *
 */
public class Cdma2000OneXRanExtendedSystemParametersBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters> {

    private java.lang.Short _accHoListUpd;
    private java.lang.Short _accProbeHoOtherMsg;
    private java.lang.Short _accessHo;
    private java.lang.Short _accessHoMsgRsp;
    private java.lang.Short _accessHoOrder;
    private java.lang.Short _accessProbeHo;
    private java.lang.Short _addIntercept;
    private java.lang.Short _bcastIndex;
    private java.lang.Short _brdcastGpsAssit;
    private java.lang.Short _deleteForTmsi;
    private java.lang.Short _dropIntercept;
    private BigInteger _ecIoThresh;
    private BigInteger _ecThresh;
    private java.lang.Short _imsi1112;
    private java.lang.Long _imsitSupported;
    private java.lang.Short _maxNumAltSo;
    private java.lang.Short _maxNumProbeHo;
    private java.lang.Integer _mcc;
    private java.lang.Short _nghbrSetAccessInfo;
    private java.lang.Short _nghbrSetEntryInfo;
    private java.lang.Short _numQpch;
    private java.lang.Short _pMinRev;
    private java.lang.Short _pilotReport;
    private java.lang.Short _prefMsidType;
    private java.lang.Short _prev;
    private java.lang.Short _qpcHcciSupported;
    private java.lang.Short _qpchPwrLevelConfig;
    private java.lang.Short _qpchPwrLevelPage;
    private java.lang.Short _qpchRate;
    private java.lang.Short _qpchSupported;
    private java.lang.Short _rLgainTrafficPilot;
    private java.lang.Short _reselectedIncluded;
    private java.lang.Short _rvsPwrCtrlDelay;
    private java.lang.Short _rvsPwrCtrlDelayIncl;
    private java.lang.Short _sdbSupported;
    private java.lang.Short _softSlope;
    private java.lang.Integer _tmsiZone;
    private java.lang.Short _tmsiZoneLen;
    private java.lang.Short _useTmsi;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanExtendedSystemParametersBuilder() {
    }
    public Cdma2000OneXRanExtendedSystemParametersBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG arg) {
        this._prev = arg.getPrev();
        this._pMinRev = arg.getPMinRev();
        this._deleteForTmsi = arg.getDeleteForTmsi();
        this._useTmsi = arg.getUseTmsi();
        this._prefMsidType = arg.getPrefMsidType();
        this._mcc = arg.getMcc();
        this._imsi1112 = arg.getImsi1112();
        this._tmsiZoneLen = arg.getTmsiZoneLen();
        this._tmsiZone = arg.getTmsiZone();
        this._bcastIndex = arg.getBcastIndex();
        this._imsitSupported = arg.getImsitSupported();
        this._softSlope = arg.getSoftSlope();
        this._addIntercept = arg.getAddIntercept();
        this._dropIntercept = arg.getDropIntercept();
        this._maxNumAltSo = arg.getMaxNumAltSo();
        this._reselectedIncluded = arg.getReselectedIncluded();
        this._ecThresh = arg.getEcThresh();
        this._ecIoThresh = arg.getEcIoThresh();
        this._pilotReport = arg.getPilotReport();
        this._nghbrSetEntryInfo = arg.getNghbrSetEntryInfo();
        this._accessHoOrder = arg.getAccessHoOrder();
        this._nghbrSetAccessInfo = arg.getNghbrSetAccessInfo();
        this._accessHo = arg.getAccessHo();
        this._accessHoMsgRsp = arg.getAccessHoMsgRsp();
        this._accessProbeHo = arg.getAccessProbeHo();
        this._accHoListUpd = arg.getAccHoListUpd();
        this._accProbeHoOtherMsg = arg.getAccProbeHoOtherMsg();
        this._maxNumProbeHo = arg.getMaxNumProbeHo();
        this._brdcastGpsAssit = arg.getBrdcastGpsAssit();
        this._qpchSupported = arg.getQpchSupported();
        this._numQpch = arg.getNumQpch();
        this._qpchRate = arg.getQpchRate();
        this._qpchPwrLevelPage = arg.getQpchPwrLevelPage();
        this._qpcHcciSupported = arg.getQpcHcciSupported();
        this._qpchPwrLevelConfig = arg.getQpchPwrLevelConfig();
        this._sdbSupported = arg.getSdbSupported();
        this._rLgainTrafficPilot = arg.getRLgainTrafficPilot();
        this._rvsPwrCtrlDelayIncl = arg.getRvsPwrCtrlDelayIncl();
        this._rvsPwrCtrlDelay = arg.getRvsPwrCtrlDelay();
    }

    public Cdma2000OneXRanExtendedSystemParametersBuilder(Cdma2000OneXRanExtendedSystemParameters base) {
        this._accHoListUpd = base.getAccHoListUpd();
        this._accProbeHoOtherMsg = base.getAccProbeHoOtherMsg();
        this._accessHo = base.getAccessHo();
        this._accessHoMsgRsp = base.getAccessHoMsgRsp();
        this._accessHoOrder = base.getAccessHoOrder();
        this._accessProbeHo = base.getAccessProbeHo();
        this._addIntercept = base.getAddIntercept();
        this._bcastIndex = base.getBcastIndex();
        this._brdcastGpsAssit = base.getBrdcastGpsAssit();
        this._deleteForTmsi = base.getDeleteForTmsi();
        this._dropIntercept = base.getDropIntercept();
        this._ecIoThresh = base.getEcIoThresh();
        this._ecThresh = base.getEcThresh();
        this._imsi1112 = base.getImsi1112();
        this._imsitSupported = base.getImsitSupported();
        this._maxNumAltSo = base.getMaxNumAltSo();
        this._maxNumProbeHo = base.getMaxNumProbeHo();
        this._mcc = base.getMcc();
        this._nghbrSetAccessInfo = base.getNghbrSetAccessInfo();
        this._nghbrSetEntryInfo = base.getNghbrSetEntryInfo();
        this._numQpch = base.getNumQpch();
        this._pMinRev = base.getPMinRev();
        this._pilotReport = base.getPilotReport();
        this._prefMsidType = base.getPrefMsidType();
        this._prev = base.getPrev();
        this._qpcHcciSupported = base.getQpcHcciSupported();
        this._qpchPwrLevelConfig = base.getQpchPwrLevelConfig();
        this._qpchPwrLevelPage = base.getQpchPwrLevelPage();
        this._qpchRate = base.getQpchRate();
        this._qpchSupported = base.getQpchSupported();
        this._rLgainTrafficPilot = base.getRLgainTrafficPilot();
        this._reselectedIncluded = base.getReselectedIncluded();
        this._rvsPwrCtrlDelay = base.getRvsPwrCtrlDelay();
        this._rvsPwrCtrlDelayIncl = base.getRvsPwrCtrlDelayIncl();
        this._sdbSupported = base.getSdbSupported();
        this._softSlope = base.getSoftSlope();
        this._tmsiZone = base.getTmsiZone();
        this._tmsiZoneLen = base.getTmsiZoneLen();
        this._useTmsi = base.getUseTmsi();
        if (base instanceof Cdma2000OneXRanExtendedSystemParametersImpl) {
            Cdma2000OneXRanExtendedSystemParametersImpl impl = (Cdma2000OneXRanExtendedSystemParametersImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG) {
            this._prev = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getPrev();
            this._pMinRev = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getPMinRev();
            this._deleteForTmsi = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getDeleteForTmsi();
            this._useTmsi = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getUseTmsi();
            this._prefMsidType = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getPrefMsidType();
            this._mcc = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getMcc();
            this._imsi1112 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getImsi1112();
            this._tmsiZoneLen = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getTmsiZoneLen();
            this._tmsiZone = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getTmsiZone();
            this._bcastIndex = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getBcastIndex();
            this._imsitSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getImsitSupported();
            this._softSlope = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getSoftSlope();
            this._addIntercept = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getAddIntercept();
            this._dropIntercept = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getDropIntercept();
            this._maxNumAltSo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getMaxNumAltSo();
            this._reselectedIncluded = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getReselectedIncluded();
            this._ecThresh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getEcThresh();
            this._ecIoThresh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getEcIoThresh();
            this._pilotReport = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getPilotReport();
            this._nghbrSetEntryInfo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getNghbrSetEntryInfo();
            this._accessHoOrder = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getAccessHoOrder();
            this._nghbrSetAccessInfo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getNghbrSetAccessInfo();
            this._accessHo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getAccessHo();
            this._accessHoMsgRsp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getAccessHoMsgRsp();
            this._accessProbeHo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getAccessProbeHo();
            this._accHoListUpd = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getAccHoListUpd();
            this._accProbeHoOtherMsg = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getAccProbeHoOtherMsg();
            this._maxNumProbeHo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getMaxNumProbeHo();
            this._brdcastGpsAssit = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getBrdcastGpsAssit();
            this._qpchSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getQpchSupported();
            this._numQpch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getNumQpch();
            this._qpchRate = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getQpchRate();
            this._qpchPwrLevelPage = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getQpchPwrLevelPage();
            this._qpcHcciSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getQpcHcciSupported();
            this._qpchPwrLevelConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getQpchPwrLevelConfig();
            this._sdbSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getSdbSupported();
            this._rLgainTrafficPilot = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getRLgainTrafficPilot();
            this._rvsPwrCtrlDelayIncl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getRvsPwrCtrlDelayIncl();
            this._rvsPwrCtrlDelay = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG)arg).getRvsPwrCtrlDelay();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanExtendedSystemParametersG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getAccHoListUpd() {
        return _accHoListUpd;
    }
    
    public java.lang.Short getAccProbeHoOtherMsg() {
        return _accProbeHoOtherMsg;
    }
    
    public java.lang.Short getAccessHo() {
        return _accessHo;
    }
    
    public java.lang.Short getAccessHoMsgRsp() {
        return _accessHoMsgRsp;
    }
    
    public java.lang.Short getAccessHoOrder() {
        return _accessHoOrder;
    }
    
    public java.lang.Short getAccessProbeHo() {
        return _accessProbeHo;
    }
    
    public java.lang.Short getAddIntercept() {
        return _addIntercept;
    }
    
    public java.lang.Short getBcastIndex() {
        return _bcastIndex;
    }
    
    public java.lang.Short getBrdcastGpsAssit() {
        return _brdcastGpsAssit;
    }
    
    public java.lang.Short getDeleteForTmsi() {
        return _deleteForTmsi;
    }
    
    public java.lang.Short getDropIntercept() {
        return _dropIntercept;
    }
    
    public BigInteger getEcIoThresh() {
        return _ecIoThresh;
    }
    
    public BigInteger getEcThresh() {
        return _ecThresh;
    }
    
    public java.lang.Short getImsi1112() {
        return _imsi1112;
    }
    
    public java.lang.Long getImsitSupported() {
        return _imsitSupported;
    }
    
    public java.lang.Short getMaxNumAltSo() {
        return _maxNumAltSo;
    }
    
    public java.lang.Short getMaxNumProbeHo() {
        return _maxNumProbeHo;
    }
    
    public java.lang.Integer getMcc() {
        return _mcc;
    }
    
    public java.lang.Short getNghbrSetAccessInfo() {
        return _nghbrSetAccessInfo;
    }
    
    public java.lang.Short getNghbrSetEntryInfo() {
        return _nghbrSetEntryInfo;
    }
    
    public java.lang.Short getNumQpch() {
        return _numQpch;
    }
    
    public java.lang.Short getPMinRev() {
        return _pMinRev;
    }
    
    public java.lang.Short getPilotReport() {
        return _pilotReport;
    }
    
    public java.lang.Short getPrefMsidType() {
        return _prefMsidType;
    }
    
    public java.lang.Short getPrev() {
        return _prev;
    }
    
    public java.lang.Short getQpcHcciSupported() {
        return _qpcHcciSupported;
    }
    
    public java.lang.Short getQpchPwrLevelConfig() {
        return _qpchPwrLevelConfig;
    }
    
    public java.lang.Short getQpchPwrLevelPage() {
        return _qpchPwrLevelPage;
    }
    
    public java.lang.Short getQpchRate() {
        return _qpchRate;
    }
    
    public java.lang.Short getQpchSupported() {
        return _qpchSupported;
    }
    
    public java.lang.Short getRLgainTrafficPilot() {
        return _rLgainTrafficPilot;
    }
    
    public java.lang.Short getReselectedIncluded() {
        return _reselectedIncluded;
    }
    
    public java.lang.Short getRvsPwrCtrlDelay() {
        return _rvsPwrCtrlDelay;
    }
    
    public java.lang.Short getRvsPwrCtrlDelayIncl() {
        return _rvsPwrCtrlDelayIncl;
    }
    
    public java.lang.Short getSdbSupported() {
        return _sdbSupported;
    }
    
    public java.lang.Short getSoftSlope() {
        return _softSlope;
    }
    
    public java.lang.Integer getTmsiZone() {
        return _tmsiZone;
    }
    
    public java.lang.Short getTmsiZoneLen() {
        return _tmsiZoneLen;
    }
    
    public java.lang.Short getUseTmsi() {
        return _useTmsi;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkAccHoListUpdRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setAccHoListUpd(final java.lang.Short value) {
    if (value != null) {
        checkAccHoListUpdRange(value);
    }
        this._accHoListUpd = value;
        return this;
    }
    
     
     private static void checkAccProbeHoOtherMsgRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setAccProbeHoOtherMsg(final java.lang.Short value) {
    if (value != null) {
        checkAccProbeHoOtherMsgRange(value);
    }
        this._accProbeHoOtherMsg = value;
        return this;
    }
    
     
     private static void checkAccessHoRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setAccessHo(final java.lang.Short value) {
    if (value != null) {
        checkAccessHoRange(value);
    }
        this._accessHo = value;
        return this;
    }
    
     
     private static void checkAccessHoMsgRspRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setAccessHoMsgRsp(final java.lang.Short value) {
    if (value != null) {
        checkAccessHoMsgRspRange(value);
    }
        this._accessHoMsgRsp = value;
        return this;
    }
    
     
     private static void checkAccessHoOrderRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setAccessHoOrder(final java.lang.Short value) {
    if (value != null) {
        checkAccessHoOrderRange(value);
    }
        this._accessHoOrder = value;
        return this;
    }
    
     
     private static void checkAccessProbeHoRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setAccessProbeHo(final java.lang.Short value) {
    if (value != null) {
        checkAccessProbeHoRange(value);
    }
        this._accessProbeHo = value;
        return this;
    }
    
     
     private static void checkAddInterceptRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setAddIntercept(final java.lang.Short value) {
    if (value != null) {
        checkAddInterceptRange(value);
    }
        this._addIntercept = value;
        return this;
    }
    
     
     private static void checkBcastIndexRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setBcastIndex(final java.lang.Short value) {
    if (value != null) {
        checkBcastIndexRange(value);
    }
        this._bcastIndex = value;
        return this;
    }
    
     
     private static void checkBrdcastGpsAssitRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setBrdcastGpsAssit(final java.lang.Short value) {
    if (value != null) {
        checkBrdcastGpsAssitRange(value);
    }
        this._brdcastGpsAssit = value;
        return this;
    }
    
     
     private static void checkDeleteForTmsiRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setDeleteForTmsi(final java.lang.Short value) {
    if (value != null) {
        checkDeleteForTmsiRange(value);
    }
        this._deleteForTmsi = value;
        return this;
    }
    
     
     private static void checkDropInterceptRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setDropIntercept(final java.lang.Short value) {
    if (value != null) {
        checkDropInterceptRange(value);
    }
        this._dropIntercept = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKECIOTHRESHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKECIOTHRESHRANGE_RANGES = a;
     }
     private static void checkEcIoThreshRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKECIOTHRESHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKECIOTHRESHRANGE_RANGES)));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setEcIoThresh(final BigInteger value) {
    if (value != null) {
        checkEcIoThreshRange(value);
    }
        this._ecIoThresh = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKECTHRESHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKECTHRESHRANGE_RANGES = a;
     }
     private static void checkEcThreshRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKECTHRESHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKECTHRESHRANGE_RANGES)));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setEcThresh(final BigInteger value) {
    if (value != null) {
        checkEcThreshRange(value);
    }
        this._ecThresh = value;
        return this;
    }
    
     
     private static void checkImsi1112Range(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setImsi1112(final java.lang.Short value) {
    if (value != null) {
        checkImsi1112Range(value);
    }
        this._imsi1112 = value;
        return this;
    }
    
     
    public Cdma2000OneXRanExtendedSystemParametersBuilder setImsitSupported(final java.lang.Long value) {
        this._imsitSupported = value;
        return this;
    }
    
     
     private static void checkMaxNumAltSoRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setMaxNumAltSo(final java.lang.Short value) {
    if (value != null) {
        checkMaxNumAltSoRange(value);
    }
        this._maxNumAltSo = value;
        return this;
    }
    
     
     private static void checkMaxNumProbeHoRange(final short value) {
         if (value >= (short)0 && value <= (short)3) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..3]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setMaxNumProbeHo(final java.lang.Short value) {
    if (value != null) {
        checkMaxNumProbeHoRange(value);
    }
        this._maxNumProbeHo = value;
        return this;
    }
    
     
     private static void checkMccRange(final int value) {
         if (value >= 0 && value <= 1023) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1023]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setMcc(final java.lang.Integer value) {
    if (value != null) {
        checkMccRange(value);
    }
        this._mcc = value;
        return this;
    }
    
     
     private static void checkNghbrSetAccessInfoRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setNghbrSetAccessInfo(final java.lang.Short value) {
    if (value != null) {
        checkNghbrSetAccessInfoRange(value);
    }
        this._nghbrSetAccessInfo = value;
        return this;
    }
    
     
     private static void checkNghbrSetEntryInfoRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setNghbrSetEntryInfo(final java.lang.Short value) {
    if (value != null) {
        checkNghbrSetEntryInfoRange(value);
    }
        this._nghbrSetEntryInfo = value;
        return this;
    }
    
     
     private static void checkNumQpchRange(final short value) {
         if (value >= (short)1 && value <= (short)3) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..3]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setNumQpch(final java.lang.Short value) {
    if (value != null) {
        checkNumQpchRange(value);
    }
        this._numQpch = value;
        return this;
    }
    
     
     private static void checkPMinRevRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setPMinRev(final java.lang.Short value) {
    if (value != null) {
        checkPMinRevRange(value);
    }
        this._pMinRev = value;
        return this;
    }
    
     
     private static void checkPilotReportRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setPilotReport(final java.lang.Short value) {
    if (value != null) {
        checkPilotReportRange(value);
    }
        this._pilotReport = value;
        return this;
    }
    
     
     private static void checkPrefMsidTypeRange(final short value) {
         if (value >= (short)0 && value <= (short)3) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..3]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setPrefMsidType(final java.lang.Short value) {
    if (value != null) {
        checkPrefMsidTypeRange(value);
    }
        this._prefMsidType = value;
        return this;
    }
    
     
     private static void checkPrevRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setPrev(final java.lang.Short value) {
    if (value != null) {
        checkPrevRange(value);
    }
        this._prev = value;
        return this;
    }
    
     
     private static void checkQpcHcciSupportedRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setQpcHcciSupported(final java.lang.Short value) {
    if (value != null) {
        checkQpcHcciSupportedRange(value);
    }
        this._qpcHcciSupported = value;
        return this;
    }
    
     
     private static void checkQpchPwrLevelConfigRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setQpchPwrLevelConfig(final java.lang.Short value) {
    if (value != null) {
        checkQpchPwrLevelConfigRange(value);
    }
        this._qpchPwrLevelConfig = value;
        return this;
    }
    
     
     private static void checkQpchPwrLevelPageRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setQpchPwrLevelPage(final java.lang.Short value) {
    if (value != null) {
        checkQpchPwrLevelPageRange(value);
    }
        this._qpchPwrLevelPage = value;
        return this;
    }
    
     
     private static void checkQpchRateRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setQpchRate(final java.lang.Short value) {
    if (value != null) {
        checkQpchRateRange(value);
    }
        this._qpchRate = value;
        return this;
    }
    
     
     private static void checkQpchSupportedRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setQpchSupported(final java.lang.Short value) {
    if (value != null) {
        checkQpchSupportedRange(value);
    }
        this._qpchSupported = value;
        return this;
    }
    
     
     private static void checkRLgainTrafficPilotRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setRLgainTrafficPilot(final java.lang.Short value) {
    if (value != null) {
        checkRLgainTrafficPilotRange(value);
    }
        this._rLgainTrafficPilot = value;
        return this;
    }
    
     
     private static void checkReselectedIncludedRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setReselectedIncluded(final java.lang.Short value) {
    if (value != null) {
        checkReselectedIncludedRange(value);
    }
        this._reselectedIncluded = value;
        return this;
    }
    
     
     private static void checkRvsPwrCtrlDelayRange(final short value) {
         if (value >= (short)0 && value <= (short)3) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..3]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setRvsPwrCtrlDelay(final java.lang.Short value) {
    if (value != null) {
        checkRvsPwrCtrlDelayRange(value);
    }
        this._rvsPwrCtrlDelay = value;
        return this;
    }
    
     
     private static void checkRvsPwrCtrlDelayInclRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setRvsPwrCtrlDelayIncl(final java.lang.Short value) {
    if (value != null) {
        checkRvsPwrCtrlDelayInclRange(value);
    }
        this._rvsPwrCtrlDelayIncl = value;
        return this;
    }
    
     
     private static void checkSdbSupportedRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setSdbSupported(final java.lang.Short value) {
    if (value != null) {
        checkSdbSupportedRange(value);
    }
        this._sdbSupported = value;
        return this;
    }
    
     
     private static void checkSoftSlopeRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setSoftSlope(final java.lang.Short value) {
    if (value != null) {
        checkSoftSlopeRange(value);
    }
        this._softSlope = value;
        return this;
    }
    
     
     private static void checkTmsiZoneRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setTmsiZone(final java.lang.Integer value) {
    if (value != null) {
        checkTmsiZoneRange(value);
    }
        this._tmsiZone = value;
        return this;
    }
    
     
     private static void checkTmsiZoneLenRange(final short value) {
         if (value >= (short)1 && value <= (short)8) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..8]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setTmsiZoneLen(final java.lang.Short value) {
    if (value != null) {
        checkTmsiZoneLenRange(value);
    }
        this._tmsiZoneLen = value;
        return this;
    }
    
     
     private static void checkUseTmsiRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder setUseTmsi(final java.lang.Short value) {
    if (value != null) {
        checkUseTmsiRange(value);
    }
        this._useTmsi = value;
        return this;
    }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanExtendedSystemParametersBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanExtendedSystemParameters build() {
        return new Cdma2000OneXRanExtendedSystemParametersImpl(this);
    }

    private static final class Cdma2000OneXRanExtendedSystemParametersImpl implements Cdma2000OneXRanExtendedSystemParameters {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters.class;
        }

        private final java.lang.Short _accHoListUpd;
        private final java.lang.Short _accProbeHoOtherMsg;
        private final java.lang.Short _accessHo;
        private final java.lang.Short _accessHoMsgRsp;
        private final java.lang.Short _accessHoOrder;
        private final java.lang.Short _accessProbeHo;
        private final java.lang.Short _addIntercept;
        private final java.lang.Short _bcastIndex;
        private final java.lang.Short _brdcastGpsAssit;
        private final java.lang.Short _deleteForTmsi;
        private final java.lang.Short _dropIntercept;
        private final BigInteger _ecIoThresh;
        private final BigInteger _ecThresh;
        private final java.lang.Short _imsi1112;
        private final java.lang.Long _imsitSupported;
        private final java.lang.Short _maxNumAltSo;
        private final java.lang.Short _maxNumProbeHo;
        private final java.lang.Integer _mcc;
        private final java.lang.Short _nghbrSetAccessInfo;
        private final java.lang.Short _nghbrSetEntryInfo;
        private final java.lang.Short _numQpch;
        private final java.lang.Short _pMinRev;
        private final java.lang.Short _pilotReport;
        private final java.lang.Short _prefMsidType;
        private final java.lang.Short _prev;
        private final java.lang.Short _qpcHcciSupported;
        private final java.lang.Short _qpchPwrLevelConfig;
        private final java.lang.Short _qpchPwrLevelPage;
        private final java.lang.Short _qpchRate;
        private final java.lang.Short _qpchSupported;
        private final java.lang.Short _rLgainTrafficPilot;
        private final java.lang.Short _reselectedIncluded;
        private final java.lang.Short _rvsPwrCtrlDelay;
        private final java.lang.Short _rvsPwrCtrlDelayIncl;
        private final java.lang.Short _sdbSupported;
        private final java.lang.Short _softSlope;
        private final java.lang.Integer _tmsiZone;
        private final java.lang.Short _tmsiZoneLen;
        private final java.lang.Short _useTmsi;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanExtendedSystemParametersImpl(Cdma2000OneXRanExtendedSystemParametersBuilder base) {
            this._accHoListUpd = base.getAccHoListUpd();
            this._accProbeHoOtherMsg = base.getAccProbeHoOtherMsg();
            this._accessHo = base.getAccessHo();
            this._accessHoMsgRsp = base.getAccessHoMsgRsp();
            this._accessHoOrder = base.getAccessHoOrder();
            this._accessProbeHo = base.getAccessProbeHo();
            this._addIntercept = base.getAddIntercept();
            this._bcastIndex = base.getBcastIndex();
            this._brdcastGpsAssit = base.getBrdcastGpsAssit();
            this._deleteForTmsi = base.getDeleteForTmsi();
            this._dropIntercept = base.getDropIntercept();
            this._ecIoThresh = base.getEcIoThresh();
            this._ecThresh = base.getEcThresh();
            this._imsi1112 = base.getImsi1112();
            this._imsitSupported = base.getImsitSupported();
            this._maxNumAltSo = base.getMaxNumAltSo();
            this._maxNumProbeHo = base.getMaxNumProbeHo();
            this._mcc = base.getMcc();
            this._nghbrSetAccessInfo = base.getNghbrSetAccessInfo();
            this._nghbrSetEntryInfo = base.getNghbrSetEntryInfo();
            this._numQpch = base.getNumQpch();
            this._pMinRev = base.getPMinRev();
            this._pilotReport = base.getPilotReport();
            this._prefMsidType = base.getPrefMsidType();
            this._prev = base.getPrev();
            this._qpcHcciSupported = base.getQpcHcciSupported();
            this._qpchPwrLevelConfig = base.getQpchPwrLevelConfig();
            this._qpchPwrLevelPage = base.getQpchPwrLevelPage();
            this._qpchRate = base.getQpchRate();
            this._qpchSupported = base.getQpchSupported();
            this._rLgainTrafficPilot = base.getRLgainTrafficPilot();
            this._reselectedIncluded = base.getReselectedIncluded();
            this._rvsPwrCtrlDelay = base.getRvsPwrCtrlDelay();
            this._rvsPwrCtrlDelayIncl = base.getRvsPwrCtrlDelayIncl();
            this._sdbSupported = base.getSdbSupported();
            this._softSlope = base.getSoftSlope();
            this._tmsiZone = base.getTmsiZone();
            this._tmsiZoneLen = base.getTmsiZoneLen();
            this._useTmsi = base.getUseTmsi();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getAccHoListUpd() {
            return _accHoListUpd;
        }
        
        @Override
        public java.lang.Short getAccProbeHoOtherMsg() {
            return _accProbeHoOtherMsg;
        }
        
        @Override
        public java.lang.Short getAccessHo() {
            return _accessHo;
        }
        
        @Override
        public java.lang.Short getAccessHoMsgRsp() {
            return _accessHoMsgRsp;
        }
        
        @Override
        public java.lang.Short getAccessHoOrder() {
            return _accessHoOrder;
        }
        
        @Override
        public java.lang.Short getAccessProbeHo() {
            return _accessProbeHo;
        }
        
        @Override
        public java.lang.Short getAddIntercept() {
            return _addIntercept;
        }
        
        @Override
        public java.lang.Short getBcastIndex() {
            return _bcastIndex;
        }
        
        @Override
        public java.lang.Short getBrdcastGpsAssit() {
            return _brdcastGpsAssit;
        }
        
        @Override
        public java.lang.Short getDeleteForTmsi() {
            return _deleteForTmsi;
        }
        
        @Override
        public java.lang.Short getDropIntercept() {
            return _dropIntercept;
        }
        
        @Override
        public BigInteger getEcIoThresh() {
            return _ecIoThresh;
        }
        
        @Override
        public BigInteger getEcThresh() {
            return _ecThresh;
        }
        
        @Override
        public java.lang.Short getImsi1112() {
            return _imsi1112;
        }
        
        @Override
        public java.lang.Long getImsitSupported() {
            return _imsitSupported;
        }
        
        @Override
        public java.lang.Short getMaxNumAltSo() {
            return _maxNumAltSo;
        }
        
        @Override
        public java.lang.Short getMaxNumProbeHo() {
            return _maxNumProbeHo;
        }
        
        @Override
        public java.lang.Integer getMcc() {
            return _mcc;
        }
        
        @Override
        public java.lang.Short getNghbrSetAccessInfo() {
            return _nghbrSetAccessInfo;
        }
        
        @Override
        public java.lang.Short getNghbrSetEntryInfo() {
            return _nghbrSetEntryInfo;
        }
        
        @Override
        public java.lang.Short getNumQpch() {
            return _numQpch;
        }
        
        @Override
        public java.lang.Short getPMinRev() {
            return _pMinRev;
        }
        
        @Override
        public java.lang.Short getPilotReport() {
            return _pilotReport;
        }
        
        @Override
        public java.lang.Short getPrefMsidType() {
            return _prefMsidType;
        }
        
        @Override
        public java.lang.Short getPrev() {
            return _prev;
        }
        
        @Override
        public java.lang.Short getQpcHcciSupported() {
            return _qpcHcciSupported;
        }
        
        @Override
        public java.lang.Short getQpchPwrLevelConfig() {
            return _qpchPwrLevelConfig;
        }
        
        @Override
        public java.lang.Short getQpchPwrLevelPage() {
            return _qpchPwrLevelPage;
        }
        
        @Override
        public java.lang.Short getQpchRate() {
            return _qpchRate;
        }
        
        @Override
        public java.lang.Short getQpchSupported() {
            return _qpchSupported;
        }
        
        @Override
        public java.lang.Short getRLgainTrafficPilot() {
            return _rLgainTrafficPilot;
        }
        
        @Override
        public java.lang.Short getReselectedIncluded() {
            return _reselectedIncluded;
        }
        
        @Override
        public java.lang.Short getRvsPwrCtrlDelay() {
            return _rvsPwrCtrlDelay;
        }
        
        @Override
        public java.lang.Short getRvsPwrCtrlDelayIncl() {
            return _rvsPwrCtrlDelayIncl;
        }
        
        @Override
        public java.lang.Short getSdbSupported() {
            return _sdbSupported;
        }
        
        @Override
        public java.lang.Short getSoftSlope() {
            return _softSlope;
        }
        
        @Override
        public java.lang.Integer getTmsiZone() {
            return _tmsiZone;
        }
        
        @Override
        public java.lang.Short getTmsiZoneLen() {
            return _tmsiZoneLen;
        }
        
        @Override
        public java.lang.Short getUseTmsi() {
            return _useTmsi;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_accHoListUpd);
            result = prime * result + Objects.hashCode(_accProbeHoOtherMsg);
            result = prime * result + Objects.hashCode(_accessHo);
            result = prime * result + Objects.hashCode(_accessHoMsgRsp);
            result = prime * result + Objects.hashCode(_accessHoOrder);
            result = prime * result + Objects.hashCode(_accessProbeHo);
            result = prime * result + Objects.hashCode(_addIntercept);
            result = prime * result + Objects.hashCode(_bcastIndex);
            result = prime * result + Objects.hashCode(_brdcastGpsAssit);
            result = prime * result + Objects.hashCode(_deleteForTmsi);
            result = prime * result + Objects.hashCode(_dropIntercept);
            result = prime * result + Objects.hashCode(_ecIoThresh);
            result = prime * result + Objects.hashCode(_ecThresh);
            result = prime * result + Objects.hashCode(_imsi1112);
            result = prime * result + Objects.hashCode(_imsitSupported);
            result = prime * result + Objects.hashCode(_maxNumAltSo);
            result = prime * result + Objects.hashCode(_maxNumProbeHo);
            result = prime * result + Objects.hashCode(_mcc);
            result = prime * result + Objects.hashCode(_nghbrSetAccessInfo);
            result = prime * result + Objects.hashCode(_nghbrSetEntryInfo);
            result = prime * result + Objects.hashCode(_numQpch);
            result = prime * result + Objects.hashCode(_pMinRev);
            result = prime * result + Objects.hashCode(_pilotReport);
            result = prime * result + Objects.hashCode(_prefMsidType);
            result = prime * result + Objects.hashCode(_prev);
            result = prime * result + Objects.hashCode(_qpcHcciSupported);
            result = prime * result + Objects.hashCode(_qpchPwrLevelConfig);
            result = prime * result + Objects.hashCode(_qpchPwrLevelPage);
            result = prime * result + Objects.hashCode(_qpchRate);
            result = prime * result + Objects.hashCode(_qpchSupported);
            result = prime * result + Objects.hashCode(_rLgainTrafficPilot);
            result = prime * result + Objects.hashCode(_reselectedIncluded);
            result = prime * result + Objects.hashCode(_rvsPwrCtrlDelay);
            result = prime * result + Objects.hashCode(_rvsPwrCtrlDelayIncl);
            result = prime * result + Objects.hashCode(_sdbSupported);
            result = prime * result + Objects.hashCode(_softSlope);
            result = prime * result + Objects.hashCode(_tmsiZone);
            result = prime * result + Objects.hashCode(_tmsiZoneLen);
            result = prime * result + Objects.hashCode(_useTmsi);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters)obj;
            if (!Objects.equals(_accHoListUpd, other.getAccHoListUpd())) {
                return false;
            }
            if (!Objects.equals(_accProbeHoOtherMsg, other.getAccProbeHoOtherMsg())) {
                return false;
            }
            if (!Objects.equals(_accessHo, other.getAccessHo())) {
                return false;
            }
            if (!Objects.equals(_accessHoMsgRsp, other.getAccessHoMsgRsp())) {
                return false;
            }
            if (!Objects.equals(_accessHoOrder, other.getAccessHoOrder())) {
                return false;
            }
            if (!Objects.equals(_accessProbeHo, other.getAccessProbeHo())) {
                return false;
            }
            if (!Objects.equals(_addIntercept, other.getAddIntercept())) {
                return false;
            }
            if (!Objects.equals(_bcastIndex, other.getBcastIndex())) {
                return false;
            }
            if (!Objects.equals(_brdcastGpsAssit, other.getBrdcastGpsAssit())) {
                return false;
            }
            if (!Objects.equals(_deleteForTmsi, other.getDeleteForTmsi())) {
                return false;
            }
            if (!Objects.equals(_dropIntercept, other.getDropIntercept())) {
                return false;
            }
            if (!Objects.equals(_ecIoThresh, other.getEcIoThresh())) {
                return false;
            }
            if (!Objects.equals(_ecThresh, other.getEcThresh())) {
                return false;
            }
            if (!Objects.equals(_imsi1112, other.getImsi1112())) {
                return false;
            }
            if (!Objects.equals(_imsitSupported, other.getImsitSupported())) {
                return false;
            }
            if (!Objects.equals(_maxNumAltSo, other.getMaxNumAltSo())) {
                return false;
            }
            if (!Objects.equals(_maxNumProbeHo, other.getMaxNumProbeHo())) {
                return false;
            }
            if (!Objects.equals(_mcc, other.getMcc())) {
                return false;
            }
            if (!Objects.equals(_nghbrSetAccessInfo, other.getNghbrSetAccessInfo())) {
                return false;
            }
            if (!Objects.equals(_nghbrSetEntryInfo, other.getNghbrSetEntryInfo())) {
                return false;
            }
            if (!Objects.equals(_numQpch, other.getNumQpch())) {
                return false;
            }
            if (!Objects.equals(_pMinRev, other.getPMinRev())) {
                return false;
            }
            if (!Objects.equals(_pilotReport, other.getPilotReport())) {
                return false;
            }
            if (!Objects.equals(_prefMsidType, other.getPrefMsidType())) {
                return false;
            }
            if (!Objects.equals(_prev, other.getPrev())) {
                return false;
            }
            if (!Objects.equals(_qpcHcciSupported, other.getQpcHcciSupported())) {
                return false;
            }
            if (!Objects.equals(_qpchPwrLevelConfig, other.getQpchPwrLevelConfig())) {
                return false;
            }
            if (!Objects.equals(_qpchPwrLevelPage, other.getQpchPwrLevelPage())) {
                return false;
            }
            if (!Objects.equals(_qpchRate, other.getQpchRate())) {
                return false;
            }
            if (!Objects.equals(_qpchSupported, other.getQpchSupported())) {
                return false;
            }
            if (!Objects.equals(_rLgainTrafficPilot, other.getRLgainTrafficPilot())) {
                return false;
            }
            if (!Objects.equals(_reselectedIncluded, other.getReselectedIncluded())) {
                return false;
            }
            if (!Objects.equals(_rvsPwrCtrlDelay, other.getRvsPwrCtrlDelay())) {
                return false;
            }
            if (!Objects.equals(_rvsPwrCtrlDelayIncl, other.getRvsPwrCtrlDelayIncl())) {
                return false;
            }
            if (!Objects.equals(_sdbSupported, other.getSdbSupported())) {
                return false;
            }
            if (!Objects.equals(_softSlope, other.getSoftSlope())) {
                return false;
            }
            if (!Objects.equals(_tmsiZone, other.getTmsiZone())) {
                return false;
            }
            if (!Objects.equals(_tmsiZoneLen, other.getTmsiZoneLen())) {
                return false;
            }
            if (!Objects.equals(_useTmsi, other.getUseTmsi())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanExtendedSystemParametersImpl otherImpl = (Cdma2000OneXRanExtendedSystemParametersImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Cdma2000OneXRanExtendedSystemParameters [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accHoListUpd != null) {
                builder.append("_accHoListUpd=");
                builder.append(_accHoListUpd);
                builder.append(", ");
            }
            if (_accProbeHoOtherMsg != null) {
                builder.append("_accProbeHoOtherMsg=");
                builder.append(_accProbeHoOtherMsg);
                builder.append(", ");
            }
            if (_accessHo != null) {
                builder.append("_accessHo=");
                builder.append(_accessHo);
                builder.append(", ");
            }
            if (_accessHoMsgRsp != null) {
                builder.append("_accessHoMsgRsp=");
                builder.append(_accessHoMsgRsp);
                builder.append(", ");
            }
            if (_accessHoOrder != null) {
                builder.append("_accessHoOrder=");
                builder.append(_accessHoOrder);
                builder.append(", ");
            }
            if (_accessProbeHo != null) {
                builder.append("_accessProbeHo=");
                builder.append(_accessProbeHo);
                builder.append(", ");
            }
            if (_addIntercept != null) {
                builder.append("_addIntercept=");
                builder.append(_addIntercept);
                builder.append(", ");
            }
            if (_bcastIndex != null) {
                builder.append("_bcastIndex=");
                builder.append(_bcastIndex);
                builder.append(", ");
            }
            if (_brdcastGpsAssit != null) {
                builder.append("_brdcastGpsAssit=");
                builder.append(_brdcastGpsAssit);
                builder.append(", ");
            }
            if (_deleteForTmsi != null) {
                builder.append("_deleteForTmsi=");
                builder.append(_deleteForTmsi);
                builder.append(", ");
            }
            if (_dropIntercept != null) {
                builder.append("_dropIntercept=");
                builder.append(_dropIntercept);
                builder.append(", ");
            }
            if (_ecIoThresh != null) {
                builder.append("_ecIoThresh=");
                builder.append(_ecIoThresh);
                builder.append(", ");
            }
            if (_ecThresh != null) {
                builder.append("_ecThresh=");
                builder.append(_ecThresh);
                builder.append(", ");
            }
            if (_imsi1112 != null) {
                builder.append("_imsi1112=");
                builder.append(_imsi1112);
                builder.append(", ");
            }
            if (_imsitSupported != null) {
                builder.append("_imsitSupported=");
                builder.append(_imsitSupported);
                builder.append(", ");
            }
            if (_maxNumAltSo != null) {
                builder.append("_maxNumAltSo=");
                builder.append(_maxNumAltSo);
                builder.append(", ");
            }
            if (_maxNumProbeHo != null) {
                builder.append("_maxNumProbeHo=");
                builder.append(_maxNumProbeHo);
                builder.append(", ");
            }
            if (_mcc != null) {
                builder.append("_mcc=");
                builder.append(_mcc);
                builder.append(", ");
            }
            if (_nghbrSetAccessInfo != null) {
                builder.append("_nghbrSetAccessInfo=");
                builder.append(_nghbrSetAccessInfo);
                builder.append(", ");
            }
            if (_nghbrSetEntryInfo != null) {
                builder.append("_nghbrSetEntryInfo=");
                builder.append(_nghbrSetEntryInfo);
                builder.append(", ");
            }
            if (_numQpch != null) {
                builder.append("_numQpch=");
                builder.append(_numQpch);
                builder.append(", ");
            }
            if (_pMinRev != null) {
                builder.append("_pMinRev=");
                builder.append(_pMinRev);
                builder.append(", ");
            }
            if (_pilotReport != null) {
                builder.append("_pilotReport=");
                builder.append(_pilotReport);
                builder.append(", ");
            }
            if (_prefMsidType != null) {
                builder.append("_prefMsidType=");
                builder.append(_prefMsidType);
                builder.append(", ");
            }
            if (_prev != null) {
                builder.append("_prev=");
                builder.append(_prev);
                builder.append(", ");
            }
            if (_qpcHcciSupported != null) {
                builder.append("_qpcHcciSupported=");
                builder.append(_qpcHcciSupported);
                builder.append(", ");
            }
            if (_qpchPwrLevelConfig != null) {
                builder.append("_qpchPwrLevelConfig=");
                builder.append(_qpchPwrLevelConfig);
                builder.append(", ");
            }
            if (_qpchPwrLevelPage != null) {
                builder.append("_qpchPwrLevelPage=");
                builder.append(_qpchPwrLevelPage);
                builder.append(", ");
            }
            if (_qpchRate != null) {
                builder.append("_qpchRate=");
                builder.append(_qpchRate);
                builder.append(", ");
            }
            if (_qpchSupported != null) {
                builder.append("_qpchSupported=");
                builder.append(_qpchSupported);
                builder.append(", ");
            }
            if (_rLgainTrafficPilot != null) {
                builder.append("_rLgainTrafficPilot=");
                builder.append(_rLgainTrafficPilot);
                builder.append(", ");
            }
            if (_reselectedIncluded != null) {
                builder.append("_reselectedIncluded=");
                builder.append(_reselectedIncluded);
                builder.append(", ");
            }
            if (_rvsPwrCtrlDelay != null) {
                builder.append("_rvsPwrCtrlDelay=");
                builder.append(_rvsPwrCtrlDelay);
                builder.append(", ");
            }
            if (_rvsPwrCtrlDelayIncl != null) {
                builder.append("_rvsPwrCtrlDelayIncl=");
                builder.append(_rvsPwrCtrlDelayIncl);
                builder.append(", ");
            }
            if (_sdbSupported != null) {
                builder.append("_sdbSupported=");
                builder.append(_sdbSupported);
                builder.append(", ");
            }
            if (_softSlope != null) {
                builder.append("_softSlope=");
                builder.append(_softSlope);
                builder.append(", ");
            }
            if (_tmsiZone != null) {
                builder.append("_tmsiZone=");
                builder.append(_tmsiZone);
                builder.append(", ");
            }
            if (_tmsiZoneLen != null) {
                builder.append("_tmsiZoneLen=");
                builder.append(_tmsiZoneLen);
                builder.append(", ");
            }
            if (_useTmsi != null) {
                builder.append("_useTmsi=");
                builder.append(_useTmsi);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
