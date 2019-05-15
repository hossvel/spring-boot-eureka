package com.devhoss.model;

import java.util.List;

public class ClienteDetalle {

	private Cliente cliente;
	private List<Historico> historial;
	
	public ClienteDetalle() {}
	
	public ClienteDetalle(Cliente cliente, List<Historico> historial) {
		this.cliente = cliente;
		this.historial = historial;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Historico> getHistorial() {
		return historial;
	}
	public void setHistorial(List<Historico> historial) {
		this.historial = historial;
	}



}
