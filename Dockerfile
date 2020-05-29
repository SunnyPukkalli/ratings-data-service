FROM openjdk:8
ADD target/ratings-data.jar ratings-data.jar
EXPOSE 8080
ENTRYPOINT exec java -jar ratings-data.jar --spring.profiles.active=$PROFILE
