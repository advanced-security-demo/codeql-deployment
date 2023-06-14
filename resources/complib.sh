#!/bin/bash
curl --silent \
https://raw.githubusercontent.com/github/codeql/codeql-cli/v$(codeql version  --format=json | jq -r .version)/$1/ql/lib/qlpack.yml |  grep version | cut -d':' -f2 | sed 's/^\[ \]*//'

