package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXBatchPcfpdsn;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRedirect;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX
 *
 */
public class Cdma2000OneXBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX> {

    private BigInteger _batchPcfpdsnNumberOfEntries;
    private List<Cdma2000OneXBatchPcfpdsn> _cdma2000OneXBatchPcfpdsn;
    private Cdma2000OneXPcfConfig _cdma2000OneXPcfConfig;
    private List<Cdma2000OneXPcfpdsn> _cdma2000OneXPcfpdsn;
    private Cdma2000OneXRan _cdma2000OneXRan;
    private Cdma2000OneXRedirect _cdma2000OneXRedirect;
    private Cdma2000OneXStats _cdma2000OneXStats;
    private BigInteger _maxBatchPcfpdsnEntries;
    private BigInteger _pcfpdsnNumberOfEntries;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>> augmentation = Collections.emptyMap();

    public Cdma2000OneXBuilder() {
    }
    public Cdma2000OneXBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXG arg) {
        this._pcfpdsnNumberOfEntries = arg.getPcfpdsnNumberOfEntries();
        this._maxBatchPcfpdsnEntries = arg.getMaxBatchPcfpdsnEntries();
        this._batchPcfpdsnNumberOfEntries = arg.getBatchPcfpdsnNumberOfEntries();
    }

    public Cdma2000OneXBuilder(Cdma2000OneX base) {
        this._batchPcfpdsnNumberOfEntries = base.getBatchPcfpdsnNumberOfEntries();
        this._cdma2000OneXBatchPcfpdsn = base.getCdma2000OneXBatchPcfpdsn();
        this._cdma2000OneXPcfConfig = base.getCdma2000OneXPcfConfig();
        this._cdma2000OneXPcfpdsn = base.getCdma2000OneXPcfpdsn();
        this._cdma2000OneXRan = base.getCdma2000OneXRan();
        this._cdma2000OneXRedirect = base.getCdma2000OneXRedirect();
        this._cdma2000OneXStats = base.getCdma2000OneXStats();
        this._maxBatchPcfpdsnEntries = base.getMaxBatchPcfpdsnEntries();
        this._pcfpdsnNumberOfEntries = base.getPcfpdsnNumberOfEntries();
        if (base instanceof Cdma2000OneXImpl) {
            Cdma2000OneXImpl impl = (Cdma2000OneXImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXG) {
            this._pcfpdsnNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXG)arg).getPcfpdsnNumberOfEntries();
            this._maxBatchPcfpdsnEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXG)arg).getMaxBatchPcfpdsnEntries();
            this._batchPcfpdsnNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXG)arg).getBatchPcfpdsnNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getBatchPcfpdsnNumberOfEntries() {
        return _batchPcfpdsnNumberOfEntries;
    }
    
    public List<Cdma2000OneXBatchPcfpdsn> getCdma2000OneXBatchPcfpdsn() {
        return _cdma2000OneXBatchPcfpdsn;
    }
    
    public Cdma2000OneXPcfConfig getCdma2000OneXPcfConfig() {
        return _cdma2000OneXPcfConfig;
    }
    
    public List<Cdma2000OneXPcfpdsn> getCdma2000OneXPcfpdsn() {
        return _cdma2000OneXPcfpdsn;
    }
    
    public Cdma2000OneXRan getCdma2000OneXRan() {
        return _cdma2000OneXRan;
    }
    
    public Cdma2000OneXRedirect getCdma2000OneXRedirect() {
        return _cdma2000OneXRedirect;
    }
    
    public Cdma2000OneXStats getCdma2000OneXStats() {
        return _cdma2000OneXStats;
    }
    
    public BigInteger getMaxBatchPcfpdsnEntries() {
        return _maxBatchPcfpdsnEntries;
    }
    
    public BigInteger getPcfpdsnNumberOfEntries() {
        return _pcfpdsnNumberOfEntries;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKBATCHPCFPDSNNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKBATCHPCFPDSNNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkBatchPcfpdsnNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKBATCHPCFPDSNNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKBATCHPCFPDSNNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public Cdma2000OneXBuilder setBatchPcfpdsnNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkBatchPcfpdsnNumberOfEntriesRange(value);
    }
        this._batchPcfpdsnNumberOfEntries = value;
        return this;
    }
    
     
    public Cdma2000OneXBuilder setCdma2000OneXBatchPcfpdsn(final List<Cdma2000OneXBatchPcfpdsn> value) {
        this._cdma2000OneXBatchPcfpdsn = value;
        return this;
    }
    
     
    public Cdma2000OneXBuilder setCdma2000OneXPcfConfig(final Cdma2000OneXPcfConfig value) {
        this._cdma2000OneXPcfConfig = value;
        return this;
    }
    
     
    public Cdma2000OneXBuilder setCdma2000OneXPcfpdsn(final List<Cdma2000OneXPcfpdsn> value) {
        this._cdma2000OneXPcfpdsn = value;
        return this;
    }
    
     
    public Cdma2000OneXBuilder setCdma2000OneXRan(final Cdma2000OneXRan value) {
        this._cdma2000OneXRan = value;
        return this;
    }
    
     
    public Cdma2000OneXBuilder setCdma2000OneXRedirect(final Cdma2000OneXRedirect value) {
        this._cdma2000OneXRedirect = value;
        return this;
    }
    
     
    public Cdma2000OneXBuilder setCdma2000OneXStats(final Cdma2000OneXStats value) {
        this._cdma2000OneXStats = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXBATCHPCFPDSNENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXBATCHPCFPDSNENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxBatchPcfpdsnEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXBATCHPCFPDSNENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXBATCHPCFPDSNENTRIESRANGE_RANGES)));
     }
    
    public Cdma2000OneXBuilder setMaxBatchPcfpdsnEntries(final BigInteger value) {
    if (value != null) {
        checkMaxBatchPcfpdsnEntriesRange(value);
    }
        this._maxBatchPcfpdsnEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKPCFPDSNNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKPCFPDSNNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkPcfpdsnNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKPCFPDSNNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKPCFPDSNNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public Cdma2000OneXBuilder setPcfpdsnNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkPcfpdsnNumberOfEntriesRange(value);
    }
        this._pcfpdsnNumberOfEntries = value;
        return this;
    }
    
    public Cdma2000OneXBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneX build() {
        return new Cdma2000OneXImpl(this);
    }

    private static final class Cdma2000OneXImpl implements Cdma2000OneX {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX.class;
        }

        private final BigInteger _batchPcfpdsnNumberOfEntries;
        private final List<Cdma2000OneXBatchPcfpdsn> _cdma2000OneXBatchPcfpdsn;
        private final Cdma2000OneXPcfConfig _cdma2000OneXPcfConfig;
        private final List<Cdma2000OneXPcfpdsn> _cdma2000OneXPcfpdsn;
        private final Cdma2000OneXRan _cdma2000OneXRan;
        private final Cdma2000OneXRedirect _cdma2000OneXRedirect;
        private final Cdma2000OneXStats _cdma2000OneXStats;
        private final BigInteger _maxBatchPcfpdsnEntries;
        private final BigInteger _pcfpdsnNumberOfEntries;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>> augmentation = Collections.emptyMap();

        private Cdma2000OneXImpl(Cdma2000OneXBuilder base) {
            this._batchPcfpdsnNumberOfEntries = base.getBatchPcfpdsnNumberOfEntries();
            this._cdma2000OneXBatchPcfpdsn = base.getCdma2000OneXBatchPcfpdsn();
            this._cdma2000OneXPcfConfig = base.getCdma2000OneXPcfConfig();
            this._cdma2000OneXPcfpdsn = base.getCdma2000OneXPcfpdsn();
            this._cdma2000OneXRan = base.getCdma2000OneXRan();
            this._cdma2000OneXRedirect = base.getCdma2000OneXRedirect();
            this._cdma2000OneXStats = base.getCdma2000OneXStats();
            this._maxBatchPcfpdsnEntries = base.getMaxBatchPcfpdsnEntries();
            this._pcfpdsnNumberOfEntries = base.getPcfpdsnNumberOfEntries();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getBatchPcfpdsnNumberOfEntries() {
            return _batchPcfpdsnNumberOfEntries;
        }
        
        @Override
        public List<Cdma2000OneXBatchPcfpdsn> getCdma2000OneXBatchPcfpdsn() {
            return _cdma2000OneXBatchPcfpdsn;
        }
        
        @Override
        public Cdma2000OneXPcfConfig getCdma2000OneXPcfConfig() {
            return _cdma2000OneXPcfConfig;
        }
        
        @Override
        public List<Cdma2000OneXPcfpdsn> getCdma2000OneXPcfpdsn() {
            return _cdma2000OneXPcfpdsn;
        }
        
        @Override
        public Cdma2000OneXRan getCdma2000OneXRan() {
            return _cdma2000OneXRan;
        }
        
        @Override
        public Cdma2000OneXRedirect getCdma2000OneXRedirect() {
            return _cdma2000OneXRedirect;
        }
        
        @Override
        public Cdma2000OneXStats getCdma2000OneXStats() {
            return _cdma2000OneXStats;
        }
        
        @Override
        public BigInteger getMaxBatchPcfpdsnEntries() {
            return _maxBatchPcfpdsnEntries;
        }
        
        @Override
        public BigInteger getPcfpdsnNumberOfEntries() {
            return _pcfpdsnNumberOfEntries;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_batchPcfpdsnNumberOfEntries);
            result = prime * result + Objects.hashCode(_cdma2000OneXBatchPcfpdsn);
            result = prime * result + Objects.hashCode(_cdma2000OneXPcfConfig);
            result = prime * result + Objects.hashCode(_cdma2000OneXPcfpdsn);
            result = prime * result + Objects.hashCode(_cdma2000OneXRan);
            result = prime * result + Objects.hashCode(_cdma2000OneXRedirect);
            result = prime * result + Objects.hashCode(_cdma2000OneXStats);
            result = prime * result + Objects.hashCode(_maxBatchPcfpdsnEntries);
            result = prime * result + Objects.hashCode(_pcfpdsnNumberOfEntries);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX)obj;
            if (!Objects.equals(_batchPcfpdsnNumberOfEntries, other.getBatchPcfpdsnNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXBatchPcfpdsn, other.getCdma2000OneXBatchPcfpdsn())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXPcfConfig, other.getCdma2000OneXPcfConfig())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXPcfpdsn, other.getCdma2000OneXPcfpdsn())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRan, other.getCdma2000OneXRan())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRedirect, other.getCdma2000OneXRedirect())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXStats, other.getCdma2000OneXStats())) {
                return false;
            }
            if (!Objects.equals(_maxBatchPcfpdsnEntries, other.getMaxBatchPcfpdsnEntries())) {
                return false;
            }
            if (!Objects.equals(_pcfpdsnNumberOfEntries, other.getPcfpdsnNumberOfEntries())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXImpl otherImpl = (Cdma2000OneXImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneX [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_batchPcfpdsnNumberOfEntries != null) {
                builder.append("_batchPcfpdsnNumberOfEntries=");
                builder.append(_batchPcfpdsnNumberOfEntries);
                builder.append(", ");
            }
            if (_cdma2000OneXBatchPcfpdsn != null) {
                builder.append("_cdma2000OneXBatchPcfpdsn=");
                builder.append(_cdma2000OneXBatchPcfpdsn);
                builder.append(", ");
            }
            if (_cdma2000OneXPcfConfig != null) {
                builder.append("_cdma2000OneXPcfConfig=");
                builder.append(_cdma2000OneXPcfConfig);
                builder.append(", ");
            }
            if (_cdma2000OneXPcfpdsn != null) {
                builder.append("_cdma2000OneXPcfpdsn=");
                builder.append(_cdma2000OneXPcfpdsn);
                builder.append(", ");
            }
            if (_cdma2000OneXRan != null) {
                builder.append("_cdma2000OneXRan=");
                builder.append(_cdma2000OneXRan);
                builder.append(", ");
            }
            if (_cdma2000OneXRedirect != null) {
                builder.append("_cdma2000OneXRedirect=");
                builder.append(_cdma2000OneXRedirect);
                builder.append(", ");
            }
            if (_cdma2000OneXStats != null) {
                builder.append("_cdma2000OneXStats=");
                builder.append(_cdma2000OneXStats);
                builder.append(", ");
            }
            if (_maxBatchPcfpdsnEntries != null) {
                builder.append("_maxBatchPcfpdsnEntries=");
                builder.append(_maxBatchPcfpdsnEntries);
                builder.append(", ");
            }
            if (_pcfpdsnNumberOfEntries != null) {
                builder.append("_pcfpdsnNumberOfEntries=");
                builder.append(_pcfpdsnNumberOfEntries);
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
