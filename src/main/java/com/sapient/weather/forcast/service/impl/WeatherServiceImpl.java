package com.sapient.weather.forcast.service.impl;

import java.net.URI;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.sapient.weather.forcast.dao.WeatherRepository;
import com.sapient.weather.forcast.model.Weather;
import com.sapient.weather.forcast.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	protected RestTemplate restTemplate;

	@Autowired
	private WeatherRepository weatherRepository;

	@Value("${weather.forecast.api.uri}")
	protected String weatherForecastURL;

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Override
	public Weather getWeatherForecastForCity(String city) {
		URI forecastURL = UriComponentsBuilder.fromUriString(this.weatherForecastURL).queryParam("q", city)
				.queryParam("appid", "d2929e9483efc82c82c32ee7e02d563e").build().toUri();
		Map<String, Map<String, String>> responseParameters = this.restTemplate.getForObject(forecastURL, Map.class);

		if (responseParameters != null && !responseParameters.isEmpty()) {
			System.out.println(responseParameters.get("cod"));
		}
		return null;
		// return this.weatherRepository.findById(city).orElseThrow(() -> new
		// WeatherNotFoundException(city));
	}
}
