package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OtUkCtpKBitRate {
    /**
     * none
     *
     */
    _25G(0, "2.5-g"),
    
    /**
     * none
     *
     */
    _10G(1, "10-g"),
    
    /**
     * none
     *
     */
    _40G(2, "40-g"),
    
    /**
     * none
     *
     */
    _100G(3, "100-g")
    ;

    private static final java.util.Map<java.lang.Integer, OtUkCtpKBitRate> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OtUkCtpKBitRate> b = com.google.common.collect.ImmutableMap.builder();
        for (OtUkCtpKBitRate enumItem : OtUkCtpKBitRate.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OtUkCtpKBitRate(int value, java.lang.String name) {
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
     * @return corresponding OtUkCtpKBitRate item
     */
    public static OtUkCtpKBitRate forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
