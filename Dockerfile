FROM openjdk:21-oracle
VOLUME /tmp
EXPOSE 8080
ADD ./build/libs/projetdevsecops-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djavaity.egd=file:/dev/./urandom","-jar","/app.jar"]653