package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OpSnTtpProblemList {
    /**
     * Loss of Signal
     *
     */
    Los(0, "los")
    ;

    private static final java.util.Map<java.lang.Integer, OpSnTtpProblemList> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OpSnTtpProblemList> b = com.google.common.collect.ImmutableMap.builder();
        for (OpSnTtpProblemList enumItem : OpSnTtpProblemList.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OpSnTtpProblemList(int value, java.lang.String name) {
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
     * @return corresponding OpSnTtpProblemList item
     */
    public static OpSnTtpProblemList forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
