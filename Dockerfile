FROM alpine:latest
RUN apk --update add openjdk8-jre && rm /var/cache/apk/*

ENV MS_FILE helloZuul-0.0.1-SNAPSHOT.jar
ENV MS_HOME /usr/ms

EXPOSE 8080

COPY build/libs/$MS_FILE $MS_HOME/

WORKDIR $MS_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar $MS_FILE"]