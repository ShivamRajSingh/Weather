A server by using SpringBoot and Java to integrate Weather API from Rapid API. On the basis of integration, exposed RESTful APIs as follows with JSON response.

API 1: Get the Weather forecast summary of Any city using API (RapidApiGetForecastSummaryByLocationName)
API 2: Get hourly Weather forecast details of Any city using API (RapidApiGetHourlyForecastByLocationName)

API Document: https://rapidapi.com/wettercom-wettercom-default/api/forecast9 (RapidApiGetForecastSummaryByLocationName & RapidApiGetHourlyForecastByLocationName)

Steps to run applicaton:

1. Navigate to WeatherApplication.java
2. Change the city name in the run method for which you want to get the response.
3. Build the project using command "mvn clean install".
4. Now on command line, proceed to target directory.
5. Run the spring boot application using command "mvn spring-boot:run"
6. You will be able to see the JSON response in command line/terminal for the city.
