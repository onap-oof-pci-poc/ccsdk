package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats
 *
 */
public class Cdma2000HrpdPcfpdsnAuxA10StatsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats> {

    private BigInteger _auxA10ConnectionsCreatedInFirstRegReqPdsn;
    private BigInteger _auxA10ConnectionsCreatedInSubsequentRegReqPdsn;
    private BigInteger _auxA10FwdIpFlowsCreatedPdsn;
    private BigInteger _auxA10IpFlowAccountingRegRequestsPdsn;
    private BigInteger _auxA10RevIpFlowsCreatedPdsn;
    private java.lang.Long _pdsnNumberAuxA10Perf;
    private IpAddress _pdsnipAddressAuxA10Perf;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder() {
    }
    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG arg) {
        this._pdsnNumberAuxA10Perf = arg.getPdsnNumberAuxA10Perf();
        this._pdsnipAddressAuxA10Perf = arg.getPdsnipAddressAuxA10Perf();
        this._auxA10ConnectionsCreatedInFirstRegReqPdsn = arg.getAuxA10ConnectionsCreatedInFirstRegReqPdsn();
        this._auxA10ConnectionsCreatedInSubsequentRegReqPdsn = arg.getAuxA10ConnectionsCreatedInSubsequentRegReqPdsn();
        this._auxA10FwdIpFlowsCreatedPdsn = arg.getAuxA10FwdIpFlowsCreatedPdsn();
        this._auxA10RevIpFlowsCreatedPdsn = arg.getAuxA10RevIpFlowsCreatedPdsn();
        this._auxA10IpFlowAccountingRegRequestsPdsn = arg.getAuxA10IpFlowAccountingRegRequestsPdsn();
    }

    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder(Cdma2000HrpdPcfpdsnAuxA10Stats base) {
        this._auxA10ConnectionsCreatedInFirstRegReqPdsn = base.getAuxA10ConnectionsCreatedInFirstRegReqPdsn();
        this._auxA10ConnectionsCreatedInSubsequentRegReqPdsn = base.getAuxA10ConnectionsCreatedInSubsequentRegReqPdsn();
        this._auxA10FwdIpFlowsCreatedPdsn = base.getAuxA10FwdIpFlowsCreatedPdsn();
        this._auxA10IpFlowAccountingRegRequestsPdsn = base.getAuxA10IpFlowAccountingRegRequestsPdsn();
        this._auxA10RevIpFlowsCreatedPdsn = base.getAuxA10RevIpFlowsCreatedPdsn();
        this._pdsnNumberAuxA10Perf = base.getPdsnNumberAuxA10Perf();
        this._pdsnipAddressAuxA10Perf = base.getPdsnipAddressAuxA10Perf();
        if (base instanceof Cdma2000HrpdPcfpdsnAuxA10StatsImpl) {
            Cdma2000HrpdPcfpdsnAuxA10StatsImpl impl = (Cdma2000HrpdPcfpdsnAuxA10StatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG) {
            this._pdsnNumberAuxA10Perf = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG)arg).getPdsnNumberAuxA10Perf();
            this._pdsnipAddressAuxA10Perf = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG)arg).getPdsnipAddressAuxA10Perf();
            this._auxA10ConnectionsCreatedInFirstRegReqPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG)arg).getAuxA10ConnectionsCreatedInFirstRegReqPdsn();
            this._auxA10ConnectionsCreatedInSubsequentRegReqPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG)arg).getAuxA10ConnectionsCreatedInSubsequentRegReqPdsn();
            this._auxA10FwdIpFlowsCreatedPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG)arg).getAuxA10FwdIpFlowsCreatedPdsn();
            this._auxA10RevIpFlowsCreatedPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG)arg).getAuxA10RevIpFlowsCreatedPdsn();
            this._auxA10IpFlowAccountingRegRequestsPdsn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG)arg).getAuxA10IpFlowAccountingRegRequestsPdsn();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getAuxA10ConnectionsCreatedInFirstRegReqPdsn() {
        return _auxA10ConnectionsCreatedInFirstRegReqPdsn;
    }
    
    public BigInteger getAuxA10ConnectionsCreatedInSubsequentRegReqPdsn() {
        return _auxA10ConnectionsCreatedInSubsequentRegReqPdsn;
    }
    
    public BigInteger getAuxA10FwdIpFlowsCreatedPdsn() {
        return _auxA10FwdIpFlowsCreatedPdsn;
    }
    
    public BigInteger getAuxA10IpFlowAccountingRegRequestsPdsn() {
        return _auxA10IpFlowAccountingRegRequestsPdsn;
    }
    
    public BigInteger getAuxA10RevIpFlowsCreatedPdsn() {
        return _auxA10RevIpFlowsCreatedPdsn;
    }
    
    public java.lang.Long getPdsnNumberAuxA10Perf() {
        return _pdsnNumberAuxA10Perf;
    }
    
    public IpAddress getPdsnipAddressAuxA10Perf() {
        return _pdsnipAddressAuxA10Perf;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKAUXA10CONNECTIONSCREATEDINFIRSTREGREQPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKAUXA10CONNECTIONSCREATEDINFIRSTREGREQPDSNRANGE_RANGES = a;
     }
     private static void checkAuxA10ConnectionsCreatedInFirstRegReqPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKAUXA10CONNECTIONSCREATEDINFIRSTREGREQPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKAUXA10CONNECTIONSCREATEDINFIRSTREGREQPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder setAuxA10ConnectionsCreatedInFirstRegReqPdsn(final BigInteger value) {
    if (value != null) {
        checkAuxA10ConnectionsCreatedInFirstRegReqPdsnRange(value);
    }
        this._auxA10ConnectionsCreatedInFirstRegReqPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKAUXA10CONNECTIONSCREATEDINSUBSEQUENTREGREQPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKAUXA10CONNECTIONSCREATEDINSUBSEQUENTREGREQPDSNRANGE_RANGES = a;
     }
     private static void checkAuxA10ConnectionsCreatedInSubsequentRegReqPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKAUXA10CONNECTIONSCREATEDINSUBSEQUENTREGREQPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKAUXA10CONNECTIONSCREATEDINSUBSEQUENTREGREQPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder setAuxA10ConnectionsCreatedInSubsequentRegReqPdsn(final BigInteger value) {
    if (value != null) {
        checkAuxA10ConnectionsCreatedInSubsequentRegReqPdsnRange(value);
    }
        this._auxA10ConnectionsCreatedInSubsequentRegReqPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKAUXA10FWDIPFLOWSCREATEDPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKAUXA10FWDIPFLOWSCREATEDPDSNRANGE_RANGES = a;
     }
     private static void checkAuxA10FwdIpFlowsCreatedPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKAUXA10FWDIPFLOWSCREATEDPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKAUXA10FWDIPFLOWSCREATEDPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder setAuxA10FwdIpFlowsCreatedPdsn(final BigInteger value) {
    if (value != null) {
        checkAuxA10FwdIpFlowsCreatedPdsnRange(value);
    }
        this._auxA10FwdIpFlowsCreatedPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKAUXA10IPFLOWACCOUNTINGREGREQUESTSPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKAUXA10IPFLOWACCOUNTINGREGREQUESTSPDSNRANGE_RANGES = a;
     }
     private static void checkAuxA10IpFlowAccountingRegRequestsPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKAUXA10IPFLOWACCOUNTINGREGREQUESTSPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKAUXA10IPFLOWACCOUNTINGREGREQUESTSPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder setAuxA10IpFlowAccountingRegRequestsPdsn(final BigInteger value) {
    if (value != null) {
        checkAuxA10IpFlowAccountingRegRequestsPdsnRange(value);
    }
        this._auxA10IpFlowAccountingRegRequestsPdsn = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKAUXA10REVIPFLOWSCREATEDPDSNRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKAUXA10REVIPFLOWSCREATEDPDSNRANGE_RANGES = a;
     }
     private static void checkAuxA10RevIpFlowsCreatedPdsnRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKAUXA10REVIPFLOWSCREATEDPDSNRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKAUXA10REVIPFLOWSCREATEDPDSNRANGE_RANGES)));
     }
    
    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder setAuxA10RevIpFlowsCreatedPdsn(final BigInteger value) {
    if (value != null) {
        checkAuxA10RevIpFlowsCreatedPdsnRange(value);
    }
        this._auxA10RevIpFlowsCreatedPdsn = value;
        return this;
    }
    
     
    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder setPdsnNumberAuxA10Perf(final java.lang.Long value) {
        this._pdsnNumberAuxA10Perf = value;
        return this;
    }
    
     
    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder setPdsnipAddressAuxA10Perf(final IpAddress value) {
        this._pdsnipAddressAuxA10Perf = value;
        return this;
    }
    
    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdPcfpdsnAuxA10StatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdPcfpdsnAuxA10Stats build() {
        return new Cdma2000HrpdPcfpdsnAuxA10StatsImpl(this);
    }

    private static final class Cdma2000HrpdPcfpdsnAuxA10StatsImpl implements Cdma2000HrpdPcfpdsnAuxA10Stats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats.class;
        }

        private final BigInteger _auxA10ConnectionsCreatedInFirstRegReqPdsn;
        private final BigInteger _auxA10ConnectionsCreatedInSubsequentRegReqPdsn;
        private final BigInteger _auxA10FwdIpFlowsCreatedPdsn;
        private final BigInteger _auxA10IpFlowAccountingRegRequestsPdsn;
        private final BigInteger _auxA10RevIpFlowsCreatedPdsn;
        private final java.lang.Long _pdsnNumberAuxA10Perf;
        private final IpAddress _pdsnipAddressAuxA10Perf;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdPcfpdsnAuxA10StatsImpl(Cdma2000HrpdPcfpdsnAuxA10StatsBuilder base) {
            this._auxA10ConnectionsCreatedInFirstRegReqPdsn = base.getAuxA10ConnectionsCreatedInFirstRegReqPdsn();
            this._auxA10ConnectionsCreatedInSubsequentRegReqPdsn = base.getAuxA10ConnectionsCreatedInSubsequentRegReqPdsn();
            this._auxA10FwdIpFlowsCreatedPdsn = base.getAuxA10FwdIpFlowsCreatedPdsn();
            this._auxA10IpFlowAccountingRegRequestsPdsn = base.getAuxA10IpFlowAccountingRegRequestsPdsn();
            this._auxA10RevIpFlowsCreatedPdsn = base.getAuxA10RevIpFlowsCreatedPdsn();
            this._pdsnNumberAuxA10Perf = base.getPdsnNumberAuxA10Perf();
            this._pdsnipAddressAuxA10Perf = base.getPdsnipAddressAuxA10Perf();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getAuxA10ConnectionsCreatedInFirstRegReqPdsn() {
            return _auxA10ConnectionsCreatedInFirstRegReqPdsn;
        }
        
        @Override
        public BigInteger getAuxA10ConnectionsCreatedInSubsequentRegReqPdsn() {
            return _auxA10ConnectionsCreatedInSubsequentRegReqPdsn;
        }
        
        @Override
        public BigInteger getAuxA10FwdIpFlowsCreatedPdsn() {
            return _auxA10FwdIpFlowsCreatedPdsn;
        }
        
        @Override
        public BigInteger getAuxA10IpFlowAccountingRegRequestsPdsn() {
            return _auxA10IpFlowAccountingRegRequestsPdsn;
        }
        
        @Override
        public BigInteger getAuxA10RevIpFlowsCreatedPdsn() {
            return _auxA10RevIpFlowsCreatedPdsn;
        }
        
        @Override
        public java.lang.Long getPdsnNumberAuxA10Perf() {
            return _pdsnNumberAuxA10Perf;
        }
        
        @Override
        public IpAddress getPdsnipAddressAuxA10Perf() {
            return _pdsnipAddressAuxA10Perf;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_auxA10ConnectionsCreatedInFirstRegReqPdsn);
            result = prime * result + Objects.hashCode(_auxA10ConnectionsCreatedInSubsequentRegReqPdsn);
            result = prime * result + Objects.hashCode(_auxA10FwdIpFlowsCreatedPdsn);
            result = prime * result + Objects.hashCode(_auxA10IpFlowAccountingRegRequestsPdsn);
            result = prime * result + Objects.hashCode(_auxA10RevIpFlowsCreatedPdsn);
            result = prime * result + Objects.hashCode(_pdsnNumberAuxA10Perf);
            result = prime * result + Objects.hashCode(_pdsnipAddressAuxA10Perf);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats)obj;
            if (!Objects.equals(_auxA10ConnectionsCreatedInFirstRegReqPdsn, other.getAuxA10ConnectionsCreatedInFirstRegReqPdsn())) {
                return false;
            }
            if (!Objects.equals(_auxA10ConnectionsCreatedInSubsequentRegReqPdsn, other.getAuxA10ConnectionsCreatedInSubsequentRegReqPdsn())) {
                return false;
            }
            if (!Objects.equals(_auxA10FwdIpFlowsCreatedPdsn, other.getAuxA10FwdIpFlowsCreatedPdsn())) {
                return false;
            }
            if (!Objects.equals(_auxA10IpFlowAccountingRegRequestsPdsn, other.getAuxA10IpFlowAccountingRegRequestsPdsn())) {
                return false;
            }
            if (!Objects.equals(_auxA10RevIpFlowsCreatedPdsn, other.getAuxA10RevIpFlowsCreatedPdsn())) {
                return false;
            }
            if (!Objects.equals(_pdsnNumberAuxA10Perf, other.getPdsnNumberAuxA10Perf())) {
                return false;
            }
            if (!Objects.equals(_pdsnipAddressAuxA10Perf, other.getPdsnipAddressAuxA10Perf())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdPcfpdsnAuxA10StatsImpl otherImpl = (Cdma2000HrpdPcfpdsnAuxA10StatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdPcfpdsnAuxA10Stats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_auxA10ConnectionsCreatedInFirstRegReqPdsn != null) {
                builder.append("_auxA10ConnectionsCreatedInFirstRegReqPdsn=");
                builder.append(_auxA10ConnectionsCreatedInFirstRegReqPdsn);
                builder.append(", ");
            }
            if (_auxA10ConnectionsCreatedInSubsequentRegReqPdsn != null) {
                builder.append("_auxA10ConnectionsCreatedInSubsequentRegReqPdsn=");
                builder.append(_auxA10ConnectionsCreatedInSubsequentRegReqPdsn);
                builder.append(", ");
            }
            if (_auxA10FwdIpFlowsCreatedPdsn != null) {
                builder.append("_auxA10FwdIpFlowsCreatedPdsn=");
                builder.append(_auxA10FwdIpFlowsCreatedPdsn);
                builder.append(", ");
            }
            if (_auxA10IpFlowAccountingRegRequestsPdsn != null) {
                builder.append("_auxA10IpFlowAccountingRegRequestsPdsn=");
                builder.append(_auxA10IpFlowAccountingRegRequestsPdsn);
                builder.append(", ");
            }
            if (_auxA10RevIpFlowsCreatedPdsn != null) {
                builder.append("_auxA10RevIpFlowsCreatedPdsn=");
                builder.append(_auxA10RevIpFlowsCreatedPdsn);
                builder.append(", ");
            }
            if (_pdsnNumberAuxA10Perf != null) {
                builder.append("_pdsnNumberAuxA10Perf=");
                builder.append(_pdsnNumberAuxA10Perf);
                builder.append(", ");
            }
            if (_pdsnipAddressAuxA10Perf != null) {
                builder.append("_pdsnipAddressAuxA10Perf=");
                builder.append(_pdsnipAddressAuxA10Perf);
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
