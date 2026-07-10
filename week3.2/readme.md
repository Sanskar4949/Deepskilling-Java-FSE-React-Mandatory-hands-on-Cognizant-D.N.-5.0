# Spring REST using Spring Boot 3
## Exercise 1 - Create a Spring Web Project using Maven

### Project Structure

```text
spring-learn/
│
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .gitignore
├── HELP.md
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cognizant/
│   │   │           └── spring_learn/
│   │   │               └── SpringLearnApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── date-format.xml
│   │       ├── static/
│   │       └── templates/
│   │
│   └── test/
│
└── target/
```

---

## Technologies Used

- Java
- Maven
- Spring Boot
- Spring Core
- Embedded Apache Tomcat

---

## How to Run

Build the project:

```bash
mvn clean install
```

Run the application:

```bash
mvn spring-boot:run
```

Stop the application:

```text
Ctrl + C
```

---

## Features

- Spring Boot Web Project
- Maven Build Configuration
- XML Bean Configuration
- Embedded Tomcat Server
- Spring Application Context
