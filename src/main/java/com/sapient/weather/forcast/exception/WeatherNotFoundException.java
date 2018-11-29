package com.sapient.weather.forcast.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such weather for city")
public class WeatherNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 294672382703881552L;

	public WeatherNotFoundException(String cityName) {
		super(String.format("Weather report doesnot exist for city %s", cityName));
	}
}
