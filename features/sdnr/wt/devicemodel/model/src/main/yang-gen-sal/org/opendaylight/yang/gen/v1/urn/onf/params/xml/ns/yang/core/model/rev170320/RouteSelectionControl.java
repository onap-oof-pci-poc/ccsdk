package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum RouteSelectionControl {
    /**
     * removed
     *
     */
    Normal(0, "normal"),
    
    /**
     * removed
     *
     */
    Manual(1, "manual"),
    
    /**
     * removed
     *
     */
    Forced(2, "forced"),
    
    /**
     * removed
     *
     */
    LockOut(3, "lock-out")
    ;

    private static final java.util.Map<java.lang.Integer, RouteSelectionControl> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, RouteSelectionControl> b = com.google.common.collect.ImmutableMap.builder();
        for (RouteSelectionControl enumItem : RouteSelectionControl.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private RouteSelectionControl(int value, java.lang.String name) {
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
     * @return corresponding RouteSelectionControl item
     */
    public static RouteSelectionControl forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
