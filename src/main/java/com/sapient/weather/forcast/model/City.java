package com.sapient.weather.forcast.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@javax.persistence.Table(name = "city")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class City extends BaseEntity{

	/**
	 *
	 */
	private static final long serialVersionUID = 7263701683279968424L;

	@Column(name = "name", length = 255)
	@NotNull
	@Size(min = 4, max = 255)
	private String name;

	@Column(name = "countryCode")
	@NotNull
	private String countryCode;

	@Column(name = "countryName")
	@NotNull
	private String countryName;
}
