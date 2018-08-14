#!/usr/bin/env bash
set -ex

# SET THE FOLLOWING VARIABLES
# docker hub username
USERNAME=karmanov
# image name
IMAGE=thor-service
docker build -t $USERNAME/$IMAGE:latest .
