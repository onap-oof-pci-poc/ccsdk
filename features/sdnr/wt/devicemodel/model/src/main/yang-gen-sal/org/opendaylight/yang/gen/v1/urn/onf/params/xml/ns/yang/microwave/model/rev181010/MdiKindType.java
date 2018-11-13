package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;

public enum MdiKindType {
    /**
     * Subscriber Connector
     *
     */
    Sc(0, "sc"),
    
    /**
     * Copper connector
     *
     */
    FibreChannelStyle1(1, "fibre-channel-style-1"),
    
    /**
     * Copper connector
     *
     */
    FibreChannelStyle2(2, "fibre-channel-style-2"),
    
    /**
     * Bayonet/Threaded Neill-Concelman
     *
     */
    BncTnc(3, "bnc-tnc"),
    
    /**
     * Fibre Channel coax headers
     *
     */
    Fc(4, "fc"),
    
    /**
     * none
     *
     */
    FiberJack(5, "fiber-jack"),
    
    /**
     * Lucent Connector
     *
     */
    Lc(6, "lc"),
    
    /**
     * Mechanical Transfer - Registered Jack
     *
     */
    MtRj(7, "mt-rj"),
    
    /**
     * Multiple Optical
     *
     */
    Mu(8, "mu"),
    
    /**
     * none
     *
     */
    Sg(9, "sg"),
    
    /**
     * none
     *
     */
    OpticalPigtail(10, "optical-pigtail"),
    
    /**
     * Multifiber Parallel Optic
     *
     */
    Mpo1X12(11, "mpo1-x12"),
    
    /**
     * Multifiber Parallel Optic
     *
     */
    Mpo2X16(12, "mpo2-x16"),
    
    /**
     * High Speed Serial Data Connector
     *
     */
    HssdcIi(13, "hssdc-ii"),
    
    /**
     * none
     *
     */
    CopperPigtail(14, "copper-pigtail"),
    
    /**
     * 8P8C, according to Clause 3 and Figures 1 through 5 of IEC 60603-7
     *
     */
    Rj45(15, "rj45"),
    
    /**
     * none
     *
     */
    NoSeperableConnector(16, "no-seperable-connector"),
    
    /**
     * none
     *
     */
    Mxc2X16(17, "mxc2-x16"),
    
    /**
     * according to IEC 60874-10:1992, also often called BFOC/2.5
     *
     */
    St(18, "st"),
    
    /**
     * none
     *
     */
    NotYetDefined(19, "not-yet-defined")
    ;

    private static final java.util.Map<java.lang.Integer, MdiKindType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, MdiKindType> b = com.google.common.collect.ImmutableMap.builder();
        for (MdiKindType enumItem : MdiKindType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private MdiKindType(int value, java.lang.String name) {
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
     * @return corresponding MdiKindType item
     */
    public static MdiKindType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
