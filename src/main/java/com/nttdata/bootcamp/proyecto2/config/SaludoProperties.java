package com.nttdata.bootcamp.proyecto2.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("saludo.mensaje")
public class SaludoProperties {
	
	private String idioma = "Castellano";
	
	public String getIdioma() {
		return this.idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
}
