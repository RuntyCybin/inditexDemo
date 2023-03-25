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




Segun la busqueda que se pide realizar en el ejercicio veo que es necesario realizar la 
busqueda usando el objeto Query con la sintaxis HQL.

Al utilizar jdk17 use elementos del stream como getList() 

Capa de testing se realizo con tests de integracion usando Rest Assured


