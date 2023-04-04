
FROM openjdk:11
# LABEL maintainer="himanshubector"
COPY target/*.jar customer-service.jar
ENTRYPOINT ["java","-jar","/customer-service.jar"]




#From openjdk:8
#copy ./target/employee-jdbc-0.0.1-SNAPSHOT.jar employee-jdbc-0.0.1-SNAPSHOT.jar
#CMD ["java","-jar","employee-jdbc-0.0.1-SNAPSHOT.jar"]


