FROM openjdk:8-jdk-alpine
EXPOSE 8761
ADD /ServiceDiscovery/target/ServiceDiscovery-0.0.1-SNAPSHOT.jar servicediscovery.jar
ENTRYPOINT ["java","-jar","servicediscovery.jar"]

FROM openjdk:8-jdk-alpine
EXPOSE 8089
ADD /ClientApplication/target/Client-0.0.1-SNAPSHOT.jar client.jar
ENTRYPOINT ["java","-jar","client.jar"]

FROM openjdk:8-jdk-alpine
EXPOSE 8088
ADD /WebApplication/target/WebApplication-0.0.1-SNAPSHOT.jar webapplication.jar
ENTRYPOINT ["java","-jar","webapplication.jar"]

