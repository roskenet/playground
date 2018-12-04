FROM ubuntu:18.04
MAINTAINER f.roske@roskenet.de

RUN apt-get update && \
    apt-get -y dist-upgrade && \
    apt-get -y install git openssh-server
RUN mkdir /var/run/sshd
RUN sed -i 's/PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config

RUN echo 'root:screencast' | chpasswd

RUN sed 's@session\s*required\s*pam_loginuid.so@session optional pam_loginuid.so@g' -i /etc/pam.d/sshd

CMD ["/usr/sbin/sshd", "-D"]
