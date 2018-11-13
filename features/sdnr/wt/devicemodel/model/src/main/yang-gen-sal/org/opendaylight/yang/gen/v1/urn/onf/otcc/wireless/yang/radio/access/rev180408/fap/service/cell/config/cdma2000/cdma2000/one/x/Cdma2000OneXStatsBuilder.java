package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats
 *
 */
public class Cdma2000OneXStatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats> {

    private java.lang.Long _averageDataCall;
    private java.lang.Long _averageSessionInSec;
    private java.lang.Long _averageVoiceCall;
    private java.lang.Long _bcIndexOneToZeroTransitions;
    private java.lang.Long _bcIndexZeroToOneTransitions;
    private java.lang.Long _dataCallAttempts;
    private java.lang.Long _dataCallFailures;
    private java.lang.Long _dataCallsBlocked;
    private java.lang.Long _dataCallsDropped;
    private java.lang.Long _fwdAvgDataRate;
    private java.lang.Long _fwdVoicePacketDropPercentage;
    private java.lang.Long _pageAttempts;
    private java.lang.Long _pageFails;
    private java.lang.Long _registrationAttempts;
    private java.lang.Long _registrationFails;
    private java.lang.Long _registrationsBlocked;
    private java.lang.Long _revAvgDataRate;
    private java.lang.Long _revVoicePacketDropPercentage;
    private java.lang.Long _totalDataCalls;
    private java.lang.Long _totalVoiceCalls;
    private java.lang.Long _voiceCallAttempts;
    private java.lang.Long _voiceCallFailures;
    private java.lang.Long _voiceCallsBlocked;
    private java.lang.Long _voiceCallsDropped;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>> augmentation = Collections.emptyMap();

