
FROM openjdk:11-jre-slim

WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/Jwt-0.0.1-SNAPSHOT.jar /app/app.jar

# Specify the command to run on container start
CMD ["java", "-jar", "app.jar"]
