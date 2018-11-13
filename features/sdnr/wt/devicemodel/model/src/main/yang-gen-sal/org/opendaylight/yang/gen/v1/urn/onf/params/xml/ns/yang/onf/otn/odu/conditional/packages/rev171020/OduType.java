package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;

public enum OduType {
    /**
     * none
     *
     */
    Odu0(0, "odu-0"),
    
    /**
     * none
     *
     */
    Odu1(1, "odu-1"),
    
    /**
     * none
     *
     */
    Odu2(2, "odu-2"),
    
    /**
     * none
     *
     */
    Odu2E(3, "odu-2-e"),
    
    /**
     * none
     *
     */
    Odu3(4, "odu-3"),
    
    /**
     * none
     *
     */
    Odu4(5, "odu-4"),
    
    /**
     * none
     *
     */
    OduFlex(6, "odu-flex"),
    
    /**
     * none
     *
     */
    OduCn(7, "odu-cn")
    ;

    private static final java.util.Map<java.lang.Integer, OduType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OduType> b = com.google.common.collect.ImmutableMap.builder();
        for (OduType enumItem : OduType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OduType(int value, java.lang.String name) {
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
     * @return corresponding OduType item
     */
    public static OduType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
