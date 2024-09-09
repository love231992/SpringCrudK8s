FROM openjdk:21
EXPOSE 8080
ADD target/demodocker.jar demodocker.jar
ENTRYPOINT ["java","-jar","/demodocker.jar"]