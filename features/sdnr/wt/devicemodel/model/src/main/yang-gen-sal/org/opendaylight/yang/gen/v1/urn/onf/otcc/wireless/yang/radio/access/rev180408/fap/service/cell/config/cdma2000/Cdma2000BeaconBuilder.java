package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG.BeaconOperStatus;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG.BeaconAdminStatus;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconList;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconBeaconList;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon
 *
 */
public class Cdma2000BeaconBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon> {

    private BeaconAdminStatus _beaconAdminStatus;
    private BigInteger _beaconListNumberOfEntries;
    private BeaconOperStatus _beaconOperStatus;
    private java.lang.Long _beaconPchPwrPercentage;
    private java.lang.Long _beaconPilotPwrPercentage;
    private java.lang.Long _beaconSyncPwrPercentage;
    private List<Cdma2000BeaconBeaconList> _cdma2000BeaconBeaconList;
    private List<Cdma2000BeaconHrpdBeaconList> _cdma2000BeaconHrpdBeaconList;
    private BigInteger _hrpdBeaconListNumberOfEntries;
    private BigInteger _maxBeaconListEntries;
    private BigInteger _maxHrpdBeaconListEntries;
    private java.lang.String _maxHrpdBeaconTxPower;
    private java.lang.Long _maxHrpdBeaconTxPowerInUse;
    private java.lang.String _maxfapBeaconTxPower;
    private java.lang.Long _maxfapBeaconTxPowerInUse;
    private java.lang.Integer _period;
    private java.lang.Boolean _hrpdBeaconEnable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>> augmentation = Collections.emptyMap();

