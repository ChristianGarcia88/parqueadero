package com.example.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.DTOClienteVehiculo;
import com.example.models.Transporte;
import com.example.repositorio.RepositorioTransporte;

@Service
public class ServicioTransporte {

	private RepositorioTransporte repoTransporte;

	@Autowired
	public ServicioTransporte(RepositorioTransporte repoTransporte) {

		this.repoTransporte = repoTransporte;

	}

	public Transporte agregarTransporte(Transporte transporte) {

		return repoTransporte.save(transporte);

	}

	public List<DTOClienteVehiculo> listarDto() {

		return repoTransporte.listaDto();

	}
	
	public List<DTOClienteVehiculo> busquedaPorCedula(String cedula){
		List<DTOClienteVehiculo> listaVehiculosPersona=repoTransporte.busquedaPorCedula(cedula);
		if(listaVehiculosPersona==null)return null;
		
		
		
		return listaVehiculosPersona;
		
		
	}

}
