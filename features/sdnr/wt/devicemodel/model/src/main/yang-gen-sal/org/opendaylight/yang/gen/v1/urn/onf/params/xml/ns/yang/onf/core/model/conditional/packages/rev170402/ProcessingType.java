package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;

public enum ProcessingType {
    /**
     * none
     *
     */
    Done(0, "done"),
    
    /**
     * none
     *
     */
    Processing(1, "processing")
    ;

    private static final java.util.Map<java.lang.Integer, ProcessingType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ProcessingType> b = com.google.common.collect.ImmutableMap.builder();
        for (ProcessingType enumItem : ProcessingType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ProcessingType(int value, java.lang.String name) {
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
     * @return corresponding ProcessingType item
     */
    public static ProcessingType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
