FROM openjdk:11

COPY ./build/libs/produto-api-0.0.1-SNAPSHOT.jar produto-api-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","produto-api-0.0.1-SNAPSHOT.jar"]