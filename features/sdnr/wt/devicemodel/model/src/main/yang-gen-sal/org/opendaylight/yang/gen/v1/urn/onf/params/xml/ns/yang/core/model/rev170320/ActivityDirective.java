package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum ActivityDirective {
    /**
     * none
     *
     */
    StructureIsNot(0, "structure-is-not"),
    
    /**
     * none
     *
     */
    NewStructureAndValues(1, "new-structure-and-values"),
    
    /**
     * none
     *
     */
    IncrementalStructureAndValues(2, "incremental-structure-and-values"),
    
    /**
     * none
     *
     */
    OnlyValuesInExistingStructure(3, "only-values-in-existing-structure"),
    
    /**
     * none
     *
     */
    DefinedByVerb(4, "defined-by-verb")
    ;

    private static final java.util.Map<java.lang.Integer, ActivityDirective> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ActivityDirective> b = com.google.common.collect.ImmutableMap.builder();
        for (ActivityDirective enumItem : ActivityDirective.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ActivityDirective(int value, java.lang.String name) {
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
     * @return corresponding ActivityDirective item
     */
    public static ActivityDirective forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
