package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;

public enum PolarizationType {
    /**
     * none
     *
     */
    NotSpecified(0, "not-specified"),
    
    /**
     * none
     *
     */
    Horizontal(1, "horizontal"),
    
    /**
     * none
     *
     */
    Vertical(2, "vertical")
    ;

    private static final java.util.Map<java.lang.Integer, PolarizationType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, PolarizationType> b = com.google.common.collect.ImmutableMap.builder();
        for (PolarizationType enumItem : PolarizationType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private PolarizationType(int value, java.lang.String name) {
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
     * @return corresponding PolarizationType item
     */
    public static PolarizationType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
