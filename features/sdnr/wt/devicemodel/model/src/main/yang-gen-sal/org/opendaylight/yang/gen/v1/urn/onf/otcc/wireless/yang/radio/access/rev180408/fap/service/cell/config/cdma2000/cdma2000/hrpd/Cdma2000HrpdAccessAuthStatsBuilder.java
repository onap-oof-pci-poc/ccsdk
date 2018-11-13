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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats
 *
 */
public class Cdma2000HrpdAccessAuthStatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats> {

    private BigInteger _a12AcceptsReceivedByNode;
    private BigInteger _a12AccessChallengesReceivedByNode;
    private BigInteger _a12BadAuthenticatorReceivedByNode;
    private BigInteger _a12ByPassNumAtsWithUnknownMfrCodeByNode;
    private BigInteger _a12EnhTaBypassChapInvalidByNode;
    private BigInteger _a12EnhTaBypassChapNaiMatchesA12BypassListByNode;
    private BigInteger _a12EnhTaBypassChapTimeoutByNode;
    private BigInteger _a12EnhTaBypassLcpTimeoutByNode;
    private BigInteger _a12MalformedresponseReceivedByNode;
    private BigInteger _a12OtherFailureOccurencesInNode;
    private BigInteger _a12RejectsReceivedByNode;
    private BigInteger _a12RequestsSentFromNode;
    private BigInteger _a12RetransmitsSentFromNode;
    private BigInteger _a12SessionTaTimeoutByNode;
    private BigInteger _a12SvrTimeoutsForNode;
    private BigInteger _a12TimeoutsEventsForNode;
    private BigInteger _a12TxPathFailDueToAnPppErrorByNode;
    private BigInteger _a12TxPathFailDueToInternalErrorByNode;
    private BigInteger _a12TxPathFailDueToNoPacketIdAvailableByNode;
    private BigInteger _a12TxPathFailDueToNoServerAvailableByNode;
    private BigInteger _a12TxPathFailDueToTransmitErrorByNode;
    private BigInteger _a12UnknownPktReceivedByNode;
    private BigInteger _a12UnknownServerReceivedByNode;
    private BigInteger _a12UnknownTypeReceivedByNode;
    private BigInteger _accessAuthFailedDueToSessionCloseTotal;
    private BigInteger _accessAuthSucceeded;
    private BigInteger _anPppAuthenticationAttemptsByNode;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdAccessAuthStatsBuilder() {
    }
    public Cdma2000HrpdAccessAuthStatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG arg) {
        this._anPppAuthenticationAttemptsByNode = arg.getAnPppAuthenticationAttemptsByNode();
        this._a12RequestsSentFromNode = arg.getA12RequestsSentFromNode();
        this._a12RejectsReceivedByNode = arg.getA12RejectsReceivedByNode();
        this._a12AcceptsReceivedByNode = arg.getA12AcceptsReceivedByNode();
        this._a12AccessChallengesReceivedByNode = arg.getA12AccessChallengesReceivedByNode();
        this._a12RetransmitsSentFromNode = arg.getA12RetransmitsSentFromNode();
        this._a12TimeoutsEventsForNode = arg.getA12TimeoutsEventsForNode();
        this._a12MalformedresponseReceivedByNode = arg.getA12MalformedresponseReceivedByNode();
        this._a12BadAuthenticatorReceivedByNode = arg.getA12BadAuthenticatorReceivedByNode();
        this._a12UnknownTypeReceivedByNode = arg.getA12UnknownTypeReceivedByNode();
        this._a12UnknownPktReceivedByNode = arg.getA12UnknownPktReceivedByNode();
        this._a12UnknownServerReceivedByNode = arg.getA12UnknownServerReceivedByNode();
        this._a12OtherFailureOccurencesInNode = arg.getA12OtherFailureOccurencesInNode();
        this._a12ByPassNumAtsWithUnknownMfrCodeByNode = arg.getA12ByPassNumAtsWithUnknownMfrCodeByNode();
        this._a12TxPathFailDueToAnPppErrorByNode = arg.getA12TxPathFailDueToAnPppErrorByNode();
        this._a12TxPathFailDueToNoServerAvailableByNode = arg.getA12TxPathFailDueToNoServerAvailableByNode();
        this._a12TxPathFailDueToInternalErrorByNode = arg.getA12TxPathFailDueToInternalErrorByNode();
        this._a12TxPathFailDueToNoPacketIdAvailableByNode = arg.getA12TxPathFailDueToNoPacketIdAvailableByNode();
        this._a12TxPathFailDueToTransmitErrorByNode = arg.getA12TxPathFailDueToTransmitErrorByNode();
        this._a12SvrTimeoutsForNode = arg.getA12SvrTimeoutsForNode();
        this._a12EnhTaBypassLcpTimeoutByNode = arg.getA12EnhTaBypassLcpTimeoutByNode();
        this._a12EnhTaBypassChapTimeoutByNode = arg.getA12EnhTaBypassChapTimeoutByNode();
        this._a12EnhTaBypassChapInvalidByNode = arg.getA12EnhTaBypassChapInvalidByNode();
        this._a12EnhTaBypassChapNaiMatchesA12BypassListByNode = arg.getA12EnhTaBypassChapNaiMatchesA12BypassListByNode();
        this._a12SessionTaTimeoutByNode = arg.getA12SessionTaTimeoutByNode();
        this._accessAuthFailedDueToSessionCloseTotal = arg.getAccessAuthFailedDueToSessionCloseTotal();
        this._accessAuthSucceeded = arg.getAccessAuthSucceeded();
    }

    public Cdma2000HrpdAccessAuthStatsBuilder(Cdma2000HrpdAccessAuthStats base) {
        this._a12AcceptsReceivedByNode = base.getA12AcceptsReceivedByNode();
        this._a12AccessChallengesReceivedByNode = base.getA12AccessChallengesReceivedByNode();
        this._a12BadAuthenticatorReceivedByNode = base.getA12BadAuthenticatorReceivedByNode();
        this._a12ByPassNumAtsWithUnknownMfrCodeByNode = base.getA12ByPassNumAtsWithUnknownMfrCodeByNode();
        this._a12EnhTaBypassChapInvalidByNode = base.getA12EnhTaBypassChapInvalidByNode();
        this._a12EnhTaBypassChapNaiMatchesA12BypassListByNode = base.getA12EnhTaBypassChapNaiMatchesA12BypassListByNode();
        this._a12EnhTaBypassChapTimeoutByNode = base.getA12EnhTaBypassChapTimeoutByNode();
        this._a12EnhTaBypassLcpTimeoutByNode = base.getA12EnhTaBypassLcpTimeoutByNode();
        this._a12MalformedresponseReceivedByNode = base.getA12MalformedresponseReceivedByNode();
        this._a12OtherFailureOccurencesInNode = base.getA12OtherFailureOccurencesInNode();
        this._a12RejectsReceivedByNode = base.getA12RejectsReceivedByNode();
        this._a12RequestsSentFromNode = base.getA12RequestsSentFromNode();
        this._a12RetransmitsSentFromNode = base.getA12RetransmitsSentFromNode();
        this._a12SessionTaTimeoutByNode = base.getA12SessionTaTimeoutByNode();
        this._a12SvrTimeoutsForNode = base.getA12SvrTimeoutsForNode();
        this._a12TimeoutsEventsForNode = base.getA12TimeoutsEventsForNode();
        this._a12TxPathFailDueToAnPppErrorByNode = base.getA12TxPathFailDueToAnPppErrorByNode();
        this._a12TxPathFailDueToInternalErrorByNode = base.getA12TxPathFailDueToInternalErrorByNode();
        this._a12TxPathFailDueToNoPacketIdAvailableByNode = base.getA12TxPathFailDueToNoPacketIdAvailableByNode();
        this._a12TxPathFailDueToNoServerAvailableByNode = base.getA12TxPathFailDueToNoServerAvailableByNode();
        this._a12TxPathFailDueToTransmitErrorByNode = base.getA12TxPathFailDueToTransmitErrorByNode();
        this._a12UnknownPktReceivedByNode = base.getA12UnknownPktReceivedByNode();
        this._a12UnknownServerReceivedByNode = base.getA12UnknownServerReceivedByNode();
        this._a12UnknownTypeReceivedByNode = base.getA12UnknownTypeReceivedByNode();
        this._accessAuthFailedDueToSessionCloseTotal = base.getAccessAuthFailedDueToSessionCloseTotal();
        this._accessAuthSucceeded = base.getAccessAuthSucceeded();
        this._anPppAuthenticationAttemptsByNode = base.getAnPppAuthenticationAttemptsByNode();
        if (base instanceof Cdma2000HrpdAccessAuthStatsImpl) {
            Cdma2000HrpdAccessAuthStatsImpl impl = (Cdma2000HrpdAccessAuthStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG) {
            this._anPppAuthenticationAttemptsByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getAnPppAuthenticationAttemptsByNode();
            this._a12RequestsSentFromNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12RequestsSentFromNode();
            this._a12RejectsReceivedByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12RejectsReceivedByNode();
            this._a12AcceptsReceivedByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12AcceptsReceivedByNode();
            this._a12AccessChallengesReceivedByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12AccessChallengesReceivedByNode();
            this._a12RetransmitsSentFromNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12RetransmitsSentFromNode();
            this._a12TimeoutsEventsForNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12TimeoutsEventsForNode();
            this._a12MalformedresponseReceivedByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12MalformedresponseReceivedByNode();
            this._a12BadAuthenticatorReceivedByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12BadAuthenticatorReceivedByNode();
            this._a12UnknownTypeReceivedByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12UnknownTypeReceivedByNode();
            this._a12UnknownPktReceivedByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12UnknownPktReceivedByNode();
            this._a12UnknownServerReceivedByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12UnknownServerReceivedByNode();
            this._a12OtherFailureOccurencesInNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12OtherFailureOccurencesInNode();
            this._a12ByPassNumAtsWithUnknownMfrCodeByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12ByPassNumAtsWithUnknownMfrCodeByNode();
            this._a12TxPathFailDueToAnPppErrorByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12TxPathFailDueToAnPppErrorByNode();
            this._a12TxPathFailDueToNoServerAvailableByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12TxPathFailDueToNoServerAvailableByNode();
            this._a12TxPathFailDueToInternalErrorByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12TxPathFailDueToInternalErrorByNode();
            this._a12TxPathFailDueToNoPacketIdAvailableByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12TxPathFailDueToNoPacketIdAvailableByNode();
            this._a12TxPathFailDueToTransmitErrorByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12TxPathFailDueToTransmitErrorByNode();
            this._a12SvrTimeoutsForNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12SvrTimeoutsForNode();
            this._a12EnhTaBypassLcpTimeoutByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12EnhTaBypassLcpTimeoutByNode();
            this._a12EnhTaBypassChapTimeoutByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12EnhTaBypassChapTimeoutByNode();
            this._a12EnhTaBypassChapInvalidByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12EnhTaBypassChapInvalidByNode();
            this._a12EnhTaBypassChapNaiMatchesA12BypassListByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12EnhTaBypassChapNaiMatchesA12BypassListByNode();
            this._a12SessionTaTimeoutByNode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getA12SessionTaTimeoutByNode();
            this._accessAuthFailedDueToSessionCloseTotal = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getAccessAuthFailedDueToSessionCloseTotal();
            this._accessAuthSucceeded = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG)arg).getAccessAuthSucceeded();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getA12AcceptsReceivedByNode() {
        return _a12AcceptsReceivedByNode;
    }
    
    public BigInteger getA12AccessChallengesReceivedByNode() {
        return _a12AccessChallengesReceivedByNode;
    }
    
    public BigInteger getA12BadAuthenticatorReceivedByNode() {
        return _a12BadAuthenticatorReceivedByNode;
    }
    
    public BigInteger getA12ByPassNumAtsWithUnknownMfrCodeByNode() {
        return _a12ByPassNumAtsWithUnknownMfrCodeByNode;
    }
    
    public BigInteger getA12EnhTaBypassChapInvalidByNode() {
        return _a12EnhTaBypassChapInvalidByNode;
    }
    
    public BigInteger getA12EnhTaBypassChapNaiMatchesA12BypassListByNode() {
        return _a12EnhTaBypassChapNaiMatchesA12BypassListByNode;
    }
    
    public BigInteger getA12EnhTaBypassChapTimeoutByNode() {
        return _a12EnhTaBypassChapTimeoutByNode;
    }
    
    public BigInteger getA12EnhTaBypassLcpTimeoutByNode() {
        return _a12EnhTaBypassLcpTimeoutByNode;
    }
    
    public BigInteger getA12MalformedresponseReceivedByNode() {
        return _a12MalformedresponseReceivedByNode;
    }
    
    public BigInteger getA12OtherFailureOccurencesInNode() {
        return _a12OtherFailureOccurencesInNode;
    }
    
    public BigInteger getA12RejectsReceivedByNode() {
        return _a12RejectsReceivedByNode;
    }
    
    public BigInteger getA12RequestsSentFromNode() {
        return _a12RequestsSentFromNode;
    }
    
    public BigInteger getA12RetransmitsSentFromNode() {
        return _a12RetransmitsSentFromNode;
    }
    
    public BigInteger getA12SessionTaTimeoutByNode() {
        return _a12SessionTaTimeoutByNode;
    }
    
    public BigInteger getA12SvrTimeoutsForNode() {
        return _a12SvrTimeoutsForNode;
    }
    
    public BigInteger getA12TimeoutsEventsForNode() {
        return _a12TimeoutsEventsForNode;
    }
    
    public BigInteger getA12TxPathFailDueToAnPppErrorByNode() {
        return _a12TxPathFailDueToAnPppErrorByNode;
    }
    
    public BigInteger getA12TxPathFailDueToInternalErrorByNode() {
        return _a12TxPathFailDueToInternalErrorByNode;
    }
    
    public BigInteger getA12TxPathFailDueToNoPacketIdAvailableByNode() {
        return _a12TxPathFailDueToNoPacketIdAvailableByNode;
    }
    
    public BigInteger getA12TxPathFailDueToNoServerAvailableByNode() {
        return _a12TxPathFailDueToNoServerAvailableByNode;
    }
    
    public BigInteger getA12TxPathFailDueToTransmitErrorByNode() {
        return _a12TxPathFailDueToTransmitErrorByNode;
    }
    
    public BigInteger getA12UnknownPktReceivedByNode() {
        return _a12UnknownPktReceivedByNode;
    }
    
    public BigInteger getA12UnknownServerReceivedByNode() {
        return _a12UnknownServerReceivedByNode;
    }
    
    public BigInteger getA12UnknownTypeReceivedByNode() {
        return _a12UnknownTypeReceivedByNode;
    }
    
    public BigInteger getAccessAuthFailedDueToSessionCloseTotal() {
        return _accessAuthFailedDueToSessionCloseTotal;
    }
    
    public BigInteger getAccessAuthSucceeded() {
        return _accessAuthSucceeded;
    }
    
    public BigInteger getAnPppAuthenticationAttemptsByNode() {
        return _anPppAuthenticationAttemptsByNode;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12ACCEPTSRECEIVEDBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12ACCEPTSRECEIVEDBYNODERANGE_RANGES = a;
     }
     private static void checkA12AcceptsReceivedByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12ACCEPTSRECEIVEDBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12ACCEPTSRECEIVEDBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12AcceptsReceivedByNode(final BigInteger value) {
    if (value != null) {
        checkA12AcceptsReceivedByNodeRange(value);
    }
        this._a12AcceptsReceivedByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12ACCESSCHALLENGESRECEIVEDBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12ACCESSCHALLENGESRECEIVEDBYNODERANGE_RANGES = a;
     }
     private static void checkA12AccessChallengesReceivedByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12ACCESSCHALLENGESRECEIVEDBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12ACCESSCHALLENGESRECEIVEDBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12AccessChallengesReceivedByNode(final BigInteger value) {
    if (value != null) {
        checkA12AccessChallengesReceivedByNodeRange(value);
    }
        this._a12AccessChallengesReceivedByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12BADAUTHENTICATORRECEIVEDBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12BADAUTHENTICATORRECEIVEDBYNODERANGE_RANGES = a;
     }
     private static void checkA12BadAuthenticatorReceivedByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12BADAUTHENTICATORRECEIVEDBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12BADAUTHENTICATORRECEIVEDBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12BadAuthenticatorReceivedByNode(final BigInteger value) {
    if (value != null) {
        checkA12BadAuthenticatorReceivedByNodeRange(value);
    }
        this._a12BadAuthenticatorReceivedByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12BYPASSNUMATSWITHUNKNOWNMFRCODEBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12BYPASSNUMATSWITHUNKNOWNMFRCODEBYNODERANGE_RANGES = a;
     }
     private static void checkA12ByPassNumAtsWithUnknownMfrCodeByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12BYPASSNUMATSWITHUNKNOWNMFRCODEBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12BYPASSNUMATSWITHUNKNOWNMFRCODEBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12ByPassNumAtsWithUnknownMfrCodeByNode(final BigInteger value) {
    if (value != null) {
        checkA12ByPassNumAtsWithUnknownMfrCodeByNodeRange(value);
    }
        this._a12ByPassNumAtsWithUnknownMfrCodeByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12ENHTABYPASSCHAPINVALIDBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12ENHTABYPASSCHAPINVALIDBYNODERANGE_RANGES = a;
     }
     private static void checkA12EnhTaBypassChapInvalidByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12ENHTABYPASSCHAPINVALIDBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12ENHTABYPASSCHAPINVALIDBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12EnhTaBypassChapInvalidByNode(final BigInteger value) {
    if (value != null) {
        checkA12EnhTaBypassChapInvalidByNodeRange(value);
    }
        this._a12EnhTaBypassChapInvalidByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12ENHTABYPASSCHAPNAIMATCHESA12BYPASSLISTBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12ENHTABYPASSCHAPNAIMATCHESA12BYPASSLISTBYNODERANGE_RANGES = a;
     }
     private static void checkA12EnhTaBypassChapNaiMatchesA12BypassListByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12ENHTABYPASSCHAPNAIMATCHESA12BYPASSLISTBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12ENHTABYPASSCHAPNAIMATCHESA12BYPASSLISTBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12EnhTaBypassChapNaiMatchesA12BypassListByNode(final BigInteger value) {
    if (value != null) {
        checkA12EnhTaBypassChapNaiMatchesA12BypassListByNodeRange(value);
    }
        this._a12EnhTaBypassChapNaiMatchesA12BypassListByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12ENHTABYPASSCHAPTIMEOUTBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12ENHTABYPASSCHAPTIMEOUTBYNODERANGE_RANGES = a;
     }
     private static void checkA12EnhTaBypassChapTimeoutByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12ENHTABYPASSCHAPTIMEOUTBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12ENHTABYPASSCHAPTIMEOUTBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12EnhTaBypassChapTimeoutByNode(final BigInteger value) {
    if (value != null) {
        checkA12EnhTaBypassChapTimeoutByNodeRange(value);
    }
        this._a12EnhTaBypassChapTimeoutByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12ENHTABYPASSLCPTIMEOUTBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12ENHTABYPASSLCPTIMEOUTBYNODERANGE_RANGES = a;
     }
     private static void checkA12EnhTaBypassLcpTimeoutByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12ENHTABYPASSLCPTIMEOUTBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12ENHTABYPASSLCPTIMEOUTBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12EnhTaBypassLcpTimeoutByNode(final BigInteger value) {
    if (value != null) {
        checkA12EnhTaBypassLcpTimeoutByNodeRange(value);
    }
        this._a12EnhTaBypassLcpTimeoutByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12MALFORMEDRESPONSERECEIVEDBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12MALFORMEDRESPONSERECEIVEDBYNODERANGE_RANGES = a;
     }
     private static void checkA12MalformedresponseReceivedByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12MALFORMEDRESPONSERECEIVEDBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12MALFORMEDRESPONSERECEIVEDBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12MalformedresponseReceivedByNode(final BigInteger value) {
    if (value != null) {
        checkA12MalformedresponseReceivedByNodeRange(value);
    }
        this._a12MalformedresponseReceivedByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12OTHERFAILUREOCCURENCESINNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12OTHERFAILUREOCCURENCESINNODERANGE_RANGES = a;
     }
     private static void checkA12OtherFailureOccurencesInNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12OTHERFAILUREOCCURENCESINNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12OTHERFAILUREOCCURENCESINNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12OtherFailureOccurencesInNode(final BigInteger value) {
    if (value != null) {
        checkA12OtherFailureOccurencesInNodeRange(value);
    }
        this._a12OtherFailureOccurencesInNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12REJECTSRECEIVEDBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12REJECTSRECEIVEDBYNODERANGE_RANGES = a;
     }
     private static void checkA12RejectsReceivedByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12REJECTSRECEIVEDBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12REJECTSRECEIVEDBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12RejectsReceivedByNode(final BigInteger value) {
    if (value != null) {
        checkA12RejectsReceivedByNodeRange(value);
    }
        this._a12RejectsReceivedByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12REQUESTSSENTFROMNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12REQUESTSSENTFROMNODERANGE_RANGES = a;
     }
     private static void checkA12RequestsSentFromNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12REQUESTSSENTFROMNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12REQUESTSSENTFROMNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12RequestsSentFromNode(final BigInteger value) {
    if (value != null) {
        checkA12RequestsSentFromNodeRange(value);
    }
        this._a12RequestsSentFromNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12RETRANSMITSSENTFROMNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12RETRANSMITSSENTFROMNODERANGE_RANGES = a;
     }
     private static void checkA12RetransmitsSentFromNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12RETRANSMITSSENTFROMNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12RETRANSMITSSENTFROMNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12RetransmitsSentFromNode(final BigInteger value) {
    if (value != null) {
        checkA12RetransmitsSentFromNodeRange(value);
    }
        this._a12RetransmitsSentFromNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12SESSIONTATIMEOUTBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12SESSIONTATIMEOUTBYNODERANGE_RANGES = a;
     }
     private static void checkA12SessionTaTimeoutByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12SESSIONTATIMEOUTBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12SESSIONTATIMEOUTBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12SessionTaTimeoutByNode(final BigInteger value) {
    if (value != null) {
        checkA12SessionTaTimeoutByNodeRange(value);
    }
        this._a12SessionTaTimeoutByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12SVRTIMEOUTSFORNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12SVRTIMEOUTSFORNODERANGE_RANGES = a;
     }
     private static void checkA12SvrTimeoutsForNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12SVRTIMEOUTSFORNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12SVRTIMEOUTSFORNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12SvrTimeoutsForNode(final BigInteger value) {
    if (value != null) {
        checkA12SvrTimeoutsForNodeRange(value);
    }
        this._a12SvrTimeoutsForNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12TIMEOUTSEVENTSFORNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12TIMEOUTSEVENTSFORNODERANGE_RANGES = a;
     }
     private static void checkA12TimeoutsEventsForNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12TIMEOUTSEVENTSFORNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12TIMEOUTSEVENTSFORNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12TimeoutsEventsForNode(final BigInteger value) {
    if (value != null) {
        checkA12TimeoutsEventsForNodeRange(value);
    }
        this._a12TimeoutsEventsForNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12TXPATHFAILDUETOANPPPERRORBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12TXPATHFAILDUETOANPPPERRORBYNODERANGE_RANGES = a;
     }
     private static void checkA12TxPathFailDueToAnPppErrorByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12TXPATHFAILDUETOANPPPERRORBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12TXPATHFAILDUETOANPPPERRORBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12TxPathFailDueToAnPppErrorByNode(final BigInteger value) {
    if (value != null) {
        checkA12TxPathFailDueToAnPppErrorByNodeRange(value);
    }
        this._a12TxPathFailDueToAnPppErrorByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12TXPATHFAILDUETOINTERNALERRORBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12TXPATHFAILDUETOINTERNALERRORBYNODERANGE_RANGES = a;
     }
     private static void checkA12TxPathFailDueToInternalErrorByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12TXPATHFAILDUETOINTERNALERRORBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12TXPATHFAILDUETOINTERNALERRORBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12TxPathFailDueToInternalErrorByNode(final BigInteger value) {
    if (value != null) {
        checkA12TxPathFailDueToInternalErrorByNodeRange(value);
    }
        this._a12TxPathFailDueToInternalErrorByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12TXPATHFAILDUETONOPACKETIDAVAILABLEBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12TXPATHFAILDUETONOPACKETIDAVAILABLEBYNODERANGE_RANGES = a;
     }
     private static void checkA12TxPathFailDueToNoPacketIdAvailableByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12TXPATHFAILDUETONOPACKETIDAVAILABLEBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12TXPATHFAILDUETONOPACKETIDAVAILABLEBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12TxPathFailDueToNoPacketIdAvailableByNode(final BigInteger value) {
    if (value != null) {
        checkA12TxPathFailDueToNoPacketIdAvailableByNodeRange(value);
    }
        this._a12TxPathFailDueToNoPacketIdAvailableByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12TXPATHFAILDUETONOSERVERAVAILABLEBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12TXPATHFAILDUETONOSERVERAVAILABLEBYNODERANGE_RANGES = a;
     }
     private static void checkA12TxPathFailDueToNoServerAvailableByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12TXPATHFAILDUETONOSERVERAVAILABLEBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12TXPATHFAILDUETONOSERVERAVAILABLEBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12TxPathFailDueToNoServerAvailableByNode(final BigInteger value) {
    if (value != null) {
        checkA12TxPathFailDueToNoServerAvailableByNodeRange(value);
    }
        this._a12TxPathFailDueToNoServerAvailableByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12TXPATHFAILDUETOTRANSMITERRORBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12TXPATHFAILDUETOTRANSMITERRORBYNODERANGE_RANGES = a;
     }
     private static void checkA12TxPathFailDueToTransmitErrorByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12TXPATHFAILDUETOTRANSMITERRORBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12TXPATHFAILDUETOTRANSMITERRORBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12TxPathFailDueToTransmitErrorByNode(final BigInteger value) {
    if (value != null) {
        checkA12TxPathFailDueToTransmitErrorByNodeRange(value);
    }
        this._a12TxPathFailDueToTransmitErrorByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12UNKNOWNPKTRECEIVEDBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12UNKNOWNPKTRECEIVEDBYNODERANGE_RANGES = a;
     }
     private static void checkA12UnknownPktReceivedByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12UNKNOWNPKTRECEIVEDBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12UNKNOWNPKTRECEIVEDBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12UnknownPktReceivedByNode(final BigInteger value) {
    if (value != null) {
        checkA12UnknownPktReceivedByNodeRange(value);
    }
        this._a12UnknownPktReceivedByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12UNKNOWNSERVERRECEIVEDBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12UNKNOWNSERVERRECEIVEDBYNODERANGE_RANGES = a;
     }
     private static void checkA12UnknownServerReceivedByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12UNKNOWNSERVERRECEIVEDBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12UNKNOWNSERVERRECEIVEDBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12UnknownServerReceivedByNode(final BigInteger value) {
    if (value != null) {
        checkA12UnknownServerReceivedByNodeRange(value);
    }
        this._a12UnknownServerReceivedByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA12UNKNOWNTYPERECEIVEDBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA12UNKNOWNTYPERECEIVEDBYNODERANGE_RANGES = a;
     }
     private static void checkA12UnknownTypeReceivedByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA12UNKNOWNTYPERECEIVEDBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA12UNKNOWNTYPERECEIVEDBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setA12UnknownTypeReceivedByNode(final BigInteger value) {
    if (value != null) {
        checkA12UnknownTypeReceivedByNodeRange(value);
    }
        this._a12UnknownTypeReceivedByNode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKACCESSAUTHFAILEDDUETOSESSIONCLOSETOTALRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKACCESSAUTHFAILEDDUETOSESSIONCLOSETOTALRANGE_RANGES = a;
     }
     private static void checkAccessAuthFailedDueToSessionCloseTotalRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKACCESSAUTHFAILEDDUETOSESSIONCLOSETOTALRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKACCESSAUTHFAILEDDUETOSESSIONCLOSETOTALRANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setAccessAuthFailedDueToSessionCloseTotal(final BigInteger value) {
    if (value != null) {
        checkAccessAuthFailedDueToSessionCloseTotalRange(value);
    }
        this._accessAuthFailedDueToSessionCloseTotal = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKACCESSAUTHSUCCEEDEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKACCESSAUTHSUCCEEDEDRANGE_RANGES = a;
     }
     private static void checkAccessAuthSucceededRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKACCESSAUTHSUCCEEDEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKACCESSAUTHSUCCEEDEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setAccessAuthSucceeded(final BigInteger value) {
    if (value != null) {
        checkAccessAuthSucceededRange(value);
    }
        this._accessAuthSucceeded = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKANPPPAUTHENTICATIONATTEMPTSBYNODERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKANPPPAUTHENTICATIONATTEMPTSBYNODERANGE_RANGES = a;
     }
     private static void checkAnPppAuthenticationAttemptsByNodeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKANPPPAUTHENTICATIONATTEMPTSBYNODERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKANPPPAUTHENTICATIONATTEMPTSBYNODERANGE_RANGES)));
     }
    
    public Cdma2000HrpdAccessAuthStatsBuilder setAnPppAuthenticationAttemptsByNode(final BigInteger value) {
    if (value != null) {
        checkAnPppAuthenticationAttemptsByNodeRange(value);
    }
        this._anPppAuthenticationAttemptsByNode = value;
        return this;
    }
    
    public Cdma2000HrpdAccessAuthStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdAccessAuthStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdAccessAuthStats build() {
        return new Cdma2000HrpdAccessAuthStatsImpl(this);
    }

    private static final class Cdma2000HrpdAccessAuthStatsImpl implements Cdma2000HrpdAccessAuthStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats.class;
        }

        private final BigInteger _a12AcceptsReceivedByNode;
        private final BigInteger _a12AccessChallengesReceivedByNode;
        private final BigInteger _a12BadAuthenticatorReceivedByNode;
        private final BigInteger _a12ByPassNumAtsWithUnknownMfrCodeByNode;
        private final BigInteger _a12EnhTaBypassChapInvalidByNode;
        private final BigInteger _a12EnhTaBypassChapNaiMatchesA12BypassListByNode;
        private final BigInteger _a12EnhTaBypassChapTimeoutByNode;
        private final BigInteger _a12EnhTaBypassLcpTimeoutByNode;
        private final BigInteger _a12MalformedresponseReceivedByNode;
        private final BigInteger _a12OtherFailureOccurencesInNode;
        private final BigInteger _a12RejectsReceivedByNode;
        private final BigInteger _a12RequestsSentFromNode;
        private final BigInteger _a12RetransmitsSentFromNode;
        private final BigInteger _a12SessionTaTimeoutByNode;
        private final BigInteger _a12SvrTimeoutsForNode;
        private final BigInteger _a12TimeoutsEventsForNode;
        private final BigInteger _a12TxPathFailDueToAnPppErrorByNode;
        private final BigInteger _a12TxPathFailDueToInternalErrorByNode;
        private final BigInteger _a12TxPathFailDueToNoPacketIdAvailableByNode;
        private final BigInteger _a12TxPathFailDueToNoServerAvailableByNode;
        private final BigInteger _a12TxPathFailDueToTransmitErrorByNode;
        private final BigInteger _a12UnknownPktReceivedByNode;
        private final BigInteger _a12UnknownServerReceivedByNode;
        private final BigInteger _a12UnknownTypeReceivedByNode;
        private final BigInteger _accessAuthFailedDueToSessionCloseTotal;
        private final BigInteger _accessAuthSucceeded;
        private final BigInteger _anPppAuthenticationAttemptsByNode;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdAccessAuthStatsImpl(Cdma2000HrpdAccessAuthStatsBuilder base) {
            this._a12AcceptsReceivedByNode = base.getA12AcceptsReceivedByNode();
            this._a12AccessChallengesReceivedByNode = base.getA12AccessChallengesReceivedByNode();
            this._a12BadAuthenticatorReceivedByNode = base.getA12BadAuthenticatorReceivedByNode();
            this._a12ByPassNumAtsWithUnknownMfrCodeByNode = base.getA12ByPassNumAtsWithUnknownMfrCodeByNode();
            this._a12EnhTaBypassChapInvalidByNode = base.getA12EnhTaBypassChapInvalidByNode();
            this._a12EnhTaBypassChapNaiMatchesA12BypassListByNode = base.getA12EnhTaBypassChapNaiMatchesA12BypassListByNode();
            this._a12EnhTaBypassChapTimeoutByNode = base.getA12EnhTaBypassChapTimeoutByNode();
            this._a12EnhTaBypassLcpTimeoutByNode = base.getA12EnhTaBypassLcpTimeoutByNode();
            this._a12MalformedresponseReceivedByNode = base.getA12MalformedresponseReceivedByNode();
            this._a12OtherFailureOccurencesInNode = base.getA12OtherFailureOccurencesInNode();
            this._a12RejectsReceivedByNode = base.getA12RejectsReceivedByNode();
            this._a12RequestsSentFromNode = base.getA12RequestsSentFromNode();
            this._a12RetransmitsSentFromNode = base.getA12RetransmitsSentFromNode();
            this._a12SessionTaTimeoutByNode = base.getA12SessionTaTimeoutByNode();
            this._a12SvrTimeoutsForNode = base.getA12SvrTimeoutsForNode();
            this._a12TimeoutsEventsForNode = base.getA12TimeoutsEventsForNode();
            this._a12TxPathFailDueToAnPppErrorByNode = base.getA12TxPathFailDueToAnPppErrorByNode();
            this._a12TxPathFailDueToInternalErrorByNode = base.getA12TxPathFailDueToInternalErrorByNode();
            this._a12TxPathFailDueToNoPacketIdAvailableByNode = base.getA12TxPathFailDueToNoPacketIdAvailableByNode();
            this._a12TxPathFailDueToNoServerAvailableByNode = base.getA12TxPathFailDueToNoServerAvailableByNode();
            this._a12TxPathFailDueToTransmitErrorByNode = base.getA12TxPathFailDueToTransmitErrorByNode();
            this._a12UnknownPktReceivedByNode = base.getA12UnknownPktReceivedByNode();
            this._a12UnknownServerReceivedByNode = base.getA12UnknownServerReceivedByNode();
            this._a12UnknownTypeReceivedByNode = base.getA12UnknownTypeReceivedByNode();
            this._accessAuthFailedDueToSessionCloseTotal = base.getAccessAuthFailedDueToSessionCloseTotal();
            this._accessAuthSucceeded = base.getAccessAuthSucceeded();
            this._anPppAuthenticationAttemptsByNode = base.getAnPppAuthenticationAttemptsByNode();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getA12AcceptsReceivedByNode() {
            return _a12AcceptsReceivedByNode;
        }
        
        @Override
        public BigInteger getA12AccessChallengesReceivedByNode() {
            return _a12AccessChallengesReceivedByNode;
        }
        
        @Override
        public BigInteger getA12BadAuthenticatorReceivedByNode() {
            return _a12BadAuthenticatorReceivedByNode;
        }
        
        @Override
        public BigInteger getA12ByPassNumAtsWithUnknownMfrCodeByNode() {
            return _a12ByPassNumAtsWithUnknownMfrCodeByNode;
        }
        
        @Override
        public BigInteger getA12EnhTaBypassChapInvalidByNode() {
            return _a12EnhTaBypassChapInvalidByNode;
        }
        
        @Override
        public BigInteger getA12EnhTaBypassChapNaiMatchesA12BypassListByNode() {
            return _a12EnhTaBypassChapNaiMatchesA12BypassListByNode;
        }
        
        @Override
        public BigInteger getA12EnhTaBypassChapTimeoutByNode() {
            return _a12EnhTaBypassChapTimeoutByNode;
        }
        
        @Override
        public BigInteger getA12EnhTaBypassLcpTimeoutByNode() {
            return _a12EnhTaBypassLcpTimeoutByNode;
        }
        
        @Override
        public BigInteger getA12MalformedresponseReceivedByNode() {
            return _a12MalformedresponseReceivedByNode;
        }
        
        @Override
        public BigInteger getA12OtherFailureOccurencesInNode() {
            return _a12OtherFailureOccurencesInNode;
        }
        
        @Override
        public BigInteger getA12RejectsReceivedByNode() {
            return _a12RejectsReceivedByNode;
        }
        
        @Override
        public BigInteger getA12RequestsSentFromNode() {
            return _a12RequestsSentFromNode;
        }
        
        @Override
        public BigInteger getA12RetransmitsSentFromNode() {
            return _a12RetransmitsSentFromNode;
        }
        
        @Override
        public BigInteger getA12SessionTaTimeoutByNode() {
            return _a12SessionTaTimeoutByNode;
        }
        
        @Override
        public BigInteger getA12SvrTimeoutsForNode() {
            return _a12SvrTimeoutsForNode;
        }
        
        @Override
        public BigInteger getA12TimeoutsEventsForNode() {
            return _a12TimeoutsEventsForNode;
        }
        
        @Override
        public BigInteger getA12TxPathFailDueToAnPppErrorByNode() {
            return _a12TxPathFailDueToAnPppErrorByNode;
        }
        
        @Override
        public BigInteger getA12TxPathFailDueToInternalErrorByNode() {
            return _a12TxPathFailDueToInternalErrorByNode;
        }
        
        @Override
        public BigInteger getA12TxPathFailDueToNoPacketIdAvailableByNode() {
            return _a12TxPathFailDueToNoPacketIdAvailableByNode;
        }
        
        @Override
        public BigInteger getA12TxPathFailDueToNoServerAvailableByNode() {
            return _a12TxPathFailDueToNoServerAvailableByNode;
        }
        
        @Override
        public BigInteger getA12TxPathFailDueToTransmitErrorByNode() {
            return _a12TxPathFailDueToTransmitErrorByNode;
        }
        
        @Override
        public BigInteger getA12UnknownPktReceivedByNode() {
            return _a12UnknownPktReceivedByNode;
        }
        
        @Override
        public BigInteger getA12UnknownServerReceivedByNode() {
            return _a12UnknownServerReceivedByNode;
        }
        
        @Override
        public BigInteger getA12UnknownTypeReceivedByNode() {
            return _a12UnknownTypeReceivedByNode;
        }
        
        @Override
        public BigInteger getAccessAuthFailedDueToSessionCloseTotal() {
            return _accessAuthFailedDueToSessionCloseTotal;
        }
        
        @Override
        public BigInteger getAccessAuthSucceeded() {
            return _accessAuthSucceeded;
        }
        
        @Override
        public BigInteger getAnPppAuthenticationAttemptsByNode() {
            return _anPppAuthenticationAttemptsByNode;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_a12AcceptsReceivedByNode);
            result = prime * result + Objects.hashCode(_a12AccessChallengesReceivedByNode);
            result = prime * result + Objects.hashCode(_a12BadAuthenticatorReceivedByNode);
            result = prime * result + Objects.hashCode(_a12ByPassNumAtsWithUnknownMfrCodeByNode);
            result = prime * result + Objects.hashCode(_a12EnhTaBypassChapInvalidByNode);
            result = prime * result + Objects.hashCode(_a12EnhTaBypassChapNaiMatchesA12BypassListByNode);
            result = prime * result + Objects.hashCode(_a12EnhTaBypassChapTimeoutByNode);
            result = prime * result + Objects.hashCode(_a12EnhTaBypassLcpTimeoutByNode);
            result = prime * result + Objects.hashCode(_a12MalformedresponseReceivedByNode);
            result = prime * result + Objects.hashCode(_a12OtherFailureOccurencesInNode);
            result = prime * result + Objects.hashCode(_a12RejectsReceivedByNode);
            result = prime * result + Objects.hashCode(_a12RequestsSentFromNode);
            result = prime * result + Objects.hashCode(_a12RetransmitsSentFromNode);
            result = prime * result + Objects.hashCode(_a12SessionTaTimeoutByNode);
            result = prime * result + Objects.hashCode(_a12SvrTimeoutsForNode);
            result = prime * result + Objects.hashCode(_a12TimeoutsEventsForNode);
            result = prime * result + Objects.hashCode(_a12TxPathFailDueToAnPppErrorByNode);
            result = prime * result + Objects.hashCode(_a12TxPathFailDueToInternalErrorByNode);
            result = prime * result + Objects.hashCode(_a12TxPathFailDueToNoPacketIdAvailableByNode);
            result = prime * result + Objects.hashCode(_a12TxPathFailDueToNoServerAvailableByNode);
            result = prime * result + Objects.hashCode(_a12TxPathFailDueToTransmitErrorByNode);
            result = prime * result + Objects.hashCode(_a12UnknownPktReceivedByNode);
            result = prime * result + Objects.hashCode(_a12UnknownServerReceivedByNode);
            result = prime * result + Objects.hashCode(_a12UnknownTypeReceivedByNode);
            result = prime * result + Objects.hashCode(_accessAuthFailedDueToSessionCloseTotal);
            result = prime * result + Objects.hashCode(_accessAuthSucceeded);
            result = prime * result + Objects.hashCode(_anPppAuthenticationAttemptsByNode);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats)obj;
            if (!Objects.equals(_a12AcceptsReceivedByNode, other.getA12AcceptsReceivedByNode())) {
                return false;
            }
            if (!Objects.equals(_a12AccessChallengesReceivedByNode, other.getA12AccessChallengesReceivedByNode())) {
                return false;
            }
            if (!Objects.equals(_a12BadAuthenticatorReceivedByNode, other.getA12BadAuthenticatorReceivedByNode())) {
                return false;
            }
            if (!Objects.equals(_a12ByPassNumAtsWithUnknownMfrCodeByNode, other.getA12ByPassNumAtsWithUnknownMfrCodeByNode())) {
                return false;
            }
            if (!Objects.equals(_a12EnhTaBypassChapInvalidByNode, other.getA12EnhTaBypassChapInvalidByNode())) {
                return false;
            }
            if (!Objects.equals(_a12EnhTaBypassChapNaiMatchesA12BypassListByNode, other.getA12EnhTaBypassChapNaiMatchesA12BypassListByNode())) {
                return false;
            }
            if (!Objects.equals(_a12EnhTaBypassChapTimeoutByNode, other.getA12EnhTaBypassChapTimeoutByNode())) {
                return false;
            }
            if (!Objects.equals(_a12EnhTaBypassLcpTimeoutByNode, other.getA12EnhTaBypassLcpTimeoutByNode())) {
                return false;
            }
            if (!Objects.equals(_a12MalformedresponseReceivedByNode, other.getA12MalformedresponseReceivedByNode())) {
                return false;
            }
            if (!Objects.equals(_a12OtherFailureOccurencesInNode, other.getA12OtherFailureOccurencesInNode())) {
                return false;
            }
            if (!Objects.equals(_a12RejectsReceivedByNode, other.getA12RejectsReceivedByNode())) {
                return false;
            }
            if (!Objects.equals(_a12RequestsSentFromNode, other.getA12RequestsSentFromNode())) {
                return false;
            }
            if (!Objects.equals(_a12RetransmitsSentFromNode, other.getA12RetransmitsSentFromNode())) {
                return false;
            }
            if (!Objects.equals(_a12SessionTaTimeoutByNode, other.getA12SessionTaTimeoutByNode())) {
                return false;
            }
            if (!Objects.equals(_a12SvrTimeoutsForNode, other.getA12SvrTimeoutsForNode())) {
                return false;
            }
            if (!Objects.equals(_a12TimeoutsEventsForNode, other.getA12TimeoutsEventsForNode())) {
                return false;
            }
            if (!Objects.equals(_a12TxPathFailDueToAnPppErrorByNode, other.getA12TxPathFailDueToAnPppErrorByNode())) {
                return false;
            }
            if (!Objects.equals(_a12TxPathFailDueToInternalErrorByNode, other.getA12TxPathFailDueToInternalErrorByNode())) {
                return false;
            }
            if (!Objects.equals(_a12TxPathFailDueToNoPacketIdAvailableByNode, other.getA12TxPathFailDueToNoPacketIdAvailableByNode())) {
                return false;
            }
            if (!Objects.equals(_a12TxPathFailDueToNoServerAvailableByNode, other.getA12TxPathFailDueToNoServerAvailableByNode())) {
                return false;
            }
            if (!Objects.equals(_a12TxPathFailDueToTransmitErrorByNode, other.getA12TxPathFailDueToTransmitErrorByNode())) {
                return false;
            }
            if (!Objects.equals(_a12UnknownPktReceivedByNode, other.getA12UnknownPktReceivedByNode())) {
                return false;
            }
            if (!Objects.equals(_a12UnknownServerReceivedByNode, other.getA12UnknownServerReceivedByNode())) {
                return false;
            }
            if (!Objects.equals(_a12UnknownTypeReceivedByNode, other.getA12UnknownTypeReceivedByNode())) {
                return false;
            }
            if (!Objects.equals(_accessAuthFailedDueToSessionCloseTotal, other.getAccessAuthFailedDueToSessionCloseTotal())) {
                return false;
            }
            if (!Objects.equals(_accessAuthSucceeded, other.getAccessAuthSucceeded())) {
                return false;
            }
            if (!Objects.equals(_anPppAuthenticationAttemptsByNode, other.getAnPppAuthenticationAttemptsByNode())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdAccessAuthStatsImpl otherImpl = (Cdma2000HrpdAccessAuthStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdAccessAuthStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_a12AcceptsReceivedByNode != null) {
                builder.append("_a12AcceptsReceivedByNode=");
                builder.append(_a12AcceptsReceivedByNode);
                builder.append(", ");
            }
            if (_a12AccessChallengesReceivedByNode != null) {
                builder.append("_a12AccessChallengesReceivedByNode=");
                builder.append(_a12AccessChallengesReceivedByNode);
                builder.append(", ");
            }
            if (_a12BadAuthenticatorReceivedByNode != null) {
                builder.append("_a12BadAuthenticatorReceivedByNode=");
                builder.append(_a12BadAuthenticatorReceivedByNode);
                builder.append(", ");
            }
            if (_a12ByPassNumAtsWithUnknownMfrCodeByNode != null) {
                builder.append("_a12ByPassNumAtsWithUnknownMfrCodeByNode=");
                builder.append(_a12ByPassNumAtsWithUnknownMfrCodeByNode);
                builder.append(", ");
            }
            if (_a12EnhTaBypassChapInvalidByNode != null) {
                builder.append("_a12EnhTaBypassChapInvalidByNode=");
                builder.append(_a12EnhTaBypassChapInvalidByNode);
                builder.append(", ");
            }
            if (_a12EnhTaBypassChapNaiMatchesA12BypassListByNode != null) {
                builder.append("_a12EnhTaBypassChapNaiMatchesA12BypassListByNode=");
                builder.append(_a12EnhTaBypassChapNaiMatchesA12BypassListByNode);
                builder.append(", ");
            }
            if (_a12EnhTaBypassChapTimeoutByNode != null) {
                builder.append("_a12EnhTaBypassChapTimeoutByNode=");
                builder.append(_a12EnhTaBypassChapTimeoutByNode);
                builder.append(", ");
            }
            if (_a12EnhTaBypassLcpTimeoutByNode != null) {
                builder.append("_a12EnhTaBypassLcpTimeoutByNode=");
                builder.append(_a12EnhTaBypassLcpTimeoutByNode);
                builder.append(", ");
            }
            if (_a12MalformedresponseReceivedByNode != null) {
                builder.append("_a12MalformedresponseReceivedByNode=");
                builder.append(_a12MalformedresponseReceivedByNode);
                builder.append(", ");
            }
            if (_a12OtherFailureOccurencesInNode != null) {
                builder.append("_a12OtherFailureOccurencesInNode=");
                builder.append(_a12OtherFailureOccurencesInNode);
                builder.append(", ");
            }
            if (_a12RejectsReceivedByNode != null) {
                builder.append("_a12RejectsReceivedByNode=");
                builder.append(_a12RejectsReceivedByNode);
                builder.append(", ");
            }
            if (_a12RequestsSentFromNode != null) {
                builder.append("_a12RequestsSentFromNode=");
                builder.append(_a12RequestsSentFromNode);
                builder.append(", ");
            }
            if (_a12RetransmitsSentFromNode != null) {
                builder.append("_a12RetransmitsSentFromNode=");
                builder.append(_a12RetransmitsSentFromNode);
                builder.append(", ");
            }
            if (_a12SessionTaTimeoutByNode != null) {
                builder.append("_a12SessionTaTimeoutByNode=");
                builder.append(_a12SessionTaTimeoutByNode);
                builder.append(", ");
            }
            if (_a12SvrTimeoutsForNode != null) {
                builder.append("_a12SvrTimeoutsForNode=");
                builder.append(_a12SvrTimeoutsForNode);
                builder.append(", ");
            }
            if (_a12TimeoutsEventsForNode != null) {
                builder.append("_a12TimeoutsEventsForNode=");
                builder.append(_a12TimeoutsEventsForNode);
                builder.append(", ");
            }
            if (_a12TxPathFailDueToAnPppErrorByNode != null) {
                builder.append("_a12TxPathFailDueToAnPppErrorByNode=");
                builder.append(_a12TxPathFailDueToAnPppErrorByNode);
                builder.append(", ");
            }
            if (_a12TxPathFailDueToInternalErrorByNode != null) {
                builder.append("_a12TxPathFailDueToInternalErrorByNode=");
                builder.append(_a12TxPathFailDueToInternalErrorByNode);
                builder.append(", ");
            }
            if (_a12TxPathFailDueToNoPacketIdAvailableByNode != null) {
                builder.append("_a12TxPathFailDueToNoPacketIdAvailableByNode=");
                builder.append(_a12TxPathFailDueToNoPacketIdAvailableByNode);
                builder.append(", ");
            }
            if (_a12TxPathFailDueToNoServerAvailableByNode != null) {
                builder.append("_a12TxPathFailDueToNoServerAvailableByNode=");
                builder.append(_a12TxPathFailDueToNoServerAvailableByNode);
                builder.append(", ");
            }
            if (_a12TxPathFailDueToTransmitErrorByNode != null) {
                builder.append("_a12TxPathFailDueToTransmitErrorByNode=");
                builder.append(_a12TxPathFailDueToTransmitErrorByNode);
                builder.append(", ");
            }
            if (_a12UnknownPktReceivedByNode != null) {
                builder.append("_a12UnknownPktReceivedByNode=");
                builder.append(_a12UnknownPktReceivedByNode);
                builder.append(", ");
            }
            if (_a12UnknownServerReceivedByNode != null) {
                builder.append("_a12UnknownServerReceivedByNode=");
                builder.append(_a12UnknownServerReceivedByNode);
                builder.append(", ");
            }
            if (_a12UnknownTypeReceivedByNode != null) {
                builder.append("_a12UnknownTypeReceivedByNode=");
                builder.append(_a12UnknownTypeReceivedByNode);
                builder.append(", ");
            }
            if (_accessAuthFailedDueToSessionCloseTotal != null) {
                builder.append("_accessAuthFailedDueToSessionCloseTotal=");
                builder.append(_accessAuthFailedDueToSessionCloseTotal);
                builder.append(", ");
            }
            if (_accessAuthSucceeded != null) {
                builder.append("_accessAuthSucceeded=");
                builder.append(_accessAuthSucceeded);
                builder.append(", ");
            }
            if (_anPppAuthenticationAttemptsByNode != null) {
                builder.append("_anPppAuthenticationAttemptsByNode=");
                builder.append(_anPppAuthenticationAttemptsByNode);
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
