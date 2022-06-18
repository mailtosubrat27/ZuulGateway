# ZuulGateway

API URL-
http://localhost:8090/getStudentDetails/ABC

Service called through gateway-
http://localhost:8080/student/getStudentDetails/Sajal
http://localhost:8080/student/echoStudentName/Sajal
http://localhost:8080/student/getBook/java

Histrix Circuit Breaker-
http://localhost:8094/getSchoolDetails/abc

Hystrix Dashboard - http://localhost:8094/hystrix.stream




Doubts - 
1- How to remove hard code service url in rest call - basically we read it from properties file
2- How service registry helps(Eureka service)

