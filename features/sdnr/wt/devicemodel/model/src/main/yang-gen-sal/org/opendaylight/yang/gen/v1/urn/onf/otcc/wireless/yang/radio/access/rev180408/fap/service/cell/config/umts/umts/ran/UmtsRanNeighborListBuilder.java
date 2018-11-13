package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListInterFreqCell;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListIntraFreqCell;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListInterRatCell;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList
 *
 */
public class UmtsRanNeighborListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList> {

    private BigInteger _interFreqCellNumberOfEntries;
    private BigInteger _intraFreqCellNumberOfEntries;
    private BigInteger _maxInterFreqCellEntries;
    private BigInteger _maxIntraFreqCellEntries;
    private List<UmtsRanNeighborListInterFreqCell> _umtsRanNeighborListInterFreqCell;
    private UmtsRanNeighborListInterRatCell _umtsRanNeighborListInterRatCell;
    private List<UmtsRanNeighborListIntraFreqCell> _umtsRanNeighborListIntraFreqCell;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>> augmentation = Collections.emptyMap();

    public UmtsRanNeighborListBuilder() {
    }
    public UmtsRanNeighborListBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListG arg) {
        this._maxIntraFreqCellEntries = arg.getMaxIntraFreqCellEntries();
        this._maxInterFreqCellEntries = arg.getMaxInterFreqCellEntries();
        this._intraFreqCellNumberOfEntries = arg.getIntraFreqCellNumberOfEntries();
        this._interFreqCellNumberOfEntries = arg.getInterFreqCellNumberOfEntries();
    }

    public UmtsRanNeighborListBuilder(UmtsRanNeighborList base) {
        this._interFreqCellNumberOfEntries = base.getInterFreqCellNumberOfEntries();
        this._intraFreqCellNumberOfEntries = base.getIntraFreqCellNumberOfEntries();
        this._maxInterFreqCellEntries = base.getMaxInterFreqCellEntries();
        this._maxIntraFreqCellEntries = base.getMaxIntraFreqCellEntries();
        this._umtsRanNeighborListInterFreqCell = base.getUmtsRanNeighborListInterFreqCell();
        this._umtsRanNeighborListInterRatCell = base.getUmtsRanNeighborListInterRatCell();
        this._umtsRanNeighborListIntraFreqCell = base.getUmtsRanNeighborListIntraFreqCell();
        if (base instanceof UmtsRanNeighborListImpl) {
            UmtsRanNeighborListImpl impl = (UmtsRanNeighborListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListG) {
            this._maxIntraFreqCellEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListG)arg).getMaxIntraFreqCellEntries();
            this._maxInterFreqCellEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListG)arg).getMaxInterFreqCellEntries();
            this._intraFreqCellNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListG)arg).getIntraFreqCellNumberOfEntries();
            this._interFreqCellNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListG)arg).getInterFreqCellNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListG] \n" +
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
    
    public List<UmtsRanNeighborListInterFreqCell> getUmtsRanNeighborListInterFreqCell() {
        return _umtsRanNeighborListInterFreqCell;
    }
    
    public UmtsRanNeighborListInterRatCell getUmtsRanNeighborListInterRatCell() {
        return _umtsRanNeighborListInterRatCell;
    }
    
    public List<UmtsRanNeighborListIntraFreqCell> getUmtsRanNeighborListIntraFreqCell() {
        return _umtsRanNeighborListIntraFreqCell;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public UmtsRanNeighborListBuilder setInterFreqCellNumberOfEntries(final BigInteger value) {
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
    
    public UmtsRanNeighborListBuilder setIntraFreqCellNumberOfEntries(final BigInteger value) {
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
    
    public UmtsRanNeighborListBuilder setMaxInterFreqCellEntries(final BigInteger value) {
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
    
    public UmtsRanNeighborListBuilder setMaxIntraFreqCellEntries(final BigInteger value) {
    if (value != null) {
        checkMaxIntraFreqCellEntriesRange(value);
    }
        this._maxIntraFreqCellEntries = value;
        return this;
    }
    
     
    public UmtsRanNeighborListBuilder setUmtsRanNeighborListInterFreqCell(final List<UmtsRanNeighborListInterFreqCell> value) {
        this._umtsRanNeighborListInterFreqCell = value;
        return this;
    }
    
     
    public UmtsRanNeighborListBuilder setUmtsRanNeighborListInterRatCell(final UmtsRanNeighborListInterRatCell value) {
        this._umtsRanNeighborListInterRatCell = value;
        return this;
    }
    
     
    public UmtsRanNeighborListBuilder setUmtsRanNeighborListIntraFreqCell(final List<UmtsRanNeighborListIntraFreqCell> value) {
        this._umtsRanNeighborListIntraFreqCell = value;
        return this;
    }
    
    public UmtsRanNeighborListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanNeighborListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanNeighborList build() {
        return new UmtsRanNeighborListImpl(this);
    }

    private static final class UmtsRanNeighborListImpl implements UmtsRanNeighborList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList.class;
        }

        private final BigInteger _interFreqCellNumberOfEntries;
        private final BigInteger _intraFreqCellNumberOfEntries;
        private final BigInteger _maxInterFreqCellEntries;
        private final BigInteger _maxIntraFreqCellEntries;
        private final List<UmtsRanNeighborListInterFreqCell> _umtsRanNeighborListInterFreqCell;
        private final UmtsRanNeighborListInterRatCell _umtsRanNeighborListInterRatCell;
        private final List<UmtsRanNeighborListIntraFreqCell> _umtsRanNeighborListIntraFreqCell;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>> augmentation = Collections.emptyMap();

        private UmtsRanNeighborListImpl(UmtsRanNeighborListBuilder base) {
            this._interFreqCellNumberOfEntries = base.getInterFreqCellNumberOfEntries();
            this._intraFreqCellNumberOfEntries = base.getIntraFreqCellNumberOfEntries();
            this._maxInterFreqCellEntries = base.getMaxInterFreqCellEntries();
            this._maxIntraFreqCellEntries = base.getMaxIntraFreqCellEntries();
            this._umtsRanNeighborListInterFreqCell = base.getUmtsRanNeighborListInterFreqCell();
            this._umtsRanNeighborListInterRatCell = base.getUmtsRanNeighborListInterRatCell();
            this._umtsRanNeighborListIntraFreqCell = base.getUmtsRanNeighborListIntraFreqCell();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>>singletonMap(e.getKey(), e.getValue());
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
        public List<UmtsRanNeighborListInterFreqCell> getUmtsRanNeighborListInterFreqCell() {
            return _umtsRanNeighborListInterFreqCell;
        }
        
        @Override
        public UmtsRanNeighborListInterRatCell getUmtsRanNeighborListInterRatCell() {
            return _umtsRanNeighborListInterRatCell;
        }
        
        @Override
        public List<UmtsRanNeighborListIntraFreqCell> getUmtsRanNeighborListIntraFreqCell() {
            return _umtsRanNeighborListIntraFreqCell;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_umtsRanNeighborListInterFreqCell);
            result = prime * result + Objects.hashCode(_umtsRanNeighborListInterRatCell);
            result = prime * result + Objects.hashCode(_umtsRanNeighborListIntraFreqCell);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList)obj;
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
            if (!Objects.equals(_umtsRanNeighborListInterFreqCell, other.getUmtsRanNeighborListInterFreqCell())) {
                return false;
            }
            if (!Objects.equals(_umtsRanNeighborListInterRatCell, other.getUmtsRanNeighborListInterRatCell())) {
                return false;
            }
            if (!Objects.equals(_umtsRanNeighborListIntraFreqCell, other.getUmtsRanNeighborListIntraFreqCell())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanNeighborListImpl otherImpl = (UmtsRanNeighborListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanNeighborList [";
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
            if (_umtsRanNeighborListInterFreqCell != null) {
                builder.append("_umtsRanNeighborListInterFreqCell=");
                builder.append(_umtsRanNeighborListInterFreqCell);
                builder.append(", ");
            }
            if (_umtsRanNeighborListInterRatCell != null) {
                builder.append("_umtsRanNeighborListInterRatCell=");
                builder.append(_umtsRanNeighborListInterRatCell);
                builder.append(", ");
            }
            if (_umtsRanNeighborListIntraFreqCell != null) {
                builder.append("_umtsRanNeighborListIntraFreqCell=");
                builder.append(_umtsRanNeighborListIntraFreqCell);
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
