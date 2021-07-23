FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Duser.timezone=GMT+08","-Dfile.encoding=UTF-8","-jar","/app.jar"]