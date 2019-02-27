# Base sli alpine with added packages needed for open ecomp
FROM ${base.image.repo}
MAINTAINER CCSDK Team (onap-ccsdk@lists.onap.org)
# ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV ODL_HOME /opt/opendaylight
ENV SDNC_CONFIG_DIR /opt/onap/ccsdk/data/properties
ENV CCSDK_SLI_CORE_REPO mvn:org.onap.ccsdk.sli.core/ccsdk-sli-core-all/${ccsdk.sli.core.version}/xml/features
ENV CCSDK_SLI_ADAPTORS_REPO mvn:org.onap.ccsdk.sli.adaptors/ccsdk-sli-adaptors-all/${ccsdk.sli.adaptors.version}/xml/features
ENV CCSDK_FEATURES_REPO mvn:org.onap.ccsdk.features/ccsdk-features-all/${ccsdk.features.version}/xml/features
ENV CCSDK_SLI_NORTHBOUND_REPO mvn:org.onap.ccsdk.sli.northbound/ccsdk-sli-northbound-all/${ccsdk.sli.northbound.version}/xml/features
ENV CCSDK_SLI_PLUGINS_REPO mvn:org.onap.ccsdk.sli.plugins/ccsdk-sli-plugins-all/${ccsdk.sli.plugins.version}/xml/features
ENV ANSIBLE_GPG_KEY ${ansible.gpg.key}
ENV ODL_BOOT_FEATURES_EXTRA ${odl.boot.features.extra}

# ccsdk-features/sdnr specific
ENV CCSDK_SDNR_NORTHBOUND_REPO mvn:org.onap.ccsdk.features.sdnr.northbound/sdnr-northbound-all/${project.version}/xml/features
ENV CCSDK_SDNR_WT_REPO mvn:org.onap.ccsdk.features.sdnr.wt/sdnr-wt-feature-aggregator/${project.version}/xml/features
ENV CCSDK_SDNR_REPOLIST=${CCSDK_SDNR_NORTHBOUND_REPO},${CCSDK_SDNR_WT_REPO}

# copy CCSDK mvn artifacts to ODL repository
COPY system /tmp/system
RUN rsync -a /tmp/system $ODL_HOME && rm -rf /tmp/system

# Add CCSDK repositories to boot repositories
RUN cp $ODL_HOME/etc/org.apache.karaf.features.cfg $ODL_HOME/etc/org.apache.karaf.features.cfg.orig2
RUN sed -i -e "\|featuresRepositories|s|$|,${CCSDK_SDNR_REPOLIST}|"  $ODL_HOME/etc/org.apache.karaf.features.cfg
#RUN sed -i -e "\|featuresBoot[^a-zA-Z]|s|$|,${ODL_BOOT_FEATURES_EXTRA}|"  $ODL_HOME/etc/org.apache.karaf.features.cfg

RUN echo featuresBoot=config,standard,region,package,kar,ssh,management,odl-mdsal-all,odl-netconf-all,odl-netconf-connector-all,odl-restconf-all,odl-mdsal-apidocs,odl-daexim-all,ccsdk-sli-core-all,ccsdk-sli-adaptors-all,ccsdk-sli-northbound-all,ccsdk-sli-plugins-all,ccsdk-features-all,sdnr-wt-feature-aggregator >> $ODL_HOME/etc/org.apache.karaf.features.cfg

ENTRYPOINT /opt/onap/ccsdk/bin/startODL.sh
EXPOSE 2550 8085 8181 8185 9200 9300
