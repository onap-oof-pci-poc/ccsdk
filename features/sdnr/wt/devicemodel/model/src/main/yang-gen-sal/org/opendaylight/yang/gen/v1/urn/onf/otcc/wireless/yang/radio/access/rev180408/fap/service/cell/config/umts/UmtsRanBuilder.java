package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRf;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList;
import java.util.List;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCsg;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellSelection;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan
 *
 */
public class UmtsRanBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan> {

    private java.lang.Long _cellId;
    private java.lang.String _hnbidRealm;
    private BigInteger _nRafC;
    private java.lang.Short _numOfHspdscHs;
    private BigInteger _numOfHssccHs;
    private java.lang.Integer _rncid;
    private BigInteger _tDataFwd;
    private BigInteger _tRafC;
    private BigInteger _tRatC;
    private BigInteger _tRelocOverall;
    private BigInteger _tRelocPrep;
    private BigInteger _tigOr;
    private BigInteger _tinTr;
    private UmtsRanCellRestriction _umtsRanCellRestriction;
    private UmtsRanCellSelection _umtsRanCellSelection;
    private UmtsRanCsg _umtsRanCsg;
    private UmtsRanDrx _umtsRanDrx;
    private UmtsRanInterFreqMeas _umtsRanInterFreqMeas;
    private UmtsRanInterRatMeas _umtsRanInterRatMeas;
    private UmtsRanIntraFreqMeas _umtsRanIntraFreqMeas;
    private UmtsRanNeighborList _umtsRanNeighborList;
    private UmtsRanNeighborListInUse _umtsRanNeighborListInUse;
    private UmtsRanPowerControl _umtsRanPowerControl;
    private UmtsRanRf _umtsRanRf;
    private UmtsRanRrcTimers _umtsRanRrcTimers;
    private UmtsRanUeInternalMeas _umtsRanUeInternalMeas;
    private java.lang.Integer _uraInUse;
    private List<java.lang.Integer> _uraList;
    private java.lang.Boolean _hsEnable;
    private java.lang.Boolean _hsFlag;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>> augmentation = Collections.emptyMap();

