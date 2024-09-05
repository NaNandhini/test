FROM openjdk:22
COPY ./target/detailsapp.jar details.jar
CMD ["java","-jar","detailsapp.jar"]
