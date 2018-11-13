package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf
 *
 */
public class TransportRealTimePerfBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf> {

    private BigInteger _lostFarEndPackets;
    private BigInteger _lostRcvPackets;
    private BigInteger _maxFarEndJitter;
    private BigInteger _maxReceiveJitter;
    private BigInteger _maxRtt;
    private BigInteger _meanFarEndJitter;
    private BigInteger _meanReceiveJitter;
    private BigInteger _meanRtt;
    private BigInteger _overruns;
    private BigInteger _underruns;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>> augmentation = Collections.emptyMap();

    public TransportRealTimePerfBuilder() {
    }
    public TransportRealTimePerfBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG arg) {
        this._lostRcvPackets = arg.getLostRcvPackets();
        this._lostFarEndPackets = arg.getLostFarEndPackets();
        this._overruns = arg.getOverruns();
        this._underruns = arg.getUnderruns();
        this._meanRtt = arg.getMeanRtt();
        this._maxRtt = arg.getMaxRtt();
        this._meanReceiveJitter = arg.getMeanReceiveJitter();
        this._maxReceiveJitter = arg.getMaxReceiveJitter();
        this._meanFarEndJitter = arg.getMeanFarEndJitter();
        this._maxFarEndJitter = arg.getMaxFarEndJitter();
    }

    public TransportRealTimePerfBuilder(TransportRealTimePerf base) {
        this._lostFarEndPackets = base.getLostFarEndPackets();
        this._lostRcvPackets = base.getLostRcvPackets();
        this._maxFarEndJitter = base.getMaxFarEndJitter();
        this._maxReceiveJitter = base.getMaxReceiveJitter();
        this._maxRtt = base.getMaxRtt();
        this._meanFarEndJitter = base.getMeanFarEndJitter();
        this._meanReceiveJitter = base.getMeanReceiveJitter();
        this._meanRtt = base.getMeanRtt();
        this._overruns = base.getOverruns();
        this._underruns = base.getUnderruns();
        if (base instanceof TransportRealTimePerfImpl) {
            TransportRealTimePerfImpl impl = (TransportRealTimePerfImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG) {
            this._lostRcvPackets = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG)arg).getLostRcvPackets();
            this._lostFarEndPackets = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG)arg).getLostFarEndPackets();
            this._overruns = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG)arg).getOverruns();
            this._underruns = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG)arg).getUnderruns();
            this._meanRtt = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG)arg).getMeanRtt();
            this._maxRtt = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG)arg).getMaxRtt();
            this._meanReceiveJitter = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG)arg).getMeanReceiveJitter();
            this._maxReceiveJitter = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG)arg).getMaxReceiveJitter();
            this._meanFarEndJitter = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG)arg).getMeanFarEndJitter();
            this._maxFarEndJitter = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG)arg).getMaxFarEndJitter();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimePerfG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getLostFarEndPackets() {
        return _lostFarEndPackets;
    }
    
    public BigInteger getLostRcvPackets() {
        return _lostRcvPackets;
    }
    
    public BigInteger getMaxFarEndJitter() {
        return _maxFarEndJitter;
    }
    
    public BigInteger getMaxReceiveJitter() {
        return _maxReceiveJitter;
    }
    
    public BigInteger getMaxRtt() {
        return _maxRtt;
    }
    
    public BigInteger getMeanFarEndJitter() {
        return _meanFarEndJitter;
    }
    
    public BigInteger getMeanReceiveJitter() {
        return _meanReceiveJitter;
    }
    
    public BigInteger getMeanRtt() {
        return _meanRtt;
    }
    
    public BigInteger getOverruns() {
        return _overruns;
    }
    
    public BigInteger getUnderruns() {
        return _underruns;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKLOSTFARENDPACKETSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKLOSTFARENDPACKETSRANGE_RANGES = a;
     }
     private static void checkLostFarEndPacketsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKLOSTFARENDPACKETSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKLOSTFARENDPACKETSRANGE_RANGES)));
     }
    
    public TransportRealTimePerfBuilder setLostFarEndPackets(final BigInteger value) {
    if (value != null) {
        checkLostFarEndPacketsRange(value);
    }
        this._lostFarEndPackets = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKLOSTRCVPACKETSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKLOSTRCVPACKETSRANGE_RANGES = a;
     }
     private static void checkLostRcvPacketsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKLOSTRCVPACKETSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKLOSTRCVPACKETSRANGE_RANGES)));
     }
    
    public TransportRealTimePerfBuilder setLostRcvPackets(final BigInteger value) {
    if (value != null) {
        checkLostRcvPacketsRange(value);
    }
        this._lostRcvPackets = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXFARENDJITTERRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXFARENDJITTERRANGE_RANGES = a;
     }
     private static void checkMaxFarEndJitterRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXFARENDJITTERRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXFARENDJITTERRANGE_RANGES)));
     }
    
    public TransportRealTimePerfBuilder setMaxFarEndJitter(final BigInteger value) {
    if (value != null) {
        checkMaxFarEndJitterRange(value);
    }
        this._maxFarEndJitter = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXRECEIVEJITTERRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXRECEIVEJITTERRANGE_RANGES = a;
     }
     private static void checkMaxReceiveJitterRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXRECEIVEJITTERRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXRECEIVEJITTERRANGE_RANGES)));
     }
    
    public TransportRealTimePerfBuilder setMaxReceiveJitter(final BigInteger value) {
    if (value != null) {
        checkMaxReceiveJitterRange(value);
    }
        this._maxReceiveJitter = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXRTTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXRTTRANGE_RANGES = a;
     }
     private static void checkMaxRttRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXRTTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXRTTRANGE_RANGES)));
     }
    
    public TransportRealTimePerfBuilder setMaxRtt(final BigInteger value) {
    if (value != null) {
        checkMaxRttRange(value);
    }
        this._maxRtt = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMEANFARENDJITTERRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMEANFARENDJITTERRANGE_RANGES = a;
     }
     private static void checkMeanFarEndJitterRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMEANFARENDJITTERRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMEANFARENDJITTERRANGE_RANGES)));
     }
    
    public TransportRealTimePerfBuilder setMeanFarEndJitter(final BigInteger value) {
    if (value != null) {
        checkMeanFarEndJitterRange(value);
    }
        this._meanFarEndJitter = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMEANRECEIVEJITTERRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMEANRECEIVEJITTERRANGE_RANGES = a;
     }
     private static void checkMeanReceiveJitterRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMEANRECEIVEJITTERRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMEANRECEIVEJITTERRANGE_RANGES)));
     }
    
    public TransportRealTimePerfBuilder setMeanReceiveJitter(final BigInteger value) {
    if (value != null) {
        checkMeanReceiveJitterRange(value);
    }
        this._meanReceiveJitter = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMEANRTTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMEANRTTRANGE_RANGES = a;
     }
     private static void checkMeanRttRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMEANRTTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMEANRTTRANGE_RANGES)));
     }
    
    public TransportRealTimePerfBuilder setMeanRtt(final BigInteger value) {
    if (value != null) {
        checkMeanRttRange(value);
    }
        this._meanRtt = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKOVERRUNSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKOVERRUNSRANGE_RANGES = a;
     }
     private static void checkOverrunsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKOVERRUNSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKOVERRUNSRANGE_RANGES)));
     }
    
    public TransportRealTimePerfBuilder setOverruns(final BigInteger value) {
    if (value != null) {
        checkOverrunsRange(value);
    }
        this._overruns = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKUNDERRUNSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKUNDERRUNSRANGE_RANGES = a;
     }
     private static void checkUnderrunsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKUNDERRUNSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKUNDERRUNSRANGE_RANGES)));
     }
    
    public TransportRealTimePerfBuilder setUnderruns(final BigInteger value) {
    if (value != null) {
        checkUnderrunsRange(value);
    }
        this._underruns = value;
        return this;
    }
    
    public TransportRealTimePerfBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TransportRealTimePerfBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TransportRealTimePerf build() {
        return new TransportRealTimePerfImpl(this);
    }

    private static final class TransportRealTimePerfImpl implements TransportRealTimePerf {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf.class;
        }

        private final BigInteger _lostFarEndPackets;
        private final BigInteger _lostRcvPackets;
        private final BigInteger _maxFarEndJitter;
        private final BigInteger _maxReceiveJitter;
        private final BigInteger _maxRtt;
        private final BigInteger _meanFarEndJitter;
        private final BigInteger _meanReceiveJitter;
        private final BigInteger _meanRtt;
        private final BigInteger _overruns;
        private final BigInteger _underruns;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>> augmentation = Collections.emptyMap();

        private TransportRealTimePerfImpl(TransportRealTimePerfBuilder base) {
            this._lostFarEndPackets = base.getLostFarEndPackets();
            this._lostRcvPackets = base.getLostRcvPackets();
            this._maxFarEndJitter = base.getMaxFarEndJitter();
            this._maxReceiveJitter = base.getMaxReceiveJitter();
            this._maxRtt = base.getMaxRtt();
            this._meanFarEndJitter = base.getMeanFarEndJitter();
            this._meanReceiveJitter = base.getMeanReceiveJitter();
            this._meanRtt = base.getMeanRtt();
            this._overruns = base.getOverruns();
            this._underruns = base.getUnderruns();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getLostFarEndPackets() {
            return _lostFarEndPackets;
        }
        
        @Override
        public BigInteger getLostRcvPackets() {
            return _lostRcvPackets;
        }
        
        @Override
        public BigInteger getMaxFarEndJitter() {
            return _maxFarEndJitter;
        }
        
        @Override
        public BigInteger getMaxReceiveJitter() {
            return _maxReceiveJitter;
        }
        
        @Override
        public BigInteger getMaxRtt() {
            return _maxRtt;
        }
        
        @Override
        public BigInteger getMeanFarEndJitter() {
            return _meanFarEndJitter;
        }
        
        @Override
        public BigInteger getMeanReceiveJitter() {
            return _meanReceiveJitter;
        }
        
        @Override
        public BigInteger getMeanRtt() {
            return _meanRtt;
        }
        
        @Override
        public BigInteger getOverruns() {
            return _overruns;
        }
        
        @Override
        public BigInteger getUnderruns() {
            return _underruns;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lostFarEndPackets);
            result = prime * result + Objects.hashCode(_lostRcvPackets);
            result = prime * result + Objects.hashCode(_maxFarEndJitter);
            result = prime * result + Objects.hashCode(_maxReceiveJitter);
            result = prime * result + Objects.hashCode(_maxRtt);
            result = prime * result + Objects.hashCode(_meanFarEndJitter);
            result = prime * result + Objects.hashCode(_meanReceiveJitter);
            result = prime * result + Objects.hashCode(_meanRtt);
            result = prime * result + Objects.hashCode(_overruns);
            result = prime * result + Objects.hashCode(_underruns);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf)obj;
            if (!Objects.equals(_lostFarEndPackets, other.getLostFarEndPackets())) {
                return false;
            }
            if (!Objects.equals(_lostRcvPackets, other.getLostRcvPackets())) {
                return false;
            }
            if (!Objects.equals(_maxFarEndJitter, other.getMaxFarEndJitter())) {
                return false;
            }
            if (!Objects.equals(_maxReceiveJitter, other.getMaxReceiveJitter())) {
                return false;
            }
            if (!Objects.equals(_maxRtt, other.getMaxRtt())) {
                return false;
            }
            if (!Objects.equals(_meanFarEndJitter, other.getMeanFarEndJitter())) {
                return false;
            }
            if (!Objects.equals(_meanReceiveJitter, other.getMeanReceiveJitter())) {
                return false;
            }
            if (!Objects.equals(_meanRtt, other.getMeanRtt())) {
                return false;
            }
            if (!Objects.equals(_overruns, other.getOverruns())) {
                return false;
            }
            if (!Objects.equals(_underruns, other.getUnderruns())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TransportRealTimePerfImpl otherImpl = (TransportRealTimePerfImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TransportRealTimePerf [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_lostFarEndPackets != null) {
                builder.append("_lostFarEndPackets=");
                builder.append(_lostFarEndPackets);
                builder.append(", ");
            }
            if (_lostRcvPackets != null) {
                builder.append("_lostRcvPackets=");
                builder.append(_lostRcvPackets);
                builder.append(", ");
            }
            if (_maxFarEndJitter != null) {
                builder.append("_maxFarEndJitter=");
                builder.append(_maxFarEndJitter);
                builder.append(", ");
            }
            if (_maxReceiveJitter != null) {
                builder.append("_maxReceiveJitter=");
                builder.append(_maxReceiveJitter);
                builder.append(", ");
            }
            if (_maxRtt != null) {
                builder.append("_maxRtt=");
                builder.append(_maxRtt);
                builder.append(", ");
            }
            if (_meanFarEndJitter != null) {
                builder.append("_meanFarEndJitter=");
                builder.append(_meanFarEndJitter);
                builder.append(", ");
            }
            if (_meanReceiveJitter != null) {
                builder.append("_meanReceiveJitter=");
                builder.append(_meanReceiveJitter);
                builder.append(", ");
            }
            if (_meanRtt != null) {
                builder.append("_meanRtt=");
                builder.append(_meanRtt);
                builder.append(", ");
            }
            if (_overruns != null) {
                builder.append("_overruns=");
                builder.append(_overruns);
                builder.append(", ");
            }
            if (_underruns != null) {
                builder.append("_underruns=");
                builder.append(_underruns);
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
