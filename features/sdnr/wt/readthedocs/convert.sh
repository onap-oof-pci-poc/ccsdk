#!/bin/bash

BASEDIR=$(dirname "$0")"/../../../"
PATH_HELPSERVER_RES=$BASEDIR"sdnr/wt/helpserver/provider/src/main/resources/help/"
PATH_DOC_DST=$BASEDIR"docs/"
PATH_DOC_USERDOC_DST=$PATH_DOC_DST"guides/onap-user/"

echo "==================Find .md files in helpserver===================================="
markdown_files=$(find $PATH_HELPSERVER_RES"sdnr" -type f -iname "*.md")
echo "$markdown_files[@]"

echo "=============Converting md to rst files=================================="
for file in ${markdown_files[@]}; do
  append_name=`echo "$file" | awk -F"/" '{print $(NF-1)}'`
  f="$(basename -- $file)"
  if [ "${f,,}" = "readme.md" ]; then
    rstfile=$append_name".rst"
  else
    rstfile=${f%.md}".rst"
  fi

  echo "$file to $PATH_DOC_USERDOC_DST$rstfile"
  pandoc -s --toc -f markdown -t rst $file > $PATH_DOC_USERDOC_DST"$rstfile"
done

cp -r "$BASEDIR"sdnr/wt/readthedocs/src/home.rst "$BASEDIR"docs/guides/onap-user/
cp -r "$BASEDIR"sdnr/wt/readthedocs/src/index.rst "$BASEDIR"docs/

echo "================Creating html=========================================="
/usr/local/bin/sphinx-build -b html $PATH_DOC_DST /home/jack/public_html/sdnr-trial/

