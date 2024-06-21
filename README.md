# Challenger Conversor de Divisas

Es una aplicación sencilla para hacer conversiones de ciertas divisas. Actualmente, soporta las conversiones entre USD y MXN, USD y BRL, USD y COP, y viceversa.
La aplicación utiliza la API de ExchangeRate-API como referencia para obtener las tasas de cambio.
Cada consulta genera un archivo independiente que muestra la conversión realizada.

## Requisitos previos

Para poder ejecutar este programa, necesitas tener instalado el SDK de Gson. La versión utilizada en este programa es `gson-2.10.1.jar`.

## Instalación

(No requiere instalación específica ya que es un programa que se ejecuta en consola)

## Uso

Al ejecutar el programa, se mostrará un menú con las siguientes opciones:

1. Dolar    ->    Peso Mexicano
2. Peso Mexicano   ->    Dolar
3. Dolar    ->    Real Brasileño
4. Real Brasileño   ->    Dolar
5. Dolar    ->    Peso Colombiano
6. Peso Colombiano   ->    Dolar
7. SALIR

Selecciona la opción deseada para realizar la conversión correspondiente.
El resultado de la conversión se mostrará en la consola y se generará un archivo independiente con los detalles de la conversión.

## Características

- Realiza conversiones entre USD y MXN, BRL, COP.
- Utiliza la API de ExchangeRate-API para obtener las tasas de cambio.
- Genera un archivo por cada consulta realizada con los detalles de la conversión.

## Licencia

Este proyecto está bajo una licencia abierta.

## Autores

- Victor Cruz
  - Correo: [victorcruvz@gmail.com](mailto:victorcruvz@gmail.com)

## Ejemplos

![image](https://github.com/victorcruvz/ConversorDeMonedas/assets/55815592/accea0ba-b9cf-46db-ba3a-67afce779e75)

![image](https://github.com/victorcruvz/ConversorDeMonedas/assets/55815592/21c4140b-679d-4a90-9e50-88bc795519b0)

![image](https://github.com/victorcruvz/ConversorDeMonedas/assets/55815592/f91f79a0-96ee-4bd8-8718-fa852fb02d33)

![image](https://github.com/victorcruvz/ConversorDeMonedas/assets/55815592/64c371d6-2481-4dda-92c9-f250c6a65099)

## Enlaces útiles

- [Gson](https://github.com/google/gson)
- [ExchangeRate-API](https://app.exchangerate-api.com)
- [Documentación de Java](https://docs.oracle.com/en/java/)
