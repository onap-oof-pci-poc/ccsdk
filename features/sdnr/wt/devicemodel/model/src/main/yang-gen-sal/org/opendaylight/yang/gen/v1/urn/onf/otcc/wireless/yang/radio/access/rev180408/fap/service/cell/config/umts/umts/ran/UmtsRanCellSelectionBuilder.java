package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG.TcrMaxHyst;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG.NonHcstcrMaxHyst;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG.QualityMeasureCpich;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG.NonHcstcrMax;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG.TcrMax;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection
 *
 */
public class UmtsRanCellSelectionBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection> {

    private java.lang.Long _deltaQRxLevMin;
    private java.lang.Short _hcsPrio;
    private java.lang.Short _ncr;
    private java.lang.Short _nonHcsncr;
    private NonHcstcrMax _nonHcstcrMax;
    private NonHcstcrMaxHyst _nonHcstcrMaxHyst;
    private java.lang.Short _qHyst1s;
    private java.lang.Short _qHyst2s;
    private java.lang.Long _qRxLevMin;
    private java.lang.Short _qRxLevMinOffset;
    private java.lang.Short _qhcs;
    private java.lang.Long _qqualMin;
    private java.lang.Short _qqualMinOffset;
    private QualityMeasureCpich _qualityMeasureCpich;
    private java.lang.Long _sIntersearch;
    private java.lang.Long _sIntrasearch;
    private java.lang.Long _sLimitSearchRat;
    private java.lang.Long _sSearchHcs;
    private java.lang.Long _sSearchRat;
    private java.lang.Long _shcsrat;
    private java.lang.Short _tReselections;
    private TcrMax _tcrMax;
    private TcrMaxHyst _tcrMaxHyst;
    private java.lang.Long _ueTxPwrMaxRach;
    private java.lang.Boolean _useOfHcs;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>> augmentation = Collections.emptyMap();

