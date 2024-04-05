FROM openjdk:11
EXPOSE 8080
COPY target/spring-boot-mysql.jar spring-boot-mysql.jar
ENTRYPOINT ["java","-jar","/spring-boot-mysql.jar"]
