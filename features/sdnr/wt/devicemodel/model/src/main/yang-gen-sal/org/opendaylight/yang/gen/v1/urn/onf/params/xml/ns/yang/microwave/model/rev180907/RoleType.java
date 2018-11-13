package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;

public enum RoleType {
    /**
     * none
     *
     */
    Working(0, "working"),
    
    /**
     * none
     *
     */
    Protection(1, "protection"),
    
    /**
     * none
     *
     */
    Protected(2, "protected")
    ;

    private static final java.util.Map<java.lang.Integer, RoleType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, RoleType> b = com.google.common.collect.ImmutableMap.builder();
        for (RoleType enumItem : RoleType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private RoleType(int value, java.lang.String name) {
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
     * @return corresponding RoleType item
     */
    public static RoleType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
