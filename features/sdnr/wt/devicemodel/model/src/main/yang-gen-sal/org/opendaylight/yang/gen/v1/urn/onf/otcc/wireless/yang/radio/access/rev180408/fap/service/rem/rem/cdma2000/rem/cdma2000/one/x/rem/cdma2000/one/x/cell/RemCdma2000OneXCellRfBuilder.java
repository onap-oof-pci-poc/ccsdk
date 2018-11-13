package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf
 *
 */
public class RemCdma2000OneXCellRfBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf> {

    private java.lang.Long _band;
    private java.lang.Long _io;
    private java.lang.Integer _pIlotPn;
    private BigInteger _pIlotPnPhase;
    private java.lang.Long _pilotStrengthEcp;
    private java.lang.Long _pilotStrengthEcpIo;
    private java.lang.Integer _rfcnfl;
    private java.lang.Boolean _overheadsAvailable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>> augmentation = Collections.emptyMap();

    public RemCdma2000OneXCellRfBuilder() {
    }
    public RemCdma2000OneXCellRfBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG arg) {
        this._band = arg.getBand();
        this._rfcnfl = arg.getRfcnfl();
        this._io = arg.getIo();
        this._pIlotPn = arg.getPIlotPn();
        this._pIlotPnPhase = arg.getPIlotPnPhase();
        this._pilotStrengthEcp = arg.getPilotStrengthEcp();
        this._pilotStrengthEcpIo = arg.getPilotStrengthEcpIo();
        this._overheadsAvailable = arg.isOverheadsAvailable();
    }

    public RemCdma2000OneXCellRfBuilder(RemCdma2000OneXCellRf base) {
        this._band = base.getBand();
        this._io = base.getIo();
        this._pIlotPn = base.getPIlotPn();
        this._pIlotPnPhase = base.getPIlotPnPhase();
        this._pilotStrengthEcp = base.getPilotStrengthEcp();
        this._pilotStrengthEcpIo = base.getPilotStrengthEcpIo();
        this._rfcnfl = base.getRfcnfl();
        this._overheadsAvailable = base.isOverheadsAvailable();
        if (base instanceof RemCdma2000OneXCellRfImpl) {
            RemCdma2000OneXCellRfImpl impl = (RemCdma2000OneXCellRfImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG) {
            this._band = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG)arg).getBand();
            this._rfcnfl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG)arg).getRfcnfl();
            this._io = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG)arg).getIo();
            this._pIlotPn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG)arg).getPIlotPn();
            this._pIlotPnPhase = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG)arg).getPIlotPnPhase();
            this._pilotStrengthEcp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG)arg).getPilotStrengthEcp();
            this._pilotStrengthEcpIo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG)arg).getPilotStrengthEcpIo();
            this._overheadsAvailable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG)arg).isOverheadsAvailable();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellRfG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getBand() {
        return _band;
    }
    
    public java.lang.Long getIo() {
        return _io;
    }
    
    public java.lang.Integer getPIlotPn() {
        return _pIlotPn;
    }
    
    public BigInteger getPIlotPnPhase() {
        return _pIlotPnPhase;
    }
    
    public java.lang.Long getPilotStrengthEcp() {
        return _pilotStrengthEcp;
    }
    
    public java.lang.Long getPilotStrengthEcpIo() {
        return _pilotStrengthEcpIo;
    }
    
    public java.lang.Integer getRfcnfl() {
        return _rfcnfl;
    }
    
    public java.lang.Boolean isOverheadsAvailable() {
        return _overheadsAvailable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemCdma2000OneXCellRfBuilder setBand(final java.lang.Long value) {
        this._band = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellRfBuilder setIo(final java.lang.Long value) {
        this._io = value;
        return this;
    }
    
     
     private static void checkPIlotPnRange(final int value) {
         if (value >= 0 && value <= 511) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..511]].", value));
     }
    
    public RemCdma2000OneXCellRfBuilder setPIlotPn(final java.lang.Integer value) {
    if (value != null) {
        checkPIlotPnRange(value);
    }
        this._pIlotPn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKPILOTPNPHASERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKPILOTPNPHASERANGE_RANGES = a;
     }
     private static void checkPIlotPnPhaseRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKPILOTPNPHASERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKPILOTPNPHASERANGE_RANGES)));
     }
    
    public RemCdma2000OneXCellRfBuilder setPIlotPnPhase(final BigInteger value) {
    if (value != null) {
        checkPIlotPnPhaseRange(value);
    }
        this._pIlotPnPhase = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellRfBuilder setPilotStrengthEcp(final java.lang.Long value) {
        this._pilotStrengthEcp = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellRfBuilder setPilotStrengthEcpIo(final java.lang.Long value) {
        this._pilotStrengthEcpIo = value;
        return this;
    }
    
     
     private static void checkRfcnflRange(final int value) {
         if (value >= 0 && value <= 2016) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..2016]].", value));
     }
    
    public RemCdma2000OneXCellRfBuilder setRfcnfl(final java.lang.Integer value) {
    if (value != null) {
        checkRfcnflRange(value);
    }
        this._rfcnfl = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellRfBuilder setOverheadsAvailable(final java.lang.Boolean value) {
        this._overheadsAvailable = value;
        return this;
    }
    
    public RemCdma2000OneXCellRfBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemCdma2000OneXCellRfBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemCdma2000OneXCellRf build() {
        return new RemCdma2000OneXCellRfImpl(this);
    }

    private static final class RemCdma2000OneXCellRfImpl implements RemCdma2000OneXCellRf {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf.class;
        }

        private final java.lang.Long _band;
        private final java.lang.Long _io;
        private final java.lang.Integer _pIlotPn;
        private final BigInteger _pIlotPnPhase;
        private final java.lang.Long _pilotStrengthEcp;
        private final java.lang.Long _pilotStrengthEcpIo;
        private final java.lang.Integer _rfcnfl;
        private final java.lang.Boolean _overheadsAvailable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>> augmentation = Collections.emptyMap();

        private RemCdma2000OneXCellRfImpl(RemCdma2000OneXCellRfBuilder base) {
            this._band = base.getBand();
            this._io = base.getIo();
            this._pIlotPn = base.getPIlotPn();
            this._pIlotPnPhase = base.getPIlotPnPhase();
            this._pilotStrengthEcp = base.getPilotStrengthEcp();
            this._pilotStrengthEcpIo = base.getPilotStrengthEcpIo();
            this._rfcnfl = base.getRfcnfl();
            this._overheadsAvailable = base.isOverheadsAvailable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getBand() {
            return _band;
        }
        
        @Override
        public java.lang.Long getIo() {
            return _io;
        }
        
        @Override
        public java.lang.Integer getPIlotPn() {
            return _pIlotPn;
        }
        
        @Override
        public BigInteger getPIlotPnPhase() {
            return _pIlotPnPhase;
        }
        
        @Override
        public java.lang.Long getPilotStrengthEcp() {
            return _pilotStrengthEcp;
        }
        
        @Override
        public java.lang.Long getPilotStrengthEcpIo() {
            return _pilotStrengthEcpIo;
        }
        
        @Override
        public java.lang.Integer getRfcnfl() {
            return _rfcnfl;
        }
        
        @Override
        public java.lang.Boolean isOverheadsAvailable() {
            return _overheadsAvailable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_band);
            result = prime * result + Objects.hashCode(_io);
            result = prime * result + Objects.hashCode(_pIlotPn);
            result = prime * result + Objects.hashCode(_pIlotPnPhase);
            result = prime * result + Objects.hashCode(_pilotStrengthEcp);
            result = prime * result + Objects.hashCode(_pilotStrengthEcpIo);
            result = prime * result + Objects.hashCode(_rfcnfl);
            result = prime * result + Objects.hashCode(_overheadsAvailable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf)obj;
            if (!Objects.equals(_band, other.getBand())) {
                return false;
            }
            if (!Objects.equals(_io, other.getIo())) {
                return false;
            }
            if (!Objects.equals(_pIlotPn, other.getPIlotPn())) {
                return false;
            }
            if (!Objects.equals(_pIlotPnPhase, other.getPIlotPnPhase())) {
                return false;
            }
            if (!Objects.equals(_pilotStrengthEcp, other.getPilotStrengthEcp())) {
                return false;
            }
            if (!Objects.equals(_pilotStrengthEcpIo, other.getPilotStrengthEcpIo())) {
                return false;
            }
            if (!Objects.equals(_rfcnfl, other.getRfcnfl())) {
                return false;
            }
            if (!Objects.equals(_overheadsAvailable, other.isOverheadsAvailable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemCdma2000OneXCellRfImpl otherImpl = (RemCdma2000OneXCellRfImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemCdma2000OneXCellRf [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_band != null) {
                builder.append("_band=");
                builder.append(_band);
                builder.append(", ");
            }
            if (_io != null) {
                builder.append("_io=");
                builder.append(_io);
                builder.append(", ");
            }
            if (_pIlotPn != null) {
                builder.append("_pIlotPn=");
                builder.append(_pIlotPn);
                builder.append(", ");
            }
            if (_pIlotPnPhase != null) {
                builder.append("_pIlotPnPhase=");
                builder.append(_pIlotPnPhase);
                builder.append(", ");
            }
            if (_pilotStrengthEcp != null) {
                builder.append("_pilotStrengthEcp=");
                builder.append(_pilotStrengthEcp);
                builder.append(", ");
            }
            if (_pilotStrengthEcpIo != null) {
                builder.append("_pilotStrengthEcpIo=");
                builder.append(_pilotStrengthEcpIo);
                builder.append(", ");
            }
            if (_rfcnfl != null) {
                builder.append("_rfcnfl=");
                builder.append(_rfcnfl);
                builder.append(", ");
            }
            if (_overheadsAvailable != null) {
                builder.append("_overheadsAvailable=");
                builder.append(_overheadsAvailable);
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
