package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>devicemanager-api</b>
 * <pre>
 * container input {
 *     leaf mountpoint-name {
 *         type string;
 *     }
 *     leaf object-id-ref {
 *         type string;
 *     }
 *     leaf problem-name {
 *         type string;
 *     }
 *     leaf test-date {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/test-maintenance-mode/input</i>
 *
 * <p>To create instances of this class use {@link TestMaintenanceModeInputBuilder}.
 * @see TestMaintenanceModeInputBuilder
 *
 */
public interface TestMaintenanceModeInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.TestMaintenanceModeInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "input").intern();

    /**
     * mountpoint for test
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mountpointName</code>, or <code>null</code> if not present
     */
    java.lang.String getMountpointName();
    
    /**
     * object id for test
     *
     *
     *
     * @return <code>java.lang.String</code> <code>objectIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getObjectIdRef();
    
    /**
     * problem for test
     *
     *
     *
     * @return <code>java.lang.String</code> <code>problemName</code>, or <code>null</code> if not present
     */
    java.lang.String getProblemName();
    
    /**
     * point in time used for the test
     *
     *
     *
     * @return <code>java.lang.String</code> <code>testDate</code>, or <code>null</code> if not present
     */
    java.lang.String getTestDate();

}

