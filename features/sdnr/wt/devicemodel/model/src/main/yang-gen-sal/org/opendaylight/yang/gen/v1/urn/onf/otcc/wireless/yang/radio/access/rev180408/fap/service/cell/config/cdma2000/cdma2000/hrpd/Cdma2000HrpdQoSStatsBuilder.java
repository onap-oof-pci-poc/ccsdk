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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats
 *
 */
public class Cdma2000HrpdQoSStatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats> {

    private BigInteger _numConnectionCloseInitiatedNoRanRsr;
    private BigInteger _numFwdReservationOffMessagesSent;
    private BigInteger _numFwdReservationOnMessagesSent;
    private BigInteger _numPdsnipFlowUpdatesMsgFailed;
    private BigInteger _numPdsnipFlowUpdatesMsgRcvd;
    private BigInteger _numQoSReleaseRequestsReceived;
    private BigInteger _numQoSSetupRequestsAccepted;
    private BigInteger _numQoSSetupRequestsReceived;
    private BigInteger _numQoSSetupRequestsRejected;
    private BigInteger _numQoSSubscriberProfileUpdatesRcvd;
    private BigInteger _numReservationOffRequestsAccepted;
    private BigInteger _numReservationOffRequestsReceived;
    private BigInteger _numReservationOffRequestsRejected;
    private BigInteger _numReservationOnRequestsAccepted;
    private BigInteger _numReservationOnRequestsFailed;
    private BigInteger _numReservationOnRequestsReceived;
    private BigInteger _numReservationOnRequestsRejected;
    private BigInteger _numRevReservationOffMessagesSent;
    private BigInteger _numRevReservationOnMessagesSent;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdQoSStatsBuilder() {
    }
    public Cdma2000HrpdQoSStatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG arg) {
        this._numQoSSubscriberProfileUpdatesRcvd = arg.getNumQoSSubscriberProfileUpdatesRcvd();
        this._numPdsnipFlowUpdatesMsgRcvd = arg.getNumPdsnipFlowUpdatesMsgRcvd();
        this._numPdsnipFlowUpdatesMsgFailed = arg.getNumPdsnipFlowUpdatesMsgFailed();
        this._numQoSSetupRequestsReceived = arg.getNumQoSSetupRequestsReceived();
        this._numQoSSetupRequestsAccepted = arg.getNumQoSSetupRequestsAccepted();
        this._numQoSSetupRequestsRejected = arg.getNumQoSSetupRequestsRejected();
        this._numReservationOnRequestsReceived = arg.getNumReservationOnRequestsReceived();
        this._numReservationOnRequestsAccepted = arg.getNumReservationOnRequestsAccepted();
        this._numReservationOnRequestsRejected = arg.getNumReservationOnRequestsRejected();
        this._numReservationOnRequestsFailed = arg.getNumReservationOnRequestsFailed();
        this._numFwdReservationOnMessagesSent = arg.getNumFwdReservationOnMessagesSent();
        this._numRevReservationOnMessagesSent = arg.getNumRevReservationOnMessagesSent();
        this._numReservationOffRequestsReceived = arg.getNumReservationOffRequestsReceived();
        this._numReservationOffRequestsAccepted = arg.getNumReservationOffRequestsAccepted();
        this._numReservationOffRequestsRejected = arg.getNumReservationOffRequestsRejected();
        this._numFwdReservationOffMessagesSent = arg.getNumFwdReservationOffMessagesSent();
        this._numRevReservationOffMessagesSent = arg.getNumRevReservationOffMessagesSent();
        this._numQoSReleaseRequestsReceived = arg.getNumQoSReleaseRequestsReceived();
        this._numConnectionCloseInitiatedNoRanRsr = arg.getNumConnectionCloseInitiatedNoRanRsr();
    }

    public Cdma2000HrpdQoSStatsBuilder(Cdma2000HrpdQoSStats base) {
        this._numConnectionCloseInitiatedNoRanRsr = base.getNumConnectionCloseInitiatedNoRanRsr();
        this._numFwdReservationOffMessagesSent = base.getNumFwdReservationOffMessagesSent();
        this._numFwdReservationOnMessagesSent = base.getNumFwdReservationOnMessagesSent();
        this._numPdsnipFlowUpdatesMsgFailed = base.getNumPdsnipFlowUpdatesMsgFailed();
        this._numPdsnipFlowUpdatesMsgRcvd = base.getNumPdsnipFlowUpdatesMsgRcvd();
        this._numQoSReleaseRequestsReceived = base.getNumQoSReleaseRequestsReceived();
        this._numQoSSetupRequestsAccepted = base.getNumQoSSetupRequestsAccepted();
        this._numQoSSetupRequestsReceived = base.getNumQoSSetupRequestsReceived();
        this._numQoSSetupRequestsRejected = base.getNumQoSSetupRequestsRejected();
        this._numQoSSubscriberProfileUpdatesRcvd = base.getNumQoSSubscriberProfileUpdatesRcvd();
        this._numReservationOffRequestsAccepted = base.getNumReservationOffRequestsAccepted();
        this._numReservationOffRequestsReceived = base.getNumReservationOffRequestsReceived();
        this._numReservationOffRequestsRejected = base.getNumReservationOffRequestsRejected();
        this._numReservationOnRequestsAccepted = base.getNumReservationOnRequestsAccepted();
        this._numReservationOnRequestsFailed = base.getNumReservationOnRequestsFailed();
        this._numReservationOnRequestsReceived = base.getNumReservationOnRequestsReceived();
        this._numReservationOnRequestsRejected = base.getNumReservationOnRequestsRejected();
        this._numRevReservationOffMessagesSent = base.getNumRevReservationOffMessagesSent();
        this._numRevReservationOnMessagesSent = base.getNumRevReservationOnMessagesSent();
        if (base instanceof Cdma2000HrpdQoSStatsImpl) {
            Cdma2000HrpdQoSStatsImpl impl = (Cdma2000HrpdQoSStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG) {
            this._numQoSSubscriberProfileUpdatesRcvd = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumQoSSubscriberProfileUpdatesRcvd();
            this._numPdsnipFlowUpdatesMsgRcvd = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumPdsnipFlowUpdatesMsgRcvd();
            this._numPdsnipFlowUpdatesMsgFailed = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumPdsnipFlowUpdatesMsgFailed();
            this._numQoSSetupRequestsReceived = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumQoSSetupRequestsReceived();
            this._numQoSSetupRequestsAccepted = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumQoSSetupRequestsAccepted();
            this._numQoSSetupRequestsRejected = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumQoSSetupRequestsRejected();
            this._numReservationOnRequestsReceived = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumReservationOnRequestsReceived();
            this._numReservationOnRequestsAccepted = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumReservationOnRequestsAccepted();
            this._numReservationOnRequestsRejected = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumReservationOnRequestsRejected();
            this._numReservationOnRequestsFailed = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumReservationOnRequestsFailed();
            this._numFwdReservationOnMessagesSent = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumFwdReservationOnMessagesSent();
            this._numRevReservationOnMessagesSent = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumRevReservationOnMessagesSent();
            this._numReservationOffRequestsReceived = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumReservationOffRequestsReceived();
            this._numReservationOffRequestsAccepted = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumReservationOffRequestsAccepted();
            this._numReservationOffRequestsRejected = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumReservationOffRequestsRejected();
            this._numFwdReservationOffMessagesSent = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumFwdReservationOffMessagesSent();
            this._numRevReservationOffMessagesSent = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumRevReservationOffMessagesSent();
            this._numQoSReleaseRequestsReceived = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumQoSReleaseRequestsReceived();
            this._numConnectionCloseInitiatedNoRanRsr = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG)arg).getNumConnectionCloseInitiatedNoRanRsr();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getNumConnectionCloseInitiatedNoRanRsr() {
        return _numConnectionCloseInitiatedNoRanRsr;
    }
    
    public BigInteger getNumFwdReservationOffMessagesSent() {
        return _numFwdReservationOffMessagesSent;
    }
    
    public BigInteger getNumFwdReservationOnMessagesSent() {
        return _numFwdReservationOnMessagesSent;
    }
    
    public BigInteger getNumPdsnipFlowUpdatesMsgFailed() {
        return _numPdsnipFlowUpdatesMsgFailed;
    }
    
    public BigInteger getNumPdsnipFlowUpdatesMsgRcvd() {
        return _numPdsnipFlowUpdatesMsgRcvd;
    }
    
    public BigInteger getNumQoSReleaseRequestsReceived() {
        return _numQoSReleaseRequestsReceived;
    }
    
    public BigInteger getNumQoSSetupRequestsAccepted() {
        return _numQoSSetupRequestsAccepted;
    }
    
    public BigInteger getNumQoSSetupRequestsReceived() {
        return _numQoSSetupRequestsReceived;
    }
    
    public BigInteger getNumQoSSetupRequestsRejected() {
        return _numQoSSetupRequestsRejected;
    }
    
    public BigInteger getNumQoSSubscriberProfileUpdatesRcvd() {
        return _numQoSSubscriberProfileUpdatesRcvd;
    }
    
    public BigInteger getNumReservationOffRequestsAccepted() {
        return _numReservationOffRequestsAccepted;
    }
    
    public BigInteger getNumReservationOffRequestsReceived() {
        return _numReservationOffRequestsReceived;
    }
    
    public BigInteger getNumReservationOffRequestsRejected() {
        return _numReservationOffRequestsRejected;
    }
    
    public BigInteger getNumReservationOnRequestsAccepted() {
        return _numReservationOnRequestsAccepted;
    }
    
    public BigInteger getNumReservationOnRequestsFailed() {
        return _numReservationOnRequestsFailed;
    }
    
    public BigInteger getNumReservationOnRequestsReceived() {
        return _numReservationOnRequestsReceived;
    }
    
    public BigInteger getNumReservationOnRequestsRejected() {
        return _numReservationOnRequestsRejected;
    }
    
    public BigInteger getNumRevReservationOffMessagesSent() {
        return _numRevReservationOffMessagesSent;
    }
    
    public BigInteger getNumRevReservationOnMessagesSent() {
        return _numRevReservationOnMessagesSent;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMCONNECTIONCLOSEINITIATEDNORANRSRRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMCONNECTIONCLOSEINITIATEDNORANRSRRANGE_RANGES = a;
     }
     private static void checkNumConnectionCloseInitiatedNoRanRsrRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMCONNECTIONCLOSEINITIATEDNORANRSRRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMCONNECTIONCLOSEINITIATEDNORANRSRRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumConnectionCloseInitiatedNoRanRsr(final BigInteger value) {
    if (value != null) {
        checkNumConnectionCloseInitiatedNoRanRsrRange(value);
    }
        this._numConnectionCloseInitiatedNoRanRsr = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMFWDRESERVATIONOFFMESSAGESSENTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMFWDRESERVATIONOFFMESSAGESSENTRANGE_RANGES = a;
     }
     private static void checkNumFwdReservationOffMessagesSentRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMFWDRESERVATIONOFFMESSAGESSENTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMFWDRESERVATIONOFFMESSAGESSENTRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumFwdReservationOffMessagesSent(final BigInteger value) {
    if (value != null) {
        checkNumFwdReservationOffMessagesSentRange(value);
    }
        this._numFwdReservationOffMessagesSent = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMFWDRESERVATIONONMESSAGESSENTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMFWDRESERVATIONONMESSAGESSENTRANGE_RANGES = a;
     }
     private static void checkNumFwdReservationOnMessagesSentRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMFWDRESERVATIONONMESSAGESSENTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMFWDRESERVATIONONMESSAGESSENTRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumFwdReservationOnMessagesSent(final BigInteger value) {
    if (value != null) {
        checkNumFwdReservationOnMessagesSentRange(value);
    }
        this._numFwdReservationOnMessagesSent = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMPDSNIPFLOWUPDATESMSGFAILEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMPDSNIPFLOWUPDATESMSGFAILEDRANGE_RANGES = a;
     }
     private static void checkNumPdsnipFlowUpdatesMsgFailedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMPDSNIPFLOWUPDATESMSGFAILEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMPDSNIPFLOWUPDATESMSGFAILEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumPdsnipFlowUpdatesMsgFailed(final BigInteger value) {
    if (value != null) {
        checkNumPdsnipFlowUpdatesMsgFailedRange(value);
    }
        this._numPdsnipFlowUpdatesMsgFailed = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMPDSNIPFLOWUPDATESMSGRCVDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMPDSNIPFLOWUPDATESMSGRCVDRANGE_RANGES = a;
     }
     private static void checkNumPdsnipFlowUpdatesMsgRcvdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMPDSNIPFLOWUPDATESMSGRCVDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMPDSNIPFLOWUPDATESMSGRCVDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumPdsnipFlowUpdatesMsgRcvd(final BigInteger value) {
    if (value != null) {
        checkNumPdsnipFlowUpdatesMsgRcvdRange(value);
    }
        this._numPdsnipFlowUpdatesMsgRcvd = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMQOSRELEASEREQUESTSRECEIVEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMQOSRELEASEREQUESTSRECEIVEDRANGE_RANGES = a;
     }
     private static void checkNumQoSReleaseRequestsReceivedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMQOSRELEASEREQUESTSRECEIVEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMQOSRELEASEREQUESTSRECEIVEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumQoSReleaseRequestsReceived(final BigInteger value) {
    if (value != null) {
        checkNumQoSReleaseRequestsReceivedRange(value);
    }
        this._numQoSReleaseRequestsReceived = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMQOSSETUPREQUESTSACCEPTEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMQOSSETUPREQUESTSACCEPTEDRANGE_RANGES = a;
     }
     private static void checkNumQoSSetupRequestsAcceptedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMQOSSETUPREQUESTSACCEPTEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMQOSSETUPREQUESTSACCEPTEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumQoSSetupRequestsAccepted(final BigInteger value) {
    if (value != null) {
        checkNumQoSSetupRequestsAcceptedRange(value);
    }
        this._numQoSSetupRequestsAccepted = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMQOSSETUPREQUESTSRECEIVEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMQOSSETUPREQUESTSRECEIVEDRANGE_RANGES = a;
     }
     private static void checkNumQoSSetupRequestsReceivedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMQOSSETUPREQUESTSRECEIVEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMQOSSETUPREQUESTSRECEIVEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumQoSSetupRequestsReceived(final BigInteger value) {
    if (value != null) {
        checkNumQoSSetupRequestsReceivedRange(value);
    }
        this._numQoSSetupRequestsReceived = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMQOSSETUPREQUESTSREJECTEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMQOSSETUPREQUESTSREJECTEDRANGE_RANGES = a;
     }
     private static void checkNumQoSSetupRequestsRejectedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMQOSSETUPREQUESTSREJECTEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMQOSSETUPREQUESTSREJECTEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumQoSSetupRequestsRejected(final BigInteger value) {
    if (value != null) {
        checkNumQoSSetupRequestsRejectedRange(value);
    }
        this._numQoSSetupRequestsRejected = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMQOSSUBSCRIBERPROFILEUPDATESRCVDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMQOSSUBSCRIBERPROFILEUPDATESRCVDRANGE_RANGES = a;
     }
     private static void checkNumQoSSubscriberProfileUpdatesRcvdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMQOSSUBSCRIBERPROFILEUPDATESRCVDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMQOSSUBSCRIBERPROFILEUPDATESRCVDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumQoSSubscriberProfileUpdatesRcvd(final BigInteger value) {
    if (value != null) {
        checkNumQoSSubscriberProfileUpdatesRcvdRange(value);
    }
        this._numQoSSubscriberProfileUpdatesRcvd = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMRESERVATIONOFFREQUESTSACCEPTEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMRESERVATIONOFFREQUESTSACCEPTEDRANGE_RANGES = a;
     }
     private static void checkNumReservationOffRequestsAcceptedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMRESERVATIONOFFREQUESTSACCEPTEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMRESERVATIONOFFREQUESTSACCEPTEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumReservationOffRequestsAccepted(final BigInteger value) {
    if (value != null) {
        checkNumReservationOffRequestsAcceptedRange(value);
    }
        this._numReservationOffRequestsAccepted = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMRESERVATIONOFFREQUESTSRECEIVEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMRESERVATIONOFFREQUESTSRECEIVEDRANGE_RANGES = a;
     }
     private static void checkNumReservationOffRequestsReceivedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMRESERVATIONOFFREQUESTSRECEIVEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMRESERVATIONOFFREQUESTSRECEIVEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumReservationOffRequestsReceived(final BigInteger value) {
    if (value != null) {
        checkNumReservationOffRequestsReceivedRange(value);
    }
        this._numReservationOffRequestsReceived = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMRESERVATIONOFFREQUESTSREJECTEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMRESERVATIONOFFREQUESTSREJECTEDRANGE_RANGES = a;
     }
     private static void checkNumReservationOffRequestsRejectedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMRESERVATIONOFFREQUESTSREJECTEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMRESERVATIONOFFREQUESTSREJECTEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumReservationOffRequestsRejected(final BigInteger value) {
    if (value != null) {
        checkNumReservationOffRequestsRejectedRange(value);
    }
        this._numReservationOffRequestsRejected = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMRESERVATIONONREQUESTSACCEPTEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMRESERVATIONONREQUESTSACCEPTEDRANGE_RANGES = a;
     }
     private static void checkNumReservationOnRequestsAcceptedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMRESERVATIONONREQUESTSACCEPTEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMRESERVATIONONREQUESTSACCEPTEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumReservationOnRequestsAccepted(final BigInteger value) {
    if (value != null) {
        checkNumReservationOnRequestsAcceptedRange(value);
    }
        this._numReservationOnRequestsAccepted = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMRESERVATIONONREQUESTSFAILEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMRESERVATIONONREQUESTSFAILEDRANGE_RANGES = a;
     }
     private static void checkNumReservationOnRequestsFailedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMRESERVATIONONREQUESTSFAILEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMRESERVATIONONREQUESTSFAILEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumReservationOnRequestsFailed(final BigInteger value) {
    if (value != null) {
        checkNumReservationOnRequestsFailedRange(value);
    }
        this._numReservationOnRequestsFailed = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMRESERVATIONONREQUESTSRECEIVEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMRESERVATIONONREQUESTSRECEIVEDRANGE_RANGES = a;
     }
     private static void checkNumReservationOnRequestsReceivedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMRESERVATIONONREQUESTSRECEIVEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMRESERVATIONONREQUESTSRECEIVEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumReservationOnRequestsReceived(final BigInteger value) {
    if (value != null) {
        checkNumReservationOnRequestsReceivedRange(value);
    }
        this._numReservationOnRequestsReceived = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMRESERVATIONONREQUESTSREJECTEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMRESERVATIONONREQUESTSREJECTEDRANGE_RANGES = a;
     }
     private static void checkNumReservationOnRequestsRejectedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMRESERVATIONONREQUESTSREJECTEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMRESERVATIONONREQUESTSREJECTEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumReservationOnRequestsRejected(final BigInteger value) {
    if (value != null) {
        checkNumReservationOnRequestsRejectedRange(value);
    }
        this._numReservationOnRequestsRejected = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMREVRESERVATIONOFFMESSAGESSENTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMREVRESERVATIONOFFMESSAGESSENTRANGE_RANGES = a;
     }
     private static void checkNumRevReservationOffMessagesSentRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMREVRESERVATIONOFFMESSAGESSENTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMREVRESERVATIONOFFMESSAGESSENTRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumRevReservationOffMessagesSent(final BigInteger value) {
    if (value != null) {
        checkNumRevReservationOffMessagesSentRange(value);
    }
        this._numRevReservationOffMessagesSent = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMREVRESERVATIONONMESSAGESSENTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMREVRESERVATIONONMESSAGESSENTRANGE_RANGES = a;
     }
     private static void checkNumRevReservationOnMessagesSentRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMREVRESERVATIONONMESSAGESSENTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMREVRESERVATIONONMESSAGESSENTRANGE_RANGES)));
     }
    
    public Cdma2000HrpdQoSStatsBuilder setNumRevReservationOnMessagesSent(final BigInteger value) {
    if (value != null) {
        checkNumRevReservationOnMessagesSentRange(value);
    }
        this._numRevReservationOnMessagesSent = value;
        return this;
    }
    
    public Cdma2000HrpdQoSStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdQoSStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdQoSStats build() {
        return new Cdma2000HrpdQoSStatsImpl(this);
    }

    private static final class Cdma2000HrpdQoSStatsImpl implements Cdma2000HrpdQoSStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats.class;
        }

        private final BigInteger _numConnectionCloseInitiatedNoRanRsr;
        private final BigInteger _numFwdReservationOffMessagesSent;
        private final BigInteger _numFwdReservationOnMessagesSent;
        private final BigInteger _numPdsnipFlowUpdatesMsgFailed;
        private final BigInteger _numPdsnipFlowUpdatesMsgRcvd;
        private final BigInteger _numQoSReleaseRequestsReceived;
        private final BigInteger _numQoSSetupRequestsAccepted;
        private final BigInteger _numQoSSetupRequestsReceived;
        private final BigInteger _numQoSSetupRequestsRejected;
        private final BigInteger _numQoSSubscriberProfileUpdatesRcvd;
        private final BigInteger _numReservationOffRequestsAccepted;
        private final BigInteger _numReservationOffRequestsReceived;
        private final BigInteger _numReservationOffRequestsRejected;
        private final BigInteger _numReservationOnRequestsAccepted;
        private final BigInteger _numReservationOnRequestsFailed;
        private final BigInteger _numReservationOnRequestsReceived;
        private final BigInteger _numReservationOnRequestsRejected;
        private final BigInteger _numRevReservationOffMessagesSent;
        private final BigInteger _numRevReservationOnMessagesSent;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdQoSStatsImpl(Cdma2000HrpdQoSStatsBuilder base) {
            this._numConnectionCloseInitiatedNoRanRsr = base.getNumConnectionCloseInitiatedNoRanRsr();
            this._numFwdReservationOffMessagesSent = base.getNumFwdReservationOffMessagesSent();
            this._numFwdReservationOnMessagesSent = base.getNumFwdReservationOnMessagesSent();
            this._numPdsnipFlowUpdatesMsgFailed = base.getNumPdsnipFlowUpdatesMsgFailed();
            this._numPdsnipFlowUpdatesMsgRcvd = base.getNumPdsnipFlowUpdatesMsgRcvd();
            this._numQoSReleaseRequestsReceived = base.getNumQoSReleaseRequestsReceived();
            this._numQoSSetupRequestsAccepted = base.getNumQoSSetupRequestsAccepted();
            this._numQoSSetupRequestsReceived = base.getNumQoSSetupRequestsReceived();
            this._numQoSSetupRequestsRejected = base.getNumQoSSetupRequestsRejected();
            this._numQoSSubscriberProfileUpdatesRcvd = base.getNumQoSSubscriberProfileUpdatesRcvd();
            this._numReservationOffRequestsAccepted = base.getNumReservationOffRequestsAccepted();
            this._numReservationOffRequestsReceived = base.getNumReservationOffRequestsReceived();
            this._numReservationOffRequestsRejected = base.getNumReservationOffRequestsRejected();
            this._numReservationOnRequestsAccepted = base.getNumReservationOnRequestsAccepted();
            this._numReservationOnRequestsFailed = base.getNumReservationOnRequestsFailed();
            this._numReservationOnRequestsReceived = base.getNumReservationOnRequestsReceived();
            this._numReservationOnRequestsRejected = base.getNumReservationOnRequestsRejected();
            this._numRevReservationOffMessagesSent = base.getNumRevReservationOffMessagesSent();
            this._numRevReservationOnMessagesSent = base.getNumRevReservationOnMessagesSent();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getNumConnectionCloseInitiatedNoRanRsr() {
            return _numConnectionCloseInitiatedNoRanRsr;
        }
        
        @Override
        public BigInteger getNumFwdReservationOffMessagesSent() {
            return _numFwdReservationOffMessagesSent;
        }
        
        @Override
        public BigInteger getNumFwdReservationOnMessagesSent() {
            return _numFwdReservationOnMessagesSent;
        }
        
        @Override
        public BigInteger getNumPdsnipFlowUpdatesMsgFailed() {
            return _numPdsnipFlowUpdatesMsgFailed;
        }
        
        @Override
        public BigInteger getNumPdsnipFlowUpdatesMsgRcvd() {
            return _numPdsnipFlowUpdatesMsgRcvd;
        }
        
        @Override
        public BigInteger getNumQoSReleaseRequestsReceived() {
            return _numQoSReleaseRequestsReceived;
        }
        
        @Override
        public BigInteger getNumQoSSetupRequestsAccepted() {
            return _numQoSSetupRequestsAccepted;
        }
        
        @Override
        public BigInteger getNumQoSSetupRequestsReceived() {
            return _numQoSSetupRequestsReceived;
        }
        
        @Override
        public BigInteger getNumQoSSetupRequestsRejected() {
            return _numQoSSetupRequestsRejected;
        }
        
        @Override
        public BigInteger getNumQoSSubscriberProfileUpdatesRcvd() {
            return _numQoSSubscriberProfileUpdatesRcvd;
        }
        
        @Override
        public BigInteger getNumReservationOffRequestsAccepted() {
            return _numReservationOffRequestsAccepted;
        }
        
        @Override
        public BigInteger getNumReservationOffRequestsReceived() {
            return _numReservationOffRequestsReceived;
        }
        
        @Override
        public BigInteger getNumReservationOffRequestsRejected() {
            return _numReservationOffRequestsRejected;
        }
        
        @Override
        public BigInteger getNumReservationOnRequestsAccepted() {
            return _numReservationOnRequestsAccepted;
        }
        
        @Override
        public BigInteger getNumReservationOnRequestsFailed() {
            return _numReservationOnRequestsFailed;
        }
        
        @Override
        public BigInteger getNumReservationOnRequestsReceived() {
            return _numReservationOnRequestsReceived;
        }
        
        @Override
        public BigInteger getNumReservationOnRequestsRejected() {
            return _numReservationOnRequestsRejected;
        }
        
        @Override
        public BigInteger getNumRevReservationOffMessagesSent() {
            return _numRevReservationOffMessagesSent;
        }
        
        @Override
        public BigInteger getNumRevReservationOnMessagesSent() {
            return _numRevReservationOnMessagesSent;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_numConnectionCloseInitiatedNoRanRsr);
            result = prime * result + Objects.hashCode(_numFwdReservationOffMessagesSent);
            result = prime * result + Objects.hashCode(_numFwdReservationOnMessagesSent);
            result = prime * result + Objects.hashCode(_numPdsnipFlowUpdatesMsgFailed);
            result = prime * result + Objects.hashCode(_numPdsnipFlowUpdatesMsgRcvd);
            result = prime * result + Objects.hashCode(_numQoSReleaseRequestsReceived);
            result = prime * result + Objects.hashCode(_numQoSSetupRequestsAccepted);
            result = prime * result + Objects.hashCode(_numQoSSetupRequestsReceived);
            result = prime * result + Objects.hashCode(_numQoSSetupRequestsRejected);
            result = prime * result + Objects.hashCode(_numQoSSubscriberProfileUpdatesRcvd);
            result = prime * result + Objects.hashCode(_numReservationOffRequestsAccepted);
            result = prime * result + Objects.hashCode(_numReservationOffRequestsReceived);
            result = prime * result + Objects.hashCode(_numReservationOffRequestsRejected);
            result = prime * result + Objects.hashCode(_numReservationOnRequestsAccepted);
            result = prime * result + Objects.hashCode(_numReservationOnRequestsFailed);
            result = prime * result + Objects.hashCode(_numReservationOnRequestsReceived);
            result = prime * result + Objects.hashCode(_numReservationOnRequestsRejected);
            result = prime * result + Objects.hashCode(_numRevReservationOffMessagesSent);
            result = prime * result + Objects.hashCode(_numRevReservationOnMessagesSent);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats)obj;
            if (!Objects.equals(_numConnectionCloseInitiatedNoRanRsr, other.getNumConnectionCloseInitiatedNoRanRsr())) {
                return false;
            }
            if (!Objects.equals(_numFwdReservationOffMessagesSent, other.getNumFwdReservationOffMessagesSent())) {
                return false;
            }
            if (!Objects.equals(_numFwdReservationOnMessagesSent, other.getNumFwdReservationOnMessagesSent())) {
                return false;
            }
            if (!Objects.equals(_numPdsnipFlowUpdatesMsgFailed, other.getNumPdsnipFlowUpdatesMsgFailed())) {
                return false;
            }
            if (!Objects.equals(_numPdsnipFlowUpdatesMsgRcvd, other.getNumPdsnipFlowUpdatesMsgRcvd())) {
                return false;
            }
            if (!Objects.equals(_numQoSReleaseRequestsReceived, other.getNumQoSReleaseRequestsReceived())) {
                return false;
            }
            if (!Objects.equals(_numQoSSetupRequestsAccepted, other.getNumQoSSetupRequestsAccepted())) {
                return false;
            }
            if (!Objects.equals(_numQoSSetupRequestsReceived, other.getNumQoSSetupRequestsReceived())) {
                return false;
            }
            if (!Objects.equals(_numQoSSetupRequestsRejected, other.getNumQoSSetupRequestsRejected())) {
                return false;
            }
            if (!Objects.equals(_numQoSSubscriberProfileUpdatesRcvd, other.getNumQoSSubscriberProfileUpdatesRcvd())) {
                return false;
            }
            if (!Objects.equals(_numReservationOffRequestsAccepted, other.getNumReservationOffRequestsAccepted())) {
                return false;
            }
            if (!Objects.equals(_numReservationOffRequestsReceived, other.getNumReservationOffRequestsReceived())) {
                return false;
            }
            if (!Objects.equals(_numReservationOffRequestsRejected, other.getNumReservationOffRequestsRejected())) {
                return false;
            }
            if (!Objects.equals(_numReservationOnRequestsAccepted, other.getNumReservationOnRequestsAccepted())) {
                return false;
            }
            if (!Objects.equals(_numReservationOnRequestsFailed, other.getNumReservationOnRequestsFailed())) {
                return false;
            }
            if (!Objects.equals(_numReservationOnRequestsReceived, other.getNumReservationOnRequestsReceived())) {
                return false;
            }
            if (!Objects.equals(_numReservationOnRequestsRejected, other.getNumReservationOnRequestsRejected())) {
                return false;
            }
            if (!Objects.equals(_numRevReservationOffMessagesSent, other.getNumRevReservationOffMessagesSent())) {
                return false;
            }
            if (!Objects.equals(_numRevReservationOnMessagesSent, other.getNumRevReservationOnMessagesSent())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdQoSStatsImpl otherImpl = (Cdma2000HrpdQoSStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdQoSStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_numConnectionCloseInitiatedNoRanRsr != null) {
                builder.append("_numConnectionCloseInitiatedNoRanRsr=");
                builder.append(_numConnectionCloseInitiatedNoRanRsr);
                builder.append(", ");
            }
            if (_numFwdReservationOffMessagesSent != null) {
                builder.append("_numFwdReservationOffMessagesSent=");
                builder.append(_numFwdReservationOffMessagesSent);
                builder.append(", ");
            }
            if (_numFwdReservationOnMessagesSent != null) {
                builder.append("_numFwdReservationOnMessagesSent=");
                builder.append(_numFwdReservationOnMessagesSent);
                builder.append(", ");
            }
            if (_numPdsnipFlowUpdatesMsgFailed != null) {
                builder.append("_numPdsnipFlowUpdatesMsgFailed=");
                builder.append(_numPdsnipFlowUpdatesMsgFailed);
                builder.append(", ");
            }
            if (_numPdsnipFlowUpdatesMsgRcvd != null) {
                builder.append("_numPdsnipFlowUpdatesMsgRcvd=");
                builder.append(_numPdsnipFlowUpdatesMsgRcvd);
                builder.append(", ");
            }
            if (_numQoSReleaseRequestsReceived != null) {
                builder.append("_numQoSReleaseRequestsReceived=");
                builder.append(_numQoSReleaseRequestsReceived);
                builder.append(", ");
            }
            if (_numQoSSetupRequestsAccepted != null) {
                builder.append("_numQoSSetupRequestsAccepted=");
                builder.append(_numQoSSetupRequestsAccepted);
                builder.append(", ");
            }
            if (_numQoSSetupRequestsReceived != null) {
                builder.append("_numQoSSetupRequestsReceived=");
                builder.append(_numQoSSetupRequestsReceived);
                builder.append(", ");
            }
            if (_numQoSSetupRequestsRejected != null) {
                builder.append("_numQoSSetupRequestsRejected=");
                builder.append(_numQoSSetupRequestsRejected);
                builder.append(", ");
            }
            if (_numQoSSubscriberProfileUpdatesRcvd != null) {
                builder.append("_numQoSSubscriberProfileUpdatesRcvd=");
                builder.append(_numQoSSubscriberProfileUpdatesRcvd);
                builder.append(", ");
            }
            if (_numReservationOffRequestsAccepted != null) {
                builder.append("_numReservationOffRequestsAccepted=");
                builder.append(_numReservationOffRequestsAccepted);
                builder.append(", ");
            }
            if (_numReservationOffRequestsReceived != null) {
                builder.append("_numReservationOffRequestsReceived=");
                builder.append(_numReservationOffRequestsReceived);
                builder.append(", ");
            }
            if (_numReservationOffRequestsRejected != null) {
                builder.append("_numReservationOffRequestsRejected=");
                builder.append(_numReservationOffRequestsRejected);
                builder.append(", ");
            }
            if (_numReservationOnRequestsAccepted != null) {
                builder.append("_numReservationOnRequestsAccepted=");
                builder.append(_numReservationOnRequestsAccepted);
                builder.append(", ");
            }
            if (_numReservationOnRequestsFailed != null) {
                builder.append("_numReservationOnRequestsFailed=");
                builder.append(_numReservationOnRequestsFailed);
                builder.append(", ");
            }
            if (_numReservationOnRequestsReceived != null) {
                builder.append("_numReservationOnRequestsReceived=");
                builder.append(_numReservationOnRequestsReceived);
                builder.append(", ");
            }
            if (_numReservationOnRequestsRejected != null) {
                builder.append("_numReservationOnRequestsRejected=");
                builder.append(_numReservationOnRequestsRejected);
                builder.append(", ");
            }
            if (_numRevReservationOffMessagesSent != null) {
                builder.append("_numRevReservationOffMessagesSent=");
                builder.append(_numRevReservationOffMessagesSent);
                builder.append(", ");
            }
            if (_numRevReservationOnMessagesSent != null) {
                builder.append("_numRevReservationOnMessagesSent=");
                builder.append(_numRevReservationOnMessagesSent);
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
