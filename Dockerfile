FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/sb-location-1.jar
COPY ${JAR_FILE} /usr/app/
WORKDIR /usr/app/
RUN sh -c 'touch sb-location-1.jar'
ENTRYPOINT ["java","-jar","sb-location-1.jar"]