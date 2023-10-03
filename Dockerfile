# Usamos una imagen base de OpenJDK
FROM openjdk:11-jre-slim

# Establecemos el directorio de trabajo en /app
WORKDIR /app

# Copiamos el archivo JAR de la aplicación (asegúrate de que el nombre del archivo coincida)
COPY target/alumnos-0.0.1-SNAPSHOT.war .

# Exponemos el puerto en el que se ejecutará la aplicación
EXPOSE 8080

# Comando para iniciar la aplicación Spring Boot
CMD ["java", "-jar", "alumnos-0.0.1-SNAPSHOT.war"]
