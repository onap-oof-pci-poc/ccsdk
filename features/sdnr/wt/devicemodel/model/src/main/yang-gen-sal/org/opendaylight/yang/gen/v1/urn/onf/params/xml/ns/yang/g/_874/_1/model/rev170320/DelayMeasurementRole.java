package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum DelayMeasurementRole {
    /**
     * none
     *
     */
    Controller(0, "controller"),
    
    /**
     * none
     *
     */
    Responder(1, "responder")
    ;

    private static final java.util.Map<java.lang.Integer, DelayMeasurementRole> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DelayMeasurementRole> b = com.google.common.collect.ImmutableMap.builder();
        for (DelayMeasurementRole enumItem : DelayMeasurementRole.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private DelayMeasurementRole(int value, java.lang.String name) {
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
     * @return corresponding DelayMeasurementRole item
     */
    public static DelayMeasurementRole forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
