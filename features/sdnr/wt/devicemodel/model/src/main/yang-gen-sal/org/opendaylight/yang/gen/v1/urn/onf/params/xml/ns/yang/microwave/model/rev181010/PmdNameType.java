package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;

public enum PmdNameType {
    /**
     * Thick coax Medium Attachment Unit (MAU) as specified in 802.3 Clause 8
     *
     */
    _10Base5(0, "10-base5"),
    
    /**
     * FOIRL Medium Attachment Unit (MAU) as specified in 802.3 Clause 9.9
     *
     */
    Foirl(1, "foirl"),
    
    /**
     * Thin coax Medium Attachment Unit (MAU) as specified in 802.3 Clause 10
     *
     */
    _10Base2(2, "10-base2"),
    
    /**
     * Broadband DTE Medium Attachment Unit (MAU) as specified in 802.3 Clause 11
     *
     */
    _10Broad36(3, "10-broad36"),
    
    /**
     * Twisted-pair cabling Medium Attachment Unit (MAU) as specified in 802.3 Clause 
     * 14. Only to be applied when duplex mode unknown
     *
     */
    _10BaseT(4, "10-base-t"),
    
    /**
     * Twisted-pair cabling Medium Attachment Unit (MAU) as specified in 802.3 Clause 
     * 14 in half duplex mode
     *
     */
    _10BaseThd(5, "10-base-thd"),
    
    /**
     * Twisted-pair cabling Medium Attachment Unit (MAU) as specified in 802.3 Clause 
     * 14 in full duplex mode
     *
     */
    _10BaseTfd(6, "10-base-tfd"),
    
    /**
     * Passive fiber Medium Attachment Unit (MAU) as specified in 802.3 Clause 16
     *
     */
    _10BaseFp(7, "10-base-fp"),
    
    /**
     * Synchronous fiber Medium Attachment Unit (MAU) as specified in 802.3 Clause 17
     *
     */
    _10BaseFb(8, "10-base-fb"),
    
    /**
     * Asynchronous fiber Medium Attachment Unit (MAU) as specified in 802.3 Clause 18.
     * Only to be applied when duplex mode unknown
     *
     */
    _10BaseFl(9, "10-base-fl"),
    
    /**
     * Asynchronous fiber Medium Attachment Unit (MAU) as specified in 802.3 Clause 18 
     * in half duplex mode
     *
     */
    _10BaseFlhd(10, "10-base-flhd"),
    
    /**
     * Asynchronous fiber Medium Attachment Unit (MAU) as specified in 802.3 Clause 18 
     * in full duplex mode
     *
     */
    _10BaseFlfd(11, "10-base-flfd"),
    
    /**
     * Four-pair Category 3 twisted-pair cabling as specified in 802.3 Clause 23
     *
     */
    _100BaseT4(12, "100-base-t4"),
    
    /**
     * Two-pair Category 5 twisted-pair cabling as specified in 802.3 Clause 25. Only 
     * to be applied when duplex mode unknown
     *
     */
    _100BaseTx(13, "100-base-tx"),
    
    /**
     * Two-pair Category 5 twisted-pair cabling as specified in 802.3 Clause 25 in half
     * duplex mode
     *
     */
    _100BaseTxhd(14, "100-base-txhd"),
    
    /**
     * Two-pair Category 5 twisted-pair cabling as specified in 802.3 Clause 25 in full
     * duplex mode
     *
     */
    _100BaseTxfd(15, "100-base-txfd"),
    
    /**
     * One single-mode fiber Optical Line Terminal (OLT=&amp;gt;office side) Physical 
     * layer entity (PHY) as specified in 802.3 Clause 58
     *
     */
    _100BaseBx10D(16, "100-base-bx10-d"),
    
    /**
     * One single-mode fiber Optical Network Unit (ONU=&amp;gt;customer side) Physical 
     * layer entity (PHY) as specified in 802.3 Clause 58
     *
     */
    _100BaseBx10U(17, "100-base-bx10-u"),
    
