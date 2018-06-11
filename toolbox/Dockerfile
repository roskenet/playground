FROM ubuntu:18.04
LABEL maintainer="felix.roske@roskenet.de"

RUN apt-get update && \
    apt-get -y dist-upgrade && \
    apt-get -y install \
    curl \
    wget \
    dnsutils \
    ssh

RUN mkdir /run/sshd

RUN adduser \
 --system \
 --home /home/toolbox \
 --shell /bin/bash \
 --disabled-password \
 toolbox

RUN echo 'toolbox:toolbox' | chpasswd

RUN usermod -a -G sudo toolbox

RUN apt-get clean

CMD ["/usr/sbin/sshd", "-D"]
