package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the S1-U configuration.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-s1-u-g {
 *     leaf gtpu-echo-interval {
 *         type gtpu-echo-interval;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-s1-u-g</i>
 *
 */
public interface LteRanS1UG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-s1-u-g").intern();

    /**
     * Defines the interval in {{units}} between each GTP-U Echo Request that LTE FAP 
     * sends to the GTP-U peer, as specified in {{bibref|3GPP-TS.29.281|Section 
     * 7.2.1}}. If the value of {{param}} is equal to 0, then this functionality is 
     * supressed and thus LTE FAP does not send GTP-U Echo Request. If there is no 
     * GTP-U path in use, then no Echo Request is sent regardless of the value of 
     * {{param}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>gtpuEchoInterval</code>, or <code>null</code> if not present
     */
    java.lang.Short getGtpuEchoInterval();

}

