package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OtUkCtpAdaptation {
    /**
     * i.e. OPSM/OTUk-a, OCh[r]/OTUk-a
     *
     */
    Regular(0, "regular"),
    
    /**
     * i.e. OPSM/OTUk-b, OCh[r]/OTUk-b
     *
     */
    None(1, "none"),
    
    /**
     * i.e. OCh[r]/OTUk-v
     *
     */
    VendorSpecific(2, "vendor-specific"),
    
    /**
     * i.e. OCh[r]/OTUkV
     *
     */
    FunctionallyStandardized(3, "functionally-standardized")
    ;

    private static final java.util.Map<java.lang.Integer, OtUkCtpAdaptation> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OtUkCtpAdaptation> b = com.google.common.collect.ImmutableMap.builder();
        for (OtUkCtpAdaptation enumItem : OtUkCtpAdaptation.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OtUkCtpAdaptation(int value, java.lang.String name) {
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
     * @return corresponding OtUkCtpAdaptation item
     */
    public static OtUkCtpAdaptation forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
