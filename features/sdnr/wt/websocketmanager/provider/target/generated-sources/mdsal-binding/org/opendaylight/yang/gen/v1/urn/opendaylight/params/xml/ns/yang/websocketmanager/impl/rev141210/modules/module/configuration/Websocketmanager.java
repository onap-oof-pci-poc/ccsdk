package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.impl.rev141210.modules.module.configuration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.impl.rev141210.modules.module.configuration.websocketmanager.Broker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>websocketmanager-impl</b>
 * <pre>
 * case websocketmanager {
 *     container broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:websocketmanager:impl?revision=2014-12-10)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>websocketmanager-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:websocketmanager:impl?revision=2014-12-10)websocketmanager</i>
 *
 */
public interface Websocketmanager
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.impl.rev141210.modules.module.configuration.Websocketmanager>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:websocketmanager:impl",
        "2014-12-10", "websocketmanager").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.impl.rev141210.modules.module.configuration.websocketmanager.Broker</code> <code>broker</code>, or <code>null</code> if not present
     */
    Broker getBroker();

}

