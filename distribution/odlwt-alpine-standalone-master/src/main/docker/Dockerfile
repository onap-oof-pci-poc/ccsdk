# Base odl alpine with added packages needed for
FROM ${base.image.repo}
MAINTAINER CCSDK Team (onap-ccsdk@lists.onap.org)
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV ODL_HOME /opt/opendaylight
ENV SDNC_CONFIG_DIR /opt/onap/ccsdk/data/properties
ENV ANSIBLE_GPG_KEY ${ansible.gpg.key}

# ccsdk-features/sdnr specific
ENV CCSDK_SDNR_NORTHBOUND_REPO mvn:org.onap.ccsdk.features.sdnr.northbound/sdnr-northbound-all/${project.version}/xml/features
ENV CCSDK_SDNR_WT_REPO mvn:org.onap.ccsdk.features.sdnr.wt/sdnr-wt-feature-aggregator/${project.version}/xml/features
ENV CCSDK_SDNR_REPOLIST=${CCSDK_SDNR_WT_REPO}

# copy CCSDK mvn artifacts to ODL repository
COPY system /tmp/system
RUN rsync -a /tmp/system $ODL_HOME && rm -rf /tmp/system
COPY preload.cache.schema $ODL_HOME/cache/schema
COPY opt /opt

# Add additonal repositories to boot repositories
RUN cp $ODL_HOME/etc/org.apache.karaf.features.cfg $ODL_HOME/etc/org.apache.karaf.features.cfg.orig
RUN cat $ODL_HOME/etc/org.apache.karaf.features.cfg.orig | sed -e "\|featuresRepositories|s|$|, ${odl.repolist.features}|" > $ODL_HOME/etc/org.apache.karaf.features.cfg
RUN echo featuresBoot=config,standard,region,package,kar,ssh,management,${odl.boot.features.all} >> $ODL_HOME/etc/org.apache.karaf.features.cfg

RUN chmod 755 /opt/onap/ccsdk/bin/startSdnr.sh
ENTRYPOINT /opt/onap/ccsdk/bin/startSdnr.sh
EXPOSE 2550 8181 8185 9300
