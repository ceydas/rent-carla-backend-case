1. Configure your application.properties file
2. Run mvn clean install


**Areas of Improvement**
* Normally, the CompensationService should not directly access the CompensationRepository. A CompensationEntityService class maybe useful.
* Exceptions are currently hardcoded.
* Revisit URL structure best practices
* Dockerize the application
