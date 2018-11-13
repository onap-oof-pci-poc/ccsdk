package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;

public enum OduSlotSize {
    /**
     * none
     *
     */
    _1G25(0, "1-g-25"),
    
    /**
     * none
     *
     */
    _2G5(1, "2-g-5")
    ;

    private static final java.util.Map<java.lang.Integer, OduSlotSize> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OduSlotSize> b = com.google.common.collect.ImmutableMap.builder();
        for (OduSlotSize enumItem : OduSlotSize.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OduSlotSize(int value, java.lang.String name) {
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
     * @return corresponding OduSlotSize item
     */
    public static OduSlotSize forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