    /**
     * X fiber over Physical Medium Dependent (PMD) as specified in 802.3 Clause 26. 
     * Only to be applied when duplex mode unknown
     *
     */
    _100BaseFx(18, "100-base-fx"),
    
    /**
     * X fiber over Physical Medium Dependent (PMD) as specified in 802.3 Clause 26 in 
     * half duplex mode
     *
     */
    _100BaseFxhd(19, "100-base-fxhd"),
    
    /**
     * X fiber over Physical Medium Dependent (PMD) as specified in 802.3 Clause 26 in 
     * full duplex mode
     *
     */
    _100BaseFxfd(20, "100-base-fxfd"),
    
    /**
     * Two fiber Physical layer entity (PHY) as specified in 802.3 Clause 58
     *
     */
    _100BaseLx10(21, "100-base-lx10"),
    
    /**
     * Two-pair Category 3 twisted-pair cabling as specified in 802.3 Clause 32. Only 
     * to be applied when duplex mode unknown
     *
     */
    _100BaseT2(22, "100-base-t2"),
    
    /**
     * Two-pair Category 3 twisted-pair cabling as specified in 802.3 Clause 32 in half
     * duplex mode
     *
     */
    _100BaseT2Hd(23, "100-base-t2-hd"),
    
    /**
     * Two-pair Category 3 twisted-pair cabling as specified in 802.3 Clause 32 in full
     * duplex mode
     *
     */
    _100BaseT2Fd(24, "100-base-t2-fd"),
    
    /**
     * X as specified in 802.3 Clause 36 over undefined Physical Medium Dependent 
     * (PMD). Not to be configured and only to be returned when underlying PMD and 
     * duplex mode unknown
     *
     */
    _1000BaseX(25, "1000-base-x"),
    
    /**
     * One single-mode fiber Optical Line Terminal (OLT=&amp;gt;office side) Physical 
     * layer entity (PHY) as specified in 802.3 Clause 59
     *
     */
    _1000BaseBx10D(26, "1000-base-bx10-d"),
    
    /**
     * One single-mode fiber Optical Network Unit (ONU=&amp;gt;customer side) Physical 
     * layer entity (PHY) as specified in 802.3 Clause 59
     *
     */
    _1000BaseBx10U(27, "1000-base-bx10-u"),
    
    /**
     * X Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) as 
     * specified in 802.3 Clause 36 over undefined Physical Medium Dependent (PMD) in 
     * half duplex mode. Not to be configured and only to be returned when underlying 
     * PMD unknown
     *
     */
    _1000BaseXhd(28, "1000-base-xhd"),
    
    /**
     * X Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) as 
     * specified in 802.3 Clause 36 over undefined Physical Medium Dependent (PMD) in 
     * full duplex mode. Not to be configured and only to be returned when underlying 
     * PMD unknown
     *
     */
    _1000BaseXfd(29, "1000-base-xfd"),
    
    /**
     * X fiber over long-wavelength laser Physical Medium Dependent (PMD) as specified 
     * in 802.3 Clause 38. Only to be applied when duplex mode unknown
     *
     */
    _1000BaseLx(30, "1000-base-lx"),
    
    /**
     * X fiber over long-wavelength laser Physical Medium Dependent (PMD) as specified 
     * in 802.3 Clause 38 in half duplex mode
     *
     */
    _1000BaseLxhd(31, "1000-base-lxhd"),
    
    /**
     * X fiber over long-wavelength laser Physical Medium Dependent (PMD) as specified 
     * in 802.3 Clause 38 in full duplex mode
     *
     */
    _1000BaseLxfd(32, "1000-base-lxfd"),
    
    /**
     * Two fiber 10km Physical layer entity (PHY) as specified in 802.3 Clause 59
     *
     */
    _1000BaseLx10(33, "1000-base-lx10"),
    
    /**
     * X fiber over short-wavelength laser Physical Medium Dependent (PMD) as specified
     * in 802.3 Clause 38. Only to be applied when duplex mode unknown
     *
     */
    _1000BaseSx(34, "1000-base-sx"),
    
