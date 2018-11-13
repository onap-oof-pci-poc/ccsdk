package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum TerminationDirection {
    /**
     * removed
     *
     */
    Bidirectional(0, "bidirectional"),
    
    /**
     * removed
     *
     */
    Sink(1, "sink"),
    
    /**
     * removed
     *
     */
    Source(2, "source"),
    
    /**
     * removed
     *
     */
    UndefinedOrUnknown(3, "undefined-or-unknown")
    ;

    private static final java.util.Map<java.lang.Integer, TerminationDirection> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TerminationDirection> b = com.google.common.collect.ImmutableMap.builder();
        for (TerminationDirection enumItem : TerminationDirection.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private TerminationDirection(int value, java.lang.String name) {
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
     * @return corresponding TerminationDirection item
     */
    public static TerminationDirection forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
