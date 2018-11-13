package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;

public enum G826Type {
    /**
     * Errored Seconds. Threshold cross alarm will relate to 
     * TypeDefinitions::AirInterfacePerformanceType::es .
     *
     */
    Es(0, "es"),
    
    /**
     * Severely Errored Seconds. Threshold cross alarm will relate to 
     * TypeDefinitions::AirInterfacePerformanceType::ses .
     *
     */
    Ses(1, "ses"),
    
    /**
     * Consecutive Severely Errored Seconds. Threshold cross alarm will relate to 
     * TypeDefinitions::AirInterfacePerformanceType::cses .
     *
     */
    Cses(2, "cses"),
    
    /**
     * none
     *
     */
    NotSpecified(3, "not-specified")
    ;

    private static final java.util.Map<java.lang.Integer, G826Type> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, G826Type> b = com.google.common.collect.ImmutableMap.builder();
        for (G826Type enumItem : G826Type.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private G826Type(int value, java.lang.String name) {
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
     * @return corresponding G826Type item
     */
    public static G826Type forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
