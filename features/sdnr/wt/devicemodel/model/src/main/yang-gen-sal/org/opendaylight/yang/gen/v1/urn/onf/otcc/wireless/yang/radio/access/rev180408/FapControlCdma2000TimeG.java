package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters related to time syncronization with CDMA2000 
 * System Time (see {{bibref|3GPP2-C.S0005}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-cdma2000-time-g {
 *     leaf local-time-zone {
 *         type string;
 *     }
 *     leaf current-local-time {
 *         type string;
 *     }
 *     leaf leap-seconds {
 *         type leap-seconds;
 *     }
 *     leaf daylight-savings-used {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-cdma2000-time-g</i>
 *
 */
public interface FapControlCdma2000TimeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-time-g").intern();

    /**
     * The local time zone for CDMA2000 operational purposes. E.g., "+HH:MM JST" for 
     * Japan. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>localTimeZone</code>, or <code>null</code> if not present
     */
    java.lang.String getLocalTimeZone();
    
    /**
     * The current CDMA System Time (see {{bibref|3GPP2-C.S0005}}), expressed as date 
     * and time in the CPE's local time zone. The format of this field is 
     * "YYYY-MM-DDThh:mm:ss.sTZD" (e.g., 1997-07-16T19:20:30.45+01:00), where: YYYY = 
     * four-digit year MM = two-digit month (01=January, etc.) DD = two-digit day of 
     * month (01 through 31) hh = two digits of hour (00 through 23) (am/pm NOT 
     * allowed) mm = two digits of minute (00 through 59) ss = two digits of second (00
     * through 59) s = one or more digits representing a decimal fraction of a second 
     * TZD = time zone designator (Z or +hh:mm or -hh:mm)
     *
     *
     *
     * @return <code>java.lang.String</code> <code>currentLocalTime</code>, or <code>null</code> if not present
     */
    java.lang.String getCurrentLocalTime();
    
    /**
     * Number of leap seconds (in {{units}} to be applied between CurrentLocalTime and 
     * CDMA System Time. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>leapSeconds</code>, or <code>null</code> if not present
     */
    java.lang.Long getLeapSeconds();
    
    /**
     * Whether or not daylight savings time is in use in the FAP's local time zone with
     * respect to CDMA2000 System Time (see {{bibref|3GPP2-C.S0005}}). {true}} if 
     * daylight savings time is being used; otherwise {{false}}. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>daylightSavingsUsed</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isDaylightSavingsUsed();

}

