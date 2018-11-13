package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum RouteSelectionReason {
    /**
     * removed
     *
     */
    WaitToRevert(0, "wait-to-revert"),
    
    /**
     * removed
     *
     */
    SignalDegrade(1, "signal-degrade"),
    
    /**
     * removed
     *
     */
    SignalFail(2, "signal-fail"),
    
    /**
     * removed
     *
     */
    Normal(3, "normal"),
    
    /**
     * removed
     *
     */
    Manual(4, "manual"),
    
    /**
     * removed
     *
     */
    Forced(5, "forced"),
    
    /**
     * removed
     *
     */
    LockOut(6, "lock-out")
    ;

    private static final java.util.Map<java.lang.Integer, RouteSelectionReason> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, RouteSelectionReason> b = com.google.common.collect.ImmutableMap.builder();
        for (RouteSelectionReason enumItem : RouteSelectionReason.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private RouteSelectionReason(int value, java.lang.String name) {
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
     * @return corresponding RouteSelectionReason item
     */
    public static RouteSelectionReason forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
