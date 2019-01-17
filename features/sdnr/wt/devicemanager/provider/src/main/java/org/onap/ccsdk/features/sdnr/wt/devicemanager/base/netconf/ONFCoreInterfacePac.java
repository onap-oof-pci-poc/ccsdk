/**
 *
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf;

/**
 * @author herbert
 *
 */
public class ONFCoreInterfacePac<T> {


    Class<T> myClass;

    ONFCoreInterfacePac( Class<T> myClass ) {
        this.myClass = myClass;
    }


}
