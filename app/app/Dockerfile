# Use uma imagem base do OpenJDK 11
FROM openjdk:11-jdk-alpine

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o pom.xml e o código fonte
COPY pom.xml ./
COPY src ./src

# Instalar dependências
RUN apt-get update && apt-get install -y maven

# Construir a aplicação
RUN mvn package

# Expor a imagem final
EXPOSE 8080
ENTRYPOINT ["java","-jar","target/app.jar"]





