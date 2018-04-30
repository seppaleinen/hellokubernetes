FROM maven:3.5-alpine
COPY src/ /src/
COPY pom.xml settings.xml /
RUN mvn -s settings.xml clean install

FROM openjdk:8-jre-alpine
ENV SA_LOGIC_API_URL http://localhost:5000
WORKDIR /
COPY --from=0 /target/sentiment-analysis-web-0.0.1-SNAPSHOT.jar /
EXPOSE 8080
CMD ["java", "-jar", "sentiment-analysis-web-0.0.1-SNAPSHOT.jar", "--sa.logic.api.url=${SA_LOGIC_API_URL}"]