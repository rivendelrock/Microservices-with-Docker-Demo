FROM mcr.microsoft.com/openjdk:17-ubuntu as base

EXPOSE 8080
ADD target/Microservicio_Rocio.jar Microservicio_Rocio.jar
ENTRYPOINT [ "java", "-jar", "/Microservicio_Rocio.jar" ]