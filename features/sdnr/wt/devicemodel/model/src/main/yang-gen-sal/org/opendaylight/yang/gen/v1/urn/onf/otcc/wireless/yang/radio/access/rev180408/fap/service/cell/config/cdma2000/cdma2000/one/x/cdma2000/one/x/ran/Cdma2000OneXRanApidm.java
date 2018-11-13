package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanApidmG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APIDM.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-apidm {
 *     leaf association-type {
 *         type uint8;
 *     }
 *     leaf apidlen {
 *         type uint8;
 *     }
 *     leaf apid {
 *         type binary;
 *     }
 *     leaf apidmask {
 *         type uint8;
 *     }
 *     leaf iosmscid {
 *         type uint32;
 *     }
 *     leaf ioscellid {
 *         type uint16;
 *     }
 *     leaf intrafreqhohysincl {
 *         type boolean;
 *     }
 *     leaf intrafreqhohys {
 *         type uint8;
 *     }
 *     leaf intrafreqhoslopeincl {
 *         type boolean;
 *     }
 *     leaf intrafreqhoslope {
 *         type uint8;
 *     }
 *     leaf interfreqhohysincl {
 *         type boolean;
 *     }
 *     leaf interfreqhohys {
 *         type uint8;
 *     }
 *     leaf interfreqhoslopeincl {
 *         type boolean;
 *     }
 *     leaf interfreqhoslope {
 *         type uint8;
 *     }
 *     leaf interfreqsrchthincl {
 *         type boolean;
 *     }
 *     leaf interfreqsrchth {
 *         type uint8;
 *     }
 *     uses cdma2000-one-x-ran-apidm-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-apidm</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanApidmBuilder}.
 * @see Cdma2000OneXRanApidmBuilder
 *
 */
public interface Cdma2000OneXRanApidm
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanApidm>,
    Cdma2000OneXRanApidmG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-apidm").intern();


}

