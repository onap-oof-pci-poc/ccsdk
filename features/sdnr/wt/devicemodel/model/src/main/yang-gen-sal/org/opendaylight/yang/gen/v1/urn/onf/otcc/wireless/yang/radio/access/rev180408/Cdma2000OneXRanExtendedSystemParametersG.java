package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * The object used for configuring extended system parameter messages for 1x
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-extended-system-parameters-g {
 *     leaf prev {
 *         type uint8;
 *     }
 *     leaf p-min-rev {
 *         type uint8;
 *     }
 *     leaf delete-for-tmsi {
 *         type uint8;
 *     }
 *     leaf use-tmsi {
 *         type uint8;
 *     }
 *     leaf pref-msid-type {
 *         type uint8;
 *     }
 *     leaf mcc {
 *         type uint16;
 *     }
 *     leaf imsi1112 {
 *         type uint8;
 *     }
 *     leaf tmsi-zone-len {
 *         type uint8;
 *     }
 *     leaf tmsi-zone {
 *         type uint16;
 *     }
 *     leaf bcast-index {
 *         type uint8;
 *     }
 *     leaf imsit-supported {
 *         type int64;
 *     }
 *     leaf soft-slope {
 *         type uint8;
 *     }
 *     leaf add-intercept {
 *         type add-intercept;
 *     }
 *     leaf drop-intercept {
 *         type drop-intercept;
 *     }
 *     leaf max-num-alt-so {
 *         type uint8;
 *     }
 *     leaf reselected-included {
 *         type uint8;
 *     }
 *     leaf ec-thresh {
 *         type ec-thresh;
 *     }
 *     leaf ec-io-thresh {
 *         type uint64;
 *     }
 *     leaf pilot-report {
 *         type uint8;
 *     }
 *     leaf nghbr-set-entry-info {
 *         type uint8;
 *     }
 *     leaf access-ho-order {
 *         type uint8;
 *     }
 *     leaf nghbr-set-access-info {
 *         type uint8;
 *     }
 *     leaf access-ho {
 *         type uint8;
 *     }
 *     leaf access-ho-msg-rsp {
 *         type uint8;
 *     }
 *     leaf access-probe-ho {
 *         type uint8;
 *     }
 *     leaf acc-ho-list-upd {
 *         type uint8;
 *     }
 *     leaf acc-probe-ho-other-msg {
 *         type uint8;
 *     }
 *     leaf max-num-probe-ho {
 *         type uint8;
 *     }
 *     leaf brdcast-gps-assit {
 *         type uint8;
 *     }
 *     leaf qpch-supported {
 *         type uint8;
 *     }
 *     leaf num-qpch {
 *         type uint8;
 *     }
 *     leaf qpch-rate {
 *         type uint8;
 *     }
 *     leaf qpch-pwr-level-page {
 *         type uint8;
 *     }
 *     leaf qpc-hcci-supported {
 *         type uint8;
 *     }
 *     leaf qpch-pwr-level-config {
 *         type uint8;
 *     }
 *     leaf sdb-supported {
 *         type uint8;
 *     }
 *     leaf r-lgain-traffic-pilot {
 *         type r-lgain-traffic-pilot;
 *     }
 *     leaf rvs-pwr-ctrl-delay-incl {
 *         type uint8;
 *     }
 *     leaf rvs-pwr-ctrl-delay {
 *         type rvs-pwr-ctrl-delay;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-extended-system-parameters-g</i>
 *
 */
public interface Cdma2000OneXRanExtendedSystemParametersG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-extended-system-parameters-g").intern();

    /**
     * protocol revision
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>prev</code>, or <code>null</code> if not present
     */
    java.lang.Short getPrev();
    
    /**
     * minimum protocol revision
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pMinRev</code>, or <code>null</code> if not present
     */
    java.lang.Short getPMinRev();
    
    /**
     * Delete Foreign TMSI. The base station shall set this field to '1' to cause the 
     * mobile station to delete its TMSI if the TMSI was assigned in a different TMSI 
     * zone from that specified by the TMSI_ZONE field of this message; otherwise, the 
     * base station shall set this field to '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>deleteForTmsi</code>, or <code>null</code> if not present
     */
    java.lang.Short getDeleteForTmsi();
    
    /**
     * Use TMSI indicator. The base station shall set this field to the value shown 
     * next field corresponding to the type of MSID that the mobile station is to use 
     * on the Access Channel.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>useTmsi</code>, or <code>null</code> if not present
     */
    java.lang.Short getUseTmsi();
    
    /**
     * Preferred Access Channel Mobile Station Identifier Type. F294. The base station 
     * shall set this field to the value shown as below corresponding to the type of 
     * MSDI that the mobile station is to use on the Access Channel. [useTMSI] 
     * [prefMSIDType] [description] 0 00 IMSI_S and ESN 0 10 IMSI 0 11 IMSI and ESN 1 
     * 10 TMSI; IMSI 1 11 TMSI; IMSI and ESN
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>prefMsidType</code>, or <code>null</code> if not present
     */
    java.lang.Short getPrefMsidType();
    
    /**
     * Mobile Country Code. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>mcc</code>, or <code>null</code> if not present
     */
    java.lang.Integer getMcc();
    
    /**
     * 11th and 12th digits of IMSI. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>imsi1112</code>, or <code>null</code> if not present
     */
    java.lang.Short getImsi1112();
    
    /**
     * TMSI zone length. The base station shall set this field to the number of octets 
     * included in the TMSI_ZONE. The base station shall set this field to a value in 
     * the range 1 to 8 inclusive.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tmsiZoneLen</code>, or <code>null</code> if not present
     */
    java.lang.Short getTmsiZoneLen();
    
    /**
     * TMSI zone. The base station shall set this field to the TMSI zone number as 
     * specified in {{bibref|3GPP2-N.S0010}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>tmsiZone</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTmsiZone();
    
    /**
     * Broadcast slot cycle index. To enable periodic broadcast paging, the base 
     * station shall set this field to and unsigned 3-bit number in the range 1-7, 
     * equal to the broadcast slot cycle index. To disable periodic broadcast paging, 
     * the base station shall set this field to '000'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>bcastIndex</code>, or <code>null</code> if not present
     */
    java.lang.Short getBcastIndex();
    
    /**
     * 1: IMISI_T is supported, 0: IMSI_T is not supported. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>imsitSupported</code>, or <code>null</code> if not present
     */
    java.lang.Long getImsitSupported();
    
    /**
     * The slope in the inequality criterion for adding a pilot to the Active Set, or 
     * dropping a pilot from the Active Set. The base station shall set this field as 
     * an unsigned binary number.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>softSlope</code>, or <code>null</code> if not present
     */
    java.lang.Short getSoftSlope();
    
    /**
     * The intercept in the inequality criterion for adding a pilot to the Active Set. 
     * The base station shall set this field as a two's complement signed binary 
     * number, in units of {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>addIntercept</code>, or <code>null</code> if not present
     */
    java.lang.Short getAddIntercept();
    
    /**
     * The intercept in the inequality criterion for dropping a pilot from the Active 
     * Set. The base station shall set this field as a two's complement signed binary 
     * number, in units of {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>dropIntercept</code>, or <code>null</code> if not present
     */
    java.lang.Short getDropIntercept();
    
    /**
     * Maximum number of alternative service options. The base station shall set this 
     * field to the maximum number of alternative service option numbers that the 
     * mobile station is allowed to include in the Origination Message or the Page 
     * Response Message. For mobile stations with MOB_P_REVs less than seven, the 
     * alternative service options are those service options defined in TSB-58B and 
     * related to SERVICE_OPTION in Origination Message and the Page Response Message. 
     * For mobile stations with MOB_P_REVs equal to or greater than seven, the 
     * alternative service options are those service options defined in TSB-58B without
     * service group number assigned and related to SERVICE_OPTION in Origination 
     * Message and the Page Response Message. The base station sets this field to a 
     * value greater than zero, in addition, the base station shall allow the mobile 
     * station with MOB_P_REVs equal to or greater than 7 to include - a 4 or 8-bit 
     * service option bitmap in the Origination Message and the Page Response Message; 
     * - alternative service option numbers, not limited to MAX_ALT_SO_NUM, in the 
     * Enhanced Origination Message.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxNumAltSo</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxNumAltSo();
    
    /**
     * System reselection parameters included. If the base station is including system 
     * reselection parameters, the base station shall set this field to '1'; otherwise,
     * the base station shall set this field to '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>reselectedIncluded</code>, or <code>null</code> if not present
     */
    java.lang.Short getReselectedIncluded();
    
    /**
     * Pilot power threshold. If RESELECTINCLUDED is set to '1', the base station shall
     * include the field EC_THRESH and set this field to: [ (pilot_power_threshold + 
     * 115 ) ] where pilot_power_threshold is the pilot power, Ec, in {{units}}/1.23 
     * MHz, below which the mobile station is to perform system reselection; otherwise,
     * the base station shall omit this field.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>ecThresh</code>, or <code>null</code> if not present
     */
    BigInteger getEcThresh();
    
    /**
     * Pilot Ec / Io threshold. If RESELECTINCLUDED is set to '1', the base station 
     * shall include the field EC_I0_THRESH and set this field to: [ - 20 x log10 
     * (pilot_threshold) ] where pilot_threshold is the pilot Ec/Io below which the 
     * mobile station is to perform system reselection; otherwise, the base station 
     * shall omit this field.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>ecIoThresh</code>, or <code>null</code> if not present
     */
    BigInteger getEcIoThresh();
    
    /**
     * Pilot reporting indicator. The base station shall set this field to '1' if the 
     * mobile station is to report the additional pilots which have pilot strength 
     * exceeding T_ADD in all Access Channel messages. The base station shall set this 
     * field to '0' if the mobile station is to report the additional pilots which have
     * pilot strengths exceeding T_ADD only in the Origination Message and the Page 
     * Response Message.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pilotReport</code>, or <code>null</code> if not present
     */
    java.lang.Short getPilotReport();
    
    /**
     * Neighbor Set access entry handoff information included indicator. If the base 
     * station is including information on the Neighbor Set access entry handoff, the 
     * base station shall set this field to '1'; otherwise, the base station shall set 
     * this field to '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>nghbrSetEntryInfo</code>, or <code>null</code> if not present
     */
    java.lang.Short getNghbrSetEntryInfo();
    
    /**
     * Access entry handoff permitted indicator. If NghbrSetEntryInfo is set to '1', 
     * the base station shall set this field to '1' if the mobile station is permitted 
     * to perform an access entry handoff after receiving a message while performing 
     * the Mobile Station Order and Message Processing Operation in the Mobile Station 
     * Idle State; otherwise, the base station shall set this field to '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>accessHoOrder</code>, or <code>null</code> if not present
     */
    java.lang.Short getAccessHoOrder();
    
    /**
     * Neighbor Set access handoff included indicator. If the base station is including
     * information on the Neighbor Set access handoff or access probe handoff, the base
     * station shall set this field to '1', otherwise, the base station shall set this 
     * field to '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>nghbrSetAccessInfo</code>, or <code>null</code> if not present
     */
    java.lang.Short getNghbrSetAccessInfo();
    
    /**
     * Access handoff permitted indicator. If NghbrSetEntryInfo is set to '1', the base
     * station shall set this field to '1' if the mobile station is permitted to 
     * perform an access handoff; otherwise, the base station shall set this field to 
     * '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>accessHo</code>, or <code>null</code> if not present
     */
    java.lang.Short getAccessHo();
    
    /**
     * Access handoff permitted for message response indicator. If AccessHO is set to 
     * '1', the base station shall include this field and set it as described below; 
     * otherwise, the base station shall omit this field. The base station shall set 
     * this field to '1' if the mobile station is permitted to perform an access 
     * handoff after receiving a message and before responding to that message in the 
     * System Access State; otherwise, the base station shall set this field to '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>accessHoMsgRsp</code>, or <code>null</code> if not present
     */
    java.lang.Short getAccessHoMsgRsp();
    
    /**
     * Access probe handoff permitted indicator. If NghbrSetEntryInfo is set to '1', 
     * the base station shall set this field to '1' if the base station is permitted to
     * perform an access probe handoff; otherwise, the base station shall set this 
     * field to '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>accessProbeHo</code>, or <code>null</code> if not present
     */
    java.lang.Short getAccessProbeHo();
    
    /**
     * Access handoff list update permitted indicator. If AccessProbeHO is included and
     * is set to '1', the base station shall set this field to '1' if the mobile 
     * station is permitted to update the access handoff list during an access attempt;
     * otherwise, the base station shall set this field to '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>accHoListUpd</code>, or <code>null</code> if not present
     */
    java.lang.Short getAccHoListUpd();
    
    /**
     * Access probe handoff permitted for messages other than the Origination Message 
     * and the Page Response Message. If AccessProbeHO is set to '1', the base station 
     * shall set this field to '1' if the mobile station is permitted to perform an 
     * access probe handoff for messages other than the Origination Message and the 
     * Page Response. The base station shall set this field to '0' if the mobile 
     * station is permitted to perform an access probe handoff only for the Origination
     * Message and the Page Response Message.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>accProbeHoOtherMsg</code>, or <code>null</code> if not present
     */
    java.lang.Short getAccProbeHoOtherMsg();
    
    /**
     * Maximum number of times that mobile station is permitted to perform an access 
     * probe handoff. If AccessProbeHO is set to '1', the base station shall set this 
     * field to the maximum number of times the mobile station is allowed to perform an
     * access probe handoff within an access attempt minus one.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxNumProbeHo</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxNumProbeHo();
    
    /**
     * If {{param}} is set to 1, then Braodcast GPS assist is supported. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>brdcastGpsAssit</code>, or <code>null</code> if not present
     */
    java.lang.Short getBrdcastGpsAssit();
    
    /**
     * Quick Paging Channel Supported Indication. If the base station supports Quick 
     * Paging Channel operation, the base station shall set this field to '1'; 
     * otherwise the base station shall set this field to '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qpchSupported</code>, or <code>null</code> if not present
     */
    java.lang.Short getQpchSupported();
    
    /**
     * Number of Quick Paging Channels. If the base station sets QPCHSUPPORTED to '1', 
     * the base station shall include this field and set it as described below; 
     * otherwise, the base station shall omit this field. The base station shall set 
     * this field to the number of Quick Paging Channels on this CDMA Channel. The base
     * station shall not set this field to '00'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>numQpch</code>, or <code>null</code> if not present
     */
    java.lang.Short getNumQpch();
    
    /**
     * Quick Paging Channel indicator rate. See {{bibref|3GPP2-C.S0005}}. {{param}} is 
     * set as follows: 0: 4800bps; 1: 9600bps.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qpchRate</code>, or <code>null</code> if not present
     */
    java.lang.Short getQpchRate();
    
    /**
     * Quick Paging Channel paging indicator transmit power level. {{param}} is set as 
     * follows: 0: 5 dB below; 1: 4 dB below; 2: 3 dB below; 3: 2 dB below; 4: 1 dB 
     * below; 5: Same; 6: 1 dB above; 7: 2dB above.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qpchPwrLevelPage</code>, or <code>null</code> if not present
     */
    java.lang.Short getQpchPwrLevelPage();
    
    /**
     * Quick Paging Channel configuration change indicator supported. {{param}} is set 
     * as follows: if the base station is to support configuration change indicators on
     * the Quick Paging Channel, {{param}} to '1'; otherwise {{param}} is set to '0'.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qpcHcciSupported</code>, or <code>null</code> if not present
     */
    java.lang.Short getQpcHcciSupported();
    
    /**
     * Quick Paging Channel configuration change indicator CONFIG transmit power level.
     * See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qpchPwrLevelConfig</code>, or <code>null</code> if not present
     */
    java.lang.Short getQpchPwrLevelConfig();
    
    /**
     * Short Data Burst supported indicator. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>sdbSupported</code>, or <code>null</code> if not present
     */
    java.lang.Short getSdbSupported();
    
    /**
     * Gain adjustment of the Reverse Traffic Channel relative to the Reverse Pilot 
     * Channel for Radio Configurations greater than 2. {{param}} is set to the 
     * correction factor to be used by mobile stations in setting the power of a 
     * reverse traffic channel, expressed as a two's complement value in units of 
     * {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>rLgainTrafficPilot</code>, or <code>null</code> if not present
     */
    java.lang.Short getRLgainTrafficPilot();
    
    /**
     * Reverse Power Control Delay included indicator. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>rvsPwrCtrlDelayIncl</code>, or <code>null</code> if not present
     */
    java.lang.Short getRvsPwrCtrlDelayIncl();
    
    /**
     * The reverse power control delay. {{param}} is setto the closed-loop reverse 
     * power control delay minus one (the closed-loop reverse power control delay is 
     * the time between the end of a gated-on reverse PCG and the beginning of the 
     * Forward Power Control Subchannel in units of {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>rvsPwrCtrlDelay</code>, or <code>null</code> if not present
     */
    java.lang.Short getRvsPwrCtrlDelay();

}

