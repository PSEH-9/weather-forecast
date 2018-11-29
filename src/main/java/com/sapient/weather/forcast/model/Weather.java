package com.sapient.weather.forcast.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "weather")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Weather extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 228342454220744273L;

	@Column(name = "userId")
	@NotNull
	private Long userId;

	@Column(name = "city")
	@NotNull
	private Long cityId;

	@Column(name = "currentTemperature")
	@NotNull
	private String currentTemperature;

	@Column(name = "lowTemperature")
	private String lowTemperature;

	@Column(name = "highTemperature")
	private String highTemperature;

	@Column(name = "pressure")
	private String pressure;

	@Column(name = "humidity")
	private String humidity;

}
