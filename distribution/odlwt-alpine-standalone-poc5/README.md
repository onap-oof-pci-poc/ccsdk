# CENTENNIAL PoC#5 container

Container is creating alpine docker image containing the Boron ODL with network applications
used for CENTENNIAL PoC#5 end of 2018.


## Run the image

Start with docker run:

```
   docker run --detach --name sdnr-poc5 --env SDNRWT="true" oof-pci/ccsdk-odlwt-poc5-alpine-image:latest
```