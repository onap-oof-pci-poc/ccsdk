package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm
 *
 */
public class Cdma2000OneXRanApidmBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm> {

    private byte[] _apid;
    private java.lang.Short _apidlen;
    private java.lang.Short _apidmask;
    private java.lang.Short _associationType;
    private java.lang.Short _interfreqhohys;
    private java.lang.Short _interfreqhoslope;
    private java.lang.Short _interfreqsrchth;
    private java.lang.Short _intrafreqhohys;
    private java.lang.Short _intrafreqhoslope;
    private java.lang.Integer _ioscellid;
    private java.lang.Long _iosmscid;
    private java.lang.Boolean _interfreqhohysincl;
    private java.lang.Boolean _interfreqhoslopeincl;
    private java.lang.Boolean _interfreqsrchthincl;
    private java.lang.Boolean _intrafreqhohysincl;
    private java.lang.Boolean _intrafreqhoslopeincl;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanApidmBuilder() {
    }
    public Cdma2000OneXRanApidmBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG arg) {
        this._associationType = arg.getAssociationType();
        this._apidlen = arg.getApidlen();
        this._apid = arg.getApid();
        this._apidmask = arg.getApidmask();
        this._iosmscid = arg.getIosmscid();
        this._ioscellid = arg.getIoscellid();
        this._intrafreqhohysincl = arg.isIntrafreqhohysincl();
        this._intrafreqhohys = arg.getIntrafreqhohys();
        this._intrafreqhoslopeincl = arg.isIntrafreqhoslopeincl();
        this._intrafreqhoslope = arg.getIntrafreqhoslope();
        this._interfreqhohysincl = arg.isInterfreqhohysincl();
        this._interfreqhohys = arg.getInterfreqhohys();
        this._interfreqhoslopeincl = arg.isInterfreqhoslopeincl();
        this._interfreqhoslope = arg.getInterfreqhoslope();
        this._interfreqsrchthincl = arg.isInterfreqsrchthincl();
        this._interfreqsrchth = arg.getInterfreqsrchth();
    }

    public Cdma2000OneXRanApidmBuilder(Cdma2000OneXRanApidm base) {
        this._apid = base.getApid();
        this._apidlen = base.getApidlen();
        this._apidmask = base.getApidmask();
        this._associationType = base.getAssociationType();
        this._interfreqhohys = base.getInterfreqhohys();
        this._interfreqhoslope = base.getInterfreqhoslope();
        this._interfreqsrchth = base.getInterfreqsrchth();
        this._intrafreqhohys = base.getIntrafreqhohys();
        this._intrafreqhoslope = base.getIntrafreqhoslope();
        this._ioscellid = base.getIoscellid();
        this._iosmscid = base.getIosmscid();
        this._interfreqhohysincl = base.isInterfreqhohysincl();
        this._interfreqhoslopeincl = base.isInterfreqhoslopeincl();
        this._interfreqsrchthincl = base.isInterfreqsrchthincl();
        this._intrafreqhohysincl = base.isIntrafreqhohysincl();
        this._intrafreqhoslopeincl = base.isIntrafreqhoslopeincl();
        if (base instanceof Cdma2000OneXRanApidmImpl) {
            Cdma2000OneXRanApidmImpl impl = (Cdma2000OneXRanApidmImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG) {
            this._associationType = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getAssociationType();
            this._apidlen = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getApidlen();
            this._apid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getApid();
            this._apidmask = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getApidmask();
            this._iosmscid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getIosmscid();
            this._ioscellid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getIoscellid();
            this._intrafreqhohysincl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).isIntrafreqhohysincl();
            this._intrafreqhohys = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getIntrafreqhohys();
            this._intrafreqhoslopeincl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).isIntrafreqhoslopeincl();
            this._intrafreqhoslope = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getIntrafreqhoslope();
            this._interfreqhohysincl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).isInterfreqhohysincl();
            this._interfreqhohys = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getInterfreqhohys();
            this._interfreqhoslopeincl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).isInterfreqhoslopeincl();
            this._interfreqhoslope = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getInterfreqhoslope();
            this._interfreqsrchthincl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).isInterfreqsrchthincl();
            this._interfreqsrchth = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG)arg).getInterfreqsrchth();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG] \n" +
              "but was: " + arg
            );
        }
    }

    public byte[] getApid() {
        return _apid == null ? null : _apid.clone();
    }
    
    public java.lang.Short getApidlen() {
        return _apidlen;
    }
    
    public java.lang.Short getApidmask() {
        return _apidmask;
    }
    
    public java.lang.Short getAssociationType() {
        return _associationType;
    }
    
    public java.lang.Short getInterfreqhohys() {
        return _interfreqhohys;
    }
    
    public java.lang.Short getInterfreqhoslope() {
        return _interfreqhoslope;
    }
    
    public java.lang.Short getInterfreqsrchth() {
        return _interfreqsrchth;
    }
    
    public java.lang.Short getIntrafreqhohys() {
        return _intrafreqhohys;
    }
    
    public java.lang.Short getIntrafreqhoslope() {
        return _intrafreqhoslope;
    }
    
    public java.lang.Integer getIoscellid() {
        return _ioscellid;
    }
    
    public java.lang.Long getIosmscid() {
        return _iosmscid;
    }
    
    public java.lang.Boolean isInterfreqhohysincl() {
        return _interfreqhohysincl;
    }
    
    public java.lang.Boolean isInterfreqhoslopeincl() {
        return _interfreqhoslopeincl;
    }
    
    public java.lang.Boolean isInterfreqsrchthincl() {
        return _interfreqsrchthincl;
    }
    
    public java.lang.Boolean isIntrafreqhohysincl() {
        return _intrafreqhohysincl;
    }
    
    public java.lang.Boolean isIntrafreqhoslopeincl() {
        return _intrafreqhoslopeincl;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_apidLength(final byte[] value) {
         final int length = value.length;
         if (length >= 0 && length <= 16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..16]].", java.util.Arrays.toString(value)));
     }
    
    public Cdma2000OneXRanApidmBuilder setApid(final byte[] value) {
    if (value != null) {
        check_apidLength(value);
    }
        this._apid = value;
        return this;
    }
    
     
     private static void checkApidlenRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanApidmBuilder setApidlen(final java.lang.Short value) {
    if (value != null) {
        checkApidlenRange(value);
    }
        this._apidlen = value;
        return this;
    }
    
     
     private static void checkApidmaskRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public Cdma2000OneXRanApidmBuilder setApidmask(final java.lang.Short value) {
    if (value != null) {
        checkApidmaskRange(value);
    }
        this._apidmask = value;
        return this;
    }
    
     
     private static void checkAssociationTypeRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public Cdma2000OneXRanApidmBuilder setAssociationType(final java.lang.Short value) {
    if (value != null) {
        checkAssociationTypeRange(value);
    }
        this._associationType = value;
        return this;
    }
    
     
     private static void checkInterfreqhohysRange(final short value) {
         if (value >= (short)0 && value <= (short)127) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..127]].", value));
     }
    
    public Cdma2000OneXRanApidmBuilder setInterfreqhohys(final java.lang.Short value) {
    if (value != null) {
        checkInterfreqhohysRange(value);
    }
        this._interfreqhohys = value;
        return this;
    }
    
     
     private static void checkInterfreqhoslopeRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanApidmBuilder setInterfreqhoslope(final java.lang.Short value) {
    if (value != null) {
        checkInterfreqhoslopeRange(value);
    }
        this._interfreqhoslope = value;
        return this;
    }
    
     
     private static void checkInterfreqsrchthRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public Cdma2000OneXRanApidmBuilder setInterfreqsrchth(final java.lang.Short value) {
    if (value != null) {
        checkInterfreqsrchthRange(value);
    }
        this._interfreqsrchth = value;
        return this;
    }
    
     
     private static void checkIntrafreqhohysRange(final short value) {
         if (value >= (short)0 && value <= (short)127) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..127]].", value));
     }
    
    public Cdma2000OneXRanApidmBuilder setIntrafreqhohys(final java.lang.Short value) {
    if (value != null) {
        checkIntrafreqhohysRange(value);
    }
        this._intrafreqhohys = value;
        return this;
    }
    
     
     private static void checkIntrafreqhoslopeRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public Cdma2000OneXRanApidmBuilder setIntrafreqhoslope(final java.lang.Short value) {
    if (value != null) {
        checkIntrafreqhoslopeRange(value);
    }
        this._intrafreqhoslope = value;
        return this;
    }
    
     
     private static void checkIoscellidRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public Cdma2000OneXRanApidmBuilder setIoscellid(final java.lang.Integer value) {
    if (value != null) {
        checkIoscellidRange(value);
    }
        this._ioscellid = value;
        return this;
    }
    
     
     private static void checkIosmscidRange(final long value) {
         if (value >= 0L && value <= 16777215L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..16777215]].", value));
     }
    
    public Cdma2000OneXRanApidmBuilder setIosmscid(final java.lang.Long value) {
    if (value != null) {
        checkIosmscidRange(value);
    }
        this._iosmscid = value;
        return this;
    }
    
     
    public Cdma2000OneXRanApidmBuilder setInterfreqhohysincl(final java.lang.Boolean value) {
        this._interfreqhohysincl = value;
        return this;
    }
    
     
    public Cdma2000OneXRanApidmBuilder setInterfreqhoslopeincl(final java.lang.Boolean value) {
        this._interfreqhoslopeincl = value;
        return this;
    }
    
     
    public Cdma2000OneXRanApidmBuilder setInterfreqsrchthincl(final java.lang.Boolean value) {
        this._interfreqsrchthincl = value;
        return this;
    }
    
     
    public Cdma2000OneXRanApidmBuilder setIntrafreqhohysincl(final java.lang.Boolean value) {
        this._intrafreqhohysincl = value;
        return this;
    }
    
     
    public Cdma2000OneXRanApidmBuilder setIntrafreqhoslopeincl(final java.lang.Boolean value) {
        this._intrafreqhoslopeincl = value;
        return this;
    }
    
    public Cdma2000OneXRanApidmBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanApidmBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanApidm build() {
        return new Cdma2000OneXRanApidmImpl(this);
    }

    private static final class Cdma2000OneXRanApidmImpl implements Cdma2000OneXRanApidm {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm.class;
        }

        private final byte[] _apid;
        private final java.lang.Short _apidlen;
        private final java.lang.Short _apidmask;
        private final java.lang.Short _associationType;
        private final java.lang.Short _interfreqhohys;
        private final java.lang.Short _interfreqhoslope;
        private final java.lang.Short _interfreqsrchth;
        private final java.lang.Short _intrafreqhohys;
        private final java.lang.Short _intrafreqhoslope;
        private final java.lang.Integer _ioscellid;
        private final java.lang.Long _iosmscid;
        private final java.lang.Boolean _interfreqhohysincl;
        private final java.lang.Boolean _interfreqhoslopeincl;
        private final java.lang.Boolean _interfreqsrchthincl;
        private final java.lang.Boolean _intrafreqhohysincl;
        private final java.lang.Boolean _intrafreqhoslopeincl;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanApidmImpl(Cdma2000OneXRanApidmBuilder base) {
            this._apid = base.getApid();
            this._apidlen = base.getApidlen();
            this._apidmask = base.getApidmask();
            this._associationType = base.getAssociationType();
            this._interfreqhohys = base.getInterfreqhohys();
            this._interfreqhoslope = base.getInterfreqhoslope();
            this._interfreqsrchth = base.getInterfreqsrchth();
            this._intrafreqhohys = base.getIntrafreqhohys();
            this._intrafreqhoslope = base.getIntrafreqhoslope();
            this._ioscellid = base.getIoscellid();
            this._iosmscid = base.getIosmscid();
            this._interfreqhohysincl = base.isInterfreqhohysincl();
            this._interfreqhoslopeincl = base.isInterfreqhoslopeincl();
            this._interfreqsrchthincl = base.isInterfreqsrchthincl();
            this._intrafreqhohysincl = base.isIntrafreqhohysincl();
            this._intrafreqhoslopeincl = base.isIntrafreqhoslopeincl();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public byte[] getApid() {
            return _apid == null ? null : _apid.clone();
        }
        
        @Override
        public java.lang.Short getApidlen() {
            return _apidlen;
        }
        
        @Override
        public java.lang.Short getApidmask() {
            return _apidmask;
        }
        
        @Override
        public java.lang.Short getAssociationType() {
            return _associationType;
        }
        
        @Override
        public java.lang.Short getInterfreqhohys() {
            return _interfreqhohys;
        }
        
        @Override
        public java.lang.Short getInterfreqhoslope() {
            return _interfreqhoslope;
        }
        
        @Override
        public java.lang.Short getInterfreqsrchth() {
            return _interfreqsrchth;
        }
        
        @Override
        public java.lang.Short getIntrafreqhohys() {
            return _intrafreqhohys;
        }
        
        @Override
        public java.lang.Short getIntrafreqhoslope() {
            return _intrafreqhoslope;
        }
        
        @Override
        public java.lang.Integer getIoscellid() {
            return _ioscellid;
        }
        
        @Override
        public java.lang.Long getIosmscid() {
            return _iosmscid;
        }
        
        @Override
        public java.lang.Boolean isInterfreqhohysincl() {
            return _interfreqhohysincl;
        }
        
        @Override
        public java.lang.Boolean isInterfreqhoslopeincl() {
            return _interfreqhoslopeincl;
        }
        
        @Override
        public java.lang.Boolean isInterfreqsrchthincl() {
            return _interfreqsrchthincl;
        }
        
        @Override
        public java.lang.Boolean isIntrafreqhohysincl() {
            return _intrafreqhohysincl;
        }
        
        @Override
        public java.lang.Boolean isIntrafreqhoslopeincl() {
            return _intrafreqhoslopeincl;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Arrays.hashCode(_apid);
            result = prime * result + Objects.hashCode(_apidlen);
            result = prime * result + Objects.hashCode(_apidmask);
            result = prime * result + Objects.hashCode(_associationType);
            result = prime * result + Objects.hashCode(_interfreqhohys);
            result = prime * result + Objects.hashCode(_interfreqhoslope);
            result = prime * result + Objects.hashCode(_interfreqsrchth);
            result = prime * result + Objects.hashCode(_intrafreqhohys);
            result = prime * result + Objects.hashCode(_intrafreqhoslope);
            result = prime * result + Objects.hashCode(_ioscellid);
            result = prime * result + Objects.hashCode(_iosmscid);
            result = prime * result + Objects.hashCode(_interfreqhohysincl);
            result = prime * result + Objects.hashCode(_interfreqhoslopeincl);
            result = prime * result + Objects.hashCode(_interfreqsrchthincl);
            result = prime * result + Objects.hashCode(_intrafreqhohysincl);
            result = prime * result + Objects.hashCode(_intrafreqhoslopeincl);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm)obj;
            if (!Arrays.equals(_apid, other.getApid())) {
                return false;
            }
            if (!Objects.equals(_apidlen, other.getApidlen())) {
                return false;
            }
            if (!Objects.equals(_apidmask, other.getApidmask())) {
                return false;
            }
            if (!Objects.equals(_associationType, other.getAssociationType())) {
                return false;
            }
            if (!Objects.equals(_interfreqhohys, other.getInterfreqhohys())) {
                return false;
            }
            if (!Objects.equals(_interfreqhoslope, other.getInterfreqhoslope())) {
                return false;
            }
            if (!Objects.equals(_interfreqsrchth, other.getInterfreqsrchth())) {
                return false;
            }
            if (!Objects.equals(_intrafreqhohys, other.getIntrafreqhohys())) {
                return false;
            }
            if (!Objects.equals(_intrafreqhoslope, other.getIntrafreqhoslope())) {
                return false;
            }
            if (!Objects.equals(_ioscellid, other.getIoscellid())) {
                return false;
            }
            if (!Objects.equals(_iosmscid, other.getIosmscid())) {
                return false;
            }
            if (!Objects.equals(_interfreqhohysincl, other.isInterfreqhohysincl())) {
                return false;
            }
            if (!Objects.equals(_interfreqhoslopeincl, other.isInterfreqhoslopeincl())) {
                return false;
            }
            if (!Objects.equals(_interfreqsrchthincl, other.isInterfreqsrchthincl())) {
                return false;
            }
            if (!Objects.equals(_intrafreqhohysincl, other.isIntrafreqhohysincl())) {
                return false;
            }
            if (!Objects.equals(_intrafreqhoslopeincl, other.isIntrafreqhoslopeincl())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanApidmImpl otherImpl = (Cdma2000OneXRanApidmImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanApidm [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_apid != null) {
                builder.append("_apid=");
                builder.append(Arrays.toString(_apid));
                builder.append(", ");
            }
            if (_apidlen != null) {
                builder.append("_apidlen=");
                builder.append(_apidlen);
                builder.append(", ");
            }
            if (_apidmask != null) {
                builder.append("_apidmask=");
                builder.append(_apidmask);
                builder.append(", ");
            }
            if (_associationType != null) {
                builder.append("_associationType=");
                builder.append(_associationType);
                builder.append(", ");
            }
            if (_interfreqhohys != null) {
                builder.append("_interfreqhohys=");
                builder.append(_interfreqhohys);
                builder.append(", ");
            }
            if (_interfreqhoslope != null) {
                builder.append("_interfreqhoslope=");
                builder.append(_interfreqhoslope);
                builder.append(", ");
            }
            if (_interfreqsrchth != null) {
                builder.append("_interfreqsrchth=");
                builder.append(_interfreqsrchth);
                builder.append(", ");
            }
            if (_intrafreqhohys != null) {
                builder.append("_intrafreqhohys=");
                builder.append(_intrafreqhohys);
                builder.append(", ");
            }
            if (_intrafreqhoslope != null) {
                builder.append("_intrafreqhoslope=");
                builder.append(_intrafreqhoslope);
                builder.append(", ");
            }
            if (_ioscellid != null) {
                builder.append("_ioscellid=");
                builder.append(_ioscellid);
                builder.append(", ");
            }
            if (_iosmscid != null) {
                builder.append("_iosmscid=");
                builder.append(_iosmscid);
                builder.append(", ");
            }
            if (_interfreqhohysincl != null) {
                builder.append("_interfreqhohysincl=");
                builder.append(_interfreqhohysincl);
                builder.append(", ");
            }
            if (_interfreqhoslopeincl != null) {
                builder.append("_interfreqhoslopeincl=");
                builder.append(_interfreqhoslopeincl);
                builder.append(", ");
            }
            if (_interfreqsrchthincl != null) {
                builder.append("_interfreqsrchthincl=");
                builder.append(_interfreqsrchthincl);
                builder.append(", ");
            }
            if (_intrafreqhohysincl != null) {
                builder.append("_intrafreqhohysincl=");
                builder.append(_intrafreqhohysincl);
                builder.append(", ");
            }
            if (_intrafreqhoslopeincl != null) {
                builder.append("_intrafreqhoslopeincl=");
                builder.append(_intrafreqhoslopeincl);
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
