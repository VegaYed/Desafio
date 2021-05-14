FROM openjdk:11.0.6-jre
COPY "./target/desafio-0.0.1-SNAPSHOT.jar" "app.jar"
ENV PORT 8080
ENV HOST PORT 0.0.0.0
ENTRYPOINT ["java","-jar","app.jar"]