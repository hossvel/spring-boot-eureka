package com.devhoss.model;


public class Historico {

	private String entidad;
	private String tipo;
	private double saldo;
	
	public Historico() {}
	
	
	public Historico(String entidad, String tipo, double saldo) {
		this.entidad = entidad;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
