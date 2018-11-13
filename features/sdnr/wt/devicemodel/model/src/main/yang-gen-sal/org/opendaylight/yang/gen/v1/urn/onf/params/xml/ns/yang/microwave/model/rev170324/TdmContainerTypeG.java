package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping tdm-container-type-g {
 *     leaf tdm-container-name {
 *         type tdm-container-name;
 *     }
 *     leaf tdm-container-size {
 *         type tdm-container-size;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/tdm-container-type-g</i>
 *
 */
public interface TdmContainerTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "tdm-container-type-g").intern();

    /**
     * Names to be chosen from the following list: 
     * 'e1','t1','j1','e3','t3','stm1','cpri1','cpri2','cpri3','cpri4','cpri5','cpri6' 
     * or 'cpri7'
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tdmContainerName</code>, or <code>null</code> if not present
     */
    java.lang.String getTdmContainerName();
    
    /**
     * Capacity required for transporting this type of container (in kbit/s). Values to
     * be chosen from the following list: '2048','1544','34000','44736 
     * ','155520','614400','1228800','2457600','3072000','4915200','6144000' or 
     * '9830400;
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>tdmContainerSize</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTdmContainerSize();

}

