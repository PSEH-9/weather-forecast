package com.sapient.weather.forcast.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Access(AccessType.FIELD)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -8446609587552901299L;

	// default string length
	public static final int DEFAULT_STRING_MAX_LENGTH = 255;

	// Default min length
	public static final int MIN_LENGTH = 4;

	// Default password length
	public static final int DEFAULT_PASSWORD_LENGTH = 16;

	// Default phone length
	public static final int DEFAULT_PHONE_LENGTH = 16;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
}
