package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains a table of all tunnel instances configured for the LTE FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-tunnel-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf tunnel-ref {
 *         type string;
 *     }
 *     leaf-list plmnid {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-tunnel-g</i>
 *
 */
public interface LteTunnelG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-tunnel-g").intern();

    /**
     * Enables or disables this entry.
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
     * This is the reference to an IPsec tunnel instance used by the LTE FAP. For all 
     * root data models, which use the tunnel definition provided in {{bibref|TR-262}} 
     * (InternetGatewayDevice:1 {{bibref|TR-098}} and Device:1 {{bibref|TR-181i1}}) the
     * {{param}} MUST point to a row in the 'FAP.Tunnel.IKESA.{i}.' table, defined in 
     * {{bibref|TR-262}}. If the root data model used is Device:2 {{bibref|TR-181i2}} 
     * than the {{param}} MUST point to IPsec tunnel instance defined in 
     * {{bibref|TR-181i2}}. If the referenced object is deleted, the parameter value 
     * MUST be set to an empty string. In case of a multiple-radio-technology FAP 
     * product, each radio technology can have its own tunnels or share common tunnels.
     * In the former case, {{param}} can contain a unique instance number. In the 
     * latter case, {{param}} under all radio technologies can have the same instance 
     * number.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tunnelRef</code>, or <code>null</code> if not present
     */
    java.lang.String getTunnelRef();
    
    /**
     * {{list}} Optional list of PLMM IDs associated with the tunnel, which can be used
     * for selecting the tunnel. Each PLMN ID consists of Mobile Country Code (MCC) and
     * Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}. 
     * Mobile Country Code consists of three digits and uniquely identifies the country
     * of domicile of the subscriber. Mobile Network Code consists of two or three 
     * digits and identifies the Home PLMN within a country. For a 2-digit MNC the 
     * total string length of {{param}} is 5.
     *
     *
     *
     * @return <code>java.util.List</code> <code>plmnid</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getPlmnid();

}

