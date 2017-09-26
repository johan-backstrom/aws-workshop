# aws-workshop

This is a demo spring boot application that reads from a MariaDB database and exposes a rest api with the following endpoint:

    GET /person/list

It listens to the default port 8080.

## Building and running the app

    ./gradlew build
    java -jar build/libs/person-service.jar

## Configuration

This application can be configured by setting the following environment variables:

- MARIADB_DATABASE
- MARIADB_USERNAME
- MARIADB_HOST
- MARIADB_PASSWORD
- SERVER_CONTEXTPATH
- SERVER_PORT

## DB Schema

The db schema and test data can be found in mariadb/schema.sql
