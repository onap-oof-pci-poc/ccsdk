package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APPIM.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-appim {
 *     leaf lifetime {
 *         type uint8;
 *     }
 *     leaf numappirec {
 *         type uint16;
 *     }
 *     leaf appirec-number-of-entries {
 *         type uint64;
 *     }
 *     list cdma2000-one-x-ran-appim-appirec {
 *         key "apsid" "apnid" "apband" "apfreq" "appnrectype" "appnreclen" "appnrec";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf apassntype {
 *             type uint8;
 *         }
 *         leaf apsidsameasprevious {
 *             type uint8;
 *         }
 *         leaf apnidsameasprevious {
 *             type uint8;
 *         }
 *         leaf apbandsameasprevious {
 *             type uint8;
 *         }
 *         leaf apfreqsameasprevious {
 *             type uint8;
 *         }
 *         leaf appnrecsameasprevious {
 *             type uint8;
 *         }
 *         leaf apsid {
 *             type uint16;
 *         }
 *         leaf apnid {
 *             type uint16;
 *         }
 *         leaf apband {
 *             type uint8;
 *         }
 *         leaf apfreq {
 *             type uint16;
 *         }
 *         leaf appnrectype {
 *             type uint8;
 *         }
 *         leaf appnreclen {
 *             type uint8;
 *         }
 *         leaf appnrec {
 *             type binary;
 *         }
 *         uses cdma2000-one-x-ran-appim-appirec-g;
 *     }
 *     uses cdma2000-one-x-ran-appim-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-appim</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanAppimBuilder}.
 * @see Cdma2000OneXRanAppimBuilder
 *
 */
public interface Cdma2000OneXRanAppim
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim>,
    Cdma2000OneXRanAppimG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-appim").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APPIM.APPIREC.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cdma2000OneXRanAppimAppirec</code>, or <code>null</code> if not present
     */
    List<Cdma2000OneXRanAppimAppirec> getCdma2000OneXRanAppimAppirec();

}

