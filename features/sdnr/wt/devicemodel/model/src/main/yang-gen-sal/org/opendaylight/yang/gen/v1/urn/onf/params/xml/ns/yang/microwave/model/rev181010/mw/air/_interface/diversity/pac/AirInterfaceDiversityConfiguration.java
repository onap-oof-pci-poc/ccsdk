package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwAirInterfaceDiversityPac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container air-interface-diversity-configuration {
 *     container air-interface-diversity {
 *         leaf diversity-name {
 *             type string;
 *         }
 *         leaf number-of-air-interfaces-max {
 *             type number-of-air-interfaces-max;
 *         }
 *         uses diversity-type-g;
 *     }
 *     leaf-list air-interface-ltp-list {
 *         type leafref;
 *     }
 *     leaf performance-monitoring-collection-is-on {
 *         type performance-monitoring-collection-is-on;
 *     }
 *     list threshold-cross-alarm-list {
 *         key "g826-value-kind" "granularity-period";
 *         leaf g826-value-kind {
 *             type g826-type;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf alarm-raising-threshold {
 *             type alarm-raising-threshold;
 *         }
 *         leaf alarm-clearing-threshold {
 *             type alarm-clearing-threshold;
 *         }
 *         uses threshold-cross-alarm-type-g;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type string;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses air-interface-diversity-problem-severity-type-g;
 *     }
 *     uses air-interface-diversity-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-air-interface-diversity-pac/air-interface-diversity-configuration</i>
 *
 * <p>To create instances of this class use {@link AirInterfaceDiversityConfigurationBuilder}.
 * @see AirInterfaceDiversityConfigurationBuilder
 *
 */
public interface AirInterfaceDiversityConfiguration
    extends
    ChildOf<MwAirInterfaceDiversityPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>,
    AirInterfaceDiversityConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "air-interface-diversity-configuration").intern();


}

