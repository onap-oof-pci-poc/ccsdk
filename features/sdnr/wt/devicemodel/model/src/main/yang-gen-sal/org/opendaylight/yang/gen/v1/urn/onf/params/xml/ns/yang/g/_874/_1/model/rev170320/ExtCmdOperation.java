package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum ExtCmdOperation {
    /**
     * none
     *
     */
    Exercise(0, "exercise"),
    
    /**
     * none
     *
     */
    ManualSwitch(1, "manual-switch"),
    
    /**
     * none
     *
     */
    ForcedSwitch(2, "forced-switch"),
    
    /**
     * none
     *
     */
    Lockout(3, "lockout"),
    
    /**
     * none
     *
     */
    ReleaseOfManualSwitch(4, "release-of-manual-switch"),
    
    /**
     * none
     *
     */
    ReleaseOfForcedSwitch(5, "release-of-forced-switch"),
    
    /**
     * none
     *
     */
    ReleaseOfLockout(6, "release-of-lockout")
    ;

    private static final java.util.Map<java.lang.Integer, ExtCmdOperation> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ExtCmdOperation> b = com.google.common.collect.ImmutableMap.builder();
        for (ExtCmdOperation enumItem : ExtCmdOperation.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ExtCmdOperation(int value, java.lang.String name) {
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
     * @return corresponding ExtCmdOperation item
     */
    public static ExtCmdOperation forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
