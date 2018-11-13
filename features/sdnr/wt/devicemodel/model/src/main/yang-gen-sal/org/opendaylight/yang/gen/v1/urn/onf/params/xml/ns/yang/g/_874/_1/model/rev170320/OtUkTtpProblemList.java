package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OtUkTtpProblemList {
    /**
     * Trail Trace Identifier Mismatch
     *
     */
    Tim(0, "tim"),
    
    /**
     * Signal Degraded
     *
     */
    Deg(1, "deg"),
    
    /**
     * Backward Defect Indication
     *
     */
    Bdi(2, "bdi"),
    
    /**
     * Server Signal Failure
     *
     */
    Ssf(3, "ssf")
    ;

    private static final java.util.Map<java.lang.Integer, OtUkTtpProblemList> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OtUkTtpProblemList> b = com.google.common.collect.ImmutableMap.builder();
        for (OtUkTtpProblemList enumItem : OtUkTtpProblemList.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OtUkTtpProblemList(int value, java.lang.String name) {
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
     * @return corresponding OtUkTtpProblemList item
     */
    public static OtUkTtpProblemList forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
