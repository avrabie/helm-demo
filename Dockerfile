FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080
ADD build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]