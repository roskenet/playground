FROM openjdk:8-jre-slim

COPY target/discovery.jar .
EXPOSE 8761

CMD ["java", "-jar", "discovery.jar"]
