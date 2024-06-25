FROM eclipse-temurin:21-alpine

# A trailing slash after /opt/app will create the directory if doesn't exist
COPY target/iv-delivery.jar /opt/app/

CMD [ "java", "-jar", "/opt/app/iv-delivery.jar" ]