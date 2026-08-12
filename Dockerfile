FROM eclipse-temurin:26-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring && \
    mkdir -p /app && chown spring:spring /app

COPY --chown=spring:spring . /app
WORKDIR /app

USER spring:spring
ENTRYPOINT ["./gradlew","bootRun"]
