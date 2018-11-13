package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch
 *
 */
public class RemLteCellBcchBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch> {

    private java.lang.Long _cellId;
    private java.lang.Long _csgIdentity;
    private java.lang.Short _dlBandwidth;
    private BigInteger _maxPlmnListEntries;
    private BigInteger _plmnListNumberOfEntries;
    private List<RemLteCellBcchPlmnList> _remLteCellBcchPlmnList;
    private java.lang.Long _rsTxPower;
    private java.lang.Integer _tac;
    private java.lang.Short _ulBandwidth;
    private java.lang.Boolean _cellBarred;
    private java.lang.Boolean _csgIndication;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>> augmentation = Collections.emptyMap();

    public RemLteCellBcchBuilder() {
    }
    public RemLteCellBcchBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG arg) {
        this._dlBandwidth = arg.getDlBandwidth();
        this._ulBandwidth = arg.getUlBandwidth();
        this._rsTxPower = arg.getRsTxPower();
        this._tac = arg.getTac();
        this._cellId = arg.getCellId();
        this._cellBarred = arg.isCellBarred();
        this._csgIndication = arg.isCsgIndication();
        this._csgIdentity = arg.getCsgIdentity();
        this._maxPlmnListEntries = arg.getMaxPlmnListEntries();
        this._plmnListNumberOfEntries = arg.getPlmnListNumberOfEntries();
    }

    public RemLteCellBcchBuilder(RemLteCellBcch base) {
        this._cellId = base.getCellId();
        this._csgIdentity = base.getCsgIdentity();
        this._dlBandwidth = base.getDlBandwidth();
        this._maxPlmnListEntries = base.getMaxPlmnListEntries();
        this._plmnListNumberOfEntries = base.getPlmnListNumberOfEntries();
        this._remLteCellBcchPlmnList = base.getRemLteCellBcchPlmnList();
        this._rsTxPower = base.getRsTxPower();
        this._tac = base.getTac();
        this._ulBandwidth = base.getUlBandwidth();
        this._cellBarred = base.isCellBarred();
        this._csgIndication = base.isCsgIndication();
        if (base instanceof RemLteCellBcchImpl) {
            RemLteCellBcchImpl impl = (RemLteCellBcchImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG) {
            this._dlBandwidth = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG)arg).getDlBandwidth();
            this._ulBandwidth = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG)arg).getUlBandwidth();
            this._rsTxPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG)arg).getRsTxPower();
            this._tac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG)arg).getTac();
            this._cellId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG)arg).getCellId();
            this._cellBarred = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG)arg).isCellBarred();
            this._csgIndication = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG)arg).isCsgIndication();
            this._csgIdentity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG)arg).getCsgIdentity();
            this._maxPlmnListEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG)arg).getMaxPlmnListEntries();
            this._plmnListNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG)arg).getPlmnListNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getCellId() {
        return _cellId;
    }
    
    public java.lang.Long getCsgIdentity() {
        return _csgIdentity;
    }
    
    public java.lang.Short getDlBandwidth() {
        return _dlBandwidth;
    }
    
    public BigInteger getMaxPlmnListEntries() {
        return _maxPlmnListEntries;
    }
    
    public BigInteger getPlmnListNumberOfEntries() {
        return _plmnListNumberOfEntries;
    }
    
    public List<RemLteCellBcchPlmnList> getRemLteCellBcchPlmnList() {
        return _remLteCellBcchPlmnList;
    }
    
    public java.lang.Long getRsTxPower() {
        return _rsTxPower;
    }
    
    public java.lang.Integer getTac() {
        return _tac;
    }
    
    public java.lang.Short getUlBandwidth() {
        return _ulBandwidth;
    }
    
    public java.lang.Boolean isCellBarred() {
        return _cellBarred;
    }
    
    public java.lang.Boolean isCsgIndication() {
        return _csgIndication;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCellIdRange(final long value) {
         if (value >= 0L && value <= 268435455L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..268435455]].", value));
     }
    
    public RemLteCellBcchBuilder setCellId(final java.lang.Long value) {
    if (value != null) {
        checkCellIdRange(value);
    }
        this._cellId = value;
        return this;
    }
    
     
     private static void checkCsgIdentityRange(final long value) {
         if (value >= 0L && value <= 134217727L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..134217727]].", value));
     }
    
    public RemLteCellBcchBuilder setCsgIdentity(final java.lang.Long value) {
    if (value != null) {
        checkCsgIdentityRange(value);
    }
        this._csgIdentity = value;
        return this;
    }
    
     
     private static void checkDlBandwidthRange(final short value) {
         if (value >= (short)6 && value <= (short)6) {
             return;
         }
         if (value >= (short)15 && value <= (short)15) {
             return;
         }
         if (value >= (short)25 && value <= (short)25) {
             return;
         }
         if (value >= (short)50 && value <= (short)50) {
             return;
         }
         if (value >= (short)75 && value <= (short)75) {
             return;
         }
         if (value >= (short)100 && value <= (short)100) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[6..6], [15..15], [25..25], [50..50], [75..75], [100..100]].", value));
     }
    
    public RemLteCellBcchBuilder setDlBandwidth(final java.lang.Short value) {
    if (value != null) {
        checkDlBandwidthRange(value);
    }
        this._dlBandwidth = value;
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
    
    public RemLteCellBcchBuilder setMaxPlmnListEntries(final BigInteger value) {
    if (value != null) {
        checkMaxPlmnListEntriesRange(value);
    }
        this._maxPlmnListEntries = value;
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
    
    public RemLteCellBcchBuilder setPlmnListNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkPlmnListNumberOfEntriesRange(value);
    }
        this._plmnListNumberOfEntries = value;
        return this;
    }
    
     
    public RemLteCellBcchBuilder setRemLteCellBcchPlmnList(final List<RemLteCellBcchPlmnList> value) {
        this._remLteCellBcchPlmnList = value;
        return this;
    }
    
     
    public RemLteCellBcchBuilder setRsTxPower(final java.lang.Long value) {
        this._rsTxPower = value;
        return this;
    }
    
     
     private static void checkTacRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public RemLteCellBcchBuilder setTac(final java.lang.Integer value) {
    if (value != null) {
        checkTacRange(value);
    }
        this._tac = value;
        return this;
    }
    
     
     private static void checkUlBandwidthRange(final short value) {
         if (value >= (short)6 && value <= (short)6) {
             return;
         }
         if (value >= (short)15 && value <= (short)15) {
             return;
         }
         if (value >= (short)25 && value <= (short)25) {
             return;
         }
         if (value >= (short)50 && value <= (short)50) {
             return;
         }
         if (value >= (short)75 && value <= (short)75) {
             return;
         }
         if (value >= (short)100 && value <= (short)100) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[6..6], [15..15], [25..25], [50..50], [75..75], [100..100]].", value));
     }
    
    public RemLteCellBcchBuilder setUlBandwidth(final java.lang.Short value) {
    if (value != null) {
        checkUlBandwidthRange(value);
    }
        this._ulBandwidth = value;
        return this;
    }
    
     
    public RemLteCellBcchBuilder setCellBarred(final java.lang.Boolean value) {
        this._cellBarred = value;
        return this;
    }
    
     
    public RemLteCellBcchBuilder setCsgIndication(final java.lang.Boolean value) {
        this._csgIndication = value;
        return this;
    }
    
    public RemLteCellBcchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemLteCellBcchBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemLteCellBcch build() {
        return new RemLteCellBcchImpl(this);
    }

    private static final class RemLteCellBcchImpl implements RemLteCellBcch {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch.class;
        }

        private final java.lang.Long _cellId;
        private final java.lang.Long _csgIdentity;
        private final java.lang.Short _dlBandwidth;
        private final BigInteger _maxPlmnListEntries;
        private final BigInteger _plmnListNumberOfEntries;
        private final List<RemLteCellBcchPlmnList> _remLteCellBcchPlmnList;
        private final java.lang.Long _rsTxPower;
        private final java.lang.Integer _tac;
        private final java.lang.Short _ulBandwidth;
        private final java.lang.Boolean _cellBarred;
        private final java.lang.Boolean _csgIndication;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>> augmentation = Collections.emptyMap();

        private RemLteCellBcchImpl(RemLteCellBcchBuilder base) {
            this._cellId = base.getCellId();
            this._csgIdentity = base.getCsgIdentity();
            this._dlBandwidth = base.getDlBandwidth();
            this._maxPlmnListEntries = base.getMaxPlmnListEntries();
            this._plmnListNumberOfEntries = base.getPlmnListNumberOfEntries();
            this._remLteCellBcchPlmnList = base.getRemLteCellBcchPlmnList();
            this._rsTxPower = base.getRsTxPower();
            this._tac = base.getTac();
            this._ulBandwidth = base.getUlBandwidth();
            this._cellBarred = base.isCellBarred();
            this._csgIndication = base.isCsgIndication();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCellId() {
            return _cellId;
        }
        
        @Override
        public java.lang.Long getCsgIdentity() {
            return _csgIdentity;
        }
        
        @Override
        public java.lang.Short getDlBandwidth() {
            return _dlBandwidth;
        }
        
        @Override
        public BigInteger getMaxPlmnListEntries() {
            return _maxPlmnListEntries;
        }
        
        @Override
        public BigInteger getPlmnListNumberOfEntries() {
            return _plmnListNumberOfEntries;
        }
        
        @Override
        public List<RemLteCellBcchPlmnList> getRemLteCellBcchPlmnList() {
            return _remLteCellBcchPlmnList;
        }
        
        @Override
        public java.lang.Long getRsTxPower() {
            return _rsTxPower;
        }
        
        @Override
        public java.lang.Integer getTac() {
            return _tac;
        }
        
        @Override
        public java.lang.Short getUlBandwidth() {
            return _ulBandwidth;
        }
        
        @Override
        public java.lang.Boolean isCellBarred() {
            return _cellBarred;
        }
        
        @Override
        public java.lang.Boolean isCsgIndication() {
            return _csgIndication;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cellId);
            result = prime * result + Objects.hashCode(_csgIdentity);
            result = prime * result + Objects.hashCode(_dlBandwidth);
            result = prime * result + Objects.hashCode(_maxPlmnListEntries);
            result = prime * result + Objects.hashCode(_plmnListNumberOfEntries);
            result = prime * result + Objects.hashCode(_remLteCellBcchPlmnList);
            result = prime * result + Objects.hashCode(_rsTxPower);
            result = prime * result + Objects.hashCode(_tac);
            result = prime * result + Objects.hashCode(_ulBandwidth);
            result = prime * result + Objects.hashCode(_cellBarred);
            result = prime * result + Objects.hashCode(_csgIndication);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch)obj;
            if (!Objects.equals(_cellId, other.getCellId())) {
                return false;
            }
            if (!Objects.equals(_csgIdentity, other.getCsgIdentity())) {
                return false;
            }
            if (!Objects.equals(_dlBandwidth, other.getDlBandwidth())) {
                return false;
            }
            if (!Objects.equals(_maxPlmnListEntries, other.getMaxPlmnListEntries())) {
                return false;
            }
            if (!Objects.equals(_plmnListNumberOfEntries, other.getPlmnListNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_remLteCellBcchPlmnList, other.getRemLteCellBcchPlmnList())) {
                return false;
            }
            if (!Objects.equals(_rsTxPower, other.getRsTxPower())) {
                return false;
            }
            if (!Objects.equals(_tac, other.getTac())) {
                return false;
            }
            if (!Objects.equals(_ulBandwidth, other.getUlBandwidth())) {
                return false;
            }
            if (!Objects.equals(_cellBarred, other.isCellBarred())) {
                return false;
            }
            if (!Objects.equals(_csgIndication, other.isCsgIndication())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemLteCellBcchImpl otherImpl = (RemLteCellBcchImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemLteCellBcch [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cellId != null) {
                builder.append("_cellId=");
                builder.append(_cellId);
                builder.append(", ");
            }
            if (_csgIdentity != null) {
                builder.append("_csgIdentity=");
                builder.append(_csgIdentity);
                builder.append(", ");
            }
            if (_dlBandwidth != null) {
                builder.append("_dlBandwidth=");
                builder.append(_dlBandwidth);
                builder.append(", ");
            }
            if (_maxPlmnListEntries != null) {
                builder.append("_maxPlmnListEntries=");
                builder.append(_maxPlmnListEntries);
                builder.append(", ");
            }
            if (_plmnListNumberOfEntries != null) {
                builder.append("_plmnListNumberOfEntries=");
                builder.append(_plmnListNumberOfEntries);
                builder.append(", ");
            }
            if (_remLteCellBcchPlmnList != null) {
                builder.append("_remLteCellBcchPlmnList=");
                builder.append(_remLteCellBcchPlmnList);
                builder.append(", ");
            }
            if (_rsTxPower != null) {
                builder.append("_rsTxPower=");
                builder.append(_rsTxPower);
                builder.append(", ");
            }
            if (_tac != null) {
                builder.append("_tac=");
                builder.append(_tac);
                builder.append(", ");
            }
            if (_ulBandwidth != null) {
                builder.append("_ulBandwidth=");
                builder.append(_ulBandwidth);
                builder.append(", ");
            }
            if (_cellBarred != null) {
                builder.append("_cellBarred=");
                builder.append(_cellBarred);
                builder.append(", ");
            }
            if (_csgIndication != null) {
                builder.append("_csgIndication=");
                builder.append(_csgIndication);
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
