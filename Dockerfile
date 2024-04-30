FROM gradle:8.2-jdk17-alpine AS builder

WORKDIR /usr/app/
COPY build.gradle settings.gradle ./
COPY src ./src
RUN gradle build --no-daemon

FROM amazoncorretto:17-alpine

ENV JAR_NAME=book-network-1.0.0.jar
ENV APP_HOME=/usr/app/
ENV DB_HOST=postgres-sql-bsn
ENV ACTIVE_PROFILE=dev

WORKDIR $APP_HOME

COPY --from=builder $APP_HOME/build/libs/$JAR_NAME .

EXPOSE 8080

ENTRYPOINT exec java -jar -Dspring.profiles.active=$ACTIVE_PROFILE -DDB_HOST=$DB_HOST $JAR_NAME