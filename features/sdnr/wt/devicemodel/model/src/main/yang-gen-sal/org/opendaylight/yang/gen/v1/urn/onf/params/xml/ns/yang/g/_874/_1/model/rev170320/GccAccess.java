package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum GccAccess {
    /**
     * none
     *
     */
    Gcc1(0, "gcc1"),
    
    /**
     * none
     *
     */
    Gcc2(1, "gcc2"),
    
    /**
     * none
     *
     */
    Gcc1AndGcc2(2, "gcc1-and-gcc2")
    ;

    private static final java.util.Map<java.lang.Integer, GccAccess> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, GccAccess> b = com.google.common.collect.ImmutableMap.builder();
        for (GccAccess enumItem : GccAccess.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private GccAccess(int value, java.lang.String name) {
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
     * @return corresponding GccAccess item
     */
    public static GccAccess forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
