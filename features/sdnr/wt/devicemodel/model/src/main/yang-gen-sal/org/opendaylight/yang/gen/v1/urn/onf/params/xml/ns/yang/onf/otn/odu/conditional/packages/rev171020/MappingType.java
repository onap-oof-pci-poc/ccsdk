package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;

public enum MappingType {
    /**
     * none
     *
     */
    Amp(0, "amp"),
    
    /**
     * none
     *
     */
    Bmp(1, "bmp"),
    
    /**
     * none
     *
     */
    GfpF(2, "gfp-f"),
    
    /**
     * none
     *
     */
    Gmp(3, "gmp"),
    
    /**
     * none
     *
     */
    TtpGfpBmp(4, "ttp-gfp-bmp"),
    
    /**
     * none
     *
     */
    Null(5, "null")
    ;

    private static final java.util.Map<java.lang.Integer, MappingType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, MappingType> b = com.google.common.collect.ImmutableMap.builder();
        for (MappingType enumItem : MappingType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private MappingType(int value, java.lang.String name) {
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
     * @return corresponding MappingType item
     */
    public static MappingType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
