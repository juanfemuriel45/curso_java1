@echo off
call mvn clean package
call docker build -t mx.com.gm/ControlClientes .
call docker rm -f ControlClientes
call docker run -d -p 9080:9080 -p 9443:9443 --name ControlClientes mx.com.gm/ControlClientes