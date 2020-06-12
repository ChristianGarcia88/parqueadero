package com.example.DTO;

import javax.persistence.Column;
import javax.persistence.Id;

public class DTOClienteVehiculo {
	
	
	
	private  String cedula;
	private  String nombre;
	private String  apellido;
	private String tipoAutomoto ;
	private  String placa;
	
public DTOClienteVehiculo(){
	
	
}


public DTOClienteVehiculo(String cedula, String nombre, String apellido, String tipoAutomoto, String placa) {
	super();
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
	this.tipoAutomoto = tipoAutomoto;
	this.placa = placa;
}


public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getTipoAutomoto() {
	return tipoAutomoto;
}

public void setTipoAutomoto(String tipoAutomoto) {
	this.tipoAutomoto = tipoAutomoto;
}

public String getPlaca() {
	return placa;
}

public void setPlaca(String placa) {
	this.placa = placa;
}




}
