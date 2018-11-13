package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum DegThrType {
    /**
     * &amp;lt;p&amp;gt;Choice of % or Number of errored blocks&amp;lt;/p&amp;gt;
     *
     */
    Percentage(0, "percentage"),
    
    /**
     * &amp;lt;p&amp;gt;Number of % or blocks&amp;lt;/p&amp;gt;
     *
     */
    NumberErroredBlocks(1, "number-errored-blocks")
    ;

    private static final java.util.Map<java.lang.Integer, DegThrType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DegThrType> b = com.google.common.collect.ImmutableMap.builder();
        for (DegThrType enumItem : DegThrType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private DegThrType(int value, java.lang.String name) {
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
     * @return corresponding DegThrType item
     */
    public static DegThrType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
