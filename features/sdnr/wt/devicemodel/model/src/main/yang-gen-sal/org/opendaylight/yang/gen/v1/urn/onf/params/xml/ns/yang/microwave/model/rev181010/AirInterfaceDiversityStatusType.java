package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;

public enum AirInterfaceDiversityStatusType {
    /**
     * All air interfaces that are members of the diversity configuration are down.
     *
     */
    GroupDown(0, "group-down"),
    
    /**
     * At least one, but not all of the air interfaces that are part of the diversity 
     * configuration is not working.
     *
     */
    NotAllAiActive(1, "not-all-ai-active"),
    
    /**
     * All air interfaces that are part of the diversity configuration are working.
     *
     */
    AllAiActive(2, "all-ai-active")
    ;

    private static final java.util.Map<java.lang.Integer, AirInterfaceDiversityStatusType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AirInterfaceDiversityStatusType> b = com.google.common.collect.ImmutableMap.builder();
        for (AirInterfaceDiversityStatusType enumItem : AirInterfaceDiversityStatusType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private AirInterfaceDiversityStatusType(int value, java.lang.String name) {
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
     * @return corresponding AirInterfaceDiversityStatusType item
     */
    public static AirInterfaceDiversityStatusType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
