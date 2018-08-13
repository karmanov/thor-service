FROM openjdk:10
LABEL maintainer="karmanov.d@gmail.com"
VOLUME /tmp
ARG JAR_FILE=target/thor-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
