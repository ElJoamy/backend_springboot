# Sistema de Biblioteca
## Microservicio de Autenticación
### Arquitectura por Capas
**Razón**: Este servicio maneja la autenticación y la autorización, lo cual implica una clara separación entre la interfaz de usuario (controladores), la lógica de negocio (servicios), y la persistencia de datos (repositorios). La arquitectura por capas facilita esta separación y es ideal para manejar diferentes niveles de seguridad y acceso a datos.

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
**Razón**: Dado que este microservicio implica principalmente la presentación y manipulación de información del catálogo (libros, tesis, revistas), MVC es adecuado. MVC permite separar la lógica de presentación (controladores), la lógica de negocio (modelo), y la interfaz de usuario (vistas, aunque en un microservicio esto suele ser una API REST).

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
**Razón**: Este microservicio interactúa con otros servicios (como el de catálogo) y posiblemente con sistemas externos para gestionar préstamos y devoluciones. La arquitectura hexagonal, también conocida como arquitectura de puertos y adaptadores, es ideal para servicios que requieren múltiples canales de entrada y salida, facilitando la integración y el mantenimiento.

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
**Razón**: Al igual que el servicio de autenticación, este servicio puede beneficiarse de una separación clara entre la interfaz de usuario (controladores), la lógica de negocio (servicios, incluyendo algoritmos de recomendación), y la persistencia de datos (repositorios). La arquitectura por capas soporta bien estas necesidades.

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
**Razón**: Este servicio gestiona operaciones administrativas que involucran la creación, modificación y visualización de datos de usuarios y recursos. MVC es adecuado aquí para mantener una clara separación entre la lógica de negocio, la interfaz de usuario y la manipulación de datos.

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


# Models
## Microservicio de Autenticación
### User
- `id`: Identificador único del usuario.
- `username`: Nombre de usuario.
- `password`: Contraseña del usuario.
- `roles`: Lista de roles (estudiante, administrador).

### Role
- `id`: Identificador único del rol.
- `name`: Nombre del rol.

## Microservicio de Catálogo
### Book
- `id`: Identificador único del libro.
- `title`: Título del libro.
- `author`: Autor del libro.
- `isbn`: ISBN del libro (International Standard Book Number).
- `publishedYear`: Año de publicación.
- `quantity`: Cantidad de copias disponibles.
- `available`: Indica si el libro está disponible o no.
- `addedBy`: Usuario que añadió el libro al catálogo.
- `modifiedBy`: Usuario que modificó la información del libro (si aplica).

### Thesis
- `id`: Identificador único de la tesis.
- `title`: Título de la tesis.
- `author`: Autor de la tesis.
- `university`: Universidad donde se presentó.
- `year`: Año de presentación.
- `quantity`: Cantidad de copias disponibles.
- `available`: Indica si la tesis está disponible o no.
- `addedBy`: Usuario que añadió la tesis al catálogo.
- `modifiedBy`: Usuario que modificó la información de la tesis (si aplica).

### Magazine
- `id`: Identificador único de la revista.
- `title`: Título de la revista.
- `issueNumber`: Número de la edición.
- `publicationDate`: Fecha de publicación.
- `quantity`: Cantidad de copias disponibles.
- `available`: Indica si la revista está disponible o no.
- `addedBy`: Usuario que añadió la revista al catálogo.
- `modifiedBy`: Usuario que modificó la información de la revista (si aplica).

## Microservicio de Préstamos y Devoluciones
### Loan
- `id`: Identificador único del préstamo.
- `userId`: Identificador del usuario que toma el préstamo.
- `itemId`: Identificador del ítem prestado.
- `loanDate`: Fecha en que se realizó el préstamo.
- `dueDate`: Fecha de devolución esperada.
- `returnedDate`: Fecha en que se devuelve el ítem.

## Microservicio de Recomendaciones
### Recommendation
- `id`: Identificador único de la recomendación.
- `userId`: Identificador del usuario al que se le hace la recomendación.
- `recommendedItems`: Lista de ítems recomendados.

## Microservicio de Administración
### User
- `id`: Identificador único del usuario.
- `username`: Nombre de usuario.
- `password`: Contraseña del usuario.
- `roles`: Lista de roles.
- `isActive`: Indica si el usuario está activo o no.
- `canManageCatalog`: Indica si el usuario puede gestionar el catálogo (añadir, eliminar ítems).



# Metodos Requeridos
## Microservicio de Autenticación
- `authenticateUser(String username, String password)`: Para autenticar usuarios.

