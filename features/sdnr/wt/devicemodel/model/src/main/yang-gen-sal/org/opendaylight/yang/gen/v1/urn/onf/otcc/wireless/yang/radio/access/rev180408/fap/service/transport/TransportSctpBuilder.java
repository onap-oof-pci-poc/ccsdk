package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp
 *
 */
public class TransportSctpBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp> {

    private BigInteger _assocNumberOfEntries;
    private BigInteger _checksumErrors;
    private DateAndTime _discontinuity;
    private BigInteger _fragUsrMsgs;
    private BigInteger _hbInterval;
    private BigInteger _inCtrlChunks;
    private BigInteger _inOrderChunks;
    private BigInteger _inSctpPacks;
    private BigInteger _inUnorderChunks;
    private BigInteger _maxAssociationRetransmits;
    private BigInteger _maxInitRetransmits;
    private BigInteger _maxPathRetransmits;
    private BigInteger _outCtrlChunks;
    private BigInteger _outOfBlues;
    private BigInteger _outOrderChunks;
    private BigInteger _outSctpPacks;
    private BigInteger _outUnorderChunks;
    private BigInteger _reasmUsrMsgs;
    private BigInteger _rtoInitial;
    private BigInteger _rtoMax;
    private BigInteger _rtoMin;
    private List<TransportSctpAssoc> _transportSctpAssoc;
    private BigInteger _valCookieLife;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>> augmentation = Collections.emptyMap();

