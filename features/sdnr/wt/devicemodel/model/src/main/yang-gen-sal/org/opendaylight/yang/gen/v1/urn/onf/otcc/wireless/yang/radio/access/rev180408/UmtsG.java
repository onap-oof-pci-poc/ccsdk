package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to configuring UMTS system specific 
 * information.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-g {
 *     leaf tunnel-instance {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-g</i>
 *
 */
public interface UmtsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-g").intern();

    /**
     * This is the reference to the IPsec tunnel instance used by the UMTS FAP. For all
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
     * @return <code>java.lang.String</code> <code>tunnelInstance</code>, or <code>null</code> if not present
     */
    java.lang.String getTunnelInstance();

}

