


FROM maven:3.8.3-openjdk-17 AS build
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /usr/src/app/target/Jwt-0.0.1.jar /app/Jwt.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","Jwt.jar"]
