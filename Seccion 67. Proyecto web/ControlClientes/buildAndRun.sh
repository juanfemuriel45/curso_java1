#!/bin/sh
mvn clean package && docker build -t mx.com.gm/ControlClientes .
docker rm -f ControlClientes || true && docker run -d -p 9080:9080 -p 9443:9443 --name ControlClientes mx.com.gm/ControlClientes