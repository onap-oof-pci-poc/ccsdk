package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterFreqCell;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseIntraFreqCell;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse
 *
 */
public class UmtsRanNeighborListInUseBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse> {

    private BigInteger _interFreqCellNumberOfEntries;
    private BigInteger _intraFreqCellNumberOfEntries;
    private BigInteger _maxInterFreqCellEntries;
    private BigInteger _maxIntraFreqCellEntries;
    private List<UmtsRanNeighborListInUseInterFreqCell> _umtsRanNeighborListInUseInterFreqCell;
    private UmtsRanNeighborListInUseInterRatCell _umtsRanNeighborListInUseInterRatCell;
    private List<UmtsRanNeighborListInUseIntraFreqCell> _umtsRanNeighborListInUseIntraFreqCell;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>> augmentation = Collections.emptyMap();

    public UmtsRanNeighborListInUseBuilder() {
    }
    public UmtsRanNeighborListInUseBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseG arg) {
        this._maxIntraFreqCellEntries = arg.getMaxIntraFreqCellEntries();
        this._maxInterFreqCellEntries = arg.getMaxInterFreqCellEntries();
        this._intraFreqCellNumberOfEntries = arg.getIntraFreqCellNumberOfEntries();
        this._interFreqCellNumberOfEntries = arg.getInterFreqCellNumberOfEntries();
    }

    public UmtsRanNeighborListInUseBuilder(UmtsRanNeighborListInUse base) {
        this._interFreqCellNumberOfEntries = base.getInterFreqCellNumberOfEntries();
        this._intraFreqCellNumberOfEntries = base.getIntraFreqCellNumberOfEntries();
        this._maxInterFreqCellEntries = base.getMaxInterFreqCellEntries();
        this._maxIntraFreqCellEntries = base.getMaxIntraFreqCellEntries();
        this._umtsRanNeighborListInUseInterFreqCell = base.getUmtsRanNeighborListInUseInterFreqCell();
        this._umtsRanNeighborListInUseInterRatCell = base.getUmtsRanNeighborListInUseInterRatCell();
        this._umtsRanNeighborListInUseIntraFreqCell = base.getUmtsRanNeighborListInUseIntraFreqCell();
        if (base instanceof UmtsRanNeighborListInUseImpl) {
            UmtsRanNeighborListInUseImpl impl = (UmtsRanNeighborListInUseImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseG) {
            this._maxIntraFreqCellEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseG)arg).getMaxIntraFreqCellEntries();
            this._maxInterFreqCellEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseG)arg).getMaxInterFreqCellEntries();
            this._intraFreqCellNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseG)arg).getIntraFreqCellNumberOfEntries();
            this._interFreqCellNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseG)arg).getInterFreqCellNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getInterFreqCellNumberOfEntries() {
        return _interFreqCellNumberOfEntries;
    }
    
    public BigInteger getIntraFreqCellNumberOfEntries() {
        return _intraFreqCellNumberOfEntries;
    }
    
    public BigInteger getMaxInterFreqCellEntries() {
        return _maxInterFreqCellEntries;
    }
    
    public BigInteger getMaxIntraFreqCellEntries() {
        return _maxIntraFreqCellEntries;
    }
    
    public List<UmtsRanNeighborListInUseInterFreqCell> getUmtsRanNeighborListInUseInterFreqCell() {
        return _umtsRanNeighborListInUseInterFreqCell;
    }
    
    public UmtsRanNeighborListInUseInterRatCell getUmtsRanNeighborListInUseInterRatCell() {
        return _umtsRanNeighborListInUseInterRatCell;
    }
    
    public List<UmtsRanNeighborListInUseIntraFreqCell> getUmtsRanNeighborListInUseIntraFreqCell() {
        return _umtsRanNeighborListInUseIntraFreqCell;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKINTERFREQCELLNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKINTERFREQCELLNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkInterFreqCellNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKINTERFREQCELLNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKINTERFREQCELLNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public UmtsRanNeighborListInUseBuilder setInterFreqCellNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkInterFreqCellNumberOfEntriesRange(value);
    }
        this._interFreqCellNumberOfEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKINTRAFREQCELLNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKINTRAFREQCELLNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkIntraFreqCellNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKINTRAFREQCELLNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKINTRAFREQCELLNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public UmtsRanNeighborListInUseBuilder setIntraFreqCellNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkIntraFreqCellNumberOfEntriesRange(value);
    }
        this._intraFreqCellNumberOfEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXINTERFREQCELLENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXINTERFREQCELLENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxInterFreqCellEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXINTERFREQCELLENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXINTERFREQCELLENTRIESRANGE_RANGES)));
     }
    
    public UmtsRanNeighborListInUseBuilder setMaxInterFreqCellEntries(final BigInteger value) {
    if (value != null) {
        checkMaxInterFreqCellEntriesRange(value);
    }
        this._maxInterFreqCellEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXINTRAFREQCELLENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXINTRAFREQCELLENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxIntraFreqCellEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXINTRAFREQCELLENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXINTRAFREQCELLENTRIESRANGE_RANGES)));
     }
    
    public UmtsRanNeighborListInUseBuilder setMaxIntraFreqCellEntries(final BigInteger value) {
    if (value != null) {
        checkMaxIntraFreqCellEntriesRange(value);
    }
        this._maxIntraFreqCellEntries = value;
        return this;
    }
    
     
    public UmtsRanNeighborListInUseBuilder setUmtsRanNeighborListInUseInterFreqCell(final List<UmtsRanNeighborListInUseInterFreqCell> value) {
        this._umtsRanNeighborListInUseInterFreqCell = value;
        return this;
    }
    
     
    public UmtsRanNeighborListInUseBuilder setUmtsRanNeighborListInUseInterRatCell(final UmtsRanNeighborListInUseInterRatCell value) {
        this._umtsRanNeighborListInUseInterRatCell = value;
        return this;
    }
    
     
    public UmtsRanNeighborListInUseBuilder setUmtsRanNeighborListInUseIntraFreqCell(final List<UmtsRanNeighborListInUseIntraFreqCell> value) {
        this._umtsRanNeighborListInUseIntraFreqCell = value;
        return this;
    }
    
    public UmtsRanNeighborListInUseBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanNeighborListInUseBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanNeighborListInUse build() {
        return new UmtsRanNeighborListInUseImpl(this);
    }

    private static final class UmtsRanNeighborListInUseImpl implements UmtsRanNeighborListInUse {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse.class;
        }

        private final BigInteger _interFreqCellNumberOfEntries;
        private final BigInteger _intraFreqCellNumberOfEntries;
        private final BigInteger _maxInterFreqCellEntries;
        private final BigInteger _maxIntraFreqCellEntries;
        private final List<UmtsRanNeighborListInUseInterFreqCell> _umtsRanNeighborListInUseInterFreqCell;
        private final UmtsRanNeighborListInUseInterRatCell _umtsRanNeighborListInUseInterRatCell;
        private final List<UmtsRanNeighborListInUseIntraFreqCell> _umtsRanNeighborListInUseIntraFreqCell;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>> augmentation = Collections.emptyMap();

        private UmtsRanNeighborListInUseImpl(UmtsRanNeighborListInUseBuilder base) {
            this._interFreqCellNumberOfEntries = base.getInterFreqCellNumberOfEntries();
            this._intraFreqCellNumberOfEntries = base.getIntraFreqCellNumberOfEntries();
            this._maxInterFreqCellEntries = base.getMaxInterFreqCellEntries();
            this._maxIntraFreqCellEntries = base.getMaxIntraFreqCellEntries();
            this._umtsRanNeighborListInUseInterFreqCell = base.getUmtsRanNeighborListInUseInterFreqCell();
            this._umtsRanNeighborListInUseInterRatCell = base.getUmtsRanNeighborListInUseInterRatCell();
            this._umtsRanNeighborListInUseIntraFreqCell = base.getUmtsRanNeighborListInUseIntraFreqCell();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getInterFreqCellNumberOfEntries() {
            return _interFreqCellNumberOfEntries;
        }
        
        @Override
        public BigInteger getIntraFreqCellNumberOfEntries() {
            return _intraFreqCellNumberOfEntries;
        }
        
        @Override
        public BigInteger getMaxInterFreqCellEntries() {
            return _maxInterFreqCellEntries;
        }
        
        @Override
        public BigInteger getMaxIntraFreqCellEntries() {
            return _maxIntraFreqCellEntries;
        }
        
        @Override
        public List<UmtsRanNeighborListInUseInterFreqCell> getUmtsRanNeighborListInUseInterFreqCell() {
            return _umtsRanNeighborListInUseInterFreqCell;
        }
        
        @Override
        public UmtsRanNeighborListInUseInterRatCell getUmtsRanNeighborListInUseInterRatCell() {
            return _umtsRanNeighborListInUseInterRatCell;
        }
        
        @Override
        public List<UmtsRanNeighborListInUseIntraFreqCell> getUmtsRanNeighborListInUseIntraFreqCell() {
            return _umtsRanNeighborListInUseIntraFreqCell;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_interFreqCellNumberOfEntries);
            result = prime * result + Objects.hashCode(_intraFreqCellNumberOfEntries);
            result = prime * result + Objects.hashCode(_maxInterFreqCellEntries);
            result = prime * result + Objects.hashCode(_maxIntraFreqCellEntries);
            result = prime * result + Objects.hashCode(_umtsRanNeighborListInUseInterFreqCell);
            result = prime * result + Objects.hashCode(_umtsRanNeighborListInUseInterRatCell);
            result = prime * result + Objects.hashCode(_umtsRanNeighborListInUseIntraFreqCell);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse)obj;
            if (!Objects.equals(_interFreqCellNumberOfEntries, other.getInterFreqCellNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_intraFreqCellNumberOfEntries, other.getIntraFreqCellNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_maxInterFreqCellEntries, other.getMaxInterFreqCellEntries())) {
                return false;
            }
            if (!Objects.equals(_maxIntraFreqCellEntries, other.getMaxIntraFreqCellEntries())) {
                return false;
            }
            if (!Objects.equals(_umtsRanNeighborListInUseInterFreqCell, other.getUmtsRanNeighborListInUseInterFreqCell())) {
                return false;
            }
            if (!Objects.equals(_umtsRanNeighborListInUseInterRatCell, other.getUmtsRanNeighborListInUseInterRatCell())) {
                return false;
            }
            if (!Objects.equals(_umtsRanNeighborListInUseIntraFreqCell, other.getUmtsRanNeighborListInUseIntraFreqCell())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanNeighborListInUseImpl otherImpl = (UmtsRanNeighborListInUseImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanNeighborListInUse [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_interFreqCellNumberOfEntries != null) {
                builder.append("_interFreqCellNumberOfEntries=");
                builder.append(_interFreqCellNumberOfEntries);
                builder.append(", ");
            }
            if (_intraFreqCellNumberOfEntries != null) {
                builder.append("_intraFreqCellNumberOfEntries=");
                builder.append(_intraFreqCellNumberOfEntries);
                builder.append(", ");
            }
            if (_maxInterFreqCellEntries != null) {
                builder.append("_maxInterFreqCellEntries=");
                builder.append(_maxInterFreqCellEntries);
                builder.append(", ");
            }
            if (_maxIntraFreqCellEntries != null) {
                builder.append("_maxIntraFreqCellEntries=");
                builder.append(_maxIntraFreqCellEntries);
                builder.append(", ");
            }
            if (_umtsRanNeighborListInUseInterFreqCell != null) {
                builder.append("_umtsRanNeighborListInUseInterFreqCell=");
                builder.append(_umtsRanNeighborListInUseInterFreqCell);
                builder.append(", ");
            }
            if (_umtsRanNeighborListInUseInterRatCell != null) {
                builder.append("_umtsRanNeighborListInUseInterRatCell=");
                builder.append(_umtsRanNeighborListInUseInterRatCell);
                builder.append(", ");
            }
            if (_umtsRanNeighborListInUseIntraFreqCell != null) {
                builder.append("_umtsRanNeighborListInUseIntraFreqCell=");
                builder.append(_umtsRanNeighborListInUseIntraFreqCell);
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
