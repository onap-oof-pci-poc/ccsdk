# Base sli alpine with added packages needed for open ecomp
FROM ${base.image.repo}
MAINTAINER CCSDK Team (onap-ccsdk@lists.onap.org)
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV ODL_HOME /opt/opendaylight
ENV SDNC_CONFIG_DIR /opt/onap/ccsdk/data/properties
ENV ANSIBLE_GPG_KEY ${ansible.gpg.key}

# copy CCSDK mvn artifacts to ODL repository
USER root
COPY system /tmp/system
RUN rsync -a /tmp/system $ODL_HOME
RUN rm -rf /tmp/system
USER odl

# Add CCSDK repositories to boot repositories
RUN cp $ODL_HOME/etc/org.apache.karaf.features.cfg $ODL_HOME/etc/org.apache.karaf.features.cfg.orig2
RUN sed -i -e "\|featuresRepositories|s|$|,${ccsdk.sdnr.repolist}|"  $ODL_HOME/etc/org.apache.karaf.features.cfg
RUN sed -i -e "\|featuresBoot[^a-zA-Z]|s|$|,${odl.boot.features.add}|"  $ODL_HOME/etc/org.apache.karaf.features.cfg

ENTRYPOINT ${docker.entrypoint}
EXPOSE 2550 8085 8181 8185 9200 9300
