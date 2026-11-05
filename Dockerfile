FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN ./mvnw package -DskipTests