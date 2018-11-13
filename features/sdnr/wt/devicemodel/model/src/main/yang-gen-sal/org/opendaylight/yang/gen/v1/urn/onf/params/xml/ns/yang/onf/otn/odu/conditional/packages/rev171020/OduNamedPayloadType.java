package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;

public enum OduNamedPayloadType {
    /**
     * none
     *
     */
    Unknown(0, "unknown"),
    
    /**
     * none
     *
     */
    Uninterpretable(1, "uninterpretable")
    ;

    private static final java.util.Map<java.lang.Integer, OduNamedPayloadType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OduNamedPayloadType> b = com.google.common.collect.ImmutableMap.builder();
        for (OduNamedPayloadType enumItem : OduNamedPayloadType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OduNamedPayloadType(int value, java.lang.String name) {
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
     * @return corresponding OduNamedPayloadType item
     */
    public static OduNamedPayloadType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
