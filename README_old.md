# Kata Project

> Demo project for Spring Boot

This project contains a Spring Boot application with two main parts:
1.  A RESTful web service for converting numbers to strings.
2.  A standalone batch processor.

## Prerequisites

*   Java 17 or higher.

## Web Application

### Running the Application

To start the web server, run the following command:

```bash
.\mvnw.cmd spring-boot:run
```

The server will start on the port configured in `src/main/resources/application.properties` (default is 8080).

### Endpoints

*   #### `GET /hello`

    Returns a simple greeting message.

    **Example:**
    ```
    curl http://localhost:8080/hello
    ```

*   #### `GET /numbertostring`

    Converts a given integer number into its string representation.

    **Query Parameter:**
    *   `inputvalue` (String): The integer to convert.

    **Example:**
    ```
    curl "http://localhost:8080/numbertostring?inputvalue=123"
    ```

## Batch Application

### Running the Batch Job

The project includes a batch job that can be executed via Maven. This job processes an input file and generates an output file and an error file.

To run the batch job, use the following command from the project root directory:

```bash
.\mvnw.cmd exec:java "-Dexec.args=inputfile.txt outputfile.txt errorfile.txt"
```

**Arguments:**

1.  `inputfile.txt`: The path to the input file.
2.  `outputfile.txt`: The path where the output file will be created.
3.  `errorfile.txt`: The path where the error file will be created in case of issues.

## Running Tests

To execute the unit tests for the project, run:

```bash
.\mvnw.cmd test
```
