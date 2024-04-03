# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.4/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.4/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Referencias
* https://mkyong.com/spring-boot/spring-boot-logging-example/
* https://www.baeldung.com/spring-boot-log-properties
* https://docs.spring.io/spring-boot/docs/2.0.6.RELEASE/reference/html/boot-features-logging.html
* https://howtodoinjava.com/spring-boot/logging-application-properties/
* https://www.baeldung.com/logback
* https://www.baeldung.com/spring-boot-changing-log-level-at-runtime

### Comandos úteis 
* Mostrar o nível de log atual: curl -X "GET" "http://localhost:8080/actuator/loggers/com.workshop.workshopLog.controllers"
* Alterar o nível de log: curl -X "POST" "http://localhost:8080/actuator/loggers/com.workshop.workshopLog.controllers" -H "Content-Type: application/json; charset=utf-8" -d $'{ "configuredLevel": "WARN" }'
