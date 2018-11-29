package com.sapient.weather.forcast.service;

import com.sapient.weather.forcast.model.Weather;

public interface WeatherService {

	/**
	 * Retrieve weather forecast for city
	 *
	 * @param city
	 * @return Weather
	 */
	public Weather getWeatherForecastForCity(String city);

}
