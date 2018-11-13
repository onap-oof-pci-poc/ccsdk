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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats
 *
 */
public class Cdma2000HrpdRncSigAppsStatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats> {

    private BigInteger _cNumConnectionSetupAttempts;
    private BigInteger _cNumConnectionSetupSuccess;
    private BigInteger _cNumMiscDropsDueToRlp;
    private BigInteger _cNumMiscDropsInternalError;
    private BigInteger _cNumMiscDropsSectorDown;
    private BigInteger _cNumMiscDropsStateMismatch;
    private BigInteger _cNumNetworkErrorDrops;
    private BigInteger _cNumNetworkErrorDropsA10SetupFail;
    private BigInteger _cNumNetworkErrorDropsRncExternal;
    private BigInteger _cNumNetworkErrorDropsRncInternal;
    private BigInteger _cNumNormalConnectionCloses;
    private BigInteger _cNumPageRequests;
    private BigInteger _cNumPageResponses;
    private BigInteger _cNumRfRelatedDrops;
    private BigInteger _cNumRfRelatedDropsNoFtc;
    private BigInteger _cNumRfRelatedDropsRtcLost;
    private BigInteger _cNumTotalConnectionCloses;
    private BigInteger _sNumConnectionSetupAttempts;
    private BigInteger _sNumConnectionSetupSuccess;
    private BigInteger _sNumMiscDropsDueToRlp;
    private BigInteger _sNumMiscDropsInternalError;
    private BigInteger _sNumMiscDropsSectorDown;
    private BigInteger _sNumMiscDropsStateMismatch;
    private BigInteger _sNumNetworkErrorDrops;
    private BigInteger _sNumNetworkErrorDropsA10SetupFail;
    private BigInteger _sNumNetworkErrorDropsRncExternal;
    private BigInteger _sNumNetworkErrorDropsRncInternal;
    private BigInteger _sNumNormalConnectionCloses;
    private BigInteger _sNumPageRequests;
    private BigInteger _sNumPageResponses;
    private BigInteger _sNumRfRelatedDrops;
    private BigInteger _sNumRfRelatedDropsNoFtc;
    private BigInteger _sNumRfRelatedDropsRtcLost;
    private BigInteger _sNumTotalConnectionCloses;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdRncSigAppsStatsBuilder() {
    }
    public Cdma2000HrpdRncSigAppsStatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG arg) {
        this._cNumPageRequests = arg.getCNumPageRequests();
        this._sNumPageRequests = arg.getSNumPageRequests();
        this._sNumConnectionSetupAttempts = arg.getSNumConnectionSetupAttempts();
        this._cNumConnectionSetupAttempts = arg.getCNumConnectionSetupAttempts();
        this._sNumConnectionSetupSuccess = arg.getSNumConnectionSetupSuccess();
        this._cNumConnectionSetupSuccess = arg.getCNumConnectionSetupSuccess();
        this._sNumNormalConnectionCloses = arg.getSNumNormalConnectionCloses();
        this._cNumNormalConnectionCloses = arg.getCNumNormalConnectionCloses();
        this._sNumTotalConnectionCloses = arg.getSNumTotalConnectionCloses();
        this._cNumTotalConnectionCloses = arg.getCNumTotalConnectionCloses();
        this._sNumRfRelatedDrops = arg.getSNumRfRelatedDrops();
        this._cNumRfRelatedDrops = arg.getCNumRfRelatedDrops();
        this._sNumPageResponses = arg.getSNumPageResponses();
        this._cNumPageResponses = arg.getCNumPageResponses();
        this._sNumRfRelatedDropsRtcLost = arg.getSNumRfRelatedDropsRtcLost();
        this._cNumRfRelatedDropsRtcLost = arg.getCNumRfRelatedDropsRtcLost();
        this._sNumRfRelatedDropsNoFtc = arg.getSNumRfRelatedDropsNoFtc();
        this._cNumRfRelatedDropsNoFtc = arg.getCNumRfRelatedDropsNoFtc();
        this._sNumNetworkErrorDrops = arg.getSNumNetworkErrorDrops();
        this._cNumNetworkErrorDrops = arg.getCNumNetworkErrorDrops();
        this._sNumNetworkErrorDropsRncInternal = arg.getSNumNetworkErrorDropsRncInternal();
        this._cNumNetworkErrorDropsRncInternal = arg.getCNumNetworkErrorDropsRncInternal();
        this._sNumNetworkErrorDropsRncExternal = arg.getSNumNetworkErrorDropsRncExternal();
        this._cNumNetworkErrorDropsRncExternal = arg.getCNumNetworkErrorDropsRncExternal();
        this._sNumNetworkErrorDropsA10SetupFail = arg.getSNumNetworkErrorDropsA10SetupFail();
        this._cNumNetworkErrorDropsA10SetupFail = arg.getCNumNetworkErrorDropsA10SetupFail();
        this._sNumMiscDropsSectorDown = arg.getSNumMiscDropsSectorDown();
        this._cNumMiscDropsSectorDown = arg.getCNumMiscDropsSectorDown();
        this._sNumMiscDropsInternalError = arg.getSNumMiscDropsInternalError();
        this._cNumMiscDropsInternalError = arg.getCNumMiscDropsInternalError();
        this._cNumMiscDropsStateMismatch = arg.getCNumMiscDropsStateMismatch();
        this._sNumMiscDropsStateMismatch = arg.getSNumMiscDropsStateMismatch();
        this._sNumMiscDropsDueToRlp = arg.getSNumMiscDropsDueToRlp();
        this._cNumMiscDropsDueToRlp = arg.getCNumMiscDropsDueToRlp();
    }

    public Cdma2000HrpdRncSigAppsStatsBuilder(Cdma2000HrpdRncSigAppsStats base) {
        this._cNumConnectionSetupAttempts = base.getCNumConnectionSetupAttempts();
        this._cNumConnectionSetupSuccess = base.getCNumConnectionSetupSuccess();
        this._cNumMiscDropsDueToRlp = base.getCNumMiscDropsDueToRlp();
        this._cNumMiscDropsInternalError = base.getCNumMiscDropsInternalError();
        this._cNumMiscDropsSectorDown = base.getCNumMiscDropsSectorDown();
        this._cNumMiscDropsStateMismatch = base.getCNumMiscDropsStateMismatch();
        this._cNumNetworkErrorDrops = base.getCNumNetworkErrorDrops();
        this._cNumNetworkErrorDropsA10SetupFail = base.getCNumNetworkErrorDropsA10SetupFail();
        this._cNumNetworkErrorDropsRncExternal = base.getCNumNetworkErrorDropsRncExternal();
        this._cNumNetworkErrorDropsRncInternal = base.getCNumNetworkErrorDropsRncInternal();
        this._cNumNormalConnectionCloses = base.getCNumNormalConnectionCloses();
        this._cNumPageRequests = base.getCNumPageRequests();
        this._cNumPageResponses = base.getCNumPageResponses();
        this._cNumRfRelatedDrops = base.getCNumRfRelatedDrops();
        this._cNumRfRelatedDropsNoFtc = base.getCNumRfRelatedDropsNoFtc();
        this._cNumRfRelatedDropsRtcLost = base.getCNumRfRelatedDropsRtcLost();
        this._cNumTotalConnectionCloses = base.getCNumTotalConnectionCloses();
        this._sNumConnectionSetupAttempts = base.getSNumConnectionSetupAttempts();
        this._sNumConnectionSetupSuccess = base.getSNumConnectionSetupSuccess();
        this._sNumMiscDropsDueToRlp = base.getSNumMiscDropsDueToRlp();
        this._sNumMiscDropsInternalError = base.getSNumMiscDropsInternalError();
        this._sNumMiscDropsSectorDown = base.getSNumMiscDropsSectorDown();
        this._sNumMiscDropsStateMismatch = base.getSNumMiscDropsStateMismatch();
        this._sNumNetworkErrorDrops = base.getSNumNetworkErrorDrops();
        this._sNumNetworkErrorDropsA10SetupFail = base.getSNumNetworkErrorDropsA10SetupFail();
        this._sNumNetworkErrorDropsRncExternal = base.getSNumNetworkErrorDropsRncExternal();
        this._sNumNetworkErrorDropsRncInternal = base.getSNumNetworkErrorDropsRncInternal();
        this._sNumNormalConnectionCloses = base.getSNumNormalConnectionCloses();
        this._sNumPageRequests = base.getSNumPageRequests();
        this._sNumPageResponses = base.getSNumPageResponses();
        this._sNumRfRelatedDrops = base.getSNumRfRelatedDrops();
        this._sNumRfRelatedDropsNoFtc = base.getSNumRfRelatedDropsNoFtc();
        this._sNumRfRelatedDropsRtcLost = base.getSNumRfRelatedDropsRtcLost();
        this._sNumTotalConnectionCloses = base.getSNumTotalConnectionCloses();
        if (base instanceof Cdma2000HrpdRncSigAppsStatsImpl) {
            Cdma2000HrpdRncSigAppsStatsImpl impl = (Cdma2000HrpdRncSigAppsStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG) {
            this._cNumPageRequests = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumPageRequests();
            this._sNumPageRequests = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumPageRequests();
            this._sNumConnectionSetupAttempts = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumConnectionSetupAttempts();
            this._cNumConnectionSetupAttempts = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumConnectionSetupAttempts();
            this._sNumConnectionSetupSuccess = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumConnectionSetupSuccess();
            this._cNumConnectionSetupSuccess = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumConnectionSetupSuccess();
            this._sNumNormalConnectionCloses = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumNormalConnectionCloses();
            this._cNumNormalConnectionCloses = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumNormalConnectionCloses();
            this._sNumTotalConnectionCloses = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumTotalConnectionCloses();
            this._cNumTotalConnectionCloses = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumTotalConnectionCloses();
            this._sNumRfRelatedDrops = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumRfRelatedDrops();
            this._cNumRfRelatedDrops = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumRfRelatedDrops();
            this._sNumPageResponses = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumPageResponses();
            this._cNumPageResponses = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumPageResponses();
            this._sNumRfRelatedDropsRtcLost = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumRfRelatedDropsRtcLost();
            this._cNumRfRelatedDropsRtcLost = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumRfRelatedDropsRtcLost();
            this._sNumRfRelatedDropsNoFtc = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumRfRelatedDropsNoFtc();
            this._cNumRfRelatedDropsNoFtc = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumRfRelatedDropsNoFtc();
            this._sNumNetworkErrorDrops = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumNetworkErrorDrops();
            this._cNumNetworkErrorDrops = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumNetworkErrorDrops();
            this._sNumNetworkErrorDropsRncInternal = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumNetworkErrorDropsRncInternal();
            this._cNumNetworkErrorDropsRncInternal = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumNetworkErrorDropsRncInternal();
            this._sNumNetworkErrorDropsRncExternal = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumNetworkErrorDropsRncExternal();
            this._cNumNetworkErrorDropsRncExternal = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumNetworkErrorDropsRncExternal();
            this._sNumNetworkErrorDropsA10SetupFail = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumNetworkErrorDropsA10SetupFail();
            this._cNumNetworkErrorDropsA10SetupFail = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumNetworkErrorDropsA10SetupFail();
            this._sNumMiscDropsSectorDown = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumMiscDropsSectorDown();
            this._cNumMiscDropsSectorDown = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumMiscDropsSectorDown();
            this._sNumMiscDropsInternalError = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumMiscDropsInternalError();
            this._cNumMiscDropsInternalError = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumMiscDropsInternalError();
            this._cNumMiscDropsStateMismatch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumMiscDropsStateMismatch();
            this._sNumMiscDropsStateMismatch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumMiscDropsStateMismatch();
            this._sNumMiscDropsDueToRlp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getSNumMiscDropsDueToRlp();
            this._cNumMiscDropsDueToRlp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG)arg).getCNumMiscDropsDueToRlp();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getCNumConnectionSetupAttempts() {
        return _cNumConnectionSetupAttempts;
    }
    
    public BigInteger getCNumConnectionSetupSuccess() {
        return _cNumConnectionSetupSuccess;
    }
    
    public BigInteger getCNumMiscDropsDueToRlp() {
        return _cNumMiscDropsDueToRlp;
    }
    
    public BigInteger getCNumMiscDropsInternalError() {
        return _cNumMiscDropsInternalError;
    }
    
    public BigInteger getCNumMiscDropsSectorDown() {
        return _cNumMiscDropsSectorDown;
    }
    
    public BigInteger getCNumMiscDropsStateMismatch() {
        return _cNumMiscDropsStateMismatch;
    }
    
    public BigInteger getCNumNetworkErrorDrops() {
        return _cNumNetworkErrorDrops;
    }
    
    public BigInteger getCNumNetworkErrorDropsA10SetupFail() {
        return _cNumNetworkErrorDropsA10SetupFail;
    }
    
    public BigInteger getCNumNetworkErrorDropsRncExternal() {
        return _cNumNetworkErrorDropsRncExternal;
    }
    
    public BigInteger getCNumNetworkErrorDropsRncInternal() {
        return _cNumNetworkErrorDropsRncInternal;
    }
    
    public BigInteger getCNumNormalConnectionCloses() {
        return _cNumNormalConnectionCloses;
    }
    
    public BigInteger getCNumPageRequests() {
        return _cNumPageRequests;
    }
    
    public BigInteger getCNumPageResponses() {
        return _cNumPageResponses;
    }
    
    public BigInteger getCNumRfRelatedDrops() {
        return _cNumRfRelatedDrops;
    }
    
    public BigInteger getCNumRfRelatedDropsNoFtc() {
        return _cNumRfRelatedDropsNoFtc;
    }
    
    public BigInteger getCNumRfRelatedDropsRtcLost() {
        return _cNumRfRelatedDropsRtcLost;
    }
    
    public BigInteger getCNumTotalConnectionCloses() {
        return _cNumTotalConnectionCloses;
    }
    
    public BigInteger getSNumConnectionSetupAttempts() {
        return _sNumConnectionSetupAttempts;
    }
    
    public BigInteger getSNumConnectionSetupSuccess() {
        return _sNumConnectionSetupSuccess;
    }
    
    public BigInteger getSNumMiscDropsDueToRlp() {
        return _sNumMiscDropsDueToRlp;
    }
    
    public BigInteger getSNumMiscDropsInternalError() {
        return _sNumMiscDropsInternalError;
    }
    
    public BigInteger getSNumMiscDropsSectorDown() {
        return _sNumMiscDropsSectorDown;
    }
    
    public BigInteger getSNumMiscDropsStateMismatch() {
        return _sNumMiscDropsStateMismatch;
    }
    
    public BigInteger getSNumNetworkErrorDrops() {
        return _sNumNetworkErrorDrops;
    }
    
    public BigInteger getSNumNetworkErrorDropsA10SetupFail() {
        return _sNumNetworkErrorDropsA10SetupFail;
    }
    
    public BigInteger getSNumNetworkErrorDropsRncExternal() {
        return _sNumNetworkErrorDropsRncExternal;
    }
    
    public BigInteger getSNumNetworkErrorDropsRncInternal() {
        return _sNumNetworkErrorDropsRncInternal;
    }
    
    public BigInteger getSNumNormalConnectionCloses() {
        return _sNumNormalConnectionCloses;
    }
    
    public BigInteger getSNumPageRequests() {
        return _sNumPageRequests;
    }
    
    public BigInteger getSNumPageResponses() {
        return _sNumPageResponses;
    }
    
    public BigInteger getSNumRfRelatedDrops() {
        return _sNumRfRelatedDrops;
    }
    
    public BigInteger getSNumRfRelatedDropsNoFtc() {
        return _sNumRfRelatedDropsNoFtc;
    }
    
    public BigInteger getSNumRfRelatedDropsRtcLost() {
        return _sNumRfRelatedDropsRtcLost;
    }
    
    public BigInteger getSNumTotalConnectionCloses() {
        return _sNumTotalConnectionCloses;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMCONNECTIONSETUPATTEMPTSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMCONNECTIONSETUPATTEMPTSRANGE_RANGES = a;
     }
     private static void checkCNumConnectionSetupAttemptsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMCONNECTIONSETUPATTEMPTSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMCONNECTIONSETUPATTEMPTSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumConnectionSetupAttempts(final BigInteger value) {
    if (value != null) {
        checkCNumConnectionSetupAttemptsRange(value);
    }
        this._cNumConnectionSetupAttempts = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMCONNECTIONSETUPSUCCESSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMCONNECTIONSETUPSUCCESSRANGE_RANGES = a;
     }
     private static void checkCNumConnectionSetupSuccessRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMCONNECTIONSETUPSUCCESSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMCONNECTIONSETUPSUCCESSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumConnectionSetupSuccess(final BigInteger value) {
    if (value != null) {
        checkCNumConnectionSetupSuccessRange(value);
    }
        this._cNumConnectionSetupSuccess = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMMISCDROPSDUETORLPRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMMISCDROPSDUETORLPRANGE_RANGES = a;
     }
     private static void checkCNumMiscDropsDueToRlpRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMMISCDROPSDUETORLPRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMMISCDROPSDUETORLPRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumMiscDropsDueToRlp(final BigInteger value) {
    if (value != null) {
        checkCNumMiscDropsDueToRlpRange(value);
    }
        this._cNumMiscDropsDueToRlp = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMMISCDROPSINTERNALERRORRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMMISCDROPSINTERNALERRORRANGE_RANGES = a;
     }
     private static void checkCNumMiscDropsInternalErrorRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMMISCDROPSINTERNALERRORRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMMISCDROPSINTERNALERRORRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumMiscDropsInternalError(final BigInteger value) {
    if (value != null) {
        checkCNumMiscDropsInternalErrorRange(value);
    }
        this._cNumMiscDropsInternalError = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMMISCDROPSSECTORDOWNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMMISCDROPSSECTORDOWNRANGE_RANGES = a;
     }
     private static void checkCNumMiscDropsSectorDownRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMMISCDROPSSECTORDOWNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMMISCDROPSSECTORDOWNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumMiscDropsSectorDown(final BigInteger value) {
    if (value != null) {
        checkCNumMiscDropsSectorDownRange(value);
    }
        this._cNumMiscDropsSectorDown = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMMISCDROPSSTATEMISMATCHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMMISCDROPSSTATEMISMATCHRANGE_RANGES = a;
     }
     private static void checkCNumMiscDropsStateMismatchRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMMISCDROPSSTATEMISMATCHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMMISCDROPSSTATEMISMATCHRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumMiscDropsStateMismatch(final BigInteger value) {
    if (value != null) {
        checkCNumMiscDropsStateMismatchRange(value);
    }
        this._cNumMiscDropsStateMismatch = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMNETWORKERRORDROPSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMNETWORKERRORDROPSRANGE_RANGES = a;
     }
     private static void checkCNumNetworkErrorDropsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMNETWORKERRORDROPSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMNETWORKERRORDROPSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumNetworkErrorDrops(final BigInteger value) {
    if (value != null) {
        checkCNumNetworkErrorDropsRange(value);
    }
        this._cNumNetworkErrorDrops = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMNETWORKERRORDROPSA10SETUPFAILRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMNETWORKERRORDROPSA10SETUPFAILRANGE_RANGES = a;
     }
     private static void checkCNumNetworkErrorDropsA10SetupFailRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMNETWORKERRORDROPSA10SETUPFAILRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMNETWORKERRORDROPSA10SETUPFAILRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumNetworkErrorDropsA10SetupFail(final BigInteger value) {
    if (value != null) {
        checkCNumNetworkErrorDropsA10SetupFailRange(value);
    }
        this._cNumNetworkErrorDropsA10SetupFail = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMNETWORKERRORDROPSRNCEXTERNALRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMNETWORKERRORDROPSRNCEXTERNALRANGE_RANGES = a;
     }
     private static void checkCNumNetworkErrorDropsRncExternalRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMNETWORKERRORDROPSRNCEXTERNALRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMNETWORKERRORDROPSRNCEXTERNALRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumNetworkErrorDropsRncExternal(final BigInteger value) {
    if (value != null) {
        checkCNumNetworkErrorDropsRncExternalRange(value);
    }
        this._cNumNetworkErrorDropsRncExternal = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMNETWORKERRORDROPSRNCINTERNALRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMNETWORKERRORDROPSRNCINTERNALRANGE_RANGES = a;
     }
     private static void checkCNumNetworkErrorDropsRncInternalRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMNETWORKERRORDROPSRNCINTERNALRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMNETWORKERRORDROPSRNCINTERNALRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumNetworkErrorDropsRncInternal(final BigInteger value) {
    if (value != null) {
        checkCNumNetworkErrorDropsRncInternalRange(value);
    }
        this._cNumNetworkErrorDropsRncInternal = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMNORMALCONNECTIONCLOSESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMNORMALCONNECTIONCLOSESRANGE_RANGES = a;
     }
     private static void checkCNumNormalConnectionClosesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMNORMALCONNECTIONCLOSESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMNORMALCONNECTIONCLOSESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumNormalConnectionCloses(final BigInteger value) {
    if (value != null) {
        checkCNumNormalConnectionClosesRange(value);
    }
        this._cNumNormalConnectionCloses = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMPAGEREQUESTSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMPAGEREQUESTSRANGE_RANGES = a;
     }
     private static void checkCNumPageRequestsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMPAGEREQUESTSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMPAGEREQUESTSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumPageRequests(final BigInteger value) {
    if (value != null) {
        checkCNumPageRequestsRange(value);
    }
        this._cNumPageRequests = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMPAGERESPONSESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMPAGERESPONSESRANGE_RANGES = a;
     }
     private static void checkCNumPageResponsesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMPAGERESPONSESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMPAGERESPONSESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumPageResponses(final BigInteger value) {
    if (value != null) {
        checkCNumPageResponsesRange(value);
    }
        this._cNumPageResponses = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMRFRELATEDDROPSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMRFRELATEDDROPSRANGE_RANGES = a;
     }
     private static void checkCNumRfRelatedDropsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMRFRELATEDDROPSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMRFRELATEDDROPSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumRfRelatedDrops(final BigInteger value) {
    if (value != null) {
        checkCNumRfRelatedDropsRange(value);
    }
        this._cNumRfRelatedDrops = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMRFRELATEDDROPSNOFTCRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMRFRELATEDDROPSNOFTCRANGE_RANGES = a;
     }
     private static void checkCNumRfRelatedDropsNoFtcRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMRFRELATEDDROPSNOFTCRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMRFRELATEDDROPSNOFTCRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumRfRelatedDropsNoFtc(final BigInteger value) {
    if (value != null) {
        checkCNumRfRelatedDropsNoFtcRange(value);
    }
        this._cNumRfRelatedDropsNoFtc = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMRFRELATEDDROPSRTCLOSTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMRFRELATEDDROPSRTCLOSTRANGE_RANGES = a;
     }
     private static void checkCNumRfRelatedDropsRtcLostRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMRFRELATEDDROPSRTCLOSTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMRFRELATEDDROPSRTCLOSTRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumRfRelatedDropsRtcLost(final BigInteger value) {
    if (value != null) {
        checkCNumRfRelatedDropsRtcLostRange(value);
    }
        this._cNumRfRelatedDropsRtcLost = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCNUMTOTALCONNECTIONCLOSESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCNUMTOTALCONNECTIONCLOSESRANGE_RANGES = a;
     }
     private static void checkCNumTotalConnectionClosesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCNUMTOTALCONNECTIONCLOSESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCNUMTOTALCONNECTIONCLOSESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setCNumTotalConnectionCloses(final BigInteger value) {
    if (value != null) {
        checkCNumTotalConnectionClosesRange(value);
    }
        this._cNumTotalConnectionCloses = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMCONNECTIONSETUPATTEMPTSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMCONNECTIONSETUPATTEMPTSRANGE_RANGES = a;
     }
     private static void checkSNumConnectionSetupAttemptsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMCONNECTIONSETUPATTEMPTSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMCONNECTIONSETUPATTEMPTSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumConnectionSetupAttempts(final BigInteger value) {
    if (value != null) {
        checkSNumConnectionSetupAttemptsRange(value);
    }
        this._sNumConnectionSetupAttempts = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMCONNECTIONSETUPSUCCESSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMCONNECTIONSETUPSUCCESSRANGE_RANGES = a;
     }
     private static void checkSNumConnectionSetupSuccessRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMCONNECTIONSETUPSUCCESSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMCONNECTIONSETUPSUCCESSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumConnectionSetupSuccess(final BigInteger value) {
    if (value != null) {
        checkSNumConnectionSetupSuccessRange(value);
    }
        this._sNumConnectionSetupSuccess = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMMISCDROPSDUETORLPRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMMISCDROPSDUETORLPRANGE_RANGES = a;
     }
     private static void checkSNumMiscDropsDueToRlpRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMMISCDROPSDUETORLPRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMMISCDROPSDUETORLPRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumMiscDropsDueToRlp(final BigInteger value) {
    if (value != null) {
        checkSNumMiscDropsDueToRlpRange(value);
    }
        this._sNumMiscDropsDueToRlp = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMMISCDROPSINTERNALERRORRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMMISCDROPSINTERNALERRORRANGE_RANGES = a;
     }
     private static void checkSNumMiscDropsInternalErrorRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMMISCDROPSINTERNALERRORRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMMISCDROPSINTERNALERRORRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumMiscDropsInternalError(final BigInteger value) {
    if (value != null) {
        checkSNumMiscDropsInternalErrorRange(value);
    }
        this._sNumMiscDropsInternalError = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMMISCDROPSSECTORDOWNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMMISCDROPSSECTORDOWNRANGE_RANGES = a;
     }
     private static void checkSNumMiscDropsSectorDownRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMMISCDROPSSECTORDOWNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMMISCDROPSSECTORDOWNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumMiscDropsSectorDown(final BigInteger value) {
    if (value != null) {
        checkSNumMiscDropsSectorDownRange(value);
    }
        this._sNumMiscDropsSectorDown = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMMISCDROPSSTATEMISMATCHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMMISCDROPSSTATEMISMATCHRANGE_RANGES = a;
     }
     private static void checkSNumMiscDropsStateMismatchRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMMISCDROPSSTATEMISMATCHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMMISCDROPSSTATEMISMATCHRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumMiscDropsStateMismatch(final BigInteger value) {
    if (value != null) {
        checkSNumMiscDropsStateMismatchRange(value);
    }
        this._sNumMiscDropsStateMismatch = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMNETWORKERRORDROPSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMNETWORKERRORDROPSRANGE_RANGES = a;
     }
     private static void checkSNumNetworkErrorDropsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMNETWORKERRORDROPSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMNETWORKERRORDROPSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumNetworkErrorDrops(final BigInteger value) {
    if (value != null) {
        checkSNumNetworkErrorDropsRange(value);
    }
        this._sNumNetworkErrorDrops = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMNETWORKERRORDROPSA10SETUPFAILRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMNETWORKERRORDROPSA10SETUPFAILRANGE_RANGES = a;
     }
     private static void checkSNumNetworkErrorDropsA10SetupFailRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMNETWORKERRORDROPSA10SETUPFAILRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMNETWORKERRORDROPSA10SETUPFAILRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumNetworkErrorDropsA10SetupFail(final BigInteger value) {
    if (value != null) {
        checkSNumNetworkErrorDropsA10SetupFailRange(value);
    }
        this._sNumNetworkErrorDropsA10SetupFail = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMNETWORKERRORDROPSRNCEXTERNALRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMNETWORKERRORDROPSRNCEXTERNALRANGE_RANGES = a;
     }
     private static void checkSNumNetworkErrorDropsRncExternalRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMNETWORKERRORDROPSRNCEXTERNALRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMNETWORKERRORDROPSRNCEXTERNALRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumNetworkErrorDropsRncExternal(final BigInteger value) {
    if (value != null) {
        checkSNumNetworkErrorDropsRncExternalRange(value);
    }
        this._sNumNetworkErrorDropsRncExternal = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMNETWORKERRORDROPSRNCINTERNALRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMNETWORKERRORDROPSRNCINTERNALRANGE_RANGES = a;
     }
     private static void checkSNumNetworkErrorDropsRncInternalRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMNETWORKERRORDROPSRNCINTERNALRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMNETWORKERRORDROPSRNCINTERNALRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumNetworkErrorDropsRncInternal(final BigInteger value) {
    if (value != null) {
        checkSNumNetworkErrorDropsRncInternalRange(value);
    }
        this._sNumNetworkErrorDropsRncInternal = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMNORMALCONNECTIONCLOSESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMNORMALCONNECTIONCLOSESRANGE_RANGES = a;
     }
     private static void checkSNumNormalConnectionClosesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMNORMALCONNECTIONCLOSESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMNORMALCONNECTIONCLOSESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumNormalConnectionCloses(final BigInteger value) {
    if (value != null) {
        checkSNumNormalConnectionClosesRange(value);
    }
        this._sNumNormalConnectionCloses = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMPAGEREQUESTSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMPAGEREQUESTSRANGE_RANGES = a;
     }
     private static void checkSNumPageRequestsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMPAGEREQUESTSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMPAGEREQUESTSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumPageRequests(final BigInteger value) {
    if (value != null) {
        checkSNumPageRequestsRange(value);
    }
        this._sNumPageRequests = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMPAGERESPONSESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMPAGERESPONSESRANGE_RANGES = a;
     }
     private static void checkSNumPageResponsesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMPAGERESPONSESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMPAGERESPONSESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumPageResponses(final BigInteger value) {
    if (value != null) {
        checkSNumPageResponsesRange(value);
    }
        this._sNumPageResponses = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMRFRELATEDDROPSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMRFRELATEDDROPSRANGE_RANGES = a;
     }
     private static void checkSNumRfRelatedDropsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMRFRELATEDDROPSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMRFRELATEDDROPSRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumRfRelatedDrops(final BigInteger value) {
    if (value != null) {
        checkSNumRfRelatedDropsRange(value);
    }
        this._sNumRfRelatedDrops = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMRFRELATEDDROPSNOFTCRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMRFRELATEDDROPSNOFTCRANGE_RANGES = a;
     }
     private static void checkSNumRfRelatedDropsNoFtcRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMRFRELATEDDROPSNOFTCRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMRFRELATEDDROPSNOFTCRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumRfRelatedDropsNoFtc(final BigInteger value) {
    if (value != null) {
        checkSNumRfRelatedDropsNoFtcRange(value);
    }
        this._sNumRfRelatedDropsNoFtc = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMRFRELATEDDROPSRTCLOSTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMRFRELATEDDROPSRTCLOSTRANGE_RANGES = a;
     }
     private static void checkSNumRfRelatedDropsRtcLostRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMRFRELATEDDROPSRTCLOSTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMRFRELATEDDROPSRTCLOSTRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumRfRelatedDropsRtcLost(final BigInteger value) {
    if (value != null) {
        checkSNumRfRelatedDropsRtcLostRange(value);
    }
        this._sNumRfRelatedDropsRtcLost = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSNUMTOTALCONNECTIONCLOSESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSNUMTOTALCONNECTIONCLOSESRANGE_RANGES = a;
     }
     private static void checkSNumTotalConnectionClosesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSNUMTOTALCONNECTIONCLOSESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSNUMTOTALCONNECTIONCLOSESRANGE_RANGES)));
     }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder setSNumTotalConnectionCloses(final BigInteger value) {
    if (value != null) {
        checkSNumTotalConnectionClosesRange(value);
    }
        this._sNumTotalConnectionCloses = value;
        return this;
    }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdRncSigAppsStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdRncSigAppsStats build() {
        return new Cdma2000HrpdRncSigAppsStatsImpl(this);
    }

    private static final class Cdma2000HrpdRncSigAppsStatsImpl implements Cdma2000HrpdRncSigAppsStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats.class;
        }

        private final BigInteger _cNumConnectionSetupAttempts;
        private final BigInteger _cNumConnectionSetupSuccess;
        private final BigInteger _cNumMiscDropsDueToRlp;
        private final BigInteger _cNumMiscDropsInternalError;
        private final BigInteger _cNumMiscDropsSectorDown;
        private final BigInteger _cNumMiscDropsStateMismatch;
        private final BigInteger _cNumNetworkErrorDrops;
        private final BigInteger _cNumNetworkErrorDropsA10SetupFail;
        private final BigInteger _cNumNetworkErrorDropsRncExternal;
        private final BigInteger _cNumNetworkErrorDropsRncInternal;
        private final BigInteger _cNumNormalConnectionCloses;
        private final BigInteger _cNumPageRequests;
        private final BigInteger _cNumPageResponses;
        private final BigInteger _cNumRfRelatedDrops;
        private final BigInteger _cNumRfRelatedDropsNoFtc;
        private final BigInteger _cNumRfRelatedDropsRtcLost;
        private final BigInteger _cNumTotalConnectionCloses;
        private final BigInteger _sNumConnectionSetupAttempts;
        private final BigInteger _sNumConnectionSetupSuccess;
        private final BigInteger _sNumMiscDropsDueToRlp;
        private final BigInteger _sNumMiscDropsInternalError;
        private final BigInteger _sNumMiscDropsSectorDown;
        private final BigInteger _sNumMiscDropsStateMismatch;
        private final BigInteger _sNumNetworkErrorDrops;
        private final BigInteger _sNumNetworkErrorDropsA10SetupFail;
        private final BigInteger _sNumNetworkErrorDropsRncExternal;
        private final BigInteger _sNumNetworkErrorDropsRncInternal;
        private final BigInteger _sNumNormalConnectionCloses;
        private final BigInteger _sNumPageRequests;
        private final BigInteger _sNumPageResponses;
        private final BigInteger _sNumRfRelatedDrops;
        private final BigInteger _sNumRfRelatedDropsNoFtc;
        private final BigInteger _sNumRfRelatedDropsRtcLost;
        private final BigInteger _sNumTotalConnectionCloses;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdRncSigAppsStatsImpl(Cdma2000HrpdRncSigAppsStatsBuilder base) {
            this._cNumConnectionSetupAttempts = base.getCNumConnectionSetupAttempts();
            this._cNumConnectionSetupSuccess = base.getCNumConnectionSetupSuccess();
            this._cNumMiscDropsDueToRlp = base.getCNumMiscDropsDueToRlp();
            this._cNumMiscDropsInternalError = base.getCNumMiscDropsInternalError();
            this._cNumMiscDropsSectorDown = base.getCNumMiscDropsSectorDown();
            this._cNumMiscDropsStateMismatch = base.getCNumMiscDropsStateMismatch();
            this._cNumNetworkErrorDrops = base.getCNumNetworkErrorDrops();
            this._cNumNetworkErrorDropsA10SetupFail = base.getCNumNetworkErrorDropsA10SetupFail();
            this._cNumNetworkErrorDropsRncExternal = base.getCNumNetworkErrorDropsRncExternal();
            this._cNumNetworkErrorDropsRncInternal = base.getCNumNetworkErrorDropsRncInternal();
            this._cNumNormalConnectionCloses = base.getCNumNormalConnectionCloses();
            this._cNumPageRequests = base.getCNumPageRequests();
            this._cNumPageResponses = base.getCNumPageResponses();
            this._cNumRfRelatedDrops = base.getCNumRfRelatedDrops();
            this._cNumRfRelatedDropsNoFtc = base.getCNumRfRelatedDropsNoFtc();
            this._cNumRfRelatedDropsRtcLost = base.getCNumRfRelatedDropsRtcLost();
            this._cNumTotalConnectionCloses = base.getCNumTotalConnectionCloses();
            this._sNumConnectionSetupAttempts = base.getSNumConnectionSetupAttempts();
            this._sNumConnectionSetupSuccess = base.getSNumConnectionSetupSuccess();
            this._sNumMiscDropsDueToRlp = base.getSNumMiscDropsDueToRlp();
            this._sNumMiscDropsInternalError = base.getSNumMiscDropsInternalError();
            this._sNumMiscDropsSectorDown = base.getSNumMiscDropsSectorDown();
            this._sNumMiscDropsStateMismatch = base.getSNumMiscDropsStateMismatch();
            this._sNumNetworkErrorDrops = base.getSNumNetworkErrorDrops();
            this._sNumNetworkErrorDropsA10SetupFail = base.getSNumNetworkErrorDropsA10SetupFail();
            this._sNumNetworkErrorDropsRncExternal = base.getSNumNetworkErrorDropsRncExternal();
            this._sNumNetworkErrorDropsRncInternal = base.getSNumNetworkErrorDropsRncInternal();
            this._sNumNormalConnectionCloses = base.getSNumNormalConnectionCloses();
            this._sNumPageRequests = base.getSNumPageRequests();
            this._sNumPageResponses = base.getSNumPageResponses();
            this._sNumRfRelatedDrops = base.getSNumRfRelatedDrops();
            this._sNumRfRelatedDropsNoFtc = base.getSNumRfRelatedDropsNoFtc();
            this._sNumRfRelatedDropsRtcLost = base.getSNumRfRelatedDropsRtcLost();
            this._sNumTotalConnectionCloses = base.getSNumTotalConnectionCloses();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getCNumConnectionSetupAttempts() {
            return _cNumConnectionSetupAttempts;
        }
        
        @Override
        public BigInteger getCNumConnectionSetupSuccess() {
            return _cNumConnectionSetupSuccess;
        }
        
        @Override
        public BigInteger getCNumMiscDropsDueToRlp() {
            return _cNumMiscDropsDueToRlp;
        }
        
        @Override
        public BigInteger getCNumMiscDropsInternalError() {
            return _cNumMiscDropsInternalError;
        }
        
        @Override
        public BigInteger getCNumMiscDropsSectorDown() {
            return _cNumMiscDropsSectorDown;
        }
        
        @Override
        public BigInteger getCNumMiscDropsStateMismatch() {
            return _cNumMiscDropsStateMismatch;
        }
        
        @Override
        public BigInteger getCNumNetworkErrorDrops() {
            return _cNumNetworkErrorDrops;
        }
        
        @Override
        public BigInteger getCNumNetworkErrorDropsA10SetupFail() {
            return _cNumNetworkErrorDropsA10SetupFail;
        }
        
        @Override
        public BigInteger getCNumNetworkErrorDropsRncExternal() {
            return _cNumNetworkErrorDropsRncExternal;
        }
        
        @Override
        public BigInteger getCNumNetworkErrorDropsRncInternal() {
            return _cNumNetworkErrorDropsRncInternal;
        }
        
        @Override
        public BigInteger getCNumNormalConnectionCloses() {
            return _cNumNormalConnectionCloses;
        }
        
        @Override
        public BigInteger getCNumPageRequests() {
            return _cNumPageRequests;
        }
        
        @Override
        public BigInteger getCNumPageResponses() {
            return _cNumPageResponses;
        }
        
        @Override
        public BigInteger getCNumRfRelatedDrops() {
            return _cNumRfRelatedDrops;
        }
        
        @Override
        public BigInteger getCNumRfRelatedDropsNoFtc() {
            return _cNumRfRelatedDropsNoFtc;
        }
        
        @Override
        public BigInteger getCNumRfRelatedDropsRtcLost() {
            return _cNumRfRelatedDropsRtcLost;
        }
        
        @Override
        public BigInteger getCNumTotalConnectionCloses() {
            return _cNumTotalConnectionCloses;
        }
        
        @Override
        public BigInteger getSNumConnectionSetupAttempts() {
            return _sNumConnectionSetupAttempts;
        }
        
        @Override
        public BigInteger getSNumConnectionSetupSuccess() {
            return _sNumConnectionSetupSuccess;
        }
        
        @Override
        public BigInteger getSNumMiscDropsDueToRlp() {
            return _sNumMiscDropsDueToRlp;
        }
        
        @Override
        public BigInteger getSNumMiscDropsInternalError() {
            return _sNumMiscDropsInternalError;
        }
        
        @Override
        public BigInteger getSNumMiscDropsSectorDown() {
            return _sNumMiscDropsSectorDown;
        }
        
        @Override
        public BigInteger getSNumMiscDropsStateMismatch() {
            return _sNumMiscDropsStateMismatch;
        }
        
        @Override
        public BigInteger getSNumNetworkErrorDrops() {
            return _sNumNetworkErrorDrops;
        }
        
        @Override
        public BigInteger getSNumNetworkErrorDropsA10SetupFail() {
            return _sNumNetworkErrorDropsA10SetupFail;
        }
        
        @Override
        public BigInteger getSNumNetworkErrorDropsRncExternal() {
            return _sNumNetworkErrorDropsRncExternal;
        }
        
        @Override
        public BigInteger getSNumNetworkErrorDropsRncInternal() {
            return _sNumNetworkErrorDropsRncInternal;
        }
        
        @Override
        public BigInteger getSNumNormalConnectionCloses() {
            return _sNumNormalConnectionCloses;
        }
        
        @Override
        public BigInteger getSNumPageRequests() {
            return _sNumPageRequests;
        }
        
        @Override
        public BigInteger getSNumPageResponses() {
            return _sNumPageResponses;
        }
        
        @Override
        public BigInteger getSNumRfRelatedDrops() {
            return _sNumRfRelatedDrops;
        }
        
        @Override
        public BigInteger getSNumRfRelatedDropsNoFtc() {
            return _sNumRfRelatedDropsNoFtc;
        }
        
        @Override
        public BigInteger getSNumRfRelatedDropsRtcLost() {
            return _sNumRfRelatedDropsRtcLost;
        }
        
        @Override
        public BigInteger getSNumTotalConnectionCloses() {
            return _sNumTotalConnectionCloses;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cNumConnectionSetupAttempts);
            result = prime * result + Objects.hashCode(_cNumConnectionSetupSuccess);
            result = prime * result + Objects.hashCode(_cNumMiscDropsDueToRlp);
            result = prime * result + Objects.hashCode(_cNumMiscDropsInternalError);
            result = prime * result + Objects.hashCode(_cNumMiscDropsSectorDown);
            result = prime * result + Objects.hashCode(_cNumMiscDropsStateMismatch);
            result = prime * result + Objects.hashCode(_cNumNetworkErrorDrops);
            result = prime * result + Objects.hashCode(_cNumNetworkErrorDropsA10SetupFail);
            result = prime * result + Objects.hashCode(_cNumNetworkErrorDropsRncExternal);
            result = prime * result + Objects.hashCode(_cNumNetworkErrorDropsRncInternal);
            result = prime * result + Objects.hashCode(_cNumNormalConnectionCloses);
            result = prime * result + Objects.hashCode(_cNumPageRequests);
            result = prime * result + Objects.hashCode(_cNumPageResponses);
            result = prime * result + Objects.hashCode(_cNumRfRelatedDrops);
            result = prime * result + Objects.hashCode(_cNumRfRelatedDropsNoFtc);
            result = prime * result + Objects.hashCode(_cNumRfRelatedDropsRtcLost);
            result = prime * result + Objects.hashCode(_cNumTotalConnectionCloses);
            result = prime * result + Objects.hashCode(_sNumConnectionSetupAttempts);
            result = prime * result + Objects.hashCode(_sNumConnectionSetupSuccess);
            result = prime * result + Objects.hashCode(_sNumMiscDropsDueToRlp);
            result = prime * result + Objects.hashCode(_sNumMiscDropsInternalError);
            result = prime * result + Objects.hashCode(_sNumMiscDropsSectorDown);
            result = prime * result + Objects.hashCode(_sNumMiscDropsStateMismatch);
            result = prime * result + Objects.hashCode(_sNumNetworkErrorDrops);
            result = prime * result + Objects.hashCode(_sNumNetworkErrorDropsA10SetupFail);
            result = prime * result + Objects.hashCode(_sNumNetworkErrorDropsRncExternal);
            result = prime * result + Objects.hashCode(_sNumNetworkErrorDropsRncInternal);
            result = prime * result + Objects.hashCode(_sNumNormalConnectionCloses);
            result = prime * result + Objects.hashCode(_sNumPageRequests);
            result = prime * result + Objects.hashCode(_sNumPageResponses);
            result = prime * result + Objects.hashCode(_sNumRfRelatedDrops);
            result = prime * result + Objects.hashCode(_sNumRfRelatedDropsNoFtc);
            result = prime * result + Objects.hashCode(_sNumRfRelatedDropsRtcLost);
            result = prime * result + Objects.hashCode(_sNumTotalConnectionCloses);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats)obj;
            if (!Objects.equals(_cNumConnectionSetupAttempts, other.getCNumConnectionSetupAttempts())) {
                return false;
            }
            if (!Objects.equals(_cNumConnectionSetupSuccess, other.getCNumConnectionSetupSuccess())) {
                return false;
            }
            if (!Objects.equals(_cNumMiscDropsDueToRlp, other.getCNumMiscDropsDueToRlp())) {
                return false;
            }
            if (!Objects.equals(_cNumMiscDropsInternalError, other.getCNumMiscDropsInternalError())) {
                return false;
            }
            if (!Objects.equals(_cNumMiscDropsSectorDown, other.getCNumMiscDropsSectorDown())) {
                return false;
            }
            if (!Objects.equals(_cNumMiscDropsStateMismatch, other.getCNumMiscDropsStateMismatch())) {
                return false;
            }
            if (!Objects.equals(_cNumNetworkErrorDrops, other.getCNumNetworkErrorDrops())) {
                return false;
            }
            if (!Objects.equals(_cNumNetworkErrorDropsA10SetupFail, other.getCNumNetworkErrorDropsA10SetupFail())) {
                return false;
            }
            if (!Objects.equals(_cNumNetworkErrorDropsRncExternal, other.getCNumNetworkErrorDropsRncExternal())) {
                return false;
            }
            if (!Objects.equals(_cNumNetworkErrorDropsRncInternal, other.getCNumNetworkErrorDropsRncInternal())) {
                return false;
            }
            if (!Objects.equals(_cNumNormalConnectionCloses, other.getCNumNormalConnectionCloses())) {
                return false;
            }
            if (!Objects.equals(_cNumPageRequests, other.getCNumPageRequests())) {
                return false;
            }
            if (!Objects.equals(_cNumPageResponses, other.getCNumPageResponses())) {
                return false;
            }
            if (!Objects.equals(_cNumRfRelatedDrops, other.getCNumRfRelatedDrops())) {
                return false;
            }
            if (!Objects.equals(_cNumRfRelatedDropsNoFtc, other.getCNumRfRelatedDropsNoFtc())) {
                return false;
            }
            if (!Objects.equals(_cNumRfRelatedDropsRtcLost, other.getCNumRfRelatedDropsRtcLost())) {
                return false;
            }
            if (!Objects.equals(_cNumTotalConnectionCloses, other.getCNumTotalConnectionCloses())) {
                return false;
            }
            if (!Objects.equals(_sNumConnectionSetupAttempts, other.getSNumConnectionSetupAttempts())) {
                return false;
            }
            if (!Objects.equals(_sNumConnectionSetupSuccess, other.getSNumConnectionSetupSuccess())) {
                return false;
            }
            if (!Objects.equals(_sNumMiscDropsDueToRlp, other.getSNumMiscDropsDueToRlp())) {
                return false;
            }
            if (!Objects.equals(_sNumMiscDropsInternalError, other.getSNumMiscDropsInternalError())) {
                return false;
            }
            if (!Objects.equals(_sNumMiscDropsSectorDown, other.getSNumMiscDropsSectorDown())) {
                return false;
            }
            if (!Objects.equals(_sNumMiscDropsStateMismatch, other.getSNumMiscDropsStateMismatch())) {
                return false;
            }
            if (!Objects.equals(_sNumNetworkErrorDrops, other.getSNumNetworkErrorDrops())) {
                return false;
            }
            if (!Objects.equals(_sNumNetworkErrorDropsA10SetupFail, other.getSNumNetworkErrorDropsA10SetupFail())) {
                return false;
            }
            if (!Objects.equals(_sNumNetworkErrorDropsRncExternal, other.getSNumNetworkErrorDropsRncExternal())) {
                return false;
            }
            if (!Objects.equals(_sNumNetworkErrorDropsRncInternal, other.getSNumNetworkErrorDropsRncInternal())) {
                return false;
            }
            if (!Objects.equals(_sNumNormalConnectionCloses, other.getSNumNormalConnectionCloses())) {
                return false;
            }
            if (!Objects.equals(_sNumPageRequests, other.getSNumPageRequests())) {
                return false;
            }
            if (!Objects.equals(_sNumPageResponses, other.getSNumPageResponses())) {
                return false;
            }
            if (!Objects.equals(_sNumRfRelatedDrops, other.getSNumRfRelatedDrops())) {
                return false;
            }
            if (!Objects.equals(_sNumRfRelatedDropsNoFtc, other.getSNumRfRelatedDropsNoFtc())) {
                return false;
            }
            if (!Objects.equals(_sNumRfRelatedDropsRtcLost, other.getSNumRfRelatedDropsRtcLost())) {
                return false;
            }
            if (!Objects.equals(_sNumTotalConnectionCloses, other.getSNumTotalConnectionCloses())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdRncSigAppsStatsImpl otherImpl = (Cdma2000HrpdRncSigAppsStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdRncSigAppsStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cNumConnectionSetupAttempts != null) {
                builder.append("_cNumConnectionSetupAttempts=");
                builder.append(_cNumConnectionSetupAttempts);
                builder.append(", ");
            }
            if (_cNumConnectionSetupSuccess != null) {
                builder.append("_cNumConnectionSetupSuccess=");
                builder.append(_cNumConnectionSetupSuccess);
                builder.append(", ");
            }
            if (_cNumMiscDropsDueToRlp != null) {
                builder.append("_cNumMiscDropsDueToRlp=");
                builder.append(_cNumMiscDropsDueToRlp);
                builder.append(", ");
            }
            if (_cNumMiscDropsInternalError != null) {
                builder.append("_cNumMiscDropsInternalError=");
                builder.append(_cNumMiscDropsInternalError);
                builder.append(", ");
            }
            if (_cNumMiscDropsSectorDown != null) {
                builder.append("_cNumMiscDropsSectorDown=");
                builder.append(_cNumMiscDropsSectorDown);
                builder.append(", ");
            }
            if (_cNumMiscDropsStateMismatch != null) {
                builder.append("_cNumMiscDropsStateMismatch=");
                builder.append(_cNumMiscDropsStateMismatch);
                builder.append(", ");
            }
            if (_cNumNetworkErrorDrops != null) {
                builder.append("_cNumNetworkErrorDrops=");
                builder.append(_cNumNetworkErrorDrops);
                builder.append(", ");
            }
            if (_cNumNetworkErrorDropsA10SetupFail != null) {
                builder.append("_cNumNetworkErrorDropsA10SetupFail=");
                builder.append(_cNumNetworkErrorDropsA10SetupFail);
                builder.append(", ");
            }
            if (_cNumNetworkErrorDropsRncExternal != null) {
                builder.append("_cNumNetworkErrorDropsRncExternal=");
                builder.append(_cNumNetworkErrorDropsRncExternal);
                builder.append(", ");
            }
            if (_cNumNetworkErrorDropsRncInternal != null) {
                builder.append("_cNumNetworkErrorDropsRncInternal=");
                builder.append(_cNumNetworkErrorDropsRncInternal);
                builder.append(", ");
            }
            if (_cNumNormalConnectionCloses != null) {
                builder.append("_cNumNormalConnectionCloses=");
                builder.append(_cNumNormalConnectionCloses);
                builder.append(", ");
            }
            if (_cNumPageRequests != null) {
                builder.append("_cNumPageRequests=");
                builder.append(_cNumPageRequests);
                builder.append(", ");
            }
            if (_cNumPageResponses != null) {
                builder.append("_cNumPageResponses=");
                builder.append(_cNumPageResponses);
                builder.append(", ");
            }
            if (_cNumRfRelatedDrops != null) {
                builder.append("_cNumRfRelatedDrops=");
                builder.append(_cNumRfRelatedDrops);
                builder.append(", ");
            }
            if (_cNumRfRelatedDropsNoFtc != null) {
                builder.append("_cNumRfRelatedDropsNoFtc=");
                builder.append(_cNumRfRelatedDropsNoFtc);
                builder.append(", ");
            }
            if (_cNumRfRelatedDropsRtcLost != null) {
                builder.append("_cNumRfRelatedDropsRtcLost=");
                builder.append(_cNumRfRelatedDropsRtcLost);
                builder.append(", ");
            }
            if (_cNumTotalConnectionCloses != null) {
                builder.append("_cNumTotalConnectionCloses=");
                builder.append(_cNumTotalConnectionCloses);
                builder.append(", ");
            }
            if (_sNumConnectionSetupAttempts != null) {
                builder.append("_sNumConnectionSetupAttempts=");
                builder.append(_sNumConnectionSetupAttempts);
                builder.append(", ");
            }
            if (_sNumConnectionSetupSuccess != null) {
                builder.append("_sNumConnectionSetupSuccess=");
                builder.append(_sNumConnectionSetupSuccess);
                builder.append(", ");
            }
            if (_sNumMiscDropsDueToRlp != null) {
                builder.append("_sNumMiscDropsDueToRlp=");
                builder.append(_sNumMiscDropsDueToRlp);
                builder.append(", ");
            }
            if (_sNumMiscDropsInternalError != null) {
                builder.append("_sNumMiscDropsInternalError=");
                builder.append(_sNumMiscDropsInternalError);
                builder.append(", ");
            }
            if (_sNumMiscDropsSectorDown != null) {
                builder.append("_sNumMiscDropsSectorDown=");
                builder.append(_sNumMiscDropsSectorDown);
                builder.append(", ");
            }
            if (_sNumMiscDropsStateMismatch != null) {
                builder.append("_sNumMiscDropsStateMismatch=");
                builder.append(_sNumMiscDropsStateMismatch);
                builder.append(", ");
            }
            if (_sNumNetworkErrorDrops != null) {
                builder.append("_sNumNetworkErrorDrops=");
                builder.append(_sNumNetworkErrorDrops);
                builder.append(", ");
            }
            if (_sNumNetworkErrorDropsA10SetupFail != null) {
                builder.append("_sNumNetworkErrorDropsA10SetupFail=");
                builder.append(_sNumNetworkErrorDropsA10SetupFail);
                builder.append(", ");
            }
            if (_sNumNetworkErrorDropsRncExternal != null) {
                builder.append("_sNumNetworkErrorDropsRncExternal=");
                builder.append(_sNumNetworkErrorDropsRncExternal);
                builder.append(", ");
            }
            if (_sNumNetworkErrorDropsRncInternal != null) {
                builder.append("_sNumNetworkErrorDropsRncInternal=");
                builder.append(_sNumNetworkErrorDropsRncInternal);
                builder.append(", ");
            }
            if (_sNumNormalConnectionCloses != null) {
                builder.append("_sNumNormalConnectionCloses=");
                builder.append(_sNumNormalConnectionCloses);
                builder.append(", ");
            }
            if (_sNumPageRequests != null) {
                builder.append("_sNumPageRequests=");
                builder.append(_sNumPageRequests);
                builder.append(", ");
            }
            if (_sNumPageResponses != null) {
                builder.append("_sNumPageResponses=");
                builder.append(_sNumPageResponses);
                builder.append(", ");
            }
            if (_sNumRfRelatedDrops != null) {
                builder.append("_sNumRfRelatedDrops=");
                builder.append(_sNumRfRelatedDrops);
                builder.append(", ");
            }
            if (_sNumRfRelatedDropsNoFtc != null) {
                builder.append("_sNumRfRelatedDropsNoFtc=");
                builder.append(_sNumRfRelatedDropsNoFtc);
                builder.append(", ");
            }
            if (_sNumRfRelatedDropsRtcLost != null) {
                builder.append("_sNumRfRelatedDropsRtcLost=");
                builder.append(_sNumRfRelatedDropsRtcLost);
                builder.append(", ");
            }
            if (_sNumTotalConnectionCloses != null) {
                builder.append("_sNumTotalConnectionCloses=");
                builder.append(_sNumTotalConnectionCloses);
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
