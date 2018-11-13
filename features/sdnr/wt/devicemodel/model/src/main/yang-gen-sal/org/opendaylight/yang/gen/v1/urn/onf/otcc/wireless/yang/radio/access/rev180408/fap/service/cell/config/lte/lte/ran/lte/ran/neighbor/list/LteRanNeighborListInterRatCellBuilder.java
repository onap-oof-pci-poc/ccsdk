package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell.LteRanNeighborListInterRatCellCdma2000;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell.LteRanNeighborListInterRatCellUmts;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell.LteRanNeighborListInterRatCellGsm;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell
 *
 */
public class LteRanNeighborListInterRatCellBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell> {

    private BigInteger _cdma2000NumberOfEntries;
    private BigInteger _gsmNumberOfEntries;
    private List<LteRanNeighborListInterRatCellCdma2000> _lteRanNeighborListInterRatCellCdma2000;
    private List<LteRanNeighborListInterRatCellGsm> _lteRanNeighborListInterRatCellGsm;
    private List<LteRanNeighborListInterRatCellUmts> _lteRanNeighborListInterRatCellUmts;
    private BigInteger _maxCdma2000Entries;
    private BigInteger _maxGsmEntries;
    private BigInteger _maxUmtsEntries;
    private BigInteger _umtsNumberOfEntries;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>> augmentation = Collections.emptyMap();

