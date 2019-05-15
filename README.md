# spring-boot-eureka
1. spring boot eureka importar a Spring tools Suite 4

# Eureka server run in :
Server donde se registran los servicios de eureka
http://localhost:8761/

# Eureka Cliente rcc-service:
servicio que devuelve un historial.
http://localhost:8098/historico/1

# Eureka Cliente cliente-service:
servicio que devuelve data compuesta, llamando al servicio de rcc-service.
 
curl http://localhost:9098/clientes/1


2. run por consola:

mvn clean package && java -jar -Dserver.port=7098 target/Rcc-Service-0.0.1-SNAPSHOT.jar 

Se puede ejecutar dos instancias del servicio de rcc-service, en diferentes puertos.
y hacer consultas al servicio de clientes, y balancea por cada peticion que se hace al servicio de clientes,
en el log se muestra el puerto por el cual el balanceador eligio para traer la data.







