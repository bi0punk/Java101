# Proyecto de Gestión de Países

Este proyecto es una aplicación Java que utiliza JDBC para gestionar información de países en una base de datos MySQL. La aplicación permite realizar operaciones básicas como agregar, buscar, actualizar y eliminar países, así como listar todos los países almacenados en la base de datos.

## Estructura del Proyecto

### Clases Principales

- **`ConexionDB`**: Esta clase se encarga de establecer la conexión con la base de datos MySQL. Contiene la URL, el usuario y la contraseña necesarios para conectar a la base de datos.

- **`Pais`**: Representa la entidad "País". Incluye atributos para el identificador del país, el nombre del país y su capital, junto con los métodos getter y setter correspondientes.

- **`PaisDAO`**: Implementa el patrón DAO (Data Access Object) para manejar las operaciones de acceso a datos relacionadas con la entidad `Pais`. Proporciona métodos para agregar, obtener, modificar y eliminar países en la base de datos.

- **`App`**: La clase principal que proporciona una interfaz de línea de comandos para interactuar con el usuario. Permite realizar operaciones sobre la base de datos mediante un menú interactivo.

- **`AppTest`**: Contiene una prueba unitaria básica para validar el funcionamiento de la aplicación.

## Instrucciones de Uso

### Configuración de la Base de Datos

1. **Base de Datos**: Asegúrate de tener una base de datos MySQL en funcionamiento. Crea una base de datos llamada `pais`. Utiliza el siguiente script SQL para crear la tabla `paises`:


### Configuración del Proyecto

1. **Archivo de Configuración**: Asegúrate de que el archivo `ConexionDB.java` tenga los detalles correctos de conexión (`URL`, `USER`, `PASSWORD`).
2. **Dependencias**: Importa las dependencias necesarias en tu proyecto Maven.

### Ejecución de la Aplicación

1. **Compilación**: Compila el proyecto utilizando Maven con el siguiente comando:

    ```bash
    mvn clean compile
    ```

2. **Ejecución**: Ejecuta la aplicación con Maven usando el comando:

    ```bash
    mvn exec:java -Dexec.mainClass="com.example.App"
    ```

3. **Interacción**: Sigue las instrucciones en el menú para realizar operaciones sobre la base de datos.

## ¿Qué es DAO?

El patrón DAO (Data Access Object) es un patrón de diseño que proporciona una forma de abstraer y encapsular el acceso a la base de datos. La idea principal es separar la lógica de negocio de la lógica de acceso a datos. Un DAO se encarga de realizar las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos, lo que permite:

- **Abstracción**: La lógica de acceso a datos está encapsulada en el DAO, separada de la lógica de negocio.
- **Reutilización**: El DAO puede ser reutilizado en diferentes partes de la aplicación.
- **Mantenibilidad**: Los cambios en la base de datos pueden ser gestionados en el DAO sin afectar la lógica de negocio.

En este proyecto, la clase `PaisDAO` actúa como el DAO para la entidad `Pais`, gestionando todas las operaciones de base de datos necesarias para trabajar con los países.