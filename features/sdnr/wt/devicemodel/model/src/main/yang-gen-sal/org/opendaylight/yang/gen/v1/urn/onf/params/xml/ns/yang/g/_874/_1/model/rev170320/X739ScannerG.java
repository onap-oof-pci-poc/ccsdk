package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeState;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>g.874.1-model</b>
 * <pre>
 * grouping x.739-scanner-g {
 *     leaf scanner-id {
 *         type string;
 *     }
 *     leaf granularity-period {
 *         type granularity-period-type;
 *     }
 *     leaf administrative-state {
 *         type administrative-state;
 *     }
 *     leaf object-class {
 *         type object-identifier;
 *     }
 *     leaf name-binding {
 *         type object-identifier;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>g.874.1-model/x.739-scanner-g</i>
 *
 */
public interface X739ScannerG
    extends
    DataObject,
    X721TopG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:g.874.1-model",
        "2017-03-20", "x.739-scanner-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>scannerId</code>, or <code>null</code> if not present
     */
    java.lang.String getScannerId();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.GranularityPeriodType</code> <code>granularityPeriod</code>, or <code>null</code> if not present
     */
    GranularityPeriodType getGranularityPeriod();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeState</code> <code>administrativeState</code>, or <code>null</code> if not present
     */
    AdministrativeState getAdministrativeState();

}

