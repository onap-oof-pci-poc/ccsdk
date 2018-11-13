package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAppim;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAppimAppirecG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APPIM.APPIREC.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list cdma2000-one-x-ran-appim-appirec {
 *     key "apsid" "apnid" "apband" "apfreq" "appnrectype" "appnreclen" "appnrec";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf apassntype {
 *         type uint8;
 *     }
 *     leaf apsidsameasprevious {
 *         type uint8;
 *     }
 *     leaf apnidsameasprevious {
 *         type uint8;
 *     }
 *     leaf apbandsameasprevious {
 *         type uint8;
 *     }
 *     leaf apfreqsameasprevious {
 *         type uint8;
 *     }
 *     leaf appnrecsameasprevious {
 *         type uint8;
 *     }
 *     leaf apsid {
 *         type uint16;
 *     }
 *     leaf apnid {
 *         type uint16;
 *     }
 *     leaf apband {
 *         type uint8;
 *     }
 *     leaf apfreq {
 *         type uint16;
 *     }
 *     leaf appnrectype {
 *         type uint8;
 *     }
 *     leaf appnreclen {
 *         type uint8;
 *     }
 *     leaf appnrec {
 *         type binary;
 *     }
 *     uses cdma2000-one-x-ran-appim-appirec-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-appim/cdma2000-one-x-ran-appim-appirec</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanAppimAppirecBuilder}.
 * @see Cdma2000OneXRanAppimAppirecBuilder
 * @see Cdma2000OneXRanAppimAppirecKey
 *
 */
public interface Cdma2000OneXRanAppimAppirec
    extends
    ChildOf<Cdma2000OneXRanAppim>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirec>,
    Cdma2000OneXRanAppimAppirecG,
    Identifiable<Cdma2000OneXRanAppimAppirecKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-appim-appirec").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.appim.Cdma2000OneXRanAppimAppirecKey</code> <code>key</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanAppimAppirecKey getKey();

}

