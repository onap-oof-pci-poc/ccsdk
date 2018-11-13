package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;

public enum TerminationState {
    /**
     * removed
     *
     */
    LpCanNeverTerminate(0, "lp-can-never-terminate"),
    
    /**
     * removed
     *
     */
    LtNotTerminated(1, "lt-not-terminated"),
    
    /**
     * removed
     *
     */
    TerminatedServerToClientFlow(2, "terminated-server-to-client-flow"),
    
    /**
     * removed
     *
     */
    TerminatedClientToServerFlow(3, "terminated-client-to-server-flow"),
    
    /**
     * removed
     *
     */
    TerminatedBidirectional(4, "terminated-bidirectional"),
    
    /**
     * removed
     *
     */
    LtPermenantlyTerminated(5, "lt-permenantly-terminated"),
    
    /**
     * removed
     *
     */
    TerminationStateUnknown(6, "termination-state-unknown")
    ;

    private static final java.util.Map<java.lang.Integer, TerminationState> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TerminationState> b = com.google.common.collect.ImmutableMap.builder();
        for (TerminationState enumItem : TerminationState.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private TerminationState(int value, java.lang.String name) {
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
     * @return corresponding TerminationState item
     */
    public static TerminationState forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
