FROM openjdk:17
EXPOSE 8080
ADD target/sbapp.jar sbapp.jar
ENTRYPOINT ["java","-jar","/sbapp.jar"]