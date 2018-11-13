package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OpsMnkTtpKBitRate {
    /**
     * none
     *
     */
    _40G(0, "40-g"),
    
    /**
     * none
     *
     */
    _100G(1, "100-g")
    ;

    private static final java.util.Map<java.lang.Integer, OpsMnkTtpKBitRate> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OpsMnkTtpKBitRate> b = com.google.common.collect.ImmutableMap.builder();
        for (OpsMnkTtpKBitRate enumItem : OpsMnkTtpKBitRate.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OpsMnkTtpKBitRate(int value, java.lang.String name) {
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
     * @return corresponding OpsMnkTtpKBitRate item
     */
    public static OpsMnkTtpKBitRate forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
