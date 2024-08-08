FROM openjdk:11
COPY target/jdtest_docker_app.jar  /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java","-jar","jdtest_docker_app.jar"]
