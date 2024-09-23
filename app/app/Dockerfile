# Usar a imagem base do OpenJDK 21
FROM openjdk:21-jdk-slim

# Definir o diretório de trabalho
WORKDIR /app

# Copiar o arquivo JAR da sua aplicação para o contêiner
COPY target/seu-aplicativo.jar app.jar

# Expor a porta que sua aplicação irá usar
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]