    public UmtsRanBuilder() {
    }
    public UmtsRanBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG arg) {
        this._uraList = arg.getUraList();
        this._uraInUse = arg.getUraInUse();
        this._rncid = arg.getRncid();
        this._cellId = arg.getCellId();
        this._tRatC = arg.getTRatC();
        this._tRafC = arg.getTRafC();
        this._nRafC = arg.getNRafC();
        this._tigOr = arg.getTigOr();
        this._tinTr = arg.getTinTr();
        this._tDataFwd = arg.getTDataFwd();
        this._tRelocPrep = arg.getTRelocPrep();
        this._tRelocOverall = arg.getTRelocOverall();
        this._hnbidRealm = arg.getHnbidRealm();
        this._hsFlag = arg.isHsFlag();
        this._hsEnable = arg.isHsEnable();
        this._numOfHspdscHs = arg.getNumOfHspdscHs();
        this._numOfHssccHs = arg.getNumOfHssccHs();
    }

    public UmtsRanBuilder(UmtsRan base) {
        this._cellId = base.getCellId();
        this._hnbidRealm = base.getHnbidRealm();
        this._nRafC = base.getNRafC();
        this._numOfHspdscHs = base.getNumOfHspdscHs();
        this._numOfHssccHs = base.getNumOfHssccHs();
        this._rncid = base.getRncid();
        this._tDataFwd = base.getTDataFwd();
        this._tRafC = base.getTRafC();
        this._tRatC = base.getTRatC();
        this._tRelocOverall = base.getTRelocOverall();
        this._tRelocPrep = base.getTRelocPrep();
        this._tigOr = base.getTigOr();
        this._tinTr = base.getTinTr();
        this._umtsRanCellRestriction = base.getUmtsRanCellRestriction();
        this._umtsRanCellSelection = base.getUmtsRanCellSelection();
        this._umtsRanCsg = base.getUmtsRanCsg();
        this._umtsRanDrx = base.getUmtsRanDrx();
        this._umtsRanInterFreqMeas = base.getUmtsRanInterFreqMeas();
        this._umtsRanInterRatMeas = base.getUmtsRanInterRatMeas();
        this._umtsRanIntraFreqMeas = base.getUmtsRanIntraFreqMeas();
        this._umtsRanNeighborList = base.getUmtsRanNeighborList();
        this._umtsRanNeighborListInUse = base.getUmtsRanNeighborListInUse();
        this._umtsRanPowerControl = base.getUmtsRanPowerControl();
        this._umtsRanRf = base.getUmtsRanRf();
        this._umtsRanRrcTimers = base.getUmtsRanRrcTimers();
        this._umtsRanUeInternalMeas = base.getUmtsRanUeInternalMeas();
        this._uraInUse = base.getUraInUse();
        this._uraList = base.getUraList();
        this._hsEnable = base.isHsEnable();
        this._hsFlag = base.isHsFlag();
        if (base instanceof UmtsRanImpl) {
            UmtsRanImpl impl = (UmtsRanImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG) {
            this._uraList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getUraList();
            this._uraInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getUraInUse();
            this._rncid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getRncid();
            this._cellId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getCellId();
            this._tRatC = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getTRatC();
            this._tRafC = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getTRafC();
            this._nRafC = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getNRafC();
            this._tigOr = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getTigOr();
            this._tinTr = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getTinTr();
            this._tDataFwd = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getTDataFwd();
            this._tRelocPrep = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getTRelocPrep();
            this._tRelocOverall = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getTRelocOverall();
            this._hnbidRealm = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getHnbidRealm();
            this._hsFlag = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).isHsFlag();
            this._hsEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).isHsEnable();
            this._numOfHspdscHs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getNumOfHspdscHs();
            this._numOfHssccHs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG)arg).getNumOfHssccHs();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getCellId() {
        return _cellId;
    }
    
    public java.lang.String getHnbidRealm() {
        return _hnbidRealm;
    }
    
    public BigInteger getNRafC() {
        return _nRafC;
    }
    
    public java.lang.Short getNumOfHspdscHs() {
        return _numOfHspdscHs;
    }
    
    public BigInteger getNumOfHssccHs() {
        return _numOfHssccHs;
    }
    
    public java.lang.Integer getRncid() {
        return _rncid;
    }
    
    public BigInteger getTDataFwd() {
        return _tDataFwd;
    }
    
    public BigInteger getTRafC() {
        return _tRafC;
    }
    
    public BigInteger getTRatC() {
        return _tRatC;
    }
    
    public BigInteger getTRelocOverall() {
        return _tRelocOverall;
    }
    
    public BigInteger getTRelocPrep() {
        return _tRelocPrep;
    }
    
    public BigInteger getTigOr() {
        return _tigOr;
    }
    
    public BigInteger getTinTr() {
        return _tinTr;
    }
    
    public UmtsRanCellRestriction getUmtsRanCellRestriction() {
        return _umtsRanCellRestriction;
    }
    
    public UmtsRanCellSelection getUmtsRanCellSelection() {
        return _umtsRanCellSelection;
    }
    
    public UmtsRanCsg getUmtsRanCsg() {
        return _umtsRanCsg;
    }
    
    public UmtsRanDrx getUmtsRanDrx() {
        return _umtsRanDrx;
    }
    
    public UmtsRanInterFreqMeas getUmtsRanInterFreqMeas() {
        return _umtsRanInterFreqMeas;
    }
    
    public UmtsRanInterRatMeas getUmtsRanInterRatMeas() {
        return _umtsRanInterRatMeas;
    }
    
    public UmtsRanIntraFreqMeas getUmtsRanIntraFreqMeas() {
        return _umtsRanIntraFreqMeas;
    }
    
    public UmtsRanNeighborList getUmtsRanNeighborList() {
        return _umtsRanNeighborList;
    }
    
    public UmtsRanNeighborListInUse getUmtsRanNeighborListInUse() {
        return _umtsRanNeighborListInUse;
    }
    
    public UmtsRanPowerControl getUmtsRanPowerControl() {
        return _umtsRanPowerControl;
    }
    
    public UmtsRanRf getUmtsRanRf() {
        return _umtsRanRf;
    }
    
    public UmtsRanRrcTimers getUmtsRanRrcTimers() {
        return _umtsRanRrcTimers;
    }
    
    public UmtsRanUeInternalMeas getUmtsRanUeInternalMeas() {
        return _umtsRanUeInternalMeas;
    }
    
    public java.lang.Integer getUraInUse() {
        return _uraInUse;
    }
    
    public List<java.lang.Integer> getUraList() {
        return _uraList;
    }
    
    public java.lang.Boolean isHsEnable() {
        return _hsEnable;
    }
    
    public java.lang.Boolean isHsFlag() {
        return _hsFlag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCellIdRange(final long value) {
         if (value >= 0L && value <= 268435455L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..268435455]].", value));
     }
    
    public UmtsRanBuilder setCellId(final java.lang.Long value) {
    if (value != null) {
        checkCellIdRange(value);
    }
        this._cellId = value;
        return this;
    }
    
     
     private static void check_hnbidRealmLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 182) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..182]].", value));
     }
    
    public UmtsRanBuilder setHnbidRealm(final java.lang.String value) {
    if (value != null) {
        check_hnbidRealmLength(value);
    }
        this._hnbidRealm = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNRAFCRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ONE, new java.math.BigInteger("18446744073709551615"));
         CHECKNRAFCRANGE_RANGES = a;
     }
     private static void checkNRafCRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNRAFCRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNRAFCRANGE_RANGES)));
     }
    
    public UmtsRanBuilder setNRafC(final BigInteger value) {
    if (value != null) {
        checkNRafCRange(value);
    }
        this._nRafC = value;
        return this;
    }
    
     
     private static void checkNumOfHspdscHsRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanBuilder setNumOfHspdscHs(final java.lang.Short value) {
    if (value != null) {
        checkNumOfHspdscHsRange(value);
    }
        this._numOfHspdscHs = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNUMOFHSSCCHSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNUMOFHSSCCHSRANGE_RANGES = a;
     }
     private static void checkNumOfHssccHsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNUMOFHSSCCHSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNUMOFHSSCCHSRANGE_RANGES)));
     }
    
    public UmtsRanBuilder setNumOfHssccHs(final BigInteger value) {
    if (value != null) {
        checkNumOfHssccHsRange(value);
    }
        this._numOfHssccHs = value;
        return this;
    }
    
     
     private static void checkRncidRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public UmtsRanBuilder setRncid(final java.lang.Integer value) {
    if (value != null) {
        checkRncidRange(value);
    }
        this._rncid = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTDATAFWDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTDATAFWDRANGE_RANGES = a;
     }
     private static void checkTDataFwdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTDATAFWDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTDATAFWDRANGE_RANGES)));
     }
    
    public UmtsRanBuilder setTDataFwd(final BigInteger value) {
    if (value != null) {
        checkTDataFwdRange(value);
    }
        this._tDataFwd = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTRAFCRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTRAFCRANGE_RANGES = a;
     }
     private static void checkTRafCRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTRAFCRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTRAFCRANGE_RANGES)));
     }
    
    public UmtsRanBuilder setTRafC(final BigInteger value) {
    if (value != null) {
        checkTRafCRange(value);
    }
        this._tRafC = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTRATCRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTRATCRANGE_RANGES = a;
     }
     private static void checkTRatCRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTRATCRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTRATCRANGE_RANGES)));
     }
    
    public UmtsRanBuilder setTRatC(final BigInteger value) {
    if (value != null) {
        checkTRatCRange(value);
    }
        this._tRatC = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTRELOCOVERALLRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTRELOCOVERALLRANGE_RANGES = a;
     }
     private static void checkTRelocOverallRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTRELOCOVERALLRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTRELOCOVERALLRANGE_RANGES)));
     }
    
    public UmtsRanBuilder setTRelocOverall(final BigInteger value) {
    if (value != null) {
        checkTRelocOverallRange(value);
    }
        this._tRelocOverall = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTRELOCPREPRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTRELOCPREPRANGE_RANGES = a;
     }
     private static void checkTRelocPrepRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTRELOCPREPRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTRELOCPREPRANGE_RANGES)));
     }
    
    public UmtsRanBuilder setTRelocPrep(final BigInteger value) {
    if (value != null) {
        checkTRelocPrepRange(value);
    }
        this._tRelocPrep = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTIGORRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTIGORRANGE_RANGES = a;
     }
     private static void checkTigOrRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTIGORRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTIGORRANGE_RANGES)));
     }
    
    public UmtsRanBuilder setTigOr(final BigInteger value) {
    if (value != null) {
        checkTigOrRange(value);
    }
        this._tigOr = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTINTRRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTINTRRANGE_RANGES = a;
     }
     private static void checkTinTrRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTINTRRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTINTRRANGE_RANGES)));
     }
    
    public UmtsRanBuilder setTinTr(final BigInteger value) {
    if (value != null) {
        checkTinTrRange(value);
    }
        this._tinTr = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanCellRestriction(final UmtsRanCellRestriction value) {
        this._umtsRanCellRestriction = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanCellSelection(final UmtsRanCellSelection value) {
        this._umtsRanCellSelection = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanCsg(final UmtsRanCsg value) {
        this._umtsRanCsg = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanDrx(final UmtsRanDrx value) {
        this._umtsRanDrx = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanInterFreqMeas(final UmtsRanInterFreqMeas value) {
        this._umtsRanInterFreqMeas = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanInterRatMeas(final UmtsRanInterRatMeas value) {
        this._umtsRanInterRatMeas = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanIntraFreqMeas(final UmtsRanIntraFreqMeas value) {
        this._umtsRanIntraFreqMeas = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanNeighborList(final UmtsRanNeighborList value) {
        this._umtsRanNeighborList = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanNeighborListInUse(final UmtsRanNeighborListInUse value) {
        this._umtsRanNeighborListInUse = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanPowerControl(final UmtsRanPowerControl value) {
        this._umtsRanPowerControl = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanRf(final UmtsRanRf value) {
        this._umtsRanRf = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanRrcTimers(final UmtsRanRrcTimers value) {
        this._umtsRanRrcTimers = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUmtsRanUeInternalMeas(final UmtsRanUeInternalMeas value) {
        this._umtsRanUeInternalMeas = value;
        return this;
    }
    
     
     private static void checkUraInUseRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public UmtsRanBuilder setUraInUse(final java.lang.Integer value) {
    if (value != null) {
        checkUraInUseRange(value);
    }
        this._uraInUse = value;
        return this;
    }
    
     
    public UmtsRanBuilder setUraList(final List<java.lang.Integer> value) {
        this._uraList = value;
        return this;
    }
    
     
    public UmtsRanBuilder setHsEnable(final java.lang.Boolean value) {
        this._hsEnable = value;
        return this;
    }
    
     
    public UmtsRanBuilder setHsFlag(final java.lang.Boolean value) {
        this._hsFlag = value;
        return this;
    }
    
    public UmtsRanBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRan build() {
        return new UmtsRanImpl(this);
    }

    private static final class UmtsRanImpl implements UmtsRan {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan.class;
        }

        private final java.lang.Long _cellId;
        private final java.lang.String _hnbidRealm;
        private final BigInteger _nRafC;
        private final java.lang.Short _numOfHspdscHs;
        private final BigInteger _numOfHssccHs;
        private final java.lang.Integer _rncid;
        private final BigInteger _tDataFwd;
        private final BigInteger _tRafC;
        private final BigInteger _tRatC;
        private final BigInteger _tRelocOverall;
        private final BigInteger _tRelocPrep;
        private final BigInteger _tigOr;
        private final BigInteger _tinTr;
        private final UmtsRanCellRestriction _umtsRanCellRestriction;
        private final UmtsRanCellSelection _umtsRanCellSelection;
        private final UmtsRanCsg _umtsRanCsg;
        private final UmtsRanDrx _umtsRanDrx;
        private final UmtsRanInterFreqMeas _umtsRanInterFreqMeas;
        private final UmtsRanInterRatMeas _umtsRanInterRatMeas;
        private final UmtsRanIntraFreqMeas _umtsRanIntraFreqMeas;
        private final UmtsRanNeighborList _umtsRanNeighborList;
        private final UmtsRanNeighborListInUse _umtsRanNeighborListInUse;
        private final UmtsRanPowerControl _umtsRanPowerControl;
        private final UmtsRanRf _umtsRanRf;
        private final UmtsRanRrcTimers _umtsRanRrcTimers;
        private final UmtsRanUeInternalMeas _umtsRanUeInternalMeas;
        private final java.lang.Integer _uraInUse;
        private final List<java.lang.Integer> _uraList;
        private final java.lang.Boolean _hsEnable;
        private final java.lang.Boolean _hsFlag;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>> augmentation = Collections.emptyMap();

        private UmtsRanImpl(UmtsRanBuilder base) {
            this._cellId = base.getCellId();
            this._hnbidRealm = base.getHnbidRealm();
            this._nRafC = base.getNRafC();
            this._numOfHspdscHs = base.getNumOfHspdscHs();
            this._numOfHssccHs = base.getNumOfHssccHs();
            this._rncid = base.getRncid();
            this._tDataFwd = base.getTDataFwd();
            this._tRafC = base.getTRafC();
            this._tRatC = base.getTRatC();
            this._tRelocOverall = base.getTRelocOverall();
            this._tRelocPrep = base.getTRelocPrep();
            this._tigOr = base.getTigOr();
            this._tinTr = base.getTinTr();
            this._umtsRanCellRestriction = base.getUmtsRanCellRestriction();
            this._umtsRanCellSelection = base.getUmtsRanCellSelection();
            this._umtsRanCsg = base.getUmtsRanCsg();
            this._umtsRanDrx = base.getUmtsRanDrx();
            this._umtsRanInterFreqMeas = base.getUmtsRanInterFreqMeas();
            this._umtsRanInterRatMeas = base.getUmtsRanInterRatMeas();
            this._umtsRanIntraFreqMeas = base.getUmtsRanIntraFreqMeas();
            this._umtsRanNeighborList = base.getUmtsRanNeighborList();
            this._umtsRanNeighborListInUse = base.getUmtsRanNeighborListInUse();
            this._umtsRanPowerControl = base.getUmtsRanPowerControl();
            this._umtsRanRf = base.getUmtsRanRf();
            this._umtsRanRrcTimers = base.getUmtsRanRrcTimers();
            this._umtsRanUeInternalMeas = base.getUmtsRanUeInternalMeas();
            this._uraInUse = base.getUraInUse();
            this._uraList = base.getUraList();
            this._hsEnable = base.isHsEnable();
            this._hsFlag = base.isHsFlag();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCellId() {
            return _cellId;
        }
        
        @Override
        public java.lang.String getHnbidRealm() {
            return _hnbidRealm;
        }
        
        @Override
        public BigInteger getNRafC() {
            return _nRafC;
        }
        
        @Override
        public java.lang.Short getNumOfHspdscHs() {
            return _numOfHspdscHs;
        }
        
        @Override
        public BigInteger getNumOfHssccHs() {
            return _numOfHssccHs;
        }
        
        @Override
        public java.lang.Integer getRncid() {
            return _rncid;
        }
        
        @Override
        public BigInteger getTDataFwd() {
            return _tDataFwd;
        }
        
        @Override
        public BigInteger getTRafC() {
            return _tRafC;
        }
        
        @Override
        public BigInteger getTRatC() {
            return _tRatC;
        }
        
        @Override
        public BigInteger getTRelocOverall() {
            return _tRelocOverall;
        }
        
        @Override
        public BigInteger getTRelocPrep() {
            return _tRelocPrep;
        }
        
        @Override
        public BigInteger getTigOr() {
            return _tigOr;
        }
        
        @Override
        public BigInteger getTinTr() {
            return _tinTr;
        }
        
        @Override
        public UmtsRanCellRestriction getUmtsRanCellRestriction() {
            return _umtsRanCellRestriction;
        }
        
        @Override
        public UmtsRanCellSelection getUmtsRanCellSelection() {
            return _umtsRanCellSelection;
        }
        
        @Override
        public UmtsRanCsg getUmtsRanCsg() {
            return _umtsRanCsg;
        }
        
        @Override
        public UmtsRanDrx getUmtsRanDrx() {
            return _umtsRanDrx;
        }
        
        @Override
        public UmtsRanInterFreqMeas getUmtsRanInterFreqMeas() {
            return _umtsRanInterFreqMeas;
        }
        
        @Override
        public UmtsRanInterRatMeas getUmtsRanInterRatMeas() {
            return _umtsRanInterRatMeas;
        }
        
        @Override
        public UmtsRanIntraFreqMeas getUmtsRanIntraFreqMeas() {
            return _umtsRanIntraFreqMeas;
        }
        
        @Override
        public UmtsRanNeighborList getUmtsRanNeighborList() {
            return _umtsRanNeighborList;
        }
        
        @Override
        public UmtsRanNeighborListInUse getUmtsRanNeighborListInUse() {
            return _umtsRanNeighborListInUse;
        }
        
        @Override
        public UmtsRanPowerControl getUmtsRanPowerControl() {
            return _umtsRanPowerControl;
        }
        
        @Override
        public UmtsRanRf getUmtsRanRf() {
            return _umtsRanRf;
        }
        
        @Override
        public UmtsRanRrcTimers getUmtsRanRrcTimers() {
            return _umtsRanRrcTimers;
        }
        
        @Override
        public UmtsRanUeInternalMeas getUmtsRanUeInternalMeas() {
            return _umtsRanUeInternalMeas;
        }
        
        @Override
        public java.lang.Integer getUraInUse() {
            return _uraInUse;
        }
        
        @Override
        public List<java.lang.Integer> getUraList() {
            return _uraList;
        }
        
        @Override
        public java.lang.Boolean isHsEnable() {
            return _hsEnable;
        }
        
        @Override
        public java.lang.Boolean isHsFlag() {
            return _hsFlag;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cellId);
            result = prime * result + Objects.hashCode(_hnbidRealm);
            result = prime * result + Objects.hashCode(_nRafC);
            result = prime * result + Objects.hashCode(_numOfHspdscHs);
            result = prime * result + Objects.hashCode(_numOfHssccHs);
            result = prime * result + Objects.hashCode(_rncid);
            result = prime * result + Objects.hashCode(_tDataFwd);
            result = prime * result + Objects.hashCode(_tRafC);
            result = prime * result + Objects.hashCode(_tRatC);
            result = prime * result + Objects.hashCode(_tRelocOverall);
            result = prime * result + Objects.hashCode(_tRelocPrep);
            result = prime * result + Objects.hashCode(_tigOr);
            result = prime * result + Objects.hashCode(_tinTr);
            result = prime * result + Objects.hashCode(_umtsRanCellRestriction);
            result = prime * result + Objects.hashCode(_umtsRanCellSelection);
            result = prime * result + Objects.hashCode(_umtsRanCsg);
            result = prime * result + Objects.hashCode(_umtsRanDrx);
            result = prime * result + Objects.hashCode(_umtsRanInterFreqMeas);
            result = prime * result + Objects.hashCode(_umtsRanInterRatMeas);
            result = prime * result + Objects.hashCode(_umtsRanIntraFreqMeas);
            result = prime * result + Objects.hashCode(_umtsRanNeighborList);
            result = prime * result + Objects.hashCode(_umtsRanNeighborListInUse);
            result = prime * result + Objects.hashCode(_umtsRanPowerControl);
            result = prime * result + Objects.hashCode(_umtsRanRf);
            result = prime * result + Objects.hashCode(_umtsRanRrcTimers);
            result = prime * result + Objects.hashCode(_umtsRanUeInternalMeas);
            result = prime * result + Objects.hashCode(_uraInUse);
            result = prime * result + Objects.hashCode(_uraList);
            result = prime * result + Objects.hashCode(_hsEnable);
            result = prime * result + Objects.hashCode(_hsFlag);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan)obj;
            if (!Objects.equals(_cellId, other.getCellId())) {
                return false;
            }
            if (!Objects.equals(_hnbidRealm, other.getHnbidRealm())) {
                return false;
            }
            if (!Objects.equals(_nRafC, other.getNRafC())) {
                return false;
            }
            if (!Objects.equals(_numOfHspdscHs, other.getNumOfHspdscHs())) {
                return false;
            }
            if (!Objects.equals(_numOfHssccHs, other.getNumOfHssccHs())) {
                return false;
            }
            if (!Objects.equals(_rncid, other.getRncid())) {
                return false;
            }
            if (!Objects.equals(_tDataFwd, other.getTDataFwd())) {
                return false;
            }
            if (!Objects.equals(_tRafC, other.getTRafC())) {
                return false;
            }
            if (!Objects.equals(_tRatC, other.getTRatC())) {
                return false;
            }
            if (!Objects.equals(_tRelocOverall, other.getTRelocOverall())) {
                return false;
            }
            if (!Objects.equals(_tRelocPrep, other.getTRelocPrep())) {
                return false;
            }
            if (!Objects.equals(_tigOr, other.getTigOr())) {
                return false;
            }
            if (!Objects.equals(_tinTr, other.getTinTr())) {
                return false;
            }
            if (!Objects.equals(_umtsRanCellRestriction, other.getUmtsRanCellRestriction())) {
                return false;
            }
            if (!Objects.equals(_umtsRanCellSelection, other.getUmtsRanCellSelection())) {
                return false;
            }
            if (!Objects.equals(_umtsRanCsg, other.getUmtsRanCsg())) {
                return false;
            }
            if (!Objects.equals(_umtsRanDrx, other.getUmtsRanDrx())) {
                return false;
            }
            if (!Objects.equals(_umtsRanInterFreqMeas, other.getUmtsRanInterFreqMeas())) {
                return false;
            }
            if (!Objects.equals(_umtsRanInterRatMeas, other.getUmtsRanInterRatMeas())) {
                return false;
            }
            if (!Objects.equals(_umtsRanIntraFreqMeas, other.getUmtsRanIntraFreqMeas())) {
                return false;
            }
            if (!Objects.equals(_umtsRanNeighborList, other.getUmtsRanNeighborList())) {
                return false;
            }
            if (!Objects.equals(_umtsRanNeighborListInUse, other.getUmtsRanNeighborListInUse())) {
                return false;
            }
            if (!Objects.equals(_umtsRanPowerControl, other.getUmtsRanPowerControl())) {
                return false;
            }
            if (!Objects.equals(_umtsRanRf, other.getUmtsRanRf())) {
                return false;
            }
            if (!Objects.equals(_umtsRanRrcTimers, other.getUmtsRanRrcTimers())) {
                return false;
            }
            if (!Objects.equals(_umtsRanUeInternalMeas, other.getUmtsRanUeInternalMeas())) {
                return false;
            }
            if (!Objects.equals(_uraInUse, other.getUraInUse())) {
                return false;
            }
            if (!Objects.equals(_uraList, other.getUraList())) {
                return false;
            }
            if (!Objects.equals(_hsEnable, other.isHsEnable())) {
                return false;
            }
            if (!Objects.equals(_hsFlag, other.isHsFlag())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanImpl otherImpl = (UmtsRanImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRan [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cellId != null) {
                builder.append("_cellId=");
                builder.append(_cellId);
                builder.append(", ");
            }
            if (_hnbidRealm != null) {
                builder.append("_hnbidRealm=");
                builder.append(_hnbidRealm);
                builder.append(", ");
            }
            if (_nRafC != null) {
                builder.append("_nRafC=");
                builder.append(_nRafC);
                builder.append(", ");
            }
            if (_numOfHspdscHs != null) {
                builder.append("_numOfHspdscHs=");
                builder.append(_numOfHspdscHs);
                builder.append(", ");
            }
            if (_numOfHssccHs != null) {
                builder.append("_numOfHssccHs=");
                builder.append(_numOfHssccHs);
                builder.append(", ");
            }
            if (_rncid != null) {
                builder.append("_rncid=");
                builder.append(_rncid);
                builder.append(", ");
            }
            if (_tDataFwd != null) {
                builder.append("_tDataFwd=");
                builder.append(_tDataFwd);
                builder.append(", ");
            }
            if (_tRafC != null) {
                builder.append("_tRafC=");
                builder.append(_tRafC);
                builder.append(", ");
            }
            if (_tRatC != null) {
                builder.append("_tRatC=");
                builder.append(_tRatC);
                builder.append(", ");
            }
            if (_tRelocOverall != null) {
                builder.append("_tRelocOverall=");
                builder.append(_tRelocOverall);
                builder.append(", ");
            }
            if (_tRelocPrep != null) {
                builder.append("_tRelocPrep=");
                builder.append(_tRelocPrep);
                builder.append(", ");
            }
            if (_tigOr != null) {
                builder.append("_tigOr=");
                builder.append(_tigOr);
                builder.append(", ");
            }
            if (_tinTr != null) {
                builder.append("_tinTr=");
                builder.append(_tinTr);
                builder.append(", ");
            }
            if (_umtsRanCellRestriction != null) {
                builder.append("_umtsRanCellRestriction=");
                builder.append(_umtsRanCellRestriction);
                builder.append(", ");
            }
            if (_umtsRanCellSelection != null) {
                builder.append("_umtsRanCellSelection=");
                builder.append(_umtsRanCellSelection);
                builder.append(", ");
            }
            if (_umtsRanCsg != null) {
                builder.append("_umtsRanCsg=");
                builder.append(_umtsRanCsg);
                builder.append(", ");
            }
            if (_umtsRanDrx != null) {
                builder.append("_umtsRanDrx=");
                builder.append(_umtsRanDrx);
                builder.append(", ");
            }
            if (_umtsRanInterFreqMeas != null) {
                builder.append("_umtsRanInterFreqMeas=");
                builder.append(_umtsRanInterFreqMeas);
                builder.append(", ");
            }
            if (_umtsRanInterRatMeas != null) {
                builder.append("_umtsRanInterRatMeas=");
                builder.append(_umtsRanInterRatMeas);
                builder.append(", ");
            }
            if (_umtsRanIntraFreqMeas != null) {
                builder.append("_umtsRanIntraFreqMeas=");
                builder.append(_umtsRanIntraFreqMeas);
                builder.append(", ");
            }
            if (_umtsRanNeighborList != null) {
                builder.append("_umtsRanNeighborList=");
                builder.append(_umtsRanNeighborList);
                builder.append(", ");
            }
            if (_umtsRanNeighborListInUse != null) {
                builder.append("_umtsRanNeighborListInUse=");
                builder.append(_umtsRanNeighborListInUse);
                builder.append(", ");
            }
            if (_umtsRanPowerControl != null) {
                builder.append("_umtsRanPowerControl=");
                builder.append(_umtsRanPowerControl);
                builder.append(", ");
            }
            if (_umtsRanRf != null) {
                builder.append("_umtsRanRf=");
                builder.append(_umtsRanRf);
                builder.append(", ");
            }
            if (_umtsRanRrcTimers != null) {
                builder.append("_umtsRanRrcTimers=");
                builder.append(_umtsRanRrcTimers);
                builder.append(", ");
            }
            if (_umtsRanUeInternalMeas != null) {
                builder.append("_umtsRanUeInternalMeas=");
                builder.append(_umtsRanUeInternalMeas);
                builder.append(", ");
            }
            if (_uraInUse != null) {
                builder.append("_uraInUse=");
                builder.append(_uraInUse);
                builder.append(", ");
            }
            if (_uraList != null) {
                builder.append("_uraList=");
                builder.append(_uraList);
                builder.append(", ");
            }
            if (_hsEnable != null) {
                builder.append("_hsEnable=");
                builder.append(_hsEnable);
                builder.append(", ");
            }
            if (_hsFlag != null) {
                builder.append("_hsFlag=");
                builder.append(_hsFlag);
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
