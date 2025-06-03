package org.cibertec;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
	// Clase del Miercoles
	// Me equivoque, era clase del Jueves
	// Ninguno de los 2, la clase era el dia Vieres

	private String nombre, web; // Modificador private es opcional
	private int edad; // Debido a la clase lombok

	public Persona(String nombre, String web, int edad) {
		this.nombre = nombre;
		this.web = web;
		this.edad = edad;
	}
}
