package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG.MeasQuantityCdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG.MeasQuantityUtrafdd;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat
 *
 */
public class LteRanMobilityConnModeIratBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat> {

    private java.lang.Short _b1ThresholdCdma2000;
    private java.lang.Short _b1ThresholdGeran;
    private java.lang.Short _b1ThresholdUtraEcN0;
    private java.lang.Long _b1ThresholdUtrarscp;
    private java.lang.Short _b2Threshold2Cdma2000;
    private java.lang.Short _b2Threshold2Geran;
    private java.lang.Short _b2Threshold2UtraEcN0;
    private java.lang.Long _b2Threshold2Utrarscp;
    private List<java.lang.String> _filterCoefficientGeran;
    private List<java.lang.String> _filterCoefficientUtra;
    private List<java.lang.String> _hysteresis;
    private java.lang.Short _maxReportCells;
    private MeasQuantityCdma2000 _measQuantityCdma2000;
    private MeasQuantityUtrafdd _measQuantityUtrafdd;
    private List<java.lang.String> _qoffsetCdma2000;
    private List<java.lang.String> _qoffsetGeran;
    private List<java.lang.String> _qoffsettUtra;
    private java.lang.Short _reportAmount;
    private java.lang.Long _reportInterval;
    private List<java.lang.Integer> _timeToTrigger;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>> augmentation = Collections.emptyMap();

