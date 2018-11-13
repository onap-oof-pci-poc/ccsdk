package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to the RAN-level configuration.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-g {
 *     leaf-list ura-list {
 *         type uint16;
 *     }
 *     leaf ura-in-use {
 *         type uint16;
 *     }
 *     leaf rncid {
 *         type uint16;
 *     }
 *     leaf cell-id {
 *         type uint32;
 *     }
 *     leaf t-rat-c {
 *         type t-rat-c;
 *     }
 *     leaf t-raf-c {
 *         type t-raf-c;
 *     }
 *     leaf n-raf-c {
 *         type uint64;
 *     }
 *     leaf tig-or {
 *         type tig-or;
 *     }
 *     leaf tin-tr {
 *         type tin-tr;
 *     }
 *     leaf t-data-fwd {
 *         type t-data-fwd;
 *     }
 *     leaf t-reloc-prep {
 *         type t-reloc-prep;
 *     }
 *     leaf t-reloc-overall {
 *         type t-reloc-overall;
 *     }
 *     leaf hnbid-realm {
 *         type string;
 *     }
 *     leaf hs-flag {
 *         type boolean;
 *     }
 *     leaf hs-enable {
 *         type boolean;
 *     }
 *     leaf num-of-hspdsc-hs {
 *         type uint8;
 *     }
 *     leaf num-of-hsscc-hs {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-g</i>
 *
 */
public interface UmtsRanG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-g").intern();

    /**
     * {{list}} Each item is a URA (UTRAN Registration Area) to which the FAP belongs. 
     * The order of the URA values has no significance. {{bibref|3GPP-TS.25.331|Section
     * 10.3.2.6}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>uraList</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getUraList();
    
    /**
     * The URA being used by the FAP. Self-configuration for URA is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability 
     * perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} 
     * from an enabled perspective. If the FAP's self-configuration capability for URA 
     * is available and enabled, this parameter indicates the value selected by the FAP
     * among the choices provided in {{param|URAList}}. If the self-configuration 
     * capability is not available or not enabled, then this parameter contains the 
     * first URA value in {{param|URAList}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>uraInUse</code>, or <code>null</code> if not present
     */
    java.lang.Integer getUraInUse();
    
    /**
     * RNC-ID allocated to the FAP. It uniquely identifies an RNC within a PLMN. 
     * Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the
     * value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used 
     * in RANAP. The RNC-ID and Extended RNC-ID are combined into a single parameter 
     * here as there is no explicit need to have them separated. 
     * {{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rncid</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRncid();
    
    /**
     * Cell Identity. {{bibref|3GPP-TS.25.401|Section 6.1.5}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cellId</code>, or <code>null</code> if not present
     */
    java.lang.Long getCellId();
    
    /**
     * Guard period in {{units}} before sending a "RANAP:RESET ACKNOWLEDGE" message 
     * towards the Femto GW. {{bibref|3GPP-TS.25.413|Section 9.5}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>tRatC</code>, or <code>null</code> if not present
     */
    BigInteger getTRatC();
    
    /**
     * Maximum amount of time in {{units}} that the FAP SHOULD wait for receiving a 
     * "RANAP:RESET ACKNOWLEDGE" message from the Femto GW after sending a Reset to the
     * Femto GW. {{bibref|3GPP-TS.25.413|Section 9.5}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>tRafC</code>, or <code>null</code> if not present
     */
    BigInteger getTRafC();
    
    /**
     * Maximum number for RESET procedure that can be repeated in FAP. 
     * {{bibref|3GPP-TS.25.413|Section 8.26.3.2}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>nRafC</code>, or <code>null</code> if not present
     */
    BigInteger getNRafC();
    
    /**
     * Amount of time in {{units}} used to determine when the additional level of 
     * traffic reduction in CN overload SHOULD take place. While this timer is running 
     * all OVERLOAD messages or signalling pointing to congested information received 
     * by the FAP are ignored. {{bibref|3GPP-TS.25.413|Section 9.5}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>tigOr</code>, or <code>null</code> if not present
     */
    BigInteger getTigOr();
    
    /**
     * Amount of time in {{units}} used to determine when the CN overload can be 
     * considered cleared. While this timer is running, the FAP is not allowed to 
     * increase traffic. {{bibref|3GPP-TS.25.413|Section 9.5}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>tinTr</code>, or <code>null</code> if not present
     */
    BigInteger getTinTr();
    
    /**
     * Maximum amount of time in {{units}} for Data Forwarding at FAP. Timer is started
     * when a "RANAP:SRNS Data Forward Command" message (or a "RANAP:Relocation 
     * Command" message) is received. At timer expiry the "SRNS Data Forwarding" 
     * procedure is completed. {{bibref|3GPP-TS.25.413|Section 9.5}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>tDataFwd</code>, or <code>null</code> if not present
     */
    BigInteger getTDataFwd();
    
    /**
     * Maximum amount of time in {{units}} for the Relocation Preparation procedure. 
     * Timer is started when a "RANAP:Relocation Required" message is sent. Timer is 
     * stopped when a "RANAP:Relocation Command" or a "RANAP:Relocation Preparation 
     * Failure" message is received. {{bibref|3GPP-TS.25.413|Section 9.5}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>tRelocPrep</code>, or <code>null</code> if not present
     */
    BigInteger getTRelocPrep();
    
    /**
     * Maximum amount of time in {{units}} for protection of the overall Relocation 
     * procedure. Timer is started when a "RANAP:Relocation Command" message is 
     * received. Timer is stopped when a "RANAP:Iu Release Command" is received or the 
     * relocation procedure is cancelled. {{bibref|3GPP-TS.25.413|Section 9.5}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>tRelocOverall</code>, or <code>null</code> if not present
     */
    BigInteger getTRelocOverall();
    
    /**
     * The "realm" portion of the HNB-ID where HNB-ID is defined in 
     * {{bibref|3GPP-TS.25.469}} and is shown as follows: 
     * 0&amp;lt;IMSI&amp;gt;@&amp;lt;realm&amp;gt; Or 
     * 1&amp;lt;OUI&amp;gt;-&amp;lt;SerialNumber&amp;gt;@&amp;lt;realm&amp;gt; The 
     * other identifiers before "@" are device dependent values. Both 
     * &amp;lt;OUI&amp;gt; and &amp;lt;SerialNumber&amp;gt; are defined in 
     * {{bibref|TR-069a2|Table 36}}. &amp;lt;IMSI&amp;gt; is obtained from the USIM if 
     * it is equipped in the FAP.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>hnbidRealm</code>, or <code>null</code> if not present
     */
    java.lang.String getHnbidRealm();
    
    /**
     * Enables/disables the HSDPA function in the FAP. If {{true}} HSDPA is enabled 
     * (this is equivalent to a "1" in {{bibref|3GPP-TS.32.642|Section 6.3.9}}) If 
     * {{false}} HSDPA is disabled (this is equivalent to a "0" in 
     * {{bibref|3GPP-TS.32.642|Section 6.3.9}})
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>hsFlag</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHsFlag();
    
    /**
     * Enables or disables HSDPA in the cell. If {{true}} HSDPA is enabled (this is 
     * equivalent to a "1" in {{bibref|3GPP-TS.32.642|Section 6.3.9}}) If {{false}} 
     * HSDPA is not enabled (this is equivalent to a "0" in 
     * {{bibref|3GPP-TS.32.642|Section 6.3.9}}) If {{param|HSFlag}} is {{false}} then 
     * this value MUST be {{false}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>hsEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHsEnable();
    
    /**
     * The number of codes at the defined spreading factor (SF=16), within the complete
     * code tree. {{bibref|3GPP-TS.32.642|Section 6.3.9}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>numOfHspdscHs</code>, or <code>null</code> if not present
     */
    java.lang.Short getNumOfHspdscHs();
    
    /**
     * The number of HS-SCCHs for one cell. {{bibref|3GPP-TS.32.642|Section 6.3.9}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numOfHssccHs</code>, or <code>null</code> if not present
     */
    BigInteger getNumOfHssccHs();

}

