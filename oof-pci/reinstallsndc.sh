#!/bin/bash
# Script to reinstall sdnc with new configuration
# Proceedure according to https://wiki.onap.org/pages/viewpage.action?pageId=45300208#InstallationofSDNR/SDNCintoONAPatOWL-CreateacustomSDNCDockerimage
# Sections "Command to install (or update) ONAP with the development image"
# On each node: rm /opt/opendaylight/daexim/.installed 

here=$(pwd)
cd ~/git/oom/kubernetes

# Delete
read -p "Script to delete and install sdnc. Press any key to continue" test
echo "Step1: Deleting images... (takes a while)"
helm del demo-sdnc --purge

# Stop and delete running sdnc
read -p "Step2: Remove objetcs. Press any key to continue" test
echo "Deleting volumes, secrets and bindungs..."
kubectl get persistentvolumeclaims -n onap | grep demo-sdnc | sed -r 's/(^[^ ]+).*/kubectl delete persistentvolumeclaims -n onap \1/' | bash
kubectl get persistentvolumes      -n onap | grep demo-sdnc | sed -r 's/(^[^ ]+).*/kubectl delete persistentvolumes      -n onap \1/' | bash
kubectl get secrets                -n onap | grep demo-sdnc | sed -r 's/(^[^ ]+).*/kubectl delete secrets                -n onap \1/' | bash
kubectl get clusterrolebindings    -n onap | grep demo-sdnc | sed -r 's/(^[^ ]+).*/kubectl delete clusterrolebindings    -n onap \1/' | bash

# Install
image=$(cat override-sdnc.yaml | grep "^image")
read -p "Step3: Install sdnc with $image. Press any key to continue" test
echo "Install images..."
helm install sdnc/ -n demo-sdnc --namespace onap -f ~/oof-pci/override-onap.yaml -f ~/oof-pci/override-sdnc.yaml

cd $here
echo "finished"
