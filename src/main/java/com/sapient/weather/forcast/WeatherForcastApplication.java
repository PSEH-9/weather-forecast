package com.sapient.weather.forcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.sapient.weather.forcast.config.ApplicationConfig;

@SpringBootApplication
@Import({ ApplicationConfig.class })
public class WeatherForcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherForcastApplication.class, args);
	}
}
