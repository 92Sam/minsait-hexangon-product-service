FROM openjdk:17-jdk

RUN groupadd docker && useradd spring -g docker

USER docker:spring

WORKDIR /usr/src/app

COPY boot/target/boot-*.jar ./boot.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar", "boot.jar"]
