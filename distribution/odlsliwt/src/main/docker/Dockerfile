# Base ubuntu with added packages needed for open ecomp
FROM ${base.image.name}:${base.image.version}
MAINTAINER CCSDK Team (onap-ccsdk@lists.onap.org)
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV ODL_HOME /opt/opendaylight

ENV SDNR_NORTHBOUND_REPO mvn:org.onap.ccsdk.features.sdnr.northbound/sdnr-northbound-all/${project.version}/xml/features
ENV SDNR_WT_REPO mvn:org.onap.ccsdk.features.sdnr.wt/sdnr-wt-feature-aggregator/${project.version}/xml/features
ENV CCSDK_FIX mvn:org.onap.ccsdk.sli.adaptors/ccsdk-saltstack-adapter/0.4.1-SNAPSHOT/xml/features
ENV SDNR_REPOLIST=${SDNR_NORTHBOUND_REPO},${SDNR_WT_REPO},${CCSDK_FIX}
ENV SDNR_ODL_SINGLE_NODE=odl-netconf-topology,odl-netconf-connector,odl-restconf-all,odl-mdsal-apidocs
ENV SDNR_ODL_CLUSTER_NODE=odl-mdsal-clustering,odl-netconf-clustered-topology,odl-restconf-all,odl-mdsal-apidocs
#ENV SDNR_FEATURELIST=sdnr-northbound-all,sdnr-wt-feature-aggregator
ENV SDNR_FEATURELIST=sdnr-wt-feature-aggregator
ENV SDNR_STANDALONE=false

#WT:copy schema cache into ontainer
RUN mkdir -p $ODL_HOME/cache/schema
COPY cache/schema/* $ODL_HOME/cache/schema/


# copy CCSDK mvn artifacts to ODL repository
COPY system /tmp/system
RUN rsync -a /tmp/system $ODL_HOME && rm -rf /tmp/system

#Fix providing jersey-common additionally with 2.27.0
RUN mkdir -p $ODL_HOME/system/org/glassfish/jersey/core/jersey-common/2.27.0
RUN cp -r $ODL_HOME/system/org/glassfish/jersey/core/jersey-common/2.27/* $ODL_HOME/system/org/glassfish/jersey/core/jersey-common/2.27.0
RUN mv $ODL_HOME/system/org/glassfish/jersey/core/jersey-common/2.27.0/jersey-common-2.27.jar $ODL_HOME/system/org/glassfish/jersey/core/jersey-common/2.27.0/jersey-common-2.27.0.jar


# Add CCSDK repositories to boot repositories
RUN cp $ODL_HOME/etc/org.apache.karaf.features.cfg $ODL_HOME/etc/org.apache.karaf.features.cfg.orig2
RUN cat $ODL_HOME/etc/org.apache.karaf.features.cfg.orig2 | sed -e "\|featuresRepositories|s|$|, ${SDNR_REPOLIST}|" > $ODL_HOME/etc/org.apache.karaf.features.cfg
#RUN echo featuresBoot=config,standard,region,package,kar,ssh,management,${SDNR_ODL_CLUSTER_NODE},odl-daexim-all, ${SDNR_FEATURELIST} >> $ODL_HOME/etc/org.apache.karaf.features.cfg
#RUN echo featuresBoot=config,standard,region,package,kar,ssh,management,${SDNR_ODL_CLUSTER_NODE},odl-daexim-all,${CCSDK_SLI_FEATURELIST},${SDNR_FEATURELIST} >> $ODL_HOME/etc/org.apache.karaf.features.cfg
RUN echo featuresBoot=config,standard,region,package,kar,ssh,management,odl-restconf-all,odl-mdsal-all,odl-mdsal-apidocs,odl-daexim-all,ccsdk-sli-core-all,ccsdk-sli-adaptors-all,ccsdk-sli-northbound-all,ccsdk-sli-plugins-all,ccsdk-features-all,sdnr-wt-feature-aggregator >> $ODL_HOME/etc/org.apache.karaf.features.cfg


ENTRYPOINT /opt/onap/ccsdk/bin/startODL.sh
EXPOSE 2550 8085 8181 8185 9200 9300
