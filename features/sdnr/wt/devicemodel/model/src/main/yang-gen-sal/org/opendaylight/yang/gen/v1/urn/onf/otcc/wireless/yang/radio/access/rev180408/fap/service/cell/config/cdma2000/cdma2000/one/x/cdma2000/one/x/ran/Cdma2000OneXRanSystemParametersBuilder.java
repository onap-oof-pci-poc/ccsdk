package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters
 *
 */
public class Cdma2000OneXRanSystemParametersBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters> {

    private java.lang.Short _inTrafficTadd;
    private java.lang.Short _inTrafficTcomp;
    private java.lang.Short _inTrafficTdrop;
    private java.lang.Short _inTrafficTtdrop;
    private java.lang.Short _nghbrMaxAge;
    private java.lang.Short _pwrPeriodEnable;
    private java.lang.Short _pwrRepDelay;
    private java.lang.Short _pwrRepFrames;
    private java.lang.Short _pwrRepThresh;
    private java.lang.Short _pwrThreshEnable;
    private java.lang.Short _regPeriod;
    private java.lang.Integer _regZone;
    private java.lang.Short _rescan;
    private java.lang.Short _srchWinA;
    private java.lang.Short _srchWinN;
    private java.lang.Short _srchWinR;
    private java.lang.Short _tTdrop;
    private java.lang.Short _tadd;
    private java.lang.Short _tcomp;
    private java.lang.Short _tdrop;
    private java.lang.Short _totalZones;
    private java.lang.Short _zoneTimer;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanSystemParametersBuilder() {
    }
    public Cdma2000OneXRanSystemParametersBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG arg) {
        this._regZone = arg.getRegZone();
        this._totalZones = arg.getTotalZones();
        this._zoneTimer = arg.getZoneTimer();
        this._regPeriod = arg.getRegPeriod();
        this._srchWinA = arg.getSrchWinA();
        this._srchWinN = arg.getSrchWinN();
        this._srchWinR = arg.getSrchWinR();
        this._nghbrMaxAge = arg.getNghbrMaxAge();
        this._pwrRepThresh = arg.getPwrRepThresh();
        this._pwrRepFrames = arg.getPwrRepFrames();
        this._pwrThreshEnable = arg.getPwrThreshEnable();
        this._pwrPeriodEnable = arg.getPwrPeriodEnable();
        this._pwrRepDelay = arg.getPwrRepDelay();
        this._rescan = arg.getRescan();
        this._tadd = arg.getTadd();
        this._tdrop = arg.getTdrop();
        this._tcomp = arg.getTcomp();
        this._tTdrop = arg.getTTdrop();
        this._inTrafficTadd = arg.getInTrafficTadd();
        this._inTrafficTdrop = arg.getInTrafficTdrop();
        this._inTrafficTcomp = arg.getInTrafficTcomp();
        this._inTrafficTtdrop = arg.getInTrafficTtdrop();
    }

    public Cdma2000OneXRanSystemParametersBuilder(Cdma2000OneXRanSystemParameters base) {
        this._inTrafficTadd = base.getInTrafficTadd();
        this._inTrafficTcomp = base.getInTrafficTcomp();
        this._inTrafficTdrop = base.getInTrafficTdrop();
        this._inTrafficTtdrop = base.getInTrafficTtdrop();
        this._nghbrMaxAge = base.getNghbrMaxAge();
        this._pwrPeriodEnable = base.getPwrPeriodEnable();
        this._pwrRepDelay = base.getPwrRepDelay();
        this._pwrRepFrames = base.getPwrRepFrames();
        this._pwrRepThresh = base.getPwrRepThresh();
        this._pwrThreshEnable = base.getPwrThreshEnable();
        this._regPeriod = base.getRegPeriod();
        this._regZone = base.getRegZone();
        this._rescan = base.getRescan();
        this._srchWinA = base.getSrchWinA();
        this._srchWinN = base.getSrchWinN();
        this._srchWinR = base.getSrchWinR();
        this._tTdrop = base.getTTdrop();
        this._tadd = base.getTadd();
        this._tcomp = base.getTcomp();
        this._tdrop = base.getTdrop();
        this._totalZones = base.getTotalZones();
        this._zoneTimer = base.getZoneTimer();
        if (base instanceof Cdma2000OneXRanSystemParametersImpl) {
            Cdma2000OneXRanSystemParametersImpl impl = (Cdma2000OneXRanSystemParametersImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG) {
            this._regZone = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getRegZone();
            this._totalZones = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getTotalZones();
            this._zoneTimer = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getZoneTimer();
            this._regPeriod = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getRegPeriod();
            this._srchWinA = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getSrchWinA();
            this._srchWinN = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getSrchWinN();
            this._srchWinR = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getSrchWinR();
            this._nghbrMaxAge = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getNghbrMaxAge();
            this._pwrRepThresh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getPwrRepThresh();
            this._pwrRepFrames = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getPwrRepFrames();
            this._pwrThreshEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getPwrThreshEnable();
            this._pwrPeriodEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getPwrPeriodEnable();
            this._pwrRepDelay = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getPwrRepDelay();
            this._rescan = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getRescan();
            this._tadd = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getTadd();
            this._tdrop = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getTdrop();
            this._tcomp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getTcomp();
            this._tTdrop = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getTTdrop();
            this._inTrafficTadd = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getInTrafficTadd();
            this._inTrafficTdrop = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getInTrafficTdrop();
            this._inTrafficTcomp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getInTrafficTcomp();
            this._inTrafficTtdrop = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG)arg).getInTrafficTtdrop();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getInTrafficTadd() {
        return _inTrafficTadd;
    }
    
    public java.lang.Short getInTrafficTcomp() {
        return _inTrafficTcomp;
    }
    
    public java.lang.Short getInTrafficTdrop() {
        return _inTrafficTdrop;
    }
    
    public java.lang.Short getInTrafficTtdrop() {
        return _inTrafficTtdrop;
    }
    
    public java.lang.Short getNghbrMaxAge() {
        return _nghbrMaxAge;
    }
    
    public java.lang.Short getPwrPeriodEnable() {
        return _pwrPeriodEnable;
    }
    
    public java.lang.Short getPwrRepDelay() {
        return _pwrRepDelay;
    }
    
    public java.lang.Short getPwrRepFrames() {
        return _pwrRepFrames;
    }
    
    public java.lang.Short getPwrRepThresh() {
        return _pwrRepThresh;
    }
    
    public java.lang.Short getPwrThreshEnable() {
        return _pwrThreshEnable;
    }
    
    public java.lang.Short getRegPeriod() {
        return _regPeriod;
    }
    
    public java.lang.Integer getRegZone() {
        return _regZone;
    }
    
    public java.lang.Short getRescan() {
        return _rescan;
    }
    
    public java.lang.Short getSrchWinA() {
        return _srchWinA;
    }
    
    public java.lang.Short getSrchWinN() {
        return _srchWinN;
    }
    
    public java.lang.Short getSrchWinR() {
        return _srchWinR;
    }
    
    public java.lang.Short getTTdrop() {
        return _tTdrop;
    }
    
    public java.lang.Short getTadd() {
        return _tadd;
    }
    
    public java.lang.Short getTcomp() {
        return _tcomp;
    }
    
    public java.lang.Short getTdrop() {
        return _tdrop;
    }
    
    public java.lang.Short getTotalZones() {
        return _totalZones;
    }
    
    public java.lang.Short getZoneTimer() {
        return _zoneTimer;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkInTrafficTaddRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setInTrafficTadd(final java.lang.Short value) {
    if (value != null) {
        checkInTrafficTaddRange(value);
    }
        this._inTrafficTadd = value;
        return this;
    }
    
     
     private static void checkInTrafficTcompRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setInTrafficTcomp(final java.lang.Short value) {
    if (value != null) {
        checkInTrafficTcompRange(value);
    }
        this._inTrafficTcomp = value;
        return this;
    }
    
     
     private static void checkInTrafficTdropRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setInTrafficTdrop(final java.lang.Short value) {
    if (value != null) {
        checkInTrafficTdropRange(value);
    }
        this._inTrafficTdrop = value;
        return this;
    }
    
     
     private static void checkInTrafficTtdropRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setInTrafficTtdrop(final java.lang.Short value) {
    if (value != null) {
        checkInTrafficTtdropRange(value);
    }
        this._inTrafficTtdrop = value;
        return this;
    }
    
     
     private static void checkNghbrMaxAgeRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setNghbrMaxAge(final java.lang.Short value) {
    if (value != null) {
        checkNghbrMaxAgeRange(value);
    }
        this._nghbrMaxAge = value;
        return this;
    }
    
     
     private static void checkPwrPeriodEnableRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setPwrPeriodEnable(final java.lang.Short value) {
    if (value != null) {
        checkPwrPeriodEnableRange(value);
    }
        this._pwrPeriodEnable = value;
        return this;
    }
    
     
     private static void checkPwrRepDelayRange(final short value) {
         if (value >= (short)0 && value <= (short)32) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..32]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setPwrRepDelay(final java.lang.Short value) {
    if (value != null) {
        checkPwrRepDelayRange(value);
    }
        this._pwrRepDelay = value;
        return this;
    }
    
     
     private static void checkPwrRepFramesRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setPwrRepFrames(final java.lang.Short value) {
    if (value != null) {
        checkPwrRepFramesRange(value);
    }
        this._pwrRepFrames = value;
        return this;
    }
    
     
     private static void checkPwrRepThreshRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setPwrRepThresh(final java.lang.Short value) {
    if (value != null) {
        checkPwrRepThreshRange(value);
    }
        this._pwrRepThresh = value;
        return this;
    }
    
     
     private static void checkPwrThreshEnableRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setPwrThreshEnable(final java.lang.Short value) {
    if (value != null) {
        checkPwrThreshEnableRange(value);
    }
        this._pwrThreshEnable = value;
        return this;
    }
    
     
     private static void checkRegPeriodRange(final short value) {
         if (value >= (short)29 && value <= (short)85) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[29..85]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setRegPeriod(final java.lang.Short value) {
    if (value != null) {
        checkRegPeriodRange(value);
    }
        this._regPeriod = value;
        return this;
    }
    
     
     private static void checkRegZoneRange(final int value) {
         if (value >= 0 && value <= 4095) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4095]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setRegZone(final java.lang.Integer value) {
    if (value != null) {
        checkRegZoneRange(value);
    }
        this._regZone = value;
        return this;
    }
    
     
     private static void checkRescanRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setRescan(final java.lang.Short value) {
    if (value != null) {
        checkRescanRange(value);
    }
        this._rescan = value;
        return this;
    }
    
     
     private static void checkSrchWinARange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setSrchWinA(final java.lang.Short value) {
    if (value != null) {
        checkSrchWinARange(value);
    }
        this._srchWinA = value;
        return this;
    }
    
     
     private static void checkSrchWinNRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setSrchWinN(final java.lang.Short value) {
    if (value != null) {
        checkSrchWinNRange(value);
    }
        this._srchWinN = value;
        return this;
    }
    
     
     private static void checkSrchWinRRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setSrchWinR(final java.lang.Short value) {
    if (value != null) {
        checkSrchWinRRange(value);
    }
        this._srchWinR = value;
        return this;
    }
    
     
     private static void checkTTdropRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setTTdrop(final java.lang.Short value) {
    if (value != null) {
        checkTTdropRange(value);
    }
        this._tTdrop = value;
        return this;
    }
    
     
     private static void checkTaddRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setTadd(final java.lang.Short value) {
    if (value != null) {
        checkTaddRange(value);
    }
        this._tadd = value;
        return this;
    }
    
     
     private static void checkTcompRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setTcomp(final java.lang.Short value) {
    if (value != null) {
        checkTcompRange(value);
    }
        this._tcomp = value;
        return this;
    }
    
     
     private static void checkTdropRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setTdrop(final java.lang.Short value) {
    if (value != null) {
        checkTdropRange(value);
    }
        this._tdrop = value;
        return this;
    }
    
     
     private static void checkTotalZonesRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setTotalZones(final java.lang.Short value) {
    if (value != null) {
        checkTotalZonesRange(value);
    }
        this._totalZones = value;
        return this;
    }
    
     
     private static void checkZoneTimerRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanSystemParametersBuilder setZoneTimer(final java.lang.Short value) {
    if (value != null) {
        checkZoneTimerRange(value);
    }
        this._zoneTimer = value;
        return this;
    }
    
    public Cdma2000OneXRanSystemParametersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanSystemParametersBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanSystemParameters build() {
        return new Cdma2000OneXRanSystemParametersImpl(this);
    }

    private static final class Cdma2000OneXRanSystemParametersImpl implements Cdma2000OneXRanSystemParameters {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters.class;
        }

        private final java.lang.Short _inTrafficTadd;
        private final java.lang.Short _inTrafficTcomp;
        private final java.lang.Short _inTrafficTdrop;
        private final java.lang.Short _inTrafficTtdrop;
        private final java.lang.Short _nghbrMaxAge;
        private final java.lang.Short _pwrPeriodEnable;
        private final java.lang.Short _pwrRepDelay;
        private final java.lang.Short _pwrRepFrames;
        private final java.lang.Short _pwrRepThresh;
        private final java.lang.Short _pwrThreshEnable;
        private final java.lang.Short _regPeriod;
        private final java.lang.Integer _regZone;
        private final java.lang.Short _rescan;
        private final java.lang.Short _srchWinA;
        private final java.lang.Short _srchWinN;
        private final java.lang.Short _srchWinR;
        private final java.lang.Short _tTdrop;
        private final java.lang.Short _tadd;
        private final java.lang.Short _tcomp;
        private final java.lang.Short _tdrop;
        private final java.lang.Short _totalZones;
        private final java.lang.Short _zoneTimer;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanSystemParametersImpl(Cdma2000OneXRanSystemParametersBuilder base) {
            this._inTrafficTadd = base.getInTrafficTadd();
            this._inTrafficTcomp = base.getInTrafficTcomp();
            this._inTrafficTdrop = base.getInTrafficTdrop();
            this._inTrafficTtdrop = base.getInTrafficTtdrop();
            this._nghbrMaxAge = base.getNghbrMaxAge();
            this._pwrPeriodEnable = base.getPwrPeriodEnable();
            this._pwrRepDelay = base.getPwrRepDelay();
            this._pwrRepFrames = base.getPwrRepFrames();
            this._pwrRepThresh = base.getPwrRepThresh();
            this._pwrThreshEnable = base.getPwrThreshEnable();
            this._regPeriod = base.getRegPeriod();
            this._regZone = base.getRegZone();
            this._rescan = base.getRescan();
            this._srchWinA = base.getSrchWinA();
            this._srchWinN = base.getSrchWinN();
            this._srchWinR = base.getSrchWinR();
            this._tTdrop = base.getTTdrop();
            this._tadd = base.getTadd();
            this._tcomp = base.getTcomp();
            this._tdrop = base.getTdrop();
            this._totalZones = base.getTotalZones();
            this._zoneTimer = base.getZoneTimer();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getInTrafficTadd() {
            return _inTrafficTadd;
        }
        
        @Override
        public java.lang.Short getInTrafficTcomp() {
            return _inTrafficTcomp;
        }
        
        @Override
        public java.lang.Short getInTrafficTdrop() {
            return _inTrafficTdrop;
        }
        
        @Override
        public java.lang.Short getInTrafficTtdrop() {
            return _inTrafficTtdrop;
        }
        
        @Override
        public java.lang.Short getNghbrMaxAge() {
            return _nghbrMaxAge;
        }
        
        @Override
        public java.lang.Short getPwrPeriodEnable() {
            return _pwrPeriodEnable;
        }
        
        @Override
        public java.lang.Short getPwrRepDelay() {
            return _pwrRepDelay;
        }
        
        @Override
        public java.lang.Short getPwrRepFrames() {
            return _pwrRepFrames;
        }
        
        @Override
        public java.lang.Short getPwrRepThresh() {
            return _pwrRepThresh;
        }
        
        @Override
        public java.lang.Short getPwrThreshEnable() {
            return _pwrThreshEnable;
        }
        
        @Override
        public java.lang.Short getRegPeriod() {
            return _regPeriod;
        }
        
        @Override
        public java.lang.Integer getRegZone() {
            return _regZone;
        }
        
        @Override
        public java.lang.Short getRescan() {
            return _rescan;
        }
        
        @Override
        public java.lang.Short getSrchWinA() {
            return _srchWinA;
        }
        
        @Override
        public java.lang.Short getSrchWinN() {
            return _srchWinN;
        }
        
        @Override
        public java.lang.Short getSrchWinR() {
            return _srchWinR;
        }
        
        @Override
        public java.lang.Short getTTdrop() {
            return _tTdrop;
        }
        
        @Override
        public java.lang.Short getTadd() {
            return _tadd;
        }
        
        @Override
        public java.lang.Short getTcomp() {
            return _tcomp;
        }
        
        @Override
        public java.lang.Short getTdrop() {
            return _tdrop;
        }
        
        @Override
        public java.lang.Short getTotalZones() {
            return _totalZones;
        }
        
        @Override
        public java.lang.Short getZoneTimer() {
            return _zoneTimer;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_inTrafficTadd);
            result = prime * result + Objects.hashCode(_inTrafficTcomp);
            result = prime * result + Objects.hashCode(_inTrafficTdrop);
            result = prime * result + Objects.hashCode(_inTrafficTtdrop);
            result = prime * result + Objects.hashCode(_nghbrMaxAge);
            result = prime * result + Objects.hashCode(_pwrPeriodEnable);
            result = prime * result + Objects.hashCode(_pwrRepDelay);
            result = prime * result + Objects.hashCode(_pwrRepFrames);
            result = prime * result + Objects.hashCode(_pwrRepThresh);
            result = prime * result + Objects.hashCode(_pwrThreshEnable);
            result = prime * result + Objects.hashCode(_regPeriod);
            result = prime * result + Objects.hashCode(_regZone);
            result = prime * result + Objects.hashCode(_rescan);
            result = prime * result + Objects.hashCode(_srchWinA);
            result = prime * result + Objects.hashCode(_srchWinN);
            result = prime * result + Objects.hashCode(_srchWinR);
            result = prime * result + Objects.hashCode(_tTdrop);
            result = prime * result + Objects.hashCode(_tadd);
            result = prime * result + Objects.hashCode(_tcomp);
            result = prime * result + Objects.hashCode(_tdrop);
            result = prime * result + Objects.hashCode(_totalZones);
            result = prime * result + Objects.hashCode(_zoneTimer);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters)obj;
            if (!Objects.equals(_inTrafficTadd, other.getInTrafficTadd())) {
                return false;
            }
            if (!Objects.equals(_inTrafficTcomp, other.getInTrafficTcomp())) {
                return false;
            }
            if (!Objects.equals(_inTrafficTdrop, other.getInTrafficTdrop())) {
                return false;
            }
            if (!Objects.equals(_inTrafficTtdrop, other.getInTrafficTtdrop())) {
                return false;
            }
            if (!Objects.equals(_nghbrMaxAge, other.getNghbrMaxAge())) {
                return false;
            }
            if (!Objects.equals(_pwrPeriodEnable, other.getPwrPeriodEnable())) {
                return false;
            }
            if (!Objects.equals(_pwrRepDelay, other.getPwrRepDelay())) {
                return false;
            }
            if (!Objects.equals(_pwrRepFrames, other.getPwrRepFrames())) {
                return false;
            }
            if (!Objects.equals(_pwrRepThresh, other.getPwrRepThresh())) {
                return false;
            }
            if (!Objects.equals(_pwrThreshEnable, other.getPwrThreshEnable())) {
                return false;
            }
            if (!Objects.equals(_regPeriod, other.getRegPeriod())) {
                return false;
            }
            if (!Objects.equals(_regZone, other.getRegZone())) {
                return false;
            }
            if (!Objects.equals(_rescan, other.getRescan())) {
                return false;
            }
            if (!Objects.equals(_srchWinA, other.getSrchWinA())) {
                return false;
            }
            if (!Objects.equals(_srchWinN, other.getSrchWinN())) {
                return false;
            }
            if (!Objects.equals(_srchWinR, other.getSrchWinR())) {
                return false;
            }
            if (!Objects.equals(_tTdrop, other.getTTdrop())) {
                return false;
            }
            if (!Objects.equals(_tadd, other.getTadd())) {
                return false;
            }
            if (!Objects.equals(_tcomp, other.getTcomp())) {
                return false;
            }
            if (!Objects.equals(_tdrop, other.getTdrop())) {
                return false;
            }
            if (!Objects.equals(_totalZones, other.getTotalZones())) {
                return false;
            }
            if (!Objects.equals(_zoneTimer, other.getZoneTimer())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanSystemParametersImpl otherImpl = (Cdma2000OneXRanSystemParametersImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanSystemParameters [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_inTrafficTadd != null) {
                builder.append("_inTrafficTadd=");
                builder.append(_inTrafficTadd);
                builder.append(", ");
            }
            if (_inTrafficTcomp != null) {
                builder.append("_inTrafficTcomp=");
                builder.append(_inTrafficTcomp);
                builder.append(", ");
            }
            if (_inTrafficTdrop != null) {
                builder.append("_inTrafficTdrop=");
                builder.append(_inTrafficTdrop);
                builder.append(", ");
            }
            if (_inTrafficTtdrop != null) {
                builder.append("_inTrafficTtdrop=");
                builder.append(_inTrafficTtdrop);
                builder.append(", ");
            }
            if (_nghbrMaxAge != null) {
                builder.append("_nghbrMaxAge=");
                builder.append(_nghbrMaxAge);
                builder.append(", ");
            }
            if (_pwrPeriodEnable != null) {
                builder.append("_pwrPeriodEnable=");
                builder.append(_pwrPeriodEnable);
                builder.append(", ");
            }
            if (_pwrRepDelay != null) {
                builder.append("_pwrRepDelay=");
                builder.append(_pwrRepDelay);
                builder.append(", ");
            }
            if (_pwrRepFrames != null) {
                builder.append("_pwrRepFrames=");
                builder.append(_pwrRepFrames);
                builder.append(", ");
            }
            if (_pwrRepThresh != null) {
                builder.append("_pwrRepThresh=");
                builder.append(_pwrRepThresh);
                builder.append(", ");
            }
            if (_pwrThreshEnable != null) {
                builder.append("_pwrThreshEnable=");
                builder.append(_pwrThreshEnable);
                builder.append(", ");
            }
            if (_regPeriod != null) {
                builder.append("_regPeriod=");
                builder.append(_regPeriod);
                builder.append(", ");
            }
            if (_regZone != null) {
                builder.append("_regZone=");
                builder.append(_regZone);
                builder.append(", ");
            }
            if (_rescan != null) {
                builder.append("_rescan=");
                builder.append(_rescan);
                builder.append(", ");
            }
            if (_srchWinA != null) {
                builder.append("_srchWinA=");
                builder.append(_srchWinA);
                builder.append(", ");
            }
            if (_srchWinN != null) {
                builder.append("_srchWinN=");
                builder.append(_srchWinN);
                builder.append(", ");
            }
            if (_srchWinR != null) {
                builder.append("_srchWinR=");
                builder.append(_srchWinR);
                builder.append(", ");
            }
            if (_tTdrop != null) {
                builder.append("_tTdrop=");
                builder.append(_tTdrop);
                builder.append(", ");
            }
            if (_tadd != null) {
                builder.append("_tadd=");
                builder.append(_tadd);
                builder.append(", ");
            }
            if (_tcomp != null) {
                builder.append("_tcomp=");
                builder.append(_tcomp);
                builder.append(", ");
            }
            if (_tdrop != null) {
                builder.append("_tdrop=");
                builder.append(_tdrop);
                builder.append(", ");
            }
            if (_totalZones != null) {
                builder.append("_totalZones=");
                builder.append(_totalZones);
                builder.append(", ");
            }
            if (_zoneTimer != null) {
                builder.append("_zoneTimer=");
                builder.append(_zoneTimer);
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
