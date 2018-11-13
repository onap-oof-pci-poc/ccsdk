package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats
 *
 */
public class Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats> {

    private BigInteger _a10RegUpdateReceived;
    private BigInteger _a10SetupFailureAdminProhibit;
    private BigInteger _a10SetupFailureFailedAuth;
    private BigInteger _a10SetupFailureIdMismatch;
    private BigInteger _a10SetupFailureInsuffResources;
    private BigInteger _a10SetupFailureMalformedReq;
    private BigInteger _a10SetupFailureNoReason;
    private BigInteger _a10SetupFailureUnknownPdsn;
    private BigInteger _a10SetupFailureUnsuppVendId;
    private BigInteger _totalA10ClosedByPdsn;
    private BigInteger _totalA10ClosedByRnc;
    private BigInteger _totalA10DroppedPages;
    private BigInteger _totalA10EgressBytes;
    private BigInteger _totalA10FailedPages;
    private BigInteger _totalA10IngressBytes;
    private BigInteger _totalA10SuccessPages;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder() {
    }
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG arg) {
        this._a10SetupFailureNoReason = arg.getA10SetupFailureNoReason();
        this._a10SetupFailureAdminProhibit = arg.getA10SetupFailureAdminProhibit();
        this._a10SetupFailureInsuffResources = arg.getA10SetupFailureInsuffResources();
        this._a10SetupFailureFailedAuth = arg.getA10SetupFailureFailedAuth();
        this._a10SetupFailureIdMismatch = arg.getA10SetupFailureIdMismatch();
        this._a10SetupFailureMalformedReq = arg.getA10SetupFailureMalformedReq();
        this._a10SetupFailureUnknownPdsn = arg.getA10SetupFailureUnknownPdsn();
        this._a10SetupFailureUnsuppVendId = arg.getA10SetupFailureUnsuppVendId();
        this._totalA10ClosedByRnc = arg.getTotalA10ClosedByRnc();
        this._totalA10ClosedByPdsn = arg.getTotalA10ClosedByPdsn();
        this._totalA10SuccessPages = arg.getTotalA10SuccessPages();
        this._totalA10FailedPages = arg.getTotalA10FailedPages();
        this._totalA10IngressBytes = arg.getTotalA10IngressBytes();
        this._totalA10EgressBytes = arg.getTotalA10EgressBytes();
        this._a10RegUpdateReceived = arg.getA10RegUpdateReceived();
        this._totalA10DroppedPages = arg.getTotalA10DroppedPages();
    }

    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder(Cdma2000HrpdPcfConfigPcfPerformanceStats base) {
        this._a10RegUpdateReceived = base.getA10RegUpdateReceived();
        this._a10SetupFailureAdminProhibit = base.getA10SetupFailureAdminProhibit();
        this._a10SetupFailureFailedAuth = base.getA10SetupFailureFailedAuth();
        this._a10SetupFailureIdMismatch = base.getA10SetupFailureIdMismatch();
        this._a10SetupFailureInsuffResources = base.getA10SetupFailureInsuffResources();
        this._a10SetupFailureMalformedReq = base.getA10SetupFailureMalformedReq();
        this._a10SetupFailureNoReason = base.getA10SetupFailureNoReason();
        this._a10SetupFailureUnknownPdsn = base.getA10SetupFailureUnknownPdsn();
        this._a10SetupFailureUnsuppVendId = base.getA10SetupFailureUnsuppVendId();
        this._totalA10ClosedByPdsn = base.getTotalA10ClosedByPdsn();
        this._totalA10ClosedByRnc = base.getTotalA10ClosedByRnc();
        this._totalA10DroppedPages = base.getTotalA10DroppedPages();
        this._totalA10EgressBytes = base.getTotalA10EgressBytes();
        this._totalA10FailedPages = base.getTotalA10FailedPages();
        this._totalA10IngressBytes = base.getTotalA10IngressBytes();
        this._totalA10SuccessPages = base.getTotalA10SuccessPages();
        if (base instanceof Cdma2000HrpdPcfConfigPcfPerformanceStatsImpl) {
            Cdma2000HrpdPcfConfigPcfPerformanceStatsImpl impl = (Cdma2000HrpdPcfConfigPcfPerformanceStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG) {
            this._a10SetupFailureNoReason = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getA10SetupFailureNoReason();
            this._a10SetupFailureAdminProhibit = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getA10SetupFailureAdminProhibit();
            this._a10SetupFailureInsuffResources = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getA10SetupFailureInsuffResources();
            this._a10SetupFailureFailedAuth = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getA10SetupFailureFailedAuth();
            this._a10SetupFailureIdMismatch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getA10SetupFailureIdMismatch();
            this._a10SetupFailureMalformedReq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getA10SetupFailureMalformedReq();
            this._a10SetupFailureUnknownPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getA10SetupFailureUnknownPdsn();
            this._a10SetupFailureUnsuppVendId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getA10SetupFailureUnsuppVendId();
            this._totalA10ClosedByRnc = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getTotalA10ClosedByRnc();
            this._totalA10ClosedByPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getTotalA10ClosedByPdsn();
            this._totalA10SuccessPages = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getTotalA10SuccessPages();
            this._totalA10FailedPages = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getTotalA10FailedPages();
            this._totalA10IngressBytes = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getTotalA10IngressBytes();
            this._totalA10EgressBytes = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getTotalA10EgressBytes();
            this._a10RegUpdateReceived = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getA10RegUpdateReceived();
            this._totalA10DroppedPages = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG)arg).getTotalA10DroppedPages();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getA10RegUpdateReceived() {
        return _a10RegUpdateReceived;
    }
    
    public BigInteger getA10SetupFailureAdminProhibit() {
        return _a10SetupFailureAdminProhibit;
    }
    
    public BigInteger getA10SetupFailureFailedAuth() {
        return _a10SetupFailureFailedAuth;
    }
    
    public BigInteger getA10SetupFailureIdMismatch() {
        return _a10SetupFailureIdMismatch;
    }
    
    public BigInteger getA10SetupFailureInsuffResources() {
        return _a10SetupFailureInsuffResources;
    }
    
    public BigInteger getA10SetupFailureMalformedReq() {
        return _a10SetupFailureMalformedReq;
    }
    
    public BigInteger getA10SetupFailureNoReason() {
        return _a10SetupFailureNoReason;
    }
    
    public BigInteger getA10SetupFailureUnknownPdsn() {
        return _a10SetupFailureUnknownPdsn;
    }
    
    public BigInteger getA10SetupFailureUnsuppVendId() {
        return _a10SetupFailureUnsuppVendId;
    }
    
    public BigInteger getTotalA10ClosedByPdsn() {
        return _totalA10ClosedByPdsn;
    }
    
    public BigInteger getTotalA10ClosedByRnc() {
        return _totalA10ClosedByRnc;
    }
    
    public BigInteger getTotalA10DroppedPages() {
        return _totalA10DroppedPages;
    }
    
    public BigInteger getTotalA10EgressBytes() {
        return _totalA10EgressBytes;
    }
    
    public BigInteger getTotalA10FailedPages() {
        return _totalA10FailedPages;
    }
    
    public BigInteger getTotalA10IngressBytes() {
        return _totalA10IngressBytes;
    }
    
    public BigInteger getTotalA10SuccessPages() {
        return _totalA10SuccessPages;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10REGUPDATERECEIVEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10REGUPDATERECEIVEDRANGE_RANGES = a;
     }
     private static void checkA10RegUpdateReceivedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10REGUPDATERECEIVEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10REGUPDATERECEIVEDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setA10RegUpdateReceived(final BigInteger value) {
    if (value != null) {
        checkA10RegUpdateReceivedRange(value);
    }
        this._a10RegUpdateReceived = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPFAILUREADMINPROHIBITRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPFAILUREADMINPROHIBITRANGE_RANGES = a;
     }
     private static void checkA10SetupFailureAdminProhibitRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPFAILUREADMINPROHIBITRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPFAILUREADMINPROHIBITRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setA10SetupFailureAdminProhibit(final BigInteger value) {
    if (value != null) {
        checkA10SetupFailureAdminProhibitRange(value);
    }
        this._a10SetupFailureAdminProhibit = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPFAILUREFAILEDAUTHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPFAILUREFAILEDAUTHRANGE_RANGES = a;
     }
     private static void checkA10SetupFailureFailedAuthRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPFAILUREFAILEDAUTHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPFAILUREFAILEDAUTHRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setA10SetupFailureFailedAuth(final BigInteger value) {
    if (value != null) {
        checkA10SetupFailureFailedAuthRange(value);
    }
        this._a10SetupFailureFailedAuth = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPFAILUREIDMISMATCHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPFAILUREIDMISMATCHRANGE_RANGES = a;
     }
     private static void checkA10SetupFailureIdMismatchRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPFAILUREIDMISMATCHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPFAILUREIDMISMATCHRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setA10SetupFailureIdMismatch(final BigInteger value) {
    if (value != null) {
        checkA10SetupFailureIdMismatchRange(value);
    }
        this._a10SetupFailureIdMismatch = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPFAILUREINSUFFRESOURCESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPFAILUREINSUFFRESOURCESRANGE_RANGES = a;
     }
     private static void checkA10SetupFailureInsuffResourcesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPFAILUREINSUFFRESOURCESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPFAILUREINSUFFRESOURCESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setA10SetupFailureInsuffResources(final BigInteger value) {
    if (value != null) {
        checkA10SetupFailureInsuffResourcesRange(value);
    }
        this._a10SetupFailureInsuffResources = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPFAILUREMALFORMEDREQRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPFAILUREMALFORMEDREQRANGE_RANGES = a;
     }
     private static void checkA10SetupFailureMalformedReqRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPFAILUREMALFORMEDREQRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPFAILUREMALFORMEDREQRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setA10SetupFailureMalformedReq(final BigInteger value) {
    if (value != null) {
        checkA10SetupFailureMalformedReqRange(value);
    }
        this._a10SetupFailureMalformedReq = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPFAILURENOREASONRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPFAILURENOREASONRANGE_RANGES = a;
     }
     private static void checkA10SetupFailureNoReasonRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPFAILURENOREASONRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPFAILURENOREASONRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setA10SetupFailureNoReason(final BigInteger value) {
    if (value != null) {
        checkA10SetupFailureNoReasonRange(value);
    }
        this._a10SetupFailureNoReason = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPFAILUREUNKNOWNPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPFAILUREUNKNOWNPDSNRANGE_RANGES = a;
     }
     private static void checkA10SetupFailureUnknownPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPFAILUREUNKNOWNPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPFAILUREUNKNOWNPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setA10SetupFailureUnknownPdsn(final BigInteger value) {
    if (value != null) {
        checkA10SetupFailureUnknownPdsnRange(value);
    }
        this._a10SetupFailureUnknownPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKA10SETUPFAILUREUNSUPPVENDIDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKA10SETUPFAILUREUNSUPPVENDIDRANGE_RANGES = a;
     }
     private static void checkA10SetupFailureUnsuppVendIdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKA10SETUPFAILUREUNSUPPVENDIDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKA10SETUPFAILUREUNSUPPVENDIDRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setA10SetupFailureUnsuppVendId(final BigInteger value) {
    if (value != null) {
        checkA10SetupFailureUnsuppVendIdRange(value);
    }
        this._a10SetupFailureUnsuppVendId = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTOTALA10CLOSEDBYPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTOTALA10CLOSEDBYPDSNRANGE_RANGES = a;
     }
     private static void checkTotalA10ClosedByPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTOTALA10CLOSEDBYPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTOTALA10CLOSEDBYPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setTotalA10ClosedByPdsn(final BigInteger value) {
    if (value != null) {
        checkTotalA10ClosedByPdsnRange(value);
    }
        this._totalA10ClosedByPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTOTALA10CLOSEDBYRNCRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTOTALA10CLOSEDBYRNCRANGE_RANGES = a;
     }
     private static void checkTotalA10ClosedByRncRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTOTALA10CLOSEDBYRNCRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTOTALA10CLOSEDBYRNCRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setTotalA10ClosedByRnc(final BigInteger value) {
    if (value != null) {
        checkTotalA10ClosedByRncRange(value);
    }
        this._totalA10ClosedByRnc = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTOTALA10DROPPEDPAGESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTOTALA10DROPPEDPAGESRANGE_RANGES = a;
     }
     private static void checkTotalA10DroppedPagesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTOTALA10DROPPEDPAGESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTOTALA10DROPPEDPAGESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setTotalA10DroppedPages(final BigInteger value) {
    if (value != null) {
        checkTotalA10DroppedPagesRange(value);
    }
        this._totalA10DroppedPages = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTOTALA10EGRESSBYTESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTOTALA10EGRESSBYTESRANGE_RANGES = a;
     }
     private static void checkTotalA10EgressBytesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTOTALA10EGRESSBYTESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTOTALA10EGRESSBYTESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setTotalA10EgressBytes(final BigInteger value) {
    if (value != null) {
        checkTotalA10EgressBytesRange(value);
    }
        this._totalA10EgressBytes = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTOTALA10FAILEDPAGESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTOTALA10FAILEDPAGESRANGE_RANGES = a;
     }
     private static void checkTotalA10FailedPagesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTOTALA10FAILEDPAGESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTOTALA10FAILEDPAGESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setTotalA10FailedPages(final BigInteger value) {
    if (value != null) {
        checkTotalA10FailedPagesRange(value);
    }
        this._totalA10FailedPages = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTOTALA10INGRESSBYTESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTOTALA10INGRESSBYTESRANGE_RANGES = a;
     }
     private static void checkTotalA10IngressBytesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTOTALA10INGRESSBYTESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTOTALA10INGRESSBYTESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setTotalA10IngressBytes(final BigInteger value) {
    if (value != null) {
        checkTotalA10IngressBytesRange(value);
    }
        this._totalA10IngressBytes = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTOTALA10SUCCESSPAGESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTOTALA10SUCCESSPAGESRANGE_RANGES = a;
     }
     private static void checkTotalA10SuccessPagesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTOTALA10SUCCESSPAGESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTOTALA10SUCCESSPAGESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder setTotalA10SuccessPages(final BigInteger value) {
    if (value != null) {
        checkTotalA10SuccessPagesRange(value);
    }
        this._totalA10SuccessPages = value;
        return this;
    }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdPcfConfigPcfPerformanceStats build() {
        return new Cdma2000HrpdPcfConfigPcfPerformanceStatsImpl(this);
    }

    private static final class Cdma2000HrpdPcfConfigPcfPerformanceStatsImpl implements Cdma2000HrpdPcfConfigPcfPerformanceStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats.class;
        }

        private final BigInteger _a10RegUpdateReceived;
        private final BigInteger _a10SetupFailureAdminProhibit;
        private final BigInteger _a10SetupFailureFailedAuth;
        private final BigInteger _a10SetupFailureIdMismatch;
        private final BigInteger _a10SetupFailureInsuffResources;
        private final BigInteger _a10SetupFailureMalformedReq;
        private final BigInteger _a10SetupFailureNoReason;
        private final BigInteger _a10SetupFailureUnknownPdsn;
        private final BigInteger _a10SetupFailureUnsuppVendId;
        private final BigInteger _totalA10ClosedByPdsn;
        private final BigInteger _totalA10ClosedByRnc;
        private final BigInteger _totalA10DroppedPages;
        private final BigInteger _totalA10EgressBytes;
        private final BigInteger _totalA10FailedPages;
        private final BigInteger _totalA10IngressBytes;
        private final BigInteger _totalA10SuccessPages;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdPcfConfigPcfPerformanceStatsImpl(Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder base) {
            this._a10RegUpdateReceived = base.getA10RegUpdateReceived();
            this._a10SetupFailureAdminProhibit = base.getA10SetupFailureAdminProhibit();
            this._a10SetupFailureFailedAuth = base.getA10SetupFailureFailedAuth();
            this._a10SetupFailureIdMismatch = base.getA10SetupFailureIdMismatch();
            this._a10SetupFailureInsuffResources = base.getA10SetupFailureInsuffResources();
            this._a10SetupFailureMalformedReq = base.getA10SetupFailureMalformedReq();
            this._a10SetupFailureNoReason = base.getA10SetupFailureNoReason();
            this._a10SetupFailureUnknownPdsn = base.getA10SetupFailureUnknownPdsn();
            this._a10SetupFailureUnsuppVendId = base.getA10SetupFailureUnsuppVendId();
            this._totalA10ClosedByPdsn = base.getTotalA10ClosedByPdsn();
            this._totalA10ClosedByRnc = base.getTotalA10ClosedByRnc();
            this._totalA10DroppedPages = base.getTotalA10DroppedPages();
            this._totalA10EgressBytes = base.getTotalA10EgressBytes();
            this._totalA10FailedPages = base.getTotalA10FailedPages();
            this._totalA10IngressBytes = base.getTotalA10IngressBytes();
            this._totalA10SuccessPages = base.getTotalA10SuccessPages();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getA10RegUpdateReceived() {
            return _a10RegUpdateReceived;
        }
        
        @Override
        public BigInteger getA10SetupFailureAdminProhibit() {
            return _a10SetupFailureAdminProhibit;
        }
        
        @Override
        public BigInteger getA10SetupFailureFailedAuth() {
            return _a10SetupFailureFailedAuth;
        }
        
        @Override
        public BigInteger getA10SetupFailureIdMismatch() {
            return _a10SetupFailureIdMismatch;
        }
        
        @Override
        public BigInteger getA10SetupFailureInsuffResources() {
            return _a10SetupFailureInsuffResources;
        }
        
        @Override
        public BigInteger getA10SetupFailureMalformedReq() {
            return _a10SetupFailureMalformedReq;
        }
        
        @Override
        public BigInteger getA10SetupFailureNoReason() {
            return _a10SetupFailureNoReason;
        }
        
        @Override
        public BigInteger getA10SetupFailureUnknownPdsn() {
            return _a10SetupFailureUnknownPdsn;
        }
        
        @Override
        public BigInteger getA10SetupFailureUnsuppVendId() {
            return _a10SetupFailureUnsuppVendId;
        }
        
        @Override
        public BigInteger getTotalA10ClosedByPdsn() {
            return _totalA10ClosedByPdsn;
        }
        
        @Override
        public BigInteger getTotalA10ClosedByRnc() {
            return _totalA10ClosedByRnc;
        }
        
        @Override
        public BigInteger getTotalA10DroppedPages() {
            return _totalA10DroppedPages;
        }
        
        @Override
        public BigInteger getTotalA10EgressBytes() {
            return _totalA10EgressBytes;
        }
        
        @Override
        public BigInteger getTotalA10FailedPages() {
            return _totalA10FailedPages;
        }
        
        @Override
        public BigInteger getTotalA10IngressBytes() {
            return _totalA10IngressBytes;
        }
        
        @Override
        public BigInteger getTotalA10SuccessPages() {
            return _totalA10SuccessPages;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_a10RegUpdateReceived);
            result = prime * result + Objects.hashCode(_a10SetupFailureAdminProhibit);
            result = prime * result + Objects.hashCode(_a10SetupFailureFailedAuth);
            result = prime * result + Objects.hashCode(_a10SetupFailureIdMismatch);
            result = prime * result + Objects.hashCode(_a10SetupFailureInsuffResources);
            result = prime * result + Objects.hashCode(_a10SetupFailureMalformedReq);
            result = prime * result + Objects.hashCode(_a10SetupFailureNoReason);
            result = prime * result + Objects.hashCode(_a10SetupFailureUnknownPdsn);
            result = prime * result + Objects.hashCode(_a10SetupFailureUnsuppVendId);
            result = prime * result + Objects.hashCode(_totalA10ClosedByPdsn);
            result = prime * result + Objects.hashCode(_totalA10ClosedByRnc);
            result = prime * result + Objects.hashCode(_totalA10DroppedPages);
            result = prime * result + Objects.hashCode(_totalA10EgressBytes);
            result = prime * result + Objects.hashCode(_totalA10FailedPages);
            result = prime * result + Objects.hashCode(_totalA10IngressBytes);
            result = prime * result + Objects.hashCode(_totalA10SuccessPages);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats)obj;
            if (!Objects.equals(_a10RegUpdateReceived, other.getA10RegUpdateReceived())) {
                return false;
            }
            if (!Objects.equals(_a10SetupFailureAdminProhibit, other.getA10SetupFailureAdminProhibit())) {
                return false;
            }
            if (!Objects.equals(_a10SetupFailureFailedAuth, other.getA10SetupFailureFailedAuth())) {
                return false;
            }
            if (!Objects.equals(_a10SetupFailureIdMismatch, other.getA10SetupFailureIdMismatch())) {
                return false;
            }
            if (!Objects.equals(_a10SetupFailureInsuffResources, other.getA10SetupFailureInsuffResources())) {
                return false;
            }
            if (!Objects.equals(_a10SetupFailureMalformedReq, other.getA10SetupFailureMalformedReq())) {
                return false;
            }
            if (!Objects.equals(_a10SetupFailureNoReason, other.getA10SetupFailureNoReason())) {
                return false;
            }
            if (!Objects.equals(_a10SetupFailureUnknownPdsn, other.getA10SetupFailureUnknownPdsn())) {
                return false;
            }
            if (!Objects.equals(_a10SetupFailureUnsuppVendId, other.getA10SetupFailureUnsuppVendId())) {
                return false;
            }
            if (!Objects.equals(_totalA10ClosedByPdsn, other.getTotalA10ClosedByPdsn())) {
                return false;
            }
            if (!Objects.equals(_totalA10ClosedByRnc, other.getTotalA10ClosedByRnc())) {
                return false;
            }
            if (!Objects.equals(_totalA10DroppedPages, other.getTotalA10DroppedPages())) {
                return false;
            }
            if (!Objects.equals(_totalA10EgressBytes, other.getTotalA10EgressBytes())) {
                return false;
            }
            if (!Objects.equals(_totalA10FailedPages, other.getTotalA10FailedPages())) {
                return false;
            }
            if (!Objects.equals(_totalA10IngressBytes, other.getTotalA10IngressBytes())) {
                return false;
            }
            if (!Objects.equals(_totalA10SuccessPages, other.getTotalA10SuccessPages())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdPcfConfigPcfPerformanceStatsImpl otherImpl = (Cdma2000HrpdPcfConfigPcfPerformanceStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdPcfConfigPcfPerformanceStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_a10RegUpdateReceived != null) {
                builder.append("_a10RegUpdateReceived=");
                builder.append(_a10RegUpdateReceived);
                builder.append(", ");
            }
            if (_a10SetupFailureAdminProhibit != null) {
                builder.append("_a10SetupFailureAdminProhibit=");
                builder.append(_a10SetupFailureAdminProhibit);
                builder.append(", ");
            }
            if (_a10SetupFailureFailedAuth != null) {
                builder.append("_a10SetupFailureFailedAuth=");
                builder.append(_a10SetupFailureFailedAuth);
                builder.append(", ");
            }
            if (_a10SetupFailureIdMismatch != null) {
                builder.append("_a10SetupFailureIdMismatch=");
                builder.append(_a10SetupFailureIdMismatch);
                builder.append(", ");
            }
            if (_a10SetupFailureInsuffResources != null) {
                builder.append("_a10SetupFailureInsuffResources=");
                builder.append(_a10SetupFailureInsuffResources);
                builder.append(", ");
            }
            if (_a10SetupFailureMalformedReq != null) {
                builder.append("_a10SetupFailureMalformedReq=");
                builder.append(_a10SetupFailureMalformedReq);
                builder.append(", ");
            }
            if (_a10SetupFailureNoReason != null) {
                builder.append("_a10SetupFailureNoReason=");
                builder.append(_a10SetupFailureNoReason);
                builder.append(", ");
            }
            if (_a10SetupFailureUnknownPdsn != null) {
                builder.append("_a10SetupFailureUnknownPdsn=");
                builder.append(_a10SetupFailureUnknownPdsn);
                builder.append(", ");
            }
            if (_a10SetupFailureUnsuppVendId != null) {
                builder.append("_a10SetupFailureUnsuppVendId=");
                builder.append(_a10SetupFailureUnsuppVendId);
                builder.append(", ");
            }
            if (_totalA10ClosedByPdsn != null) {
                builder.append("_totalA10ClosedByPdsn=");
                builder.append(_totalA10ClosedByPdsn);
                builder.append(", ");
            }
            if (_totalA10ClosedByRnc != null) {
                builder.append("_totalA10ClosedByRnc=");
                builder.append(_totalA10ClosedByRnc);
                builder.append(", ");
            }
            if (_totalA10DroppedPages != null) {
                builder.append("_totalA10DroppedPages=");
                builder.append(_totalA10DroppedPages);
                builder.append(", ");
            }
            if (_totalA10EgressBytes != null) {
                builder.append("_totalA10EgressBytes=");
                builder.append(_totalA10EgressBytes);
                builder.append(", ");
            }
            if (_totalA10FailedPages != null) {
                builder.append("_totalA10FailedPages=");
                builder.append(_totalA10FailedPages);
                builder.append(", ");
            }
            if (_totalA10IngressBytes != null) {
                builder.append("_totalA10IngressBytes=");
                builder.append(_totalA10IngressBytes);
                builder.append(", ");
            }
            if (_totalA10SuccessPages != null) {
                builder.append("_totalA10SuccessPages=");
                builder.append(_totalA10SuccessPages);
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