    public Cdma2000BeaconBuilder() {
    }
    public Cdma2000BeaconBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG arg) {
        this._beaconAdminStatus = arg.getBeaconAdminStatus();
        this._beaconOperStatus = arg.getBeaconOperStatus();
        this._hrpdBeaconEnable = arg.isHrpdBeaconEnable();
        this._period = arg.getPeriod();
        this._maxfapBeaconTxPower = arg.getMaxfapBeaconTxPower();
        this._maxfapBeaconTxPowerInUse = arg.getMaxfapBeaconTxPowerInUse();
        this._beaconPchPwrPercentage = arg.getBeaconPchPwrPercentage();
        this._maxHrpdBeaconTxPower = arg.getMaxHrpdBeaconTxPower();
        this._maxHrpdBeaconTxPowerInUse = arg.getMaxHrpdBeaconTxPowerInUse();
        this._beaconPilotPwrPercentage = arg.getBeaconPilotPwrPercentage();
        this._beaconSyncPwrPercentage = arg.getBeaconSyncPwrPercentage();
        this._maxBeaconListEntries = arg.getMaxBeaconListEntries();
        this._beaconListNumberOfEntries = arg.getBeaconListNumberOfEntries();
        this._maxHrpdBeaconListEntries = arg.getMaxHrpdBeaconListEntries();
        this._hrpdBeaconListNumberOfEntries = arg.getHrpdBeaconListNumberOfEntries();
    }

    public Cdma2000BeaconBuilder(Cdma2000Beacon base) {
        this._beaconAdminStatus = base.getBeaconAdminStatus();
        this._beaconListNumberOfEntries = base.getBeaconListNumberOfEntries();
        this._beaconOperStatus = base.getBeaconOperStatus();
        this._beaconPchPwrPercentage = base.getBeaconPchPwrPercentage();
        this._beaconPilotPwrPercentage = base.getBeaconPilotPwrPercentage();
        this._beaconSyncPwrPercentage = base.getBeaconSyncPwrPercentage();
        this._cdma2000BeaconBeaconList = base.getCdma2000BeaconBeaconList();
        this._cdma2000BeaconHrpdBeaconList = base.getCdma2000BeaconHrpdBeaconList();
        this._hrpdBeaconListNumberOfEntries = base.getHrpdBeaconListNumberOfEntries();
        this._maxBeaconListEntries = base.getMaxBeaconListEntries();
        this._maxHrpdBeaconListEntries = base.getMaxHrpdBeaconListEntries();
        this._maxHrpdBeaconTxPower = base.getMaxHrpdBeaconTxPower();
        this._maxHrpdBeaconTxPowerInUse = base.getMaxHrpdBeaconTxPowerInUse();
        this._maxfapBeaconTxPower = base.getMaxfapBeaconTxPower();
        this._maxfapBeaconTxPowerInUse = base.getMaxfapBeaconTxPowerInUse();
        this._period = base.getPeriod();
        this._hrpdBeaconEnable = base.isHrpdBeaconEnable();
        if (base instanceof Cdma2000BeaconImpl) {
            Cdma2000BeaconImpl impl = (Cdma2000BeaconImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG) {
            this._beaconAdminStatus = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getBeaconAdminStatus();
            this._beaconOperStatus = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getBeaconOperStatus();
            this._hrpdBeaconEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).isHrpdBeaconEnable();
            this._period = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getPeriod();
            this._maxfapBeaconTxPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getMaxfapBeaconTxPower();
            this._maxfapBeaconTxPowerInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getMaxfapBeaconTxPowerInUse();
            this._beaconPchPwrPercentage = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getBeaconPchPwrPercentage();
            this._maxHrpdBeaconTxPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getMaxHrpdBeaconTxPower();
            this._maxHrpdBeaconTxPowerInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getMaxHrpdBeaconTxPowerInUse();
            this._beaconPilotPwrPercentage = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getBeaconPilotPwrPercentage();
            this._beaconSyncPwrPercentage = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getBeaconSyncPwrPercentage();
            this._maxBeaconListEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getMaxBeaconListEntries();
            this._beaconListNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getBeaconListNumberOfEntries();
            this._maxHrpdBeaconListEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getMaxHrpdBeaconListEntries();
            this._hrpdBeaconListNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG)arg).getHrpdBeaconListNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG] \n" +
              "but was: " + arg
            );
        }
    }

    public BeaconAdminStatus getBeaconAdminStatus() {
        return _beaconAdminStatus;
    }
    
    public BigInteger getBeaconListNumberOfEntries() {
        return _beaconListNumberOfEntries;
    }
    
    public BeaconOperStatus getBeaconOperStatus() {
        return _beaconOperStatus;
    }
    
    public java.lang.Long getBeaconPchPwrPercentage() {
        return _beaconPchPwrPercentage;
    }
    
    public java.lang.Long getBeaconPilotPwrPercentage() {
        return _beaconPilotPwrPercentage;
    }
    
    public java.lang.Long getBeaconSyncPwrPercentage() {
        return _beaconSyncPwrPercentage;
    }
    
    public List<Cdma2000BeaconBeaconList> getCdma2000BeaconBeaconList() {
        return _cdma2000BeaconBeaconList;
    }
    
    public List<Cdma2000BeaconHrpdBeaconList> getCdma2000BeaconHrpdBeaconList() {
        return _cdma2000BeaconHrpdBeaconList;
    }
    
    public BigInteger getHrpdBeaconListNumberOfEntries() {
        return _hrpdBeaconListNumberOfEntries;
    }
    
    public BigInteger getMaxBeaconListEntries() {
        return _maxBeaconListEntries;
    }
    
    public BigInteger getMaxHrpdBeaconListEntries() {
        return _maxHrpdBeaconListEntries;
    }
    
    public java.lang.String getMaxHrpdBeaconTxPower() {
        return _maxHrpdBeaconTxPower;
    }
    
    public java.lang.Long getMaxHrpdBeaconTxPowerInUse() {
        return _maxHrpdBeaconTxPowerInUse;
    }
    
    public java.lang.String getMaxfapBeaconTxPower() {
        return _maxfapBeaconTxPower;
    }
    
    public java.lang.Long getMaxfapBeaconTxPowerInUse() {
        return _maxfapBeaconTxPowerInUse;
    }
    
    public java.lang.Integer getPeriod() {
        return _period;
    }
    
    public java.lang.Boolean isHrpdBeaconEnable() {
        return _hrpdBeaconEnable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public Cdma2000BeaconBuilder setBeaconAdminStatus(final BeaconAdminStatus value) {
        this._beaconAdminStatus = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKBEACONLISTNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKBEACONLISTNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkBeaconListNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKBEACONLISTNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKBEACONLISTNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public Cdma2000BeaconBuilder setBeaconListNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkBeaconListNumberOfEntriesRange(value);
    }
        this._beaconListNumberOfEntries = value;
        return this;
    }
    
     
    public Cdma2000BeaconBuilder setBeaconOperStatus(final BeaconOperStatus value) {
        this._beaconOperStatus = value;
        return this;
    }
    
     
    public Cdma2000BeaconBuilder setBeaconPchPwrPercentage(final java.lang.Long value) {
        this._beaconPchPwrPercentage = value;
        return this;
    }
    
     
    public Cdma2000BeaconBuilder setBeaconPilotPwrPercentage(final java.lang.Long value) {
        this._beaconPilotPwrPercentage = value;
        return this;
    }
    
     
    public Cdma2000BeaconBuilder setBeaconSyncPwrPercentage(final java.lang.Long value) {
        this._beaconSyncPwrPercentage = value;
        return this;
    }
    
     
    public Cdma2000BeaconBuilder setCdma2000BeaconBeaconList(final List<Cdma2000BeaconBeaconList> value) {
        this._cdma2000BeaconBeaconList = value;
        return this;
    }
    
     
    public Cdma2000BeaconBuilder setCdma2000BeaconHrpdBeaconList(final List<Cdma2000BeaconHrpdBeaconList> value) {
        this._cdma2000BeaconHrpdBeaconList = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKHRPDBEACONLISTNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKHRPDBEACONLISTNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkHrpdBeaconListNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKHRPDBEACONLISTNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKHRPDBEACONLISTNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public Cdma2000BeaconBuilder setHrpdBeaconListNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkHrpdBeaconListNumberOfEntriesRange(value);
    }
        this._hrpdBeaconListNumberOfEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXBEACONLISTENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXBEACONLISTENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxBeaconListEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXBEACONLISTENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXBEACONLISTENTRIESRANGE_RANGES)));
     }
    
    public Cdma2000BeaconBuilder setMaxBeaconListEntries(final BigInteger value) {
    if (value != null) {
        checkMaxBeaconListEntriesRange(value);
    }
        this._maxBeaconListEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXHRPDBEACONLISTENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXHRPDBEACONLISTENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxHrpdBeaconListEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXHRPDBEACONLISTENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXHRPDBEACONLISTENTRIESRANGE_RANGES)));
     }
    
    public Cdma2000BeaconBuilder setMaxHrpdBeaconListEntries(final BigInteger value) {
    if (value != null) {
        checkMaxHrpdBeaconListEntriesRange(value);
    }
        this._maxHrpdBeaconListEntries = value;
        return this;
    }
    
     
     private static void check_maxHrpdBeaconTxPowerLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public Cdma2000BeaconBuilder setMaxHrpdBeaconTxPower(final java.lang.String value) {
    if (value != null) {
        check_maxHrpdBeaconTxPowerLength(value);
    }
        this._maxHrpdBeaconTxPower = value;
        return this;
    }
    
     
    public Cdma2000BeaconBuilder setMaxHrpdBeaconTxPowerInUse(final java.lang.Long value) {
        this._maxHrpdBeaconTxPowerInUse = value;
        return this;
    }
    
     
     private static void check_maxfapBeaconTxPowerLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public Cdma2000BeaconBuilder setMaxfapBeaconTxPower(final java.lang.String value) {
    if (value != null) {
        check_maxfapBeaconTxPowerLength(value);
    }
        this._maxfapBeaconTxPower = value;
        return this;
    }
    
     
    public Cdma2000BeaconBuilder setMaxfapBeaconTxPowerInUse(final java.lang.Long value) {
        this._maxfapBeaconTxPowerInUse = value;
        return this;
    }
    
     
     private static void checkPeriodRange(final int value) {
         if (value >= 0 && value <= 32767) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..32767]].", value));
     }
    
    public Cdma2000BeaconBuilder setPeriod(final java.lang.Integer value) {
    if (value != null) {
        checkPeriodRange(value);
    }
        this._period = value;
        return this;
    }
    
     
    public Cdma2000BeaconBuilder setHrpdBeaconEnable(final java.lang.Boolean value) {
        this._hrpdBeaconEnable = value;
        return this;
    }
    
    public Cdma2000BeaconBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000BeaconBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000Beacon build() {
        return new Cdma2000BeaconImpl(this);
    }

    private static final class Cdma2000BeaconImpl implements Cdma2000Beacon {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon.class;
        }

        private final BeaconAdminStatus _beaconAdminStatus;
        private final BigInteger _beaconListNumberOfEntries;
        private final BeaconOperStatus _beaconOperStatus;
        private final java.lang.Long _beaconPchPwrPercentage;
        private final java.lang.Long _beaconPilotPwrPercentage;
        private final java.lang.Long _beaconSyncPwrPercentage;
        private final List<Cdma2000BeaconBeaconList> _cdma2000BeaconBeaconList;
        private final List<Cdma2000BeaconHrpdBeaconList> _cdma2000BeaconHrpdBeaconList;
        private final BigInteger _hrpdBeaconListNumberOfEntries;
        private final BigInteger _maxBeaconListEntries;
        private final BigInteger _maxHrpdBeaconListEntries;
        private final java.lang.String _maxHrpdBeaconTxPower;
        private final java.lang.Long _maxHrpdBeaconTxPowerInUse;
        private final java.lang.String _maxfapBeaconTxPower;
        private final java.lang.Long _maxfapBeaconTxPowerInUse;
        private final java.lang.Integer _period;
        private final java.lang.Boolean _hrpdBeaconEnable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>> augmentation = Collections.emptyMap();

        private Cdma2000BeaconImpl(Cdma2000BeaconBuilder base) {
            this._beaconAdminStatus = base.getBeaconAdminStatus();
            this._beaconListNumberOfEntries = base.getBeaconListNumberOfEntries();
            this._beaconOperStatus = base.getBeaconOperStatus();
            this._beaconPchPwrPercentage = base.getBeaconPchPwrPercentage();
            this._beaconPilotPwrPercentage = base.getBeaconPilotPwrPercentage();
            this._beaconSyncPwrPercentage = base.getBeaconSyncPwrPercentage();
            this._cdma2000BeaconBeaconList = base.getCdma2000BeaconBeaconList();
            this._cdma2000BeaconHrpdBeaconList = base.getCdma2000BeaconHrpdBeaconList();
            this._hrpdBeaconListNumberOfEntries = base.getHrpdBeaconListNumberOfEntries();
            this._maxBeaconListEntries = base.getMaxBeaconListEntries();
            this._maxHrpdBeaconListEntries = base.getMaxHrpdBeaconListEntries();
            this._maxHrpdBeaconTxPower = base.getMaxHrpdBeaconTxPower();
            this._maxHrpdBeaconTxPowerInUse = base.getMaxHrpdBeaconTxPowerInUse();
            this._maxfapBeaconTxPower = base.getMaxfapBeaconTxPower();
            this._maxfapBeaconTxPowerInUse = base.getMaxfapBeaconTxPowerInUse();
            this._period = base.getPeriod();
            this._hrpdBeaconEnable = base.isHrpdBeaconEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BeaconAdminStatus getBeaconAdminStatus() {
            return _beaconAdminStatus;
        }
        
        @Override
        public BigInteger getBeaconListNumberOfEntries() {
            return _beaconListNumberOfEntries;
        }
        
        @Override
        public BeaconOperStatus getBeaconOperStatus() {
            return _beaconOperStatus;
        }
        
        @Override
        public java.lang.Long getBeaconPchPwrPercentage() {
            return _beaconPchPwrPercentage;
        }
        
        @Override
        public java.lang.Long getBeaconPilotPwrPercentage() {
            return _beaconPilotPwrPercentage;
        }
        
        @Override
        public java.lang.Long getBeaconSyncPwrPercentage() {
            return _beaconSyncPwrPercentage;
        }
        
        @Override
        public List<Cdma2000BeaconBeaconList> getCdma2000BeaconBeaconList() {
            return _cdma2000BeaconBeaconList;
        }
        
        @Override
        public List<Cdma2000BeaconHrpdBeaconList> getCdma2000BeaconHrpdBeaconList() {
            return _cdma2000BeaconHrpdBeaconList;
        }
        
        @Override
        public BigInteger getHrpdBeaconListNumberOfEntries() {
            return _hrpdBeaconListNumberOfEntries;
        }
        
        @Override
        public BigInteger getMaxBeaconListEntries() {
            return _maxBeaconListEntries;
        }
        
        @Override
        public BigInteger getMaxHrpdBeaconListEntries() {
            return _maxHrpdBeaconListEntries;
        }
        
        @Override
        public java.lang.String getMaxHrpdBeaconTxPower() {
            return _maxHrpdBeaconTxPower;
        }
        
        @Override
        public java.lang.Long getMaxHrpdBeaconTxPowerInUse() {
            return _maxHrpdBeaconTxPowerInUse;
        }
        
        @Override
        public java.lang.String getMaxfapBeaconTxPower() {
            return _maxfapBeaconTxPower;
        }
        
        @Override
        public java.lang.Long getMaxfapBeaconTxPowerInUse() {
            return _maxfapBeaconTxPowerInUse;
        }
        
        @Override
        public java.lang.Integer getPeriod() {
            return _period;
        }
        
        @Override
        public java.lang.Boolean isHrpdBeaconEnable() {
            return _hrpdBeaconEnable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_beaconAdminStatus);
            result = prime * result + Objects.hashCode(_beaconListNumberOfEntries);
            result = prime * result + Objects.hashCode(_beaconOperStatus);
            result = prime * result + Objects.hashCode(_beaconPchPwrPercentage);
            result = prime * result + Objects.hashCode(_beaconPilotPwrPercentage);
            result = prime * result + Objects.hashCode(_beaconSyncPwrPercentage);
            result = prime * result + Objects.hashCode(_cdma2000BeaconBeaconList);
            result = prime * result + Objects.hashCode(_cdma2000BeaconHrpdBeaconList);
            result = prime * result + Objects.hashCode(_hrpdBeaconListNumberOfEntries);
            result = prime * result + Objects.hashCode(_maxBeaconListEntries);
            result = prime * result + Objects.hashCode(_maxHrpdBeaconListEntries);
            result = prime * result + Objects.hashCode(_maxHrpdBeaconTxPower);
            result = prime * result + Objects.hashCode(_maxHrpdBeaconTxPowerInUse);
            result = prime * result + Objects.hashCode(_maxfapBeaconTxPower);
            result = prime * result + Objects.hashCode(_maxfapBeaconTxPowerInUse);
            result = prime * result + Objects.hashCode(_period);
            result = prime * result + Objects.hashCode(_hrpdBeaconEnable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon)obj;
            if (!Objects.equals(_beaconAdminStatus, other.getBeaconAdminStatus())) {
                return false;
            }
            if (!Objects.equals(_beaconListNumberOfEntries, other.getBeaconListNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_beaconOperStatus, other.getBeaconOperStatus())) {
                return false;
            }
            if (!Objects.equals(_beaconPchPwrPercentage, other.getBeaconPchPwrPercentage())) {
                return false;
            }
            if (!Objects.equals(_beaconPilotPwrPercentage, other.getBeaconPilotPwrPercentage())) {
                return false;
            }
            if (!Objects.equals(_beaconSyncPwrPercentage, other.getBeaconSyncPwrPercentage())) {
                return false;
            }
            if (!Objects.equals(_cdma2000BeaconBeaconList, other.getCdma2000BeaconBeaconList())) {
                return false;
            }
            if (!Objects.equals(_cdma2000BeaconHrpdBeaconList, other.getCdma2000BeaconHrpdBeaconList())) {
                return false;
            }
            if (!Objects.equals(_hrpdBeaconListNumberOfEntries, other.getHrpdBeaconListNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_maxBeaconListEntries, other.getMaxBeaconListEntries())) {
                return false;
            }
            if (!Objects.equals(_maxHrpdBeaconListEntries, other.getMaxHrpdBeaconListEntries())) {
                return false;
            }
            if (!Objects.equals(_maxHrpdBeaconTxPower, other.getMaxHrpdBeaconTxPower())) {
                return false;
            }
            if (!Objects.equals(_maxHrpdBeaconTxPowerInUse, other.getMaxHrpdBeaconTxPowerInUse())) {
                return false;
            }
            if (!Objects.equals(_maxfapBeaconTxPower, other.getMaxfapBeaconTxPower())) {
                return false;
            }
            if (!Objects.equals(_maxfapBeaconTxPowerInUse, other.getMaxfapBeaconTxPowerInUse())) {
                return false;
            }
            if (!Objects.equals(_period, other.getPeriod())) {
                return false;
            }
            if (!Objects.equals(_hrpdBeaconEnable, other.isHrpdBeaconEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000BeaconImpl otherImpl = (Cdma2000BeaconImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Beacon>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000Beacon [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_beaconAdminStatus != null) {
                builder.append("_beaconAdminStatus=");
                builder.append(_beaconAdminStatus);
                builder.append(", ");
            }
            if (_beaconListNumberOfEntries != null) {
                builder.append("_beaconListNumberOfEntries=");
                builder.append(_beaconListNumberOfEntries);
                builder.append(", ");
            }
            if (_beaconOperStatus != null) {
                builder.append("_beaconOperStatus=");
                builder.append(_beaconOperStatus);
                builder.append(", ");
            }
            if (_beaconPchPwrPercentage != null) {
                builder.append("_beaconPchPwrPercentage=");
                builder.append(_beaconPchPwrPercentage);
                builder.append(", ");
            }
            if (_beaconPilotPwrPercentage != null) {
                builder.append("_beaconPilotPwrPercentage=");
                builder.append(_beaconPilotPwrPercentage);
                builder.append(", ");
            }
            if (_beaconSyncPwrPercentage != null) {
                builder.append("_beaconSyncPwrPercentage=");
                builder.append(_beaconSyncPwrPercentage);
                builder.append(", ");
            }
            if (_cdma2000BeaconBeaconList != null) {
                builder.append("_cdma2000BeaconBeaconList=");
                builder.append(_cdma2000BeaconBeaconList);
                builder.append(", ");
            }
            if (_cdma2000BeaconHrpdBeaconList != null) {
                builder.append("_cdma2000BeaconHrpdBeaconList=");
                builder.append(_cdma2000BeaconHrpdBeaconList);
                builder.append(", ");
            }
            if (_hrpdBeaconListNumberOfEntries != null) {
                builder.append("_hrpdBeaconListNumberOfEntries=");
                builder.append(_hrpdBeaconListNumberOfEntries);
                builder.append(", ");
            }
            if (_maxBeaconListEntries != null) {
                builder.append("_maxBeaconListEntries=");
                builder.append(_maxBeaconListEntries);
                builder.append(", ");
            }
            if (_maxHrpdBeaconListEntries != null) {
                builder.append("_maxHrpdBeaconListEntries=");
                builder.append(_maxHrpdBeaconListEntries);
                builder.append(", ");
            }
            if (_maxHrpdBeaconTxPower != null) {
                builder.append("_maxHrpdBeaconTxPower=");
                builder.append(_maxHrpdBeaconTxPower);
                builder.append(", ");
            }
            if (_maxHrpdBeaconTxPowerInUse != null) {
                builder.append("_maxHrpdBeaconTxPowerInUse=");
                builder.append(_maxHrpdBeaconTxPowerInUse);
                builder.append(", ");
            }
            if (_maxfapBeaconTxPower != null) {
                builder.append("_maxfapBeaconTxPower=");
                builder.append(_maxfapBeaconTxPower);
                builder.append(", ");
            }
            if (_maxfapBeaconTxPowerInUse != null) {
                builder.append("_maxfapBeaconTxPowerInUse=");
                builder.append(_maxfapBeaconTxPowerInUse);
                builder.append(", ");
            }
            if (_period != null) {
                builder.append("_period=");
                builder.append(_period);
                builder.append(", ");
            }
            if (_hrpdBeaconEnable != null) {
                builder.append("_hrpdBeaconEnable=");
                builder.append(_hrpdBeaconEnable);
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
