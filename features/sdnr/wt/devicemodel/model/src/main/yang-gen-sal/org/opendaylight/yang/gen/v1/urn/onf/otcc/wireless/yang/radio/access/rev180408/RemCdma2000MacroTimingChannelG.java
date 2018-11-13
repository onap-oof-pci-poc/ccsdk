package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * Object used to configure list of channels to be used for Macto Timing.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-cdma2000-macro-timing-channel-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf air-interface-type {
 *         type uint8;
 *     }
 *     leaf band-class {
 *         type uint8;
 *     }
 *     leaf channel-number {
 *         type uint64;
 *     }
 *     leaf priority {
 *         type uint64;
 *     }
 *     leaf-list pn-list {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-cdma2000-macro-timing-channel-g</i>
 *
 */
public interface RemCdma2000MacroTimingChannelG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-macro-timing-channel-g").intern();

    /**
     * Enables or disables the {{object}} entry.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnable();
    
    /**
     * {{datatype|expand}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>alias</code>, or <code>null</code> if not present
     */
    java.lang.String getAlias();
    
    /**
     * Air interface type of the configured Band class and Channel. 0 - 1x, 1 - HRPD.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>airInterfaceType</code>, or <code>null</code> if not present
     */
    java.lang.Short getAirInterfaceType();
    
    /**
     * Bandclass of the Macro timing channel.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>bandClass</code>, or <code>null</code> if not present
     */
    java.lang.Short getBandClass();
    
    /**
     * Macro timing acquisition channel.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>channelNumber</code>, or <code>null</code> if not present
     */
    BigInteger getChannelNumber();
    
    /**
     * Priority of the channle to use for acquisition. FAP should prioritize lower 
     * values over higher.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>priority</code>, or <code>null</code> if not present
     */
    BigInteger getPriority();
    
    /**
     * {{list}} Each item is a (single value) PN offset in units of 64 PN chips or 
     * PNrange expressed in the following format: 
     * &amp;lt;Start-value&amp;gt;".."&amp;lt;End-value&amp;gt;:&amp;lt;Increment&amp;gt;
     * If an empty string, then no specific PNList is provided, meaning that the FAP is
     * required to pick a PN list to scan on its own.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pnList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getPnList();

}

