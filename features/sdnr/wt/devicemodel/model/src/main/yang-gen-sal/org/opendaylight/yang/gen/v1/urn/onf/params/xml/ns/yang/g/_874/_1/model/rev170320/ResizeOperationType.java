package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum ResizeOperationType {
    /**
     * Increase Bandwidth
     *
     */
    IncreaseBw(0, "increase-bw"),
    
    /**
     * Decrease Bandwidth
     *
     */
    DecreaseBw(1, "decrease-bw")
    ;

    private static final java.util.Map<java.lang.Integer, ResizeOperationType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ResizeOperationType> b = com.google.common.collect.ImmutableMap.builder();
        for (ResizeOperationType enumItem : ResizeOperationType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ResizeOperationType(int value, java.lang.String name) {
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
     * @return corresponding ResizeOperationType item
     */
    public static ResizeOperationType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
