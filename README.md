# Intro
Following [tutorial](https://www.youtube.com/watch?v=vtPkZShrvXQ&list=TLPQMjQwNTIwMjAdTxuqRJIm3A&index=1) on YouTube.

# SpringBoot Template
Navigate to https://start.spring.io/ and choose the desired configuration for a starter project. 

For this demo, using 
- Maven
- Java 8
- Spring Boot 2.3.0
- Name: demo
- Packaging: Jar
- Dependency: Spring Web (Build web, including RESTful, 
applications using Spring MVC. Uses Apache Tomcat as the 
default embedded container.)

The `pom.xml` has full dependency list of this project.

# Starting Server 
In IntelliJ, open `DemoApplication.main()` class, hit run.

Client: Paw (or Postman).

# Project Structure 
- Model
- Dao (data persistent)
- Service (business logic)
- api (RestController)

# Deploy
In IntelliJ, open `Maven` menu, and under `Lifecycle`, click `install`.

Find `demo-0.0.1-SNAPSHOT.jar` under project `target/` folder. Open in terminal.

Run `java -jar demo-0.0.1-SNAPSHOT.jar` to start the server, make sure the port is not already in use.

Validate the server is running as expected by navigating to Chrome, go to `localhost:8080/api/v1/person`

Now we can distribute our server to thousands to clients.
