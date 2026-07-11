# Exercise 4 - Creating and Configuring a Maven Project

## Objective

Create and configure a Maven project for a Library Management application by adding the required Spring Framework dependencies and configuring the Maven Compiler Plugin.

---

## Technologies Used

- Java 8
- Maven
- Spring Framework 5.3.30
- Spring Context
- Spring AOP
- Spring WebMVC

---

## Project Structure

```text
LibraryManagement/
│
├── pom.xml
├── README.md
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── library
│   │   │           ├── App.java
│   │   │           ├── repository
│   │   │           │   └── BookRepository.java
│   │   │           └── service
│   │   │               └── BookService.java
│   │   │
│   │   └── resources
│   │       └── applicationContext.xml
│   │
│   └── test
│
├── target
│
└── .gitignore
```

---

## Spring Dependencies

The following Spring Framework modules were added through Maven:

- Spring Context
- Spring AOP
- Spring WebMVC

---

## Maven Compiler Plugin

Configured the Maven Compiler Plugin for Java 1.8.

---

## Maven Commands

### Clean and Compile

```bash
mvn clean compile
```

### View Dependency Tree

```bash
mvn dependency:tree
```

### Run the Application

```bash
mvn exec:java "-Dexec.mainClass=com.library.App"
```

---

## Output

```
BookService Bean Created
BookRepository Bean Created

BUILD SUCCESS
```

---

## What Was Implemented

- Created a Maven project.
- Added Spring Framework dependencies.
- Configured the Maven Compiler Plugin.
- Managed dependencies using Maven.
- Verified dependency hierarchy using Maven.
- Successfully built and executed the project.

---

## Learning Outcomes

- Maven project creation
- Dependency management
- Spring Framework integration
- Maven Compiler Plugin configuration
- Maven build lifecycle
- Dependency Tree analysis
