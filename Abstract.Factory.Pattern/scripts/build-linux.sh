#!/bin/bash

echo $ROOT_PATH

# Check if ROOT_PATH is set
if [ -z "$ROOT_PATH" ]; then
    echo "Error: ROOT_PATH is not set."
    echo "Please set ROOT_PATH to absolute path of Design Pattern before running this script"
    exit 1
fi

echo "Using ROOT_PATH as: $ROOT_PATH"

SUBDIR="Abstract.Factory.Pattern"

EXEC_PATH="${ROOT_PATH}/${SUBDIR}"

chmod -R +x $EXEC_PATH/scripts/*

# Change cwd
cd $EXEC_PATH

# Clean up environement
rm -rf bin/
mkdir bin

# Compile the project
javac -d bin $(find ./ -name "*.java")
