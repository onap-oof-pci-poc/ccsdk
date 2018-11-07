# Base ubuntu with added packages needed for open ecomp
FROM onap/ccsdk-odl-oxygen-image:${project.version}
MAINTAINER CCSDK Team (onap-ccsdk@lists.onap.org)
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV ODL_HOME /opt/opendaylight
ENV SDNC_CONFIG_DIR /opt/onap/ccsdk/data/properties
ENV CCSDK_SLI_CORE_REPO mvn:org.onap.ccsdk.sli.core/ccsdk-sli-core-all/${ccsdk.sli.core.version}/xml/features
ENV CCSDK_SLI_ADAPTORS_REPO mvn:org.onap.ccsdk.sli.adaptors/ccsdk-sli-adaptors-all/${ccsdk.sli.adaptors.version}/xml/features
ENV CCSDK_FEATURES_REPO mvn:org.onap.ccsdk.features/ccsdk-features-all/${ccsdk.features.version}/xml/features
ENV CCSDK_SLI_NORTHBOUND_REPO mvn:org.onap.ccsdk.sli.northbound/ccsdk-sli-northbound-all/${ccsdk.sli.northbound.version}/xml/features
ENV CCSDK_SLI_PLUGINS_REPO mvn:org.onap.ccsdk.sli.plugins/ccsdk-sli-plugins-all/${ccsdk.sli.plugins.version}/xml/features
ENV ANSIBLE_GPG_KEY ${ansible.gpg.key}

# copy the opendaylight credentials
COPY idmlight.db.mv.db $ODL_HOME/data


# copy CCSDK mvn artifacts to ODL repository
COPY system /tmp/system
RUN rsync -a /tmp/system $ODL_HOME && rm -rf /tmp/system

# Add CCSDK repositories to boot repositories
RUN cp $ODL_HOME/etc/org.apache.karaf.features.cfg $ODL_HOME/etc/org.apache.karaf.features.cfg.orig
RUN cat $ODL_HOME/etc/org.apache.karaf.features.cfg.orig | sed -e "\|featuresRepositories|s|$|, ${CCSDK_SLI_CORE_REPO}, ${CCSDK_SLI_ADAPTORS_REPO}, ${CCSDK_SLI_NORTHBOUND_REPO}, ${CCSDK_SLI_PLUGINS_REPO}, ${CCSDK_FEATURES_REPO}|" > $ODL_HOME/etc/org.apache.karaf.features.cfg
RUN echo featuresBoot=config,standard,region,package,kar,ssh,management,odl-restconf-all,odl-mdsal-all,odl-mdsal-apidocs,odl-daexim-all,ccsdk-sli-core-all,ccsdk-sli-adaptors-all,ccsdk-sli-northbound-all,ccsdk-sli-plugins-all,ccsdk-features-all >> $ODL_HOME/etc/org.apache.karaf.features.cfg

# Create odl user
RUN useradd odl

# Install ansible
#COPY ansible-sources.list /etc/apt/sources.list.d
#RUN gpg --keyserver hkp://keyserver.ubuntu.com:80 --recv ${ANSIBLE_GPG_KEY} && \
#    gpg --export --armor ${ANSIBLE_GPG_KEY} | apt-key add - && \
#    apt-get update && \
#    apt-get install -y ansible

# Install ansible-opendaylight
#RUN ansible-galaxy install git+https://git.opendaylight.org/gerrit/integration/packaging/ansible-opendaylight

# Copy ccsdk install playbook
#COPY install_ccsdk.yml /tmp

# Install features in ODL
#RUN ansible-playbook -i "localhost," -c local /tmp/install_ccsdk.yml


# copy deliverables to opt
COPY opt /opt
COPY org.ops4j.pax.logging.cfg /opt/opendaylight/etc/org.ops4j.pax.logging.cfg


ENTRYPOINT /opt/onap/ccsdk/bin/startODL.sh
EXPOSE 8181
