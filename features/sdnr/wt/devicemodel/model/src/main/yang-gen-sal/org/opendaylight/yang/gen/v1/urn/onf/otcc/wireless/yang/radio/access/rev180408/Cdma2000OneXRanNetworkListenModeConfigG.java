package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to self-configuration of the 
 * MaxFAPTxPower of the FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-network-listen-mode-config-g {
 *     leaf rfcnfl-margin {
 *         type uint64;
 *     }
 *     leaf fap-coverage-target {
 *         type string;
 *     }
 *     leaf fap-beacon-coverage-target {
 *         type string;
 *     }
 *     leaf max-coverage-edge-pilot-strength {
 *         type max-coverage-edge-pilot-strength;
 *     }
 *     leaf max-allowable-pilot-strength-degradation {
 *         type max-allowable-pilot-strength-degradation;
 *     }
 *     leaf-list rfcnfl-to-protect {
 *         type string;
 *     }
 *     leaf fap-allowed-adj-chan-coverage-hole {
 *         type fap-allowed-adj-chan-coverage-hole;
 *     }
 *     leaf acir {
 *         type acir;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-network-listen-mode-config-g</i>
 *
 */
public interface Cdma2000OneXRanNetworkListenModeConfigG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-network-listen-mode-config-g").intern();

    /**
     * If self-configuration of RFCNFL is enabled, this value indicates the total 
     * received signal strength margin to be applied to the entries in RFCNFL when the 
     * FAP decides on the RFCNInUse in order to bias the selection of the most 
     * preferred frequency.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rfcnflMargin</code>, or <code>null</code> if not present
     */
    BigInteger getRfcnflMargin();
    
    /**
     * Defines the target value measured in dB for the range of the FAP's FL coverage, 
     * in terms of RF propagation loss. This value can be used by the FAP's 
     * selfconfiguration algorithms to help derive transmit power levels in the 
     * presence of co-channel and adjacent channel interference. {{param}} is expressed
     * as a range of the minimum coverage path loss and the maximum coverage path loss 
     * with ".." (two periods) between the minimum and maximum values, i.e., 
     * "&amp;lt;FAPCoverageTarget_min&amp;gt;..&amp;lt;FAPCoverageTarget_max&amp;gt;". 
     * These values can be used by the FAP's selfconfiguration algorithms to help 
     * derive transmit power levels in the presence of co-channel and adjacent channel 
     * interference. &amp;lt;FAPCoverageTarget_min&amp;gt; and 
     * &amp;lt;FAPCoverageTarget_max&amp;gt; are measured in dB and have a range of 
     * [50,150] incremented by 1 dB.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>fapCoverageTarget</code>, or <code>null</code> if not present
     */
    java.lang.String getFapCoverageTarget();
    
    /**
     * Defines the target value measured in dB for the range of the FAP's FL Beacon 
     * coverage, in terms of RF propagation loss. This value can be used by the FAP's 
     * selfconfiguration algorithms to help derive beacon transmit power levels. 
     * {{param}} is expressed as a range of the minimum coverage path loss and the 
     * maximum coverage path loss with ".." (two periods) between the minimum and 
     * maximum values, i.e., 
     * "&amp;lt;BeaconCoverageTarget_min&amp;gt;..&amp;lt;BeaconCoverageTarget_max&amp;gt;".
     * These values can be used by the FAP's selfconfiguration algorithms to help 
     * derive transmit power levels for the beacon(s) in the presence of co-channel and
     * adjacent channel interference." &amp;lt;BeaconCoverageTarget_min&amp;gt; and 
     * &amp;lt;BeaconCoverageTarget_max&amp;gt; are measured in dB and have a range of 
     * [50,150] incremented by 1 dB.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>fapBeaconCoverageTarget</code>, or <code>null</code> if not present
     */
    java.lang.String getFapBeaconCoverageTarget();
    
    /**
     * The maximum strength of the received pilot energy per chip, Ec, to total 
     * received spectral density, Io (signal and noise) desired for FAP users at the 
     * edge of the FAP coverage target in units of {{units}}. This value can be used by
     * the FAP's self configuration algorithms to help prevent aggressive transmit 
     * power level settings .
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxCoverageEdgePilotStrength</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxCoverageEdgePilotStrength();
    
    /**
     * The maximum amount in dB by which the strength of the received pilot energy per 
     * chip, Ec, to total received spectral density, Io (signal and noise) for alien 
     * users can be degraded in the presence of FAP interference at the edge of FAP 
     * coverage, in {{units}} units.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxAllowablePilotStrengthDegradation</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxAllowablePilotStrengthDegradation();
    
    /**
     * {{list}} Each item is a FL RFCN corresponding to a CDMA2000 carrier that is 
     * adjacent to the RFCNFLInUse to be protected from adjacent channel interference. 
     * If any of the items in the list are adjacent to the FAP's own FL channel, the 
     * FAP MUST take the PilotStrength and total received power spectral density (Io) 
     * measured on these channels into account as part of its maximum transmit power 
     * selfconfiguration. The RFCNs in the list can belong to any operator, allowing 
     * for protection of the FAP operator's own macro layer as well as that of other 
     * operators. The list should take into account the ability of the FAP to 
     * self-configure its own FL RFCN and so SHOULD include any channels (requiring 
     * protection) which can potentially be adjacent to the RFCN selected by the FAP. 
     * For example, if only adjacent operator protection is needed and the FAP has the 
     * ability to self-configure to any channel owned by its operator, this list would 
     * be populated with the RFCNs immediately above and below the range of channels 
     * owned by the FAP operator. If an empty string then it indicates that there are 
     * no channels adjacent to the FAP that require protection, or that 
     * self-configuration of the FAP transmit power is not enabled.
     *
     *
     *
     * @return <code>java.util.List</code> <code>rfcnflToProtect</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getRfcnflToProtect();
    
    /**
     * Defines the maximum allowed coverage hole created on carriers listed in 
     * RFCNFLToProtect by the FAP transmission, measured in {{units}}, in terms of RF 
     * propagation loss such that the {{param|MaxAllowablePilotStrengthDegradation}} is
     * maintained outside the {{param}} for MS on that {{param|RFCNFLToProtect}}. This 
     * value can be used by the FAP's self configuration algorithms to help derive 
     * transmit power levels.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>fapAllowedAdjChanCoverageHole</code>, or <code>null</code> if not present
     */
    java.lang.Short getFapAllowedAdjChanCoverageHole();
    
    /**
     * AdjacentChannelInterferenceRatio value in {{units}} to be used when determining 
     * the coverage hole created on adjacent channels due to leakage.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>acir</code>, or <code>null</code> if not present
     */
    BigInteger getAcir();

}

