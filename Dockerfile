FROM openjdk:11
MAINTAINER amit
COPY target/demo-0.0.1-SNAPSHOT.jar demo2.jar
ENTRYPOINT ["java","-jar","/demo2.jar"]