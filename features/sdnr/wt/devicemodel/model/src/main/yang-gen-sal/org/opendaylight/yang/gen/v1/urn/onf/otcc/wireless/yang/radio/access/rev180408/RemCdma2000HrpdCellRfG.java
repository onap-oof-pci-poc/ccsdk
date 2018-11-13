package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * RF REM results for each detected cell.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-cdma2000-hrpd-cell-rf-g {
 *     leaf band {
 *         type int64;
 *     }
 *     leaf rfcnfl {
 *         type uint16;
 *     }
 *     leaf io {
 *         type io;
 *     }
 *     leaf p-ilot-pn {
 *         type p-ilot-pn;
 *     }
 *     leaf p-ilot-pn-phase {
 *         type p-ilot-pn-phase;
 *     }
 *     leaf pilot-strength-ecp {
 *         type pilot-strength-ecp;
 *     }
 *     leaf pilot-strength-ecp-io {
 *         type pilot-strength-ecp-io;
 *     }
 *     leaf overheads-available {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-cdma2000-hrpd-cell-rf-g</i>
 *
 */
public interface RemCdma2000HrpdCellRfG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-hrpd-cell-rf-g").intern();

    /**
     * CDMA band for the reported cell.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>band</code>, or <code>null</code> if not present
     */
    java.lang.Long getBand();
    
    /**
     * The Radio Frequency Channel Number (RFCN) in the FL direction for the reported 
     * cell.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rfcnfl</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRfcnfl();
    
    /**
     * The total received power spectral density in {{units}}, including signal and 
     * interference.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>io</code>, or <code>null</code> if not present
     */
    java.lang.Long getIo();
    
    /**
     * Pilot PN Offset (in units of {{units}}).
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>pIlotPn</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPIlotPn();
    
    /**
     * Pilot PN phase in {{units}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>pIlotPnPhase</code>, or <code>null</code> if not present
     */
    BigInteger getPIlotPnPhase();
    
    /**
     * The strength estimate of the received pilot energy per chip in {{units}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pilotStrengthEcp</code>, or <code>null</code> if not present
     */
    java.lang.Long getPilotStrengthEcp();
    
    /**
     * The strength estimate of the received pilot energy per chip, Ecp, to total 
     * received spectral density, Io (signal and noise) in {{units}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pilotStrengthEcpIo</code>, or <code>null</code> if not present
     */
    java.lang.Long getPilotStrengthEcpIo();
    
    /**
     * If set to {{true}}, the overhead messages for this particular cell is included 
     * in {{object|.REM.CDMA2000.HRPD.Cell.{i}.ControlChannel.}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>overheadsAvailable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isOverheadsAvailable();

}

