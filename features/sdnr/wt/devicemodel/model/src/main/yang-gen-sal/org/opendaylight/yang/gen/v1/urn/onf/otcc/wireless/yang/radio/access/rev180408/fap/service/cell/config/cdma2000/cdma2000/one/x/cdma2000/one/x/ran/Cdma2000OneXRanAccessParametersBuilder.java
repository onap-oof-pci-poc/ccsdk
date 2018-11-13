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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters
 *
 */
public class Cdma2000OneXRanAccessParametersBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters> {

    private java.lang.Short _accTmo;
    private java.lang.Short _apmAuth;
    private java.lang.Integer _apmRandUpdatePrd;
    private java.lang.Short _bkoff;
    private java.lang.Long _initPwr;
    private java.lang.Short _initialpwr;
    private java.lang.Short _maxCapSize;
    private java.lang.Short _maxReqSeq;
    private java.lang.Short _maxRspSeq;
    private java.lang.Short _msgPsist;
    private java.lang.Long _nomPwr;
    private java.lang.Short _nomPwrExt;
    private java.lang.Short _numStep;
    private java.lang.Short _preambleSize;
    private java.lang.Short _probeBkoff;
    private java.lang.Short _probePnRan;
    private java.lang.Short _psist09;
    private java.lang.Short _psist10;
    private java.lang.Short _psist11;
    private java.lang.Short _psist12;
    private java.lang.Short _psist13;
    private java.lang.Short _psist14;
    private java.lang.Short _psist15;
    private java.lang.Short _pwrStep;
    private java.lang.Short _pwrStepIndb;
    private java.lang.Short _regPsist;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanAccessParametersBuilder() {
    }
    public Cdma2000OneXRanAccessParametersBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG arg) {
        this._nomPwr = arg.getNomPwr();
        this._initPwr = arg.getInitPwr();
        this._pwrStepIndb = arg.getPwrStepIndb();
        this._nomPwrExt = arg.getNomPwrExt();
        this._apmAuth = arg.getApmAuth();
        this._apmRandUpdatePrd = arg.getApmRandUpdatePrd();
        this._initialpwr = arg.getInitialpwr();
        this._pwrStep = arg.getPwrStep();
        this._numStep = arg.getNumStep();
        this._maxCapSize = arg.getMaxCapSize();
        this._preambleSize = arg.getPreambleSize();
        this._psist09 = arg.getPsist09();
        this._psist10 = arg.getPsist10();
        this._psist11 = arg.getPsist11();
        this._psist12 = arg.getPsist12();
        this._psist13 = arg.getPsist13();
        this._psist14 = arg.getPsist14();
        this._psist15 = arg.getPsist15();
        this._msgPsist = arg.getMsgPsist();
        this._regPsist = arg.getRegPsist();
        this._probePnRan = arg.getProbePnRan();
        this._accTmo = arg.getAccTmo();
        this._probeBkoff = arg.getProbeBkoff();
        this._bkoff = arg.getBkoff();
        this._maxReqSeq = arg.getMaxReqSeq();
        this._maxRspSeq = arg.getMaxRspSeq();
    }

    public Cdma2000OneXRanAccessParametersBuilder(Cdma2000OneXRanAccessParameters base) {
        this._accTmo = base.getAccTmo();
        this._apmAuth = base.getApmAuth();
        this._apmRandUpdatePrd = base.getApmRandUpdatePrd();
        this._bkoff = base.getBkoff();
        this._initPwr = base.getInitPwr();
        this._initialpwr = base.getInitialpwr();
        this._maxCapSize = base.getMaxCapSize();
        this._maxReqSeq = base.getMaxReqSeq();
        this._maxRspSeq = base.getMaxRspSeq();
        this._msgPsist = base.getMsgPsist();
        this._nomPwr = base.getNomPwr();
        this._nomPwrExt = base.getNomPwrExt();
        this._numStep = base.getNumStep();
        this._preambleSize = base.getPreambleSize();
        this._probeBkoff = base.getProbeBkoff();
        this._probePnRan = base.getProbePnRan();
        this._psist09 = base.getPsist09();
        this._psist10 = base.getPsist10();
        this._psist11 = base.getPsist11();
        this._psist12 = base.getPsist12();
        this._psist13 = base.getPsist13();
        this._psist14 = base.getPsist14();
        this._psist15 = base.getPsist15();
        this._pwrStep = base.getPwrStep();
        this._pwrStepIndb = base.getPwrStepIndb();
        this._regPsist = base.getRegPsist();
        if (base instanceof Cdma2000OneXRanAccessParametersImpl) {
            Cdma2000OneXRanAccessParametersImpl impl = (Cdma2000OneXRanAccessParametersImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG) {
            this._nomPwr = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getNomPwr();
            this._initPwr = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getInitPwr();
            this._pwrStepIndb = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getPwrStepIndb();
            this._nomPwrExt = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getNomPwrExt();
            this._apmAuth = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getApmAuth();
            this._apmRandUpdatePrd = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getApmRandUpdatePrd();
            this._initialpwr = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getInitialpwr();
            this._pwrStep = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getPwrStep();
            this._numStep = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getNumStep();
            this._maxCapSize = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getMaxCapSize();
            this._preambleSize = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getPreambleSize();
            this._psist09 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getPsist09();
            this._psist10 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getPsist10();
            this._psist11 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getPsist11();
            this._psist12 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getPsist12();
            this._psist13 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getPsist13();
            this._psist14 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getPsist14();
            this._psist15 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getPsist15();
            this._msgPsist = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getMsgPsist();
            this._regPsist = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getRegPsist();
            this._probePnRan = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getProbePnRan();
            this._accTmo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getAccTmo();
            this._probeBkoff = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getProbeBkoff();
            this._bkoff = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getBkoff();
            this._maxReqSeq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getMaxReqSeq();
            this._maxRspSeq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG)arg).getMaxRspSeq();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getAccTmo() {
        return _accTmo;
    }
    
    public java.lang.Short getApmAuth() {
        return _apmAuth;
    }
    
    public java.lang.Integer getApmRandUpdatePrd() {
        return _apmRandUpdatePrd;
    }
    
    public java.lang.Short getBkoff() {
        return _bkoff;
    }
    
    public java.lang.Long getInitPwr() {
        return _initPwr;
    }
    
    public java.lang.Short getInitialpwr() {
        return _initialpwr;
    }
    
    public java.lang.Short getMaxCapSize() {
        return _maxCapSize;
    }
    
    public java.lang.Short getMaxReqSeq() {
        return _maxReqSeq;
    }
    
    public java.lang.Short getMaxRspSeq() {
        return _maxRspSeq;
    }
    
    public java.lang.Short getMsgPsist() {
        return _msgPsist;
    }
    
    public java.lang.Long getNomPwr() {
        return _nomPwr;
    }
    
    public java.lang.Short getNomPwrExt() {
        return _nomPwrExt;
    }
    
    public java.lang.Short getNumStep() {
        return _numStep;
    }
    
    public java.lang.Short getPreambleSize() {
        return _preambleSize;
    }
    
    public java.lang.Short getProbeBkoff() {
        return _probeBkoff;
    }
    
    public java.lang.Short getProbePnRan() {
        return _probePnRan;
    }
    
    public java.lang.Short getPsist09() {
        return _psist09;
    }
    
    public java.lang.Short getPsist10() {
        return _psist10;
    }
    
    public java.lang.Short getPsist11() {
        return _psist11;
    }
    
    public java.lang.Short getPsist12() {
        return _psist12;
    }
    
    public java.lang.Short getPsist13() {
        return _psist13;
    }
    
    public java.lang.Short getPsist14() {
        return _psist14;
    }
    
    public java.lang.Short getPsist15() {
        return _psist15;
    }
    
    public java.lang.Short getPwrStep() {
        return _pwrStep;
    }
    
    public java.lang.Short getPwrStepIndb() {
        return _pwrStepIndb;
    }
    
    public java.lang.Short getRegPsist() {
        return _regPsist;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkAccTmoRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setAccTmo(final java.lang.Short value) {
    if (value != null) {
        checkAccTmoRange(value);
    }
        this._accTmo = value;
        return this;
    }
    
     
     private static void checkApmAuthRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setApmAuth(final java.lang.Short value) {
    if (value != null) {
        checkApmAuthRange(value);
    }
        this._apmAuth = value;
        return this;
    }
    
     
     private static void checkApmRandUpdatePrdRange(final int value) {
         if (value >= 16 && value <= 14400) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[16..14400]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setApmRandUpdatePrd(final java.lang.Integer value) {
    if (value != null) {
        checkApmRandUpdatePrdRange(value);
    }
        this._apmRandUpdatePrd = value;
        return this;
    }
    
     
     private static void checkBkoffRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setBkoff(final java.lang.Short value) {
    if (value != null) {
        checkBkoffRange(value);
    }
        this._bkoff = value;
        return this;
    }
    
     
    public Cdma2000OneXRanAccessParametersBuilder setInitPwr(final java.lang.Long value) {
        this._initPwr = value;
        return this;
    }
    
     
     private static void checkInitialpwrRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setInitialpwr(final java.lang.Short value) {
    if (value != null) {
        checkInitialpwrRange(value);
    }
        this._initialpwr = value;
        return this;
    }
    
     
     private static void checkMaxCapSizeRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setMaxCapSize(final java.lang.Short value) {
    if (value != null) {
        checkMaxCapSizeRange(value);
    }
        this._maxCapSize = value;
        return this;
    }
    
     
     private static void checkMaxReqSeqRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setMaxReqSeq(final java.lang.Short value) {
    if (value != null) {
        checkMaxReqSeqRange(value);
    }
        this._maxReqSeq = value;
        return this;
    }
    
     
     private static void checkMaxRspSeqRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setMaxRspSeq(final java.lang.Short value) {
    if (value != null) {
        checkMaxRspSeqRange(value);
    }
        this._maxRspSeq = value;
        return this;
    }
    
     
     private static void checkMsgPsistRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setMsgPsist(final java.lang.Short value) {
    if (value != null) {
        checkMsgPsistRange(value);
    }
        this._msgPsist = value;
        return this;
    }
    
     
    public Cdma2000OneXRanAccessParametersBuilder setNomPwr(final java.lang.Long value) {
        this._nomPwr = value;
        return this;
    }
    
     
     private static void checkNomPwrExtRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setNomPwrExt(final java.lang.Short value) {
    if (value != null) {
        checkNomPwrExtRange(value);
    }
        this._nomPwrExt = value;
        return this;
    }
    
     
     private static void checkNumStepRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setNumStep(final java.lang.Short value) {
    if (value != null) {
        checkNumStepRange(value);
    }
        this._numStep = value;
        return this;
    }
    
     
     private static void checkPreambleSizeRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setPreambleSize(final java.lang.Short value) {
    if (value != null) {
        checkPreambleSizeRange(value);
    }
        this._preambleSize = value;
        return this;
    }
    
     
     private static void checkProbeBkoffRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setProbeBkoff(final java.lang.Short value) {
    if (value != null) {
        checkProbeBkoffRange(value);
    }
        this._probeBkoff = value;
        return this;
    }
    
     
     private static void checkProbePnRanRange(final short value) {
         if (value >= (short)0 && value <= (short)9) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..9]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setProbePnRan(final java.lang.Short value) {
    if (value != null) {
        checkProbePnRanRange(value);
    }
        this._probePnRan = value;
        return this;
    }
    
     
     private static void checkPsist09Range(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setPsist09(final java.lang.Short value) {
    if (value != null) {
        checkPsist09Range(value);
    }
        this._psist09 = value;
        return this;
    }
    
     
     private static void checkPsist10Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setPsist10(final java.lang.Short value) {
    if (value != null) {
        checkPsist10Range(value);
    }
        this._psist10 = value;
        return this;
    }
    
     
     private static void checkPsist11Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setPsist11(final java.lang.Short value) {
    if (value != null) {
        checkPsist11Range(value);
    }
        this._psist11 = value;
        return this;
    }
    
     
     private static void checkPsist12Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setPsist12(final java.lang.Short value) {
    if (value != null) {
        checkPsist12Range(value);
    }
        this._psist12 = value;
        return this;
    }
    
     
     private static void checkPsist13Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setPsist13(final java.lang.Short value) {
    if (value != null) {
        checkPsist13Range(value);
    }
        this._psist13 = value;
        return this;
    }
    
     
     private static void checkPsist14Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setPsist14(final java.lang.Short value) {
    if (value != null) {
        checkPsist14Range(value);
    }
        this._psist14 = value;
        return this;
    }
    
     
     private static void checkPsist15Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setPsist15(final java.lang.Short value) {
    if (value != null) {
        checkPsist15Range(value);
    }
        this._psist15 = value;
        return this;
    }
    
     
     private static void checkPwrStepRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setPwrStep(final java.lang.Short value) {
    if (value != null) {
        checkPwrStepRange(value);
    }
        this._pwrStep = value;
        return this;
    }
    
     
     private static void checkPwrStepIndbRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setPwrStepIndb(final java.lang.Short value) {
    if (value != null) {
        checkPwrStepIndbRange(value);
    }
        this._pwrStepIndb = value;
        return this;
    }
    
     
     private static void checkRegPsistRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAccessParametersBuilder setRegPsist(final java.lang.Short value) {
    if (value != null) {
        checkRegPsistRange(value);
    }
        this._regPsist = value;
        return this;
    }
    
    public Cdma2000OneXRanAccessParametersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanAccessParametersBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanAccessParameters build() {
        return new Cdma2000OneXRanAccessParametersImpl(this);
    }

    private static final class Cdma2000OneXRanAccessParametersImpl implements Cdma2000OneXRanAccessParameters {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters.class;
        }

        private final java.lang.Short _accTmo;
        private final java.lang.Short _apmAuth;
        private final java.lang.Integer _apmRandUpdatePrd;
        private final java.lang.Short _bkoff;
        private final java.lang.Long _initPwr;
        private final java.lang.Short _initialpwr;
        private final java.lang.Short _maxCapSize;
        private final java.lang.Short _maxReqSeq;
        private final java.lang.Short _maxRspSeq;
        private final java.lang.Short _msgPsist;
        private final java.lang.Long _nomPwr;
        private final java.lang.Short _nomPwrExt;
        private final java.lang.Short _numStep;
        private final java.lang.Short _preambleSize;
        private final java.lang.Short _probeBkoff;
        private final java.lang.Short _probePnRan;
        private final java.lang.Short _psist09;
        private final java.lang.Short _psist10;
        private final java.lang.Short _psist11;
        private final java.lang.Short _psist12;
        private final java.lang.Short _psist13;
        private final java.lang.Short _psist14;
        private final java.lang.Short _psist15;
        private final java.lang.Short _pwrStep;
        private final java.lang.Short _pwrStepIndb;
        private final java.lang.Short _regPsist;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanAccessParametersImpl(Cdma2000OneXRanAccessParametersBuilder base) {
            this._accTmo = base.getAccTmo();
            this._apmAuth = base.getApmAuth();
            this._apmRandUpdatePrd = base.getApmRandUpdatePrd();
            this._bkoff = base.getBkoff();
            this._initPwr = base.getInitPwr();
            this._initialpwr = base.getInitialpwr();
            this._maxCapSize = base.getMaxCapSize();
            this._maxReqSeq = base.getMaxReqSeq();
            this._maxRspSeq = base.getMaxRspSeq();
            this._msgPsist = base.getMsgPsist();
            this._nomPwr = base.getNomPwr();
            this._nomPwrExt = base.getNomPwrExt();
            this._numStep = base.getNumStep();
            this._preambleSize = base.getPreambleSize();
            this._probeBkoff = base.getProbeBkoff();
            this._probePnRan = base.getProbePnRan();
            this._psist09 = base.getPsist09();
            this._psist10 = base.getPsist10();
            this._psist11 = base.getPsist11();
            this._psist12 = base.getPsist12();
            this._psist13 = base.getPsist13();
            this._psist14 = base.getPsist14();
            this._psist15 = base.getPsist15();
            this._pwrStep = base.getPwrStep();
            this._pwrStepIndb = base.getPwrStepIndb();
            this._regPsist = base.getRegPsist();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getAccTmo() {
            return _accTmo;
        }
        
        @Override
        public java.lang.Short getApmAuth() {
            return _apmAuth;
        }
        
        @Override
        public java.lang.Integer getApmRandUpdatePrd() {
            return _apmRandUpdatePrd;
        }
        
        @Override
        public java.lang.Short getBkoff() {
            return _bkoff;
        }
        
        @Override
        public java.lang.Long getInitPwr() {
            return _initPwr;
        }
        
        @Override
        public java.lang.Short getInitialpwr() {
            return _initialpwr;
        }
        
        @Override
        public java.lang.Short getMaxCapSize() {
            return _maxCapSize;
        }
        
        @Override
        public java.lang.Short getMaxReqSeq() {
            return _maxReqSeq;
        }
        
        @Override
        public java.lang.Short getMaxRspSeq() {
            return _maxRspSeq;
        }
        
        @Override
        public java.lang.Short getMsgPsist() {
            return _msgPsist;
        }
        
        @Override
        public java.lang.Long getNomPwr() {
            return _nomPwr;
        }
        
        @Override
        public java.lang.Short getNomPwrExt() {
            return _nomPwrExt;
        }
        
        @Override
        public java.lang.Short getNumStep() {
            return _numStep;
        }
        
        @Override
        public java.lang.Short getPreambleSize() {
            return _preambleSize;
        }
        
        @Override
        public java.lang.Short getProbeBkoff() {
            return _probeBkoff;
        }
        
        @Override
        public java.lang.Short getProbePnRan() {
            return _probePnRan;
        }
        
        @Override
        public java.lang.Short getPsist09() {
            return _psist09;
        }
        
        @Override
        public java.lang.Short getPsist10() {
            return _psist10;
        }
        
        @Override
        public java.lang.Short getPsist11() {
            return _psist11;
        }
        
        @Override
        public java.lang.Short getPsist12() {
            return _psist12;
        }
        
        @Override
        public java.lang.Short getPsist13() {
            return _psist13;
        }
        
        @Override
        public java.lang.Short getPsist14() {
            return _psist14;
        }
        
        @Override
        public java.lang.Short getPsist15() {
            return _psist15;
        }
        
        @Override
        public java.lang.Short getPwrStep() {
            return _pwrStep;
        }
        
        @Override
        public java.lang.Short getPwrStepIndb() {
            return _pwrStepIndb;
        }
        
        @Override
        public java.lang.Short getRegPsist() {
            return _regPsist;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_accTmo);
            result = prime * result + Objects.hashCode(_apmAuth);
            result = prime * result + Objects.hashCode(_apmRandUpdatePrd);
            result = prime * result + Objects.hashCode(_bkoff);
            result = prime * result + Objects.hashCode(_initPwr);
            result = prime * result + Objects.hashCode(_initialpwr);
            result = prime * result + Objects.hashCode(_maxCapSize);
            result = prime * result + Objects.hashCode(_maxReqSeq);
            result = prime * result + Objects.hashCode(_maxRspSeq);
            result = prime * result + Objects.hashCode(_msgPsist);
            result = prime * result + Objects.hashCode(_nomPwr);
            result = prime * result + Objects.hashCode(_nomPwrExt);
            result = prime * result + Objects.hashCode(_numStep);
            result = prime * result + Objects.hashCode(_preambleSize);
            result = prime * result + Objects.hashCode(_probeBkoff);
            result = prime * result + Objects.hashCode(_probePnRan);
            result = prime * result + Objects.hashCode(_psist09);
            result = prime * result + Objects.hashCode(_psist10);
            result = prime * result + Objects.hashCode(_psist11);
            result = prime * result + Objects.hashCode(_psist12);
            result = prime * result + Objects.hashCode(_psist13);
            result = prime * result + Objects.hashCode(_psist14);
            result = prime * result + Objects.hashCode(_psist15);
            result = prime * result + Objects.hashCode(_pwrStep);
            result = prime * result + Objects.hashCode(_pwrStepIndb);
            result = prime * result + Objects.hashCode(_regPsist);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters)obj;
            if (!Objects.equals(_accTmo, other.getAccTmo())) {
                return false;
            }
            if (!Objects.equals(_apmAuth, other.getApmAuth())) {
                return false;
            }
            if (!Objects.equals(_apmRandUpdatePrd, other.getApmRandUpdatePrd())) {
                return false;
            }
            if (!Objects.equals(_bkoff, other.getBkoff())) {
                return false;
            }
            if (!Objects.equals(_initPwr, other.getInitPwr())) {
                return false;
            }
            if (!Objects.equals(_initialpwr, other.getInitialpwr())) {
                return false;
            }
            if (!Objects.equals(_maxCapSize, other.getMaxCapSize())) {
                return false;
            }
            if (!Objects.equals(_maxReqSeq, other.getMaxReqSeq())) {
                return false;
            }
            if (!Objects.equals(_maxRspSeq, other.getMaxRspSeq())) {
                return false;
            }
            if (!Objects.equals(_msgPsist, other.getMsgPsist())) {
                return false;
            }
            if (!Objects.equals(_nomPwr, other.getNomPwr())) {
                return false;
            }
            if (!Objects.equals(_nomPwrExt, other.getNomPwrExt())) {
                return false;
            }
            if (!Objects.equals(_numStep, other.getNumStep())) {
                return false;
            }
            if (!Objects.equals(_preambleSize, other.getPreambleSize())) {
                return false;
            }
            if (!Objects.equals(_probeBkoff, other.getProbeBkoff())) {
                return false;
            }
            if (!Objects.equals(_probePnRan, other.getProbePnRan())) {
                return false;
            }
            if (!Objects.equals(_psist09, other.getPsist09())) {
                return false;
            }
            if (!Objects.equals(_psist10, other.getPsist10())) {
                return false;
            }
            if (!Objects.equals(_psist11, other.getPsist11())) {
                return false;
            }
            if (!Objects.equals(_psist12, other.getPsist12())) {
                return false;
            }
            if (!Objects.equals(_psist13, other.getPsist13())) {
                return false;
            }
            if (!Objects.equals(_psist14, other.getPsist14())) {
                return false;
            }
            if (!Objects.equals(_psist15, other.getPsist15())) {
                return false;
            }
            if (!Objects.equals(_pwrStep, other.getPwrStep())) {
                return false;
            }
            if (!Objects.equals(_pwrStepIndb, other.getPwrStepIndb())) {
                return false;
            }
            if (!Objects.equals(_regPsist, other.getRegPsist())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanAccessParametersImpl otherImpl = (Cdma2000OneXRanAccessParametersImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanAccessParameters [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accTmo != null) {
                builder.append("_accTmo=");
                builder.append(_accTmo);
                builder.append(", ");
            }
            if (_apmAuth != null) {
                builder.append("_apmAuth=");
                builder.append(_apmAuth);
                builder.append(", ");
            }
            if (_apmRandUpdatePrd != null) {
                builder.append("_apmRandUpdatePrd=");
                builder.append(_apmRandUpdatePrd);
                builder.append(", ");
            }
            if (_bkoff != null) {
                builder.append("_bkoff=");
                builder.append(_bkoff);
                builder.append(", ");
            }
            if (_initPwr != null) {
                builder.append("_initPwr=");
                builder.append(_initPwr);
                builder.append(", ");
            }
            if (_initialpwr != null) {
                builder.append("_initialpwr=");
                builder.append(_initialpwr);
                builder.append(", ");
            }
            if (_maxCapSize != null) {
                builder.append("_maxCapSize=");
                builder.append(_maxCapSize);
                builder.append(", ");
            }
            if (_maxReqSeq != null) {
                builder.append("_maxReqSeq=");
                builder.append(_maxReqSeq);
                builder.append(", ");
            }
            if (_maxRspSeq != null) {
                builder.append("_maxRspSeq=");
                builder.append(_maxRspSeq);
                builder.append(", ");
            }
            if (_msgPsist != null) {
                builder.append("_msgPsist=");
                builder.append(_msgPsist);
                builder.append(", ");
            }
            if (_nomPwr != null) {
                builder.append("_nomPwr=");
                builder.append(_nomPwr);
                builder.append(", ");
            }
            if (_nomPwrExt != null) {
                builder.append("_nomPwrExt=");
                builder.append(_nomPwrExt);
                builder.append(", ");
            }
            if (_numStep != null) {
                builder.append("_numStep=");
                builder.append(_numStep);
                builder.append(", ");
            }
            if (_preambleSize != null) {
                builder.append("_preambleSize=");
                builder.append(_preambleSize);
                builder.append(", ");
            }
            if (_probeBkoff != null) {
                builder.append("_probeBkoff=");
                builder.append(_probeBkoff);
                builder.append(", ");
            }
            if (_probePnRan != null) {
                builder.append("_probePnRan=");
                builder.append(_probePnRan);
                builder.append(", ");
            }
            if (_psist09 != null) {
                builder.append("_psist09=");
                builder.append(_psist09);
                builder.append(", ");
            }
            if (_psist10 != null) {
                builder.append("_psist10=");
                builder.append(_psist10);
                builder.append(", ");
            }
            if (_psist11 != null) {
                builder.append("_psist11=");
                builder.append(_psist11);
                builder.append(", ");
            }
            if (_psist12 != null) {
                builder.append("_psist12=");
                builder.append(_psist12);
                builder.append(", ");
            }
            if (_psist13 != null) {
                builder.append("_psist13=");
                builder.append(_psist13);
                builder.append(", ");
            }
            if (_psist14 != null) {
                builder.append("_psist14=");
                builder.append(_psist14);
                builder.append(", ");
            }
            if (_psist15 != null) {
                builder.append("_psist15=");
                builder.append(_psist15);
                builder.append(", ");
            }
            if (_pwrStep != null) {
                builder.append("_pwrStep=");
                builder.append(_pwrStep);
                builder.append(", ");
            }
            if (_pwrStepIndb != null) {
                builder.append("_pwrStepIndb=");
                builder.append(_pwrStepIndb);
                builder.append(", ");
            }
            if (_regPsist != null) {
                builder.append("_regPsist=");
                builder.append(_regPsist);
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
