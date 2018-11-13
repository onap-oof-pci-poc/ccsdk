package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum OcTkNimProblemList {
    /**
     * Loss of Signal -- Payload
     *
     */
    LosP(0, "los-p"),
    
    /**
     * Open Connection Indicator
     *
     */
    Oci(1, "oci"),
    
    /**
     * Server Signal Failure -- Payload -- can not co-exist with SSF or SSF-O
     *
     */
    SsfP(2, "ssf-p"),
    
    /**
     * Server Signal Failure -- Overhead; can not co-exist with SSF or SSF-P
     *
     */
    SsfO(3, "ssf-o"),
    
    /**
     * Server Signal Failure; can not co-exist with SSF-P or SSF-O
     *
     */
    Ssf(4, "ssf"),
    
    /**
     * Trail Trace Identifier Mismatch
     *
     */
    Tim(5, "tim"),
    
    /**
     * Signal Degraded
     *
     */
    Deg(6, "deg"),
    
    /**
     * Backward Defect Indication
     *
     */
    Bdi(7, "bdi")
    ;

    private static final java.util.Map<java.lang.Integer, OcTkNimProblemList> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OcTkNimProblemList> b = com.google.common.collect.ImmutableMap.builder();
        for (OcTkNimProblemList enumItem : OcTkNimProblemList.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private OcTkNimProblemList(int value, java.lang.String name) {
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
     * @return corresponding OcTkNimProblemList item
     */
    public static OcTkNimProblemList forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
