# Aplicación Web con Spring Boot, Thymeleaf y MySQL

Este proyecto es una aplicación web que utiliza Spring Boot como backend, Thymeleaf como motor de plantillas y MySQL como sistema de gestión de bases de datos. La aplicación permite a los usuarios gestionar datos de manera eficiente y ofrece una interfaz web interactiva.

## Características

- **Interfaz de usuario interactiva**: Construida con Thymeleaf para facilitar la renderización de vistas dinámicas.
- **CRUD completo**: Permite realizar operaciones de Crear, Leer, Actualizar y Eliminar (CRUD) sobre los datos almacenados en MySQL.
- **Autenticación de usuarios**: Implementación de mecanismos de autenticación y autorización.
- **Validación de datos**: Validación en el lado del servidor para asegurar la integridad de los datos.
- **Integración con bases de datos**: Conexión a MySQL para almacenamiento persistente de datos.

## Tecnologías utilizadas

- **Spring Boot**: Framework para el desarrollo de aplicaciones Java basadas en Spring.
- **Thymeleaf**: Motor de plantillas para crear vistas web dinámicas.
- **MySQL**: Sistema de gestión de bases de datos relacional.
- **Spring Data JPA**: Para simplificar el acceso a la base de datos.

## Importaciones necesarias

Asegúrate de que tu archivo `pom.xml` contenga las siguientes dependencias:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
</dependencies>
