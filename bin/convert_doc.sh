#!/bin/bash

BASEDIR=$(dirname "$0")"/../"
PATH_HELPSERVER_RES=$BASEDIR"features/sdnr/wt/helpserver/provider/src/main/resources/help/"
PATH_DOC_DST=$BASEDIR"docs/"
PATH_DOC_USERDOC_DST=$PATH_DOC_DST"guides/onap-user/"

markdown_files=$(find $PATH_HELPSERVER_RES"sdnr/" -type f -iname "*.md")
#for insensitive string match
shopt -s nocasematch

for file in ${markdown_files[@]}; do

  append_name=`echo "$file" | awk -F"/" '{print $(NF-2)}'`
  f="$(basename -- $file)"
  if [ "${f,,}" = "readme.md" ]; then
    rstfile=$append_name".rst"
  else
    rstfile=${f%.md}".rst"
  fi

  echo ${f,,}"=>"$rstfile
  pandoc -s --toc -f markdown -t rst $file > $PATH_DOC_USERDOC_DST$rstfile

done
