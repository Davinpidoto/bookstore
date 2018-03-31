# Bookstore

A simple bookstore app to demonstrate the database migration tool Flyway


### Prerequisites

A MySql database with a schema called book_store.

The following properties need to be updated in src/main/resources/application.properties

- spring.datasource.url
- spring.datasource.username
- spring.datasource.password

### Instructions

To run the Spring Boot app

```
./gradlew bootRun
```

To reset the database

```
./gradlew flywayClean
```

To apply the database migrations

```
./gradlew flywayMigrate
```


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
