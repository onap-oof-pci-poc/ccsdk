package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG.SipAuthCapability;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs
 *
 */
public class TransportSipFcsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs> {

    private List<java.lang.String> _emergencyNumbersList;
    private java.lang.String _fcsuri;
    private java.lang.String _impi;
    private java.lang.String _impu;
    private java.lang.String _outGoingProxyUri;
    private java.lang.String _pAccessNetInfoHeader;
    private java.lang.String _realm;
    private java.lang.Integer _rtpPortHighLimit;
    private java.lang.Integer _rtpPortLowLimit;
    private List<SipAuthCapability> _sipAuthCapability;
    private java.lang.String _sipAuthMethod;
    private java.lang.Integer _sipLocalPort;
    private java.lang.String _sipPassword;
    private BigInteger _sipRegExpiry;
    private BigInteger _sipSessionExpiry;
    private java.lang.Short _t3210;
    private BigInteger _timerT1;
    private BigInteger _timerT2;
    private BigInteger _timerT4;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>> augmentation = Collections.emptyMap();

    public TransportSipFcsBuilder() {
    }
    public TransportSipFcsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG arg) {
        this._fcsuri = arg.getFcsuri();
        this._outGoingProxyUri = arg.getOutGoingProxyUri();
        this._pAccessNetInfoHeader = arg.getPAccessNetInfoHeader();
        this._realm = arg.getRealm();
        this._impu = arg.getImpu();
        this._impi = arg.getImpi();
        this._sipPassword = arg.getSipPassword();
        this._sipAuthCapability = arg.getSipAuthCapability();
        this._sipAuthMethod = arg.getSipAuthMethod();
        this._sipLocalPort = arg.getSipLocalPort();
        this._rtpPortLowLimit = arg.getRtpPortLowLimit();
        this._rtpPortHighLimit = arg.getRtpPortHighLimit();
        this._sipRegExpiry = arg.getSipRegExpiry();
        this._sipSessionExpiry = arg.getSipSessionExpiry();
        this._emergencyNumbersList = arg.getEmergencyNumbersList();
        this._timerT1 = arg.getTimerT1();
        this._timerT2 = arg.getTimerT2();
        this._timerT4 = arg.getTimerT4();
        this._t3210 = arg.getT3210();
    }

    public TransportSipFcsBuilder(TransportSipFcs base) {
        this._emergencyNumbersList = base.getEmergencyNumbersList();
        this._fcsuri = base.getFcsuri();
        this._impi = base.getImpi();
        this._impu = base.getImpu();
        this._outGoingProxyUri = base.getOutGoingProxyUri();
        this._pAccessNetInfoHeader = base.getPAccessNetInfoHeader();
        this._realm = base.getRealm();
        this._rtpPortHighLimit = base.getRtpPortHighLimit();
        this._rtpPortLowLimit = base.getRtpPortLowLimit();
        this._sipAuthCapability = base.getSipAuthCapability();
        this._sipAuthMethod = base.getSipAuthMethod();
        this._sipLocalPort = base.getSipLocalPort();
        this._sipPassword = base.getSipPassword();
        this._sipRegExpiry = base.getSipRegExpiry();
        this._sipSessionExpiry = base.getSipSessionExpiry();
        this._t3210 = base.getT3210();
        this._timerT1 = base.getTimerT1();
        this._timerT2 = base.getTimerT2();
        this._timerT4 = base.getTimerT4();
        if (base instanceof TransportSipFcsImpl) {
            TransportSipFcsImpl impl = (TransportSipFcsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG) {
            this._fcsuri = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getFcsuri();
            this._outGoingProxyUri = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getOutGoingProxyUri();
            this._pAccessNetInfoHeader = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getPAccessNetInfoHeader();
            this._realm = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getRealm();
            this._impu = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getImpu();
            this._impi = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getImpi();
            this._sipPassword = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getSipPassword();
            this._sipAuthCapability = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getSipAuthCapability();
            this._sipAuthMethod = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getSipAuthMethod();
            this._sipLocalPort = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getSipLocalPort();
            this._rtpPortLowLimit = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getRtpPortLowLimit();
            this._rtpPortHighLimit = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getRtpPortHighLimit();
            this._sipRegExpiry = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getSipRegExpiry();
            this._sipSessionExpiry = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getSipSessionExpiry();
            this._emergencyNumbersList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getEmergencyNumbersList();
            this._timerT1 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getTimerT1();
            this._timerT2 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getTimerT2();
            this._timerT4 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getTimerT4();
            this._t3210 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG)arg).getT3210();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getEmergencyNumbersList() {
        return _emergencyNumbersList;
    }
    
    public java.lang.String getFcsuri() {
        return _fcsuri;
    }
    
    public java.lang.String getImpi() {
        return _impi;
    }
    
    public java.lang.String getImpu() {
        return _impu;
    }
    
    public java.lang.String getOutGoingProxyUri() {
        return _outGoingProxyUri;
    }
    
    public java.lang.String getPAccessNetInfoHeader() {
        return _pAccessNetInfoHeader;
    }
    
    public java.lang.String getRealm() {
        return _realm;
    }
    
    public java.lang.Integer getRtpPortHighLimit() {
        return _rtpPortHighLimit;
    }
    
    public java.lang.Integer getRtpPortLowLimit() {
        return _rtpPortLowLimit;
    }
    
    public List<SipAuthCapability> getSipAuthCapability() {
        return _sipAuthCapability;
    }
    
    public java.lang.String getSipAuthMethod() {
        return _sipAuthMethod;
    }
    
    public java.lang.Integer getSipLocalPort() {
        return _sipLocalPort;
    }
    
    public java.lang.String getSipPassword() {
        return _sipPassword;
    }
    
    public BigInteger getSipRegExpiry() {
        return _sipRegExpiry;
    }
    
    public BigInteger getSipSessionExpiry() {
        return _sipSessionExpiry;
    }
    
    public java.lang.Short getT3210() {
        return _t3210;
    }
    
    public BigInteger getTimerT1() {
        return _timerT1;
    }
    
    public BigInteger getTimerT2() {
        return _timerT2;
    }
    
    public BigInteger getTimerT4() {
        return _timerT4;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TransportSipFcsBuilder setEmergencyNumbersList(final List<java.lang.String> value) {
        this._emergencyNumbersList = value;
        return this;
    }
    
     
     private static void check_fcsuriLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public TransportSipFcsBuilder setFcsuri(final java.lang.String value) {
    if (value != null) {
        check_fcsuriLength(value);
    }
        this._fcsuri = value;
        return this;
    }
    
     
     private static void check_impiLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public TransportSipFcsBuilder setImpi(final java.lang.String value) {
    if (value != null) {
        check_impiLength(value);
    }
        this._impi = value;
        return this;
    }
    
     
     private static void check_impuLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public TransportSipFcsBuilder setImpu(final java.lang.String value) {
    if (value != null) {
        check_impuLength(value);
    }
        this._impu = value;
        return this;
    }
    
     
     private static void check_outGoingProxyUriLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public TransportSipFcsBuilder setOutGoingProxyUri(final java.lang.String value) {
    if (value != null) {
        check_outGoingProxyUriLength(value);
    }
        this._outGoingProxyUri = value;
        return this;
    }
    
     
     private static void check_pAccessNetInfoHeaderLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public TransportSipFcsBuilder setPAccessNetInfoHeader(final java.lang.String value) {
    if (value != null) {
        check_pAccessNetInfoHeaderLength(value);
    }
        this._pAccessNetInfoHeader = value;
        return this;
    }
    
     
     private static void check_realmLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public TransportSipFcsBuilder setRealm(final java.lang.String value) {
    if (value != null) {
        check_realmLength(value);
    }
        this._realm = value;
        return this;
    }
    
     
     private static void checkRtpPortHighLimitRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public TransportSipFcsBuilder setRtpPortHighLimit(final java.lang.Integer value) {
    if (value != null) {
        checkRtpPortHighLimitRange(value);
    }
        this._rtpPortHighLimit = value;
        return this;
    }
    
     
     private static void checkRtpPortLowLimitRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public TransportSipFcsBuilder setRtpPortLowLimit(final java.lang.Integer value) {
    if (value != null) {
        checkRtpPortLowLimitRange(value);
    }
        this._rtpPortLowLimit = value;
        return this;
    }
    
     
    public TransportSipFcsBuilder setSipAuthCapability(final List<SipAuthCapability> value) {
        this._sipAuthCapability = value;
        return this;
    }
    
     
     private static void check_sipAuthMethodLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public TransportSipFcsBuilder setSipAuthMethod(final java.lang.String value) {
    if (value != null) {
        check_sipAuthMethodLength(value);
    }
        this._sipAuthMethod = value;
        return this;
    }
    
     
     private static void checkSipLocalPortRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public TransportSipFcsBuilder setSipLocalPort(final java.lang.Integer value) {
    if (value != null) {
        checkSipLocalPortRange(value);
    }
        this._sipLocalPort = value;
        return this;
    }
    
     
     private static void check_sipPasswordLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 32) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..32]].", value));
     }
    
    public TransportSipFcsBuilder setSipPassword(final java.lang.String value) {
    if (value != null) {
        check_sipPasswordLength(value);
    }
        this._sipPassword = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSIPREGEXPIRYRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSIPREGEXPIRYRANGE_RANGES = a;
     }
     private static void checkSipRegExpiryRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSIPREGEXPIRYRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSIPREGEXPIRYRANGE_RANGES)));
     }
    
    public TransportSipFcsBuilder setSipRegExpiry(final BigInteger value) {
    if (value != null) {
        checkSipRegExpiryRange(value);
    }
        this._sipRegExpiry = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSIPSESSIONEXPIRYRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.valueOf(90L), new java.math.BigInteger("18446744073709551615"));
         CHECKSIPSESSIONEXPIRYRANGE_RANGES = a;
     }
     private static void checkSipSessionExpiryRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSIPSESSIONEXPIRYRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSIPSESSIONEXPIRYRANGE_RANGES)));
     }
    
    public TransportSipFcsBuilder setSipSessionExpiry(final BigInteger value) {
    if (value != null) {
        checkSipSessionExpiryRange(value);
    }
        this._sipSessionExpiry = value;
        return this;
    }
    
     
     private static void checkT3210Range(final short value) {
         if (value >= (short)1 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..20]].", value));
     }
    
    public TransportSipFcsBuilder setT3210(final java.lang.Short value) {
    if (value != null) {
        checkT3210Range(value);
    }
        this._t3210 = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTIMERT1RANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ONE, new java.math.BigInteger("18446744073709551615"));
         CHECKTIMERT1RANGE_RANGES = a;
     }
     private static void checkTimerT1Range(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTIMERT1RANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTIMERT1RANGE_RANGES)));
     }
    
    public TransportSipFcsBuilder setTimerT1(final BigInteger value) {
    if (value != null) {
        checkTimerT1Range(value);
    }
        this._timerT1 = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTIMERT2RANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ONE, new java.math.BigInteger("18446744073709551615"));
         CHECKTIMERT2RANGE_RANGES = a;
     }
     private static void checkTimerT2Range(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTIMERT2RANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTIMERT2RANGE_RANGES)));
     }
    
    public TransportSipFcsBuilder setTimerT2(final BigInteger value) {
    if (value != null) {
        checkTimerT2Range(value);
    }
        this._timerT2 = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTIMERT4RANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ONE, new java.math.BigInteger("18446744073709551615"));
         CHECKTIMERT4RANGE_RANGES = a;
     }
     private static void checkTimerT4Range(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTIMERT4RANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTIMERT4RANGE_RANGES)));
     }
    
    public TransportSipFcsBuilder setTimerT4(final BigInteger value) {
    if (value != null) {
        checkTimerT4Range(value);
    }
        this._timerT4 = value;
        return this;
    }
    
    public TransportSipFcsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TransportSipFcsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TransportSipFcs build() {
        return new TransportSipFcsImpl(this);
    }

    private static final class TransportSipFcsImpl implements TransportSipFcs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs.class;
        }

        private final List<java.lang.String> _emergencyNumbersList;
        private final java.lang.String _fcsuri;
        private final java.lang.String _impi;
        private final java.lang.String _impu;
        private final java.lang.String _outGoingProxyUri;
        private final java.lang.String _pAccessNetInfoHeader;
        private final java.lang.String _realm;
        private final java.lang.Integer _rtpPortHighLimit;
        private final java.lang.Integer _rtpPortLowLimit;
        private final List<SipAuthCapability> _sipAuthCapability;
        private final java.lang.String _sipAuthMethod;
        private final java.lang.Integer _sipLocalPort;
        private final java.lang.String _sipPassword;
        private final BigInteger _sipRegExpiry;
        private final BigInteger _sipSessionExpiry;
        private final java.lang.Short _t3210;
        private final BigInteger _timerT1;
        private final BigInteger _timerT2;
        private final BigInteger _timerT4;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>> augmentation = Collections.emptyMap();

        private TransportSipFcsImpl(TransportSipFcsBuilder base) {
            this._emergencyNumbersList = base.getEmergencyNumbersList();
            this._fcsuri = base.getFcsuri();
            this._impi = base.getImpi();
            this._impu = base.getImpu();
            this._outGoingProxyUri = base.getOutGoingProxyUri();
            this._pAccessNetInfoHeader = base.getPAccessNetInfoHeader();
            this._realm = base.getRealm();
            this._rtpPortHighLimit = base.getRtpPortHighLimit();
            this._rtpPortLowLimit = base.getRtpPortLowLimit();
            this._sipAuthCapability = base.getSipAuthCapability();
            this._sipAuthMethod = base.getSipAuthMethod();
            this._sipLocalPort = base.getSipLocalPort();
            this._sipPassword = base.getSipPassword();
            this._sipRegExpiry = base.getSipRegExpiry();
            this._sipSessionExpiry = base.getSipSessionExpiry();
            this._t3210 = base.getT3210();
            this._timerT1 = base.getTimerT1();
            this._timerT2 = base.getTimerT2();
            this._timerT4 = base.getTimerT4();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getEmergencyNumbersList() {
            return _emergencyNumbersList;
        }
        
        @Override
        public java.lang.String getFcsuri() {
            return _fcsuri;
        }
        
        @Override
        public java.lang.String getImpi() {
            return _impi;
        }
        
        @Override
        public java.lang.String getImpu() {
            return _impu;
        }
        
        @Override
        public java.lang.String getOutGoingProxyUri() {
            return _outGoingProxyUri;
        }
        
        @Override
        public java.lang.String getPAccessNetInfoHeader() {
            return _pAccessNetInfoHeader;
        }
        
        @Override
        public java.lang.String getRealm() {
            return _realm;
        }
        
        @Override
        public java.lang.Integer getRtpPortHighLimit() {
            return _rtpPortHighLimit;
        }
        
        @Override
        public java.lang.Integer getRtpPortLowLimit() {
            return _rtpPortLowLimit;
        }
        
        @Override
        public List<SipAuthCapability> getSipAuthCapability() {
            return _sipAuthCapability;
        }
        
        @Override
        public java.lang.String getSipAuthMethod() {
            return _sipAuthMethod;
        }
        
        @Override
        public java.lang.Integer getSipLocalPort() {
            return _sipLocalPort;
        }
        
        @Override
        public java.lang.String getSipPassword() {
            return _sipPassword;
        }
        
        @Override
        public BigInteger getSipRegExpiry() {
            return _sipRegExpiry;
        }
        
        @Override
        public BigInteger getSipSessionExpiry() {
            return _sipSessionExpiry;
        }
        
        @Override
        public java.lang.Short getT3210() {
            return _t3210;
        }
        
        @Override
        public BigInteger getTimerT1() {
            return _timerT1;
        }
        
        @Override
        public BigInteger getTimerT2() {
            return _timerT2;
        }
        
        @Override
        public BigInteger getTimerT4() {
            return _timerT4;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_emergencyNumbersList);
            result = prime * result + Objects.hashCode(_fcsuri);
            result = prime * result + Objects.hashCode(_impi);
            result = prime * result + Objects.hashCode(_impu);
            result = prime * result + Objects.hashCode(_outGoingProxyUri);
            result = prime * result + Objects.hashCode(_pAccessNetInfoHeader);
            result = prime * result + Objects.hashCode(_realm);
            result = prime * result + Objects.hashCode(_rtpPortHighLimit);
            result = prime * result + Objects.hashCode(_rtpPortLowLimit);
            result = prime * result + Objects.hashCode(_sipAuthCapability);
            result = prime * result + Objects.hashCode(_sipAuthMethod);
            result = prime * result + Objects.hashCode(_sipLocalPort);
            result = prime * result + Objects.hashCode(_sipPassword);
            result = prime * result + Objects.hashCode(_sipRegExpiry);
            result = prime * result + Objects.hashCode(_sipSessionExpiry);
            result = prime * result + Objects.hashCode(_t3210);
            result = prime * result + Objects.hashCode(_timerT1);
            result = prime * result + Objects.hashCode(_timerT2);
            result = prime * result + Objects.hashCode(_timerT4);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs)obj;
            if (!Objects.equals(_emergencyNumbersList, other.getEmergencyNumbersList())) {
                return false;
            }
            if (!Objects.equals(_fcsuri, other.getFcsuri())) {
                return false;
            }
            if (!Objects.equals(_impi, other.getImpi())) {
                return false;
            }
            if (!Objects.equals(_impu, other.getImpu())) {
                return false;
            }
            if (!Objects.equals(_outGoingProxyUri, other.getOutGoingProxyUri())) {
                return false;
            }
            if (!Objects.equals(_pAccessNetInfoHeader, other.getPAccessNetInfoHeader())) {
                return false;
            }
            if (!Objects.equals(_realm, other.getRealm())) {
                return false;
            }
            if (!Objects.equals(_rtpPortHighLimit, other.getRtpPortHighLimit())) {
                return false;
            }
            if (!Objects.equals(_rtpPortLowLimit, other.getRtpPortLowLimit())) {
                return false;
            }
            if (!Objects.equals(_sipAuthCapability, other.getSipAuthCapability())) {
                return false;
            }
            if (!Objects.equals(_sipAuthMethod, other.getSipAuthMethod())) {
                return false;
            }
            if (!Objects.equals(_sipLocalPort, other.getSipLocalPort())) {
                return false;
            }
            if (!Objects.equals(_sipPassword, other.getSipPassword())) {
                return false;
            }
            if (!Objects.equals(_sipRegExpiry, other.getSipRegExpiry())) {
                return false;
            }
            if (!Objects.equals(_sipSessionExpiry, other.getSipSessionExpiry())) {
                return false;
            }
            if (!Objects.equals(_t3210, other.getT3210())) {
                return false;
            }
            if (!Objects.equals(_timerT1, other.getTimerT1())) {
                return false;
            }
            if (!Objects.equals(_timerT2, other.getTimerT2())) {
                return false;
            }
            if (!Objects.equals(_timerT4, other.getTimerT4())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TransportSipFcsImpl otherImpl = (TransportSipFcsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TransportSipFcs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_emergencyNumbersList != null) {
                builder.append("_emergencyNumbersList=");
                builder.append(_emergencyNumbersList);
                builder.append(", ");
            }
            if (_fcsuri != null) {
                builder.append("_fcsuri=");
                builder.append(_fcsuri);
                builder.append(", ");
            }
            if (_impi != null) {
                builder.append("_impi=");
                builder.append(_impi);
                builder.append(", ");
            }
            if (_impu != null) {
                builder.append("_impu=");
                builder.append(_impu);
                builder.append(", ");
            }
            if (_outGoingProxyUri != null) {
                builder.append("_outGoingProxyUri=");
                builder.append(_outGoingProxyUri);
                builder.append(", ");
            }
            if (_pAccessNetInfoHeader != null) {
                builder.append("_pAccessNetInfoHeader=");
                builder.append(_pAccessNetInfoHeader);
                builder.append(", ");
            }
            if (_realm != null) {
                builder.append("_realm=");
                builder.append(_realm);
                builder.append(", ");
            }
            if (_rtpPortHighLimit != null) {
                builder.append("_rtpPortHighLimit=");
                builder.append(_rtpPortHighLimit);
                builder.append(", ");
            }
            if (_rtpPortLowLimit != null) {
                builder.append("_rtpPortLowLimit=");
                builder.append(_rtpPortLowLimit);
                builder.append(", ");
            }
            if (_sipAuthCapability != null) {
                builder.append("_sipAuthCapability=");
                builder.append(_sipAuthCapability);
                builder.append(", ");
            }
            if (_sipAuthMethod != null) {
                builder.append("_sipAuthMethod=");
                builder.append(_sipAuthMethod);
                builder.append(", ");
            }
            if (_sipLocalPort != null) {
                builder.append("_sipLocalPort=");
                builder.append(_sipLocalPort);
                builder.append(", ");
            }
            if (_sipPassword != null) {
                builder.append("_sipPassword=");
                builder.append(_sipPassword);
                builder.append(", ");
            }
            if (_sipRegExpiry != null) {
                builder.append("_sipRegExpiry=");
                builder.append(_sipRegExpiry);
                builder.append(", ");
            }
            if (_sipSessionExpiry != null) {
                builder.append("_sipSessionExpiry=");
                builder.append(_sipSessionExpiry);
                builder.append(", ");
            }
            if (_t3210 != null) {
                builder.append("_t3210=");
                builder.append(_t3210);
                builder.append(", ");
            }
            if (_timerT1 != null) {
                builder.append("_timerT1=");
                builder.append(_timerT1);
                builder.append(", ");
            }
            if (_timerT2 != null) {
                builder.append("_timerT2=");
                builder.append(_timerT2);
                builder.append(", ");
            }
            if (_timerT4 != null) {
                builder.append("_timerT4=");
                builder.append(_timerT4);
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
