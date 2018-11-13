package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum EquipmentCategory {
    /**
     * removed
     *
     */
    Subrack(0, "subrack"),
    
    /**
     * removed
     *
     */
    CircuitPack(1, "circuit-pack"),
    
    /**
     * removed
     *
     */
    SmallFormfactorPluggable(2, "small-formfactor-pluggable"),
    
    /**
     * removed
     *
     */
    StandAloneUnit(3, "stand-alone-unit"),
    
    /**
     * removed
     *
     */
    Rack(4, "rack")
    ;

    private static final java.util.Map<java.lang.Integer, EquipmentCategory> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, EquipmentCategory> b = com.google.common.collect.ImmutableMap.builder();
        for (EquipmentCategory enumItem : EquipmentCategory.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private EquipmentCategory(int value, java.lang.String name) {
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
     * @return corresponding EquipmentCategory item
     */
    public static EquipmentCategory forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
