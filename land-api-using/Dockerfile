FROM openjdk:17

WORKDIR /app

COPY build/libs/ROOT.jar /app/library-api.jar
COPY entrypoint.sh /app/entrypoint.sh

RUN chmod +x /app/entrypoint.sh

ENTRYPOINT ["/app/entrypoint.sh"]