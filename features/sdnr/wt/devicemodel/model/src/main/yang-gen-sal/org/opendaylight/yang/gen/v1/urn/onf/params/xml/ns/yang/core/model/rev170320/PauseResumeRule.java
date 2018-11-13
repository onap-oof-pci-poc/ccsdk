package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum PauseResumeRule {
    /**
     * none
     *
     */
    NoPausePossible(0, "no-pause-possible")
    ;

    private static final java.util.Map<java.lang.Integer, PauseResumeRule> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, PauseResumeRule> b = com.google.common.collect.ImmutableMap.builder();
        for (PauseResumeRule enumItem : PauseResumeRule.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private PauseResumeRule(int value, java.lang.String name) {
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
     * @return corresponding PauseResumeRule item
     */
    public static PauseResumeRule forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
