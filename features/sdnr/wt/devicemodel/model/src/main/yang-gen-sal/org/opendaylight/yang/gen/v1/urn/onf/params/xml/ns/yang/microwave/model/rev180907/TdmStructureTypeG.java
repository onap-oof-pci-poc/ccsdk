package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping tdm-structure-type-g {
 *     leaf tdm-structure-name {
 *         type string;
 *     }
 *     leaf tdm-segment-size {
 *         type tdm-segment-size;
 *     }
 *     leaf max-number-of-segments-reservable {
 *         type max-number-of-segments-reservable;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/tdm-structure-type-g</i>
 *
 */
public interface TdmStructureTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "tdm-structure-type-g").intern();

    /**
     * Names to be chosen from the following list: 
     * 'e1','t1','j1','e3','ds3','stm1','cpri1','cpri2','cpri3','cpri4','cpri5','cpri6'
     * or 'cpri7'
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tdmStructureName</code>, or <code>null</code> if not present
     */
    java.lang.String getTdmStructureName();
    
    /**
     * Size of the TDM segment in kbit/s. Values to be chosen from the following list: 
     * '2048','1544','34000','44736 
     * ','155520','614400','1228800','2457600','3072000','4915200','6144000' or 
     * '9830400;
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>tdmSegmentSize</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTdmSegmentSize();
    
    /**
     * Device specific maximum number of segments (not depending on current air 
     * interface configuration) that can be reserved for this type of segment on a 
     * single air interface.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>maxNumberOfSegmentsReservable</code>, or <code>null</code> if not present
     */
    java.lang.Byte getMaxNumberOfSegmentsReservable();

}

