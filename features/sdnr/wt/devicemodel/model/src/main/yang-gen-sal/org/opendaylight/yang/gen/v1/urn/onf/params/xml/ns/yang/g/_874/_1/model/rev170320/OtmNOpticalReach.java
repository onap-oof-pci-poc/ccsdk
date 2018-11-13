package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OtmNOpticalReach {
    /**
     * none
     *
     */
    IntraOffice(0, "intra-office"),
    
    /**
     * none
     *
     */
    Shorthaul(1, "shorthaul"),
    
    /**
     * none
     *
     */
    Longhaul(2, "longhaul")
    ;

    private static final java.util.Map<java.lang.Integer, OtmNOpticalReach> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OtmNOpticalReach> b = com.google.common.collect.ImmutableMap.builder();
        for (OtmNOpticalReach enumItem : OtmNOpticalReach.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OtmNOpticalReach(int value, java.lang.String name) {
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
     * @return corresponding OtmNOpticalReach item
     */
    public static OtmNOpticalReach forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