    public TransportSctpBuilder() {
    }
    public TransportSctpBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG arg) {
        this._enable = arg.isEnable();
        this._hbInterval = arg.getHbInterval();
        this._maxAssociationRetransmits = arg.getMaxAssociationRetransmits();
        this._maxInitRetransmits = arg.getMaxInitRetransmits();
        this._maxPathRetransmits = arg.getMaxPathRetransmits();
        this._rtoInitial = arg.getRtoInitial();
        this._rtoMax = arg.getRtoMax();
        this._rtoMin = arg.getRtoMin();
        this._valCookieLife = arg.getValCookieLife();
        this._outOfBlues = arg.getOutOfBlues();
        this._checksumErrors = arg.getChecksumErrors();
        this._outCtrlChunks = arg.getOutCtrlChunks();
        this._outOrderChunks = arg.getOutOrderChunks();
        this._outUnorderChunks = arg.getOutUnorderChunks();
        this._inCtrlChunks = arg.getInCtrlChunks();
        this._inOrderChunks = arg.getInOrderChunks();
        this._inUnorderChunks = arg.getInUnorderChunks();
        this._fragUsrMsgs = arg.getFragUsrMsgs();
        this._reasmUsrMsgs = arg.getReasmUsrMsgs();
        this._outSctpPacks = arg.getOutSctpPacks();
        this._inSctpPacks = arg.getInSctpPacks();
        this._discontinuity = arg.getDiscontinuity();
        this._assocNumberOfEntries = arg.getAssocNumberOfEntries();
    }

    public TransportSctpBuilder(TransportSctp base) {
        this._assocNumberOfEntries = base.getAssocNumberOfEntries();
        this._checksumErrors = base.getChecksumErrors();
        this._discontinuity = base.getDiscontinuity();
        this._fragUsrMsgs = base.getFragUsrMsgs();
        this._hbInterval = base.getHbInterval();
        this._inCtrlChunks = base.getInCtrlChunks();
        this._inOrderChunks = base.getInOrderChunks();
        this._inSctpPacks = base.getInSctpPacks();
        this._inUnorderChunks = base.getInUnorderChunks();
        this._maxAssociationRetransmits = base.getMaxAssociationRetransmits();
        this._maxInitRetransmits = base.getMaxInitRetransmits();
        this._maxPathRetransmits = base.getMaxPathRetransmits();
        this._outCtrlChunks = base.getOutCtrlChunks();
        this._outOfBlues = base.getOutOfBlues();
        this._outOrderChunks = base.getOutOrderChunks();
        this._outSctpPacks = base.getOutSctpPacks();
        this._outUnorderChunks = base.getOutUnorderChunks();
        this._reasmUsrMsgs = base.getReasmUsrMsgs();
        this._rtoInitial = base.getRtoInitial();
        this._rtoMax = base.getRtoMax();
        this._rtoMin = base.getRtoMin();
        this._transportSctpAssoc = base.getTransportSctpAssoc();
        this._valCookieLife = base.getValCookieLife();
        this._enable = base.isEnable();
        if (base instanceof TransportSctpImpl) {
            TransportSctpImpl impl = (TransportSctpImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).isEnable();
            this._hbInterval = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getHbInterval();
            this._maxAssociationRetransmits = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getMaxAssociationRetransmits();
            this._maxInitRetransmits = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getMaxInitRetransmits();
            this._maxPathRetransmits = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getMaxPathRetransmits();
            this._rtoInitial = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getRtoInitial();
            this._rtoMax = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getRtoMax();
            this._rtoMin = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getRtoMin();
            this._valCookieLife = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getValCookieLife();
            this._outOfBlues = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getOutOfBlues();
            this._checksumErrors = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getChecksumErrors();
            this._outCtrlChunks = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getOutCtrlChunks();
            this._outOrderChunks = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getOutOrderChunks();
            this._outUnorderChunks = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getOutUnorderChunks();
            this._inCtrlChunks = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getInCtrlChunks();
            this._inOrderChunks = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getInOrderChunks();
            this._inUnorderChunks = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getInUnorderChunks();
            this._fragUsrMsgs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getFragUsrMsgs();
            this._reasmUsrMsgs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getReasmUsrMsgs();
            this._outSctpPacks = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getOutSctpPacks();
            this._inSctpPacks = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getInSctpPacks();
            this._discontinuity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getDiscontinuity();
            this._assocNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG)arg).getAssocNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getAssocNumberOfEntries() {
        return _assocNumberOfEntries;
    }
    
    public BigInteger getChecksumErrors() {
        return _checksumErrors;
    }
    
    public DateAndTime getDiscontinuity() {
        return _discontinuity;
    }
    
    public BigInteger getFragUsrMsgs() {
        return _fragUsrMsgs;
    }
    
    public BigInteger getHbInterval() {
        return _hbInterval;
    }
    
    public BigInteger getInCtrlChunks() {
        return _inCtrlChunks;
    }
    
    public BigInteger getInOrderChunks() {
        return _inOrderChunks;
    }
    
    public BigInteger getInSctpPacks() {
        return _inSctpPacks;
    }
    
    public BigInteger getInUnorderChunks() {
        return _inUnorderChunks;
    }
    
    public BigInteger getMaxAssociationRetransmits() {
        return _maxAssociationRetransmits;
    }
    
    public BigInteger getMaxInitRetransmits() {
        return _maxInitRetransmits;
    }
    
    public BigInteger getMaxPathRetransmits() {
        return _maxPathRetransmits;
    }
    
    public BigInteger getOutCtrlChunks() {
        return _outCtrlChunks;
    }
    
    public BigInteger getOutOfBlues() {
        return _outOfBlues;
    }
    
    public BigInteger getOutOrderChunks() {
        return _outOrderChunks;
    }
    
    public BigInteger getOutSctpPacks() {
        return _outSctpPacks;
    }
    
    public BigInteger getOutUnorderChunks() {
        return _outUnorderChunks;
    }
    
    public BigInteger getReasmUsrMsgs() {
        return _reasmUsrMsgs;
    }
    
    public BigInteger getRtoInitial() {
        return _rtoInitial;
    }
    
    public BigInteger getRtoMax() {
        return _rtoMax;
    }
    
    public BigInteger getRtoMin() {
        return _rtoMin;
    }
    
    public List<TransportSctpAssoc> getTransportSctpAssoc() {
        return _transportSctpAssoc;
    }
    
    public BigInteger getValCookieLife() {
        return _valCookieLife;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKASSOCNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKASSOCNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkAssocNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKASSOCNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKASSOCNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setAssocNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkAssocNumberOfEntriesRange(value);
    }
        this._assocNumberOfEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCHECKSUMERRORSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCHECKSUMERRORSRANGE_RANGES = a;
     }
     private static void checkChecksumErrorsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCHECKSUMERRORSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCHECKSUMERRORSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setChecksumErrors(final BigInteger value) {
    if (value != null) {
        checkChecksumErrorsRange(value);
    }
        this._checksumErrors = value;
        return this;
    }
    
     
    public TransportSctpBuilder setDiscontinuity(final DateAndTime value) {
        this._discontinuity = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKFRAGUSRMSGSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKFRAGUSRMSGSRANGE_RANGES = a;
     }
     private static void checkFragUsrMsgsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKFRAGUSRMSGSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKFRAGUSRMSGSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setFragUsrMsgs(final BigInteger value) {
    if (value != null) {
        checkFragUsrMsgsRange(value);
    }
        this._fragUsrMsgs = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKHBINTERVALRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ONE, new java.math.BigInteger("18446744073709551615"));
         CHECKHBINTERVALRANGE_RANGES = a;
     }
     private static void checkHbIntervalRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKHBINTERVALRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKHBINTERVALRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setHbInterval(final BigInteger value) {
    if (value != null) {
        checkHbIntervalRange(value);
    }
        this._hbInterval = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKINCTRLCHUNKSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKINCTRLCHUNKSRANGE_RANGES = a;
     }
     private static void checkInCtrlChunksRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKINCTRLCHUNKSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKINCTRLCHUNKSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setInCtrlChunks(final BigInteger value) {
    if (value != null) {
        checkInCtrlChunksRange(value);
    }
        this._inCtrlChunks = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKINORDERCHUNKSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKINORDERCHUNKSRANGE_RANGES = a;
     }
     private static void checkInOrderChunksRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKINORDERCHUNKSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKINORDERCHUNKSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setInOrderChunks(final BigInteger value) {
    if (value != null) {
        checkInOrderChunksRange(value);
    }
        this._inOrderChunks = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKINSCTPPACKSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKINSCTPPACKSRANGE_RANGES = a;
     }
     private static void checkInSctpPacksRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKINSCTPPACKSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKINSCTPPACKSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setInSctpPacks(final BigInteger value) {
    if (value != null) {
        checkInSctpPacksRange(value);
    }
        this._inSctpPacks = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKINUNORDERCHUNKSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKINUNORDERCHUNKSRANGE_RANGES = a;
     }
     private static void checkInUnorderChunksRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKINUNORDERCHUNKSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKINUNORDERCHUNKSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setInUnorderChunks(final BigInteger value) {
    if (value != null) {
        checkInUnorderChunksRange(value);
    }
        this._inUnorderChunks = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXASSOCIATIONRETRANSMITSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXASSOCIATIONRETRANSMITSRANGE_RANGES = a;
     }
     private static void checkMaxAssociationRetransmitsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXASSOCIATIONRETRANSMITSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXASSOCIATIONRETRANSMITSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setMaxAssociationRetransmits(final BigInteger value) {
    if (value != null) {
        checkMaxAssociationRetransmitsRange(value);
    }
        this._maxAssociationRetransmits = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXINITRETRANSMITSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXINITRETRANSMITSRANGE_RANGES = a;
     }
     private static void checkMaxInitRetransmitsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXINITRETRANSMITSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXINITRETRANSMITSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setMaxInitRetransmits(final BigInteger value) {
    if (value != null) {
        checkMaxInitRetransmitsRange(value);
    }
        this._maxInitRetransmits = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXPATHRETRANSMITSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXPATHRETRANSMITSRANGE_RANGES = a;
     }
     private static void checkMaxPathRetransmitsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXPATHRETRANSMITSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXPATHRETRANSMITSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setMaxPathRetransmits(final BigInteger value) {
    if (value != null) {
        checkMaxPathRetransmitsRange(value);
    }
        this._maxPathRetransmits = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKOUTCTRLCHUNKSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKOUTCTRLCHUNKSRANGE_RANGES = a;
     }
     private static void checkOutCtrlChunksRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKOUTCTRLCHUNKSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKOUTCTRLCHUNKSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setOutCtrlChunks(final BigInteger value) {
    if (value != null) {
        checkOutCtrlChunksRange(value);
    }
        this._outCtrlChunks = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKOUTOFBLUESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKOUTOFBLUESRANGE_RANGES = a;
     }
     private static void checkOutOfBluesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKOUTOFBLUESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKOUTOFBLUESRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setOutOfBlues(final BigInteger value) {
    if (value != null) {
        checkOutOfBluesRange(value);
    }
        this._outOfBlues = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKOUTORDERCHUNKSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKOUTORDERCHUNKSRANGE_RANGES = a;
     }
     private static void checkOutOrderChunksRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKOUTORDERCHUNKSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKOUTORDERCHUNKSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setOutOrderChunks(final BigInteger value) {
    if (value != null) {
        checkOutOrderChunksRange(value);
    }
        this._outOrderChunks = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKOUTSCTPPACKSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKOUTSCTPPACKSRANGE_RANGES = a;
     }
     private static void checkOutSctpPacksRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKOUTSCTPPACKSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKOUTSCTPPACKSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setOutSctpPacks(final BigInteger value) {
    if (value != null) {
        checkOutSctpPacksRange(value);
    }
        this._outSctpPacks = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKOUTUNORDERCHUNKSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKOUTUNORDERCHUNKSRANGE_RANGES = a;
     }
     private static void checkOutUnorderChunksRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKOUTUNORDERCHUNKSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKOUTUNORDERCHUNKSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setOutUnorderChunks(final BigInteger value) {
    if (value != null) {
        checkOutUnorderChunksRange(value);
    }
        this._outUnorderChunks = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKREASMUSRMSGSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKREASMUSRMSGSRANGE_RANGES = a;
     }
     private static void checkReasmUsrMsgsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKREASMUSRMSGSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKREASMUSRMSGSRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setReasmUsrMsgs(final BigInteger value) {
    if (value != null) {
        checkReasmUsrMsgsRange(value);
    }
        this._reasmUsrMsgs = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRTOINITIALRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRTOINITIALRANGE_RANGES = a;
     }
     private static void checkRtoInitialRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRTOINITIALRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRTOINITIALRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setRtoInitial(final BigInteger value) {
    if (value != null) {
        checkRtoInitialRange(value);
    }
        this._rtoInitial = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRTOMAXRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRTOMAXRANGE_RANGES = a;
     }
     private static void checkRtoMaxRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRTOMAXRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRTOMAXRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setRtoMax(final BigInteger value) {
    if (value != null) {
        checkRtoMaxRange(value);
    }
        this._rtoMax = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRTOMINRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRTOMINRANGE_RANGES = a;
     }
     private static void checkRtoMinRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRTOMINRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRTOMINRANGE_RANGES)));
     }
    
    public TransportSctpBuilder setRtoMin(final BigInteger value) {
    if (value != null) {
        checkRtoMinRange(value);
    }
        this._rtoMin = value;
        return this;
    }
    
     
    public TransportSctpBuilder setTransportSctpAssoc(final List<TransportSctpAssoc> value) {
        this._transportSctpAssoc = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKVALCOOKIELIFERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKVALCOOKIELIFERANGE_RANGES = a;
     }
     private static void checkValCookieLifeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKVALCOOKIELIFERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKVALCOOKIELIFERANGE_RANGES)));
     }
    
    public TransportSctpBuilder setValCookieLife(final BigInteger value) {
    if (value != null) {
        checkValCookieLifeRange(value);
    }
        this._valCookieLife = value;
        return this;
    }
    
     
    public TransportSctpBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public TransportSctpBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TransportSctpBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TransportSctp build() {
        return new TransportSctpImpl(this);
    }

    private static final class TransportSctpImpl implements TransportSctp {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp.class;
        }

        private final BigInteger _assocNumberOfEntries;
        private final BigInteger _checksumErrors;
        private final DateAndTime _discontinuity;
        private final BigInteger _fragUsrMsgs;
        private final BigInteger _hbInterval;
        private final BigInteger _inCtrlChunks;
        private final BigInteger _inOrderChunks;
        private final BigInteger _inSctpPacks;
        private final BigInteger _inUnorderChunks;
        private final BigInteger _maxAssociationRetransmits;
        private final BigInteger _maxInitRetransmits;
        private final BigInteger _maxPathRetransmits;
        private final BigInteger _outCtrlChunks;
        private final BigInteger _outOfBlues;
        private final BigInteger _outOrderChunks;
        private final BigInteger _outSctpPacks;
        private final BigInteger _outUnorderChunks;
        private final BigInteger _reasmUsrMsgs;
        private final BigInteger _rtoInitial;
        private final BigInteger _rtoMax;
        private final BigInteger _rtoMin;
        private final List<TransportSctpAssoc> _transportSctpAssoc;
        private final BigInteger _valCookieLife;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>> augmentation = Collections.emptyMap();

        private TransportSctpImpl(TransportSctpBuilder base) {
            this._assocNumberOfEntries = base.getAssocNumberOfEntries();
            this._checksumErrors = base.getChecksumErrors();
            this._discontinuity = base.getDiscontinuity();
            this._fragUsrMsgs = base.getFragUsrMsgs();
            this._hbInterval = base.getHbInterval();
            this._inCtrlChunks = base.getInCtrlChunks();
            this._inOrderChunks = base.getInOrderChunks();
            this._inSctpPacks = base.getInSctpPacks();
            this._inUnorderChunks = base.getInUnorderChunks();
            this._maxAssociationRetransmits = base.getMaxAssociationRetransmits();
            this._maxInitRetransmits = base.getMaxInitRetransmits();
            this._maxPathRetransmits = base.getMaxPathRetransmits();
            this._outCtrlChunks = base.getOutCtrlChunks();
            this._outOfBlues = base.getOutOfBlues();
            this._outOrderChunks = base.getOutOrderChunks();
            this._outSctpPacks = base.getOutSctpPacks();
            this._outUnorderChunks = base.getOutUnorderChunks();
            this._reasmUsrMsgs = base.getReasmUsrMsgs();
            this._rtoInitial = base.getRtoInitial();
            this._rtoMax = base.getRtoMax();
            this._rtoMin = base.getRtoMin();
            this._transportSctpAssoc = base.getTransportSctpAssoc();
            this._valCookieLife = base.getValCookieLife();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getAssocNumberOfEntries() {
            return _assocNumberOfEntries;
        }
        
        @Override
        public BigInteger getChecksumErrors() {
            return _checksumErrors;
        }
        
        @Override
        public DateAndTime getDiscontinuity() {
            return _discontinuity;
        }
        
        @Override
        public BigInteger getFragUsrMsgs() {
            return _fragUsrMsgs;
        }
        
        @Override
        public BigInteger getHbInterval() {
            return _hbInterval;
        }
        
        @Override
        public BigInteger getInCtrlChunks() {
            return _inCtrlChunks;
        }
        
        @Override
        public BigInteger getInOrderChunks() {
            return _inOrderChunks;
        }
        
        @Override
        public BigInteger getInSctpPacks() {
            return _inSctpPacks;
        }
        
        @Override
        public BigInteger getInUnorderChunks() {
            return _inUnorderChunks;
        }
        
        @Override
        public BigInteger getMaxAssociationRetransmits() {
            return _maxAssociationRetransmits;
        }
        
        @Override
        public BigInteger getMaxInitRetransmits() {
            return _maxInitRetransmits;
        }
        
        @Override
        public BigInteger getMaxPathRetransmits() {
            return _maxPathRetransmits;
        }
        
        @Override
        public BigInteger getOutCtrlChunks() {
            return _outCtrlChunks;
        }
        
        @Override
        public BigInteger getOutOfBlues() {
            return _outOfBlues;
        }
        
        @Override
        public BigInteger getOutOrderChunks() {
            return _outOrderChunks;
        }
        
        @Override
        public BigInteger getOutSctpPacks() {
            return _outSctpPacks;
        }
        
        @Override
        public BigInteger getOutUnorderChunks() {
            return _outUnorderChunks;
        }
        
        @Override
        public BigInteger getReasmUsrMsgs() {
            return _reasmUsrMsgs;
        }
        
        @Override
        public BigInteger getRtoInitial() {
            return _rtoInitial;
        }
        
        @Override
        public BigInteger getRtoMax() {
            return _rtoMax;
        }
        
        @Override
        public BigInteger getRtoMin() {
            return _rtoMin;
        }
        
        @Override
        public List<TransportSctpAssoc> getTransportSctpAssoc() {
            return _transportSctpAssoc;
        }
        
        @Override
        public BigInteger getValCookieLife() {
            return _valCookieLife;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_assocNumberOfEntries);
            result = prime * result + Objects.hashCode(_checksumErrors);
            result = prime * result + Objects.hashCode(_discontinuity);
            result = prime * result + Objects.hashCode(_fragUsrMsgs);
            result = prime * result + Objects.hashCode(_hbInterval);
            result = prime * result + Objects.hashCode(_inCtrlChunks);
            result = prime * result + Objects.hashCode(_inOrderChunks);
            result = prime * result + Objects.hashCode(_inSctpPacks);
            result = prime * result + Objects.hashCode(_inUnorderChunks);
            result = prime * result + Objects.hashCode(_maxAssociationRetransmits);
            result = prime * result + Objects.hashCode(_maxInitRetransmits);
            result = prime * result + Objects.hashCode(_maxPathRetransmits);
            result = prime * result + Objects.hashCode(_outCtrlChunks);
            result = prime * result + Objects.hashCode(_outOfBlues);
            result = prime * result + Objects.hashCode(_outOrderChunks);
            result = prime * result + Objects.hashCode(_outSctpPacks);
            result = prime * result + Objects.hashCode(_outUnorderChunks);
            result = prime * result + Objects.hashCode(_reasmUsrMsgs);
            result = prime * result + Objects.hashCode(_rtoInitial);
            result = prime * result + Objects.hashCode(_rtoMax);
            result = prime * result + Objects.hashCode(_rtoMin);
            result = prime * result + Objects.hashCode(_transportSctpAssoc);
            result = prime * result + Objects.hashCode(_valCookieLife);
            result = prime * result + Objects.hashCode(_enable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp)obj;
            if (!Objects.equals(_assocNumberOfEntries, other.getAssocNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_checksumErrors, other.getChecksumErrors())) {
                return false;
            }
            if (!Objects.equals(_discontinuity, other.getDiscontinuity())) {
                return false;
            }
            if (!Objects.equals(_fragUsrMsgs, other.getFragUsrMsgs())) {
                return false;
            }
            if (!Objects.equals(_hbInterval, other.getHbInterval())) {
                return false;
            }
            if (!Objects.equals(_inCtrlChunks, other.getInCtrlChunks())) {
                return false;
            }
            if (!Objects.equals(_inOrderChunks, other.getInOrderChunks())) {
                return false;
            }
            if (!Objects.equals(_inSctpPacks, other.getInSctpPacks())) {
                return false;
            }
            if (!Objects.equals(_inUnorderChunks, other.getInUnorderChunks())) {
                return false;
            }
            if (!Objects.equals(_maxAssociationRetransmits, other.getMaxAssociationRetransmits())) {
                return false;
            }
            if (!Objects.equals(_maxInitRetransmits, other.getMaxInitRetransmits())) {
                return false;
            }
            if (!Objects.equals(_maxPathRetransmits, other.getMaxPathRetransmits())) {
                return false;
            }
            if (!Objects.equals(_outCtrlChunks, other.getOutCtrlChunks())) {
                return false;
            }
            if (!Objects.equals(_outOfBlues, other.getOutOfBlues())) {
                return false;
            }
            if (!Objects.equals(_outOrderChunks, other.getOutOrderChunks())) {
                return false;
            }
            if (!Objects.equals(_outSctpPacks, other.getOutSctpPacks())) {
                return false;
            }
            if (!Objects.equals(_outUnorderChunks, other.getOutUnorderChunks())) {
                return false;
            }
            if (!Objects.equals(_reasmUsrMsgs, other.getReasmUsrMsgs())) {
                return false;
            }
            if (!Objects.equals(_rtoInitial, other.getRtoInitial())) {
                return false;
            }
            if (!Objects.equals(_rtoMax, other.getRtoMax())) {
                return false;
            }
            if (!Objects.equals(_rtoMin, other.getRtoMin())) {
                return false;
            }
            if (!Objects.equals(_transportSctpAssoc, other.getTransportSctpAssoc())) {
                return false;
            }
            if (!Objects.equals(_valCookieLife, other.getValCookieLife())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TransportSctpImpl otherImpl = (TransportSctpImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TransportSctp [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_assocNumberOfEntries != null) {
                builder.append("_assocNumberOfEntries=");
                builder.append(_assocNumberOfEntries);
                builder.append(", ");
            }
            if (_checksumErrors != null) {
                builder.append("_checksumErrors=");
                builder.append(_checksumErrors);
                builder.append(", ");
            }
            if (_discontinuity != null) {
                builder.append("_discontinuity=");
                builder.append(_discontinuity);
                builder.append(", ");
            }
            if (_fragUsrMsgs != null) {
                builder.append("_fragUsrMsgs=");
                builder.append(_fragUsrMsgs);
                builder.append(", ");
            }
            if (_hbInterval != null) {
                builder.append("_hbInterval=");
                builder.append(_hbInterval);
                builder.append(", ");
            }
            if (_inCtrlChunks != null) {
                builder.append("_inCtrlChunks=");
                builder.append(_inCtrlChunks);
                builder.append(", ");
            }
            if (_inOrderChunks != null) {
                builder.append("_inOrderChunks=");
                builder.append(_inOrderChunks);
                builder.append(", ");
            }
            if (_inSctpPacks != null) {
                builder.append("_inSctpPacks=");
                builder.append(_inSctpPacks);
                builder.append(", ");
            }
            if (_inUnorderChunks != null) {
                builder.append("_inUnorderChunks=");
                builder.append(_inUnorderChunks);
                builder.append(", ");
            }
            if (_maxAssociationRetransmits != null) {
                builder.append("_maxAssociationRetransmits=");
                builder.append(_maxAssociationRetransmits);
                builder.append(", ");
            }
            if (_maxInitRetransmits != null) {
                builder.append("_maxInitRetransmits=");
                builder.append(_maxInitRetransmits);
                builder.append(", ");
            }
            if (_maxPathRetransmits != null) {
                builder.append("_maxPathRetransmits=");
                builder.append(_maxPathRetransmits);
                builder.append(", ");
            }
            if (_outCtrlChunks != null) {
                builder.append("_outCtrlChunks=");
                builder.append(_outCtrlChunks);
                builder.append(", ");
            }
            if (_outOfBlues != null) {
                builder.append("_outOfBlues=");
                builder.append(_outOfBlues);
                builder.append(", ");
            }
            if (_outOrderChunks != null) {
                builder.append("_outOrderChunks=");
                builder.append(_outOrderChunks);
                builder.append(", ");
            }
            if (_outSctpPacks != null) {
                builder.append("_outSctpPacks=");
                builder.append(_outSctpPacks);
                builder.append(", ");
            }
            if (_outUnorderChunks != null) {
                builder.append("_outUnorderChunks=");
                builder.append(_outUnorderChunks);
                builder.append(", ");
            }
            if (_reasmUsrMsgs != null) {
                builder.append("_reasmUsrMsgs=");
                builder.append(_reasmUsrMsgs);
                builder.append(", ");
            }
            if (_rtoInitial != null) {
                builder.append("_rtoInitial=");
                builder.append(_rtoInitial);
                builder.append(", ");
            }
            if (_rtoMax != null) {
                builder.append("_rtoMax=");
                builder.append(_rtoMax);
                builder.append(", ");
            }
            if (_rtoMin != null) {
                builder.append("_rtoMin=");
                builder.append(_rtoMin);
                builder.append(", ");
            }
            if (_transportSctpAssoc != null) {
                builder.append("_transportSctpAssoc=");
                builder.append(_transportSctpAssoc);
                builder.append(", ");
            }
            if (_valCookieLife != null) {
                builder.append("_valCookieLife=");
                builder.append(_valCookieLife);
                builder.append(", ");
            }
            if (_enable != null) {
                builder.append("_enable=");
                builder.append(_enable);
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
