
These codes are for reference.

## Project Structure

```text
mockito-exercises/
│
├── pom.xml
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── cognizant/
│   │               └── mockito/
│   │                   ├── ExternalApi.java
│   │                   └── MyService.java
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── cognizant/
│                   └── mockito/
│                       └── MyServiceTest.java
│
└── pom.xml
```

## Files

- `ExternalApi.java` – Interface to be mocked.
- `MyService.java` – Uses `ExternalApi`.
- `MyServiceTest.java` – JUnit 5 + Mockito test.
- `pom.xml` – Maven configuration and dependencies.
