# Sistema de Biblioteca

## Microservicio de Autenticación
AuthenticationService/
│   mvnw
│   mvnw.cmd
│   pom.xml
│   README.md
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───library
│   │   │           └───auth
│   │   │               │   AuthServiceApplication.java
│   │   │               │
│   │   │               ├───config
│   │   │               │       SecurityConfig.java
│   │   │               │
│   │   │               ├───controller
│   │   │               │       AuthController.java
│   │   │               │
│   │   │               ├───model
│   │   │               │       User.java
│   │   │               │       Role.java
│   │   │               │
│   │   │               └───service
│   │   │                       UserService.java
│   │   │                       UserDetailsServiceImpl.java
│   │   │
│   │   └───resources
│   │           application.properties
│   │
│   └───test
│       └───java
│           └───com
│               └───library
│                   └───auth
│                           AuthServiceApplicationTests.java

## Microservicio de Catalogo
CatalogService/
│   mvnw
│   mvnw.cmd
│   pom.xml
│   README.md
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───library
│   │   │           └───catalog
│   │   │               │   CatalogServiceApplication.java
│   │   │               │
│   │   │               ├───controller
│   │   │               │       BookController.java
│   │   │               │
│   │   │               ├───model
│   │   │               │       Book.java
│   │   │               │       Thesis.java
│   │   │               │       Magazine.java
│   │   │               │
│   │   │               └───repository
│   │   │                       BookRepository.java
│   │   │                       ThesisRepository.java
│   │   │                       MagazineRepository.java
│   │   │
│   │   └───resources
│   │           application.properties
│   │
│   └───test
│       └───java
│           └───com
│               └───library
│                   └───catalog
│                           CatalogServiceApplicationTests.java

## Microservicio de Prestamos y Devoluciones
LoanService/
│   mvnw
│   mvnw.cmd
│   pom.xml
│   README.md
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───library
│   │   │           └───loan
│   │   │               │   LoanServiceApplication.java
│   │   │               │
│   │   │               ├───controller
│   │   │               │       LoanController.java
│   │   │               │
│   │   │               ├───model
│   │   │               │       Loan.java
│   │   │               │
│   │   │               └───repository
│   │   │                       LoanRepository.java
│   │   │
│   │   └───resources
│   │           application.properties
│   │
│   └───test
│       └───java
│           └───com
│               └───library
│                   └───loan
│                           LoanServiceApplicationTests.java

## Microservicio de Recomendaciones
RecommendationService/
│   mvnw
│   mvnw.cmd
│   pom.xml
│   README.md
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───library
│   │   │           └───recommendation
│   │   │               │   RecommendationServiceApplication.java
│   │   │               │
│   │   │               ├───controller
│   │   │               │       RecommendationController.java
│   │   │               │
│   │   │               └───service
│   │   │                       RecommendationService.java
│   │   │
│   │   └───resources
│   │           application.properties
│   │
│   └───test
│       └───java
│           └───com
│               └───library
│                   └───recommendation
│                           RecommendationServiceApplicationTests.java

## Microservicio de Administración
AdminService/
│   mvnw
│   mvnw.cmd
│   pom.xml
│   README.md
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───library
│   │   │           └───admin
│   │   │               │   AdminServiceApplication.java
│   │   │               │
│   │   │               ├───controller
│   │   │               │       AdminController.java
│   │   │               │
│   │   │               ├───model
│   │   │               │       User.java
│   │   │               │
│   │   │               └───service
│   │   │                       UserService.java
│   │   │
│   │   └───resources
│   │           application.properties
│   │
│   └───test
│       └───java
│           └───com
│               └───library
│                   └───admin
│                           AdminServiceApplicationTests.java