    /**
     * X fiber over short-wavelength laser Physical Medium Dependent (PMD) as specified
     * in 802.3 Clause 38 in half duplex mode
     *
     */
    _1000BaseSxhd(35, "1000-base-sxhd"),
    
    /**
     * X fiber over short-wavelength laser Physical Medium Dependent (PMD) as specified
     * in 802.3 Clause 38 in full duplex mode
     *
     */
    _1000BaseSxfd(36, "1000-base-sxfd"),
    
    /**
     * X copper over 150-Ohm balanced cable Physical Medium Dependent (PMD) as 
     * specified in 802.3 Clause 39. Only to be applied when duplex mode unknown
     *
     */
    _1000BaseCx(37, "1000-base-cx"),
    
    /**
     * X copper over 150-Ohm balanced cable Physical Medium Dependent (PMD) as 
     * specified in 802.3 Clause 39 in half duplex mode
     *
     */
    _1000BaseCxhd(38, "1000-base-cxhd"),
    
    /**
     * X copper over 150-Ohm balanced cable Physical Medium Dependent (PMD) as 
     * specified in 802.3 Clause 39 in full duplex mode
     *
     */
    _1000BaseCxfd(39, "1000-base-cxfd"),
    
    /**
     * X Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) over an 
     * electrical backplane Physical Medium Dependent (PMD) as specified in 802.3 
     * Clause 70
     *
     */
    _1000BaseKx(40, "1000-base-kx"),
    
    /**
     * Four-pair Category 5 twisted-pair cabling Physical layer entity (PHY) as 
     * specified in 802.3 Clause 40. Only to be applied when duplex mode unknown
     *
     */
    _1000BaseT(41, "1000-base-t"),
    
    /**
     * Four-pair Category 5 twisted-pair cabling Physical layer entity (PHY) as 
     * specified in 802.3 Clause 40 in half duplex mode
     *
     */
    _1000BaseThd(42, "1000-base-thd"),
    
    /**
     * Four-pair Category 5 twisted-pair cabling Physical layer entity (PHY) as 
     * specified in 802.3 Clause 40 in full duplex mode
     *
     */
    _1000BaseTfd(43, "1000-base-tfd"),
    
    /**
     * X Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) as 
     * specified in 802.3 Clause 48 over undefined Physical Medium Dependent (PMD). Not
     * to be configured and only to be returned when underlying PMD unknown
     *
     */
    _10GbaseX(44, "10-gbase-x"),
    
    /**
     * X fiber over 4 lane 1310nm optics as specified in 802.3 Clause 53
     *
     */
    _10GbaseLx4(45, "10-gbase-lx4"),
    
    /**
     * X copper over 8 pair 100-Ohm balanced cable as specified in 802.3 Clause 54
     *
     */
    _10GbaseCx4(46, "10-gbase-cx4"),
    
    /**
     * X Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) over an 
     * electrical backplane Physical Medium Dependent (PMD) as specified in 802.3 
     * Clause 71
     *
     */
    _10GbaseKx4(47, "10-gbase-kx4"),
    
    /**
     * R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) as 
     * specified in 802.3 Clause 49 over undefined Physical Medium Dependent (PMD). Not
     * to be configured and only to be returned when underlying PMD unknown
     *
     */
    _10GbaseR(48, "10-gbase-r"),
    
    /**
     * R fiber over 1550nm optics as specified in 802.3 Clause 52
     *
     */
    _10GbaseEr(49, "10-gbase-er"),
    
    /**
     * R fiber over 1310nm optics as specified in 802.3 Clause 52
     *
     */
    _10GbaseLr(50, "10-gbase-lr"),
    
    /**
     * R fiber over 850nm optics as specified in 802.3 Clause 52
     *
     */
    _10GbaseSr(51, "10-gbase-sr"),
    
    /**
     * R fiber over 1310 nm optics as specified in 802.3 Clause 68
     *
     */
    _10GbaseLrm(52, "10-gbase-lrm"),
    
    /**
     * R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) over an 
     * electrical backplane Physical Medium Dependent (PMD) as specified in 802.3 
     * Clause 72
     *
     */
    _10GbaseKr(53, "10-gbase-kr"),
    
