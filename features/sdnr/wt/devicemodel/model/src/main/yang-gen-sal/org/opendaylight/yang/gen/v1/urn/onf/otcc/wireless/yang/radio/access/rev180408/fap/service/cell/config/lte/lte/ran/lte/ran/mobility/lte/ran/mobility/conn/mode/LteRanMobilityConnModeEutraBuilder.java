package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG.TriggerQuantity;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG.ReportQuantity;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra
 *
 */
public class LteRanMobilityConnModeEutraBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra> {

    private java.lang.Short _a1ThresholdRsrp;
    private java.lang.Short _a1ThresholdRsrq;
    private java.lang.Short _a2ThresholdRsrp;
    private java.lang.Short _a2ThresholdRsrq;
    private List<java.lang.String> _a3Offset;
    private java.lang.Short _a4ThresholdRsrp;
    private java.lang.Short _a4ThresholdRsrq;
    private java.lang.Short _a5Threshold1Rsrp;
    private java.lang.Short _a5Threshold1Rsrq;
    private java.lang.Short _a5Threshold2Rsrp;
    private java.lang.Short _a5Threshold2Rsrq;
    private List<java.lang.String> _filterCoefficientRsrp;
    private List<java.lang.String> _filterCoefficientRsrq;
    private List<java.lang.String> _hysteresis;
    private java.lang.Short _maxReportCells;
    private java.lang.Short _reportAmount;
    private java.lang.Long _reportInterval;
    private ReportQuantity _reportQuantity;
    private List<java.lang.Integer> _timeToTrigger;
    private TriggerQuantity _triggerQuantity;
    private java.lang.Boolean _reportOnLeave;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>> augmentation = Collections.emptyMap();

