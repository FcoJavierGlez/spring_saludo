package com.nttdata.bootcamp.proyecto2.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.bootcamp.saludoidioma.classes.Saludo;

@Configuration
@ConditionalOnClass(Saludo.class)
@EnableConfigurationProperties(SaludoProperties.class)
public class SaludoAutoconfigure {
	
	private final SaludoProperties properties;
	
	public SaludoAutoconfigure( SaludoProperties saludoProperties ) {
		this.properties = saludoProperties;
	}
	
	@Bean
	public Saludo saludo() {
		return new Saludo(properties.getIdioma());
	}
}
