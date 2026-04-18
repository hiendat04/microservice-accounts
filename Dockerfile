
FROM eclipse-temurin:21-jdk

# Information about who maintains the image
LABEL "org.opencontainers.image.authors"="datmai"

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]
