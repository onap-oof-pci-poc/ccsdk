package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats
 *
 */
public class Cdma2000OneXRanHardHandoffStatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats> {

    private java.lang.Long _callDropCount;
    private java.lang.Long _hoFailureCount;
    private java.lang.Long _hoRequiredRejected;
    private java.lang.Long _hoRequiredUnanswered;
    private java.lang.Long _onePilotReportCount;
    private java.lang.Long _returnOnFailureCount;
    private java.lang.Long _rxHoCommand;
    private java.lang.Long _rxHoSessionClear;
    private java.lang.Long _rxNsAck;
    private java.lang.Long _threePilotReportCount;
    private java.lang.Long _twoPilotReportCount;
    private java.lang.Long _txHoCommence;
    private java.lang.Long _txHoRequired;
    private java.lang.Long _txUhdm;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanHardHandoffStatsBuilder() {
    }
    public Cdma2000OneXRanHardHandoffStatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG arg) {
        this._txHoRequired = arg.getTxHoRequired();
        this._rxHoCommand = arg.getRxHoCommand();
        this._hoRequiredRejected = arg.getHoRequiredRejected();
        this._hoRequiredUnanswered = arg.getHoRequiredUnanswered();
        this._txUhdm = arg.getTxUhdm();
        this._rxNsAck = arg.getRxNsAck();
        this._hoFailureCount = arg.getHoFailureCount();
        this._callDropCount = arg.getCallDropCount();
        this._txHoCommence = arg.getTxHoCommence();
        this._rxHoSessionClear = arg.getRxHoSessionClear();
        this._returnOnFailureCount = arg.getReturnOnFailureCount();
        this._onePilotReportCount = arg.getOnePilotReportCount();
        this._twoPilotReportCount = arg.getTwoPilotReportCount();
        this._threePilotReportCount = arg.getThreePilotReportCount();
    }

    public Cdma2000OneXRanHardHandoffStatsBuilder(Cdma2000OneXRanHardHandoffStats base) {
        this._callDropCount = base.getCallDropCount();
        this._hoFailureCount = base.getHoFailureCount();
        this._hoRequiredRejected = base.getHoRequiredRejected();
        this._hoRequiredUnanswered = base.getHoRequiredUnanswered();
        this._onePilotReportCount = base.getOnePilotReportCount();
        this._returnOnFailureCount = base.getReturnOnFailureCount();
        this._rxHoCommand = base.getRxHoCommand();
        this._rxHoSessionClear = base.getRxHoSessionClear();
        this._rxNsAck = base.getRxNsAck();
        this._threePilotReportCount = base.getThreePilotReportCount();
        this._twoPilotReportCount = base.getTwoPilotReportCount();
        this._txHoCommence = base.getTxHoCommence();
        this._txHoRequired = base.getTxHoRequired();
        this._txUhdm = base.getTxUhdm();
        if (base instanceof Cdma2000OneXRanHardHandoffStatsImpl) {
            Cdma2000OneXRanHardHandoffStatsImpl impl = (Cdma2000OneXRanHardHandoffStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG) {
            this._txHoRequired = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getTxHoRequired();
            this._rxHoCommand = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getRxHoCommand();
            this._hoRequiredRejected = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getHoRequiredRejected();
            this._hoRequiredUnanswered = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getHoRequiredUnanswered();
            this._txUhdm = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getTxUhdm();
            this._rxNsAck = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getRxNsAck();
            this._hoFailureCount = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getHoFailureCount();
            this._callDropCount = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getCallDropCount();
            this._txHoCommence = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getTxHoCommence();
            this._rxHoSessionClear = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getRxHoSessionClear();
            this._returnOnFailureCount = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getReturnOnFailureCount();
            this._onePilotReportCount = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getOnePilotReportCount();
            this._twoPilotReportCount = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getTwoPilotReportCount();
            this._threePilotReportCount = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG)arg).getThreePilotReportCount();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getCallDropCount() {
        return _callDropCount;
    }
    
    public java.lang.Long getHoFailureCount() {
        return _hoFailureCount;
    }
    
    public java.lang.Long getHoRequiredRejected() {
        return _hoRequiredRejected;
    }
    
    public java.lang.Long getHoRequiredUnanswered() {
        return _hoRequiredUnanswered;
    }
    
    public java.lang.Long getOnePilotReportCount() {
        return _onePilotReportCount;
    }
    
    public java.lang.Long getReturnOnFailureCount() {
        return _returnOnFailureCount;
    }
    
    public java.lang.Long getRxHoCommand() {
        return _rxHoCommand;
    }
    
    public java.lang.Long getRxHoSessionClear() {
        return _rxHoSessionClear;
    }
    
    public java.lang.Long getRxNsAck() {
        return _rxNsAck;
    }
    
    public java.lang.Long getThreePilotReportCount() {
        return _threePilotReportCount;
    }
    
    public java.lang.Long getTwoPilotReportCount() {
        return _twoPilotReportCount;
    }
    
    public java.lang.Long getTxHoCommence() {
        return _txHoCommence;
    }
    
    public java.lang.Long getTxHoRequired() {
        return _txHoRequired;
    }
    
    public java.lang.Long getTxUhdm() {
        return _txUhdm;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCallDropCountRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setCallDropCount(final java.lang.Long value) {
    if (value != null) {
        checkCallDropCountRange(value);
    }
        this._callDropCount = value;
        return this;
    }
    
     
     private static void checkHoFailureCountRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setHoFailureCount(final java.lang.Long value) {
    if (value != null) {
        checkHoFailureCountRange(value);
    }
        this._hoFailureCount = value;
        return this;
    }
    
     
     private static void checkHoRequiredRejectedRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setHoRequiredRejected(final java.lang.Long value) {
    if (value != null) {
        checkHoRequiredRejectedRange(value);
    }
        this._hoRequiredRejected = value;
        return this;
    }
    
     
     private static void checkHoRequiredUnansweredRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setHoRequiredUnanswered(final java.lang.Long value) {
    if (value != null) {
        checkHoRequiredUnansweredRange(value);
    }
        this._hoRequiredUnanswered = value;
        return this;
    }
    
     
     private static void checkOnePilotReportCountRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setOnePilotReportCount(final java.lang.Long value) {
    if (value != null) {
        checkOnePilotReportCountRange(value);
    }
        this._onePilotReportCount = value;
        return this;
    }
    
     
     private static void checkReturnOnFailureCountRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setReturnOnFailureCount(final java.lang.Long value) {
    if (value != null) {
        checkReturnOnFailureCountRange(value);
    }
        this._returnOnFailureCount = value;
        return this;
    }
    
     
     private static void checkRxHoCommandRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setRxHoCommand(final java.lang.Long value) {
    if (value != null) {
        checkRxHoCommandRange(value);
    }
        this._rxHoCommand = value;
        return this;
    }
    
     
     private static void checkRxHoSessionClearRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setRxHoSessionClear(final java.lang.Long value) {
    if (value != null) {
        checkRxHoSessionClearRange(value);
    }
        this._rxHoSessionClear = value;
        return this;
    }
    
     
     private static void checkRxNsAckRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setRxNsAck(final java.lang.Long value) {
    if (value != null) {
        checkRxNsAckRange(value);
    }
        this._rxNsAck = value;
        return this;
    }
    
     
     private static void checkThreePilotReportCountRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setThreePilotReportCount(final java.lang.Long value) {
    if (value != null) {
        checkThreePilotReportCountRange(value);
    }
        this._threePilotReportCount = value;
        return this;
    }
    
     
     private static void checkTwoPilotReportCountRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setTwoPilotReportCount(final java.lang.Long value) {
    if (value != null) {
        checkTwoPilotReportCountRange(value);
    }
        this._twoPilotReportCount = value;
        return this;
    }
    
     
     private static void checkTxHoCommenceRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setTxHoCommence(final java.lang.Long value) {
    if (value != null) {
        checkTxHoCommenceRange(value);
    }
        this._txHoCommence = value;
        return this;
    }
    
     
     private static void checkTxHoRequiredRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setTxHoRequired(final java.lang.Long value) {
    if (value != null) {
        checkTxHoRequiredRange(value);
    }
        this._txHoRequired = value;
        return this;
    }
    
     
     private static void checkTxUhdmRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder setTxUhdm(final java.lang.Long value) {
    if (value != null) {
        checkTxUhdmRange(value);
    }
        this._txUhdm = value;
        return this;
    }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanHardHandoffStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanHardHandoffStats build() {
        return new Cdma2000OneXRanHardHandoffStatsImpl(this);
    }

    private static final class Cdma2000OneXRanHardHandoffStatsImpl implements Cdma2000OneXRanHardHandoffStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats.class;
        }

        private final java.lang.Long _callDropCount;
        private final java.lang.Long _hoFailureCount;
        private final java.lang.Long _hoRequiredRejected;
        private final java.lang.Long _hoRequiredUnanswered;
        private final java.lang.Long _onePilotReportCount;
        private final java.lang.Long _returnOnFailureCount;
        private final java.lang.Long _rxHoCommand;
        private final java.lang.Long _rxHoSessionClear;
        private final java.lang.Long _rxNsAck;
        private final java.lang.Long _threePilotReportCount;
        private final java.lang.Long _twoPilotReportCount;
        private final java.lang.Long _txHoCommence;
        private final java.lang.Long _txHoRequired;
        private final java.lang.Long _txUhdm;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanHardHandoffStatsImpl(Cdma2000OneXRanHardHandoffStatsBuilder base) {
            this._callDropCount = base.getCallDropCount();
            this._hoFailureCount = base.getHoFailureCount();
            this._hoRequiredRejected = base.getHoRequiredRejected();
            this._hoRequiredUnanswered = base.getHoRequiredUnanswered();
            this._onePilotReportCount = base.getOnePilotReportCount();
            this._returnOnFailureCount = base.getReturnOnFailureCount();
            this._rxHoCommand = base.getRxHoCommand();
            this._rxHoSessionClear = base.getRxHoSessionClear();
            this._rxNsAck = base.getRxNsAck();
            this._threePilotReportCount = base.getThreePilotReportCount();
            this._twoPilotReportCount = base.getTwoPilotReportCount();
            this._txHoCommence = base.getTxHoCommence();
            this._txHoRequired = base.getTxHoRequired();
            this._txUhdm = base.getTxUhdm();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCallDropCount() {
            return _callDropCount;
        }
        
        @Override
        public java.lang.Long getHoFailureCount() {
            return _hoFailureCount;
        }
        
        @Override
        public java.lang.Long getHoRequiredRejected() {
            return _hoRequiredRejected;
        }
        
        @Override
        public java.lang.Long getHoRequiredUnanswered() {
            return _hoRequiredUnanswered;
        }
        
        @Override
        public java.lang.Long getOnePilotReportCount() {
            return _onePilotReportCount;
        }
        
        @Override
        public java.lang.Long getReturnOnFailureCount() {
            return _returnOnFailureCount;
        }
        
        @Override
        public java.lang.Long getRxHoCommand() {
            return _rxHoCommand;
        }
        
        @Override
        public java.lang.Long getRxHoSessionClear() {
            return _rxHoSessionClear;
        }
        
        @Override
        public java.lang.Long getRxNsAck() {
            return _rxNsAck;
        }
        
        @Override
        public java.lang.Long getThreePilotReportCount() {
            return _threePilotReportCount;
        }
        
        @Override
        public java.lang.Long getTwoPilotReportCount() {
            return _twoPilotReportCount;
        }
        
        @Override
        public java.lang.Long getTxHoCommence() {
            return _txHoCommence;
        }
        
        @Override
        public java.lang.Long getTxHoRequired() {
            return _txHoRequired;
        }
        
        @Override
        public java.lang.Long getTxUhdm() {
            return _txUhdm;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_callDropCount);
            result = prime * result + Objects.hashCode(_hoFailureCount);
            result = prime * result + Objects.hashCode(_hoRequiredRejected);
            result = prime * result + Objects.hashCode(_hoRequiredUnanswered);
            result = prime * result + Objects.hashCode(_onePilotReportCount);
            result = prime * result + Objects.hashCode(_returnOnFailureCount);
            result = prime * result + Objects.hashCode(_rxHoCommand);
            result = prime * result + Objects.hashCode(_rxHoSessionClear);
            result = prime * result + Objects.hashCode(_rxNsAck);
            result = prime * result + Objects.hashCode(_threePilotReportCount);
            result = prime * result + Objects.hashCode(_twoPilotReportCount);
            result = prime * result + Objects.hashCode(_txHoCommence);
            result = prime * result + Objects.hashCode(_txHoRequired);
            result = prime * result + Objects.hashCode(_txUhdm);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats)obj;
            if (!Objects.equals(_callDropCount, other.getCallDropCount())) {
                return false;
            }
            if (!Objects.equals(_hoFailureCount, other.getHoFailureCount())) {
                return false;
            }
            if (!Objects.equals(_hoRequiredRejected, other.getHoRequiredRejected())) {
                return false;
            }
            if (!Objects.equals(_hoRequiredUnanswered, other.getHoRequiredUnanswered())) {
                return false;
            }
            if (!Objects.equals(_onePilotReportCount, other.getOnePilotReportCount())) {
                return false;
            }
            if (!Objects.equals(_returnOnFailureCount, other.getReturnOnFailureCount())) {
                return false;
            }
            if (!Objects.equals(_rxHoCommand, other.getRxHoCommand())) {
                return false;
            }
            if (!Objects.equals(_rxHoSessionClear, other.getRxHoSessionClear())) {
                return false;
            }
            if (!Objects.equals(_rxNsAck, other.getRxNsAck())) {
                return false;
            }
            if (!Objects.equals(_threePilotReportCount, other.getThreePilotReportCount())) {
                return false;
            }
            if (!Objects.equals(_twoPilotReportCount, other.getTwoPilotReportCount())) {
                return false;
            }
            if (!Objects.equals(_txHoCommence, other.getTxHoCommence())) {
                return false;
            }
            if (!Objects.equals(_txHoRequired, other.getTxHoRequired())) {
                return false;
            }
            if (!Objects.equals(_txUhdm, other.getTxUhdm())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanHardHandoffStatsImpl otherImpl = (Cdma2000OneXRanHardHandoffStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanHardHandoffStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_callDropCount != null) {
                builder.append("_callDropCount=");
                builder.append(_callDropCount);
                builder.append(", ");
            }
            if (_hoFailureCount != null) {
                builder.append("_hoFailureCount=");
                builder.append(_hoFailureCount);
                builder.append(", ");
            }
            if (_hoRequiredRejected != null) {
                builder.append("_hoRequiredRejected=");
                builder.append(_hoRequiredRejected);
                builder.append(", ");
            }
            if (_hoRequiredUnanswered != null) {
                builder.append("_hoRequiredUnanswered=");
                builder.append(_hoRequiredUnanswered);
                builder.append(", ");
            }
            if (_onePilotReportCount != null) {
                builder.append("_onePilotReportCount=");
                builder.append(_onePilotReportCount);
                builder.append(", ");
            }
            if (_returnOnFailureCount != null) {
                builder.append("_returnOnFailureCount=");
                builder.append(_returnOnFailureCount);
                builder.append(", ");
            }
            if (_rxHoCommand != null) {
                builder.append("_rxHoCommand=");
                builder.append(_rxHoCommand);
                builder.append(", ");
            }
            if (_rxHoSessionClear != null) {
                builder.append("_rxHoSessionClear=");
                builder.append(_rxHoSessionClear);
                builder.append(", ");
            }
            if (_rxNsAck != null) {
                builder.append("_rxNsAck=");
                builder.append(_rxNsAck);
                builder.append(", ");
            }
            if (_threePilotReportCount != null) {
                builder.append("_threePilotReportCount=");
                builder.append(_threePilotReportCount);
                builder.append(", ");
            }
            if (_twoPilotReportCount != null) {
                builder.append("_twoPilotReportCount=");
                builder.append(_twoPilotReportCount);
                builder.append(", ");
            }
            if (_txHoCommence != null) {
                builder.append("_txHoCommence=");
                builder.append(_txHoCommence);
                builder.append(", ");
            }
            if (_txHoRequired != null) {
                builder.append("_txHoRequired=");
                builder.append(_txHoRequired);
                builder.append(", ");
            }
            if (_txUhdm != null) {
                builder.append("_txUhdm=");
                builder.append(_txUhdm);
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
