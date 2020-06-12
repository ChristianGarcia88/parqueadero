package com.example.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transporte")
public class Transporte {

	
	@Id
	private  String placa;
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="id_cliente")
	private   Clientes cliente; 
	@ManyToOne(cascade = CascadeType.DETACH)
	private TipoTransporte  tipoTransporte;
	
	
	public Transporte() {
		
		
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public Clientes getCliente() {
		return cliente;
	}


	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}


	public TipoTransporte getTipoTransporte() {
		return tipoTransporte;
	}


	public void setTipoTransporte(TipoTransporte tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	
	
	
	
	
}
