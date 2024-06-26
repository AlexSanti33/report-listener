FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/reporr-listener-0.0.1-SNAPSHOT.jar app.jar
ENV EUREKA_URL null
ENV MONGO_HOST null
ENV BROKER_URL null
ENTRYPOINT ["java","-jar","/app.jar"]