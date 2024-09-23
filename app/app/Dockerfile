# Use uma imagem base do Java 21
FROM openjdk:21-jdk-alpine

# Crie um diretório de trabalho
WORKDIR /app

# Copie o JAR gerado para o contêiner
COPY target/app-0.0.1-SNAPSHOT.jar /app/app.jar

# Exponha a porta padrão do Spring Boot
EXPOSE 8080

# Comando para rodar o JAR
ENTRYPOINT ["java", "-jar", "/app/app.jar"]





