package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OpsMnkTtpProblemList {
    /**
     * Loss of Signal
     *
     */
    Los(0, "los"),
    
    /**
     * Loss of Lane Alignment
     *
     */
    Lol(1, "lol")
    ;

    private static final java.util.Map<java.lang.Integer, OpsMnkTtpProblemList> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OpsMnkTtpProblemList> b = com.google.common.collect.ImmutableMap.builder();
        for (OpsMnkTtpProblemList enumItem : OpsMnkTtpProblemList.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OpsMnkTtpProblemList(int value, java.lang.String name) {
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
     * @return corresponding OpsMnkTtpProblemList item
     */
    public static OpsMnkTtpProblemList forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
