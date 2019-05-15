package com.devhoss.model;

public class Cliente {

	private int id;
	private String nombres;
	private int edad;
	
	
	public Cliente(int id, String nombres, int edad) {
		this.id = id;
		this.nombres = nombres;
		this.edad = edad;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
