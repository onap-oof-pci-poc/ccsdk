package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list cdma2000-hrpd-batch-pcfpdsn {
 *     key "batch-table-number" "batch-table-security-parameter-index" "batch-table-secret-key";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf batch-table-number {
 *         type int64;
 *     }
 *     leaf batch-table-start-ip-address {
 *         type ip-address;
 *     }
 *     leaf batch-table-end-ip-address {
 *         type ip-address;
 *     }
 *     leaf batch-table-security-parameter-index {
 *         type uint32;
 *     }
 *     leaf batch-table-secret-key {
 *         type binary;
 *     }
 *     leaf batch-table-ios-version {
 *         type enumeration;
 *     }
 *     leaf batch-table-pdsn-admin-status {
 *         type int64;
 *     }
 *     leaf pdsn-type {
 *         type string;
 *     }
 *     uses cdma2000-hrpd-batch-pcfpdsn-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd/cdma2000-hrpd-batch-pcfpdsn</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdBatchPcfpdsnBuilder}.
 * @see Cdma2000HrpdBatchPcfpdsnBuilder
 * @see Cdma2000HrpdBatchPcfpdsnKey
 *
 */
public interface Cdma2000HrpdBatchPcfpdsn
    extends
    ChildOf<Cdma2000Hrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>,
    Cdma2000HrpdBatchPcfpdsnG,
    Identifiable<Cdma2000HrpdBatchPcfpdsnKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-batch-pcfpdsn").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsnKey</code> <code>key</code>, or <code>null</code> if not present
     */
    Cdma2000HrpdBatchPcfpdsnKey getKey();

}

