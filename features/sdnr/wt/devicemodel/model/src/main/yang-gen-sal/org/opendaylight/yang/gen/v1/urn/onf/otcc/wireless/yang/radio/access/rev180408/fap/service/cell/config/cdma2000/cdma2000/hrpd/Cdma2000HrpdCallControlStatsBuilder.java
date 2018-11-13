package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats
 *
 */
public class Cdma2000HrpdCallControlStatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats> {

    private BigInteger _averagePageSetupTime;
    private BigInteger _averageSessionSetupTime;
    private BigInteger _numConnSetupsAborted;
    private BigInteger _numConnectionsOpened;
    private BigInteger _numCurrentSessionsEstablished;
    private BigInteger _numForwardPreRlpDroppedPkts;
    private BigInteger _numForwardRlpBytes;
    private BigInteger _numPageMessagesToAt;
    private BigInteger _numPagesSucceeded;
    private BigInteger _numReverseRlpBytes;
    private BigInteger _numSessionSetupAttempts;
    private BigInteger _numSessionSetupSuccessful;
    private BigInteger _numSessionSetupsFailedToTermAuth;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdCallControlStatsBuilder() {
    }
    public Cdma2000HrpdCallControlStatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG arg) {
        this._numSessionSetupAttempts = arg.getNumSessionSetupAttempts();
        this._numSessionSetupSuccessful = arg.getNumSessionSetupSuccessful();
        this._numCurrentSessionsEstablished = arg.getNumCurrentSessionsEstablished();
        this._numPageMessagesToAt = arg.getNumPageMessagesToAt();
        this._numPagesSucceeded = arg.getNumPagesSucceeded();
        this._numConnectionsOpened = arg.getNumConnectionsOpened();
        this._numSessionSetupsFailedToTermAuth = arg.getNumSessionSetupsFailedToTermAuth();
        this._numForwardRlpBytes = arg.getNumForwardRlpBytes();
        this._numReverseRlpBytes = arg.getNumReverseRlpBytes();
        this._averageSessionSetupTime = arg.getAverageSessionSetupTime();
        this._averagePageSetupTime = arg.getAveragePageSetupTime();
        this._numConnSetupsAborted = arg.getNumConnSetupsAborted();
        this._numForwardPreRlpDroppedPkts = arg.getNumForwardPreRlpDroppedPkts();
    }

    public Cdma2000HrpdCallControlStatsBuilder(Cdma2000HrpdCallControlStats base) {
        this._averagePageSetupTime = base.getAveragePageSetupTime();
        this._averageSessionSetupTime = base.getAverageSessionSetupTime();
        this._numConnSetupsAborted = base.getNumConnSetupsAborted();
        this._numConnectionsOpened = base.getNumConnectionsOpened();
        this._numCurrentSessionsEstablished = base.getNumCurrentSessionsEstablished();
        this._numForwardPreRlpDroppedPkts = base.getNumForwardPreRlpDroppedPkts();
        this._numForwardRlpBytes = base.getNumForwardRlpBytes();
        this._numPageMessagesToAt = base.getNumPageMessagesToAt();
        this._numPagesSucceeded = base.getNumPagesSucceeded();
        this._numReverseRlpBytes = base.getNumReverseRlpBytes();
        this._numSessionSetupAttempts = base.getNumSessionSetupAttempts();
        this._numSessionSetupSuccessful = base.getNumSessionSetupSuccessful();
        this._numSessionSetupsFailedToTermAuth = base.getNumSessionSetupsFailedToTermAuth();
        if (base instanceof Cdma2000HrpdCallControlStatsImpl) {
            Cdma2000HrpdCallControlStatsImpl impl = (Cdma2000HrpdCallControlStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG) {
            this._numSessionSetupAttempts = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumSessionSetupAttempts();
            this._numSessionSetupSuccessful = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumSessionSetupSuccessful();
            this._numCurrentSessionsEstablished = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumCurrentSessionsEstablished();
            this._numPageMessagesToAt = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumPageMessagesToAt();
            this._numPagesSucceeded = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumPagesSucceeded();
            this._numConnectionsOpened = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumConnectionsOpened();
            this._numSessionSetupsFailedToTermAuth = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumSessionSetupsFailedToTermAuth();
            this._numForwardRlpBytes = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumForwardRlpBytes();
            this._numReverseRlpBytes = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumReverseRlpBytes();
            this._averageSessionSetupTime = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getAverageSessionSetupTime();
            this._averagePageSetupTime = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getAveragePageSetupTime();
            this._numConnSetupsAborted = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumConnSetupsAborted();
            this._numForwardPreRlpDroppedPkts = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG)arg).getNumForwardPreRlpDroppedPkts();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getAveragePageSetupTime() {
        return _averagePageSetupTime;
    }
    
    public BigInteger getAverageSessionSetupTime() {
        return _averageSessionSetupTime;
    }
    
    public BigInteger getNumConnSetupsAborted() {
        return _numConnSetupsAborted;
    }
    
    public BigInteger getNumConnectionsOpened() {
        return _numConnectionsOpened;
    }
    
    public BigInteger getNumCurrentSessionsEstablished() {
        return _numCurrentSessionsEstablished;
    }
    
    public BigInteger getNumForwardPreRlpDroppedPkts() {
        return _numForwardPreRlpDroppedPkts;
    }
    
    public BigInteger getNumForwardRlpBytes() {
        return _numForwardRlpBytes;
    }
    
    public BigInteger getNumPageMessagesToAt() {
        return _numPageMessagesToAt;
    }
    
    public BigInteger getNumPagesSucceeded() {
        return _numPagesSucceeded;
    }
    
    public BigInteger getNumReverseRlpBytes() {
        return _numReverseRlpBytes;
    }
    
    public BigInteger getNumSessionSetupAttempts() {
        return _numSessionSetupAttempts;
    }
    
    public BigInteger getNumSessionSetupSuccessful() {
        return _numSessionSetupSuccessful;
    }
    
    public BigInteger getNumSessionSetupsFailedToTermAuth() {
        return _numSessionSetupsFailedToTermAuth;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKAVERAGEPAGESETUPTIMERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKAVERAGEPAGESETUPTIMERANGE_RANGES = a;
     }
     private static void checkAveragePageSetupTimeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKAVERAGEPAGESETUPTIMERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKAVERAGEPAGESETUPTIMERANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setAveragePageSetupTime(final BigInteger value) {
    if (value != null) {
        checkAveragePageSetupTimeRange(value);
    }
        this._averagePageSetupTime = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKAVERAGESESSIONSETUPTIMERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKAVERAGESESSIONSETUPTIMERANGE_RANGES = a;
     }
     private static void checkAverageSessionSetupTimeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKAVERAGESESSIONSETUPTIMERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKAVERAGESESSIONSETUPTIMERANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setAverageSessionSetupTime(final BigInteger value) {
    if (value != null) {
        checkAverageSessionSetupTimeRange(value);
    }
        this._averageSessionSetupTime = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMCONNSETUPSABORTEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMCONNSETUPSABORTEDRANGE_RANGES = a;
     }
     private static void checkNumConnSetupsAbortedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMCONNSETUPSABORTEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMCONNSETUPSABORTEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumConnSetupsAborted(final BigInteger value) {
    if (value != null) {
        checkNumConnSetupsAbortedRange(value);
    }
        this._numConnSetupsAborted = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMCONNECTIONSOPENEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMCONNECTIONSOPENEDRANGE_RANGES = a;
     }
     private static void checkNumConnectionsOpenedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMCONNECTIONSOPENEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMCONNECTIONSOPENEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumConnectionsOpened(final BigInteger value) {
    if (value != null) {
        checkNumConnectionsOpenedRange(value);
    }
        this._numConnectionsOpened = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMCURRENTSESSIONSESTABLISHEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMCURRENTSESSIONSESTABLISHEDRANGE_RANGES = a;
     }
     private static void checkNumCurrentSessionsEstablishedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMCURRENTSESSIONSESTABLISHEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMCURRENTSESSIONSESTABLISHEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumCurrentSessionsEstablished(final BigInteger value) {
    if (value != null) {
        checkNumCurrentSessionsEstablishedRange(value);
    }
        this._numCurrentSessionsEstablished = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMFORWARDPRERLPDROPPEDPKTSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMFORWARDPRERLPDROPPEDPKTSRANGE_RANGES = a;
     }
     private static void checkNumForwardPreRlpDroppedPktsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMFORWARDPRERLPDROPPEDPKTSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMFORWARDPRERLPDROPPEDPKTSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumForwardPreRlpDroppedPkts(final BigInteger value) {
    if (value != null) {
        checkNumForwardPreRlpDroppedPktsRange(value);
    }
        this._numForwardPreRlpDroppedPkts = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMFORWARDRLPBYTESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMFORWARDRLPBYTESRANGE_RANGES = a;
     }
     private static void checkNumForwardRlpBytesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMFORWARDRLPBYTESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMFORWARDRLPBYTESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumForwardRlpBytes(final BigInteger value) {
    if (value != null) {
        checkNumForwardRlpBytesRange(value);
    }
        this._numForwardRlpBytes = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMPAGEMESSAGESTOATRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMPAGEMESSAGESTOATRANGE_RANGES = a;
     }
     private static void checkNumPageMessagesToAtRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMPAGEMESSAGESTOATRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMPAGEMESSAGESTOATRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumPageMessagesToAt(final BigInteger value) {
    if (value != null) {
        checkNumPageMessagesToAtRange(value);
    }
        this._numPageMessagesToAt = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMPAGESSUCCEEDEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMPAGESSUCCEEDEDRANGE_RANGES = a;
     }
     private static void checkNumPagesSucceededRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMPAGESSUCCEEDEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMPAGESSUCCEEDEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumPagesSucceeded(final BigInteger value) {
    if (value != null) {
        checkNumPagesSucceededRange(value);
    }
        this._numPagesSucceeded = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMREVERSERLPBYTESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMREVERSERLPBYTESRANGE_RANGES = a;
     }
     private static void checkNumReverseRlpBytesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMREVERSERLPBYTESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMREVERSERLPBYTESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumReverseRlpBytes(final BigInteger value) {
    if (value != null) {
        checkNumReverseRlpBytesRange(value);
    }
        this._numReverseRlpBytes = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMSESSIONSETUPATTEMPTSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMSESSIONSETUPATTEMPTSRANGE_RANGES = a;
     }
     private static void checkNumSessionSetupAttemptsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMSESSIONSETUPATTEMPTSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMSESSIONSETUPATTEMPTSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumSessionSetupAttempts(final BigInteger value) {
    if (value != null) {
        checkNumSessionSetupAttemptsRange(value);
    }
        this._numSessionSetupAttempts = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMSESSIONSETUPSUCCESSFULRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMSESSIONSETUPSUCCESSFULRANGE_RANGES = a;
     }
     private static void checkNumSessionSetupSuccessfulRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMSESSIONSETUPSUCCESSFULRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMSESSIONSETUPSUCCESSFULRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumSessionSetupSuccessful(final BigInteger value) {
    if (value != null) {
        checkNumSessionSetupSuccessfulRange(value);
    }
        this._numSessionSetupSuccessful = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMSESSIONSETUPSFAILEDTOTERMAUTHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMSESSIONSETUPSFAILEDTOTERMAUTHRANGE_RANGES = a;
     }
     private static void checkNumSessionSetupsFailedToTermAuthRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMSESSIONSETUPSFAILEDTOTERMAUTHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMSESSIONSETUPSFAILEDTOTERMAUTHRANGE_RANGES)));
     }
    
    public Cdma2000HrpdCallControlStatsBuilder setNumSessionSetupsFailedToTermAuth(final BigInteger value) {
    if (value != null) {
        checkNumSessionSetupsFailedToTermAuthRange(value);
    }
        this._numSessionSetupsFailedToTermAuth = value;
        return this;
    }
    
    public Cdma2000HrpdCallControlStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdCallControlStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdCallControlStats build() {
        return new Cdma2000HrpdCallControlStatsImpl(this);
    }

    private static final class Cdma2000HrpdCallControlStatsImpl implements Cdma2000HrpdCallControlStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats.class;
        }

        private final BigInteger _averagePageSetupTime;
        private final BigInteger _averageSessionSetupTime;
        private final BigInteger _numConnSetupsAborted;
        private final BigInteger _numConnectionsOpened;
        private final BigInteger _numCurrentSessionsEstablished;
        private final BigInteger _numForwardPreRlpDroppedPkts;
        private final BigInteger _numForwardRlpBytes;
        private final BigInteger _numPageMessagesToAt;
        private final BigInteger _numPagesSucceeded;
        private final BigInteger _numReverseRlpBytes;
        private final BigInteger _numSessionSetupAttempts;
        private final BigInteger _numSessionSetupSuccessful;
        private final BigInteger _numSessionSetupsFailedToTermAuth;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdCallControlStatsImpl(Cdma2000HrpdCallControlStatsBuilder base) {
            this._averagePageSetupTime = base.getAveragePageSetupTime();
            this._averageSessionSetupTime = base.getAverageSessionSetupTime();
            this._numConnSetupsAborted = base.getNumConnSetupsAborted();
            this._numConnectionsOpened = base.getNumConnectionsOpened();
            this._numCurrentSessionsEstablished = base.getNumCurrentSessionsEstablished();
            this._numForwardPreRlpDroppedPkts = base.getNumForwardPreRlpDroppedPkts();
            this._numForwardRlpBytes = base.getNumForwardRlpBytes();
            this._numPageMessagesToAt = base.getNumPageMessagesToAt();
            this._numPagesSucceeded = base.getNumPagesSucceeded();
            this._numReverseRlpBytes = base.getNumReverseRlpBytes();
            this._numSessionSetupAttempts = base.getNumSessionSetupAttempts();
            this._numSessionSetupSuccessful = base.getNumSessionSetupSuccessful();
            this._numSessionSetupsFailedToTermAuth = base.getNumSessionSetupsFailedToTermAuth();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getAveragePageSetupTime() {
            return _averagePageSetupTime;
        }
        
        @Override
        public BigInteger getAverageSessionSetupTime() {
            return _averageSessionSetupTime;
        }
        
        @Override
        public BigInteger getNumConnSetupsAborted() {
            return _numConnSetupsAborted;
        }
        
        @Override
        public BigInteger getNumConnectionsOpened() {
            return _numConnectionsOpened;
        }
        
        @Override
        public BigInteger getNumCurrentSessionsEstablished() {
            return _numCurrentSessionsEstablished;
        }
        
        @Override
        public BigInteger getNumForwardPreRlpDroppedPkts() {
            return _numForwardPreRlpDroppedPkts;
        }
        
        @Override
        public BigInteger getNumForwardRlpBytes() {
            return _numForwardRlpBytes;
        }
        
        @Override
        public BigInteger getNumPageMessagesToAt() {
            return _numPageMessagesToAt;
        }
        
        @Override
        public BigInteger getNumPagesSucceeded() {
            return _numPagesSucceeded;
        }
        
        @Override
        public BigInteger getNumReverseRlpBytes() {
            return _numReverseRlpBytes;
        }
        
        @Override
        public BigInteger getNumSessionSetupAttempts() {
            return _numSessionSetupAttempts;
        }
        
        @Override
        public BigInteger getNumSessionSetupSuccessful() {
            return _numSessionSetupSuccessful;
        }
        
        @Override
        public BigInteger getNumSessionSetupsFailedToTermAuth() {
            return _numSessionSetupsFailedToTermAuth;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_averagePageSetupTime);
            result = prime * result + Objects.hashCode(_averageSessionSetupTime);
            result = prime * result + Objects.hashCode(_numConnSetupsAborted);
            result = prime * result + Objects.hashCode(_numConnectionsOpened);
            result = prime * result + Objects.hashCode(_numCurrentSessionsEstablished);
            result = prime * result + Objects.hashCode(_numForwardPreRlpDroppedPkts);
            result = prime * result + Objects.hashCode(_numForwardRlpBytes);
            result = prime * result + Objects.hashCode(_numPageMessagesToAt);
            result = prime * result + Objects.hashCode(_numPagesSucceeded);
            result = prime * result + Objects.hashCode(_numReverseRlpBytes);
            result = prime * result + Objects.hashCode(_numSessionSetupAttempts);
            result = prime * result + Objects.hashCode(_numSessionSetupSuccessful);
            result = prime * result + Objects.hashCode(_numSessionSetupsFailedToTermAuth);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats)obj;
            if (!Objects.equals(_averagePageSetupTime, other.getAveragePageSetupTime())) {
                return false;
            }
            if (!Objects.equals(_averageSessionSetupTime, other.getAverageSessionSetupTime())) {
                return false;
            }
            if (!Objects.equals(_numConnSetupsAborted, other.getNumConnSetupsAborted())) {
                return false;
            }
            if (!Objects.equals(_numConnectionsOpened, other.getNumConnectionsOpened())) {
                return false;
            }
            if (!Objects.equals(_numCurrentSessionsEstablished, other.getNumCurrentSessionsEstablished())) {
                return false;
            }
            if (!Objects.equals(_numForwardPreRlpDroppedPkts, other.getNumForwardPreRlpDroppedPkts())) {
                return false;
            }
            if (!Objects.equals(_numForwardRlpBytes, other.getNumForwardRlpBytes())) {
                return false;
            }
            if (!Objects.equals(_numPageMessagesToAt, other.getNumPageMessagesToAt())) {
                return false;
            }
            if (!Objects.equals(_numPagesSucceeded, other.getNumPagesSucceeded())) {
                return false;
            }
            if (!Objects.equals(_numReverseRlpBytes, other.getNumReverseRlpBytes())) {
                return false;
            }
            if (!Objects.equals(_numSessionSetupAttempts, other.getNumSessionSetupAttempts())) {
                return false;
            }
            if (!Objects.equals(_numSessionSetupSuccessful, other.getNumSessionSetupSuccessful())) {
                return false;
            }
            if (!Objects.equals(_numSessionSetupsFailedToTermAuth, other.getNumSessionSetupsFailedToTermAuth())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdCallControlStatsImpl otherImpl = (Cdma2000HrpdCallControlStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdCallControlStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_averagePageSetupTime != null) {
                builder.append("_averagePageSetupTime=");
                builder.append(_averagePageSetupTime);
                builder.append(", ");
            }
            if (_averageSessionSetupTime != null) {
                builder.append("_averageSessionSetupTime=");
                builder.append(_averageSessionSetupTime);
                builder.append(", ");
            }
            if (_numConnSetupsAborted != null) {
                builder.append("_numConnSetupsAborted=");
                builder.append(_numConnSetupsAborted);
                builder.append(", ");
            }
            if (_numConnectionsOpened != null) {
                builder.append("_numConnectionsOpened=");
                builder.append(_numConnectionsOpened);
                builder.append(", ");
            }
            if (_numCurrentSessionsEstablished != null) {
                builder.append("_numCurrentSessionsEstablished=");
                builder.append(_numCurrentSessionsEstablished);
                builder.append(", ");
            }
            if (_numForwardPreRlpDroppedPkts != null) {
                builder.append("_numForwardPreRlpDroppedPkts=");
                builder.append(_numForwardPreRlpDroppedPkts);
                builder.append(", ");
            }
            if (_numForwardRlpBytes != null) {
                builder.append("_numForwardRlpBytes=");
                builder.append(_numForwardRlpBytes);
                builder.append(", ");
            }
            if (_numPageMessagesToAt != null) {
                builder.append("_numPageMessagesToAt=");
                builder.append(_numPageMessagesToAt);
                builder.append(", ");
            }
            if (_numPagesSucceeded != null) {
                builder.append("_numPagesSucceeded=");
                builder.append(_numPagesSucceeded);
                builder.append(", ");
            }
            if (_numReverseRlpBytes != null) {
                builder.append("_numReverseRlpBytes=");
                builder.append(_numReverseRlpBytes);
                builder.append(", ");
            }
            if (_numSessionSetupAttempts != null) {
                builder.append("_numSessionSetupAttempts=");
                builder.append(_numSessionSetupAttempts);
                builder.append(", ");
            }
            if (_numSessionSetupSuccessful != null) {
                builder.append("_numSessionSetupSuccessful=");
                builder.append(_numSessionSetupSuccessful);
                builder.append(", ");
            }
            if (_numSessionSetupsFailedToTermAuth != null) {
                builder.append("_numSessionSetupsFailedToTermAuth=");
                builder.append(_numSessionSetupsFailedToTermAuth);
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
