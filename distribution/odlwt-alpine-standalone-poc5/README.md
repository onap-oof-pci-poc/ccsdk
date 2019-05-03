# CENTENNIAL PoC#5 container

The pom is creating alpine docker image containing the Boron ODL with network applications
used for CENTENNIAL PoC#5 end of 2018.


## Create and run the image

Compile:

```
   mvn clean install -P docker
```

Start with docker run:

```
   docker run --detach --name sdnr-poc5 --env SDNRWT="true" oof-pci/ccsdk-odlwt-poc5-alpine-image:latest
```