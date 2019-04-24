#!/bin/bash
# $1 Output directory
# $2 Download url
# $3 Filename


FILENAME="/tmp/$3"

if [ ! -f "$FILENAME" ] ; then
  echo -n "Downloading wireless transport container ... "
  wget -q "$2" -O "$FILENAME"
  echo "done"
fi

tar -xzf "$FILENAME" -C $1
