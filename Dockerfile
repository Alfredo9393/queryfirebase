FROM openjdk:11
VOLUME /tmp
EXPOSE 8090
ARG JAR_FILE=target/queryfirebase-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} queryfirebase.jar
ENTRYPOINT ["java","-jar","queryfirebase.jar"]
