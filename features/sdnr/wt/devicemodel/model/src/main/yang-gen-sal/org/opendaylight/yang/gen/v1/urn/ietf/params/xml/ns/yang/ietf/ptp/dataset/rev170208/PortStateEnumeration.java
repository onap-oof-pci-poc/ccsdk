package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;

public enum PortStateEnumeration {
    /**
     * The port is initializing its data sets, hardware, andcommunication facilities.
     *
     */
    INITIALIZING(1, "INITIALIZING"),
    
    /**
     * The port is in the fault state.
     *
     */
    FAULTY(2, "FAULTY"),
    
    /**
     * The port is disabled, and is not communicating PTPmessages (other than possibly 
     * PTP managementmessages).
     *
     */
    DISABLED(3, "DISABLED"),
    
    /**
     * The port is listening for an Announce message.
     *
     */
    LISTENING(4, "LISTENING"),
    
    /**
     * The port is in the pre-master state.
     *
     */
    PREMASTER(5, "PRE_MASTER"),
    
    /**
     * The port is behaving as a master port.
     *
     */
    MASTER(6, "MASTER"),
    
    /**
     * The port is in the passive state.
     *
     */
    PASSIVE(7, "PASSIVE"),
    
    /**
     * A master port has been selected, but the port is stillin the uncalibrated state.
     *
     */
    UNCALIBRATED(8, "UNCALIBRATED"),
    
    /**
     * The port is synchronizing to the selectedmaster port.
     *
     */
    SLAVE(9, "SLAVE")
    ;

    private static final java.util.Map<java.lang.Integer, PortStateEnumeration> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, PortStateEnumeration> b = com.google.common.collect.ImmutableMap.builder();
        for (PortStateEnumeration enumItem : PortStateEnumeration.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private PortStateEnumeration(int value, java.lang.String name) {
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
     * @return corresponding PortStateEnumeration item
     */
    public static PortStateEnumeration forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