    public Cdma2000OneXStatsBuilder() {
    }
    public Cdma2000OneXStatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG arg) {
        this._registrationAttempts = arg.getRegistrationAttempts();
        this._registrationFails = arg.getRegistrationFails();
        this._registrationsBlocked = arg.getRegistrationsBlocked();
        this._pageAttempts = arg.getPageAttempts();
        this._pageFails = arg.getPageFails();
        this._voiceCallAttempts = arg.getVoiceCallAttempts();
        this._voiceCallFailures = arg.getVoiceCallFailures();
        this._voiceCallsBlocked = arg.getVoiceCallsBlocked();
        this._voiceCallsDropped = arg.getVoiceCallsDropped();
        this._dataCallAttempts = arg.getDataCallAttempts();
        this._dataCallFailures = arg.getDataCallFailures();
        this._dataCallsBlocked = arg.getDataCallsBlocked();
        this._dataCallsDropped = arg.getDataCallsDropped();
        this._averageVoiceCall = arg.getAverageVoiceCall();
        this._averageDataCall = arg.getAverageDataCall();
        this._averageSessionInSec = arg.getAverageSessionInSec();
        this._totalVoiceCalls = arg.getTotalVoiceCalls();
        this._totalDataCalls = arg.getTotalDataCalls();
        this._fwdVoicePacketDropPercentage = arg.getFwdVoicePacketDropPercentage();
        this._revVoicePacketDropPercentage = arg.getRevVoicePacketDropPercentage();
        this._fwdAvgDataRate = arg.getFwdAvgDataRate();
        this._revAvgDataRate = arg.getRevAvgDataRate();
        this._bcIndexZeroToOneTransitions = arg.getBcIndexZeroToOneTransitions();
        this._bcIndexOneToZeroTransitions = arg.getBcIndexOneToZeroTransitions();
    }

    public Cdma2000OneXStatsBuilder(Cdma2000OneXStats base) {
        this._averageDataCall = base.getAverageDataCall();
        this._averageSessionInSec = base.getAverageSessionInSec();
        this._averageVoiceCall = base.getAverageVoiceCall();
        this._bcIndexOneToZeroTransitions = base.getBcIndexOneToZeroTransitions();
        this._bcIndexZeroToOneTransitions = base.getBcIndexZeroToOneTransitions();
        this._dataCallAttempts = base.getDataCallAttempts();
        this._dataCallFailures = base.getDataCallFailures();
        this._dataCallsBlocked = base.getDataCallsBlocked();
        this._dataCallsDropped = base.getDataCallsDropped();
        this._fwdAvgDataRate = base.getFwdAvgDataRate();
        this._fwdVoicePacketDropPercentage = base.getFwdVoicePacketDropPercentage();
        this._pageAttempts = base.getPageAttempts();
        this._pageFails = base.getPageFails();
        this._registrationAttempts = base.getRegistrationAttempts();
        this._registrationFails = base.getRegistrationFails();
        this._registrationsBlocked = base.getRegistrationsBlocked();
        this._revAvgDataRate = base.getRevAvgDataRate();
        this._revVoicePacketDropPercentage = base.getRevVoicePacketDropPercentage();
        this._totalDataCalls = base.getTotalDataCalls();
        this._totalVoiceCalls = base.getTotalVoiceCalls();
        this._voiceCallAttempts = base.getVoiceCallAttempts();
        this._voiceCallFailures = base.getVoiceCallFailures();
        this._voiceCallsBlocked = base.getVoiceCallsBlocked();
        this._voiceCallsDropped = base.getVoiceCallsDropped();
        if (base instanceof Cdma2000OneXStatsImpl) {
            Cdma2000OneXStatsImpl impl = (Cdma2000OneXStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG) {
            this._registrationAttempts = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getRegistrationAttempts();
            this._registrationFails = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getRegistrationFails();
            this._registrationsBlocked = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getRegistrationsBlocked();
            this._pageAttempts = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getPageAttempts();
            this._pageFails = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getPageFails();
            this._voiceCallAttempts = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getVoiceCallAttempts();
            this._voiceCallFailures = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getVoiceCallFailures();
            this._voiceCallsBlocked = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getVoiceCallsBlocked();
            this._voiceCallsDropped = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getVoiceCallsDropped();
            this._dataCallAttempts = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getDataCallAttempts();
            this._dataCallFailures = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getDataCallFailures();
            this._dataCallsBlocked = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getDataCallsBlocked();
            this._dataCallsDropped = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getDataCallsDropped();
            this._averageVoiceCall = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getAverageVoiceCall();
            this._averageDataCall = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getAverageDataCall();
            this._averageSessionInSec = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getAverageSessionInSec();
            this._totalVoiceCalls = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getTotalVoiceCalls();
            this._totalDataCalls = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getTotalDataCalls();
            this._fwdVoicePacketDropPercentage = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getFwdVoicePacketDropPercentage();
            this._revVoicePacketDropPercentage = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getRevVoicePacketDropPercentage();
            this._fwdAvgDataRate = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getFwdAvgDataRate();
            this._revAvgDataRate = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getRevAvgDataRate();
            this._bcIndexZeroToOneTransitions = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getBcIndexZeroToOneTransitions();
            this._bcIndexOneToZeroTransitions = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG)arg).getBcIndexOneToZeroTransitions();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getAverageDataCall() {
        return _averageDataCall;
    }
    
    public java.lang.Long getAverageSessionInSec() {
        return _averageSessionInSec;
    }
    
    public java.lang.Long getAverageVoiceCall() {
        return _averageVoiceCall;
    }
    
    public java.lang.Long getBcIndexOneToZeroTransitions() {
        return _bcIndexOneToZeroTransitions;
    }
    
    public java.lang.Long getBcIndexZeroToOneTransitions() {
        return _bcIndexZeroToOneTransitions;
    }
    
    public java.lang.Long getDataCallAttempts() {
        return _dataCallAttempts;
    }
    
    public java.lang.Long getDataCallFailures() {
        return _dataCallFailures;
    }
    
    public java.lang.Long getDataCallsBlocked() {
        return _dataCallsBlocked;
    }
    
    public java.lang.Long getDataCallsDropped() {
        return _dataCallsDropped;
    }
    
    public java.lang.Long getFwdAvgDataRate() {
        return _fwdAvgDataRate;
    }
    
    public java.lang.Long getFwdVoicePacketDropPercentage() {
        return _fwdVoicePacketDropPercentage;
    }
    
    public java.lang.Long getPageAttempts() {
        return _pageAttempts;
    }
    
    public java.lang.Long getPageFails() {
        return _pageFails;
    }
    
    public java.lang.Long getRegistrationAttempts() {
        return _registrationAttempts;
    }
    
    public java.lang.Long getRegistrationFails() {
        return _registrationFails;
    }
    
    public java.lang.Long getRegistrationsBlocked() {
        return _registrationsBlocked;
    }
    
    public java.lang.Long getRevAvgDataRate() {
        return _revAvgDataRate;
    }
    
    public java.lang.Long getRevVoicePacketDropPercentage() {
        return _revVoicePacketDropPercentage;
    }
    
    public java.lang.Long getTotalDataCalls() {
        return _totalDataCalls;
    }
    
    public java.lang.Long getTotalVoiceCalls() {
        return _totalVoiceCalls;
    }
    
    public java.lang.Long getVoiceCallAttempts() {
        return _voiceCallAttempts;
    }
    
    public java.lang.Long getVoiceCallFailures() {
        return _voiceCallFailures;
    }
    
    public java.lang.Long getVoiceCallsBlocked() {
        return _voiceCallsBlocked;
    }
    
    public java.lang.Long getVoiceCallsDropped() {
        return _voiceCallsDropped;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkAverageDataCallRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setAverageDataCall(final java.lang.Long value) {
    if (value != null) {
        checkAverageDataCallRange(value);
    }
        this._averageDataCall = value;
        return this;
    }
    
     
     private static void checkAverageSessionInSecRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setAverageSessionInSec(final java.lang.Long value) {
    if (value != null) {
        checkAverageSessionInSecRange(value);
    }
        this._averageSessionInSec = value;
        return this;
    }
    
     
     private static void checkAverageVoiceCallRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setAverageVoiceCall(final java.lang.Long value) {
    if (value != null) {
        checkAverageVoiceCallRange(value);
    }
        this._averageVoiceCall = value;
        return this;
    }
    
     
     private static void checkBcIndexOneToZeroTransitionsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setBcIndexOneToZeroTransitions(final java.lang.Long value) {
    if (value != null) {
        checkBcIndexOneToZeroTransitionsRange(value);
    }
        this._bcIndexOneToZeroTransitions = value;
        return this;
    }
    
     
     private static void checkBcIndexZeroToOneTransitionsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setBcIndexZeroToOneTransitions(final java.lang.Long value) {
    if (value != null) {
        checkBcIndexZeroToOneTransitionsRange(value);
    }
        this._bcIndexZeroToOneTransitions = value;
        return this;
    }
    
     
     private static void checkDataCallAttemptsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setDataCallAttempts(final java.lang.Long value) {
    if (value != null) {
        checkDataCallAttemptsRange(value);
    }
        this._dataCallAttempts = value;
        return this;
    }
    
     
     private static void checkDataCallFailuresRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setDataCallFailures(final java.lang.Long value) {
    if (value != null) {
        checkDataCallFailuresRange(value);
    }
        this._dataCallFailures = value;
        return this;
    }
    
     
     private static void checkDataCallsBlockedRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setDataCallsBlocked(final java.lang.Long value) {
    if (value != null) {
        checkDataCallsBlockedRange(value);
    }
        this._dataCallsBlocked = value;
        return this;
    }
    
     
     private static void checkDataCallsDroppedRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setDataCallsDropped(final java.lang.Long value) {
    if (value != null) {
        checkDataCallsDroppedRange(value);
    }
        this._dataCallsDropped = value;
        return this;
    }
    
     
     private static void checkFwdAvgDataRateRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setFwdAvgDataRate(final java.lang.Long value) {
    if (value != null) {
        checkFwdAvgDataRateRange(value);
    }
        this._fwdAvgDataRate = value;
        return this;
    }
    
     
     private static void checkFwdVoicePacketDropPercentageRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setFwdVoicePacketDropPercentage(final java.lang.Long value) {
    if (value != null) {
        checkFwdVoicePacketDropPercentageRange(value);
    }
        this._fwdVoicePacketDropPercentage = value;
        return this;
    }
    
     
     private static void checkPageAttemptsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setPageAttempts(final java.lang.Long value) {
    if (value != null) {
        checkPageAttemptsRange(value);
    }
        this._pageAttempts = value;
        return this;
    }
    
     
     private static void checkPageFailsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setPageFails(final java.lang.Long value) {
    if (value != null) {
        checkPageFailsRange(value);
    }
        this._pageFails = value;
        return this;
    }
    
     
     private static void checkRegistrationAttemptsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setRegistrationAttempts(final java.lang.Long value) {
    if (value != null) {
        checkRegistrationAttemptsRange(value);
    }
        this._registrationAttempts = value;
        return this;
    }
    
     
     private static void checkRegistrationFailsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setRegistrationFails(final java.lang.Long value) {
    if (value != null) {
        checkRegistrationFailsRange(value);
    }
        this._registrationFails = value;
        return this;
    }
    
     
     private static void checkRegistrationsBlockedRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setRegistrationsBlocked(final java.lang.Long value) {
    if (value != null) {
        checkRegistrationsBlockedRange(value);
    }
        this._registrationsBlocked = value;
        return this;
    }
    
     
     private static void checkRevAvgDataRateRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setRevAvgDataRate(final java.lang.Long value) {
    if (value != null) {
        checkRevAvgDataRateRange(value);
    }
        this._revAvgDataRate = value;
        return this;
    }
    
     
     private static void checkRevVoicePacketDropPercentageRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setRevVoicePacketDropPercentage(final java.lang.Long value) {
    if (value != null) {
        checkRevVoicePacketDropPercentageRange(value);
    }
        this._revVoicePacketDropPercentage = value;
        return this;
    }
    
     
     private static void checkTotalDataCallsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setTotalDataCalls(final java.lang.Long value) {
    if (value != null) {
        checkTotalDataCallsRange(value);
    }
        this._totalDataCalls = value;
        return this;
    }
    
     
     private static void checkTotalVoiceCallsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setTotalVoiceCalls(final java.lang.Long value) {
    if (value != null) {
        checkTotalVoiceCallsRange(value);
    }
        this._totalVoiceCalls = value;
        return this;
    }
    
     
     private static void checkVoiceCallAttemptsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setVoiceCallAttempts(final java.lang.Long value) {
    if (value != null) {
        checkVoiceCallAttemptsRange(value);
    }
        this._voiceCallAttempts = value;
        return this;
    }
    
     
     private static void checkVoiceCallFailuresRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setVoiceCallFailures(final java.lang.Long value) {
    if (value != null) {
        checkVoiceCallFailuresRange(value);
    }
        this._voiceCallFailures = value;
        return this;
    }
    
     
     private static void checkVoiceCallsBlockedRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setVoiceCallsBlocked(final java.lang.Long value) {
    if (value != null) {
        checkVoiceCallsBlockedRange(value);
    }
        this._voiceCallsBlocked = value;
        return this;
    }
    
     
     private static void checkVoiceCallsDroppedRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXStatsBuilder setVoiceCallsDropped(final java.lang.Long value) {
    if (value != null) {
        checkVoiceCallsDroppedRange(value);
    }
        this._voiceCallsDropped = value;
        return this;
    }
    
    public Cdma2000OneXStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXStats build() {
        return new Cdma2000OneXStatsImpl(this);
    }

    private static final class Cdma2000OneXStatsImpl implements Cdma2000OneXStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats.class;
        }

        private final java.lang.Long _averageDataCall;
        private final java.lang.Long _averageSessionInSec;
        private final java.lang.Long _averageVoiceCall;
        private final java.lang.Long _bcIndexOneToZeroTransitions;
        private final java.lang.Long _bcIndexZeroToOneTransitions;
        private final java.lang.Long _dataCallAttempts;
        private final java.lang.Long _dataCallFailures;
        private final java.lang.Long _dataCallsBlocked;
        private final java.lang.Long _dataCallsDropped;
        private final java.lang.Long _fwdAvgDataRate;
        private final java.lang.Long _fwdVoicePacketDropPercentage;
        private final java.lang.Long _pageAttempts;
        private final java.lang.Long _pageFails;
        private final java.lang.Long _registrationAttempts;
        private final java.lang.Long _registrationFails;
        private final java.lang.Long _registrationsBlocked;
        private final java.lang.Long _revAvgDataRate;
        private final java.lang.Long _revVoicePacketDropPercentage;
        private final java.lang.Long _totalDataCalls;
        private final java.lang.Long _totalVoiceCalls;
        private final java.lang.Long _voiceCallAttempts;
        private final java.lang.Long _voiceCallFailures;
        private final java.lang.Long _voiceCallsBlocked;
        private final java.lang.Long _voiceCallsDropped;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>> augmentation = Collections.emptyMap();

        private Cdma2000OneXStatsImpl(Cdma2000OneXStatsBuilder base) {
            this._averageDataCall = base.getAverageDataCall();
            this._averageSessionInSec = base.getAverageSessionInSec();
            this._averageVoiceCall = base.getAverageVoiceCall();
            this._bcIndexOneToZeroTransitions = base.getBcIndexOneToZeroTransitions();
            this._bcIndexZeroToOneTransitions = base.getBcIndexZeroToOneTransitions();
            this._dataCallAttempts = base.getDataCallAttempts();
            this._dataCallFailures = base.getDataCallFailures();
            this._dataCallsBlocked = base.getDataCallsBlocked();
            this._dataCallsDropped = base.getDataCallsDropped();
            this._fwdAvgDataRate = base.getFwdAvgDataRate();
            this._fwdVoicePacketDropPercentage = base.getFwdVoicePacketDropPercentage();
            this._pageAttempts = base.getPageAttempts();
            this._pageFails = base.getPageFails();
            this._registrationAttempts = base.getRegistrationAttempts();
            this._registrationFails = base.getRegistrationFails();
            this._registrationsBlocked = base.getRegistrationsBlocked();
            this._revAvgDataRate = base.getRevAvgDataRate();
            this._revVoicePacketDropPercentage = base.getRevVoicePacketDropPercentage();
            this._totalDataCalls = base.getTotalDataCalls();
            this._totalVoiceCalls = base.getTotalVoiceCalls();
            this._voiceCallAttempts = base.getVoiceCallAttempts();
            this._voiceCallFailures = base.getVoiceCallFailures();
            this._voiceCallsBlocked = base.getVoiceCallsBlocked();
            this._voiceCallsDropped = base.getVoiceCallsDropped();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getAverageDataCall() {
            return _averageDataCall;
        }
        
        @Override
        public java.lang.Long getAverageSessionInSec() {
            return _averageSessionInSec;
        }
        
        @Override
        public java.lang.Long getAverageVoiceCall() {
            return _averageVoiceCall;
        }
        
        @Override
        public java.lang.Long getBcIndexOneToZeroTransitions() {
            return _bcIndexOneToZeroTransitions;
        }
        
        @Override
        public java.lang.Long getBcIndexZeroToOneTransitions() {
            return _bcIndexZeroToOneTransitions;
        }
        
        @Override
        public java.lang.Long getDataCallAttempts() {
            return _dataCallAttempts;
        }
        
        @Override
        public java.lang.Long getDataCallFailures() {
            return _dataCallFailures;
        }
        
        @Override
        public java.lang.Long getDataCallsBlocked() {
            return _dataCallsBlocked;
        }
        
        @Override
        public java.lang.Long getDataCallsDropped() {
            return _dataCallsDropped;
        }
        
        @Override
        public java.lang.Long getFwdAvgDataRate() {
            return _fwdAvgDataRate;
        }
        
        @Override
        public java.lang.Long getFwdVoicePacketDropPercentage() {
            return _fwdVoicePacketDropPercentage;
        }
        
        @Override
        public java.lang.Long getPageAttempts() {
            return _pageAttempts;
        }
        
        @Override
        public java.lang.Long getPageFails() {
            return _pageFails;
        }
        
        @Override
        public java.lang.Long getRegistrationAttempts() {
            return _registrationAttempts;
        }
        
        @Override
        public java.lang.Long getRegistrationFails() {
            return _registrationFails;
        }
        
        @Override
        public java.lang.Long getRegistrationsBlocked() {
            return _registrationsBlocked;
        }
        
        @Override
        public java.lang.Long getRevAvgDataRate() {
            return _revAvgDataRate;
        }
        
        @Override
        public java.lang.Long getRevVoicePacketDropPercentage() {
            return _revVoicePacketDropPercentage;
        }
        
        @Override
        public java.lang.Long getTotalDataCalls() {
            return _totalDataCalls;
        }
        
        @Override
        public java.lang.Long getTotalVoiceCalls() {
            return _totalVoiceCalls;
        }
        
        @Override
        public java.lang.Long getVoiceCallAttempts() {
            return _voiceCallAttempts;
        }
        
        @Override
        public java.lang.Long getVoiceCallFailures() {
            return _voiceCallFailures;
        }
        
        @Override
        public java.lang.Long getVoiceCallsBlocked() {
            return _voiceCallsBlocked;
        }
        
        @Override
        public java.lang.Long getVoiceCallsDropped() {
            return _voiceCallsDropped;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_averageDataCall);
            result = prime * result + Objects.hashCode(_averageSessionInSec);
            result = prime * result + Objects.hashCode(_averageVoiceCall);
            result = prime * result + Objects.hashCode(_bcIndexOneToZeroTransitions);
            result = prime * result + Objects.hashCode(_bcIndexZeroToOneTransitions);
            result = prime * result + Objects.hashCode(_dataCallAttempts);
            result = prime * result + Objects.hashCode(_dataCallFailures);
            result = prime * result + Objects.hashCode(_dataCallsBlocked);
            result = prime * result + Objects.hashCode(_dataCallsDropped);
            result = prime * result + Objects.hashCode(_fwdAvgDataRate);
            result = prime * result + Objects.hashCode(_fwdVoicePacketDropPercentage);
            result = prime * result + Objects.hashCode(_pageAttempts);
            result = prime * result + Objects.hashCode(_pageFails);
            result = prime * result + Objects.hashCode(_registrationAttempts);
            result = prime * result + Objects.hashCode(_registrationFails);
            result = prime * result + Objects.hashCode(_registrationsBlocked);
            result = prime * result + Objects.hashCode(_revAvgDataRate);
            result = prime * result + Objects.hashCode(_revVoicePacketDropPercentage);
            result = prime * result + Objects.hashCode(_totalDataCalls);
            result = prime * result + Objects.hashCode(_totalVoiceCalls);
            result = prime * result + Objects.hashCode(_voiceCallAttempts);
            result = prime * result + Objects.hashCode(_voiceCallFailures);
            result = prime * result + Objects.hashCode(_voiceCallsBlocked);
            result = prime * result + Objects.hashCode(_voiceCallsDropped);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats)obj;
            if (!Objects.equals(_averageDataCall, other.getAverageDataCall())) {
                return false;
            }
            if (!Objects.equals(_averageSessionInSec, other.getAverageSessionInSec())) {
                return false;
            }
            if (!Objects.equals(_averageVoiceCall, other.getAverageVoiceCall())) {
                return false;
            }
            if (!Objects.equals(_bcIndexOneToZeroTransitions, other.getBcIndexOneToZeroTransitions())) {
                return false;
            }
            if (!Objects.equals(_bcIndexZeroToOneTransitions, other.getBcIndexZeroToOneTransitions())) {
                return false;
            }
            if (!Objects.equals(_dataCallAttempts, other.getDataCallAttempts())) {
                return false;
            }
            if (!Objects.equals(_dataCallFailures, other.getDataCallFailures())) {
                return false;
            }
            if (!Objects.equals(_dataCallsBlocked, other.getDataCallsBlocked())) {
                return false;
            }
            if (!Objects.equals(_dataCallsDropped, other.getDataCallsDropped())) {
                return false;
            }
            if (!Objects.equals(_fwdAvgDataRate, other.getFwdAvgDataRate())) {
                return false;
            }
            if (!Objects.equals(_fwdVoicePacketDropPercentage, other.getFwdVoicePacketDropPercentage())) {
                return false;
            }
            if (!Objects.equals(_pageAttempts, other.getPageAttempts())) {
                return false;
            }
            if (!Objects.equals(_pageFails, other.getPageFails())) {
                return false;
            }
            if (!Objects.equals(_registrationAttempts, other.getRegistrationAttempts())) {
                return false;
            }
            if (!Objects.equals(_registrationFails, other.getRegistrationFails())) {
                return false;
            }
            if (!Objects.equals(_registrationsBlocked, other.getRegistrationsBlocked())) {
                return false;
            }
            if (!Objects.equals(_revAvgDataRate, other.getRevAvgDataRate())) {
                return false;
            }
            if (!Objects.equals(_revVoicePacketDropPercentage, other.getRevVoicePacketDropPercentage())) {
                return false;
            }
            if (!Objects.equals(_totalDataCalls, other.getTotalDataCalls())) {
                return false;
            }
            if (!Objects.equals(_totalVoiceCalls, other.getTotalVoiceCalls())) {
                return false;
            }
            if (!Objects.equals(_voiceCallAttempts, other.getVoiceCallAttempts())) {
                return false;
            }
            if (!Objects.equals(_voiceCallFailures, other.getVoiceCallFailures())) {
                return false;
            }
            if (!Objects.equals(_voiceCallsBlocked, other.getVoiceCallsBlocked())) {
                return false;
            }
            if (!Objects.equals(_voiceCallsDropped, other.getVoiceCallsDropped())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXStatsImpl otherImpl = (Cdma2000OneXStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_averageDataCall != null) {
                builder.append("_averageDataCall=");
                builder.append(_averageDataCall);
                builder.append(", ");
            }
            if (_averageSessionInSec != null) {
                builder.append("_averageSessionInSec=");
                builder.append(_averageSessionInSec);
                builder.append(", ");
            }
            if (_averageVoiceCall != null) {
                builder.append("_averageVoiceCall=");
                builder.append(_averageVoiceCall);
                builder.append(", ");
            }
            if (_bcIndexOneToZeroTransitions != null) {
                builder.append("_bcIndexOneToZeroTransitions=");
                builder.append(_bcIndexOneToZeroTransitions);
                builder.append(", ");
            }
            if (_bcIndexZeroToOneTransitions != null) {
                builder.append("_bcIndexZeroToOneTransitions=");
                builder.append(_bcIndexZeroToOneTransitions);
                builder.append(", ");
            }
            if (_dataCallAttempts != null) {
                builder.append("_dataCallAttempts=");
                builder.append(_dataCallAttempts);
                builder.append(", ");
            }
            if (_dataCallFailures != null) {
                builder.append("_dataCallFailures=");
                builder.append(_dataCallFailures);
                builder.append(", ");
            }
            if (_dataCallsBlocked != null) {
                builder.append("_dataCallsBlocked=");
                builder.append(_dataCallsBlocked);
                builder.append(", ");
            }
            if (_dataCallsDropped != null) {
                builder.append("_dataCallsDropped=");
                builder.append(_dataCallsDropped);
                builder.append(", ");
            }
            if (_fwdAvgDataRate != null) {
                builder.append("_fwdAvgDataRate=");
                builder.append(_fwdAvgDataRate);
                builder.append(", ");
            }
            if (_fwdVoicePacketDropPercentage != null) {
                builder.append("_fwdVoicePacketDropPercentage=");
                builder.append(_fwdVoicePacketDropPercentage);
                builder.append(", ");
            }
            if (_pageAttempts != null) {
                builder.append("_pageAttempts=");
                builder.append(_pageAttempts);
                builder.append(", ");
            }
            if (_pageFails != null) {
                builder.append("_pageFails=");
                builder.append(_pageFails);
                builder.append(", ");
            }
            if (_registrationAttempts != null) {
                builder.append("_registrationAttempts=");
                builder.append(_registrationAttempts);
                builder.append(", ");
            }
            if (_registrationFails != null) {
                builder.append("_registrationFails=");
                builder.append(_registrationFails);
                builder.append(", ");
            }
            if (_registrationsBlocked != null) {
                builder.append("_registrationsBlocked=");
                builder.append(_registrationsBlocked);
                builder.append(", ");
            }
            if (_revAvgDataRate != null) {
                builder.append("_revAvgDataRate=");
                builder.append(_revAvgDataRate);
                builder.append(", ");
            }
            if (_revVoicePacketDropPercentage != null) {
                builder.append("_revVoicePacketDropPercentage=");
                builder.append(_revVoicePacketDropPercentage);
                builder.append(", ");
            }
            if (_totalDataCalls != null) {
                builder.append("_totalDataCalls=");
                builder.append(_totalDataCalls);
                builder.append(", ");
            }
            if (_totalVoiceCalls != null) {
                builder.append("_totalVoiceCalls=");
                builder.append(_totalVoiceCalls);
                builder.append(", ");
            }
            if (_voiceCallAttempts != null) {
                builder.append("_voiceCallAttempts=");
                builder.append(_voiceCallAttempts);
                builder.append(", ");
            }
            if (_voiceCallFailures != null) {
                builder.append("_voiceCallFailures=");
                builder.append(_voiceCallFailures);
                builder.append(", ");
            }
            if (_voiceCallsBlocked != null) {
                builder.append("_voiceCallsBlocked=");
                builder.append(_voiceCallsBlocked);
                builder.append(", ");
            }
            if (_voiceCallsDropped != null) {
                builder.append("_voiceCallsDropped=");
                builder.append(_voiceCallsDropped);
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
