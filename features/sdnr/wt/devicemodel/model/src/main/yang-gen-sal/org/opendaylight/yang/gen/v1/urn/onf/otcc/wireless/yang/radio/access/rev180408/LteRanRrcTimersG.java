package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the RRC timers and constants (see 
 * {{bibref|3GPP-TS.32.592|Section 6.1.6.1}}) and (see 
 * {{bibref|3GPP-TS.32.592|Section 6.1.6.2}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-rrc-timers-g {
 *     leaf-list t300 {
 *         type uint16;
 *     }
 *     leaf-list t301 {
 *         type uint16;
 *     }
 *     leaf t302 {
 *         type t302;
 *     }
 *     leaf-list t304-eutra {
 *         type uint16;
 *     }
 *     leaf-list t304-irat {
 *         type uint16;
 *     }
 *     leaf-list t310 {
 *         type uint16;
 *     }
 *     leaf-list t311 {
 *         type uint16;
 *     }
 *     leaf t320 {
 *         type t320;
 *     }
 *     leaf n310 {
 *         type uint8;
 *     }
 *     leaf n311 {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-rrc-timers-g</i>
 *
 */
public interface LteRanRrcTimersG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-rrc-timers-g").intern();

    /**
     * {{list}} Each item is an interval, in milliseconds, between subsequent 
     * transmissions of RRCConnectionRequest. In case there is more than one item in 
     * the list, the first item contains the most preferred value. Corresponds to 
     * parameter t300 specified in UE-TimersAndConstants IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is 
     * defined in {{bibref|3GPP-TS.36.331|Section 7.3}}. If supports self-configuration
     * capability for {{param}} and more than one item is configured, then is expected 
     * to select one from the list and overwrite this parameter containing only the one
     * selected. If does not support self-configuration capability for {{param}} and 
     * more than one item is configured, then accepts the first value and ignore the 
     * rest. If only one item is configured regardless of the self-configuration 
     * capability of , accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>t300</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getT300();
    
    /**
     * {{list}} Each item is an interval, in milliseconds, between subsequent 
     * transmissions of RRCConnectionReestablishmentRequest. In case there is more than
     * one item in the list, the first item contains the most preferred value. 
     * Corresponds to parameter t301 specified in UE-TimersAndConstants IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is 
     * defined in {{bibref|3GPP-TS.36.331|Section 7.3}}. If supports self-configuration
     * capability for {{param}} and more than one item is configured, then is expected 
     * to select one from the list and overwrite this parameter containing only the one
     * selected. If does not support self-configuration capability for {{param}} and 
     * more than one item is configured, then accepts the first value and ignore the 
     * rest. If only one item is configured regardless of the self-configuration 
     * capability of , accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>t301</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getT301();
    
    /**
     * Time to wait in {{units}} for cell re-selection or RRConnectionSetup after 
     * RRCConnectionReject. Start/stop/expirary condition is defined in 
     * {{bibref|3GPP-TS.36.331|Section 7.3}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>t302</code>, or <code>null</code> if not present
     */
    java.lang.Integer getT302();
    
    /**
     * {{list}} Each item is a HO failure timer, in milliseconds. In case there is more
     * than one item in the list, the first item contains the most preferred value. 
     * Corresponds to t304 defined within IE MobilityControlInfo in 
     * RRCConnectionReconfiguration message in {{bibref|3GPP-TS.36.331|Section 5.3.5.4 
     * and Section 6.3.4}}. Start/stop/expirary condition is defined in 
     * {{bibref|3GPP-TS.36.331|Section 7.3}}. If supports self-configuration capability
     * for {{param}} and more than one item is configured, then is expected to select 
     * one from the list and overwrite this parameter containing only the one selected.
     * If does not support self-configuration capability for {{param}} and more than 
     * one item is configured, then accepts the first value and ignore the rest. If 
     * only one item is configured regardless of the self-configuration capability of ,
     * accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>t304Eutra</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getT304Eutra();
    
    /**
     * {{list}} Each item is a HO failure timer, in milliseconds. In case there is more
     * than one item in the list, the first item contains the most preferred value. 
     * Corresponds to t304 defined within IE CellChangeOrder in 
     * MobilityFromEUTRACommand message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. 
     * Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 
     * 7.3}}. If supports self-configuration capability for {{param}} and more than one
     * item is configured, then is expected to select one from the list and overwrite 
     * this parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>t304Irat</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getT304Irat();
    
    /**
     * {{list}} Each item is a RLF declaration timer, in milliseconds. In case there is
     * more than one item in the list, the first item contains the most preferred 
     * value. Corresponds to parameter t310 specified in RLF-TimersAndConstants IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is 
     * defined in {{bibref|3GPP-TS.36.331|Section 7.3}}. If supports self-configuration
     * capability for {{param}} and more than one item is configured, then is expected 
     * to select one from the list and overwrite this parameter containing only the one
     * selected. If does not support self-configuration capability for {{param}} and 
     * more than one item is configured, then accepts the first value and ignore the 
     * rest. If only one item is configured regardless of the self-configuration 
     * capability of , accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>t310</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getT310();
    
    /**
     * {{list}} Each item is a RLF recovery timer, in milliseconds. In case there is 
     * more than one item in the list, the first item contains the most preferred 
     * value. Corresponds to parameter t311 specified in RLF-TimersAndConstants IE in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is 
     * defined in {{bibref|3GPP-TS.36.331|Section 7.3}}. If supports self-configuration
     * capability for {{param}} and more than one item is configured, then is expected 
     * to select one from the list and overwrite this parameter containing only the one
     * selected. If does not support self-configuration capability for {{param}} and 
     * more than one item is configured, then accepts the first value and ignore the 
     * rest. If only one item is configured regardless of the self-configuration 
     * capability of , accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>t311</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getT311();
    
    /**
     * Time in {{units}} after RRCConnection Release in which cell re-selection 
     * priority info supplied in RRCConnectionRelease MUST be observed. 
     * Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 
     * 7.3}}. Corresponds to parameter t320 specified in RRCConnectionRelease message 
     * in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. S
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>t320</code>, or <code>null</code> if not present
     */
    java.lang.Short getT320();
    
    /**
     * Number of consecutive "out-of-sync" indications received from lower layers that 
     * triggers timer T310. Corresponds to parameter n310 specified in 
     * UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6 and Section 
     * 7.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>n310</code>, or <code>null</code> if not present
     */
    java.lang.Short getN310();
    
    /**
     * Number of consecutive "in-sync" indications received from lower layers that 
     * stops timer T310. Corresponds to parameter n311 specified in 
     * UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6 and Section 
     * 7.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>n311</code>, or <code>null</code> if not present
     */
    java.lang.Short getN311();

}

