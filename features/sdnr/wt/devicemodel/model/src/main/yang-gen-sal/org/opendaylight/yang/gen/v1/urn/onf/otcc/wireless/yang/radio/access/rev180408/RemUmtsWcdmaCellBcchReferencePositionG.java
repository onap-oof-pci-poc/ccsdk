package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object defines parameters related to the surface point of the ellipsoid. 
 * {{bibref|3GPP-TS.23.032|Section 5}} It is characterized by the co-ordinates of 
 * an ellipsoid point with altitude, distances, and an angle of orientation. This 
 * information is used to refer to a point on the Earth's surface, or close to the 
 * Earth's surface, with the same longitude and latitude.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-umts-wcdma-cell-bcch-reference-position-g {
 *     leaf latitude {
 *         type int64;
 *     }
 *     leaf longitude {
 *         type int64;
 *     }
 *     leaf uncertainty-semi-major {
 *         type uint8;
 *     }
 *     leaf uncertainty-semi-minor {
 *         type uint8;
 *     }
 *     leaf orientation-of-major-axis {
 *         type uint8;
 *     }
 *     leaf confidence {
 *         type confidence;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-umts-wcdma-cell-bcch-reference-position-g</i>
 *
 */
public interface RemUmtsWcdmaCellBcchReferencePositionG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-wcdma-cell-bcch-reference-position-g").intern();

    /**
     * This parameter specifies the latitude of the device's position in degrees, 
     * multiplied by 1 million. The positive value signifies the direction, north of 
     * the equator. The negative value signifies the direction, south of the equator. 
     * Range is from: 90.00.00' South (-90,000,000) to 90.00.00' North (90,000,000). 
     * Example: A latitude of 13.19.43' N would be represented as 13,323,833, derived 
     * as (13*1,000,000)+((19.43*1,000,000)/60). Latitude of 50.00.00' S would be 
     * represented as value -50,000,000. If 0 then SIB15 is not detected in the 
     * specific cell.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>latitude</code>, or <code>null</code> if not present
     */
    java.lang.Long getLatitude();
    
    /**
     * This parameter specifies the longitude of the device's position in degrees, 
     * multiplied by 1 million. The positive value signifies the direction, east of the
     * prime meridian. The negative value signifies the direction, west of the prime 
     * meridian. Range is from: 180.00.00' West (-180,000,000) to 180.00.00' East 
     * (180,000,000). Example: A longitude of 13.19.43' E would be represented as 
     * 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 
     * 50.00'0'' W would be represented as value -50,000,000. If 0 then SIB15 is not 
     * detected in the specific cell.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>longitude</code>, or <code>null</code> if not present
     */
    java.lang.Long getLongitude();
    
    /**
     * The uncertainty r is derived from the "uncertainty code" k by r = 10 x ( 1.1 
     * &amp;lt;power&amp;gt; (k-1) ) {{bibref|3GPP-TS.23.032|Section6.2}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>uncertaintySemiMajor</code>, or <code>null</code> if not present
     */
    java.lang.Short getUncertaintySemiMajor();
    
    /**
     * The uncertainty r is derived from the "uncertainty code" k by r = 10 x ( 1.1 
     * &amp;lt;power&amp;gt; (k-1) ) {{bibref|3GPP-TS.23.032|Section6.2}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>uncertaintySemiMinor</code>, or <code>null</code> if not present
     */
    java.lang.Short getUncertaintySemiMinor();
    
    /**
     * The Information Element (IE) value 'N' is derived by this formula: 2N &amp;lt;= 
     * a &amp;lt; 2(N+1) Where 'a' is the orientation in degrees (0..179).
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>orientationOfMajorAxis</code>, or <code>null</code> if not present
     */
    java.lang.Short getOrientationOfMajorAxis();
    
    /**
     * The degree of confidence in the ellipsoid's points expressed in {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>confidence</code>, or <code>null</code> if not present
     */
    java.lang.Short getConfidence();

}

