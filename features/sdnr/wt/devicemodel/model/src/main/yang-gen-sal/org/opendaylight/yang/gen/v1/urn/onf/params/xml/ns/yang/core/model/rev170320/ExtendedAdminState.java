package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum ExtendedAdminState {
    /**
     * removed
     *
     */
    Locked(0, "locked"),
    
    /**
     * removed
     *
     */
    Unlocked(1, "unlocked"),
    
    /**
     * removed
     *
     */
    ShuttingDownActive(2, "shutting-down-active"),
    
    /**
     * removed
     *
     */
    ShuttingDownPassive(3, "shutting-down-passive")
    ;

    private static final java.util.Map<java.lang.Integer, ExtendedAdminState> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ExtendedAdminState> b = com.google.common.collect.ImmutableMap.builder();
        for (ExtendedAdminState enumItem : ExtendedAdminState.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ExtendedAdminState(int value, java.lang.String name) {
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
     * @return corresponding ExtendedAdminState item
     */
    public static ExtendedAdminState forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
