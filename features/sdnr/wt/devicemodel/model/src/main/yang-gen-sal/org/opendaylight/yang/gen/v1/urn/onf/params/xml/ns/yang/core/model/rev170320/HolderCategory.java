package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum HolderCategory {
    /**
     * removed
     *
     */
    Slot(0, "slot")
    ;

    private static final java.util.Map<java.lang.Integer, HolderCategory> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, HolderCategory> b = com.google.common.collect.ImmutableMap.builder();
        for (HolderCategory enumItem : HolderCategory.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private HolderCategory(int value, java.lang.String name) {
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
     * @return corresponding HolderCategory item
     */
    public static HolderCategory forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
