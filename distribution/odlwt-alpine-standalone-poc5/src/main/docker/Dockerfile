# Base odl alpine with added packages needed for
FROM ${base.image.repo}

ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV ODL_HOME /root/odl/karaf-0.8.3-poc5
ENV SDNC_CONFIG_DIR /opt/onap/ccsdk/data/properties
ENV ANSIBLE_GPG_KEY ${ansible.gpg.key}

#Fix java location
RUN ln -s /usr/lib/jvm/java-1.8-openjdk /usr/lib/jvm/java-8-openjdk-amd64

#Remove existing opendaylight
RUN rm -r /opt/opendaylight

#WT:copy vanilla karaf ODL into container for root user
COPY karaf-0.8.3-poc5 /root/odl/karaf-0.8.3-poc5
COPY opt /opt

#Entrypoint
RUN chmod 755 /opt/onap/ccsdk/bin/startPoc5.sh
ENTRYPOINT /opt/onap/ccsdk/bin/startPoc5.sh
EXPOSE 2550 8181 8185 9300
