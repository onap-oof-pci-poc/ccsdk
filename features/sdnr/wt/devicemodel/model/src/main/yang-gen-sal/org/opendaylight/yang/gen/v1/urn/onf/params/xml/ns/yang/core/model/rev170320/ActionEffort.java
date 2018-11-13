package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum ActionEffort {
    /**
     * none
     *
     */
    BestEffort(0, "best-effort"),
    
    /**
     * none
     *
     */
    ExactMatch(1, "exact-match")
    ;

    private static final java.util.Map<java.lang.Integer, ActionEffort> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ActionEffort> b = com.google.common.collect.ImmutableMap.builder();
        for (ActionEffort enumItem : ActionEffort.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ActionEffort(int value, java.lang.String name) {
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
     * @return corresponding ActionEffort item
     */
    public static ActionEffort forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
