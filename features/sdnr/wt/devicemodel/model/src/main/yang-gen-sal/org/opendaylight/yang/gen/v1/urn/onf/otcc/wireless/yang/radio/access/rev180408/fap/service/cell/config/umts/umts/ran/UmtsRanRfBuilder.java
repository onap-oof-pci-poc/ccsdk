package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf
 *
 */
public class UmtsRanRfBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf> {

    private java.lang.Long _aichPower;
    private java.lang.Long _bchPower;
    private java.lang.Short _cbsFrameOffset;
    private java.lang.Short _ctchAllocationPeriod;
    private java.lang.Long _fachPower;
    private java.lang.Short _fapCoverageTarget;
    private java.lang.Long _fapQualityTargetEcIo;
    private java.lang.Short _maxTti;
    private java.lang.String _maxUlTxPower;
    private java.lang.Long _maxUlTxPowerInUse;
    private java.lang.String _maxfapTxPowerExpanded;
    private java.lang.Long _maxfapTxPowerInUseExpanded;
    private java.lang.Integer _noiseRiseLimitInUse;
    private java.lang.Integer _noiseRiseLimitLowerValue;
    private java.lang.Integer _noiseRiseLimitUpperValue;
    private java.lang.Long _pchPower;
    private java.lang.String _pcpichPower;
    private java.lang.Long _pcpichPowerInUse;
    private java.lang.Long _pichPower;
    private java.lang.Short _powerOffsetPilotDpdch;
    private List<java.lang.String> _primaryScramblingCode;
    private BigInteger _primaryScramblingCodeInUse;
    private java.lang.Long _pschPower;
    private java.lang.Long _sschPower;
    private List<java.lang.String> _uarfcndl;
    private BigInteger _uarfcndlInUse;
    private List<java.lang.String> _uarfcndlToProtect;
    private BigInteger _uarfcnulInUse;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>> augmentation = Collections.emptyMap();

