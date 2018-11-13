package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRedirect;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRan;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfpdsn;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthConfig;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd
 *
 */
public class Cdma2000HrpdBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd> {

    private BigInteger _batchPcfpdsnNumberOfEntries;
    private Cdma2000HrpdAccessAuthConfig _cdma2000HrpdAccessAuthConfig;
    private Cdma2000HrpdAccessAuthStats _cdma2000HrpdAccessAuthStats;
    private List<Cdma2000HrpdBatchPcfpdsn> _cdma2000HrpdBatchPcfpdsn;
    private Cdma2000HrpdCallControlStats _cdma2000HrpdCallControlStats;
    private Cdma2000HrpdPcfConfig _cdma2000HrpdPcfConfig;
    private List<Cdma2000HrpdPcfpdsn> _cdma2000HrpdPcfpdsn;
    private Cdma2000HrpdQoSStats _cdma2000HrpdQoSStats;
    private Cdma2000HrpdRan _cdma2000HrpdRan;
    private Cdma2000HrpdRedirect _cdma2000HrpdRedirect;
    private Cdma2000HrpdRncSigAppsStats _cdma2000HrpdRncSigAppsStats;
    private BigInteger _maxBatchPcfpdsnEntries;
    private BigInteger _pcfpdsnNumberOfEntries;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdBuilder() {
    }
    public Cdma2000HrpdBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdG arg) {
        this._pcfpdsnNumberOfEntries = arg.getPcfpdsnNumberOfEntries();
        this._maxBatchPcfpdsnEntries = arg.getMaxBatchPcfpdsnEntries();
        this._batchPcfpdsnNumberOfEntries = arg.getBatchPcfpdsnNumberOfEntries();
    }

    public Cdma2000HrpdBuilder(Cdma2000Hrpd base) {
        this._batchPcfpdsnNumberOfEntries = base.getBatchPcfpdsnNumberOfEntries();
        this._cdma2000HrpdAccessAuthConfig = base.getCdma2000HrpdAccessAuthConfig();
        this._cdma2000HrpdAccessAuthStats = base.getCdma2000HrpdAccessAuthStats();
        this._cdma2000HrpdBatchPcfpdsn = base.getCdma2000HrpdBatchPcfpdsn();
        this._cdma2000HrpdCallControlStats = base.getCdma2000HrpdCallControlStats();
        this._cdma2000HrpdPcfConfig = base.getCdma2000HrpdPcfConfig();
        this._cdma2000HrpdPcfpdsn = base.getCdma2000HrpdPcfpdsn();
        this._cdma2000HrpdQoSStats = base.getCdma2000HrpdQoSStats();
        this._cdma2000HrpdRan = base.getCdma2000HrpdRan();
        this._cdma2000HrpdRedirect = base.getCdma2000HrpdRedirect();
        this._cdma2000HrpdRncSigAppsStats = base.getCdma2000HrpdRncSigAppsStats();
        this._maxBatchPcfpdsnEntries = base.getMaxBatchPcfpdsnEntries();
        this._pcfpdsnNumberOfEntries = base.getPcfpdsnNumberOfEntries();
        if (base instanceof Cdma2000HrpdImpl) {
            Cdma2000HrpdImpl impl = (Cdma2000HrpdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdG) {
            this._pcfpdsnNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdG)arg).getPcfpdsnNumberOfEntries();
            this._maxBatchPcfpdsnEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdG)arg).getMaxBatchPcfpdsnEntries();
            this._batchPcfpdsnNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdG)arg).getBatchPcfpdsnNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getBatchPcfpdsnNumberOfEntries() {
        return _batchPcfpdsnNumberOfEntries;
    }
    
    public Cdma2000HrpdAccessAuthConfig getCdma2000HrpdAccessAuthConfig() {
        return _cdma2000HrpdAccessAuthConfig;
    }
    
    public Cdma2000HrpdAccessAuthStats getCdma2000HrpdAccessAuthStats() {
        return _cdma2000HrpdAccessAuthStats;
    }
    
    public List<Cdma2000HrpdBatchPcfpdsn> getCdma2000HrpdBatchPcfpdsn() {
        return _cdma2000HrpdBatchPcfpdsn;
    }
    
    public Cdma2000HrpdCallControlStats getCdma2000HrpdCallControlStats() {
        return _cdma2000HrpdCallControlStats;
    }
    
    public Cdma2000HrpdPcfConfig getCdma2000HrpdPcfConfig() {
        return _cdma2000HrpdPcfConfig;
    }
    
    public List<Cdma2000HrpdPcfpdsn> getCdma2000HrpdPcfpdsn() {
        return _cdma2000HrpdPcfpdsn;
    }
    
    public Cdma2000HrpdQoSStats getCdma2000HrpdQoSStats() {
        return _cdma2000HrpdQoSStats;
    }
    
    public Cdma2000HrpdRan getCdma2000HrpdRan() {
        return _cdma2000HrpdRan;
    }
    
    public Cdma2000HrpdRedirect getCdma2000HrpdRedirect() {
        return _cdma2000HrpdRedirect;
    }
    
    public Cdma2000HrpdRncSigAppsStats getCdma2000HrpdRncSigAppsStats() {
        return _cdma2000HrpdRncSigAppsStats;
    }
    
    public BigInteger getMaxBatchPcfpdsnEntries() {
        return _maxBatchPcfpdsnEntries;
    }
    
    public BigInteger getPcfpdsnNumberOfEntries() {
        return _pcfpdsnNumberOfEntries;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public Cdma2000HrpdBuilder setBatchPcfpdsnNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkBatchPcfpdsnNumberOfEntriesRange(value);
    }
        this._batchPcfpdsnNumberOfEntries = value;
        return this;
    }
    
     
    public Cdma2000HrpdBuilder setCdma2000HrpdAccessAuthConfig(final Cdma2000HrpdAccessAuthConfig value) {
        this._cdma2000HrpdAccessAuthConfig = value;
        return this;
    }
    
     
    public Cdma2000HrpdBuilder setCdma2000HrpdAccessAuthStats(final Cdma2000HrpdAccessAuthStats value) {
        this._cdma2000HrpdAccessAuthStats = value;
        return this;
    }
    
     
    public Cdma2000HrpdBuilder setCdma2000HrpdBatchPcfpdsn(final List<Cdma2000HrpdBatchPcfpdsn> value) {
        this._cdma2000HrpdBatchPcfpdsn = value;
        return this;
    }
    
     
    public Cdma2000HrpdBuilder setCdma2000HrpdCallControlStats(final Cdma2000HrpdCallControlStats value) {
        this._cdma2000HrpdCallControlStats = value;
        return this;
    }
    
     
    public Cdma2000HrpdBuilder setCdma2000HrpdPcfConfig(final Cdma2000HrpdPcfConfig value) {
        this._cdma2000HrpdPcfConfig = value;
        return this;
    }
    
     
    public Cdma2000HrpdBuilder setCdma2000HrpdPcfpdsn(final List<Cdma2000HrpdPcfpdsn> value) {
        this._cdma2000HrpdPcfpdsn = value;
        return this;
    }
    
     
    public Cdma2000HrpdBuilder setCdma2000HrpdQoSStats(final Cdma2000HrpdQoSStats value) {
        this._cdma2000HrpdQoSStats = value;
        return this;
    }
    
     
    public Cdma2000HrpdBuilder setCdma2000HrpdRan(final Cdma2000HrpdRan value) {
        this._cdma2000HrpdRan = value;
        return this;
    }
    
     
    public Cdma2000HrpdBuilder setCdma2000HrpdRedirect(final Cdma2000HrpdRedirect value) {
        this._cdma2000HrpdRedirect = value;
        return this;
    }
    
     
    public Cdma2000HrpdBuilder setCdma2000HrpdRncSigAppsStats(final Cdma2000HrpdRncSigAppsStats value) {
        this._cdma2000HrpdRncSigAppsStats = value;
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
    
    public Cdma2000HrpdBuilder setMaxBatchPcfpdsnEntries(final BigInteger value) {
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
    
    public Cdma2000HrpdBuilder setPcfpdsnNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkPcfpdsnNumberOfEntriesRange(value);
    }
        this._pcfpdsnNumberOfEntries = value;
        return this;
    }
    
    public Cdma2000HrpdBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000Hrpd build() {
        return new Cdma2000HrpdImpl(this);
    }

    private static final class Cdma2000HrpdImpl implements Cdma2000Hrpd {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd.class;
        }

        private final BigInteger _batchPcfpdsnNumberOfEntries;
        private final Cdma2000HrpdAccessAuthConfig _cdma2000HrpdAccessAuthConfig;
        private final Cdma2000HrpdAccessAuthStats _cdma2000HrpdAccessAuthStats;
        private final List<Cdma2000HrpdBatchPcfpdsn> _cdma2000HrpdBatchPcfpdsn;
        private final Cdma2000HrpdCallControlStats _cdma2000HrpdCallControlStats;
        private final Cdma2000HrpdPcfConfig _cdma2000HrpdPcfConfig;
        private final List<Cdma2000HrpdPcfpdsn> _cdma2000HrpdPcfpdsn;
        private final Cdma2000HrpdQoSStats _cdma2000HrpdQoSStats;
        private final Cdma2000HrpdRan _cdma2000HrpdRan;
        private final Cdma2000HrpdRedirect _cdma2000HrpdRedirect;
        private final Cdma2000HrpdRncSigAppsStats _cdma2000HrpdRncSigAppsStats;
        private final BigInteger _maxBatchPcfpdsnEntries;
        private final BigInteger _pcfpdsnNumberOfEntries;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdImpl(Cdma2000HrpdBuilder base) {
            this._batchPcfpdsnNumberOfEntries = base.getBatchPcfpdsnNumberOfEntries();
            this._cdma2000HrpdAccessAuthConfig = base.getCdma2000HrpdAccessAuthConfig();
            this._cdma2000HrpdAccessAuthStats = base.getCdma2000HrpdAccessAuthStats();
            this._cdma2000HrpdBatchPcfpdsn = base.getCdma2000HrpdBatchPcfpdsn();
            this._cdma2000HrpdCallControlStats = base.getCdma2000HrpdCallControlStats();
            this._cdma2000HrpdPcfConfig = base.getCdma2000HrpdPcfConfig();
            this._cdma2000HrpdPcfpdsn = base.getCdma2000HrpdPcfpdsn();
            this._cdma2000HrpdQoSStats = base.getCdma2000HrpdQoSStats();
            this._cdma2000HrpdRan = base.getCdma2000HrpdRan();
            this._cdma2000HrpdRedirect = base.getCdma2000HrpdRedirect();
            this._cdma2000HrpdRncSigAppsStats = base.getCdma2000HrpdRncSigAppsStats();
            this._maxBatchPcfpdsnEntries = base.getMaxBatchPcfpdsnEntries();
            this._pcfpdsnNumberOfEntries = base.getPcfpdsnNumberOfEntries();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>>singletonMap(e.getKey(), e.getValue());
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
        public Cdma2000HrpdAccessAuthConfig getCdma2000HrpdAccessAuthConfig() {
            return _cdma2000HrpdAccessAuthConfig;
        }
        
        @Override
        public Cdma2000HrpdAccessAuthStats getCdma2000HrpdAccessAuthStats() {
            return _cdma2000HrpdAccessAuthStats;
        }
        
        @Override
        public List<Cdma2000HrpdBatchPcfpdsn> getCdma2000HrpdBatchPcfpdsn() {
            return _cdma2000HrpdBatchPcfpdsn;
        }
        
        @Override
        public Cdma2000HrpdCallControlStats getCdma2000HrpdCallControlStats() {
            return _cdma2000HrpdCallControlStats;
        }
        
        @Override
        public Cdma2000HrpdPcfConfig getCdma2000HrpdPcfConfig() {
            return _cdma2000HrpdPcfConfig;
        }
        
        @Override
        public List<Cdma2000HrpdPcfpdsn> getCdma2000HrpdPcfpdsn() {
            return _cdma2000HrpdPcfpdsn;
        }
        
        @Override
        public Cdma2000HrpdQoSStats getCdma2000HrpdQoSStats() {
            return _cdma2000HrpdQoSStats;
        }
        
        @Override
        public Cdma2000HrpdRan getCdma2000HrpdRan() {
            return _cdma2000HrpdRan;
        }
        
        @Override
        public Cdma2000HrpdRedirect getCdma2000HrpdRedirect() {
            return _cdma2000HrpdRedirect;
        }
        
        @Override
        public Cdma2000HrpdRncSigAppsStats getCdma2000HrpdRncSigAppsStats() {
            return _cdma2000HrpdRncSigAppsStats;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cdma2000HrpdAccessAuthConfig);
            result = prime * result + Objects.hashCode(_cdma2000HrpdAccessAuthStats);
            result = prime * result + Objects.hashCode(_cdma2000HrpdBatchPcfpdsn);
            result = prime * result + Objects.hashCode(_cdma2000HrpdCallControlStats);
            result = prime * result + Objects.hashCode(_cdma2000HrpdPcfConfig);
            result = prime * result + Objects.hashCode(_cdma2000HrpdPcfpdsn);
            result = prime * result + Objects.hashCode(_cdma2000HrpdQoSStats);
            result = prime * result + Objects.hashCode(_cdma2000HrpdRan);
            result = prime * result + Objects.hashCode(_cdma2000HrpdRedirect);
            result = prime * result + Objects.hashCode(_cdma2000HrpdRncSigAppsStats);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd)obj;
            if (!Objects.equals(_batchPcfpdsnNumberOfEntries, other.getBatchPcfpdsnNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_cdma2000HrpdAccessAuthConfig, other.getCdma2000HrpdAccessAuthConfig())) {
                return false;
            }
            if (!Objects.equals(_cdma2000HrpdAccessAuthStats, other.getCdma2000HrpdAccessAuthStats())) {
                return false;
            }
            if (!Objects.equals(_cdma2000HrpdBatchPcfpdsn, other.getCdma2000HrpdBatchPcfpdsn())) {
                return false;
            }
            if (!Objects.equals(_cdma2000HrpdCallControlStats, other.getCdma2000HrpdCallControlStats())) {
                return false;
            }
            if (!Objects.equals(_cdma2000HrpdPcfConfig, other.getCdma2000HrpdPcfConfig())) {
                return false;
            }
            if (!Objects.equals(_cdma2000HrpdPcfpdsn, other.getCdma2000HrpdPcfpdsn())) {
                return false;
            }
            if (!Objects.equals(_cdma2000HrpdQoSStats, other.getCdma2000HrpdQoSStats())) {
                return false;
            }
            if (!Objects.equals(_cdma2000HrpdRan, other.getCdma2000HrpdRan())) {
                return false;
            }
            if (!Objects.equals(_cdma2000HrpdRedirect, other.getCdma2000HrpdRedirect())) {
                return false;
            }
            if (!Objects.equals(_cdma2000HrpdRncSigAppsStats, other.getCdma2000HrpdRncSigAppsStats())) {
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
                Cdma2000HrpdImpl otherImpl = (Cdma2000HrpdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000Hrpd [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_batchPcfpdsnNumberOfEntries != null) {
                builder.append("_batchPcfpdsnNumberOfEntries=");
                builder.append(_batchPcfpdsnNumberOfEntries);
                builder.append(", ");
            }
            if (_cdma2000HrpdAccessAuthConfig != null) {
                builder.append("_cdma2000HrpdAccessAuthConfig=");
                builder.append(_cdma2000HrpdAccessAuthConfig);
                builder.append(", ");
            }
            if (_cdma2000HrpdAccessAuthStats != null) {
                builder.append("_cdma2000HrpdAccessAuthStats=");
                builder.append(_cdma2000HrpdAccessAuthStats);
                builder.append(", ");
            }
            if (_cdma2000HrpdBatchPcfpdsn != null) {
                builder.append("_cdma2000HrpdBatchPcfpdsn=");
                builder.append(_cdma2000HrpdBatchPcfpdsn);
                builder.append(", ");
            }
            if (_cdma2000HrpdCallControlStats != null) {
                builder.append("_cdma2000HrpdCallControlStats=");
                builder.append(_cdma2000HrpdCallControlStats);
                builder.append(", ");
            }
            if (_cdma2000HrpdPcfConfig != null) {
                builder.append("_cdma2000HrpdPcfConfig=");
                builder.append(_cdma2000HrpdPcfConfig);
                builder.append(", ");
            }
            if (_cdma2000HrpdPcfpdsn != null) {
                builder.append("_cdma2000HrpdPcfpdsn=");
                builder.append(_cdma2000HrpdPcfpdsn);
                builder.append(", ");
            }
            if (_cdma2000HrpdQoSStats != null) {
                builder.append("_cdma2000HrpdQoSStats=");
                builder.append(_cdma2000HrpdQoSStats);
                builder.append(", ");
            }
            if (_cdma2000HrpdRan != null) {
                builder.append("_cdma2000HrpdRan=");
                builder.append(_cdma2000HrpdRan);
                builder.append(", ");
            }
            if (_cdma2000HrpdRedirect != null) {
                builder.append("_cdma2000HrpdRedirect=");
                builder.append(_cdma2000HrpdRedirect);
                builder.append(", ");
            }
            if (_cdma2000HrpdRncSigAppsStats != null) {
                builder.append("_cdma2000HrpdRncSigAppsStats=");
                builder.append(_cdma2000HrpdRncSigAppsStats);
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
