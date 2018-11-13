package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats
 *
 */
public class Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats> {

    private BigInteger _a11RegUpdateAccountingErrorPdsn;
    private BigInteger _a11RegUpdateAuthCheckFailPdsn;
    private BigInteger _a11RegUpdateForUnknownPsipdsn;
    private BigInteger _a11RegUpdateIdCheckFailPdsn;
    private BigInteger _a11RegUpdateInterPcfHandoffPdsn;
    private BigInteger _a11RegUpdateInterPdsnHandoffPdsn;
    private BigInteger _a11RegUpdatePdsnErrorPdsn;
    private BigInteger _a11RegUpdatePdsnoampInterventionPdsn;
    private BigInteger _a11RegUpdatePppTimeoutPdsn;
    private BigInteger _a11RegUpdateReceivedPdsn;
    private BigInteger _a11RegUpdateRegistrationTimeoutPdsn;
    private BigInteger _a11RegUpdateUnknownCauseCodePdsn;
    private BigInteger _a11RegUpdateUnspecifiedReasonPdsn;
    private BigInteger _a11RegUpdateUserFailedAuthenticationPdsn;
    private BigInteger _a11RegUpdateWithoutReasonCodePdsn;
    private java.lang.Long _pdsnNumberRegUpdatePerf;
    private IpAddress _pdsnipAddressRegUpdatePerf;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>> augmentation = Collections.emptyMap();

    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder() {
    }
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG arg) {
        this._pdsnNumberRegUpdatePerf = arg.getPdsnNumberRegUpdatePerf();
        this._pdsnipAddressRegUpdatePerf = arg.getPdsnipAddressRegUpdatePerf();
        this._a11RegUpdateReceivedPdsn = arg.getA11RegUpdateReceivedPdsn();
        this._a11RegUpdateIdCheckFailPdsn = arg.getA11RegUpdateIdCheckFailPdsn();
        this._a11RegUpdateAuthCheckFailPdsn = arg.getA11RegUpdateAuthCheckFailPdsn();
        this._a11RegUpdateForUnknownPsipdsn = arg.getA11RegUpdateForUnknownPsipdsn();
        this._a11RegUpdateUnspecifiedReasonPdsn = arg.getA11RegUpdateUnspecifiedReasonPdsn();
        this._a11RegUpdatePppTimeoutPdsn = arg.getA11RegUpdatePppTimeoutPdsn();
        this._a11RegUpdateRegistrationTimeoutPdsn = arg.getA11RegUpdateRegistrationTimeoutPdsn();
        this._a11RegUpdatePdsnErrorPdsn = arg.getA11RegUpdatePdsnErrorPdsn();
        this._a11RegUpdateInterPcfHandoffPdsn = arg.getA11RegUpdateInterPcfHandoffPdsn();
        this._a11RegUpdateInterPdsnHandoffPdsn = arg.getA11RegUpdateInterPdsnHandoffPdsn();
        this._a11RegUpdatePdsnoampInterventionPdsn = arg.getA11RegUpdatePdsnoampInterventionPdsn();
        this._a11RegUpdateAccountingErrorPdsn = arg.getA11RegUpdateAccountingErrorPdsn();
        this._a11RegUpdateUserFailedAuthenticationPdsn = arg.getA11RegUpdateUserFailedAuthenticationPdsn();
        this._a11RegUpdateUnknownCauseCodePdsn = arg.getA11RegUpdateUnknownCauseCodePdsn();
        this._a11RegUpdateWithoutReasonCodePdsn = arg.getA11RegUpdateWithoutReasonCodePdsn();
    }

    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder(Cdma2000OneXPcfpdsnA11RegUpdateStats base) {
        this._a11RegUpdateAccountingErrorPdsn = base.getA11RegUpdateAccountingErrorPdsn();
        this._a11RegUpdateAuthCheckFailPdsn = base.getA11RegUpdateAuthCheckFailPdsn();
        this._a11RegUpdateForUnknownPsipdsn = base.getA11RegUpdateForUnknownPsipdsn();
        this._a11RegUpdateIdCheckFailPdsn = base.getA11RegUpdateIdCheckFailPdsn();
        this._a11RegUpdateInterPcfHandoffPdsn = base.getA11RegUpdateInterPcfHandoffPdsn();
        this._a11RegUpdateInterPdsnHandoffPdsn = base.getA11RegUpdateInterPdsnHandoffPdsn();
        this._a11RegUpdatePdsnErrorPdsn = base.getA11RegUpdatePdsnErrorPdsn();
        this._a11RegUpdatePdsnoampInterventionPdsn = base.getA11RegUpdatePdsnoampInterventionPdsn();
        this._a11RegUpdatePppTimeoutPdsn = base.getA11RegUpdatePppTimeoutPdsn();
        this._a11RegUpdateReceivedPdsn = base.getA11RegUpdateReceivedPdsn();
        this._a11RegUpdateRegistrationTimeoutPdsn = base.getA11RegUpdateRegistrationTimeoutPdsn();
        this._a11RegUpdateUnknownCauseCodePdsn = base.getA11RegUpdateUnknownCauseCodePdsn();
        this._a11RegUpdateUnspecifiedReasonPdsn = base.getA11RegUpdateUnspecifiedReasonPdsn();
        this._a11RegUpdateUserFailedAuthenticationPdsn = base.getA11RegUpdateUserFailedAuthenticationPdsn();
        this._a11RegUpdateWithoutReasonCodePdsn = base.getA11RegUpdateWithoutReasonCodePdsn();
        this._pdsnNumberRegUpdatePerf = base.getPdsnNumberRegUpdatePerf();
        this._pdsnipAddressRegUpdatePerf = base.getPdsnipAddressRegUpdatePerf();
        if (base instanceof Cdma2000OneXPcfpdsnA11RegUpdateStatsImpl) {
            Cdma2000OneXPcfpdsnA11RegUpdateStatsImpl impl = (Cdma2000OneXPcfpdsnA11RegUpdateStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG) {
            this._pdsnNumberRegUpdatePerf = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getPdsnNumberRegUpdatePerf();
            this._pdsnipAddressRegUpdatePerf = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getPdsnipAddressRegUpdatePerf();
            this._a11RegUpdateReceivedPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateReceivedPdsn();
            this._a11RegUpdateIdCheckFailPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateIdCheckFailPdsn();
            this._a11RegUpdateAuthCheckFailPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateAuthCheckFailPdsn();
            this._a11RegUpdateForUnknownPsipdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateForUnknownPsipdsn();
            this._a11RegUpdateUnspecifiedReasonPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateUnspecifiedReasonPdsn();
            this._a11RegUpdatePppTimeoutPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdatePppTimeoutPdsn();
            this._a11RegUpdateRegistrationTimeoutPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateRegistrationTimeoutPdsn();
            this._a11RegUpdatePdsnErrorPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdatePdsnErrorPdsn();
            this._a11RegUpdateInterPcfHandoffPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateInterPcfHandoffPdsn();
            this._a11RegUpdateInterPdsnHandoffPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateInterPdsnHandoffPdsn();
            this._a11RegUpdatePdsnoampInterventionPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdatePdsnoampInterventionPdsn();
            this._a11RegUpdateAccountingErrorPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateAccountingErrorPdsn();
            this._a11RegUpdateUserFailedAuthenticationPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateUserFailedAuthenticationPdsn();
            this._a11RegUpdateUnknownCauseCodePdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateUnknownCauseCodePdsn();
            this._a11RegUpdateWithoutReasonCodePdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG)arg).getA11RegUpdateWithoutReasonCodePdsn();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getA11RegUpdateAccountingErrorPdsn() {
        return _a11RegUpdateAccountingErrorPdsn;
    }
    
    public BigInteger getA11RegUpdateAuthCheckFailPdsn() {
        return _a11RegUpdateAuthCheckFailPdsn;
    }
    
    public BigInteger getA11RegUpdateForUnknownPsipdsn() {
        return _a11RegUpdateForUnknownPsipdsn;
    }
    
    public BigInteger getA11RegUpdateIdCheckFailPdsn() {
        return _a11RegUpdateIdCheckFailPdsn;
    }
    
    public BigInteger getA11RegUpdateInterPcfHandoffPdsn() {
        return _a11RegUpdateInterPcfHandoffPdsn;
    }
    
    public BigInteger getA11RegUpdateInterPdsnHandoffPdsn() {
        return _a11RegUpdateInterPdsnHandoffPdsn;
    }
    
    public BigInteger getA11RegUpdatePdsnErrorPdsn() {
        return _a11RegUpdatePdsnErrorPdsn;
    }
    
    public BigInteger getA11RegUpdatePdsnoampInterventionPdsn() {
        return _a11RegUpdatePdsnoampInterventionPdsn;
    }
    
    public BigInteger getA11RegUpdatePppTimeoutPdsn() {
        return _a11RegUpdatePppTimeoutPdsn;
    }
    
    public BigInteger getA11RegUpdateReceivedPdsn() {
        return _a11RegUpdateReceivedPdsn;
    }
    
    public BigInteger getA11RegUpdateRegistrationTimeoutPdsn() {
        return _a11RegUpdateRegistrationTimeoutPdsn;
    }
    
    public BigInteger getA11RegUpdateUnknownCauseCodePdsn() {
        return _a11RegUpdateUnknownCauseCodePdsn;
    }
    
    public BigInteger getA11RegUpdateUnspecifiedReasonPdsn() {
        return _a11RegUpdateUnspecifiedReasonPdsn;
    }
    
    public BigInteger getA11RegUpdateUserFailedAuthenticationPdsn() {
        return _a11RegUpdateUserFailedAuthenticationPdsn;
    }
    
    public BigInteger getA11RegUpdateWithoutReasonCodePdsn() {
        return _a11RegUpdateWithoutReasonCodePdsn;
    }
    
    public java.lang.Long getPdsnNumberRegUpdatePerf() {
        return _pdsnNumberRegUpdatePerf;
    }
    
    public IpAddress getPdsnipAddressRegUpdatePerf() {
        return _pdsnipAddressRegUpdatePerf;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEACCOUNTINGERRORPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEACCOUNTINGERRORPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateAccountingErrorPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEACCOUNTINGERRORPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEACCOUNTINGERRORPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateAccountingErrorPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateAccountingErrorPdsnRange(value);
    }
        this._a11RegUpdateAccountingErrorPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEAUTHCHECKFAILPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEAUTHCHECKFAILPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateAuthCheckFailPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEAUTHCHECKFAILPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEAUTHCHECKFAILPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateAuthCheckFailPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateAuthCheckFailPdsnRange(value);
    }
        this._a11RegUpdateAuthCheckFailPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEFORUNKNOWNPSIPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEFORUNKNOWNPSIPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateForUnknownPsipdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEFORUNKNOWNPSIPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEFORUNKNOWNPSIPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateForUnknownPsipdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateForUnknownPsipdsnRange(value);
    }
        this._a11RegUpdateForUnknownPsipdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEIDCHECKFAILPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEIDCHECKFAILPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateIdCheckFailPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEIDCHECKFAILPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEIDCHECKFAILPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateIdCheckFailPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateIdCheckFailPdsnRange(value);
    }
        this._a11RegUpdateIdCheckFailPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEINTERPCFHANDOFFPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEINTERPCFHANDOFFPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateInterPcfHandoffPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEINTERPCFHANDOFFPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEINTERPCFHANDOFFPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateInterPcfHandoffPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateInterPcfHandoffPdsnRange(value);
    }
        this._a11RegUpdateInterPcfHandoffPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEINTERPDSNHANDOFFPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEINTERPDSNHANDOFFPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateInterPdsnHandoffPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEINTERPDSNHANDOFFPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEINTERPDSNHANDOFFPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateInterPdsnHandoffPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateInterPdsnHandoffPdsnRange(value);
    }
        this._a11RegUpdateInterPdsnHandoffPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEPDSNERRORPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEPDSNERRORPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdatePdsnErrorPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEPDSNERRORPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEPDSNERRORPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdatePdsnErrorPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdatePdsnErrorPdsnRange(value);
    }
        this._a11RegUpdatePdsnErrorPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEPDSNOAMPINTERVENTIONPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEPDSNOAMPINTERVENTIONPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdatePdsnoampInterventionPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEPDSNOAMPINTERVENTIONPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEPDSNOAMPINTERVENTIONPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdatePdsnoampInterventionPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdatePdsnoampInterventionPdsnRange(value);
    }
        this._a11RegUpdatePdsnoampInterventionPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEPPPTIMEOUTPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEPPPTIMEOUTPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdatePppTimeoutPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEPPPTIMEOUTPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEPPPTIMEOUTPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdatePppTimeoutPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdatePppTimeoutPdsnRange(value);
    }
        this._a11RegUpdatePppTimeoutPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATERECEIVEDPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATERECEIVEDPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateReceivedPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATERECEIVEDPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATERECEIVEDPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateReceivedPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateReceivedPdsnRange(value);
    }
        this._a11RegUpdateReceivedPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEREGISTRATIONTIMEOUTPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEREGISTRATIONTIMEOUTPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateRegistrationTimeoutPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEREGISTRATIONTIMEOUTPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEREGISTRATIONTIMEOUTPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateRegistrationTimeoutPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateRegistrationTimeoutPdsnRange(value);
    }
        this._a11RegUpdateRegistrationTimeoutPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEUNKNOWNCAUSECODEPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEUNKNOWNCAUSECODEPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateUnknownCauseCodePdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEUNKNOWNCAUSECODEPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEUNKNOWNCAUSECODEPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateUnknownCauseCodePdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateUnknownCauseCodePdsnRange(value);
    }
        this._a11RegUpdateUnknownCauseCodePdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEUNSPECIFIEDREASONPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEUNSPECIFIEDREASONPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateUnspecifiedReasonPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEUNSPECIFIEDREASONPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEUNSPECIFIEDREASONPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateUnspecifiedReasonPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateUnspecifiedReasonPdsnRange(value);
    }
        this._a11RegUpdateUnspecifiedReasonPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEUSERFAILEDAUTHENTICATIONPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEUSERFAILEDAUTHENTICATIONPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateUserFailedAuthenticationPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEUSERFAILEDAUTHENTICATIONPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEUSERFAILEDAUTHENTICATIONPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateUserFailedAuthenticationPdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateUserFailedAuthenticationPdsnRange(value);
    }
        this._a11RegUpdateUserFailedAuthenticationPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11REGUPDATEWITHOUTREASONCODEPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11REGUPDATEWITHOUTREASONCODEPDSNRANGE_RANGES = a;
     }
     private static void checkA11RegUpdateWithoutReasonCodePdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11REGUPDATEWITHOUTREASONCODEPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11REGUPDATEWITHOUTREASONCODEPDSNRANGE_RANGES)));
     }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setA11RegUpdateWithoutReasonCodePdsn(final BigInteger value) {
    if (value != null) {
        checkA11RegUpdateWithoutReasonCodePdsnRange(value);
    }
        this._a11RegUpdateWithoutReasonCodePdsn = value;
        return this;
    }
    
     
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setPdsnNumberRegUpdatePerf(final java.lang.Long value) {
        this._pdsnNumberRegUpdatePerf = value;
        return this;
    }
    
     
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder setPdsnipAddressRegUpdatePerf(final IpAddress value) {
        this._pdsnipAddressRegUpdatePerf = value;
        return this;
    }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXPcfpdsnA11RegUpdateStats build() {
        return new Cdma2000OneXPcfpdsnA11RegUpdateStatsImpl(this);
    }

    private static final class Cdma2000OneXPcfpdsnA11RegUpdateStatsImpl implements Cdma2000OneXPcfpdsnA11RegUpdateStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats.class;
        }

        private final BigInteger _a11RegUpdateAccountingErrorPdsn;
        private final BigInteger _a11RegUpdateAuthCheckFailPdsn;
        private final BigInteger _a11RegUpdateForUnknownPsipdsn;
        private final BigInteger _a11RegUpdateIdCheckFailPdsn;
        private final BigInteger _a11RegUpdateInterPcfHandoffPdsn;
        private final BigInteger _a11RegUpdateInterPdsnHandoffPdsn;
        private final BigInteger _a11RegUpdatePdsnErrorPdsn;
        private final BigInteger _a11RegUpdatePdsnoampInterventionPdsn;
        private final BigInteger _a11RegUpdatePppTimeoutPdsn;
        private final BigInteger _a11RegUpdateReceivedPdsn;
        private final BigInteger _a11RegUpdateRegistrationTimeoutPdsn;
        private final BigInteger _a11RegUpdateUnknownCauseCodePdsn;
        private final BigInteger _a11RegUpdateUnspecifiedReasonPdsn;
        private final BigInteger _a11RegUpdateUserFailedAuthenticationPdsn;
        private final BigInteger _a11RegUpdateWithoutReasonCodePdsn;
        private final java.lang.Long _pdsnNumberRegUpdatePerf;
        private final IpAddress _pdsnipAddressRegUpdatePerf;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>> augmentation = Collections.emptyMap();

        private Cdma2000OneXPcfpdsnA11RegUpdateStatsImpl(Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder base) {
            this._a11RegUpdateAccountingErrorPdsn = base.getA11RegUpdateAccountingErrorPdsn();
            this._a11RegUpdateAuthCheckFailPdsn = base.getA11RegUpdateAuthCheckFailPdsn();
            this._a11RegUpdateForUnknownPsipdsn = base.getA11RegUpdateForUnknownPsipdsn();
            this._a11RegUpdateIdCheckFailPdsn = base.getA11RegUpdateIdCheckFailPdsn();
            this._a11RegUpdateInterPcfHandoffPdsn = base.getA11RegUpdateInterPcfHandoffPdsn();
            this._a11RegUpdateInterPdsnHandoffPdsn = base.getA11RegUpdateInterPdsnHandoffPdsn();
            this._a11RegUpdatePdsnErrorPdsn = base.getA11RegUpdatePdsnErrorPdsn();
            this._a11RegUpdatePdsnoampInterventionPdsn = base.getA11RegUpdatePdsnoampInterventionPdsn();
            this._a11RegUpdatePppTimeoutPdsn = base.getA11RegUpdatePppTimeoutPdsn();
            this._a11RegUpdateReceivedPdsn = base.getA11RegUpdateReceivedPdsn();
            this._a11RegUpdateRegistrationTimeoutPdsn = base.getA11RegUpdateRegistrationTimeoutPdsn();
            this._a11RegUpdateUnknownCauseCodePdsn = base.getA11RegUpdateUnknownCauseCodePdsn();
            this._a11RegUpdateUnspecifiedReasonPdsn = base.getA11RegUpdateUnspecifiedReasonPdsn();
            this._a11RegUpdateUserFailedAuthenticationPdsn = base.getA11RegUpdateUserFailedAuthenticationPdsn();
            this._a11RegUpdateWithoutReasonCodePdsn = base.getA11RegUpdateWithoutReasonCodePdsn();
            this._pdsnNumberRegUpdatePerf = base.getPdsnNumberRegUpdatePerf();
            this._pdsnipAddressRegUpdatePerf = base.getPdsnipAddressRegUpdatePerf();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getA11RegUpdateAccountingErrorPdsn() {
            return _a11RegUpdateAccountingErrorPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateAuthCheckFailPdsn() {
            return _a11RegUpdateAuthCheckFailPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateForUnknownPsipdsn() {
            return _a11RegUpdateForUnknownPsipdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateIdCheckFailPdsn() {
            return _a11RegUpdateIdCheckFailPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateInterPcfHandoffPdsn() {
            return _a11RegUpdateInterPcfHandoffPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateInterPdsnHandoffPdsn() {
            return _a11RegUpdateInterPdsnHandoffPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdatePdsnErrorPdsn() {
            return _a11RegUpdatePdsnErrorPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdatePdsnoampInterventionPdsn() {
            return _a11RegUpdatePdsnoampInterventionPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdatePppTimeoutPdsn() {
            return _a11RegUpdatePppTimeoutPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateReceivedPdsn() {
            return _a11RegUpdateReceivedPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateRegistrationTimeoutPdsn() {
            return _a11RegUpdateRegistrationTimeoutPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateUnknownCauseCodePdsn() {
            return _a11RegUpdateUnknownCauseCodePdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateUnspecifiedReasonPdsn() {
            return _a11RegUpdateUnspecifiedReasonPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateUserFailedAuthenticationPdsn() {
            return _a11RegUpdateUserFailedAuthenticationPdsn;
        }
        
        @Override
        public BigInteger getA11RegUpdateWithoutReasonCodePdsn() {
            return _a11RegUpdateWithoutReasonCodePdsn;
        }
        
        @Override
        public java.lang.Long getPdsnNumberRegUpdatePerf() {
            return _pdsnNumberRegUpdatePerf;
        }
        
        @Override
        public IpAddress getPdsnipAddressRegUpdatePerf() {
            return _pdsnipAddressRegUpdatePerf;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_a11RegUpdateAccountingErrorPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateAuthCheckFailPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateForUnknownPsipdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateIdCheckFailPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateInterPcfHandoffPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateInterPdsnHandoffPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdatePdsnErrorPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdatePdsnoampInterventionPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdatePppTimeoutPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateReceivedPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateRegistrationTimeoutPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateUnknownCauseCodePdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateUnspecifiedReasonPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateUserFailedAuthenticationPdsn);
            result = prime * result + Objects.hashCode(_a11RegUpdateWithoutReasonCodePdsn);
            result = prime * result + Objects.hashCode(_pdsnNumberRegUpdatePerf);
            result = prime * result + Objects.hashCode(_pdsnipAddressRegUpdatePerf);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats)obj;
            if (!Objects.equals(_a11RegUpdateAccountingErrorPdsn, other.getA11RegUpdateAccountingErrorPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateAuthCheckFailPdsn, other.getA11RegUpdateAuthCheckFailPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateForUnknownPsipdsn, other.getA11RegUpdateForUnknownPsipdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateIdCheckFailPdsn, other.getA11RegUpdateIdCheckFailPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateInterPcfHandoffPdsn, other.getA11RegUpdateInterPcfHandoffPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateInterPdsnHandoffPdsn, other.getA11RegUpdateInterPdsnHandoffPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdatePdsnErrorPdsn, other.getA11RegUpdatePdsnErrorPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdatePdsnoampInterventionPdsn, other.getA11RegUpdatePdsnoampInterventionPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdatePppTimeoutPdsn, other.getA11RegUpdatePppTimeoutPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateReceivedPdsn, other.getA11RegUpdateReceivedPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateRegistrationTimeoutPdsn, other.getA11RegUpdateRegistrationTimeoutPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateUnknownCauseCodePdsn, other.getA11RegUpdateUnknownCauseCodePdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateUnspecifiedReasonPdsn, other.getA11RegUpdateUnspecifiedReasonPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateUserFailedAuthenticationPdsn, other.getA11RegUpdateUserFailedAuthenticationPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11RegUpdateWithoutReasonCodePdsn, other.getA11RegUpdateWithoutReasonCodePdsn())) {
                return false;
            }
            if (!Objects.equals(_pdsnNumberRegUpdatePerf, other.getPdsnNumberRegUpdatePerf())) {
                return false;
            }
            if (!Objects.equals(_pdsnipAddressRegUpdatePerf, other.getPdsnipAddressRegUpdatePerf())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXPcfpdsnA11RegUpdateStatsImpl otherImpl = (Cdma2000OneXPcfpdsnA11RegUpdateStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXPcfpdsnA11RegUpdateStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_a11RegUpdateAccountingErrorPdsn != null) {
                builder.append("_a11RegUpdateAccountingErrorPdsn=");
                builder.append(_a11RegUpdateAccountingErrorPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateAuthCheckFailPdsn != null) {
                builder.append("_a11RegUpdateAuthCheckFailPdsn=");
                builder.append(_a11RegUpdateAuthCheckFailPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateForUnknownPsipdsn != null) {
                builder.append("_a11RegUpdateForUnknownPsipdsn=");
                builder.append(_a11RegUpdateForUnknownPsipdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateIdCheckFailPdsn != null) {
                builder.append("_a11RegUpdateIdCheckFailPdsn=");
                builder.append(_a11RegUpdateIdCheckFailPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateInterPcfHandoffPdsn != null) {
                builder.append("_a11RegUpdateInterPcfHandoffPdsn=");
                builder.append(_a11RegUpdateInterPcfHandoffPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateInterPdsnHandoffPdsn != null) {
                builder.append("_a11RegUpdateInterPdsnHandoffPdsn=");
                builder.append(_a11RegUpdateInterPdsnHandoffPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdatePdsnErrorPdsn != null) {
                builder.append("_a11RegUpdatePdsnErrorPdsn=");
                builder.append(_a11RegUpdatePdsnErrorPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdatePdsnoampInterventionPdsn != null) {
                builder.append("_a11RegUpdatePdsnoampInterventionPdsn=");
                builder.append(_a11RegUpdatePdsnoampInterventionPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdatePppTimeoutPdsn != null) {
                builder.append("_a11RegUpdatePppTimeoutPdsn=");
                builder.append(_a11RegUpdatePppTimeoutPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateReceivedPdsn != null) {
                builder.append("_a11RegUpdateReceivedPdsn=");
                builder.append(_a11RegUpdateReceivedPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateRegistrationTimeoutPdsn != null) {
                builder.append("_a11RegUpdateRegistrationTimeoutPdsn=");
                builder.append(_a11RegUpdateRegistrationTimeoutPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateUnknownCauseCodePdsn != null) {
                builder.append("_a11RegUpdateUnknownCauseCodePdsn=");
                builder.append(_a11RegUpdateUnknownCauseCodePdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateUnspecifiedReasonPdsn != null) {
                builder.append("_a11RegUpdateUnspecifiedReasonPdsn=");
                builder.append(_a11RegUpdateUnspecifiedReasonPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateUserFailedAuthenticationPdsn != null) {
                builder.append("_a11RegUpdateUserFailedAuthenticationPdsn=");
                builder.append(_a11RegUpdateUserFailedAuthenticationPdsn);
                builder.append(", ");
            }
            if (_a11RegUpdateWithoutReasonCodePdsn != null) {
                builder.append("_a11RegUpdateWithoutReasonCodePdsn=");
                builder.append(_a11RegUpdateWithoutReasonCodePdsn);
                builder.append(", ");
            }
            if (_pdsnNumberRegUpdatePerf != null) {
                builder.append("_pdsnNumberRegUpdatePerf=");
                builder.append(_pdsnNumberRegUpdatePerf);
                builder.append(", ");
            }
            if (_pdsnipAddressRegUpdatePerf != null) {
                builder.append("_pdsnipAddressRegUpdatePerf=");
                builder.append(_pdsnipAddressRegUpdatePerf);
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
