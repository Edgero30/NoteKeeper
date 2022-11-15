FROM openjdk:8
EXPOSE 8080
ADD target/docker_notekeeper.jar docker_notekeeper.jar
ENTRYPOINT ["java","-jar","/docker_notekeeper.jar"]