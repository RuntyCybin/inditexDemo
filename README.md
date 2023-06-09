# inditexDemo

TODO: Construir una aplicación/servicio en SpringBoot que provea una end point rest de consulta  tal que:

Acepte como parámetros de entrada: 
fecha de aplicación, 
identificador de producto, 
identificador de cadena.

Devuelva como datos de salida: 
identificador de producto, 
identificador de cadena, 
tarifa a aplicar, 
fechas de aplicación, 
precio final a aplicar.

Desarrollar unos test al endpoint rest que  validen las siguientes peticiones al servicio con los datos del ejemplo:

-          Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
-          Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
-          Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
-          Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
-          Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)


------------------------------------------------------------------------------------------------------------------------
# Solucion:

Proyecto de prueba montado con JDK 17 y Spring Boot 3.0.5

Para arrancar e instalar el proyecto :
1. Clonar el proyecto usando la URL: https://github.com/RuntyCybin/inditexDemo.git
2. Abrir el proyecto como una aplicacion Maven usando el IDE que prefiere
3. Lanzar ```mvn clean install```
4. Arrancar la aplicacion usando el comando ```mvnw spring-boot:run``` o configurando el arranque segun el IDE 



Segun la busqueda que se pide realizar en el ejercicio veo que es necesario realizar la 
busqueda usando el objeto Query con la sintaxis HQL.

Al utilizar jdk17 use elementos del stream como getList() 



## Testing : 
    Capa de testing se realizo con tests de integracion usando Rest Assured

## Exceptions :
    Para retornar un mensaje un poco mas amigable a la hora de no encontrar ningun resultado segun el DTO
    que se pasa por parametro al endpoint he decidido utilizar el exception handler con la anotacion 
    de ControllerAdvice
    Ejemplo:
```JSON
    {
        "dateTime": "2023-03-25T18:30:34.1519512",
        "message": "No se encontraron precios con estos parametros"
    }
```
## OpenAPI : 
    Uso OpenAPI ya que en las version de Spring posteriores a la 3 utilizan los namespaces de jakarta en vez de 
    javax y swagger solamente funciona con javax
    La url del Open API es : http://localhost:8080/swagger-ui/

## Validators : 
    Para la validacion de los DTOs utilize el artefact de validacion del framework de Spring,
    spring-boot-starter-validation
