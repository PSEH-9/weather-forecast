package com.sapient.weather.forcast.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.weather.forcast.model.Weather;
import com.sapient.weather.forcast.service.WeatherService;

/**
 * Rest Service for Weather forecasting
 *
 * @author Manish Jain
 *
 */
@RestController
@RequestMapping(value = "/v1")
@CrossOrigin
public class WeatherRestController {

	private final Logger logger = Logger.getLogger(WeatherRestController.class);

	@Autowired
	private WeatherService weatherService;

	@RequestMapping(value = "/weather/{city}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Weather> getWeatherForecastForCity(@PathVariable String city) {
		this.logger.info("Getting request for fetching wether condition for city : " + city);

		return new ResponseEntity<>(this.weatherService.getWeatherForecastForCity(city), HttpStatus.OK);
	}
}
