package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping local-pac-g {
 *     list local-id {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     leaf uuid {
 *         type universal-id;
 *     }
 *     list extension {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     leaf operational-state {
 *         type operational-state;
 *     }
 *     leaf administrative-control {
 *         type administrative-control;
 *     }
 *     leaf administrative-state {
 *         type administrative-state;
 *     }
 *     leaf lifecycle-state {
 *         type lifecycle-state;
 *     }
 *     list name {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     list label {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/local-pac-g</i>
 *
 */
public interface LocalPacG
    extends
    DataObject,
    LocalClassG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "local-pac-g").intern();


}

