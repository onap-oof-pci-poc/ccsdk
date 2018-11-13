package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum LifecycleState {
    /**
     * removed
     *
     */
    Planned(0, "planned"),
    
    /**
     * removed
     *
     */
    Potential(1, "potential"),
    
    /**
     * removed
     *
     */
    Installed(2, "installed"),
    
    /**
     * removed
     *
     */
    PendingRemoval(3, "pending-removal")
    ;

    private static final java.util.Map<java.lang.Integer, LifecycleState> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, LifecycleState> b = com.google.common.collect.ImmutableMap.builder();
        for (LifecycleState enumItem : LifecycleState.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private LifecycleState(int value, java.lang.String name) {
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
     * @return corresponding LifecycleState item
     */
    public static LifecycleState forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
