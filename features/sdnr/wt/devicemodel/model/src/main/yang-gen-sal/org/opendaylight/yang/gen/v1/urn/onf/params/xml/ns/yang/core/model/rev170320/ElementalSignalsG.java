package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping elemental-signals-g {
 *     leaf-list pin {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/elemental-signals-g</i>
 *
 */
public interface ElementalSignalsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "elemental-signals-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>pin</code>, or <code>null</code> if not present
     */
    List<ToBeDefined> getPin();

}