    public LteRanMobilityConnModeIratBuilder() {
    }
    public LteRanMobilityConnModeIratBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG arg) {
        this._qoffsettUtra = arg.getQoffsettUtra();
        this._filterCoefficientUtra = arg.getFilterCoefficientUtra();
        this._measQuantityUtrafdd = arg.getMeasQuantityUtrafdd();
        this._b1ThresholdUtrarscp = arg.getB1ThresholdUtrarscp();
        this._b1ThresholdUtraEcN0 = arg.getB1ThresholdUtraEcN0();
        this._qoffsetGeran = arg.getQoffsetGeran();
        this._filterCoefficientGeran = arg.getFilterCoefficientGeran();
        this._b1ThresholdGeran = arg.getB1ThresholdGeran();
        this._qoffsetCdma2000 = arg.getQoffsetCdma2000();
        this._measQuantityCdma2000 = arg.getMeasQuantityCdma2000();
        this._b1ThresholdCdma2000 = arg.getB1ThresholdCdma2000();
        this._b2Threshold2Utrarscp = arg.getB2Threshold2Utrarscp();
        this._b2Threshold2UtraEcN0 = arg.getB2Threshold2UtraEcN0();
        this._b2Threshold2Geran = arg.getB2Threshold2Geran();
        this._b2Threshold2Cdma2000 = arg.getB2Threshold2Cdma2000();
        this._hysteresis = arg.getHysteresis();
        this._timeToTrigger = arg.getTimeToTrigger();
        this._maxReportCells = arg.getMaxReportCells();
        this._reportInterval = arg.getReportInterval();
        this._reportAmount = arg.getReportAmount();
    }

    public LteRanMobilityConnModeIratBuilder(LteRanMobilityConnModeIrat base) {
        this._b1ThresholdCdma2000 = base.getB1ThresholdCdma2000();
        this._b1ThresholdGeran = base.getB1ThresholdGeran();
        this._b1ThresholdUtraEcN0 = base.getB1ThresholdUtraEcN0();
        this._b1ThresholdUtrarscp = base.getB1ThresholdUtrarscp();
        this._b2Threshold2Cdma2000 = base.getB2Threshold2Cdma2000();
        this._b2Threshold2Geran = base.getB2Threshold2Geran();
        this._b2Threshold2UtraEcN0 = base.getB2Threshold2UtraEcN0();
        this._b2Threshold2Utrarscp = base.getB2Threshold2Utrarscp();
        this._filterCoefficientGeran = base.getFilterCoefficientGeran();
        this._filterCoefficientUtra = base.getFilterCoefficientUtra();
        this._hysteresis = base.getHysteresis();
        this._maxReportCells = base.getMaxReportCells();
        this._measQuantityCdma2000 = base.getMeasQuantityCdma2000();
        this._measQuantityUtrafdd = base.getMeasQuantityUtrafdd();
        this._qoffsetCdma2000 = base.getQoffsetCdma2000();
        this._qoffsetGeran = base.getQoffsetGeran();
        this._qoffsettUtra = base.getQoffsettUtra();
        this._reportAmount = base.getReportAmount();
        this._reportInterval = base.getReportInterval();
        this._timeToTrigger = base.getTimeToTrigger();
        if (base instanceof LteRanMobilityConnModeIratImpl) {
            LteRanMobilityConnModeIratImpl impl = (LteRanMobilityConnModeIratImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG) {
            this._qoffsettUtra = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getQoffsettUtra();
            this._filterCoefficientUtra = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getFilterCoefficientUtra();
            this._measQuantityUtrafdd = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getMeasQuantityUtrafdd();
            this._b1ThresholdUtrarscp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getB1ThresholdUtrarscp();
            this._b1ThresholdUtraEcN0 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getB1ThresholdUtraEcN0();
            this._qoffsetGeran = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getQoffsetGeran();
            this._filterCoefficientGeran = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getFilterCoefficientGeran();
            this._b1ThresholdGeran = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getB1ThresholdGeran();
            this._qoffsetCdma2000 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getQoffsetCdma2000();
            this._measQuantityCdma2000 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getMeasQuantityCdma2000();
            this._b1ThresholdCdma2000 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getB1ThresholdCdma2000();
            this._b2Threshold2Utrarscp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getB2Threshold2Utrarscp();
            this._b2Threshold2UtraEcN0 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getB2Threshold2UtraEcN0();
            this._b2Threshold2Geran = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getB2Threshold2Geran();
            this._b2Threshold2Cdma2000 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getB2Threshold2Cdma2000();
            this._hysteresis = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getHysteresis();
            this._timeToTrigger = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getTimeToTrigger();
            this._maxReportCells = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getMaxReportCells();
            this._reportInterval = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getReportInterval();
            this._reportAmount = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG)arg).getReportAmount();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getB1ThresholdCdma2000() {
        return _b1ThresholdCdma2000;
    }
    
    public java.lang.Short getB1ThresholdGeran() {
        return _b1ThresholdGeran;
    }
    
    public java.lang.Short getB1ThresholdUtraEcN0() {
        return _b1ThresholdUtraEcN0;
    }
    
    public java.lang.Long getB1ThresholdUtrarscp() {
        return _b1ThresholdUtrarscp;
    }
    
    public java.lang.Short getB2Threshold2Cdma2000() {
        return _b2Threshold2Cdma2000;
    }
    
    public java.lang.Short getB2Threshold2Geran() {
        return _b2Threshold2Geran;
    }
    
    public java.lang.Short getB2Threshold2UtraEcN0() {
        return _b2Threshold2UtraEcN0;
    }
    
    public java.lang.Long getB2Threshold2Utrarscp() {
        return _b2Threshold2Utrarscp;
    }
    
    public List<java.lang.String> getFilterCoefficientGeran() {
        return _filterCoefficientGeran;
    }
    
    public List<java.lang.String> getFilterCoefficientUtra() {
        return _filterCoefficientUtra;
    }
    
    public List<java.lang.String> getHysteresis() {
        return _hysteresis;
    }
    
    public java.lang.Short getMaxReportCells() {
        return _maxReportCells;
    }
    
    public MeasQuantityCdma2000 getMeasQuantityCdma2000() {
        return _measQuantityCdma2000;
    }
    
    public MeasQuantityUtrafdd getMeasQuantityUtrafdd() {
        return _measQuantityUtrafdd;
    }
    
    public List<java.lang.String> getQoffsetCdma2000() {
        return _qoffsetCdma2000;
    }
    
    public List<java.lang.String> getQoffsetGeran() {
        return _qoffsetGeran;
    }
    
    public List<java.lang.String> getQoffsettUtra() {
        return _qoffsettUtra;
    }
    
    public java.lang.Short getReportAmount() {
        return _reportAmount;
    }
    
    public java.lang.Long getReportInterval() {
        return _reportInterval;
    }
    
    public List<java.lang.Integer> getTimeToTrigger() {
        return _timeToTrigger;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkB1ThresholdCdma2000Range(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public LteRanMobilityConnModeIratBuilder setB1ThresholdCdma2000(final java.lang.Short value) {
    if (value != null) {
        checkB1ThresholdCdma2000Range(value);
    }
        this._b1ThresholdCdma2000 = value;
        return this;
    }
    
     
     private static void checkB1ThresholdGeranRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public LteRanMobilityConnModeIratBuilder setB1ThresholdGeran(final java.lang.Short value) {
    if (value != null) {
        checkB1ThresholdGeranRange(value);
    }
        this._b1ThresholdGeran = value;
        return this;
    }
    
     
     private static void checkB1ThresholdUtraEcN0Range(final short value) {
         if (value >= (short)0 && value <= (short)49) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..49]].", value));
     }
    
    public LteRanMobilityConnModeIratBuilder setB1ThresholdUtraEcN0(final java.lang.Short value) {
    if (value != null) {
        checkB1ThresholdUtraEcN0Range(value);
    }
        this._b1ThresholdUtraEcN0 = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setB1ThresholdUtrarscp(final java.lang.Long value) {
        this._b1ThresholdUtrarscp = value;
        return this;
    }
    
     
     private static void checkB2Threshold2Cdma2000Range(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public LteRanMobilityConnModeIratBuilder setB2Threshold2Cdma2000(final java.lang.Short value) {
    if (value != null) {
        checkB2Threshold2Cdma2000Range(value);
    }
        this._b2Threshold2Cdma2000 = value;
        return this;
    }
    
     
     private static void checkB2Threshold2GeranRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public LteRanMobilityConnModeIratBuilder setB2Threshold2Geran(final java.lang.Short value) {
    if (value != null) {
        checkB2Threshold2GeranRange(value);
    }
        this._b2Threshold2Geran = value;
        return this;
    }
    
     
     private static void checkB2Threshold2UtraEcN0Range(final short value) {
         if (value >= (short)0 && value <= (short)49) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..49]].", value));
     }
    
    public LteRanMobilityConnModeIratBuilder setB2Threshold2UtraEcN0(final java.lang.Short value) {
    if (value != null) {
        checkB2Threshold2UtraEcN0Range(value);
    }
        this._b2Threshold2UtraEcN0 = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setB2Threshold2Utrarscp(final java.lang.Long value) {
        this._b2Threshold2Utrarscp = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setFilterCoefficientGeran(final List<java.lang.String> value) {
        this._filterCoefficientGeran = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setFilterCoefficientUtra(final List<java.lang.String> value) {
        this._filterCoefficientUtra = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setHysteresis(final List<java.lang.String> value) {
        this._hysteresis = value;
        return this;
    }
    
     
     private static void checkMaxReportCellsRange(final short value) {
         if (value >= (short)1 && value <= (short)8) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..8]].", value));
     }
    
    public LteRanMobilityConnModeIratBuilder setMaxReportCells(final java.lang.Short value) {
    if (value != null) {
        checkMaxReportCellsRange(value);
    }
        this._maxReportCells = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setMeasQuantityCdma2000(final MeasQuantityCdma2000 value) {
        this._measQuantityCdma2000 = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setMeasQuantityUtrafdd(final MeasQuantityUtrafdd value) {
        this._measQuantityUtrafdd = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setQoffsetCdma2000(final List<java.lang.String> value) {
        this._qoffsetCdma2000 = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setQoffsetGeran(final List<java.lang.String> value) {
        this._qoffsetGeran = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setQoffsettUtra(final List<java.lang.String> value) {
        this._qoffsettUtra = value;
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
    
    public LteRanMobilityConnModeIratBuilder setReportAmount(final java.lang.Short value) {
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
    
    public LteRanMobilityConnModeIratBuilder setReportInterval(final java.lang.Long value) {
    if (value != null) {
        checkReportIntervalRange(value);
    }
        this._reportInterval = value;
        return this;
    }
    
     
    public LteRanMobilityConnModeIratBuilder setTimeToTrigger(final List<java.lang.Integer> value) {
        this._timeToTrigger = value;
        return this;
    }
    
    public LteRanMobilityConnModeIratBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityConnModeIratBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityConnModeIrat build() {
        return new LteRanMobilityConnModeIratImpl(this);
    }

    private static final class LteRanMobilityConnModeIratImpl implements LteRanMobilityConnModeIrat {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat.class;
        }

        private final java.lang.Short _b1ThresholdCdma2000;
        private final java.lang.Short _b1ThresholdGeran;
        private final java.lang.Short _b1ThresholdUtraEcN0;
        private final java.lang.Long _b1ThresholdUtrarscp;
        private final java.lang.Short _b2Threshold2Cdma2000;
        private final java.lang.Short _b2Threshold2Geran;
        private final java.lang.Short _b2Threshold2UtraEcN0;
        private final java.lang.Long _b2Threshold2Utrarscp;
        private final List<java.lang.String> _filterCoefficientGeran;
        private final List<java.lang.String> _filterCoefficientUtra;
        private final List<java.lang.String> _hysteresis;
        private final java.lang.Short _maxReportCells;
        private final MeasQuantityCdma2000 _measQuantityCdma2000;
        private final MeasQuantityUtrafdd _measQuantityUtrafdd;
        private final List<java.lang.String> _qoffsetCdma2000;
        private final List<java.lang.String> _qoffsetGeran;
        private final List<java.lang.String> _qoffsettUtra;
        private final java.lang.Short _reportAmount;
        private final java.lang.Long _reportInterval;
        private final List<java.lang.Integer> _timeToTrigger;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>> augmentation = Collections.emptyMap();

        private LteRanMobilityConnModeIratImpl(LteRanMobilityConnModeIratBuilder base) {
            this._b1ThresholdCdma2000 = base.getB1ThresholdCdma2000();
            this._b1ThresholdGeran = base.getB1ThresholdGeran();
            this._b1ThresholdUtraEcN0 = base.getB1ThresholdUtraEcN0();
            this._b1ThresholdUtrarscp = base.getB1ThresholdUtrarscp();
            this._b2Threshold2Cdma2000 = base.getB2Threshold2Cdma2000();
            this._b2Threshold2Geran = base.getB2Threshold2Geran();
            this._b2Threshold2UtraEcN0 = base.getB2Threshold2UtraEcN0();
            this._b2Threshold2Utrarscp = base.getB2Threshold2Utrarscp();
            this._filterCoefficientGeran = base.getFilterCoefficientGeran();
            this._filterCoefficientUtra = base.getFilterCoefficientUtra();
            this._hysteresis = base.getHysteresis();
            this._maxReportCells = base.getMaxReportCells();
            this._measQuantityCdma2000 = base.getMeasQuantityCdma2000();
            this._measQuantityUtrafdd = base.getMeasQuantityUtrafdd();
            this._qoffsetCdma2000 = base.getQoffsetCdma2000();
            this._qoffsetGeran = base.getQoffsetGeran();
            this._qoffsettUtra = base.getQoffsettUtra();
            this._reportAmount = base.getReportAmount();
            this._reportInterval = base.getReportInterval();
            this._timeToTrigger = base.getTimeToTrigger();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getB1ThresholdCdma2000() {
            return _b1ThresholdCdma2000;
        }
        
        @Override
        public java.lang.Short getB1ThresholdGeran() {
            return _b1ThresholdGeran;
        }
        
        @Override
        public java.lang.Short getB1ThresholdUtraEcN0() {
            return _b1ThresholdUtraEcN0;
        }
        
        @Override
        public java.lang.Long getB1ThresholdUtrarscp() {
            return _b1ThresholdUtrarscp;
        }
        
        @Override
        public java.lang.Short getB2Threshold2Cdma2000() {
            return _b2Threshold2Cdma2000;
        }
        
        @Override
        public java.lang.Short getB2Threshold2Geran() {
            return _b2Threshold2Geran;
        }
        
        @Override
        public java.lang.Short getB2Threshold2UtraEcN0() {
            return _b2Threshold2UtraEcN0;
        }
        
        @Override
        public java.lang.Long getB2Threshold2Utrarscp() {
            return _b2Threshold2Utrarscp;
        }
        
        @Override
        public List<java.lang.String> getFilterCoefficientGeran() {
            return _filterCoefficientGeran;
        }
        
        @Override
        public List<java.lang.String> getFilterCoefficientUtra() {
            return _filterCoefficientUtra;
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
        public MeasQuantityCdma2000 getMeasQuantityCdma2000() {
            return _measQuantityCdma2000;
        }
        
        @Override
        public MeasQuantityUtrafdd getMeasQuantityUtrafdd() {
            return _measQuantityUtrafdd;
        }
        
        @Override
        public List<java.lang.String> getQoffsetCdma2000() {
            return _qoffsetCdma2000;
        }
        
        @Override
        public List<java.lang.String> getQoffsetGeran() {
            return _qoffsetGeran;
        }
        
        @Override
        public List<java.lang.String> getQoffsettUtra() {
            return _qoffsettUtra;
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
        public List<java.lang.Integer> getTimeToTrigger() {
            return _timeToTrigger;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_b1ThresholdCdma2000);
            result = prime * result + Objects.hashCode(_b1ThresholdGeran);
            result = prime * result + Objects.hashCode(_b1ThresholdUtraEcN0);
            result = prime * result + Objects.hashCode(_b1ThresholdUtrarscp);
            result = prime * result + Objects.hashCode(_b2Threshold2Cdma2000);
            result = prime * result + Objects.hashCode(_b2Threshold2Geran);
            result = prime * result + Objects.hashCode(_b2Threshold2UtraEcN0);
            result = prime * result + Objects.hashCode(_b2Threshold2Utrarscp);
            result = prime * result + Objects.hashCode(_filterCoefficientGeran);
            result = prime * result + Objects.hashCode(_filterCoefficientUtra);
            result = prime * result + Objects.hashCode(_hysteresis);
            result = prime * result + Objects.hashCode(_maxReportCells);
            result = prime * result + Objects.hashCode(_measQuantityCdma2000);
            result = prime * result + Objects.hashCode(_measQuantityUtrafdd);
            result = prime * result + Objects.hashCode(_qoffsetCdma2000);
            result = prime * result + Objects.hashCode(_qoffsetGeran);
            result = prime * result + Objects.hashCode(_qoffsettUtra);
            result = prime * result + Objects.hashCode(_reportAmount);
            result = prime * result + Objects.hashCode(_reportInterval);
            result = prime * result + Objects.hashCode(_timeToTrigger);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat)obj;
            if (!Objects.equals(_b1ThresholdCdma2000, other.getB1ThresholdCdma2000())) {
                return false;
            }
            if (!Objects.equals(_b1ThresholdGeran, other.getB1ThresholdGeran())) {
                return false;
            }
            if (!Objects.equals(_b1ThresholdUtraEcN0, other.getB1ThresholdUtraEcN0())) {
                return false;
            }
            if (!Objects.equals(_b1ThresholdUtrarscp, other.getB1ThresholdUtrarscp())) {
                return false;
            }
            if (!Objects.equals(_b2Threshold2Cdma2000, other.getB2Threshold2Cdma2000())) {
                return false;
            }
            if (!Objects.equals(_b2Threshold2Geran, other.getB2Threshold2Geran())) {
                return false;
            }
            if (!Objects.equals(_b2Threshold2UtraEcN0, other.getB2Threshold2UtraEcN0())) {
                return false;
            }
            if (!Objects.equals(_b2Threshold2Utrarscp, other.getB2Threshold2Utrarscp())) {
                return false;
            }
            if (!Objects.equals(_filterCoefficientGeran, other.getFilterCoefficientGeran())) {
                return false;
            }
            if (!Objects.equals(_filterCoefficientUtra, other.getFilterCoefficientUtra())) {
                return false;
            }
            if (!Objects.equals(_hysteresis, other.getHysteresis())) {
                return false;
            }
            if (!Objects.equals(_maxReportCells, other.getMaxReportCells())) {
                return false;
            }
            if (!Objects.equals(_measQuantityCdma2000, other.getMeasQuantityCdma2000())) {
                return false;
            }
            if (!Objects.equals(_measQuantityUtrafdd, other.getMeasQuantityUtrafdd())) {
                return false;
            }
            if (!Objects.equals(_qoffsetCdma2000, other.getQoffsetCdma2000())) {
                return false;
            }
            if (!Objects.equals(_qoffsetGeran, other.getQoffsetGeran())) {
                return false;
            }
            if (!Objects.equals(_qoffsettUtra, other.getQoffsettUtra())) {
                return false;
            }
            if (!Objects.equals(_reportAmount, other.getReportAmount())) {
                return false;
            }
            if (!Objects.equals(_reportInterval, other.getReportInterval())) {
                return false;
            }
            if (!Objects.equals(_timeToTrigger, other.getTimeToTrigger())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityConnModeIratImpl otherImpl = (LteRanMobilityConnModeIratImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityConnModeIrat [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_b1ThresholdCdma2000 != null) {
                builder.append("_b1ThresholdCdma2000=");
                builder.append(_b1ThresholdCdma2000);
                builder.append(", ");
            }
            if (_b1ThresholdGeran != null) {
                builder.append("_b1ThresholdGeran=");
                builder.append(_b1ThresholdGeran);
                builder.append(", ");
            }
            if (_b1ThresholdUtraEcN0 != null) {
                builder.append("_b1ThresholdUtraEcN0=");
                builder.append(_b1ThresholdUtraEcN0);
                builder.append(", ");
            }
            if (_b1ThresholdUtrarscp != null) {
                builder.append("_b1ThresholdUtrarscp=");
                builder.append(_b1ThresholdUtrarscp);
                builder.append(", ");
            }
            if (_b2Threshold2Cdma2000 != null) {
                builder.append("_b2Threshold2Cdma2000=");
                builder.append(_b2Threshold2Cdma2000);
                builder.append(", ");
            }
            if (_b2Threshold2Geran != null) {
                builder.append("_b2Threshold2Geran=");
                builder.append(_b2Threshold2Geran);
                builder.append(", ");
            }
            if (_b2Threshold2UtraEcN0 != null) {
                builder.append("_b2Threshold2UtraEcN0=");
                builder.append(_b2Threshold2UtraEcN0);
                builder.append(", ");
            }
            if (_b2Threshold2Utrarscp != null) {
                builder.append("_b2Threshold2Utrarscp=");
                builder.append(_b2Threshold2Utrarscp);
                builder.append(", ");
            }
            if (_filterCoefficientGeran != null) {
                builder.append("_filterCoefficientGeran=");
                builder.append(_filterCoefficientGeran);
                builder.append(", ");
            }
            if (_filterCoefficientUtra != null) {
                builder.append("_filterCoefficientUtra=");
                builder.append(_filterCoefficientUtra);
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
            if (_measQuantityCdma2000 != null) {
                builder.append("_measQuantityCdma2000=");
                builder.append(_measQuantityCdma2000);
                builder.append(", ");
            }
            if (_measQuantityUtrafdd != null) {
                builder.append("_measQuantityUtrafdd=");
                builder.append(_measQuantityUtrafdd);
                builder.append(", ");
            }
            if (_qoffsetCdma2000 != null) {
                builder.append("_qoffsetCdma2000=");
                builder.append(_qoffsetCdma2000);
                builder.append(", ");
            }
            if (_qoffsetGeran != null) {
                builder.append("_qoffsetGeran=");
                builder.append(_qoffsetGeran);
                builder.append(", ");
            }
            if (_qoffsettUtra != null) {
                builder.append("_qoffsettUtra=");
                builder.append(_qoffsettUtra);
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
            if (_timeToTrigger != null) {
                builder.append("_timeToTrigger=");
                builder.append(_timeToTrigger);
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
