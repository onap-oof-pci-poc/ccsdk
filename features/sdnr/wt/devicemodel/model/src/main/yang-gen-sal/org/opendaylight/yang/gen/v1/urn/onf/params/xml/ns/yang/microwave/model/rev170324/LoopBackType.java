package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;

public enum LoopBackType {
    /**
     * none
     *
     */
    None(0, "none"),
    
    /**
     * Intermediate Frequency on the interface between indoor and outdoor unit.
     *
     */
    If(1, "if"),
    
    /**
     * Radio Frequency on the interface between outdoor unit and outdoor unit at the 
     * remote site.
     *
     */
    Rf(2, "rf")
    ;

    private static final java.util.Map<java.lang.Integer, LoopBackType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, LoopBackType> b = com.google.common.collect.ImmutableMap.builder();
        for (LoopBackType enumItem : LoopBackType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private LoopBackType(int value, java.lang.String name) {
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
     * @return corresponding LoopBackType item
     */
    public static LoopBackType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
