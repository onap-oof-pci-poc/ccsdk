package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;

public enum DelayMechanismEnumeration {
    /**
     * The port uses the delay request-responsemechanism.
     *
     */
    E2E(1, "E2E"),
    
    /**
     * The port uses the peer delay mechanism.
     *
     */
    P2P(2, "P2P"),
    
    /**
     * The port does not implement any delaymechanism.
     *
     */
    DISABLED(254, "DISABLED")
    ;

    private static final java.util.Map<java.lang.Integer, DelayMechanismEnumeration> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DelayMechanismEnumeration> b = com.google.common.collect.ImmutableMap.builder();
        for (DelayMechanismEnumeration enumItem : DelayMechanismEnumeration.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private DelayMechanismEnumeration(int value, java.lang.String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * Returns the name of the enumeration item as it is specified in the input yang.
     *
     * @return the name of the enumeration item as it is specified in the input yang
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg integer value
     * @return corresponding DelayMechanismEnumeration item
     */
    public static DelayMechanismEnumeration forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
