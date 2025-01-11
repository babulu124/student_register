FROM eclipse-temurin:17-jre-alpine
WORKDIR /usr/app
COPY ./target/21-Spring_Web_Mvc_Register_App-0.0.1-SNAPSHOT.jar /usr/app
EXPOSE 9191
CMD ["java", "-jar", "21-Spring_Web_Mvc_Register_App-0.0.1-SNAPSHOT.jar"]