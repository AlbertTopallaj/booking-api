FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN ./gradlew bootJar -x test

CMD ["java", "-jar", "build/libs/booking-0.0.1-SNAPSHOT.jar"]