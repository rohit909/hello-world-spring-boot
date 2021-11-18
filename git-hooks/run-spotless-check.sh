#!/bin/sh
mvn spotless:apply

java_files_modified='git status | grep "*.java"'
if [ java_files_modified != "" ]
then
  printf "Java files were re-formatted: `java_files_modified`"
  git add .
fi