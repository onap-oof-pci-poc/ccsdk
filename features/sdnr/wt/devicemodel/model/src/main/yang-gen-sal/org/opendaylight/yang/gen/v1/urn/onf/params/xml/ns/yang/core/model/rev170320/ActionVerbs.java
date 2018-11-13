package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum ActionVerbs {
    /**
     * none
     *
     */
    CreatePostAdd(0, "create-post-add"),
    
    /**
     * none
     *
     */
    SetUpdatePutModifyWriteAdd(1, "set-update-put-modify-write-add"),
    
    /**
     * none
     *
     */
    GetRead(2, "get-read"),
    
    /**
     * none
     *
     */
    DeleteRemove(3, "delete-remove")
    ;

    private static final java.util.Map<java.lang.Integer, ActionVerbs> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ActionVerbs> b = com.google.common.collect.ImmutableMap.builder();
        for (ActionVerbs enumItem : ActionVerbs.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ActionVerbs(int value, java.lang.String name) {
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
     * @return corresponding ActionVerbs item
     */
    public static ActionVerbs forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
