This directory contains a docker-compose.yml that is intended for
use by CCSDK developers to test and debug issues with the CCSDK
docker containers.

Please note that these containers are NOT intended to be used as standalone
containers, with interface to other ONAP components. Rather, they are intended
to be used as bases for other containers (e.g. odlsli is the container
that SDN-C and APP-C would base their controller containers on), or as 
development environments (e.g. the dgbuilder container is a development
tool for editing directed graphs)
