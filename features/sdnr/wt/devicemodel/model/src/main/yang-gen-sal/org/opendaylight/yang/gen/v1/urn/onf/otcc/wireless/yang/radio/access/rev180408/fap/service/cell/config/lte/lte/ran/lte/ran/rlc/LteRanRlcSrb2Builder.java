package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2
 *
 */
public class LteRanRlcSrb2Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2> {

    private List<java.lang.Short> _maxRetxThreshold;
    private List<java.lang.Integer> _pollByte;
    private List<java.lang.Integer> _pollPdu;
    private List<java.lang.String> _tPollRetransmit;
    private List<java.lang.String> _tReordering;
    private List<java.lang.String> _tStatusProhibit;
    private java.lang.Boolean _defaultConfiguration;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>> augmentation = Collections.emptyMap();

    public LteRanRlcSrb2Builder() {
    }
    public LteRanRlcSrb2Builder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G arg) {
        this._defaultConfiguration = arg.isDefaultConfiguration();
        this._tPollRetransmit = arg.getTPollRetransmit();
        this._pollPdu = arg.getPollPdu();
        this._pollByte = arg.getPollByte();
        this._maxRetxThreshold = arg.getMaxRetxThreshold();
        this._tReordering = arg.getTReordering();
        this._tStatusProhibit = arg.getTStatusProhibit();
    }

    public LteRanRlcSrb2Builder(LteRanRlcSrb2 base) {
        this._maxRetxThreshold = base.getMaxRetxThreshold();
        this._pollByte = base.getPollByte();
        this._pollPdu = base.getPollPdu();
        this._tPollRetransmit = base.getTPollRetransmit();
        this._tReordering = base.getTReordering();
        this._tStatusProhibit = base.getTStatusProhibit();
        this._defaultConfiguration = base.isDefaultConfiguration();
        if (base instanceof LteRanRlcSrb2Impl) {
            LteRanRlcSrb2Impl impl = (LteRanRlcSrb2Impl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G) {
            this._defaultConfiguration = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G)arg).isDefaultConfiguration();
            this._tPollRetransmit = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G)arg).getTPollRetransmit();
            this._pollPdu = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G)arg).getPollPdu();
            this._pollByte = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G)arg).getPollByte();
            this._maxRetxThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G)arg).getMaxRetxThreshold();
            this._tReordering = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G)arg).getTReordering();
            this._tStatusProhibit = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G)arg).getTStatusProhibit();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb2G] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.Short> getMaxRetxThreshold() {
        return _maxRetxThreshold;
    }
    
    public List<java.lang.Integer> getPollByte() {
        return _pollByte;
    }
    
    public List<java.lang.Integer> getPollPdu() {
        return _pollPdu;
    }
    
    public List<java.lang.String> getTPollRetransmit() {
        return _tPollRetransmit;
    }
    
    public List<java.lang.String> getTReordering() {
        return _tReordering;
    }
    
    public List<java.lang.String> getTStatusProhibit() {
        return _tStatusProhibit;
    }
    
    public java.lang.Boolean isDefaultConfiguration() {
        return _defaultConfiguration;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanRlcSrb2Builder setMaxRetxThreshold(final List<java.lang.Short> value) {
        this._maxRetxThreshold = value;
        return this;
    }
    
     
    public LteRanRlcSrb2Builder setPollByte(final List<java.lang.Integer> value) {
        this._pollByte = value;
        return this;
    }
    
     
    public LteRanRlcSrb2Builder setPollPdu(final List<java.lang.Integer> value) {
        this._pollPdu = value;
        return this;
    }
    
     
    public LteRanRlcSrb2Builder setTPollRetransmit(final List<java.lang.String> value) {
        this._tPollRetransmit = value;
        return this;
    }
    
     
    public LteRanRlcSrb2Builder setTReordering(final List<java.lang.String> value) {
        this._tReordering = value;
        return this;
    }
    
     
    public LteRanRlcSrb2Builder setTStatusProhibit(final List<java.lang.String> value) {
        this._tStatusProhibit = value;
        return this;
    }
    
     
    public LteRanRlcSrb2Builder setDefaultConfiguration(final java.lang.Boolean value) {
        this._defaultConfiguration = value;
        return this;
    }
    
    public LteRanRlcSrb2Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanRlcSrb2Builder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanRlcSrb2 build() {
        return new LteRanRlcSrb2Impl(this);
    }

    private static final class LteRanRlcSrb2Impl implements LteRanRlcSrb2 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2.class;
        }

        private final List<java.lang.Short> _maxRetxThreshold;
        private final List<java.lang.Integer> _pollByte;
        private final List<java.lang.Integer> _pollPdu;
        private final List<java.lang.String> _tPollRetransmit;
        private final List<java.lang.String> _tReordering;
        private final List<java.lang.String> _tStatusProhibit;
        private final java.lang.Boolean _defaultConfiguration;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>> augmentation = Collections.emptyMap();

        private LteRanRlcSrb2Impl(LteRanRlcSrb2Builder base) {
            this._maxRetxThreshold = base.getMaxRetxThreshold();
            this._pollByte = base.getPollByte();
            this._pollPdu = base.getPollPdu();
            this._tPollRetransmit = base.getTPollRetransmit();
            this._tReordering = base.getTReordering();
            this._tStatusProhibit = base.getTStatusProhibit();
            this._defaultConfiguration = base.isDefaultConfiguration();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.Short> getMaxRetxThreshold() {
            return _maxRetxThreshold;
        }
        
        @Override
        public List<java.lang.Integer> getPollByte() {
            return _pollByte;
        }
        
        @Override
        public List<java.lang.Integer> getPollPdu() {
            return _pollPdu;
        }
        
        @Override
        public List<java.lang.String> getTPollRetransmit() {
            return _tPollRetransmit;
        }
        
        @Override
        public List<java.lang.String> getTReordering() {
            return _tReordering;
        }
        
        @Override
        public List<java.lang.String> getTStatusProhibit() {
            return _tStatusProhibit;
        }
        
        @Override
        public java.lang.Boolean isDefaultConfiguration() {
            return _defaultConfiguration;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxRetxThreshold);
            result = prime * result + Objects.hashCode(_pollByte);
            result = prime * result + Objects.hashCode(_pollPdu);
            result = prime * result + Objects.hashCode(_tPollRetransmit);
            result = prime * result + Objects.hashCode(_tReordering);
            result = prime * result + Objects.hashCode(_tStatusProhibit);
            result = prime * result + Objects.hashCode(_defaultConfiguration);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2 other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2)obj;
            if (!Objects.equals(_maxRetxThreshold, other.getMaxRetxThreshold())) {
                return false;
            }
            if (!Objects.equals(_pollByte, other.getPollByte())) {
                return false;
            }
            if (!Objects.equals(_pollPdu, other.getPollPdu())) {
                return false;
            }
            if (!Objects.equals(_tPollRetransmit, other.getTPollRetransmit())) {
                return false;
            }
            if (!Objects.equals(_tReordering, other.getTReordering())) {
                return false;
            }
            if (!Objects.equals(_tStatusProhibit, other.getTStatusProhibit())) {
                return false;
            }
            if (!Objects.equals(_defaultConfiguration, other.isDefaultConfiguration())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanRlcSrb2Impl otherImpl = (LteRanRlcSrb2Impl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanRlcSrb2 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_maxRetxThreshold != null) {
                builder.append("_maxRetxThreshold=");
                builder.append(_maxRetxThreshold);
                builder.append(", ");
            }
            if (_pollByte != null) {
                builder.append("_pollByte=");
                builder.append(_pollByte);
                builder.append(", ");
            }
            if (_pollPdu != null) {
                builder.append("_pollPdu=");
                builder.append(_pollPdu);
                builder.append(", ");
            }
            if (_tPollRetransmit != null) {
                builder.append("_tPollRetransmit=");
                builder.append(_tPollRetransmit);
                builder.append(", ");
            }
            if (_tReordering != null) {
                builder.append("_tReordering=");
                builder.append(_tReordering);
                builder.append(", ");
            }
            if (_tStatusProhibit != null) {
                builder.append("_tStatusProhibit=");
                builder.append(_tStatusProhibit);
                builder.append(", ");
            }
            if (_defaultConfiguration != null) {
                builder.append("_defaultConfiguration=");
                builder.append(_defaultConfiguration);
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
