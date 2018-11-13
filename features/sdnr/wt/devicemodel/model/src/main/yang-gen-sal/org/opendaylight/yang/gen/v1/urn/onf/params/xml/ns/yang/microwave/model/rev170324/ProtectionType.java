package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;

public enum ProtectionType {
    /**
     * none
     *
     */
    Hsb(0, "hsb")
    ;

    private static final java.util.Map<java.lang.Integer, ProtectionType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ProtectionType> b = com.google.common.collect.ImmutableMap.builder();
        for (ProtectionType enumItem : ProtectionType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ProtectionType(int value, java.lang.String name) {
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
     * @return corresponding ProtectionType item
     */
    public static ProtectionType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
