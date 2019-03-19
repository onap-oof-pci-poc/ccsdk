.. contents::
   :depth: 3
..

Frequently asked questions
==========================

--------------

Which browser should I use to operate Opendaylight SDN-R User interface?
------------------------------------------------------------------------

An actual version of `Google
Chromium <https://www.chromium.org/getting-involved/download-chromium>`__
or `Google
Chrome <https://www.google.de/search?q=chrome+download&oq=chrome+download&aqs=chrome..69i57j0l5.2718j0j4&sourceid=chrome&ie=UTF-8>`__
is recommended.

--------------

How to enable detailed logs in karaf for SDN-R applications
-----------------------------------------------------------

If you like to see more details in karaf logs for the NetConf
communication between ODL and NetConf servers (mediators/devices) please
invoke the following commands in the karaf console.

::

    # Logging settings (on)
    log:set DEBUG org.opendaylight.mwtn
    log:set TRACE org.opendaylight.netconf
    log:set TRACE com.highstreet.technologies.odl.app

Please note, setting the debug level to 'TRACE' may impact the
performance on the controller. In production environment make sure to
set back the debug level to 'INFO' as soon possible.

::

    # Logging settings (off)
    log:set INFO org.opendaylight.mwtn
    log:set INFO org.opendaylight.netconf
    log:set INFO com.highstreet.technologies.odl.app

--------------

Which commands should be used to analyse karaf logs?
----------------------------------------------------

::

    cd $ODL_KARAF_HOME/data/log
    rm *.txt
    grep -anr --include=*.log* "| ERROR |" . | grep 2018 >> 01-error.txt
    grep -anr --include=*.log* "RemoteDevice{" . | grep 2018 >> 02-devices.txt
    grep -anr --include=*.log* "RemoteDevice{" . | grep "Unable to build schema context, unsatisfied imports" | grep 2018 >> 03-schema-issue.txt
    grep -anr --include=*.log* "Matched request:" . | grep 2018 >> 04-matched-request.txt
    grep -anr --include=*.log* "network-element" . | grep 2018 >> 05-network-element.txt
    grep -anr --include=*.log* "urn:onf:params:xml:ns:yang:core-model" . | grep 2018 >> 06-core-module.txt
    grep -anr --include=*.log* "PerformanceManagerTask" . | grep 2018 >> 07-pm-tick.txt
    grep -anr --include=*.log* "Unable to read NE data for mountpoint" . | grep 2018 >> 08-unable-to-read.txt
    grep -anr --include=*.log* "LKCYFL79Q01M01MSS801" . | grep 2018 >> 09-LKCYFL79Q01M01MSS801.txt

--------------
