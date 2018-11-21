#!/bin/bash
FILENAME="/tmp/karaf-0.8.3-poc5.016.008.tar.gz"

if [ ! -f "$FILENAME" ] ; then
  echo -n "Downloading wireless transport container ... "
  wget -q https://cloud-highstreet-technologies.com/nextcloud/index.php/s/24fdqRLwmwzoZNe/download -O "$FILENAME"
  echo "done"
fi

tar -xzf "$FILENAME" -C $1
