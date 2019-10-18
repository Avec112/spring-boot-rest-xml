

This more or less a copy from [zetcode.com](http://zetcode.com/springboot/restxml/) showing RESTful XML example

#### Main differences
* Spring Boot 2.2.0
* Lombok
* Junit 5
* Added support for JSON also
* Organized all files related to City in same package 

#### If you start the application you can access like this 
* http://localhost:8086/rest/cities
* http://localhost:8086/rest/cities/{cityId}

#### Run test
* CitiesControllerTest demonstrates fetching all cities and one city based on id

#### JSON vs XML
Set header to one of the alternatives bellow via Curl, Postman or whatever you prefer
* Accept: application/json
* Accept: application/xml