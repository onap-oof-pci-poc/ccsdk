package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OtSnTtpProblemList {
    /**
     * BDI-P (Backward Defect Indication - Payload); not co-exist with BDI-O or BDI
     *
     */
    BdiP(0, "bdi-p"),
    
    /**
     * BDI-O (Backward Defect Indication - Overhead); not co-exist with BDI-P or BDI
     *
     */
    BdiO(1, "bdi-o"),
    
    /**
     * BDI (Backward Defect Indication); not co-exist with BDI-P or BDI-O
     *
     */
    Bdi(2, "bdi"),
    
    /**
     * TIM (Trail Trace Identifier Mismatch);
     *
     */
    Tim(3, "tim"),
    
    /**
     * -P (Loss of Signal - Payload); not co-exist with LOS-O or LOS
     *
     */
    LosP(4, "los-p"),
    
    /**
     * LOS-O (Loss of Signal - Overhead); not co-exist with LOS-P or LOS
     *
     */
    LosO(5, "los-o"),
    
    /**
     * LOS (Loss of Signal); not co-exist with LOS-P or LOS-O.
     *
     */
    Los(6, "los")
    ;

    private static final java.util.Map<java.lang.Integer, OtSnTtpProblemList> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OtSnTtpProblemList> b = com.google.common.collect.ImmutableMap.builder();
        for (OtSnTtpProblemList enumItem : OtSnTtpProblemList.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OtSnTtpProblemList(int value, java.lang.String name) {
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
     * @return corresponding OtSnTtpProblemList item
     */
    public static OtSnTtpProblemList forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