    public LteRanNeighborListInterRatCellBuilder() {
    }
    public LteRanNeighborListInterRatCellBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellG arg) {
        this._maxUmtsEntries = arg.getMaxUmtsEntries();
        this._maxGsmEntries = arg.getMaxGsmEntries();
        this._maxCdma2000Entries = arg.getMaxCdma2000Entries();
        this._umtsNumberOfEntries = arg.getUmtsNumberOfEntries();
        this._gsmNumberOfEntries = arg.getGsmNumberOfEntries();
        this._cdma2000NumberOfEntries = arg.getCdma2000NumberOfEntries();
    }

    public LteRanNeighborListInterRatCellBuilder(LteRanNeighborListInterRatCell base) {
        this._cdma2000NumberOfEntries = base.getCdma2000NumberOfEntries();
        this._gsmNumberOfEntries = base.getGsmNumberOfEntries();
        this._lteRanNeighborListInterRatCellCdma2000 = base.getLteRanNeighborListInterRatCellCdma2000();
        this._lteRanNeighborListInterRatCellGsm = base.getLteRanNeighborListInterRatCellGsm();
        this._lteRanNeighborListInterRatCellUmts = base.getLteRanNeighborListInterRatCellUmts();
        this._maxCdma2000Entries = base.getMaxCdma2000Entries();
        this._maxGsmEntries = base.getMaxGsmEntries();
        this._maxUmtsEntries = base.getMaxUmtsEntries();
        this._umtsNumberOfEntries = base.getUmtsNumberOfEntries();
        if (base instanceof LteRanNeighborListInterRatCellImpl) {
            LteRanNeighborListInterRatCellImpl impl = (LteRanNeighborListInterRatCellImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellG) {
            this._maxUmtsEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellG)arg).getMaxUmtsEntries();
            this._maxGsmEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellG)arg).getMaxGsmEntries();
            this._maxCdma2000Entries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellG)arg).getMaxCdma2000Entries();
            this._umtsNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellG)arg).getUmtsNumberOfEntries();
            this._gsmNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellG)arg).getGsmNumberOfEntries();
            this._cdma2000NumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellG)arg).getCdma2000NumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getCdma2000NumberOfEntries() {
        return _cdma2000NumberOfEntries;
    }
    
    public BigInteger getGsmNumberOfEntries() {
        return _gsmNumberOfEntries;
    }
    
    public List<LteRanNeighborListInterRatCellCdma2000> getLteRanNeighborListInterRatCellCdma2000() {
        return _lteRanNeighborListInterRatCellCdma2000;
    }
    
    public List<LteRanNeighborListInterRatCellGsm> getLteRanNeighborListInterRatCellGsm() {
        return _lteRanNeighborListInterRatCellGsm;
    }
    
    public List<LteRanNeighborListInterRatCellUmts> getLteRanNeighborListInterRatCellUmts() {
        return _lteRanNeighborListInterRatCellUmts;
    }
    
    public BigInteger getMaxCdma2000Entries() {
        return _maxCdma2000Entries;
    }
    
    public BigInteger getMaxGsmEntries() {
        return _maxGsmEntries;
    }
    
    public BigInteger getMaxUmtsEntries() {
        return _maxUmtsEntries;
    }
    
    public BigInteger getUmtsNumberOfEntries() {
        return _umtsNumberOfEntries;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCDMA2000NUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCDMA2000NUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkCdma2000NumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCDMA2000NUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCDMA2000NUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public LteRanNeighborListInterRatCellBuilder setCdma2000NumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkCdma2000NumberOfEntriesRange(value);
    }
        this._cdma2000NumberOfEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKGSMNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKGSMNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkGsmNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKGSMNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKGSMNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public LteRanNeighborListInterRatCellBuilder setGsmNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkGsmNumberOfEntriesRange(value);
    }
        this._gsmNumberOfEntries = value;
        return this;
    }
    
     
    public LteRanNeighborListInterRatCellBuilder setLteRanNeighborListInterRatCellCdma2000(final List<LteRanNeighborListInterRatCellCdma2000> value) {
        this._lteRanNeighborListInterRatCellCdma2000 = value;
        return this;
    }
    
     
    public LteRanNeighborListInterRatCellBuilder setLteRanNeighborListInterRatCellGsm(final List<LteRanNeighborListInterRatCellGsm> value) {
        this._lteRanNeighborListInterRatCellGsm = value;
        return this;
    }
    
     
    public LteRanNeighborListInterRatCellBuilder setLteRanNeighborListInterRatCellUmts(final List<LteRanNeighborListInterRatCellUmts> value) {
        this._lteRanNeighborListInterRatCellUmts = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXCDMA2000ENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXCDMA2000ENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxCdma2000EntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXCDMA2000ENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXCDMA2000ENTRIESRANGE_RANGES)));
     }
    
    public LteRanNeighborListInterRatCellBuilder setMaxCdma2000Entries(final BigInteger value) {
    if (value != null) {
        checkMaxCdma2000EntriesRange(value);
    }
        this._maxCdma2000Entries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXGSMENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXGSMENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxGsmEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXGSMENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXGSMENTRIESRANGE_RANGES)));
     }
    
    public LteRanNeighborListInterRatCellBuilder setMaxGsmEntries(final BigInteger value) {
    if (value != null) {
        checkMaxGsmEntriesRange(value);
    }
        this._maxGsmEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXUMTSENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXUMTSENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxUmtsEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXUMTSENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXUMTSENTRIESRANGE_RANGES)));
     }
    
    public LteRanNeighborListInterRatCellBuilder setMaxUmtsEntries(final BigInteger value) {
    if (value != null) {
        checkMaxUmtsEntriesRange(value);
    }
        this._maxUmtsEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKUMTSNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKUMTSNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkUmtsNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKUMTSNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKUMTSNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public LteRanNeighborListInterRatCellBuilder setUmtsNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkUmtsNumberOfEntriesRange(value);
    }
        this._umtsNumberOfEntries = value;
        return this;
    }
    
    public LteRanNeighborListInterRatCellBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanNeighborListInterRatCellBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanNeighborListInterRatCell build() {
        return new LteRanNeighborListInterRatCellImpl(this);
    }

    private static final class LteRanNeighborListInterRatCellImpl implements LteRanNeighborListInterRatCell {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell.class;
        }

        private final BigInteger _cdma2000NumberOfEntries;
        private final BigInteger _gsmNumberOfEntries;
        private final List<LteRanNeighborListInterRatCellCdma2000> _lteRanNeighborListInterRatCellCdma2000;
        private final List<LteRanNeighborListInterRatCellGsm> _lteRanNeighborListInterRatCellGsm;
        private final List<LteRanNeighborListInterRatCellUmts> _lteRanNeighborListInterRatCellUmts;
        private final BigInteger _maxCdma2000Entries;
        private final BigInteger _maxGsmEntries;
        private final BigInteger _maxUmtsEntries;
        private final BigInteger _umtsNumberOfEntries;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>> augmentation = Collections.emptyMap();

        private LteRanNeighborListInterRatCellImpl(LteRanNeighborListInterRatCellBuilder base) {
            this._cdma2000NumberOfEntries = base.getCdma2000NumberOfEntries();
            this._gsmNumberOfEntries = base.getGsmNumberOfEntries();
            this._lteRanNeighborListInterRatCellCdma2000 = base.getLteRanNeighborListInterRatCellCdma2000();
            this._lteRanNeighborListInterRatCellGsm = base.getLteRanNeighborListInterRatCellGsm();
            this._lteRanNeighborListInterRatCellUmts = base.getLteRanNeighborListInterRatCellUmts();
            this._maxCdma2000Entries = base.getMaxCdma2000Entries();
            this._maxGsmEntries = base.getMaxGsmEntries();
            this._maxUmtsEntries = base.getMaxUmtsEntries();
            this._umtsNumberOfEntries = base.getUmtsNumberOfEntries();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getCdma2000NumberOfEntries() {
            return _cdma2000NumberOfEntries;
        }
        
        @Override
        public BigInteger getGsmNumberOfEntries() {
            return _gsmNumberOfEntries;
        }
        
        @Override
        public List<LteRanNeighborListInterRatCellCdma2000> getLteRanNeighborListInterRatCellCdma2000() {
            return _lteRanNeighborListInterRatCellCdma2000;
        }
        
        @Override
        public List<LteRanNeighborListInterRatCellGsm> getLteRanNeighborListInterRatCellGsm() {
            return _lteRanNeighborListInterRatCellGsm;
        }
        
        @Override
        public List<LteRanNeighborListInterRatCellUmts> getLteRanNeighborListInterRatCellUmts() {
            return _lteRanNeighborListInterRatCellUmts;
        }
        
        @Override
        public BigInteger getMaxCdma2000Entries() {
            return _maxCdma2000Entries;
        }
        
        @Override
        public BigInteger getMaxGsmEntries() {
            return _maxGsmEntries;
        }
        
        @Override
        public BigInteger getMaxUmtsEntries() {
            return _maxUmtsEntries;
        }
        
        @Override
        public BigInteger getUmtsNumberOfEntries() {
            return _umtsNumberOfEntries;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cdma2000NumberOfEntries);
            result = prime * result + Objects.hashCode(_gsmNumberOfEntries);
            result = prime * result + Objects.hashCode(_lteRanNeighborListInterRatCellCdma2000);
            result = prime * result + Objects.hashCode(_lteRanNeighborListInterRatCellGsm);
            result = prime * result + Objects.hashCode(_lteRanNeighborListInterRatCellUmts);
            result = prime * result + Objects.hashCode(_maxCdma2000Entries);
            result = prime * result + Objects.hashCode(_maxGsmEntries);
            result = prime * result + Objects.hashCode(_maxUmtsEntries);
            result = prime * result + Objects.hashCode(_umtsNumberOfEntries);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell)obj;
            if (!Objects.equals(_cdma2000NumberOfEntries, other.getCdma2000NumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_gsmNumberOfEntries, other.getGsmNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_lteRanNeighborListInterRatCellCdma2000, other.getLteRanNeighborListInterRatCellCdma2000())) {
                return false;
            }
            if (!Objects.equals(_lteRanNeighborListInterRatCellGsm, other.getLteRanNeighborListInterRatCellGsm())) {
                return false;
            }
            if (!Objects.equals(_lteRanNeighborListInterRatCellUmts, other.getLteRanNeighborListInterRatCellUmts())) {
                return false;
            }
            if (!Objects.equals(_maxCdma2000Entries, other.getMaxCdma2000Entries())) {
                return false;
            }
            if (!Objects.equals(_maxGsmEntries, other.getMaxGsmEntries())) {
                return false;
            }
            if (!Objects.equals(_maxUmtsEntries, other.getMaxUmtsEntries())) {
                return false;
            }
            if (!Objects.equals(_umtsNumberOfEntries, other.getUmtsNumberOfEntries())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanNeighborListInterRatCellImpl otherImpl = (LteRanNeighborListInterRatCellImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanNeighborListInterRatCell [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cdma2000NumberOfEntries != null) {
                builder.append("_cdma2000NumberOfEntries=");
                builder.append(_cdma2000NumberOfEntries);
                builder.append(", ");
            }
            if (_gsmNumberOfEntries != null) {
                builder.append("_gsmNumberOfEntries=");
                builder.append(_gsmNumberOfEntries);
                builder.append(", ");
            }
            if (_lteRanNeighborListInterRatCellCdma2000 != null) {
                builder.append("_lteRanNeighborListInterRatCellCdma2000=");
                builder.append(_lteRanNeighborListInterRatCellCdma2000);
                builder.append(", ");
            }
            if (_lteRanNeighborListInterRatCellGsm != null) {
                builder.append("_lteRanNeighborListInterRatCellGsm=");
                builder.append(_lteRanNeighborListInterRatCellGsm);
                builder.append(", ");
            }
            if (_lteRanNeighborListInterRatCellUmts != null) {
                builder.append("_lteRanNeighborListInterRatCellUmts=");
                builder.append(_lteRanNeighborListInterRatCellUmts);
                builder.append(", ");
            }
            if (_maxCdma2000Entries != null) {
                builder.append("_maxCdma2000Entries=");
                builder.append(_maxCdma2000Entries);
                builder.append(", ");
            }
            if (_maxGsmEntries != null) {
                builder.append("_maxGsmEntries=");
                builder.append(_maxGsmEntries);
                builder.append(", ");
            }
            if (_maxUmtsEntries != null) {
                builder.append("_maxUmtsEntries=");
                builder.append(_maxUmtsEntries);
                builder.append(", ");
            }
            if (_umtsNumberOfEntries != null) {
                builder.append("_umtsNumberOfEntries=");
                builder.append(_umtsNumberOfEntries);
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
