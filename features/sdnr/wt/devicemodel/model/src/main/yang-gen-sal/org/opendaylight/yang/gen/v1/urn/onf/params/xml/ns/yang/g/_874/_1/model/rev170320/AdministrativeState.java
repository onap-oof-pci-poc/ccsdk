package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum AdministrativeState {
    /**
     * none
     *
     */
    Unlocked(0, "unlocked"),
    
    /**
     * none
     *
     */
    Locked(1, "locked"),
    
    /**
     * none
     *
     */
    ShuttingDown(2, "shutting-down")
    ;

    private static final java.util.Map<java.lang.Integer, AdministrativeState> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AdministrativeState> b = com.google.common.collect.ImmutableMap.builder();
        for (AdministrativeState enumItem : AdministrativeState.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private AdministrativeState(int value, java.lang.String name) {
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
     * @return corresponding AdministrativeState item
     */
    public static AdministrativeState forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
