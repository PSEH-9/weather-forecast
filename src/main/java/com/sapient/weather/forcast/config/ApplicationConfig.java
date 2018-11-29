package com.sapient.weather.forcast.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EntityScan({ "com.sapient.weather.forcast.model" })
@ComponentScan({ "com.sapient.weather.forcast" })
@EnableJpaRepositories({ "com.sapient.weather.forcast.dao" })
public class ApplicationConfig {

}
