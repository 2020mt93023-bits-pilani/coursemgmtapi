FROM openjdk:13-alpine3.9
RUN mkdir -p /opt/courseapi/jar
WORKDIR /opt/courseapi/jar
COPY target/*.jar .
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "courseapi-0.0.1-SNAPSHOT.jar"]