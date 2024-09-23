FROM maven:3.9.0-eclipse-temurin-21 AS build

WORKDIR /app

# Copiar o arquivo pom.xml para baixar as dependências
COPY pom.xml .

# Copiar a pasta src para o diretório correspondente no container
COPY src ./src

# Baixar as dependências do Maven
RUN mvn dependency:go-offline

# Construir o projeto, gerando o arquivo JAR
RUN mvn clean package

# Usar a imagem base do JDK 17 para rodar a aplicação
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copiar o JAR gerado da imagem anterior
COPY --from=build /app/target/app-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]




