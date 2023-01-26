FROM openjdk:11
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
WORKDIR /opt/apps
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

