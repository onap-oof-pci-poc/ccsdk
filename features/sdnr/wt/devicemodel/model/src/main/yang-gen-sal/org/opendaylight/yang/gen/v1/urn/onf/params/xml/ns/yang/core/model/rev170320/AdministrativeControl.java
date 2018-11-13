package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum AdministrativeControl {
    /**
     * removed
     *
     */
    Unlock(0, "unlock"),
    
    /**
     * removed
     *
     */
    LockPassive(1, "lock-passive"),
    
    /**
     * removed
     *
     */
    LockActive(2, "lock-active"),
    
    /**
     * removed
     *
     */
    LockImmediate(3, "lock-immediate")
    ;

    private static final java.util.Map<java.lang.Integer, AdministrativeControl> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AdministrativeControl> b = com.google.common.collect.ImmutableMap.builder();
        for (AdministrativeControl enumItem : AdministrativeControl.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private AdministrativeControl(int value, java.lang.String name) {
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
     * @return corresponding AdministrativeControl item
     */
    public static AdministrativeControl forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
