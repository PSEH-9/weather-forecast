package com.sapient.weather.forcast.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.weather.forcast.model.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {

}