    public UmtsRanCellSelectionBuilder() {
    }
    public UmtsRanCellSelectionBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG arg) {
        this._qualityMeasureCpich = arg.getQualityMeasureCpich();
        this._qqualMin = arg.getQqualMin();
        this._qqualMinOffset = arg.getQqualMinOffset();
        this._qRxLevMin = arg.getQRxLevMin();
        this._deltaQRxLevMin = arg.getDeltaQRxLevMin();
        this._qRxLevMinOffset = arg.getQRxLevMinOffset();
        this._qHyst1s = arg.getQHyst1s();
        this._qHyst2s = arg.getQHyst2s();
        this._tReselections = arg.getTReselections();
        this._sIntrasearch = arg.getSIntrasearch();
        this._sIntersearch = arg.getSIntersearch();
        this._sSearchHcs = arg.getSSearchHcs();
        this._sSearchRat = arg.getSSearchRat();
        this._shcsrat = arg.getShcsrat();
        this._sLimitSearchRat = arg.getSLimitSearchRat();
        this._nonHcstcrMax = arg.getNonHcstcrMax();
        this._nonHcsncr = arg.getNonHcsncr();
        this._nonHcstcrMaxHyst = arg.getNonHcstcrMaxHyst();
        this._qhcs = arg.getQhcs();
        this._useOfHcs = arg.isUseOfHcs();
        this._hcsPrio = arg.getHcsPrio();
        this._tcrMax = arg.getTcrMax();
        this._ncr = arg.getNcr();
        this._tcrMaxHyst = arg.getTcrMaxHyst();
        this._ueTxPwrMaxRach = arg.getUeTxPwrMaxRach();
    }

    public UmtsRanCellSelectionBuilder(UmtsRanCellSelection base) {
        this._deltaQRxLevMin = base.getDeltaQRxLevMin();
        this._hcsPrio = base.getHcsPrio();
        this._ncr = base.getNcr();
        this._nonHcsncr = base.getNonHcsncr();
        this._nonHcstcrMax = base.getNonHcstcrMax();
        this._nonHcstcrMaxHyst = base.getNonHcstcrMaxHyst();
        this._qHyst1s = base.getQHyst1s();
        this._qHyst2s = base.getQHyst2s();
        this._qRxLevMin = base.getQRxLevMin();
        this._qRxLevMinOffset = base.getQRxLevMinOffset();
        this._qhcs = base.getQhcs();
        this._qqualMin = base.getQqualMin();
        this._qqualMinOffset = base.getQqualMinOffset();
        this._qualityMeasureCpich = base.getQualityMeasureCpich();
        this._sIntersearch = base.getSIntersearch();
        this._sIntrasearch = base.getSIntrasearch();
        this._sLimitSearchRat = base.getSLimitSearchRat();
        this._sSearchHcs = base.getSSearchHcs();
        this._sSearchRat = base.getSSearchRat();
        this._shcsrat = base.getShcsrat();
        this._tReselections = base.getTReselections();
        this._tcrMax = base.getTcrMax();
        this._tcrMaxHyst = base.getTcrMaxHyst();
        this._ueTxPwrMaxRach = base.getUeTxPwrMaxRach();
        this._useOfHcs = base.isUseOfHcs();
        if (base instanceof UmtsRanCellSelectionImpl) {
            UmtsRanCellSelectionImpl impl = (UmtsRanCellSelectionImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG) {
            this._qualityMeasureCpich = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getQualityMeasureCpich();
            this._qqualMin = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getQqualMin();
            this._qqualMinOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getQqualMinOffset();
            this._qRxLevMin = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getQRxLevMin();
            this._deltaQRxLevMin = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getDeltaQRxLevMin();
            this._qRxLevMinOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getQRxLevMinOffset();
            this._qHyst1s = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getQHyst1s();
            this._qHyst2s = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getQHyst2s();
            this._tReselections = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getTReselections();
            this._sIntrasearch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getSIntrasearch();
            this._sIntersearch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getSIntersearch();
            this._sSearchHcs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getSSearchHcs();
            this._sSearchRat = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getSSearchRat();
            this._shcsrat = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getShcsrat();
            this._sLimitSearchRat = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getSLimitSearchRat();
            this._nonHcstcrMax = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getNonHcstcrMax();
            this._nonHcsncr = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getNonHcsncr();
            this._nonHcstcrMaxHyst = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getNonHcstcrMaxHyst();
            this._qhcs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getQhcs();
            this._useOfHcs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).isUseOfHcs();
            this._hcsPrio = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getHcsPrio();
            this._tcrMax = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getTcrMax();
            this._ncr = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getNcr();
            this._tcrMaxHyst = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getTcrMaxHyst();
            this._ueTxPwrMaxRach = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG)arg).getUeTxPwrMaxRach();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellSelectionG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getDeltaQRxLevMin() {
        return _deltaQRxLevMin;
    }
    
    public java.lang.Short getHcsPrio() {
        return _hcsPrio;
    }
    
    public java.lang.Short getNcr() {
        return _ncr;
    }
    
    public java.lang.Short getNonHcsncr() {
        return _nonHcsncr;
    }
    
    public NonHcstcrMax getNonHcstcrMax() {
        return _nonHcstcrMax;
    }
    
    public NonHcstcrMaxHyst getNonHcstcrMaxHyst() {
        return _nonHcstcrMaxHyst;
    }
    
    public java.lang.Short getQHyst1s() {
        return _qHyst1s;
    }
    
    public java.lang.Short getQHyst2s() {
        return _qHyst2s;
    }
    
    public java.lang.Long getQRxLevMin() {
        return _qRxLevMin;
    }
    
    public java.lang.Short getQRxLevMinOffset() {
        return _qRxLevMinOffset;
    }
    
    public java.lang.Short getQhcs() {
        return _qhcs;
    }
    
    public java.lang.Long getQqualMin() {
        return _qqualMin;
    }
    
    public java.lang.Short getQqualMinOffset() {
        return _qqualMinOffset;
    }
    
    public QualityMeasureCpich getQualityMeasureCpich() {
        return _qualityMeasureCpich;
    }
    
    public java.lang.Long getSIntersearch() {
        return _sIntersearch;
    }
    
    public java.lang.Long getSIntrasearch() {
        return _sIntrasearch;
    }
    
    public java.lang.Long getSLimitSearchRat() {
        return _sLimitSearchRat;
    }
    
    public java.lang.Long getSSearchHcs() {
        return _sSearchHcs;
    }
    
    public java.lang.Long getSSearchRat() {
        return _sSearchRat;
    }
    
    public java.lang.Long getShcsrat() {
        return _shcsrat;
    }
    
    public java.lang.Short getTReselections() {
        return _tReselections;
    }
    
    public TcrMax getTcrMax() {
        return _tcrMax;
    }
    
    public TcrMaxHyst getTcrMaxHyst() {
        return _tcrMaxHyst;
    }
    
    public java.lang.Long getUeTxPwrMaxRach() {
        return _ueTxPwrMaxRach;
    }
    
    public java.lang.Boolean isUseOfHcs() {
        return _useOfHcs;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UmtsRanCellSelectionBuilder setDeltaQRxLevMin(final java.lang.Long value) {
        this._deltaQRxLevMin = value;
        return this;
    }
    
     
     private static void checkHcsPrioRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public UmtsRanCellSelectionBuilder setHcsPrio(final java.lang.Short value) {
    if (value != null) {
        checkHcsPrioRange(value);
    }
        this._hcsPrio = value;
        return this;
    }
    
     
     private static void checkNcrRange(final short value) {
         if (value >= (short)1 && value <= (short)16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..16]].", value));
     }
    
    public UmtsRanCellSelectionBuilder setNcr(final java.lang.Short value) {
    if (value != null) {
        checkNcrRange(value);
    }
        this._ncr = value;
        return this;
    }
    
     
     private static void checkNonHcsncrRange(final short value) {
         if (value >= (short)1 && value <= (short)16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..16]].", value));
     }
    
    public UmtsRanCellSelectionBuilder setNonHcsncr(final java.lang.Short value) {
    if (value != null) {
        checkNonHcsncrRange(value);
    }
        this._nonHcsncr = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setNonHcstcrMax(final NonHcstcrMax value) {
        this._nonHcstcrMax = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setNonHcstcrMaxHyst(final NonHcstcrMaxHyst value) {
        this._nonHcstcrMaxHyst = value;
        return this;
    }
    
     
     private static void checkQHyst1sRange(final short value) {
         if (value >= (short)0 && value <= (short)40) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..40]].", value));
     }
    
    public UmtsRanCellSelectionBuilder setQHyst1s(final java.lang.Short value) {
    if (value != null) {
        checkQHyst1sRange(value);
    }
        this._qHyst1s = value;
        return this;
    }
    
     
     private static void checkQHyst2sRange(final short value) {
         if (value >= (short)0 && value <= (short)40) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..40]].", value));
     }
    
    public UmtsRanCellSelectionBuilder setQHyst2s(final java.lang.Short value) {
    if (value != null) {
        checkQHyst2sRange(value);
    }
        this._qHyst2s = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setQRxLevMin(final java.lang.Long value) {
        this._qRxLevMin = value;
        return this;
    }
    
     
     private static void checkQRxLevMinOffsetRange(final short value) {
         if (value >= (short)2 && value <= (short)2) {
             return;
         }
         if (value >= (short)4 && value <= (short)4) {
             return;
         }
         if (value >= (short)6 && value <= (short)6) {
             return;
         }
         if (value >= (short)8 && value <= (short)8) {
             return;
         }
         if (value >= (short)10 && value <= (short)10) {
             return;
         }
         if (value >= (short)12 && value <= (short)12) {
             return;
         }
         if (value >= (short)14 && value <= (short)14) {
             return;
         }
         if (value >= (short)16 && value <= (short)16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[2..2], [4..4], [6..6], [8..8], [10..10], [12..12], [14..14], [16..16]].", value));
     }
    
    public UmtsRanCellSelectionBuilder setQRxLevMinOffset(final java.lang.Short value) {
    if (value != null) {
        checkQRxLevMinOffsetRange(value);
    }
        this._qRxLevMinOffset = value;
        return this;
    }
    
     
     private static void checkQhcsRange(final short value) {
         if (value >= (short)0 && value <= (short)99) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..99]].", value));
     }
    
    public UmtsRanCellSelectionBuilder setQhcs(final java.lang.Short value) {
    if (value != null) {
        checkQhcsRange(value);
    }
        this._qhcs = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setQqualMin(final java.lang.Long value) {
        this._qqualMin = value;
        return this;
    }
    
     
     private static void checkQqualMinOffsetRange(final short value) {
         if (value >= (short)1 && value <= (short)16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..16]].", value));
     }
    
    public UmtsRanCellSelectionBuilder setQqualMinOffset(final java.lang.Short value) {
    if (value != null) {
        checkQqualMinOffsetRange(value);
    }
        this._qqualMinOffset = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setQualityMeasureCpich(final QualityMeasureCpich value) {
        this._qualityMeasureCpich = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setSIntersearch(final java.lang.Long value) {
        this._sIntersearch = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setSIntrasearch(final java.lang.Long value) {
        this._sIntrasearch = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setSLimitSearchRat(final java.lang.Long value) {
        this._sLimitSearchRat = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setSSearchHcs(final java.lang.Long value) {
        this._sSearchHcs = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setSSearchRat(final java.lang.Long value) {
        this._sSearchRat = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setShcsrat(final java.lang.Long value) {
        this._shcsrat = value;
        return this;
    }
    
     
     private static void checkTReselectionsRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public UmtsRanCellSelectionBuilder setTReselections(final java.lang.Short value) {
    if (value != null) {
        checkTReselectionsRange(value);
    }
        this._tReselections = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setTcrMax(final TcrMax value) {
        this._tcrMax = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setTcrMaxHyst(final TcrMaxHyst value) {
        this._tcrMaxHyst = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setUeTxPwrMaxRach(final java.lang.Long value) {
        this._ueTxPwrMaxRach = value;
        return this;
    }
    
     
    public UmtsRanCellSelectionBuilder setUseOfHcs(final java.lang.Boolean value) {
        this._useOfHcs = value;
        return this;
    }
    
    public UmtsRanCellSelectionBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanCellSelectionBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanCellSelection build() {
        return new UmtsRanCellSelectionImpl(this);
    }

    private static final class UmtsRanCellSelectionImpl implements UmtsRanCellSelection {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection.class;
        }

        private final java.lang.Long _deltaQRxLevMin;
        private final java.lang.Short _hcsPrio;
        private final java.lang.Short _ncr;
        private final java.lang.Short _nonHcsncr;
        private final NonHcstcrMax _nonHcstcrMax;
        private final NonHcstcrMaxHyst _nonHcstcrMaxHyst;
        private final java.lang.Short _qHyst1s;
        private final java.lang.Short _qHyst2s;
        private final java.lang.Long _qRxLevMin;
        private final java.lang.Short _qRxLevMinOffset;
        private final java.lang.Short _qhcs;
        private final java.lang.Long _qqualMin;
        private final java.lang.Short _qqualMinOffset;
        private final QualityMeasureCpich _qualityMeasureCpich;
        private final java.lang.Long _sIntersearch;
        private final java.lang.Long _sIntrasearch;
        private final java.lang.Long _sLimitSearchRat;
        private final java.lang.Long _sSearchHcs;
        private final java.lang.Long _sSearchRat;
        private final java.lang.Long _shcsrat;
        private final java.lang.Short _tReselections;
        private final TcrMax _tcrMax;
        private final TcrMaxHyst _tcrMaxHyst;
        private final java.lang.Long _ueTxPwrMaxRach;
        private final java.lang.Boolean _useOfHcs;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>> augmentation = Collections.emptyMap();

        private UmtsRanCellSelectionImpl(UmtsRanCellSelectionBuilder base) {
            this._deltaQRxLevMin = base.getDeltaQRxLevMin();
            this._hcsPrio = base.getHcsPrio();
            this._ncr = base.getNcr();
            this._nonHcsncr = base.getNonHcsncr();
            this._nonHcstcrMax = base.getNonHcstcrMax();
            this._nonHcstcrMaxHyst = base.getNonHcstcrMaxHyst();
            this._qHyst1s = base.getQHyst1s();
            this._qHyst2s = base.getQHyst2s();
            this._qRxLevMin = base.getQRxLevMin();
            this._qRxLevMinOffset = base.getQRxLevMinOffset();
            this._qhcs = base.getQhcs();
            this._qqualMin = base.getQqualMin();
            this._qqualMinOffset = base.getQqualMinOffset();
            this._qualityMeasureCpich = base.getQualityMeasureCpich();
            this._sIntersearch = base.getSIntersearch();
            this._sIntrasearch = base.getSIntrasearch();
            this._sLimitSearchRat = base.getSLimitSearchRat();
            this._sSearchHcs = base.getSSearchHcs();
            this._sSearchRat = base.getSSearchRat();
            this._shcsrat = base.getShcsrat();
            this._tReselections = base.getTReselections();
            this._tcrMax = base.getTcrMax();
            this._tcrMaxHyst = base.getTcrMaxHyst();
            this._ueTxPwrMaxRach = base.getUeTxPwrMaxRach();
            this._useOfHcs = base.isUseOfHcs();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getDeltaQRxLevMin() {
            return _deltaQRxLevMin;
        }
        
        @Override
        public java.lang.Short getHcsPrio() {
            return _hcsPrio;
        }
        
        @Override
        public java.lang.Short getNcr() {
            return _ncr;
        }
        
        @Override
        public java.lang.Short getNonHcsncr() {
            return _nonHcsncr;
        }
        
        @Override
        public NonHcstcrMax getNonHcstcrMax() {
            return _nonHcstcrMax;
        }
        
        @Override
        public NonHcstcrMaxHyst getNonHcstcrMaxHyst() {
            return _nonHcstcrMaxHyst;
        }
        
        @Override
        public java.lang.Short getQHyst1s() {
            return _qHyst1s;
        }
        
        @Override
        public java.lang.Short getQHyst2s() {
            return _qHyst2s;
        }
        
        @Override
        public java.lang.Long getQRxLevMin() {
            return _qRxLevMin;
        }
        
        @Override
        public java.lang.Short getQRxLevMinOffset() {
            return _qRxLevMinOffset;
        }
        
        @Override
        public java.lang.Short getQhcs() {
            return _qhcs;
        }
        
        @Override
        public java.lang.Long getQqualMin() {
            return _qqualMin;
        }
        
        @Override
        public java.lang.Short getQqualMinOffset() {
            return _qqualMinOffset;
        }
        
        @Override
        public QualityMeasureCpich getQualityMeasureCpich() {
            return _qualityMeasureCpich;
        }
        
        @Override
        public java.lang.Long getSIntersearch() {
            return _sIntersearch;
        }
        
        @Override
        public java.lang.Long getSIntrasearch() {
            return _sIntrasearch;
        }
        
        @Override
        public java.lang.Long getSLimitSearchRat() {
            return _sLimitSearchRat;
        }
        
        @Override
        public java.lang.Long getSSearchHcs() {
            return _sSearchHcs;
        }
        
        @Override
        public java.lang.Long getSSearchRat() {
            return _sSearchRat;
        }
        
        @Override
        public java.lang.Long getShcsrat() {
            return _shcsrat;
        }
        
        @Override
        public java.lang.Short getTReselections() {
            return _tReselections;
        }
        
        @Override
        public TcrMax getTcrMax() {
            return _tcrMax;
        }
        
        @Override
        public TcrMaxHyst getTcrMaxHyst() {
            return _tcrMaxHyst;
        }
        
        @Override
        public java.lang.Long getUeTxPwrMaxRach() {
            return _ueTxPwrMaxRach;
        }
        
        @Override
        public java.lang.Boolean isUseOfHcs() {
            return _useOfHcs;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_deltaQRxLevMin);
            result = prime * result + Objects.hashCode(_hcsPrio);
            result = prime * result + Objects.hashCode(_ncr);
            result = prime * result + Objects.hashCode(_nonHcsncr);
            result = prime * result + Objects.hashCode(_nonHcstcrMax);
            result = prime * result + Objects.hashCode(_nonHcstcrMaxHyst);
            result = prime * result + Objects.hashCode(_qHyst1s);
            result = prime * result + Objects.hashCode(_qHyst2s);
            result = prime * result + Objects.hashCode(_qRxLevMin);
            result = prime * result + Objects.hashCode(_qRxLevMinOffset);
            result = prime * result + Objects.hashCode(_qhcs);
            result = prime * result + Objects.hashCode(_qqualMin);
            result = prime * result + Objects.hashCode(_qqualMinOffset);
            result = prime * result + Objects.hashCode(_qualityMeasureCpich);
            result = prime * result + Objects.hashCode(_sIntersearch);
            result = prime * result + Objects.hashCode(_sIntrasearch);
            result = prime * result + Objects.hashCode(_sLimitSearchRat);
            result = prime * result + Objects.hashCode(_sSearchHcs);
            result = prime * result + Objects.hashCode(_sSearchRat);
            result = prime * result + Objects.hashCode(_shcsrat);
            result = prime * result + Objects.hashCode(_tReselections);
            result = prime * result + Objects.hashCode(_tcrMax);
            result = prime * result + Objects.hashCode(_tcrMaxHyst);
            result = prime * result + Objects.hashCode(_ueTxPwrMaxRach);
            result = prime * result + Objects.hashCode(_useOfHcs);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection)obj;
            if (!Objects.equals(_deltaQRxLevMin, other.getDeltaQRxLevMin())) {
                return false;
            }
            if (!Objects.equals(_hcsPrio, other.getHcsPrio())) {
                return false;
            }
            if (!Objects.equals(_ncr, other.getNcr())) {
                return false;
            }
            if (!Objects.equals(_nonHcsncr, other.getNonHcsncr())) {
                return false;
            }
            if (!Objects.equals(_nonHcstcrMax, other.getNonHcstcrMax())) {
                return false;
            }
            if (!Objects.equals(_nonHcstcrMaxHyst, other.getNonHcstcrMaxHyst())) {
                return false;
            }
            if (!Objects.equals(_qHyst1s, other.getQHyst1s())) {
                return false;
            }
            if (!Objects.equals(_qHyst2s, other.getQHyst2s())) {
                return false;
            }
            if (!Objects.equals(_qRxLevMin, other.getQRxLevMin())) {
                return false;
            }
            if (!Objects.equals(_qRxLevMinOffset, other.getQRxLevMinOffset())) {
                return false;
            }
            if (!Objects.equals(_qhcs, other.getQhcs())) {
                return false;
            }
            if (!Objects.equals(_qqualMin, other.getQqualMin())) {
                return false;
            }
            if (!Objects.equals(_qqualMinOffset, other.getQqualMinOffset())) {
                return false;
            }
            if (!Objects.equals(_qualityMeasureCpich, other.getQualityMeasureCpich())) {
                return false;
            }
            if (!Objects.equals(_sIntersearch, other.getSIntersearch())) {
                return false;
            }
            if (!Objects.equals(_sIntrasearch, other.getSIntrasearch())) {
                return false;
            }
            if (!Objects.equals(_sLimitSearchRat, other.getSLimitSearchRat())) {
                return false;
            }
            if (!Objects.equals(_sSearchHcs, other.getSSearchHcs())) {
                return false;
            }
            if (!Objects.equals(_sSearchRat, other.getSSearchRat())) {
                return false;
            }
            if (!Objects.equals(_shcsrat, other.getShcsrat())) {
                return false;
            }
            if (!Objects.equals(_tReselections, other.getTReselections())) {
                return false;
            }
            if (!Objects.equals(_tcrMax, other.getTcrMax())) {
                return false;
            }
            if (!Objects.equals(_tcrMaxHyst, other.getTcrMaxHyst())) {
                return false;
            }
            if (!Objects.equals(_ueTxPwrMaxRach, other.getUeTxPwrMaxRach())) {
                return false;
            }
            if (!Objects.equals(_useOfHcs, other.isUseOfHcs())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanCellSelectionImpl otherImpl = (UmtsRanCellSelectionImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanCellSelection [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_deltaQRxLevMin != null) {
                builder.append("_deltaQRxLevMin=");
                builder.append(_deltaQRxLevMin);
                builder.append(", ");
            }
            if (_hcsPrio != null) {
                builder.append("_hcsPrio=");
                builder.append(_hcsPrio);
                builder.append(", ");
            }
            if (_ncr != null) {
                builder.append("_ncr=");
                builder.append(_ncr);
                builder.append(", ");
            }
            if (_nonHcsncr != null) {
                builder.append("_nonHcsncr=");
                builder.append(_nonHcsncr);
                builder.append(", ");
            }
            if (_nonHcstcrMax != null) {
                builder.append("_nonHcstcrMax=");
                builder.append(_nonHcstcrMax);
                builder.append(", ");
            }
            if (_nonHcstcrMaxHyst != null) {
                builder.append("_nonHcstcrMaxHyst=");
                builder.append(_nonHcstcrMaxHyst);
                builder.append(", ");
            }
            if (_qHyst1s != null) {
                builder.append("_qHyst1s=");
                builder.append(_qHyst1s);
                builder.append(", ");
            }
            if (_qHyst2s != null) {
                builder.append("_qHyst2s=");
                builder.append(_qHyst2s);
                builder.append(", ");
            }
            if (_qRxLevMin != null) {
                builder.append("_qRxLevMin=");
                builder.append(_qRxLevMin);
                builder.append(", ");
            }
            if (_qRxLevMinOffset != null) {
                builder.append("_qRxLevMinOffset=");
                builder.append(_qRxLevMinOffset);
                builder.append(", ");
            }
            if (_qhcs != null) {
                builder.append("_qhcs=");
                builder.append(_qhcs);
                builder.append(", ");
            }
            if (_qqualMin != null) {
                builder.append("_qqualMin=");
                builder.append(_qqualMin);
                builder.append(", ");
            }
            if (_qqualMinOffset != null) {
                builder.append("_qqualMinOffset=");
                builder.append(_qqualMinOffset);
                builder.append(", ");
            }
            if (_qualityMeasureCpich != null) {
                builder.append("_qualityMeasureCpich=");
                builder.append(_qualityMeasureCpich);
                builder.append(", ");
            }
            if (_sIntersearch != null) {
                builder.append("_sIntersearch=");
                builder.append(_sIntersearch);
                builder.append(", ");
            }
            if (_sIntrasearch != null) {
                builder.append("_sIntrasearch=");
                builder.append(_sIntrasearch);
                builder.append(", ");
            }
            if (_sLimitSearchRat != null) {
                builder.append("_sLimitSearchRat=");
                builder.append(_sLimitSearchRat);
                builder.append(", ");
            }
            if (_sSearchHcs != null) {
                builder.append("_sSearchHcs=");
                builder.append(_sSearchHcs);
                builder.append(", ");
            }
            if (_sSearchRat != null) {
                builder.append("_sSearchRat=");
                builder.append(_sSearchRat);
                builder.append(", ");
            }
            if (_shcsrat != null) {
                builder.append("_shcsrat=");
                builder.append(_shcsrat);
                builder.append(", ");
            }
            if (_tReselections != null) {
                builder.append("_tReselections=");
                builder.append(_tReselections);
                builder.append(", ");
            }
            if (_tcrMax != null) {
                builder.append("_tcrMax=");
                builder.append(_tcrMax);
                builder.append(", ");
            }
            if (_tcrMaxHyst != null) {
                builder.append("_tcrMaxHyst=");
                builder.append(_tcrMaxHyst);
                builder.append(", ");
            }
            if (_ueTxPwrMaxRach != null) {
                builder.append("_ueTxPwrMaxRach=");
                builder.append(_ueTxPwrMaxRach);
                builder.append(", ");
            }
            if (_useOfHcs != null) {
                builder.append("_useOfHcs=");
                builder.append(_useOfHcs);
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