## Microservicio de Catálogo
- `getAllBooks()`: Para obtener todos los libros.
- `getBookById(int bookId)`: Para obtener un libro por su ID.
- `getBookByTitle(String title)`: Para obtener un libro por su título.
- `getBookByAuthor(String author)`: Para obtener un libro por su autor.
- `getBookByYear(int year)`: Para obtener un libro por su año de publicación.
- `getBookByAvailability(boolean available)`: Para obtener todos los libros disponibles.

- Métodos similares para `Thesis` y `Magazine`.

## Microservicio de Préstamos y Devoluciones
- `createLoan(Loan loan)`: Para crear un nuevo préstamo.
- `returnLoan(int loanId)`: Para procesar la devolución de un préstamo.
- `getLoanDetails(int loanId)`: Para obtener detalles de un préstamo específico.
- `getUserLoans(int userId)`: Para obtener todos los préstamos de un usuario.

## Microservicio de Recomendaciones
- `getRecommendations(int userId)`: Para obtener recomendaciones para un usuario.
- `updateRecommendations(int userId)`: Para actualizar las recomendaciones basadas en nuevos datos.

## Microservicio de Administración
- `createUser(User user)`: Para crear un nuevo usuario.
- `updateUser(User user)`: Para actualizar la información de un usuario.
- `deleteUser(int userId)`: Para eliminar un usuario.
- `createBook(Book book)`: Para añadir un nuevo libro al catálogo.
- `DeleteBook(int bookId)`: Para eliminar un libro del catálogo.
- Lo mismo aplica para `Thesis` y `Magazine`.

### Endpoints
## Microservicio de Autenticación
- `/api/auth/signin`: Para autenticar usuarios.
- `/api/auth/logout`: Para cerrar sesión.

## Microservicio de Catálogo
- `/api/catalog/books`: Para obtener todos los libros.
- `/api/catalog/books/{bookId}`: Para obtener un libro por su ID.
- `/api/catalog/books/title/{title}`: Para obtener un libro por su título.
- `/api/catalog/books/author/{author}`: Para obtener un libro por su autor.
- `/api/catalog/books/year/{year}`: Para obtener un libro por su año de publicación.
- `/api/catalog/books/available/{available}`: Para obtener todos los libros disponibles.
- Métodos similares para `Thesis` y `Magazine`.

## Microservicio de Préstamos y Devoluciones
- `/api/loan/loans`: Para obtener todos los préstamos.
- `/api/loan/loans/{loanId}`: Para obtener un préstamo por su ID.
- `/api/loan/loans/user/{userId}`: Para obtener todos los préstamos de un usuario.
- `/api/loan/loans/create`: Para crear un nuevo préstamo.
- `/api/loan/loans/return/{loanId}`: Para procesar la devolución de un préstamo.

## Microservicio de Recomendaciones
- `/api/recommendation/recommendations/{userId}`: Para obtener recomendaciones para un usuario.
- `/api/recommendation/recommendations/update/{userId}`: Para actualizar las recomendaciones basadas en nuevos datos.

## Microservicio de Administración
- `/api/admin/users`: Para obtener todos los usuarios.
- `/api/admin/users/{userId}`: Para obtener un usuario por su ID.
- `/api/admin/users/create`: Para crear un nuevo usuario.
- `/api/admin/users/update/{userId}`: Para actualizar la información de un usuario.
- `/api/admin/users/delete/{userId}`: Para eliminar un usuario.
- `/api/admin/catalog/books`: Para obtener todos los libros.
- `/api/admin/catalog/books/{bookId}`: Para obtener un libro por su ID.
- `/api/admin/catalog/books/create`: Para añadir un nuevo libro al catálogo.
- `/api/admin/catalog/books/delete/{bookId}`: Para eliminar un libro del catálogo.
- Lo mismo aplica para `Thesis` y `Magazine`.

## Autores
<table>
<tr>
    <td align="center">
        <a href="https://github.com/ElJoamy">
            <img src="https://avatars.githubusercontent.com/u/68487005?v=4" width="50;" alt="ElJoamy"/>
            <br />
            <sub><b>Joseph Anthony Meneses Salguero</b></sub>
        </a>
    </td>
    <td align="center">
        <a href="https://github.com/Amy312">
            <img src="https://avatars.githubusercontent.com/u/42759041?v=4" width="50;" alt="Amy312"/>
            <br />
            <sub><b>Ambar Monica Rojas Morales</b></sub>
        </a>
    </td>
    <td align="center">
        <a href="https://github.com/JZane21">
            <img src="https://avatars.githubusercontent.com/u/82000556?v=4" width="50;" alt="JZane21"/>
            <br />
            <sub><b>Jose Samuel Carrasco Encinas</b></sub>
        </a>
    </td></tr>
</table>