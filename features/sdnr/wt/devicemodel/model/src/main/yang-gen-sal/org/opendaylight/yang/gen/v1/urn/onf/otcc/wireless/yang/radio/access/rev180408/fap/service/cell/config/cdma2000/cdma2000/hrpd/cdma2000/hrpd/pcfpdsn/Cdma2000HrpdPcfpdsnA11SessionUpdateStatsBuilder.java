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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats
 *
 */
public class Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats> {

    private BigInteger _a11SessionUpdateAcceptedPdsn;
    private BigInteger _a11SessionUpdateDeniedAuthCheckFailPdsn;
    private BigInteger _a11SessionUpdateDeniedHandoffInProgressPdsn;
    private BigInteger _a11SessionUpdateDeniedIdCheckFailPdsn;
    private BigInteger _a11SessionUpdateDeniedInsufficientResourcesPdsn;
    private BigInteger _a11SessionUpdateDeniedPoorlyFormedPdsn;
    private BigInteger _a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn;
    private BigInteger _a11SessionUpdateDeniedReasonUnspecifiedPdsn;
    private BigInteger _a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn;
    private BigInteger _a11SessionUpdateExtendedApipdsn;
    private BigInteger _a11SessionUpdateForUnknownPsipdsn;
    private BigInteger _a11SessionUpdateReceivedPdsn;
    private java.lang.Long _pdsnNumberSessionUpdatePerf;
    private IpAddress _pdsnipAddressSessionUpdatePerf;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder() {
    }
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG arg) {
        this._pdsnNumberSessionUpdatePerf = arg.getPdsnNumberSessionUpdatePerf();
        this._pdsnipAddressSessionUpdatePerf = arg.getPdsnipAddressSessionUpdatePerf();
        this._a11SessionUpdateReceivedPdsn = arg.getA11SessionUpdateReceivedPdsn();
        this._a11SessionUpdateAcceptedPdsn = arg.getA11SessionUpdateAcceptedPdsn();
        this._a11SessionUpdateExtendedApipdsn = arg.getA11SessionUpdateExtendedApipdsn();
        this._a11SessionUpdateForUnknownPsipdsn = arg.getA11SessionUpdateForUnknownPsipdsn();
        this._a11SessionUpdateDeniedIdCheckFailPdsn = arg.getA11SessionUpdateDeniedIdCheckFailPdsn();
        this._a11SessionUpdateDeniedAuthCheckFailPdsn = arg.getA11SessionUpdateDeniedAuthCheckFailPdsn();
        this._a11SessionUpdateDeniedReasonUnspecifiedPdsn = arg.getA11SessionUpdateDeniedReasonUnspecifiedPdsn();
        this._a11SessionUpdateDeniedPoorlyFormedPdsn = arg.getA11SessionUpdateDeniedPoorlyFormedPdsn();
        this._a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn = arg.getA11SessionUpdateDeniedSessionParamsNotUpdatedPdsn();
        this._a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn = arg.getA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn();
        this._a11SessionUpdateDeniedInsufficientResourcesPdsn = arg.getA11SessionUpdateDeniedInsufficientResourcesPdsn();
        this._a11SessionUpdateDeniedHandoffInProgressPdsn = arg.getA11SessionUpdateDeniedHandoffInProgressPdsn();
    }

    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder(Cdma2000HrpdPcfpdsnA11SessionUpdateStats base) {
        this._a11SessionUpdateAcceptedPdsn = base.getA11SessionUpdateAcceptedPdsn();
        this._a11SessionUpdateDeniedAuthCheckFailPdsn = base.getA11SessionUpdateDeniedAuthCheckFailPdsn();
        this._a11SessionUpdateDeniedHandoffInProgressPdsn = base.getA11SessionUpdateDeniedHandoffInProgressPdsn();
        this._a11SessionUpdateDeniedIdCheckFailPdsn = base.getA11SessionUpdateDeniedIdCheckFailPdsn();
        this._a11SessionUpdateDeniedInsufficientResourcesPdsn = base.getA11SessionUpdateDeniedInsufficientResourcesPdsn();
        this._a11SessionUpdateDeniedPoorlyFormedPdsn = base.getA11SessionUpdateDeniedPoorlyFormedPdsn();
        this._a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn = base.getA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn();
        this._a11SessionUpdateDeniedReasonUnspecifiedPdsn = base.getA11SessionUpdateDeniedReasonUnspecifiedPdsn();
        this._a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn = base.getA11SessionUpdateDeniedSessionParamsNotUpdatedPdsn();
        this._a11SessionUpdateExtendedApipdsn = base.getA11SessionUpdateExtendedApipdsn();
        this._a11SessionUpdateForUnknownPsipdsn = base.getA11SessionUpdateForUnknownPsipdsn();
        this._a11SessionUpdateReceivedPdsn = base.getA11SessionUpdateReceivedPdsn();
        this._pdsnNumberSessionUpdatePerf = base.getPdsnNumberSessionUpdatePerf();
        this._pdsnipAddressSessionUpdatePerf = base.getPdsnipAddressSessionUpdatePerf();
        if (base instanceof Cdma2000HrpdPcfpdsnA11SessionUpdateStatsImpl) {
            Cdma2000HrpdPcfpdsnA11SessionUpdateStatsImpl impl = (Cdma2000HrpdPcfpdsnA11SessionUpdateStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG) {
            this._pdsnNumberSessionUpdatePerf = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getPdsnNumberSessionUpdatePerf();
            this._pdsnipAddressSessionUpdatePerf = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getPdsnipAddressSessionUpdatePerf();
            this._a11SessionUpdateReceivedPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateReceivedPdsn();
            this._a11SessionUpdateAcceptedPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateAcceptedPdsn();
            this._a11SessionUpdateExtendedApipdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateExtendedApipdsn();
            this._a11SessionUpdateForUnknownPsipdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateForUnknownPsipdsn();
            this._a11SessionUpdateDeniedIdCheckFailPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateDeniedIdCheckFailPdsn();
            this._a11SessionUpdateDeniedAuthCheckFailPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateDeniedAuthCheckFailPdsn();
            this._a11SessionUpdateDeniedReasonUnspecifiedPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateDeniedReasonUnspecifiedPdsn();
            this._a11SessionUpdateDeniedPoorlyFormedPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateDeniedPoorlyFormedPdsn();
            this._a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateDeniedSessionParamsNotUpdatedPdsn();
            this._a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn();
            this._a11SessionUpdateDeniedInsufficientResourcesPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateDeniedInsufficientResourcesPdsn();
            this._a11SessionUpdateDeniedHandoffInProgressPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG)arg).getA11SessionUpdateDeniedHandoffInProgressPdsn();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getA11SessionUpdateAcceptedPdsn() {
        return _a11SessionUpdateAcceptedPdsn;
    }
    
    public BigInteger getA11SessionUpdateDeniedAuthCheckFailPdsn() {
        return _a11SessionUpdateDeniedAuthCheckFailPdsn;
    }
    
    public BigInteger getA11SessionUpdateDeniedHandoffInProgressPdsn() {
        return _a11SessionUpdateDeniedHandoffInProgressPdsn;
    }
    
    public BigInteger getA11SessionUpdateDeniedIdCheckFailPdsn() {
        return _a11SessionUpdateDeniedIdCheckFailPdsn;
    }
    
    public BigInteger getA11SessionUpdateDeniedInsufficientResourcesPdsn() {
        return _a11SessionUpdateDeniedInsufficientResourcesPdsn;
    }
    
    public BigInteger getA11SessionUpdateDeniedPoorlyFormedPdsn() {
        return _a11SessionUpdateDeniedPoorlyFormedPdsn;
    }
    
    public BigInteger getA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn() {
        return _a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn;
    }
    
    public BigInteger getA11SessionUpdateDeniedReasonUnspecifiedPdsn() {
        return _a11SessionUpdateDeniedReasonUnspecifiedPdsn;
    }
    
    public BigInteger getA11SessionUpdateDeniedSessionParamsNotUpdatedPdsn() {
        return _a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn;
    }
    
    public BigInteger getA11SessionUpdateExtendedApipdsn() {
        return _a11SessionUpdateExtendedApipdsn;
    }
    
    public BigInteger getA11SessionUpdateForUnknownPsipdsn() {
        return _a11SessionUpdateForUnknownPsipdsn;
    }
    
    public BigInteger getA11SessionUpdateReceivedPdsn() {
        return _a11SessionUpdateReceivedPdsn;
    }
    
    public java.lang.Long getPdsnNumberSessionUpdatePerf() {
        return _pdsnNumberSessionUpdatePerf;
    }
    
    public IpAddress getPdsnipAddressSessionUpdatePerf() {
        return _pdsnipAddressSessionUpdatePerf;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEACCEPTEDPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEACCEPTEDPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateAcceptedPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEACCEPTEDPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEACCEPTEDPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateAcceptedPdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateAcceptedPdsnRange(value);
    }
        this._a11SessionUpdateAcceptedPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEDENIEDAUTHCHECKFAILPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEDENIEDAUTHCHECKFAILPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateDeniedAuthCheckFailPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEDENIEDAUTHCHECKFAILPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEDENIEDAUTHCHECKFAILPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateDeniedAuthCheckFailPdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateDeniedAuthCheckFailPdsnRange(value);
    }
        this._a11SessionUpdateDeniedAuthCheckFailPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEDENIEDHANDOFFINPROGRESSPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEDENIEDHANDOFFINPROGRESSPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateDeniedHandoffInProgressPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEDENIEDHANDOFFINPROGRESSPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEDENIEDHANDOFFINPROGRESSPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateDeniedHandoffInProgressPdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateDeniedHandoffInProgressPdsnRange(value);
    }
        this._a11SessionUpdateDeniedHandoffInProgressPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEDENIEDIDCHECKFAILPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEDENIEDIDCHECKFAILPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateDeniedIdCheckFailPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEDENIEDIDCHECKFAILPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEDENIEDIDCHECKFAILPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateDeniedIdCheckFailPdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateDeniedIdCheckFailPdsnRange(value);
    }
        this._a11SessionUpdateDeniedIdCheckFailPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEDENIEDINSUFFICIENTRESOURCESPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEDENIEDINSUFFICIENTRESOURCESPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateDeniedInsufficientResourcesPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEDENIEDINSUFFICIENTRESOURCESPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEDENIEDINSUFFICIENTRESOURCESPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateDeniedInsufficientResourcesPdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateDeniedInsufficientResourcesPdsnRange(value);
    }
        this._a11SessionUpdateDeniedInsufficientResourcesPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEDENIEDPOORLYFORMEDPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEDENIEDPOORLYFORMEDPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateDeniedPoorlyFormedPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEDENIEDPOORLYFORMEDPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEDENIEDPOORLYFORMEDPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateDeniedPoorlyFormedPdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateDeniedPoorlyFormedPdsnRange(value);
    }
        this._a11SessionUpdateDeniedPoorlyFormedPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEDENIEDQOSPROFILEIDNOTSUPPORTEDPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEDENIEDQOSPROFILEIDNOTSUPPORTEDPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEDENIEDQOSPROFILEIDNOTSUPPORTEDPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEDENIEDQOSPROFILEIDNOTSUPPORTEDPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsnRange(value);
    }
        this._a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEDENIEDREASONUNSPECIFIEDPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEDENIEDREASONUNSPECIFIEDPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateDeniedReasonUnspecifiedPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEDENIEDREASONUNSPECIFIEDPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEDENIEDREASONUNSPECIFIEDPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateDeniedReasonUnspecifiedPdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateDeniedReasonUnspecifiedPdsnRange(value);
    }
        this._a11SessionUpdateDeniedReasonUnspecifiedPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEDENIEDSESSIONPARAMSNOTUPDATEDPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEDENIEDSESSIONPARAMSNOTUPDATEDPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateDeniedSessionParamsNotUpdatedPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEDENIEDSESSIONPARAMSNOTUPDATEDPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEDENIEDSESSIONPARAMSNOTUPDATEDPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateDeniedSessionParamsNotUpdatedPdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateDeniedSessionParamsNotUpdatedPdsnRange(value);
    }
        this._a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEEXTENDEDAPIPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEEXTENDEDAPIPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateExtendedApipdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEEXTENDEDAPIPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEEXTENDEDAPIPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateExtendedApipdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateExtendedApipdsnRange(value);
    }
        this._a11SessionUpdateExtendedApipdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATEFORUNKNOWNPSIPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATEFORUNKNOWNPSIPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateForUnknownPsipdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATEFORUNKNOWNPSIPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATEFORUNKNOWNPSIPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateForUnknownPsipdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateForUnknownPsipdsnRange(value);
    }
        this._a11SessionUpdateForUnknownPsipdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA11SESSIONUPDATERECEIVEDPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA11SESSIONUPDATERECEIVEDPDSNRANGE_RANGES = a;
     }
     private static void checkA11SessionUpdateReceivedPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA11SESSIONUPDATERECEIVEDPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA11SESSIONUPDATERECEIVEDPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setA11SessionUpdateReceivedPdsn(final BigInteger value) {
    if (value != null) {
        checkA11SessionUpdateReceivedPdsnRange(value);
    }
        this._a11SessionUpdateReceivedPdsn = value;
        return this;
    }
    
     
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setPdsnNumberSessionUpdatePerf(final java.lang.Long value) {
        this._pdsnNumberSessionUpdatePerf = value;
        return this;
    }
    
     
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder setPdsnipAddressSessionUpdatePerf(final IpAddress value) {
        this._pdsnipAddressSessionUpdatePerf = value;
        return this;
    }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdPcfpdsnA11SessionUpdateStats build() {
        return new Cdma2000HrpdPcfpdsnA11SessionUpdateStatsImpl(this);
    }

    private static final class Cdma2000HrpdPcfpdsnA11SessionUpdateStatsImpl implements Cdma2000HrpdPcfpdsnA11SessionUpdateStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats.class;
        }

        private final BigInteger _a11SessionUpdateAcceptedPdsn;
        private final BigInteger _a11SessionUpdateDeniedAuthCheckFailPdsn;
        private final BigInteger _a11SessionUpdateDeniedHandoffInProgressPdsn;
        private final BigInteger _a11SessionUpdateDeniedIdCheckFailPdsn;
        private final BigInteger _a11SessionUpdateDeniedInsufficientResourcesPdsn;
        private final BigInteger _a11SessionUpdateDeniedPoorlyFormedPdsn;
        private final BigInteger _a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn;
        private final BigInteger _a11SessionUpdateDeniedReasonUnspecifiedPdsn;
        private final BigInteger _a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn;
        private final BigInteger _a11SessionUpdateExtendedApipdsn;
        private final BigInteger _a11SessionUpdateForUnknownPsipdsn;
        private final BigInteger _a11SessionUpdateReceivedPdsn;
        private final java.lang.Long _pdsnNumberSessionUpdatePerf;
        private final IpAddress _pdsnipAddressSessionUpdatePerf;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdPcfpdsnA11SessionUpdateStatsImpl(Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder base) {
            this._a11SessionUpdateAcceptedPdsn = base.getA11SessionUpdateAcceptedPdsn();
            this._a11SessionUpdateDeniedAuthCheckFailPdsn = base.getA11SessionUpdateDeniedAuthCheckFailPdsn();
            this._a11SessionUpdateDeniedHandoffInProgressPdsn = base.getA11SessionUpdateDeniedHandoffInProgressPdsn();
            this._a11SessionUpdateDeniedIdCheckFailPdsn = base.getA11SessionUpdateDeniedIdCheckFailPdsn();
            this._a11SessionUpdateDeniedInsufficientResourcesPdsn = base.getA11SessionUpdateDeniedInsufficientResourcesPdsn();
            this._a11SessionUpdateDeniedPoorlyFormedPdsn = base.getA11SessionUpdateDeniedPoorlyFormedPdsn();
            this._a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn = base.getA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn();
            this._a11SessionUpdateDeniedReasonUnspecifiedPdsn = base.getA11SessionUpdateDeniedReasonUnspecifiedPdsn();
            this._a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn = base.getA11SessionUpdateDeniedSessionParamsNotUpdatedPdsn();
            this._a11SessionUpdateExtendedApipdsn = base.getA11SessionUpdateExtendedApipdsn();
            this._a11SessionUpdateForUnknownPsipdsn = base.getA11SessionUpdateForUnknownPsipdsn();
            this._a11SessionUpdateReceivedPdsn = base.getA11SessionUpdateReceivedPdsn();
            this._pdsnNumberSessionUpdatePerf = base.getPdsnNumberSessionUpdatePerf();
            this._pdsnipAddressSessionUpdatePerf = base.getPdsnipAddressSessionUpdatePerf();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getA11SessionUpdateAcceptedPdsn() {
            return _a11SessionUpdateAcceptedPdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateDeniedAuthCheckFailPdsn() {
            return _a11SessionUpdateDeniedAuthCheckFailPdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateDeniedHandoffInProgressPdsn() {
            return _a11SessionUpdateDeniedHandoffInProgressPdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateDeniedIdCheckFailPdsn() {
            return _a11SessionUpdateDeniedIdCheckFailPdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateDeniedInsufficientResourcesPdsn() {
            return _a11SessionUpdateDeniedInsufficientResourcesPdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateDeniedPoorlyFormedPdsn() {
            return _a11SessionUpdateDeniedPoorlyFormedPdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn() {
            return _a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateDeniedReasonUnspecifiedPdsn() {
            return _a11SessionUpdateDeniedReasonUnspecifiedPdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateDeniedSessionParamsNotUpdatedPdsn() {
            return _a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateExtendedApipdsn() {
            return _a11SessionUpdateExtendedApipdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateForUnknownPsipdsn() {
            return _a11SessionUpdateForUnknownPsipdsn;
        }
        
        @Override
        public BigInteger getA11SessionUpdateReceivedPdsn() {
            return _a11SessionUpdateReceivedPdsn;
        }
        
        @Override
        public java.lang.Long getPdsnNumberSessionUpdatePerf() {
            return _pdsnNumberSessionUpdatePerf;
        }
        
        @Override
        public IpAddress getPdsnipAddressSessionUpdatePerf() {
            return _pdsnipAddressSessionUpdatePerf;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_a11SessionUpdateAcceptedPdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateDeniedAuthCheckFailPdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateDeniedHandoffInProgressPdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateDeniedIdCheckFailPdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateDeniedInsufficientResourcesPdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateDeniedPoorlyFormedPdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateDeniedReasonUnspecifiedPdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateExtendedApipdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateForUnknownPsipdsn);
            result = prime * result + Objects.hashCode(_a11SessionUpdateReceivedPdsn);
            result = prime * result + Objects.hashCode(_pdsnNumberSessionUpdatePerf);
            result = prime * result + Objects.hashCode(_pdsnipAddressSessionUpdatePerf);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats)obj;
            if (!Objects.equals(_a11SessionUpdateAcceptedPdsn, other.getA11SessionUpdateAcceptedPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateDeniedAuthCheckFailPdsn, other.getA11SessionUpdateDeniedAuthCheckFailPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateDeniedHandoffInProgressPdsn, other.getA11SessionUpdateDeniedHandoffInProgressPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateDeniedIdCheckFailPdsn, other.getA11SessionUpdateDeniedIdCheckFailPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateDeniedInsufficientResourcesPdsn, other.getA11SessionUpdateDeniedInsufficientResourcesPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateDeniedPoorlyFormedPdsn, other.getA11SessionUpdateDeniedPoorlyFormedPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn, other.getA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateDeniedReasonUnspecifiedPdsn, other.getA11SessionUpdateDeniedReasonUnspecifiedPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn, other.getA11SessionUpdateDeniedSessionParamsNotUpdatedPdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateExtendedApipdsn, other.getA11SessionUpdateExtendedApipdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateForUnknownPsipdsn, other.getA11SessionUpdateForUnknownPsipdsn())) {
                return false;
            }
            if (!Objects.equals(_a11SessionUpdateReceivedPdsn, other.getA11SessionUpdateReceivedPdsn())) {
                return false;
            }
            if (!Objects.equals(_pdsnNumberSessionUpdatePerf, other.getPdsnNumberSessionUpdatePerf())) {
                return false;
            }
            if (!Objects.equals(_pdsnipAddressSessionUpdatePerf, other.getPdsnipAddressSessionUpdatePerf())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdPcfpdsnA11SessionUpdateStatsImpl otherImpl = (Cdma2000HrpdPcfpdsnA11SessionUpdateStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdPcfpdsnA11SessionUpdateStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_a11SessionUpdateAcceptedPdsn != null) {
                builder.append("_a11SessionUpdateAcceptedPdsn=");
                builder.append(_a11SessionUpdateAcceptedPdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateDeniedAuthCheckFailPdsn != null) {
                builder.append("_a11SessionUpdateDeniedAuthCheckFailPdsn=");
                builder.append(_a11SessionUpdateDeniedAuthCheckFailPdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateDeniedHandoffInProgressPdsn != null) {
                builder.append("_a11SessionUpdateDeniedHandoffInProgressPdsn=");
                builder.append(_a11SessionUpdateDeniedHandoffInProgressPdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateDeniedIdCheckFailPdsn != null) {
                builder.append("_a11SessionUpdateDeniedIdCheckFailPdsn=");
                builder.append(_a11SessionUpdateDeniedIdCheckFailPdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateDeniedInsufficientResourcesPdsn != null) {
                builder.append("_a11SessionUpdateDeniedInsufficientResourcesPdsn=");
                builder.append(_a11SessionUpdateDeniedInsufficientResourcesPdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateDeniedPoorlyFormedPdsn != null) {
                builder.append("_a11SessionUpdateDeniedPoorlyFormedPdsn=");
                builder.append(_a11SessionUpdateDeniedPoorlyFormedPdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn != null) {
                builder.append("_a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn=");
                builder.append(_a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateDeniedReasonUnspecifiedPdsn != null) {
                builder.append("_a11SessionUpdateDeniedReasonUnspecifiedPdsn=");
                builder.append(_a11SessionUpdateDeniedReasonUnspecifiedPdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn != null) {
                builder.append("_a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn=");
                builder.append(_a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateExtendedApipdsn != null) {
                builder.append("_a11SessionUpdateExtendedApipdsn=");
                builder.append(_a11SessionUpdateExtendedApipdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateForUnknownPsipdsn != null) {
                builder.append("_a11SessionUpdateForUnknownPsipdsn=");
                builder.append(_a11SessionUpdateForUnknownPsipdsn);
                builder.append(", ");
            }
            if (_a11SessionUpdateReceivedPdsn != null) {
                builder.append("_a11SessionUpdateReceivedPdsn=");
                builder.append(_a11SessionUpdateReceivedPdsn);
                builder.append(", ");
            }
            if (_pdsnNumberSessionUpdatePerf != null) {
                builder.append("_pdsnNumberSessionUpdatePerf=");
                builder.append(_pdsnNumberSessionUpdatePerf);
                builder.append(", ");
            }
            if (_pdsnipAddressSessionUpdatePerf != null) {
                builder.append("_pdsnipAddressSessionUpdatePerf=");
                builder.append(_pdsnipAddressSessionUpdatePerf);
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
