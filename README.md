# helloZuul
Stand-alone sample Zuul gateway service that can discover service from Eureka and route all request to HelloService. 
* The address of Eureka server is specified in [application.yml](src/main/resources/application.yml).
* Service itself has end point at port 8082
* Service will route all requests to HelloService registered on Eureka
* service itself can be packaged as either a regular jar or Docker image