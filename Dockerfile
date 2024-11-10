FROM openjdk:23
EXPOSE 8080
ADD target/EvenementProject-0.0.1-SNAPSHOT.jar evenement.jar
ENTRYPOINT ["java","-jar","evenement.jar"]