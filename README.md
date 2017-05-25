spring-rest-azure example
----------------------------------------------------

The following repository contains a spring rest example

## Setup
Below is a setup guide for the repository.

### Requirements
You must have the following software installed to get started

- Java >= 1.8
- [Maven](https://maven.apache.org/)
- [Node.js](https://nodejs.org/en/) >= 6.10.3

### Installing and building
Use the spring-boot command line to get started:

`mvn spring-boot:run`

This will install all necessary dependencies for you, and kick up the REST server.
Depending on your IDE, it's easily possible to include the maven project.
Since the boot DevTools are included, building your project will automatically reload the server
 
### Serving the front-end
Please refer to the [front-end documentation](/public/README.md) on how to get started.

# Project documentation

## A brief introduction into spring
Spring is a framework for efficient creation of business grade applications in Java.

It is subdivided into multiple components:

- an extensive documentation 
- [Spring Framework](http://projects.spring.io/spring-framework/): Provides various techniques such as dependency injection for building sane applictions
- [Spring Boot](http://projects.spring.io/spring-boot/): an umbrella project of modules to speed up development, mentioning explicitely:
  - [Developer Tools](https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-devtools.html): Usefull for auto-restarting server after a build
  - [Web](http://projects.spring.io/spring-ws/): Module to build RESTFull services
- [Spring Initializr](https://start.spring.io): A quick generator for Spring applications
- [Spring data](http://projects.spring.io/spring-data/): A provider for various databases
- Many more modules for various fields such as: Cloud, Securiy (...)

