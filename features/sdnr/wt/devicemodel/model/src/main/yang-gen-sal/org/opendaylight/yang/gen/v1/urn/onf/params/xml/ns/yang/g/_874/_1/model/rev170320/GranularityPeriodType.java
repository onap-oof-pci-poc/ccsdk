package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum GranularityPeriodType {
    /**
     * none
     *
     */
    Unknown(0, "unknown"),
    
    /**
     * none
     *
     */
    Period15Min(1, "period-15-min"),
    
    /**
     * none
     *
     */
    Period24Hours(2, "period-24-hours")
    ;

    private static final java.util.Map<java.lang.Integer, GranularityPeriodType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, GranularityPeriodType> b = com.google.common.collect.ImmutableMap.builder();
        for (GranularityPeriodType enumItem : GranularityPeriodType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private GranularityPeriodType(int value, java.lang.String name) {
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
     * @return corresponding GranularityPeriodType item
     */
    public static GranularityPeriodType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
