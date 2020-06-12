package com.example.repositorio;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.DTO.DTOClienteVehiculo;
import com.example.models.Transporte;

public interface RepositorioTransporte extends  CrudRepository<Transporte, String> {
	

	
	@Query("SELECT   new  com.example.DTO.DTOClienteVehiculo( t.cliente.cedula, t.cliente.nombre,  t.cliente.apellido,  t.tipoTransporte.tipoTransporte,  t.placa)  from  Transporte  t ")
	public List<DTOClienteVehiculo> listaDto();
			

  @Query("SELECT   new  com.example.DTO.DTOClienteVehiculo( t.cliente.cedula, t.cliente.nombre,  t.cliente.apellido,  t.tipoTransporte.tipoTransporte,  t.placa)  from  Transporte  t  where t.cliente.cedula=:cedula")
public  List<DTOClienteVehiculo> busquedaPorCedula(@PathParam("cedula") String cedula);
}
