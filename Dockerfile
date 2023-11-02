# Use Corretto JDK 17 as base image
FROM amazoncorretto:17

# Set the working directory in the Docker image
WORKDIR /app

# Copy the JAR file
COPY build/libs/*SNAPSHOT.jar app.jar

# Expose port 8080 for the application
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","app.jar"]
