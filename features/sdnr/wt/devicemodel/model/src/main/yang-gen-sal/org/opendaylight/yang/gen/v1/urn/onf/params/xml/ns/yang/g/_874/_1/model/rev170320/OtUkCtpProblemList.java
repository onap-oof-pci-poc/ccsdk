package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OtUkCtpProblemList {
    /**
     * Loss of Frame
     *
     */
    Lof(0, "lof"),
    
    /**
     * Alarm Indication Signal
     *
     */
    Ais(1, "ais"),
    
    /**
     * Loss of MultiFrame
     *
     */
    Lom(2, "lom")
    ;

    private static final java.util.Map<java.lang.Integer, OtUkCtpProblemList> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OtUkCtpProblemList> b = com.google.common.collect.ImmutableMap.builder();
        for (OtUkCtpProblemList enumItem : OtUkCtpProblemList.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OtUkCtpProblemList(int value, java.lang.String name) {
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
     * @return corresponding OtUkCtpProblemList item
     */
    public static OtUkCtpProblemList forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
