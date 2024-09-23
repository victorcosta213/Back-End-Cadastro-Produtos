# Baseado na imagem do Maven com JDK 17 (versão mais recente)
FROM maven:3.9.0-eclipse-temurin-21 AS build

WORKDIR /app

# Copiar os arquivos do projeto
COPY pom.xml pom.xml
COPY src src

# Baixar as dependências do Maven
RUN mvn dependency:go-offline

# Construir o projeto
RUN mvn clean package

# Usar a imagem base do JDK 17 para rodar a aplicação
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copiar o JAR gerado
COPY --from=build /app/target/app-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]




