package com.example.weather;

import com.example.weather.controller.WeatherController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Retrieve the WeatherController bean from the ApplicationContext
		WeatherController weatherController = applicationContext.getBean(WeatherController.class);

		// Call the methods on WeatherController
		String forecastSummary = weatherController.getForecastSummary("Delhi");
		String hourlyForecast = weatherController.getHourlyForecast("Pune");

		// Print or process the results as needed
		System.out.println("Forecast Summary: " + forecastSummary);
		System.out.println("Hourly Forecast: " + hourlyForecast);
	}
}
