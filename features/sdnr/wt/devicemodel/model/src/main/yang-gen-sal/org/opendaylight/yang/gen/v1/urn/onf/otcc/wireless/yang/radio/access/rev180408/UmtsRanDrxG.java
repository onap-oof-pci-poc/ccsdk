package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters related to DRX parameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-drx-g {
 *     leaf drx-cycle-length-coefficient-cs {
 *         type uint8;
 *     }
 *     leaf drx-cycle-length-coefficient-ps {
 *         type uint8;
 *     }
 *     leaf utrandrx-cycle-length-coefficient {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-drx-g</i>
 *
 */
public interface UmtsRanDrxG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-drx-g").intern();

    /**
     * Defines the DRX cycle length coefficient for CS domain to optimize paging in 
     * idle mode. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 10.3.3.6}}. {{param}}
     * refers to 'k' in the formula as specified in {{bibref|3GPP-TS.25.304}}, 
     * Discontinuous reception. Used by the CN CS domain to count paging occasions for 
     * discontinuous reception in Idle Mode. The duration of the DRX cycle is 2 
     * &amp;lt;power&amp;gt; k frames, where 'k' is the used DRX cycle length 
     * coefficient for CN.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>drxCycleLengthCoefficientCs</code>, or <code>null</code> if not present
     */
    java.lang.Short getDrxCycleLengthCoefficientCs();
    
    /**
     * Defines the DRX cycle length coefficient for PS domain to optimize paging in 
     * idle mode. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 10.3.3.6}}. {{param}}
     * refers to 'k' in the formula as specified in {{bibref|3GPP-TS.25.304}}, 
     * Discontinuous reception. Used by the CN PS domain to count paging occasions for 
     * discontinuous reception in Idle Mode. The duration of the DRX cycle is 2 
     * &amp;lt;power&amp;gt; k frames, where 'k' is the used DRX cycle length 
     * coefficient for CN.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>drxCycleLengthCoefficientPs</code>, or <code>null</code> if not present
     */
    java.lang.Short getDrxCycleLengthCoefficientPs();
    
    /**
     * Defines the DRX cycle length used by UTRAN to count paging occasions for 
     * discontinuous reception in Connected Mode. The duration of the DRX cycle is 2 
     * &amp;lt;power&amp;gt; k frames, where 'k' is the used DRX cycle length 
     * coefficient for UTRAN. {{param}} SHOULD be used by the UTRAN/FAP for UEs in 
     * Cell_PCH/Cell_FACH state. {{bibref|3GPP-TS.25.331|Section 10.3.3.49}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>utrandrxCycleLengthCoefficient</code>, or <code>null</code> if not present
     */
    java.lang.Short getUtrandrxCycleLengthCoefficient();

}

