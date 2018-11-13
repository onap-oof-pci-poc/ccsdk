package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf
 *
 */
public class Cdma2000HrpdRanRfBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf> {

    private java.lang.String _aPersistence;
    private java.lang.Long _colorCode;
    private java.lang.Short _connectionRateLimit;
    private java.lang.Long _controlChannelRate;
    private java.lang.Short _hrpdCarBandClass;
    private java.lang.Long _hrpdSecElReverseLinkSilenceDuration;
    private java.lang.Long _hrpdSecElReverseLinkSilencePeriod;
    private java.lang.Integer _loadRabThreshold;
    private java.lang.String _maxfapTxPower;
    private java.lang.Long _maxfapTxPowerInUse;
    private java.lang.Long _openLoopAdjust;
    private List<java.lang.String> _pilotPn;
    private BigInteger _pilotPnInUse;
    private java.lang.Long _probeInitialAdjust;
    private java.lang.Long _probeNumSteps;
    private java.lang.Long _probePowerStep;
    private java.lang.Long _rabLength;
    private java.lang.Long _rabOffset;
    private List<java.lang.String> _rfcnfl;
    private BigInteger _rfcnflInUse;
    private java.lang.Short _rfeRlBalanceRatio;
    private java.lang.Long _rssirabThreshold;
    private byte[] _sectorId;
    private java.lang.Long _subnetMaskLength;
    private java.lang.Long _syncCapsuleOffset;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdRanRfBuilder() {
    }
    public Cdma2000HrpdRanRfBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG arg) {
        this._hrpdCarBandClass = arg.getHrpdCarBandClass();
        this._rfcnfl = arg.getRfcnfl();
        this._rfcnflInUse = arg.getRfcnflInUse();
        this._pilotPn = arg.getPilotPn();
        this._pilotPnInUse = arg.getPilotPnInUse();
        this._maxfapTxPower = arg.getMaxfapTxPower();
        this._maxfapTxPowerInUse = arg.getMaxfapTxPowerInUse();
        this._controlChannelRate = arg.getControlChannelRate();
        this._syncCapsuleOffset = arg.getSyncCapsuleOffset();
        this._rabLength = arg.getRabLength();
        this._rabOffset = arg.getRabOffset();
        this._sectorId = arg.getSectorId();
        this._colorCode = arg.getColorCode();
        this._subnetMaskLength = arg.getSubnetMaskLength();
        this._hrpdSecElReverseLinkSilenceDuration = arg.getHrpdSecElReverseLinkSilenceDuration();
        this._hrpdSecElReverseLinkSilencePeriod = arg.getHrpdSecElReverseLinkSilencePeriod();
        this._openLoopAdjust = arg.getOpenLoopAdjust();
        this._probeInitialAdjust = arg.getProbeInitialAdjust();
        this._probeNumSteps = arg.getProbeNumSteps();
        this._probePowerStep = arg.getProbePowerStep();
        this._aPersistence = arg.getAPersistence();
        this._rssirabThreshold = arg.getRssirabThreshold();
        this._loadRabThreshold = arg.getLoadRabThreshold();
        this._connectionRateLimit = arg.getConnectionRateLimit();
        this._rfeRlBalanceRatio = arg.getRfeRlBalanceRatio();
    }

    public Cdma2000HrpdRanRfBuilder(Cdma2000HrpdRanRf base) {
        this._aPersistence = base.getAPersistence();
        this._colorCode = base.getColorCode();
        this._connectionRateLimit = base.getConnectionRateLimit();
        this._controlChannelRate = base.getControlChannelRate();
        this._hrpdCarBandClass = base.getHrpdCarBandClass();
        this._hrpdSecElReverseLinkSilenceDuration = base.getHrpdSecElReverseLinkSilenceDuration();
        this._hrpdSecElReverseLinkSilencePeriod = base.getHrpdSecElReverseLinkSilencePeriod();
        this._loadRabThreshold = base.getLoadRabThreshold();
        this._maxfapTxPower = base.getMaxfapTxPower();
        this._maxfapTxPowerInUse = base.getMaxfapTxPowerInUse();
        this._openLoopAdjust = base.getOpenLoopAdjust();
        this._pilotPn = base.getPilotPn();
        this._pilotPnInUse = base.getPilotPnInUse();
        this._probeInitialAdjust = base.getProbeInitialAdjust();
        this._probeNumSteps = base.getProbeNumSteps();
        this._probePowerStep = base.getProbePowerStep();
        this._rabLength = base.getRabLength();
        this._rabOffset = base.getRabOffset();
        this._rfcnfl = base.getRfcnfl();
        this._rfcnflInUse = base.getRfcnflInUse();
        this._rfeRlBalanceRatio = base.getRfeRlBalanceRatio();
        this._rssirabThreshold = base.getRssirabThreshold();
        this._sectorId = base.getSectorId();
        this._subnetMaskLength = base.getSubnetMaskLength();
        this._syncCapsuleOffset = base.getSyncCapsuleOffset();
        if (base instanceof Cdma2000HrpdRanRfImpl) {
            Cdma2000HrpdRanRfImpl impl = (Cdma2000HrpdRanRfImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG) {
            this._hrpdCarBandClass = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getHrpdCarBandClass();
            this._rfcnfl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getRfcnfl();
            this._rfcnflInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getRfcnflInUse();
            this._pilotPn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getPilotPn();
            this._pilotPnInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getPilotPnInUse();
            this._maxfapTxPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getMaxfapTxPower();
            this._maxfapTxPowerInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getMaxfapTxPowerInUse();
            this._controlChannelRate = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getControlChannelRate();
            this._syncCapsuleOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getSyncCapsuleOffset();
            this._rabLength = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getRabLength();
            this._rabOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getRabOffset();
            this._sectorId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getSectorId();
            this._colorCode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getColorCode();
            this._subnetMaskLength = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getSubnetMaskLength();
            this._hrpdSecElReverseLinkSilenceDuration = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getHrpdSecElReverseLinkSilenceDuration();
            this._hrpdSecElReverseLinkSilencePeriod = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getHrpdSecElReverseLinkSilencePeriod();
            this._openLoopAdjust = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getOpenLoopAdjust();
            this._probeInitialAdjust = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getProbeInitialAdjust();
            this._probeNumSteps = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getProbeNumSteps();
            this._probePowerStep = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getProbePowerStep();
            this._aPersistence = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getAPersistence();
            this._rssirabThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getRssirabThreshold();
            this._loadRabThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getLoadRabThreshold();
            this._connectionRateLimit = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getConnectionRateLimit();
            this._rfeRlBalanceRatio = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG)arg).getRfeRlBalanceRatio();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRanRfG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAPersistence() {
        return _aPersistence;
    }
    
    public java.lang.Long getColorCode() {
        return _colorCode;
    }
    
    public java.lang.Short getConnectionRateLimit() {
        return _connectionRateLimit;
    }
    
    public java.lang.Long getControlChannelRate() {
        return _controlChannelRate;
    }
    
    public java.lang.Short getHrpdCarBandClass() {
        return _hrpdCarBandClass;
    }
    
    public java.lang.Long getHrpdSecElReverseLinkSilenceDuration() {
        return _hrpdSecElReverseLinkSilenceDuration;
    }
    
    public java.lang.Long getHrpdSecElReverseLinkSilencePeriod() {
        return _hrpdSecElReverseLinkSilencePeriod;
    }
    
    public java.lang.Integer getLoadRabThreshold() {
        return _loadRabThreshold;
    }
    
    public java.lang.String getMaxfapTxPower() {
        return _maxfapTxPower;
    }
    
    public java.lang.Long getMaxfapTxPowerInUse() {
        return _maxfapTxPowerInUse;
    }
    
    public java.lang.Long getOpenLoopAdjust() {
        return _openLoopAdjust;
    }
    
    public List<java.lang.String> getPilotPn() {
        return _pilotPn;
    }
    
    public BigInteger getPilotPnInUse() {
        return _pilotPnInUse;
    }
    
    public java.lang.Long getProbeInitialAdjust() {
        return _probeInitialAdjust;
    }
    
    public java.lang.Long getProbeNumSteps() {
        return _probeNumSteps;
    }
    
    public java.lang.Long getProbePowerStep() {
        return _probePowerStep;
    }
    
    public java.lang.Long getRabLength() {
        return _rabLength;
    }
    
    public java.lang.Long getRabOffset() {
        return _rabOffset;
    }
    
    public List<java.lang.String> getRfcnfl() {
        return _rfcnfl;
    }
    
    public BigInteger getRfcnflInUse() {
        return _rfcnflInUse;
    }
    
    public java.lang.Short getRfeRlBalanceRatio() {
        return _rfeRlBalanceRatio;
    }
    
    public java.lang.Long getRssirabThreshold() {
        return _rssirabThreshold;
    }
    
    public byte[] getSectorId() {
        return _sectorId == null ? null : _sectorId.clone();
    }
    
    public java.lang.Long getSubnetMaskLength() {
        return _subnetMaskLength;
    }
    
    public java.lang.Long getSyncCapsuleOffset() {
        return _syncCapsuleOffset;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_aPersistenceLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..16]].", value));
     }
    
    public Cdma2000HrpdRanRfBuilder setAPersistence(final java.lang.String value) {
    if (value != null) {
        check_aPersistenceLength(value);
    }
        this._aPersistence = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setColorCode(final java.lang.Long value) {
        this._colorCode = value;
        return this;
    }
    
     
     private static void checkConnectionRateLimitRange(final short value) {
         if (value >= (short)0 && value <= (short)3) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..3]].", value));
     }
    
    public Cdma2000HrpdRanRfBuilder setConnectionRateLimit(final java.lang.Short value) {
    if (value != null) {
        checkConnectionRateLimitRange(value);
    }
        this._connectionRateLimit = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setControlChannelRate(final java.lang.Long value) {
        this._controlChannelRate = value;
        return this;
    }
    
     
     private static void checkHrpdCarBandClassRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public Cdma2000HrpdRanRfBuilder setHrpdCarBandClass(final java.lang.Short value) {
    if (value != null) {
        checkHrpdCarBandClassRange(value);
    }
        this._hrpdCarBandClass = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setHrpdSecElReverseLinkSilenceDuration(final java.lang.Long value) {
        this._hrpdSecElReverseLinkSilenceDuration = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setHrpdSecElReverseLinkSilencePeriod(final java.lang.Long value) {
        this._hrpdSecElReverseLinkSilencePeriod = value;
        return this;
    }
    
     
     private static void checkLoadRabThresholdRange(final int value) {
         if (value >= 0 && value <= 480) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..480]].", value));
     }
    
    public Cdma2000HrpdRanRfBuilder setLoadRabThreshold(final java.lang.Integer value) {
    if (value != null) {
        checkLoadRabThresholdRange(value);
    }
        this._loadRabThreshold = value;
        return this;
    }
    
     
     private static void check_maxfapTxPowerLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public Cdma2000HrpdRanRfBuilder setMaxfapTxPower(final java.lang.String value) {
    if (value != null) {
        check_maxfapTxPowerLength(value);
    }
        this._maxfapTxPower = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setMaxfapTxPowerInUse(final java.lang.Long value) {
        this._maxfapTxPowerInUse = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setOpenLoopAdjust(final java.lang.Long value) {
        this._openLoopAdjust = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setPilotPn(final List<java.lang.String> value) {
        this._pilotPn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKPILOTPNINUSERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKPILOTPNINUSERANGE_RANGES = a;
     }
     private static void checkPilotPnInUseRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKPILOTPNINUSERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKPILOTPNINUSERANGE_RANGES)));
     }
    
    public Cdma2000HrpdRanRfBuilder setPilotPnInUse(final BigInteger value) {
    if (value != null) {
        checkPilotPnInUseRange(value);
    }
        this._pilotPnInUse = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setProbeInitialAdjust(final java.lang.Long value) {
        this._probeInitialAdjust = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setProbeNumSteps(final java.lang.Long value) {
        this._probeNumSteps = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setProbePowerStep(final java.lang.Long value) {
        this._probePowerStep = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setRabLength(final java.lang.Long value) {
        this._rabLength = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setRabOffset(final java.lang.Long value) {
        this._rabOffset = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setRfcnfl(final List<java.lang.String> value) {
        this._rfcnfl = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRFCNFLINUSERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRFCNFLINUSERANGE_RANGES = a;
     }
     private static void checkRfcnflInUseRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRFCNFLINUSERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRFCNFLINUSERANGE_RANGES)));
     }
    
    public Cdma2000HrpdRanRfBuilder setRfcnflInUse(final BigInteger value) {
    if (value != null) {
        checkRfcnflInUseRange(value);
    }
        this._rfcnflInUse = value;
        return this;
    }
    
     
     private static void checkRfeRlBalanceRatioRange(final short value) {
         if (value >= (short)1 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..20]].", value));
     }
    
    public Cdma2000HrpdRanRfBuilder setRfeRlBalanceRatio(final java.lang.Short value) {
    if (value != null) {
        checkRfeRlBalanceRatioRange(value);
    }
        this._rfeRlBalanceRatio = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setRssirabThreshold(final java.lang.Long value) {
        this._rssirabThreshold = value;
        return this;
    }
    
     
     private static void check_sectorIdLength(final byte[] value) {
         final int length = value.length;
         if (length >= 16 && length <= 16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[16..16]].", java.util.Arrays.toString(value)));
     }
    
    public Cdma2000HrpdRanRfBuilder setSectorId(final byte[] value) {
    if (value != null) {
        check_sectorIdLength(value);
    }
        this._sectorId = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setSubnetMaskLength(final java.lang.Long value) {
        this._subnetMaskLength = value;
        return this;
    }
    
     
    public Cdma2000HrpdRanRfBuilder setSyncCapsuleOffset(final java.lang.Long value) {
        this._syncCapsuleOffset = value;
        return this;
    }
    
    public Cdma2000HrpdRanRfBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdRanRfBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdRanRf build() {
        return new Cdma2000HrpdRanRfImpl(this);
    }

    private static final class Cdma2000HrpdRanRfImpl implements Cdma2000HrpdRanRf {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf.class;
        }

        private final java.lang.String _aPersistence;
        private final java.lang.Long _colorCode;
        private final java.lang.Short _connectionRateLimit;
        private final java.lang.Long _controlChannelRate;
        private final java.lang.Short _hrpdCarBandClass;
        private final java.lang.Long _hrpdSecElReverseLinkSilenceDuration;
        private final java.lang.Long _hrpdSecElReverseLinkSilencePeriod;
        private final java.lang.Integer _loadRabThreshold;
        private final java.lang.String _maxfapTxPower;
        private final java.lang.Long _maxfapTxPowerInUse;
        private final java.lang.Long _openLoopAdjust;
        private final List<java.lang.String> _pilotPn;
        private final BigInteger _pilotPnInUse;
        private final java.lang.Long _probeInitialAdjust;
        private final java.lang.Long _probeNumSteps;
        private final java.lang.Long _probePowerStep;
        private final java.lang.Long _rabLength;
        private final java.lang.Long _rabOffset;
        private final List<java.lang.String> _rfcnfl;
        private final BigInteger _rfcnflInUse;
        private final java.lang.Short _rfeRlBalanceRatio;
        private final java.lang.Long _rssirabThreshold;
        private final byte[] _sectorId;
        private final java.lang.Long _subnetMaskLength;
        private final java.lang.Long _syncCapsuleOffset;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdRanRfImpl(Cdma2000HrpdRanRfBuilder base) {
            this._aPersistence = base.getAPersistence();
            this._colorCode = base.getColorCode();
            this._connectionRateLimit = base.getConnectionRateLimit();
            this._controlChannelRate = base.getControlChannelRate();
            this._hrpdCarBandClass = base.getHrpdCarBandClass();
            this._hrpdSecElReverseLinkSilenceDuration = base.getHrpdSecElReverseLinkSilenceDuration();
            this._hrpdSecElReverseLinkSilencePeriod = base.getHrpdSecElReverseLinkSilencePeriod();
            this._loadRabThreshold = base.getLoadRabThreshold();
            this._maxfapTxPower = base.getMaxfapTxPower();
            this._maxfapTxPowerInUse = base.getMaxfapTxPowerInUse();
            this._openLoopAdjust = base.getOpenLoopAdjust();
            this._pilotPn = base.getPilotPn();
            this._pilotPnInUse = base.getPilotPnInUse();
            this._probeInitialAdjust = base.getProbeInitialAdjust();
            this._probeNumSteps = base.getProbeNumSteps();
            this._probePowerStep = base.getProbePowerStep();
            this._rabLength = base.getRabLength();
            this._rabOffset = base.getRabOffset();
            this._rfcnfl = base.getRfcnfl();
            this._rfcnflInUse = base.getRfcnflInUse();
            this._rfeRlBalanceRatio = base.getRfeRlBalanceRatio();
            this._rssirabThreshold = base.getRssirabThreshold();
            this._sectorId = base.getSectorId();
            this._subnetMaskLength = base.getSubnetMaskLength();
            this._syncCapsuleOffset = base.getSyncCapsuleOffset();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAPersistence() {
            return _aPersistence;
        }
        
        @Override
        public java.lang.Long getColorCode() {
            return _colorCode;
        }
        
        @Override
        public java.lang.Short getConnectionRateLimit() {
            return _connectionRateLimit;
        }
        
        @Override
        public java.lang.Long getControlChannelRate() {
            return _controlChannelRate;
        }
        
        @Override
        public java.lang.Short getHrpdCarBandClass() {
            return _hrpdCarBandClass;
        }
        
        @Override
        public java.lang.Long getHrpdSecElReverseLinkSilenceDuration() {
            return _hrpdSecElReverseLinkSilenceDuration;
        }
        
        @Override
        public java.lang.Long getHrpdSecElReverseLinkSilencePeriod() {
            return _hrpdSecElReverseLinkSilencePeriod;
        }
        
        @Override
        public java.lang.Integer getLoadRabThreshold() {
            return _loadRabThreshold;
        }
        
        @Override
        public java.lang.String getMaxfapTxPower() {
            return _maxfapTxPower;
        }
        
        @Override
        public java.lang.Long getMaxfapTxPowerInUse() {
            return _maxfapTxPowerInUse;
        }
        
        @Override
        public java.lang.Long getOpenLoopAdjust() {
            return _openLoopAdjust;
        }
        
        @Override
        public List<java.lang.String> getPilotPn() {
            return _pilotPn;
        }
        
        @Override
        public BigInteger getPilotPnInUse() {
            return _pilotPnInUse;
        }
        
        @Override
        public java.lang.Long getProbeInitialAdjust() {
            return _probeInitialAdjust;
        }
        
        @Override
        public java.lang.Long getProbeNumSteps() {
            return _probeNumSteps;
        }
        
        @Override
        public java.lang.Long getProbePowerStep() {
            return _probePowerStep;
        }
        
        @Override
        public java.lang.Long getRabLength() {
            return _rabLength;
        }
        
        @Override
        public java.lang.Long getRabOffset() {
            return _rabOffset;
        }
        
        @Override
        public List<java.lang.String> getRfcnfl() {
            return _rfcnfl;
        }
        
        @Override
        public BigInteger getRfcnflInUse() {
            return _rfcnflInUse;
        }
        
        @Override
        public java.lang.Short getRfeRlBalanceRatio() {
            return _rfeRlBalanceRatio;
        }
        
        @Override
        public java.lang.Long getRssirabThreshold() {
            return _rssirabThreshold;
        }
        
        @Override
        public byte[] getSectorId() {
            return _sectorId == null ? null : _sectorId.clone();
        }
        
        @Override
        public java.lang.Long getSubnetMaskLength() {
            return _subnetMaskLength;
        }
        
        @Override
        public java.lang.Long getSyncCapsuleOffset() {
            return _syncCapsuleOffset;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_aPersistence);
            result = prime * result + Objects.hashCode(_colorCode);
            result = prime * result + Objects.hashCode(_connectionRateLimit);
            result = prime * result + Objects.hashCode(_controlChannelRate);
            result = prime * result + Objects.hashCode(_hrpdCarBandClass);
            result = prime * result + Objects.hashCode(_hrpdSecElReverseLinkSilenceDuration);
            result = prime * result + Objects.hashCode(_hrpdSecElReverseLinkSilencePeriod);
            result = prime * result + Objects.hashCode(_loadRabThreshold);
            result = prime * result + Objects.hashCode(_maxfapTxPower);
            result = prime * result + Objects.hashCode(_maxfapTxPowerInUse);
            result = prime * result + Objects.hashCode(_openLoopAdjust);
            result = prime * result + Objects.hashCode(_pilotPn);
            result = prime * result + Objects.hashCode(_pilotPnInUse);
            result = prime * result + Objects.hashCode(_probeInitialAdjust);
            result = prime * result + Objects.hashCode(_probeNumSteps);
            result = prime * result + Objects.hashCode(_probePowerStep);
            result = prime * result + Objects.hashCode(_rabLength);
            result = prime * result + Objects.hashCode(_rabOffset);
            result = prime * result + Objects.hashCode(_rfcnfl);
            result = prime * result + Objects.hashCode(_rfcnflInUse);
            result = prime * result + Objects.hashCode(_rfeRlBalanceRatio);
            result = prime * result + Objects.hashCode(_rssirabThreshold);
            result = prime * result + Arrays.hashCode(_sectorId);
            result = prime * result + Objects.hashCode(_subnetMaskLength);
            result = prime * result + Objects.hashCode(_syncCapsuleOffset);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf)obj;
            if (!Objects.equals(_aPersistence, other.getAPersistence())) {
                return false;
            }
            if (!Objects.equals(_colorCode, other.getColorCode())) {
                return false;
            }
            if (!Objects.equals(_connectionRateLimit, other.getConnectionRateLimit())) {
                return false;
            }
            if (!Objects.equals(_controlChannelRate, other.getControlChannelRate())) {
                return false;
            }
            if (!Objects.equals(_hrpdCarBandClass, other.getHrpdCarBandClass())) {
                return false;
            }
            if (!Objects.equals(_hrpdSecElReverseLinkSilenceDuration, other.getHrpdSecElReverseLinkSilenceDuration())) {
                return false;
            }
            if (!Objects.equals(_hrpdSecElReverseLinkSilencePeriod, other.getHrpdSecElReverseLinkSilencePeriod())) {
                return false;
            }
            if (!Objects.equals(_loadRabThreshold, other.getLoadRabThreshold())) {
                return false;
            }
            if (!Objects.equals(_maxfapTxPower, other.getMaxfapTxPower())) {
                return false;
            }
            if (!Objects.equals(_maxfapTxPowerInUse, other.getMaxfapTxPowerInUse())) {
                return false;
            }
            if (!Objects.equals(_openLoopAdjust, other.getOpenLoopAdjust())) {
                return false;
            }
            if (!Objects.equals(_pilotPn, other.getPilotPn())) {
                return false;
            }
            if (!Objects.equals(_pilotPnInUse, other.getPilotPnInUse())) {
                return false;
            }
            if (!Objects.equals(_probeInitialAdjust, other.getProbeInitialAdjust())) {
                return false;
            }
            if (!Objects.equals(_probeNumSteps, other.getProbeNumSteps())) {
                return false;
            }
            if (!Objects.equals(_probePowerStep, other.getProbePowerStep())) {
                return false;
            }
            if (!Objects.equals(_rabLength, other.getRabLength())) {
                return false;
            }
            if (!Objects.equals(_rabOffset, other.getRabOffset())) {
                return false;
            }
            if (!Objects.equals(_rfcnfl, other.getRfcnfl())) {
                return false;
            }
            if (!Objects.equals(_rfcnflInUse, other.getRfcnflInUse())) {
                return false;
            }
            if (!Objects.equals(_rfeRlBalanceRatio, other.getRfeRlBalanceRatio())) {
                return false;
            }
            if (!Objects.equals(_rssirabThreshold, other.getRssirabThreshold())) {
                return false;
            }
            if (!Arrays.equals(_sectorId, other.getSectorId())) {
                return false;
            }
            if (!Objects.equals(_subnetMaskLength, other.getSubnetMaskLength())) {
                return false;
            }
            if (!Objects.equals(_syncCapsuleOffset, other.getSyncCapsuleOffset())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdRanRfImpl otherImpl = (Cdma2000HrpdRanRfImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.ran.Cdma2000HrpdRanRf>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdRanRf [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_aPersistence != null) {
                builder.append("_aPersistence=");
                builder.append(_aPersistence);
                builder.append(", ");
            }
            if (_colorCode != null) {
                builder.append("_colorCode=");
                builder.append(_colorCode);
                builder.append(", ");
            }
            if (_connectionRateLimit != null) {
                builder.append("_connectionRateLimit=");
                builder.append(_connectionRateLimit);
                builder.append(", ");
            }
            if (_controlChannelRate != null) {
                builder.append("_controlChannelRate=");
                builder.append(_controlChannelRate);
                builder.append(", ");
            }
            if (_hrpdCarBandClass != null) {
                builder.append("_hrpdCarBandClass=");
                builder.append(_hrpdCarBandClass);
                builder.append(", ");
            }
            if (_hrpdSecElReverseLinkSilenceDuration != null) {
                builder.append("_hrpdSecElReverseLinkSilenceDuration=");
                builder.append(_hrpdSecElReverseLinkSilenceDuration);
                builder.append(", ");
            }
            if (_hrpdSecElReverseLinkSilencePeriod != null) {
                builder.append("_hrpdSecElReverseLinkSilencePeriod=");
                builder.append(_hrpdSecElReverseLinkSilencePeriod);
                builder.append(", ");
            }
            if (_loadRabThreshold != null) {
                builder.append("_loadRabThreshold=");
                builder.append(_loadRabThreshold);
                builder.append(", ");
            }
            if (_maxfapTxPower != null) {
                builder.append("_maxfapTxPower=");
                builder.append(_maxfapTxPower);
                builder.append(", ");
            }
            if (_maxfapTxPowerInUse != null) {
                builder.append("_maxfapTxPowerInUse=");
                builder.append(_maxfapTxPowerInUse);
                builder.append(", ");
            }
            if (_openLoopAdjust != null) {
                builder.append("_openLoopAdjust=");
                builder.append(_openLoopAdjust);
                builder.append(", ");
            }
            if (_pilotPn != null) {
                builder.append("_pilotPn=");
                builder.append(_pilotPn);
                builder.append(", ");
            }
            if (_pilotPnInUse != null) {
                builder.append("_pilotPnInUse=");
                builder.append(_pilotPnInUse);
                builder.append(", ");
            }
            if (_probeInitialAdjust != null) {
                builder.append("_probeInitialAdjust=");
                builder.append(_probeInitialAdjust);
                builder.append(", ");
            }
            if (_probeNumSteps != null) {
                builder.append("_probeNumSteps=");
                builder.append(_probeNumSteps);
                builder.append(", ");
            }
            if (_probePowerStep != null) {
                builder.append("_probePowerStep=");
                builder.append(_probePowerStep);
                builder.append(", ");
            }
            if (_rabLength != null) {
                builder.append("_rabLength=");
                builder.append(_rabLength);
                builder.append(", ");
            }
            if (_rabOffset != null) {
                builder.append("_rabOffset=");
                builder.append(_rabOffset);
                builder.append(", ");
            }
            if (_rfcnfl != null) {
                builder.append("_rfcnfl=");
                builder.append(_rfcnfl);
                builder.append(", ");
            }
            if (_rfcnflInUse != null) {
                builder.append("_rfcnflInUse=");
                builder.append(_rfcnflInUse);
                builder.append(", ");
            }
            if (_rfeRlBalanceRatio != null) {
                builder.append("_rfeRlBalanceRatio=");
                builder.append(_rfeRlBalanceRatio);
                builder.append(", ");
            }
            if (_rssirabThreshold != null) {
                builder.append("_rssirabThreshold=");
                builder.append(_rssirabThreshold);
                builder.append(", ");
            }
            if (_sectorId != null) {
                builder.append("_sectorId=");
                builder.append(Arrays.toString(_sectorId));
                builder.append(", ");
            }
            if (_subnetMaskLength != null) {
                builder.append("_subnetMaskLength=");
                builder.append(_subnetMaskLength);
                builder.append(", ");
            }
            if (_syncCapsuleOffset != null) {
                builder.append("_syncCapsuleOffset=");
                builder.append(_syncCapsuleOffset);
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
