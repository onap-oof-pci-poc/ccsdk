package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum ApsChannel {
    /**
     * none
     *
     */
    Path(0, "path"),
    
    /**
     * none
     *
     */
    Tcm1(1, "tcm1"),
    
    /**
     * none
     *
     */
    Tcm2(2, "tcm2"),
    
    /**
     * none
     *
     */
    Tcm3(3, "tcm3"),
    
    /**
     * none
     *
     */
    Tcm4(4, "tcm4"),
    
    /**
     * none
     *
     */
    Tcm5(5, "tcm5"),
    
    /**
     * none
     *
     */
    Tcm6(6, "tcm6"),
    
    /**
     * none
     *
     */
    Section(7, "section")
    ;

    private static final java.util.Map<java.lang.Integer, ApsChannel> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ApsChannel> b = com.google.common.collect.ImmutableMap.builder();
        for (ApsChannel enumItem : ApsChannel.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ApsChannel(int value, java.lang.String name) {
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
     * @return corresponding ApsChannel item
     */
    public static ApsChannel forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
