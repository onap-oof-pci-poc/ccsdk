package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab
 *
 */
public class UmtsRabBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab> {

    private BigInteger _failHo;
    private BigInteger _rabFailEstabCs;
    private BigInteger _rabFailEstabPs;
    private BigInteger _rabSuccEstabCs;
    private BigInteger _rabSuccEstabPs;
    private BigInteger _rabcsSetupTimeMax;
    private BigInteger _rabcsSetupTimeMean;
    private BigInteger _rabpsSetupTimeMax;
    private BigInteger _rabpsSetupTimeMean;
    private BigInteger _succHo;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>> augmentation = Collections.emptyMap();

    public UmtsRabBuilder() {
    }
    public UmtsRabBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG arg) {
        this._rabSuccEstabCs = arg.getRabSuccEstabCs();
        this._rabFailEstabCs = arg.getRabFailEstabCs();
        this._rabSuccEstabPs = arg.getRabSuccEstabPs();
        this._rabFailEstabPs = arg.getRabFailEstabPs();
        this._rabcsSetupTimeMean = arg.getRabcsSetupTimeMean();
        this._rabcsSetupTimeMax = arg.getRabcsSetupTimeMax();
        this._rabpsSetupTimeMean = arg.getRabpsSetupTimeMean();
        this._rabpsSetupTimeMax = arg.getRabpsSetupTimeMax();
        this._failHo = arg.getFailHo();
        this._succHo = arg.getSuccHo();
    }

    public UmtsRabBuilder(UmtsRab base) {
        this._failHo = base.getFailHo();
        this._rabFailEstabCs = base.getRabFailEstabCs();
        this._rabFailEstabPs = base.getRabFailEstabPs();
        this._rabSuccEstabCs = base.getRabSuccEstabCs();
        this._rabSuccEstabPs = base.getRabSuccEstabPs();
        this._rabcsSetupTimeMax = base.getRabcsSetupTimeMax();
        this._rabcsSetupTimeMean = base.getRabcsSetupTimeMean();
        this._rabpsSetupTimeMax = base.getRabpsSetupTimeMax();
        this._rabpsSetupTimeMean = base.getRabpsSetupTimeMean();
        this._succHo = base.getSuccHo();
        if (base instanceof UmtsRabImpl) {
            UmtsRabImpl impl = (UmtsRabImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG) {
            this._rabSuccEstabCs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG)arg).getRabSuccEstabCs();
            this._rabFailEstabCs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG)arg).getRabFailEstabCs();
            this._rabSuccEstabPs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG)arg).getRabSuccEstabPs();
            this._rabFailEstabPs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG)arg).getRabFailEstabPs();
            this._rabcsSetupTimeMean = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG)arg).getRabcsSetupTimeMean();
            this._rabcsSetupTimeMax = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG)arg).getRabcsSetupTimeMax();
            this._rabpsSetupTimeMean = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG)arg).getRabpsSetupTimeMean();
            this._rabpsSetupTimeMax = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG)arg).getRabpsSetupTimeMax();
            this._failHo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG)arg).getFailHo();
            this._succHo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG)arg).getSuccHo();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getFailHo() {
        return _failHo;
    }
    
    public BigInteger getRabFailEstabCs() {
        return _rabFailEstabCs;
    }
    
    public BigInteger getRabFailEstabPs() {
        return _rabFailEstabPs;
    }
    
    public BigInteger getRabSuccEstabCs() {
        return _rabSuccEstabCs;
    }
    
    public BigInteger getRabSuccEstabPs() {
        return _rabSuccEstabPs;
    }
    
    public BigInteger getRabcsSetupTimeMax() {
        return _rabcsSetupTimeMax;
    }
    
    public BigInteger getRabcsSetupTimeMean() {
        return _rabcsSetupTimeMean;
    }
    
    public BigInteger getRabpsSetupTimeMax() {
        return _rabpsSetupTimeMax;
    }
    
    public BigInteger getRabpsSetupTimeMean() {
        return _rabpsSetupTimeMean;
    }
    
    public BigInteger getSuccHo() {
        return _succHo;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKFAILHORANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKFAILHORANGE_RANGES = a;
     }
     private static void checkFailHoRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKFAILHORANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKFAILHORANGE_RANGES)));
     }
    
    public UmtsRabBuilder setFailHo(final BigInteger value) {
    if (value != null) {
        checkFailHoRange(value);
    }
        this._failHo = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRABFAILESTABCSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRABFAILESTABCSRANGE_RANGES = a;
     }
     private static void checkRabFailEstabCsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRABFAILESTABCSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRABFAILESTABCSRANGE_RANGES)));
     }
    
    public UmtsRabBuilder setRabFailEstabCs(final BigInteger value) {
    if (value != null) {
        checkRabFailEstabCsRange(value);
    }
        this._rabFailEstabCs = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRABFAILESTABPSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRABFAILESTABPSRANGE_RANGES = a;
     }
     private static void checkRabFailEstabPsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRABFAILESTABPSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRABFAILESTABPSRANGE_RANGES)));
     }
    
    public UmtsRabBuilder setRabFailEstabPs(final BigInteger value) {
    if (value != null) {
        checkRabFailEstabPsRange(value);
    }
        this._rabFailEstabPs = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRABSUCCESTABCSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRABSUCCESTABCSRANGE_RANGES = a;
     }
     private static void checkRabSuccEstabCsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRABSUCCESTABCSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRABSUCCESTABCSRANGE_RANGES)));
     }
    
    public UmtsRabBuilder setRabSuccEstabCs(final BigInteger value) {
    if (value != null) {
        checkRabSuccEstabCsRange(value);
    }
        this._rabSuccEstabCs = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRABSUCCESTABPSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRABSUCCESTABPSRANGE_RANGES = a;
     }
     private static void checkRabSuccEstabPsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRABSUCCESTABPSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRABSUCCESTABPSRANGE_RANGES)));
     }
    
    public UmtsRabBuilder setRabSuccEstabPs(final BigInteger value) {
    if (value != null) {
        checkRabSuccEstabPsRange(value);
    }
        this._rabSuccEstabPs = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRABCSSETUPTIMEMAXRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRABCSSETUPTIMEMAXRANGE_RANGES = a;
     }
     private static void checkRabcsSetupTimeMaxRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRABCSSETUPTIMEMAXRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRABCSSETUPTIMEMAXRANGE_RANGES)));
     }
    
    public UmtsRabBuilder setRabcsSetupTimeMax(final BigInteger value) {
    if (value != null) {
        checkRabcsSetupTimeMaxRange(value);
    }
        this._rabcsSetupTimeMax = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRABCSSETUPTIMEMEANRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRABCSSETUPTIMEMEANRANGE_RANGES = a;
     }
     private static void checkRabcsSetupTimeMeanRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRABCSSETUPTIMEMEANRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRABCSSETUPTIMEMEANRANGE_RANGES)));
     }
    
    public UmtsRabBuilder setRabcsSetupTimeMean(final BigInteger value) {
    if (value != null) {
        checkRabcsSetupTimeMeanRange(value);
    }
        this._rabcsSetupTimeMean = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRABPSSETUPTIMEMAXRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRABPSSETUPTIMEMAXRANGE_RANGES = a;
     }
     private static void checkRabpsSetupTimeMaxRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRABPSSETUPTIMEMAXRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRABPSSETUPTIMEMAXRANGE_RANGES)));
     }
    
    public UmtsRabBuilder setRabpsSetupTimeMax(final BigInteger value) {
    if (value != null) {
        checkRabpsSetupTimeMaxRange(value);
    }
        this._rabpsSetupTimeMax = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRABPSSETUPTIMEMEANRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRABPSSETUPTIMEMEANRANGE_RANGES = a;
     }
     private static void checkRabpsSetupTimeMeanRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRABPSSETUPTIMEMEANRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRABPSSETUPTIMEMEANRANGE_RANGES)));
     }
    
    public UmtsRabBuilder setRabpsSetupTimeMean(final BigInteger value) {
    if (value != null) {
        checkRabpsSetupTimeMeanRange(value);
    }
        this._rabpsSetupTimeMean = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSUCCHORANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSUCCHORANGE_RANGES = a;
     }
     private static void checkSuccHoRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSUCCHORANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSUCCHORANGE_RANGES)));
     }
    
    public UmtsRabBuilder setSuccHo(final BigInteger value) {
    if (value != null) {
        checkSuccHoRange(value);
    }
        this._succHo = value;
        return this;
    }
    
    public UmtsRabBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRabBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRab build() {
        return new UmtsRabImpl(this);
    }

    private static final class UmtsRabImpl implements UmtsRab {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab.class;
        }

        private final BigInteger _failHo;
        private final BigInteger _rabFailEstabCs;
        private final BigInteger _rabFailEstabPs;
        private final BigInteger _rabSuccEstabCs;
        private final BigInteger _rabSuccEstabPs;
        private final BigInteger _rabcsSetupTimeMax;
        private final BigInteger _rabcsSetupTimeMean;
        private final BigInteger _rabpsSetupTimeMax;
        private final BigInteger _rabpsSetupTimeMean;
        private final BigInteger _succHo;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>> augmentation = Collections.emptyMap();

        private UmtsRabImpl(UmtsRabBuilder base) {
            this._failHo = base.getFailHo();
            this._rabFailEstabCs = base.getRabFailEstabCs();
            this._rabFailEstabPs = base.getRabFailEstabPs();
            this._rabSuccEstabCs = base.getRabSuccEstabCs();
            this._rabSuccEstabPs = base.getRabSuccEstabPs();
            this._rabcsSetupTimeMax = base.getRabcsSetupTimeMax();
            this._rabcsSetupTimeMean = base.getRabcsSetupTimeMean();
            this._rabpsSetupTimeMax = base.getRabpsSetupTimeMax();
            this._rabpsSetupTimeMean = base.getRabpsSetupTimeMean();
            this._succHo = base.getSuccHo();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getFailHo() {
            return _failHo;
        }
        
        @Override
        public BigInteger getRabFailEstabCs() {
            return _rabFailEstabCs;
        }
        
        @Override
        public BigInteger getRabFailEstabPs() {
            return _rabFailEstabPs;
        }
        
        @Override
        public BigInteger getRabSuccEstabCs() {
            return _rabSuccEstabCs;
        }
        
        @Override
        public BigInteger getRabSuccEstabPs() {
            return _rabSuccEstabPs;
        }
        
        @Override
        public BigInteger getRabcsSetupTimeMax() {
            return _rabcsSetupTimeMax;
        }
        
        @Override
        public BigInteger getRabcsSetupTimeMean() {
            return _rabcsSetupTimeMean;
        }
        
        @Override
        public BigInteger getRabpsSetupTimeMax() {
            return _rabpsSetupTimeMax;
        }
        
        @Override
        public BigInteger getRabpsSetupTimeMean() {
            return _rabpsSetupTimeMean;
        }
        
        @Override
        public BigInteger getSuccHo() {
            return _succHo;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_failHo);
            result = prime * result + Objects.hashCode(_rabFailEstabCs);
            result = prime * result + Objects.hashCode(_rabFailEstabPs);
            result = prime * result + Objects.hashCode(_rabSuccEstabCs);
            result = prime * result + Objects.hashCode(_rabSuccEstabPs);
            result = prime * result + Objects.hashCode(_rabcsSetupTimeMax);
            result = prime * result + Objects.hashCode(_rabcsSetupTimeMean);
            result = prime * result + Objects.hashCode(_rabpsSetupTimeMax);
            result = prime * result + Objects.hashCode(_rabpsSetupTimeMean);
            result = prime * result + Objects.hashCode(_succHo);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab)obj;
            if (!Objects.equals(_failHo, other.getFailHo())) {
                return false;
            }
            if (!Objects.equals(_rabFailEstabCs, other.getRabFailEstabCs())) {
                return false;
            }
            if (!Objects.equals(_rabFailEstabPs, other.getRabFailEstabPs())) {
                return false;
            }
            if (!Objects.equals(_rabSuccEstabCs, other.getRabSuccEstabCs())) {
                return false;
            }
            if (!Objects.equals(_rabSuccEstabPs, other.getRabSuccEstabPs())) {
                return false;
            }
            if (!Objects.equals(_rabcsSetupTimeMax, other.getRabcsSetupTimeMax())) {
                return false;
            }
            if (!Objects.equals(_rabcsSetupTimeMean, other.getRabcsSetupTimeMean())) {
                return false;
            }
            if (!Objects.equals(_rabpsSetupTimeMax, other.getRabpsSetupTimeMax())) {
                return false;
            }
            if (!Objects.equals(_rabpsSetupTimeMean, other.getRabpsSetupTimeMean())) {
                return false;
            }
            if (!Objects.equals(_succHo, other.getSuccHo())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRabImpl otherImpl = (UmtsRabImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRab [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_failHo != null) {
                builder.append("_failHo=");
                builder.append(_failHo);
                builder.append(", ");
            }
            if (_rabFailEstabCs != null) {
                builder.append("_rabFailEstabCs=");
                builder.append(_rabFailEstabCs);
                builder.append(", ");
            }
            if (_rabFailEstabPs != null) {
                builder.append("_rabFailEstabPs=");
                builder.append(_rabFailEstabPs);
                builder.append(", ");
            }
            if (_rabSuccEstabCs != null) {
                builder.append("_rabSuccEstabCs=");
                builder.append(_rabSuccEstabCs);
                builder.append(", ");
            }
            if (_rabSuccEstabPs != null) {
                builder.append("_rabSuccEstabPs=");
                builder.append(_rabSuccEstabPs);
                builder.append(", ");
            }
            if (_rabcsSetupTimeMax != null) {
                builder.append("_rabcsSetupTimeMax=");
                builder.append(_rabcsSetupTimeMax);
                builder.append(", ");
            }
            if (_rabcsSetupTimeMean != null) {
                builder.append("_rabcsSetupTimeMean=");
                builder.append(_rabcsSetupTimeMean);
                builder.append(", ");
            }
            if (_rabpsSetupTimeMax != null) {
                builder.append("_rabpsSetupTimeMax=");
                builder.append(_rabpsSetupTimeMax);
                builder.append(", ");
            }
            if (_rabpsSetupTimeMean != null) {
                builder.append("_rabpsSetupTimeMean=");
                builder.append(_rabpsSetupTimeMean);
                builder.append(", ");
            }
            if (_succHo != null) {
                builder.append("_succHo=");
                builder.append(_succHo);
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