    public UmtsRanRfBuilder() {
    }
    public UmtsRanRfBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG arg) {
        this._uarfcndl = arg.getUarfcndl();
        this._uarfcndlInUse = arg.getUarfcndlInUse();
        this._uarfcnulInUse = arg.getUarfcnulInUse();
        this._uarfcndlToProtect = arg.getUarfcndlToProtect();
        this._primaryScramblingCode = arg.getPrimaryScramblingCode();
        this._primaryScramblingCodeInUse = arg.getPrimaryScramblingCodeInUse();
        this._maxfapTxPowerExpanded = arg.getMaxfapTxPowerExpanded();
        this._maxfapTxPowerInUseExpanded = arg.getMaxfapTxPowerInUseExpanded();
        this._maxUlTxPower = arg.getMaxUlTxPower();
        this._maxUlTxPowerInUse = arg.getMaxUlTxPowerInUse();
        this._pcpichPower = arg.getPcpichPower();
        this._pcpichPowerInUse = arg.getPcpichPowerInUse();
        this._powerOffsetPilotDpdch = arg.getPowerOffsetPilotDpdch();
        this._fapCoverageTarget = arg.getFapCoverageTarget();
        this._fapQualityTargetEcIo = arg.getFapQualityTargetEcIo();
        this._pschPower = arg.getPschPower();
        this._sschPower = arg.getSschPower();
        this._pichPower = arg.getPichPower();
        this._pchPower = arg.getPchPower();
        this._fachPower = arg.getFachPower();
        this._bchPower = arg.getBchPower();
        this._aichPower = arg.getAichPower();
        this._ctchAllocationPeriod = arg.getCtchAllocationPeriod();
        this._cbsFrameOffset = arg.getCbsFrameOffset();
        this._maxTti = arg.getMaxTti();
        this._noiseRiseLimitLowerValue = arg.getNoiseRiseLimitLowerValue();
        this._noiseRiseLimitUpperValue = arg.getNoiseRiseLimitUpperValue();
        this._noiseRiseLimitInUse = arg.getNoiseRiseLimitInUse();
    }

    public UmtsRanRfBuilder(UmtsRanRf base) {
        this._aichPower = base.getAichPower();
        this._bchPower = base.getBchPower();
        this._cbsFrameOffset = base.getCbsFrameOffset();
        this._ctchAllocationPeriod = base.getCtchAllocationPeriod();
        this._fachPower = base.getFachPower();
        this._fapCoverageTarget = base.getFapCoverageTarget();
        this._fapQualityTargetEcIo = base.getFapQualityTargetEcIo();
        this._maxTti = base.getMaxTti();
        this._maxUlTxPower = base.getMaxUlTxPower();
        this._maxUlTxPowerInUse = base.getMaxUlTxPowerInUse();
        this._maxfapTxPowerExpanded = base.getMaxfapTxPowerExpanded();
        this._maxfapTxPowerInUseExpanded = base.getMaxfapTxPowerInUseExpanded();
        this._noiseRiseLimitInUse = base.getNoiseRiseLimitInUse();
        this._noiseRiseLimitLowerValue = base.getNoiseRiseLimitLowerValue();
        this._noiseRiseLimitUpperValue = base.getNoiseRiseLimitUpperValue();
        this._pchPower = base.getPchPower();
        this._pcpichPower = base.getPcpichPower();
        this._pcpichPowerInUse = base.getPcpichPowerInUse();
        this._pichPower = base.getPichPower();
        this._powerOffsetPilotDpdch = base.getPowerOffsetPilotDpdch();
        this._primaryScramblingCode = base.getPrimaryScramblingCode();
        this._primaryScramblingCodeInUse = base.getPrimaryScramblingCodeInUse();
        this._pschPower = base.getPschPower();
        this._sschPower = base.getSschPower();
        this._uarfcndl = base.getUarfcndl();
        this._uarfcndlInUse = base.getUarfcndlInUse();
        this._uarfcndlToProtect = base.getUarfcndlToProtect();
        this._uarfcnulInUse = base.getUarfcnulInUse();
        if (base instanceof UmtsRanRfImpl) {
            UmtsRanRfImpl impl = (UmtsRanRfImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG) {
            this._uarfcndl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getUarfcndl();
            this._uarfcndlInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getUarfcndlInUse();
            this._uarfcnulInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getUarfcnulInUse();
            this._uarfcndlToProtect = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getUarfcndlToProtect();
            this._primaryScramblingCode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getPrimaryScramblingCode();
            this._primaryScramblingCodeInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getPrimaryScramblingCodeInUse();
            this._maxfapTxPowerExpanded = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getMaxfapTxPowerExpanded();
            this._maxfapTxPowerInUseExpanded = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getMaxfapTxPowerInUseExpanded();
            this._maxUlTxPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getMaxUlTxPower();
            this._maxUlTxPowerInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getMaxUlTxPowerInUse();
            this._pcpichPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getPcpichPower();
            this._pcpichPowerInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getPcpichPowerInUse();
            this._powerOffsetPilotDpdch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getPowerOffsetPilotDpdch();
            this._fapCoverageTarget = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getFapCoverageTarget();
            this._fapQualityTargetEcIo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getFapQualityTargetEcIo();
            this._pschPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getPschPower();
            this._sschPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getSschPower();
            this._pichPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getPichPower();
            this._pchPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getPchPower();
            this._fachPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getFachPower();
            this._bchPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getBchPower();
            this._aichPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getAichPower();
            this._ctchAllocationPeriod = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getCtchAllocationPeriod();
            this._cbsFrameOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getCbsFrameOffset();
            this._maxTti = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getMaxTti();
            this._noiseRiseLimitLowerValue = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getNoiseRiseLimitLowerValue();
            this._noiseRiseLimitUpperValue = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getNoiseRiseLimitUpperValue();
            this._noiseRiseLimitInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG)arg).getNoiseRiseLimitInUse();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRfG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getAichPower() {
        return _aichPower;
    }
    
    public java.lang.Long getBchPower() {
        return _bchPower;
    }
    
    public java.lang.Short getCbsFrameOffset() {
        return _cbsFrameOffset;
    }
    
    public java.lang.Short getCtchAllocationPeriod() {
        return _ctchAllocationPeriod;
    }
    
    public java.lang.Long getFachPower() {
        return _fachPower;
    }
    
    public java.lang.Short getFapCoverageTarget() {
        return _fapCoverageTarget;
    }
    
    public java.lang.Long getFapQualityTargetEcIo() {
        return _fapQualityTargetEcIo;
    }
    
    public java.lang.Short getMaxTti() {
        return _maxTti;
    }
    
    public java.lang.String getMaxUlTxPower() {
        return _maxUlTxPower;
    }
    
    public java.lang.Long getMaxUlTxPowerInUse() {
        return _maxUlTxPowerInUse;
    }
    
    public java.lang.String getMaxfapTxPowerExpanded() {
        return _maxfapTxPowerExpanded;
    }
    
    public java.lang.Long getMaxfapTxPowerInUseExpanded() {
        return _maxfapTxPowerInUseExpanded;
    }
    
    public java.lang.Integer getNoiseRiseLimitInUse() {
        return _noiseRiseLimitInUse;
    }
    
    public java.lang.Integer getNoiseRiseLimitLowerValue() {
        return _noiseRiseLimitLowerValue;
    }
    
    public java.lang.Integer getNoiseRiseLimitUpperValue() {
        return _noiseRiseLimitUpperValue;
    }
    
    public java.lang.Long getPchPower() {
        return _pchPower;
    }
    
    public java.lang.String getPcpichPower() {
        return _pcpichPower;
    }
    
    public java.lang.Long getPcpichPowerInUse() {
        return _pcpichPowerInUse;
    }
    
    public java.lang.Long getPichPower() {
        return _pichPower;
    }
    
    public java.lang.Short getPowerOffsetPilotDpdch() {
        return _powerOffsetPilotDpdch;
    }
    
    public List<java.lang.String> getPrimaryScramblingCode() {
        return _primaryScramblingCode;
    }
    
    public BigInteger getPrimaryScramblingCodeInUse() {
        return _primaryScramblingCodeInUse;
    }
    
    public java.lang.Long getPschPower() {
        return _pschPower;
    }
    
    public java.lang.Long getSschPower() {
        return _sschPower;
    }
    
    public List<java.lang.String> getUarfcndl() {
        return _uarfcndl;
    }
    
    public BigInteger getUarfcndlInUse() {
        return _uarfcndlInUse;
    }
    
    public List<java.lang.String> getUarfcndlToProtect() {
        return _uarfcndlToProtect;
    }
    
    public BigInteger getUarfcnulInUse() {
        return _uarfcnulInUse;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UmtsRanRfBuilder setAichPower(final java.lang.Long value) {
        this._aichPower = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setBchPower(final java.lang.Long value) {
        this._bchPower = value;
        return this;
    }
    
     
     private static void checkCbsFrameOffsetRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public UmtsRanRfBuilder setCbsFrameOffset(final java.lang.Short value) {
    if (value != null) {
        checkCbsFrameOffsetRange(value);
    }
        this._cbsFrameOffset = value;
        return this;
    }
    
     
     private static void checkCtchAllocationPeriodRange(final short value) {
         if (value >= (short)1 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..255]].", value));
     }
    
    public UmtsRanRfBuilder setCtchAllocationPeriod(final java.lang.Short value) {
    if (value != null) {
        checkCtchAllocationPeriodRange(value);
    }
        this._ctchAllocationPeriod = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setFachPower(final java.lang.Long value) {
        this._fachPower = value;
        return this;
    }
    
     
     private static void checkFapCoverageTargetRange(final short value) {
         if (value >= (short)50 && value <= (short)150) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[50..150]].", value));
     }
    
    public UmtsRanRfBuilder setFapCoverageTarget(final java.lang.Short value) {
    if (value != null) {
        checkFapCoverageTargetRange(value);
    }
        this._fapCoverageTarget = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setFapQualityTargetEcIo(final java.lang.Long value) {
        this._fapQualityTargetEcIo = value;
        return this;
    }
    
     
     private static void checkMaxTtiRange(final short value) {
         if (value >= (short)1 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..255]].", value));
     }
    
    public UmtsRanRfBuilder setMaxTti(final java.lang.Short value) {
    if (value != null) {
        checkMaxTtiRange(value);
    }
        this._maxTti = value;
        return this;
    }
    
     
     private static void check_maxUlTxPowerLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public UmtsRanRfBuilder setMaxUlTxPower(final java.lang.String value) {
    if (value != null) {
        check_maxUlTxPowerLength(value);
    }
        this._maxUlTxPower = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setMaxUlTxPowerInUse(final java.lang.Long value) {
        this._maxUlTxPowerInUse = value;
        return this;
    }
    
     
     private static void check_maxfapTxPowerExpandedLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public UmtsRanRfBuilder setMaxfapTxPowerExpanded(final java.lang.String value) {
    if (value != null) {
        check_maxfapTxPowerExpandedLength(value);
    }
        this._maxfapTxPowerExpanded = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setMaxfapTxPowerInUseExpanded(final java.lang.Long value) {
        this._maxfapTxPowerInUseExpanded = value;
        return this;
    }
    
     
     private static void checkNoiseRiseLimitInUseRange(final int value) {
         if (value >= 0 && value <= 500) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..500]].", value));
     }
    
    public UmtsRanRfBuilder setNoiseRiseLimitInUse(final java.lang.Integer value) {
    if (value != null) {
        checkNoiseRiseLimitInUseRange(value);
    }
        this._noiseRiseLimitInUse = value;
        return this;
    }
    
     
     private static void checkNoiseRiseLimitLowerValueRange(final int value) {
         if (value >= 0 && value <= 500) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..500]].", value));
     }
    
    public UmtsRanRfBuilder setNoiseRiseLimitLowerValue(final java.lang.Integer value) {
    if (value != null) {
        checkNoiseRiseLimitLowerValueRange(value);
    }
        this._noiseRiseLimitLowerValue = value;
        return this;
    }
    
     
     private static void checkNoiseRiseLimitUpperValueRange(final int value) {
         if (value >= 0 && value <= 500) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..500]].", value));
     }
    
    public UmtsRanRfBuilder setNoiseRiseLimitUpperValue(final java.lang.Integer value) {
    if (value != null) {
        checkNoiseRiseLimitUpperValueRange(value);
    }
        this._noiseRiseLimitUpperValue = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setPchPower(final java.lang.Long value) {
        this._pchPower = value;
        return this;
    }
    
     
     private static void check_pcpichPowerLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public UmtsRanRfBuilder setPcpichPower(final java.lang.String value) {
    if (value != null) {
        check_pcpichPowerLength(value);
    }
        this._pcpichPower = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setPcpichPowerInUse(final java.lang.Long value) {
        this._pcpichPowerInUse = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setPichPower(final java.lang.Long value) {
        this._pichPower = value;
        return this;
    }
    
     
     private static void checkPowerOffsetPilotDpdchRange(final short value) {
         if (value >= (short)0 && value <= (short)24) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..24]].", value));
     }
    
    public UmtsRanRfBuilder setPowerOffsetPilotDpdch(final java.lang.Short value) {
    if (value != null) {
        checkPowerOffsetPilotDpdchRange(value);
    }
        this._powerOffsetPilotDpdch = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setPrimaryScramblingCode(final List<java.lang.String> value) {
        this._primaryScramblingCode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKPRIMARYSCRAMBLINGCODEINUSERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKPRIMARYSCRAMBLINGCODEINUSERANGE_RANGES = a;
     }
     private static void checkPrimaryScramblingCodeInUseRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKPRIMARYSCRAMBLINGCODEINUSERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKPRIMARYSCRAMBLINGCODEINUSERANGE_RANGES)));
     }
    
    public UmtsRanRfBuilder setPrimaryScramblingCodeInUse(final BigInteger value) {
    if (value != null) {
        checkPrimaryScramblingCodeInUseRange(value);
    }
        this._primaryScramblingCodeInUse = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setPschPower(final java.lang.Long value) {
        this._pschPower = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setSschPower(final java.lang.Long value) {
        this._sschPower = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setUarfcndl(final List<java.lang.String> value) {
        this._uarfcndl = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKUARFCNDLINUSERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKUARFCNDLINUSERANGE_RANGES = a;
     }
     private static void checkUarfcndlInUseRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKUARFCNDLINUSERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKUARFCNDLINUSERANGE_RANGES)));
     }
    
    public UmtsRanRfBuilder setUarfcndlInUse(final BigInteger value) {
    if (value != null) {
        checkUarfcndlInUseRange(value);
    }
        this._uarfcndlInUse = value;
        return this;
    }
    
     
    public UmtsRanRfBuilder setUarfcndlToProtect(final List<java.lang.String> value) {
        this._uarfcndlToProtect = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKUARFCNULINUSERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKUARFCNULINUSERANGE_RANGES = a;
     }
     private static void checkUarfcnulInUseRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKUARFCNULINUSERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKUARFCNULINUSERANGE_RANGES)));
     }
    
    public UmtsRanRfBuilder setUarfcnulInUse(final BigInteger value) {
    if (value != null) {
        checkUarfcnulInUseRange(value);
    }
        this._uarfcnulInUse = value;
        return this;
    }
    
    public UmtsRanRfBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanRfBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanRf build() {
        return new UmtsRanRfImpl(this);
    }

    private static final class UmtsRanRfImpl implements UmtsRanRf {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf.class;
        }

        private final java.lang.Long _aichPower;
        private final java.lang.Long _bchPower;
        private final java.lang.Short _cbsFrameOffset;
        private final java.lang.Short _ctchAllocationPeriod;
        private final java.lang.Long _fachPower;
        private final java.lang.Short _fapCoverageTarget;
        private final java.lang.Long _fapQualityTargetEcIo;
        private final java.lang.Short _maxTti;
        private final java.lang.String _maxUlTxPower;
        private final java.lang.Long _maxUlTxPowerInUse;
        private final java.lang.String _maxfapTxPowerExpanded;
        private final java.lang.Long _maxfapTxPowerInUseExpanded;
        private final java.lang.Integer _noiseRiseLimitInUse;
        private final java.lang.Integer _noiseRiseLimitLowerValue;
        private final java.lang.Integer _noiseRiseLimitUpperValue;
        private final java.lang.Long _pchPower;
        private final java.lang.String _pcpichPower;
        private final java.lang.Long _pcpichPowerInUse;
        private final java.lang.Long _pichPower;
        private final java.lang.Short _powerOffsetPilotDpdch;
        private final List<java.lang.String> _primaryScramblingCode;
        private final BigInteger _primaryScramblingCodeInUse;
        private final java.lang.Long _pschPower;
        private final java.lang.Long _sschPower;
        private final List<java.lang.String> _uarfcndl;
        private final BigInteger _uarfcndlInUse;
        private final List<java.lang.String> _uarfcndlToProtect;
        private final BigInteger _uarfcnulInUse;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>> augmentation = Collections.emptyMap();

        private UmtsRanRfImpl(UmtsRanRfBuilder base) {
            this._aichPower = base.getAichPower();
            this._bchPower = base.getBchPower();
            this._cbsFrameOffset = base.getCbsFrameOffset();
            this._ctchAllocationPeriod = base.getCtchAllocationPeriod();
            this._fachPower = base.getFachPower();
            this._fapCoverageTarget = base.getFapCoverageTarget();
            this._fapQualityTargetEcIo = base.getFapQualityTargetEcIo();
            this._maxTti = base.getMaxTti();
            this._maxUlTxPower = base.getMaxUlTxPower();
            this._maxUlTxPowerInUse = base.getMaxUlTxPowerInUse();
            this._maxfapTxPowerExpanded = base.getMaxfapTxPowerExpanded();
            this._maxfapTxPowerInUseExpanded = base.getMaxfapTxPowerInUseExpanded();
            this._noiseRiseLimitInUse = base.getNoiseRiseLimitInUse();
            this._noiseRiseLimitLowerValue = base.getNoiseRiseLimitLowerValue();
            this._noiseRiseLimitUpperValue = base.getNoiseRiseLimitUpperValue();
            this._pchPower = base.getPchPower();
            this._pcpichPower = base.getPcpichPower();
            this._pcpichPowerInUse = base.getPcpichPowerInUse();
            this._pichPower = base.getPichPower();
            this._powerOffsetPilotDpdch = base.getPowerOffsetPilotDpdch();
            this._primaryScramblingCode = base.getPrimaryScramblingCode();
            this._primaryScramblingCodeInUse = base.getPrimaryScramblingCodeInUse();
            this._pschPower = base.getPschPower();
            this._sschPower = base.getSschPower();
            this._uarfcndl = base.getUarfcndl();
            this._uarfcndlInUse = base.getUarfcndlInUse();
            this._uarfcndlToProtect = base.getUarfcndlToProtect();
            this._uarfcnulInUse = base.getUarfcnulInUse();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getAichPower() {
            return _aichPower;
        }
        
        @Override
        public java.lang.Long getBchPower() {
            return _bchPower;
        }
        
        @Override
        public java.lang.Short getCbsFrameOffset() {
            return _cbsFrameOffset;
        }
        
        @Override
        public java.lang.Short getCtchAllocationPeriod() {
            return _ctchAllocationPeriod;
        }
        
        @Override
        public java.lang.Long getFachPower() {
            return _fachPower;
        }
        
        @Override
        public java.lang.Short getFapCoverageTarget() {
            return _fapCoverageTarget;
        }
        
        @Override
        public java.lang.Long getFapQualityTargetEcIo() {
            return _fapQualityTargetEcIo;
        }
        
        @Override
        public java.lang.Short getMaxTti() {
            return _maxTti;
        }
        
        @Override
        public java.lang.String getMaxUlTxPower() {
            return _maxUlTxPower;
        }
        
        @Override
        public java.lang.Long getMaxUlTxPowerInUse() {
            return _maxUlTxPowerInUse;
        }
        
        @Override
        public java.lang.String getMaxfapTxPowerExpanded() {
            return _maxfapTxPowerExpanded;
        }
        
        @Override
        public java.lang.Long getMaxfapTxPowerInUseExpanded() {
            return _maxfapTxPowerInUseExpanded;
        }
        
        @Override
        public java.lang.Integer getNoiseRiseLimitInUse() {
            return _noiseRiseLimitInUse;
        }
        
        @Override
        public java.lang.Integer getNoiseRiseLimitLowerValue() {
            return _noiseRiseLimitLowerValue;
        }
        
        @Override
        public java.lang.Integer getNoiseRiseLimitUpperValue() {
            return _noiseRiseLimitUpperValue;
        }
        
        @Override
        public java.lang.Long getPchPower() {
            return _pchPower;
        }
        
        @Override
        public java.lang.String getPcpichPower() {
            return _pcpichPower;
        }
        
        @Override
        public java.lang.Long getPcpichPowerInUse() {
            return _pcpichPowerInUse;
        }
        
        @Override
        public java.lang.Long getPichPower() {
            return _pichPower;
        }
        
        @Override
        public java.lang.Short getPowerOffsetPilotDpdch() {
            return _powerOffsetPilotDpdch;
        }
        
        @Override
        public List<java.lang.String> getPrimaryScramblingCode() {
            return _primaryScramblingCode;
        }
        
        @Override
        public BigInteger getPrimaryScramblingCodeInUse() {
            return _primaryScramblingCodeInUse;
        }
        
        @Override
        public java.lang.Long getPschPower() {
            return _pschPower;
        }
        
        @Override
        public java.lang.Long getSschPower() {
            return _sschPower;
        }
        
        @Override
        public List<java.lang.String> getUarfcndl() {
            return _uarfcndl;
        }
        
        @Override
        public BigInteger getUarfcndlInUse() {
            return _uarfcndlInUse;
        }
        
        @Override
        public List<java.lang.String> getUarfcndlToProtect() {
            return _uarfcndlToProtect;
        }
        
        @Override
        public BigInteger getUarfcnulInUse() {
            return _uarfcnulInUse;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_aichPower);
            result = prime * result + Objects.hashCode(_bchPower);
            result = prime * result + Objects.hashCode(_cbsFrameOffset);
            result = prime * result + Objects.hashCode(_ctchAllocationPeriod);
            result = prime * result + Objects.hashCode(_fachPower);
            result = prime * result + Objects.hashCode(_fapCoverageTarget);
            result = prime * result + Objects.hashCode(_fapQualityTargetEcIo);
            result = prime * result + Objects.hashCode(_maxTti);
            result = prime * result + Objects.hashCode(_maxUlTxPower);
            result = prime * result + Objects.hashCode(_maxUlTxPowerInUse);
            result = prime * result + Objects.hashCode(_maxfapTxPowerExpanded);
            result = prime * result + Objects.hashCode(_maxfapTxPowerInUseExpanded);
            result = prime * result + Objects.hashCode(_noiseRiseLimitInUse);
            result = prime * result + Objects.hashCode(_noiseRiseLimitLowerValue);
            result = prime * result + Objects.hashCode(_noiseRiseLimitUpperValue);
            result = prime * result + Objects.hashCode(_pchPower);
            result = prime * result + Objects.hashCode(_pcpichPower);
            result = prime * result + Objects.hashCode(_pcpichPowerInUse);
            result = prime * result + Objects.hashCode(_pichPower);
            result = prime * result + Objects.hashCode(_powerOffsetPilotDpdch);
            result = prime * result + Objects.hashCode(_primaryScramblingCode);
            result = prime * result + Objects.hashCode(_primaryScramblingCodeInUse);
            result = prime * result + Objects.hashCode(_pschPower);
            result = prime * result + Objects.hashCode(_sschPower);
            result = prime * result + Objects.hashCode(_uarfcndl);
            result = prime * result + Objects.hashCode(_uarfcndlInUse);
            result = prime * result + Objects.hashCode(_uarfcndlToProtect);
            result = prime * result + Objects.hashCode(_uarfcnulInUse);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf)obj;
            if (!Objects.equals(_aichPower, other.getAichPower())) {
                return false;
            }
            if (!Objects.equals(_bchPower, other.getBchPower())) {
                return false;
            }
            if (!Objects.equals(_cbsFrameOffset, other.getCbsFrameOffset())) {
                return false;
            }
            if (!Objects.equals(_ctchAllocationPeriod, other.getCtchAllocationPeriod())) {
                return false;
            }
            if (!Objects.equals(_fachPower, other.getFachPower())) {
                return false;
            }
            if (!Objects.equals(_fapCoverageTarget, other.getFapCoverageTarget())) {
                return false;
            }
            if (!Objects.equals(_fapQualityTargetEcIo, other.getFapQualityTargetEcIo())) {
                return false;
            }
            if (!Objects.equals(_maxTti, other.getMaxTti())) {
                return false;
            }
            if (!Objects.equals(_maxUlTxPower, other.getMaxUlTxPower())) {
                return false;
            }
            if (!Objects.equals(_maxUlTxPowerInUse, other.getMaxUlTxPowerInUse())) {
                return false;
            }
            if (!Objects.equals(_maxfapTxPowerExpanded, other.getMaxfapTxPowerExpanded())) {
                return false;
            }
            if (!Objects.equals(_maxfapTxPowerInUseExpanded, other.getMaxfapTxPowerInUseExpanded())) {
                return false;
            }
            if (!Objects.equals(_noiseRiseLimitInUse, other.getNoiseRiseLimitInUse())) {
                return false;
            }
            if (!Objects.equals(_noiseRiseLimitLowerValue, other.getNoiseRiseLimitLowerValue())) {
                return false;
            }
            if (!Objects.equals(_noiseRiseLimitUpperValue, other.getNoiseRiseLimitUpperValue())) {
                return false;
            }
            if (!Objects.equals(_pchPower, other.getPchPower())) {
                return false;
            }
            if (!Objects.equals(_pcpichPower, other.getPcpichPower())) {
                return false;
            }
            if (!Objects.equals(_pcpichPowerInUse, other.getPcpichPowerInUse())) {
                return false;
            }
            if (!Objects.equals(_pichPower, other.getPichPower())) {
                return false;
            }
            if (!Objects.equals(_powerOffsetPilotDpdch, other.getPowerOffsetPilotDpdch())) {
                return false;
            }
            if (!Objects.equals(_primaryScramblingCode, other.getPrimaryScramblingCode())) {
                return false;
            }
            if (!Objects.equals(_primaryScramblingCodeInUse, other.getPrimaryScramblingCodeInUse())) {
                return false;
            }
            if (!Objects.equals(_pschPower, other.getPschPower())) {
                return false;
            }
            if (!Objects.equals(_sschPower, other.getSschPower())) {
                return false;
            }
            if (!Objects.equals(_uarfcndl, other.getUarfcndl())) {
                return false;
            }
            if (!Objects.equals(_uarfcndlInUse, other.getUarfcndlInUse())) {
                return false;
            }
            if (!Objects.equals(_uarfcndlToProtect, other.getUarfcndlToProtect())) {
                return false;
            }
            if (!Objects.equals(_uarfcnulInUse, other.getUarfcnulInUse())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanRfImpl otherImpl = (UmtsRanRfImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanRf [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_aichPower != null) {
                builder.append("_aichPower=");
                builder.append(_aichPower);
                builder.append(", ");
            }
            if (_bchPower != null) {
                builder.append("_bchPower=");
                builder.append(_bchPower);
                builder.append(", ");
            }
            if (_cbsFrameOffset != null) {
                builder.append("_cbsFrameOffset=");
                builder.append(_cbsFrameOffset);
                builder.append(", ");
            }
            if (_ctchAllocationPeriod != null) {
                builder.append("_ctchAllocationPeriod=");
                builder.append(_ctchAllocationPeriod);
                builder.append(", ");
            }
            if (_fachPower != null) {
                builder.append("_fachPower=");
                builder.append(_fachPower);
                builder.append(", ");
            }
            if (_fapCoverageTarget != null) {
                builder.append("_fapCoverageTarget=");
                builder.append(_fapCoverageTarget);
                builder.append(", ");
            }
            if (_fapQualityTargetEcIo != null) {
                builder.append("_fapQualityTargetEcIo=");
                builder.append(_fapQualityTargetEcIo);
                builder.append(", ");
            }
            if (_maxTti != null) {
                builder.append("_maxTti=");
                builder.append(_maxTti);
                builder.append(", ");
            }
            if (_maxUlTxPower != null) {
                builder.append("_maxUlTxPower=");
                builder.append(_maxUlTxPower);
                builder.append(", ");
            }
            if (_maxUlTxPowerInUse != null) {
                builder.append("_maxUlTxPowerInUse=");
                builder.append(_maxUlTxPowerInUse);
                builder.append(", ");
            }
            if (_maxfapTxPowerExpanded != null) {
                builder.append("_maxfapTxPowerExpanded=");
                builder.append(_maxfapTxPowerExpanded);
                builder.append(", ");
            }
            if (_maxfapTxPowerInUseExpanded != null) {
                builder.append("_maxfapTxPowerInUseExpanded=");
                builder.append(_maxfapTxPowerInUseExpanded);
                builder.append(", ");
            }
            if (_noiseRiseLimitInUse != null) {
                builder.append("_noiseRiseLimitInUse=");
                builder.append(_noiseRiseLimitInUse);
                builder.append(", ");
            }
            if (_noiseRiseLimitLowerValue != null) {
                builder.append("_noiseRiseLimitLowerValue=");
                builder.append(_noiseRiseLimitLowerValue);
                builder.append(", ");
            }
            if (_noiseRiseLimitUpperValue != null) {
                builder.append("_noiseRiseLimitUpperValue=");
                builder.append(_noiseRiseLimitUpperValue);
                builder.append(", ");
            }
            if (_pchPower != null) {
                builder.append("_pchPower=");
                builder.append(_pchPower);
                builder.append(", ");
            }
            if (_pcpichPower != null) {
                builder.append("_pcpichPower=");
                builder.append(_pcpichPower);
                builder.append(", ");
            }
            if (_pcpichPowerInUse != null) {
                builder.append("_pcpichPowerInUse=");
                builder.append(_pcpichPowerInUse);
                builder.append(", ");
            }
            if (_pichPower != null) {
                builder.append("_pichPower=");
                builder.append(_pichPower);
                builder.append(", ");
            }
            if (_powerOffsetPilotDpdch != null) {
                builder.append("_powerOffsetPilotDpdch=");
                builder.append(_powerOffsetPilotDpdch);
                builder.append(", ");
            }
            if (_primaryScramblingCode != null) {
                builder.append("_primaryScramblingCode=");
                builder.append(_primaryScramblingCode);
                builder.append(", ");
            }
            if (_primaryScramblingCodeInUse != null) {
                builder.append("_primaryScramblingCodeInUse=");
                builder.append(_primaryScramblingCodeInUse);
                builder.append(", ");
            }
            if (_pschPower != null) {
                builder.append("_pschPower=");
                builder.append(_pschPower);
                builder.append(", ");
            }
            if (_sschPower != null) {
                builder.append("_sschPower=");
                builder.append(_sschPower);
                builder.append(", ");
            }
            if (_uarfcndl != null) {
                builder.append("_uarfcndl=");
                builder.append(_uarfcndl);
                builder.append(", ");
            }
            if (_uarfcndlInUse != null) {
                builder.append("_uarfcndlInUse=");
                builder.append(_uarfcndlInUse);
                builder.append(", ");
            }
            if (_uarfcndlToProtect != null) {
                builder.append("_uarfcndlToProtect=");
                builder.append(_uarfcndlToProtect);
                builder.append(", ");
            }
            if (_uarfcnulInUse != null) {
                builder.append("_uarfcnulInUse=");
                builder.append(_uarfcnulInUse);
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
