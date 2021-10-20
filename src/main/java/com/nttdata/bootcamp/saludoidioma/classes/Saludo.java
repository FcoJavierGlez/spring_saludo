package com.nttdata.bootcamp.saludoidioma.classes;

public class Saludo {
	
	private String idioma;
	
	public Saludo( String idioma ) {
		this.idioma = idioma;
	}
	
	public String mensajeSaludo() {
		
		switch (idioma) {
			case "Castellano":
				return "Bienvenido";
			case "Ingles":
				return "Welcome";
			case "Italiano":
				return "Benvenuto";
			default:
				return "Bienvenido";
		}
		
	}
}
