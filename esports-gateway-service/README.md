# Proyecto Esports Platform

## Descripción del Proyecto

Proyecto desarrollado utilizando arquitectura de microservicios con Spring Boot para la gestión de socios y planes de una plataforma de eSports.

La solución se compone de tres microservicios independientes que se comunican mediante REST y Feign Client, además de un API Gateway encargado de centralizar el acceso a los servicios.

---

## Integrantes

- Johan Castro
- Fabricio Arroyo

---

## Aporte de cada Integrante

### Johan Castro
- Configuración de Git y GitHub.
- Implementación y configuración de Swagger/OpenAPI.
- Implementación y configuración del API Gateway.
- Desarrollo de pruebas unitarias utilizando JUnit y Mockito.
- Integración y pruebas entre microservicios.

### Fabricio Arroyo
- Desarrollo de entidades y modelos de datos.
- Implementación de repositorios JPA.
- Configuración de base de datos MySQL.
- Desarrollo de servicios y controladores.
- Implementación de endpoints REST.

---

## Microservicios Implementados

### 1. esports-core-api

Responsable de la gestión de socios y planes.

Puerto:

8081

Endpoints principales:

- GET /api/socios
- GET /api/planes

---

### 2. esports-auth-api

Responsable de la autenticación y consulta de información mediante comunicación con Core API.

Puerto:

8080

Endpoints principales:

- POST /api/v1/esports/login
- GET /api/v1/esports/socios
- GET /api/v1/esports/planes

---

### 3. esports-gateway-service

Responsable de centralizar el acceso a los microservicios.

Puerto:

8084

Rutas configuradas:

- /api/** → esports-core-api
- /api/v1/esports/** → esports-auth-api

---

## Comunicación Entre Microservicios

La comunicación entre servicios se realiza mediante Feign Client y consumo de servicios REST.

Flujo principal:

Cliente → API Gateway → Auth API → Core API

---

## Swagger / OpenAPI

### Auth API

http://localhost:8080/swagger-ui/index.html

### Core API

http://localhost:8081/swagger-ui/index.html

---

## Pruebas Unitarias

Se implementaron pruebas unitarias utilizando:

- JUnit 5
- Mockito

Casos evaluados:

- Validación de login.
- Obtención de socios.
- Obtención de planes.
- Métodos de la capa Service.
- Simulación de repositorios mediante mocks.

---

## Tecnologías Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Cloud OpenFeign
- Spring Cloud Gateway
- MySQL
- Swagger OpenAPI
- JUnit 5
- Mockito
- Git
- GitHub

---

## Configuración de Puertos

| Servicio | Puerto |
|-----------|---------|
| Auth API | 8080 |
| Core API | 8081 |
| Gateway | 8084 |

---

## Instrucciones de Ejecución

1. Iniciar el servidor MySQL.
2. Ejecutar esports-core-api.
3. Ejecutar esports-auth-api.
4. Ejecutar esports-gateway-service.
5. Acceder a Swagger mediante los enlaces indicados.
6. Probar los endpoints desde Swagger o mediante el API Gateway.

---

## Repositorios GitHub

- https://github.com/Johancg1/esports-auth-api
- https://github.com/Johancg1/esports-core-api
- https://github.com/Johancg1/esports-gateway-service