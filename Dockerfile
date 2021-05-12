FROM openjdk:11.0.6-jre
COPY "./target/desafio-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 9000
ENTRYPOINT ["java","-jar","app.jar"]