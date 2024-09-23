FROM adoptopenjdk/openjdk21:jre-alpine

WORKDIR /app

COPY pom.xml ./
COPY src ./src

RUN apt-get update && apt-get install -y maven

RUN mvn package

EXPOSE 8080
ENTRYPOINT ["java","-jar","target/app.jar"]




