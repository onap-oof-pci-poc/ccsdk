package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats
 *
 */
public class Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats> {

    private BigInteger _a10RegReqForReRegistrationRetransmissionsPdsn;
    private BigInteger _a10RegReqForRegistrationRetransmissionsPdsn;
    private BigInteger _a10RegReqForReleaseRetransmissionsPdsn;
    private BigInteger _a10SetupAttemptsPdsn;
    private BigInteger _a10SetupBlocksPdsn;
    private BigInteger _a10SetupSuccessesPdsn;
    private BigInteger _a11RegReqDeniedAdminProhibitPdsn;
    private BigInteger _a11RegReqDeniedFailedAuthPdsn;
    private BigInteger _a11RegReqDeniedIdMismatchPdsn;
    private BigInteger _a11RegReqDeniedInsuffResourcesPdsn;
    private BigInteger _a11RegReqDeniedMalformedReqPdsn;
    private BigInteger _a11RegReqDeniedNoReasonPdsn;
    private BigInteger _a11RegReqDeniedReverseTunnelTbitNotSetPdsn;
    private BigInteger _a11RegReqDeniedReverseTunnelUnavailablePdsn;
    private BigInteger _a11RegReqDeniedUnknownErrorCodePdsn;
    private BigInteger _a11RegReqDeniedUnknownPdsnpdsn;
    private BigInteger _a11RegReqDeniedUnsuppVendIdPdsn;
    private IpAddress _pdsNipAddressPdsnPerf;
    private java.lang.Long _pdsnNumberPdsnPerf;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder() {
    }
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG arg) {
        this._a10SetupAttemptsPdsn = arg.getA10SetupAttemptsPdsn();
        this._a10SetupSuccessesPdsn = arg.getA10SetupSuccessesPdsn();
        this._a10SetupBlocksPdsn = arg.getA10SetupBlocksPdsn();
        this._a11RegReqDeniedIdMismatchPdsn = arg.getA11RegReqDeniedIdMismatchPdsn();
        this._a11RegReqDeniedUnknownPdsnpdsn = arg.getA11RegReqDeniedUnknownPdsnpdsn();
        this._a11RegReqDeniedNoReasonPdsn = arg.getA11RegReqDeniedNoReasonPdsn();
        this._a11RegReqDeniedAdminProhibitPdsn = arg.getA11RegReqDeniedAdminProhibitPdsn();
        this._a11RegReqDeniedInsuffResourcesPdsn = arg.getA11RegReqDeniedInsuffResourcesPdsn();
        this._a11RegReqDeniedFailedAuthPdsn = arg.getA11RegReqDeniedFailedAuthPdsn();
        this._a11RegReqDeniedMalformedReqPdsn = arg.getA11RegReqDeniedMalformedReqPdsn();
        this._a11RegReqDeniedUnsuppVendIdPdsn = arg.getA11RegReqDeniedUnsuppVendIdPdsn();
        this._a11RegReqDeniedReverseTunnelUnavailablePdsn = arg.getA11RegReqDeniedReverseTunnelUnavailablePdsn();
        this._a11RegReqDeniedReverseTunnelTbitNotSetPdsn = arg.getA11RegReqDeniedReverseTunnelTbitNotSetPdsn();
        this._a11RegReqDeniedUnknownErrorCodePdsn = arg.getA11RegReqDeniedUnknownErrorCodePdsn();
        this._a10RegReqForRegistrationRetransmissionsPdsn = arg.getA10RegReqForRegistrationRetransmissionsPdsn();
        this._a10RegReqForReRegistrationRetransmissionsPdsn = arg.getA10RegReqForReRegistrationRetransmissionsPdsn();
        this._a10RegReqForReleaseRetransmissionsPdsn = arg.getA10RegReqForReleaseRetransmissionsPdsn();
        this._pdsnNumberPdsnPerf = arg.getPdsnNumberPdsnPerf();
        this._pdsNipAddressPdsnPerf = arg.getPdsNipAddressPdsnPerf();
    }

    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder(Cdma2000HrpdPcfpdsnPcfpdsnStats base) {
        this._a10RegReqForReRegistrationRetransmissionsPdsn = base.getA10RegReqForReRegistrationRetransmissionsPdsn();
        this._a10RegReqForRegistrationRetransmissionsPdsn = base.getA10RegReqForRegistrationRetransmissionsPdsn();
        this._a10RegReqForReleaseRetransmissionsPdsn = base.getA10RegReqForReleaseRetransmissionsPdsn();
        this._a10SetupAttemptsPdsn = base.getA10SetupAttemptsPdsn();
        this._a10SetupBlocksPdsn = base.getA10SetupBlocksPdsn();
        this._a10SetupSuccessesPdsn = base.getA10SetupSuccessesPdsn();
        this._a11RegReqDeniedAdminProhibitPdsn = base.getA11RegReqDeniedAdminProhibitPdsn();
        this._a11RegReqDeniedFailedAuthPdsn = base.getA11RegReqDeniedFailedAuthPdsn();
        this._a11RegReqDeniedIdMismatchPdsn = base.getA11RegReqDeniedIdMismatchPdsn();
        this._a11RegReqDeniedInsuffResourcesPdsn = base.getA11RegReqDeniedInsuffResourcesPdsn();
        this._a11RegReqDeniedMalformedReqPdsn = base.getA11RegReqDeniedMalformedReqPdsn();
        this._a11RegReqDeniedNoReasonPdsn = base.getA11RegReqDeniedNoReasonPdsn();
        this._a11RegReqDeniedReverseTunnelTbitNotSetPdsn = base.getA11RegReqDeniedReverseTunnelTbitNotSetPdsn();
        this._a11RegReqDeniedReverseTunnelUnavailablePdsn = base.getA11RegReqDeniedReverseTunnelUnavailablePdsn();
        this._a11RegReqDeniedUnknownErrorCodePdsn = base.getA11RegReqDeniedUnknownErrorCodePdsn();
        this._a11RegReqDeniedUnknownPdsnpdsn = base.getA11RegReqDeniedUnknownPdsnpdsn();
        this._a11RegReqDeniedUnsuppVendIdPdsn = base.getA11RegReqDeniedUnsuppVendIdPdsn();
        this._pdsNipAddressPdsnPerf = base.getPdsNipAddressPdsnPerf();
        this._pdsnNumberPdsnPerf = base.getPdsnNumberPdsnPerf();
        if (base instanceof Cdma2000HrpdPcfpdsnPcfpdsnStatsImpl) {
            Cdma2000HrpdPcfpdsnPcfpdsnStatsImpl impl = (Cdma2000HrpdPcfpdsnPcfpdsnStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG) {
            this._a10SetupAttemptsPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA10SetupAttemptsPdsn();
            this._a10SetupSuccessesPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA10SetupSuccessesPdsn();
            this._a10SetupBlocksPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA10SetupBlocksPdsn();
            this._a11RegReqDeniedIdMismatchPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedIdMismatchPdsn();
            this._a11RegReqDeniedUnknownPdsnpdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedUnknownPdsnpdsn();
            this._a11RegReqDeniedNoReasonPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedNoReasonPdsn();
            this._a11RegReqDeniedAdminProhibitPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedAdminProhibitPdsn();
            this._a11RegReqDeniedInsuffResourcesPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedInsuffResourcesPdsn();
            this._a11RegReqDeniedFailedAuthPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedFailedAuthPdsn();
            this._a11RegReqDeniedMalformedReqPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedMalformedReqPdsn();
            this._a11RegReqDeniedUnsuppVendIdPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedUnsuppVendIdPdsn();
            this._a11RegReqDeniedReverseTunnelUnavailablePdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedReverseTunnelUnavailablePdsn();
            this._a11RegReqDeniedReverseTunnelTbitNotSetPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedReverseTunnelTbitNotSetPdsn();
            this._a11RegReqDeniedUnknownErrorCodePdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA11RegReqDeniedUnknownErrorCodePdsn();
            this._a10RegReqForRegistrationRetransmissionsPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA10RegReqForRegistrationRetransmissionsPdsn();
            this._a10RegReqForReRegistrationRetransmissionsPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA10RegReqForReRegistrationRetransmissionsPdsn();
            this._a10RegReqForReleaseRetransmissionsPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getA10RegReqForReleaseRetransmissionsPdsn();
            this._pdsnNumberPdsnPerf = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getPdsnNumberPdsnPerf();
            this._pdsNipAddressPdsnPerf = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG)arg).getPdsNipAddressPdsnPerf();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getA10RegReqForReRegistrationRetransmissionsPdsn() {
        return _a10RegReqForReRegistrationRetransmissionsPdsn;
    }
    
    public BigInteger getA10RegReqForRegistrationRetransmissionsPdsn() {
        return _a10RegReqForRegistrationRetransmissionsPdsn;
    }
    
    public BigInteger getA10RegReqForReleaseRetransmissionsPdsn() {
        return _a10RegReqForReleaseRetransmissionsPdsn;
    }
    
    public BigInteger getA10SetupAttemptsPdsn() {
        return _a10SetupAttemptsPdsn;
    }
    
    public BigInteger getA10SetupBlocksPdsn() {
        return _a10SetupBlocksPdsn;
    }
    
    public BigInteger getA10SetupSuccessesPdsn() {
        return _a10SetupSuccessesPdsn;
    }
    
    public BigInteger getA11RegReqDeniedAdminProhibitPdsn() {
        return _a11RegReqDeniedAdminProhibitPdsn;
    }
    
    public BigInteger getA11RegReqDeniedFailedAuthPdsn() {
        return _a11RegReqDeniedFailedAuthPdsn;
    }
    
    public BigInteger getA11RegReqDeniedIdMismatchPdsn() {
        return _a11RegReqDeniedIdMismatchPdsn;
    }
    
    public BigInteger getA11RegReqDeniedInsuffResourcesPdsn() {
        return _a11RegReqDeniedInsuffResourcesPdsn;
    }
    
    public BigInteger getA11RegReqDeniedMalformedReqPdsn() {
        return _a11RegReqDeniedMalformedReqPdsn;
    }
    
    public BigInteger getA11RegReqDeniedNoReasonPdsn() {
        return _a11RegReqDeniedNoReasonPdsn;
    }
    
    public BigInteger getA11RegReqDeniedReverseTunnelTbitNotSetPdsn() {
        return _a11RegReqDeniedReverseTunnelTbitNotSetPdsn;
    }
    
    public BigInteger getA11RegReqDeniedReverseTunnelUnavailablePdsn() {
        return _a11RegReqDeniedReverseTunnelUnavailablePdsn;
    }
    
    public BigInteger getA11RegReqDeniedUnknownErrorCodePdsn() {
        return _a11RegReqDeniedUnknownErrorCodePdsn;
    }
    
    public BigInteger getA11RegReqDeniedUnknownPdsnpdsn() {
        return _a11RegReqDeniedUnknownPdsnpdsn;
    }
    
    public BigInteger getA11RegReqDeniedUnsuppVendIdPdsn() {
        return _a11RegReqDeniedUnsuppVendIdPdsn;
    }
    
    public IpAddress getPdsNipAddressPdsnPerf() {
        return _pdsNipAddressPdsnPerf;
    }
    
    public java.lang.Long getPdsnNumberPdsnPerf() {
        return _pdsnNumberPdsnPerf;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10REGREQFORREREGISTRATIONRETRANSMISSIONSPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10REGREQFORREREGISTRATIONRETRANSMISSIONSPDSNRANGE_RANGES = a;
     }
     private static void checkA10RegReqForReRegistrationRetransmissionsPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10REGREQFORREREGISTRATIONRETRANSMISSIONSPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10REGREQFORREREGISTRATIONRETRANSMISSIONSPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA10RegReqForReRegistrationRetransmissionsPdsn(final BigInteger value) {
    if (value != null) {
        checkA10RegReqForReRegistrationRetransmissionsPdsnRange(value);
    }
        this._a10RegReqForReRegistrationRetransmissionsPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10REGREQFORREGISTRATIONRETRANSMISSIONSPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10REGREQFORREGISTRATIONRETRANSMISSIONSPDSNRANGE_RANGES = a;
     }
     private static void checkA10RegReqForRegistrationRetransmissionsPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10REGREQFORREGISTRATIONRETRANSMISSIONSPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10REGREQFORREGISTRATIONRETRANSMISSIONSPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA10RegReqForRegistrationRetransmissionsPdsn(final BigInteger value) {
    if (value != null) {
        checkA10RegReqForRegistrationRetransmissionsPdsnRange(value);
    }
        this._a10RegReqForRegistrationRetransmissionsPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10REGREQFORRELEASERETRANSMISSIONSPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10REGREQFORRELEASERETRANSMISSIONSPDSNRANGE_RANGES = a;
     }
     private static void checkA10RegReqForReleaseRetransmissionsPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10REGREQFORRELEASERETRANSMISSIONSPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10REGREQFORRELEASERETRANSMISSIONSPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA10RegReqForReleaseRetransmissionsPdsn(final BigInteger value) {
    if (value != null) {
        checkA10RegReqForReleaseRetransmissionsPdsnRange(value);
    }
        this._a10RegReqForReleaseRetransmissionsPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPATTEMPTSPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPATTEMPTSPDSNRANGE_RANGES = a;
     }
     private static void checkA10SetupAttemptsPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPATTEMPTSPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPATTEMPTSPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA10SetupAttemptsPdsn(final BigInteger value) {
    if (value != null) {
        checkA10SetupAttemptsPdsnRange(value);
    }
        this._a10SetupAttemptsPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPBLOCKSPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPBLOCKSPDSNRANGE_RANGES = a;
     }
     private static void checkA10SetupBlocksPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPBLOCKSPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPBLOCKSPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA10SetupBlocksPdsn(final BigInteger value) {
    if (value != null) {
        checkA10SetupBlocksPdsnRange(value);
    }
        this._a10SetupBlocksPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPSUCCESSESPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPSUCCESSESPDSNRANGE_RANGES = a;
     }
     private static void checkA10SetupSuccessesPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPSUCCESSESPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPSUCCESSESPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA10SetupSuccessesPdsn(final BigInteger value) {
    if (value != null) {
        checkA10SetupSuccessesPdsnRange(value);
    }
        this._a10SetupSuccessesPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDADMINPROHIBITPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDADMINPROHIBITPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedAdminProhibitPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDADMINPROHIBITPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDADMINPROHIBITPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedAdminProhibitPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedAdminProhibitPdsnRange(value);
    }
        this._a11RegReqDeniedAdminProhibitPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDFAILEDAUTHPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDFAILEDAUTHPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedFailedAuthPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDFAILEDAUTHPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDFAILEDAUTHPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedFailedAuthPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedFailedAuthPdsnRange(value);
    }
        this._a11RegReqDeniedFailedAuthPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDIDMISMATCHPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDIDMISMATCHPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedIdMismatchPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDIDMISMATCHPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDIDMISMATCHPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedIdMismatchPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedIdMismatchPdsnRange(value);
    }
        this._a11RegReqDeniedIdMismatchPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDINSUFFRESOURCESPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDINSUFFRESOURCESPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedInsuffResourcesPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDINSUFFRESOURCESPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDINSUFFRESOURCESPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedInsuffResourcesPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedInsuffResourcesPdsnRange(value);
    }
        this._a11RegReqDeniedInsuffResourcesPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDMALFORMEDREQPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDMALFORMEDREQPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedMalformedReqPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDMALFORMEDREQPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDMALFORMEDREQPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedMalformedReqPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedMalformedReqPdsnRange(value);
    }
        this._a11RegReqDeniedMalformedReqPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDNOREASONPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDNOREASONPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedNoReasonPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDNOREASONPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDNOREASONPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedNoReasonPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedNoReasonPdsnRange(value);
    }
        this._a11RegReqDeniedNoReasonPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDREVERSETUNNELTBITNOTSETPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDREVERSETUNNELTBITNOTSETPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedReverseTunnelTbitNotSetPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDREVERSETUNNELTBITNOTSETPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDREVERSETUNNELTBITNOTSETPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedReverseTunnelTbitNotSetPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedReverseTunnelTbitNotSetPdsnRange(value);
    }
        this._a11RegReqDeniedReverseTunnelTbitNotSetPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDREVERSETUNNELUNAVAILABLEPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDREVERSETUNNELUNAVAILABLEPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedReverseTunnelUnavailablePdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDREVERSETUNNELUNAVAILABLEPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDREVERSETUNNELUNAVAILABLEPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedReverseTunnelUnavailablePdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedReverseTunnelUnavailablePdsnRange(value);
    }
        this._a11RegReqDeniedReverseTunnelUnavailablePdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDUNKNOWNERRORCODEPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDUNKNOWNERRORCODEPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedUnknownErrorCodePdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDUNKNOWNERRORCODEPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDUNKNOWNERRORCODEPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedUnknownErrorCodePdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedUnknownErrorCodePdsnRange(value);
    }
        this._a11RegReqDeniedUnknownErrorCodePdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDUNKNOWNPDSNPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDUNKNOWNPDSNPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedUnknownPdsnpdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDUNKNOWNPDSNPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDUNKNOWNPDSNPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedUnknownPdsnpdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedUnknownPdsnpdsnRange(value);
    }
        this._a11RegReqDeniedUnknownPdsnpdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGREQDENIEDUNSUPPVENDIDPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGREQDENIEDUNSUPPVENDIDPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegReqDeniedUnsuppVendIdPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGREQDENIEDUNSUPPVENDIDPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGREQDENIEDUNSUPPVENDIDPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setA11RegReqDeniedUnsuppVendIdPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegReqDeniedUnsuppVendIdPdsnRange(value);
    }
        this._a11RegReqDeniedUnsuppVendIdPdsn = value;
        return this;
    }
    
     
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setPdsNipAddressPdsnPerf(final IpAddress value) {
        this._pdsNipAddressPdsnPerf = value;
        return this;
    }
    
     
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder setPdsnNumberPdsnPerf(final java.lang.Long value) {
        this._pdsnNumberPdsnPerf = value;
        return this;
    }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdPcfpdsnPcfpdsnStats build() {
        return new Cdma2000HrpdPcfpdsnPcfpdsnStatsImpl(this);
    }

    private static final class Cdma2000HrpdPcfpdsnPcfpdsnStatsImpl implements Cdma2000HrpdPcfpdsnPcfpdsnStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats.class;
        }

        private final BigInteger _a10RegReqForReRegistrationRetransmissionsPdsn;
        private final BigInteger _a10RegReqForRegistrationRetransmissionsPdsn;
        private final BigInteger _a10RegReqForReleaseRetransmissionsPdsn;
        private final BigInteger _a10SetupAttemptsPdsn;
        private final BigInteger _a10SetupBlocksPdsn;
        private final BigInteger _a10SetupSuccessesPdsn;
        private final BigInteger _a11RegReqDeniedAdminProhibitPdsn;
        private final BigInteger _a11RegReqDeniedFailedAuthPdsn;
        private final BigInteger _a11RegReqDeniedIdMismatchPdsn;
        private final BigInteger _a11RegReqDeniedInsuffResourcesPdsn;
        private final BigInteger _a11RegReqDeniedMalformedReqPdsn;
        private final BigInteger _a11RegReqDeniedNoReasonPdsn;
        private final BigInteger _a11RegReqDeniedReverseTunnelTbitNotSetPdsn;
        private final BigInteger _a11RegReqDeniedReverseTunnelUnavailablePdsn;
        private final BigInteger _a11RegReqDeniedUnknownErrorCodePdsn;
        private final BigInteger _a11RegReqDeniedUnknownPdsnpdsn;
        private final BigInteger _a11RegReqDeniedUnsuppVendIdPdsn;
        private final IpAddress _pdsNipAddressPdsnPerf;
        private final java.lang.Long _pdsnNumberPdsnPerf;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdPcfpdsnPcfpdsnStatsImpl(Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder base) {
            this._a10RegReqForReRegistrationRetransmissionsPdsn = base.getA10RegReqForReRegistrationRetransmissionsPdsn();
            this._a10RegReqForRegistrationRetransmissionsPdsn = base.getA10RegReqForRegistrationRetransmissionsPdsn();
            this._a10RegReqForReleaseRetransmissionsPdsn = base.getA10RegReqForReleaseRetransmissionsPdsn();
            this._a10SetupAttemptsPdsn = base.getA10SetupAttemptsPdsn();
            this._a10SetupBlocksPdsn = base.getA10SetupBlocksPdsn();
            this._a10SetupSuccessesPdsn = base.getA10SetupSuccessesPdsn();
            this._a11RegReqDeniedAdminProhibitPdsn = base.getA11RegReqDeniedAdminProhibitPdsn();
            this._a11RegReqDeniedFailedAuthPdsn = base.getA11RegReqDeniedFailedAuthPdsn();
            this._a11RegReqDeniedIdMismatchPdsn = base.getA11RegReqDeniedIdMismatchPdsn();
            this._a11RegReqDeniedInsuffResourcesPdsn = base.getA11RegReqDeniedInsuffResourcesPdsn();
            this._a11RegReqDeniedMalformedReqPdsn = base.getA11RegReqDeniedMalformedReqPdsn();
            this._a11RegReqDeniedNoReasonPdsn = base.getA11RegReqDeniedNoReasonPdsn();
            this._a11RegReqDeniedReverseTunnelTbitNotSetPdsn = base.getA11RegReqDeniedReverseTunnelTbitNotSetPdsn();
            this._a11RegReqDeniedReverseTunnelUnavailablePdsn = base.getA11RegReqDeniedReverseTunnelUnavailablePdsn();
            this._a11RegReqDeniedUnknownErrorCodePdsn = base.getA11RegReqDeniedUnknownErrorCodePdsn();
            this._a11RegReqDeniedUnknownPdsnpdsn = base.getA11RegReqDeniedUnknownPdsnpdsn();
            this._a11RegReqDeniedUnsuppVendIdPdsn = base.getA11RegReqDeniedUnsuppVendIdPdsn();
            this._pdsNipAddressPdsnPerf = base.getPdsNipAddressPdsnPerf();
            this._pdsnNumberPdsnPerf = base.getPdsnNumberPdsnPerf();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getA10RegReqForReRegistrationRetransmissionsPdsn() {
            return _a10RegReqForReRegistrationRetransmissionsPdsn;
        }
        
        @Override
        public BigInteger getA10RegReqForRegistrationRetransmissionsPdsn() {
            return _a10RegReqForRegistrationRetransmissionsPdsn;
        }
        
        @Override
        public BigInteger getA10RegReqForReleaseRetransmissionsPdsn() {
            return _a10RegReqForReleaseRetransmissionsPdsn;
        }
        
        @Override
        public BigInteger getA10SetupAttemptsPdsn() {
            return _a10SetupAttemptsPdsn;
        }
        
        @Override
        public BigInteger getA10SetupBlocksPdsn() {
            return _a10SetupBlocksPdsn;
        }
        
        @Override
        public BigInteger getA10SetupSuccessesPdsn() {
            return _a10SetupSuccessesPdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedAdminProhibitPdsn() {
            return _a11RegReqDeniedAdminProhibitPdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedFailedAuthPdsn() {
            return _a11RegReqDeniedFailedAuthPdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedIdMismatchPdsn() {
            return _a11RegReqDeniedIdMismatchPdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedInsuffResourcesPdsn() {
            return _a11RegReqDeniedInsuffResourcesPdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedMalformedReqPdsn() {
            return _a11RegReqDeniedMalformedReqPdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedNoReasonPdsn() {
            return _a11RegReqDeniedNoReasonPdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedReverseTunnelTbitNotSetPdsn() {
            return _a11RegReqDeniedReverseTunnelTbitNotSetPdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedReverseTunnelUnavailablePdsn() {
            return _a11RegReqDeniedReverseTunnelUnavailablePdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedUnknownErrorCodePdsn() {
            return _a11RegReqDeniedUnknownErrorCodePdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedUnknownPdsnpdsn() {
            return _a11RegReqDeniedUnknownPdsnpdsn;
        }
        
        @Override
        public BigInteger getA11RegReqDeniedUnsuppVendIdPdsn() {
            return _a11RegReqDeniedUnsuppVendIdPdsn;
        }
        
        @Override
        public IpAddress getPdsNipAddressPdsnPerf() {
            return _pdsNipAddressPdsnPerf;
        }
        
        @Override
        public java.lang.Long getPdsnNumberPdsnPerf() {
            return _pdsnNumberPdsnPerf;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_a10RegReqForReRegistrationRetransmissionsPdsn);
            result = prime * result + Objects.hashCode(_a10RegReqForRegistrationRetransmissionsPdsn);
            result = prime * result + Objects.hashCode(_a10RegReqForReleaseRetransmissionsPdsn);
            result = prime * result + Objects.hashCode(_a10SetupAttemptsPdsn);
            result = prime * result + Objects.hashCode(_a10SetupBlocksPdsn);
            result = prime * result + Objects.hashCode(_a10SetupSuccessesPdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedAdminProhibitPdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedFailedAuthPdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedIdMismatchPdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedInsuffResourcesPdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedMalformedReqPdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedNoReasonPdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedReverseTunnelTbitNotSetPdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedReverseTunnelUnavailablePdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedUnknownErrorCodePdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedUnknownPdsnpdsn);
            result = prime * result + Objects.hashCode(_a11RegReqDeniedUnsuppVendIdPdsn);
            result = prime * result + Objects.hashCode(_pdsNipAddressPdsnPerf);
            result = prime * result + Objects.hashCode(_pdsnNumberPdsnPerf);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats)obj;
            if (!Objects.equals(_a10RegReqForReRegistrationRetransmissionsPdsn, other.getA10RegReqForReRegistrationRetransmissionsPdsn())) {
                return false;
            }
            if (!Objects.equals(_a10RegReqForRegistrationRetransmissionsPdsn, other.getA10RegReqForRegistrationRetransmissionsPdsn())) {
                return false;
            }
            if (!Objects.equals(_a10RegReqForReleaseRetransmissionsPdsn, other.getA10RegReqForReleaseRetransmissionsPdsn())) {
                return false;
            }
            if (!Objects.equals(_a10SetupAttemptsPdsn, other.getA10SetupAttemptsPdsn())) {
                return false;
            }
            if (!Objects.equals(_a10SetupBlocksPdsn, other.getA10SetupBlocksPdsn())) {
                return false;
            }
            if (!Objects.equals(_a10SetupSuccessesPdsn, other.getA10SetupSuccessesPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedAdminProhibitPdsn, other.getA11RegReqDeniedAdminProhibitPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedFailedAuthPdsn, other.getA11RegReqDeniedFailedAuthPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedIdMismatchPdsn, other.getA11RegReqDeniedIdMismatchPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedInsuffResourcesPdsn, other.getA11RegReqDeniedInsuffResourcesPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedMalformedReqPdsn, other.getA11RegReqDeniedMalformedReqPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedNoReasonPdsn, other.getA11RegReqDeniedNoReasonPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedReverseTunnelTbitNotSetPdsn, other.getA11RegReqDeniedReverseTunnelTbitNotSetPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedReverseTunnelUnavailablePdsn, other.getA11RegReqDeniedReverseTunnelUnavailablePdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedUnknownErrorCodePdsn, other.getA11RegReqDeniedUnknownErrorCodePdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedUnknownPdsnpdsn, other.getA11RegReqDeniedUnknownPdsnpdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegReqDeniedUnsuppVendIdPdsn, other.getA11RegReqDeniedUnsuppVendIdPdsn())) {
                return false;
            }
            if (!Objects.equals(_pdsNipAddressPdsnPerf, other.getPdsNipAddressPdsnPerf())) {
                return false;
            }
            if (!Objects.equals(_pdsnNumberPdsnPerf, other.getPdsnNumberPdsnPerf())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdPcfpdsnPcfpdsnStatsImpl otherImpl = (Cdma2000HrpdPcfpdsnPcfpdsnStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdPcfpdsnPcfpdsnStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_a10RegReqForReRegistrationRetransmissionsPdsn != null) {
                builder.append("_a10RegReqForReRegistrationRetransmissionsPdsn=");
                builder.append(_a10RegReqForReRegistrationRetransmissionsPdsn);
                builder.append(", ");
            }
            if (_a10RegReqForRegistrationRetransmissionsPdsn != null) {
                builder.append("_a10RegReqForRegistrationRetransmissionsPdsn=");
                builder.append(_a10RegReqForRegistrationRetransmissionsPdsn);
                builder.append(", ");
            }
            if (_a10RegReqForReleaseRetransmissionsPdsn != null) {
                builder.append("_a10RegReqForReleaseRetransmissionsPdsn=");
                builder.append(_a10RegReqForReleaseRetransmissionsPdsn);
                builder.append(", ");
            }
            if (_a10SetupAttemptsPdsn != null) {
                builder.append("_a10SetupAttemptsPdsn=");
                builder.append(_a10SetupAttemptsPdsn);
                builder.append(", ");
            }
            if (_a10SetupBlocksPdsn != null) {
                builder.append("_a10SetupBlocksPdsn=");
                builder.append(_a10SetupBlocksPdsn);
                builder.append(", ");
            }
            if (_a10SetupSuccessesPdsn != null) {
                builder.append("_a10SetupSuccessesPdsn=");
                builder.append(_a10SetupSuccessesPdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedAdminProhibitPdsn != null) {
                builder.append("_a11RegReqDeniedAdminProhibitPdsn=");
                builder.append(_a11RegReqDeniedAdminProhibitPdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedFailedAuthPdsn != null) {
                builder.append("_a11RegReqDeniedFailedAuthPdsn=");
                builder.append(_a11RegReqDeniedFailedAuthPdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedIdMismatchPdsn != null) {
                builder.append("_a11RegReqDeniedIdMismatchPdsn=");
                builder.append(_a11RegReqDeniedIdMismatchPdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedInsuffResourcesPdsn != null) {
                builder.append("_a11RegReqDeniedInsuffResourcesPdsn=");
                builder.append(_a11RegReqDeniedInsuffResourcesPdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedMalformedReqPdsn != null) {
                builder.append("_a11RegReqDeniedMalformedReqPdsn=");
                builder.append(_a11RegReqDeniedMalformedReqPdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedNoReasonPdsn != null) {
                builder.append("_a11RegReqDeniedNoReasonPdsn=");
                builder.append(_a11RegReqDeniedNoReasonPdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedReverseTunnelTbitNotSetPdsn != null) {
                builder.append("_a11RegReqDeniedReverseTunnelTbitNotSetPdsn=");
                builder.append(_a11RegReqDeniedReverseTunnelTbitNotSetPdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedReverseTunnelUnavailablePdsn != null) {
                builder.append("_a11RegReqDeniedReverseTunnelUnavailablePdsn=");
                builder.append(_a11RegReqDeniedReverseTunnelUnavailablePdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedUnknownErrorCodePdsn != null) {
                builder.append("_a11RegReqDeniedUnknownErrorCodePdsn=");
                builder.append(_a11RegReqDeniedUnknownErrorCodePdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedUnknownPdsnpdsn != null) {
                builder.append("_a11RegReqDeniedUnknownPdsnpdsn=");
                builder.append(_a11RegReqDeniedUnknownPdsnpdsn);
                builder.append(", ");
            }
            if (_a11RegReqDeniedUnsuppVendIdPdsn != null) {
                builder.append("_a11RegReqDeniedUnsuppVendIdPdsn=");
                builder.append(_a11RegReqDeniedUnsuppVendIdPdsn);
                builder.append(", ");
            }
            if (_pdsNipAddressPdsnPerf != null) {
                builder.append("_pdsNipAddressPdsnPerf=");
                builder.append(_pdsNipAddressPdsnPerf);
                builder.append(", ");
            }
            if (_pdsnNumberPdsnPerf != null) {
                builder.append("_pdsnNumberPdsnPerf=");
                builder.append(_pdsnNumberPdsnPerf);
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
