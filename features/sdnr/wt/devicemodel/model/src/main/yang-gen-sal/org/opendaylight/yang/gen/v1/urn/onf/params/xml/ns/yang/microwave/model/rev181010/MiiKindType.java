package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;

public enum MiiKindType {
    /**
     * none
     *
     */
    Gbic(0, "gbic"),
    
    /**
     * none
     *
     */
    SolderedConnector(1, "soldered-connector"),
    
    /**
     * none
     *
     */
    SfpSfpPlusSfp28(2, "sfp-sfp-plus-sfp28"),
    
    /**
     * none
     *
     */
    Xbi300Pin(3, "xbi-300-pin"),
    
    /**
     * none
     *
     */
    Xenpak(4, "xenpak"),
    
    /**
     * none
     *
     */
    Xfp(5, "xfp"),
    
    /**
     * none
     *
     */
    XfpE(6, "xfp-e"),
    
    /**
     * none
     *
     */
    Xpak(7, "xpak"),
    
    /**
     * none
     *
     */
    X2(8, "x2"),
    
    /**
     * none
     *
     */
    DwdmSfpSfpPlus(9, "dwdm-sfp-sfp-plus"),
    
    /**
     * none
     *
     */
    Qsfp(10, "qsfp"),
    
    /**
     * none
     *
     */
    QsfpPlus(11, "qsfp-plus"),
    
    /**
     * none
     *
     */
    Cxp(12, "cxp"),
    
    /**
     * none
     *
     */
    ShieldedMiniMultilaneHd4X(13, "shielded-mini-multilane-hd-4-x"),
    
    /**
     * none
     *
     */
    ShieldedMiniMultilaneHd8X(14, "shielded-mini-multilane-hd-8-x"),
    
    /**
     * none
     *
     */
    Qsfp28(15, "qsfp28"),
    
    /**
     * none
     *
     */
    Cxp2(16, "cxp2"),
    
    /**
     * none
     *
     */
    CdfpStyle1Style2(17, "cdfp-style1-style2"),
    
    /**
     * none
     *
     */
    ShieldedMiniMultilaneHd4XFanOut(18, "shielded-mini-multilane-hd-4-x-fan-out"),
    
    /**
     * none
     *
     */
    ShieldedMiniMultilaneHd8XFanOut(19, "shielded-mini-multilane-hd-8-x-fan-out"),
    
    /**
     * none
     *
     */
    CdfpStyle3(20, "cdfp-style3"),
    
    /**
     * none
     *
     */
    QsfpMicro(21, "qsfp-micro"),
    
    /**
     * none
     *
     */
    QsfpDd(22, "qsfp-dd"),
    
    /**
     * none
     *
     */
    QsfpPlusRateSelectV1(23, "qsfp-plus-rate-select-v1"),
    
    /**
     * none
     *
     */
    QsfpPlusRateSelectV2(24, "qsfp-plus-rate-select-v2"),
    
    /**
     * none
     *
     */
    NotYetDefined(25, "not-yet-defined")
    ;

    private static final java.util.Map<java.lang.Integer, MiiKindType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, MiiKindType> b = com.google.common.collect.ImmutableMap.builder();
        for (MiiKindType enumItem : MiiKindType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private MiiKindType(int value, java.lang.String name) {
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
     * @return corresponding MiiKindType item
     */
    public static MiiKindType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
