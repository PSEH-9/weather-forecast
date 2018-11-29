package com.sapient.weather.forcast.rest.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;

@Getter
public class WeatherResponseEnvelope {

	private final boolean success;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Object data;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<ApiErrorBody> errors;

	public WeatherResponseEnvelope(boolean success) {
		this.success = success;
	}

	public WeatherResponseEnvelope addError(ApiErrorBody error) {
		if (errors == null) {
			errors = new ArrayList<ApiErrorBody>();
		}
		errors.add(error);
		return this;
	}

	public WeatherResponseEnvelope addData(Object data) {
		if (this.data == null) {
			this.data = data;
		}
		return this;
	}
}
