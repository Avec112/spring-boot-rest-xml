This more or less a copy from [zetcode.com](http://zetcode.com/springboot/restxml/) showing RESTful XML example

Main differences
* Used I have used Spring Boot 2.2.0
* Used Lombok
* Organized all files related to City in same package 

CitiesControllerTest demonstrates fetching all cities and the first one

If you start the application you can access like this 
* http://localhost:8086/rest/cities (all)
* http://localhost:8086/rest/cities/1 (id=1)