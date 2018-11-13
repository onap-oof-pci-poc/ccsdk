package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000G;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000Hrpd;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Rem;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.CDMA2000.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-cdma2000 {
 *     leaf in-service-handling {
 *         type enumeration;
 *     }
 *     leaf scan-on-boot {
 *         type boolean;
 *     }
 *     leaf scan-now {
 *         type boolean;
 *     }
 *     leaf return-timer {
 *         type return-timer;
 *     }
 *     leaf scan-periodically {
 *         type boolean;
 *     }
 *     leaf periodic-interval {
 *         type periodic-interval;
 *     }
 *     leaf periodic-time {
 *         type date-and-time;
 *     }
 *     leaf report-overheads {
 *         type enumeration;
 *     }
 *     leaf scan-timeout {
 *         type scan-timeout;
 *     }
 *     leaf scan-status {
 *         type enumeration;
 *     }
 *     leaf error-details {
 *         type string;
 *     }
 *     leaf last-scan-time {
 *         type date-and-time;
 *     }
 *     container rem-cdma2000-one-x {
 *         leaf max-cell-entries {
 *             type uint64;
 *         }
 *         leaf cell-number-of-entries {
 *             type uint64;
 *         }
 *         leaf max-channel-entries {
 *             type uint64;
 *         }
 *         leaf channel-number-of-entries {
 *             type uint64;
 *         }
 *         list rem-cdma2000-one-x-channel {
 *             key "sniffing-band-class" "sniffing-channel-number";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf sniffing-band-class {
 *                 type uint8;
 *             }
 *             leaf sniffing-channel-number {
 *                 type uint16;
 *             }
 *             leaf-list pn-list {
 *                 type string;
 *             }
 *             uses rem-cdma2000-one-x-channel-g;
 *         }
 *         list rem-cdma2000-one-x-cell {
 *             key "rem-cdma2000-one-x-cell-key";
 *             leaf rem-cdma2000-one-x-cell-key {
 *                 type string;
 *             }
 *             container rem-cdma2000-one-x-cell-rf {
 *                 leaf band {
 *                     type int64;
 *                 }
 *                 leaf rfcnfl {
 *                     type uint16;
 *                 }
 *                 leaf io {
 *                     type io;
 *                 }
 *                 leaf p-ilot-pn {
 *                     type p-ilot-pn;
 *                 }
 *                 leaf p-ilot-pn-phase {
 *                     type p-ilot-pn-phase;
 *                 }
 *                 leaf pilot-strength-ecp {
 *                     type pilot-strength-ecp;
 *                 }
 *                 leaf pilot-strength-ecp-io {
 *                     type pilot-strength-ecp-io;
 *                 }
 *                 leaf overheads-available {
 *                     type boolean;
 *                 }
 *                 uses rem-cdma2000-one-x-cell-rf-g;
 *             }
 *             container rem-cdma2000-one-x-cell-control-channel {
 *                 leaf sid {
 *                     type int64;
 *                 }
 *                 leaf nid {
 *                     type int64;
 *                 }
 *                 leaf regzone {
 *                     type int64;
 *                 }
 *                 leaf baselat {
 *                     type int64;
 *                 }
 *                 leaf baselong {
 *                     type int64;
 *                 }
 *                 leaf mcc {
 *                     type int64;
 *                 }
 *                 leaf mncimsi1112 {
 *                     type int64;
 *                 }
 *                 leaf baseid {
 *                     type int64;
 *                 }
 *                 leaf apid {
 *                     type string;
 *                 }
 *                 leaf apidmask {
 *                     type int64;
 *                 }
 *                 leaf apidtext {
 *                     type string;
 *                 }
 *                 uses rem-cdma2000-one-x-cell-control-channel-g;
 *             }
 *             uses rem-cdma2000-one-x-cell-g;
 *         }
 *         uses rem-cdma2000-one-x-g;
 *     }
 *     container rem-cdma2000-hrpd {
 *         leaf max-cell-entries {
 *             type uint64;
 *         }
 *         leaf cell-number-of-entries {
 *             type uint64;
 *         }
 *         leaf max-channel-entries {
 *             type uint64;
 *         }
 *         leaf channel-number-of-entries {
 *             type uint64;
 *         }
 *         list rem-cdma2000-hrpd-channel {
 *             key "sniffing-band-class" "sniffing-channel-number";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf sniffing-band-class {
 *                 type uint8;
 *             }
 *             leaf sniffing-channel-number {
 *                 type uint16;
 *             }
 *             leaf-list pn-list {
 *                 type string;
 *             }
 *             uses rem-cdma2000-hrpd-channel-g;
 *         }
 *         list rem-cdma2000-hrpd-cell {
 *             key "rem-cdma2000-hrpd-cell-key";
 *             leaf rem-cdma2000-hrpd-cell-key {
 *                 type string;
 *             }
 *             container rem-cdma2000-hrpd-cell-rf {
 *                 leaf band {
 *                     type int64;
 *                 }
 *                 leaf rfcnfl {
 *                     type uint16;
 *                 }
 *                 leaf io {
 *                     type io;
 *                 }
 *                 leaf p-ilot-pn {
 *                     type p-ilot-pn;
 *                 }
 *                 leaf p-ilot-pn-phase {
 *                     type p-ilot-pn-phase;
 *                 }
 *                 leaf pilot-strength-ecp {
 *                     type pilot-strength-ecp;
 *                 }
 *                 leaf pilot-strength-ecp-io {
 *                     type pilot-strength-ecp-io;
 *                 }
 *                 leaf overheads-available {
 *                     type boolean;
 *                 }
 *                 uses rem-cdma2000-hrpd-cell-rf-g;
 *             }
 *             container rem-cdma2000-hrpd-cell-control-channel {
 *                 leaf color-code {
 *                     type int64;
 *                 }
 *                 leaf sector-id {
 *                     type binary;
 *                 }
 *                 leaf subnet-mask {
 *                     type subnet-mask;
 *                 }
 *                 leaf country-code {
 *                     type int64;
 *                 }
 *                 leaf latitude {
 *                     type latitude;
 *                 }
 *                 leaf longitude {
 *                     type longitude;
 *                 }
 *                 uses rem-cdma2000-hrpd-cell-control-channel-g;
 *             }
 *             uses rem-cdma2000-hrpd-cell-g;
 *         }
 *         uses rem-cdma2000-hrpd-g;
 *     }
 *     container rem-cdma2000-macro-timing {
 *         leaf admin-state {
 *             type uint8;
 *         }
 *         leaf tracking-channel-number {
 *             type uint64;
 *         }
 *         leaf tracking-band-class {
 *             type uint8;
 *         }
 *         leaf-list tracking-pn-offset {
 *             type string;
 *         }
 *         leaf timing-source {
 *             type uint8;
 *         }
 *         leaf channel-number-of-entries {
 *             type uint64;
 *         }
 *         list rem-cdma2000-macro-timing-channel {
 *             key "band-class" "channel-number";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf air-interface-type {
 *                 type uint8;
 *             }
 *             leaf band-class {
 *                 type uint8;
 *             }
 *             leaf channel-number {
 *                 type uint64;
 *             }
 *             leaf priority {
 *                 type uint64;
 *             }
 *             leaf-list pn-list {
 *                 type string;
 *             }
 *             uses rem-cdma2000-macro-timing-channel-g;
 *         }
 *         uses rem-cdma2000-macro-timing-g;
 *     }
 *     uses rem-cdma2000-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000Builder}.
 * @see RemCdma2000Builder
 *
 */
public interface RemCdma2000
    extends
    ChildOf<Rem>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000>,
    RemCdma2000G
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000").intern();

    /**
     * Container for object class FAPService.{i}.REM.CDMA2000.OneX.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX</code> <code>remCdma2000OneX</code>, or <code>null</code> if not present
     */
    RemCdma2000OneX getRemCdma2000OneX();
    
    /**
     * Container for object class FAPService.{i}.REM.CDMA2000.HRPD.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000Hrpd</code> <code>remCdma2000Hrpd</code>, or <code>null</code> if not present
     */
    RemCdma2000Hrpd getRemCdma2000Hrpd();
    
    /**
     * Container for object class FAPService.{i}.REM.CDMA2000.MacroTiming.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming</code> <code>remCdma2000MacroTiming</code>, or <code>null</code> if not present
     */
    RemCdma2000MacroTiming getRemCdma2000MacroTiming();

}

