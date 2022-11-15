FROM openjdk:8-jre-slim
EXPOSE 8080
ADD docker_notekeeper.jar docker_notekeeper.jar
ENTRYPOINT ["java","-jar","/docker_notekeeper.jar"]