FROM ubuntu:24.04

ENV DEBIAN_FRONTEND=noninteractive
WORKDIR /opt

# Install system dependencies
RUN apt-get update && apt-get install -y \
    openjdk-17-jdk \
    wget \
    unzip \
    netcat-traditional \
    curl \
    gnupg \
    supervisor \
    postgresql \
    zookeeperd \
    net-tools \
    iputils-ping \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

# Install Kafka
ENV KAFKA_VERSION=3.9.0
ENV SCALA_VERSION=2.13
RUN wget https://downloads.apache.org/kafka/${KAFKA_VERSION}/kafka_${SCALA_VERSION}-${KAFKA_VERSION}.tgz && \
    tar -xzf kafka_${SCALA_VERSION}-${KAFKA_VERSION}.tgz && \
    mv kafka_${SCALA_VERSION}-${KAFKA_VERSION} /opt/kafka && \
    rm kafka_${SCALA_VERSION}-${KAFKA_VERSION}.tgz

# Add Nakadi JAR and config
COPY nakadi/app/build/libs/app.jar /opt/nakadi.jar
COPY application.yml /opt/application.yml
COPY nakadi/database/nakadi /tmp/database

# Add start scripts
COPY scripts/start.sh /opt/start.sh
COPY scripts/init-db.sh /opt/init-db.sh
RUN chmod +x /opt/start.sh /opt/init-db.sh

# Add supervisord config
RUN mkdir -p /var/log/supervisor
COPY scripts/supervisord.conf /etc/supervisor/conf.d/supervisord.conf

EXPOSE 5432 2181 9092 8080

CMD ["/opt/start.sh"]

