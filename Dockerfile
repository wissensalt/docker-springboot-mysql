FROM openjdk:8-jdk-alpine
COPY ./target/docker-springboot-mysql-0.0.1-SNAPSHOT.jar /app/docker-springboot-mysql-0.0.1-SNAPSHOT.jar
WORKDIR /app
CMD ["java", "-jar", "docker-springboot-mysql-0.0.1-SNAPSHOT.jar"]