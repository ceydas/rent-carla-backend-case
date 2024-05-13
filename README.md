Backend case for Carla: Rent Car. I chose Exercise A: REST API for querying compensation data using Java Spring Boot. Dataset: https://github.com/kasaba-labs/hiring-exercises/tree/main/shared/salary_datasets.

### Exercise A: Expose an API for querying compensation data

The goal of this exercise is to design a read-only API (REST or GraphAPI) that returns one or more records from static set of compensation data.

#### Features
* list compensation data via API `GET` request
  * Filter by one or more fields/attributes (e.g. `/compensation_data?salary[gte]=120000&zip_code=11201` )
  * Sort by one or more fields/attributes (e.g. `/compensation_data?sort=last_name`)
* fetch a single record via GET request
  * **Stretch Goal**: return a sparse fieldset (e.g. `/compensation_data?fields=first_name,last_name,salary`)
* have the JSON response be normalized into a uniform schema via a serializer or json template
  * **Stretch Goal**: serialize more than one compensation [data set](/shared/salary_datasets)

#### Log
* **May 12, 2024:**  `~3 hours`
  * Initialize project structure and re-learn JSON serialization & deserialization.
  * Configure PostgreSQL to visualize the data
  * Add dependencies: Data JPA, Lombok, Spring Web, PostgreSQL, SwaggerUI, Mapstruct
  * Revisit some clean coding concepts such as single responsibility rule, dependency injection
  * Spend some time thinking about which data types to use for storing the data, end up using String for all properties since cleaning the data is another job in itself
  * Server is successfully up and running
  * Sent a postman request to save the data to PostgreSQL
  * Added Controller, Service and Repository.
  * **Reflections**: Working with JSON took way longer than I expected, also realized I may need to revisit some core Java concepts like interface, abstract class.
