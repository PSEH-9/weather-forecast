# Weather-Forecast - Weather Forecast Application

# Introduction
This is simple Weather forecast application to show next 3 dys high and low temperature of a city.
It contains restful backend API for performing showing city weather.
	
## Environment Setup
Install the following:
* Java JDK 1.8
* Apache Maven 3.3+
* Spring (Boot,MVC)
* In-Memory H2 db.
* Git

## Build
* Clone this repository: `git clone https://github.com/PSEH-9/weather-forecast.git`
* Change directory to: `cd weather-forecast`

### JAR
Build project: `mvn clean install`

### Running Test
Run tests: `mvn test`

# Maven Dependency for this library
```
    <dependency>
		<groupId>com.sapient.weather.forcast</groupId>
		<artifactId>weather-forecast</artifactId>
		<version>0.0.1-SNAPSHOT</version>
	</dependency>
```

# JUnits coverage
This repository is tested with Junits. Coverage report can be found @ ~\target\Junit-report\index.html

# Static Code Analysis
This repository will be enforced to check static code bugs using findbugs. If there are any bugs found then the build breaks.

### Artifacts
1. Executable jar file: `.../weather-forecast/target/weather-forecast-${version}.jar`
1. Code coverage report: `.../weather-forecast/target/site/jacoco/index.html`
1. Findbugs report: `.../weather-forecast/target/findbugsXml.html`

### Approach

#H2 DB:
H2 is one of the popular in memory databases. Spring Boot has very good integration for H2. It is an in memory database. Its not a persisted database. So, data will be lost if application is restarted.

For this, we need to add the H2 runtime jar into dependencies

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>

When the application is ready, you can launch up H2 Console at http://localhost:8080/h2-console.
Make sure that you use jdbc:h2:./database/weatherForecastDB as JDBC URL as specified in application.properties.

User Stories
	

Simplifying Assumptions
	● A user authentication/authorization system is not required
	
## REST API Specs
As a sample, REST API docs for weature forecast APIs are below:
	
## GET /weather/{city}
   This is used to get weather report for particular city.
#### Where:
	city - city name
   
## Example GET : http://localhost:8080/v1/weather/London
## Returns: 
	HTTP Response Status : 200 (OK)
	{
    "success": true,
    "data": {
	}