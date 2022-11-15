FROM adoptopenjdk/openjdk8:latest
COPY matricula-0.0.1-SNAPSHOT.jar /usr/src/bootdocker/matricula-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src/bootdocker
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "/usr/src/bootdocker/matricula-0.0.1-SNAPSHOT.jar"]