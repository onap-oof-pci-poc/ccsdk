package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object provides configurable parameters for 1x Handout
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-hard-handoff-g {
 *     leaf handout-enable {
 *         type boolean;
 *     }
 *     leaf ho-pilot-power-thresh {
 *         type ho-pilot-power-thresh;
 *     }
 *     leaf ho-pilot-duration {
 *         type ho-pilot-duration;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-hard-handoff-g</i>
 *
 */
public interface Cdma2000OneXRanHardHandoffG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-hard-handoff-g").intern();

    /**
     * Enabling handout operation.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>handoutEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHandoutEnable();
    
    /**
     * Pilot power threshold (in {{units}} relative to the FAP pilot power) for handout
     * declaration
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>hoPilotPowerThresh</code>, or <code>null</code> if not present
     */
    java.lang.Long getHoPilotPowerThresh();
    
    /**
     * Timethreshold for handout declaration (in {{units}})
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hoPilotDuration</code>, or <code>null</code> if not present
     */
    java.lang.Short getHoPilotDuration();

}

