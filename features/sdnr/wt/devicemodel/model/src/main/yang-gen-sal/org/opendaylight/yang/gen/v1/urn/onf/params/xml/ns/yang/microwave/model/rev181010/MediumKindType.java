package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;

public enum MediumKindType {
    /**
     * none
     *
     */
    TpCat3(0, "tp-cat3"),
    
    /**
     * none
     *
     */
    TpCat5(1, "tp-cat5"),
    
    /**
     * none
     *
     */
    TpCat6(2, "tp-cat6"),
    
    /**
     * none
     *
     */
    TpCat8(3, "tp-cat8"),
    
    /**
     * none
     *
     */
    SingleMode(4, "single-mode"),
    
    /**
     * none
     *
     */
    MultiMode(5, "multi-mode"),
    
    /**
     * none
     *
     */
    NotYetDefined(6, "not-yet-defined")
    ;

    private static final java.util.Map<java.lang.Integer, MediumKindType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, MediumKindType> b = com.google.common.collect.ImmutableMap.builder();
        for (MediumKindType enumItem : MediumKindType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private MediumKindType(int value, java.lang.String name) {
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
     * @return corresponding MediumKindType item
     */
    public static MediumKindType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
