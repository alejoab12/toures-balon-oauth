FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9394
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","/app.jar"]
