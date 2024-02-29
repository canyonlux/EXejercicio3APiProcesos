# API de Números Aleatorios

Esta API RESTful está diseñada para generar y manipular números aleatorios. Implementa modelos y controladores de manera adecuada, proporciona endpoints precisos que cumplen con la funcionalidad requerida y sigue los principios del diseño REST. A continuación, se detalla su funcionalidad, uso, ejemplos de llamadas a la API y respuestas esperadas.

## Funcionalidades

La API ofrece tres funcionalidades principales:

    Generar 100 números aleatorios: Devuelve una lista de 100 números aleatorios.
    Generar un número aleatorio con un número específico de dígitos: Devuelve un número aleatorio que tiene el número de dígitos especificado por el usuario.
    Actualizar un número aleatorio: Recibe un número aleatorio y devuelve otro número aleatorio con el mismo número de dígitos que el número recibido.

## Tecnologías Utilizadas

    Spring Boot
    Java
    Maven para la gestión de dependencias

## Instalación y Ejecución

Para ejecutar esta API, asegúrate de tener instalado JDK 17 y Maven. Clona este repositorio y navega al directorio del proyecto. Ejecuta el siguiente comando para iniciar la aplicación:

bash

mvn spring-boot:run

Uso de la API

## Endpoints

1. Obtener 100 números aleatorios

   Método: GET
   Endpoint: /random/numbers
   Respuesta esperada: Lista de 100 números aleatorios.

2. Obtener un número aleatorio con d dígitos

   Método: GET
   Endpoint: /random/number/{d}
   Parámetros: d - número de dígitos del número aleatorio deseado.
   Respuesta esperada: Un número aleatorio con d dígitos.

3. Actualizar un número aleatorio

   Método: PUT
   Endpoint: /random/number
   Cuerpo de la solicitud: { "random": <número> }
   Respuesta esperada: Un nuevo número aleatorio con el mismo número de dígitos que el número enviado en la solicitud.

## 4 Ejemplos de llamadas a la API

 GET localhost:8080/random/numbers
GET localhost:8080/random/number/5
PUT localhost:8080/random/number/

autor:https://github.com/canyonlux
