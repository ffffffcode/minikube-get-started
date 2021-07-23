FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/*.jar

ENV TIME_ZONE=GMT+08

COPY ${JAR_FILE} app.jar

ENTRYPOINT java -Duser.timezone=${TIME_ZONE} -Dfile.encoding=UTF-8 -jar /app.jar