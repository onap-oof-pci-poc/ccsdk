package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;

public enum SeverityType {
    /**
     * none
     *
     */
    NonAlarmed(0, "non-alarmed"),
    
    /**
     * none
     *
     */
    Warning(1, "warning"),
    
    /**
     * none
     *
     */
    Minor(2, "minor"),
    
    /**
     * none
     *
     */
    Major(3, "major"),
    
    /**
     * none
     *
     */
    Critical(4, "critical")
    ;

    private static final java.util.Map<java.lang.Integer, SeverityType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, SeverityType> b = com.google.common.collect.ImmutableMap.builder();
        for (SeverityType enumItem : SeverityType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private SeverityType(int value, java.lang.String name) {
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
     * @return corresponding SeverityType item
     */
    public static SeverityType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
