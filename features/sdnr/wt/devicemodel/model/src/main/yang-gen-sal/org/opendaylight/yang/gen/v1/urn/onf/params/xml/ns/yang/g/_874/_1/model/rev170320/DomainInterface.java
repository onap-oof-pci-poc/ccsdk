package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;

public enum DomainInterface {
    /**
     * none
     *
     */
    IntraDomain(0, "intra-domain"),
    
    /**
     * none
     *
     */
    InterDomain(1, "inter-domain")
    ;

    private static final java.util.Map<java.lang.Integer, DomainInterface> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DomainInterface> b = com.google.common.collect.ImmutableMap.builder();
        for (DomainInterface enumItem : DomainInterface.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private DomainInterface(int value, java.lang.String name) {
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
     * @return corresponding DomainInterface item
     */
    public static DomainInterface forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