    /**
     * Four-pair twisted-pair balanced copper cabling Physical layer entity (PHY) as 
     * specified in 802.3 Clause 55
     *
     */
    _10GbaseT(54, "10-gbase-t"),
    
    /**
     * One single-mode fiber 10.3125 GBd continuous downstream / burst mode upstream 
     * Optical Line Terminal (OLT=&amp;gt;office side) Physical layer entity (PHY) as 
     * specified in 802.3 Clause 75
     *
     */
    _10GbasePrD1(55, "10-gbase-pr-d1"),
    
    /**
     * One single-mode fiber 10.3125 GBd continuous downstream / burst mode upstream 
     * Optical Line Terminal (OLT=&amp;gt;office side) Physical layer entity (PHY) as 
     * specified in 802.3 Clause 75
     *
     */
    _10GbasePrD2(56, "10-gbase-pr-d2"),
    
    /**
     * One single-mode fiber 10.3125 GBd continuous downstream / burst mode upstream 
     * Optical Line Terminal (OLT=&amp;gt;office side) Physical layer entity (PHY) as 
     * specified in 802.3 Clause 75
     *
     */
    _10GbasePrD3(57, "10-gbase-pr-d3"),
    
    /**
     * One single-mode fiber 10.3125 GBd continuous downstream / burst mode upstream 
     * Optical Line Terminal (OLT=&amp;gt;office side) Physical layer entity (PHY) as 
     * specified in 802.3 Clause 75
     *
     */
    _10GbasePrD4(58, "10-gbase-pr-d4"),
    
    /**
     * One single-mode fiber 10.3125 GBd continuous downstream / burst mode upstream 
     * Optical Network Unit (ONU=&amp;gt;customer side) Physical layer entity (PHY) as 
     * specified in 802.3 Clause 75
     *
     */
    _10GbasePrU1(59, "10-gbase-pr-u1"),
    
    /**
     * One single-mode fiber 10.3125 GBd continuous downstream / burst mode upstream 
     * Optical Network Unit (ONU=&amp;gt;customer side) Physical layer entity (PHY) as 
     * specified in 802.3 Clause 75
     *
     */
    _10GbasePrU2(60, "10-gbase-pr-u2"),
    
    /**
     * One single-mode fiber 10.3125 GBd continuous downstream / burst mode upstream 
     * Optical Network Unit (ONU=&amp;gt;customer side) Physical layer entity (PHY) as 
     * specified in 802.3 Clause 75
     *
     */
    _10GbasePrU3(61, "10-gbase-pr-u3"),
    
    /**
     * One single-mode fiber 10.3125 GBd continuous downstream / burst mode upstream 
     * Optical Network Unit (ONU=&amp;gt;customer side) Physical layer entity (PHY) as 
     * specified in 802.3 Clause 75
     *
     */
    _10GbasePrU4(62, "10-gbase-pr-u4"),
    
    /**
     * Multi-lane PCS as specified in 802.3 Clause 82 over undefined Physical Medium 
     * Attachment (PMA) and Physical Medium Dependent (PMD). Not to be configured and 
     * only to be returned when underlying PMD unknown
     *
     */
    _40GbaseR(63, "40-gbase-r"),
    
    /**
     * 40GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over an electrical backplane Physical Medium Dependent (PMD) as specified in 
     * 802.3 Clause 84
     *
     */
    _40GbaseKr4(64, "40-gbase-kr4"),
    
    /**
     * 40GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over 4 lane shielded copper balanced cable Physical Medium Dependent (PMD) as 
     * specified in 802.3 Clause 85
     *
     */
    _40GbaseCr4(65, "40-gbase-cr4"),
    
    /**
     * 40GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over 4 lane multimode fiber Physical Medium Dependent (PMD) as specified in 
     * 802.3 Clause 86
     *
     */
    _40GbaseSr4(66, "40-gbase-sr4"),
    
    /**
     * 4 times 10GBASE-S compatible to 802.3 Clause 52 over 4 lane multimode fiber
     *
     */
    _4X10GbaseSr(67, "4-x10-gbase-sr"),
    
