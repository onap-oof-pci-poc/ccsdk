package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the configuration for the control 
 * portions of a CDMA2000 FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-cdma2000-g {
 *     leaf home-domain {
 *         type string;
 *     }
 *     leaf remote-ip-access-enable {
 *         type boolean;
 *     }
 *     leaf pm-config {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-cdma2000-g</i>
 *
 */
public interface FapControlCdma2000G
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-g").intern();

    /**
     * A string containing one of operator's home domains in URI format. FAP is 
     * preconfigured with a default home domain, which can be overwritten later by ACS.
     * See {{bibref|3GPP2-X.S0059}}. If the''.ManagementServer.URL'' is null, then the 
     * FAP shall use the value of this attribute to construct the 
     * ''.ManagementServer.URL'' attribute. If 
     * {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} is null, then the FAP shall 
     * use the value of this attribute to construct the 
     * {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} attribute. If the FAP is 
     * unable to connect to the management server indicated by the value of the 
     * ''.ManagementServer.URL'' attribute and this attribute is not null, the FAP may 
     * use the value of this attribute to construct the ''.ManagementServer.URL'' 
     * attribute. If the FAP is unable to connect to any security gateway indicated by 
     * the value of the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}}, 
     * {{param|.FAPControl.CDMA2000.Gateway.SecGWServer2}}, and 
     * {{param|.FAPControl.CDMA2000.Gateway.SecGWServer3}} attributes and this 
     * attribute is not null, the FAP may use the value of this attribute to construct 
     * the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} attribute.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>homeDomain</code>, or <code>null</code> if not present
     */
    java.lang.String getHomeDomain();
    
    /**
     * Enable or disable remote IP access service as defined in 
     * {{bibref|3GPP2-X.S0059}}. If {{true}} remote IP access is enabled. If {{false}} 
     * remove IP access is disabled.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>remoteIpAccessEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isRemoteIpAccessEnable();
    
    /**
     * The value MUST be the path name of a row in the ''.FAP.PerfMgmt.Config.'' table.
     * This is the performance management related configuration for the CDMA2000 FAP. 
     * In case of a multiple-radio-technology FAP product, each radio technology can 
     * have its own PM configuration or share a common PM configuration. In the former 
     * case, {{param}} can contain a unique instance number. In the latter case, 
     * {{param}} under all radio technologies can have the same instance number. If the
     * referenced object is deleted, the parameter value MUST be set to an empty 
     * string.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>pmConfig</code>, or <code>null</code> if not present
     */
    java.lang.String getPmConfig();

}

