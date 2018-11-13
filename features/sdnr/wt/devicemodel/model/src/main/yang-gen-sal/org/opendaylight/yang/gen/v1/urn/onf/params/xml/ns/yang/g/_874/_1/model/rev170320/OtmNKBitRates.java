package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OtmNKBitRates {
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
    _2510G(3, "2.5-10-g"),
    
    /**
     * none
     *
     */
    _1040G(4, "10-40-g"),
    
    /**
     * none
     *
     */
    _251040G(5, "2.5-10-40-g")
    ;

    private static final java.util.Map<java.lang.Integer, OtmNKBitRates> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OtmNKBitRates> b = com.google.common.collect.ImmutableMap.builder();
        for (OtmNKBitRates enumItem : OtmNKBitRates.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OtmNKBitRates(int value, java.lang.String name) {
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
     * @return corresponding OtmNKBitRates item
     */
    public static OtmNKBitRates forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
