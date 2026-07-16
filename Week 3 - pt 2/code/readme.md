# Spring REST Handson

## Project Description
This project is developed as part of Cognizant Digital Nurture 5.0 (Java FSE - React) Spring REST Hands-on.

It demonstrates basic RESTful Web Services using Spring Boot.

---

## Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Maven
- SLF4J Logging
- REST API

---

## Project Structure

```
spring-rest-handson
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── spring_rest_handson
│   │   │               ├── controller
│   │   │               │   ├── HelloController.java
│   │   │               │   └── CountryController.java
│   │   │               │
│   │   │               ├── model
│   │   │               │   └── Country.java
│   │   │               │
│   │   │               ├── service
│   │   │               │   └── CountryService.java
│   │   │               │
│   │   │               └── SpringLearnApplication.java
│   │
│   │   └── resources
│   │       ├── static
│   │       ├── templates
│   │       └── application.properties
│   │
│   └── test
│
├── target
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .gitignore
└── README.md
```

---

## REST Endpoints

### 1. Hello World API

**GET**

```
/hello
```

Response

```
Hello World!!
```

---

### 2. Get India Details

**GET**

```
/country
```

Response

```json
{
  "code": "IN",
  "name": "India"
}
```

---

### 3. Get All Countries

**GET**

```
/countries
```

Response

```json
[
  {
    "code": "IN",
    "name": "India"
  },
  {
    "code": "US",
    "name": "United States"
  },
  {
    "code": "JP",
    "name": "Japan"
  },
  {
    "code": "DE",
    "name": "Germany"
  }
]
```

---

### 4. Get Country By Code

**GET**

```
/countries/{code}
```

Example

```
/countries/in
```

Response

```json
{
  "code": "IN",
  "name": "India"
}
```

The search is case-insensitive.

---

## Features Implemented

- Spring Boot REST API
- REST Controller
- Service Layer
- Model Class
- JSON Response
- Path Variable
- SLF4J Logging
- Maven Project Structure

---

## How to Run

Clone the repository

```
git clone <repository-url>
```

Open project

```
VS Code
```

Run

```
mvn spring-boot:run
```

Application starts at

```
http://localhost:8080
```

---

## Testing

Browser

```
http://localhost:8080/hello

http://localhost:8080/country

http://localhost:8080/countries

http://localhost:8080/countries/in
```

Postman

Method

```
GET
```

Use the same URLs above.

---

## Author

Sanskar Kumawat
