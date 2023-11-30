# Sistema de Biblioteca
## Microservicio de Autenticación
### Arquitectura por Capas
- Razón: Este servicio maneja la autenticación y la autorización, lo cual implica una clara separación entre la interfaz de usuario (controladores), la lógica de negocio (servicios), y la persistencia de datos (repositorios). La arquitectura por capas facilita esta separación y es ideal para manejar diferentes niveles de seguridad y acceso a datos.
```bash
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
```

## Microservicio de Catalogo
### Arquitectura Modelo-Vista-Controlador (MVC)
Razón: Dado que este microservicio implica principalmente la presentación y manipulación de información del catálogo (libros, tesis, revistas), MVC es adecuado. MVC permite separar la lógica de presentación (controladores), la lógica de negocio (modelo), y la interfaz de usuario (vistas, aunque en un microservicio esto suele ser una API REST).

```bash
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
```

## Microservicio de Prestamos y Devoluciones
### Arquitectura Hexagonal
Razón: Este microservicio interactúa con otros servicios (como el de catálogo) y posiblemente con sistemas externos para gestionar préstamos y devoluciones. La arquitectura hexagonal, también conocida como arquitectura de puertos y adaptadores, es ideal para servicios que requieren múltiples canales de entrada y salida, facilitando la integración y el mantenimiento.
```bash
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
```

## Microservicio de Recomendaciones
### Arquitectura por Capas
Razón: Al igual que el servicio de autenticación, este servicio puede beneficiarse de una separación clara entre la interfaz de usuario (controladores), la lógica de negocio (servicios, incluyendo algoritmos de recomendación), y la persistencia de datos (repositorios). La arquitectura por capas soporta bien estas necesidades.
```bash
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
```

## Microservicio de Administración
### Arquitectura Modelo-Vista-Controlador (MVC)
Razón: Este servicio gestiona operaciones administrativas que involucran la creación, modificación y visualización de datos de usuarios y recursos. MVC es adecuado aquí para mantener una clara separación entre la lógica de negocio, la interfaz de usuario y la manipulación de datos.

```bash
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
```