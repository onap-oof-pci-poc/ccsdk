package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum ExtendedTerminationDirection {
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
    UndefinedOrUnknown(3, "undefined-or-unknown"),
    
    /**
     * removed
     *
     */
    ContraDirectionSink(4, "contra-direction-sink"),
    
    /**
     * removed
     *
     */
    ContraDirectionSource(5, "contra-direction-source")
    ;

    private static final java.util.Map<java.lang.Integer, ExtendedTerminationDirection> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ExtendedTerminationDirection> b = com.google.common.collect.ImmutableMap.builder();
        for (ExtendedTerminationDirection enumItem : ExtendedTerminationDirection.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ExtendedTerminationDirection(int value, java.lang.String name) {
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
     * @return corresponding ExtendedTerminationDirection item
     */
    public static ExtendedTerminationDirection forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
