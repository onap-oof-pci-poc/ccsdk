package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum ApplicationIdentifierType {
    /**
     * none
     *
     */
    Standard(0, "standard"),
    
    /**
     * none
     *
     */
    Proprietary(1, "proprietary")
    ;

    private static final java.util.Map<java.lang.Integer, ApplicationIdentifierType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ApplicationIdentifierType> b = com.google.common.collect.ImmutableMap.builder();
        for (ApplicationIdentifierType enumItem : ApplicationIdentifierType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ApplicationIdentifierType(int value, java.lang.String name) {
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
     * @return corresponding ApplicationIdentifierType item
     */
    public static ApplicationIdentifierType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
