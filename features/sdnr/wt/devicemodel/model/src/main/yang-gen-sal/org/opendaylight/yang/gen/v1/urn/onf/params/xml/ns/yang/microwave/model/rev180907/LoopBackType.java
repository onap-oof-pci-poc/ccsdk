package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;

public enum LoopBackType {
    /**
     * Returning the header information of the remote site back to the remote site on 
     * the radio interface between both outdoor units.
     *
     */
    RfToRemote(0, "rf-to-remote"),
    
    /**
     * Returning the header information of the local site back to the local site on the
     * radio interface between both outdoor units.
     *
     */
    RfToLocal(1, "rf-to-local"),
    
    /**
     * Returning the header information of the remote site back to the remote site on 
     * the intermediate frequency interface between local indoor unit and outdoor unit.
     *
     */
    IfToRemote(2, "if-to-remote"),
    
    /**
     * Returning the header information of the local site back to the local site on the
     * intermediate frequency interface between local indoor unit and outdoor unit.
     *
     */
    IfToLocal(3, "if-to-local"),
    
    /**
     * none
     *
     */
    None(4, "none"),
    
    /**
     * Intermediate Frequency on the interface between indoor and outdoor unit.
     *
     */
    If(5, "if"),
    
    /**
     * Radio Frequency on the interface between outdoor unit and outdoor unit at the 
     * remote site.
     *
     */
    Rf(6, "rf")
    ;

    private static final java.util.Map<java.lang.Integer, LoopBackType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, LoopBackType> b = com.google.common.collect.ImmutableMap.builder();
        for (LoopBackType enumItem : LoopBackType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private LoopBackType(int value, java.lang.String name) {
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
     * @return corresponding LoopBackType item
     */
    public static LoopBackType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
