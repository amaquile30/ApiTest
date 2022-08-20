# ApiTest
Grupo de estudio de automatización 2022

Se crearán pruebas automatizadas con el patrón de diseño Screenplay de Serenity, Cucumber, Junit, Java y Gradle para probar una api REST

Se utilizara el siguiente servicio expuesto para las pruebas automatizadas:
* https://reqres.in/api

# 🛠️ Necesarias para ejecutar el proyecto

- Java JDK 11
- Gradle 7.3 or higher
- GIT


## Crear los test para:

Método GET

Realizar la petición de obtener usuarios (/users?page=2) y comprobar que:
1. Tiene un total de 12 elementos
2. Contiene los IDs: 7,8,9,10.11 y 12 en el array de IDs retornado por la petición.
3. Contiene el Texto (text) con el valor "To keep ReqRes free, contributions towards server costs are appreciated!"


Método POST

Realizar la petición para crear un usuario () enviando el body:
Puede enviar el name y job que deseen
```json
{
    "name": "GrupoEstudio",
    "job": "Training"
}
```

1. Validar que en la respuesta se muestra el name enviado para la creación
2. Validar que en la respuesta se muestra el job enviado para la creación
3. Validar que el código de la respuesta sea 201
