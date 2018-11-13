package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG.AllowedCipheringAlgorithmList;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG.AllowedIntegrityProtectionAlgorithmList;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc
 *
 */
public class LteEpcBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc> {

    private List<AllowedCipheringAlgorithmList> _allowedCipheringAlgorithmList;
    private List<AllowedIntegrityProtectionAlgorithmList> _allowedIntegrityProtectionAlgorithmList;
    private java.lang.Long _eaid;
    private List<LteEpcPlmnList> _lteEpcPlmnList;
    private List<LteEpcQoS> _lteEpcQoS;
    private BigInteger _maxPlmnListEntries;
    private BigInteger _maxQoSEntries;
    private BigInteger _plmnListNumberOfEntries;
    private BigInteger _qoSNumberOfEntries;
    private java.lang.Integer _tac;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>> augmentation = Collections.emptyMap();

    public LteEpcBuilder() {
    }
    public LteEpcBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG arg) {
        this._allowedCipheringAlgorithmList = arg.getAllowedCipheringAlgorithmList();
        this._allowedIntegrityProtectionAlgorithmList = arg.getAllowedIntegrityProtectionAlgorithmList();
        this._tac = arg.getTac();
        this._eaid = arg.getEaid();
        this._maxPlmnListEntries = arg.getMaxPlmnListEntries();
        this._plmnListNumberOfEntries = arg.getPlmnListNumberOfEntries();
        this._maxQoSEntries = arg.getMaxQoSEntries();
        this._qoSNumberOfEntries = arg.getQoSNumberOfEntries();
    }

    public LteEpcBuilder(LteEpc base) {
        this._allowedCipheringAlgorithmList = base.getAllowedCipheringAlgorithmList();
        this._allowedIntegrityProtectionAlgorithmList = base.getAllowedIntegrityProtectionAlgorithmList();
        this._eaid = base.getEaid();
        this._lteEpcPlmnList = base.getLteEpcPlmnList();
        this._lteEpcQoS = base.getLteEpcQoS();
        this._maxPlmnListEntries = base.getMaxPlmnListEntries();
        this._maxQoSEntries = base.getMaxQoSEntries();
        this._plmnListNumberOfEntries = base.getPlmnListNumberOfEntries();
        this._qoSNumberOfEntries = base.getQoSNumberOfEntries();
        this._tac = base.getTac();
        if (base instanceof LteEpcImpl) {
            LteEpcImpl impl = (LteEpcImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG) {
            this._allowedCipheringAlgorithmList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG)arg).getAllowedCipheringAlgorithmList();
            this._allowedIntegrityProtectionAlgorithmList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG)arg).getAllowedIntegrityProtectionAlgorithmList();
            this._tac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG)arg).getTac();
            this._eaid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG)arg).getEaid();
            this._maxPlmnListEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG)arg).getMaxPlmnListEntries();
            this._plmnListNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG)arg).getPlmnListNumberOfEntries();
            this._maxQoSEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG)arg).getMaxQoSEntries();
            this._qoSNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG)arg).getQoSNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<AllowedCipheringAlgorithmList> getAllowedCipheringAlgorithmList() {
        return _allowedCipheringAlgorithmList;
    }
    
    public List<AllowedIntegrityProtectionAlgorithmList> getAllowedIntegrityProtectionAlgorithmList() {
        return _allowedIntegrityProtectionAlgorithmList;
    }
    
    public java.lang.Long getEaid() {
        return _eaid;
    }
    
    public List<LteEpcPlmnList> getLteEpcPlmnList() {
        return _lteEpcPlmnList;
    }
    
    public List<LteEpcQoS> getLteEpcQoS() {
        return _lteEpcQoS;
    }
    
    public BigInteger getMaxPlmnListEntries() {
        return _maxPlmnListEntries;
    }
    
    public BigInteger getMaxQoSEntries() {
        return _maxQoSEntries;
    }
    
    public BigInteger getPlmnListNumberOfEntries() {
        return _plmnListNumberOfEntries;
    }
    
    public BigInteger getQoSNumberOfEntries() {
        return _qoSNumberOfEntries;
    }
    
    public java.lang.Integer getTac() {
        return _tac;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteEpcBuilder setAllowedCipheringAlgorithmList(final List<AllowedCipheringAlgorithmList> value) {
        this._allowedCipheringAlgorithmList = value;
        return this;
    }
    
     
    public LteEpcBuilder setAllowedIntegrityProtectionAlgorithmList(final List<AllowedIntegrityProtectionAlgorithmList> value) {
        this._allowedIntegrityProtectionAlgorithmList = value;
        return this;
    }
    
     
     private static void checkEaidRange(final long value) {
         if (value >= 0L && value <= 16777216L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..16777216]].", value));
     }
    
    public LteEpcBuilder setEaid(final java.lang.Long value) {
    if (value != null) {
        checkEaidRange(value);
    }
        this._eaid = value;
        return this;
    }
    
     
    public LteEpcBuilder setLteEpcPlmnList(final List<LteEpcPlmnList> value) {
        this._lteEpcPlmnList = value;
        return this;
    }
    
     
    public LteEpcBuilder setLteEpcQoS(final List<LteEpcQoS> value) {
        this._lteEpcQoS = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXPLMNLISTENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXPLMNLISTENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxPlmnListEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXPLMNLISTENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXPLMNLISTENTRIESRANGE_RANGES)));
     }
    
    public LteEpcBuilder setMaxPlmnListEntries(final BigInteger value) {
    if (value != null) {
        checkMaxPlmnListEntriesRange(value);
    }
        this._maxPlmnListEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXQOSENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXQOSENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxQoSEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXQOSENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXQOSENTRIESRANGE_RANGES)));
     }
    
    public LteEpcBuilder setMaxQoSEntries(final BigInteger value) {
    if (value != null) {
        checkMaxQoSEntriesRange(value);
    }
        this._maxQoSEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKPLMNLISTNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKPLMNLISTNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkPlmnListNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKPLMNLISTNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKPLMNLISTNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public LteEpcBuilder setPlmnListNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkPlmnListNumberOfEntriesRange(value);
    }
        this._plmnListNumberOfEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKQOSNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKQOSNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkQoSNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKQOSNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKQOSNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public LteEpcBuilder setQoSNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkQoSNumberOfEntriesRange(value);
    }
        this._qoSNumberOfEntries = value;
        return this;
    }
    
     
     private static void checkTacRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public LteEpcBuilder setTac(final java.lang.Integer value) {
    if (value != null) {
        checkTacRange(value);
    }
        this._tac = value;
        return this;
    }
    
    public LteEpcBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteEpcBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteEpc build() {
        return new LteEpcImpl(this);
    }

    private static final class LteEpcImpl implements LteEpc {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc.class;
        }

        private final List<AllowedCipheringAlgorithmList> _allowedCipheringAlgorithmList;
        private final List<AllowedIntegrityProtectionAlgorithmList> _allowedIntegrityProtectionAlgorithmList;
        private final java.lang.Long _eaid;
        private final List<LteEpcPlmnList> _lteEpcPlmnList;
        private final List<LteEpcQoS> _lteEpcQoS;
        private final BigInteger _maxPlmnListEntries;
        private final BigInteger _maxQoSEntries;
        private final BigInteger _plmnListNumberOfEntries;
        private final BigInteger _qoSNumberOfEntries;
        private final java.lang.Integer _tac;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>> augmentation = Collections.emptyMap();

        private LteEpcImpl(LteEpcBuilder base) {
            this._allowedCipheringAlgorithmList = base.getAllowedCipheringAlgorithmList();
            this._allowedIntegrityProtectionAlgorithmList = base.getAllowedIntegrityProtectionAlgorithmList();
            this._eaid = base.getEaid();
            this._lteEpcPlmnList = base.getLteEpcPlmnList();
            this._lteEpcQoS = base.getLteEpcQoS();
            this._maxPlmnListEntries = base.getMaxPlmnListEntries();
            this._maxQoSEntries = base.getMaxQoSEntries();
            this._plmnListNumberOfEntries = base.getPlmnListNumberOfEntries();
            this._qoSNumberOfEntries = base.getQoSNumberOfEntries();
            this._tac = base.getTac();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<AllowedCipheringAlgorithmList> getAllowedCipheringAlgorithmList() {
            return _allowedCipheringAlgorithmList;
        }
        
        @Override
        public List<AllowedIntegrityProtectionAlgorithmList> getAllowedIntegrityProtectionAlgorithmList() {
            return _allowedIntegrityProtectionAlgorithmList;
        }
        
        @Override
        public java.lang.Long getEaid() {
            return _eaid;
        }
        
        @Override
        public List<LteEpcPlmnList> getLteEpcPlmnList() {
            return _lteEpcPlmnList;
        }
        
        @Override
        public List<LteEpcQoS> getLteEpcQoS() {
            return _lteEpcQoS;
        }
        
        @Override
        public BigInteger getMaxPlmnListEntries() {
            return _maxPlmnListEntries;
        }
        
        @Override
        public BigInteger getMaxQoSEntries() {
            return _maxQoSEntries;
        }
        
        @Override
        public BigInteger getPlmnListNumberOfEntries() {
            return _plmnListNumberOfEntries;
        }
        
        @Override
        public BigInteger getQoSNumberOfEntries() {
            return _qoSNumberOfEntries;
        }
        
        @Override
        public java.lang.Integer getTac() {
            return _tac;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_allowedCipheringAlgorithmList);
            result = prime * result + Objects.hashCode(_allowedIntegrityProtectionAlgorithmList);
            result = prime * result + Objects.hashCode(_eaid);
            result = prime * result + Objects.hashCode(_lteEpcPlmnList);
            result = prime * result + Objects.hashCode(_lteEpcQoS);
            result = prime * result + Objects.hashCode(_maxPlmnListEntries);
            result = prime * result + Objects.hashCode(_maxQoSEntries);
            result = prime * result + Objects.hashCode(_plmnListNumberOfEntries);
            result = prime * result + Objects.hashCode(_qoSNumberOfEntries);
            result = prime * result + Objects.hashCode(_tac);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc)obj;
            if (!Objects.equals(_allowedCipheringAlgorithmList, other.getAllowedCipheringAlgorithmList())) {
                return false;
            }
            if (!Objects.equals(_allowedIntegrityProtectionAlgorithmList, other.getAllowedIntegrityProtectionAlgorithmList())) {
                return false;
            }
            if (!Objects.equals(_eaid, other.getEaid())) {
                return false;
            }
            if (!Objects.equals(_lteEpcPlmnList, other.getLteEpcPlmnList())) {
                return false;
            }
            if (!Objects.equals(_lteEpcQoS, other.getLteEpcQoS())) {
                return false;
            }
            if (!Objects.equals(_maxPlmnListEntries, other.getMaxPlmnListEntries())) {
                return false;
            }
            if (!Objects.equals(_maxQoSEntries, other.getMaxQoSEntries())) {
                return false;
            }
            if (!Objects.equals(_plmnListNumberOfEntries, other.getPlmnListNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_qoSNumberOfEntries, other.getQoSNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_tac, other.getTac())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteEpcImpl otherImpl = (LteEpcImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteEpc [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_allowedCipheringAlgorithmList != null) {
                builder.append("_allowedCipheringAlgorithmList=");
                builder.append(_allowedCipheringAlgorithmList);
                builder.append(", ");
            }
            if (_allowedIntegrityProtectionAlgorithmList != null) {
                builder.append("_allowedIntegrityProtectionAlgorithmList=");
                builder.append(_allowedIntegrityProtectionAlgorithmList);
                builder.append(", ");
            }
            if (_eaid != null) {
                builder.append("_eaid=");
                builder.append(_eaid);
                builder.append(", ");
            }
            if (_lteEpcPlmnList != null) {
                builder.append("_lteEpcPlmnList=");
                builder.append(_lteEpcPlmnList);
                builder.append(", ");
            }
            if (_lteEpcQoS != null) {
                builder.append("_lteEpcQoS=");
                builder.append(_lteEpcQoS);
                builder.append(", ");
            }
            if (_maxPlmnListEntries != null) {
                builder.append("_maxPlmnListEntries=");
                builder.append(_maxPlmnListEntries);
                builder.append(", ");
            }
            if (_maxQoSEntries != null) {
                builder.append("_maxQoSEntries=");
                builder.append(_maxQoSEntries);
                builder.append(", ");
            }
            if (_plmnListNumberOfEntries != null) {
                builder.append("_plmnListNumberOfEntries=");
                builder.append(_plmnListNumberOfEntries);
                builder.append(", ");
            }
            if (_qoSNumberOfEntries != null) {
                builder.append("_qoSNumberOfEntries=");
                builder.append(_qoSNumberOfEntries);
                builder.append(", ");
            }
            if (_tac != null) {
                builder.append("_tac=");
                builder.append(_tac);
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
