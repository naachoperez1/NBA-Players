# NBA Players API.

¡Welcome to the NBA players API! This api lets you get, insert and manage information about current and past NBA players.

## Available Endpoints:
* GET api/players: Get a list of all players in the database.
* GET api/players/{id}: Get one player specified by id.
* POST api/players: Create a player in the database. You must include all the data required ind the request body.
* PUT api/players/{id}: Update an specified player by it's id. You must include all the data required ind the request body.
* DELETE api/players/{id}: Delete a player by id.


## Data Format.

The data sent and received by the api must be in JSON format:

    {
    "id": 1,
    "nombre": "LeBron",
    "apellido": "James",
    "equipo": "Los Angeles Lakers",
    "edad": 38
    }

## Status codes.

* 200 OK: The request was succesfull and you will get the info you requested .
* 201 Created: Player created succesfully.
* 204 No Content: Succesfully requested, but no info to retrieve.
* 400 Bad Request: Incorrect request.
* 404 Not Found: Could not find the player in the databse.
* 500 Internal Server Error: An internal sever error has ocurred.

## API usage

To use this API, make HTTP requests to the different endpoints using cURL or Postman.
Make sure to include the data required in the POST and PUT requests in JSON format.

## Example

Lets say you want to get a list of all the players in the database:

### Request:

GET api/players

### Response:

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

## Contributions

This API is in constant growth!, if you have an improvement idea, feature or find some problem, just contribute to it
opening an "issue" or sending a "pull request" in the repository.
