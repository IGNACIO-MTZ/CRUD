# API CRUD con Spring Boot y MySQL

## Descripción General
Este proyecto implementa una API CRUD (Crear, Leer, Actualizar, Eliminar) utilizando Spring Boot y MySQL. La API permite a los usuarios realizar operaciones en una entidad "usuario", incluyendo la recuperación de todos los usuarios, guardar un nuevo usuario, actualizar los detalles de un usuario, obtener un usuario por ID y eliminar un usuario.

## Tecnologías Utilizadas
- Spring Boot
- MySQL
- Postman (para probar operaciones CRUD)
- Java

## Configuración
Clonar el Repositorio
```bash
git clone https://github.com/tu-usuario/tu-repositorio.git
cd tu-repositorio
```
## Configuración de la Base de Datos
Asegúrate de tener MySQL instalado y crea una base de datos llamada "user". Actualiza el archivo application.properties con tu configuración de base de datos.

```
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/user?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=tu-contraseña-mysql
spring.jpa.hibernate.ddl-auto=update
```
## Ejecutar la Aplicación
```
./mvnw spring-boot:run
```

La aplicación estará accesible en http://localhost:8080.

## Endpoints de la API
- Obtener Todos los Usuarios
  - Método: GET
  - URL: http://localhost:8080/user
  - Recupera una lista de todos los usuarios.

- Guardar Usuario
  - Método: POST
  - URL: http://localhost:8080/user
  - Guarda un nuevo usuario. Envía un cuerpo de solicitud JSON con los detalles del usuario.

- Obtener Usuario por ID
  - Método: GET
  - URL: http://localhost:8080/user/{id}
  - Recupera un usuario por ID.

- Actualizar Usuario por ID
  - Método: PUT
  - URL: http://localhost:8080/user/{id}
  - Actualiza los detalles de un usuario por ID. Envía un cuerpo de solicitud JSON con los detalles actualizados del usuario.

- Eliminar Usuario por ID
  -Método: DELETE
  - URL: http://localhost:8080/user/{id}
  - Elimina un usuario por ID.

# Ejemplo de Solicitud (Postman)
## Obtener Todos los Usuarios
- Método: GET
- URL: http://localhost:8080/user
## Guardar Usuario
- Método: POST
- URL: http://localhost:8080/user
- Cuerpo de la Solicitud:
```
{
  "firstName": "Juan",
  "lastName": "Pérez",
  "email": "juan.perez@example.com"
}

```
## Optener usuario por ID
- Metodo GET
- URL: http://localhost:8080/user/{id}
- Cuerpo de la solicitud:

## Actualizar Usuario por ID
- Método: PUT
- URL: http://localhost:8080/user/{id}
- Cuerpo de la Solicitud:
```
{
  "firstName": "Actualizado",
  "lastName": "Usuario",
  "email": "usuario.actualizado@example.com"
}

```

##Eliminar Usuario por ID
- Método: DELETE
- URL: http://localhost:8080/user/{id}


# Dependencias
- Spring Boot
- MySQL Connector
- Spring Data JPA










