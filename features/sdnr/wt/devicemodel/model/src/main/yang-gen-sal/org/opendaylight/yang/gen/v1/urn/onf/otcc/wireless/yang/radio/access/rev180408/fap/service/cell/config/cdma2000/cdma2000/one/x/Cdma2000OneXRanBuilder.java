package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborList;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanExtendedSystemParameters;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidtm;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan
 *
 */
public class Cdma2000OneXRanBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan> {

    private java.lang.Long _baseId;
    private Cdma2000OneXRanAccessParameters _cdma2000OneXRanAccessParameters;
    private Cdma2000OneXRanApidm _cdma2000OneXRanApidm;
    private Cdma2000OneXRanApidtm _cdma2000OneXRanApidtm;
    private Cdma2000OneXRanAppim _cdma2000OneXRanAppim;
    private Cdma2000OneXRanExtendedSystemParameters _cdma2000OneXRanExtendedSystemParameters;
    private Cdma2000OneXRanForwardPwrCtr _cdma2000OneXRanForwardPwrCtr;
    private Cdma2000OneXRanHardHandoff _cdma2000OneXRanHardHandoff;
    private List<Cdma2000OneXRanNeighborList> _cdma2000OneXRanNeighborList;
    private Cdma2000OneXRanNetworkListenModeConfig _cdma2000OneXRanNetworkListenModeConfig;
    private Cdma2000OneXRanPowerControl _cdma2000OneXRanPowerControl;
    private Cdma2000OneXRanRf _cdma2000OneXRanRf;
    private Cdma2000OneXRanSystemParameters _cdma2000OneXRanSystemParameters;
    private BigInteger _maxNeighborListEntries;
    private BigInteger _neighborListNumberOfEntries;
    private java.lang.Long _oneXSectorNid;
    private java.lang.Long _oneXSectorSid;
    private java.lang.Long _oneXpzid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanBuilder() {
    }
    public Cdma2000OneXRanBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG arg) {
        this._oneXSectorNid = arg.getOneXSectorNid();
        this._oneXSectorSid = arg.getOneXSectorSid();
        this._oneXpzid = arg.getOneXpzid();
        this._baseId = arg.getBaseId();
        this._maxNeighborListEntries = arg.getMaxNeighborListEntries();
        this._neighborListNumberOfEntries = arg.getNeighborListNumberOfEntries();
    }

    public Cdma2000OneXRanBuilder(Cdma2000OneXRan base) {
        this._baseId = base.getBaseId();
        this._cdma2000OneXRanAccessParameters = base.getCdma2000OneXRanAccessParameters();
        this._cdma2000OneXRanApidm = base.getCdma2000OneXRanApidm();
        this._cdma2000OneXRanApidtm = base.getCdma2000OneXRanApidtm();
        this._cdma2000OneXRanAppim = base.getCdma2000OneXRanAppim();
        this._cdma2000OneXRanExtendedSystemParameters = base.getCdma2000OneXRanExtendedSystemParameters();
        this._cdma2000OneXRanForwardPwrCtr = base.getCdma2000OneXRanForwardPwrCtr();
        this._cdma2000OneXRanHardHandoff = base.getCdma2000OneXRanHardHandoff();
        this._cdma2000OneXRanNeighborList = base.getCdma2000OneXRanNeighborList();
        this._cdma2000OneXRanNetworkListenModeConfig = base.getCdma2000OneXRanNetworkListenModeConfig();
        this._cdma2000OneXRanPowerControl = base.getCdma2000OneXRanPowerControl();
        this._cdma2000OneXRanRf = base.getCdma2000OneXRanRf();
        this._cdma2000OneXRanSystemParameters = base.getCdma2000OneXRanSystemParameters();
        this._maxNeighborListEntries = base.getMaxNeighborListEntries();
        this._neighborListNumberOfEntries = base.getNeighborListNumberOfEntries();
        this._oneXSectorNid = base.getOneXSectorNid();
        this._oneXSectorSid = base.getOneXSectorSid();
        this._oneXpzid = base.getOneXpzid();
        if (base instanceof Cdma2000OneXRanImpl) {
            Cdma2000OneXRanImpl impl = (Cdma2000OneXRanImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG) {
            this._oneXSectorNid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG)arg).getOneXSectorNid();
            this._oneXSectorSid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG)arg).getOneXSectorSid();
            this._oneXpzid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG)arg).getOneXpzid();
            this._baseId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG)arg).getBaseId();
            this._maxNeighborListEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG)arg).getMaxNeighborListEntries();
            this._neighborListNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG)arg).getNeighborListNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getBaseId() {
        return _baseId;
    }
    
    public Cdma2000OneXRanAccessParameters getCdma2000OneXRanAccessParameters() {
        return _cdma2000OneXRanAccessParameters;
    }
    
    public Cdma2000OneXRanApidm getCdma2000OneXRanApidm() {
        return _cdma2000OneXRanApidm;
    }
    
    public Cdma2000OneXRanApidtm getCdma2000OneXRanApidtm() {
        return _cdma2000OneXRanApidtm;
    }
    
    public Cdma2000OneXRanAppim getCdma2000OneXRanAppim() {
        return _cdma2000OneXRanAppim;
    }
    
    public Cdma2000OneXRanExtendedSystemParameters getCdma2000OneXRanExtendedSystemParameters() {
        return _cdma2000OneXRanExtendedSystemParameters;
    }
    
    public Cdma2000OneXRanForwardPwrCtr getCdma2000OneXRanForwardPwrCtr() {
        return _cdma2000OneXRanForwardPwrCtr;
    }
    
    public Cdma2000OneXRanHardHandoff getCdma2000OneXRanHardHandoff() {
        return _cdma2000OneXRanHardHandoff;
    }
    
    public List<Cdma2000OneXRanNeighborList> getCdma2000OneXRanNeighborList() {
        return _cdma2000OneXRanNeighborList;
    }
    
    public Cdma2000OneXRanNetworkListenModeConfig getCdma2000OneXRanNetworkListenModeConfig() {
        return _cdma2000OneXRanNetworkListenModeConfig;
    }
    
    public Cdma2000OneXRanPowerControl getCdma2000OneXRanPowerControl() {
        return _cdma2000OneXRanPowerControl;
    }
    
    public Cdma2000OneXRanRf getCdma2000OneXRanRf() {
        return _cdma2000OneXRanRf;
    }
    
    public Cdma2000OneXRanSystemParameters getCdma2000OneXRanSystemParameters() {
        return _cdma2000OneXRanSystemParameters;
    }
    
    public BigInteger getMaxNeighborListEntries() {
        return _maxNeighborListEntries;
    }
    
    public BigInteger getNeighborListNumberOfEntries() {
        return _neighborListNumberOfEntries;
    }
    
    public java.lang.Long getOneXSectorNid() {
        return _oneXSectorNid;
    }
    
    public java.lang.Long getOneXSectorSid() {
        return _oneXSectorSid;
    }
    
    public java.lang.Long getOneXpzid() {
        return _oneXpzid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public Cdma2000OneXRanBuilder setBaseId(final java.lang.Long value) {
        this._baseId = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanAccessParameters(final Cdma2000OneXRanAccessParameters value) {
        this._cdma2000OneXRanAccessParameters = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanApidm(final Cdma2000OneXRanApidm value) {
        this._cdma2000OneXRanApidm = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanApidtm(final Cdma2000OneXRanApidtm value) {
        this._cdma2000OneXRanApidtm = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanAppim(final Cdma2000OneXRanAppim value) {
        this._cdma2000OneXRanAppim = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanExtendedSystemParameters(final Cdma2000OneXRanExtendedSystemParameters value) {
        this._cdma2000OneXRanExtendedSystemParameters = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanForwardPwrCtr(final Cdma2000OneXRanForwardPwrCtr value) {
        this._cdma2000OneXRanForwardPwrCtr = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanHardHandoff(final Cdma2000OneXRanHardHandoff value) {
        this._cdma2000OneXRanHardHandoff = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanNeighborList(final List<Cdma2000OneXRanNeighborList> value) {
        this._cdma2000OneXRanNeighborList = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanNetworkListenModeConfig(final Cdma2000OneXRanNetworkListenModeConfig value) {
        this._cdma2000OneXRanNetworkListenModeConfig = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanPowerControl(final Cdma2000OneXRanPowerControl value) {
        this._cdma2000OneXRanPowerControl = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanRf(final Cdma2000OneXRanRf value) {
        this._cdma2000OneXRanRf = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setCdma2000OneXRanSystemParameters(final Cdma2000OneXRanSystemParameters value) {
        this._cdma2000OneXRanSystemParameters = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXNEIGHBORLISTENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXNEIGHBORLISTENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxNeighborListEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXNEIGHBORLISTENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXNEIGHBORLISTENTRIESRANGE_RANGES)));
     }
    
    public Cdma2000OneXRanBuilder setMaxNeighborListEntries(final BigInteger value) {
    if (value != null) {
        checkMaxNeighborListEntriesRange(value);
    }
        this._maxNeighborListEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKNEIGHBORLISTNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKNEIGHBORLISTNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkNeighborListNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKNEIGHBORLISTNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKNEIGHBORLISTNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public Cdma2000OneXRanBuilder setNeighborListNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkNeighborListNumberOfEntriesRange(value);
    }
        this._neighborListNumberOfEntries = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setOneXSectorNid(final java.lang.Long value) {
        this._oneXSectorNid = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setOneXSectorSid(final java.lang.Long value) {
        this._oneXSectorSid = value;
        return this;
    }
    
     
    public Cdma2000OneXRanBuilder setOneXpzid(final java.lang.Long value) {
        this._oneXpzid = value;
        return this;
    }
    
    public Cdma2000OneXRanBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRan build() {
        return new Cdma2000OneXRanImpl(this);
    }

    private static final class Cdma2000OneXRanImpl implements Cdma2000OneXRan {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan.class;
        }

        private final java.lang.Long _baseId;
        private final Cdma2000OneXRanAccessParameters _cdma2000OneXRanAccessParameters;
        private final Cdma2000OneXRanApidm _cdma2000OneXRanApidm;
        private final Cdma2000OneXRanApidtm _cdma2000OneXRanApidtm;
        private final Cdma2000OneXRanAppim _cdma2000OneXRanAppim;
        private final Cdma2000OneXRanExtendedSystemParameters _cdma2000OneXRanExtendedSystemParameters;
        private final Cdma2000OneXRanForwardPwrCtr _cdma2000OneXRanForwardPwrCtr;
        private final Cdma2000OneXRanHardHandoff _cdma2000OneXRanHardHandoff;
        private final List<Cdma2000OneXRanNeighborList> _cdma2000OneXRanNeighborList;
        private final Cdma2000OneXRanNetworkListenModeConfig _cdma2000OneXRanNetworkListenModeConfig;
        private final Cdma2000OneXRanPowerControl _cdma2000OneXRanPowerControl;
        private final Cdma2000OneXRanRf _cdma2000OneXRanRf;
        private final Cdma2000OneXRanSystemParameters _cdma2000OneXRanSystemParameters;
        private final BigInteger _maxNeighborListEntries;
        private final BigInteger _neighborListNumberOfEntries;
        private final java.lang.Long _oneXSectorNid;
        private final java.lang.Long _oneXSectorSid;
        private final java.lang.Long _oneXpzid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanImpl(Cdma2000OneXRanBuilder base) {
            this._baseId = base.getBaseId();
            this._cdma2000OneXRanAccessParameters = base.getCdma2000OneXRanAccessParameters();
            this._cdma2000OneXRanApidm = base.getCdma2000OneXRanApidm();
            this._cdma2000OneXRanApidtm = base.getCdma2000OneXRanApidtm();
            this._cdma2000OneXRanAppim = base.getCdma2000OneXRanAppim();
            this._cdma2000OneXRanExtendedSystemParameters = base.getCdma2000OneXRanExtendedSystemParameters();
            this._cdma2000OneXRanForwardPwrCtr = base.getCdma2000OneXRanForwardPwrCtr();
            this._cdma2000OneXRanHardHandoff = base.getCdma2000OneXRanHardHandoff();
            this._cdma2000OneXRanNeighborList = base.getCdma2000OneXRanNeighborList();
            this._cdma2000OneXRanNetworkListenModeConfig = base.getCdma2000OneXRanNetworkListenModeConfig();
            this._cdma2000OneXRanPowerControl = base.getCdma2000OneXRanPowerControl();
            this._cdma2000OneXRanRf = base.getCdma2000OneXRanRf();
            this._cdma2000OneXRanSystemParameters = base.getCdma2000OneXRanSystemParameters();
            this._maxNeighborListEntries = base.getMaxNeighborListEntries();
            this._neighborListNumberOfEntries = base.getNeighborListNumberOfEntries();
            this._oneXSectorNid = base.getOneXSectorNid();
            this._oneXSectorSid = base.getOneXSectorSid();
            this._oneXpzid = base.getOneXpzid();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getBaseId() {
            return _baseId;
        }
        
        @Override
        public Cdma2000OneXRanAccessParameters getCdma2000OneXRanAccessParameters() {
            return _cdma2000OneXRanAccessParameters;
        }
        
        @Override
        public Cdma2000OneXRanApidm getCdma2000OneXRanApidm() {
            return _cdma2000OneXRanApidm;
        }
        
        @Override
        public Cdma2000OneXRanApidtm getCdma2000OneXRanApidtm() {
            return _cdma2000OneXRanApidtm;
        }
        
        @Override
        public Cdma2000OneXRanAppim getCdma2000OneXRanAppim() {
            return _cdma2000OneXRanAppim;
        }
        
        @Override
        public Cdma2000OneXRanExtendedSystemParameters getCdma2000OneXRanExtendedSystemParameters() {
            return _cdma2000OneXRanExtendedSystemParameters;
        }
        
        @Override
        public Cdma2000OneXRanForwardPwrCtr getCdma2000OneXRanForwardPwrCtr() {
            return _cdma2000OneXRanForwardPwrCtr;
        }
        
        @Override
        public Cdma2000OneXRanHardHandoff getCdma2000OneXRanHardHandoff() {
            return _cdma2000OneXRanHardHandoff;
        }
        
        @Override
        public List<Cdma2000OneXRanNeighborList> getCdma2000OneXRanNeighborList() {
            return _cdma2000OneXRanNeighborList;
        }
        
        @Override
        public Cdma2000OneXRanNetworkListenModeConfig getCdma2000OneXRanNetworkListenModeConfig() {
            return _cdma2000OneXRanNetworkListenModeConfig;
        }
        
        @Override
        public Cdma2000OneXRanPowerControl getCdma2000OneXRanPowerControl() {
            return _cdma2000OneXRanPowerControl;
        }
        
        @Override
        public Cdma2000OneXRanRf getCdma2000OneXRanRf() {
            return _cdma2000OneXRanRf;
        }
        
        @Override
        public Cdma2000OneXRanSystemParameters getCdma2000OneXRanSystemParameters() {
            return _cdma2000OneXRanSystemParameters;
        }
        
        @Override
        public BigInteger getMaxNeighborListEntries() {
            return _maxNeighborListEntries;
        }
        
        @Override
        public BigInteger getNeighborListNumberOfEntries() {
            return _neighborListNumberOfEntries;
        }
        
        @Override
        public java.lang.Long getOneXSectorNid() {
            return _oneXSectorNid;
        }
        
        @Override
        public java.lang.Long getOneXSectorSid() {
            return _oneXSectorSid;
        }
        
        @Override
        public java.lang.Long getOneXpzid() {
            return _oneXpzid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_baseId);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanAccessParameters);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanApidm);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanApidtm);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanAppim);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanExtendedSystemParameters);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanForwardPwrCtr);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanHardHandoff);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanNeighborList);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanNetworkListenModeConfig);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanPowerControl);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanRf);
            result = prime * result + Objects.hashCode(_cdma2000OneXRanSystemParameters);
            result = prime * result + Objects.hashCode(_maxNeighborListEntries);
            result = prime * result + Objects.hashCode(_neighborListNumberOfEntries);
            result = prime * result + Objects.hashCode(_oneXSectorNid);
            result = prime * result + Objects.hashCode(_oneXSectorSid);
            result = prime * result + Objects.hashCode(_oneXpzid);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan)obj;
            if (!Objects.equals(_baseId, other.getBaseId())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanAccessParameters, other.getCdma2000OneXRanAccessParameters())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanApidm, other.getCdma2000OneXRanApidm())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanApidtm, other.getCdma2000OneXRanApidtm())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanAppim, other.getCdma2000OneXRanAppim())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanExtendedSystemParameters, other.getCdma2000OneXRanExtendedSystemParameters())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanForwardPwrCtr, other.getCdma2000OneXRanForwardPwrCtr())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanHardHandoff, other.getCdma2000OneXRanHardHandoff())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanNeighborList, other.getCdma2000OneXRanNeighborList())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanNetworkListenModeConfig, other.getCdma2000OneXRanNetworkListenModeConfig())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanPowerControl, other.getCdma2000OneXRanPowerControl())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanRf, other.getCdma2000OneXRanRf())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXRanSystemParameters, other.getCdma2000OneXRanSystemParameters())) {
                return false;
            }
            if (!Objects.equals(_maxNeighborListEntries, other.getMaxNeighborListEntries())) {
                return false;
            }
            if (!Objects.equals(_neighborListNumberOfEntries, other.getNeighborListNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_oneXSectorNid, other.getOneXSectorNid())) {
                return false;
            }
            if (!Objects.equals(_oneXSectorSid, other.getOneXSectorSid())) {
                return false;
            }
            if (!Objects.equals(_oneXpzid, other.getOneXpzid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanImpl otherImpl = (Cdma2000OneXRanImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRan [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_baseId != null) {
                builder.append("_baseId=");
                builder.append(_baseId);
                builder.append(", ");
            }
            if (_cdma2000OneXRanAccessParameters != null) {
                builder.append("_cdma2000OneXRanAccessParameters=");
                builder.append(_cdma2000OneXRanAccessParameters);
                builder.append(", ");
            }
            if (_cdma2000OneXRanApidm != null) {
                builder.append("_cdma2000OneXRanApidm=");
                builder.append(_cdma2000OneXRanApidm);
                builder.append(", ");
            }
            if (_cdma2000OneXRanApidtm != null) {
                builder.append("_cdma2000OneXRanApidtm=");
                builder.append(_cdma2000OneXRanApidtm);
                builder.append(", ");
            }
            if (_cdma2000OneXRanAppim != null) {
                builder.append("_cdma2000OneXRanAppim=");
                builder.append(_cdma2000OneXRanAppim);
                builder.append(", ");
            }
            if (_cdma2000OneXRanExtendedSystemParameters != null) {
                builder.append("_cdma2000OneXRanExtendedSystemParameters=");
                builder.append(_cdma2000OneXRanExtendedSystemParameters);
                builder.append(", ");
            }
            if (_cdma2000OneXRanForwardPwrCtr != null) {
                builder.append("_cdma2000OneXRanForwardPwrCtr=");
                builder.append(_cdma2000OneXRanForwardPwrCtr);
                builder.append(", ");
            }
            if (_cdma2000OneXRanHardHandoff != null) {
                builder.append("_cdma2000OneXRanHardHandoff=");
                builder.append(_cdma2000OneXRanHardHandoff);
                builder.append(", ");
            }
            if (_cdma2000OneXRanNeighborList != null) {
                builder.append("_cdma2000OneXRanNeighborList=");
                builder.append(_cdma2000OneXRanNeighborList);
                builder.append(", ");
            }
            if (_cdma2000OneXRanNetworkListenModeConfig != null) {
                builder.append("_cdma2000OneXRanNetworkListenModeConfig=");
                builder.append(_cdma2000OneXRanNetworkListenModeConfig);
                builder.append(", ");
            }
            if (_cdma2000OneXRanPowerControl != null) {
                builder.append("_cdma2000OneXRanPowerControl=");
                builder.append(_cdma2000OneXRanPowerControl);
                builder.append(", ");
            }
            if (_cdma2000OneXRanRf != null) {
                builder.append("_cdma2000OneXRanRf=");
                builder.append(_cdma2000OneXRanRf);
                builder.append(", ");
            }
            if (_cdma2000OneXRanSystemParameters != null) {
                builder.append("_cdma2000OneXRanSystemParameters=");
                builder.append(_cdma2000OneXRanSystemParameters);
                builder.append(", ");
            }
            if (_maxNeighborListEntries != null) {
                builder.append("_maxNeighborListEntries=");
                builder.append(_maxNeighborListEntries);
                builder.append(", ");
            }
            if (_neighborListNumberOfEntries != null) {
                builder.append("_neighborListNumberOfEntries=");
                builder.append(_neighborListNumberOfEntries);
                builder.append(", ");
            }
            if (_oneXSectorNid != null) {
                builder.append("_oneXSectorNid=");
                builder.append(_oneXSectorNid);
                builder.append(", ");
            }
            if (_oneXSectorSid != null) {
                builder.append("_oneXSectorSid=");
                builder.append(_oneXSectorSid);
                builder.append(", ");
            }
            if (_oneXpzid != null) {
                builder.append("_oneXpzid=");
                builder.append(_oneXpzid);
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
