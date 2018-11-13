package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This Pac contains the attributes associated with the ODU-CTP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * grouping otn-odu-connection-configuration-g {
 *     leaf-list tributary-slot-list {
 *         type uint64;
 *     }
 *     leaf tributary-port-number {
 *         type uint64;
 *     }
 *     leaf accepted-m-si {
 *         type string;
 *     }
 *     leaf opu-tributary-slot-size {
 *         type odu-slot-size;
 *     }
 *     leaf auto-payload-type {
 *         type boolean;
 *     }
 *     leaf configured-mapping-type {
 *         type mapping-type;
 *     }
 *     leaf configured-client-type {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/otn-odu-connection-configuration-g</i>
 *
 */
public interface OtnOduConnectionConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "otn-odu-connection-configuration-g").intern();

    /**
     * This attribute contains a set of distinct (i.e. unique)integers (e.g. 2, 3, 5, 
     * 9, 15 representing the tributaryslots TS2, TS3, TS5, TS9 and TS15) which 
     * represents theresources occupied by the Low Order ODU Link Connection(e.g. 
     * carrying an ODUflex with a bit rate of 6.25G).This attribute applies when the LO
     * ODU_ConnectionTerminationPointconnects with an HO ODU_TrailTerminationPoint 
     * object.It will not apply if this ODU_ConnectionTerminationPointobject directly 
     * connects to an OTU_TrailTerminationPointobject (i.e. OTU has no trib slots).The 
     * upper bound of the integer allowed in this set is afunction of the HO-ODU server
     * layer to which the ODUconnection has been mapped (adapted).Thus, for example, 
     * M=8/32/80 for ODU2/ODU3/ODU4 serverlayers (respectively). Note that the value of
     * thisattribute can be changed only in the case of ODUflex andhas to be through 
     * specific operations (i.e. not be changingthe attribute tributarySlotList 
     * directly).
     *
     *
     *
     * @return <code>java.util.List</code> <code>tributarySlotList</code>, or <code>null</code> if not present
     */
    List<BigInteger> getTributarySlotList();
    
    /**
     * This attribute identifies the tributary port number that isassociated with the 
     * ODU CTP.range of type : The value range depends on the size of theTributary Port
     * Number (TPN) field used which depends on thserver-layer ODU or OTU.In case of 
     * ODUk mapping into OTUk, there is no TPN field,so the tributaryPortNumber shall 
     * be zero.In case of LO ODUj mapping over ODU1, ODU2 or ODU3, the TPNis encoded in
     * a 6-bit field so the value range is 0-63.See clause 14.4.1/G.709-2016.In case of
     * LO ODUj mapping over ODU4, the TPN is encoded ina 7-bit field so the value range
     * is 0-127.See clause 14.4.1.4/G.709-2016.In case of ODUk mapping over ODUCn, the 
     * TPN is encoded in a14-bit field so the value range is 0-16383. See 
     * clause20.4.1.1/G.709-2016.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>tributaryPortNumber</code>, or <code>null</code> if not present
     */
    BigInteger getTributaryPortNumber();
    
    /**
     * This attribute is applicable when the ODU CTP objectinstance represents a lower 
     * order ODU1 or ODU2 CTP Sink atthe client layer of the ODU3P/ODU12 adaptation 
     * function orrepresents a lower order ODUj CTP Sink at the client layerof the 
     * ODUP/ODUj-21 adaptation function. This attribute isa 1-byte field that 
     * represents the accepted multiplexstructure of the adaptation function. 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>acceptedMSi</code>, or <code>null</code> if not present
     */
    java.lang.String getAcceptedMSi();
    
    /**
     * This attribute is applicable for ODU2 and ODU3 CTP only.[sko] Why that?It 
     * indicates the slot size of the ODU CTP.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduSlotSize</code> <code>opuTributarySlotSize</code>, or <code>null</code> if not present
     */
    OduSlotSize getOpuTributarySlotSize();
    
    /**
     * This attribute is applicable when the ODU CTP objectinstance represents a lower 
     * order ODU CTP Source at theclient layer of the ODUP/ODUj-21 adaptation function.
     * Thevalue of true of this attribute configures that theadaptation source function
     * shall fall back to the payloadtype PT=20 if the conditions specified in 
     * 14.3.10.1/G.798are satisfied. 
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>autoPayloadType</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAutoPayloadType();
    
    /**
     * This attributes indicates the configured mapping type.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.MappingType</code> <code>configuredMappingType</code>, or <code>null</code> if not present
     */
    MappingType getConfiguredMappingType();
    
    /**
     * This attribute configures the type of the client CTP of theserver ODU TTP.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>configuredClientType</code>, or <code>null</code> if not present
     */
    java.lang.String getConfiguredClientType();

}

