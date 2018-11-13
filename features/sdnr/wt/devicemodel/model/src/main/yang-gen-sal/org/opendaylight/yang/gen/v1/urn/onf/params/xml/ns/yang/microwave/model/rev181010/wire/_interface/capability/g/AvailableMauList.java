package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of Medium Attachment Units (MAUs) that are available for being selected. 
 * rate and service configuration (e.g. SFF-8079) are not supported, the MAU 
 * determined by hardware shall be described.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list available-mau-list {
 *     key "mau-id";
 *     leaf mau-id {
 *         type universal-id;
 *     }
 *     leaf mii-kind {
 *         type mii-kind;
 *     }
 *     leaf mdi-kind {
 *         type mdi-kind;
 *     }
 *     leaf required-medium-kind {
 *         type required-medium-kind;
 *     }
 *     leaf-list wavelength-min {
 *         type wavelength-min;
 *     }
 *     leaf-list wavelength-max {
 *         type wavelength-max;
 *     }
 *     leaf wavelength-grid-min {
 *         type wavelength-grid-min;
 *     }
 *     leaf link-length-max {
 *         type link-length-max;
 *     }
 *     leaf vendor-name {
 *         type vendor-name;
 *     }
 *     leaf vendor-oui {
 *         type vendor-oui;
 *     }
 *     leaf part-number {
 *         type part-number;
 *     }
 *     leaf revision-number {
 *         type revision-number;
 *     }
 *     leaf serial-number {
 *         type serial-number;
 *     }
 *     leaf date-code {
 *         type date-code;
 *     }
 *     leaf-list pmd-list {
 *         type pmd-name-type;
 *     }
 *     list signal-ordering-list {
 *         key "signal-ordering-kind-name";
 *         leaf signal-ordering-kind-name {
 *             type string;
 *         }
 *         leaf-list signal-list {
 *             type string;
 *         }
 *         uses signal-ordering-type-g;
 *     }
 *     leaf auto-signal-ordering-is-avail {
 *         type auto-signal-ordering-is-avail;
 *     }
 *     leaf short-reach-mode-is-avail {
 *         type short-reach-mode-is-avail;
 *     }
 *     leaf eee-is-avail {
 *         type eee-is-avail;
 *     }
 *     leaf unidirectional-operation-is-avail {
 *         type unidirectional-operation-is-avail;
 *     }
 *     leaf-list supported-alarms {
 *         type string;
 *     }
 *     uses mau-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-capability-g/available-mau-list</i>
 *
 * <p>To create instances of this class use {@link AvailableMauListBuilder}.
 * @see AvailableMauListBuilder
 * @see AvailableMauListKey
 *
 */
public interface AvailableMauList
    extends
    ChildOf<WireInterfaceCapabilityG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList>,
    MauTypeG,
    Identifiable<AvailableMauListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "available-mau-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AvailableMauListKey getKey();

}

