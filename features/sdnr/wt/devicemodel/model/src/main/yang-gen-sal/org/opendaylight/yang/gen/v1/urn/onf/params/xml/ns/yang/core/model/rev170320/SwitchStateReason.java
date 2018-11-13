package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum SwitchStateReason {
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
    Forced(5, "forced")
    ;

    private static final java.util.Map<java.lang.Integer, SwitchStateReason> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, SwitchStateReason> b = com.google.common.collect.ImmutableMap.builder();
        for (SwitchStateReason enumItem : SwitchStateReason.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private SwitchStateReason(int value, java.lang.String name) {
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
     * @return corresponding SwitchStateReason item
     */
    public static SwitchStateReason forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
