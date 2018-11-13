package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec
 *
 */
public class Cdma2000OneXRanAppimAppirecBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec> {

    private java.lang.String _alias;
    private java.lang.Short _apassntype;
    private java.lang.Short _apband;
    private java.lang.Short _apbandsameasprevious;
    private java.lang.Integer _apfreq;
    private java.lang.Short _apfreqsameasprevious;
    private java.lang.Integer _apnid;
    private java.lang.Short _apnidsameasprevious;
    private byte[] _appnrec;
    private java.lang.Short _appnreclen;
    private java.lang.Short _appnrecsameasprevious;
    private java.lang.Short _appnrectype;
    private java.lang.Integer _apsid;
    private java.lang.Short _apsidsameasprevious;
    private Cdma2000OneXRanAppimAppirecKey _key;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanAppimAppirecBuilder() {
    }
    public Cdma2000OneXRanAppimAppirecBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._apassntype = arg.getApassntype();
        this._apsidsameasprevious = arg.getApsidsameasprevious();
        this._apnidsameasprevious = arg.getApnidsameasprevious();
        this._apbandsameasprevious = arg.getApbandsameasprevious();
        this._apfreqsameasprevious = arg.getApfreqsameasprevious();
        this._appnrecsameasprevious = arg.getAppnrecsameasprevious();
        this._apsid = arg.getApsid();
        this._apnid = arg.getApnid();
        this._apband = arg.getApband();
        this._apfreq = arg.getApfreq();
        this._appnrectype = arg.getAppnrectype();
        this._appnreclen = arg.getAppnreclen();
        this._appnrec = arg.getAppnrec();
    }

    public Cdma2000OneXRanAppimAppirecBuilder(Cdma2000OneXRanAppimAppirec base) {
        if (base.getKey() == null) {
            this._key = new Cdma2000OneXRanAppimAppirecKey(
                base.getApband(), 
                base.getApfreq(), 
                base.getApnid(), 
                base.getAppnrec(), 
                base.getAppnreclen(), 
                base.getAppnrectype(), 
                base.getApsid()
            );
            this._apband = base.getApband();
            this._apfreq = base.getApfreq();
            this._apnid = base.getApnid();
            this._appnrec = base.getAppnrec();
            this._appnreclen = base.getAppnreclen();
            this._appnrectype = base.getAppnrectype();
            this._apsid = base.getApsid();
        } else {
            this._key = base.getKey();
            this._apband = _key.getApband();
            this._apfreq = _key.getApfreq();
            this._apnid = _key.getApnid();
            this._appnrec = _key.getAppnrec();
            this._appnreclen = _key.getAppnreclen();
            this._appnrectype = _key.getAppnrectype();
            this._apsid = _key.getApsid();
        }
        this._alias = base.getAlias();
        this._apassntype = base.getApassntype();
        this._apbandsameasprevious = base.getApbandsameasprevious();
        this._apfreqsameasprevious = base.getApfreqsameasprevious();
        this._apnidsameasprevious = base.getApnidsameasprevious();
        this._appnrecsameasprevious = base.getAppnrecsameasprevious();
        this._apsidsameasprevious = base.getApsidsameasprevious();
        this._enable = base.isEnable();
        if (base instanceof Cdma2000OneXRanAppimAppirecImpl) {
            Cdma2000OneXRanAppimAppirecImpl impl = (Cdma2000OneXRanAppimAppirecImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getAlias();
            this._apassntype = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getApassntype();
            this._apsidsameasprevious = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getApsidsameasprevious();
            this._apnidsameasprevious = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getApnidsameasprevious();
            this._apbandsameasprevious = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getApbandsameasprevious();
            this._apfreqsameasprevious = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getApfreqsameasprevious();
            this._appnrecsameasprevious = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getAppnrecsameasprevious();
            this._apsid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getApsid();
            this._apnid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getApnid();
            this._apband = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getApband();
            this._apfreq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getApfreq();
            this._appnrectype = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getAppnrectype();
            this._appnreclen = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getAppnreclen();
            this._appnrec = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG)arg).getAppnrec();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.Short getApassntype() {
        return _apassntype;
    }
    
    public java.lang.Short getApband() {
        return _apband;
    }
    
    public java.lang.Short getApbandsameasprevious() {
        return _apbandsameasprevious;
    }
    
    public java.lang.Integer getApfreq() {
        return _apfreq;
    }
    
    public java.lang.Short getApfreqsameasprevious() {
        return _apfreqsameasprevious;
    }
    
    public java.lang.Integer getApnid() {
        return _apnid;
    }
    
    public java.lang.Short getApnidsameasprevious() {
        return _apnidsameasprevious;
    }
    
    public byte[] getAppnrec() {
        return _appnrec == null ? null : _appnrec.clone();
    }
    
    public java.lang.Short getAppnreclen() {
        return _appnreclen;
    }
    
    public java.lang.Short getAppnrecsameasprevious() {
        return _appnrecsameasprevious;
    }
    
    public java.lang.Short getAppnrectype() {
        return _appnrectype;
    }
    
    public java.lang.Integer getApsid() {
        return _apsid;
    }
    
    public java.lang.Short getApsidsameasprevious() {
        return _apsidsameasprevious;
    }
    
    public Cdma2000OneXRanAppimAppirecKey getKey() {
        return _key;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_aliasLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..64]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
     private static void checkApassntypeRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setApassntype(final java.lang.Short value) {
    if (value != null) {
        checkApassntypeRange(value);
    }
        this._apassntype = value;
        return this;
    }
    
     
     private static void checkApbandRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setApband(final java.lang.Short value) {
    if (value != null) {
        checkApbandRange(value);
    }
        this._apband = value;
        return this;
    }
    
     
     private static void checkApbandsameaspreviousRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setApbandsameasprevious(final java.lang.Short value) {
    if (value != null) {
        checkApbandsameaspreviousRange(value);
    }
        this._apbandsameasprevious = value;
        return this;
    }
    
     
     private static void checkApfreqRange(final int value) {
         if (value >= 0 && value <= 2047) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..2047]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setApfreq(final java.lang.Integer value) {
    if (value != null) {
        checkApfreqRange(value);
    }
        this._apfreq = value;
        return this;
    }
    
     
     private static void checkApfreqsameaspreviousRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setApfreqsameasprevious(final java.lang.Short value) {
    if (value != null) {
        checkApfreqsameaspreviousRange(value);
    }
        this._apfreqsameasprevious = value;
        return this;
    }
    
     
     private static void checkApnidRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setApnid(final java.lang.Integer value) {
    if (value != null) {
        checkApnidRange(value);
    }
        this._apnid = value;
        return this;
    }
    
     
     private static void checkApnidsameaspreviousRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setApnidsameasprevious(final java.lang.Short value) {
    if (value != null) {
        checkApnidsameaspreviousRange(value);
    }
        this._apnidsameasprevious = value;
        return this;
    }
    
     
     private static void check_appnrecLength(final byte[] value) {
         final int length = value.length;
         if (length >= 0 && length <= 31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..31]].", java.util.Arrays.toString(value)));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setAppnrec(final byte[] value) {
    if (value != null) {
        check_appnrecLength(value);
    }
        this._appnrec = value;
        return this;
    }
    
     
     private static void checkAppnreclenRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setAppnreclen(final java.lang.Short value) {
    if (value != null) {
        checkAppnreclenRange(value);
    }
        this._appnreclen = value;
        return this;
    }
    
     
     private static void checkAppnrecsameaspreviousRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setAppnrecsameasprevious(final java.lang.Short value) {
    if (value != null) {
        checkAppnrecsameaspreviousRange(value);
    }
        this._appnrecsameasprevious = value;
        return this;
    }
    
     
     private static void checkAppnrectypeRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setAppnrectype(final java.lang.Short value) {
    if (value != null) {
        checkAppnrectypeRange(value);
    }
        this._appnrectype = value;
        return this;
    }
    
     
     private static void checkApsidRange(final int value) {
         if (value >= 0 && value <= 32767) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..32767]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setApsid(final java.lang.Integer value) {
    if (value != null) {
        checkApsidRange(value);
    }
        this._apsid = value;
        return this;
    }
    
     
     private static void checkApsidsameaspreviousRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXRanAppimAppirecBuilder setApsidsameasprevious(final java.lang.Short value) {
    if (value != null) {
        checkApsidsameaspreviousRange(value);
    }
        this._apsidsameasprevious = value;
        return this;
    }
    
     
    public Cdma2000OneXRanAppimAppirecBuilder setKey(final Cdma2000OneXRanAppimAppirecKey value) {
        this._key = value;
        return this;
    }
    
     
    public Cdma2000OneXRanAppimAppirecBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public Cdma2000OneXRanAppimAppirecBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanAppimAppirecBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanAppimAppirec build() {
        return new Cdma2000OneXRanAppimAppirecImpl(this);
    }

    private static final class Cdma2000OneXRanAppimAppirecImpl implements Cdma2000OneXRanAppimAppirec {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec.class;
        }

        private final java.lang.String _alias;
        private final java.lang.Short _apassntype;
        private final java.lang.Short _apband;
        private final java.lang.Short _apbandsameasprevious;
        private final java.lang.Integer _apfreq;
        private final java.lang.Short _apfreqsameasprevious;
        private final java.lang.Integer _apnid;
        private final java.lang.Short _apnidsameasprevious;
        private final byte[] _appnrec;
        private final java.lang.Short _appnreclen;
        private final java.lang.Short _appnrecsameasprevious;
        private final java.lang.Short _appnrectype;
        private final java.lang.Integer _apsid;
        private final java.lang.Short _apsidsameasprevious;
        private final Cdma2000OneXRanAppimAppirecKey _key;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanAppimAppirecImpl(Cdma2000OneXRanAppimAppirecBuilder base) {
            if (base.getKey() == null) {
                this._key = new Cdma2000OneXRanAppimAppirecKey(
                    base.getApband(), 
                    base.getApfreq(), 
                    base.getApnid(), 
                    base.getAppnrec(), 
                    base.getAppnreclen(), 
                    base.getAppnrectype(), 
                    base.getApsid()
                );
                this._apband = base.getApband();
                this._apfreq = base.getApfreq();
                this._apnid = base.getApnid();
                this._appnrec = base.getAppnrec();
                this._appnreclen = base.getAppnreclen();
                this._appnrectype = base.getAppnrectype();
                this._apsid = base.getApsid();
            } else {
                this._key = base.getKey();
                this._apband = _key.getApband();
                this._apfreq = _key.getApfreq();
                this._apnid = _key.getApnid();
                this._appnrec = _key.getAppnrec();
                this._appnreclen = _key.getAppnreclen();
                this._appnrectype = _key.getAppnrectype();
                this._apsid = _key.getApsid();
            }
            this._alias = base.getAlias();
            this._apassntype = base.getApassntype();
            this._apbandsameasprevious = base.getApbandsameasprevious();
            this._apfreqsameasprevious = base.getApfreqsameasprevious();
            this._apnidsameasprevious = base.getApnidsameasprevious();
            this._appnrecsameasprevious = base.getAppnrecsameasprevious();
            this._apsidsameasprevious = base.getApsidsameasprevious();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAlias() {
            return _alias;
        }
        
        @Override
        public java.lang.Short getApassntype() {
            return _apassntype;
        }
        
        @Override
        public java.lang.Short getApband() {
            return _apband;
        }
        
        @Override
        public java.lang.Short getApbandsameasprevious() {
            return _apbandsameasprevious;
        }
        
        @Override
        public java.lang.Integer getApfreq() {
            return _apfreq;
        }
        
        @Override
        public java.lang.Short getApfreqsameasprevious() {
            return _apfreqsameasprevious;
        }
        
        @Override
        public java.lang.Integer getApnid() {
            return _apnid;
        }
        
        @Override
        public java.lang.Short getApnidsameasprevious() {
            return _apnidsameasprevious;
        }
        
        @Override
        public byte[] getAppnrec() {
            return _appnrec == null ? null : _appnrec.clone();
        }
        
        @Override
        public java.lang.Short getAppnreclen() {
            return _appnreclen;
        }
        
        @Override
        public java.lang.Short getAppnrecsameasprevious() {
            return _appnrecsameasprevious;
        }
        
        @Override
        public java.lang.Short getAppnrectype() {
            return _appnrectype;
        }
        
        @Override
        public java.lang.Integer getApsid() {
            return _apsid;
        }
        
        @Override
        public java.lang.Short getApsidsameasprevious() {
            return _apsidsameasprevious;
        }
        
        @Override
        public Cdma2000OneXRanAppimAppirecKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_alias);
            result = prime * result + Objects.hashCode(_apassntype);
            result = prime * result + Objects.hashCode(_apband);
            result = prime * result + Objects.hashCode(_apbandsameasprevious);
            result = prime * result + Objects.hashCode(_apfreq);
            result = prime * result + Objects.hashCode(_apfreqsameasprevious);
            result = prime * result + Objects.hashCode(_apnid);
            result = prime * result + Objects.hashCode(_apnidsameasprevious);
            result = prime * result + Arrays.hashCode(_appnrec);
            result = prime * result + Objects.hashCode(_appnreclen);
            result = prime * result + Objects.hashCode(_appnrecsameasprevious);
            result = prime * result + Objects.hashCode(_appnrectype);
            result = prime * result + Objects.hashCode(_apsid);
            result = prime * result + Objects.hashCode(_apsidsameasprevious);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_enable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_apassntype, other.getApassntype())) {
                return false;
            }
            if (!Objects.equals(_apband, other.getApband())) {
                return false;
            }
            if (!Objects.equals(_apbandsameasprevious, other.getApbandsameasprevious())) {
                return false;
            }
            if (!Objects.equals(_apfreq, other.getApfreq())) {
                return false;
            }
            if (!Objects.equals(_apfreqsameasprevious, other.getApfreqsameasprevious())) {
                return false;
            }
            if (!Objects.equals(_apnid, other.getApnid())) {
                return false;
            }
            if (!Objects.equals(_apnidsameasprevious, other.getApnidsameasprevious())) {
                return false;
            }
            if (!Arrays.equals(_appnrec, other.getAppnrec())) {
                return false;
            }
            if (!Objects.equals(_appnreclen, other.getAppnreclen())) {
                return false;
            }
            if (!Objects.equals(_appnrecsameasprevious, other.getAppnrecsameasprevious())) {
                return false;
            }
            if (!Objects.equals(_appnrectype, other.getAppnrectype())) {
                return false;
            }
            if (!Objects.equals(_apsid, other.getApsid())) {
                return false;
            }
            if (!Objects.equals(_apsidsameasprevious, other.getApsidsameasprevious())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanAppimAppirecImpl otherImpl = (Cdma2000OneXRanAppimAppirecImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanAppimAppirec [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_apassntype != null) {
                builder.append("_apassntype=");
                builder.append(_apassntype);
                builder.append(", ");
            }
            if (_apband != null) {
                builder.append("_apband=");
                builder.append(_apband);
                builder.append(", ");
            }
            if (_apbandsameasprevious != null) {
                builder.append("_apbandsameasprevious=");
                builder.append(_apbandsameasprevious);
                builder.append(", ");
            }
            if (_apfreq != null) {
                builder.append("_apfreq=");
                builder.append(_apfreq);
                builder.append(", ");
            }
            if (_apfreqsameasprevious != null) {
                builder.append("_apfreqsameasprevious=");
                builder.append(_apfreqsameasprevious);
                builder.append(", ");
            }
            if (_apnid != null) {
                builder.append("_apnid=");
                builder.append(_apnid);
                builder.append(", ");
            }
            if (_apnidsameasprevious != null) {
                builder.append("_apnidsameasprevious=");
                builder.append(_apnidsameasprevious);
                builder.append(", ");
            }
            if (_appnrec != null) {
                builder.append("_appnrec=");
                builder.append(Arrays.toString(_appnrec));
                builder.append(", ");
            }
            if (_appnreclen != null) {
                builder.append("_appnreclen=");
                builder.append(_appnreclen);
                builder.append(", ");
            }
            if (_appnrecsameasprevious != null) {
                builder.append("_appnrecsameasprevious=");
                builder.append(_appnrecsameasprevious);
                builder.append(", ");
            }
            if (_appnrectype != null) {
                builder.append("_appnrectype=");
                builder.append(_appnrectype);
                builder.append(", ");
            }
            if (_apsid != null) {
                builder.append("_apsid=");
                builder.append(_apsid);
                builder.append(", ");
            }
            if (_apsidsameasprevious != null) {
                builder.append("_apsidsameasprevious=");
                builder.append(_apsidsameasprevious);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_enable != null) {
                builder.append("_enable=");
                builder.append(_enable);
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