    /**
     * 40GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over 4 WDM lane single mode fiber Physical Medium Dependent (PMD), with long 
     * reach, as specified in 802.3 Clause 87
     *
     */
    _40GbaseLr4(68, "40-gbase-lr4"),
    
    /**
     * 40GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over 4 WDM lane single mode fiber Physical Medium Dependent (PMD), with extended
     * reach, as specified in 802.3 Clause 87
     *
     */
    _40GbaseEr4(69, "40-gbase-er4"),
    
    /**
     * 40GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over single mode fiber Physical Medium Dependent (PMD) as specified in 802.3 
     * Clause 89
     *
     */
    _40GbaseFr(70, "40-gbase-fr"),
    
    /**
     * Multi-lane PCS as specified in 802.3 Clause 82 over undefined 100GBASE-R or 
     * 100GBASE-P Physical Medium Attachment (PMA) and Physical Medium Dependent (PMD).
     * Not to be configured and only to be returned when underlying PMD unknown
     *
     */
    _100GbaseR(71, "100-gbase-r"),
    
    /**
     * 100GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over 4 lane shielded copper balanced cable Physical Medium Dependent (PMD) as 
     * specified in 802.3 Clause 92
     *
     */
    _100GbaseCr4(72, "100-gbase-cr4"),
    
    /**
     * 100GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over an electrical backplane Physical Medium Dependent (PMD) as specified in 
     * 802.3 Clause 93
     *
     */
    _100GbaseKr4(73, "100-gbase-kr4"),
    
    /**
     * 100GBASE-P Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over an electrical backplane Physical Medium Dependent (PMD) as specified in 
     * 802.3 Clause 94
     *
     */
    _100GbaseKp4(74, "100-gbase-kp4"),
    
    /**
     * 100GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over 10 lane shielded copper balanced cable Physical Medium Dependent (PMD) as 
     * specified in 802.3 Clause 85
     *
     */
    _100GbaseCr10(75, "100-gbase-cr10"),
    
    /**
     * 100GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over 4 lane multimode fiber Physical Medium Dependent (PMD) as specified in 
     * 802.3 Clause 95
     *
     */
    _100GbaseSr4(76, "100-gbase-sr4"),
    
    /**
     * 100GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over 10 lane multimode fiber Physical Medium Dependent (PMD) as specified in 
     * 802.3 Clause 86
     *
     */
    _100GbaseSr10(77, "100-gbase-sr10"),
    
    /**
     * 2 times 40GBASE-S compatible to 802.3 Clause 86 over 10 lane multimode fiber
     *
     */
    _2X40GbaseSr(78, "2-x40-gbase-sr"),
    
    /**
     * 10 times 10GBASE-S compatible to 802.3 Clause 52 over 10 lane multimode fiber
     *
     */
    _10X10GbaseSr(79, "10-x10-gbase-sr"),
    
    /**
     * 12 times 10GBASE-S compatible to 802.3 Clause 52 over 12 lane multimode fiber
     *
     */
    _12X10GbaseSr(80, "12-x10-gbase-sr"),
    
    /**
     * 100GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over 4 WDM lane single mode fiber Physical Medium Dependent (PMD), with long 
     * reach, as specified in 802.3 Clause 88
     *
     */
    _100GbaseLr4(81, "100-gbase-lr4"),
    
    /**
     * 100GBASE-R Physical Coding Sublayer (PCS) and Physical Medium Attachment (PMA) 
     * over 4 WDM lane single mode fiber Physical Medium Dependent (PMD), with extended
     * reach, as specified in 802.3 Clause 88
     *
     */
    _100GbaseEr4(82, "100-gbase-er4"),
    
    /**
     * none
     *
     */
    NotYetDefined(83, "not-yet-defined")
    ;

    private static final java.util.Map<java.lang.Integer, PmdNameType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, PmdNameType> b = com.google.common.collect.ImmutableMap.builder();
        for (PmdNameType enumItem : PmdNameType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private PmdNameType(int value, java.lang.String name) {
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
     * @return corresponding PmdNameType item
     */
    public static PmdNameType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
