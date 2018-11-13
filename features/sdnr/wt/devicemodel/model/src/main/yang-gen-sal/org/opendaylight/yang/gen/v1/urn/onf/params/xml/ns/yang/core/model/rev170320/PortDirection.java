package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum PortDirection {
    /**
     * removed
     *
     */
    Bidirectional(0, "bidirectional"),
    
    /**
     * removed
     *
     */
    Input(1, "input"),
    
    /**
     * removed
     *
     */
    Output(2, "output"),
    
    /**
     * removed
     *
     */
    UnidentifiedOrUnknown(3, "unidentified-or-unknown")
    ;

    private static final java.util.Map<java.lang.Integer, PortDirection> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, PortDirection> b = com.google.common.collect.ImmutableMap.builder();
        for (PortDirection enumItem : PortDirection.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private PortDirection(int value, java.lang.String name) {
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
     * @return corresponding PortDirection item
     */
    public static PortDirection forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
