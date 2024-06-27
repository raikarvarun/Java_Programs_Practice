FROM ubuntu:20.04

RUN apt-get update 

RUN apt-get install -y git

ENV TZ=Asia/Kolkata

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN apt-get install -y openjdk-8-jdk

WORKDIR /app

COPY . .