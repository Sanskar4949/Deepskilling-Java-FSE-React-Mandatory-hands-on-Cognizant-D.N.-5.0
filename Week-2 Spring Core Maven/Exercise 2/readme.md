# Spring Core and Maven
## Exercise 2 - Implementing Dependency Injection

### Project Structure

```text
library-management/
│
├── pom.xml
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── library/
│   │   │           ├── App.java
│   │   │           │
│   │   │           ├── service/
│   │   │           │   └── BookService.java
│   │   │           │
│   │   │           └── repository/
│   │   │               └── BookRepository.java
│   │   │
│   │   └── resources/
│   │       └── applicationContext.xml
│   │
│   └── test/
│
└── target/
```

---

## Technologies Used

- Java
- Maven
- Spring Core
- Spring IoC
- Dependency Injection
- XML Configuration

---

## Features

- Setter Dependency Injection
- Spring Bean Configuration
- XML-based Bean Wiring
- IoC Container
- Bean Retrieval using ApplicationContext

---

## How to Run

Compile

```bash
mvn clean compile
```

Run

```bash
mvn exec:java "-Dexec.mainClass=com.library.App"
```

---

## Expected Output

```text
BookService Bean Created
BookRepository Bean Created
```
