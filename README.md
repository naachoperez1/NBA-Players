# API REST de jugadores de la NBA.

¡Bienvenido/a a la API REST de Jugadores de la NBA! Esta API te permitirá acceder y gestionar información sobre los mismos.

Endpoints Disponibles:
* GET api/players: Obtiene una lista de todos los jugadores registrados en la base de datos.
* GET api/players/{id}: Obtiene los detalles de un jugador específico según su ID.
* POST api/players: Crea un nuevo jugador en la base de datos. Debes proporcionar los datos requeridos en el cuerpo de la solicitud.
* PUT api/players/{id}: Actualiza los datos de un jugador existente según su ID. Debes proporcionar los datos actualizados en el cuerpo de la solicitud.
* DELETE api/players/{id}: Elimina un jugador de la base de datos según su ID.


## Formato de Datos

Los datos enviados y recibidos por la API deben estar en formato JSON. A continuación se muestra un ejemplo del formato de un jugador:

    {
    "id": 1,
    "nombre": "LeBron",
    "apellido": "James",
    "equipo": "Los Angeles Lakers",
    "edad": 38
    }

## Códigos de Estado

La API utiliza los siguientes códigos de estado HTTP en sus respuestas:

* 200 OK: La solicitud fue exitosa y se devolverá la información solicitada.
* 201 Created: El jugador fue creado exitosamente.
* 204 No Content: La solicitud fue exitosa, pero no hay contenido para devolver (por ejemplo, en una eliminación exitosa).
* 400 Bad Request: La solicitud es incorrecta o no contiene los datos necesarios.
* 404 Not Found: El jugador solicitado no fue encontrado en la base de datos.
* 500 Internal Server Error: Se produjo un error interno en el servidor.

## Uso de la API
Para utilizar la API, realiza solicitudes HTTP a los diferentes endpoints utilizando herramientas como cURL o Postman. 
Asegúrate de incluir los datos necesarios en el cuerpo de las solicitudes POST y PUT en formato JSON.

## Ejemplo de Uso

Supongamos que deseas obtener la lista de todos los jugadores registrados:

### Solicitud:

GET api/players

### Respuesta:

    {
        "id": 1,
        "nombre": "LeBron",
        "apellido": "James",
        "equipo": "Los Angeles Lakers",
        "edad": 38
    },
    {
        "id": 2,
        "nombre": "Stephen",
        "apellido": "Curry",
        "equipo": "Golden State Warriors",
        "edad": 35
    },
    {
        "id": 3,
        "nombre": "Kevin",
        "apellido": "Durant",
        "equipo": "Phoenix Suns",
        "edad": 35
    },
    {
        "id": 4,
        "nombre": "Derrick",
        "apellido": "Rose",
        "equipo": "Memphis Grizzlies",
        "edad": 23
    }

## Contribuciones

¡Esta API está en constante mejora! Si tienes alguna idea de mejora, funcionalidad adicional o encuentras algún problema,
no dudes en contribuir abriendo un "issue" o enviando un "pull request" en nuestro repositorio.