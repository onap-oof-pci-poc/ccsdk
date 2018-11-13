package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionHistoricalPerformancesG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * container otn-odu-connection-historical-performances {
 *     uses otn-odu-connection-historical-performances-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/otn-odu-connection-pac/otn-odu-connection-historical-performances</i>
 *
 * <p>To create instances of this class use {@link OtnOduConnectionHistoricalPerformancesBuilder}.
 * @see OtnOduConnectionHistoricalPerformancesBuilder
 *
 */
public interface OtnOduConnectionHistoricalPerformances
    extends
    ChildOf<OtnOduConnectionPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionHistoricalPerformances>,
    OtnOduConnectionHistoricalPerformancesG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "otn-odu-connection-historical-performances").intern();


}

