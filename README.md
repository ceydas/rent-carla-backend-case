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

* **May 12, 2024:**
* Add EntityService for a cleaner Service, Controller layers
* Finalize the project by adding new GET mappings.
* Add screenshots

  
  * **Get single record**
  <img width="1423" alt="findById" src="https://github.com/ceydas/rent-carla-backend-case/assets/26047050/2b47a1d3-9c90-4125-b797-c4304d296ef2">
  
  * **Filter by one or more fields/attributes (e.g. /compensation_data/fields?industry=Education&location=Ankara**
    <img width="1200" alt="findBy_Industry_Location" src="https://github.com/ceydas/rent-carla-backend-case/assets/26047050/a878f992-8df5-48dc-a019-390ea49ee668">
    
  * **Sort by one or more fields/attributes (e.g. /compensation_data?sort=last_name)**
    <img width="1196" alt="findAll_SORT_ageRange_jobTitle" src="https://github.com/ceydas/rent-carla-backend-case/assets/26047050/0d3530d6-ebaa-41e6-8ee6-27e343b1a2a7">

  * **Unsorted**
    <img width="1275" alt="findAll_UNSORTED" src="https://github.com/ceydas/rent-carla-backend-case/assets/26047050/d4ddefae-eba7-46b5-b67e-2fa5a74311f9">

  * **Return a sparse fieldset (e.g. /compensation_data/fields=jobTitle,salary)**
    <img width="1177" alt="sparse_output" src="https://github.com/ceydas/rent-carla-backend-case/assets/26047050/d2977a93-cf60-44d2-92e7-9c9ce3a42542">




