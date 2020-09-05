# LINUX O/S + JRE 8
FROM openjdk:8-jdk-alpine
# COPY the jar file to Docker O/S
ADD target/aws-demo-0.0.1-SNAPSHOT.jar /tmp/aws-demo.jar
# Command to run my application : java -jar /tmp/aws-demo.jar
CMD ["java","-jar","/tmp/aws-demo.jar"]
