# Base image
FROM eclipse-temurin:17-jre-alpine


# Set the working directory
WORKDIR /app

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} /app/app.jar


# Expose the container port
EXPOSE 8080

# Run the microservice
ENTRYPOINT ["java", "-jar", "app.jar"]