    public LteRanMobilityConnModeEutraBuilder() {
    }
    public LteRanMobilityConnModeEutraBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG arg) {
        this._filterCoefficientRsrp = arg.getFilterCoefficientRsrp();
        this._filterCoefficientRsrq = arg.getFilterCoefficientRsrq();
        this._a1ThresholdRsrp = arg.getA1ThresholdRsrp();
        this._a1ThresholdRsrq = arg.getA1ThresholdRsrq();
        this._a2ThresholdRsrp = arg.getA2ThresholdRsrp();
        this._a2ThresholdRsrq = arg.getA2ThresholdRsrq();
        this._a3Offset = arg.getA3Offset();
        this._reportOnLeave = arg.isReportOnLeave();
        this._a4ThresholdRsrp = arg.getA4ThresholdRsrp();
        this._a4ThresholdRsrq = arg.getA4ThresholdRsrq();
        this._a5Threshold1Rsrp = arg.getA5Threshold1Rsrp();
        this._a5Threshold1Rsrq = arg.getA5Threshold1Rsrq();
        this._a5Threshold2Rsrp = arg.getA5Threshold2Rsrp();
        this._a5Threshold2Rsrq = arg.getA5Threshold2Rsrq();
        this._hysteresis = arg.getHysteresis();
        this._timeToTrigger = arg.getTimeToTrigger();
        this._triggerQuantity = arg.getTriggerQuantity();
        this._reportQuantity = arg.getReportQuantity();
        this._maxReportCells = arg.getMaxReportCells();
        this._reportInterval = arg.getReportInterval();
        this._reportAmount = arg.getReportAmount();
    }

    public LteRanMobilityConnModeEutraBuilder(LteRanMobilityConnModeEutra base) {
        this._a1ThresholdRsrp = base.getA1ThresholdRsrp();
        this._a1ThresholdRsrq = base.getA1ThresholdRsrq();
        this._a2ThresholdRsrp = base.getA2ThresholdRsrp();
        this._a2ThresholdRsrq = base.getA2ThresholdRsrq();
        this._a3Offset = base.getA3Offset();
        this._a4ThresholdRsrp = base.getA4ThresholdRsrp();
        this._a4ThresholdRsrq = base.getA4ThresholdRsrq();
        this._a5Threshold1Rsrp = base.getA5Threshold1Rsrp();
        this._a5Threshold1Rsrq = base.getA5Threshold1Rsrq();
        this._a5Threshold2Rsrp = base.getA5Threshold2Rsrp();
        this._a5Threshold2Rsrq = base.getA5Threshold2Rsrq();
        this._filterCoefficientRsrp = base.getFilterCoefficientRsrp();
        this._filterCoefficientRsrq = base.getFilterCoefficientRsrq();
        this._hysteresis = base.getHysteresis();
        this._maxReportCells = base.getMaxReportCells();
        this._reportAmount = base.getReportAmount();
        this._reportInterval = base.getReportInterval();
        this._reportQuantity = base.getReportQuantity();
        this._timeToTrigger = base.getTimeToTrigger();
        this._triggerQuantity = base.getTriggerQuantity();
        this._reportOnLeave = base.isReportOnLeave();
        if (base instanceof LteRanMobilityConnModeEutraImpl) {
            LteRanMobilityConnModeEutraImpl impl = (LteRanMobilityConnModeEutraImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG) {
            this._filterCoefficientRsrp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getFilterCoefficientRsrp();
            this._filterCoefficientRsrq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getFilterCoefficientRsrq();
            this._a1ThresholdRsrp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA1ThresholdRsrp();
            this._a1ThresholdRsrq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA1ThresholdRsrq();
            this._a2ThresholdRsrp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA2ThresholdRsrp();
            this._a2ThresholdRsrq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA2ThresholdRsrq();
            this._a3Offset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA3Offset();
            this._reportOnLeave = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).isReportOnLeave();
            this._a4ThresholdRsrp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA4ThresholdRsrp();
            this._a4ThresholdRsrq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA4ThresholdRsrq();
            this._a5Threshold1Rsrp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA5Threshold1Rsrp();
            this._a5Threshold1Rsrq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA5Threshold1Rsrq();
            this._a5Threshold2Rsrp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA5Threshold2Rsrp();
            this._a5Threshold2Rsrq = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getA5Threshold2Rsrq();
            this._hysteresis = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getHysteresis();
            this._timeToTrigger = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getTimeToTrigger();
            this._triggerQuantity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getTriggerQuantity();
            this._reportQuantity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getReportQuantity();
            this._maxReportCells = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getMaxReportCells();
            this._reportInterval = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getReportInterval();
            this._reportAmount = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG)arg).getReportAmount();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getA1ThresholdRsrp() {
        return _a1ThresholdRsrp;
    }
    
    public java.lang.Short getA1ThresholdRsrq() {
        return _a1ThresholdRsrq;
    }
    
    public java.lang.Short getA2ThresholdRsrp() {
        return _a2ThresholdRsrp;
    }
    
    public java.lang.Short getA2ThresholdRsrq() {
        return _a2ThresholdRsrq;
    }
    
    public List<java.lang.String> getA3Offset() {
        return _a3Offset;
    }
    
    public java.lang.Short getA4ThresholdRsrp() {
        return _a4ThresholdRsrp;
    }
    
    public java.lang.Short getA4ThresholdRsrq() {
        return _a4ThresholdRsrq;
    }
    
    public java.lang.Short getA5Threshold1Rsrp() {
        return _a5Threshold1Rsrp;
    }
    
    public java.lang.Short getA5Threshold1Rsrq() {
        return _a5Threshold1Rsrq;
    }
    
    public java.lang.Short getA5Threshold2Rsrp() {
        return _a5Threshold2Rsrp;
    }
    
    public java.lang.Short getA5Threshold2Rsrq() {
        return _a5Threshold2Rsrq;
    }
    
    public List<java.lang.String> getFilterCoefficientRsrp() {
        return _filterCoefficientRsrp;
    }
    
    public List<java.lang.String> getFilterCoefficientRsrq() {
        return _filterCoefficientRsrq;
    }
    
    public List<java.lang.String> getHysteresis() {
        return _hysteresis;
    }
    
    public java.lang.Short getMaxReportCells() {
        return _maxReportCells;
    }
    
    public java.lang.Short getReportAmount() {
        return _reportAmount;
    }
    
    public java.lang.Long getReportInterval() {
        return _reportInterval;
    }
    
    public ReportQuantity getReportQuantity() {
        return _reportQuantity;
    }
    
    public List<java.lang.Integer> getTimeToTrigger() {
        return _timeToTrigger;
    }
    
    public TriggerQuantity getTriggerQuantity() {
        return _triggerQuantity;
    }
    
    public java.lang.Boolean isReportOnLeave() {
        return _reportOnLeave;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkA1ThresholdRsrpRange(final short value) {
         if (value >= (short)0 && value <= (short)97) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..97]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setA1ThresholdRsrp(final java.lang.Short value) {
    if (value != null) {
        checkA1ThresholdRsrpRange(value);
    }
        this._a1ThresholdRsrp = value;
        return this;
    }
    
     
     private static void checkA1ThresholdRsrqRange(final short value) {
         if (value >= (short)0 && value <= (short)34) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..34]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setA1ThresholdRsrq(final java.lang.Short value) {
    if (value != null) {
        checkA1ThresholdRsrqRange(value);
    }
        this._a1ThresholdRsrq = value;
        return this;
    }
    
     
     private static void checkA2ThresholdRsrpRange(final short value) {
         if (value >= (short)0 && value <= (short)97) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..97]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setA2ThresholdRsrp(final java.lang.Short value) {
    if (value != null) {
        checkA2ThresholdRsrpRange(value);
    }
        this._a2ThresholdRsrp = value;
        return this;
    }
    
     
     private static void checkA2ThresholdRsrqRange(final short value) {
         if (value >= (short)0 && value <= (short)34) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..34]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setA2ThresholdRsrq(final java.lang.Short value) {
    if (value != null) {
        checkA2ThresholdRsrqRange(value);
    }
        this._a2ThresholdRsrq = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeEutraBuilder setA3Offset(final List<java.lang.String> value) {
        this._a3Offset = value;
        return this;
    }
    
     
     private static void checkA4ThresholdRsrpRange(final short value) {
         if (value >= (short)0 && value <= (short)97) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..97]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setA4ThresholdRsrp(final java.lang.Short value) {
    if (value != null) {
        checkA4ThresholdRsrpRange(value);
    }
        this._a4ThresholdRsrp = value;
        return this;
    }
    
     
     private static void checkA4ThresholdRsrqRange(final short value) {
         if (value >= (short)0 && value <= (short)34) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..34]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setA4ThresholdRsrq(final java.lang.Short value) {
    if (value != null) {
        checkA4ThresholdRsrqRange(value);
    }
        this._a4ThresholdRsrq = value;
        return this;
    }
    
     
     private static void checkA5Threshold1RsrpRange(final short value) {
         if (value >= (short)0 && value <= (short)97) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..97]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setA5Threshold1Rsrp(final java.lang.Short value) {
    if (value != null) {
        checkA5Threshold1RsrpRange(value);
    }
        this._a5Threshold1Rsrp = value;
        return this;
    }
    
     
     private static void checkA5Threshold1RsrqRange(final short value) {
         if (value >= (short)0 && value <= (short)34) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..34]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setA5Threshold1Rsrq(final java.lang.Short value) {
    if (value != null) {
        checkA5Threshold1RsrqRange(value);
    }
        this._a5Threshold1Rsrq = value;
        return this;
    }
    
     
     private static void checkA5Threshold2RsrpRange(final short value) {
         if (value >= (short)0 && value <= (short)97) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..97]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setA5Threshold2Rsrp(final java.lang.Short value) {
    if (value != null) {
        checkA5Threshold2RsrpRange(value);
    }
        this._a5Threshold2Rsrp = value;
        return this;
    }
    
     
     private static void checkA5Threshold2RsrqRange(final short value) {
         if (value >= (short)0 && value <= (short)34) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..34]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setA5Threshold2Rsrq(final java.lang.Short value) {
    if (value != null) {
        checkA5Threshold2RsrqRange(value);
    }
        this._a5Threshold2Rsrq = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeEutraBuilder setFilterCoefficientRsrp(final List<java.lang.String> value) {
        this._filterCoefficientRsrp = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeEutraBuilder setFilterCoefficientRsrq(final List<java.lang.String> value) {
        this._filterCoefficientRsrq = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeEutraBuilder setHysteresis(final List<java.lang.String> value) {
        this._hysteresis = value;
        return this;
    }
    
     
     private static void checkMaxReportCellsRange(final short value) {
         if (value >= (short)1 && value <= (short)8) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..8]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setMaxReportCells(final java.lang.Short value) {
    if (value != null) {
        checkMaxReportCellsRange(value);
    }
        this._maxReportCells = value;
        return this;
    }
    
     
     private static void checkReportAmountRange(final short value) {
         if (value >= (short)0 && value <= (short)2) {
             return;
         }
         if (value >= (short)4 && value <= (short)4) {
             return;
         }
         if (value >= (short)8 && value <= (short)8) {
             return;
         }
         if (value >= (short)16 && value <= (short)16) {
             return;
         }
         if (value >= (short)32 && value <= (short)32) {
             return;
         }
         if (value >= (short)64 && value <= (short)64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..2], [4..4], [8..8], [16..16], [32..32], [64..64]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setReportAmount(final java.lang.Short value) {
    if (value != null) {
        checkReportAmountRange(value);
    }
        this._reportAmount = value;
        return this;
    }
    
     
     private static void checkReportIntervalRange(final long value) {
         if (value >= 120L && value <= 120L) {
             return;
         }
         if (value >= 240L && value <= 240L) {
             return;
         }
         if (value >= 480L && value <= 480L) {
             return;
         }
         if (value >= 640L && value <= 640L) {
             return;
         }
         if (value >= 1024L && value <= 1024L) {
             return;
         }
         if (value >= 2048L && value <= 2048L) {
             return;
         }
         if (value >= 5120L && value <= 5120L) {
             return;
         }
         if (value >= 10240L && value <= 10240L) {
             return;
         }
         if (value >= 60000L && value <= 60000L) {
             return;
         }
         if (value >= 360000L && value <= 360000L) {
             return;
         }
         if (value >= 720000L && value <= 720000L) {
             return;
         }
         if (value >= 1800000L && value <= 1800000L) {
             return;
         }
         if (value >= 3600000L && value <= 3600000L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[120..120], [240..240], [480..480], [640..640], [1024..1024], [2048..2048], [5120..5120], [10240..10240], [60000..60000], [360000..360000], [720000..720000], [1800000..1800000], [3600000..3600000]].", value));
     }
    
    public LteRanMobilityConnModeEutraBuilder setReportInterval(final java.lang.Long value) {
    if (value != null) {
        checkReportIntervalRange(value);
    }
        this._reportInterval = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeEutraBuilder setReportQuantity(final ReportQuantity value) {
        this._reportQuantity = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeEutraBuilder setTimeToTrigger(final List<java.lang.Integer> value) {
        this._timeToTrigger = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeEutraBuilder setTriggerQuantity(final TriggerQuantity value) {
        this._triggerQuantity = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeEutraBuilder setReportOnLeave(final java.lang.Boolean value) {
        this._reportOnLeave = value;
        return this;
    }
    
    public LteRanMobilityConnModeEutraBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityConnModeEutraBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityConnModeEutra build() {
        return new LteRanMobilityConnModeEutraImpl(this);
    }

    private static final class LteRanMobilityConnModeEutraImpl implements LteRanMobilityConnModeEutra {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra.class;
        }

        private final java.lang.Short _a1ThresholdRsrp;
        private final java.lang.Short _a1ThresholdRsrq;
        private final java.lang.Short _a2ThresholdRsrp;
        private final java.lang.Short _a2ThresholdRsrq;
        private final List<java.lang.String> _a3Offset;
        private final java.lang.Short _a4ThresholdRsrp;
        private final java.lang.Short _a4ThresholdRsrq;
        private final java.lang.Short _a5Threshold1Rsrp;
        private final java.lang.Short _a5Threshold1Rsrq;
        private final java.lang.Short _a5Threshold2Rsrp;
        private final java.lang.Short _a5Threshold2Rsrq;
        private final List<java.lang.String> _filterCoefficientRsrp;
        private final List<java.lang.String> _filterCoefficientRsrq;
        private final List<java.lang.String> _hysteresis;
        private final java.lang.Short _maxReportCells;
        private final java.lang.Short _reportAmount;
        private final java.lang.Long _reportInterval;
        private final ReportQuantity _reportQuantity;
        private final List<java.lang.Integer> _timeToTrigger;
        private final TriggerQuantity _triggerQuantity;
        private final java.lang.Boolean _reportOnLeave;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>> augmentation = Collections.emptyMap();

        private LteRanMobilityConnModeEutraImpl(LteRanMobilityConnModeEutraBuilder base) {
            this._a1ThresholdRsrp = base.getA1ThresholdRsrp();
            this._a1ThresholdRsrq = base.getA1ThresholdRsrq();
            this._a2ThresholdRsrp = base.getA2ThresholdRsrp();
            this._a2ThresholdRsrq = base.getA2ThresholdRsrq();
            this._a3Offset = base.getA3Offset();
            this._a4ThresholdRsrp = base.getA4ThresholdRsrp();
            this._a4ThresholdRsrq = base.getA4ThresholdRsrq();
            this._a5Threshold1Rsrp = base.getA5Threshold1Rsrp();
            this._a5Threshold1Rsrq = base.getA5Threshold1Rsrq();
            this._a5Threshold2Rsrp = base.getA5Threshold2Rsrp();
            this._a5Threshold2Rsrq = base.getA5Threshold2Rsrq();
            this._filterCoefficientRsrp = base.getFilterCoefficientRsrp();
            this._filterCoefficientRsrq = base.getFilterCoefficientRsrq();
            this._hysteresis = base.getHysteresis();
            this._maxReportCells = base.getMaxReportCells();
            this._reportAmount = base.getReportAmount();
            this._reportInterval = base.getReportInterval();
            this._reportQuantity = base.getReportQuantity();
            this._timeToTrigger = base.getTimeToTrigger();
            this._triggerQuantity = base.getTriggerQuantity();
            this._reportOnLeave = base.isReportOnLeave();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getA1ThresholdRsrp() {
            return _a1ThresholdRsrp;
        }
        
        @Override
        public java.lang.Short getA1ThresholdRsrq() {
            return _a1ThresholdRsrq;
        }
        
        @Override
        public java.lang.Short getA2ThresholdRsrp() {
            return _a2ThresholdRsrp;
        }
        
        @Override
        public java.lang.Short getA2ThresholdRsrq() {
            return _a2ThresholdRsrq;
        }
        
        @Override
        public List<java.lang.String> getA3Offset() {
            return _a3Offset;
        }
        
        @Override
        public java.lang.Short getA4ThresholdRsrp() {
            return _a4ThresholdRsrp;
        }
        
        @Override
        public java.lang.Short getA4ThresholdRsrq() {
            return _a4ThresholdRsrq;
        }
        
        @Override
        public java.lang.Short getA5Threshold1Rsrp() {
            return _a5Threshold1Rsrp;
        }
        
        @Override
        public java.lang.Short getA5Threshold1Rsrq() {
            return _a5Threshold1Rsrq;
        }
        
        @Override
        public java.lang.Short getA5Threshold2Rsrp() {
            return _a5Threshold2Rsrp;
        }
        
        @Override
        public java.lang.Short getA5Threshold2Rsrq() {
            return _a5Threshold2Rsrq;
        }
        
        @Override
        public List<java.lang.String> getFilterCoefficientRsrp() {
            return _filterCoefficientRsrp;
        }
        
        @Override
        public List<java.lang.String> getFilterCoefficientRsrq() {
            return _filterCoefficientRsrq;
        }
        
        @Override
        public List<java.lang.String> getHysteresis() {
            return _hysteresis;
        }
        
        @Override
        public java.lang.Short getMaxReportCells() {
            return _maxReportCells;
        }
        
        @Override
        public java.lang.Short getReportAmount() {
            return _reportAmount;
        }
        
        @Override
        public java.lang.Long getReportInterval() {
            return _reportInterval;
        }
        
        @Override
        public ReportQuantity getReportQuantity() {
            return _reportQuantity;
        }
        
        @Override
        public List<java.lang.Integer> getTimeToTrigger() {
            return _timeToTrigger;
        }
        
        @Override
        public TriggerQuantity getTriggerQuantity() {
            return _triggerQuantity;
        }
        
        @Override
        public java.lang.Boolean isReportOnLeave() {
            return _reportOnLeave;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_a1ThresholdRsrp);
            result = prime * result + Objects.hashCode(_a1ThresholdRsrq);
            result = prime * result + Objects.hashCode(_a2ThresholdRsrp);
            result = prime * result + Objects.hashCode(_a2ThresholdRsrq);
            result = prime * result + Objects.hashCode(_a3Offset);
            result = prime * result + Objects.hashCode(_a4ThresholdRsrp);
            result = prime * result + Objects.hashCode(_a4ThresholdRsrq);
            result = prime * result + Objects.hashCode(_a5Threshold1Rsrp);
            result = prime * result + Objects.hashCode(_a5Threshold1Rsrq);
            result = prime * result + Objects.hashCode(_a5Threshold2Rsrp);
            result = prime * result + Objects.hashCode(_a5Threshold2Rsrq);
            result = prime * result + Objects.hashCode(_filterCoefficientRsrp);
            result = prime * result + Objects.hashCode(_filterCoefficientRsrq);
            result = prime * result + Objects.hashCode(_hysteresis);
            result = prime * result + Objects.hashCode(_maxReportCells);
            result = prime * result + Objects.hashCode(_reportAmount);
            result = prime * result + Objects.hashCode(_reportInterval);
            result = prime * result + Objects.hashCode(_reportQuantity);
            result = prime * result + Objects.hashCode(_timeToTrigger);
            result = prime * result + Objects.hashCode(_triggerQuantity);
            result = prime * result + Objects.hashCode(_reportOnLeave);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra)obj;
            if (!Objects.equals(_a1ThresholdRsrp, other.getA1ThresholdRsrp())) {
                return false;
            }
            if (!Objects.equals(_a1ThresholdRsrq, other.getA1ThresholdRsrq())) {
                return false;
            }
            if (!Objects.equals(_a2ThresholdRsrp, other.getA2ThresholdRsrp())) {
                return false;
            }
            if (!Objects.equals(_a2ThresholdRsrq, other.getA2ThresholdRsrq())) {
                return false;
            }
            if (!Objects.equals(_a3Offset, other.getA3Offset())) {
                return false;
            }
            if (!Objects.equals(_a4ThresholdRsrp, other.getA4ThresholdRsrp())) {
                return false;
            }
            if (!Objects.equals(_a4ThresholdRsrq, other.getA4ThresholdRsrq())) {
                return false;
            }
            if (!Objects.equals(_a5Threshold1Rsrp, other.getA5Threshold1Rsrp())) {
                return false;
            }
            if (!Objects.equals(_a5Threshold1Rsrq, other.getA5Threshold1Rsrq())) {
                return false;
            }
            if (!Objects.equals(_a5Threshold2Rsrp, other.getA5Threshold2Rsrp())) {
                return false;
            }
            if (!Objects.equals(_a5Threshold2Rsrq, other.getA5Threshold2Rsrq())) {
                return false;
            }
            if (!Objects.equals(_filterCoefficientRsrp, other.getFilterCoefficientRsrp())) {
                return false;
            }
            if (!Objects.equals(_filterCoefficientRsrq, other.getFilterCoefficientRsrq())) {
                return false;
            }
            if (!Objects.equals(_hysteresis, other.getHysteresis())) {
                return false;
            }
            if (!Objects.equals(_maxReportCells, other.getMaxReportCells())) {
                return false;
            }
            if (!Objects.equals(_reportAmount, other.getReportAmount())) {
                return false;
            }
            if (!Objects.equals(_reportInterval, other.getReportInterval())) {
                return false;
            }
            if (!Objects.equals(_reportQuantity, other.getReportQuantity())) {
                return false;
            }
            if (!Objects.equals(_timeToTrigger, other.getTimeToTrigger())) {
                return false;
            }
            if (!Objects.equals(_triggerQuantity, other.getTriggerQuantity())) {
                return false;
            }
            if (!Objects.equals(_reportOnLeave, other.isReportOnLeave())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityConnModeEutraImpl otherImpl = (LteRanMobilityConnModeEutraImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityConnModeEutra [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_a1ThresholdRsrp != null) {
                builder.append("_a1ThresholdRsrp=");
                builder.append(_a1ThresholdRsrp);
                builder.append(", ");
            }
            if (_a1ThresholdRsrq != null) {
                builder.append("_a1ThresholdRsrq=");
                builder.append(_a1ThresholdRsrq);
                builder.append(", ");
            }
            if (_a2ThresholdRsrp != null) {
                builder.append("_a2ThresholdRsrp=");
                builder.append(_a2ThresholdRsrp);
                builder.append(", ");
            }
            if (_a2ThresholdRsrq != null) {
                builder.append("_a2ThresholdRsrq=");
                builder.append(_a2ThresholdRsrq);
                builder.append(", ");
            }
            if (_a3Offset != null) {
                builder.append("_a3Offset=");
                builder.append(_a3Offset);
                builder.append(", ");
            }
            if (_a4ThresholdRsrp != null) {
                builder.append("_a4ThresholdRsrp=");
                builder.append(_a4ThresholdRsrp);
                builder.append(", ");
            }
            if (_a4ThresholdRsrq != null) {
                builder.append("_a4ThresholdRsrq=");
                builder.append(_a4ThresholdRsrq);
                builder.append(", ");
            }
            if (_a5Threshold1Rsrp != null) {
                builder.append("_a5Threshold1Rsrp=");
                builder.append(_a5Threshold1Rsrp);
                builder.append(", ");
            }
            if (_a5Threshold1Rsrq != null) {
                builder.append("_a5Threshold1Rsrq=");
                builder.append(_a5Threshold1Rsrq);
                builder.append(", ");
            }
            if (_a5Threshold2Rsrp != null) {
                builder.append("_a5Threshold2Rsrp=");
                builder.append(_a5Threshold2Rsrp);
                builder.append(", ");
            }
            if (_a5Threshold2Rsrq != null) {
                builder.append("_a5Threshold2Rsrq=");
                builder.append(_a5Threshold2Rsrq);
                builder.append(", ");
            }
            if (_filterCoefficientRsrp != null) {
                builder.append("_filterCoefficientRsrp=");
                builder.append(_filterCoefficientRsrp);
                builder.append(", ");
            }
            if (_filterCoefficientRsrq != null) {
                builder.append("_filterCoefficientRsrq=");
                builder.append(_filterCoefficientRsrq);
                builder.append(", ");
            }
            if (_hysteresis != null) {
                builder.append("_hysteresis=");
                builder.append(_hysteresis);
                builder.append(", ");
            }
            if (_maxReportCells != null) {
                builder.append("_maxReportCells=");
                builder.append(_maxReportCells);
                builder.append(", ");
            }
            if (_reportAmount != null) {
                builder.append("_reportAmount=");
                builder.append(_reportAmount);
                builder.append(", ");
            }
            if (_reportInterval != null) {
                builder.append("_reportInterval=");
                builder.append(_reportInterval);
                builder.append(", ");
            }
            if (_reportQuantity != null) {
                builder.append("_reportQuantity=");
                builder.append(_reportQuantity);
                builder.append(", ");
            }
            if (_timeToTrigger != null) {
                builder.append("_timeToTrigger=");
                builder.append(_timeToTrigger);
                builder.append(", ");
            }
            if (_triggerQuantity != null) {
                builder.append("_triggerQuantity=");
                builder.append(_triggerQuantity);
                builder.append(", ");
            }
            if (_reportOnLeave != null) {
                builder.append("_reportOnLeave=");
                builder.append(_reportOnLeave);
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
